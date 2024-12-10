package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.16R  reason: invalid class name */
public final class AnonymousClass16R {
    public String A00;
    public Map A01;

    public final synchronized Map A00(UserJid userJid) {
        Map map;
        C18070vi.A0d(userJid, 0);
        if (this.A01 == null || !C18070vi.A18(userJid.getRawString(), this.A00)) {
            this.A00 = userJid.getRawString();
            this.A01 = new HashMap();
        }
        map = this.A01;
        if (map == null) {
            throw new IllegalStateException("sessionState must not be null");
        }
        return map;
    }
}
