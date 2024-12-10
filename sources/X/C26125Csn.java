package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.Csn  reason: case insensitive filesystem */
public final class C26125Csn {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r9) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r2.isFeatureSupported("tunneled-playback") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return new X.C26125Csn(r2, r3, r10, false, r11, r12, r8, r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C26125Csn A00(android.media.MediaCodecInfo.CodecCapabilities r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13) {
        /*
            r2 = r8
            r3 = r9
            if (r8 == 0) goto L_0x0034
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r8.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0034
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 22
            if (r1 > r0) goto L_0x004c
            java.lang.String r0 = "ODROID-XU3"
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "Nexus 10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
        L_0x0024:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x004c
        L_0x0034:
            r8 = 0
            if (r2 == 0) goto L_0x0040
        L_0x0037:
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r2.isFeatureSupported(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            r5 = 0
            X.Csn r1 = new X.Csn
            r4 = r10
            r6 = r11
            r7 = r12
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x004c:
            r8 = 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26125Csn.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, boolean, boolean, boolean):X.Csn");
    }

    public boolean A03(int i, int i2, double d) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                obj = "sizeAndRate.vCaps";
            } else {
                if (Util.A00 >= 29) {
                    int A002 = C87.A00(videoCapabilities, d, i, i2);
                    if (A002 != 2) {
                        if (A002 == 1) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            BEA.A1P("sizeAndRate.cover, ", "x", A10, i, i2);
                            A10.append("@");
                            A10.append(d);
                            obj = A10.toString();
                        }
                    }
                    return true;
                }
                if (!A02(videoCapabilities, d, i, i2)) {
                    if (i < i2) {
                        String str = this.A02;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.A01)) && A02(videoCapabilities, d, i2, i)) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            BEA.A1P("sizeAndRate.rotated, ", "x", A102, i, i2);
                            A102.append("@");
                            A102.append(d);
                            String obj2 = A102.toString();
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("AssumedSupport [");
                            A103.append(obj2);
                            A103.append("] [");
                            AnonymousClass8BT.A1V(A103, str);
                            A103.append(this.A01);
                            A103.append("] [");
                            Log.d("MediaCodecInfo", BEA.A0m(Util.A02, A103));
                        }
                    }
                    StringBuilder A104 = AnonymousClass000.A10();
                    BEA.A1P("sizeAndRate.support, ", "x", A104, i, i2);
                    A104.append("@");
                    A104.append(d);
                    obj = A104.toString();
                }
                return true;
            }
        }
        A01(this, obj);
        return false;
    }

    public String toString() {
        return this.A02;
    }

    public C26125Csn(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C26056CrS.A01(str);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A06 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A03 = z4;
        this.A09 = z5;
        this.A07 = z6;
        this.A05 = BE8.A1Z(str2, "video");
    }

    public static void A01(C26125Csn csn, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoSupport [");
        A10.append(str);
        A10.append("] [");
        AnonymousClass8BT.A1V(A10, csn.A02);
        A10.append(csn.A01);
        A10.append("] [");
        Log.d("MediaCodecInfo", BEA.A0m(Util.A02, A10));
    }

    public static boolean A02(MediaCodecInfo.VideoCapabilities videoCapabilities, double d, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }
}
