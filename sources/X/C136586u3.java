package X;

import java.util.List;

/* renamed from: X.6u3  reason: invalid class name and case insensitive filesystem */
public final class C136586u3 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136586u3) {
                C136586u3 r5 = (C136586u3) obj;
                if (!C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((C17900vP.A00(this.A0B) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A0A)) * 31) + C17900vP.A00(this.A09)) * 31) + C17900vP.A00(this.A02)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A01);
    }

    public C136586u3(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        this.A0B = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A07 = num;
        this.A08 = str5;
        this.A0A = str6;
        this.A09 = str7;
        this.A02 = str8;
        this.A06 = list;
        this.A00 = num2;
        this.A01 = str9;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WARegParameters(waAccountId=");
        A10.append(this.A0B);
        A10.append(", waPhoneNumber=");
        A10.append(this.A04);
        A10.append(", waProfilePicUrl=");
        A10.append(this.A05);
        A10.append(", targetProfileName=");
        A10.append(this.A03);
        A10.append(", targetAccountType=");
        A10.append(this.A07);
        A10.append(", authBlob=");
        A10.append(this.A08);
        A10.append(", passwordCertificate=");
        A10.append(this.A0A);
        A10.append(", encryptionCertificate=");
        A10.append(this.A09);
        A10.append(", ntaError=");
        A10.append(this.A02);
        A10.append(", opaqueTargetAccounts=");
        A10.append(this.A06);
        A10.append(", disclosureId=");
        A10.append(this.A00);
        A10.append(", disclosureVersion=");
        return C17900vP.A0B(this.A01, A10);
    }
}
