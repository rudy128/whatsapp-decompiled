package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

public class D5F implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public D5F(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        View view;
        switch (this.A00) {
            case 0:
                C22647BHl bHl = (C22647BHl) this.A01;
                bHl.postInvalidateOnAnimation();
                ViewGroup viewGroup = bHl.A03;
                if (viewGroup == null || (view = bHl.A02) == null) {
                    return true;
                }
                viewGroup.endViewTransition(view);
                bHl.A03.postInvalidateOnAnimation();
                bHl.A03 = null;
                bHl.A02 = null;
                return true;
            case 1:
                EditText editText = (EditText) this.A01;
                editText.getViewTreeObserver().removeOnPreDrawListener(this);
                editText.setSelection(editText.length());
                return true;
            default:
                ClockFaceView clockFaceView = (ClockFaceView) this.A01;
                if (!clockFaceView.isShown()) {
                    return true;
                }
                clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockHandView clockHandView = clockFaceView.A0B;
                int height = ((clockFaceView.getHeight() / 2) - clockHandView.A07) - clockFaceView.A04;
                if (height == clockFaceView.A01) {
                    return true;
                }
                clockFaceView.A01 = height;
                clockFaceView.A07();
                clockHandView.A02 = clockFaceView.A01;
                clockHandView.invalidate();
                return true;
        }
    }
}
