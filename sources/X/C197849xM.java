package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.9xM  reason: invalid class name and case insensitive filesystem */
public final class C197849xM {
    public final AnonymousClass00H A00;
    public final AnonymousClass1P3 A01;

    public C197849xM(AnonymousClass1P3 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static final boolean A00(C197849xM r2, UserJid userJid, String str, String str2) {
        Iterator A0j = C17890vO.A0j(r2.A01.A0L(C18070vi.A0P(C63962tz.A02(userJid.getPrimaryDevice()))));
        if (!A0j.hasNext()) {
            return false;
        }
        return C63962tz.A07(((C58252kO) A0j.next()).A00, Base64.decode(str, 2), Base64.decode(str2, 2));
    }
}
