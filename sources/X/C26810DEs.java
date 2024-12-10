package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DEs  reason: case insensitive filesystem */
public class C26810DEs implements C28614EAk {
    public static final Camera.ShutterCallback A0g = new C26352CyE();
    public static volatile C26810DEs A0h;
    public int A00;
    public int A01;
    public int A02;
    public Camera.ErrorCallback A03;
    public E4h A04;
    public E1D A05;
    public EBS A06;
    public C25119CYs A07;
    public C25815CmS A08;
    public C28553E7e A09;
    public UUID A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public Matrix A0E;
    public CK8 A0F;
    public boolean A0G;
    public boolean A0H;
    public final C26194CuP A0I;
    public final C25690CkL A0J;
    public final CWY A0K;
    public final C25229CbQ A0L;
    public final CV9 A0M = new CV9();
    public final Cy7 A0N;
    public final C25202Cav A0O;
    public final C25132CZh A0P = new C25132CZh();
    public final C25132CZh A0Q = new C25132CZh();
    public final C26035Cqv A0R;
    public final C25850CnB A0S;
    public final AtomicBoolean A0T = BE6.A16(false);
    public final int A0U;
    public final Context A0V;
    public final C25132CZh A0W = new C25132CZh();
    public final AtomicBoolean A0X = BE6.A16(false);
    public final AtomicBoolean A0Y = BE6.A16(false);
    public volatile int A0Z;
    public volatile Camera A0a;
    public volatile C25103CXw A0b;
    public volatile EAW A0c;
    public volatile FutureTask A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;

    public static void A05(C26810DEs dEs) {
        try {
            C28553E7e e7e = dEs.A09;
            if (e7e != null) {
                e7e.COd();
                dEs.A09 = null;
            }
        } finally {
            dEs.A0A((MediaRecorder) null);
            dEs.A0e = false;
        }
    }

    public static synchronized void A06(C26810DEs dEs) {
        synchronized (dEs) {
            FutureTask futureTask = dEs.A0d;
            if (futureTask != null) {
                dEs.A0S.A08(futureTask);
                dEs.A0d = null;
            }
        }
    }

    public void A09() {
        try {
            if (this.A0e) {
                A05(this);
            }
        } catch (RuntimeException e) {
            Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
        } catch (Throwable th) {
            if (this.A0a != null) {
                A03();
                this.A0L.A00();
            }
            if (this.A0c != null) {
                EAW eaw = this.A0c;
                this.A0c.Ba1();
                eaw.CEN();
            }
            this.A0c = null;
            this.A07 = null;
            throw th;
        }
        if (this.A0a != null) {
            A03();
            this.A0L.A00();
        }
        if (this.A0c != null) {
            EAW eaw2 = this.A0c;
            this.A0c.Ba1();
            eaw2.CEN();
        }
        this.A0c = null;
        this.A07 = null;
    }

    public void BFe(C6E c6e, EBS ebs, C28611EAf eAf, C25119CYs cYs, String str, int i, int i2) {
        C26175Cts.A00 = 9;
        C26175Cts.A01((Object) null, 9, 0);
        if (this.A0C) {
            this.A0A = this.A0R.A03(this.A0S.A00, str);
        }
        this.A0S.A00(c6e, "connect", new C27127DVo(this, ebs, cYs, i, i2, 0));
        C26175Cts.A01((Object) null, 10, 0);
    }

