package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4XQ  reason: invalid class name */
public final class AnonymousClass4XQ {
    public final AnonymousClass190 A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass00H A02;
    public final C18100vl A03;
    public final AnonymousClass00H A04;

    public final boolean A01(AnonymousClass206 r6, Integer num) {
        C18100vl r3 = this.A03;
        int i = r6.A0u;
        if (!((AnonymousClass20Z) r3.getValue()).A02(i)) {
            return false;
        }
        C437120q r1 = (C437120q) ((AnonymousClass20Z) r3.getValue()).A00(i);
        if ((num != AnonymousClass00R.A00 || !r1.Bfs(r6)) && (num != AnonymousClass00R.A01 || !r1.Bgn(r6))) {
            return false;
        }
        return true;
    }

    public static final boolean A00(AnonymousClass4XQ r2, AnonymousClass206 r3, Integer num) {
        Iterable iterable = (Iterable) C18070vi.A0E(r2.A04);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C107605aI) it.next()).Bfs(r3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!r2.A01(r3, num)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4XQ(AnonymousClass190 r2, AnonymousClass11E r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r4, r2, r5, r3, r6);
        this.A00 = r2;
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r6;
        this.A03 = C99164sN.A01(r4, 17);
    }
}
