package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6qm  reason: invalid class name and case insensitive filesystem */
public final class C134556qm {
    public final UserJid A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134556qm) {
                C134556qm r5 = (C134556qm) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0k(this.A00) * 31, this.A01);
    }

    public C134556qm(UserJid userJid, boolean z) {
        this.A00 = userJid;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FocusedState(userJid=");
        A10.append(this.A00);
        A10.append(", isCameraOff=");
        return C17900vP.A0F(A10, this.A01);
    }
}
