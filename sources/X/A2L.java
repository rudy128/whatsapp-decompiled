package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class A2L {
    public AnonymousClass1DT A00;
    public AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final C192389oJ A03;
    public final A5L A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final AM5 A08;
    public final AnonymousClass1M9 A09;
    public final AnonymousClass1XN A0A;

    public static void A00(C22424B7g b7g, A2L a2l, int i, int i2, boolean z) {
        List A10;
        Integer A0l;
        Integer num = null;
        if (z) {
            A10 = null;
        } else {
            A10 = AnonymousClass3MW.A10(a2l.A00);
        }
        AM7 am7 = (AM7) a2l.A07.get();
        Integer A042 = a2l.A04.A04();
        Integer valueOf = Integer.valueOf(i2);
        if (A10 == null) {
            A0l = null;
        } else {
            A0l = AnonymousClass8BT.A0l(A10);
            num = Integer.valueOf(A10.indexOf(b7g) + 1);
        }
        LinkedHashMap A13 = C17880vN.A13();
        if (A0l != null) {
            A13.put("recent_search_count", Integer.valueOf(A0l.intValue()));
        }
        if (num != null) {
            A13.put("position", Integer.valueOf(num.intValue()));
        }
        am7.A08(A042, valueOf, A13, 1, i, 1);
    }

    public void A02(C22424B7g b7g) {
        C192389oJ r5 = this.A03;
        List A002 = r5.A00();
        boolean z = false;
        for (int i = 0; i < A002.size(); i++) {
            if (A002.get(i).equals(b7g)) {
                A002.set(i, b7g);
                z = true;
            }
        }
        if (!z) {
            A002.add(b7g);
        }
        Collections.sort(A002, r5.A01);
        A08 a08 = r5.A00;
        C21451AkI.A01(a08.A03, a08, A002.subList(0, C108955ca.A08(A002, 50)), 42);
        this.A00.A0F(r5.A00());
    }

    public void A03(C22424B7g b7g) {
        C192389oJ r4 = this.A03;
        List A002 = r4.A00();
        A002.remove(b7g);
        A08 a08 = r4.A00;
        C21451AkI.A01(a08.A03, a08, A002, 42);
        this.A00.A0F(r4.A00());
    }

    public A2L(AM5 am5, A08 a08, A5L a5l, AnonymousClass1M9 r6, AnonymousClass11P r7, AnonymousClass1XN r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        this.A05 = r7;
        this.A06 = r9;
        this.A09 = r6;
        this.A0A = r8;
        this.A04 = a5l;
        this.A08 = am5;
        this.A07 = r10;
        this.A03 = new C192389oJ(a08);
        this.A00 = AnonymousClass3MW.A0L();
        C21446AkD.A01(this.A06, this, 23);
    }

    public ArrayList A01(List list, boolean z) {
        C174328wb r1;
        ArrayList A13 = AnonymousClass000.A13();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C22424B7g b7g = (C22424B7g) it.next();
                boolean z2 = z;
                if (b7g instanceof C20288AEw) {
                    C20288AEw aEw = (C20288AEw) b7g;
                    r1 = new C174328wb(new C20541APa(aEw, this, 1, !z), aEw.A01, z2);
                } else if (b7g instanceof C20289AEx) {
                    C20289AEx aEx = (C20289AEx) b7g;
                    try {
                        AnonymousClass1M9 r12 = this.A09;
                        String str = aEx.A03;
                        C22931Dv r0 = AnonymousClass1BI.A00;
                        AnonymousClass1BI A012 = C22931Dv.A01(str);
                        C17960vV.A07(A012);
                        AnonymousClass1E7 A0E = r12.A0E(A012);
                        if (A0E != null) {
                            A13.add(new C174138wI(new C184239ad(aEx, this), A0E, aEx.A01, str, C17880vN.A10(AnonymousClass8BW.A0t(aEx.A02))));
                        }
                    } catch (AnonymousClass11T e) {
                        Log.i("DirectoryRecentSearchDelegate/createRecentSearchListDirectoryRecentSearchDelegates: one of the business profiles could not be loaded", e);
                    }
                } else if (b7g instanceof C20290AEy) {
                    C20290AEy aEy = (C20290AEy) b7g;
                    r1 = new C174328wb(new C20541APa(aEy, this, 0, !z), aEy.A02, aEy.A03, z2);
                } else {
                    Log.i("DirectoryRecentSearchDelegate/createRecentSearchListItems: one of the recent searches is of unknown type");
                }
                A13.add(r1);
            }
        }
        return A13;
    }
}
