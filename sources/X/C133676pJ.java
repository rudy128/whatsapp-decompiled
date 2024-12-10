package X;

import java.io.File;

/* renamed from: X.6pJ  reason: invalid class name and case insensitive filesystem */
public final class C133676pJ {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;

    public C133676pJ(File file) {
        C18070vi.A0d(file, 1);
        this.A02 = file;
        String name = file.getName();
        C18070vi.A0X(name);
        this.A03 = name;
        this.A00 = file.lastModified();
        this.A01 = file.length();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C133676pJ) || !C18070vi.A18(this.A02, ((C133676pJ) obj).A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
