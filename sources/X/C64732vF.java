package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.2vF  reason: invalid class name and case insensitive filesystem */
public class C64732vF implements View.OnTouchListener {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public C64732vF(float f, float f2, float f3, float f4) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReducedAreaOnTouchListener/ignored_ratio -- left: ");
        A10.append(f);
        A10.append(", right: ");
        A10.append(f3);
        A10.append(", top: ");
        A10.append(f2);
        A10.append(", bottom: ");
        A10.append(f4);
        Log.i(A10.toString());
        if (f < 0.0f || f > 1.0f || f3 < 0.0f || f3 > 1.0f || f2 < 0.0f || f2 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
            throw new RuntimeException("invalid input parameters");
        }
        this.A01 = f;
        this.A02 = f3;
        this.A03 = f2;
        this.A00 = f4;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ReducedAreaOnTouchListener/onTouch ");
            A10.append(motionEvent);
            A10.append(", view width:");
            A10.append(width);
            A10.append(", view height:");
            A10.append(height);
            A10.append(", pointer count: ");
            C17900vP.A0o(A10, motionEvent.getPointerCount());
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float f = (float) width;
        if (motionEvent.getX() >= this.A01 * f) {
            float f2 = (float) height;
            if (motionEvent.getY() >= this.A03 * f2 && motionEvent.getX() <= (1.0f - this.A02) * f && motionEvent.getY() <= (1.0f - this.A00) * f2) {
                return false;
            }
        }
        Log.i("ReducedAreaOnTouchListener/ignore this touch event");
        return true;
    }
}
