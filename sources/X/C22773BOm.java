package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.android.exoplayer2.util.Util;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.List;
import java.util.concurrent.BlockingDeque;

/* renamed from: X.BOm  reason: case insensitive filesystem */
public class C22773BOm extends C22775BOo {
    public static boolean A0o;
    public static boolean A0p;
    public static final int[] A0q = {1920, 1600, 1440, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public MediaFormat A0M;
    public Surface A0N;
    public Surface A0O;
    public CPH A0P;
    public C25044CUy A0Q;
    public C24796CKp A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int A0b;
    public int A0c;
    public long A0d;
    public Object A0e;
    public final int A0f;
    public final int A0g;
    public final long A0h;
    public final Context A0i;
    public final C25961CpT A0j;
    public final C24847CMq A0k;
    public final boolean A0l;
    public final long[] A0m;
    public final long[] A0n;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        return (r5 * 3) / (r2 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.String r4, int r5, int r6) {
        /*
            r3 = -1
            if (r5 == r3) goto L_0x000d
            if (r6 == r3) goto L_0x000d
            int r0 = r4.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L_0x000e;
                case -1662541442: goto L_0x0011;
                case 1187890754: goto L_0x0014;
                case 1331836730: goto L_0x0017;
                case 1599127256: goto L_0x003b;
                case 1599127257: goto L_0x0046;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.String r0 = "video/3gpp"
            goto L_0x003d
        L_0x0011:
            java.lang.String r0 = "video/hevc"
            goto L_0x0048
        L_0x0014:
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x003d
        L_0x0017:
            java.lang.String r0 = "video/avc"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = "BRAVIA 4K 2015"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x000d
            r2 = 16
            int r0 = r5 + 16
            int r1 = r0 + -1
            int r1 = r1 / r2
            int r0 = r6 + 16
            int r0 = r0 + -1
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r5 = r0 * 16
            goto L_0x0044
        L_0x003b:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
        L_0x003d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
        L_0x0044:
            r2 = 2
            goto L_0x004f
        L_0x0046:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0048:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
        L_0x004f:
            int r1 = r5 * 3
            int r0 = r2 * 2
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22773BOm.A01(java.lang.String, int, int):int");
    }

    public static void A03(C22773BOm bOm) {
        C28610EAe eAe;
        bOm.A0Y = false;
        if (Util.A00 >= 23 && bOm.A0Z && (eAe = bOm.A0C) != null) {
            bOm.A0Q = new C25044CUy(eAe, bOm);
        }
    }

    public void A0H() {
        this.A05 = -1;
        this.A04 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0L = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A09 = 0;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
        A03(this);
        C25961CpT cpT = this.A0j;
        if (cpT.A09 != null) {
            C26356CyI cyI = cpT.A0A;
            if (cyI != null) {
                cyI.A00.unregisterDisplayListener(cyI);
            }
            cpT.A0B.A02.sendEmptyMessage(2);
        }
        this.A0Q = null;
        this.A0Z = false;
        this.A07 = 0;
        this.A08 = 0;
        try {
            super.A0H();
            synchronized (this.A09) {
            }
            C24847CMq cMq = this.A0k;
            CU1 cu1 = this.A09;
            synchronized (cu1) {
            }
            Handler handler = cMq.A00;
            if (handler != null) {
                BE7.A19(handler, cMq, cu1, 47);
            }
        } catch (Throwable th) {
            synchronized (this.A09) {
                C24847CMq cMq2 = this.A0k;
                CU1 cu12 = this.A09;
                synchronized (cu12) {
                    Handler handler2 = cMq2.A00;
                    if (handler2 != null) {
                        BE7.A19(handler2, cMq2, cu12, 47);
                    }
                    throw th;
                }
            }
        }
    }

    public void A0O() {
        try {
            super.A0O();
        } finally {
            this.A03 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                if (this.A0O == surface) {
                    this.A0O = null;
                }
                surface.release();
                this.A0N = null;
            }
        }
    }

    public static int A00(D48 d48) {
        int i = d48.A0A;
        if (i != -1) {
            List list = d48.A0T;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return i + i2;
        }
        return A01(d48.A0S, d48.A0I, d48.A09);
    }

    public static void A04(C22773BOm bOm) {
        int i = bOm.A06;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - bOm.A0F;
            C24847CMq cMq = bOm.A0k;
            Handler handler = cMq.A00;
            if (handler != null) {
                handler.post(new AnonymousClass3C2(cMq, i, 0, j));
            }
            bOm.A06 = 0;
            bOm.A0F = elapsedRealtime;
        }
    }

    public static void A05(C22773BOm bOm) {
        int i = bOm.A0D;
        if (i != -1 || bOm.A0B != -1) {
            C24847CMq cMq = bOm.A0k;
            int i2 = bOm.A0B;
            int i3 = bOm.A0C;
            float f = bOm.A02;
            Handler handler = cMq.A00;
            if (handler != null) {
                handler.post(new AnonymousClass7Q4(cMq, f, i, i2, i3, 0));
            }
        }
    }

    public static boolean A06(D48 d48, D48 d482, boolean z) {
        if (!d48.A0S.equals(d482.A0S) || d48.A0E != d482.A0E || ((!z && (d48.A0I != d482.A0I || d48.A09 != d482.A09)) || !Util.A0D(d48.A0N, d482.A0N))) {
            return false;
        }
        return true;
    }

    public static boolean A07(C26125Csn csn, C22773BOm bOm) {
        if (Util.A00 < 23 || !bOm.A0W || bOm.A0Z || bOm.A0W(csn.A02)) {
            return false;
        }
        if (!csn.A07 || BHD.A02(bOm.A0i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01a5, code lost:
        if (r1 < 800000) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010a, code lost:
        if (r0.length <= 0) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0K(X.D48 r14, X.EBU r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x0013
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "video/av01"
            java.lang.String r0 = r14.A0S
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0013
            r6 = 20
        L_0x0012:
            return r6
        L_0x0013:
            boolean r1 = r13.A0V
            boolean r2 = r13.A0Q
            java.lang.String r10 = r14.A0S
            java.lang.String r0 = "video"
            boolean r0 = X.BE8.A1Z(r10, r0)
            r8 = 0
            if (r0 != 0) goto L_0x0024
            r6 = 0
            return r6
        L_0x0024:
            X.DUU r0 = r14.A0L
            r6 = 1
            boolean r5 = X.AnonymousClass000.A1W(r0)
            java.util.List r3 = r15.BQL(r10, r5)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x005a
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r0 = X.C26283Cwe.A01(r14)
            if (r0 == 0) goto L_0x005a
            java.util.List r4 = r15.BQL(r0, r8)
            int r2 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r2 < r0) goto L_0x005a
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x005a
            r3 = r4
        L_0x005a:
            if (r5 == 0) goto L_0x006e
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x006e
            java.util.List r0 = r15.BQL(r10, r8)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0012
            r6 = 2
            return r6
        L_0x006e:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0077
            r6 = 129(0x81, float:1.81E-43)
            return r6
        L_0x0077:
            int r2 = r14.A06
            if (r2 == 0) goto L_0x0081
            r0 = 2
            if (r2 == r0) goto L_0x0081
            r6 = 130(0x82, float:1.82E-43)
            return r6
        L_0x0081:
            java.lang.Object r9 = r3.get(r8)
            X.Csn r9 = (X.C26125Csn) r9
            java.lang.String r7 = r14.A0O
            if (r7 == 0) goto L_0x00ec
            java.lang.String r12 = r9.A01
            if (r12 == 0) goto L_0x00ec
            java.lang.String r5 = X.C26233CvQ.A03(r7)
            if (r5 == 0) goto L_0x00ec
            boolean r0 = r12.equals(r5)
            java.lang.String r4 = ", "
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "codec.mime "
        L_0x00a3:
            X.C17890vO.A10(r0, r7, r4, r1)
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r1)
            X.C26125Csn.A01(r9, r0)
            r4 = 0
        L_0x00ae:
            boolean r0 = r9.A03
            r1 = 8
            if (r0 == 0) goto L_0x00b6
            r1 = 16
        L_0x00b6:
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x00bc
            r8 = 32
        L_0x00bc:
            r6 = 3
            if (r4 == 0) goto L_0x00c0
            r6 = 4
        L_0x00c0:
            r1 = r1 | r8
            r6 = r6 | r1
            return r6
        L_0x00c3:
            android.util.Pair r0 = X.C26283Cwe.A00(r14)
            if (r0 == 0) goto L_0x00ec
            int r3 = X.C108965cb.A01(r0)
            int r2 = X.C108965cb.A00(r0)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = "video/avc"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01a9
            r3 = 8
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x00fd
            r0 = 42
            if (r3 == r0) goto L_0x00fd
        L_0x00ec:
            r4 = 1
            int r3 = r14.A0I
            if (r3 <= 0) goto L_0x00ae
            int r2 = r14.A09
            if (r2 <= 0) goto L_0x00ae
            float r0 = r14.A01
            double r0 = (double) r0
            boolean r4 = r9.A03(r3, r2, r0)
            goto L_0x00ae
        L_0x00fd:
            if (r1 == 0) goto L_0x010d
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.A00
            if (r0 == 0) goto L_0x0107
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x0109
        L_0x0107:
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r8]
        L_0x0109:
            int r0 = r0.length
            if (r0 > 0) goto L_0x010d
            goto L_0x00ec
        L_0x010d:
            android.media.MediaCodecInfo$CodecCapabilities r1 = r9.A00
            if (r1 == 0) goto L_0x0115
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = r1.profileLevels
            if (r11 != 0) goto L_0x0117
        L_0x0115:
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = new android.media.MediaCodecInfo.CodecProfileLevel[r8]
        L_0x0117:
            int r10 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            if (r10 > r0) goto L_0x0150
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0150
            int r0 = r11.length
            if (r0 != 0) goto L_0x0150
            if (r1 == 0) goto L_0x01a7
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x01a7
            android.util.Range r0 = r0.getBitrateRange()
            java.lang.Comparable r0 = r0.getUpper()
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r1 < r0) goto L_0x0162
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0143:
            android.media.MediaCodecInfo$CodecProfileLevel r0 = new android.media.MediaCodecInfo$CodecProfileLevel
            r0.<init>()
            r0.profile = r6
            r0.level = r10
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
            r11[r8] = r0
        L_0x0150:
            int r10 = r11.length
            r6 = 0
        L_0x0152:
            if (r6 >= r10) goto L_0x01b4
            r1 = r11[r6]
            int r0 = r1.profile
            if (r0 != r3) goto L_0x015f
            int r0 = r1.level
            if (r0 < r2) goto L_0x015f
            goto L_0x00ec
        L_0x015f:
            int r6 = r6 + 1
            goto L_0x0152
        L_0x0162:
            r0 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r1 < r0) goto L_0x016a
            r10 = 512(0x200, float:7.175E-43)
            goto L_0x0143
        L_0x016a:
            r0 = 60000000(0x3938700, float:8.670878E-37)
            if (r1 < r0) goto L_0x0172
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0143
        L_0x0172:
            r0 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r1 < r0) goto L_0x017a
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x0143
        L_0x017a:
            r0 = 18000000(0x112a880, float:2.6936858E-38)
            if (r1 < r0) goto L_0x0182
            r10 = 64
            goto L_0x0143
        L_0x0182:
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x018a
            r10 = 32
            goto L_0x0143
        L_0x018a:
            r0 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r1 < r0) goto L_0x0192
            r10 = 16
            goto L_0x0143
        L_0x0192:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            if (r1 < r0) goto L_0x019a
            r10 = 8
            goto L_0x0143
        L_0x019a:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 < r0) goto L_0x01a1
            r10 = 4
            goto L_0x0143
        L_0x01a1:
            r0 = 800000(0xc3500, float:1.121039E-39)
            r10 = 2
            if (r1 >= r0) goto L_0x0143
        L_0x01a7:
            r10 = 1
            goto L_0x0143
        L_0x01a9:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e4
            r3 = 2
            goto L_0x00e3
        L_0x01b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "codec.profileLevel, "
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22773BOm.A0K(X.D48, X.EBU):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r13.A09 == -1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(android.media.MediaCrypto r24, X.D48 r25, X.C28610EAe r26, X.C26125Csn r27) {
        /*
            r23 = this;
            r8 = r23
            X.D48[] r12 = r8.A0A
            X.C26056CrS.A01(r12)
            r10 = r25
            int r7 = r10.A0I
            r22 = r7
            r21 = r7
            int r6 = r10.A09
            r20 = r6
            int r5 = A00(r10)
            int r11 = r12.length
            r0 = 1
            r9 = r27
            if (r11 == r0) goto L_0x00ee
            r4 = 0
            r14 = 0
        L_0x001f:
            if (r4 >= r11) goto L_0x004c
            r13 = r12[r4]
            boolean r0 = r9.A03
            boolean r0 = A06(r10, r13, r0)
            if (r0 == 0) goto L_0x0049
            int r3 = r13.A0I
            r2 = -1
            if (r3 == r2) goto L_0x0035
            int r1 = r13.A09
            r0 = 0
            if (r1 != r2) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r14 = r14 | r0
            int r7 = java.lang.Math.max(r7, r3)
            int r0 = r13.A09
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = A00(r13)
            int r5 = java.lang.Math.max(r5, r0)
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x004c:
            if (r14 == 0) goto L_0x00ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Resolutions unknown. Codec max resolution: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r4 = "x"
            java.lang.String r0 = X.AnonymousClass001.A1I(r4, r1, r6)
            java.lang.String r3 = "MediaCodecVideoRenderer"
            android.util.Log.w(r3, r0)
            r19 = r22
            r2 = 0
            r1 = r20
            r0 = r22
            if (r1 <= r0) goto L_0x01ef
            r18 = 1
            r21 = r1
        L_0x0072:
            r0 = r19
            float r12 = (float) r0
            r0 = r21
            float r0 = (float) r0
            float r12 = r12 / r0
            int[] r17 = A0q
            r13 = 9
        L_0x007d:
            r11 = 0
            if (r2 >= r13) goto L_0x00ee
            r16 = r17[r2]
            r0 = r16
            float r0 = (float) r0
            float r0 = r0 * r12
            int r14 = (int) r0
            r1 = r16
            r0 = r21
            if (r1 <= r0) goto L_0x00ee
            r0 = r19
            if (r14 <= r0) goto L_0x00ee
            r15 = r14
            if (r18 != 0) goto L_0x0097
            r15 = r1
            r16 = r14
        L_0x0097:
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.A00
            if (r0 == 0) goto L_0x00b9
            android.media.MediaCodecInfo$VideoCapabilities r1 = r0.getVideoCapabilities()
            if (r1 == 0) goto L_0x00b9
            int r0 = r1.getWidthAlignment()
            int r11 = r1.getHeightAlignment()
            int r15 = r15 + r0
            int r1 = r15 + -1
            int r1 = r1 / r0
            int r1 = r1 * r0
            int r16 = r16 + r11
            int r0 = r16 + -1
            int r0 = r0 / r11
            int r0 = r0 * r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r1, r0)
        L_0x00b9:
            float r1 = r10.A01
            int r0 = r11.x
            r15 = r0
            int r0 = r11.y
            r14 = r0
            double r0 = (double) r1
            boolean r0 = r9.A03(r15, r14, r0)
            if (r0 == 0) goto L_0x01eb
            int r0 = r11.x
            int r7 = java.lang.Math.max(r7, r0)
            int r0 = r11.y
            int r6 = java.lang.Math.max(r6, r0)
            java.lang.String r0 = r10.A0S
            int r0 = A01(r0, r7, r6)
            int r5 = java.lang.Math.max(r5, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Codec max resolution adjusted to: "
            X.BEA.A1P(r0, r4, r1, r7, r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
        L_0x00ee:
            X.CPH r11 = new X.CPH
            r11.<init>(r7, r6, r5)
            r8.A0P = r11
            boolean r5 = r8.A0l
            int r4 = r8.A0c
            android.media.MediaFormat r2 = new android.media.MediaFormat
            r2.<init>()
            java.lang.String r1 = "mime"
            java.lang.String r0 = r10.A0S
            r2.setString(r1, r0)
            java.lang.String r1 = "width"
            r0 = r22
            r2.setInteger(r1, r0)
            java.lang.String r1 = "height"
            r0 = r20
            r2.setInteger(r1, r0)
            java.util.List r0 = r10.A0T
            X.C89.A00(r2, r0)
            java.lang.String r3 = "frame-rate"
            float r1 = r10.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            r2.setFloat(r3, r1)
        L_0x0125:
            java.lang.String r3 = "rotation-degrees"
            int r1 = r10.A0E
            r0 = -1
            if (r1 == r0) goto L_0x012f
            r2.setInteger(r3, r1)
        L_0x012f:
            X.D3h r6 = r10.A0N
            if (r6 == 0) goto L_0x015c
            java.lang.String r1 = "color-transfer"
            int r0 = r6.A03
            r3 = -1
            if (r0 == r3) goto L_0x013d
            r2.setInteger(r1, r0)
        L_0x013d:
            java.lang.String r1 = "color-standard"
            int r0 = r6.A02
            if (r0 == r3) goto L_0x0146
            r2.setInteger(r1, r0)
        L_0x0146:
            java.lang.String r1 = "color-range"
            int r0 = r6.A01
            if (r0 == r3) goto L_0x014f
            r2.setInteger(r1, r0)
        L_0x014f:
            java.lang.String r1 = "hdr-static-info"
            byte[] r0 = r6.A04
            if (r0 == 0) goto L_0x015c
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r2.setByteBuffer(r1, r0)
        L_0x015c:
            java.lang.String r1 = "max-width"
            int r0 = r11.A02
            r2.setInteger(r1, r0)
            java.lang.String r1 = "max-height"
            int r0 = r11.A00
            r2.setInteger(r1, r0)
            java.lang.String r3 = "max-input-size"
            int r1 = r11.A01
            r0 = -1
            if (r1 == r0) goto L_0x0174
            r2.setInteger(r3, r1)
        L_0x0174:
            int r3 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            r1 = 0
            if (r3 < r0) goto L_0x0180
            java.lang.String r0 = "priority"
            r2.setInteger(r0, r1)
        L_0x0180:
            if (r5 == 0) goto L_0x0187
            java.lang.String r0 = "auto-frc"
            r2.setInteger(r0, r1)
        L_0x0187:
            if (r4 == 0) goto L_0x0194
            java.lang.String r1 = "tunneled-playback"
            r0 = 1
            r2.setFeatureEnabled(r1, r0)
            java.lang.String r0 = "audio-session-id"
            r2.setInteger(r0, r4)
        L_0x0194:
            android.view.Surface r0 = r8.A0O
            if (r0 != 0) goto L_0x01af
            boolean r0 = A07(r9, r8)
            X.C26056CrS.A03(r0)
            android.view.Surface r0 = r8.A0N
            if (r0 != 0) goto L_0x01ad
            android.content.Context r1 = r8.A0i
            boolean r0 = r9.A07
            X.BHD r0 = X.BHD.A01(r1, r0)
            r8.A0N = r0
        L_0x01ad:
            r8.A0O = r0
        L_0x01af:
            r0 = 30
            if (r3 >= r0) goto L_0x01b9
            X.Cj6 r0 = r8.A0g
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x01d2
        L_0x01b9:
            X.Cj6 r0 = r8.A0g
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x01d2
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.A00
            if (r0 == 0) goto L_0x01d2
            java.lang.String r1 = "low-latency"
            boolean r0 = r0.isFeatureSupported(r1)
            if (r0 == 0) goto L_0x01d2
            r0 = 1
            r2.setFeatureEnabled(r1, r0)
            r2.setInteger(r1, r0)
        L_0x01d2:
            android.view.Surface r0 = r8.A0O
            r4 = r24
            r1 = r26
            r1.BFa(r4, r2, r0)
            r0 = 23
            if (r3 < r0) goto L_0x01ea
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x01ea
            X.CUy r0 = new X.CUy
            r0.<init>(r1, r8)
            r8.A0Q = r0
        L_0x01ea:
            return
        L_0x01eb:
            int r2 = r2 + 1
            goto L_0x007d
        L_0x01ef:
            r18 = 0
            r19 = r1
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22773BOm.A0Q(android.media.MediaCrypto, X.D48, X.EAe, X.Csn):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ce, code lost:
        if (java.lang.Math.abs((r6 - r11.A05) - (r9 - r11.A04)) > 20000000) goto L_0x01d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(X.C28610EAe r37, java.nio.ByteBuffer r38, int r39, int r40, long r41, long r43, long r45, boolean r47) {
        /*
            r36 = this;
            r8 = r36
            long r2 = r8.A0d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r14 = r41
            if (r4 != 0) goto L_0x0012
            r8.A0d = r14
            r2 = r14
        L_0x0012:
            long r4 = r8.A0L
            r12 = r45
            long r32 = r45 - r4
            r28 = 1
            r30 = r37
            r31 = r39
            if (r47 == 0) goto L_0x003a
            java.lang.String r2 = "skipVideoBuffer"
            X.C25304Cd8.A01(r2)
            r3 = r30
            r2 = r31
            r3.CEK(r2)
            X.C25304Cd8.A00()
            X.CU1 r3 = r8.A09
            int r2 = r3.A09
            int r2 = r2 + 1
            r3.A09 = r2
        L_0x0037:
            r8.A0G = r0
            return r28
        L_0x003a:
            long r26 = r45 - r41
            android.view.Surface r1 = r8.A0O
            android.view.Surface r0 = r8.A0N
            r25 = 0
            if (r1 != r0) goto L_0x0067
            r1 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0142
            java.lang.String r0 = "skipVideoBuffer"
            X.C25304Cd8.A01(r0)
            r1 = r30
            r0 = r31
            r1.CEK(r0)
            X.C25304Cd8.A00()
            X.CU1 r1 = r8.A09
            int r0 = r1.A09
            int r0 = r0 + 1
            r1.A09 = r0
        L_0x0061:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0037
        L_0x0067:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r23 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r23
            int r1 = r8.A01
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            boolean r0 = r8.A0Y
            if (r0 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x0142
            long r0 = r8.A0J
            long r6 = r9 - r0
            r4 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            r4 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
        L_0x008d:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ef
        L_0x0094:
            int r0 = (r41 > r2 ? 1 : (r41 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0142
            long r9 = r9 - r43
            long r6 = r26 - r9
            long r21 = java.lang.System.nanoTime()
            long r6 = r6 * r23
            long r6 = r6 + r21
            X.CpT r11 = r8.A0j
            long r9 = r23 * r45
            boolean r4 = r11.A08
            if (r4 == 0) goto L_0x01d5
            long r0 = r11.A02
            int r2 = (r45 > r0 ? 1 : (r45 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00bd
            long r0 = r11.A01
            r2 = 1
            long r0 = r0 + r2
            r11.A01 = r0
            long r0 = r11.A03
            r11.A00 = r0
        L_0x00bd:
            long r0 = r11.A01
            r16 = 6
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x01bb
            long r4 = r11.A04
            long r16 = r9 - r4
            long r16 = r16 / r0
            long r2 = r11.A00
            long r2 = r2 + r16
            long r18 = r2 - r4
            long r0 = r11.A05
            long r16 = r6 - r0
            long r16 = r16 - r18
            long r19 = java.lang.Math.abs(r16)
            r17 = 20000000(0x1312d00, double:9.881313E-317)
            int r16 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r16 > 0) goto L_0x01d0
            long r0 = r0 + r2
            long r6 = r0 - r4
        L_0x00e5:
            r11.A02 = r12
            r11.A03 = r2
            X.Cyi r3 = r11.A0B
            if (r3 == 0) goto L_0x0117
            long r0 = r11.A06
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0117
            long r2 = r3.A04
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0117
            long r0 = r11.A06
            long r4 = r6 - r2
            long r4 = r4 / r0
            long r4 = r4 * r0
            long r2 = r2 + r4
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x01b6
            long r9 = r2 - r0
        L_0x010b:
            long r4 = r2 - r6
            long r6 = r6 - r9
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0113
            r2 = r9
        L_0x0113:
            long r0 = r11.A07
            long r2 = r2 - r0
            r6 = r2
        L_0x0117:
            long r9 = r6 - r21
            long r9 = r9 / r23
            r1 = -500000(0xfffffffffff85ee0, double:NaN)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0143
            X.E90 r4 = r8.A06
            X.C26056CrS.A01(r4)
            long r2 = r8.A03
            long r0 = r41 - r2
            int r2 = r4.CNQ(r0)
            if (r2 == 0) goto L_0x0143
            X.CU1 r1 = r8.A09
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            int r0 = r8.A03
            int r0 = r0 + r2
            r8.A0U(r0)
            r8.A0N()
        L_0x0142:
            return r25
        L_0x0143:
            r1 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x015e
            java.lang.String r0 = "dropVideoBuffer"
            X.C25304Cd8.A01(r0)
            r1 = r30
            r0 = r31
            r1.CEK(r0)
            X.C25304Cd8.A00()
            r0 = r28
            r8.A0U(r0)
            return r28
        L_0x015e:
            r1 = 50000(0xc350, double:2.47033E-319)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0167
            goto L_0x01e6
        L_0x0167:
            X.D48 r0 = r8.A08
            float r11 = r0.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0173
            r11 = 1106247680(0x41f00000, float:30.0)
        L_0x0173:
            java.util.UUID r0 = X.C24736CHy.A04
            long r0 = com.facebook.android.exoplayer2.util.Util.A05(r14)
            int r10 = (int) r0
            long r0 = com.facebook.android.exoplayer2.util.Util.A05(r26)
            int r9 = (int) r0
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r9 <= r3) goto L_0x0142
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r9 >= r0) goto L_0x0142
            int r7 = r10 + r9
            int r2 = r8.A07
            int r0 = r8.A08
            int r1 = r2 + r0
            int r0 = r1 + r3
            if (r7 <= r0) goto L_0x0142
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r10 <= r2) goto L_0x01ae
            if (r10 >= r1) goto L_0x01ae
            X.CU1 r4 = r8.A09
            int r3 = r4.A0A
            int r7 = r7 - r1
            float r0 = (float) r7
        L_0x01a2:
            float r0 = r0 * r11
            double r1 = (double) r0
            double r1 = r1 / r5
            int r0 = (int) r1
            int r3 = r3 + r0
            r4.A0A = r3
        L_0x01a9:
            r8.A07 = r10
            r8.A08 = r9
            return r25
        L_0x01ae:
            if (r10 <= r1) goto L_0x01a9
            X.CU1 r4 = r8.A09
            int r3 = r4.A0A
            float r0 = (float) r9
            goto L_0x01a2
        L_0x01b6:
            long r0 = r0 + r2
            r9 = r2
            r2 = r0
            goto L_0x010b
        L_0x01bb:
            long r0 = r11.A04
            long r16 = r9 - r0
            long r0 = r11.A05
            long r2 = r6 - r0
            long r2 = r2 - r16
            long r16 = java.lang.Math.abs(r2)
            r1 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d5
        L_0x01d0:
            r0 = r25
            r11.A08 = r0
            r4 = 0
        L_0x01d5:
            r2 = r9
            if (r4 != 0) goto L_0x00e5
            r11.A04 = r9
            r11.A05 = r6
            r0 = 0
            r11.A01 = r0
            r0 = r28
            r11.A08 = r0
            goto L_0x00e5
        L_0x01e6:
            r29 = r8
            r34 = r6
            r29.A0V(r30, r31, r32, r34)     // Catch:{ IllegalStateException -> 0x01fa }
            goto L_0x0061
        L_0x01ef:
            long r34 = java.lang.System.nanoTime()     // Catch:{ IllegalStateException -> 0x01fa }
            r29 = r8
            r29.A0V(r30, r31, r32, r34)     // Catch:{ IllegalStateException -> 0x01fa }
            goto L_0x0037
        L_0x01fa:
            r11 = move-exception
            int r1 = r8.A0g
            r7 = 0
            if (r1 <= 0) goto L_0x0229
            long r5 = r8.A0G
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0214
            long r3 = X.AnonymousClass8BR.A04(r5)
            long r1 = (long) r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0215
        L_0x0214:
            r7 = 1
        L_0x0215:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0226
            java.lang.String r1 = "MediaCodecVideoRenderer"
            java.lang.String r0 = "Render output failed"
            android.util.Log.w(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r8.A0G = r0
        L_0x0226:
            if (r7 == 0) goto L_0x0229
            return r25
        L_0x0229:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22773BOm.A0S(X.EAe, java.nio.ByteBuffer, int, int, long, long, long, boolean):boolean");
    }

    public void A0T() {
        if (!this.A0Y) {
            this.A0Y = true;
            C24847CMq cMq = this.A0k;
            Surface surface = this.A0O;
            Handler handler = cMq.A00;
            if (handler != null) {
                BE7.A19(handler, cMq, surface, 44);
            }
        }
    }

    public void A0U(int i) {
        CU1 cu1 = this.A09;
        cu1.A03 += i;
        int i2 = this.A06 + i;
        this.A06 = i2;
        int i3 = this.A0b + i;
        this.A0b = i3;
        cu1.A05 = Math.max(i3, cu1.A05);
        if (i2 >= this.A0f) {
            A04(this);
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.C5d, java.lang.Object] */
    public void A0V(C28610EAe eAe, int i, long j, long j2) {
        int i2;
        C25483Cge cge;
        int i3 = this.A05;
        if (!((i3 == -1 && this.A04 == -1) || (this.A0D == i3 && this.A0B == this.A04 && this.A0C == 0 && this.A02 == this.A00))) {
            C24847CMq cMq = this.A0k;
            int i4 = this.A04;
            float f = this.A00;
            Handler handler = cMq.A00;
            if (handler != null) {
                handler.post(new AnonymousClass7Q4(cMq, f, i3, i4, 0, 0));
            }
            this.A0D = this.A05;
            this.A0B = this.A04;
            this.A0C = 0;
            this.A02 = this.A00;
        }
        C24796CKp cKp = this.A0R;
        if (cKp != null) {
            C26205Cuc cuc = cKp.A00;
            if (!(cuc.A09 == null || !cuc.A0Q || (cge = cuc.A07) == null)) {
                long A042 = C17880vN.A04(j);
                long currentTimeMillis = System.currentTimeMillis();
                ? obj = new Object();
                long j3 = A042 * 100;
                obj.A03 = j3;
                obj.A01 = j3;
                obj.A02 = currentTimeMillis * 100;
                obj.A00 = -1;
                obj.A04 = -1;
                BlockingDeque blockingDeque = cge.A00;
                C24463C5d c5d = (C24463C5d) blockingDeque.peekLast();
                if (!(c5d != null && c5d.A03 == obj.A03 && c5d.A01 == obj.A01)) {
                    blockingDeque.add(obj);
                }
            }
        }
        try {
            C25304Cd8.A01("releaseOutputBuffer");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            eAe.CEI(i, j2);
            this.A07 += SystemClock.elapsedRealtime() - elapsedRealtime;
            this.A0J = SystemClock.elapsedRealtime() * 1000;
            this.A09.A07++;
            this.A0b = 0;
            A0T();
            CU1 cu1 = this.A09;
            long j4 = this.A07;
            int i5 = cu1.A07;
            if (i5 == 0) {
                i2 = -1;
            } else {
                i2 = (int) (j4 / ((long) i5));
            }
            cu1.A00 = i2;
        } finally {
            C25304Cd8.A00();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0141, code lost:
        if (r1.equals("Lenovo K8") != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0621, code lost:
        if (r1.equals("HWWAS-H") != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0623, code lost:
        A0o = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0W(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0a
            r3 = 1
            if (r0 == 0) goto L_0x0006
            return r3
        L_0x0006:
            java.lang.String r0 = "OMX.google"
            boolean r1 = r7.startsWith(r0)
            r0 = 0
            if (r1 != 0) goto L_0x062d
            java.lang.Class<X.BOm> r2 = X.C22773BOm.class
            monitor-enter(r2)
            boolean r0 = A0p     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "dangal"
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01     // Catch:{ all -> 0x062a }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0143
            int r5 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x062a }
            r4 = 27
            if (r5 > r4) goto L_0x0040
            java.lang.String r0 = "HWEML"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0143
            if (r5 >= r4) goto L_0x0040
            int r0 = r1.hashCode()     // Catch:{ all -> 0x062a }
            switch(r0) {
                case -2144781245: goto L_0x0147;
                case -2144781185: goto L_0x0151;
                case -2144781160: goto L_0x015b;
                case -2097309513: goto L_0x0165;
                case -2022874474: goto L_0x016f;
                case -1978993182: goto L_0x0179;
                case -1978990237: goto L_0x0183;
                case -1936688988: goto L_0x018d;
                case -1936688066: goto L_0x0197;
                case -1936688065: goto L_0x01a1;
                case -1931988508: goto L_0x01ab;
                case -1696512866: goto L_0x01b5;
                case -1680025915: goto L_0x01bf;
                case -1615810839: goto L_0x01c9;
                case -1554255044: goto L_0x01d3;
                case -1481772737: goto L_0x01dd;
                case -1481772730: goto L_0x01e7;
                case -1481772729: goto L_0x01f1;
                case -1320080169: goto L_0x01fb;
                case -1217592143: goto L_0x0205;
                case -1180384755: goto L_0x020f;
                case -1139198265: goto L_0x0219;
                case -1052835013: goto L_0x0223;
                case -993250464: goto L_0x022d;
                case -993250458: goto L_0x0237;
                case -965403638: goto L_0x0241;
                case -958336948: goto L_0x024b;
                case -879245230: goto L_0x0255;
                case -842500323: goto L_0x025f;
                case -821392978: goto L_0x0269;
                case -797483286: goto L_0x0273;
                case -794946968: goto L_0x027d;
                case -788334647: goto L_0x0287;
                case -782144577: goto L_0x0291;
                case -575125681: goto L_0x029b;
                case -521118391: goto L_0x02a5;
                case -430914369: goto L_0x02af;
                case -290434366: goto L_0x02b9;
                case -282781963: goto L_0x02c3;
                case -277133239: goto L_0x02cd;
                case -173639913: goto L_0x02d7;
                case -56598463: goto L_0x02e1;
                case 2126: goto L_0x02eb;
                case 2564: goto L_0x02f5;
                case 2715: goto L_0x02ff;
                case 2719: goto L_0x0309;
                case 3483: goto L_0x0313;
                case 73405: goto L_0x031d;
                case 75739: goto L_0x0327;
                case 76779: goto L_0x0331;
                case 78669: goto L_0x033b;
                case 79305: goto L_0x0345;
                case 80618: goto L_0x034f;
                case 88274: goto L_0x0359;
                case 98846: goto L_0x0363;
                case 98848: goto L_0x036d;
                case 99329: goto L_0x0377;
                case 101481: goto L_0x0381;
                case 1513190: goto L_0x038b;
                case 1514184: goto L_0x0395;
                case 1514185: goto L_0x039f;
                case 2436959: goto L_0x03a9;
                case 2463773: goto L_0x03b3;
                case 2464648: goto L_0x03bd;
                case 2689555: goto L_0x03c7;
                case 3154429: goto L_0x03d1;
                case 3284551: goto L_0x03db;
                case 3351335: goto L_0x03e5;
                case 3386211: goto L_0x03ef;
                case 41325051: goto L_0x03f9;
                case 55178625: goto L_0x0403;
                case 61542055: goto L_0x040d;
                case 65355429: goto L_0x0417;
                case 66214468: goto L_0x0421;
                case 66214470: goto L_0x042b;
                case 66214473: goto L_0x0435;
                case 66215429: goto L_0x043f;
                case 66215431: goto L_0x0449;
                case 66215433: goto L_0x0453;
                case 66216390: goto L_0x045d;
                case 76402249: goto L_0x0467;
                case 76404105: goto L_0x0471;
                case 76404911: goto L_0x047b;
                case 80963634: goto L_0x0485;
                case 82882791: goto L_0x048f;
                case 98715550: goto L_0x0499;
                case 101370885: goto L_0x04a3;
                case 102844228: goto L_0x04ad;
                case 165221241: goto L_0x04b7;
                case 182191441: goto L_0x04c1;
                case 245388979: goto L_0x04cb;
                case 287431619: goto L_0x04d5;
                case 307593612: goto L_0x04df;
                case 308517133: goto L_0x04e9;
                case 316215098: goto L_0x04f3;
                case 316215116: goto L_0x04fd;
                case 316246811: goto L_0x0507;
                case 316246818: goto L_0x0511;
                case 407160593: goto L_0x051b;
                case 507412548: goto L_0x0525;
                case 793982701: goto L_0x052f;
                case 794038622: goto L_0x0539;
                case 794040393: goto L_0x0543;
                case 835649806: goto L_0x054d;
                case 917340916: goto L_0x0557;
                case 958008161: goto L_0x0561;
                case 1060579533: goto L_0x056b;
                case 1150207623: goto L_0x0575;
                case 1176899427: goto L_0x057f;
                case 1280332038: goto L_0x0589;
                case 1306947716: goto L_0x0593;
                case 1349174697: goto L_0x059d;
                case 1522194893: goto L_0x05a6;
                case 1691543273: goto L_0x05af;
                case 1709443163: goto L_0x05b8;
                case 1865889110: goto L_0x05c1;
                case 1906253259: goto L_0x05ca;
                case 1977196784: goto L_0x05d3;
                case 2006372676: goto L_0x05dc;
                case 2029784656: goto L_0x05e5;
                case 2030379515: goto L_0x05ee;
                case 2033393791: goto L_0x05f7;
                case 2047190025: goto L_0x0600;
                case 2047252157: goto L_0x0609;
                case 2048319463: goto L_0x0612;
                case 2048855701: goto L_0x061b;
                default: goto L_0x0037;
            }     // Catch:{ all -> 0x062a }
        L_0x0037:
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x062a }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x062a }
            switch(r0) {
                case -2038157993: goto L_0x0045;
                case -2038157992: goto L_0x004f;
                case -1984447159: goto L_0x0059;
                case -1458559768: goto L_0x0063;
                case -1337484257: goto L_0x006d;
                case -1152053872: goto L_0x0077;
                case -1147076792: goto L_0x0081;
                case -708142633: goto L_0x008b;
                case -594534941: goto L_0x0095;
                case -581948979: goto L_0x009f;
                case -401692983: goto L_0x00a9;
                case -399133966: goto L_0x00b3;
                case -154985182: goto L_0x00bd;
                case 2006354: goto L_0x00c6;
                case 2006367: goto L_0x00cf;
                case 81951059: goto L_0x00d8;
                case 439365079: goto L_0x00e1;
                case 511748841: goto L_0x00ea;
                case 619782645: goto L_0x00f3;
                case 619782647: goto L_0x00fc;
                case 632760191: goto L_0x0105;
                case 807317112: goto L_0x010e;
                case 807374834: goto L_0x0117;
                case 1070811680: goto L_0x0120;
                case 1682560972: goto L_0x0129;
                case 1921424370: goto L_0x0132;
                case 2133907258: goto L_0x013b;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x062a }
        L_0x0040:
            A0p = r3     // Catch:{ all -> 0x062a }
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x062a }
            goto L_0x0627
        L_0x0045:
            java.lang.String r0 = "Redmi Note 2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x004f:
            java.lang.String r0 = "Redmi Note 3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0059:
            java.lang.String r0 = "MotoG3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0063:
            java.lang.String r0 = "MotoE2(4G-LTE)"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x006d:
            java.lang.String r0 = "Asus_ZB500KL"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0077:
            java.lang.String r0 = "SUGAR S9"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0081:
            java.lang.String r0 = "Lenovo A2016b30"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x008b:
            java.lang.String r0 = "Redmi 4X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0095:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x009f:
            java.lang.String r0 = "m2 note"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00a9:
            java.lang.String r0 = "SM-G9350"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00b3:
            java.lang.String r0 = "SM-J200M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00bd:
            java.lang.String r0 = "Andromax A26C4H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00c6:
            java.lang.String r0 = "AFTA"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00cf:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00d8:
            java.lang.String r0 = "VS880"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00e1:
            java.lang.String r0 = "HUAWEI NXT-L29"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00ea:
            java.lang.String r0 = "SM-J200GU"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00f3:
            java.lang.String r0 = "ASUS_X00ADA"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00fc:
            java.lang.String r0 = "ASUS_X00ADC"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0105:
            java.lang.String r0 = "SM-N910R4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x010e:
            java.lang.String r0 = "LG-K430"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0117:
            java.lang.String r0 = "LG-M250"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0120:
            java.lang.String r0 = "Lenovo K10a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0129:
            java.lang.String r0 = "ASUS_X00AD"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0132:
            java.lang.String r0 = "Sony Tablet S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x013b:
            java.lang.String r0 = "Lenovo K8"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
        L_0x0143:
            A0o = r3     // Catch:{ all -> 0x062a }
            goto L_0x0040
        L_0x0147:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0151:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x015b:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0165:
            java.lang.String r0 = "K50a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x016f:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0179:
            java.lang.String r0 = "NX541J"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0183:
            java.lang.String r0 = "NX573J"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x018d:
            java.lang.String r0 = "PGN528"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0197:
            java.lang.String r0 = "PGN610"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01a1:
            java.lang.String r0 = "PGN611"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01ab:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01b5:
            java.lang.String r0 = "XT1663"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01bf:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01c9:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01d3:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01dd:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01e7:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01f1:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01fb:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0205:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x020f:
            java.lang.String r0 = "iris60"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0219:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0223:
            java.lang.String r0 = "namath"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x022d:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0237:
            java.lang.String r0 = "A10-70L"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0241:
            java.lang.String r0 = "s905x018"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x024b:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0255:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x025f:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0269:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0273:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x027d:
            java.lang.String r0 = "watson"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0287:
            java.lang.String r0 = "whyred"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0291:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x029b:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02a5:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02af:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02b9:
            java.lang.String r0 = "taido_row"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02c3:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02cd:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02d7:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02e1:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02eb:
            java.lang.String r0 = "C1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02f5:
            java.lang.String r0 = "Q5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02ff:
            java.lang.String r0 = "V1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0309:
            java.lang.String r0 = "V5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0313:
            java.lang.String r0 = "mh"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x031d:
            java.lang.String r0 = "JGZ"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0327:
            java.lang.String r0 = "M5c"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0331:
            java.lang.String r0 = "MX6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x033b:
            java.lang.String r0 = "P85"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0345:
            java.lang.String r0 = "PLE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x034f:
            java.lang.String r0 = "QX1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0359:
            java.lang.String r0 = "Z80"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0363:
            java.lang.String r0 = "cv1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x036d:
            java.lang.String r0 = "cv3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0377:
            java.lang.String r0 = "deb"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0381:
            java.lang.String r0 = "flo"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x038b:
            java.lang.String r0 = "1601"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0395:
            java.lang.String r0 = "1713"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x039f:
            java.lang.String r0 = "1714"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03a9:
            java.lang.String r0 = "P681"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03b3:
            java.lang.String r0 = "Q350"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03bd:
            java.lang.String r0 = "Q427"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03c7:
            java.lang.String r0 = "XE2X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03d1:
            java.lang.String r0 = "fugu"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03db:
            java.lang.String r0 = "kate"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03e5:
            java.lang.String r0 = "mido"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03ef:
            java.lang.String r0 = "p212"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03f9:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0403:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x040d:
            java.lang.String r0 = "A1601"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0417:
            java.lang.String r0 = "E5643"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0421:
            java.lang.String r0 = "F3111"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x042b:
            java.lang.String r0 = "F3113"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0435:
            java.lang.String r0 = "F3116"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x043f:
            java.lang.String r0 = "F3211"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0449:
            java.lang.String r0 = "F3213"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0453:
            java.lang.String r0 = "F3215"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x045d:
            java.lang.String r0 = "F3311"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0467:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0471:
            java.lang.String r0 = "Q4260"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x047b:
            java.lang.String r0 = "Q4310"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0485:
            java.lang.String r0 = "V23GB"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x048f:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0499:
            java.lang.String r0 = "i9031"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04a3:
            java.lang.String r0 = "l5460"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04ad:
            java.lang.String r0 = "le_x6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04b7:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04c1:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04cb:
            java.lang.String r0 = "marino_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04d5:
            java.lang.String r0 = "griffin"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04df:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04e9:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04f3:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04fd:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0507:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0511:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x051b:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0525:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x052f:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0539:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0543:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x054d:
            java.lang.String r0 = "manning"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0557:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0561:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x056b:
            java.lang.String r0 = "panell_d"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0575:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x057f:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0589:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0593:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x059d:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05a6:
            java.lang.String r0 = "woods_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05af:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05b8:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05c1:
            java.lang.String r0 = "santoni"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05ca:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05d3:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05dc:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05e5:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05ee:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05f7:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0600:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0609:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0612:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x061b:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
        L_0x0623:
            A0o = r3     // Catch:{ all -> 0x062a }
            goto L_0x0037
        L_0x0627:
            boolean r0 = A0o
            return r0
        L_0x062a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x062a }
            throw r0
        L_0x062d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22773BOm.A0W(java.lang.String):boolean");
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void A0I(long j, boolean z) {
        long j2;
        super.A0I(j, z);
        A03(this);
        this.A0d = -9223372036854775807L;
        this.A0b = 0;
        this.A0I = -9223372036854775807L;
        this.A07 = 0;
        this.A08 = 0;
        int i = this.A09;
        if (i != 0) {
            this.A0L = this.A0m[i - 1];
            this.A09 = 0;
        }
        if (z) {
            long j3 = this.A0h;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0H = j2;
            return;
        }
        this.A0H = -9223372036854775807L;
    }

    public void A0J(boolean z, boolean z2) {
        super.A0J(z, z2);
        C25715Ckl ckl = this.A04;
        C26056CrS.A01(ckl);
        int i = ckl.A00;
        this.A0c = i;
        this.A0Z = AnonymousClass000.A1O(i);
        C24847CMq cMq = this.A0k;
        CU1 cu1 = this.A09;
        Handler handler = cMq.A00;
        if (handler != null) {
            BE7.A19(handler, cMq, cu1, 46);
        }
        C25961CpT cpT = this.A0j;
        cpT.A08 = false;
        if (cpT.A09 != null) {
            cpT.A0B.A02.sendEmptyMessage(1);
            C26356CyI cyI = cpT.A0A;
            if (cyI != null) {
                cyI.A00.registerDisplayListener(cyI, (Handler) null);
            }
            C25961CpT.A00(cpT);
        }
    }

    public void A0N() {
        super.A0N();
        this.A03 = 0;
    }

    public void A0R(D48 d48) {
        super.A0R(d48);
        C24847CMq cMq = this.A0k;
        Handler handler = cMq.A00;
        if (handler != null) {
            BE7.A19(handler, cMq, d48, 45);
        }
        this.A01 = d48.A02;
        this.A0A = d48.A0E;
    }

    public boolean Bg8() {
        Surface surface;
        Surface surface2;
        if (super.Bg8() && !this.A0Y && (((surface2 = this.A0N) == null || this.A0O != surface2) && this.A0C != null && !this.A0Z)) {
            this.A07 = AnonymousClass00R.A0Y;
        }
        if (!super.Bg8() || (!this.A0Y && (((surface = this.A0N) == null || this.A0O != surface) && this.A0C != null && !this.A0Z))) {
            long j = this.A0H;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A0H = -9223372036854775807L;
                }
            }
            return false;
        }
        this.A0H = -9223372036854775807L;
        return true;
    }

