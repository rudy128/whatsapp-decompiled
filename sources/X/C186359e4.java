package X;

import java.util.Set;

/* renamed from: X.9e4  reason: invalid class name and case insensitive filesystem */
public final class C186359e4 {
    public final AnonymousClass9ZR A00;
    public final Set A01;
    public final int[] A02;
    public final String[] A03;

    public C186359e4(AnonymousClass9ZR r3, int[] iArr, String[] strArr) {
        Set A0P;
        this.A00 = r3;
        this.A02 = iArr;
        this.A03 = strArr;
        int length = strArr.length;
        if (length == 0) {
            A0P = C25511Om.A00;
        } else {
            A0P = C18070vi.A0P(strArr[0]);
        }
        this.A01 = A0P;
        if (iArr.length != length) {
            throw AnonymousClass000.A0n("Check failed.");
        }
    }
}
