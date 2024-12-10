package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2o1  reason: invalid class name and case insensitive filesystem */
public abstract class C60432o1 {
    public static UserJid A01(AnonymousClass190 r4, C24751Ln r5, C18030ve r6, UserJid userJid, String str) {
        UserJid userJid2;
        String format;
        String str2;
        boolean z = userJid instanceof AnonymousClass1E2;
        if (C18020vd.A05(C18040vf.A02, r6, 5143)) {
            if (!z) {
                userJid2 = r5.A0A((PhoneUserJid) userJid);
                if (userJid2 == null) {
                    if (r4 != null) {
                        format = String.format("LID JID conversion failed for context: %s ", new Object[]{str});
                        str2 = "payments-lid-migration-lid-jid-failure";
                    }
                }
                return userJid2;
            }
            return userJid;
        }
        if (z) {
            userJid2 = r5.A0D((AnonymousClass1E1) userJid);
            if (userJid2 == null) {
                if (r4 != null) {
                    format = String.format("PN JID conversion failed for context: %s ", new Object[]{str});
                    str2 = "payments-lid-migration-pn-jid-failure";
                }
            }
            return userJid2;
        }
        return userJid;
        r4.A0G(str2, format, false);
        return userJid;
    }

    public static PhoneUserJid A00(C24751Ln r1, AnonymousClass1BI r2) {
        if (C22971Dz.A0Y(r2)) {
            return (PhoneUserJid) r2;
        }
        if (C22971Dz.A0T(r2)) {
            return r1.A0D((AnonymousClass1E1) r2);
        }
        return null;
    }
}
