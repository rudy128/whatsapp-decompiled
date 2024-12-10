package X;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.TextureView;
import java.util.Map;

/* renamed from: X.BPw  reason: case insensitive filesystem */
public class C22808BPw extends DDR implements EDA {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04 = 0;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08 = 0;
    public Display A09;
    public TextureView A0A;
    public E48 A0B;
    public C28417E0i A0C;
    public CSK A0D;
    public CJP A0E;
    public CJQ A0F;
    public CJR A0G;
    public C22895BUg A0H;
    public E4B A0I;
    public E99 A0J;
    public EDH A0K;
    public C28500E4g A0L;
    public AnonymousClass86M A0M;
    public E4h A0N;
    public E4i A0O;
    public C6E A0P;
    public C6E A0Q;
    public E9B A0R;
    public C25556Chu A0S;
    public EAW A0T;
    public C24819CLm A0U;
    public Boolean A0V;
    public Boolean A0W;
    public Float A0X;
    public boolean A0Y = false;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public C197999xc A0d;
    public C28611EAf A0e;
    public final C24248By6 A0f;
    public final C25132CZh A0g = new C25132CZh();
    public final C25132CZh A0h = new C25132CZh();
    public final C28614EAk A0i;
    public final String A0j;
    public final Context A0k = DDR.A06(this);
    public final EDI A0l;
    public volatile boolean A0m;

    public C22808BPw(C28592E9h e9h) {
        C24248By6 by6;
        this.A00 = e9h;
        C25313CdJ cdJ = C25511Ch9.A01;
        Object A0A2 = DDR.A0A(this, cdJ);
        if (A0A2 != null) {
            this.A0j = (String) A0A2;
            Boolean bool = (Boolean) DDR.A0A(this, EB9.A0A);
            if ((bool == null ? Boolean.valueOf(C24671CEl.A00(DDR.A06(this))) : bool).booleanValue()) {
                by6 = C24248By6.CAMERA2;
            } else {
                by6 = C24248By6.CAMERA1;
            }
            this.A0f = by6;
            EDI edi = (EDI) DDR.A09(this, EDI.A00);
            this.A0l = edi;
            C25313CdJ cdJ2 = EB9.A00;
            C28614EAk eAk = (C28614EAk) DDR.A0A(this, cdJ2);
            if (eAk == null) {
                Object A002 = C25316CdM.A00(DDR.A06(this), edi.BSH("Lite-Controller-Thread"), by6);
                Object A0A3 = DDR.A0A(this, cdJ2);
                eAk = (C28614EAk) (A0A3 != null ? A0A3 : A002);
            }
            this.A0i = eAk;
            this.A00 = 0;
            this.A0b = true;
            this.A0a = true;
            this.A0Y = DDR.A0B(this, EB9.A02, false);
            if (DDR.A0B(this, EB9.A01, false)) {
                this.A0E = new CJP(this);
            }
            C9Z c9z = EDH.A00;
            C28592E9h e9h2 = this.A00;
            C26159CtX.A01(e9h2);
            if (e9h2.BeM(c9z)) {
                this.A0K = (EDH) DDR.A09(this, c9z);
            }
            this.A02 = 1920;
            this.A01 = 1080;
            this.A0c = true;
            return;
        }
        throw AnonymousClass8BX.A0V(cdJ, "Configuration is not available: ", AnonymousClass000.A10());
    }

    public static void A04(C22808BPw bPw, C25556Chu chu, int i, int i2) {
        C26132Csv csv;
        int i3 = i;
        if (i > 0) {
            int i4 = i2;
            if (i2 > 0 && (csv = (C26132Csv) chu.A02.A04(C25971Cpe.A0q)) != null) {
                Matrix A0J2 = C108945cZ.A0J();
                C28614EAk eAk = bPw.A0i;
                if (eAk.CLb(A0J2, i3, i4, csv.A02, csv.A01, true)) {
                    eAk.BdT(A0J2, i, i2, chu.A00);
                    if (bPw.A0A != null) {
                        EAW eaw = bPw.A0T;
                        if (eaw == null) {
                            eaw = ((EDE) DDR.A07(bPw, EDE.A00)).Ba2();
                            bPw.A0T = eaw;
                        }
                        C26159CtX.A01(eaw);
                        if (!eaw.CSA()) {
                            EDI edi = bPw.A0l;
                            ((C22889BUa) edi).A00.post(new C27076DTa(bPw, A0J2, 3));
                        }
                    }
                }
            }
        }
    }

