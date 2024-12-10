package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2ks  reason: invalid class name and case insensitive filesystem */
public class C58552ks {
    public final HashSet A00 = C17880vN.A12();
    public final LinkedHashMap A01 = C17880vN.A13();
    public final /* synthetic */ C32781hk A02;

    public synchronized void A00() {
        Iterator A0i = C17890vO.A0i(this.A01);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            HashSet hashSet = this.A00;
            if (!hashSet.contains(A16.getKey())) {
                break;
            }
            AnonymousClass206 r2 = (AnonymousClass206) A16.getValue();
            A0i.remove();
            hashSet.remove(A16.getKey());
            C32781hk r0 = this.A02;
            boolean A0w = r2.A0w();
            C203911y r02 = (C203911y) r0.A00.get();
            if (A0w) {
                r02.A02(r2);
            } else {
                r02.A01(r2);
            }
        }
    }

    public synchronized String toString() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("[pending:");
        A10.append(this.A01.size());
        A10.append(" ready:");
        A10.append(this.A00.size());
        return AnonymousClass000.A0z(A10);
    }

    public C58552ks(C32781hk r2) {
        this.A02 = r2;
    }
}
