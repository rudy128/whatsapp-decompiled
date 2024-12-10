package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9tw  reason: invalid class name and case insensitive filesystem */
public final class C195809tw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final AnonymousClass1EC A05;
    public final AnonymousClass1EC A06;
    public final UserJid A07;
    public final C42661yX A08;
    public final String A09;
    public final String A0A;
    public final Map A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195809tw) {
                C195809tw r8 = (C195809tw) obj;
                if (!C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A07, r8.A07) || this.A03 != r8.A03 || !C18070vi.A18(this.A0A, r8.A0A) || this.A04 != r8.A04 || !C18070vi.A18(this.A0B, r8.A0B) || this.A02 != r8.A02 || !C18070vi.A18(this.A08, r8.A08) || this.A01 != r8.A01 || this.A00 != r8.A00 || !C18070vi.A18(this.A09, r8.A09) || !C18070vi.A18(this.A06, r8.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A03;
        int A0K = AnonymousClass001.A0K(this.A04, (AnonymousClass001.A0K(j, (AnonymousClass000.A0L(this.A05) + AnonymousClass001.A0k(this.A07)) * 31) + C17900vP.A00(this.A0A)) * 31);
        return ((((((AnonymousClass000.A0N(this.A08, (AnonymousClass000.A0N(this.A0B, A0K) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + C17900vP.A00(this.A09)) * 31) + C17880vN.A02(this.A06);
    }

    public C195809tw(AnonymousClass1EC r1, AnonymousClass1EC r2, UserJid userJid, C42661yX r4, String str, String str2, Map map, int i, int i2, int i3, long j, long j2) {
        this.A05 = r1;
        this.A07 = userJid;
        this.A03 = j;
        this.A0A = str;
        this.A04 = j2;
        this.A0B = map;
        this.A02 = i;
        this.A08 = r4;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = str2;
        this.A06 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupInviteInfo(gjid=");
        A10.append(this.A05);
        A10.append(", creator=");
        A10.append(this.A07);
        A10.append(", creation=");
        A10.append(this.A03);
        A10.append(", subject=");
        A10.append(this.A0A);
        A10.append(", subjectT=");
        A10.append(this.A04);
        A10.append(", groupParticipantContacts=");
        A10.append(this.A0B);
        A10.append(", size=");
        A10.append(this.A02);
        A10.append(", gd=");
        A10.append(this.A08);
        A10.append(", groupType=");
        A10.append(this.A01);
        A10.append(", groupMembershipApprovalState=");
        A10.append(this.A00);
        A10.append(", linkedParentGroupName=");
        A10.append(this.A09);
        A10.append(", parentGroupJid=");
        return AnonymousClass001.A1F(this.A06, A10);
    }
}
