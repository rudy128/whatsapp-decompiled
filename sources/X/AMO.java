package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public class AMO implements BE2 {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ C167348fs A03;

    public AMO(C167348fs r8) {
        byte[] bArr;
        byte[] bArr2;
        this.A03 = r8;
        C17960vV.A0H(AnonymousClass000.A1W(r8.A00), "prefix has not been initialized");
        FileOutputStream A19 = C108945cZ.A19(r8.A03);
        this.A01 = A19;
        r8.A00.A01(A19);
        C20036A4f a4f = r8.A02;
        AnonymousClass9JN A0D = r8.A0D();
        C192169nv r3 = r8.A00;
        boolean z = r3 instanceof AnonymousClass8h3;
        if (z) {
            bArr = ((AnonymousClass8h3) r3).A02;
        } else {
            bArr = ((AnonymousClass8h5) r3).A03;
        }
        if (bArr != null) {
            if (z) {
                bArr2 = ((AnonymousClass8h3) r3).A01;
            } else {
                bArr2 = ((AnonymousClass8h5) r3).A02;
            }
            this.A02 = a4f.A02(A0D, A19, bArr, bArr2);
            return;
        }
        throw AnonymousClass000.A0n("backup-prefix/get-key/key is null");
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
