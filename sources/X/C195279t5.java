package X;

import java.util.HashMap;

/* renamed from: X.9t5  reason: invalid class name and case insensitive filesystem */
public final class C195279t5 {
    public final HashMap A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195279t5) {
                C195279t5 r5 = (C195279t5) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A03, C17890vO.A02(this.A02, C17890vO.A02(this.A04, C17880vN.A03(this.A01)))));
    }

    public C195279t5(String str, String str2, String str3, String str4, HashMap hashMap) {
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = hashMap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BrazilPixP2PInfoData(country=");
        A10.append(this.A01);
        A10.append(", ttl=");
        A10.append(this.A04);
        A10.append(", credentialId=");
        A10.append(this.A02);
        A10.append(", customPaymentMethodType=");
        A10.append(this.A03);
        A10.append(", pixMetaData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
