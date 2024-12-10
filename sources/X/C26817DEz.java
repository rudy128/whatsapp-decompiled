package X;

import android.media.CamcorderProfile;
import java.io.RandomAccessFile;

/* renamed from: X.DEz  reason: case insensitive filesystem */
public class C26817DEz implements C28553E7e {
    public final CZ3 A00;
    public final boolean A01;

    public C25815CmS COQ(CamcorderProfile camcorderProfile, C26225CvG cvG, String str, int i, int i2, boolean z, boolean z2) {
        CamcorderProfile camcorderProfile2 = camcorderProfile;
        int i3 = i2;
        this.A00.A01(camcorderProfile2, new RandomAccessFile(str, "rws").getFD(), i3, z2, this.A01);
        return C25693CkO.A00(camcorderProfile, new C25693CkO(str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i3, i));
    }

    public void COd() {
        this.A00.A00();
    }

    public C26817DEz(E1D e1d, boolean z) {
        this.A01 = z;
        this.A00 = new CZ3(e1d);
    }
}
