package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2pI  reason: invalid class name and case insensitive filesystem */
public final class C61202pI {
    public UserJid A00;

    public static C60052nJ A00(UserJid userJid, UserJid userJid2, UserJid userJid3, String str, String str2) {
        AnonymousClass1E2 r2;
        PhoneUserJid phoneUserJid;
        UserJid userJid4 = userJid3;
        UserJid userJid5 = userJid2;
        if (userJid != null) {
            if (C22971Dz.A0T(userJid2)) {
                C18070vi.A0z(userJid2, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
                r2 = (AnonymousClass1E2) userJid5;
            } else {
                r2 = null;
            }
            if (C22971Dz.A0Y(userJid3)) {
                C18070vi.A0z(userJid3, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
                phoneUserJid = (PhoneUserJid) userJid4;
            } else {
                phoneUserJid = null;
            }
            return new C60052nJ(r2, phoneUserJid, userJid, str2, str);
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
