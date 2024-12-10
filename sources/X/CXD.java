package X;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public final class CXD {
    public int A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public A5W A03 = null;
    public C24250By8 A04 = C24250By8.UNKNOWN;
    public File A05;
    public URL A06 = null;

    public C25271CcJ A00() {
        URL url = this.A06;
        File file = this.A05;
        if (url == null) {
            if (file == null) {
                throw AnonymousClass000.A0k("Source file and url cannot be both null");
            }
        } else if (file != null) {
            throw AnonymousClass000.A0k("Source file and url cannot be both non-null");
        }
        if (this.A03 == null) {
            this.A03 = new A5W(TimeUnit.MILLISECONDS, -1, -1);
        }
        return new C25271CcJ(this);
    }

    public CXD(File file) {
        this.A05 = file;
    }
}
