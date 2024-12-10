package X;

import java.io.File;

public class CWT {
    public long A00 = -1;
    public long A01 = -1;
    public final C25100CXt A02;
    public final String A03;

    public long A00() {
        long j = this.A01;
        if (j >= 0) {
            return j;
        }
        long lastModified = this.A02.A00.lastModified();
        this.A01 = lastModified;
        return lastModified;
    }

    public CWT(String str, File file) {
        C26208Cuj.A01(str);
        this.A03 = str;
        this.A02 = new C25100CXt(file);
    }
}
