package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Ua  reason: invalid class name and case insensitive filesystem */
public class C87034Ua {
    public final C62452rQ A00;
    public final AnonymousClass1E7 A01;
    public final UserJid A02;
    public final String A03;

    public int A00() {
        if (this instanceof C79323vB) {
            return ((C79323vB) this).A01;
        }
        if (this instanceof C79313vA) {
            return Integer.MAX_VALUE;
        }
        return this.A00.A00();
    }

    public long A01(int i) {
        if ((this instanceof C79323vB) || (this instanceof C79313vA)) {
            return 0;
        }
        return this.A00.A01(i);
    }

    public Integer A02() {
        if (this instanceof C79323vB) {
            return AnonymousClass00R.A01;
        }
        if (this instanceof C79313vA) {
            return AnonymousClass00R.A0C;
        }
        return AnonymousClass00R.A00;
    }

    public C87034Ua(C62452rQ r1, AnonymousClass1E7 r2, UserJid userJid, String str) {
        this.A02 = userJid;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
    }
}