    public static void A02(Surface surface, C28610EAe eAe) {
        eAe.CJp(surface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0065, code lost:
        if ("NVIDIA".equals(com.facebook.android.exoplayer2.util.Util.A03) == false) goto L_0x0067;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22773BOm(android.content.Context r18, android.os.Handler r19, X.C25744ClE r20, X.EBU r21, X.CPn r22, X.C25626Cj6 r23, X.D9R r24, java.lang.Object r25, int r26, int r27, int r28, long r29, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            r17 = this;
            r4 = 0
            r12 = 2
            r15 = 1
            r7 = r17
            r14 = r27
            r13 = r26
            r11 = r23
            r10 = r22
            r9 = r21
            r8 = r20
            r16 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.A0W = r15
            r7.A0S = r15
            r5 = 0
            r7.A0X = r4
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0G = r2
            r7.A0V = r4
            r7.A0a = r4
            r0 = r29
            r7.A0h = r0
            r7.A0f = r4
            r1 = r18
            android.content.Context r0 = r1.getApplicationContext()
            r7.A0i = r0
            r0 = r28
            r7.A0g = r0
            X.CpT r0 = new X.CpT
            r0.<init>(r1)
            r7.A0j = r0
            X.CMq r0 = new X.CMq
            r6 = r19
            r1 = r24
            r0.<init>(r6, r1)
            r7.A0k = r0
            int r6 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 22
            if (r6 > r0) goto L_0x0067
            java.lang.String r1 = "foster"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = "NVIDIA"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r7.A0l = r0
            r0 = 29
            if (r6 != r0) goto L_0x0079
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "Pixel "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0079
            r5 = 1
        L_0x0079:
            r7.A0T = r5
            r1 = 10
            long[] r0 = new long[r1]
            r7.A0m = r0
            long[] r0 = new long[r1]
            r7.A0n = r0
            r7.A0L = r2
            r7.A0I = r2
            r7.A0H = r2
            r1 = -1
            r7.A05 = r1
            r7.A04 = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A00 = r0
            r7.A01 = r0
            r7.A0E = r15
            r7.A0D = r1
            r7.A0B = r1
            r7.A02 = r0
            r7.A0C = r1
            r0 = r31
            r7.A0W = r0
            r7.A0S = r4
            r0 = r32
            r7.A0X = r0
            r0 = r33
            r7.A0V = r0
            r0 = r34
            r7.A0a = r0
            r0 = r25
            r7.A0e = r0
            r0 = r35
            r7.A0R = r0
            r0 = r36
            r7.A0Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22773BOm.<init>(android.content.Context, android.os.Handler, X.ClE, X.EBU, X.CPn, X.Cj6, X.D9R, java.lang.Object, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public C22773BOm() {
        super((C25744ClE) null, (EBU) null, new CPn((C25484Cgf) null, -1, false), C25626Cj6.A0R, 2, 0, 0, false, false);
        this.A0W = true;
        this.A0S = true;
        this.A0X = false;
        this.A0G = -9223372036854775807L;
        this.A0V = false;
        this.A0a = false;
        this.A0h = 0;
        this.A0f = -1;
        throw AnonymousClass000.A0s("getApplicationContext");
    }
}
