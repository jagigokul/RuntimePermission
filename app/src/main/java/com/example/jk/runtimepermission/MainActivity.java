package com.example.jk.runtimepermission;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AbsRuntimePermission {

    private static final int REQUEST_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pass array of dangerous permissions needed to be passed as first parameter in the below function call
        //Here, 3 permissions in 2 groups (CONTACTS AND STORAGE)are passed as parameters
        requestAppPermissions(new String[]{
                Manifest.permission.READ_CONTACTS,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_CONTACTS},
                R.string.msg,
                REQUEST_PERMISSION);
    }

    @Override
    public void onPermissionsGranted(int requestCode) {
        //Do anything, you want to do .. when permission is granted
        Toast.makeText(getApplicationContext(), "Permission Granted",Toast.LENGTH_LONG).show();
    }
}
