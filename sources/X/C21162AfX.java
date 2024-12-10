package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AfX  reason: case insensitive filesystem */
public final class C21162AfX implements C22470B9c {
    public static final C21162AfX A00 = new C21162AfX();

    public final Object BCF(C29621ca r10, C62672rm r11) {
        String[] strArr = new String[C18070vi.A17(r10, r11)];
        strArr[0] = "biz_opt_out_jid";
        UserJid userJid = (UserJid) r11.A05(r10, UserJid.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, strArr, false);
        if (userJid != null) {
            return new AnonymousClass9DV(userJid, r10);
        }
        return null;
    }
}
