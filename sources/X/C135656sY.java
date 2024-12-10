package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6sY  reason: invalid class name and case insensitive filesystem */
public final class C135656sY {
    public final int A00;
    public final UserJid A01;
    public final boolean A02;
    public final boolean A03;

    public C135656sY(UserJid userJid, int i, boolean z, boolean z2) {
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135656sY) {
                C135656sY r5 = (C135656sY) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A03) + this.A00) * 31) + 1237) * 31, this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantListInfo(jid=");
        A10.append(this.A01);
        A10.append(", pendingJoin=");
        A10.append(this.A03);
        A10.append(", state=");
        A10.append(this.A00);
        C108975cc.A15(A10, ", isSelf=");
        A10.append(", isInvitedBySelf=");
        return C17900vP.A0F(A10, this.A02);
    }
}
