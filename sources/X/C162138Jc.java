package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8Jc  reason: invalid class name and case insensitive filesystem */
public class C162138Jc extends C6Y {
    public final int A00;
    public final Object A01;

    public C162138Jc(C161418Dd r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void A01(Drawable drawable) {
        if (this.A00 != 0) {
            C18070vi.A0d(drawable, 0);
            C180569Nb r0 = ((C161418Dd) this.A01).A00;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C18070vi.A0d(drawable, 0);
    }
}
