package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class BI2 extends WebView {
    public final /* synthetic */ BIT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BI2(Context context, BIT bit) {
        super(context, (AttributeSet) null);
        this.A00 = bit;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public boolean performClick() {
        super.performClick();
        return false;
    }
}
