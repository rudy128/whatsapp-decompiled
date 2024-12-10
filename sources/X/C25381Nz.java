package X;

import com.whatsapp.util.Log;
import java.util.LinkedHashMap;

/* renamed from: X.1Nz  reason: invalid class name and case insensitive filesystem */
public final class C25381Nz {
    public final LinkedHashMap A00 = new LinkedHashMap();
    public final LinkedHashMap A01 = new LinkedHashMap();

    public final C59402mF A00(String str) {
        C59402mF r0;
        Boolean bool = C17960vV.A01;
        LinkedHashMap linkedHashMap = this.A01;
        synchronized (linkedHashMap) {
            r0 = (C59402mF) linkedHashMap.remove(str);
        }
        if (r0 == null) {
            LinkedHashMap linkedHashMap2 = this.A00;
            synchronized (linkedHashMap2) {
                r0 = (C59402mF) linkedHashMap2.remove(str);
            }
        }
        return r0;
    }

    public final LinkedHashMap A01() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.A00;
        synchronized (linkedHashMap2) {
            AnonymousClass2U3.A00(linkedHashMap2, linkedHashMap);
            StringBuilder sb = new StringBuilder();
            sb.append("unacked-messages/getChallengedMessages: ");
            sb.append(linkedHashMap.size());
            Log.i(sb.toString());
        }
        return linkedHashMap;
    }
}
