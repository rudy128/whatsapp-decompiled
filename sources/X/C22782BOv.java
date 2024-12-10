package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.BOv  reason: case insensitive filesystem */
public class C22782BOv extends C22783BOw implements C28491E3w {
    public C26206Cue A00;
    public boolean A01;
    public int A02;
    public int A03;
    public EA2 A04;
    public final C25746ClG A05;
    public final DS9 A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;

    private void A00() {
        List A10;
        this.A01 = false;
        List list = this.A09;
        if (list.isEmpty()) {
            A10 = Collections.emptyList();
        } else {
            A10 = C17880vN.A10(list);
        }
        list.clear();
        A04(new BOE(this.A04, this.A07, this.A03, this.A02), (Object) null);
        if (!A10.isEmpty()) {
            C25257Cbw A062 = this.A00.A06(this);
            A062.A01(6);
            A062.A02(A10);
            A062.A00();
        }
    }

    public final synchronized void A06(C26206Cue cue, boolean z) {
        super.A06(cue, z);
        this.A00 = cue;
        List<DS9> list = this.A08;
        if (list.isEmpty()) {
            A00();
        } else {
            this.A04 = this.A04.BF5(0, list.size());
            int i = 0;
            for (DS9 A022 : list) {
                A02(A022, i);
                i++;
            }
            if (!this.A01) {
                C25257Cbw A062 = this.A00.A06(this);
                A062.A01(5);
                A062.A00();
                this.A01 = true;
            }
        }
    }

