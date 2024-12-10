package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2xu  reason: invalid class name and case insensitive filesystem */
public class C66272xu implements AnonymousClass1M6 {
    public final /* synthetic */ C49212Pp A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ void Bmw(UserJid userJid) {
    }

    public C66272xu(C49212Pp r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void Bmt(UserJid userJid) {
        if (this.A01.equals(userJid)) {
            this.A00.A06.countDown();
        }
    }
}
