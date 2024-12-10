package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.3Zr  reason: invalid class name and case insensitive filesystem */
public class C74363Zr extends C6Y {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C74363Zr(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A01(Drawable drawable) {
        C108875cR r1;
        boolean z = drawable instanceof C109515dZ;
        if (this.A00 != 0) {
            if (z) {
                r1 = ((AnonymousClass4XZ) this.A01).A0D.A0k;
            } else {
                return;
            }
        } else if (!z || (r1 = ((C79093uR) this.A01).A0k) == null) {
            return;
        }
        r1.CRK((AnonymousClass206) this.A02);
    }
}
