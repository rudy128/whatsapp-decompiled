package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2PS  reason: invalid class name */
public final class AnonymousClass2PS extends A34 {
    public final C15950rT A00;
    public final C34511kb A01;
    public final C34591kk A02;
    public final Set A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PS(C15950rT r2, AnonymousClass1F9 r3, C34511kb r4, C34591kk r5, Set set) {
        super(r3, true);
        C18070vi.A0d(r3, 1);
        C18070vi.A0p(r5, r4, set);
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = set;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C18070vi.A0d(obj, 0);
        this.A00.apply(obj);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        AnonymousClass1EC A05;
        Set set = this.A03;
        AnonymousClass1EC r3 = null;
        if (set.size() == 1) {
            AnonymousClass1EC r1 = (AnonymousClass1EC) C29431cG.A0X(set);
            i = this.A02.A01(r1);
            C34511kb r4 = this.A01;
            if (AnonymousClass2TI.A00(r4.A02.A06(r1)) && (A05 = r4.A05(r1)) != null && r4.A08(A05).size() == 1) {
                r3 = A05;
            }
        } else {
            i = 0;
            Iterator it = this.A02.A02().iterator();
            while (it.hasNext()) {
                if (set.contains(((AnonymousClass206) it.next()).A0v.A00)) {
                    i++;
                }
            }
        }
        return new C86844Th(r3, i);
    }
}
