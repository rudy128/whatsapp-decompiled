package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.70D  reason: invalid class name */
public final class AnonymousClass70D {
    public boolean A00;
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1Nb A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final Object A06 = C17880vN.A0p();
    public final Object A07 = C17880vN.A0p();
    public final Object A08 = C17880vN.A0p();
    public final Object A09 = C17880vN.A0p();
    public final Map A0A = C17880vN.A13();
    public final Set A0B = C17880vN.A14();
    public final Set A0C = C17880vN.A14();
    public final Set A0D = C17880vN.A14();
    public final AnonymousClass00H A0E;

    public static void A00(AnonymousClass70D r1, Map map) {
        r1.A01.A0E(C29431cG.A12(map.values()));
    }

    public final Set A01() {
        Set A12;
        synchronized (this.A09) {
            A12 = C29431cG.A12(this.A0A.values());
        }
        return A12;
    }

    public final void A02() {
        synchronized (this.A09) {
            this.A0A.clear();
            this.A01.A0E(C25511Om.A00);
        }
    }

    public final void A03(Collection collection) {
        synchronized (this.A06) {
            ArrayList A0D2 = C29351c6.A0D(collection);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A0D2.add(((C46162Dk) it.next()).A08());
            }
            this.A0B.addAll(A0D2);
        }
    }

    public final void A04(boolean z) {
        if (z) {
            AnonymousClass00H r3 = this.A05;
            AnonymousClass1Y5.A00(((AnonymousClass118) r3.get()).A00, (AnonymousClass11C) this.A04.get(), C18070vi.A0G((AnonymousClass118) r3.get(), 2131886207));
        }
        Map map = this.A0A;
        long size = (long) map.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, map.size());
        String A0K = ((C18000vb) this.A0E.get()).A0K(A1a, 2131755256, size);
        C18070vi.A0X(A0K);
        AnonymousClass1Y5.A00(((AnonymousClass118) this.A05.get()).A00, (AnonymousClass11C) this.A04.get(), A0K);
    }

    public final boolean A05(C46162Dk r4) {
        boolean containsKey;
        synchronized (this.A09) {
            containsKey = this.A0A.containsKey(r4.A08());
        }
        return containsKey;
    }

    public AnonymousClass70D(AnonymousClass1Nb r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A0E = r5;
        this.A05 = r6;
    }
}
