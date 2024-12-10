package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.36h  reason: invalid class name and case insensitive filesystem */
public final class C692036h implements AnonymousClass25D {
    public UserJid A00;
    public C49452Qn A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C692036h) {
                C692036h r5 = (C692036h) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A02)) + AnonymousClass001.A0k(this.A00);
    }

    public C692036h(UserJid userJid, C49452Qn r2, String str) {
        C18070vi.A0j(str, r2);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMessageInfo(targetId=");
        A10.append(this.A02);
        A10.append(", state=");
        A10.append(this.A01);
        A10.append(", botInvokerJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
