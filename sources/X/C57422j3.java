package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2j3  reason: invalid class name and case insensitive filesystem */
public class C57422j3 {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public C57422j3(UserJid userJid, String str, long j) {
        this.A00 = j;
        this.A01 = userJid;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("id=");
        A10.append(this.A00);
        A10.append(" jid=");
        A10.append(this.A01);
        A10.append(" display=");
        return AnonymousClass000.A0y(this.A02, A10);
    }
}