    public static C28611EAf A00(C22808BPw bPw) {
        C28611EAf dEj;
        C22892BUd bUd = ED3.A00;
        if (DDR.A0C(bPw, bUd)) {
            dEj = ((BUH) ((ED3) DDR.A07(bPw, bUd))).A00;
        } else {
            C9Z c9z = EDJ.A00;
            C28592E9h e9h = bPw.A00;
            C26159CtX.A01(e9h);
            if (e9h.BeM(c9z)) {
                C9Z c9z2 = EDI.A00;
                C28592E9h e9h2 = bPw.A00;
                C26159CtX.A01(e9h2);
                if (e9h2.BeM(c9z2) && bPw.A0e == null) {
                    C28592E9h e9h3 = bPw.A00;
                    C26159CtX.A01(e9h3);
                    e9h3.BP8(c9z2);
                    dEj = new C26801DEj((EDJ) DDR.A09(bPw, c9z), new BG1(Looper.getMainLooper()));
                }
            }
            return bPw.A0e;
        }
        bPw.A0e = dEj;
        return bPw.A0e;
    }

    public static void A01(C22808BPw bPw) {
        C28614EAk eAk = bPw.A0i;
        E4i e4i = bPw.A0O;
        if (e4i == null) {
            e4i = new DEN(bPw, 1);
            bPw.A0O = e4i;
        }
        eAk.CEt(e4i);
        eAk.CIz((C28500E4g) null);
        CJP cjp = bPw.A0E;
        if (cjp != null) {
            eAk.CEi(cjp);
        }
        bPw.A0H = null;
        bPw.A0m = false;
        eAk.BIp(new C22901BUm(bPw, 5));
    }

