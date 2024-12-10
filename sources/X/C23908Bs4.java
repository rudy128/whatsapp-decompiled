package X;

import java.util.Arrays;

/* renamed from: X.Bs4  reason: case insensitive filesystem */
public final class C23908Bs4 extends C4L {
    public final CYS A00;
    public final C25806CmJ A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23908Bs4) {
                C23908Bs4 bs4 = (C23908Bs4) obj;
                if (!C18070vi.A18(this.A01, bs4.A01) || !C18070vi.A18(this.A02, bs4.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + Arrays.hashCode(this.A02);
    }

    public C23908Bs4(C25806CmJ cmJ, byte[] bArr) {
        this.A01 = cmJ;
        this.A02 = bArr;
        this.A00 = new CYS(bArr);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Normal(header=");
        A10.append(this.A01);
        A10.append(", block=");
        return C17900vP.A0B(Arrays.toString(this.A02), A10);
    }
}
