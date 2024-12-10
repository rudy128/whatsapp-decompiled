package X;

import android.media.MediaCodecInfo;

/* renamed from: X.CRz  reason: case insensitive filesystem */
public class C24974CRz {
    public final int A00;
    public final MediaCodecInfo.VideoCapabilities A01;
    public final String A02;
    public final MediaCodecInfo.CodecProfileLevel[] A03;

    public C24974CRz(MediaCodecInfo.VideoCapabilities videoCapabilities, String str, MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = videoCapabilities;
        this.A03 = codecProfileLevelArr;
    }
}
