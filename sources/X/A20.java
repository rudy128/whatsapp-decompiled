package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

public final class A20 {
    public C194359rb A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            A20 a20 = (A20) obj;
            if (!C18070vi.A18(this.A01, a20.A01) || !C18070vi.A18(this.A04, a20.A04)) {
                return false;
            }
        }
        return true;
    }

    public A20(C194359rb r1, UserJid userJid, String str, String str2, List list) {
        this.A01 = userJid;
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        return AnonymousClass000.A0P(this.A04, A1b, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductListRequest(businessId=");
        A10.append(this.A01);
        A10.append(", productIds=");
        A10.append(this.A04);
        A10.append(", width=");
        A10.append(this.A03);
        A10.append(", height=");
        A10.append(this.A02);
        A10.append(", catalogVariantsRequestData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A20(UserJid userJid, String str, String str2, List list) {
        this((C194359rb) null, userJid, str, str2, list);
        C18070vi.A0s(userJid, list, str, str2);
    }
}
