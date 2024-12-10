package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.34m  reason: invalid class name and case insensitive filesystem */
public final class C687334m implements B5K {
    public UserJid A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C687334m) {
                C687334m r5 = (C687334m) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingCommentValues(threadMsgId=");
        A10.append(this.A01);
        A10.append(", threadMsgSenderJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
