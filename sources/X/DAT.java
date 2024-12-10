package X;

import android.view.View;
import java.io.File;
import java.util.List;

public class DAT implements EDL {
    public final EA4 A00;

    public static C22808BPw A00(DAT dat) {
        return (C22808BPw) ((EDA) dat.A00.BP7(EDA.A00));
    }

    public void BCe(String str) {
        this.A00.BCe(str);
    }

    public void BLR(int i, int i2) {
        C22892BUd bUd = EDA.A00;
        float[] A1V = C108945cZ.A1V();
        A1V[0] = (float) i;
        A1V[1] = (float) i2;
        C28614EAk eAk = ((C22808BPw) ((EDA) this.A00.BP7(bUd))).A0i;
        eAk.Bil(A1V);
        eAk.BLR((int) A1V[0], (int) A1V[1]);
    }

    public View BOA() {
        return ((EDD) this.A00.BP7(EDD.A00)).BPJ();
    }

    public EDK BP7(C22892BUd bUd) {
        return this.A00.BP7(bUd);
    }

    public E4f BP8(C9Z c9z) {
        return this.A00.BP8(c9z);
    }

    public int Bbz() {
        C25632CjI A0F;
        int i;
        C22808BPw bPw = (C22808BPw) ((EDA) this.A00.BP7(EDA.A00));
        C25632CjI A0F2 = bPw.A0F();
        if (A0F2 == null || (A0F = bPw.A0F()) == null) {
            return 100;
        }
        CKI cki = C25632CjI.A0e;
        if (!BE9.A1T(cki, A0F)) {
            return 100;
        }
        List A11 = BE6.A11(C25632CjI.A18, A0F2);
        C25632CjI A0F3 = bPw.A0F();
        if (A0F3 == null || !BE9.A1T(cki, A0F3)) {
            i = 0;
        } else {
            i = bPw.A0i.getZoomLevel();
        }
        return AnonymousClass001.A0n(A11, i);
    }

    public boolean BeL(C22892BUd bUd) {
        return this.A00.BeL(bUd);
    }

    public boolean BeM(C9Z c9z) {
        return this.A00.BeM(c9z);
    }

