package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2mu  reason: invalid class name and case insensitive filesystem */
public final class C59802mu {
    public final long A00;
    public final long A01;
    public final AnonymousClass1EC A02;
    public final AnonymousClass1EC A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59802mu) {
                C59802mu r8 = (C59802mu) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A07 != r8.A07 || this.A08 != r8.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0N = (AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03)) + C17900vP.A00(this.A06)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass000.A0N(this.A04, (A0N + i) * 31))), this.A07), this.A08);
    }

    public C59802mu(AnonymousClass1EC r2, AnonymousClass1EC r3, UserJid userJid, String str, String str2, long j, long j2, boolean z, boolean z2) {
        C18070vi.A0j(r2, r3);
        C18070vi.A0d(userJid, 5);
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = j2;
        this.A07 = z;
        this.A08 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubgroupSuggestion(parentGroup=");
        A10.append(this.A03);
        A10.append(", groupJid=");
        A10.append(this.A02);
        A10.append(", subject=");
        A10.append(this.A06);
        A10.append(", description=");
        A10.append(this.A05);
        A10.append(", creator=");
        A10.append(this.A04);
        A10.append(", creation=");
        A10.append(this.A00);
        A10.append(", participantCount=");
        A10.append(this.A01);
        A10.append(", isExistingGroup=");
        A10.append(this.A07);
        A10.append(", isHiddenSubgroup=");
        return C17900vP.A0F(A10, this.A08);
    }
}
