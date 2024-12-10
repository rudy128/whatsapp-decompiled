package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AOz  reason: case insensitive filesystem */
public class C20540AOz implements C22423B7f {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20540AOz(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C2S() {
        int i;
        if (this.A00 != 0) {
            AP6 ap6 = (AP6) this.A01;
            C195699tl r4 = (C195699tl) this.A02;
            synchronized (AP6.class) {
                AnonymousClass9ND r1 = (AnonymousClass9ND) AnonymousClass000.A0w(ap6.A0B, 0);
                if (r1 != null) {
                    r1.A00 = 1;
                    r1.A01 = r4;
                    if (!r4.A09.isEmpty()) {
                        AP6.A04(ap6, 0);
                    }
                }
                AP6.A03(ap6);
            }
            return;
        }
        AP5 ap5 = (AP5) this.A01;
        C195699tl r3 = (C195699tl) this.A02;
        A1X a1x = r3.A00;
        C184169aW r26 = ap5.A07;
        C20079A6f BYh = ap5.A0B.BYh();
        C17960vV.A07(BYh);
        String str = r3.A02;
        C20272AEf aEf = a1x.A00;
        C17960vV.A07(aEf);
        List list = a1x.A01;
        C21548Alv alv = new C21548Alv(a1x, ap5);
        C18070vi.A0i(BYh, aEf);
        Double d = BYh.A03;
        C17960vV.A07(d);
        C18070vi.A0X(d);
        double doubleValue = d.doubleValue();
        Double d2 = BYh.A04;
        C17960vV.A07(d2);
        C18070vi.A0X(d2);
        C20269AEc aEc = new C20269AEc(doubleValue, d2.doubleValue());
        ArrayList<C20291AEz> A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    break;
                }
                C20291AEz aEz = (C20291AEz) next;
                if (i2 < aEf.A02 && aEz.A00 <= aEf.A00) {
                    A13.add(next);
                }
                i2 = i3;
            } else {
                for (C20291AEz aEz2 : A13) {
                    aEz2.A04 = aEz2.A05;
                }
                list.clear();
                ArrayList arrayList = aEf.A04;
                LinkedHashMap A132 = C17880vN.A13();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    A132.put(it2.next(), AnonymousClass000.A13());
                }
                loop3:
                for (C20291AEz aEz3 : A13) {
                    Iterator it3 = arrayList.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            Object next2 = it3.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                break loop3;
                            }
                            AEK aek = (AEK) next2;
                            C18070vi.A0d(aEz3, 0);
                            double d3 = aEz3.A00;
                            if (d3 >= ((double) aek.A01) && d3 < ((double) aek.A00)) {
                                aEz3.A02 = i4;
                                List list2 = (List) A132.get(aek);
                                if (list2 != null) {
                                    list2.add(aEz3);
                                }
                            }
                            i4 = i5;
                        }
                    }
                }
                ArrayList A0D = C29351c6.A0D(arrayList);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    List list3 = (List) A132.get(it4.next());
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C17890vO.A1D(A0D, i);
                }
                double d4 = aEf.A00;
                double d5 = d4 * -1.0d;
                double d6 = aEc.A00;
                double d7 = aEc.A01;
                C20269AEc A002 = C25915CoZ.A00(new C20269AEc(d6 + (d5 / 111132.0d), d7), d5);
                C20269AEc A003 = C25915CoZ.A00(new C20269AEc(d6 + (d4 / 111132.0d), d7), d4);
                double d8 = A002.A00;
                double d9 = A002.A01;
                double d10 = A003.A00;
                double d11 = A003.A01;
                ArrayList A11 = C72453Mb.A11(A132);
                Iterator A15 = AnonymousClass000.A15(A132);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    AEK aek2 = (AEK) A16.getKey();
                    LinkedHashMap A133 = C17880vN.A13();
                    for (C20291AEz aEz4 : (List) A16.getValue()) {
                        C20269AEc aEc2 = new C20269AEc(aEz4.A06, aEz4.A07);
                        int i6 = aek2.A03;
                        double d12 = aEc2.A00;
                        if (d8 <= d12 && d12 < d10) {
                            double d13 = aEc2.A01;
                            if (d9 <= d13 && d13 < d11) {
                                double d14 = (double) i6;
                                double floor = d14 * Math.floor((d12 - d8) / ((d10 - d8) / d14));
                                Integer valueOf = Integer.valueOf((int) (floor + Math.floor((d13 - d9) / ((d11 - d9) / d14))));
                                if (valueOf != null) {
                                    if (A133.get(valueOf) == null) {
                                        A133.put(valueOf, AnonymousClass000.A13());
                                    }
                                    List list4 = (List) A133.get(valueOf);
                                    if (list4 != null) {
                                        list4.add(aEz4);
                                    }
                                }
                            }
                        }
                    }
                    AnonymousClass1D6.A02(aek2, A133, A11);
                }
                Map A0D2 = AnonymousClass1D7.A0D(A11);
                ArrayList A134 = AnonymousClass000.A13();
                Iterator A152 = AnonymousClass000.A15(A0D2);
                while (A152.hasNext()) {
                    Iterator A153 = AnonymousClass000.A15((Map) C17890vO.A0P(A152));
                    while (A153.hasNext()) {
                        A134.add(C17890vO.A0P(A153));
                    }
                }
                C184169aW r0 = r26;
                C199299zl r2 = r0.A01;
                C20041A4k a4k = r0.A00;
                C20079A6f a6f = a4k.A00;
                if (a6f == null) {
                    a6f = C20041A4k.A00(a4k);
                }
                C20079A6f a6f2 = a6f;
                r2.A00(new C195459tN(a6f2, new AP2(r26, aEf, A0D, A0D2, alv), AnonymousClass8BV.A0Q(), str, A134, 2));
                return;
            }
        }
        AnonymousClass1ZU.A0B();
        throw null;
    }
}
