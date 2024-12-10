package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6ti  reason: invalid class name and case insensitive filesystem */
public final class C136376ti {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136376ti) {
                C136376ti r5 = (C136376ti) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((((AnonymousClass000.A0L(this.A03) + 12) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31, this.A06), this.A05), this.A04);
    }

    public C136376ti(UserJid userJid, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A03 = userJid;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedAccountMediaRequest(businessJid=");
        A10.append(this.A03);
        A10.append(", limit=");
        A10.append(12);
        A10.append(", imageHeight=");
        A10.append(this.A01);
        A10.append(", imageWidth=");
        A10.append(this.A02);
        A10.append(", accountType=");
        A10.append(this.A00);
        A10.append(", shouldFilterSensitiveContent=");
        A10.append(this.A06);
        A10.append(", shouldFilterIneligiblePosts=");
        A10.append(this.A05);
        A10.append(", isTrustCard=");
        return C17900vP.A0F(A10, this.A04);
    }
}
