package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipCameraApi2$StopCameraRunnable;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BwM  reason: case insensitive filesystem */
public class C24156BwM extends VoipPhysicalCamera {
    public static final AtomicBoolean A0K = C108965cb.A0w();
    public static final int[] A0L = {2, 0, 1, 3};
    public int A00 = 0;
    public CameraDevice A01;
    public Surface A02;
    public C28629EBc A03 = null;
    public Runnable A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public Point A07;
    public Image A08;
    public ByteBuffer A09;
    public boolean A0A = false;
    public final CameraCharacteristics A0B;
    public final VoipPhysicalCamera.CameraInfo A0C;
    public final int A0D;
    public final CameraDevice.StateCallback A0E = new BFM(this);
    public final CameraManager A0F;
    public final ImageReader A0G;
    public final AnonymousClass11C A0H;
    public final AnonymousClass10I A0I;
    public final Object A0J = C17880vN.A0p();

    public boolean canBindToCameraProcessor() {
        return true;
    }

    public int getCameraStartMode() {
        return 0;
    }

    public static int A00(C24156BwM bwM) {
        Surface surface;
        List singletonList;
        Log.i("voip/video/VoipCamera/ starting camera");
        if (bwM.A01 == null || bwM.videoPort == null) {
            return -5;
        }
        if (bwM.textureHolder == null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = bwM.A0C;
            bwM.createTexture(cameraInfo.width, cameraInfo.height);
            if (bwM.textureHolder == null) {
                return -12;
            }
        }
        Surface surface2 = bwM.A02;
        C28596E9n cameraProcessorIfBoundToCameraProcessor = bwM.getCameraProcessorIfBoundToCameraProcessor();
        if (cameraProcessorIfBoundToCameraProcessor != null) {
            C26791DDz dDz = (C26791DDz) ((C26983DOf) cameraProcessorIfBoundToCameraProcessor).A0F.getValue();
            SurfaceTexture surfaceTexture = dDz.A03;
            if (surfaceTexture == null) {
                surfaceTexture = C26791DDz.A00(dDz);
            }
            VoipPhysicalCamera.CameraInfo cameraInfo2 = bwM.A0C;
            surfaceTexture.setDefaultBufferSize(cameraInfo2.width, cameraInfo2.height);
            surface = new Surface(surfaceTexture);
        } else {
            CZE cze = bwM.textureHolder;
            if (cze != null) {
                surface = new Surface(cze.A01);
            } else {
                throw AnonymousClass8BR.A0w("createCameraPreviewSurfaceInternal called when textureHolder is null");
            }
        }
        bwM.A02 = surface;
        A04(bwM);
        AnonymousClass7RN r4 = new AnonymousClass7RN(bwM, surface2, 14);
        try {
            CaptureRequest.Builder createCaptureRequest = bwM.A01.createCaptureRequest(1);
            createCaptureRequest.addTarget(bwM.A02);
            List A13 = AnonymousClass000.A13();
            if (!bwM.isBoundToCameraProcessor) {
                ImageReader imageReader = bwM.A0G;
                createCaptureRequest.addTarget(imageReader.getSurface());
                Surface[] surfaceArr = new Surface[2];
                surfaceArr[0] = bwM.A02;
                singletonList = AnonymousClass8BR.A15(imageReader.getSurface(), surfaceArr, 1);
                if (AnonymousClass112.A09() && bwM.A0A) {
                    OutputConfiguration[] outputConfigurationArr = new OutputConfiguration[2];
                    outputConfigurationArr[0] = A01(bwM.A02, 1);
                    A13 = AnonymousClass8BR.A15(A01(imageReader.getSurface(), 5), outputConfigurationArr, 1);
                }
            } else {
                singletonList = Collections.singletonList(bwM.A02);
                if (AnonymousClass112.A09() && bwM.A0A) {
                    A13 = Collections.singletonList(A01(bwM.A02, 4));
                }
            }
            bwM.A06 = true;
            BFK bfk = new BFK(createCaptureRequest, surface2, bwM, r4);
            if (!AnonymousClass112.A09() || !bwM.A0A) {
                bwM.A01.createCaptureSession(singletonList, bfk, bwM.cameraThreadHandler);
                return 0;
            }
            bwM.A01.createCaptureSession(new SessionConfiguration(0, A13, new C27133DVu(bwM.cameraThreadHandler), bfk));
            return 0;
        } catch (CameraAccessException | IllegalArgumentException e) {
            Log.e("startCaptureSessionOnCameraThread", e);
            r4.run();
            return -2;
        }
    }

