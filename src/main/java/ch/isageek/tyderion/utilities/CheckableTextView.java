package ch.isageek.tyderion.utilities;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.TextView;

/**
 * Created by tzhnaga1 on 02/05/14.
 */
public class CheckableTextView extends TextView implements Checkable {
    private boolean mChecked;
    public CheckableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setChecked(boolean checked) {
        mChecked = checked;
        setActivated(mChecked);
    }

    @Override
    public boolean isChecked() {
        return mChecked;
    }

    @Override
    public void toggle() {
        setChecked(!isChecked());
    }
}
