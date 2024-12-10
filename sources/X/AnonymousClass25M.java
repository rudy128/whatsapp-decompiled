package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.25M  reason: invalid class name */
public final class AnonymousClass25M {
    public final AnonymousClass1E7 A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass25L A02;
    public final GroupJid A03;
    public final AnonymousClass206 A04;
    public final C53812d8 A05;
    public final C42551yM A06;
    public final AnonymousClass1E7 A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass25M) {
                AnonymousClass25M r5 = (AnonymousClass25M) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass206 r0 = this.A04;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        GroupJid groupJid = this.A03;
        int hashCode2 = (hashCode + (groupJid == null ? 0 : groupJid.hashCode())) * 31;
        AnonymousClass1E7 r02 = this.A01;
        int hashCode3 = (((hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31) + this.A06.hashCode()) * 31;
        AnonymousClass1E7 r03 = this.A00;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        C53812d8 r04 = this.A05;
        int hashCode5 = (hashCode4 + (r04 == null ? 0 : r04.hashCode())) * 31;
        AnonymousClass1E7 r05 = this.A07;
        int hashCode6 = (hashCode5 + (r05 == null ? 0 : r05.hashCode())) * 31;
        AnonymousClass25L r06 = this.A02;
        if (r06 != null) {
            i = r06.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncDataBundle(lastMessage=");
        sb.append(this.A04);
        sb.append(", recentSubgroup=");
        sb.append(this.A03);
        sb.append(", sender=");
        sb.append(this.A01);
        sb.append(", chatSettings=");
        sb.append(this.A06);
        sb.append(", messageAddOnSender=");
        sb.append(this.A00);
        sb.append(", messageAddOnPreview=");
        sb.append(this.A05);
        sb.append(", communityItem=");
        sb.append(this.A07);
        sb.append(", draftMessage=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass25M(AnonymousClass1E7 r1, AnonymousClass1E7 r2, AnonymousClass1E7 r3, AnonymousClass25L r4, GroupJid groupJid, AnonymousClass206 r6, C53812d8 r7, C42551yM r8) {
        this.A04 = r6;
        this.A03 = groupJid;
        this.A01 = r1;
        this.A06 = r8;
        this.A00 = r2;
        this.A05 = r7;
        this.A07 = r3;
        this.A02 = r4;
    }
}
