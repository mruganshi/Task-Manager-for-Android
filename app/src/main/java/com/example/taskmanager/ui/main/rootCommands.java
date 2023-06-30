/*==========================================RUNNING IN ROOT==========================================*/

package com.example.taskmanager.ui.main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class rootCommands {

   public static String runAsRoot(String command) {

        try {

            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int read;
            char[] buffer = new char[24000];
            StringBuilder output = new StringBuilder();
            while ((read = reader.read(buffer)) > 0) {
                output.append(buffer, 0, read);
            }
            reader.close();
            process.waitFor();

            return output.toString();
        }

        catch (IOException | InterruptedException e) {
            try {
                throw new IOException("*** IO Exception was thrown ***");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                throw new InterruptedException("*** Interrupted Exception was thrown ***");
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
       //this prints if the try fails and any of the catch exceptions run
        return "Command didn't work";
    }

    //this method should be run before you attempt to run any super user or root commands
    //the method will evoke super user by writing su to the runtime exec command built in
    @SuppressWarnings("UnusedReturnValue")
    public static boolean canRunRootCommands()
    {
        //sets the return value to false
        boolean retVal;
        Process suProcess;

        //anytime you want to write to the os it must be put in a try catch or java will not let you do it
        try
        {

            suProcess = Runtime.getRuntime().exec("su");

            //Allows for input and output to the command line that we opened
            DataOutputStream os = new DataOutputStream(suProcess.getOutputStream());

            //must user buffer reader because the readLine() method associated with DataInputStream class has depreciated
            BufferedReader osRes = new BufferedReader(new InputStreamReader(suProcess.getInputStream()));

            //command to get the id of the user
            os.writeBytes("id\n");
            //basically clearing the input buffer for next command
            os.flush();

            //reading the output form the command id above. this command should give the current user id for the application
            String userID = osRes.readLine();
            //sets the exit su to false
            boolean exitSu;

            //these if statements ensure that the user id was given back and that it is 0 which means that we are now acting as super user.
            //if the device is not rooted or the user of the phone denies granting super user access for the application then it will fail and the catch will execute
            if(userID == null)
            {
                retVal = true;
                exitSu = false;
            }
            else if(userID.contains("uid=0"))
            {
                retVal = true;
                exitSu = true;
            }
            else
            {
                retVal = false;
                exitSu = true;
            }
            if (exitSu)
            {
                os.writeBytes("exit\n");
                os.flush();
            }

            //catches the false return value
        } catch (Exception e) {
            retVal = false;
        }

        //returns the return value whether its true or false
        return retVal;
    }
}
