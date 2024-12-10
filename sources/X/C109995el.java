package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5el  reason: invalid class name and case insensitive filesystem */
public class C109995el extends ViewOutlineProvider {
    public final float A00;
    public final int A01;

    public C109995el(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public void getOutline(View view, Outline outline) {
        boolean A15;
        int width;
        int height;
        float f;
        Outline outline2 = outline;
        switch (this.A01) {
            case 0:
                A15 = C18070vi.A15(view, outline);
                width = view.getWidth();
                height = view.getHeight();
                f = this.A00;
                break;
            case 1:
                width = view.getWidth();
                height = view.getHeight();
                f = this.A00;
                break;
            default:
                width = view.getWidth();
                float A04 = C108945cZ.A04(view);
                f = this.A00;
                height = (int) (A04 + f);
                break;
        }
        A15 = false;
        outline2.setRoundRect(A15 ? 1 : 0, A15 ? 1 : 0, width, height, f);
    }
}
