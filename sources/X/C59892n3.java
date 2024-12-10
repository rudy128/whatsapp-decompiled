package X;

import java.util.Arrays;

/* renamed from: X.2n3  reason: invalid class name and case insensitive filesystem */
public final class C59892n3 {
    public Long A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final C59372mC A04;
    public final C19999A2n A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final byte[] A09;
    public final byte[] A0A;
    public final byte[] A0B;
    public final byte[] A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59892n3) {
                C59892n3 r5 = (C59892n3) obj;
                if (!C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || this.A03 != r5.A03 || this.A02 != r5.A02 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
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
        int hashCode3;
        int hashCode4;
        int i = 0;
        int A032 = (((((((((((C17880vN.A03(this.A08) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + this.A03) * 31) + this.A02) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A07)) * 31;
        byte[] bArr = this.A0B;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i2 = (A032 + hashCode) * 31;
        byte[] bArr2 = this.A0C;
        if (bArr2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Arrays.hashCode(bArr2);
        }
        int i3 = (i2 + hashCode2) * 31;
        byte[] bArr3 = this.A09;
        if (bArr3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Arrays.hashCode(bArr3);
        }
        int i4 = (i3 + hashCode3) * 31;
        byte[] bArr4 = this.A0A;
        if (bArr4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = Arrays.hashCode(bArr4);
        }
        int A0k = (((i4 + hashCode4) * 31) + AnonymousClass001.A0k(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0k + i;
    }

    public C59892n3(C59372mC r1, C19999A2n a2n, Long l, Long l2, Long l3, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2) {
        this.A08 = str;
        this.A05 = a2n;
        this.A04 = r1;
        this.A03 = i;
        this.A02 = i2;
        this.A06 = l;
        this.A07 = l2;
        this.A0B = bArr;
        this.A0C = bArr2;
        this.A09 = bArr3;
        this.A0A = bArr4;
        this.A00 = l3;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdBundleMetadata(collection=");
        A10.append(this.A08);
        A10.append(", keyId=");
        A10.append(this.A05);
        A10.append(", keyData=");
        A10.append(this.A04);
        A10.append(", mutationDirection=");
        A10.append(this.A03);
        A10.append(", mutationBundle=");
        A10.append(this.A02);
        A10.append(", patchSize=");
        A10.append(this.A06);
        A10.append(", snapshotSize=");
        A10.append(this.A07);
        A10.append(", patchMac=");
        C17890vO.A1C(A10, this.A0B);
        A10.append(", snapshotMac=");
        C17890vO.A1C(A10, this.A0C);
        A10.append(", expectedMac=");
        C17890vO.A1C(A10, this.A09);
        A10.append(", lthash=");
        C17890vO.A1C(A10, this.A0A);
        A10.append(", version=");
        A10.append(this.A00);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.A01, A10);
    }
}
