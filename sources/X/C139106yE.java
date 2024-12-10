package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6yE  reason: invalid class name and case insensitive filesystem */
public final class C139106yE {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final boolean A03;
    public final boolean A04;

    public C139106yE(C63372sx r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A04 = z;
        UserJid userJid = r2.A0A;
        C18070vi.A0X(userJid);
        this.A02 = userJid;
        this.A00 = r2.A00();
        this.A01 = r2.A01();
        this.A03 = r2.A0D();
    }

    public final boolean A01() {
        if (this.A00 <= 0 || this.A04 || this.A03) {
            return false;
        }
        return true;
    }

    public static void A00(Iterator it, Map map, Set set) {
        Map.Entry entry = (Map.Entry) it.next();
        map.put(entry.getKey(), new C139106yE((C63372sx) entry.getValue(), set.contains(entry.getKey())));
    }
}
