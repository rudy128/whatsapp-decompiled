package X;

import com.whatsapp.jid.Jid;
import java.util.Comparator;

/* renamed from: X.3D0  reason: invalid class name */
public final class AnonymousClass3D0 implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C59802mu r5 = (C59802mu) obj;
        C59802mu r6 = (C59802mu) obj2;
        C18070vi.A0h(r5, r6);
        int A01 = C18070vi.A01(r5.A00, r6.A00);
        if (A01 != 0) {
            return A01;
        }
        int compareTo = r5.A02.compareTo((Jid) r6.A02);
        if (compareTo == 0) {
            return r5.A04.compareTo((Jid) r6.A04);
        }
        return compareTo;
    }
}
