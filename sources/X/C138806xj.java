package X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.6xj  reason: invalid class name and case insensitive filesystem */
public final class C138806xj {
    public final /* synthetic */ AnonymousClass73G A00;

    public C138806xj() {
    }

    public void A00(String str) {
        C18070vi.A0d(str, 0);
        AnonymousClass73G r1 = this.A00;
        HashMap hashMap = r1.A0E;
        hashMap.remove(str);
        AnonymousClass1DT r12 = r1.A06;
        Set keySet = hashMap.keySet();
        C18070vi.A0X(keySet);
        r12.A0F(C29431cG.A0t(keySet));
        C108955ca.A1W("onEndpointLost(endpointId=%s)", Locale.US, C108945cZ.A1b(str, new Object[1], 0, 1));
    }

    public C138806xj(AnonymousClass73G r1) {
        this.A00 = r1;
    }
}
