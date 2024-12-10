package X;

import java.util.Arrays;

/* renamed from: X.9dr  reason: invalid class name and case insensitive filesystem */
public final class C186229dr {
    public byte[] A00;
    public final long A01;
    public final String A02;

    public C186229dr(String str, byte[] bArr, long j, long j2) {
        C18070vi.A0d(bArr, 2);
        this.A02 = str;
        this.A00 = bArr;
        int length = bArr.length;
        if (length == 32) {
            byte[] copyOf = Arrays.copyOf(bArr, length);
            C18070vi.A0X(copyOf);
            this.A00 = copyOf;
            if (j > 0) {
                this.A01 = j;
                if (j2 <= 0) {
                    throw AnonymousClass000.A0k(C17890vO.A0a("Invalid value for validTilTime: ", AnonymousClass000.A10(), j2));
                }
                return;
            }
            throw AnonymousClass000.A0k(C17890vO.A0a("Invalid value for serverTimestamp: ", AnonymousClass000.A10(), j));
        }
        throw AnonymousClass001.A13("Invalid length for serverPublicKey: ", AnonymousClass000.A10(), length);
    }
}
