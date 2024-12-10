package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9sQ  reason: invalid class name and case insensitive filesystem */
public final class C194869sQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;

    public C194869sQ(UserJid userJid, int i, int i2, int i3) {
        C18070vi.A0d(userJid, 1);
        this.A03 = userJid;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194869sQ) {
                C194869sQ r5 = (C194869sQ) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0L(this.A03) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScreenShareEvent(jid=");
        A10.append(this.A03);
        A10.append(", state=");
        A10.append(this.A02);
        A10.append(", sharerVersion=");
        A10.append(this.A01);
        A10.append(", endReason=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
