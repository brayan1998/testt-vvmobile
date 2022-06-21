package com.test.vm.vmmobile.menu.ui;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.greysonparrelli.permiso.Permiso;
import com.greysonparrelli.permiso.PermisoActivity;
import com.test.vm.vmmobile.R;
import com.test.vm.vmmobile.databinding.ActivityMainBinding;

public class MenuActivity extends PermisoActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        Permiso.getInstance().requestPermissions(new Permiso.IOnPermissionResult() {
            @Override
            public void onPermissionResult(Permiso.ResultSet resultSet) {
                if(resultSet.areAllPermissionsGranted()){
                    //Toast.makeText(getApplication(), "Se aceptaron los permisos con éxito", Toast.LENGTH_SHORT).show();
                } else{
                    Permiso.getInstance().showRationaleInDialog(getString(R.string.label_base_informacion), getString(R.string.msg_base_permisos_inicio), null, new Permiso.IOnRationaleProvided() {
                        @Override
                        public void onRationaleProvided() {
                            System.exit(0);
                        }
                    });
                }
            }

            @Override
            public void onRationaleRequested(Permiso.IOnRationaleProvided callback, String... permissions) {
                Permiso.getInstance().showRationaleInDialog(getString(R.string.label_base_informacion), getString(R.string.msg_base_permisos_inicio), null, callback);
            }
        }, Manifest.permission.INTERNET, Manifest.permission.WRITE_EXTERNAL_STORAGE);

    }

}