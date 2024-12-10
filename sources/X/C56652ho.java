package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2ho  reason: invalid class name and case insensitive filesystem */
public final class C56652ho {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final void A00(UserJid userJid, int i) {
        C18070vi.A0d(userJid, 0);
        this.A00.put(userJid, Integer.valueOf(i));
    }
}
