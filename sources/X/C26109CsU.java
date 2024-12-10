package X;

import android.hardware.Camera;
import android.media.MediaRecorder;

/* renamed from: X.CsU  reason: case insensitive filesystem */
public class C26109CsU {
    public boolean A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.SurfaceView r4, X.COM r5, X.CUD r6, X.C189369iy r7) {
        /*
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0037
            android.media.MediaRecorder r0 = r6.A04
            X.C17960vV.A07(r0)
            r0.stop()
            A02(r6)
            android.hardware.Camera r0 = r6.A03
            X.C17960vV.A07(r0)
            r0.lock()
            r0 = 0
        L_0x0018:
            r6.A0B = r0
        L_0x001a:
            X.DFL r1 = r5.A01
            r0 = 48
            java.lang.String r0 = r1.A0D(r0)
            int r1 = java.lang.Integer.parseInt(r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 45
            X.AkM r2 = new X.AkM
            r2.<init>(r6, r5, r7, r0)
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x0037:
            android.media.MediaRecorder r0 = new android.media.MediaRecorder
            r0.<init>()
            r6.A04 = r0
            android.hardware.Camera r0 = r6.A03
            X.C17960vV.A07(r0)
            r0.unlock()
            android.media.MediaRecorder r1 = r6.A04
            android.hardware.Camera r0 = r6.A03
            r1.setCamera(r0)
            android.media.MediaRecorder r0 = r6.A04
            r2 = 1
            r0.setVideoSource(r2)
            int r0 = r6.A00
            r1 = 4
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00ef
            int r0 = r6.A00
            r1 = 5
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00ef
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r2)
        L_0x006b:
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.fileFormat
            r1.setOutputFormat(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoFrameRate
            r1.setVideoFrameRate(r0)
            android.media.MediaRecorder r2 = r6.A04
            int r1 = r3.videoFrameWidth
            int r0 = r3.videoFrameHeight
            r2.setVideoSize(r1, r0)
            android.media.MediaRecorder r1 = r6.A04
            r0 = 256000(0x3e800, float:3.58732E-40)
            r1.setVideoEncodingBitRate(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoCodec
            r1.setVideoEncoder(r0)
            X.DFL r1 = r5.A01
            r0 = 46
            java.lang.String r1 = r1.A0D(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "yyyyMMdd_HHmmss"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r1.format(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VID_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".mp4"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
        L_0x00c1:
            java.io.File r0 = r7.A00(r1)
            X.C17960vV.A07(r0)
            java.lang.String r1 = r0.getPath()
            android.media.MediaRecorder r0 = r6.A04
            r0.setOutputFile(r1)
            android.media.MediaRecorder r1 = r6.A04
            X.Bq5 r0 = r6.A06
            X.C17960vV.A05(r0)
            int r0 = r0.getDisplayOrientation()
            int r0 = 360 - r0
            r1.setOrientationHint(r0)
            android.media.MediaRecorder r1 = r6.A04
            android.view.SurfaceHolder r0 = r4.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r1.setPreviewDisplay(r0)
            goto L_0x00f7
        L_0x00ef:
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r1)
            goto L_0x006b
        L_0x00f7:
            android.media.MediaRecorder r0 = r6.A04     // Catch:{ IOException | IllegalStateException -> 0x0107 }
            r0.prepare()     // Catch:{ IOException | IllegalStateException -> 0x0107 }
            android.media.MediaRecorder r0 = r6.A04
            X.C17960vV.A07(r0)
            r0.start()
            r0 = 1
            goto L_0x0018
        L_0x0107:
            r0 = move-exception
            r0.getMessage()
            A02(r6)
            A02(r6)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26109CsU.A00(android.view.SurfaceView, X.COM, X.CUD, X.9iy):void");
    }

    public static void A02(CUD cud) {
        MediaRecorder mediaRecorder = cud.A04;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            cud.A04.release();
            cud.A04 = null;
            Camera camera = cud.A03;
            if (camera != null) {
                camera.lock();
            }
        }
    }

    public C26109CsU(AnonymousClass1KB r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.COM r6, X.CUD r7, X.C189369iy r8) {
        /*
            java.util.HashMap r1 = X.C17880vN.A11()
            java.lang.String r3 = r7.A08
            int r2 = r3.hashCode()
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            r5 = 1
            if (r2 == r0) goto L_0x007e
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r2 == r0) goto L_0x0076
            r0 = 124969519(0x772e22f, float:1.8272526E-34)
            if (r2 != r0) goto L_0x0023
            java.lang.String r0 = "image_and_video"
            boolean r0 = r3.equals(r0)
            r4 = 1
        L_0x0021:
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r4 = -1
        L_0x0024:
            java.lang.String r3 = "video_file_name"
            if (r4 == 0) goto L_0x0070
            java.lang.String r2 = "image_file_name"
            if (r4 == r5) goto L_0x004f
            java.lang.String r0 = r7.A07
            r1.put(r2, r0)
        L_0x0031:
            X.DFL r4 = r6.A01
            r0 = 44
            X.E8A r3 = r4.A0A(r0)
            if (r3 == 0) goto L_0x004e
            X.A4p r2 = new X.A4p
            r2.<init>()
            java.util.HashMap r1 = X.C196539vE.A01(r1)
            r0 = 0
            X.9zJ r1 = X.BE7.A0R(r2, r1, r0)
            X.DOZ r0 = r6.A00
            X.C25681CkC.A03(r0, r4, r1, r3)
        L_0x004e:
            return
        L_0x004f:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0060
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0060
            X.Bq5 r0 = r7.A06
            X.C17960vV.A05(r0)
            A00(r0, r6, r7, r8)
            return
        L_0x0060:
            java.lang.String r0 = r7.A07
            r1.put(r2, r0)
            java.lang.String r0 = r7.A09
            r1.put(r3, r0)
            r0 = 0
            r7.A0C = r0
            r7.A0A = r0
            goto L_0x0031
        L_0x0070:
            java.lang.String r0 = r7.A09
            r1.put(r3, r0)
            goto L_0x0031
        L_0x0076:
            java.lang.String r0 = "video"
            boolean r0 = r3.equals(r0)
            r4 = 0
            goto L_0x0021
        L_0x007e:
            java.lang.String r0 = "image"
            boolean r0 = r3.equals(r0)
            r4 = 2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26109CsU.A01(X.COM, X.CUD, X.9iy):void");
    }
}
