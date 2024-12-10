package X;

import android.media.CamcorderProfile;
import android.view.Surface;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DF0 implements C28553E7e {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public C26225CvG A05;
    public RandomAccessFile A06;
    public final CJV A07;
    public final E1D A08;
    public final CZ3 A09;

    public void COd() {
        RuntimeException runtimeException;
        try {
            this.A09.A00();
            C22811BPz bPz = this.A07.A00;
            C25742ClC clC = bPz.A01;
            if (clC != null) {
                bPz.A00.CEv(clC);
                bPz.A01 = null;
            }
            this.A05 = null;
            Surface surface = this.A04;
            if (surface != null) {
                surface.release();
                this.A04 = null;
            }
            RandomAccessFile randomAccessFile = this.A06;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A06 = null;
                return;
            }
            return;
        } catch (RuntimeException e) {
            runtimeException = AnonymousClass8BR.A0x(e);
        } catch (Exception e2) {
            runtimeException = AnonymousClass8BR.A0x(e2);
        } catch (Throwable th) {
            this.A05 = null;
            Surface surface2 = this.A04;
            if (surface2 != null) {
                surface2.release();
                this.A04 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A06;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A06 = null;
            }
            throw th;
        }
        throw runtimeException;
    }

    public C25815CmS COQ(CamcorderProfile camcorderProfile, C26225CvG cvG, String str, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        this.A05 = cvG;
        CZ3 cz3 = this.A09;
        CamcorderProfile camcorderProfile2 = camcorderProfile;
        if (!cz3.A04) {
            boolean z3 = true;
            if (i7 == 90 || i7 == 270) {
                i3 = camcorderProfile2.videoFrameHeight;
                i4 = camcorderProfile2.videoFrameWidth;
            } else {
                i3 = camcorderProfile2.videoFrameWidth;
                i4 = camcorderProfile2.videoFrameHeight;
            }
            int i8 = this.A02 + this.A00;
            if (i8 % 180 != 0) {
                i5 = this.A01;
                i6 = this.A03;
            } else {
                i5 = this.A03;
                i6 = this.A01;
            }
            float f = (float) i3;
            float f2 = (float) i4;
            float f3 = ((float) i5) / ((float) i6);
            if (f / f2 > f3) {
                i3 = (int) (f2 * f3);
            } else {
                i4 = (int) (f / f3);
            }
            int i9 = i3 - (i3 % 16);
            int i10 = i4 - (i4 % 16);
            i7 = i8 % 360;
            int i11 = i10;
            if (i7 % 180 == 0) {
                z3 = false;
                i11 = i9;
            }
            camcorderProfile2.videoFrameWidth = i11;
            if (!z3) {
                i9 = i10;
            }
            camcorderProfile2.videoFrameHeight = i9;
        }
        String str2 = str;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "rws");
        this.A06 = randomAccessFile;
        cz3.A01(camcorderProfile2, randomAccessFile.getFD(), i7, z2, z);
        return C25693CkO.A00(camcorderProfile2, new C25693CkO(str2, camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight, i7, i));
    }

    public DF0(CJV cjv) {
        DEO deo = new DEO(this, 2);
        this.A08 = deo;
        this.A09 = new CZ3(deo);
        this.A07 = cjv;
    }
}