    public static void A02(C22808BPw bPw) {
        if (bPw.A0d == null) {
            bPw.A0d = new C197999xc(bPw.A0l);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C22808BPw r4, X.C25556Chu r5) {
        /*
            X.EAk r3 = r4.A0i
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L_0x0036
            if (r5 == 0) goto L_0x0036
            r2 = 0
            android.view.Display r1 = r4.A09     // Catch:{ RuntimeException -> 0x001f }
            android.view.TextureView r0 = r4.A0A     // Catch:{ RuntimeException -> 0x001f }
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x001f
            android.view.Display r1 = r0.getDisplay()     // Catch:{ RuntimeException -> 0x001f }
            r4.A09 = r1     // Catch:{ RuntimeException -> 0x001f }
            if (r1 == 0) goto L_0x001f
        L_0x001b:
            int r2 = r1.getRotation()     // Catch:{ RuntimeException -> 0x001f }
        L_0x001f:
            int r0 = r4.A03
            if (r0 != r2) goto L_0x002b
            int r1 = r4.A07
            int r0 = r4.A05
            A04(r4, r5, r1, r0)
            return
        L_0x002b:
            r4.A03 = r2
            r1 = 6
            X.BUm r0 = new X.BUm
            r0.<init>(r4, r1)
            r3.CK5(r0, r2)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22808BPw.A03(X.BPw, X.Chu):void");
    }

    public static void A05(C22808BPw bPw, String str) {
        EDJ edj;
        long elapsedRealtime;
        C9Z c9z = EDJ.A00;
        C28592E9h e9h = bPw.A00;
        C26159CtX.A01(e9h);
        if (e9h.BeM(c9z)) {
            edj = (EDJ) DDR.A09(bPw, c9z);
        } else {
            edj = null;
        }
        C28611EAf A002 = A00(bPw);
        if (edj != null && A002 != null) {
            Map BAg = edj.BAg();
            CNK BOp = A002.BOp();
            if (BOp != null) {
                elapsedRealtime = BOp.A00.now();
            } else {
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            BAg.put("timestamp", String.valueOf(elapsedRealtime));
            edj.Bi9(str, "OpticControllerImpl", BAg, BE6.A0O(bPw));
            edj.CEH(BAg);
        }
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [X.CUf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.BUg, X.DEX] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0113, code lost:
        if (r1 != null) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r20 = this;
            r2 = r20
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x016a
            r0 = 0
            r2.A0b = r0
            X.BUd r0 = X.EDD.A00
            X.EDK r3 = X.DDR.A07(r2, r0)
            X.EDD r3 = (X.EDD) r3
            X.E99 r1 = r2.A0J
            if (r1 != 0) goto L_0x001d
            r0 = 1
            X.DE8 r1 = new X.DE8
            r1.<init>(r2, r0)
            r2.A0J = r1
        L_0x001d:
            r3.BBf(r1)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x016a
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            X.E9B r10 = r2.A0R
            if (r10 != 0) goto L_0x0039
            int r3 = r2.A06
            int r1 = r2.A04
            int r0 = r2.A08
            X.DEc r10 = new X.DEc
            r10.<init>(r3, r1, r0)
        L_0x0039:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0101
            X.BzS r15 = X.C24331BzS.HIGH
        L_0x0041:
            java.util.Map r0 = X.DEX.A01
            X.BzS r14 = X.C24331BzS.HIGH
            X.CUf r16 = new X.CUf
            r16.<init>()
            X.BUd r9 = X.EDE.A00
            X.E9h r0 = r2.A00
            X.C26159CtX.A01(r0)
            r0.BP7(r9)
            boolean r12 = r2.A0Y
            boolean r11 = r2.A0Z
            boolean r0 = r2.A0c
            r19 = r0 ^ 1
            X.CdJ r0 = X.EB9.A08
            java.lang.Boolean r8 = X.AnonymousClass000.A0h()
            r7 = r8
            java.lang.Object r0 = X.DDR.A0A(r2, r0)
            if (r0 == 0) goto L_0x006a
            r7 = r0
        L_0x006a:
            X.CdJ r0 = X.EB9.A04
            r6 = r8
            java.lang.Object r0 = X.DDR.A0A(r2, r0)
            if (r0 == 0) goto L_0x0074
            r6 = r0
        L_0x0074:
            X.CdJ r0 = X.EB9.A07
            r5 = r8
            java.lang.Object r0 = X.DDR.A0A(r2, r0)
            if (r0 == 0) goto L_0x007e
            r5 = r0
        L_0x007e:
            X.CdJ r0 = X.EB9.A05
            r4 = r8
            java.lang.Object r0 = X.DDR.A0A(r2, r0)
            if (r0 == 0) goto L_0x0088
            r4 = r0
        L_0x0088:
            X.CdJ r0 = X.EB9.A03
            java.lang.Object r0 = X.DDR.A0A(r2, r0)
            if (r0 == 0) goto L_0x0091
            r8 = r0
        L_0x0091:
            java.lang.Boolean r3 = r2.A0V
            java.lang.Boolean r1 = r2.A0W
            X.EDH r0 = r2.A0K
            X.BUg r13 = new X.BUg
            r17 = r10
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r13.A00 = r0
            X.ChN r10 = X.EBS.A06
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r13.A00(r10, r0)
            X.ChN r10 = X.EBS.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r13.A00(r10, r0)
            X.ChN r0 = X.EBS.A0E
            r13.A00(r0, r7)
            X.ChN r0 = X.EBS.A0B
            r13.A00(r0, r6)
            X.ChN r0 = X.EBS.A0D
            r13.A00(r0, r5)
            X.ChN r0 = X.EBS.A0C
            r13.A00(r0, r4)
            X.ChN r0 = X.EBS.A0A
            r13.A00(r0, r8)
            if (r3 == 0) goto L_0x00d4
            X.ChN r0 = X.EBS.A0I
            r13.A00(r0, r3)
        L_0x00d4:
            if (r1 == 0) goto L_0x00db
            X.ChN r0 = X.EBS.A0M
            r13.A00(r0, r1)
        L_0x00db:
            r2.A0H = r13
            int r3 = r2.A02
            int r1 = r2.A01
            X.EAW r0 = r2.A0T
            if (r0 != 0) goto L_0x00f1
            X.EDK r0 = X.DDR.A07(r2, r9)
            X.EDE r0 = (X.EDE) r0
            X.EAW r0 = r0.Ba2()
            r2.A0T = r0
        L_0x00f1:
            X.C26159CtX.A01(r0)
            X.CRN r4 = new X.CRN
            r4.<init>(r0, r3, r1)
            java.util.HashMap r0 = X.C17880vN.A11()
            r4.A00 = r0
            r12 = 0
            goto L_0x0105
        L_0x0101:
            X.BzS r15 = X.C24331BzS.MEDIUM
            goto L_0x0041
        L_0x0105:
            android.view.Display r1 = r2.A09     // Catch:{ RuntimeException -> 0x0119 }
            android.view.TextureView r0 = r2.A0A     // Catch:{ RuntimeException -> 0x0119 }
            if (r1 != 0) goto L_0x0115
            if (r0 == 0) goto L_0x0119
            android.view.Display r1 = r0.getDisplay()     // Catch:{ RuntimeException -> 0x0119 }
            r2.A09 = r1     // Catch:{ RuntimeException -> 0x0119 }
            if (r1 == 0) goto L_0x0119
        L_0x0115:
            int r12 = r1.getRotation()     // Catch:{ RuntimeException -> 0x0119 }
        L_0x0119:
            r2.A03 = r12
            X.EAk r5 = r2.A0i
            X.E4g r1 = r2.A0L
            if (r1 != 0) goto L_0x0129
            r0 = 1
            X.DEK r1 = new X.DEK
            r1.<init>(r2, r0)
            r2.A0L = r1
        L_0x0129:
            r5.CIz(r1)
            java.lang.String r10 = r2.A0j
            int r3 = r2.A00
            r11 = 0
            if (r3 == 0) goto L_0x0141
            r11 = 1
            if (r3 == r11) goto L_0x0141
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Could not convert camera facing to optic: "
            java.lang.RuntimeException r0 = X.BEA.A0h(r0, r1, r3)
            throw r0
        L_0x0141:
            X.BUg r7 = r2.A0H
            X.CYs r9 = new X.CYs
            r9.<init>(r4)
            X.EAf r8 = A00(r2)
            X.C6E r6 = r2.A0P
            if (r6 != 0) goto L_0x0158
            r0 = 7
            X.BUm r6 = new X.BUm
            r6.<init>(r2, r0)
            r2.A0P = r6
        L_0x0158:
            r5.BFe(r6, r7, r8, r9, r10, r11, r12)
            X.E4i r1 = r2.A0O
            if (r1 != 0) goto L_0x0167
            r0 = 1
            X.DEN r1 = new X.DEN
            r1.<init>(r2, r0)
            r2.A0O = r1
        L_0x0167:
            r5.BBV(r1)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22808BPw.A0E():void");
    }

    public C25632CjI A0F() {
        C28614EAk eAk = this.A0i;
        if (eAk == null || !eAk.isConnected()) {
            return null;
        }
        try {
            return eAk.BOK();
        } catch (C27206DZg unused) {
            return null;
        }
    }

    public C22892BUd BTg() {
        return EDA.A00;
    }

    public void COw() {
        if (!this.A0b && this.A0a) {
            C28614EAk eAk = this.A0i;
            if (eAk.Bgf()) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                A02(this);
                C6E c6e = this.A0Q;
                if (c6e == null) {
                    c6e = new C22901BUm(this, 8);
                    this.A0Q = c6e;
                }
                eAk.COv(c6e);
            }
        }
    }

    public void A0G(float f) {
        C28614EAk eAk;
        C25632CjI A0F2 = A0F();
        if (A0F2 != null && BE9.A1T(C25632CjI.A0G, A0F2)) {
            this.A0X = Float.valueOf(f);
            C25632CjI A0F3 = A0F();
            if (A0F3 != null && (eAk = this.A0i) != null && eAk.isConnected()) {
                float A042 = AnonymousClass000.A04(A0F3.A02(C25632CjI.A01));
                float A0B2 = ((float) BE9.A0B(C25632CjI.A0j, A0F3)) * A042;
                float A0B3 = ((float) BE9.A0B(C25632CjI.A0f, A0F3)) * A042;
                if (f < A0B2) {
                    f = A0B2;
                } else if (f > A0B3) {
                    f = A0B3;
                }
                int round = Math.round(f / A042);
                C26128Csq csq = new C26128Csq();
                C26128Csq.A01(C25971Cpe.A09, csq, round);
                eAk.Bk3(new C22896BUh(), csq.A03());
            }
        }
    }
}
