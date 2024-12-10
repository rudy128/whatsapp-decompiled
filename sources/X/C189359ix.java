package X;

import java.util.Set;

/* renamed from: X.9ix  reason: invalid class name and case insensitive filesystem */
public final class C189359ix {
    public final /* synthetic */ C195849u0 A00;

    public C189359ix(C195849u0 r1) {
        this.A00 = r1;
    }

    public void A00(String str, Set set, boolean z) {
        boolean z2;
        C195849u0 r2 = this.A00;
        C188509hX r0 = r2.A05;
        boolean z3 = r0.A0A;
        Set set2 = set;
        boolean contains = set.contains(r0.A03);
        if (!z3 ? contains : !contains) {
            z2 = false;
        } else {
            z2 = true;
        }
        r2.A00 = z2;
        r2.A02.CGP(new C146587Pv(r2, set2, str, 1, z));
    }
}
