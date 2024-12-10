package com.whatsapp.voipcalling.camera;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DC;
import X.AnonymousClass3MY;
import X.AnonymousClass4RN;
import X.AnonymousClass7RN;
import X.AnonymousClass7RO;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.C108945cZ;
import X.C161298Cp;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C187819gQ;
import X.C190519l5;
import X.C22618BFz;
import X.C25180CaW;
import X.C25230CbR;
import X.C25791Cm3;
import X.C26983DOf;
import X.C27132DVt;
import X.C28596E9n;
import X.C28608E9z;
import X.CZE;
import X.DVW;
import X.DVY;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

public abstract class VoipPhysicalCamera {
    public static final int CAMERA_MODE_CONSERVATIVE = 1;
    public static final int CAMERA_MODE_DEFAULT = 0;
    public static final int CAMERA_MODE_NO_FPS_RANGE = 2;
    public static final int ERROR_CAMERA_PROCESSOR_SETUP_ERROR = -11;
    public static final int ERROR_CAMERA_SESSION_CONFIGURING = -10;
    public static final int ERROR_EXCEPTION_IN_CAMERA = -9;
    public static final int ERROR_ILLEGAL_STATE_EXCEPTION = -14;
    public static final int ERROR_INVALID_STATE = -1;
    public static final int ERROR_NO_CAMERA_AFTER_OPEN = -5;
    public static final int ERROR_NO_CAMERA_IN_STOP = -6;
    public static final int ERROR_NO_SURFACE_TEXTURE = -12;
    public static final int ERROR_OPEN_CAMERA = -4;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_SECURITY_EXCEPTION = -13;
    public static final int ERROR_SETUP_PREVIEW = -2;
    public static final int ERROR_SET_PARAMETERS = -3;
    public static final int ERROR_START_FINAL_FAILED = -8;
    public static final int ERROR_SWITCH_SURFACE_VIEW = -7;
    public static final int ERROR_SYNC_RUN_TIMEOUT = -99;
    public static final int ERROR_UNSUPPORTED_OPERATION = -15;
    public static final int MESSAGE_LAST_CAMERA_CALLBACK_CHECK = 1;
    public static final int MESSAGE_ON_FRAME_AVAILABLE = 2;
    public static final int MESSAGE_RESEND_LAST_FRAME = 3;
    public static final int SUCCESS = 0;
    public static final String TAG = "voip/video/VoipCamera/";
    public final C18030ve abProps;
    public final AnonymousClass00H callArEffectsGatingUtil;
    public long cameraCallbackCount;
    public final C25180CaW cameraEventsDispatcher = new C25180CaW(this);
    public final AnonymousClass00H cameraProcessorProvider;
    public HandlerThread cameraThread;
    public final Handler cameraThreadHandler;
    public volatile boolean isBoundToCameraProcessor = false;
    public final boolean isUsingSharedCameraThread;
    public long lastCameraCallbackTs;
    public boolean passiveMode;
    public boolean shouldUseArgbApiForLastFrame;
    public final AnonymousClass1DC systemFeatures;
    public volatile boolean textureApiFailed;
    public CZE textureHolder;
    public final long thresholdRestartCameraMillis = 2000;
    public long totalElapsedCameraCallbackTime;
    public VideoPort videoPort;
    public final Map virtualCameras = C17880vN.A11();

    public abstract boolean canBindToCameraProcessor();

    public final synchronized void close(boolean z) {
        Log.i("voip/video/VoipCamera/close Enter");
        boolean A1Y = AnonymousClass000.A1Y(syncRunOnCameraThread(new DVW(this, 0, z), false));
        if (!this.isUsingSharedCameraThread && A1Y && this.cameraThread != null) {
            if (C18020vd.A05(C18040vf.A02, this.abProps, 12454)) {
                this.cameraThread.quitSafely();
            } else {
                this.cameraThread.quit();
            }
            this.cameraThread = null;
        }
        Log.i("voip/video/VoipCamera/close Exit");
    }

    public abstract void closeOnCameraThread();

    public abstract Point getAdjustedPreviewSize();

    public abstract CameraInfo getCameraInfo();

    public abstract int getCameraStartMode();

    public abstract C187819gQ getLastCachedFrame();

