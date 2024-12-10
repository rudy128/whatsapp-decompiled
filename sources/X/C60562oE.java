package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2oE  reason: invalid class name and case insensitive filesystem */
public abstract class C60562oE {
    public static final UserJid A00(AnonymousClass206 r1) {
        if (r1.A0v.A02) {
            return AnonymousClass1E5.A00;
        }
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(r1.A0H());
    }

    public static final String A01(Map map) {
        String str;
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator A15 = AnonymousClass000.A15(map);
        boolean z = true;
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            int A0M = AnonymousClass000.A0M(A16.getValue());
            StringBuilder A102 = AnonymousClass000.A10();
            if (z) {
                str = "";
            } else {
                str = ",";
            }
            A102.append(str);
            A102.append(A0x);
            A102.append(':');
            A10.append(C17880vN.A0t(A102, A0M));
            z = false;
        }
        return A10.toString();
    }
}
