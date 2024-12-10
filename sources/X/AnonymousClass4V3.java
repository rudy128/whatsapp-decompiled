package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4V3  reason: invalid class name */
public final class AnonymousClass4V3 {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass4V3(UserJid userJid, String str, String str2, String str3, String str4, String str5) {
        C18070vi.A0d(userJid, 1);
        C72473Md.A1M(str2, str3, str4, 3);
        this.A00 = userJid;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A02 = str5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V3) {
                AnonymousClass4V3 r5 = (AnonymousClass4V3) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17890vO.A02(this.A04, C17890vO.A02(this.A03, C17890vO.A02(this.A05, AnonymousClass000.A0L(this.A00))))) + C17900vP.A00(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShoppingFlowContext(businessJid=");
        A10.append(this.A00);
        A10.append(", messageId=");
        A10.append(this.A05);
        A10.append(", flowId=");
        A10.append(this.A03);
        A10.append(", flowToken=");
        A10.append(this.A04);
        A10.append(", flowAction=");
        A10.append(this.A01);
        A10.append(", flowActionPayload=");
        return C17900vP.A0B(this.A02, A10);
    }
}
