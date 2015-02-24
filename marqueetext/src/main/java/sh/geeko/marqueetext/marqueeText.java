package sh.geeko.marqueetext;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Darren on 2015/2/23.
 * 设置所有的TextView都有跑马灯效果
 */
public class marqueeText extends TextView {

    public marqueeText(Context context) {
        super(context);
    }

    public marqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public marqueeText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //TextView默认设置是第一个获取到的光标，
    //如果想让所有的TextView都有跑马灯效果,则让所有的TextView都获取到光标就行了
    //这里return true 就是让所有的TextView都获取到光标
    @Override
    public boolean isFocused() {
        return true;
    }
}
