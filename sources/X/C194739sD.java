package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9sD  reason: invalid class name and case insensitive filesystem */
public final class C194739sD {
    public final long A00;
    public final AnonymousClass1EC A01;
    public final UserJid A02;
    public final UserJid A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194739sD) {
                C194739sD r8 = (C194739sD) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0N(this.A03, (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A02)) * 31));
    }

    public C194739sD(AnonymousClass1EC r1, UserJid userJid, UserJid userJid2, long j) {
        C72473Md.A1I(r1, userJid2);
        this.A01 = r1;
        this.A02 = userJid;
        this.A03 = userJid2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NonAdminGJR(groupJid=");
        A10.append(this.A01);
        A10.append(", requestedByJid=");
        A10.append(this.A02);
        A10.append(", requestedForJid=");
        A10.append(this.A03);
        A10.append(", creationTimeMillis=");
        return C17900vP.A0E(A10, this.A00);
    }
}
