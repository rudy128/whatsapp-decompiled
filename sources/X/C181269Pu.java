package X;

import java.util.Iterator;

/* renamed from: X.9Pu  reason: invalid class name and case insensitive filesystem */
public abstract class C181269Pu {
    public static long A00(AnonymousClass1D9 r6, String str) {
        C18070vi.A0d(str, 0);
        Iterator it = C108985cd.A0s(str, 1).iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int responseCode = r6.A07((C220418j) null, A0v, (String) null).A01.getResponseCode();
                long A04 = AnonymousClass8BR.A04(currentTimeMillis);
                if (responseCode == 204) {
                    return A04;
                }
            } catch (Exception e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("NetworkReachabilityUtils/triggerNetworkReachabilityTest: Tried to reach host: ");
                A10.append(A0v);
                C108995ce.A1M(" and ran into this exception: ", A10, e);
            }
        }
        return -1;
    }
}
