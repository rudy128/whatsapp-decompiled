package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.021  reason: invalid class name */
public class AnonymousClass021 extends ContentFrameLayout {
    public final /* synthetic */ AnonymousClass01V A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass021(Context context, AnonymousClass01V r3) {
        super(context, (AttributeSet) null);
        this.A00 = r3;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A00.A10(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                AnonymousClass01V r2 = this.A00;
                r2.A0w(r2.A0m(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(AnonymousClass02D.A03().A09(getContext(), i));
    }
}
