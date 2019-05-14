package smart_calculator.uet.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private TextView edtNumber;
    private TextView tvResult;
    //private ImageButton openActivity2 ;
    //private ImageButton question ;
    /*
    private ImageButton btnNumber1;
    private ImageButton btnNumber2;
    private ImageButton btnNumber3;
    private ImageButton btnNumber4;
    private ImageButton btnNumber5;
    private ImageButton btnNumber6;
    private ImageButton btnNumber7;
    private ImageButton btnNumber8;
    private ImageButton btnNumber9;
    private ImageButton btnNumber0;

    private ImageButton btnCong;
    private ImageButton btnTru;
    private ImageButton btnNhan;
    private ImageButton btnChia;
    //private ImageButton btnPercentage;

    private ImageButton btnPoint;
    private ImageButton btnResult;
    private ImageButton btnClear;
    private ImageButton btnClearAll;
    */
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;

    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;

    private Button btnPoint;
    private Button btnResult;
    private Button btnClear;
    private Button btnClearAll;
    private Button btnLeftParentheses;
    private Button btnRightParerntheses;

    private final String TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.official_activity_main);
        initWidget();
        setEventClickViews();
    }

    public void initWidget() {

        edtNumber = (TextView) findViewById(R.id.input);
        tvResult = (TextView) findViewById(R.id.result);
        //openActivity2 = (ImageButton) findViewById(R.id.nextpage) ;
        //question = (ImageButton) findViewById(R.id.question)  ;
        /*
        btnNumber1 = (ImageButton) findViewById(R.id.nb1);
        btnNumber2 = (ImageButton) findViewById(R.id.nb2);
        btnNumber3 = (ImageButton) findViewById(R.id.nb3);
        btnNumber4 = (ImageButton) findViewById(R.id.nb4);
        btnNumber5 = (ImageButton) findViewById(R.id.nb5);
        btnNumber6 = (ImageButton) findViewById(R.id.nb6);
        btnNumber7 = (ImageButton) findViewById(R.id.nb7);
        btnNumber8 = (ImageButton) findViewById(R.id.nb8);
        btnNumber9 = (ImageButton) findViewById(R.id.nb9);
        btnNumber0 = (ImageButton) findViewById(R.id.nb0);

        btnCong = (ImageButton) findViewById(R.id.cong);
        btnTru = (ImageButton) findViewById(R.id.tru);
        btnNhan = (ImageButton) findViewById(R.id.nhan);
        btnChia = (ImageButton) findViewById(R.id.chia);
        btnPercentage = (ImageButton) findViewById(R.id.percent) ;

        btnPoint = (ImageButton) findViewById(R.id.dot);
        btnClear = (ImageButton) findViewById(R.id.del1);
        btnClearAll = (ImageButton) findViewById(R.id.clear);
        btnResult = (ImageButton) findViewById(R.id.bang);
        */
        btnNumber1 = (Button) findViewById(R.id.nb1);
        btnNumber2 = (Button) findViewById(R.id.nb2);
        btnNumber3 = (Button) findViewById(R.id.nb3);
        btnNumber4 = (Button) findViewById(R.id.nb4);
        btnNumber5 = (Button) findViewById(R.id.nb5);
        btnNumber6 = (Button) findViewById(R.id.nb6);
        btnNumber7 = (Button) findViewById(R.id.nb7);
        btnNumber8 = (Button) findViewById(R.id.nb8);
        btnNumber9 = (Button) findViewById(R.id.nb9);
        btnNumber0 = (Button) findViewById(R.id.nb0);

        btnCong = (Button) findViewById(R.id.cong);
        btnTru = (Button) findViewById(R.id.tru);
        btnNhan = (Button) findViewById(R.id.nhan);
        btnChia = (Button) findViewById(R.id.chia);

        btnPoint = (Button) findViewById(R.id.dot);
        btnClear = (Button) findViewById(R.id.del);
        btnClearAll = (Button) findViewById(R.id.clear);
        btnResult = (Button) findViewById(R.id.bang);
        btnLeftParentheses = (Button) findViewById(R.id.left_parentheses);
        btnRightParerntheses = (Button) findViewById(R.id.right_parentheses);
    }

    public void setEventClickViews() {
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        //btnPercentage.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClearAll.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnLeftParentheses.setOnClickListener(this);
        btnRightParerntheses.setOnClickListener(this);
        //openActivity2.setOnClickListener(this);
        //question.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nb0:
                //TO DO
                edtNumber.append("0");
                break;
            case R.id.nb1:
                //TO DO
                edtNumber.append("1");
                break;
            case R.id.nb2:
                //TO DO
                edtNumber.append("2");
                break;
            case R.id.nb3:
                edtNumber.append("3");
                //TO DO
                break;
            case R.id.nb4:
                //TO DO
                edtNumber.append("4");
                break;
            case R.id.nb5:
                //TO DO
                edtNumber.append("5");
                break;
            case R.id.nb6:
                //TO DO
                edtNumber.append("6");
                break;
            case R.id.nb7:
                //TO DO
                edtNumber.append("7");
                break;
            case R.id.nb8:
                //TO DO
                edtNumber.append("8");
                break;
            case R.id.nb9:
                //TO DO
                edtNumber.append("9");
                break;
            case R.id.cong:
                //TO DO
                edtNumber.append("+");
                break;
            case R.id.tru:
                //TO DO
                edtNumber.append("-");
                break;
            case R.id.nhan:
                //TO DO
                edtNumber.append("x");
                break;
            case R.id.chia:
                //TO DO
                edtNumber.append("/");
                break;
            case R.id.percent:

                break;
            /*
            case R.id.question:
                Toast.makeText(MainActivity.this,"Any question give to 17021328@vnu.edu",Toast.LENGTH_LONG).show();
                break;
            */
            case R.id.dot:
                //TO DO
                edtNumber.append(".");
                break;
            case R.id.del:
                //TO DO
                String a = edtNumber.getText().toString() ;
                if (a.length() >= 1)
                {edtNumber.setText(a.substring(0,a.length() - 1));
                }
                break;
            case R.id.clear:
                //TO DO
                edtNumber.setText("");
                tvResult.setText("");
                break;
            case R.id.left_parentheses:
                edtNumber.append("(");
                break;
            case R.id.right_parentheses:
                edtNumber.append(")");
                break;
            /*
            case R.id.nextpage :
                //TO DO
                Intent intent = new Intent(this , Activity2.class) ;
                startActivity(intent);
                break ;
            */
            case R.id.bang:
                //To do
                DecimalFormat df = new DecimalFormat("###.#######");
                double result = 0;
                addOperation(edtNumber.getText().toString());
                addNumber(edtNumber.getText().toString());
                // Thuật toán tính toán biểu thức
                if(arrOperation.size() >= arrNumber.size() ){
                    tvResult.setText("Lỗi định dạng");
                } else if (arrOperation.size() == 0&&arrNumber.size()==1) {tvResult.setText(df.format(arrNumber.get(0)));}
                else {
                    for (int i = 0; i < (arrNumber.size() - 1); i++) {
                        switch (arrOperation.get(i)) {
                            case "+":
                                if (i == 0) {
                                    result = arrNumber.get(i) + arrNumber.get(i + 1);
                                } else {
                                    result = result + arrNumber.get(i + 1);
                                }
                                break;
                            case "-":
                                if (i == 0) {
                                    result = arrNumber.get(i) - arrNumber.get(i + 1);
                                } else {
                                    result = result - arrNumber.get(i + 1);
                                }
                                break;
                            case "x":
                                if (i == 0) {
                                    result = arrNumber.get(i) * arrNumber.get(i + 1);
                                } else {
                                    result = result * arrNumber.get(i + 1);
                                }
                                break;
                            case "/":
                                if (i == 0) {
                                    result = arrNumber.get(i) / arrNumber.get(i + 1);
                                } else {
                                    result = result / arrNumber.get(i + 1);
                                }
                                break;



                            default:
                                break;
                        }
                    }
                    tvResult.setText(df.format(result) + "");
                }
                // tvResult.setText(df.format(result) + "");
                //  edtNumber.setText("");
                //  result = 0;
        }
    }
    //Mảng chứa các phép tính +, - , x, /
    public ArrayList<String> arrOperation;
    //Mảng chứa các số
    public ArrayList<Double> arrNumber;

    //Lấy tất cả các phép tính lưu vào mảng arrOperation
    public int addOperation(String input) {
        arrOperation = new ArrayList<>();

        char[] cArray = input.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            switch (cArray[i]) {
                case '+':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '-':
                    arrOperation.add(cArray[i] + "");
                    break;
                case 'x':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '/':
                    arrOperation.add(cArray[i] + "");
                    break;

                default:
                    break;
            }
        }
        return 0;
    }
    //Lấy tất cả các số lưu vào mảng arrNumber
    public void addNumber(String stringInput) {
        arrNumber = new ArrayList<>();
        Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = regex.matcher(stringInput);
        while(matcher.find()){
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }
    }
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case R.id.man_hinh_chinh:
                /*
                Intent intent0 = new Intent (this, MainActivity.class);
                startActivity(intent0);
                */
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
