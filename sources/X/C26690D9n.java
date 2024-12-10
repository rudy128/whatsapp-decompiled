package X;

import android.net.Uri;
import com.whatsapp.media.WamediaManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: X.D9n  reason: case insensitive filesystem */
public class C26690D9n implements E9Q {
    public C1407372t A00;
    public FileInputStream A01;
    public boolean A02;
    public long A03 = 0;
    public final C28651ECk A04;
    public final File A05;
    public final WamediaManager A06;

    public void BBr(C28570E8b e8b) {
    }

    public Uri Bb3() {
        return this.A04.Bb3();
    }

    public long CAj(C26115Csd csd) {
        long j;
        C26115Csd csd2 = csd;
        long j2 = csd2.A03;
        this.A03 = j2;
        if (this.A02) {
            File file = this.A05;
            long length = file.length();
            if (this.A03 < length) {
                FileInputStream A18 = C108945cZ.A18(file);
                this.A01 = A18;
                A18.skip(this.A03);
                j = length - this.A03;
                Uri uri = csd2.A04;
                byte[] bArr = csd2.A08;
                csd2 = new C26115Csd(uri, new C25701CkW(), csd2.A06, bArr, csd2.A00, length, length, -1);
            }
            j = 0;
        } else {
            if (j2 != 0) {
                Uri uri2 = csd2.A04;
                byte[] bArr2 = csd2.A08;
                csd2 = new C26115Csd(uri2, new C25701CkW(), csd2.A06, bArr2, csd2.A00, 0, 0, -1);
            }
            j = 0;
        }
        long CAj = j + this.A04.CAj(csd2);
        if (CAj >= 0 && !this.A02) {
            this.A00 = new C1407372t(this.A06, this.A05, CAj);
        }
        return CAj;
    }

    public void close() {
        this.A04.close();
        FileInputStream fileInputStream = this.A01;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.A01 = null;
        }
        this.A03 = 0;
    }

    public int read(byte[] bArr, int i, int i2) {
        FileInputStream fileInputStream;
        if (this.A00 != null) {
            if (!this.A02) {
                byte[] bArr2 = new byte[256];
                File file = this.A05;
                FileOutputStream A19 = C108945cZ.A19(file);
                while (this.A00.A00 == 0) {
                    try {
                        A19.write(bArr2, 0, this.A04.read(bArr2, 0, 256));
                        A19.flush();
                        if (!this.A00.A02(file.length())) {
                            this.A02 = C17890vO.A1R(this.A00.A00);
                        }
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                        throw th;
                    }
                }
                if (this.A02) {
                    A19.close();
                } else {
                    throw C17880vN.A0f("Mp4StreamCheckedHeroDataSource/Mp4StreamCheck not successful");
                }
            }
            File file2 = this.A05;
            long length = file2.length();
            if (length <= 0) {
                throw C17880vN.A0f("Mp4StreamCheckedHeroDataSource/videoHeadForStreamCheck is empty");
            } else if (this.A03 < length) {
                FileInputStream fileInputStream2 = this.A01;
                if (fileInputStream2 == null) {
                    fileInputStream2 = C108945cZ.A18(file2);
                    this.A01 = fileInputStream2;
                }
                int read = fileInputStream2.read(bArr, i, i2);
                long j = this.A03 + ((long) read);
                this.A03 = j;
                if (j >= length && (fileInputStream = this.A01) != null) {
                    fileInputStream.close();
                    this.A01 = null;
                }
                return read;
            } else {
                int read2 = this.A04.read(bArr, i, i2);
                this.A03 += (long) read2;
                return read2;
            }
        } else {
            throw C17880vN.A0f("Mp4StreamCheckedHeroDataSource/Mp4StreamCheck not initialized");
        }
    }

    public C26690D9n(AnonymousClass118 r4, WamediaManager wamediaManager, String str) {
        this.A06 = wamediaManager;
        this.A04 = new BPL(new C24846CMp(), str, 8000);
        this.A05 = C17880vN.A0e(r4.A00.getExternalCacheDir(), C17890vO.A0Q());
    }
}