    public abstract int getLatestFrame(ByteBuffer byteBuffer);

    public abstract boolean hasLastCachedFrame();

    public abstract boolean isCameraOpen();

    public abstract void onFrameAvailableOnCameraThread();

    public void onScreenShareInfoChanged(C25791Cm3 cm3) {
    }

    public void resendLastFrame() {
    }

    public final synchronized int setVideoPort(VideoPort videoPort2) {
        int i;
        Log.i("voip/video/VoipCamera/setVideoPort Enter");
        i = -100;
        if (!C18020vd.A05(C18040vf.A02, this.abProps, 7585)) {
            i = BE6.A0F(syncRunOnCameraThread(new DVY(this, videoPort2, 20), -100));
        } else if (this.cameraThreadHandler.post(new AnonymousClass7RN(this, videoPort2, 15))) {
            i = 0;
        }
        C17900vP.A0j("voip/video/VoipCamera/setVideoPort Exit with ", AnonymousClass000.A10(), i);
        return i;
    }

    /* renamed from: setVideoPortOnCameraThread */
    public abstract int m76lambda$setVideoPort$2$comwhatsappvoipcallingcameraVoipPhysicalCamera(VideoPort videoPort2);

    public final synchronized int start() {
        String str;
        int A0F;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/video/VoipCamera/start Enter in ");
        if (this.passiveMode) {
            str = "passive ";
        } else {
            str = "active ";
        }
        A10.append(str);
        C17890vO.A1A(A10, "mode");
        A0F = BE6.A0F(syncRunOnCameraThread(new C27132DVt((Object) this, 33), BE7.A0Y()));
        C17900vP.A0j("voip/video/VoipCamera/start Exit with ", AnonymousClass000.A10(), A0F);
        return A0F;
    }

    public abstract int startOnCameraThread();

    public final synchronized void stop() {
        Log.i("voip/video/VoipCamera/stop Enter");
        C17900vP.A0j("voip/video/VoipCamera/stop Exit with ", AnonymousClass000.A10(), BE6.A0F(syncRunOnCameraThread(new C27132DVt((Object) this, 34), BE7.A0Y())));
    }

    public abstract int stopOnCameraThread();

    public abstract int toggleCameraProcessorOnCameraThread(boolean z);

    public abstract void updatePreviewOrientation();

    public class CameraInfo {
        public final int format;
        public final int fps1000;
        public final int height;
        public final int idx;
        public final boolean isFrontCamera;
        public final int orientation;
        public final int width;

        public CameraInfo(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
            this.width = i;
            this.height = i2;
            this.format = i3;
            this.fps1000 = i4;
            this.isFrontCamera = z;
            this.orientation = i5;
            this.idx = i6;
        }
    }

    private void clearFrameAvailableMessages() {
        this.cameraThreadHandler.removeMessages(2);
    }

    public static int fpsRangeScore(int i, int i2, int i3) {
        int i4;
        if (i <= 5000) {
            i4 = -(5000 - i);
        } else {
            i4 = (-(i - 5000)) * 4;
        }
        return (i4 - C108945cZ.A05(i2, i3)) / 1000;
    }

    private boolean isArEffectsEnabled() {
        AnonymousClass00H r0 = this.callArEffectsGatingUtil;
        if (r0 == null || !((C190519l5) r0.get()).A00()) {
            return false;
        }
        return true;
    }

    private void notifyFrameAvailable() {
        this.cameraThreadHandler.sendEmptyMessage(2);
    }

