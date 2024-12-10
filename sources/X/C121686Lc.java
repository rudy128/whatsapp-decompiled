package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.6Lc  reason: invalid class name and case insensitive filesystem */
public class C121686Lc extends A34 {
    public final C18000vb A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass8B0[] r5 = (AnonymousClass8B0[]) objArr;
        C17960vV.A07(r5);
        C17960vV.A0C(C17890vO.A1R(r5.length));
        AnonymousClass8B0 r2 = r5[0];
        C17960vV.A07(r2);
        Context A0F = C108945cZ.A0F(this.A01);
        if (A0F == null) {
            return null;
        }
        return r2.BHq(A0F, this.A00, false);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C1409773u r3 = (C1409773u) obj;
        C112395lP r1 = (C112395lP) this.A02.get();
        if (r3 != null && r1 != null) {
            if (r3.A0S()) {
                r3.A0K(r1.A05.A01);
            }
            AnonymousClass72m r12 = r1.A05;
            r3.A0J(r12.A00);
            r12.A0H.C5O(r3);
        }
    }

    public C121686Lc(Context context, C18000vb r3, C112395lP r4) {
        this.A00 = r3;
        this.A01 = AnonymousClass3MW.A0z(context);
        this.A02 = AnonymousClass3MW.A0z(r4);
    }
}
