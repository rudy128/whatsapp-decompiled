package org.pjsip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1DC;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEA;
import X.C108985cd;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C187819gQ;
import X.C24151BwH;
import X.C24153BwJ;
import X.C24442C4c;
import X.C25180CaW;
import X.C26360CyM;
import X.C26791DDz;
import X.C26983DOf;
import X.C27132DVt;
import X.C28596E9n;
import X.C28608E9z;
import X.C28629EBc;
import X.CZE;
import X.Cy6;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.Image;
import android.media.ImageReader;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PjCamera extends VoipPhysicalCamera implements Camera.PreviewCallback {
    public volatile Point adjustedPreviewSize;
    public final int camIdx;
    public Camera camera;
    public final VoipPhysicalCamera.CameraInfo cameraInfo;
    public C28629EBc cameraProcessorImageListener = null;
    public final AtomicInteger cameraStartMode = new AtomicInteger(0);
    public final Object frameLock = C17880vN.A0p();
    public boolean isRunning;
    public volatile byte[] lastCachedFrameData;
    public volatile boolean newFrameAvailable;
    public boolean receivedCameraError = false;
    public final AnonymousClass11C systemServices;

    private int tryNextStartModeOnCameraThread() {
        this.isRunning = false;
        this.cameraStartMode.incrementAndGet();
        stopOnCameraThread();
        if (this.passiveMode || this.cameraStartMode.get() > 2) {
            return -8;
        }
        return startOnCameraThread();
    }

    public boolean canBindToCameraProcessor() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PjCamera(C18030ve r19, AnonymousClass1DC r20, AnonymousClass11C r21, AnonymousClass00H r22, AnonymousClass00H r23, HandlerThread handlerThread, int i, int i2, int i3, int i4, int i5) {
        super(r19, r20, r22, r23, handlerThread);
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
        A10.append(", this ");
        A10.append(this);
        A10.append(", class ");
        Class<?> cls = getClass();
        A10.append(cls);
        A10.append("@");
        A10.append(cls.hashCode());
        A10.append(", class loader ");
        Class<PjCamera> cls2 = PjCamera.class;
        A10.append(cls2.getClassLoader());
        A10.append(", hash: ");
        C17900vP.A0o(A10, System.identityHashCode(cls2.getClassLoader()));
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i6, cameraInfo2);
        this.systemServices = r21;
        this.camIdx = i6;
        this.cameraInfo = new VoipPhysicalCamera.CameraInfo(i7, i8, i9, i10, AnonymousClass000.A1T(cameraInfo2.facing, 1), cameraInfo2.orientation, i6);
        C28596E9n bindableCameraProcessorFromProvider = getBindableCameraProcessorFromProvider();
        if (bindableCameraProcessorFromProvider != null) {
            bindableCameraProcessorFromProvider.BD8(this.cameraThreadHandler, getCameraProcessorImageListener());
            this.isBoundToCameraProcessor = true;
        }
    }

    private C28629EBc getCameraProcessorImageListener() {
        C28629EBc eBc = this.cameraProcessorImageListener;
        if (eBc != null) {
            return eBc;
        }
        C26360CyM cyM = new C26360CyM(this, 1);
        this.cameraProcessorImageListener = cyM;
        return cyM;
    }

    private int preparePreviewOnCameraThread() {
        C17960vV.A07(this.videoPort);
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        createTexture(cameraInfo2.width, cameraInfo2.height);
        try {
            C28596E9n cameraProcessorIfBoundToCameraProcessor = getCameraProcessorIfBoundToCameraProcessor();
            if (cameraProcessorIfBoundToCameraProcessor == null || this.textureHolder == null) {
                CZE cze = this.textureHolder;
                if (cze != null) {
                    Camera camera2 = this.camera;
                    C17960vV.A07(camera2);
                    camera2.setPreviewTexture(cze.A01);
                } else {
                    Log.e("voip/video/VoipCamera/ Failed to create Surface Texture");
                    return -12;
                }
            } else {
                C26791DDz dDz = (C26791DDz) ((C26983DOf) cameraProcessorIfBoundToCameraProcessor).A0F.getValue();
                SurfaceTexture surfaceTexture = dDz.A03;
                if (surfaceTexture == null) {
                    surfaceTexture = C26791DDz.A00(dDz);
                }
                VoipPhysicalCamera.CameraInfo cameraInfo3 = this.cameraInfo;
                surfaceTexture.setDefaultBufferSize(cameraInfo3.width, cameraInfo3.height);
                Camera camera3 = this.camera;
                C17960vV.A07(camera3);
                camera3.setPreviewTexture(surfaceTexture);
            }
            this.videoPort.setScaleType(0);
            return 0;
        } catch (IOException e) {
            Log.e((Throwable) e);
            return -2;
        }
    }

    private int setVideoPortOnCameraThreadInternal(VideoPort videoPort) {
        VideoPort videoPort2 = this.videoPort;
        int i = 0;
        if (videoPort2 != videoPort) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
            A10.append(AnonymousClass001.A0l(videoPort));
            A10.append(" from ");
            A10.append(AnonymousClass001.A0l(videoPort2));
            A10.append(", running: ");
            C17900vP.A0r(A10, this.isRunning);
            if (!this.isRunning) {
                this.videoPort = videoPort;
                if (!(videoPort == null || (i = startOnCameraThread()) == 0)) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                }
            } else if (videoPort != null) {
                stopPreviewOnCameraThread(true);
                this.videoPort = videoPort;
                if (preparePreviewOnCameraThread() != 0) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                    return -7;
                }
                boolean z = this.isBoundToCameraProcessor;
                Camera camera2 = this.camera;
                C17960vV.A07(camera2);
                if (z) {
                    camera2.setPreviewCallback((Camera.PreviewCallback) null);
                } else {
                    camera2.setPreviewCallback(this);
                }
                int updatePreviewOrientationOnCameraThread = updatePreviewOrientationOnCameraThread();
                this.camera.startPreview();
                return updatePreviewOrientationOnCameraThread;
            } else {
                int stopOnCameraThread = stopOnCameraThread();
                this.videoPort = null;
                return stopOnCameraThread;
            }
        }
        return i;
    }

    private void stopPreviewOnCameraThread(boolean z) {
        if (z && !this.receivedCameraError) {
            try {
                Camera camera2 = this.camera;
                C17960vV.A07(camera2);
                camera2.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                this.camera.stopPreview();
            } catch (RuntimeException e) {
                Log.e("voip/video/VoipCamera/stopPreviewOnCameraThread exception while calling stopPreview", e);
            }
        }
        releaseTexture();
    }

    /* access modifiers changed from: private */
    public int updatePreviewOrientationOnCameraThread() {
        int i;
        if (this.videoPort == null || !this.isRunning) {
            return -1;
        }
        int rotation = this.systemServices.A0L().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i = 90;
        } else if (rotation != 2) {
            i = 270;
            if (rotation != 3) {
                i = 0;
            }
        } else {
            i = 180;
        }
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        boolean z = cameraInfo2.isFrontCamera;
        int i2 = cameraInfo2.orientation;
        int i3 = (i2 - i) + 360;
        if (z) {
            i3 = 360 - ((i2 + i) % 360);
        }
        int i4 = i3 % 360;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/video/VoipCamera/updatePreviewOrientationOnCameraThread to ");
        A10.append(i4);
        A10.append(" degree. Camera #");
        A10.append(this.camIdx);
        A10.append(", facing front: ");
        A10.append(z);
        A10.append(", camera orientation: ");
        A10.append(i2);
        C17900vP.A0j(", activity rotation: ", A10, i);
        try {
            Camera camera2 = this.camera;
            C17960vV.A07(camera2);
            camera2.setDisplayOrientation(i4);
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
        this.adjustedPreviewSize = calculateAdjustedPreviewSize(rotation, this.cameraInfo);
        return 0;
    }

    public void closeOnCameraThread() {
        Log.i("voip/video/VoipCamera/closeOnCameraThread");
        C17960vV.A0F(!this.isRunning, "close should only be called after stop.");
        this.cameraEventsDispatcher.A00();
        C28596E9n cameraProcessorIfBoundToCameraProcessor = getCameraProcessorIfBoundToCameraProcessor();
        if (cameraProcessorIfBoundToCameraProcessor != null) {
            cameraProcessorIfBoundToCameraProcessor.CQ5();
        }
        this.isBoundToCameraProcessor = false;
    }

    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z = this.isBoundToCameraProcessor;
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        if (z) {
            return new VoipPhysicalCamera.CameraInfo(cameraInfo2.width, cameraInfo2.height, 1, cameraInfo2.fps1000, cameraInfo2.isFrontCamera, cameraInfo2.orientation, cameraInfo2.idx);
        }
        return cameraInfo2;
    }

    public int getCameraStartMode() {
        return this.cameraStartMode.get();
    }

    public C187819gQ getLastCachedFrame() {
        C24442C4c bwH;
        byte[] bArr = this.lastCachedFrameData;
        if (bArr == null) {
            return null;
        }
        boolean z = this.isBoundToCameraProcessor;
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        int i = cameraInfo2.width;
        int i2 = cameraInfo2.height;
        if (z) {
            bwH = C24153BwJ.A00;
        } else {
            bwH = new C24151BwH(cameraInfo2.format);
        }
        return new C187819gQ(bwH, bArr, i, i2, cameraInfo2.orientation, cameraInfo2.isFrontCamera);
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        C17960vV.A0F(this.passiveMode, "Should be here only in passive mode");
        if (!this.passiveMode) {
            return -1;
        }
        synchronized (this.frameLock) {
            if (!this.newFrameAvailable) {
                return 0;
            }
            int min = Math.min(byteBuffer.capacity(), this.lastCachedFrameData.length);
            byteBuffer.rewind();
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.put(this.lastCachedFrameData, 0, min);
            this.newFrameAvailable = false;
            return min;
        }
    }

    public boolean hasLastCachedFrame() {
        return AnonymousClass000.A1W(this.lastCachedFrameData);
    }

    public boolean isCameraOpen() {
        return this.isRunning;
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoPort null while receiving frames");
            return;
        }
        CZE cze = this.textureHolder;
        if (cze != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
            videoPort.renderTexture(cze, cameraInfo2.width, cameraInfo2.height);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera2) {
        byte[] bArr2;
        if (camera2 != null && bArr != null) {
            Camera camera3 = this.camera;
            if (camera2 != camera3) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unexpected camera in callback! current camera = ");
                A10.append(camera3);
                Log.w(AnonymousClass001.A1E(camera2, ", callback camera is ", A10));
                return;
            }
            updateCameraCallbackCheck();
            if (this.isRunning) {
                if (this.passiveMode) {
                    synchronized (this.frameLock) {
                        bArr2 = this.lastCachedFrameData;
                        this.lastCachedFrameData = bArr;
                        this.newFrameAvailable = true;
                    }
                    bArr = bArr2;
                } else {
                    Iterator A15 = AnonymousClass000.A15(this.virtualCameras);
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        if (((VoipCamera) A16.getValue()).started) {
                            ((VoipCamera) A16.getValue()).frameCallback(bArr, bArr.length);
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            if (this.cameraStartMode.get() == 0) {
                camera2.addCallbackBuffer(bArr);
            }
        }
    }

    public int startOnCameraThread() {
        StringBuilder sb;
        String str;
        List<int[]> supportedPreviewFpsRange;
        if (!this.isRunning) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/video/VoipCamera/startOnCameraThread. ENTER. videoPort = ");
            A10.append(this.videoPort);
            A10.append(" at start mode: ");
            C17900vP.A0b(this.cameraStartMode, A10);
            if (this.camera == null) {
                try {
                    Camera open = Camera.open(this.camIdx);
                    this.camera = open;
                    if (open == null) {
                        Log.e("camera is null after open");
                        return -5;
                    }
                    open.setErrorCallback(new Cy6(this, 2));
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return -4;
                }
            }
            if (this.videoPort != null) {
                if (preparePreviewOnCameraThread() != 0) {
                    return -2;
                }
                try {
                    Camera.Parameters parameters = this.camera.getParameters();
                    VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
                    parameters.setPreviewSize(cameraInfo2.width, cameraInfo2.height);
                    parameters.setPreviewFormat(this.cameraInfo.format);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("voip/video/VoipCamera/startOnCameraThread setting camera params at start mode: ");
                    A102.append(this.cameraStartMode);
                    A102.append(" width: ");
                    VoipPhysicalCamera.CameraInfo cameraInfo3 = this.cameraInfo;
                    A102.append(cameraInfo3.width);
                    A102.append(" height: ");
                    A102.append(cameraInfo3.height);
                    A102.append(" format: ");
                    C17900vP.A0o(A102, cameraInfo3.format);
                    if (this.cameraStartMode.get() > 2) {
                        this.cameraStartMode.set(2);
                    }
                    int i = 1;
                    if (!(this.cameraStartMode.get() == 2 || (supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange()) == null)) {
                        int i2 = Integer.MIN_VALUE;
                        int[] iArr = null;
                        for (int[] next : supportedPreviewFpsRange) {
                            if (next.length == 2) {
                                int i3 = next[0];
                                int i4 = next[1];
                                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(i3, i4, this.cameraInfo.fps1000);
                                StringBuilder A103 = AnonymousClass000.A10();
                                BEA.A1P("voip/video/VoipCamera/startOnCameraThread check fps [", ", ", A103, i3, i4);
                                C17900vP.A0j("], score: ", A103, fpsRangeScore);
                                if (fpsRangeScore > i2) {
                                    iArr = next;
                                    i2 = fpsRangeScore;
                                }
                            }
                        }
                        if (iArr != null) {
                            StringBuilder A104 = AnonymousClass000.A10();
                            A104.append("voip/video/VoipCamera/startOnCameraThread with fps range [");
                            A104.append(iArr[0]);
                            A104.append(", ");
                            A104.append(iArr[1]);
                            A104.append("], score: ");
                            A104.append(i2);
                            A104.append(", supported ranges : ");
                            C17890vO.A1A(A104, parameters.get("preview-fps-range-values"));
                            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                        }
                    }
                    if (this.cameraStartMode.get() == 0) {
                        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null) {
                            if (supportedFocusModes.contains("continuous-video")) {
                                parameters.setFocusMode("continuous-video");
                            } else if (supportedFocusModes.contains("infinity")) {
                                parameters.setFocusMode("infinity");
                            }
                        }
                        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                        if (!(supportedFlashModes == null || parameters.getFlashMode() == null || !supportedFlashModes.contains("off"))) {
                            parameters.setFlashMode("off");
                        }
                        if (parameters.isAutoExposureLockSupported()) {
                            parameters.setAutoExposureLock(false);
                        }
                        if (parameters.isAutoWhiteBalanceLockSupported()) {
                            parameters.setAutoWhiteBalanceLock(false);
                        }
                        StringBuilder A105 = AnonymousClass000.A10();
                        A105.append("voip/video/VoipCamera/startOnCameraThread with scene mode: ");
                        A105.append(parameters.getSceneMode());
                        A105.append(", supported scene mode: [");
                        A105.append(parameters.get("scene-mode-values"));
                        A105.append("], focus mode: ");
                        A105.append(parameters.getFocusMode());
                        A105.append(", supported focus mode: [");
                        A105.append(parameters.get("focus-mode-values"));
                        A105.append("], flash mode: ");
                        A105.append(parameters.getFlashMode());
                        A105.append(", supported flash mode: [");
                        A105.append(parameters.get("flash-mode-values"));
                        A105.append("], white balance: ");
                        A105.append(parameters.getWhiteBalance());
                        A105.append(", supported white balance: [");
                        A105.append(parameters.get("whitebalance-values"));
                        A105.append("], white balance lock: ");
                        A105.append(parameters.getAutoWhiteBalanceLock());
                        A105.append(", exposure: ");
                        A105.append(parameters.getExposureCompensation());
                        A105.append(", supported exposure range: [");
                        A105.append(parameters.getMinExposureCompensation());
                        A105.append(parameters.getMaxExposureCompensation());
                        A105.append("], , exposure lock: ");
                        C17900vP.A0r(A105, parameters.getAutoExposureLock());
                    }
                    try {
                        this.camera.setParameters(parameters);
                        this.isRunning = true;
                        this.receivedCameraError = false;
                        if (this.cameraStartMode.get() == 0) {
                            VoipPhysicalCamera.CameraInfo cameraInfo4 = this.cameraInfo;
                            int previewSizeForFormat = getPreviewSizeForFormat(cameraInfo4.width, cameraInfo4.height, cameraInfo4.format);
                            try {
                                this.camera.addCallbackBuffer(new byte[previewSizeForFormat]);
                                if (this.passiveMode) {
                                    this.lastCachedFrameData = new byte[previewSizeForFormat];
                                    i = 2;
                                }
                                StringBuilder A106 = AnonymousClass000.A10();
                                A106.append("voip/video/VoipCamera/startOnCameraThread. added ");
                                A106.append(i);
                                C17900vP.A0j(" buffers of ", A106, previewSizeForFormat);
                                if (this.isBoundToCameraProcessor) {
                                    this.camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                                    Log.i("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                                } else {
                                    this.camera.setPreviewCallbackWithBuffer(this);
                                }
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                sb = AnonymousClass000.A10();
                                str = "voip/video/VoipCamera/startOnCameraThread. OOM when adding callback buffers at start mode: ";
                                sb.append(str);
                                sb.append(this.cameraStartMode);
                                C108985cd.A1M(": ", sb, e);
                                return tryNextStartModeOnCameraThread();
                            }
                        } else {
                            StringBuilder A107 = AnonymousClass000.A10();
                            A107.append("voip/video/VoipCamera/startOnCameraThread not adding callback buffers at start mode: ");
                            C17900vP.A0b(this.cameraStartMode, A107);
                            boolean z = this.isBoundToCameraProcessor;
                            Camera camera2 = this.camera;
                            if (z) {
                                camera2.setPreviewCallback((Camera.PreviewCallback) null);
                                Log.i("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                            } else {
                                camera2.setPreviewCallback(this);
                            }
                        }
                        updatePreviewOrientationOnCameraThread();
                        try {
                            this.camera.startPreview();
                            StringBuilder A108 = AnonymousClass000.A10();
                            A108.append("voip/video/VoipCamera/startOnCameraThread success EXIT at attempt: ");
                            C17900vP.A0b(this.cameraStartMode, A108);
                            startPeriodicCameraCallbackCheck();
                            this.cameraEventsDispatcher.A01();
                            return 0;
                        } catch (Exception e3) {
                            e = e3;
                            sb = AnonymousClass000.A10();
                            str = "voip/video/VoipCamera/startOnCameraThread/startPreview threw at attempt: ";
                            sb.append(str);
                            sb.append(this.cameraStartMode);
                            C108985cd.A1M(": ", sb, e);
                            return tryNextStartModeOnCameraThread();
                        }
                    } catch (RuntimeException e4) {
                        StringBuilder A109 = AnonymousClass000.A10();
                        A109.append("voip/video/VoipCamera/startOnCameraThread/setParameters threw at attempt: ");
                        A109.append(this.cameraStartMode);
                        C108985cd.A1M(": ", A109, e4);
                        C25180CaW caW = this.cameraEventsDispatcher;
                        int i5 = this.camIdx;
                        Iterator it = caW.A00.iterator();
                        while (it.hasNext()) {
                            ((C28608E9z) it.next()).BnX(caW.A01, i5);
                        }
                        return -3;
                    }
                } catch (RuntimeException e5) {
                    Log.e("voip/video/VoipCamera/startOnCameraThread camera getParameters threw", e5);
                    return -9;
                }
            }
        }
        return 0;
    }

    public int stopOnCameraThread() {
        boolean z = this.isRunning;
        this.isRunning = false;
        stopPeriodicCameraCallbackCheck();
        if (this.camera == null) {
            return -6;
        }
        Log.i("voip/video/VoipCamera/stopOnCameraThread");
        stopPreviewOnCameraThread(z);
        this.camera.release();
        this.camera = null;
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int toggleCameraProcessorOnCameraThread(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.isBoundToCameraProcessor
            r6 = 0
            if (r0 != r8) goto L_0x000b
            java.lang.String r0 = "voip/video/VoipCamera/ No toggling required."
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000a:
            return r6
        L_0x000b:
            X.E9n r2 = r7.getBindableCameraProcessorFromProvider()
            if (r2 != 0) goto L_0x0014
            r0 = -11
            return r0
        L_0x0014:
            if (r8 == 0) goto L_0x007f
            android.os.Handler r1 = r7.cameraThreadHandler
            X.EBc r0 = r7.getCameraProcessorImageListener()
            r2.BD8(r1, r0)
        L_0x001f:
            r7.isBoundToCameraProcessor = r8
            boolean r0 = r7.isRunning
            r5 = 1
            if (r0 == 0) goto L_0x0045
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x002b
            r6 = 1
        L_0x002b:
            java.lang.String r0 = "videoPort should not be null if the camera is running."
            X.C17960vV.A0F(r6, r0)
            r7.stopPreviewOnCameraThread(r5)
            int r6 = r7.preparePreviewOnCameraThread()
            if (r6 == 0) goto L_0x0069
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/video/VoipCamera/ Toggling processor: preparePreviewOnCameraThread failed with "
            X.C17900vP.A0i(r0, r1, r6)
            r7.stopOnCameraThread()
        L_0x0045:
            if (r8 != 0) goto L_0x004b
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r5 = r0.format
        L_0x004b:
            java.util.Map r0 = r7.virtualCameras
            java.util.Iterator r4 = X.C17890vO.A0l(r0)
        L_0x0051:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r3 = r4.next()
            com.whatsapp.voipcalling.camera.VoipCamera r3 = (com.whatsapp.voipcalling.camera.VoipCamera) r3
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r2 = r0.width
            int r1 = r0.height
            int r0 = r0.fps1000
            r3.formatChangeCallback(r2, r1, r5, r0)
            goto L_0x0051
        L_0x0069:
            android.hardware.Camera r1 = r7.camera
            X.C17960vV.A07(r1)
            r0 = r7
            if (r8 == 0) goto L_0x0072
            r0 = 0
        L_0x0072:
            r1.setPreviewCallback(r0)
            int r6 = r7.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r7.camera
            r0.startPreview()
            goto L_0x0045
        L_0x007f:
            r2.CQ5()
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.toggleCameraProcessorOnCameraThread(boolean):int");
    }

    public void updatePreviewOrientation() {
        Log.i("voip/video/VoipCamera/updateCameraPreviewOrientation Enter");
        C17900vP.A0j("voip/video/VoipCamera/updateCameraPreviewOrientation Exit with ", AnonymousClass000.A10(), AnonymousClass000.A0M(syncRunOnCameraThread(new C27132DVt((Object) this, 35), BE7.A0Y())));
    }

    public static int getPreviewSizeForFormat(int i, int i2, int i3) {
        if (i3 != 842094169) {
            return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
        }
        int A03 = BE7.A03((double) i, 16.0d) * 16;
        return Math.max(((i * i2) * 3) / 2, (A03 * i2) + ((((BE7.A03(((double) A03) / 2.0d, 16.0d) * 16) * i2) / 2) * 2));
    }

    /* access modifiers changed from: private */
    public void imageAvailableListener(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            if (acquireLatestImage.getPlanes().length == 1 && this.camera != null) {
                updateCameraCallbackCheck();
                byte[] bArr = new byte[(acquireLatestImage.getWidth() * 4 * acquireLatestImage.getHeight())];
                ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
                buffer.rewind();
                buffer.get(bArr);
                if (this.isRunning && !this.passiveMode) {
                    Iterator A0l = C17890vO.A0l(this.virtualCameras);
                    while (A0l.hasNext()) {
                        VoipCamera voipCamera = (VoipCamera) A0l.next();
                        if (voipCamera.started) {
                            Image.Plane plane = acquireLatestImage.getPlanes()[0];
                            voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride());
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            acquireLatestImage.close();
        }
    }

    /* renamed from: lambda$startOnCameraThread$0$org-pjsip-PjCamera  reason: not valid java name */
    public /* synthetic */ void m83lambda$startOnCameraThread$0$orgpjsipPjCamera(int i, Camera camera2) {
        C17900vP.A0i("camera error occurred: ", AnonymousClass000.A10(), i);
        this.receivedCameraError = true;
        if (i != 2) {
            C25180CaW caW = this.cameraEventsDispatcher;
            if (i != 100) {
                caW.A02();
                return;
            }
            Iterator it = caW.A00.iterator();
            while (it.hasNext()) {
                ((C28608E9z) it.next()).C5E();
            }
            return;
        }
        Iterator it2 = this.cameraEventsDispatcher.A00.iterator();
        while (it2.hasNext()) {
            ((C28608E9z) it2.next()).BtT();
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        int videoPortOnCameraThreadInternal = setVideoPortOnCameraThreadInternal(videoPort);
        if (C18020vd.A05(C18040vf.A02, this.abProps, 7585)) {
            Iterator it = this.cameraEventsDispatcher.A00.iterator();
            while (it.hasNext()) {
                ((C28608E9z) it.next()).Ble(videoPortOnCameraThreadInternal);
            }
        }
        return videoPortOnCameraThreadInternal;
    }

    public void startPreview(Camera camera2) {
        camera2.startPreview();
    }
}
