package X;

import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ClM  reason: case insensitive filesystem */
public class C25752ClM {
    public static final RectF A0L = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public int A00;
    public int A01 = 30;
    public int A02 = 10;
    public int A03 = -1;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public RectF A0C = A0L;
    public C24802CKv A0D;
    public C25185Cab A0E;
    public Integer A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;

    public int A00() {
        C26294Cx6.A02(this.A0E, "MediaTranscodeParams", "transcode profile level: %s");
        C25185Cab cab = this.A0E;
        if (cab != null) {
            C24354Bzp bzp = C24354Bzp.CODEC_VIDEO_HEVC;
            C24354Bzp bzp2 = cab.A02;
            if (bzp.equals(bzp2) || 1 != cab.A01 || !C24354Bzp.CODEC_VIDEO_H264.equals(bzp2)) {
                int i = this.A03;
                if (i == -1) {
                    int i2 = this.A00;
                    i = BE8.A06((int) (((double) i2) * 0.85d), 655000, i2);
                    this.A03 = i;
                }
                C26294Cx6.A02(Integer.valueOf(i), "MediaTranscodeParams", "using main/high bitrate: %s");
                return this.A03;
            }
        }
        C26294Cx6.A02(Integer.valueOf(this.A00), "MediaTranscodeParams", "using baseline bitrate: %s");
        return this.A00;
    }

    public String toString() {
        int i;
        Integer valueOf;
        HashMap A11 = C17880vN.A11();
        A11.put("sourceWidth", Integer.valueOf(this.A07));
        A11.put("sourceHeight", Integer.valueOf(this.A05));
        A11.put("sourceRotationDegreesClockwise", Integer.valueOf(this.A06));
        A11.put("targetWidth", Integer.valueOf(this.A0A));
        A11.put("targetHeight", Integer.valueOf(this.A08));
        A11.put("outputAspectRatio", BE7.A0W());
        A11.put("shouldRetainAspectRatio", Boolean.valueOf(this.A0K));
        A11.put("targetRotationDegreesClockwise", Integer.valueOf(this.A09));
        A11.put("outputRotationDegreesClockwise", Integer.valueOf(this.A04));
        A11.put("cropRectangle", this.A0C);
        Integer num = this.A0F;
        if (num == null) {
            valueOf = null;
        } else {
            if (1 - num.intValue() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            valueOf = Integer.valueOf(i);
        }
        A11.put("videoMirroringMode", valueOf);
        A11.put("baselineBitRate", Integer.valueOf(this.A00));
        A11.put("mainHighBitRate", Integer.valueOf(this.A03));
        A11.put("frameRate", Integer.valueOf(this.A01));
        A11.put("iframeinterval", Integer.valueOf(this.A02));
        A11.put("videoBitrateMode", Integer.valueOf(this.A0B));
        A11.put("videoTranscodeProfileLevelParams", this.A0E);
        A11.put("glRenderers", this.A0H);
        A11.put("debugStats", this.A0G);
        A11.put("forceAvcEncoding", Boolean.valueOf(this.A0I));
        return C26171Ctn.A01(C25752ClM.class, A11);
    }
}
