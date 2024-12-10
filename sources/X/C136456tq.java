package X;

import java.util.Arrays;

/* renamed from: X.6tq  reason: invalid class name and case insensitive filesystem */
public final class C136456tq {
    public byte[] A00 = null;
    public byte[] A01 = null;
    public final String A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;

    public C136456tq(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C18070vi.A0w(bArr, bArr2, str, str2, bArr3);
        C18070vi.A0d(bArr4, 6);
        this.A06 = bArr;
        this.A07 = bArr2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = bArr3;
        this.A05 = bArr4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136456tq) {
                C136456tq r5 = (C136456tq) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A022 = (((C17890vO.A02(this.A02, C17890vO.A02(this.A03, ((Arrays.hashCode(this.A06) * 31) + Arrays.hashCode(this.A07)) * 31)) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A05)) * 31;
        byte[] bArr = this.A00;
        int i = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i2 = (A022 + hashCode) * 31;
        byte[] bArr2 = this.A01;
        if (bArr2 != null) {
            i = Arrays.hashCode(bArr2);
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostPurposeEncryptionParams(serverPublicEK=");
        C17890vO.A1C(A10, this.A06);
        A10.append(", serverPublicIK=");
        C17890vO.A1C(A10, this.A07);
        A10.append(", serverPublicIKSignature=");
        A10.append(this.A03);
        A10.append(", serverPublicIKCertificate=");
        A10.append(this.A02);
        A10.append(", dummyCiphertext=");
        C17890vO.A1C(A10, this.A04);
        A10.append(", dummyNonce=");
        C17890vO.A1C(A10, this.A05);
        A10.append(", clientPrivateKey=");
        C17890vO.A1C(A10, this.A00);
        A10.append(", clientPublicKey=");
        return C17900vP.A0B(Arrays.toString(this.A01), A10);
    }
}