    public boolean Beo(int i) {
        C22808BPw bPw = (C22808BPw) ((EDA) this.A00.BP7(EDA.A00));
        C25632CjI A0F = bPw.A0F();
        if (A0F == null) {
            return false;
        }
        if (bPw.A00 == 1) {
            C22808BPw.A02(bPw);
            return false;
        }
        List A11 = BE6.A11(C25632CjI.A0r, A0F);
        if (A11 == null) {
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

    public boolean Bg9() {
        return AnonymousClass000.A1Z(((BQ0) ((ED0) this.A00.BP7(ED0.A00))).A05, AnonymousClass00R.A01);
    }

    public void CG0() {
        this.A00.CG0();
    }

    public void CHy() {
        C22892BUd bUd = ED0.A00;
        C26128Csq csq = new C26128Csq();
        csq.A04(C25971Cpe.A0N, false);
        ((BQ0) ((ED0) this.A00.BP7(bUd))).A00.Bk3(new C22896BUh(), csq.A03());
    }

    public void CIv(int i) {
        C22808BPw bPw = (C22808BPw) ((EDA) this.A00.BP7(EDA.A00));
        int i2 = 1;
        if (bPw.A00 == 1) {
            C22808BPw.A02(bPw);
            return;
        }
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
        bPw.A0i.Bk3(new C22896BUh(), csq.A03());
    }

    public void CK7(E48 e48) {
        C22808BPw bPw = (C22808BPw) ((EDA) this.A00.BP7(EDA.A00));
        if (!bPw.A0b && bPw.A0a) {
            C28614EAk eAk = bPw.A0i;
            if (eAk.isConnected()) {
                if (e48 != null) {
                    E4h e4h = bPw.A0N;
                    if (e4h == null) {
                        e4h = new DEM(bPw, 1);
                        bPw.A0N = e4h;
                    }
                    eAk.BBU(e4h);
                } else if (bPw.A0B != null) {
                    E4h e4h2 = bPw.A0N;
                    if (e4h2 == null) {
                        e4h2 = new DEM(bPw, 1);
                        bPw.A0N = e4h2;
                    }
                    eAk.CEs(e4h2);
                }
            }
        }
        bPw.A0B = e48;
    }

    public void COP(CY3 cy3, File file) {
        BCe("LiteCameraController must be initialized before taking video.");
        BQ0 bq0 = (BQ0) ((ED0) this.A00.BP7(ED0.A00));
        if (file == null) {
            throw AnonymousClass8BR.A0w("Both outputFile and outputFileDescriptor cannot be null, one must contain a valid value");
        } else if (DDR.A0B(bq0, EB9.A06, AnonymousClass000.A0h()) || !bq0.A00.Bfx()) {
            synchronized (bq0.A03) {
                Integer num = bq0.A05;
                Integer num2 = AnonymousClass00R.A01;
                if (num == num2) {
                    C26379Cyf.A06(cy3, AnonymousClass000.A0n("Cannot start video recording. Another recording already in progress"));
                } else {
                    EDJ edj = (EDJ) DDR.A09(bq0, EDJ.A00);
                    long A0O = BE6.A0O(bq0);
                    C18070vi.A0d(edj, 0);
                    C26294Cx6.A04("OpticVideoCaptureCoordinator", "logRecordingRequested QPL RECORDING");
                    edj.BiZ(A0O);
                    edj.BtS(19);
                    C22901BUm bUm = new C22901BUm(bq0, 9);
                    bq0.A05 = num2;
                    bq0.A04 = cy3;
                    List list = bq0.A02.A00;
                    if (0 < list.size()) {
                        list.get(0);
                        throw AnonymousClass000.A0s("onVideoCaptureStarted");
                    }
                    bq0.A00.COR(bUm, file);
                }
            }
        } else {
            C26379Cyf.A06(cy3, AnonymousClass000.A0n("Cannot start video recording while camera is paused."));
        }
    }

    public void COb() {
        BCe("LiteCameraController must be initialized when stop recording.");
        BQ0.A01((BQ0) ((ED0) this.A00.BP7(ED0.A00)), false);
    }

    public void COe() {
        BCe("LiteCameraController must be initialized when stop recording.");
        BQ0.A01((BQ0) ((ED0) this.A00.BP7(ED0.A00)), true);
    }

    public void COw() {
        ((EDA) this.A00.BP7(EDA.A00)).COw();
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [X.CMv, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    public void CP0(X.C24986CSm r20, X.E7R r21) {
        /*
            r19 = this;
            java.lang.String r1 = "LiteCameraController must be initialized before taking photo."
            r0 = r19
            r0.BCe(r1)
            X.BUd r1 = X.ED6.A01
            X.EA4 r0 = r0.A00
            X.EDK r12 = r0.BP7(r1)
            X.ED6 r12 = (X.ED6) r12
            X.BPy r12 = (X.C22810BPy) r12
            r4 = 1
            r11 = r21
            boolean r0 = r11 instanceof X.DAV
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11 instanceof X.DAW
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11 instanceof X.C28654ECo
            if (r0 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Photo callback type not supported: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r11, r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0031:
            X.EDE r0 = r12.A03
            r7 = 0
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.Bcr()
            r1 = 1
            if (r0 == r4) goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r5 = r20
            java.lang.Boolean r0 = r5.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005d
            if (r1 != 0) goto L_0x0102
            X.EDA r1 = r12.A01
            X.C18070vi.A0b(r1)
            X.DDR r1 = (X.DDR) r1
            X.CdJ r0 = X.EB9.A09
            boolean r0 = X.DDR.A0B(r1, r0, r2)
            if (r0 == 0) goto L_0x0102
        L_0x005d:
            r10 = 1
        L_0x005e:
            X.EDJ r13 = r12.A04
            if (r13 == 0) goto L_0x0089
            java.lang.String r15 = "PhotoCaptureControllerImpl"
            int r6 = r12.hashCode()
            if (r10 == 0) goto L_0x00fe
            X.ByW r3 = X.C24273ByW.NATIVE_VIEW_SIZE_PHOTO
        L_0x006c:
            java.lang.String r0 = "logTakePhotoRequested QPL CAPTURE_PHOTO type=%s"
            X.C26294Cx6.A02(r3, r15, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r4)
            java.lang.String r1 = "photo_capture_type"
            java.lang.String r0 = r3.toString()
            r2.put(r1, r0)
            long r0 = (long) r6
            java.lang.String r14 = "photo_capture_requested"
            r17 = r0
            r16 = r2
            r13.Bi9(r14, r15, r16, r17)
        L_0x0089:
            X.CdJ r0 = X.EB9.A05
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            boolean r1 = X.DDR.A0B(r12, r0, r6)
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x00b5
            if (r1 != 0) goto L_0x00b5
            java.lang.String r0 = "Cannot take photo while camera is paused."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            X.C26379Cyf.A03(r11, r0)
        L_0x00a2:
            if (r13 == 0) goto L_0x00b4
            int r2 = r12.hashCode()
            java.lang.String r0 = "validateReadyToTakePhoto failed"
            X.BUQ r1 = new X.BUQ
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = "medium"
            X.C9R.A00(r1, r13, r0, r2)
        L_0x00b4:
            return
        L_0x00b5:
            java.lang.Object r7 = r12.A07
            monitor-enter(r7)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0195 }
            X.CMv r0 = r12.A08     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x00d4
            X.CMv r0 = r12.A08     // Catch:{ all -> 0x0195 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0195 }
            long r0 = r0.A00     // Catch:{ all -> 0x0195 }
            long r2 = r2 - r0
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0195 }
            goto L_0x00eb
        L_0x00d1:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0195 }
            goto L_0x00eb
        L_0x00d4:
            X.CMv r0 = new X.CMv     // Catch:{ all -> 0x0195 }
            r0.<init>()     // Catch:{ all -> 0x0195 }
            r12.A08 = r0     // Catch:{ all -> 0x0195 }
            X.CMv r0 = r12.A08     // Catch:{ all -> 0x0195 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0195 }
            r0.A01 = r11     // Catch:{ all -> 0x0195 }
            X.CMv r0 = r12.A08     // Catch:{ all -> 0x0195 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0195 }
            r0.A00 = r2     // Catch:{ all -> 0x0195 }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0195 }
        L_0x00eb:
            monitor-exit(r7)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x00a2
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0105
            java.lang.String r0 = "Another photo capture in progress."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            X.C26379Cyf.A03(r11, r0)
            goto L_0x00a2
        L_0x00fe:
            X.ByW r3 = X.C24273ByW.PREVIEW_PHOTO
            goto L_0x006c
        L_0x0102:
            r10 = 0
            goto L_0x005e
        L_0x0105:
            android.os.SystemClock.elapsedRealtime()
            boolean r14 = r5.A03
            boolean r2 = r5.A05
            boolean r7 = r5.A04
            java.lang.Boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0118
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0124
        L_0x0118:
            X.EDA r0 = r12.A01
            X.C18070vi.A0b(r0)
            X.BPw r0 = (X.C22808BPw) r0
            int r0 = r0.A00
            r15 = 1
            if (r0 == r4) goto L_0x0125
        L_0x0124:
            r15 = 0
        L_0x0125:
            X.Ckz r3 = new X.Ckz
            r3.<init>()
            X.CKM r1 = X.C25729Ckz.A04
            java.lang.Boolean r0 = X.C108945cZ.A1A(r7)
            r3.A01(r1, r0)
            X.CKM r1 = X.C25729Ckz.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A01(r1, r0)
            X.CKM r0 = X.C25729Ckz.A06
            r3.A01(r0, r6)
            X.EDD r0 = r12.A02
            X.C18070vi.A0b(r0)
            android.view.View r0 = r0.BXX()
            X.C18070vi.A0X(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            X.Csv r13 = new X.Csv
            r13.<init>(r1, r0)
            if (r10 == 0) goto L_0x017c
            X.DEm r10 = new X.DEm
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.EDA r2 = r12.A01
            X.C18070vi.A0b(r2)
            X.BPw r2 = (X.C22808BPw) r2
            X.DEl r1 = new X.DEl
            r1.<init>(r10, r2, r4)
            int r0 = r2.A00
            if (r0 != r4) goto L_0x0176
            X.C22808BPw.A02(r2)
        L_0x0176:
            X.EAk r0 = r2.A0i
            r0.CP1(r1, r3)
            return
        L_0x017c:
            boolean r0 = r11 instanceof X.C28654ECo
            if (r0 != 0) goto L_0x018e
            X.EDD r1 = r12.A02
            X.C18070vi.A0b(r1)
            X.DAW r0 = new X.DAW
            r0.<init>(r5, r11, r12)
            r1.BXS(r0)
            return
        L_0x018e:
            java.lang.String r0 = "Jpeg callback not supported for preview capture."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0195:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAT.CP0(X.CSm, X.E7R):void");
    }

    public void destroy() {
        this.A00.destroy();
    }

    public void pause() {
        this.A00.pause();
    }

    public DAT(EA4 ea4) {
        this.A00 = ea4;
        C9Z c9z = EDJ.A00;
        if (ea4.BeM(c9z)) {
            BP8(c9z);
        }
    }

    public void BB3(E93 e93) {
        C22808BPw A002 = A00(this);
        if (e93 != null) {
            A002.A0g.A01(e93);
        }
    }

    public int BUW() {
        C25632CjI A0F;
        C22808BPw A002 = A00(this);
        C25632CjI A0F2 = A002.A0F();
        if (A0F2 == null || (A0F = A002.A0F()) == null || !BE9.A1T(C25632CjI.A0e, A0F)) {
            return 0;
        }
        return BE9.A0B(C25632CjI.A0i, A0F2);
    }

    public boolean Be2() {
        C22808BPw A002 = A00(this);
        if (A002.A0b || !A002.A0a) {
            return false;
        }
        return true;
    }

    public boolean BeH() {
        C28614EAk eAk = A00(this).A0i;
        if (eAk == null || !eAk.isConnected()) {
            return false;
        }
        return true;
    }

    public boolean Bgf() {
        return A00(this).A0i.Bgf();
    }

    public boolean Bgs() {
        return AnonymousClass000.A1Z(A00(this).A0f, C24248By6.CAMERA2);
    }

    public void CEd(E93 e93) {
        C22808BPw A002 = A00(this);
        if (e93 != null) {
            A002.A0g.A02(e93);
        }
    }

    public void CHq(boolean z) {
        C22808BPw A002 = A00(this);
        A002.A0Z = z;
        C22895BUg bUg = A002.A0H;
        if (bUg != null) {
            bUg.A00(EBS.A0H, Boolean.valueOf(z));
        }
    }

    public void CJ0(C24819CLm cLm) {
        A00(this).A0U = cLm;
    }

    public void CJA(int i) {
        C22808BPw A002 = A00(this);
        if (A002.A0b) {
            A002.A00 = i;
            return;
        }
        throw AnonymousClass000.A0n("Initial camera facing must be set before initializing the camera.");
    }

    public void CJm(boolean z) {
        A00(this).A0i.CJQ(z);
    }

    public void CJv(int i) {
        C22808BPw A002 = A00(this);
        if (A002.A0b) {
            A002.A04 = i;
            return;
        }
        throw AnonymousClass000.A0n("Photo resolution level must be set before initializing the camera.");
    }

    public void CJx() {
        C22808BPw A002 = A00(this);
        CSK csk = A002.A0D;
        if (csk == null) {
            csk = new CSK(A002.A0i);
            A002.A0D = csk;
        }
        csk.A03 = false;
    }

    public void CK8(int i) {
        C22808BPw A002 = A00(this);
        if (A002.A0b) {
            A002.A06 = i;
            return;
        }
        throw AnonymousClass000.A0n("Preview resolution level must be set before initializing the camera.");
    }

    public void CK9(C28417E0i e0i) {
        A00(this).A0C = e0i;
    }

    public void CKo(E9B e9b) {
        A00(this).A0R = e9b;
    }

    public void CLM(int i) {
        C22808BPw A002 = A00(this);
        if (A002.A0b) {
            A002.A08 = i;
            return;
        }
        throw AnonymousClass000.A0n("Video resolution level must be set before initializing the camera.");
    }

    public void CLW(int i) {
        C22808BPw A002 = A00(this);
        C25632CjI A0F = A002.A0F();
        if (A0F != null && BE9.A1T(C25632CjI.A0e, A0F)) {
            A002.A0i.CLX((C6E) null, i);
        }
    }

    public int getCameraFacing() {
        return A00(this).A00;
    }
}
