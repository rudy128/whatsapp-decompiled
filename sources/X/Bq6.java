package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.Display;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Bq6 extends BHE implements C160978Av, SurfaceHolder.Callback {
    public static final String[] A0c = {"GT-I9195", "GT-I9190", "GT-I9192"};
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public Camera.Size A04;
    public Camera.Size A05;
    public Camera.Size A06;
    public Camera A07;
    public MediaRecorder A08;
    public Handler A09;
    public C26003CqK A0A;
    public CVZ A0B;
    public C25114CYn A0C;
    public C25114CYn A0D;
    public AnonymousClass1KB A0E;
    public C28598E9p A0F;
    public AnonymousClass11C A0G;
    public C219217x A0H;
    public C133846pb A0I;
    public C18010vc A0J;
    public AnonymousClass10I A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public byte[] A0R;
    public HandlerThread A0S;
    public List A0T;
    public boolean A0U;
    public final Handler A0V = C17890vO.A0D();
    public final Display A0W;
    public final SurfaceHolder A0X;
    public final C26999DOv A0Y;
    public final float[] A0Z = new float[16];
    public final BH9 A0a;
    public final CZK A0b;

    public Bq6(Context context) {
        super(context, (AttributeSet) null, 0);
        A0B();
        C26999DOv dOv = new C26999DOv(this);
        this.A0Y = dOv;
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.A00 = sharedPreferences.getInt("camera_index", 0);
        this.A0L = sharedPreferences.getString("flash_mode", "off");
        SurfaceHolder holder = getHolder();
        this.A0X = holder;
        holder.addCallback(this);
        holder.setType(3);
        this.A0W = AnonymousClass11C.A01(context).getDefaultDisplay();
        this.A0a = new BH9(context, this);
        this.A0b = new CZK(new C26997DOt(this, 0), dOv, 5);
    }

    public static int A00(float f) {
        if (f < -995.0f) {
            f = -995.0f;
        } else if (f > 995.0f) {
            f = 995.0f;
        }
        return (int) f;
    }

    public static synchronized void A06(Bq6 bq6) {
        synchronized (bq6) {
            Camera camera = bq6.A07;
            if (camera == null) {
                try {
                    if (bq6.A00 >= Camera.getNumberOfCameras()) {
                        bq6.A00 = Camera.getNumberOfCameras() - 1;
                    }
                    Camera open = Camera.open(bq6.A00);
                    bq6.A07 = open;
                    open.setErrorCallback(new Cy6(bq6, 1));
                } catch (Exception e) {
                    Camera camera2 = bq6.A07;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    bq6.A07 = null;
                    Log.e("cameraview/start-camera error opening camera", e);
                    if (bq6.A00 != 0) {
                        C17880vN.A1C(bq6.getSharedPreferences().edit(), "camera_index", 0);
                    }
                    A09(bq6, e, 1);
                }
                Camera camera3 = bq6.A07;
                if (camera3 != null) {
                    try {
                        camera3.setPreviewDisplay(bq6.A0X);
                        A07(bq6);
                    } catch (IOException | RuntimeException e2) {
                        bq6.A07.release();
                        bq6.A07 = null;
                        Log.e("cameraview/start-camera", e2);
                        if (bq6.A00 != 0) {
                            C17880vN.A1C(bq6.getSharedPreferences().edit(), "camera_index", 0);
                        }
                        A09(bq6, e2, 1);
                    }
                }
            } else {
                try {
                    camera.reconnect();
                } catch (IOException e3) {
                    bq6.A07.release();
                    bq6.A07 = null;
                    Log.e("cameraview/start-camera error reconnecting camera", e3);
                    A09(bq6, e3, 1);
                }
            }
        }
        return;
    }

    public static synchronized void A08(Bq6 bq6) {
        synchronized (bq6) {
            Log.i("cameraview/stop-camera");
            Camera camera = bq6.A07;
            if (camera != null) {
                try {
                    camera.stopPreview();
                    bq6.A0M = false;
                } catch (Exception e) {
                    Log.w("cameraview/stop-camera error stopping camera preview", e);
                }
                try {
                    bq6.A07.release();
                } catch (Exception e2) {
                    Log.w("cameraview/stop-camera error releasing camera", e2);
                }
                bq6.A07 = null;
            }
            Log.i("cameraview/stop-camera-end");
        }
        return;
    }

    public static boolean A0A(Camera.Size size, Camera.Size size2, int i, int i2) {
        if (size2 == null) {
            return true;
        }
        return (C108945cZ.A05(size.height, i2) * i) + (C108945cZ.A05(size.width, i) * i2) < (C108945cZ.A05(size2.height, i2) * i) + (C108945cZ.A05(size2.width, i) * i2);
    }

    public void BIe(C92364hB r1) {
    }

    public void BJw(C107855aj r1, BCO bco, C92384hD r3) {
    }

    public boolean BeH() {
        return true;
    }

    public boolean Bgt() {
        return true;
    }

    public synchronized void BkL() {
        Log.i("cameraview/next-camera");
        if (this.A07 != null) {
            boolean z = true;
            if (Camera.getNumberOfCameras() > 1) {
                this.A00 = (this.A00 + 1) % Camera.getNumberOfCameras();
                if (getCameraInfo().facing != 1) {
                    z = false;
                }
                this.A0N = z;
                A08(this);
                Handler handler = this.A09;
                handler.getClass();
                handler.post(new AnonymousClass7R9((Object) this, 23));
                C17880vN.A1C(getSharedPreferences().edit(), "camera_index", this.A00);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r1 = "off";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String BkM() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0008
            java.lang.String r1 = "off"
            goto L_0x0046
        L_0x0008:
            java.util.List r2 = r3.getFlashModes()     // Catch:{ all -> 0x0048 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "off"
            goto L_0x0046
        L_0x0015:
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x0048 }
            r0.getParameters()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r3.A0L     // Catch:{ all -> 0x0048 }
            int r0 = r2.indexOf(r0)     // Catch:{ all -> 0x0048 }
            if (r0 >= 0) goto L_0x002b
            java.lang.String r1 = "off"
            int r0 = r2.indexOf(r1)     // Catch:{ all -> 0x0048 }
            if (r0 >= 0) goto L_0x002b
            goto L_0x0046
        L_0x002b:
            int r1 = r0 + 1
            int r0 = r2.size()     // Catch:{ all -> 0x0048 }
            int r1 = r1 % r0
            java.lang.String r2 = X.C17880vN.A0w(r2, r1)     // Catch:{ all -> 0x0048 }
            r3.A0L = r2     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "cameraview/next flash mode:"
            X.C17900vP.A0f(r0, r2, r1)     // Catch:{ all -> 0x0048 }
            r3.A04()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r3.A0L     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r3)
            return r1
        L_0x0048:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bq6.BkM():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int CLV(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r0 == 0) goto L_0x003a
            android.hardware.Camera$Parameters r1 = r0.getParameters()     // Catch:{ all -> 0x003c }
            boolean r0 = r1.isZoomSupported()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003a
            int r0 = r1.getMaxZoom()     // Catch:{ all -> 0x003c }
            if (r4 > r0) goto L_0x003a
            int r0 = r1.getZoom()     // Catch:{ all -> 0x003c }
            if (r0 == r4) goto L_0x0024
            r1.setZoom(r4)     // Catch:{ all -> 0x003c }
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003c }
            r0.setParameters(r1)     // Catch:{ all -> 0x003c }
        L_0x0024:
            java.util.List r1 = r1.getZoomRatios()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            int r0 = r1.size()     // Catch:{ all -> 0x003c }
            if (r0 < r4) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x003c }
            int r0 = X.BE6.A0F(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r3)
            return r0
        L_0x003a:
            monitor-exit(r3)
            return r2
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bq6.CLV(int):int");
    }

    public synchronized void COZ() {
        try {
            MediaRecorder mediaRecorder = this.A08;
            mediaRecorder.getClass();
            mediaRecorder.stop();
        } catch (RuntimeException e) {
            Log.w("cameraview/stop-video-capture ", e);
        }
        A03();
        Camera camera = this.A07;
        if (camera != null) {
            camera.lock();
        }
        this.A0O = false;
        this.A05 = null;
    }

    public synchronized void COa(Runnable runnable, Runnable runnable2) {
        COZ();
        this.A0E.CGP(runnable);
        this.A0K.CGF(runnable2);
    }

    public synchronized void CP2(E8C e8c, int i) {
        if (this.A07 == null) {
            Log.e("cameraview/take-picture camera is null");
            e = new Exception("CameraCustomException: Camera is null");
        } else if (this.A0Q) {
            Log.e("cameraview/take-picture already taking a picture");
        } else {
            this.A0M = false;
            this.A0Q = true;
            Log.i("cameraview/take-picture/start");
            Camera.Parameters parameters = this.A07.getParameters();
            parameters.setRotation(getRequiredCameraRotation());
            parameters.setJpegQuality(80);
            this.A07.setParameters(parameters);
            try {
                C26346Cy8 cy8 = new C26346Cy8(e8c, this);
                this.A07.takePicture(new C26353CyF(e8c), (Camera.PictureCallback) null, cy8);
            } catch (Exception e) {
                e = e;
                this.A0Q = false;
                Log.e("cameraview/take-picture failed", e);
            }
        }
        A09(this, e, 1);
        return;
    }

    public void CQR(C92374hC r1) {
    }

    public int getCameraApi() {
        return 2;
    }

    public int getCameraType() {
        return 0;
    }

    public synchronized List getFlashModes() {
        ArrayList A13;
        A13 = AnonymousClass000.A13();
        Camera camera = this.A07;
        if (camera != null) {
            try {
                List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (supportedFlashModes.contains("off")) {
                        A13.add("off");
                    }
                    if (supportedFlashModes.contains("on")) {
                        A13.add("on");
                    }
                    if (supportedFlashModes.contains("auto")) {
                        A13.add("auto");
                    }
                }
                if (this.A0N) {
                    C108985cd.A1I("off", A13);
                    C108985cd.A1I("on", A13);
                }
                if (getStoredFlashModeCount() != A13.size()) {
                    SharedPreferences.Editor edit = getSharedPreferences().edit();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("flash_mode_count");
                    C17880vN.A1C(edit, C17880vN.A0t(A10, this.A00), A13.size());
                }
            } catch (RuntimeException e) {
                Log.e("cameraview/getFlashModes ", e);
            }
        }
        return A13;
    }

    public synchronized int getMaxZoom() {
        int i;
        Camera camera = this.A07;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                i = parameters.getMaxZoom();
            }
        }
        i = 0;
        return i;
    }

    public synchronized long getPictureResolution() {
        long j;
        Camera.Size pictureSize;
        Camera camera = this.A07;
        j = 0;
        if (!(camera == null || (pictureSize = camera.getParameters().getPictureSize()) == null)) {
            j = (long) (pictureSize.width * pictureSize.height);
        }
        return j;
    }

    public synchronized long getVideoResolution() {
        long j;
        Camera.Size size = this.A06;
        if (size != null) {
            j = (long) (size.width * size.height);
        } else {
            j = 0;
        }
        return j;
    }

    public synchronized int getZoomLevel() {
        Camera camera = this.A07;
        if (camera == null) {
            return 0;
        }
        return camera.getParameters().getZoom();
    }

    public void setCameraSwitchedCallback(Runnable runnable) {
    }

    public void setShouldStoreCameraFacingMode(boolean z) {
    }

    public static Camera.Size A01(List list, int i, int i2) {
        int i3 = i;
        double d = (double) i3;
        int i4 = i2;
        double d2 = d / ((double) i4);
        Camera.Size size = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i5 = size2.width;
                double d3 = (double) i5;
                int i6 = size2.height;
                double d4 = d3 / ((double) i6);
                double d5 = d3 / d;
                if (i5 * i6 >= 153600 && d5 <= 1.5d && BE6.A01(d4, d2) <= 0.1d && A0A(size2, size, i3, i4)) {
                    size = size2;
                }
            }
            if (size == null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Camera.Size size3 = (Camera.Size) it2.next();
                    if (((double) size3.width) / d <= 1.5d && A0A(size3, size, i3, i4)) {
                        size = size3;
                    }
                }
                if (size == null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Camera.Size size4 = (Camera.Size) it3.next();
                        if (A0A(size4, size, i3, i4)) {
                            size = size4;
                        }
                    }
                }
            }
        }
        return size;
    }

    private void A03() {
        MediaRecorder mediaRecorder = this.A08;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A08.release();
            this.A08 = null;
            this.A0O = false;
            Camera camera = this.A07;
            if (camera != null) {
                try {
                    camera.lock();
                    Camera.Parameters parameters = this.A07.getParameters();
                    parameters.getFlashMode();
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.A07.setParameters(parameters);
                        this.A07.stopPreview();
                        this.A0M = false;
                    }
                } catch (RuntimeException e) {
                    Log.e("failed to lock the camera, it's in use by another process or WhatsApp video call.", e);
                }
            }
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        C25114CYn cYn = this.A0C;
        if (cYn != null) {
            cYn.A01();
            this.A0C = null;
        }
        CVZ cvz = this.A0B;
        if (cvz != null) {
            if (cvz.A00 != null) {
                cvz.A00 = null;
            }
            this.A0B = null;
        }
        C25114CYn cYn2 = this.A0D;
        if (cYn2 != null) {
            cYn2.A01();
            this.A0D = null;
        }
        C26003CqK cqK = this.A0A;
        if (cqK != null) {
            cqK.A01();
            this.A0A = null;
        }
    }

    private void A04() {
        Camera.Parameters parameters;
        Camera camera = this.A07;
        if (camera != null && (parameters = camera.getParameters()) != null) {
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(this.A0L)) {
                parameters.setFlashMode(this.A0L);
                this.A07.setParameters(parameters);
            }
            C17880vN.A1E(getSharedPreferences().edit(), "flash_mode", this.A0L);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r9 == 2) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d7 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0308 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x032c A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0334 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0345 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0195 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f2 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0249 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0260 A[Catch:{ RuntimeException -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A07(X.Bq6 r20) {
        /*
            r11 = r20
            monitor-enter(r11)
            int r15 = r11.getWidth()     // Catch:{ all -> 0x0351 }
            int r14 = r11.getHeight()     // Catch:{ all -> 0x0351 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview view:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r15)     // Catch:{ all -> 0x0351 }
            java.lang.String r10 = "x"
            X.C17900vP.A0j(r10, r1, r14)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "cameraview/start-preview camera is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "CameraCustomException: Camera is null"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0351 }
            r1.<init>(r0)     // Catch:{ all -> 0x0351 }
            r0 = 1
            A09(r11, r1, r0)     // Catch:{ all -> 0x0351 }
            goto L_0x0348
        L_0x0032:
            android.view.Display r0 = r11.A0W     // Catch:{ all -> 0x0351 }
            int r9 = r0.getRotation()     // Catch:{ all -> 0x0351 }
            r0 = 2
            r3 = 1
            if (r9 == 0) goto L_0x003f
            r13 = 0
            if (r9 != r0) goto L_0x0040
        L_0x003f:
            r13 = 1
        L_0x0040:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$Parameters r8 = r0.getParameters()     // Catch:{ all -> 0x0351 }
            java.util.List r2 = r8.getSupportedPreviewSizes()     // Catch:{ all -> 0x0351 }
            r11.A0T = r2     // Catch:{ all -> 0x0351 }
            if (r2 != 0) goto L_0x0054
            java.util.List r2 = r11.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x0351 }
            r11.A0T = r2     // Catch:{ all -> 0x0351 }
        L_0x0054:
            r1 = r15
            r0 = r14
            if (r13 == 0) goto L_0x005a
            r1 = r14
            r0 = r15
        L_0x005a:
            android.hardware.Camera$Size r0 = A01(r2, r1, r0)     // Catch:{ all -> 0x0351 }
            r11.A04 = r0     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = r8.getFlashMode()     // Catch:{ all -> 0x0351 }
            r11.A0L = r0     // Catch:{ all -> 0x0351 }
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview preview sizes:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            java.util.List r0 = r11.A0T     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = A02(r0)     // Catch:{ all -> 0x0351 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$Size r2 = r11.A04     // Catch:{ all -> 0x0351 }
            if (r2 == 0) goto L_0x034a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview optimal preview size:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            int r0 = r2.width     // Catch:{ all -> 0x0351 }
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r10)     // Catch:{ all -> 0x0351 }
            int r0 = r2.height     // Catch:{ all -> 0x0351 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$CameraInfo r18 = r11.getCameraInfo()     // Catch:{ all -> 0x0351 }
            r0 = r18
            int r0 = r0.facing     // Catch:{ all -> 0x0351 }
            boolean r12 = X.AnonymousClass000.A1T(r0, r3)
            r11.A0N = r12     // Catch:{ all -> 0x0351 }
            double r6 = (double) r15     // Catch:{ all -> 0x0351 }
            double r4 = (double) r14     // Catch:{ all -> 0x0351 }
            double r16 = r6 / r4
            android.hardware.Camera$Size r1 = r11.A04     // Catch:{ all -> 0x0351 }
            int r0 = r1.width     // Catch:{ all -> 0x0351 }
            r20 = r0
            double r2 = (double) r0     // Catch:{ all -> 0x0351 }
            int r0 = r1.height     // Catch:{ all -> 0x0351 }
            r19 = r0
            double r0 = (double) r0     // Catch:{ all -> 0x0351 }
            double r2 = r2 / r0
            r0 = r16
            double r16 = X.BE6.A01(r0, r2)     // Catch:{ all -> 0x0351 }
            double r4 = r4 / r6
            double r2 = X.BE6.A01(r4, r2)     // Catch:{ all -> 0x0351 }
            r0 = r16
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0351 }
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f4
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r4 = "cameraview/start-preview request layout to match preview size:"
            r3 = r20
            r2 = r19
            X.BEA.A1P(r4, r10, r5, r3, r2)     // Catch:{ all -> 0x0351 }
            java.lang.String r2 = " (view is "
            X.BEA.A1P(r2, r10, r5, r15, r14)     // Catch:{ all -> 0x0351 }
            java.lang.String r2 = ") aspect diff is "
            X.BEA.A1Q(r2, r5, r0)     // Catch:{ all -> 0x0351 }
            android.os.Handler r2 = r11.A0V     // Catch:{ all -> 0x0351 }
            r1 = 21
            X.7R9 r0 = new X.7R9     // Catch:{ all -> 0x0351 }
            r0.<init>((java.lang.Object) r11, (int) r1)     // Catch:{ all -> 0x0351 }
            r2.post(r0)     // Catch:{ all -> 0x0351 }
            goto L_0x0348
        L_0x00f4:
            r0 = r18
            int r3 = r0.orientation     // Catch:{ all -> 0x0351 }
            r1 = 3
            r0 = 1
            if (r9 == r0) goto L_0x0108
            r0 = 2
            if (r9 == r0) goto L_0x0105
            r4 = 270(0x10e, float:3.78E-43)
            if (r9 == r1) goto L_0x010a
            r4 = 0
            goto L_0x010a
        L_0x0105:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x010a
        L_0x0108:
            r4 = 90
        L_0x010a:
            if (r12 == 0) goto L_0x010d
            goto L_0x0116
        L_0x010d:
            int r0 = r3 - r4
            int r0 = r0 + 360
            int r2 = r0 % 360
            r11.A01 = r2     // Catch:{ all -> 0x0351 }
            goto L_0x0122
        L_0x0116:
            int r0 = r3 + r4
            int r0 = r0 % 360
            r11.A01 = r0     // Catch:{ all -> 0x0351 }
            int r0 = 360 - r0
            int r2 = r0 % 360
            r11.A01 = r2     // Catch:{ all -> 0x0351 }
        L_0x0122:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview display:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r4)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = " camera:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r3)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r2)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = " front:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r12)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = " portrait:"
            X.C17900vP.A0n(r0, r1, r13)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera r1 = r11.A07     // Catch:{ RuntimeException -> 0x0153 }
            int r0 = r11.A01     // Catch:{ RuntimeException -> 0x0153 }
            r1.setDisplayOrientation(r0)     // Catch:{ RuntimeException -> 0x0153 }
            goto L_0x0159
        L_0x0153:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-preview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0351 }
        L_0x0159:
            android.hardware.Camera$Size r0 = r11.A04     // Catch:{ all -> 0x0351 }
            int r1 = r0.width     // Catch:{ all -> 0x0351 }
            int r0 = r0.height     // Catch:{ all -> 0x0351 }
            r8.setPreviewSize(r1, r0)     // Catch:{ all -> 0x0351 }
            java.util.List r2 = r8.getSupportedFocusModes()     // Catch:{ all -> 0x0351 }
            if (r2 == 0) goto L_0x0189
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x0351 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0351 }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x018e
            r8.setFocusMode(r1)     // Catch:{ all -> 0x0351 }
            r15 = 1
            goto L_0x018f
        L_0x0189:
            java.lang.String r0 = "cameraview/start-preview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0351 }
        L_0x018e:
            r15 = 0
        L_0x018f:
            java.util.List r2 = r8.getSupportedFlashModes()     // Catch:{ all -> 0x0351 }
            if (r2 == 0) goto L_0x0249
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview supported flash:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x0351 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "torch"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0351 }
            r11.A0P = r0     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0238
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0351 }
            r8.setFlashMode(r0)     // Catch:{ all -> 0x0351 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview set flash mode:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0351 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0351 }
        L_0x01ce:
            java.util.List r7 = r8.getSupportedPictureSizes()     // Catch:{ all -> 0x0351 }
            r0 = 14
            X.DUR.A00(r0, r7)     // Catch:{ all -> 0x0351 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview picture sizes:"
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = A02(r7)     // Catch:{ all -> 0x0351 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$Size r1 = r11.A04     // Catch:{ all -> 0x0351 }
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            r4 = 640(0x280, float:8.97E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 == 0) goto L_0x0260
            int r0 = r1.height     // Catch:{ all -> 0x0351 }
            float r2 = (float) r0     // Catch:{ all -> 0x0351 }
            int r0 = r1.width     // Catch:{ all -> 0x0351 }
            float r0 = (float) r0     // Catch:{ all -> 0x0351 }
            float r2 = r2 / r0
            java.util.Iterator r14 = r7.iterator()     // Catch:{ all -> 0x0351 }
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0203:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x027f
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x0351 }
            int r6 = r0.width     // Catch:{ all -> 0x0351 }
            int r5 = r0.height     // Catch:{ all -> 0x0351 }
            int r1 = r6 * r5
            if (r1 >= r9) goto L_0x0203
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0222
            int r1 = r1 * 2
            int r0 = r4 * r3
            if (r1 >= r0) goto L_0x0222
            goto L_0x027f
        L_0x0222:
            float r1 = (float) r5     // Catch:{ all -> 0x0351 }
            float r0 = (float) r6     // Catch:{ all -> 0x0351 }
            float r1 = r1 / r0
            float r1 = X.C108945cZ.A00(r1, r2)     // Catch:{ all -> 0x0351 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0203
            r3 = r5
            r4 = r6
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x027f
            r12 = r1
            goto L_0x0203
        L_0x0238:
            java.util.List r1 = r11.getFlashModes()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0351 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x01ce
            java.lang.String r0 = r8.getFlashMode()     // Catch:{ all -> 0x0351 }
            goto L_0x025c
        L_0x0249:
            java.lang.String r0 = "cameraview/start-preview supported flash:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0351 }
            java.util.List r1 = r11.getFlashModes()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0351 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x01ce
            java.lang.String r0 = "off"
        L_0x025c:
            r11.A0L = r0     // Catch:{ all -> 0x0351 }
            goto L_0x01ce
        L_0x0260:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0351 }
        L_0x0264:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x027f
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x0351 }
            int r5 = r0.width     // Catch:{ all -> 0x0351 }
            int r2 = r0.height     // Catch:{ all -> 0x0351 }
            int r1 = r5 * r2
            int r0 = r4 * r3
            if (r1 <= r0) goto L_0x0264
            if (r1 >= r9) goto L_0x0264
            r3 = r2
            r4 = r5
            goto L_0x0264
        L_0x027f:
            boolean r0 = r11.A0N     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x02b8
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0351 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x02b8
            java.lang.String[] r6 = A0c     // Catch:{ all -> 0x0351 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0351 }
            r2 = 3
            r1 = 0
        L_0x0293:
            r0 = r6[r1]     // Catch:{ all -> 0x0351 }
            boolean r0 = X.AnonymousClass026.A00(r5, r0)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x032c
            android.hardware.Camera r5 = r11.A07     // Catch:{ all -> 0x0351 }
            r5.getClass()     // Catch:{ all -> 0x0351 }
            r1 = 1280(0x500, float:1.794E-42)
            r0 = 720(0x2d0, float:1.009E-42)
            android.hardware.Camera$Size r2 = new android.hardware.Camera$Size     // Catch:{ all -> 0x0351 }
            r2.<init>(r5, r1, r0)     // Catch:{ all -> 0x0351 }
            boolean r0 = r7.contains(r2)     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0314
            int r4 = r2.width     // Catch:{ all -> 0x0351 }
            int r3 = r2.height     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview workaround s4 mini preview size"
        L_0x02b5:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0351 }
        L_0x02b8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview picture size "
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r4)     // Catch:{ all -> 0x0351 }
            X.C17900vP.A0j(r10, r1, r3)     // Catch:{ all -> 0x0351 }
            r8.setPictureSize(r4, r3)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x0351 }
            r0.setParameters(r8)     // Catch:{ all -> 0x0351 }
            boolean r0 = r11.A0N     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x0308
            boolean r0 = r11.A0U     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0308
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x0351 }
            r0 = 0
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x0351 }
            X.CyD r0 = new X.CyD     // Catch:{ all -> 0x0351 }
            r0.<init>(r11)     // Catch:{ all -> 0x0351 }
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x0351 }
            android.hardware.Camera$Size r0 = r11.A04     // Catch:{ all -> 0x0351 }
            int r1 = r0.width     // Catch:{ all -> 0x0351 }
            int r0 = r0.height     // Catch:{ all -> 0x0351 }
            int r1 = r1 * r0
            int r2 = r1 * 3
            r0 = 2
            int r2 = r2 / r0
            byte[] r1 = r11.A0R     // Catch:{ all -> 0x0351 }
            if (r1 == 0) goto L_0x02f9
            int r0 = r1.length     // Catch:{ all -> 0x0351 }
            if (r0 == r2) goto L_0x02fd
        L_0x02f9:
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x0351 }
            r11.A0R = r1     // Catch:{ all -> 0x0351 }
        L_0x02fd:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x0351 }
            r0.addCallbackBuffer(r1)     // Catch:{ all -> 0x0351 }
        L_0x0302:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x0351 }
            r0.startPreview()     // Catch:{ all -> 0x0351 }
            goto L_0x0332
        L_0x0308:
            android.hardware.Camera r2 = r11.A07     // Catch:{ all -> 0x0351 }
            r1 = 2
            X.CyC r0 = new X.CyC     // Catch:{ all -> 0x0351 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x0351 }
            r2.setOneShotPreviewCallback(r0)     // Catch:{ all -> 0x0351 }
            goto L_0x0302
        L_0x0314:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "cameraview/start-preview could not workaround s4 mini preview size "
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            int r0 = r2.width     // Catch:{ all -> 0x0351 }
            r1.append(r0)     // Catch:{ all -> 0x0351 }
            r1.append(r10)     // Catch:{ all -> 0x0351 }
            int r0 = r2.height     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x0351 }
            goto L_0x02b5
        L_0x032c:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x02b8
            goto L_0x0293
        L_0x0332:
            if (r15 != 0) goto L_0x033e
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x0351 }
            X.Cy4 r0 = new X.Cy4     // Catch:{ all -> 0x0351 }
            r0.<init>()     // Catch:{ all -> 0x0351 }
            r1.autoFocus(r0)     // Catch:{ all -> 0x0351 }
        L_0x033e:
            r0 = 1
            r11.A0M = r0     // Catch:{ all -> 0x0351 }
            X.E9p r0 = r11.A0F     // Catch:{ all -> 0x0351 }
            if (r0 == 0) goto L_0x0348
            r0.C1j()     // Catch:{ all -> 0x0351 }
        L_0x0348:
            monitor-exit(r11)
            return
        L_0x034a:
            java.lang.String r0 = "previewSize is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x0351 }
            throw r0     // Catch:{ all -> 0x0351 }
        L_0x0351:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bq6.A07(X.Bq6):void");
    }

    private Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        return cameraInfo;
    }

    private List getFallbackSupportedPreviewSizes() {
        Log.i("cameraview/fallback-supported-preview-sizes");
        ArrayList A13 = AnonymousClass000.A13();
        Camera camera = this.A07;
        camera.getClass();
        A13.add(new Camera.Size(camera, 640, 480));
        return A13;
    }

    private int getRequiredCameraRotation() {
        int rotation = this.A0W.getRotation();
        Camera.CameraInfo cameraInfo = getCameraInfo();
        int i = 0;
        boolean A1T = AnonymousClass000.A1T(cameraInfo.facing, 1);
        this.A0N = A1T;
        int i2 = cameraInfo.orientation;
        if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = 180;
        } else if (rotation == 3) {
            i = 270;
        }
        int i3 = i2 - i;
        if (A1T) {
            i3 = i2 + i;
        }
        int i4 = (i3 + 360) % 360;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("cameraview/orientation display:");
        A10.append(i);
        A10.append(" camera:");
        A10.append(i2);
        C17900vP.A0j(" rotate:", A10, i4);
        return i4;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0J.A05(C19620yd.A09);
    }

    public void BEp() {
        this.A0a.disable();
        HandlerThread handlerThread = this.A0S;
        if (handlerThread != null) {
            handlerThread.quit();
            this.A0S = null;
        }
        this.A0b.A00();
    }

    public void BEu() {
        CZK czk = this.A0b;
        synchronized (czk) {
            czk.A00 = null;
        }
    }

    public void BLS(float f, float f2) {
        Handler handler = this.A09;
        handler.getClass();
        handler.post(new C146547Pn(this, f, f2, 1));
    }

    public boolean Beu() {
        return this.A0N;
    }

    public boolean Bf2() {
        return this.A0M;
    }

    public /* synthetic */ boolean Bga() {
        return false;
    }

    public boolean Bgi() {
        Camera camera = this.A07;
        if (camera != null && this.A0P) {
            try {
                return "torch".equals(camera.getParameters().getFlashMode());
            } catch (RuntimeException e) {
                C108995ce.A1M("CameraView/isTorchEnabled runtimeexception trying to check the torch state ", AnonymousClass000.A10(), e);
            }
        }
        return false;
    }

    public boolean Bk9() {
        Camera camera;
        if (!this.A0N || !"on".equals(this.A0L) || (camera = this.A07) == null) {
            return false;
        }
        List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains(this.A0L)) {
            return true;
        }
        return false;
    }

    public void CG0() {
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object, X.C5j] */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0271, code lost:
        if (r2.contains(r1) != false) goto L_0x0273;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e8 A[Catch:{ IOException -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0310 A[Catch:{ IOException -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0340 A[Catch:{ IOException -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0379 A[Catch:{ IOException -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03b5 A[SYNTHETIC, Splitter:B:151:0x03b5] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05a6 A[Catch:{ RuntimeException -> 0x05aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024f A[Catch:{ IOException -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0299 A[Catch:{ IOException -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a9 A[Catch:{ IOException -> 0x02f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void COO(java.io.File r26, int r27) {
        /*
            r25 = this;
            r6 = r25
            monitor-enter(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video front:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            boolean r0 = r6.A0N     // Catch:{ all -> 0x05d2 }
            X.C17900vP.A0r(r1, r0)     // Catch:{ all -> 0x05d2 }
            android.media.MediaRecorder r0 = new android.media.MediaRecorder     // Catch:{ all -> 0x05d2 }
            r0.<init>()     // Catch:{ all -> 0x05d2 }
            r6.A08 = r0     // Catch:{ all -> 0x05d2 }
            int r0 = r6.A00     // Catch:{ all -> 0x05d2 }
            r4 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r4)     // Catch:{ all -> 0x05d2 }
            r3 = 5
            r2 = 1
            int r0 = r6.A00     // Catch:{ all -> 0x05d2 }
            if (r1 == 0) goto L_0x002a
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r0, r4)     // Catch:{ all -> 0x05d2 }
            goto L_0x003b
        L_0x002a:
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r3)     // Catch:{ all -> 0x05d2 }
            int r0 = r6.A00     // Catch:{ all -> 0x05d2 }
            if (r1 == 0) goto L_0x0037
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r0, r3)     // Catch:{ all -> 0x05d2 }
            goto L_0x003b
        L_0x0037:
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r0, r2)     // Catch:{ all -> 0x05d2 }
        L_0x003b:
            if (r5 != 0) goto L_0x0040
            java.lang.String r0 = "cameraview/ no profile"
            goto L_0x00af
        L_0x0040:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video profile:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.videoFrameWidth     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r15 = "x"
            r1.append(r15)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.videoFrameHeight     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = " videoCodec:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.videoCodec     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = " audioCodec:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.audioCodec     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = " fileFormat:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.fileFormat     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = " videoFrameRate:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.videoFrameRate     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r24 = " videoBitRate:"
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r5.videoBitRate     // Catch:{ all -> 0x05d2 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0.getClass()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Parameters r23 = r0.getParameters()     // Catch:{ all -> 0x05d2 }
            java.util.List r22 = r23.getSupportedPreviewSizes()     // Catch:{ all -> 0x05d2 }
            if (r22 != 0) goto L_0x009f
            java.util.List r22 = r6.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x05d2 }
        L_0x009f:
            java.util.List r8 = r23.getSupportedVideoSizes()     // Catch:{ all -> 0x05d2 }
            if (r8 != 0) goto L_0x00a7
            r8 = r22
        L_0x00a7:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "cameraview/prepare-video no supported video sizes"
        L_0x00af:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
        L_0x00b2:
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
            r6.A03()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "CameraCustomException: Start-video-capture failed"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x05d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x05d2 }
        L_0x00c1:
            r0 = 1
            A09(r6, r1, r0)     // Catch:{ all -> 0x05d2 }
            goto L_0x05c9
        L_0x00c7:
            android.hardware.Camera$Size r4 = r23.getPreferredPreviewSizeForVideo()     // Catch:{ all -> 0x05d2 }
            if (r4 == 0) goto L_0x0161
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r4.width     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            r1.append(r15)     // Catch:{ all -> 0x05d2 }
            int r0 = r4.height     // Catch:{ all -> 0x05d2 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x05d2 }
            int r7 = r4.width     // Catch:{ all -> 0x05d2 }
            r0 = 176(0xb0, float:2.47E-43)
            if (r7 != r0) goto L_0x00ef
            int r1 = r4.height     // Catch:{ all -> 0x05d2 }
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x0166
        L_0x00ef:
            int r0 = r4.height     // Catch:{ all -> 0x05d2 }
            int r7 = r7 * r0
        L_0x00f2:
            r20 = 13
            r0 = r20
            X.DUR.A00(r0, r8)     // Catch:{ all -> 0x05d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video supported video sizes:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = A02(r8)     // Catch:{ all -> 0x05d2 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x05d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video supported preview sizes:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = A02(r22)     // Catch:{ all -> 0x05d2 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r2 = r6.A04     // Catch:{ all -> 0x05d2 }
            if (r2 == 0) goto L_0x05cb
            int r0 = r2.width     // Catch:{ all -> 0x05d2 }
            double r0 = (double) r0     // Catch:{ all -> 0x05d2 }
            int r2 = r2.height     // Catch:{ all -> 0x05d2 }
            double r2 = (double) r2     // Catch:{ all -> 0x05d2 }
            double r0 = r0 / r2
            java.util.Iterator r21 = r8.iterator()     // Catch:{ all -> 0x05d2 }
            r12 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r10 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0132:
            boolean r2 = r21.hasNext()     // Catch:{ all -> 0x05d2 }
            if (r2 == 0) goto L_0x016a
            java.lang.Object r14 = r21.next()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r14 = (android.hardware.Camera.Size) r14     // Catch:{ all -> 0x05d2 }
            int r3 = r14.width     // Catch:{ all -> 0x05d2 }
            r2 = 1280(0x500, float:1.794E-42)
            if (r3 > r2) goto L_0x0132
            r2 = 320(0x140, float:4.48E-43)
            if (r3 < r2) goto L_0x0132
            double r2 = (double) r3     // Catch:{ all -> 0x05d2 }
            int r8 = r14.height     // Catch:{ all -> 0x05d2 }
            double r8 = (double) r8     // Catch:{ all -> 0x05d2 }
            double r2 = r2 / r8
            android.hardware.Camera$Size r8 = r6.A06     // Catch:{ all -> 0x05d2 }
            if (r8 == 0) goto L_0x015d
            double r18 = X.BE6.A01(r0, r2)     // Catch:{ all -> 0x05d2 }
            double r16 = X.BE6.A01(r0, r10)     // Catch:{ all -> 0x05d2 }
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x0132
        L_0x015d:
            r6.A06 = r14     // Catch:{ all -> 0x05d2 }
            r10 = r2
            goto L_0x0132
        L_0x0161:
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
        L_0x0166:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00f2
        L_0x016a:
            android.hardware.Camera$Size r0 = r6.A06     // Catch:{ all -> 0x05d2 }
            if (r0 != 0) goto L_0x0172
            java.lang.String r0 = "cameraview/prepare-video cannot find video size"
            goto L_0x00af
        L_0x0172:
            java.util.Iterator r1 = r22.iterator()     // Catch:{ all -> 0x05d2 }
        L_0x0176:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x018d
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r0 = r6.A06     // Catch:{ all -> 0x05d2 }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0176
            if (r10 != 0) goto L_0x020d
            goto L_0x018e
        L_0x018d:
            r10 = 0
        L_0x018e:
            android.hardware.Camera$Size r1 = r6.A06     // Catch:{ all -> 0x05d2 }
            int r0 = r1.width     // Catch:{ all -> 0x05d2 }
            double r2 = (double) r0     // Catch:{ all -> 0x05d2 }
            int r0 = r1.height     // Catch:{ all -> 0x05d2 }
            double r0 = (double) r0     // Catch:{ all -> 0x05d2 }
            double r2 = r2 / r0
            java.util.Iterator r14 = r22.iterator()     // Catch:{ all -> 0x05d2 }
        L_0x019b:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r11 = (android.hardware.Camera.Size) r11     // Catch:{ all -> 0x05d2 }
            int r1 = r11.width     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r9 = r6.A06     // Catch:{ all -> 0x05d2 }
            int r0 = r9.width     // Catch:{ all -> 0x05d2 }
            if (r1 < r0) goto L_0x019b
            int r8 = r11.height     // Catch:{ all -> 0x05d2 }
            int r0 = r9.height     // Catch:{ all -> 0x05d2 }
            if (r8 < r0) goto L_0x019b
            int r0 = r8 * r1
            if (r0 > r7) goto L_0x019b
            double r0 = (double) r1     // Catch:{ all -> 0x05d2 }
            double r8 = (double) r8     // Catch:{ all -> 0x05d2 }
            double r0 = r0 / r8
            if (r10 == 0) goto L_0x01ca
            double r18 = X.BE6.A01(r2, r0)     // Catch:{ all -> 0x05d2 }
            double r16 = X.BE6.A01(r2, r12)     // Catch:{ all -> 0x05d2 }
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x019b
        L_0x01ca:
            r10 = r11
            r12 = r0
            goto L_0x019b
        L_0x01cd:
            if (r10 != 0) goto L_0x020d
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size that is larger than video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
            java.util.Iterator r14 = r22.iterator()     // Catch:{ all -> 0x05d2 }
        L_0x01d8:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0200
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera$Size r11 = (android.hardware.Camera.Size) r11     // Catch:{ all -> 0x05d2 }
            int r8 = r11.height     // Catch:{ all -> 0x05d2 }
            int r1 = r11.width     // Catch:{ all -> 0x05d2 }
            int r0 = r8 * r1
            if (r0 > r7) goto L_0x01d8
            double r0 = (double) r1     // Catch:{ all -> 0x05d2 }
            double r8 = (double) r8     // Catch:{ all -> 0x05d2 }
            double r0 = r0 / r8
            if (r10 == 0) goto L_0x01fd
            double r18 = X.BE6.A01(r2, r0)     // Catch:{ all -> 0x05d2 }
            double r16 = X.BE6.A01(r2, r12)     // Catch:{ all -> 0x05d2 }
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x01d8
        L_0x01fd:
            r10 = r11
            r12 = r0
            goto L_0x01d8
        L_0x0200:
            if (r10 != 0) goto L_0x020d
            java.lang.String r0 = "cameraview/prepare-video use preferred video size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
            if (r4 != 0) goto L_0x020e
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size"
            goto L_0x00af
        L_0x020d:
            r4 = r10
        L_0x020e:
            android.hardware.Camera$Size r0 = r6.A06     // Catch:{ all -> 0x05d2 }
            int r7 = r0.width     // Catch:{ all -> 0x05d2 }
            r5.videoFrameWidth = r7     // Catch:{ all -> 0x05d2 }
            int r3 = r0.height     // Catch:{ all -> 0x05d2 }
            r5.videoFrameHeight = r3     // Catch:{ all -> 0x05d2 }
            int r0 = r7 * r3
            int r2 = r0 * 4
            r5.videoBitRate = r2     // Catch:{ all -> 0x05d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video use profile:"
            X.BEA.A1P(r0, r15, r1, r7, r3)     // Catch:{ all -> 0x05d2 }
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            r1.append(r2)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            int r0 = r4.width     // Catch:{ all -> 0x05d2 }
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            r1.append(r15)     // Catch:{ all -> 0x05d2 }
            int r0 = r4.height     // Catch:{ all -> 0x05d2 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r2 = "cam_mode"
            r1 = 1
            r0 = r23
            r0.set(r2, r1)     // Catch:{ all -> 0x05d2 }
            java.util.List r2 = r23.getSupportedFocusModes()     // Catch:{ all -> 0x05d2 }
            if (r2 == 0) goto L_0x0299
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cameraview/prepare-video supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x05d2 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "continuous-video"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x05d2 }
            if (r0 != 0) goto L_0x0273
            java.lang.String r1 = "infinity"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0278
        L_0x0273:
            r0 = r23
            r0.setFocusMode(r1)     // Catch:{ all -> 0x05d2 }
        L_0x0278:
            android.hardware.Camera$Size r13 = r6.A04     // Catch:{ all -> 0x05d2 }
            int r0 = r13.width     // Catch:{ all -> 0x05d2 }
            double r7 = (double) r0     // Catch:{ all -> 0x05d2 }
            int r0 = r13.height     // Catch:{ all -> 0x05d2 }
            double r2 = (double) r0     // Catch:{ all -> 0x05d2 }
            double r11 = r7 / r2
            int r0 = r4.width     // Catch:{ all -> 0x05d2 }
            double r0 = (double) r0     // Catch:{ all -> 0x05d2 }
            int r9 = r4.height     // Catch:{ all -> 0x05d2 }
            double r9 = (double) r9     // Catch:{ all -> 0x05d2 }
            double r0 = r0 / r9
            double r9 = X.BE6.A01(r11, r0)     // Catch:{ all -> 0x05d2 }
            double r2 = r2 / r7
            double r0 = X.BE6.A01(r2, r0)     // Catch:{ all -> 0x05d2 }
            double r7 = java.lang.Math.min(r9, r0)     // Catch:{ all -> 0x05d2 }
            r6.A05 = r13     // Catch:{ all -> 0x05d2 }
            goto L_0x029f
        L_0x0299:
            java.lang.String r0 = "cameraview/prepare-video supported focus: null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
            goto L_0x0278
        L_0x029f:
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r3 = 0
            if (r0 <= 0) goto L_0x02c2
            r3 = 1
            java.lang.String r0 = "cameraview/prepare-video restart preview for video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
            int r2 = r4.width     // Catch:{ all -> 0x05d2 }
            int r1 = r4.height     // Catch:{ all -> 0x05d2 }
            r0 = r23
            r0.setPreviewSize(r2, r1)     // Catch:{ all -> 0x05d2 }
            r6.A05 = r4     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0.stopPreview()     // Catch:{ all -> 0x05d2 }
            r0 = 0
            r6.A0M = r0     // Catch:{ all -> 0x05d2 }
        L_0x02c2:
            java.lang.String r1 = "on"
            java.lang.String r0 = r6.A0L     // Catch:{ all -> 0x05d2 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x02df
            java.util.List r0 = r23.getSupportedFlashModes()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x02df
            java.lang.String r1 = "torch"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x02df
            r0 = r23
            r0.setFlashMode(r1)     // Catch:{ all -> 0x05d2 }
        L_0x02df:
            android.hardware.Camera r1 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0 = r23
            r1.setParameters(r0)     // Catch:{ all -> 0x05d2 }
            if (r3 == 0) goto L_0x0306
            java.lang.String r0 = "cameraview/prepare-video restart preview"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera r1 = r6.A07     // Catch:{ IOException -> 0x02f5 }
            android.view.SurfaceHolder r0 = r6.A0X     // Catch:{ IOException -> 0x02f5 }
            r1.setPreviewDisplay(r0)     // Catch:{ IOException -> 0x02f5 }
            goto L_0x02fb
        L_0x02f5:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video  error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05d2 }
        L_0x02fb:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0.startPreview()     // Catch:{ all -> 0x05d2 }
            r0 = 1
            r6.A0M = r0     // Catch:{ all -> 0x05d2 }
            r6.requestLayout()     // Catch:{ all -> 0x05d2 }
        L_0x0306:
            android.hardware.Camera r1 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0 = 0
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x05d2 }
            boolean r0 = r6.A0N     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0335
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05d2 }
            r0 = 27
            if (r1 != r0) goto L_0x0333
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "oppo"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0333
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "cph1803"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x05d2 }
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = "cph1901"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0333
            goto L_0x0335
        L_0x0333:
            r4 = 1
            goto L_0x0336
        L_0x0335:
            r4 = 0
        L_0x0336:
            X.17x r0 = r6.A0H     // Catch:{ all -> 0x05d2 }
            boolean r2 = r0.A0E()     // Catch:{ all -> 0x05d2 }
            java.lang.String r3 = "camerview/prepare-video record audio denied, will record without sound"
            if (r4 == 0) goto L_0x0379
            X.17x r0 = r6.A0H     // Catch:{ all -> 0x05d2 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x0375
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x05d2 }
        L_0x034e:
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            r0 = 2
            A05(r5, r1, r6, r0, r2)     // Catch:{ all -> 0x05d2 }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x05d2 }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x05d2 }
        L_0x035d:
            int r0 = r6.getRequiredCameraRotation()     // Catch:{ all -> 0x05d2 }
            int r0 = r0 + r27
            int r1 = r0 % 360
            if (r4 == 0) goto L_0x036f
            int r0 = r1 % 180
            if (r0 != 0) goto L_0x036f
            int r0 = r1 + 180
            int r1 = r0 % 360
        L_0x036f:
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ all -> 0x05d2 }
            r0.setOrientationHint(r1)     // Catch:{ all -> 0x05d2 }
            goto L_0x03ae
        L_0x0375:
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x05d2 }
            goto L_0x034e
        L_0x0379:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0.unlock()     // Catch:{ all -> 0x05d2 }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r1.setCamera(r0)     // Catch:{ all -> 0x05d2 }
            if (r2 == 0) goto L_0x038e
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x05d2 }
            goto L_0x0391
        L_0x038e:
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x05d2 }
        L_0x0391:
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            r0 = 1
            A05(r5, r1, r6, r0, r2)     // Catch:{ all -> 0x05d2 }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x05d2 }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x05d2 }
            android.media.MediaRecorder r1 = r6.A08     // Catch:{ all -> 0x05d2 }
            android.view.SurfaceHolder r0 = r6.getHolder()     // Catch:{ all -> 0x05d2 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ all -> 0x05d2 }
            r1.setPreviewDisplay(r0)     // Catch:{ all -> 0x05d2 }
            goto L_0x035d
        L_0x03ae:
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ IOException | IllegalStateException -> 0x05b5 }
            r0.prepare()     // Catch:{ IOException | IllegalStateException -> 0x05b5 }
            if (r4 == 0) goto L_0x0592
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0.stopPreview()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera r1 = r6.A07     // Catch:{ IOException -> 0x03c1 }
            r0 = 0
            r1.setPreviewDisplay(r0)     // Catch:{ IOException -> 0x03c1 }
            goto L_0x03c7
        L_0x03c1:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error clearing preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05d2 }
        L_0x03c7:
            r0 = 1
            X.CqK r3 = new X.CqK     // Catch:{ all -> 0x05d2 }
            r3.<init>(r0)     // Catch:{ all -> 0x05d2 }
            r6.A0A = r3     // Catch:{ all -> 0x05d2 }
            android.view.SurfaceHolder r0 = r6.A0X     // Catch:{ all -> 0x05d2 }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x05d2 }
            r1 = 0
            X.CYn r0 = new X.CYn     // Catch:{ all -> 0x05d2 }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x05d2 }
            r6.A0C = r0     // Catch:{ all -> 0x05d2 }
            r0.A00()     // Catch:{ all -> 0x05d2 }
            X.C5j r2 = new X.C5j     // Catch:{ all -> 0x05d2 }
            r2.<init>()     // Catch:{ all -> 0x05d2 }
            r7 = 9
            float[] r0 = new float[r7]     // Catch:{ all -> 0x05d2 }
            r2.A09 = r0     // Catch:{ all -> 0x05d2 }
            java.lang.String r3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"
            r0 = 36197(0x8d65, float:5.0723E-41)
            r2.A01 = r0     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r3 = X.C26070Crk.A00(r0, r3)     // Catch:{ all -> 0x05d2 }
            r5 = 0
            if (r3 == 0) goto L_0x0446
            r0 = 35632(0x8b30, float:4.9931E-41)
            int r1 = X.C26070Crk.A00(r0, r1)     // Catch:{ all -> 0x05d2 }
            if (r1 == 0) goto L_0x0446
            int r8 = android.opengl.GLES20.glCreateProgram()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "glCreateProgram"
            X.C26070Crk.A02(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r4 = "Grafika"
            if (r8 != 0) goto L_0x0419
            java.lang.String r0 = "Could not create program"
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x05d2 }
        L_0x0419:
            android.opengl.GLES20.glAttachShader(r8, r3)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "glAttachShader"
            X.C26070Crk.A02(r0)     // Catch:{ all -> 0x05d2 }
            android.opengl.GLES20.glAttachShader(r8, r1)     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A02(r0)     // Catch:{ all -> 0x05d2 }
            android.opengl.GLES20.glLinkProgram(r8)     // Catch:{ all -> 0x05d2 }
            r3 = 1
            int[] r1 = new int[r3]     // Catch:{ all -> 0x05d2 }
            r0 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r0, r1, r5)     // Catch:{ all -> 0x05d2 }
            r0 = r1[r5]     // Catch:{ all -> 0x05d2 }
            if (r0 == r3) goto L_0x0449
            java.lang.String r0 = "Could not link program: "
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = android.opengl.GLES20.glGetProgramInfoLog(r8)     // Catch:{ all -> 0x05d2 }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x05d2 }
            android.opengl.GLES20.glDeleteProgram(r8)     // Catch:{ all -> 0x05d2 }
        L_0x0446:
            r2.A00 = r5     // Catch:{ all -> 0x05d2 }
            goto L_0x044b
        L_0x0449:
            r5 = r8
            goto L_0x0446
        L_0x044b:
            if (r5 == 0) goto L_0x05c2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "Created program "
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            r1.append(r5)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "TEXTURE_EXT"
            r1.append(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = X.AnonymousClass8BU.A0q(r1)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "Grafika"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x05d2 }
            int r0 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "aPosition"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)     // Catch:{ all -> 0x05d2 }
            r2.A02 = r0     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A01(r0, r1)     // Catch:{ all -> 0x05d2 }
            int r0 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)     // Catch:{ all -> 0x05d2 }
            r2.A03 = r0     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A01(r0, r1)     // Catch:{ all -> 0x05d2 }
            int r0 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "uMVPMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ all -> 0x05d2 }
            r2.A06 = r0     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A01(r0, r1)     // Catch:{ all -> 0x05d2 }
            int r0 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "uTexMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ all -> 0x05d2 }
            r2.A07 = r0     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A01(r0, r1)     // Catch:{ all -> 0x05d2 }
            int r1 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "uKernel"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r1, r0)     // Catch:{ all -> 0x05d2 }
            r2.A05 = r0     // Catch:{ all -> 0x05d2 }
            if (r0 >= 0) goto L_0x04b4
            r0 = -1
            r2.A05 = r0     // Catch:{ all -> 0x05d2 }
            r2.A08 = r0     // Catch:{ all -> 0x05d2 }
            r2.A04 = r0     // Catch:{ all -> 0x05d2 }
            goto L_0x051f
        L_0x04b4:
            int r0 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "uTexOffset"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ all -> 0x05d2 }
            r2.A08 = r0     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A01(r0, r1)     // Catch:{ all -> 0x05d2 }
            int r0 = r2.A00     // Catch:{ all -> 0x05d2 }
            java.lang.String r1 = "uColorAdjust"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ all -> 0x05d2 }
            r2.A04 = r0     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A01(r0, r1)     // Catch:{ all -> 0x05d2 }
            float[] r3 = new float[r7]     // Catch:{ all -> 0x05d2 }
            r3 = {0, 0, 0, 0, 1065353216, 0, 0, 0, 0} // fill-array     // Catch:{ all -> 0x05d2 }
            float[] r1 = r2.A09     // Catch:{ all -> 0x05d2 }
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r1, r0, r7)     // Catch:{ all -> 0x05d2 }
            r0 = 1132462080(0x43800000, float:256.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r0
            r0 = 18
            float[] r3 = new float[r0]     // Catch:{ all -> 0x05d2 }
            r0 = 0
            float r5 = -r4
            r3[r0] = r5     // Catch:{ all -> 0x05d2 }
            r0 = 1
            r3[r0] = r5     // Catch:{ all -> 0x05d2 }
            r0 = 2
            r1 = 0
            r3[r0] = r1     // Catch:{ all -> 0x05d2 }
            X.BE9.A1N(r3, r5, r4)     // Catch:{ all -> 0x05d2 }
            r0 = 5
            r3[r0] = r5     // Catch:{ all -> 0x05d2 }
            r0 = 6
            r3[r0] = r5     // Catch:{ all -> 0x05d2 }
            r0 = 7
            r3[r0] = r1     // Catch:{ all -> 0x05d2 }
            r0 = 8
            r3[r0] = r1     // Catch:{ all -> 0x05d2 }
            r3[r7] = r1     // Catch:{ all -> 0x05d2 }
            r0 = 10
            r3[r0] = r4     // Catch:{ all -> 0x05d2 }
            r0 = 11
            r3[r0] = r1     // Catch:{ all -> 0x05d2 }
            r0 = 12
            r3[r0] = r5     // Catch:{ all -> 0x05d2 }
            r3[r20] = r4     // Catch:{ all -> 0x05d2 }
            r0 = 14
            r3[r0] = r1     // Catch:{ all -> 0x05d2 }
            r0 = 15
            r3[r0] = r4     // Catch:{ all -> 0x05d2 }
            r0 = 16
            r3[r0] = r4     // Catch:{ all -> 0x05d2 }
            r0 = 17
            r3[r0] = r4     // Catch:{ all -> 0x05d2 }
            r2.A0A = r3     // Catch:{ all -> 0x05d2 }
        L_0x051f:
            X.CVZ r0 = new X.CVZ     // Catch:{ all -> 0x05d2 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d2 }
            r6.A0B = r0     // Catch:{ all -> 0x05d2 }
            X.C5j r4 = r0.A00     // Catch:{ all -> 0x05d2 }
            r0 = 1
            int[] r2 = new int[r0]     // Catch:{ all -> 0x05d2 }
            r1 = 0
            android.opengl.GLES20.glGenTextures(r0, r2, r1)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "glGenTextures"
            X.C26070Crk.A02(r0)     // Catch:{ all -> 0x05d2 }
            r3 = r2[r1]     // Catch:{ all -> 0x05d2 }
            int r0 = r4.A01     // Catch:{ all -> 0x05d2 }
            android.opengl.GLES20.glBindTexture(r0, r3)     // Catch:{ all -> 0x05d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "glBindTexture "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x05d2 }
            X.C26070Crk.A02(r0)     // Catch:{ all -> 0x05d2 }
            r2 = 10241(0x2801, float:1.435E-41)
            r1 = 1175977984(0x46180000, float:9728.0)
            r0 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glTexParameterf(r0, r2, r1)     // Catch:{ all -> 0x05d2 }
            X.BEA.A0z()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = "glTexParameter"
            X.C26070Crk.A02(r0)     // Catch:{ all -> 0x05d2 }
            r6.A02 = r3     // Catch:{ all -> 0x05d2 }
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x05d2 }
            r2.<init>(r3)     // Catch:{ all -> 0x05d2 }
            r6.A03 = r2     // Catch:{ all -> 0x05d2 }
            r1 = 2
            X.Cy1 r0 = new X.Cy1     // Catch:{ all -> 0x05d2 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x05d2 }
            r2.setOnFrameAvailableListener(r0)     // Catch:{ all -> 0x05d2 }
            X.CqK r3 = r6.A0A     // Catch:{ all -> 0x05d2 }
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ all -> 0x05d2 }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x05d2 }
            r1 = 1
            X.CYn r0 = new X.CYn     // Catch:{ all -> 0x05d2 }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x05d2 }
            r6.A0D = r0     // Catch:{ all -> 0x05d2 }
            r0.A00()     // Catch:{ all -> 0x05d2 }
            android.hardware.Camera r1 = r6.A07     // Catch:{ IOException -> 0x0587 }
            android.graphics.SurfaceTexture r0 = r6.A03     // Catch:{ IOException -> 0x0587 }
            r1.setPreviewTexture(r0)     // Catch:{ IOException -> 0x0587 }
            goto L_0x058d
        L_0x0587:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error setting preview texture"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05d2 }
        L_0x058d:
            android.hardware.Camera r0 = r6.A07     // Catch:{ all -> 0x05d2 }
            r0.startPreview()     // Catch:{ all -> 0x05d2 }
        L_0x0592:
            java.lang.String r0 = "cameraview/start-video-capture"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x05aa }
            android.media.MediaRecorder r0 = r6.A08     // Catch:{ RuntimeException -> 0x05aa }
            r0.getClass()     // Catch:{ RuntimeException -> 0x05aa }
            r0.start()     // Catch:{ RuntimeException -> 0x05aa }
            r0 = 1
            r6.A0O = r0     // Catch:{ RuntimeException -> 0x05aa }
            X.E9p r0 = r6.A0F     // Catch:{ RuntimeException -> 0x05aa }
            if (r0 == 0) goto L_0x05c9
            r0.C9w()     // Catch:{ RuntimeException -> 0x05aa }
            goto L_0x05c9
        L_0x05aa:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05d2 }
            r6.A03()     // Catch:{ all -> 0x05d2 }
            goto L_0x00c1
        L_0x05b5:
            r1 = move-exception
            r1.getMessage()     // Catch:{ all -> 0x05d2 }
            r6.A03()     // Catch:{ all -> 0x05d2 }
            r0 = 1
            A09(r6, r1, r0)     // Catch:{ all -> 0x05d2 }
            goto L_0x00b2
        L_0x05c2:
            java.lang.String r0 = "Unable to create program"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x05d2 }
            goto L_0x05d1
        L_0x05c9:
            monitor-exit(r6)
            return
        L_0x05cb:
            java.lang.String r0 = "previewSize is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x05d2 }
        L_0x05d1:
            throw r0     // Catch:{ all -> 0x05d2 }
        L_0x05d2:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bq6.COO(java.io.File, int):void");
    }

    public boolean COq() {
        return this.A0P;
    }

    public void CPa() {
        String str;
        Camera camera = this.A07;
        if (camera != null && this.A0P) {
            Camera.Parameters parameters = camera.getParameters();
            if (Bgi()) {
                str = "off";
            } else {
                str = "torch";
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }

    public String getFlashMode() {
        return this.A0L;
    }

    public boolean isRecording() {
        return this.A0O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r1 == 2) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r11 = r18
            r1 = r19
            r0 = r20
            super.onMeasure(r1, r0)
            int r13 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A07
            java.lang.String r17 = "x"
            if (r0 == 0) goto L_0x0044
            android.hardware.Camera$Size r10 = r11.A05
            r16 = 0
            if (r10 != 0) goto L_0x0045
            java.util.List r0 = r11.A0T
            if (r0 == 0) goto L_0x0044
            X.11C r0 = r11.A0G
            android.view.WindowManager r0 = r0.A0L()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0035
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0036
        L_0x0035:
            r3 = 1
        L_0x0036:
            java.util.List r2 = r11.A0T
            r1 = r13
            r0 = r12
            if (r3 == 0) goto L_0x003e
            r1 = r12
            r0 = r13
        L_0x003e:
            android.hardware.Camera$Size r10 = A01(r2, r1, r0)
            if (r10 != 0) goto L_0x0045
        L_0x0044:
            return
        L_0x0045:
            double r4 = (double) r13
            double r2 = (double) r12
            double r8 = r4 / r2
            int r15 = r10.width
            double r6 = (double) r15
            int r14 = r10.height
            double r0 = (double) r14
            double r6 = r6 / r0
            double r8 = X.BE6.A01(r8, r6)
            double r0 = r2 / r4
            double r0 = X.BE6.A01(r0, r6)
            double r0 = java.lang.Math.min(r8, r0)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r8 = "cameraview/measure optimalpreviewsize:"
            r6 = r17
            X.BEA.A1P(r8, r6, r7, r15, r14)
            java.lang.String r8 = " measured:"
            X.BEA.A1P(r8, r6, r7, r13, r12)
            java.lang.String r6 = " aspect diff:"
            X.BEA.A1Q(r6, r7, r0)
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0044
            boolean r1 = X.C108975cc.A1D(r13, r12)
            int r9 = r10.width
            int r8 = r10.height
            if (r9 <= r8) goto L_0x0088
            r16 = 1
        L_0x0088:
            java.lang.String r6 = " scaleMax:"
            java.lang.String r7 = "cameraview/measure optimalpreviewsize scaleMin:"
            r0 = r16
            if (r1 != r0) goto L_0x00d1
            double r0 = (double) r9
            double r4 = r4 / r0
            double r0 = (double) r8
            double r2 = r2 / r0
            double r0 = java.lang.Math.min(r4, r2)
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r7)
            r4.append(r0)
            X.BEA.A1Q(r6, r4, r2)
            double r7 = r2 / r0
            r5 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x00b2
            r0 = r2
        L_0x00b2:
            int r2 = r10.width
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r10.height
        L_0x00b9:
            double r2 = (double) r2
            double r0 = r0 * r2
            int r2 = (int) r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "cameraview/measure result:"
            r1.append(r0)
            r1.append(r4)
            r0 = r17
            X.C17900vP.A0j(r0, r1, r2)
            r11.setMeasuredDimension(r4, r2)
            return
        L_0x00d1:
            double r0 = (double) r8
            double r4 = r4 / r0
            double r0 = (double) r9
            double r2 = r2 / r0
            double r0 = java.lang.Math.min(r4, r2)
            double r3 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r7)
            r2.append(r0)
            X.BEA.A1Q(r6, r2, r3)
            double r7 = r3 / r0
            r5 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00f3
            r0 = r3
        L_0x00f3:
            int r2 = r10.height
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r10.width
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bq6.onMeasure(int, int):void");
    }

    public void pause() {
    }

    public void setFlashMode(String str) {
        this.A0L = str;
        A04();
    }

    public void setQrDecodeHints(Map map) {
        this.A0b.A01 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (r2.contains(r1) != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8 A[Catch:{ RuntimeException -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3 A[Catch:{ RuntimeException -> 0x0020 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r23, int r24, int r25, int r26) {
        /*
            r22 = this;
            r9 = r22
            X.Bq5 r9 = (X.Bq5) r9
            android.view.SurfaceHolder r11 = r9.A04
            android.view.Surface r0 = r11.getSurface()
            if (r0 == 0) goto L_0x014c
            android.hardware.Camera r0 = r9.A02
            if (r0 == 0) goto L_0x014c
            r0.stopPreview()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            monitor-enter(r9)
            android.hardware.Camera r8 = r9.A02     // Catch:{ all -> 0x0149 }
            if (r8 == 0) goto L_0x0147
            int r2 = r9.getDisplayOrientation()     // Catch:{ all -> 0x0149 }
            r8.setDisplayOrientation(r2)     // Catch:{ RuntimeException -> 0x0020 }
            goto L_0x0026
        L_0x0020:
            r1 = move-exception
            java.lang.String r0 = "bloks_camera/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0149 }
        L_0x0026:
            android.hardware.Camera$Parameters r7 = r8.getParameters()     // Catch:{ all -> 0x0149 }
            r7.setRotation(r2)     // Catch:{ all -> 0x0149 }
            java.util.List r2 = r7.getSupportedFocusModes()     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x0083
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "bloks_camera/startpreview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x0149 }
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = X.C200210n.A01(r0)     // Catch:{ all -> 0x0149 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r1 = "auto"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r1 = "macro"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r1 = "edof"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x006d
        L_0x006a:
            r7.setFocusMode(r1)     // Catch:{ all -> 0x0149 }
        L_0x006d:
            int r2 = r9.A01     // Catch:{ all -> 0x0149 }
            if (r2 <= 0) goto L_0x0139
            int r10 = r9.A00     // Catch:{ all -> 0x0149 }
            if (r10 <= 0) goto L_0x0139
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0149 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0149 }
            int r1 = r0.orientation     // Catch:{ all -> 0x0149 }
            r0 = 1
            if (r1 != r0) goto L_0x008c
            goto L_0x0089
        L_0x0083:
            java.lang.String r0 = "bloks_camera/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            goto L_0x006d
        L_0x0089:
            double r4 = (double) r10     // Catch:{ all -> 0x0149 }
            double r0 = (double) r2     // Catch:{ all -> 0x0149 }
            goto L_0x009b
        L_0x008c:
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0149 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0149 }
            int r1 = r0.orientation     // Catch:{ all -> 0x0149 }
            r0 = 2
            if (r1 != r0) goto L_0x009d
            double r4 = (double) r2     // Catch:{ all -> 0x0149 }
            double r0 = (double) r10     // Catch:{ all -> 0x0149 }
        L_0x009b:
            double r4 = r4 / r0
            goto L_0x009f
        L_0x009d:
            r4 = 0
        L_0x009f:
            java.util.List r21 = r7.getSupportedPreviewSizes()     // Catch:{ all -> 0x0149 }
            java.util.Iterator r20 = r21.iterator()     // Catch:{ all -> 0x0149 }
            r18 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r6 = 0
            r16 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00b2:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r12 = r20.next()     // Catch:{ all -> 0x0149 }
            android.hardware.Camera$Size r12 = (android.hardware.Camera.Size) r12     // Catch:{ all -> 0x0149 }
            int r0 = r12.width     // Catch:{ all -> 0x0149 }
            double r2 = (double) r0     // Catch:{ all -> 0x0149 }
            int r13 = r12.height     // Catch:{ all -> 0x0149 }
            double r0 = (double) r13     // Catch:{ all -> 0x0149 }
            double r2 = r2 / r0
            double r14 = X.BE6.A01(r2, r4)     // Catch:{ all -> 0x0149 }
            r1 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            int r0 = r10 - r13
            double r0 = (double) r0     // Catch:{ all -> 0x0149 }
            double r1 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0149 }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            r16 = r1
            r6 = r12
            goto L_0x00b2
        L_0x00e1:
            if (r6 != 0) goto L_0x0113
            java.lang.String r0 = "bloks_camera/getOptimalSize optimalSize under tolerance not found"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            java.util.Iterator r12 = r21.iterator()     // Catch:{ all -> 0x0149 }
        L_0x00ec:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x010b
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0149 }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x0149 }
            int r0 = r10.width     // Catch:{ all -> 0x0149 }
            double r2 = (double) r0     // Catch:{ all -> 0x0149 }
            int r0 = r10.height     // Catch:{ all -> 0x0149 }
            double r0 = (double) r0     // Catch:{ all -> 0x0149 }
            double r2 = r2 / r0
            double r1 = X.BE6.A01(r2, r4)     // Catch:{ all -> 0x0149 }
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            r6 = r10
            r18 = r1
            goto L_0x00ec
        L_0x010b:
            if (r6 != 0) goto L_0x0113
            java.lang.String r0 = "bloks_camera/startpreview optimal size not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0139
        L_0x0113:
            int r1 = r6.width     // Catch:{ all -> 0x0149 }
            int r0 = r6.height     // Catch:{ all -> 0x0149 }
            r7.setPreviewSize(r1, r0)     // Catch:{ all -> 0x0149 }
            int r1 = r6.width     // Catch:{ all -> 0x0149 }
            int r0 = r6.height     // Catch:{ all -> 0x0149 }
            r7.setPictureSize(r1, r0)     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "bloks_camera/preview and picture size width : "
            r1.append(r0)     // Catch:{ all -> 0x0149 }
            int r0 = r6.width     // Catch:{ all -> 0x0149 }
            r1.append(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "height :"
            r1.append(r0)     // Catch:{ all -> 0x0149 }
            int r0 = r6.height     // Catch:{ all -> 0x0149 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x0149 }
        L_0x0139:
            r8.setParameters(r7)     // Catch:{ all -> 0x0149 }
            r8.setPreviewDisplay(r11)     // Catch:{ Exception -> 0x0143 }
            r8.startPreview()     // Catch:{ Exception -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x0149 }
        L_0x0147:
            monitor-exit(r9)
            return
        L_0x0149:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bq6.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Handler handler = this.A09;
        handler.getClass();
        handler.post(new AnonymousClass7R9((Object) this, 22));
        A03();
    }

    public static String A02(List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            A10.append(size.width);
            A10.append('x');
            BE8.A1D(A10, size.height);
        }
        if (A10.length() > 1) {
            A10.deleteCharAt(A10.length() - 2);
        }
        return A10.toString();
    }

    public static void A05(CamcorderProfile camcorderProfile, MediaRecorder mediaRecorder, Bq6 bq6, int i, int i2) {
        mediaRecorder.setVideoSource(i);
        MediaRecorder mediaRecorder2 = bq6.A08;
        if (i2 != 0) {
            mediaRecorder2.setProfile(camcorderProfile);
            return;
        }
        mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
        bq6.A08.setVideoFrameRate(camcorderProfile.videoFrameRate);
        bq6.A08.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        bq6.A08.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        bq6.A08.setVideoEncoder(camcorderProfile.videoCodec);
    }

    public static void A09(Bq6 bq6, Exception exc, int i) {
        C17900vP.A0j("cameraview/on-error ", AnonymousClass000.A10(), i);
        C28598E9p e9p = bq6.A0F;
        if (e9p != null) {
            int i2 = 2;
            if (i != 2) {
                i2 = 1;
            }
            e9p.BnT(exc, i2);
        }
    }

    public int getCameraFacing() {
        return getCameraInfo().facing;
    }

    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("flash_mode_count");
        return C17890vO.A00(sharedPreferences, C17880vN.A0t(A10, this.A00));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0a.enable();
        HandlerThread handlerThread = new HandlerThread("Camera");
        this.A0S = handlerThread;
        handlerThread.start();
        this.A09 = new Handler(this.A0S.getLooper());
        if (this.A0U) {
            this.A0b.A01();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BEp();
    }

    public void setCameraCallback(C28598E9p e9p) {
        this.A0F = e9p;
    }

    public void setQrScanningEnabled(boolean z) {
        this.A0U = z;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
