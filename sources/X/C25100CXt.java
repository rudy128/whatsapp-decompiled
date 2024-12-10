package X;

import java.io.File;

/* renamed from: X.CXt  reason: case insensitive filesystem */
public final class C25100CXt {
    public final File A00;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C25100CXt)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C25100CXt) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C25100CXt(File file) {
        this.A00 = file;
    }
}
