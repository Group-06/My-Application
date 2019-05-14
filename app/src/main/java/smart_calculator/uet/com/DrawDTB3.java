package smart_calculator.uet.com;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class DrawDTB3 extends AppCompatActivity {
    private Button Draw;
    private EditText edthst1;
    private EditText edthst2;
    private EditText edthst3;
    private EditText edthst4;
    //private ImageButton back;


    private LineGraphSeries<DataPoint> series1;
    private GraphView graph;

    // Ham ve do thi //
    public LineGraphSeries<DataPoint> drawgraph(double a, double b, double c, double d) {
        LineGraphSeries<DataPoint> seriesTest;
        double x, y;
        x = -4.00;
        seriesTest = new LineGraphSeries<>();
        int numDataPoint = 800;
        for (int i = 0; i < numDataPoint; i++) {
            x = x + 0.01;
            y = a * x * x * x + b * x * x + c * x + d;
            seriesTest.appendData(new DataPoint(x, y), true, 800);
        }
        seriesTest.setColor(Color.RED);
        return seriesTest;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.official_draw_dtb3);
        // Tham chieu den cac phan tu //

        Draw = (Button) findViewById(R.id.Drawbuton);
        //back = (ImageButton) findViewById(R.id.BackButton);

        edthst1 = (EditText) findViewById(R.id.edhst1);
        edthst2 = (EditText) findViewById(R.id.edhst2);
        edthst3 = (EditText) findViewById(R.id.edhst3);
        edthst4 = (EditText) findViewById(R.id.edhst4);

        graph = (GraphView) findViewById(R.id.graph);
        /*
        // Xu li nut back //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawDTB3.this, Activity2.class);
                startActivity(intent);
            }
        });
        */
        // Xu li nut draw //

        Draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nhan du lieu dau vao //

                String Shst1 = edthst1.getText().toString();
                String Shst2 = edthst2.getText().toString();
                String Shst3 = edthst3.getText().toString();
                String Shst4 = edthst4.getText().toString();

                if (Shst1.equals("") || Shst2.equals("") || Shst3.equals("") || Shst4.equals("")) {
                    Toast.makeText(DrawDTB3.this, "Bạn phải điền đầy đủ hệ số đã ", Toast.LENGTH_SHORT).show();
                } else {
                    // Du lieu dau vao hien dang la Sring . Phai chuyen ve double de xu li  //

                    Double hst1 = Double.parseDouble(Shst1);
                    Double hst2 = Double.parseDouble(Shst2);
                    Double hst3 = Double.parseDouble(Shst3);
                    Double hst4 = Double.parseDouble(Shst4);
                    if (hst1 == 0 ) {
                        Toast.makeText(DrawDTB3.this, "Error ", Toast.LENGTH_SHORT).show();
                    } else {
                        // ve do thi , xu li trung lap //
                        // neu nhu su dung nut draw 2 lan lien tiep thi no se ve  2 do thi len cung luc  =) phai clear trc //
                        graph.removeAllSeries();
                        series1 = drawgraph(hst1, hst2, hst3, hst4);
                        graph.addSeries(series1);
                        graph.setBackgroundColor(Color.WHITE);
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
                Intent intent1 = new Intent(this, GiaiPTB2.class);
                startActivity(intent1);
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
                /*
                Intent intent4 = new Intent(this, DrawDTB3.class);
                startActivity(intent4);
                */
                return true;
            case R.id.ve_do_thi_4:
                Intent intent5 = new Intent(this, DrawDTB4.class);
                startActivity(intent5);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}