package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9zy  reason: invalid class name and case insensitive filesystem */
public final class C199419zy {
    public int A00;
    public UserJid A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass00H A04;

    public C199419zy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A04 = r2;
    }

    public static final void A00(C199419zy r1, C22821Di r2) {
        String str;
        if (!r1.A02) {
            if (!r1.A03) {
                str = "onLoggable: onStart was not called?";
            } else {
                r1.A02 = true;
                UserJid userJid = r1.A01;
                if (userJid != null) {
                    r2.invoke(userJid);
                    return;
                }
                str = "onLoggable: bizJid should not be null by this moment!";
            }
            Log.e(str);
        }
    }

    public final void A01(UserJid userJid) {
        if (this.A03) {
            Log.w("onStart: can be called only once per instance");
            return;
        }
        this.A03 = true;
        this.A01 = userJid;
        this.A00 = ((C63252sl) this.A04.get()).A02(897463359);
    }
}
