package X;

import java.util.Iterator;

/* renamed from: X.1hx  reason: invalid class name and case insensitive filesystem */
public final class C32911hx {
    public final C32901hw A00;
    public final C32871ht A01;
    public final C18100vl A02 = new C18110vm(new C32921hy(this));

    public C32911hx(C32901hw r3, C32871ht r4) {
        C18070vi.A0d(r4, 1);
        this.A01 = r4;
        this.A00 = r3;
    }

    public final AnonymousClass206 A00(C59652mf r5, AnonymousClass206 r6) {
        AnonymousClass206 BHO;
        C18070vi.A0d(r6, 0);
        C32901hw r3 = this.A00;
        Object obj = r3.A01.get();
        C18070vi.A0X(obj);
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (it.hasNext()) {
                BHO = ((AnonymousClass16D) it.next()).C1M(r5, r6);
                if (BHO != null) {
                    break;
                }
            } else {
                int i = r6.A0u;
                AnonymousClass20p r1 = (AnonymousClass20p) ((AnonymousClass20Z) this.A02.getValue()).A00(i);
                if (r1.Bes(r6)) {
                    BHO = r1.BHO(r5, r6);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-forwardable message(");
                    sb.append(i);
                    sb.append(')');
                    throw new C33271iY(sb.toString());
                }
            }
        }
        BHO.A09 = 3;
        Object obj2 = r3.A00.get();
        C18070vi.A0X(obj2);
        for (AnonymousClass3L0 C18 : (Iterable) obj2) {
            C18.C18(r5, r6, BHO);
        }
        return BHO;
    }

    public final boolean A01(AnonymousClass206 r5) {
        C59082lj r1;
        C18070vi.A0d(r5, 0);
        Object obj = this.A00.A01.get();
        C18070vi.A0X(obj);
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                int i = r5.A0u;
                boolean Bes = ((AnonymousClass20p) ((AnonymousClass20Z) this.A02.getValue()).A00(i)).Bes(r5);
                StringBuilder sb = new StringBuilder();
                sb.append("ip:");
                sb.append(i);
                r1 = new C59082lj(Bes, sb.toString());
                break;
            }
            r1 = ((AnonymousClass16D) it.next()).C1O(r5);
            if (r1 != null && !r1.A00) {
                break;
            }
        }
        return r1.A00;
    }
}
