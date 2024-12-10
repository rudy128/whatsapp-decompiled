package com.whatsapp.voipcalling.camera;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEB;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C22892BUd;
import X.C25742ClC;
import X.C26357CyJ;
import X.C26702DAa;
import X.C27132DVt;
import X.C28416E0h;
import X.C28417E0i;
import X.C28597E9o;
import X.CDT;
import X.CM5;
import X.CM6;
import X.CM7;
import X.CZE;
import X.DAZ;
import X.DRC;
import X.E2z;
import X.E48;
import X.E8J;
import X.E93;
import X.EDA;
import X.EDC;
import X.EDD;
import X.EDE;
import X.EDK;
import X.EDL;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class VoipLiteCamera extends VoipPhysicalCamera implements E8J {
    public static final CDT Companion = new Object();
    public static final int DEFAULT_SUPERNOVA_HEIGHT = 720;
    public static final int DEFAULT_SUPERNOVA_ORIENTATION = 90;
    public static final int DEFAULT_SUPERNOVA_WIDTH = 1280;
    public static final int MAX_SURFACE_ROTATION = 4;
    public Point adjustedPreviewSize;
    public ByteBuffer cachedBuffer;
    public Image cachedImage;
    public final ReentrantLock cachedImageLock;
    public final VoipPhysicalCamera.CameraInfo cameraInfo;
    public final E93 cameraStateListener;
    public final Context ctx;
    public final C28597E9o glassesService;
    public ImageReader imageReader;
    public final boolean isSupernovaCamera;
    public final EDL liteCameraController;
    public final E48 previewFrameListener = new C26702DAa(this, 3);
    public final C28417E0i renderingStartedListener;
    public boolean running;
    public final AnonymousClass11C systemServices;

    public static final void maybeInitSUPCamera$lambda$9(VoipLiteCamera voipLiteCamera, ImageReader imageReader2) {
        C18070vi.A0d(voipLiteCamera, 0);
        C18070vi.A0b(imageReader2);
        voipLiteCamera.imageAvailableListener(imageReader2);
    }

    public static final void renderingStartedListener$lambda$0(VoipLiteCamera voipLiteCamera) {
        C18070vi.A0d(voipLiteCamera, 0);
        voipLiteCamera.liteCameraController.CK7(voipLiteCamera.previewFrameListener);
    }

    public static final Integer updatePreviewOrientation$lambda$8(VoipLiteCamera voipLiteCamera) {
        C18070vi.A0d(voipLiteCamera, 0);
        voipLiteCamera.updateAdjustedPreviewSizeOnCameraThread();
        return 0;
    }

    public boolean canBindToCameraProcessor() {
        return false;
    }

    public int getCameraStartMode() {
        return 0;
    }

    public void onSurfaceAvailable(Object obj) {
    }

    public void onSurfaceSizeChanged(Object obj, int i, int i2) {
        C18070vi.A0d(obj, 0);
        if (obj instanceof SurfaceTexture) {
            ((EDD) this.liteCameraController.BP7(EDD.A00)).CKA((SurfaceTexture) obj, i, i2);
        } else if (obj instanceof Surface) {
            ((EDD) this.liteCameraController.BP7(EDD.A00)).CKB((Surface) obj, i, i2);
        }
    }

    public int toggleCameraProcessorOnCameraThread(boolean z) {
        return -15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoipLiteCamera(X.C18030ve r22, X.AnonymousClass1DC r23, int r24, int r25, int r26, int r27, int r28, X.AnonymousClass11C r29, android.content.Context r30, boolean r31, X.C28597E9o r32) {
        /*
            r21 = this;
            r2 = r22
            r1 = r23
            X.C18070vi.A0j(r2, r1)
            r0 = 8
            r6 = r29
            X.C18070vi.A0d(r6, r0)
            r0 = 9
            r4 = r30
            X.C18070vi.A0d(r4, r0)
            r18 = 0
            r15 = r21
            r20 = r18
            r16 = r2
            r17 = r1
            r19 = r18
            r15.<init>(r16, r17, r18, r19, r20)
            r15.systemServices = r6
            r15.ctx = r4
            r7 = r31
            r15.isSupernovaCamera = r7
            r0 = r32
            r15.glassesService = r0
            java.lang.String r0 = "whatsapp_smartglasses"
            r13 = 0
            X.Cgc r8 = new X.Cgc
            r8.<init>((java.lang.String) r0)
            X.CdJ r0 = X.ED5.A00
            r5 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.util.Map r1 = r8.A00
            r1.put(r0, r2)
            X.CdJ r0 = X.EB0.A01
            r1.put(r0, r2)
            X.CdJ r0 = X.EBD.A0F
            X.BE7.A1J(r0, r1, r13)
            X.CdJ r0 = X.ED8.A00
            r1.put(r0, r2)
            X.CdJ r0 = X.EBD.A0I
            r1.put(r0, r2)
            X.Ch9 r3 = new X.Ch9
            r3.<init>(r8)
            X.DEG r2 = new X.DEG
            r2.<init>()
            X.CjF r1 = X.C25629CjF.A00
            X.E7c[] r0 = new X.C28552E7c[r5]
            r0[r13] = r2
            X.DDT r0 = r1.A00(r4, r3, r0)
            X.DAT r5 = new X.DAT
            r5.<init>(r0)
            r15.liteCameraController = r5
            r2 = 1
            X.DAP r4 = new X.DAP
            r4.<init>(r2)
            r15.cameraStateListener = r4
            r1 = 3
            X.DAa r0 = new X.DAa
            r0.<init>(r15, r1)
            r15.previewFrameListener = r0
            X.DAc r3 = new X.DAc
            r3.<init>(r15, r2)
            r15.renderingStartedListener = r3
            r14 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            if (r31 != 0) goto L_0x00cb
            X.BUd r1 = X.EDA.A00
            X.EA4 r0 = r5.A00
            boolean r0 = r0.BeL(r1)
            if (r0 == 0) goto L_0x00c4
            android.hardware.camera2.CameraManager r1 = r6.A0B()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ CameraAccessException -> 0x00b4 }
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r0)     // Catch:{ CameraAccessException -> 0x00b4 }
            X.C18070vi.A0X(r1)     // Catch:{ CameraAccessException -> 0x00b4 }
            goto L_0x00db
        L_0x00b4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/video/VoipCamera/ failed to open camera index "
            X.C17900vP.A0i(r0, r1, r14)
            throw r2
        L_0x00bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
            throw r0
        L_0x00c4:
            java.lang.String r0 = "There is no Preview Controller component in litecamera. This is needed for non-supernova cameras. Please ensure Optic is included in Litecamera aar"
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        L_0x00cb:
            r6 = 90
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15.cameraInfo = r0
            goto L_0x00fd
        L_0x00db:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0105
            int r0 = X.AnonymousClass000.A0M(r0)
            boolean r12 = X.AnonymousClass000.A1P(r0)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r7 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.cameraInfo = r7
            boolean r0 = r7.isFrontCamera
            r5.CJA(r0)
            r5.BB3(r4)
            r5.CK9(r3)
        L_0x00fd:
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r15.cachedImageLock = r0
            return
        L_0x0105:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipLiteCamera.<init>(X.0ve, X.1DC, int, int, int, int, int, X.11C, android.content.Context, boolean, X.E9o):void");
    }

    /* access modifiers changed from: private */
    public final void frameCallbackInternal(E2z e2z) {
        updateCameraCallbackCheck();
        Iterator A15 = AnonymousClass000.A15(this.virtualCameras);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (((VoipCamera) A16.getValue()).started) {
                DRC drc = (DRC) e2z;
                int i = drc.A01;
                if (i == 1) {
                    ((VoipCamera) A16.getValue()).abgrFramePlaneCallback(drc.A02, drc.A00, ((DAZ) drc.A03.A00[0]).A02, Integer.valueOf(((DAZ) drc.A05.A00[0]).A01).intValue());
                } else if (i == 3) {
                    int i2 = drc.A02;
                    int i3 = drc.A00;
                    C28416E0h[] e0hArr = drc.A03.A00;
                    ByteBuffer byteBuffer = ((DAZ) e0hArr[0]).A02;
                    C28416E0h[] e0hArr2 = drc.A05.A00;
                    ((VoipCamera) A16.getValue()).framePlaneCallback(i2, i3, byteBuffer, Integer.valueOf(((DAZ) e0hArr2[0]).A01).intValue(), ((DAZ) e0hArr[1]).A02, Integer.valueOf(((DAZ) e0hArr2[1]).A01).intValue(), ((DAZ) e0hArr[2]).A02, Integer.valueOf(((DAZ) e0hArr2[2]).A01).intValue(), Integer.valueOf(((DAZ) drc.A04.A00[2]).A00).intValue());
                }
            }
        }
    }

    private final void maybeInitSUPCamera() {
        Log.i("voip/video/VoipCamera/ Initializing SUP Camera");
        if (this.glassesService != null) {
            if (this.imageReader == null) {
                Log.i("voip/video/VoipCamera/ Initializing SUP Camera. Constructing image reader. ");
                ImageReader newInstance = ImageReader.newInstance(DEFAULT_SUPERNOVA_WIDTH, DEFAULT_SUPERNOVA_HEIGHT, 1, 3);
                C18070vi.A0X(newInstance);
                newInstance.setOnImageAvailableListener(new C26357CyJ(this, 5), this.cameraThreadHandler);
                C25742ClC clC = new C25742ClC(newInstance.getSurface(), false);
                clC.A01 = this.cameraInfo.orientation;
                ((EDE) this.liteCameraController.BP7(EDE.A00)).BBa(clC);
                this.imageReader = newInstance;
            }
            EDL edl = this.liteCameraController;
            C22892BUd bUd = EDA.A00;
            if (edl.BeL(bUd)) {
                this.liteCameraController.BP7(bUd).BIn();
            }
            EDK BP7 = this.liteCameraController.BP7(EDC.A01);
            C18070vi.A0X(BP7);
            EDE ede = (EDE) this.liteCameraController.BP7(EDE.A00);
            C28597E9o e9o = this.glassesService;
            C18070vi.A0b(ede);
            e9o.BnY((EDC) BP7, ede);
            Iterator A15 = AnonymousClass000.A15(this.virtualCameras);
            while (A15.hasNext()) {
                ((VoipCamera) C17890vO.A0P(A15)).formatChangeCallback(DEFAULT_SUPERNOVA_WIDTH, DEFAULT_SUPERNOVA_HEIGHT, 1, this.cameraInfo.fps1000);
            }
            Log.i("voip/video/VoipCamera/ Done Initializing SUP Camera");
            return;
        }
        throw AnonymousClass000.A0n("Media Stream Lite Camera Coordinator's SUP Delegate is invalid: Null: true");
    }

    private final void updateAdjustedPreviewSizeOnCameraThread() {
        int rotation = this.systemServices.A0L().getDefaultDisplay().getRotation();
        this.adjustedPreviewSize = calculateAdjustedPreviewSize(rotation, this.cameraInfo);
        CZE cze = this.textureHolder;
        if (cze != null) {
            cze.A05 = 4 - rotation;
        }
    }

    /* JADX INFO: finally extract failed */
    public void closeOnCameraThread() {
        this.liteCameraController.pause();
        this.liteCameraController.destroy();
        ReentrantLock reentrantLock = this.cachedImageLock;
        reentrantLock.lock();
        try {
            Image image = this.cachedImage;
            if (image != null) {
                image.close();
            }
            this.cachedImage = null;
            ImageReader imageReader2 = this.imageReader;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            reentrantLock.unlock();
            VideoPort videoPort = this.videoPort;
            if (videoPort != null) {
                videoPort.setPassthroughVideoPortCallback((E8J) null);
            }
            this.cameraEventsDispatcher.A00();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.cameraInfo;
    }

    public final C28597E9o getGlassesService() {
        return this.glassesService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r2.length != 3) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[Catch:{ all -> 0x0113 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187819gQ getLastCachedFrame() {
        /*
            r19 = this;
            r1 = r19
            java.util.concurrent.locks.ReentrantLock r0 = r1.cachedImageLock
            r0.lock()
            android.media.Image r4 = r1.cachedImage     // Catch:{ all -> 0x0113 }
            if (r4 == 0) goto L_0x010e
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            int r2 = r2.length     // Catch:{ all -> 0x0113 }
            if (r2 != r6) goto L_0x005e
            r8 = 1
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            r2 = r2[r7]     // Catch:{ all -> 0x0113 }
            int r3 = r2.getPixelStride()     // Catch:{ all -> 0x0113 }
            int r2 = r4.getWidth()     // Catch:{ all -> 0x0113 }
            int r3 = r3 * r2
            int r2 = r4.getHeight()     // Catch:{ all -> 0x0113 }
            int r3 = r3 * r2
            byte[] r5 = new byte[r3]     // Catch:{ all -> 0x0113 }
            java.nio.ByteBuffer r2 = X.BE9.A0w(r4, r7)     // Catch:{ all -> 0x0113 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0113 }
            r2.rewind()     // Catch:{ all -> 0x0113 }
        L_0x0037:
            r2.get(r5)     // Catch:{ all -> 0x0113 }
        L_0x003a:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r2 = r1.cameraInfo     // Catch:{ all -> 0x0113 }
            int r6 = r2.width     // Catch:{ all -> 0x0113 }
            int r7 = r2.height     // Catch:{ all -> 0x0113 }
            if (r8 == 0) goto L_0x004f
            X.BwJ r4 = X.C24153BwJ.A00     // Catch:{ all -> 0x0113 }
        L_0x0044:
            int r8 = r2.orientation     // Catch:{ all -> 0x0113 }
            boolean r9 = r2.isFrontCamera     // Catch:{ all -> 0x0113 }
            X.9gQ r3 = new X.9gQ     // Catch:{ all -> 0x0113 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0113 }
            goto L_0x010f
        L_0x004f:
            boolean r1 = r1.shouldUseArgbApiForLastFrame     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x0056
            X.BwI r4 = X.C24152BwI.A00     // Catch:{ all -> 0x0113 }
            goto L_0x0044
        L_0x0056:
            int r1 = r2.format     // Catch:{ all -> 0x0113 }
            X.BwH r4 = new X.BwH     // Catch:{ all -> 0x0113 }
            r4.<init>(r1)     // Catch:{ all -> 0x0113 }
            goto L_0x0044
        L_0x005e:
            r8 = 0
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x006a
            int r5 = r2.length     // Catch:{ all -> 0x0113 }
            r2 = 3
            r3 = 1
            if (r5 == r2) goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            java.lang.String r2 = "Cached image should either have 1 or 3 planes"
            X.C17960vV.A0F(r3, r2)     // Catch:{ all -> 0x0113 }
            boolean r2 = r1.shouldUseArgbApiForLastFrame     // Catch:{ all -> 0x0113 }
            r5 = 2
            if (r2 == 0) goto L_0x0100
            int r3 = r4.getWidth()     // Catch:{ all -> 0x0113 }
            int r2 = r4.getHeight()     // Catch:{ all -> 0x0113 }
            int r3 = r3 * r2
            int r3 = r3 * 4
        L_0x0080:
            java.nio.ByteBuffer r2 = r1.cachedBuffer     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00f9
            int r2 = r2.capacity()     // Catch:{ all -> 0x0113 }
            if (r2 != r3) goto L_0x00f9
        L_0x008a:
            java.nio.ByteBuffer r9 = X.BE9.A0w(r4, r7)     // Catch:{ all -> 0x0113 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x0113 }
            java.nio.ByteBuffer r11 = X.BE9.A0w(r4, r6)     // Catch:{ all -> 0x0113 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0113 }
            java.nio.ByteBuffer r13 = X.BE9.A0w(r4, r5)     // Catch:{ all -> 0x0113 }
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x0113 }
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            r2 = r2[r7]     // Catch:{ all -> 0x0113 }
            int r10 = r2.getRowStride()     // Catch:{ all -> 0x0113 }
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            r2 = r2[r6]     // Catch:{ all -> 0x0113 }
            int r12 = r2.getRowStride()     // Catch:{ all -> 0x0113 }
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            r2 = r2[r5]     // Catch:{ all -> 0x0113 }
            int r14 = r2.getRowStride()     // Catch:{ all -> 0x0113 }
            android.media.Image$Plane[] r2 = r4.getPlanes()     // Catch:{ all -> 0x0113 }
            r2 = r2[r5]     // Catch:{ all -> 0x0113 }
            int r15 = r2.getPixelStride()     // Catch:{ all -> 0x0113 }
            boolean r2 = r1.shouldUseArgbApiForLastFrame     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00e9
            int r16 = r4.getWidth()     // Catch:{ all -> 0x0113 }
            int r17 = r4.getHeight()     // Catch:{ all -> 0x0113 }
            java.nio.ByteBuffer r2 = r1.cachedBuffer     // Catch:{ all -> 0x0113 }
            r18 = r2
            com.whatsapp.VideoFrameConverter.convertAndroid420toARGB(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0113 }
        L_0x00da:
            byte[] r5 = new byte[r3]     // Catch:{ all -> 0x0113 }
            java.nio.ByteBuffer r2 = r1.cachedBuffer     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00e3
            r2.rewind()     // Catch:{ all -> 0x0113 }
        L_0x00e3:
            java.nio.ByteBuffer r2 = r1.cachedBuffer     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x003a
            goto L_0x0037
        L_0x00e9:
            int r16 = r4.getWidth()     // Catch:{ all -> 0x0113 }
            int r17 = r4.getHeight()     // Catch:{ all -> 0x0113 }
            java.nio.ByteBuffer r2 = r1.cachedBuffer     // Catch:{ all -> 0x0113 }
            r18 = r2
            com.whatsapp.VideoFrameConverter.convertAndroid420toI420(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0113 }
            goto L_0x00da
        L_0x00f9:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ all -> 0x0113 }
            r1.cachedBuffer = r2     // Catch:{ all -> 0x0113 }
            goto L_0x008a
        L_0x0100:
            int r2 = r4.getWidth()     // Catch:{ all -> 0x0113 }
            int r3 = r2 * 3
            int r2 = r4.getHeight()     // Catch:{ all -> 0x0113 }
            int r3 = r3 * r2
            int r3 = r3 / r5
            goto L_0x0080
        L_0x010e:
            r3 = 0
        L_0x010f:
            r0.unlock()
            return r3
        L_0x0113:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipLiteCamera.getLastCachedFrame():X.9gQ");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw BE6.A0v("VoipLiteCamera does not support this operation ATM");
    }

    public boolean hasLastCachedFrame() {
        ReentrantLock reentrantLock = this.cachedImageLock;
        reentrantLock.lock();
        try {
            return AnonymousClass000.A1W(this.cachedImage);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean isCameraOpen() {
        return this.running;
    }

    public void onFrameAvailableOnCameraThread() {
        throw BE6.A0v("We should not fire frame available in litecamera");
    }

    public void onSurfaceDestroyed(Object obj) {
        ((EDD) this.liteCameraController.BP7(EDD.A00)).CKA((SurfaceTexture) null, 0, 0);
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        Integer num;
        Integer num2;
        VideoPort videoPort2 = this.videoPort;
        if (!C18070vi.A18(videoPort2, videoPort)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/video/VoipCamera/ setVideoPortOnCameraThread to ");
            if (videoPort != null) {
                num = BE8.A0Z(videoPort);
            } else {
                num = null;
            }
            A10.append(num);
            A10.append(" from ");
            if (videoPort2 != null) {
                num2 = BE8.A0Z(videoPort2);
            } else {
                num2 = null;
            }
            C17900vP.A0b(num2, A10);
            if (videoPort2 != null) {
                videoPort2.setPassthroughVideoPortCallback((E8J) null);
            }
            if (videoPort == null) {
                ((EDD) this.liteCameraController.BP7(EDD.A00)).CKC((View) null);
                if (!this.isSupernovaCamera) {
                    stopOnCameraThread();
                }
                this.videoPort = null;
            } else {
                videoPort.setPassthroughVideoPortCallback(this);
                this.videoPort = videoPort;
                return startOnCameraThread();
            }
        }
        return 0;
    }

    public int startOnCameraThread() {
        if (this.running || (this.videoPort == null && !this.isSupernovaCamera)) {
            return 0;
        }
        updateAdjustedPreviewSizeOnCameraThread();
        this.liteCameraController.CG0();
        this.running = true;
        if (this.isSupernovaCamera) {
            maybeInitSUPCamera();
        }
        this.cameraEventsDispatcher.A01();
        return 0;
    }

    public int stopOnCameraThread() {
        this.liteCameraController.pause();
        this.running = false;
        ReentrantLock reentrantLock = this.cachedImageLock;
        reentrantLock.lock();
        try {
            Image image = this.cachedImage;
            if (image != null) {
                image.close();
            }
            this.cachedImage = null;
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            syncRunOnCameraThread(new C27132DVt((Object) this, 32), BE7.A0Y());
        }
    }

    private final void imageAvailableListener(ImageReader imageReader2) {
        ReentrantLock reentrantLock;
        Image acquireLatestImage = imageReader2.acquireLatestImage();
        if (acquireLatestImage != null) {
            if (!this.running) {
                reentrantLock = this.cachedImageLock;
                reentrantLock.lock();
                try {
                    Image image = this.cachedImage;
                    if (image != null) {
                        image.close();
                    }
                    this.cachedImage = null;
                    acquireLatestImage.close();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else {
                int length = acquireLatestImage.getPlanes().length;
                int width = acquireLatestImage.getWidth();
                int height = acquireLatestImage.getHeight();
                CM5 cm5 = new CM5(acquireLatestImage);
                CM7 cm7 = new CM7(acquireLatestImage);
                CM6 cm6 = new CM6(acquireLatestImage);
                updateCameraCallbackCheck();
                Iterator A15 = AnonymousClass000.A15(this.virtualCameras);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (((VoipCamera) A16.getValue()).started) {
                        if (length == 1) {
                            ((VoipCamera) A16.getValue()).abgrFramePlaneCallback(width, height, BE9.A0w(cm5.A00, 0), BEB.A06(cm7.A00, 0));
                        } else if (length == 3) {
                            Image image2 = cm5.A00;
                            ByteBuffer A0w = BE9.A0w(image2, 0);
                            Image image3 = cm7.A00;
                            ((VoipCamera) A16.getValue()).framePlaneCallback(width, height, A0w, BEB.A06(image3, 0), BE9.A0w(image2, 1), BEB.A06(image3, 1), BE9.A0w(image2, 2), BEB.A06(image3, 2), Integer.valueOf(cm6.A00.getPlanes()[2].getPixelStride()).intValue());
                        }
                    }
                }
                reentrantLock = this.cachedImageLock;
                reentrantLock.lock();
                Image image4 = this.cachedImage;
                if (image4 != null) {
                    image4.close();
                }
                this.cachedImage = acquireLatestImage;
            }
            reentrantLock.unlock();
        }
    }
}
