package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2s0  reason: invalid class name and case insensitive filesystem */
public abstract class C62792s0 {
    public static AnonymousClass1E7 A00(AnonymousClass1M9 r2, AnonymousClass126 r3, C24901Mc r4, C178119Bw r5) {
        UserJid userJid;
        AnonymousClass1E7 A01;
        if (r5.A0C != null && (A01 = C63982u1.A01(r2, r3, r5.A0C, r4, r5.A0W())) != null) {
            return A01;
        }
        if (r5.A0B == null || r5.A0B.A01 == null) {
            DeviceJid deviceJid = r5.A02;
            if (deviceJid == null) {
                return null;
            }
            userJid = deviceJid.userJid;
        } else {
            userJid = r5.A0B.A01;
        }
        return r2.A0H(userJid);
    }

    public static ArrayList A01(AnonymousClass11S r4, C178119Bw r5) {
        ArrayList A02 = A02(r5);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            UserJid userJid = ((C178109Bv) it.next()).A00;
            if (!r4.A0O(userJid)) {
                A13.add(userJid);
            }
        }
        return A13;
    }

    public static ArrayList A02(C178119Bw r5) {
        ArrayList A0B = r5.A0B();
        UserJid userJid = r5.A04.A01;
        int i = 0;
        while (i < A0B.size() && !((C178109Bv) A0B.get(i)).A00.equals(userJid)) {
            i++;
        }
        if (i != 0 && i < A0B.size()) {
            Object obj = A0B.get(i);
            A0B.remove(i);
            A0B.add(0, obj);
        }
        return A0B;
    }
}
