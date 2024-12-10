package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2MN  reason: invalid class name */
public class AnonymousClass2MN extends C436420i {
    public UserJid A00;
    public UserJid A01;
    public transient AnonymousClass190 A02;

    public void A18(UserJid userJid) {
        if (this.A02 != null && C22971Dz.A0T(userJid)) {
            this.A02.A0G("InvalidNumberChangeJid", AnonymousClass001.A1E(userJid, "newJid = ", AnonymousClass000.A10()), true);
        }
        this.A00 = userJid;
    }
}
