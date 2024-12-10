package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.Cij  reason: case insensitive filesystem */
public final class C25604Cij {
    public int A00;
    public C25177CaT A01;
    public final int A02;
    public final LinkedList A03 = AnonymousClass8BR.A14();
    public final Map A04 = C17880vN.A13();
    public final C22821Di A05;
    public final C18090vk A06;

    public static final void A00(C25604Cij cij) {
        AnonymousClass1BI r6 = (AnonymousClass1BI) cij.A06.invoke();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r4));
        for (C122716Rq r1 : C122716Rq.values()) {
            linkedHashMap.put(r1, cij.A05.invoke(r1));
        }
        C25177CaT caT = new C25177CaT(r6, linkedHashMap);
        if (!caT.equals(cij.A01)) {
            C29391cC.A0H(cij.A03, new DUP(new DUK(new DUP(new DUP(new DUP(caT, 13), 14), 15), caT, 1), 16));
            cij.A01 = caT;
        }
    }

    public C25604Cij(C18090vk r2, C22821Di r3, int i) {
        this.A02 = i;
        this.A06 = r2;
        this.A05 = r3;
    }
}
