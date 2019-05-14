package smart_calculator.uet.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GiaiPTB2 extends AppCompatActivity {
    private Button giai ;
    private TextView dapan ;
    private EditText edthst1 ;
    private EditText edthst2 ;
    private EditText edthst3 ;
    //private ImageButton back ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.official_giai_ptb2);
        // Tham chieu den cac phan tu //
        dapan = (TextView) findViewById(R.id.dapan);

        edthst1 = (EditText) findViewById(R.id.edhst1) ;
        edthst2 = (EditText) findViewById(R.id.edhst2) ;
        edthst3 = (EditText) findViewById(R.id.edhst3) ;
        giai = (Button) findViewById(R.id.giai);
        /*
        back = (ImageButton)  findViewById(R.id.BackButton);
        // Xu li nut back //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaiPTB2.this , Activity2.class) ;
                startActivity(intent);
            }
        });
        */
        // Xu li nut Giai //
        giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nhan du lieu dau vao //

                String Shst1 = edthst1.getText().toString() ;
                String Shst2 = edthst2.getText().toString() ;
                String Shst3 = edthst3.getText().toString() ;

                if ( Shst1.equals("")  || Shst2.equals("") || Shst3 .equals("") ) {
                    Toast.makeText(GiaiPTB2.this ,"Bạn phải điền đầy đủ hệ số đã " , Toast.LENGTH_SHORT).show();}  else {
                    // Du lieu dau vao hien dang la Sring . Phai chuyen ve double de xu li  //

                    Float hst1 = Float.parseFloat(Shst1);
                    Float hst2 = Float.parseFloat(Shst2);
                    Float hst3 = Float.parseFloat(Shst3);

                    // giai bai toan //
                    if (hst1 == 0) {
                        if (hst2 == 0 && hst3 != 0) {
                            dapan.setText("\n"+"\n" + "Phương trình vô nghiệm!");
                        }
                        else if (hst2 == 0 && hst3 == 0) {
                            dapan.setText("\n"+"\n" + "Phương trình có vô số nghiệm");
                        }
                        else {
                            dapan.setText("\n"+"\n" + "Phương trình có một nghiệm:" + "\n" + "x = " + (-hst3 / hst2));
                        }
                        return;
                    }
                    // tính delta
                    Float delta = hst2*hst2- 4*hst1*hst3;
                    float x1;
                    float x2;
                    // tính nghiệm
                    if (delta > 0) {
                        x1 =  (float) ((-hst2 + Math.sqrt(delta)) / (2*hst1));
                        x2 =  (float) ((-hst2 - Math.sqrt(delta)) / (2*hst1));
                        dapan.setText("\n"+"\n" + "Phương trình có 2 nghiệm là:" + "\n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
                    } else if (delta == 0) {
                        x1 = (-hst2 / (2 * hst1));
                        dapan.setText("\n"+"\n" + "Phương trình có nghiệm kép:" + "\n" +"x1 = x2 = " + x1);
                    } else {
                        dapan.setText("\n"+"\n" + "Phương trình vô nghiệm!");
                    }
                }
            }
        });
    }
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case R.id.man_hinh_chinh:
                Intent intent0 = new Intent (this, MainActivity.class);
                startActivity(intent0);
                return true;
            case R.id.giai_phuong_trinh2:
                /*
                Intent intent1 = new Intent(this, GiaiPTB2.class);
                startActivity(intent1);
                */
                return true;
            case R.id.giai_phuong_trinh3:
                Intent intent2 = new Intent(this, GiaiPTB3.class);
                startActivity(intent2);
                return true;
            case R.id.ve_do_thi_2:
                Intent intent3 = new Intent(this, DrawDTB2.class);
                startActivity(intent3);
                return true;
            case R.id.ve_do_thi_3:
                Intent intent4 = new Intent(this, DrawDTB3.class);
                startActivity(intent4);
                return true;
            case R.id.ve_do_thi_4:
                Intent intent5 = new Intent(this, DrawDTB4.class);
                startActivity(intent5);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
