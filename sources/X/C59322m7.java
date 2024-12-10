package X;

import java.util.Arrays;

/* renamed from: X.2m7  reason: invalid class name and case insensitive filesystem */
public final class C59322m7 {
    public final boolean A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59322m7) {
                C59322m7 r5 = (C59322m7) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((Arrays.hashCode(this.A02) * 31) + Arrays.hashCode(this.A01)) * 31, this.A00);
    }

    public C59322m7(byte[] bArr, byte[] bArr2, boolean z) {
        C18070vi.A0j(bArr, bArr2);
        this.A02 = bArr;
        this.A01 = bArr2;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ValidateSyncMacResult(expectedMac=");
        C17890vO.A1C(A10, this.A02);
        A10.append(", computedMac=");
        C17890vO.A1C(A10, this.A01);
        A10.append(", snapshotMacMismatchInPatch=");
        return C17900vP.A0F(A10, this.A00);
    }
}
