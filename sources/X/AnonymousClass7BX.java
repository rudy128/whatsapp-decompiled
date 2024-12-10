package X;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7BX  reason: invalid class name */
public class AnonymousClass7BX implements AnonymousClass86O {
    public final C125556bG A00;
    public final C126866dQ A01;
    public final WeakReference A02;

    public void BKl(C1404171i r13, C140006zn r14) {
        long A05;
        long A052;
        DOZ doz = (DOZ) this.A02.get();
        if (doz != null) {
            C126866dQ r2 = this.A01;
            Set<DFL> set = (Set) r2.A01.A01.get(r2.A00);
            if (set != null) {
                for (DFL dfl : set) {
                    String A002 = C24517C7l.A00(dfl);
                    C125556bG r22 = this.A00;
                    String A1H = AnonymousClass001.A1H("bloks/impression-time-tracker/", A002, C18070vi.A0K(A002));
                    C18070vi.A0d(A1H, 0);
                    Map map = r22.A00;
                    Object obj = map.get(AnonymousClass001.A1H("bloks/impression-time-tracker/", A1H, AnonymousClass000.A10()));
                    if (!(obj instanceof Long)) {
                        A05 = -2147483648L;
                    } else {
                        A05 = C17880vN.A05(obj);
                    }
                    boolean A1O = AnonymousClass000.A1O((A05 > -2147483648L ? 1 : (A05 == -2147483648L ? 0 : -1)));
                    C18070vi.A0d(A002, 0);
                    Object obj2 = map.get(AnonymousClass001.A1H("bloks/impression-time-tracker/", A002, AnonymousClass000.A10()));
                    if (!(obj2 instanceof Long)) {
                        A052 = -2147483648L;
                    } else {
                        A052 = C17880vN.A05(obj2);
                    }
                    C128246fg r5 = new C128246fg(r13, r14, Long.valueOf(A052), A1O);
                    E8A A0A = dfl.A0A(35);
                    Map map2 = r14.A04;
                    String str = r13.A00;
                    if (((C128256fh) map2.get(str)).A00 == AnonymousClass00R.A00 && A0A != null) {
                        map.put(C17900vP.A0A("bloks/impression-time-tracker/", A002), C108955ca.A0m());
                        C20046A4p A0J = C108985cd.A0J(r5);
                        A0J.A03(doz, 1);
                        C26209Cul.A01(doz, dfl, new C199029zJ(A0J.A00), A0A);
                    }
                    E8A A0A2 = dfl.A0A(36);
                    if (A0A2 != null && ((C128256fh) map2.get(str)).A00 == AnonymousClass00R.A0C) {
                        C20046A4p A0J2 = C108985cd.A0J(r5);
                        A0J2.A03(doz, 1);
                        C26209Cul.A01(doz, dfl, new C199029zJ(A0J2.A00), A0A2);
                    }
                    E8A A0A3 = dfl.A0A(40);
                    if (A0A3 != null && ((C128256fh) map2.get(str)).A00 == AnonymousClass00R.A01) {
                        C20046A4p A0J3 = C108985cd.A0J(r5);
                        A0J3.A03(doz, 1);
                        C26209Cul.A01(doz, dfl, new C199029zJ(A0J3.A00), A0A3);
                    }
                }
            }
        }
    }

    public AnonymousClass7BX(C126866dQ r1, C125556bG r2, WeakReference weakReference) {
        this.A02 = weakReference;
        this.A00 = r2;
        this.A01 = r1;
    }
}
