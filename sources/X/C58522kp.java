package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2kp  reason: invalid class name and case insensitive filesystem */
public class C58522kp {
    public final AnonymousClass1MR A00;
    public final AnonymousClass1P3 A01;
    public final AnonymousClass123 A02;

    public void A01(UserJid userJid) {
        HashSet A0A = this.A00.A0A(userJid);
        HashMap A002 = A00(A0A);
        ArrayList A10 = C17880vN.A10(A0A);
        A10.removeAll(A002.keySet());
        if (!A10.isEmpty()) {
            this.A02.A02(A10);
        }
    }

    public C58522kp(AnonymousClass1P3 r1, AnonymousClass123 r2, AnonymousClass1MR r3) {
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }

    public HashMap A00(Iterable iterable) {
        HashMap A11 = C17880vN.A11();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = C17880vN.A0R(it);
            C58252kO A0D = this.A01.A0D(C63962tz.A02(A0R));
            if (A0D != null) {
                A11.put(A0R, A0D);
            }
        }
        return A11;
    }
}
