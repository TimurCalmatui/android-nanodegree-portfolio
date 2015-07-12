package com.calmatui.timur.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewGroup buttonsLayout = (ViewGroup) findViewById(R.id.buttons_container);
        for (int i = 0; i < buttonsLayout.getChildCount(); i++)
        {
            if (buttonsLayout.getChildAt(i) instanceof Button)
            {
                final Button appButton = (Button) buttonsLayout.getChildAt(i);
                appButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        String buttonText = appButton.getText().toString();
                        if (buttonText.endsWith(" App"))
                            buttonText = buttonText.substring(0, buttonText.length() - 4);

                        String text = getString(R.string.app_button_toast, buttonText);
                        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }
}
