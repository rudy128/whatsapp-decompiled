package X;

import android.content.Context;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.9vo  reason: invalid class name and case insensitive filesystem */
public abstract class C196889vo {
    public static final void A00(AnonymousClass118 r1, C19830z4 r2, C22524BBh bBh) {
        C18070vi.A0e(r2, 1, r1);
        A01(r1, r2, bBh, true);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Cso, X.BZ2] */
    public static final void A01(AnonymousClass118 r4, C19830z4 r5, C22524BBh bBh, boolean z) {
        Boolean bool = C17970vW.A01;
        Context context = r4.A00;
        if (C41371wF.A00(context) == 0) {
            zzw A06 = new C26126Cso(context, C28622EAu.A00, BZ2.A00, C25540Chd.A02).A06();
            C18070vi.A0X(A06);
            AJM.A00(A06, new B1V(r5, bBh, z), 5);
            A06.addOnFailureListener(new AJG(r5, bBh, z));
            return;
        }
        bBh.CCW();
    }
}
