package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DNg  reason: case insensitive filesystem */
public final class C26958DNg implements E88 {
    public final C26012CqT A00;
    public final String A01;
    public final Map A02;
    public final long A03;
    public final C23721BoS A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final Map A08;

    public C26958DNg(C26012CqT cqT, C23721BoS boS, String str, String str2, String str3, List list, Map map, Map map2, long j) {
        LinkedHashMap linkedHashMap;
        C18070vi.A0d(str2, 4);
        this.A04 = boS;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = j;
        this.A08 = map;
        this.A07 = map2;
        this.A00 = cqT;
        Integer num = AnonymousClass00R.A00;
        String A012 = C25339Cdy.A01(str, C25339Cdy.A00(num, list));
        C18070vi.A0X(A012);
        this.A01 = A012;
        if (boS != null) {
            linkedHashMap = A00(boS.A00, this, num);
        } else {
            linkedHashMap = null;
        }
        this.A02 = linkedHashMap;
    }

    public static final LinkedHashMap A00(CO8 co8, C26958DNg dNg, Integer num) {
        AnonymousClass1D6[] r1;
        AnonymousClass1D6 A012;
        Integer num2 = num;
        if (!(co8 instanceof C23725BoW)) {
            if (co8 instanceof C23726BoX) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Network request failed for component query with app id ");
                A10.append(dNg.A05);
                C25913CoX.A00((DOZ) null, "BloksComponentQueryInitialData", AnonymousClass000.A0y(". To find the server-side error trace, open Opes and filter to buenopaths containing that app id.", A10), ((C23726BoX) co8).A00);
                num2 = AnonymousClass00R.A0C;
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        LinkedHashMap A002 = CC4.A00(co8, num2);
        if (!(co8 instanceof C23723BoU)) {
            r1 = new AnonymousClass1D6[2];
            A012 = AnonymousClass1D6.A01("components", (Object) null);
        } else {
            Map map = ((C23723BoU) co8).A00.A01;
            LinkedHashMap A0b = C108995ce.A0b(map);
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A0b.put(A16.getKey(), new C25205Cay(A16.getValue(), dNg.A06, C18460wS.A00, dNg.A07));
            }
            r1 = new AnonymousClass1D6[2];
            A012 = AnonymousClass1D6.A01("components", A0b);
        }
        r1[0] = A012;
        AnonymousClass1D6.A03("info", A002, r1, 1);
        return AnonymousClass1D7.A0B(r1);
    }

    public Runnable BFH(CFu cFu, E6H e6h) {
        C25166CaH caH;
        if (this.A04 != null) {
            return null;
        }
        C26012CqT cqT = this.A00;
        C4E A012 = cqT.A01(this.A05, this.A08, new C28052DqS(this, e6h), this.A03);
        if (A012 instanceof C23721BoS) {
            synchronized (cqT.A08) {
                caH = cqT.A00;
            }
            e6h.BKK(new C25137CZn(caH), A00(((C23721BoS) A012).A00, this, AnonymousClass00R.A01), "acq", this.A01);
            return null;
        } else if (A012 instanceof C23722BoT) {
            return ((C23722BoT) A012).A00;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    public /* bridge */ /* synthetic */ Object BSx() {
        return this.A02;
    }
}
