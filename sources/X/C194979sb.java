package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9sb  reason: invalid class name and case insensitive filesystem */
public final class C194979sb {
    public final int A00;
    public final Jid A01;
    public final Jid A02;
    public final UserJid A03;

    public C194979sb(Jid jid, Jid jid2, UserJid userJid, int i) {
        C18070vi.A0d(jid2, 2);
        this.A01 = jid;
        this.A02 = jid2;
        this.A03 = userJid;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194979sb) {
                C194979sb r5 = (C194979sb) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)) + AnonymousClass001.A0k(this.A03)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingMessageCoreAttributes(from=");
        A10.append(this.A01);
        A10.append(", senderJid=");
        A10.append(this.A02);
        A10.append(", senderUserJid=");
        A10.append(this.A03);
        A10.append(", editedVersion=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
