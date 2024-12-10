package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tC  reason: invalid class name and case insensitive filesystem */
public final class C195349tC {
    public final long A00;
    public final AnonymousClass1EC A01;
    public final AnonymousClass1EC A02;
    public final UserJid A03;
    public final UserJid A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195349tC) {
                C195349tC r8 = (C195349tC) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A05, AnonymousClass001.A0K(this.A00, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A01)))) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03);
    }

    public C195349tC(AnonymousClass1EC r2, AnonymousClass1EC r3, UserJid userJid, UserJid userJid2, String str, long j) {
        C18070vi.A0j(r2, userJid);
        C18070vi.A0d(str, 4);
        this.A01 = r2;
        this.A04 = userJid;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r3;
        this.A03 = userJid2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupMembershipApprovalRequest(groupJid=");
        A10.append(this.A01);
        A10.append(", requesterJid=");
        A10.append(this.A04);
        A10.append(", creationTimeMillis=");
        A10.append(this.A00);
        A10.append(", requestMethod=");
        A10.append(this.A05);
        A10.append(", parentGroupJid=");
        A10.append(this.A02);
        A10.append(", requestedByJid=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
