package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2PO  reason: invalid class name */
public class AnonymousClass2PO extends A34 {
    public WeakReference A00;
    public final C19880zA A01;
    public final AnonymousClass1RK A02;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C53082bx r4 = (C53082bx) obj;
        C34221k8 r2 = (C34221k8) this.A00.get();
        if (r2 != null) {
            r2.C02(r4.A00, r4.A01);
        }
    }

    public AnonymousClass2PO(C19880zA r2, C34221k8 r3, AnonymousClass1RK r4) {
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = new WeakReference(r3);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        int i2;
        List emptyList = Collections.emptyList();
        C19880zA r1 = this.A01;
        ArrayList arrayList = emptyList;
        if (r1.A07()) {
            C37261pE r4 = (C37261pE) r1.A03();
            if (!r4.A00.A00.A09(AnonymousClass18O.A0G)) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                AnonymousClass1HY r3 = r4.A01;
                Iterator it = r3.A03().iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    AnonymousClass00H r12 = r4.A02;
                    Number number = (Number) ((C37271pF) r12.get()).A01.get(A0v);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = 2131897316;
                    }
                    Number number2 = (Number) ((C37271pF) r12.get()).A00.get(A0v);
                    if (number2 != null) {
                        i2 = number2.intValue();
                    } else {
                        i2 = 2131231339;
                    }
                    A13.add(new AnonymousClass4O6(i, i2, A0v, C17890vO.A05(AnonymousClass1HY.A00(r3), AnonymousClass1HY.A01(A0v, "metadata/last_active_time"))));
                }
                arrayList = A13;
            }
        }
        AnonymousClass1RK r7 = this.A02;
        ArrayList A06 = r7.A06();
        Collections.sort(A06, r7.A02);
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A06.iterator();
        long A012 = AnonymousClass11P.A01(r7.A0C);
        int i3 = 0;
        while (it2.hasNext()) {
            C88344Zh r11 = (C88344Zh) it2.next();
            long j = r11.A01;
            if (j > 0) {
                if (A87.A00(5, A012, j) > 5) {
                    it2.remove();
                    A132.add(r11.A08);
                } else {
                    i3++;
                }
            }
        }
        if (i3 > 20) {
            int size = A06.size();
            ArrayList A10 = C17880vN.A10(A06.subList(size - (i3 - 20), size));
            A06.removeAll(A10);
            Iterator it3 = A10.iterator();
            while (it3.hasNext()) {
                A132.add(((C88344Zh) it3.next()).A08);
            }
        }
        if (!A132.isEmpty()) {
            r7.A0H.A08(C199410f.copyOf((Collection) A132));
        }
        return new C53082bx(A06, arrayList);
    }
}
