package X;

import java.util.ArrayList;

/* renamed from: X.2fa  reason: invalid class name and case insensitive filesystem */
public final class C55322fa {
    public final C62382rJ A00;
    public final C19999A2n A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C55322fa(C62382rJ r6, C19999A2n a2n, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        C18070vi.A0f(bArr, 2, bArr2);
        this.A01 = a2n;
        this.A03 = bArr;
        this.A00 = r6;
        this.A02 = bArr2;
        int length = bArr2.length;
        if (length > 32) {
            ArrayList A0z = C17880vN.A0z(32);
            for (int i = length - 32; i < length; i++) {
                A0z.add(Byte.valueOf(bArr2[i]));
            }
            bArr3 = C29431cG.A1A(A0z);
        } else {
            bArr3 = new byte[32];
            System.arraycopy(bArr2, 0, bArr3, 32 - length, length);
        }
        this.A04 = bArr3;
    }
}
