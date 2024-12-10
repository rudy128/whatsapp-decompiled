package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.2QQ  reason: invalid class name */
public class AnonymousClass2QQ extends FileInputStream {
    public long A00;
    public final /* synthetic */ AnonymousClass68R A01;
    public final /* synthetic */ AnonymousClass1SR A02;

    public int read(byte[] bArr, int i, int i2) {
        C18070vi.A0d(bArr, 0);
        while (getChannel().size() < this.A00 + ((long) i2) && (!this.A01.A02)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
                return 0;
            }
        }
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            this.A00 += (long) read;
        }
        return read;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2QQ(AnonymousClass68R r1, AnonymousClass1SR r2, File file) {
        super(file);
        this.A02 = r2;
        this.A01 = r1;
    }
}
