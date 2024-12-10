package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.BwL  reason: case insensitive filesystem */
public final class C24155BwL extends VoipPhysicalCamera {
    public int A00;
    public VirtualDisplay A01;
    public Image A02;
    public ImageReader A03;
    public C25791Cm3 A04;
    public VoipPhysicalCamera.CameraInfo A05;
    public boolean A06;
    public boolean A07;
    public final MediaProjection A08;
    public final AnonymousClass1HQ A09;
    public final BFU A0A;
    public final A1P A0B;
    public final ScreenShareResourceManager A0C;
    public final C18600wl A0D;
    public final C18600wl A0E;
    public volatile boolean A0F;

    public boolean canBindToCameraProcessor() {
        return false;
    }

    public Point getAdjustedPreviewSize() {
        return null;
    }

    public int getCameraStartMode() {
        return 0;
    }

    public C187819gQ getLastCachedFrame() {
        return null;
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return 0;
    }

    public boolean hasLastCachedFrame() {
        return false;
    }

    public void onFrameAvailableOnCameraThread() {
    }

    public void onScreenShareInfoChanged(C25791Cm3 cm3) {
        C18070vi.A0d(cm3, 0);
        if (!this.A0F) {
            C17960vV.A0F(false, "ScreenShareCaptureDevice Screen sharing not active, change ignored");
        } else if (!C18070vi.A18(this.A04, cm3)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ScreenShareCaptureDevice/onScreenShareInfoChanged -- w: ");
            A10.append(cm3.A02);
            A10.append(", h: ");
            C17900vP.A0o(A10, cm3.A01);
            Object syncRunOnCameraThread = syncRunOnCameraThread(new DVY(this, cm3, 17), BE7.A0Y());
            C18070vi.A0X(syncRunOnCameraThread);
            ((Number) syncRunOnCameraThread).intValue();
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        return 0;
    }

    public int toggleCameraProcessorOnCameraThread(boolean z) {
        return -15;
    }

    public void updatePreviewOrientation() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24155BwL(Context context, MediaProjection mediaProjection, AnonymousClass1HQ r22, C25791Cm3 cm3, A1P a1p, ScreenShareResourceManager screenShareResourceManager, C18030ve r26, AnonymousClass1DC r27, int i, int i2, int i3) {
        super(r26, r27, (AnonymousClass00H) null, (AnonymousClass00H) null, (HandlerThread) null);
        C23771Ho r2 = C23761Hn.A00;
        AnonymousClass1IT A002 = C23761Hn.A00();
        C18070vi.A0d(r2, 12);
        C18070vi.A0d(A002, 13);
        this.A09 = r22;
        MediaProjection mediaProjection2 = mediaProjection;
        this.A08 = mediaProjection2;
        this.A04 = cm3;
        this.A0B = a1p;
        ScreenShareResourceManager screenShareResourceManager2 = screenShareResourceManager;
        this.A0C = screenShareResourceManager2;
        this.A0D = r2;
        this.A0E = A002;
        this.A0A = new BFU(context, this);
        C25791Cm3 cm32 = this.A04;
        int i4 = cm32.A02;
        int i5 = cm32.A01;
        VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i4, i5, i2, i3, false, 0, i);
        this.A05 = cameraInfo;
        ImageReader newInstance = ImageReader.newInstance(i4, i5, cameraInfo.format, 3);
        C18070vi.A0X(newInstance);
        newInstance.setOnImageAvailableListener(new C26357CyJ(this, 3), this.cameraThreadHandler);
        this.A03 = newInstance;
        screenShareResourceManager2.setMediaProjectionHandle(mediaProjection2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != r2.A01) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C24155BwL r10) {
        /*
            android.hardware.display.VirtualDisplay r3 = r10.A01
            android.media.ImageReader r0 = r10.A03
            int r1 = r0.getWidth()
            X.Cm3 r2 = r10.A04
            int r0 = r2.A02
            if (r1 != r0) goto L_0x001a
            android.media.ImageReader r0 = r10.A03
            int r1 = r0.getHeight()
            X.Cm3 r2 = r10.A04
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0050
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ScreenShareCaptureDevice recreating capture for w: "
            r1.append(r0)
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", h: "
            r1.append(r0)
            int r0 = r2.A01
            X.C17900vP.A0o(r1, r0)
            X.Cm3 r0 = r10.A04
            int r4 = r0.A02
            int r2 = r0.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r10.A05
            int r1 = r0.format
            r0 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r4, r2, r1, r0)
            X.C18070vi.A0X(r2)
            X.CyJ r1 = new X.CyJ
            r1.<init>(r10, r0)
            android.os.Handler r0 = r10.cameraThreadHandler
            r2.setOnImageAvailableListener(r1, r0)
            r10.A03 = r2
        L_0x0050:
            if (r3 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "ScreenShareCaptureDevice resizing VirtualDisplay"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.Cm3 r0 = r10.A04
            int r2 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r3.resize(r2, r1, r0)
            android.media.ImageReader r0 = r10.A03
            android.view.Surface r0 = r0.getSurface()
            r3.setSurface(r0)
        L_0x0071:
            r10.startPeriodicCameraCallbackCheck()
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.scheduleLastFrameResend(r0)
            r0 = 0
            return r0
        L_0x007b:
            android.hardware.display.VirtualDisplay r0 = r10.A01
            if (r0 == 0) goto L_0x0082
            r0.release()
        L_0x0082:
            r8 = 0
            r10.A01 = r8
            android.media.projection.MediaProjection r1 = r10.A08     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            java.lang.String r2 = "wa_screen_sharing"
            X.Cm3 r0 = r10.A04     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            int r3 = r0.A02     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            int r4 = r0.A01     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            int r5 = r0.A00     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            android.media.ImageReader r0 = r10.A03     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            android.view.Surface r7 = r0.getSurface()     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            r6 = 16
            r9 = r8
            android.hardware.display.VirtualDisplay r0 = r1.createVirtualDisplay(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            r10.A01 = r0     // Catch:{ SecurityException -> 0x00aa, IllegalStateException -> 0x00a1 }
            goto L_0x0071
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = "ScreenShareCaptureDevice Unable to start screen capture in state"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -14
            return r0
        L_0x00aa:
            r1 = move-exception
            java.lang.String r0 = "ScreenShareCaptureDevice Invalid MediaProjection, unable to start screen capture"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24155BwL.A00(X.BwL):int");
    }

    public static final void A01(Image image, C24155BwL bwL) {
        if (!bwL.A0F) {
            if (!C18070vi.A18(bwL.A02, image)) {
                Image image2 = bwL.A02;
                if (image2 != null) {
                    image2.close();
                }
                bwL.A02 = null;
            }
            bwL.A02 = image;
            return;
        }
        bwL.scheduleLastFrameResend(1000);
        if (image != null) {
            Iterator A0l = C17890vO.A0l(bwL.virtualCameras);
            while (A0l.hasNext()) {
                VoipCamera voipCamera = (VoipCamera) A0l.next();
                if (voipCamera.started) {
                    bwL.updateCameraCallbackCheck();
                    A1P a1p = bwL.A0B;
                    long j = bwL.cameraCallbackCount;
                    long j2 = bwL.totalElapsedCameraCallbackTime;
                    C136746uK r10 = a1p.A0Q;
                    if (r10.A01) {
                        r10.A00();
                        a1p.A0H = Math.max(a1p.A0H, r10.A00);
                        r10.A01();
                    }
                    a1p.A0A = j;
                    a1p.A0G = j2;
                    AnonymousClass1OB r0 = a1p.A0I;
                    if (r0 != null) {
                        r0.BEM((CancellationException) null);
                    }
                    a1p.A0I = AnonymousClass3MY.A0s(new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(a1p, (C30391dr) null), AnonymousClass1OW.A02(a1p.A0R));
                    voipCamera.abgrFramePlaneCallback(image.getWidth(), image.getHeight(), image.getPlanes()[0].getBuffer(), image.getPlanes()[0].getRowStride());
                }
            }
            if (!C18070vi.A18(bwL.A02, image)) {
                Image image3 = bwL.A02;
                if (image3 != null) {
                    image3.close();
                }
                bwL.A02 = null;
            }
            bwL.A02 = image;
            if (!bwL.A07) {
                bwL.A07 = true;
                Log.i("ScreenShareCaptureDevice First frame rendered");
            }
        }
    }

    public void closeOnCameraThread() {
        if (!this.A06) {
            Log.i("ScreenShareCaptureDevice/closeOnCameraThread stop MediaProjection");
            this.A0C.clearMediaProjectionHandle();
            this.A08.stop();
        }
        this.A08.unregisterCallback(this.A0A);
        VirtualDisplay virtualDisplay = this.A01;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.A01 = null;
        this.A03.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        Image image = this.A02;
        if (image != null) {
            image.close();
        }
        this.A02 = null;
        this.A03.close();
        this.cameraEventsDispatcher.A00();
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.A05;
    }

    public boolean isCameraOpen() {
        return this.A0F;
    }

    public void resendLastFrame() {
        this.A00++;
        A01(this.A02, this);
    }

    public int startOnCameraThread() {
        if (!this.A0F) {
            A02(this);
        }
        this.A08.registerCallback(this.A0A, this.cameraThreadHandler);
        int A002 = A00(this);
        if (A002 != 0) {
            C17900vP.A0i("ScreenShareCaptureDevice Failed to setup screen capture: ", AnonymousClass000.A10(), A002);
        } else {
            this.A0F = true;
            A002 = 0;
        }
        C25180CaW caW = this.cameraEventsDispatcher;
        if (A002 == 0) {
            caW.A01();
            return A002;
        }
        caW.A02();
        return A002;
    }

    public static final void A02(C24155BwL bwL) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScreenShareCaptureDevice notifyFormatChange: ");
        VoipPhysicalCamera.CameraInfo cameraInfo = bwL.A05;
        A10.append(cameraInfo.width);
        A10.append(" x ");
        C17900vP.A0o(A10, cameraInfo.height);
        Iterator A0l = C17890vO.A0l(bwL.virtualCameras);
        while (A0l.hasNext()) {
            VoipCamera voipCamera = (VoipCamera) A0l.next();
            if (voipCamera.started) {
                VoipPhysicalCamera.CameraInfo cameraInfo2 = bwL.A05;
                voipCamera.formatChangeCallback(cameraInfo2.width, cameraInfo2.height, cameraInfo2.format, cameraInfo2.fps1000);
            }
        }
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        clearLastFrameResendMessages();
        this.A0F = false;
        this.cameraEventsDispatcher.A00();
        return 0;
    }
}
