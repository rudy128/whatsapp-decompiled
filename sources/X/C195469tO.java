package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tO  reason: invalid class name and case insensitive filesystem */
public final class C195469tO {
    public C194359rb A00;
    public final UserJid A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195469tO) {
                C195469tO r5 = (C195469tO) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || this.A06 != r5.A06 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A01);
        return AnonymousClass0DV.A00(C17890vO.A02(this.A05, (((C17890vO.A02(this.A04, A0L) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31), this.A06) + C17880vN.A02(this.A00);
    }

    public C195469tO(C194359rb r1, UserJid userJid, Integer num, Integer num2, String str, String str2, boolean z) {
        this.A01 = userJid;
        this.A04 = str;
        this.A03 = num;
        this.A02 = num2;
        this.A05 = str2;
        this.A06 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductRequest(jid=");
        A10.append(this.A01);
        A10.append(", productId=");
        A10.append(this.A04);
        A10.append(", width=");
        A10.append(this.A03);
        A10.append(", height=");
        A10.append(this.A02);
        A10.append(", sessionId=");
        A10.append(this.A05);
        A10.append(", fetchComplianceInfo=");
        A10.append(this.A06);
        A10.append(", catalogVariantsRequestData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
