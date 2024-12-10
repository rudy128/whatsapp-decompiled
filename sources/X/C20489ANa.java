package X;

import android.graphics.Bitmap;

/* renamed from: X.ANa  reason: case insensitive filesystem */
public class C20489ANa implements B7H {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20489ANa(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        if (this.A00 != 0) {
            C196089uR r0 = (C196089uR) this.A01;
            B7H b7h = (B7H) this.A02;
            if (!z) {
                r0.A03.remove(aMe);
            }
            b7h.Bx5(bitmap, aMe, z);
            return;
        }
        AnonymousClass3TA r4 = (AnonymousClass3TA) this.A01;
        Object obj = this.A02;
        if (r4.A00 != null) {
            AnonymousClass10I r2 = r4.A0q;
            r2.CGN(new C70633Bw(r4, bitmap, 2));
            r2.CGF(new C70633Bw(r4, obj, 0));
        }
    }
}
