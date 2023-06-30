# **Task Manager For Android**

**Features :**

- App Details Button
- Details Tab
- Services Tab
- CPU Tab
- Search view
- Stopping the Task Manager Application
- Stop button
- From toolbar
- Keyboard shortcut
- Force stop

**Steps to run the application :**

- **Setting Up Android Studio**
- Download Android Studio

- **Setting Up MEmu Play Emulator**
- Steps Taken to Install MEmu Play Emulator:
- Download the MEmu Android Emulator: [https://www.memuplay.com/](https://www.memuplay.com/)
- Once installed...Go to the general settings and select the Root Option "ON"
- Go to the SETTINGS app \> About Tablet \> Build Number
- Press Build Number about 5 times to access Developer Mode
- In Developer Mode \> Enable USB Debugging. This allows Android Studio to connect and run the app on the emulator
- Go to Android Studio and run the application in the emulator. The emulator NEEDS to be running before opening Android Studio to be able to connect
- Select the Emulator Settings button on the toolbar to the right
- Under the Engine Tab, enable Root Mode to ON
- Select OK

- **Running the Task Manager Application**

- It is essential to understand how to build and run your application. When it comes to building and running the application, it can be done in several ways. This section will analyze the different ways that you may build and run the application.

- **Building the App**
- It is important to build the application before running it for the first time. To build the application, you find the green hammer icon and click on it.

![](RackMultipart20221127-1-eczxhd_html_8f6b5a8ed7d048b5.gif)

- You may also build the application from the top toolbar you will select Build \> Make Project.

![](RackMultipart20221127-1-eczxhd_html_b84578538691bbcf.gif)

- You can also use the keyboard shortcut: \> CTRL + F9 4. After the build, it may warn you of any errors or simply give you a build success message at the bottom. 

- **Running the App**
- Before running the application be sure that the selected device is the MEmu Player. The device name should be the one that you selected from above step Change MEmu Device. If your device is not there, check and make sure you have USB Debugging enabled from above step USB Debugging. If USB Debugging is already enabled, try restarting the MEmu Play Emulator.

![](RackMultipart20221127-1-eczxhd_html_2155ff237bd914e.gif)

- To run the application, you can click the green play button next to your selected device. When you run the application it builds it as well.
- Another way to run your application is by finding the Run tab on the top toolbar. Select Run 'run app'.
- You can also use the keyboard shortcut: \> Shift + F10

**Overview of Project:**

The application gathers the details, services, and CPU utilization of a rooted device. It will take that information, break it up, and display it to the user with a scrollable user interface. From this application, you can also explore the different permissions, and memory and even force stop or completely uninstall it. The advantage of this application is that you are able to gather the details, services, and CPU information for a device. The disadvantage of this is that you have to be a root user to be able to perform these tasks on the device. A rooted emulator we found easiest for all users instead of putting their phones at risk by trying to root it.

**Technology Stacks:**

- Java
- XML
- Shell

**Build by:**

[**Mruganshi Gohel**](https://github.com/mruganshi)(B20CS014)

[**Harshita Gupta**](https://github.com/Harshita-1107)(B20CS018)

[**Atul Khobragade**](https://github.com/atul-khobragade) **(B20CS027)**