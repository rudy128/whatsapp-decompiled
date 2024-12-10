package X;

import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.1yy  reason: invalid class name and case insensitive filesystem */
public final class C42931yy {
    public final AnonymousClass1E7 A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass1E7 A02;
    public final AnonymousClass1BI A03;
    public final GroupJid A04;
    public final AnonymousClass206 A05;
    public final C139106yE A06;
    public final Boolean A07;
    public final String A08;
    public final Set A09;

    public C42931yy(AnonymousClass1E7 r2, AnonymousClass1E7 r3, AnonymousClass1E7 r4, AnonymousClass1BI r5, GroupJid groupJid, AnonymousClass206 r7, C139106yE r8, Boolean bool, String str, Set set) {
        C18070vi.A0d(r5, 1);
        this.A03 = r5;
        this.A01 = r2;
        this.A04 = groupJid;
        this.A05 = r7;
        this.A02 = r3;
        this.A06 = r8;
        this.A07 = bool;
        this.A08 = str;
        this.A09 = set;
        this.A00 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42931yy) {
                C42931yy r5 = (C42931yy) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
        GroupJid groupJid = this.A04;
        int i = 0;
        int hashCode2 = (hashCode + (groupJid == null ? 0 : groupJid.hashCode())) * 31;
        AnonymousClass206 r0 = this.A05;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        AnonymousClass1E7 r02 = this.A02;
        int hashCode4 = (hashCode3 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C139106yE r03 = this.A06;
        int hashCode5 = (((hashCode4 + (r03 == null ? 0 : r03.hashCode())) * 31) + this.A07.hashCode()) * 31;
        String str = this.A08;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Set set = this.A09;
        int hashCode7 = (hashCode6 + (set == null ? 0 : set.hashCode())) * 31;
        AnonymousClass1E7 r04 = this.A00;
        if (r04 != null) {
            i = r04.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataBundle(chatJid=");
        sb.append(this.A03);
        sb.append(", contact=");
        sb.append(this.A01);
        sb.append(", recentSubgroup=");
        sb.append(this.A04);
        sb.append(", lastMessage=");
        sb.append(this.A05);
        sb.append(", sender=");
        sb.append(this.A02);
        sb.append(", statusData=");
        sb.append(this.A06);
        sb.append(", isChatAssignmentOpened=");
        sb.append(this.A07);
        sb.append(", displayName=");
        sb.append(this.A08);
        sb.append(", groupsInCommonContacts=");
        sb.append(this.A09);
        sb.append(", communityItem=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
