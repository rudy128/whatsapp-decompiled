package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4GG  reason: invalid class name */
public abstract class AnonymousClass4GG {
    public static final void A00(C18030ve r3, A6O a6o, AnonymousClass44e r5, UserJid userJid, String str) {
        C18070vi.A0n(str, a6o, r5);
        C18070vi.A0d(r3, 4);
        if (C18020vd.A05(C18040vf.A02, r3, 4725)) {
            ArrayList A04 = r5.A04();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C18070vi.A18(((C195409tI) next).A02, userJid)) {
                    A13.add(next);
                }
            }
            if (C29431cG.A0c(A13) != null) {
                a6o.A03((C134696r0) null, (C196009uJ) null, str);
            }
        }
    }
}
