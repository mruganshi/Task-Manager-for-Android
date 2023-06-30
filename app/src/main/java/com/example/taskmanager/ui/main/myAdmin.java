package com.example.taskmanager.ui.main;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


//getting admin privileges by extended the device admin receiver
@SuppressWarnings("NullableProblems")

public class myAdmin extends DeviceAdminReceiver {
    @Override
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);
        //toast message to show that the admin has been enabled
        Toast.makeText(context, "Device Admin is now Enabled", Toast.LENGTH_SHORT).show();
    }
}
