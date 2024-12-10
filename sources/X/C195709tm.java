package X;

import java.util.Arrays;

/* renamed from: X.9tm  reason: invalid class name and case insensitive filesystem */
public final class C195709tm {
    public String A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String[] A09;

    public C195709tm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, int i) {
        C18070vi.A0d(str, 1);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = strArr;
        this.A01 = i;
        this.A05 = str7;
        this.A02 = str8;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195709tm) {
                C195709tm r5 = (C195709tm) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A09, r5.A09) || this.A01 != r5.A01 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A032 = (((((((((C17880vN.A03(this.A04) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A08)) * 31;
        String[] strArr = this.A09;
        if (strArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(strArr);
        }
        return ((((((A032 + hashCode) * 31) + this.A01) * 31) + C17900vP.A00(this.A05)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowIdLinks(flowId=");
        A10.append(this.A04);
        A10.append(", dataApiVersion=");
        A10.append(this.A03);
        A10.append(", state=");
        A10.append(this.A00);
        A10.append(", flowVersionIds=");
        A10.append(this.A06);
        A10.append(", pslCdnUrl=");
        A10.append(this.A07);
        A10.append(", pslSignature=");
        A10.append(this.A08);
        A10.append(", categories=");
        A10.append(Arrays.toString(this.A09));
        A10.append(", flowJsonVersion=");
        A10.append(this.A01);
        A10.append(", flowName=");
        A10.append(this.A05);
        A10.append(", dataApiProtocol=");
        return C17900vP.A0B(this.A02, A10);
    }
}
