package sh.geeko.autocompletetextview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class MainActivity extends ActionBarActivity {

    //1、初始化控件
    private AutoCompleteTextView autoTxt1;

    //3、初始化数据源--数据源去匹配文本框中输入的类容
    private String[] res={"beijing1","beijing2","beijing3","shanghai1","shanghai2","shanghai3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        * 1、初始化控件
        * 2、需要一个适配器
        * 3、初始化数据源--数据源去匹配文本框中输入的类容
        * 4、将adapter与当前AutoCompleteTextView绑定
        * */


        //1、初始化控件
        autoTxt1=(AutoCompleteTextView)findViewById(R.id.autoText1);

        // 2、需要一个适配器
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);

        //4、将adapter与当前AutoCompleteTextView绑定
        autoTxt1.setAdapter(adapter);


    }
}
