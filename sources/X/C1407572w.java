package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.72w  reason: invalid class name and case insensitive filesystem */
public final class C1407572w {
    public static final C1409173o A07 = new C1409173o(13);
    public static final C1409173o A08 = new C1409173o(0);
    public static final C1409173o A09 = new C1409173o(21);
    public AnonymousClass21V A00;
    public Integer A01;
    public final C18030ve A02;
    public final C32431hB A03;
    public final AnonymousClass10I A04;
    public final ArrayList A05 = AnonymousClass000.A13();
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();

    public static final void A00(C1409173o r2, AnonymousClass21V r3, C1407572w r4) {
        ConcurrentHashMap concurrentHashMap = r4.A06;
        C126486co r0 = (C126486co) concurrentHashMap.get(r3);
        if (r0 != null) {
            r0.A00.A00 = r2;
            concurrentHashMap.remove(r3);
        }
    }

    public final void A02() {
        Log.i("statusdownload/cancel-all-status-downloads");
        C32431hB r3 = this.A03;
        Iterator it = r3.A0B().iterator();
        while (it.hasNext()) {
            AnonymousClass21V A0b = C17880vN.A0b(it);
            if (C22971Dz.A0g(A0b)) {
                C32431hB.A06(r3, A0b, false, false, false);
            }
        }
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }

    public C1407572w(C18030ve r2, C32431hB r3, AnonymousClass10I r4) {
        C18070vi.A0o(r2, r4, r3);
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public static final void A01(AnonymousClass21V r3, C1407572w r4, int i) {
        Integer num;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("statusdownload/queue-status-download ");
        A10.append(r3.A0v.A01);
        A10.append(' ');
        A10.append(r3.A0H());
        C17900vP.A0j(", mode = ", A10, i);
        if (!r3.equals(r4.A00) || ((num = r4.A01) != null && i < num.intValue())) {
            r4.A00 = r3;
            r4.A01 = Integer.valueOf(i);
            r4.A03.A0D(new C144797Is(r3, r4, 7), r3, i);
        }
    }
}
