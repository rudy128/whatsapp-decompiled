package X;

import android.media.MediaRecorder;
import android.util.Log;

public class CZ3 {
    public MediaRecorder A00;
    public final MediaRecorder.OnErrorListener A01 = new C26364CyQ(this);
    public final MediaRecorder.OnInfoListener A02 = new C26365CyR(this);
    public final E1D A03;
    public volatile boolean A04;

    public void A00() {
        MediaRecorder mediaRecorder = this.A00;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
                this.A04 = false;
            } catch (RuntimeException e) {
                Log.e("SimpleMediaRecorder", "stopVideoRecording", e);
                throw AnonymousClass8BR.A0x(e);
            } catch (Throwable th) {
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
                this.A04 = false;
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a4, code lost:
        if (r17 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.media.CamcorderProfile r14, java.io.FileDescriptor r15, int r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0111
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0111
            android.media.MediaRecorder r2 = new android.media.MediaRecorder
            r2.<init>()
            r13.A00 = r2
            X.E1D r1 = r13.A03
            X.DEO r1 = (X.DEO) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x00be;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = 2
            r2.setVideoSource(r0)
        L_0x001c:
            r6 = 5
            android.media.MediaRecorder r1 = r13.A00
            if (r18 == 0) goto L_0x009e
            r1.setAudioSource(r6)
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.fileFormat
            r1.setOutputFormat(r0)
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.audioBitRate
            r1.setAudioEncodingBitRate(r0)
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.audioChannels
            r1.setAudioChannels(r0)
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.audioSampleRate
            r1.setAudioSamplingRate(r0)
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.audioCodec
            r1.setAudioEncoder(r0)
        L_0x0047:
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.videoFrameRate
            r1.setVideoFrameRate(r0)
            android.media.MediaRecorder r2 = r13.A00
            int r1 = r14.videoFrameWidth
            int r0 = r14.videoFrameHeight
            r2.setVideoSize(r1, r0)
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.videoBitRate
            r1.setVideoEncodingBitRate(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r8 < r0) goto L_0x0214
            if (r17 == 0) goto L_0x0214
            java.lang.String[] r12 = X.C24672CEm.A00
            r2 = 2
            java.util.HashSet r7 = X.C17880vN.A12()
            int r11 = android.media.MediaCodecList.getCodecCount()
            r10 = 0
        L_0x0072:
            if (r10 >= r11) goto L_0x00d9
            android.media.MediaCodecInfo r1 = android.media.MediaCodecList.getCodecInfoAt(r10)
            boolean r0 = r1.isEncoder()
            if (r0 == 0) goto L_0x009b
            java.lang.String[] r9 = r1.getSupportedTypes()
            int r5 = r9.length
            r4 = 0
        L_0x0084:
            if (r4 >= r5) goto L_0x009b
            r3 = 0
        L_0x0087:
            r1 = r12[r3]
            r0 = r9[r4]
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0094
            r7.add(r1)
        L_0x0094:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x0087
            int r4 = r4 + 1
            goto L_0x0084
        L_0x009b:
            int r10 = r10 + 1
            goto L_0x0072
        L_0x009e:
            int r0 = r14.fileFormat
            r1.setOutputFormat(r0)
            goto L_0x0047
        L_0x00a4:
            java.lang.Object r0 = r1.A01     // Catch:{ Exception -> 0x00ad }
            X.DEs r0 = (X.C26810DEs) r0     // Catch:{ Exception -> 0x00ad }
            r0.A0A(r2)     // Catch:{ Exception -> 0x00ad }
            goto L_0x001c
        L_0x00ad:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r1.getMessage()
        L_0x00b8:
            java.lang.String r0 = "Camera1Device.setVideoRecordingSource"
            goto L_0x00d1
        L_0x00bb:
            java.lang.String r1 = ""
            goto L_0x00b8
        L_0x00be:
            r0 = 2
            r2.setVideoSource(r0)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x001c
        L_0x00c4:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r1 = r1.getMessage()
        L_0x00cf:
            java.lang.String r0 = "Camera2Device.setVideoRecordingSource"
        L_0x00d1:
            X.C26175Cts.A02(r0, r1)
            goto L_0x001c
        L_0x00d6:
            java.lang.String r1 = ""
            goto L_0x00cf
        L_0x00d9:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x01fb
            android.media.MediaRecorder r0 = r13.A00
            r0.setVideoEncoder(r6)
            android.media.MediaRecorder r1 = r13.A00
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x00ea:
            r1.setVideoEncodingProfileLevel(r2, r0)
        L_0x00ed:
            android.media.MediaRecorder r0 = r13.A00
            r1 = r16
            r0.setOrientationHint(r1)
            if (r15 == 0) goto L_0x00fb
            android.media.MediaRecorder r0 = r13.A00
            r0.setOutputFile(r15)
        L_0x00fb:
            android.media.MediaRecorder r1 = r13.A00
            android.media.MediaRecorder$OnInfoListener r0 = r13.A02
            r1.setOnInfoListener(r0)
            android.media.MediaRecorder r1 = r13.A00
            android.media.MediaRecorder$OnErrorListener r0 = r13.A01
            r1.setOnErrorListener(r0)
            android.media.MediaRecorder r0 = r13.A00
            r0.prepare()
            r0 = 1
            r13.A04 = r0
        L_0x0111:
            X.E1D r1 = r13.A03
            android.media.MediaRecorder r5 = r13.A00
            X.C28111Yx.A02(r5)
            X.DEO r1 = (X.DEO) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0146;
                case 1: goto L_0x014c;
                default: goto L_0x011f;
            }
        L_0x011f:
            java.lang.Object r0 = r1.A01
            X.DF0 r0 = (X.DF0) r0
            android.view.Surface r3 = r5.getSurface()
            r0.A04 = r3
            X.CJV r0 = r0.A07
            X.C28111Yx.A02(r3)
            X.BPz r2 = r0.A00
            r1 = 0
            X.ClC r0 = new X.ClC
            r0.<init>(r3, r1)
            r2.A01 = r0
            r1 = 1
            r0.A04 = r1
            X.ClC r0 = r2.A01
            r0.A02 = r1
            X.EDE r1 = r2.A00
            X.ClC r0 = r2.A01
            r1.BBa(r0)
        L_0x0146:
            android.media.MediaRecorder r0 = r13.A00
            r0.start()
            return
        L_0x014c:
            java.lang.Object r4 = r1.A01
            X.DEr r4 = (X.C26809DEr) r4
            X.CnB r1 = r4.A0b
            java.lang.String r0 = "Method onStartMediaRecorder() must run on the Optic Background Thread."
            r1.A06(r0)
            X.CvG r3 = r4.A0V
            X.Ca9 r2 = r3.A0I
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r2.A01(r0)
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x016c
            java.lang.String r1 = "Camera2Device"
            java.lang.String r0 = "Can not start video recording, PreviewController is not prepared"
            X.C26175Cts.A03(r1, r0)
            goto L_0x0146
        L_0x016c:
            X.CXb r1 = r4.A0W
            r0 = 1
            r1.A0C = r0
            android.view.Surface r6 = r5.getSurface()
            java.lang.String r0 = "Cannot start native video recording."
            r2.A00(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r3.A02
            if (r0 == 0) goto L_0x021d
            android.view.Surface r0 = r3.A04
            if (r0 == 0) goto L_0x021d
            X.CjI r1 = r3.A0E
            if (r1 == 0) goto L_0x0195
            X.CKI r0 = X.C25632CjI.A0b
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "Cannot start native video native capture, not supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0195:
            X.CjI r1 = r3.A0E
            r4 = 0
            r2 = 1
            if (r1 == 0) goto L_0x01a6
            X.CKI r0 = X.C25632CjI.A0J
            boolean r0 = X.BE9.A1T(r0, r1)
            if (r0 == 0) goto L_0x01a6
            r8 = 1
            if (r17 != 0) goto L_0x01a7
        L_0x01a6:
            r8 = 0
        L_0x01a7:
            r0 = 0
            X.CPZ r9 = new X.CPZ
            r9.<init>(r6, r4, r0)
            android.view.Surface r7 = r3.A04
            X.CPZ r5 = new X.CPZ
            r5.<init>(r7, r4, r0)
            if (r8 == 0) goto L_0x01c1
            X.CPZ r9 = new X.CPZ
            r9.<init>(r6, r2, r0)
            X.CPZ r5 = new X.CPZ
            r5.<init>(r7, r2, r0)
        L_0x01c1:
            r3.A05 = r6
            r0 = 2
            X.CPZ[] r0 = new X.CPZ[r0]
            r0[r4] = r5
            java.util.List r1 = X.AnonymousClass8BR.A15(r9, r0, r2)
            X.E9T r0 = r3.A08
            if (r0 == 0) goto L_0x01d3
            r0.close()
        L_0x01d3:
            java.lang.String r0 = "record_native_video_on_camera_thread"
            X.E9T r0 = X.C26225CvG.A00(r3, r0, r1, r8)
            r3.A08 = r0
            android.hardware.camera2.CaptureRequest$Builder r0 = r3.A02
            r0.addTarget(r6)
            X.DEU r1 = r3.A07
            X.C28111Yx.A02(r1)
            r0 = 7
            r1.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0A = r0
            r0 = 0
            r1.A00 = r0
            r3.A08(r4)
            java.lang.String r0 = "Preview session was closed while starting recording."
            r3.A09(r2, r0)
            goto L_0x0146
        L_0x01fb:
            r0 = 33
            if (r8 < r0) goto L_0x0214
            java.lang.String r0 = "video/av01"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0214
            android.media.MediaRecorder r1 = r13.A00
            r0 = 8
            r1.setVideoEncoder(r0)
            android.media.MediaRecorder r1 = r13.A00
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x00ea
        L_0x0214:
            android.media.MediaRecorder r1 = r13.A00
            int r0 = r14.videoCodec
            r1.setVideoEncoder(r0)
            goto L_0x00ed
        L_0x021d:
            java.lang.String r0 = "Cannot start native video recording, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZ3.A01(android.media.CamcorderProfile, java.io.FileDescriptor, int, boolean, boolean):void");
    }

    public CZ3(E1D e1d) {
        this.A03 = e1d;
        this.A04 = false;
    }
}
