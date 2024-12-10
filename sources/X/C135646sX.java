package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6sX  reason: invalid class name and case insensitive filesystem */
public final class C135646sX {
    public final UserJid A00;
    public final UserJid A01;
    public final UserJid A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135646sX) {
                C135646sX r5 = (C135646sX) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01)) * 31, this.A03);
    }

    public C135646sX(UserJid userJid, UserJid userJid2, UserJid userJid3, boolean z) {
        this.A02 = userJid;
        this.A00 = userJid2;
        this.A01 = userJid3;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JidsInFloatingView(jidToRemoveFromGrid=");
        A10.append(this.A02);
        A10.append(", jidToHideInGrid=");
        A10.append(this.A00);
        A10.append(", jidToHideInHScroll=");
        A10.append(this.A01);
        A10.append(", shouldAllowGridLongPress=");
        return C17900vP.A0F(A10, this.A03);
    }
}
