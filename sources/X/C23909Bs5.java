package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Bs5  reason: case insensitive filesystem */
public final class C23909Bs5 extends C4L {
    public final CYS A00;
    public final C25806CmJ A01;
    public final ArrayList A02 = AnonymousClass000.A13();
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23909Bs5) {
                C23909Bs5 bs5 = (C23909Bs5) obj;
                if (!C18070vi.A18(this.A01, bs5.A01) || !C18070vi.A18(this.A03, bs5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + Arrays.hashCode(this.A03);
    }

    public C23909Bs5(C25806CmJ cmJ, byte[] bArr) {
        this.A01 = cmJ;
        this.A03 = bArr;
        this.A00 = new CYS(bArr);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Dedupe(header=");
        A10.append(this.A01);
        A10.append(", block=");
        return C17900vP.A0B(Arrays.toString(this.A03), A10);
    }
}
