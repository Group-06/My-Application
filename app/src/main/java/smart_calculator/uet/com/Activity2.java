package smart_calculator.uet.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity  {
    private ImageButton turnonDTB2;
    private ImageButton turnonDTB3;
    private ImageButton turnonDTB4;
    private ImageButton giaiPTB2;
    private ImageButton giaiPTB3;
    private ImageButton back ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // Tham chieu den cac thanh phan //

        turnonDTB2 = findViewById(R.id.DrawDTB2);
        turnonDTB3 = findViewById(R.id.DrawDTB3);
        turnonDTB4 = findViewById(R.id.DrawDTB4);
        giaiPTB2= findViewById(R.id.GiaiPTB2);
        giaiPTB3= findViewById(R.id.GiaiPTB3);

        back = (ImageButton) findViewById(R.id.BackButton)  ;


        // xu li nut back ( ve man hinh may tinh ) //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this , MainActivity.class) ;
                startActivity(intent);
            }
        });


        // xu li nut  ve do thi bac 2 //
        turnonDTB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, DrawDTB2.class) ;
                startActivity(intent);
            }
        });


        // xu li nut  ve do thi bac 3 //
        turnonDTB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, DrawDTB3.class) ;
                startActivity(intent);
            }
        });

        // xu li nut  ve do thi bac 4 //
        turnonDTB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, DrawDTB4.class) ;
                startActivity(intent);
            }
        });
        // xu li nut giai phuong trinh bac 2 //
        giaiPTB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, GiaiPTB2.class) ;
                startActivity(intent);
            }


        });
        giaiPTB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, GiaiPTB3.class) ;
                startActivity(intent);
            }


        });

    }
}
