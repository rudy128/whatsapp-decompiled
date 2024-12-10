package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.4V0  reason: invalid class name */
public final class AnonymousClass4V0 {
    public final A2B A00;
    public final GroupJid A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V0) {
                AnonymousClass4V0 r5 = (AnonymousClass4V0) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)), this.A05) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03)) * 31, this.A04);
    }

    public AnonymousClass4V0(A2B a2b, GroupJid groupJid, Integer num, Integer num2, boolean z, boolean z2) {
        this.A00 = a2b;
        this.A01 = groupJid;
        this.A05 = z;
        this.A02 = num;
        this.A03 = num2;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubgroupDataModel(subgroup=");
        A10.append(this.A00);
        A10.append(", parentGroupJid=");
        A10.append(this.A01);
        A10.append(", isNew=");
        A10.append(this.A05);
        A10.append(", groupMembershipApprovalState=");
        A10.append(this.A02);
        A10.append(", memberCount=");
        A10.append(this.A03);
        A10.append(", isHiddenSubgroup=");
        return C17900vP.A0F(A10, this.A04);
    }
}
