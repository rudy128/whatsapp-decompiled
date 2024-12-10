package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9Qo  reason: invalid class name and case insensitive filesystem */
public abstract class C181459Qo {
    public static final C29621ca A00(UserJid userJid, C192429oN r5, String str) {
        C18070vi.A0d(userJid, 1);
        if ("url".equals(str) && r5 != null) {
            Map map = r5.A01;
            if (map.containsKey(userJid)) {
                return new C29621ca("content_binding", (byte[]) map.get(userJid), (AnonymousClass1MD[]) null);
            }
        }
        return null;
    }
}