    public boolean Bgf() {
        try {
            C26194CuP cuP = this.A0I;
            int i = C26194CuP.A03;
            if (i == -1) {
                if (C26194CuP.A03(cuP)) {
                    i = C26194CuP.A03;
                } else {
                    cuP.A00.A06("Number of cameras must be loaded on background thread.");
                    i = Camera.getNumberOfCameras();
                    C26194CuP.A03 = i;
                }
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void CK5(C6E c6e, int i) {
        this.A0S.A00(c6e, "set_rotation", new DVV(this, i, 1));
    }

    public void CP1(E9C e9c, C25729Ckz ckz) {
        EBS ebs = this.A06;
        C28111Yx.A02(ebs);
        Boolean bool = (Boolean) ebs.BMB(EBS.A0B);
        E9C e9c2 = e9c;
        if (isConnected() || bool.booleanValue()) {
            CV9 cv9 = this.A0M;
            Object obj = cv9.A00.get();
            C28111Yx.A02(obj);
            if (((CountDownLatch) obj).getCount() > 0) {
                e9c.Bsw(new C1Q("Busy taking photo"));
            } else if (!this.A0e || this.A0H) {
                C25986Cq0.A00().A03 = SystemClock.elapsedRealtime();
                if (!bool.booleanValue()) {
                    int A092 = BEA.A09(C25971Cpe.A0h, BZ5());
                    C26175Cts.A00 = 19;
                    C26175Cts.A01((Object) null, 19, A092);
                }
                cv9.A00(2);
                this.A0T.set(false);
                this.A0S.A00(new C22899BUk(ckz, e9c, this, 0), "take_photo", new C27125DVm(ckz, this, bool, e9c2, 0));
            } else {
                e9c.Bsw(new C1Q("Cannot take a photo while recording video"));
            }
        } else {
            e9c.Bsw(new C27206DZg("Cannot take a photo"));
        }
    }

    public static int A00(C26810DEs dEs, int i) {
        int i2;
        int i3;
        int i4 = dEs.A00;
        int A042 = dEs.A0I.A04(i4);
        if (i == 1) {
            i2 = 90;
        } else if (i != 2) {
            i2 = 270;
            if (i != 3) {
                i2 = 0;
            }
        } else {
            i2 = 180;
        }
        if (i4 == 1) {
            i3 = 360 - ((A042 + i2) % 360);
        } else {
            i3 = (A042 - i2) + 360;
        }
        return i3 % 360;
    }

    public static C26810DEs A01(Context context) {
        if (A0h == null) {
            synchronized (C26810DEs.class) {
                if (A0h == null) {
                    A0h = new C26810DEs(context.getApplicationContext());
                }
            }
        }
        return A0h;
    }

    public static C25556Chu A02(C26810DEs dEs, EBS ebs, C25119CYs cYs, int i) {
        C24907CPa BXW;
        int i2;
        Trace.beginSection("Camera1Device.initialiseCamera");
        C26078Crs.A01("initialiseCamera should not run on the UI thread");
        C25119CYs cYs2 = cYs;
        if (cYs != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C26810DEs dEs2 = dEs;
            if (dEs2.A0a != null) {
                C26175Cts.A01((Object) null, 39, 0);
                AtomicBoolean atomicBoolean = dEs2.A0X;
                EBS ebs2 = ebs;
                int i3 = i;
                if (!atomicBoolean.get() || !cYs2.equals(dEs2.A07) || dEs2.A0c != cYs2.A02 || dEs2.A01 != i3 || BE9.A1S(EBS.A0X, ebs2)) {
                    dEs2.A06 = ebs2;
                    dEs2.A07 = cYs2;
                    EAW eaw = cYs2.A02;
                    dEs2.A0c = eaw;
                    dEs2.A0K.A00(false, dEs2.A0a);
                    C24331BzS bzS = (C24331BzS) dEs2.A06.BMB(EBS.A0W);
                    C24331BzS bzS2 = (C24331BzS) dEs2.A06.BMB(EBS.A0b);
                    int i4 = cYs2.A01;
                    int i5 = cYs2.A00;
                    E9B e9b = (E9B) dEs2.A06.BMB(EBS.A0Z);
                    C25028CUf cUf = (C25028CUf) dEs2.A06.BMB(EBS.A0F);
                    dEs2.A0D = BE9.A1S(EBS.A0K, ebs2);
                    boolean A1S = BE9.A1S(EBS.A0N, ebs2);
                    dEs2.A01 = i3;
                    int A002 = A00(dEs2, i3);
                    C25202Cav cav = dEs2.A0O;
                    C25632CjI A012 = cav.A01(dEs2.A00);
                    C24331BzS bzS3 = C24331BzS.DEACTIVATED;
                    if (!bzS2.equals(bzS3)) {
                        if (!bzS.equals(bzS3)) {
                            BXW = e9b.BOy(bzS, bzS2, BE6.A11(C25632CjI.A0v, A012), BE6.A11(C25632CjI.A15, A012), BE6.A11(C25632CjI.A0z, A012), i4, i5);
                        } else {
                            BXW = e9b.BbQ(BE6.A11(C25632CjI.A15, A012), BE6.A11(C25632CjI.A0z, A012), i4, i5);
                        }
                    } else if (!bzS.equals(bzS3)) {
                        BXW = e9b.BX5(BE6.A11(C25632CjI.A0v, A012), BE6.A11(C25632CjI.A0z, A012), i4, i5);
                    } else {
                        BXW = e9b.BXW(BE6.A11(C25632CjI.A0z, A012), i4, i5);
                    }
                    C22909BUu A003 = cav.A00(dEs2.A00);
                    if (A1S) {
                        A003.A00.A04(C25971Cpe.A0c, new C26132Csv(0, 0));
                    }
                    C26132Csv csv = BXW.A00;
                    if (csv != null) {
                        A003.A00.A04(C25971Cpe.A0k, csv);
                    } else if (BXW.A01 == null) {
                        throw AnonymousClass8BR.A0w("SizeSetter returned null sizes!");
                    }
                    C26132Csv csv2 = BXW.A01;
                    if (csv2 != null) {
                        A003.A00.A04(C25971Cpe.A0q, csv2);
                    }
                    C26132Csv csv3 = BXW.A02;
                    if (csv3 != null) {
                        A003.A00.A04(C25971Cpe.A0y, csv3);
                    }
                    A003.A03();
                    A003.A00.A04(C25971Cpe.A00, C17880vN.A0j());
                    A003.A00.A04(C25971Cpe.A0z, C17880vN.A0h());
                    A003.A00.A04(C25971Cpe.A0n, cUf.A00(BE6.A11(C25632CjI.A0x, A003.A00)));
                    A003.A00.A04(C25971Cpe.A0s, AnonymousClass3MY.A0f());
                    int i6 = dEs2.A00;
                    C25632CjI A013 = cav.A01(i6);
                    Number number = (Number) dEs2.A06.BMB(EBS.A0P);
                    if (number.intValue() != 0) {
                        A003.A00.A04(C25971Cpe.A0a, number);
                    }
                    A003.A02();
                    C25229CbQ cbQ = dEs2.A0L;
                    cbQ.A01(dEs2.A0a);
                    C25971Cpe A022 = cav.A02(i6);
                    CKJ ckj = C25971Cpe.A0q;
                    C26132Csv csv4 = (C26132Csv) BE7.A0b(ckj, A022);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("startCameraPreview ");
                    int i7 = csv4.A02;
                    BE8.A1C(A10, i7);
                    int i8 = csv4.A01;
                    Trace.beginSection(C17880vN.A0t(A10, i8));
                    C26175Cts.A01((Object) null, 37, 0);
                    CKJ ckj2 = C25971Cpe.A0m;
                    C28111Yx.A02(A022.A04(ckj2));
                    int A042 = dEs2.A0I.A04(i6);
                    int i9 = dEs2.A0Z;
                    int i10 = dEs2.A01;
                    if (i10 == 1) {
                        i2 = 90;
                    } else if (i10 != 2) {
                        i2 = 270;
                        if (i10 != 3) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 180;
                    }
                    SurfaceTexture Ba0 = eaw.Ba0(i7, i8, A042, i9, i2, i6, 0);
                    C26175Cts.A01((Object) null, 38, 0);
                    if (Ba0 != null) {
                        dEs2.A0a.setPreviewTexture(Ba0);
                    }
                    boolean CSA = eaw.CSA();
                    Camera camera = dEs2.A0a;
                    if (CSA) {
                        A002 = A00(dEs2, 0);
                    }
                    camera.setDisplayOrientation(A002);
                    dEs2.A0H = BE9.A1T(C25632CjI.A0Z, A013);
                    atomicBoolean.set(true);
                    dEs2.A0Y.set(false);
                    dEs2.A0f = BE9.A1T(C25632CjI.A0e, A013);
                    Cy7 cy7 = dEs2.A0N;
                    Camera camera2 = dEs2.A0a;
                    int i11 = dEs2.A00;
                    cy7.A03 = camera2;
                    cy7.A00 = i11;
                    C25202Cav cav2 = cy7.A05;
                    C25632CjI A014 = cav2.A01(i11);
                    cy7.A0A = BE6.A11(C25632CjI.A18, A014);
                    cy7.A0E = BE9.A1T(C25632CjI.A0d, A014);
                    cy7.A09 = BEA.A09(C25971Cpe.A11, cav2.A02(i11));
                    cy7.A01 = BE9.A0B(C25632CjI.A0i, cav2.A01(i11));
                    Camera camera3 = cy7.A03;
                    C28111Yx.A02(camera3);
                    camera3.setZoomChangeListener(cy7);
                    cy7.A0B = true;
                    C25690CkL ckL = dEs2.A0J;
                    Camera camera4 = dEs2.A0a;
                    int i12 = dEs2.A00;
                    ckL.A06.A06("The FocusController must be prepared on the Optic thread.");
                    ckL.A01 = camera4;
                    ckL.A00 = i12;
                    ckL.A09 = true;
                    ckL.A08 = false;
                    ckL.A07 = false;
                    ckL.A04 = true;
                    ckL.A0A = false;
                    A08(dEs2, i7, i8);
                    cbQ.A02(dEs2.A0a, (C26132Csv) A022.A04(ckj), BEA.A09(ckj2, A022));
                    A04(dEs2);
                    C25986Cq0.A00().A01 = 0;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("time to setPreviewSurfaceTexture:");
                    A102.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    Log.d("Camera1Device", AnonymousClass000.A0y("ms", A102));
                    C25556Chu chu = new C25556Chu(new C24908CPb(A013, A022, i6));
                    C26175Cts.A01((Object) null, 40, 0);
                    Trace.endSection();
                    Trace.endSection();
                    return chu;
                }
                if (dEs2.A0K.A00.A01()) {
                    A04(dEs2);
                }
                return new C25556Chu(new C24908CPb(dEs2.BOK(), dEs2.BZ5(), dEs2.A00));
            }
            throw AnonymousClass8BR.A0w("Can't connect to the camera service.");
        }
        throw AnonymousClass000.A0k("StartupConfiguration cannot be null");
    }

    private void A03() {
        if (this.A0a != null) {
            A06(this);
            this.A0X.set(false);
            this.A0Y.set(false);
            Camera camera = this.A0a;
            this.A0a = null;
            Cy7 cy7 = this.A0N;
            if (cy7.A0B) {
                Handler handler = cy7.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                cy7.A0A = null;
                Camera camera2 = cy7.A03;
                C28111Yx.A02(camera2);
                camera2.setZoomChangeListener((Camera.OnZoomChangeListener) null);
                cy7.A03 = null;
                cy7.A0B = false;
            }
            C25690CkL ckL = this.A0J;
            ckL.A06.A06("The FocusController must be released on the Optic thread.");
            ckL.A09 = false;
            ckL.A01 = null;
            ckL.A08 = false;
            ckL.A07 = false;
            this.A0f = false;
            C25202Cav cav = this.A0O;
            cav.A02.remove(C26194CuP.A00(cav.A03, this.A00));
            this.A0S.A03("close_camera_on_camera_handler_thread", new DVY(this, camera, 7));
        }
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.BUu, X.CKK, java.lang.Object] */
    public static void A07(C26810DEs dEs, int i) {
        if (C25391Ces.A00(dEs.A0V)) {
            C26078Crs.A01("Should not check for open camera on the UI thread.");
            if (dEs.A0a == null || dEs.A00 != i) {
                int A002 = C26194CuP.A00(dEs.A0I, i);
                if (A002 != -1) {
                    dEs.A03();
                    C25986Cq0.A00().A00 = SystemClock.elapsedRealtime();
                    Camera camera = (Camera) dEs.A0S.A03("open_camera_on_camera_handler_thread", new DVV(dEs, A002, 0));
                    C28111Yx.A02(camera);
                    dEs.A0a = camera;
                    dEs.A00 = i;
                    Camera camera2 = dEs.A0a;
                    Camera.ErrorCallback errorCallback = dEs.A03;
                    if (errorCallback == null) {
                        errorCallback = new Cy6(dEs, 0);
                        dEs.A03 = errorCallback;
                    }
                    camera2.setErrorCallback(errorCallback);
                    C25202Cav cav = dEs.A0O;
                    Camera camera3 = dEs.A0a;
                    if (camera3 != null) {
                        C26175Cts.A01((Object) null, 43, 0);
                        int A003 = C26194CuP.A00(cav.A03, i);
                        Camera.Parameters parameters = camera3.getParameters();
                        C22903BUo bUo = new C22903BUo(parameters);
                        cav.A00.put(A003, bUo);
                        C22906BUr bUr = new C22906BUr(parameters, bUo);
                        cav.A01.put(A003, bUr);
                        SparseArray sparseArray = cav.A02;
                        ? ckk = new CKK();
                        ckk.A00 = bUo;
                        ckk.A01 = new C26114Csc(parameters, camera3, bUo, bUr, i);
                        sparseArray.put(A003, ckk);
                        C26175Cts.A01((Object) null, 44, 0);
                        return;
                    }
                    throw AnonymousClass000.A0s("camera is null!");
                }
                throw new C27258Dak(AnonymousClass001.A1I("Open Camera 1 failed: camera facing is not available: ", AnonymousClass000.A10(), i));
            }
            return;
        }
        throw new SecurityException("Open Camera 1 failed: No camera permissions!");
    }

    public void A0A(MediaRecorder mediaRecorder) {
        Camera camera = this.A0a;
        if (camera != null) {
            boolean z = this.A0B;
            int i = this.A02;
            if (mediaRecorder != null) {
                if (C25870Cne.A02(C25449Cg0.A00)) {
                    this.A0J.A01();
                }
                camera.unlock();
                mediaRecorder.setCamera(camera);
                mediaRecorder.setVideoSource(1);
                return;
            }
            camera.lock();
            if (C25870Cne.A02(C25449Cg0.A00)) {
                camera.reconnect();
            }
            EBS ebs = this.A06;
            C28111Yx.A02(ebs);
            boolean A1S = BE9.A1S(EBS.A0E, ebs);
            C22909BUu A002 = this.A0O.A00(this.A00);
            CKJ ckj = C25971Cpe.A0B;
            if (A1S) {
                C26128Csq.A02(ckj, A002, i);
            } else {
                C26128Csq.A02(ckj, A002, i);
                A002.A00.A04(C25971Cpe.A0W, Boolean.valueOf(z));
                A002.A03();
            }
            A002.A02();
        }
    }

    public void BBB(CJP cjp) {
        this.A0P.A01(cjp);
    }

    public void BBF(BCw bCw) {
        if (this.A0b == null) {
            this.A0b = new C25103CXw();
            this.A0K.A03 = this.A0b;
        }
        this.A0b.A00.add(bCw);
    }

    public void BBU(E4h e4h) {
        if (e4h != null) {
            C25229CbQ cbQ = this.A0L;
            synchronized (cbQ) {
                cbQ.A03.A01(e4h);
            }
            C25971Cpe A022 = this.A0O.A02(this.A00);
            C25850CnB cnB = this.A0S;
            boolean A092 = cnB.A09();
            boolean isConnected = isConnected();
            if (A092) {
                if (isConnected) {
                    cbQ.A02(this.A0a, (C26132Csv) A022.A04(C25971Cpe.A0q), BEA.A09(C25971Cpe.A0m, A022));
                }
            } else if (isConnected) {
                cnB.A07("enable_preview_frame_listeners", new DVY(this, A022, 1));
            }
        } else {
            throw AnonymousClass000.A0k("listener is required");
        }
    }

    public void BBV(E4i e4i) {
        EBS ebs = this.A06;
        if (ebs == null || !BE9.A1S(EBS.A0L, ebs)) {
            this.A0K.A01.A01(e4i);
        } else {
            this.A0S.A07("add_on_preview_started_listener", new DVY(this, e4i, 0));
        }
    }

    public int BDs(int i, int i2) {
        return this.A0I.A05(i, i2);
    }

    public boolean BIp(C6E c6e) {
        C26035Cqv cqv = this.A0R;
        UUID uuid = cqv.A03;
        C26175Cts.A01((Object) null, 23, 0);
        CV9 cv9 = this.A0M;
        AtomicReference atomicReference = cv9.A00;
        BE9.A1M(atomicReference);
        BE9.A1M(atomicReference);
        cv9.A00(0);
        CWY cwy = this.A0K;
        cwy.A01.A00();
        cwy.A02.A00();
        CIz((C28500E4g) null);
        this.A0N.A06.A00();
        this.A0Q.A00();
        if (this.A0C) {
            cqv.A05(this.A0A);
            this.A0A = null;
        }
        C25850CnB cnB = this.A0S;
        cnB.A00(c6e, "disconnect", new DVY(this, uuid, 6));
        cnB.A07("disconnect_guard", new DVQ(0));
        return true;
    }

    public void BLR(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0U;
        rect.inset(i3, i3);
        this.A0S.A00(new C22901BUm(this, 11), "focus", new DVY(this, rect, 2));
    }

    public C25632CjI BOK() {
        A0C("Cannot get camera capabilities");
        return this.A0O.A01(this.A00);
    }

    public int BZ0() {
        return this.A0I.A04(this.A00);
    }

    public C25971Cpe BZ5() {
        A0C("Cannot get camera settings");
        return this.A0O.A02(this.A00);
    }

    public boolean BcX(int i) {
        try {
            return this.A0I.A06(i);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public void BdT(Matrix matrix, int i, int i2, int i3) {
        CK8 ck8 = new CK8(matrix, i3, A00(this, this.A01), i, i2);
        this.A0F = ck8;
        this.A0J.A03 = ck8;
    }

    public boolean Bfx() {
        return this.A0K.A00.A01();
    }

    public boolean Bg9() {
        return this.A0e;
    }

    public boolean Bil(float[] fArr) {
        CK8 ck8 = this.A0F;
        if (ck8 == null) {
            return false;
        }
        ck8.A00.mapPoints(fArr);
        return true;
    }

    public void Bk3(C6E c6e, C25093CXe cXe) {
        this.A0S.A00(c6e, "modify_settings", new DVY(this, cXe, 3));
    }

    public void Bzj(int i) {
        if (!this.A0G) {
            this.A0Z = i;
            EAW eaw = this.A0c;
            if (eaw != null) {
                eaw.BrQ(this.A0Z);
            }
        }
    }

    public void CDk(View view, String str) {
        if (this.A0b != null) {
            C25103CXw cXw = this.A0b;
            if (!cXw.A00.isEmpty()) {
                C26078Crs.A00(new C21459AkQ(cXw, view, str, 3));
            }
        }
    }

    public void CEi(CJP cjp) {
        this.A0P.A02(cjp);
    }

    public void CEl(BCw bCw) {
        if (this.A0b != null) {
            this.A0b.A00.remove(bCw);
            if (!C17880vN.A1X(this.A0b.A00)) {
                this.A0b = null;
                this.A0K.A03 = null;
            }
        }
    }

    public void CEs(E4h e4h) {
        if (e4h != null) {
            C25229CbQ cbQ = this.A0L;
            synchronized (cbQ) {
                cbQ.A05.remove(e4h);
                cbQ.A03.A02(e4h);
            }
            if (this.A0R.A04) {
                this.A0S.A07("disable_preview_frame_listeners", new C27132DVt((Object) this, 3));
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("listener is required");
    }

    public void CEt(E4i e4i) {
        EBS ebs = this.A06;
        if (ebs == null || !BE9.A1S(EBS.A0L, ebs)) {
            this.A0K.A01.A02(e4i);
        } else {
            this.A0S.A07("remove_on_preview_started_listener", new DVY(this, e4i, 5));
        }
    }

    public void CIC(Handler handler) {
        this.A0S.A00 = handler;
    }

    public void CIz(C28500E4g e4g) {
        this.A0J.A02 = e4g;
    }

    public void CJQ(boolean z) {
        this.A0G = z;
        if (z) {
            this.A0Z = 0;
            EAW eaw = this.A0c;
            if (eaw != null) {
                eaw.BrQ(this.A0Z);
            }
        }
    }

    public void CJh(AnonymousClass86M r2) {
        this.A0R.A04(r2);
    }

    public void CLX(C6E c6e, int i) {
        this.A0S.A00(c6e, "set_zoom_level", new DVV(this, i, 2));
    }

    public void CNU(float f) {
        throw new C27258Dak("smoothZoomTo() is not supported in Camera1 API.");
    }

    public void CNa(C6E c6e, int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0U;
        rect.inset(i3, i3);
        this.A0S.A00(c6e, "spot_meter", new DVY(this, rect, 4));
    }

    public void COc(C6E c6e) {
        if (!this.A0e) {
            c6e.A00(AnonymousClass8BR.A0w("Not recording video"));
            return;
        }
        this.A0S.A00(c6e, "stop_video_recording", new DVS(this, SystemClock.elapsedRealtime()));
    }

    public void COv(C6E c6e) {
        Object obj = this.A0M.A00.get();
        C28111Yx.A02(obj);
        if (((CountDownLatch) obj).getCount() <= 0) {
            int i = this.A00;
            C26175Cts.A00 = 14;
            C26175Cts.A01((Object) null, 14, i);
            this.A0S.A00(c6e, "switch_camera", new C27132DVt((Object) this, 4));
        }
    }

    public int getCameraFacing() {
        return this.A00;
    }

    public int getZoomLevel() {
        Cy7 cy7 = this.A0N;
        if (cy7.A0B) {
            return cy7.A09;
        }
        return 0;
    }

    public boolean isConnected() {
        if (this.A0a == null) {
            return false;
        }
        if (this.A0X.get() || this.A0Y.get()) {
            return true;
        }
        return false;
    }

    public C26810DEs(Context context) {
        this.A0V = context;
        C25850CnB cnB = new C25850CnB();
        this.A0S = cnB;
        C26035Cqv cqv = new C26035Cqv(cnB);
        this.A0R = cqv;
        C26194CuP cuP = new C26194CuP(context.getPackageManager(), cqv, cnB);
        this.A0I = cuP;
        C25202Cav cav = new C25202Cav(cuP);
        this.A0O = cav;
        CWY cwy = new CWY();
        this.A0K = cwy;
        this.A0N = new Cy7(cav, cnB);
        this.A0J = new C25690CkL(cav, cnB);
        this.A0U = Math.round(TypedValue.applyDimension(1, 30.0f, C108965cb.A08(context)));
        this.A0L = new C25229CbQ();
        if (C24670CEk.A00) {
            C25986Cq0 A002 = C25986Cq0.A00();
            A002.A05.A01(new Object());
            this.A0b = new C25103CXw();
            C25103CXw cXw = this.A0b;
            cXw.A00.add(new Object());
            cwy.A03 = this.A0b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r1 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C26810DEs r4) {
        /*
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x0095
            X.E4h r1 = r4.A04
            if (r1 != 0) goto L_0x0012
            r0 = 2
            X.DEM r1 = new X.DEM
            r1.<init>(r4, r0)
            r4.A04 = r1
        L_0x0012:
            r4.BBU(r1)
            X.CWY r0 = r4.A0K
            android.hardware.Camera r3 = r4.A0a
            X.CYE r2 = r0.A00
            java.util.concurrent.locks.ReentrantLock r4 = r2.A01
            r4.lock()
            if (r3 == 0) goto L_0x008b
            r4.lock()     // Catch:{ all -> 0x007f }
            r4.lock()     // Catch:{ all -> 0x007a }
            int r0 = r2.A00     // Catch:{ all -> 0x006e }
            r1 = 2
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            r4.unlock()     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0048
            r4.lock()     // Catch:{ all -> 0x007a }
            int r0 = r2.A00     // Catch:{ all -> 0x006e }
            r1 = 4
            r0 = r0 & 4
            boolean r1 = X.AnonymousClass000.A1T(r0, r1)
            r4.unlock()     // Catch:{ all -> 0x007a }
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            r4.unlock()     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x008b
            boolean r0 = r2.A00()     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x008b
            r4.lock()     // Catch:{ all -> 0x007f }
            boolean r0 = r2.A01()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0073
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x007a }
            r4.unlock()     // Catch:{ all -> 0x007f }
            r2 = 32
            r1 = 0
            r0 = 0
            X.C26175Cts.A01(r0, r2, r1)     // Catch:{ all -> 0x007f }
            r3.startPreview()     // Catch:{ all -> 0x007f }
            goto L_0x008b
        L_0x006e:
            r0 = move-exception
            r4.unlock()     // Catch:{ all -> 0x007a }
            goto L_0x0079
        L_0x0073:
            java.lang.String r0 = "Cannot progress to STARTING, not in STOPPED state"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x007a }
        L_0x0079:
            throw r0     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            r4.unlock()     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r3 = move-exception
            r2 = 33
            r1 = 0
            r0 = 0
            X.C26175Cts.A01(r0, r2, r1)
            r4.unlock()
            throw r3
        L_0x008b:
            r2 = 33
            r1 = 0
            r0 = 0
            X.C26175Cts.A01(r0, r2, r1)
            r4.unlock()
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26810DEs.A04(X.DEs):void");
    }

    public static void A08(C26810DEs dEs, int i, int i2) {
        Matrix matrix;
        float f;
        float f2;
        float f3;
        Matrix A0J2 = C108945cZ.A0J();
        dEs.A0E = A0J2;
        float f4 = 1.0f;
        if (dEs.A00 == 1) {
            f4 = -1.0f;
        }
        A0J2.setScale(f4, 1.0f);
        int A002 = A00(dEs, dEs.A01);
        dEs.A0E.postRotate((float) A002);
        if (A002 == 90 || A002 == 270) {
            matrix = dEs.A0E;
            f = (float) i2;
            f2 = f / 2000.0f;
            f3 = (float) i;
        } else {
            matrix = dEs.A0E;
            f = (float) i;
            f2 = f / 2000.0f;
            f3 = (float) i2;
        }
        matrix.postScale(f2, f3 / 2000.0f);
        dEs.A0E.postTranslate(f / 2.0f, f3 / 2.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r10.A00(X.C25751ClL.A0P) != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r10.A00(X.C25751ClL.A0b) != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.EBS r7, X.E9C r8, X.C25729Ckz r9, X.CZR r10, X.C25751ClL r11) {
        /*
            r6 = this;
            boolean r0 = X.C25921Cof.A00()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0039
            X.ChN r0 = X.EBS.A0I
            boolean r0 = X.BE9.A1S(r0, r7)
            if (r0 != 0) goto L_0x0039
            X.CKO r0 = X.C25751ClL.A0T
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.CKO r0 = X.C25751ClL.A0Z
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.CKO r0 = X.C25751ClL.A0O
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.CKO r0 = X.C25751ClL.A0V
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.CKO r0 = X.C25751ClL.A0P
            java.lang.Object r0 = r10.A00(r0)
            r3 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            X.CKM r0 = X.C25729Ckz.A06
            boolean r0 = X.BEA.A1Y(r0, r9)
            if (r0 == 0) goto L_0x004b
            X.CKO r0 = X.C25751ClL.A0b
            java.lang.Object r0 = r10.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            X.CKO r1 = X.C25751ClL.A0X
            java.lang.Object r0 = r10.A00(r1)
            if (r0 != 0) goto L_0x0180
            if (r11 == 0) goto L_0x0181
            X.CKN r0 = X.C25751ClL.A0M
            java.lang.Object r0 = r11.A00(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A01 = r0
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r11.A01(r1)
            byte[] r0 = (byte[]) r0
            r10.A0F = r0
        L_0x006e:
            X.CKO r1 = X.C25751ClL.A0b
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r11.A01(r1)
            byte[] r0 = (byte[]) r0
            r10.A0G = r0
        L_0x007e:
            X.CKO r1 = X.C25751ClL.A0Y
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r11.A01(r1)
            X.CXa r0 = (X.C25089CXa) r0
            r10.A03 = r0
        L_0x008e:
            X.CKO r1 = X.C25751ClL.A0d
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r11.A01(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A02 = r0
        L_0x009e:
            X.CKO r1 = X.C25751ClL.A0T
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r10.A0E = r0
        L_0x00ae:
            X.CKO r1 = X.C25751ClL.A0Z
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
        L_0x00be:
            X.CKO r1 = X.C25751ClL.A0O
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A06 = r0
        L_0x00ce:
            X.CKO r1 = X.C25751ClL.A0P
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A08 = r0
        L_0x00de:
            X.CKO r1 = X.C25751ClL.A0V
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A07 = r0
        L_0x00ee:
            X.CKO r1 = X.C25751ClL.A0R
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x00f9
            r11.A01(r1)
        L_0x00f9:
            X.CKO r1 = X.C25751ClL.A0Q
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r11.A01(r1)
            X.ClL r0 = (X.C25751ClL) r0
            r10.A04 = r0
        L_0x0109:
            X.CKO r1 = X.C25751ClL.A0a
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0B = r0
        L_0x0119:
            X.CKO r1 = X.C25751ClL.A0e
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0D = r0
        L_0x0129:
            X.CKO r1 = X.C25751ClL.A0S
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10.A05 = r0
        L_0x0139:
            X.CKO r1 = X.C25751ClL.A0c
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0C = r0
        L_0x0149:
            X.CKO r1 = X.C25751ClL.A0U
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r11.A01(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A09 = r0
        L_0x0159:
            X.CKO r1 = X.C25751ClL.A0W
            java.lang.Object r0 = r11.A01(r1)
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r11.A01(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r10.A00 = r0
        L_0x0169:
            if (r3 != 0) goto L_0x017f
            if (r2 != 0) goto L_0x017f
            if (r4 != 0) goto L_0x017f
            X.CnB r3 = r6.A0S
            X.Cqv r0 = r6.A0R
            java.util.UUID r2 = r0.A03
            r1 = 11
            X.DTa r0 = new X.DTa
            r0.<init>(r8, r10, r1)
            r3.A05(r0, r2)
        L_0x017f:
            return
        L_0x0180:
            r5 = 0
        L_0x0181:
            r4 = r5
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26810DEs.A0B(X.EBS, X.E9C, X.Ckz, X.CZR, X.ClL):void");
    }

    public void A0C(String str) {
        if (!isConnected()) {
            throw new C27206DZg(str);
        }
    }

    public void BkU() {
        if (isConnected() && (this.A0K.A00.A00 & 4) != 4) {
            this.A0S.A07("gpu_frames_started", new C27132DVt((Object) this, 5));
        }
    }

    public boolean CLb(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        float f;
        float f2;
        matrix.reset();
        float f3 = (float) i;
        float f4 = (float) i2;
        float f5 = f3 / f4;
        int A002 = A00(this, this.A01);
        if (A002 == 90 || A002 == 270) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        float f6 = (float) i3;
        float f7 = (float) i4;
        int i6 = ((f6 / f7) > f5 ? 1 : ((f6 / f7) == f5 ? 0 : -1));
        if (!z ? i6 <= 0 : i6 > 0) {
            f = f4;
            f2 = f7;
        } else {
            f = f3;
            f2 = f6;
        }
        float f8 = f / f2;
        matrix.setScale((f6 / f3) * f8, (f7 / f4) * f8, (float) (i / 2), (float) (i2 / 2));
        return true;
    }

    public void COR(C6E c6e, File file) {
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw AnonymousClass000.A0k("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        } else if (!isConnected()) {
            c6e.A00(AnonymousClass8BR.A0w("Can't record video before it's initialised."));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0e = true;
            this.A0S.A00(new C22897BUi(this, c6e, 0), "start_video", new DVT(this, absolutePath, elapsedRealtime));
        }
    }
}
