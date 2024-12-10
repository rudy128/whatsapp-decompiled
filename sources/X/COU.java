package X;

import java.io.File;

public final class COU {
    public final long A00;
    public final File A01;

    public COU(File file) {
        this.A01 = file;
        this.A00 = file.length();
    }
}
