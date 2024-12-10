package X;

import android.media.MediaCodecInfo;

public class CRy {
    public final int A00;
    public final MediaCodecInfo.CodecCapabilities A01;
    public final String A02;
    public final boolean A03;

    public CRy(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, int i, boolean z) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = codecCapabilities;
        this.A03 = z;
    }
}
