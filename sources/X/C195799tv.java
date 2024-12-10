package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9tv  reason: invalid class name and case insensitive filesystem */
public final class C195799tv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final AnonymousClass1EC A05;
    public final UserJid A06;
    public final C42661yX A07;
    public final String A08;
    public final Map A09;
    public final boolean A0A;
    public final boolean A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195799tv) {
                C195799tv r8 = (C195799tv) obj;
                if (!(C18070vi.A18(this.A05, r8.A05) && C18070vi.A18(this.A06, r8.A06) && this.A03 == r8.A03 && C18070vi.A18(this.A08, r8.A08) && this.A04 == r8.A04 && C18070vi.A18(this.A09, r8.A09) && this.A02 == r8.A02 && C18070vi.A18(this.A07, r8.A07) && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A0A == r8.A0A && this.A0B == r8.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A03;
        int A0K = AnonymousClass001.A0K(this.A04, (AnonymousClass001.A0K(j, (AnonymousClass000.A0L(this.A05) + AnonymousClass001.A0k(this.A06)) * 31) + C108955ca.A06(this.A08)) * 31);
        return C17880vN.A01(AnonymousClass0DV.A00((((AnonymousClass000.A0N(this.A07, (AnonymousClass000.A0N(this.A09, A0K) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31, this.A0A), this.A0B);
    }

    public C195799tv(AnonymousClass1EC r1, UserJid userJid, C42661yX r3, String str, Map map, int i, int i2, int i3, long j, long j2, boolean z, boolean z2) {
        this.A05 = r1;
        this.A06 = userJid;
        this.A03 = j;
        this.A08 = str;
        this.A04 = j2;
        this.A09 = map;
        this.A02 = i;
        this.A07 = r3;
        this.A01 = i2;
        this.A00 = i3;
        this.A0A = z;
        this.A0B = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedGroup(subgroupJid=");
        A10.append(this.A05);
        A10.append(", creator=");
        A10.append(this.A06);
        A10.append(", creation=");
        A10.append(this.A03);
        A10.append(", subject=");
        A10.append(this.A08);
        A10.append(", subjectTime=");
        A10.append(this.A04);
        A10.append(", groupParticipants=");
        A10.append(this.A09);
        A10.append(", size=");
        A10.append(this.A02);
        A10.append(", groupDescription=");
        A10.append(this.A07);
        A10.append(", groupType=");
        A10.append(this.A01);
        A10.append(", groupMembershipApprovalState=");
        A10.append(this.A00);
        A10.append(", isAdminRequestRequired=");
        A10.append(this.A0A);
        A10.append(", isHiddenSubgroup=");
        return C17900vP.A0F(A10, this.A0B);
    }
}
