package X;

import com.whatsapp.jid.GroupJid;

public final class A2B {
    public final int A00;
    public final long A01;
    public final GroupJid A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;

    public A2B(GroupJid groupJid, Integer num, Integer num2, Long l, String str, int i, long j) {
        C18070vi.A0d(groupJid, 1);
        this.A02 = groupJid;
        this.A06 = str;
        this.A01 = j;
        this.A00 = i;
        this.A03 = num;
        this.A05 = l;
        this.A04 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2B) {
                A2B a2b = (A2B) obj;
                if (!C18070vi.A18(this.A02, a2b.A02) || !C18070vi.A18(this.A06, a2b.A06) || this.A01 != a2b.A01 || this.A00 != a2b.A00 || !C18070vi.A18(this.A03, a2b.A03) || !C18070vi.A18(this.A05, a2b.A05) || !C18070vi.A18(this.A04, a2b.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0K(this.A01, C17890vO.A02(this.A06, AnonymousClass000.A0L(this.A02))) + this.A00) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17880vN.A02(this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Subgroup(groupJid=");
        A10.append(this.A02);
        A10.append(", subject=");
        A10.append(this.A06);
        A10.append(", subjectTime=");
        A10.append(this.A01);
        A10.append(", groupType=");
        A10.append(this.A00);
        A10.append(", groupMembershipApprovalState=");
        A10.append(this.A03);
        A10.append(", linkingTimestamp=");
        A10.append(this.A05);
        A10.append(", lastKnownMemberCount=");
        return AnonymousClass001.A1F(this.A04, A10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A2B(GroupJid groupJid, String str, int i, long j) {
        this(groupJid, (Integer) null, (Integer) null, (Long) null, str, i, j);
        C18070vi.A0j(groupJid, str);
    }
}
