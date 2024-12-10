package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6yC  reason: invalid class name and case insensitive filesystem */
public class C139086yC {
    public final int A00;
    public final int A01;
    public final C60072nL A02;
    public final String A03;
    public final List A04;

    public LatLng A00() {
        List<C60072nL> list = this.A04;
        double d = 0.0d;
        double d2 = 0.0d;
        for (C60072nL r6 : list) {
            d += r6.A00;
            d2 += r6.A01;
        }
        return new LatLng(d / ((double) list.size()), d2 / ((double) list.size()));
    }

    public C139086yC(C27091Ur r6, List list, int i) {
        this.A04 = C17880vN.A10(list);
        C60072nL r0 = (C60072nL) C108955ca.A0p(list);
        this.A02 = r0;
        this.A01 = AnonymousClass000.A1Q(((AnonymousClass11P.A01(r6.A03) - r0.A05) > 600000 ? 1 : ((AnonymousClass11P.A01(r6.A03) - r0.A05) == 600000 ? 0 : -1))) ? 1 : 0;
        this.A00 = i;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A13.add(((C60072nL) it.next()).A06.getRawString());
        }
        this.A03 = TextUtils.join("|", A13);
    }

    public C139086yC(C60072nL r2, int i) {
        this.A04 = Collections.singletonList(r2);
        this.A02 = r2;
        this.A01 = 2;
        this.A00 = i;
        this.A03 = r2.A06.getRawString();
    }
}
