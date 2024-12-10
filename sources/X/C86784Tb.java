package X;

import java.io.File;

/* renamed from: X.4Tb  reason: invalid class name and case insensitive filesystem */
public final class C86784Tb {
    public final File A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86784Tb) {
                C86784Tb r5 = (C86784Tb) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C86784Tb(File file, boolean z) {
        this.A01 = z;
        this.A00 = file;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CoverImageState(isEnabled=");
        A10.append(this.A01);
        A10.append(", file=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
