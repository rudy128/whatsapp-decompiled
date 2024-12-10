package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public class AMP implements BE2 {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ C167298fn A03;

    public AMP(C167298fn r5) {
        this.A03 = r5;
        FileOutputStream A19 = C108945cZ.A19(r5.A03);
        this.A01 = A19;
        this.A02 = r5.A02.A02(AnonymousClass9JN.UNENCRYPTED, A19, (byte[]) null, (byte[]) null);
    }

    public void CSM(File file) {
        if (file != null && file.isFile() && file.exists()) {
            FileInputStream A18 = C108945cZ.A18(file);
            try {
                AnonymousClass8BY.A1E(file, A18, this.A02);
                A18.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    public void close() {
        if (!this.A00) {
            this.A02.close();
            this.A01.close();
            this.A00 = true;
        }
    }
}