    public final void BcJ(int i, Object obj) {
        switch (i) {
            case 0:
                CMm cMm = (CMm) obj;
                EA2 ea2 = this.A04;
                int i2 = cMm.A00;
                this.A04 = ea2.BF5(i2, 1);
                A02((DS9) cMm.A01, i2);
                break;
            case 1:
                CMm cMm2 = (CMm) obj;
                EA2 ea22 = this.A04;
                int i3 = cMm2.A00;
                Collection<DS9> collection = (Collection) cMm2.A01;
                this.A04 = ea22.BF5(i3, collection.size());
                for (DS9 A022 : collection) {
                    A02(A022, i3);
                    i3++;
                }
                break;
            case 2:
                EA2 ea23 = this.A04;
                int i4 = ((CMm) obj).A00;
                this.A04 = ea23.BF6(i4, i4 + 1);
                A01(i4);
                break;
            case 3:
                CMm cMm3 = (CMm) obj;
                EA2 ea24 = this.A04;
                int i5 = cMm3.A00;
                EA2 BF6 = ea24.BF6(i5, i5 + 1);
                this.A04 = BF6;
                int A0M = AnonymousClass000.A0M(cMm3.A01);
                this.A04 = BF6.BF5(A0M, 1);
                int min = Math.min(i5, A0M);
                int max = Math.max(i5, A0M);
                List list = this.A07;
                int i6 = ((DS9) list.get(min)).A02;
                int i7 = ((DS9) list.get(min)).A01;
                list.add(A0M, list.remove(i5));
                while (min <= max) {
                    DS9 ds9 = (DS9) list.get(min);
                    ds9.A02 = i6;
                    ds9.A01 = i7;
                    BP0 bp0 = ds9.A03;
                    i6 += bp0.A01();
                    i7 += bp0.A00();
                    min++;
                }
                break;
            case 4:
                int size = this.A07.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        A01(size);
                    }
                }
            case 5:
                A00();
                return;
            case 6:
                List list2 = (List) obj;
                if (0 < list2.size()) {
                    list2.get(0);
                    throw AnonymousClass000.A0s("dispatchEvent");
                }
                return;
            default:
                throw BE6.A0k();
        }
        if (!this.A01) {
            C25257Cbw A062 = this.A00.A06(this);
            A062.A01(5);
            A062.A00();
            this.A01 = true;
        }
    }

    private void A01(int i) {
        DS9 ds9 = (DS9) this.A07.remove(i);
        BP0 bp0 = ds9.A03;
        A03(this, i, -1, -bp0.A01(), -bp0.A00());
        ds9.A06 = true;
        if (ds9.A04.isEmpty()) {
            CPB cpb = (CPB) this.A02.remove(ds9);
            E9e e9e = cpb.A01;
            e9e.CEM(cpb.A00);
            e9e.CEj(cpb.A02);
        }
    }

    private void A02(DS9 ds9, int i) {
        boolean z;
        if (i > 0) {
            DS9 ds92 = (DS9) this.A07.get(i - 1);
            int i2 = ds92.A02;
            BP0 bp0 = ds92.A03;
            int A012 = i2 + bp0.A01();
            ds9.A00 = i;
            ds9.A02 = A012;
            ds9.A01 = ds92.A01 + bp0.A00();
            z = false;
        } else {
            z = false;
            ds9.A00 = i;
            ds9.A02 = 0;
            ds9.A01 = 0;
        }
        ds9.A05 = z;
        ds9.A06 = z;
        ds9.A04.clear();
        BP0 bp02 = ds9.A03;
        A03(this, i, 1, bp02.A01(), bp02.A00());
        this.A07.add(i, ds9);
        A07(ds9.A08, ds9);
    }

    public static void A03(C22782BOv bOv, int i, int i2, int i3, int i4) {
        bOv.A03 += i3;
        bOv.A02 += i4;
        while (true) {
            List list = bOv.A07;
            if (i < list.size()) {
                ((DS9) list.get(i)).A00 += i2;
                ((DS9) list.get(i)).A02 += i3;
                ((DS9) list.get(i)).A01 += i4;
                i++;
            } else {
                return;
            }
        }
    }

    public final C28649ECi BHj(C25199Caq caq, C25215CbB cbB, long j) {
        int i = caq.A02;
        DS9 ds9 = this.A06;
        ds9.A01 = i;
        List list = this.A07;
        int binarySearch = Collections.binarySearch(list, ds9);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            while (binarySearch < AnonymousClass3MX.A01(list) && ((DS9) list.get(binarySearch + 1)).A01 == i) {
                binarySearch++;
            }
        }
        DS9 ds92 = (DS9) list.get(binarySearch);
        D9L d9l = new D9L(caq.A00(i - ds92.A01), ds92.A08, cbB);
        this.A0A.put(d9l, ds92);
        ds92.A04.add(d9l);
        if (ds92.A05) {
            C28649ECi BHj = d9l.A05.BHj(d9l.A04, d9l.A06, d9l.A01);
            d9l.A03 = BHj;
            if (d9l.A02 != null) {
                BHj.CCK(d9l, d9l.A01);
            }
        }
        return d9l;
    }

    public final void CEL(C28649ECi eCi) {
        DS9 ds9 = (DS9) this.A0A.remove(eCi);
        D9L d9l = (D9L) eCi;
        C28649ECi eCi2 = d9l.A03;
        if (eCi2 != null) {
            d9l.A05.CEL(eCi2);
        }
        List list = ds9.A04;
        list.remove(eCi);
        if (list.isEmpty() && ds9.A06) {
            CPB cpb = (CPB) this.A02.remove(ds9);
            E9e e9e = cpb.A01;
            e9e.CEM(cpb.A00);
            e9e.CEj(cpb.A02);
        }
    }

    public C22782BOv(EA2 ea2, E9e... e9eArr) {
        int length = e9eArr.length;
        for (int i = 0; i < length; i = 1) {
            C26056CrS.A01(e9eArr[i]);
        }
        this.A04 = ea2.getLength() > 0 ? ea2.BF4() : ea2;
        this.A0A = new IdentityHashMap();
        this.A08 = AnonymousClass000.A13();
        this.A07 = AnonymousClass000.A13();
        this.A09 = AnonymousClass000.A13();
        this.A06 = new DS9((E9e) null);
        this.A05 = new C25746ClG();
        List<E9e> asList = Arrays.asList(e9eArr);
        synchronized (this) {
            List list = this.A08;
            int size = list.size();
            for (E9e A012 : asList) {
                C26056CrS.A01(A012);
            }
            ArrayList A14 = AnonymousClass000.A14(asList);
            for (E9e ds9 : asList) {
                A14.add(new DS9(ds9));
            }
            list.addAll(size, A14);
            if (this.A00 != null && !asList.isEmpty()) {
                C25257Cbw A062 = this.A00.A06(this);
                A062.A01(1);
                A062.A02(new CMm(A14, size));
                A062.A00();
            }
        }
    }

    public final void A05() {
        super.A05();
        this.A07.clear();
        this.A00 = null;
        this.A04 = this.A04.BF4();
        this.A03 = 0;
        this.A02 = 0;
    }

    public C22782BOv() {
        this(new D9Y(new Random(), new int[0]), new E9e[0]);
    }
}
