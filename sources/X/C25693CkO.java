package X;

import android.media.CamcorderProfile;
import android.os.SystemClock;

/* renamed from: X.CkO  reason: case insensitive filesystem */
public final class C25693CkO {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;

    public static C25815CmS A00(CamcorderProfile camcorderProfile, C25693CkO ckO) {
        ckO.A01(C25815CmS.A0J, Integer.valueOf(camcorderProfile.audioCodec));
        ckO.A01(C25815CmS.A0R, Integer.valueOf(camcorderProfile.videoCodec));
        ckO.A01(C25815CmS.A0O, Long.valueOf(SystemClock.elapsedRealtime()));
        return new C25815CmS(ckO);
    }

    public void A01(CKP ckp, Object obj) {
        switch (ckp.A00) {
            case 7:
                this.A00 = AnonymousClass000.A0M(obj);
                return;
            case 8:
                this.A05 = AnonymousClass000.A0M(obj);
                return;
            case 9:
                this.A08 = (Integer) obj;
                return;
            case 10:
                this.A09 = (Integer) obj;
                return;
            case 11:
                this.A0A = (Integer) obj;
                return;
            case 12:
                this.A06 = C17880vN.A05(obj);
                return;
            default:
                this.A07 = C17880vN.A05(obj);
                return;
        }
    }

    public C25693CkO(String str, int i, int i2, int i3, int i4) {
        if (i == 0) {
            throw AnonymousClass000.A0k("Frame width must be greater 0");
        } else if (i2 != 0) {
            this.A0B = str;
            this.A03 = i;
            this.A02 = i2;
            this.A04 = i3;
            this.A01 = i4;
        } else {
            throw AnonymousClass000.A0k("Frame height must be greater 0");
        }
    }
}
