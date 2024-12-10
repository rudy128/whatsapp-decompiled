package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6oo  reason: invalid class name and case insensitive filesystem */
public class C133466oo {
    public final UserJid A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C133466oo r5 = (C133466oo) obj;
            if (this.A01 != r5.A01 || !C42171xk.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public C133466oo(UserJid userJid, boolean z) {
        this.A01 = z;
        this.A00 = userJid;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A00;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A01), A1b, 1);
    }
}
