package X;

import java.io.File;

/* renamed from: X.0vS  reason: invalid class name and case insensitive filesystem */
public final class C17930vS extends C17920vR {
    public volatile File A00;
    public volatile File A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17930vS(C17950vU r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    public File A00() {
        if (this.A00 == null) {
            this.A00 = this.A00.getCacheDir();
        }
        File file = this.A00;
        if (file != null) {
            return file;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public File A01() {
        if (this.A01 == null) {
            this.A01 = this.A00.getFilesDir();
        }
        File file = this.A01;
        if (file != null) {
            return file;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public File A02(String str, int i) {
        File dir = this.A00.getDir(str, i);
        C18070vi.A0X(dir);
        return dir;
    }
}
