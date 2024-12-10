package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1tC  reason: invalid class name and case insensitive filesystem */
public final class C39511tC extends AnonymousClass11D {
    public final HashMap A00 = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39511tC(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r2, r3, false);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
    }

    public final void A00(AEW aew) {
        UserJid userJid;
        if (aew != null && (userJid = aew.A09) != null) {
            HashMap hashMap = this.A00;
            Object obj = hashMap.get(userJid);
            hashMap.put(userJid, aew);
            if (obj == null || !obj.equals(aew)) {
                notifyAllObservers(new C20723AWd(aew, 5));
            }
        }
    }
}
