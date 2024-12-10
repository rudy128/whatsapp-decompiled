package X;

import java.util.Arrays;

/* renamed from: X.2n0  reason: invalid class name and case insensitive filesystem */
public final class C59862n0 {
    public final int A00;
    public final int A01;
    public final C62382rJ A02;
    public final C59372mC A03;
    public final C19999A2n A04;
    public final Boolean A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;
    public final byte[] A0A;

    public C59862n0(C62382rJ r2, C59372mC r3, C19999A2n a2n, Boolean bool, Long l, String str, String str2, byte[] bArr, byte[] bArr2, int i, int i2) {
        C18070vi.A0d(str2, 6);
        this.A07 = str;
        this.A04 = a2n;
        this.A03 = r3;
        this.A01 = i;
        this.A02 = r2;
        this.A08 = str2;
        this.A09 = bArr;
        this.A00 = i2;
        this.A06 = l;
        this.A0A = bArr2;
        this.A05 = bool;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59862n0) {
                C59862n0 r5 = (C59862n0) obj;
                if (!C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || this.A01 != r5.A01 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A09, r5.A09) || this.A00 != r5.A00 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int A022 = C17890vO.A02(this.A08, AnonymousClass000.A0N(this.A02, (((((C17880vN.A03(this.A07) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + this.A01) * 31));
        byte[] bArr = this.A09;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int A0k = (((((A022 + hashCode) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A06)) * 31;
        byte[] bArr2 = this.A0A;
        if (bArr2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Arrays.hashCode(bArr2);
        }
        return ((A0k + hashCode2) * 31) + C17880vN.A02(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdMutationMetaData(collection=");
        A10.append(this.A07);
        A10.append(", keyId=");
        A10.append(this.A04);
        A10.append(", keyData=");
        A10.append(this.A03);
        A10.append(", mutationDirection=");
        A10.append(this.A01);
        A10.append(", operation=");
        A10.append(this.A02);
        A10.append(", mutationName=");
        A10.append(this.A08);
        A10.append(", mutationMac=");
        C17890vO.A1C(A10, this.A09);
        A10.append(", mutationBundle=");
        A10.append(this.A00);
        A10.append(", mutationContentSize=");
        A10.append(this.A06);
        A10.append(", patchMac=");
        C17890vO.A1C(A10, this.A0A);
        A10.append(", isUsingLid=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