    public final void addCameraEventsListener(C28608E9z e9z) {
        C25180CaW caW = this.cameraEventsDispatcher;
        synchronized (caW) {
            caW.A00.add(e9z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4 == 2) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point calculateAdjustedPreviewSize(int r4, com.whatsapp.voipcalling.camera.VoipPhysicalCamera.CameraInfo r5) {
        /*
            r3 = this;
            int r0 = r5.orientation
            int r0 = r0 % 180
            boolean r2 = X.AnonymousClass000.A1P(r0)
            if (r4 == 0) goto L_0x000e
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r2 != r0) goto L_0x001b
            int r2 = r5.width
            int r1 = r5.height
        L_0x0015:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            return r0
        L_0x001b:
            int r2 = r5.height
            int r1 = r5.width
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipPhysicalCamera.calculateAdjustedPreviewSize(int, com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo):android.graphics.Point");
    }

    public final void clearLastFrameResendMessages() {
        this.cameraThreadHandler.removeMessages(3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void createTexture(int r16, int r17) {
        /*
            r15 = this;
            com.whatsapp.voipcalling.VideoPort r0 = r15.videoPort
            r3 = 1
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "videoPort should not be null in createTexture"
            X.C17960vV.A0F(r1, r0)
            X.CZE r0 = r15.textureHolder
            if (r0 != 0) goto L_0x0022
            com.whatsapp.voipcalling.VideoPort r0 = r15.videoPort
            X.CZE r0 = r0.createSurfaceTexture()
            r15.textureHolder = r0
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "voip/video/VoipCamera/createSurfaceTexture failed to create SurfaceTexture"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r15.textureApiFailed = r3
        L_0x0021:
            return
        L_0x0022:
            android.graphics.SurfaceTexture r1 = r0.A01
            r13 = 3
            X.Cy1 r0 = new X.Cy1
            r0.<init>(r15, r13)
            r1.setOnFrameAvailableListener(r0)
            X.CZE r0 = r15.textureHolder
            android.graphics.SurfaceTexture r0 = r0.A01
            r3 = r16
            r1 = r17
            r0.setDefaultBufferSize(r3, r1)
            X.E9n r14 = r15.getCameraProcessorIfBoundToCameraProcessor()
            if (r14 == 0) goto L_0x0021
            X.CbR r4 = r15.getCameraProcessorProperties()
            X.CZE r1 = r15.textureHolder
            X.0vl r8 = r4.A04
            int r0 = X.C72453Mb.A0I(r8)
            int r0 = r0 / 90
            r1.A04 = r0
            X.CZE r0 = r15.textureHolder
            android.graphics.SurfaceTexture r1 = r0.A01
            r6 = r14
            X.DOf r6 = (X.C26983DOf) r6
            monitor-enter(r14)
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x01a0 }
            android.graphics.SurfaceTexture r0 = r6.A00     // Catch:{ all -> 0x01a0 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x0081
            r6.CQ6()     // Catch:{ all -> 0x01a0 }
            r6.A00 = r1     // Catch:{ all -> 0x01a0 }
            X.ClC r3 = new X.ClC     // Catch:{ all -> 0x01a0 }
            r3.<init>(r1)     // Catch:{ all -> 0x01a0 }
            X.0vl r0 = r6.A0B     // Catch:{ all -> 0x01a0 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x01a0 }
            X.CjS r2 = (X.C25639CjS) r2     // Catch:{ all -> 0x01a0 }
            r1 = 0
            X.DE3 r0 = new X.DE3     // Catch:{ all -> 0x01a0 }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x01a0 }
            r6.A01 = r0     // Catch:{ all -> 0x01a0 }
            r6.A02 = r3     // Catch:{ all -> 0x01a0 }
            r0 = 1
            r6.A06 = r0     // Catch:{ all -> 0x01a0 }
        L_0x0081:
            monitor-exit(r14)
            monitor-enter(r14)
            r11 = 0
            r6.A04 = r4     // Catch:{ all -> 0x01a0 }
            X.0vl r0 = r6.A0E     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01a0 }
            X.BUU r0 = (X.BUU) r0     // Catch:{ all -> 0x01a0 }
            boolean r3 = r4.A07     // Catch:{ all -> 0x01a0 }
            r0.A00 = r3     // Catch:{ all -> 0x01a0 }
            X.C26983DOf.A00(r4, r6)     // Catch:{ all -> 0x01a0 }
            X.DDU r5 = r6.A09     // Catch:{ all -> 0x01a0 }
            X.BUd r9 = X.ED7.A00     // Catch:{ all -> 0x01a0 }
            X.EDK r1 = r5.BP7(r9)     // Catch:{ all -> 0x01a0 }
            X.ED7 r1 = (X.ED7) r1     // Catch:{ all -> 0x01a0 }
            X.BUI r1 = (X.BUI) r1     // Catch:{ all -> 0x01a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01a0 }
            android.media.ImageReader r2 = r1.A00     // Catch:{ all -> 0x019a }
            monitor-exit(r1)     // Catch:{ all -> 0x01a0 }
            if (r2 == 0) goto L_0x00c8
            int r1 = r2.getWidth()     // Catch:{ all -> 0x01a0 }
            int r0 = r4.A02     // Catch:{ all -> 0x01a0 }
            if (r1 != r0) goto L_0x00b7
            int r1 = r2.getHeight()     // Catch:{ all -> 0x01a0 }
            int r0 = r4.A01     // Catch:{ all -> 0x01a0 }
            if (r1 == r0) goto L_0x0150
        L_0x00b7:
            X.EBc r1 = r6.A03     // Catch:{ all -> 0x01a0 }
            if (r1 == 0) goto L_0x00c8
            X.CyM r1 = (X.C26360CyM) r1     // Catch:{ all -> 0x01a0 }
            int r0 = r1.A00     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x00c8
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x01a0 }
            X.BwM r0 = (X.C24156BwM) r0     // Catch:{ all -> 0x01a0 }
            X.C24156BwM.A03(r0)     // Catch:{ all -> 0x01a0 }
        L_0x00c8:
            X.EDK r7 = r5.BP7(r9)     // Catch:{ all -> 0x01a0 }
            X.ED7 r7 = (X.ED7) r7     // Catch:{ all -> 0x01a0 }
            int r10 = r4.A02     // Catch:{ all -> 0x01a0 }
            int r2 = r4.A01     // Catch:{ all -> 0x01a0 }
            X.BUI r7 = (X.BUI) r7     // Catch:{ all -> 0x01a0 }
            monitor-enter(r7)     // Catch:{ all -> 0x01a0 }
            android.media.ImageReader r0 = r7.A00     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x00ea
            int r0 = r0.getWidth()     // Catch:{ all -> 0x019d }
            if (r0 != r10) goto L_0x00ea
            android.media.ImageReader r0 = r7.A00     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x00ea
            int r0 = r0.getHeight()     // Catch:{ all -> 0x019d }
            if (r0 != r2) goto L_0x00ea
            goto L_0x014c
        L_0x00ea:
            monitor-enter(r7)     // Catch:{ all -> 0x019d }
            X.BUd r12 = X.EDC.A01     // Catch:{ all -> 0x0149 }
            X.EDK r0 = r7.A04(r12)     // Catch:{ all -> 0x0149 }
            X.EDC r0 = (X.EDC) r0     // Catch:{ all -> 0x0149 }
            X.Cmv r1 = X.DDR.A08(r0)     // Catch:{ all -> 0x0149 }
            X.DE3 r0 = r7.A01     // Catch:{ all -> 0x0149 }
            r1.A02(r11, r0)     // Catch:{ all -> 0x0149 }
            android.media.ImageReader r0 = r7.A00     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0103
            r0.close()     // Catch:{ all -> 0x0149 }
        L_0x0103:
            X.ClC r0 = r7.A02     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x010a
            r0.A01()     // Catch:{ all -> 0x0149 }
        L_0x010a:
            r0 = 0
            r7.A00 = r0     // Catch:{ all -> 0x0149 }
            r7.A02 = r0     // Catch:{ all -> 0x0149 }
            r7.A01 = r0     // Catch:{ all -> 0x0149 }
            monitor-exit(r7)     // Catch:{ all -> 0x019d }
            r1 = 1
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r10, r2, r1, r13)     // Catch:{ all -> 0x019d }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x019d }
            r7.A00 = r0     // Catch:{ all -> 0x019d }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ all -> 0x019d }
            X.ClC r10 = new X.ClC     // Catch:{ all -> 0x019d }
            r10.<init>(r0, r11)     // Catch:{ all -> 0x019d }
            r0 = 2
            r10.A04 = r0     // Catch:{ all -> 0x019d }
            r10.A02 = r1     // Catch:{ all -> 0x019d }
            X.CjS r2 = new X.CjS     // Catch:{ all -> 0x019d }
            r2.<init>()     // Catch:{ all -> 0x019d }
            r1 = 0
            X.DE3 r0 = new X.DE3     // Catch:{ all -> 0x019d }
            r0.<init>(r1, r2, r10)     // Catch:{ all -> 0x019d }
            r7.A01 = r0     // Catch:{ all -> 0x019d }
            r7.A02 = r10     // Catch:{ all -> 0x019d }
            X.EDK r0 = r7.A04(r12)     // Catch:{ all -> 0x019d }
            X.EDC r0 = (X.EDC) r0     // Catch:{ all -> 0x019d }
            X.Cmv r1 = X.DDR.A08(r0)     // Catch:{ all -> 0x019d }
            X.DE3 r0 = r7.A01     // Catch:{ all -> 0x019d }
            r1.A03(r0, r11)     // Catch:{ all -> 0x019d }
            goto L_0x014c
        L_0x0149:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x019d }
            throw r0     // Catch:{ all -> 0x019d }
        L_0x014c:
            monitor-exit(r7)     // Catch:{ all -> 0x01a0 }
            X.C26983DOf.A01(r6)     // Catch:{ all -> 0x01a0 }
        L_0x0150:
            X.ClC r1 = r6.A02     // Catch:{ all -> 0x01a0 }
            if (r1 == 0) goto L_0x015a
            int r0 = X.C72453Mb.A0I(r8)     // Catch:{ all -> 0x01a0 }
            r1.A01 = r0     // Catch:{ all -> 0x01a0 }
        L_0x015a:
            X.EDK r2 = r5.BP7(r9)     // Catch:{ all -> 0x01a0 }
            X.ED7 r2 = (X.ED7) r2     // Catch:{ all -> 0x01a0 }
            int r0 = X.C72453Mb.A0I(r8)     // Catch:{ all -> 0x01a0 }
            X.BUI r2 = (X.BUI) r2     // Catch:{ all -> 0x01a0 }
            monitor-enter(r2)     // Catch:{ all -> 0x01a0 }
            X.ClC r1 = r2.A02     // Catch:{ all -> 0x0197 }
            if (r1 == 0) goto L_0x016e
            int r0 = -r0
            r1.A01 = r0     // Catch:{ all -> 0x0197 }
        L_0x016e:
            monitor-exit(r2)     // Catch:{ all -> 0x01a0 }
            X.DE3 r0 = r6.A01     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x0175
            r0.A0A = r3     // Catch:{ all -> 0x01a0 }
        L_0x0175:
            X.BUd r0 = X.EDC.A01     // Catch:{ all -> 0x01a0 }
            X.EDK r5 = r5.BP7(r0)     // Catch:{ all -> 0x01a0 }
            X.EDC r5 = (X.EDC) r5     // Catch:{ all -> 0x01a0 }
            X.0vl r1 = r4.A06     // Catch:{ all -> 0x01a0 }
            int r6 = X.C72453Mb.A0I(r1)     // Catch:{ all -> 0x01a0 }
            X.0vl r0 = r4.A03     // Catch:{ all -> 0x01a0 }
            int r7 = X.C72453Mb.A0I(r0)     // Catch:{ all -> 0x01a0 }
            int r8 = X.C72453Mb.A0I(r1)     // Catch:{ all -> 0x01a0 }
            int r9 = X.C72453Mb.A0I(r0)     // Catch:{ all -> 0x01a0 }
            r10 = r3
            r5.CRF(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01a0 }
            monitor-exit(r14)
            return
        L_0x0197:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01a0 }
            goto L_0x019f
        L_0x019a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a0 }
            goto L_0x019f
        L_0x019d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01a0 }
        L_0x019f:
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipPhysicalCamera.createTexture(int, int):void");
    }

    public final int getAverageCaptureFps() {
        long j = this.totalElapsedCameraCallbackTime;
        if (j <= 0) {
            return 0;
        }
        return (int) ((this.cameraCallbackCount * 1000) / j);
    }

    public C28596E9n getBindableCameraProcessorFromProvider() {
        C28596E9n A00;
        boolean z;
        if (!(this.cameraProcessorProvider == null || !isArEffectsEnabled() || (A00 = ((AnonymousClass4RN) this.cameraProcessorProvider.get()).A00()) == null)) {
            C26983DOf dOf = (C26983DOf) A00;
            synchronized (dOf) {
                z = dOf.A05;
            }
            if (z) {
                A00.start();
                return A00;
            }
        }
        return null;
    }

    public C28596E9n getCameraProcessorIfBoundToCameraProcessor() {
        C28596E9n e9n = null;
        if (this.isBoundToCameraProcessor && isArEffectsEnabled()) {
            AnonymousClass00H r0 = this.cameraProcessorProvider;
            if (r0 != null) {
                e9n = ((AnonymousClass4RN) r0.get()).A00();
            }
            if (this.isBoundToCameraProcessor) {
                C17960vV.A0F(AnonymousClass000.A1W(e9n), "cameraProcessor should not be null when isListeningToCameraProcessor is true");
            }
        }
        return e9n;
    }

    public long getFrameCount() {
        return this.cameraCallbackCount;
    }

    public long getTotalElapsedCameraCallbackTime() {
        return this.totalElapsedCameraCallbackTime;
    }

    public final boolean isPassiveMode() {
        return this.passiveMode;
    }

    public boolean isTextureApiFailed() {
        return this.textureApiFailed;
    }

    /* renamed from: lambda$close$5$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Boolean m73lambda$close$5$comwhatsappvoipcallingcameraVoipPhysicalCamera(boolean z) {
        boolean z2;
        if (z) {
            this.virtualCameras.clear();
        }
        if (this.virtualCameras.size() == 0) {
            closeOnCameraThread();
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: lambda$registerVirtualCamera$6$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m75lambda$registerVirtualCamera$6$comwhatsappvoipcallingcameraVoipPhysicalCamera(VoipCamera voipCamera) {
        boolean containsKey = this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity));
        Integer A0f = AnonymousClass3MY.A0f();
        if (!containsKey) {
            this.virtualCameras.put(Long.valueOf(voipCamera.userIdentity), voipCamera);
        }
        return A0f;
    }

    /* renamed from: lambda$stop$4$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m78lambda$stop$4$comwhatsappvoipcallingcameraVoipPhysicalCamera() {
        int i;
        Iterator A15 = AnonymousClass000.A15(this.virtualCameras);
        boolean z = true;
        while (true) {
            i = 0;
            if (!A15.hasNext()) {
                break;
            } else if (((VoipCamera) C17890vO.A0P(A15)).started) {
                z = false;
            }
        }
        if (z) {
            i = stopOnCameraThread();
        }
        return Integer.valueOf(i);
    }

    /* renamed from: lambda$unregisterVirtualCamera$7$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m81lambda$unregisterVirtualCamera$7$comwhatsappvoipcallingcameraVoipPhysicalCamera(VoipCamera voipCamera) {
        int i;
        this.virtualCameras.remove(Long.valueOf(voipCamera.userIdentity));
        if (this.virtualCameras.size() == 0) {
            i = stopOnCameraThread();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public void releaseTexture() {
        if (this.textureHolder != null) {
            C28596E9n cameraProcessorIfBoundToCameraProcessor = getCameraProcessorIfBoundToCameraProcessor();
            if (cameraProcessorIfBoundToCameraProcessor != null) {
                cameraProcessorIfBoundToCameraProcessor.CQ6();
            }
            this.textureHolder.A01.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            clearFrameAvailableMessages();
            VideoPort videoPort2 = this.videoPort;
            if (videoPort2 != null) {
                videoPort2.releaseSurfaceTexture(this.textureHolder);
            } else {
                if (!C18020vd.A05(C18040vf.A02, this.abProps, 7585)) {
                    C17960vV.A0F(AnonymousClass000.A1W(this.videoPort), "videoPort should not be null in releaseTexture");
                }
            }
            this.textureHolder = null;
        }
    }

    public final void removeCameraEventsListener(C28608E9z e9z) {
        C25180CaW caW = this.cameraEventsDispatcher;
        synchronized (caW) {
            caW.A00.remove(e9z);
        }
    }

    public final void stopPeriodicCameraCallbackCheck() {
        this.cameraThreadHandler.removeMessages(1);
        this.lastCameraCallbackTs = SystemClock.elapsedRealtime();
    }

    public final Object syncRunOnCameraThread(Callable callable, Object obj) {
        Exchanger exchanger = new Exchanger();
        if (this.cameraThreadHandler.post(new AnonymousClass7RO(this, exchanger, callable, 38))) {
            return exchange(exchanger, (Object) null);
        }
        return obj;
    }

    public int toggleCameraProcessor(boolean z) {
        Log.i("voip/video/VoipCamera/toggleCameraProcessor Enter");
        int A0M = AnonymousClass000.A0M(syncRunOnCameraThread(new DVW(this, 1, z), BE7.A0Y()));
        C17900vP.A0j("voip/video/VoipCamera/toggleCameraProcessor Exit with ", AnonymousClass000.A10(), A0M);
        return A0M;
    }

    public VoipPhysicalCamera(C18030ve r4, AnonymousClass1DC r5, AnonymousClass00H r6, AnonymousClass00H r7, HandlerThread handlerThread) {
        this.abProps = r4;
        this.systemFeatures = r5;
        this.callArEffectsGatingUtil = r6;
        this.cameraProcessorProvider = r7;
        if (handlerThread != null) {
            this.cameraThread = handlerThread;
            this.isUsingSharedCameraThread = true;
        } else {
            C161298Cp r0 = new C161298Cp(this);
            this.cameraThread = r0;
            r0.start();
            this.isUsingSharedCameraThread = false;
        }
        this.cameraThreadHandler = new C22618BFz(this.cameraThread.getLooper(), this, 5);
        this.shouldUseArgbApiForLastFrame = (C18020vd.A00(C18040vf.A01, r4, 8526) & 1) <= 0 ? false : true;
    }

    private Object exchange(Exchanger exchanger, Object obj) {
        try {
            return exchanger.exchange(obj);
        } catch (InterruptedException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public C25230CbR getCameraProcessorProperties() {
        CameraInfo cameraInfo = getCameraInfo();
        return new C25230CbR(cameraInfo.width, cameraInfo.height, cameraInfo.orientation, cameraInfo.isFrontCamera);
    }

    /* renamed from: lambda$setVideoPort$3$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m77lambda$setVideoPort$3$comwhatsappvoipcallingcameraVoipPhysicalCamera(VideoPort videoPort2) {
        return Integer.valueOf(m76lambda$setVideoPort$2$comwhatsappvoipcallingcameraVoipPhysicalCamera(videoPort2));
    }

    /* renamed from: lambda$syncRunOnCameraThread$0$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ void m79lambda$syncRunOnCameraThread$0$comwhatsappvoipcallingcameraVoipPhysicalCamera(Exchanger exchanger, Callable callable) {
        try {
            exchange(exchanger, callable.call());
        } catch (Exception e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    /* renamed from: lambda$toggleCameraProcessor$1$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m80lambda$toggleCameraProcessor$1$comwhatsappvoipcallingcameraVoipPhysicalCamera(boolean z) {
        return Integer.valueOf(toggleCameraProcessorOnCameraThread(z));
    }

    public int registerVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/video/VoipCamera/Add new virtual camera with user identity ");
        C17890vO.A16(A10, voipCamera.userIdentity);
        return AnonymousClass000.A0M(syncRunOnCameraThread(new DVY(this, voipCamera, 22), BE7.A0Z()));
    }

    public final void scheduleLastFrameResend(long j) {
        clearLastFrameResendMessages();
        this.cameraThreadHandler.sendEmptyMessageDelayed(3, j);
    }

    public final void startPeriodicCameraCallbackCheck() {
        stopPeriodicCameraCallbackCheck();
        this.cameraThreadHandler.sendEmptyMessageDelayed(1, 1000);
    }

    public int unregisterVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/video/VoipCamera/Remove virtual camera with user identity ");
        C17890vO.A16(A10, voipCamera.userIdentity);
        return AnonymousClass000.A0M(syncRunOnCameraThread(new DVY(this, voipCamera, 21), BE7.A0Z()));
    }

    public final void updateCameraCallbackCheck() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.totalElapsedCameraCallbackTime += elapsedRealtime - this.lastCameraCallbackTs;
        this.lastCameraCallbackTs = elapsedRealtime;
        this.cameraCallbackCount++;
    }

    public final boolean useOutputFormatForSecondaryStream() {
        if (isArEffectsEnabled() || this.systemFeatures.Bfb()) {
            return true;
        }
        return false;
    }

    /* renamed from: lambda$createTexture$8$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ void m74lambda$createTexture$8$comwhatsappvoipcallingcameraVoipPhysicalCamera(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    public final void setPassiveMode(boolean z) {
        this.passiveMode = z;
    }
}
