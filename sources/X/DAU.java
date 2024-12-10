package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.List;
import java.util.Map;

public class DAU implements EDL, TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public E48 A0A;
    public C28417E0i A0B;
    public E9B A0C;
    public C25556Chu A0D;
    public C24819CLm A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Handler A0I;
    public final TextureView A0J;
    public final C28500E4g A0K;
    public final AnonymousClass86M A0L;
    public final E4h A0M;
    public final E4i A0N;
    public final C6E A0O;
    public final C25132CZh A0P;
    public final C28614EAk A0Q;
    public final EAW A0R;
    public final Object A0S;
    public final String A0T;
    public final Context A0U;
    public final HandlerThread A0V;
    public final OrientationEventListener A0W;
    public final C6E A0X;
    public final C24248By6 A0Y;
    public final boolean A0Z;
    public volatile CY3 A0a;
    public volatile boolean A0b;

    public void BCe(String str) {
    }

    public boolean Be2() {
        return true;
    }

    public boolean BeL(C22892BUd bUd) {
        return false;
    }

    public boolean BeM(C9Z c9z) {
        return false;
    }

    public void CHy() {
        C28614EAk eAk = this.A0Q;
        C26128Csq csq = new C26128Csq();
        csq.A04(C25971Cpe.A0N, false);
        eAk.Bk3(new C22896BUh(), csq.A03());
    }

    public void COb() {
        A04(false);
    }

    public void COe() {
        A04(true);
    }

    public void destroy() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.CyS, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DAU(android.content.Context r9, android.view.TextureView r10, X.EAW r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r6 = "WhatsAppCamera"
            android.content.Context r1 = r9.getApplicationContext()
            r7 = r12
            if (r12 == 0) goto L_0x001b
            X.By6 r0 = X.C24248By6.CAMERA2
        L_0x000b:
            X.EAk r4 = X.C25316CdM.A01(r9, r0)
            X.CyS r3 = new X.CyS
            r3.<init>()
            r0 = r8
            r2 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x001b:
            X.By6 r0 = X.C24248By6.CAMERA1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAU.<init>(android.content.Context, android.view.TextureView, X.EAW, boolean):void");
    }

    public static int A00(DAU dau) {
        WindowManager windowManager = (WindowManager) dau.A0U.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    private C25632CjI A01() {
        C28614EAk eAk = this.A0Q;
        if (eAk == null || !eAk.isConnected()) {
            return null;
        }
        try {
            return eAk.BOK();
        } catch (C27206DZg unused) {
            return null;
        }
    }

    public static void A02(DAU dau, C25556Chu chu) {
        if (dau.A0Z) {
            C26132Csv csv = (C26132Csv) chu.A02.A04(C25971Cpe.A0q);
            C199610h.A04(csv);
            int i = csv.A02;
            dau.A08 = i;
            int i2 = csv.A01;
            dau.A06 = i2;
            BHF bhf = (BHF) dau.A0J;
            bhf.A01 = i;
            bhf.A00 = i2;
            bhf.A02 = true;
            C26078Crs.A00(new C21466AkX((Object) dau, 48));
        }
    }

    public static void A03(DAU dau, C25556Chu chu) {
        C28614EAk eAk = dau.A0Q;
        if (eAk.isConnected() && chu != null) {
            int A002 = A00(dau);
            if (dau.A04 == A002) {
                Object[] A1b = AnonymousClass000.A1b(dau, 4);
                A1b[1] = dau.A0D;
                AnonymousClass3Ma.A1S(A1b, dau.A08);
                C17890vO.A1G(A1b, dau.A06);
                C108955ca.A1F(dau.A0I, A1b, 15);
                return;
            }
            dau.A04 = A002;
            eAk.CK5(new C22901BUm(dau, 2), A002);
        }
    }

    public void A05() {
        if (!this.A0Q.isConnected()) {
            this.A02 = 1920;
            this.A01 = (int) Math.ceil((double) (1920.0f / (((float) Math.max(1920, 1920)) / ((float) Math.min(1920, 1920)))));
        }
    }

    public void BB3(E93 e93) {
        if (e93 != null) {
            this.A0P.A01(e93);
        }
    }

    public View BOA() {
        return this.A0J;
    }

    public EDK BP7(C22892BUd bUd) {
        throw BE6.A0v("Components are not supported.");
    }

    public E4f BP8(C9Z c9z) {
        throw BE6.A0v("Components are not supported.");
    }

    public boolean BeH() {
        C28614EAk eAk = this.A0Q;
        if (eAk == null || !eAk.isConnected()) {
            return false;
        }
        return true;
    }

    public boolean Bg9() {
        return this.A0Q.Bg9();
    }

    public boolean Bgf() {
        return this.A0Q.Bgf();
    }

    public boolean Bgs() {
        return AnonymousClass000.A1Z(this.A0Y, C24248By6.CAMERA2);
    }

    public void CEd(E93 e93) {
        if (e93 != null) {
            this.A0P.A02(e93);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.CUf, java.lang.Object] */
    public void CG0() {
        C24331BzS bzS;
        if (this.A0H) {
            this.A0H = false;
            OrientationEventListener orientationEventListener = this.A0W;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.enable();
            }
            HandlerThread handlerThread = this.A0V;
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                C28614EAk eAk = this.A0Q;
                eAk.CIC(new Handler(looper));
                E9B e9b = this.A0C;
                if (e9b == null) {
                    e9b = new C26794DEc(this.A07, this.A05, this.A09);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    bzS = C24331BzS.HIGH;
                } else {
                    bzS = C24331BzS.MEDIUM;
                }
                Map map = DEX.A01;
                DEX dex = new DEX(C24331BzS.HIGH, bzS, new Object(), e9b, false, false);
                dex.A00(EBS.A0H, Boolean.valueOf(this.A0G));
                this.A04 = A00(this);
                eAk.BBV(this.A0N);
                eAk.CIz(this.A0K);
                String str = this.A0T;
                int i = this.A00;
                int i2 = 0;
                if (i != 0) {
                    i2 = 1;
                    if (i != 1) {
                        throw BEA.A0h("Could not convert camera facing to optic: ", AnonymousClass000.A10(), i);
                    }
                }
                eAk.BFe(this.A0O, dex, (C28611EAf) null, new C25119CYs(new CRN(this.A0R, this.A02, this.A01)), str, i2, this.A04);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Callback handler looper is null. CallbackHandlerThread is alive: ");
            A10.append(handlerThread.isAlive());
            throw BE8.A0f(A10);
        }
    }

    public void CIv(int i) {
        int i2 = 1;
        if (this.A00 != 1) {
            C26128Csq csq = new C26128Csq();
            CKJ ckj = C25971Cpe.A0B;
            if (i == 0) {
                i2 = 0;
            } else if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                }
            }
            C26128Csq.A01(ckj, csq, i2);
            this.A0Q.Bk3(new C22896BUh(), csq.A03());
        }
    }

    public void CJA(int i) {
        if (this.A0H) {
            C28614EAk eAk = this.A0Q;
            int i2 = 0;
            if (i != 0) {
                i2 = 1;
                if (i != 1) {
                    throw BEA.A0h("Could not convert camera facing to optic: ", AnonymousClass000.A10(), i);
                }
            }
            if (eAk.BcX(i2)) {
                this.A00 = i;
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Initial camera facing must be set before initializing the camera.");
    }

    public void CJm(boolean z) {
        this.A0Q.CJQ(z);
    }

    public void CJv(int i) {
        if (this.A0H) {
            this.A05 = i;
            return;
        }
        throw AnonymousClass000.A0n("Photo resolution level must be set before initializing the camera.");
    }

    public void CJx() {
        throw BE6.A0v("Gestures are not supported.");
    }

    public void CK7(E48 e48) {
        if (!this.A0H) {
            C28614EAk eAk = this.A0Q;
            if (eAk.isConnected()) {
                if (e48 != null) {
                    eAk.BBU(this.A0M);
                } else if (this.A0A != null) {
                    eAk.CEs(this.A0M);
                }
            }
        }
        this.A0A = e48;
    }

    public void CK8(int i) {
        if (this.A0H) {
            this.A07 = i;
            return;
        }
        throw AnonymousClass000.A0n("Preview resolution level must be set before initializing the camera.");
    }

    public void CLM(int i) {
        if (this.A0H) {
            this.A09 = i;
            return;
        }
        throw AnonymousClass000.A0n("Video resolution level must be set before initializing the camera.");
    }

    public void COP(CY3 cy3, File file) {
        if (this.A0H) {
            C108955ca.A1F(this.A0I, C108945cZ.A1a(cy3, AnonymousClass000.A0n("Cannot start video recording while camera is paused."), 2, 1), 10);
            return;
        }
        synchronized (this.A0S) {
            if (this.A0b) {
                C108955ca.A1F(this.A0I, C108945cZ.A1a(cy3, AnonymousClass000.A0n("Cannot start video recording. Another recording already in progress"), 2, 1), 10);
            } else {
                this.A0b = true;
                this.A0a = cy3;
                this.A0Q.COR(new C22901BUm(this, 0), file);
            }
        }
    }

    public void COw() {
        if (!this.A0H) {
            C28614EAk eAk = this.A0Q;
            if (eAk.Bgf()) {
                eAk.COv(this.A0X);
            }
        }
    }

    public void CP0(C24986CSm cSm, E7R e7r) {
        if (e7r instanceof C28654ECo) {
            C26803DEl dEl = new C26803DEl(e7r, this, 0);
            C28614EAk eAk = this.A0Q;
            C25729Ckz ckz = new C25729Ckz();
            ckz.A01(C25729Ckz.A04, C108945cZ.A1A(cSm.A04));
            ckz.A01(C25729Ckz.A07, Boolean.valueOf(cSm.A05));
            eAk.CP1(dEl, ckz);
            return;
        }
        throw AnonymousClass000.A0k("callback must be a PhotoJpegInfoCallback object.");
    }

    public void finalize() {
        this.A0V.quitSafely();
    }

    public int getCameraFacing() {
        return this.A00;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0R.C4U(surfaceTexture, i, i2);
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A0R.C4V();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0R.C4T(i, i2);
        this.A08 = i;
        this.A06 = i2;
        A03(this, this.A0D);
    }

    public void pause() {
        if (!this.A0H) {
            OrientationEventListener orientationEventListener = this.A0W;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.disable();
            }
            this.A0H = true;
            C28614EAk eAk = this.A0Q;
            eAk.CEt(this.A0N);
            eAk.CIz((C28500E4g) null);
            eAk.BIp(new C22901BUm(this, 1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        X.BE9.A1L(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        throw X.AnonymousClass8BR.A0w("Timeout stopping video recording.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(boolean r6) {
        /*
            r5 = this;
            java.util.concurrent.CountDownLatch r4 = X.BE7.A0u()
            java.lang.Object r3 = r5.A0S
            monitor-enter(r3)
            boolean r0 = r5.A0b     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return
        L_0x000d:
            X.EAk r2 = r5.A0Q     // Catch:{ all -> 0x0027 }
            r1 = 0
            X.BUj r0 = new X.BUj     // Catch:{ all -> 0x0027 }
            r0.<init>(r5, r4, r1, r6)     // Catch:{ all -> 0x0027 }
            r2.COc(r0)     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            if (r6 == 0) goto L_0x0026
            X.BE9.A1L(r4)     // Catch:{ InterruptedException -> 0x001f }
            return
        L_0x001f:
            java.lang.String r0 = "Timeout stopping video recording."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAU.A04(boolean):void");
    }

    public void BLR(int i, int i2) {
        C25632CjI A012 = A01();
        if (A012 != null) {
            float[] A1V = C108945cZ.A1V();
            A1V[0] = (float) i;
            A1V[1] = (float) i2;
            C28614EAk eAk = this.A0Q;
            eAk.Bil(A1V);
            if (BE9.A1T(C25632CjI.A0U, A012)) {
                eAk.BLR((int) A1V[0], (int) A1V[1]);
            }
        }
    }

    public int BUW() {
        C25632CjI A012;
        C25632CjI A013 = A01();
        if (A013 == null || (A012 = A01()) == null || !BE9.A1T(C25632CjI.A0e, A012)) {
            return 0;
        }
        return BE9.A0B(C25632CjI.A0i, A013);
    }

    public int Bbz() {
        C25632CjI A012;
        int i;
        C25632CjI A013 = A01();
        if (A013 == null || (A012 = A01()) == null) {
            return 100;
        }
        CKI cki = C25632CjI.A0e;
        if (!BE9.A1T(cki, A012)) {
            return 100;
        }
        List A11 = BE6.A11(C25632CjI.A18, A013);
        C25632CjI A014 = A01();
        if (A014 == null || !BE9.A1T(cki, A014)) {
            i = 0;
        } else {
            i = this.A0Q.getZoomLevel();
        }
        return AnonymousClass001.A0n(A11, i);
    }

    public boolean Beo(int i) {
        List A11;
        C25632CjI A012 = A01();
        if (A012 == null || (A11 = BE6.A11(C25632CjI.A0r, A012)) == null) {
            return false;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
            }
        }
        return AnonymousClass3Ma.A1b(A11, i2);
    }

    public void CLW(int i) {
        C25632CjI A012 = A01();
        if (A012 != null && BE9.A1T(C25632CjI.A0e, A012)) {
            this.A0Q.CLX((C6E) null, i);
        }
    }

    public void CHq(boolean z) {
        this.A0G = z;
    }

    public void CJ0(C24819CLm cLm) {
        this.A0E = cLm;
    }

    public void CK9(C28417E0i e0i) {
        this.A0B = e0i;
    }

    public void CKo(E9B e9b) {
        this.A0C = e9b;
    }

    public DAU(Context context, TextureView textureView, C26366CyS cyS, C28614EAk eAk, EAW eaw, String str, boolean z) {
        C24248By6 by6;
        this.A0P = new C25132CZh();
        this.A0S = C17880vN.A0p();
        boolean z2 = false;
        this.A07 = 0;
        this.A05 = 0;
        this.A09 = 0;
        this.A04 = -1;
        this.A03 = -1;
        this.A0F = true;
        this.A0O = new C22901BUm(this, 3);
        this.A0X = new C22901BUm(this, 4);
        this.A0K = new DEK(this, 0);
        this.A0L = new DEL(this, 0);
        this.A0N = new DEN(this, 0);
        this.A0M = new DEM(this, 0);
        this.A0U = context;
        this.A0T = str;
        if (z) {
            by6 = C24248By6.CAMERA2;
        } else {
            by6 = C24248By6.CAMERA1;
        }
        this.A0Y = by6;
        this.A02 = 1920;
        this.A01 = 1080;
        this.A0Q = eAk;
        this.A0R = eaw;
        this.A0I = new Handler(Looper.getMainLooper(), cyS);
        HandlerThread handlerThread = new HandlerThread("Simple-Lite-Camera-Callback-Thread");
        this.A0V = handlerThread;
        handlerThread.start();
        this.A00 = this.A0Q.BcX(0) ^ true ? 1 : 0;
        this.A0H = true;
        this.A0Z = textureView == null ? true : z2;
        textureView = textureView == null ? new TextureView(context) : textureView;
        this.A0J = textureView;
        textureView.setSurfaceTextureListener(this);
        this.A0W = new BH8(context, this, 0);
    }
}
