package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Dw  reason: invalid class name and case insensitive filesystem */
public final class C22941Dw {
    public final UserJid A04(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            obj = A03(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (UserJid) obj2;
    }

    public static UserJid A00(Jid jid) {
        C22941Dw r0 = UserJid.Companion;
        return A01(jid);
    }

    public static final UserJid A01(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    public static UserJid A02(String str) {
        return UserJid.Companion.A04(str);
    }

    public static final UserJid A03(String str) {
        UserJid userJid;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if ((A00 instanceof UserJid) && (userJid = (UserJid) A00) != null) {
            return userJid;
        }
        throw new AnonymousClass11T(str);
    }
}
