package X;

import android.widget.PopupWindow;

/* renamed from: X.0Ry  reason: invalid class name and case insensitive filesystem */
public class C05380Ry implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C05380Ry(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onDismiss() {
        if (this.A00 != 0) {
            C15920rQ r0 = ((C03610Iy) this.A01).A00;
            if (r0 != null) {
                r0.Brs();
                return;
            }
            return;
        }
        ((C04630Od) this.A01).A03();
    }
}
