package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

public final class A2J {
    public final int A00;
    public final AW0 A01;
    public final UserJid A02;
    public final C20281AEp A03;
    public final AnonymousClass9I2 A04;
    public final AnonymousClass21K A05;
    public final Boolean A06;
    public final String A07;
    public final List A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2J) {
                A2J a2j = (A2J) obj;
                if (this.A00 != a2j.A00 || !C18070vi.A18(this.A06, a2j.A06) || !C18070vi.A18(this.A03, a2j.A03) || !C18070vi.A18(this.A05, a2j.A05) || !C18070vi.A18(this.A01, a2j.A01) || !C18070vi.A18(this.A02, a2j.A02) || this.A04 != a2j.A04 || !C18070vi.A18(this.A08, a2j.A08) || !C18070vi.A18(this.A07, a2j.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.A00 * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + C108955ca.A06(this.A07);
    }

    public A2J(AW0 aw0, UserJid userJid, C20281AEp aEp, AnonymousClass9I2 r4, AnonymousClass21K r5, Boolean bool, String str, List list, int i) {
        this.A00 = i;
        this.A06 = bool;
        this.A03 = aEp;
        this.A05 = r5;
        this.A01 = aw0;
        this.A02 = userJid;
        this.A04 = r4;
        this.A08 = list;
        this.A07 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckoutData(triggerEntryPoint=");
        A10.append(this.A00);
        A10.append(", shouldShowShimmer=");
        A10.append(this.A06);
        A10.append(", error=");
        A10.append(this.A03);
        A10.append(", orderMessage=");
        A10.append(this.A05);
        A10.append(", paymentTransactionInfo=");
        A10.append(this.A01);
        A10.append(", merchantJid=");
        A10.append(this.A02);
        A10.append(", merchantPaymentAccountStatus=");
        A10.append(this.A04);
        A10.append(", installmentOptions=");
        A10.append(this.A08);
        A10.append(", merchantGatewayName=");
        return C17900vP.A0B(this.A07, A10);
    }

    public A2J() {
        this((AW0) null, (UserJid) null, (C20281AEp) null, AnonymousClass9I2.NONE, (AnonymousClass21K) null, (Boolean) null, (String) null, (List) null, 0);
    }
}
