package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tk  reason: invalid class name and case insensitive filesystem */
public final class C195689tk {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C194359rb A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195689tk) {
                C195689tk r5 = (C195689tk) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A00 != r5.A00 || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A05, r5.A05) || this.A08 != r5.A08 || this.A09 != r5.A09 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((((((AnonymousClass000.A0N(this.A04, C17880vN.A03(this.A06)) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A05)) * 31, this.A08), this.A09) + C17880vN.A02(this.A03);
    }

    public C195689tk(C194359rb r1, UserJid userJid, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
        C18070vi.A0j(str, userJid);
        this.A06 = str;
        this.A04 = userJid;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A07 = str2;
        this.A05 = str3;
        this.A08 = z;
        this.A09 = z2;
        this.A03 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CollectionProductListRequest(collectionId=");
        A10.append(this.A06);
        A10.append(", businessId=");
        A10.append(this.A04);
        A10.append(", limit=");
        A10.append(this.A01);
        A10.append(", width=");
        A10.append(this.A02);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", sessionId=");
        A10.append(this.A07);
        A10.append(", afterCursor=");
        A10.append(this.A05);
        A10.append(", isCategory=");
        A10.append(this.A08);
        A10.append(", isSkipDirectConnectionEncryptedInfoCheck=");
        A10.append(this.A09);
        A10.append(", catalogVariantsRequestData=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