    public static OutputConfiguration A01(Surface surface, long j) {
        OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
        outputConfiguration.setStreamUseCase(j);
        return outputConfiguration;
    }

    public static void A03(C24156BwM bwM) {
        synchronized (bwM.A0J) {
            Image image = bwM.A08;
            if (image != null && image.getPlanes().length == 1) {
                bwM.A08.close();
                bwM.A08 = null;
            }
        }
    }

    public static void A04(C24156BwM bwM) {
        int rotation = bwM.A0H.A0L().getDefaultDisplay().getRotation();
        bwM.A07 = bwM.calculateAdjustedPreviewSize(rotation, bwM.A0C);
        CZE cze = bwM.textureHolder;
        if (cze != null) {
            cze.A05 = 4 - rotation;
        }
    }

    private boolean A05(Context context) {
        if (Build.VERSION.SDK_INT != 33 || !Build.MODEL.contains("Pixel") || context.getPackageManager().hasSystemFeature("vendor.android.hardware.camera.stream-usecase")) {
            long[] jArr = (long[]) this.A0B.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null) {
                int length = jArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (jArr[i] == 5) {
                        Log.i("voip/video/VoipCamera/SCALER_AVAILABLE_STREAM_USE_CASES_VIDEO_CALL available");
                        if (!C18020vd.A05(C18040vf.A02, this.abProps, 2971)) {
                            return false;
                        }
                        return true;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            Log.i("voip/video/VoipCamera/Google Pixel device without stream use case system flag");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1 < 4) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r0 == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 != r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r3 = A0L;
        r1 = 0;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 != r5) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 == r6) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.lang.String r5, int r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r5.toUpperCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2053249079: goto L_0x0044;
                case -1038134325: goto L_0x003c;
                case 2169487: goto L_0x0034;
                case 787768856: goto L_0x002c;
                case 894099834: goto L_0x0024;
                default: goto L_0x000d;
            }
        L_0x000d:
            r5 = -1
        L_0x000e:
            if (r5 != r6) goto L_0x0012
            r4 = 1
        L_0x0011:
            return r4
        L_0x0012:
            int[] r3 = A0L
            r2 = 4
            r1 = 0
            r4 = 0
        L_0x0017:
            r0 = r3[r1]
            if (r0 != r5) goto L_0x001c
            r4 = 1
        L_0x001c:
            if (r0 == r6) goto L_0x0011
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0017
            r4 = 0
            return r4
        L_0x0024:
            java.lang.String r0 = "LIMITED"
            boolean r0 = r1.equals(r0)
            r5 = 0
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "LEVEL_3"
            boolean r0 = r1.equals(r0)
            r5 = 3
            goto L_0x004b
        L_0x0034:
            java.lang.String r0 = "FULL"
            boolean r0 = r1.equals(r0)
            r5 = 1
            goto L_0x004b
        L_0x003c:
            java.lang.String r0 = "EXTERNAL"
            boolean r0 = r1.equals(r0)
            r5 = 4
            goto L_0x004b
        L_0x0044:
            java.lang.String r0 = "LEGACY"
            boolean r0 = r1.equals(r0)
            r5 = 2
        L_0x004b:
            if (r0 != 0) goto L_0x000e
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24156BwM.A06(java.lang.String, int):boolean");
    }

    public void closeOnCameraThread() {
        int i = this.A00;
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        C17960vV.A0F(z, AnonymousClass001.A1I("closing camera while still open: ", AnonymousClass000.A10(), i));
        this.cameraEventsDispatcher.A00();
        synchronized (this.A0J) {
            Image image = this.A08;
            if (image != null) {
                image.close();
                this.A08 = null;
            }
            this.A0G.close();
            C28596E9n cameraProcessorIfBoundToCameraProcessor = getCameraProcessorIfBoundToCameraProcessor();
            if (cameraProcessorIfBoundToCameraProcessor != null) {
                cameraProcessorIfBoundToCameraProcessor.CQ5();
            }
            this.isBoundToCameraProcessor = false;
        }
    }

    public Point getAdjustedPreviewSize() {
        return this.A07;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z = this.isBoundToCameraProcessor;
        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0C;
        if (z) {
            return new VoipPhysicalCamera.CameraInfo(cameraInfo.width, cameraInfo.height, 1, cameraInfo.fps1000, cameraInfo.isFrontCamera, cameraInfo.orientation, cameraInfo.idx);
        }
        return cameraInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        r1 = r0.A0C;
        r4 = r1.width;
        r5 = r1.height;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010a, code lost:
        if (r8 == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010c, code lost:
        r2 = X.C24153BwJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0117, code lost:
        return new X.C187819gQ(r2, r3, r4, r5, r1.orientation, r1.isFrontCamera);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011a, code lost:
        if (r0.shouldUseArgbApiForLastFrame == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        r2 = X.C24152BwI.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        r2 = new X.C24151BwH(r1.format);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187819gQ getLastCachedFrame() {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r2 = r0.A0J
            monitor-enter(r2)
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            if (r1 != 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            r0 = 0
            return r0
        L_0x000c:
            android.media.Image$Plane[] r1 = r1.getPlanes()     // Catch:{ all -> 0x0127 }
            int r1 = r1.length     // Catch:{ all -> 0x0127 }
            r5 = 0
            r4 = 1
            if (r1 != r4) goto L_0x0036
            r8 = 1
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            int r1 = r1.getWidth()     // Catch:{ all -> 0x0127 }
            int r3 = r1 * 4
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0127 }
            int r3 = r3 * r1
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0127 }
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r1 = X.BE9.A0w(r1, r5)     // Catch:{ all -> 0x0127 }
            r1.rewind()     // Catch:{ all -> 0x0127 }
        L_0x0030:
            r1.get(r3)     // Catch:{ all -> 0x0127 }
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            goto L_0x0104
        L_0x0036:
            r8 = 0
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            android.media.Image$Plane[] r1 = r1.getPlanes()     // Catch:{ all -> 0x0127 }
            int r3 = r1.length     // Catch:{ all -> 0x0127 }
            r1 = 3
            boolean r3 = X.AnonymousClass000.A1T(r3, r1)
            java.lang.String r1 = "Cached image should either have 1 or 3 planes"
            X.C17960vV.A0F(r3, r1)     // Catch:{ all -> 0x0127 }
            boolean r1 = r0.shouldUseArgbApiForLastFrame     // Catch:{ all -> 0x0127 }
            r7 = 2
            if (r1 == 0) goto L_0x00f2
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            int r3 = r1.getWidth()     // Catch:{ all -> 0x0127 }
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0127 }
            int r3 = r3 * r1
            int r1 = r3 * 4
        L_0x005c:
            java.nio.ByteBuffer r3 = r0.A09     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x0066
            int r3 = r3.capacity()     // Catch:{ all -> 0x0127 }
            if (r3 == r1) goto L_0x006c
        L_0x0066:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x0127 }
            r0.A09 = r3     // Catch:{ all -> 0x0127 }
        L_0x006c:
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            android.media.Image$Plane[] r3 = r3.getPlanes()     // Catch:{ all -> 0x0127 }
            r6 = r3[r5]     // Catch:{ all -> 0x0127 }
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            android.media.Image$Plane[] r3 = r3.getPlanes()     // Catch:{ all -> 0x0127 }
            r5 = r3[r4]     // Catch:{ all -> 0x0127 }
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            android.media.Image$Plane[] r3 = r3.getPlanes()     // Catch:{ all -> 0x0127 }
            r4 = r3[r7]     // Catch:{ all -> 0x0127 }
            boolean r3 = r0.shouldUseArgbApiForLastFrame     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x00c2
            java.nio.ByteBuffer r9 = r6.getBuffer()     // Catch:{ all -> 0x0127 }
            int r10 = r6.getRowStride()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r11 = r5.getBuffer()     // Catch:{ all -> 0x0127 }
            int r12 = r5.getRowStride()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r13 = r4.getBuffer()     // Catch:{ all -> 0x0127 }
            int r14 = r4.getRowStride()     // Catch:{ all -> 0x0127 }
            int r15 = r5.getPixelStride()     // Catch:{ all -> 0x0127 }
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            int r16 = r3.getWidth()     // Catch:{ all -> 0x0127 }
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            int r17 = r3.getHeight()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r3 = r0.A09     // Catch:{ all -> 0x0127 }
            r18 = r3
            com.whatsapp.VideoFrameConverter.convertAndroid420toARGB(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0127 }
        L_0x00b7:
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r1 = r0.A09     // Catch:{ all -> 0x0127 }
            r1.rewind()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r1 = r0.A09     // Catch:{ all -> 0x0127 }
            goto L_0x0030
        L_0x00c2:
            java.nio.ByteBuffer r9 = r6.getBuffer()     // Catch:{ all -> 0x0127 }
            int r10 = r6.getRowStride()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r11 = r5.getBuffer()     // Catch:{ all -> 0x0127 }
            int r12 = r5.getRowStride()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r13 = r4.getBuffer()     // Catch:{ all -> 0x0127 }
            int r14 = r4.getRowStride()     // Catch:{ all -> 0x0127 }
            int r15 = r5.getPixelStride()     // Catch:{ all -> 0x0127 }
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            int r16 = r3.getWidth()     // Catch:{ all -> 0x0127 }
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            int r17 = r3.getHeight()     // Catch:{ all -> 0x0127 }
            java.nio.ByteBuffer r3 = r0.A09     // Catch:{ all -> 0x0127 }
            r18 = r3
            com.whatsapp.VideoFrameConverter.convertAndroid420toI420(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0127 }
            goto L_0x00b7
        L_0x00f2:
            android.media.Image r1 = r0.A08     // Catch:{ all -> 0x0127 }
            int r1 = r1.getWidth()     // Catch:{ all -> 0x0127 }
            int r1 = r1 * 3
            android.media.Image r3 = r0.A08     // Catch:{ all -> 0x0127 }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x0127 }
            int r1 = r1 * r3
            int r1 = r1 / r7
            goto L_0x005c
        L_0x0104:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r1 = r0.A0C
            int r4 = r1.width
            int r5 = r1.height
            if (r8 == 0) goto L_0x0118
            X.BwJ r2 = X.C24153BwJ.A00
        L_0x010e:
            int r6 = r1.orientation
            boolean r7 = r1.isFrontCamera
            X.9gQ r1 = new X.9gQ
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x0118:
            boolean r0 = r0.shouldUseArgbApiForLastFrame
            if (r0 == 0) goto L_0x011f
            X.BwI r2 = X.C24152BwI.A00
            goto L_0x010e
        L_0x011f:
            int r0 = r1.format
            X.BwH r2 = new X.BwH
            r2.<init>(r0)
            goto L_0x010e
        L_0x0127:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0127 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24156BwM.getLastCachedFrame():X.9gQ");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw BE6.A0v("VoipCameraApi2 does not support this operation ATM");
    }

    public boolean hasLastCachedFrame() {
        boolean A1W;
        synchronized (this.A0J) {
            A1W = AnonymousClass000.A1W(this.A08);
        }
        return A1W;
    }

    public boolean isCameraOpen() {
        return AnonymousClass000.A1T(this.A00, 2);
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoPort null while receiving frames");
            return;
        }
        CZE cze = this.textureHolder;
        if (cze != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0C;
            videoPort.renderTexture(cze, cameraInfo.width, cameraInfo.height);
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        VideoPort videoPort2 = this.videoPort;
        int i = 0;
        if (videoPort2 != videoPort) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
            A10.append(AnonymousClass001.A0l(videoPort));
            A10.append(" from ");
            A10.append(AnonymousClass001.A0l(videoPort2));
            A10.append(", status: ");
            C17900vP.A0o(A10, this.A00);
            if (videoPort == null) {
                stopOnCameraThread();
                this.videoPort = null;
            } else if (this.A06) {
                i = -10;
            } else {
                this.videoPort = videoPort;
                videoPort.setScaleType(0);
                int i2 = this.A00;
                if (i2 == 2) {
                    if (videoPort2 != null) {
                        releaseTexture();
                    }
                    i = A00(this);
                } else if (i2 == 0 || i2 == 1) {
                    i = startOnCameraThread();
                }
                if (i != 0) {
                    this.videoPort = videoPort2;
                }
            }
        }
        if (C18020vd.A05(C18040vf.A02, this.abProps, 7585)) {
            Iterator it = this.cameraEventsDispatcher.A00.iterator();
            while (it.hasNext()) {
                ((C28608E9z) it.next()).Ble(i);
            }
        }
        return i;
    }

    public int startOnCameraThread() {
        String str;
        int i = this.A00;
        if (!(i == 2 || i == 3 || this.videoPort == null)) {
            if (i == 1) {
                Log.i("voip/video/VoipCamera/ Camera device is not fully closed, create camera device on close");
                this.A05 = true;
            } else if (A0K.get()) {
                Log.i("voip/video/VoipCamera/retryOpen");
                if (this.A04 == null) {
                    C146787Qp r3 = new C146787Qp(this, 28);
                    this.A04 = r3;
                    this.cameraThreadHandler.postDelayed(r3, 250);
                    return 0;
                }
            } else {
                try {
                    Log.i("voip/video/VoipCamera/ opening camera");
                    this.A0F.openCamera(Integer.toString(this.A0D), this.A0E, this.cameraThreadHandler);
                    this.A00 = 3;
                    if (this.textureHolder == null) {
                        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0C;
                        createTexture(cameraInfo.width, cameraInfo.height);
                        if (this.textureHolder == null) {
                            return -12;
                        }
                    }
                } catch (CameraAccessException e) {
                    e = e;
                    str = "voip/video/VoipCamera/ failed to open camera ";
                    Log.e(str, e);
                    return -4;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    str = "voip/video/VoipCamera/ failed to open camera due to crashed HAL ";
                    Log.e(str, e);
                    return -4;
                }
            }
        }
        return 0;
    }

    public int toggleCameraProcessorOnCameraThread(boolean z) {
        int i;
        int i2 = 0;
        if (this.isBoundToCameraProcessor == z) {
            Log.i("voip/video/VoipCamera/ No toggling required.");
        } else {
            C28596E9n bindableCameraProcessorFromProvider = getBindableCameraProcessorFromProvider();
            if (bindableCameraProcessorFromProvider == null) {
                return -11;
            }
            if (this.A06) {
                Log.e("voip/video/VoipCamera/ Failed to toggle camera processor. Configuring session!");
                return -10;
            }
            if (this.videoPort != null) {
                releaseTexture();
            }
            if (z) {
                Handler handler = this.cameraThreadHandler;
                C28629EBc eBc = this.A03;
                if (eBc == null) {
                    eBc = new C26360CyM(this, 0);
                    this.A03 = eBc;
                }
                bindableCameraProcessorFromProvider.BD8(handler, eBc);
            } else {
                synchronized (this.A0J) {
                    A03(this);
                    bindableCameraProcessorFromProvider.CQ5();
                }
                this.A0G.setOnImageAvailableListener(new C26357CyJ(this, 4), this.cameraThreadHandler);
            }
            this.isBoundToCameraProcessor = z;
            if (this.A00 == 2) {
                i2 = A00(this);
            }
            if (z) {
                i = 1;
            } else {
                i = this.A0C.format;
            }
            Iterator A0l = C17890vO.A0l(this.virtualCameras);
            while (A0l.hasNext()) {
                VoipPhysicalCamera.CameraInfo cameraInfo = this.A0C;
                ((VoipCamera) A0l.next()).formatChangeCallback(cameraInfo.width, cameraInfo.height, i, cameraInfo.fps1000);
            }
        }
        return i2;
    }

    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            syncRunOnCameraThread(new C27132DVt((Object) this, 31), BE7.A0Y());
        }
    }

    public static void A02(ImageReader imageReader, C24156BwM bwM) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            C24156BwM bwM2 = bwM;
            Iterator A15 = AnonymousClass000.A15(bwM2.virtualCameras);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (((VoipCamera) A16.getValue()).started) {
                    VoipCamera voipCamera = (VoipCamera) A16.getValue();
                    bwM2.updateCameraCallbackCheck();
                    int length = acquireLatestImage.getPlanes().length;
                    Image.Plane plane = acquireLatestImage.getPlanes()[0];
                    if (length == 1) {
                        voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride());
                    } else {
                        Image.Plane plane2 = acquireLatestImage.getPlanes()[1];
                        Image.Plane plane3 = acquireLatestImage.getPlanes()[2];
                        voipCamera.framePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride());
                    }
                }
            }
            synchronized (bwM2.A0J) {
                Image image = bwM2.A08;
                if (image != null) {
                    image.close();
                }
                bwM2.A08 = acquireLatestImage;
            }
        }
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        CameraDevice cameraDevice = this.A01;
        if (cameraDevice != null) {
            this.A01 = null;
            this.A00 = 1;
            A0K.set(true);
            this.A0I.CGN(new VoipCameraApi2$StopCameraRunnable(cameraDevice));
        }
        Surface surface = this.A02;
        if (surface != null) {
            surface.release();
            this.A02 = null;
        }
        releaseTexture();
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.cameraThreadHandler.removeCallbacks(runnable);
            this.A04 = null;
        }
        this.A05 = false;
        this.A06 = false;
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24156BwM(Context context, HandlerThread handlerThread, AnonymousClass11C r22, C18030ve r23, AnonymousClass1DC r24, AnonymousClass10I r25, AnonymousClass00H r26, AnonymousClass00H r27, int i, int i2, int i3, int i4, int i5) {
        super(r23, r24, r26, r27, handlerThread);
        AnonymousClass11C r2 = r22;
        this.A0H = r2;
        this.A0I = r25;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/video/VoipCamera/create idx: ");
        int i6 = i;
        A10.append(i6);
        A10.append(", size:");
        int i7 = i2;
        BE8.A1C(A10, i7);
        int i8 = i3;
        A10.append(i8);
        int i9 = i4;
        BE9.A1J(", format: 0x", A10, i9);
        A10.append(", fps * 1000: ");
        int i10 = i5;
        A10.append(i10);
        C17900vP.A0Y(this, ", api 2, this ", A10);
        CameraManager A0B2 = r2.A0B();
        C17960vV.A07(A0B2);
        this.A0F = A0B2;
        this.A0D = i6;
        try {
            CameraCharacteristics cameraCharacteristics = A0B2.getCameraCharacteristics(Integer.toString(i6));
            this.A0B = cameraCharacteristics;
            Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            C17960vV.A07(obj);
            Object obj2 = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            C17960vV.A07(obj2);
            VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i7, i8, i9, i10, AnonymousClass000.A1P(AnonymousClass000.A0M(obj2)), ((Number) obj).intValue(), i6);
            this.A0C = cameraInfo;
            ImageReader newInstance = ImageReader.newInstance(cameraInfo.width, cameraInfo.height, cameraInfo.format, 3);
            this.A0G = newInstance;
            C28596E9n bindableCameraProcessorFromProvider = getBindableCameraProcessorFromProvider();
            if (bindableCameraProcessorFromProvider != null) {
                Handler handler = this.cameraThreadHandler;
                C28629EBc eBc = this.A03;
                if (eBc == null) {
                    eBc = new C26360CyM(this, 0);
                    this.A03 = eBc;
                }
                bindableCameraProcessorFromProvider.BD8(handler, eBc);
                this.isBoundToCameraProcessor = true;
            } else {
                newInstance.setOnImageAvailableListener(new C26357CyJ(this, 4), this.cameraThreadHandler);
            }
            if (AnonymousClass112.A09()) {
                this.A0A = A05(context);
            }
        } catch (CameraAccessException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
