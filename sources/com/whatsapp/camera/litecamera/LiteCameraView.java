package com.whatsapp.camera.litecamera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10I;
import X.AnonymousClass190;
import X.AnonymousClass1HS;
import X.AnonymousClass1KB;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass7R9;
import X.AnonymousClass7RL;
import X.BCO;
import X.BE6;
import X.C107855aj;
import X.C108945cZ;
import X.C128346fq;
import X.C133846pb;
import X.C160978Av;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C195109so;
import X.C19830z4;
import X.C200710s;
import X.C24819CLm;
import X.C24986CSm;
import X.C25688CkJ;
import X.C26078Crs;
import X.C26132Csv;
import X.C26709DAi;
import X.C26794DEc;
import X.C28417E0i;
import X.C28598E9p;
import X.C28654ECo;
import X.C30391dr;
import X.C92364hB;
import X.C92374hC;
import X.C92384hD;
import X.CY3;
import X.CZK;
import X.DAT;
import X.DAU;
import X.DAV;
import X.DAY;
import X.E48;
import X.E6T;
import X.E8C;
import X.E93;
import X.E99;
import X.EDL;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

public class LiteCameraView extends FrameLayout implements AnonymousClass009, C160978Av {
    public int A00;
    public int A01;
    public AnonymousClass190 A02;
    public AnonymousClass1KB A03;
    public E6T A04;
    public AnonymousClass1HS A05;
    public C28598E9p A06;
    public C18030ve A07;
    public C133846pb A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public Runnable A0D;
    public Runnable A0E;
    public Runnable A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final E93 A0Q;
    public final EDL A0R;
    public final C28417E0i A0S;
    public final C25688CkJ A0T;
    public final C26709DAi A0U;
    public final C200710s A0V;
    public final C26794DEc A0W;
    public final E99 A0X;
    public final C195109so A0Y;
    public final CY3 A0Z;
    public volatile boolean A0a;
    public volatile boolean A0b;
    public volatile boolean A0c;

    public LiteCameraView(int i, Context context, EDL edl) {
        this(i, context, edl, 0, (Integer) null);
    }

    public int getCameraType() {
        return 1;
    }

    public static C24986CSm A01(int i) {
        C24986CSm cSm = new C24986CSm();
        cSm.A03 = true;
        cSm.A05 = false;
        cSm.A04 = false;
        cSm.A02 = false;
        cSm.A00 = false;
        boolean z = false;
        cSm.A05 = AnonymousClass000.A1O(i & 1);
        if ((i & 2) != 0) {
            z = true;
        }
        cSm.A00 = Boolean.valueOf(z);
        cSm.A04 = true;
        cSm.A01 = true;
        cSm.A02 = true;
        return cSm;
    }

    public static void A04(LiteCameraView liteCameraView, Exception exc, String str) {
        if (!C18020vd.A05(C18040vf.A02, liteCameraView.A07, 12772)) {
            return;
        }
        if (exc != null) {
            liteCameraView.A02.A0E(C17900vP.A0C(str, AnonymousClass000.A11("LiteCameraView"), exc), liteCameraView.getDebugInfo(), exc);
        } else {
            liteCameraView.A02.A0G(C17900vP.A0A("LiteCameraView", str), liteCameraView.getDebugInfo(), true);
        }
    }

    private int getFlashModeCount() {
        return C17890vO.A00(C17890vO.A0B((C19830z4) this.A0B.get()), AnonymousClass001.A1I("flash_modes_count", AnonymousClass000.A10(), getCameraFacing()));
    }

    private int getResizeMode() {
        return this.A01;
    }

    public void BEp() {
        C200710s r3 = this.A0V;
        r3.A03();
        C128346fq r2 = (C128346fq) this.A0A.get();
        AnonymousClass1OB r1 = r2.A00;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        r2.A00 = null;
        EDL edl = this.A0R;
        edl.getClass();
        r3.execute(new AnonymousClass7R9((Object) edl, 29));
    }

    public void BEu() {
        CZK czk = this.A0T.A03;
        synchronized (czk) {
            czk.A00 = null;
        }
    }

    public void BIe(C92364hB r2) {
        this.A0Y.A02(r2);
    }

    public void BJw(C107855aj r2, BCO bco, C92384hD r4) {
        this.A0Y.A00(r2, bco, r4);
    }

    public void BLS(float f, float f2) {
        EDL edl = this.A0R;
        edl.CJ0(new C24819CLm(this));
        edl.BLR((int) f, (int) f2);
    }

    public boolean BeH() {
        return this.A0R.BeH();
    }

    public boolean Bf2() {
        return this.A0a;
    }

    public boolean Bga() {
        if (this.A0c || this.A0b) {
            return true;
        }
        return false;
    }

    public boolean Bgi() {
        return "torch".equals(this.A0G);
    }

    public boolean Bgt() {
        return this.A0R instanceof DAU;
    }

    public void BkL() {
        EDL edl = this.A0R;
        if (edl.Bgf()) {
            this.A0T.A00();
            edl.COw();
            int i = this.A00;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    i2 = 0;
                } else {
                    return;
                }
            }
            this.A00 = i2;
        }
    }

    public void CFx() {
        if (this.A0a) {
            C28598E9p e9p = this.A06;
            if (e9p != null) {
                e9p.C1j();
                return;
            }
            return;
        }
        CG0();
    }

    public void CG0() {
        if (!this.A0P) {
            this.A0P = true;
            C128346fq r3 = (C128346fq) this.A0A.get();
            AnonymousClass1OB r1 = r3.A00;
            if (r1 != null) {
                r1.BEM((CancellationException) null);
            }
            r3.A00 = null;
            r3.A00 = AnonymousClass3MY.A0s(new LiteCameraGarbageCollector$startGarbageCollectorProcess$1((C30391dr) null), (AnonymousClass1OX) r3.A02.getValue());
            this.A0V.execute(new AnonymousClass7R9((Object) this, 28));
        }
    }

    public int CLV(int i) {
        EDL edl = this.A0R;
        edl.CLW(i);
        return edl.Bbz();
    }

    public void COZ() {
        if (this.A0P && !Bga()) {
            this.A0c = C18020vd.A05(C18040vf.A02, this.A07, 12024);
            this.A0R.COe();
            this.A0M = false;
        }
    }

    public void COa(Runnable runnable, Runnable runnable2) {
        this.A0E = runnable;
        this.A0D = runnable2;
        if (this.A0P && !Bga()) {
            this.A0c = C18020vd.A05(C18040vf.A02, this.A07, 12024);
            this.A0R.COb();
        }
    }

    public boolean COq() {
        return this.A0O;
    }

    public void CP2(E8C e8c, int i) {
        DAY day = new DAY(e8c, this);
        DAV dav = new DAV(day, this);
        EDL edl = this.A0R;
        if (edl instanceof DAU) {
            edl.CP0(A01(i), day);
        } else if (edl instanceof DAT) {
            day.Bny();
            edl.CP0(A01(i), dav);
        } else {
            Log.e("LiteCamera/processPhotoCapture: Unrecognized camera controller implementation.");
        }
    }

    public void CPa() {
        String str;
        if (this.A0O) {
            boolean Bgi = Bgi();
            EDL edl = this.A0R;
            if (Bgi) {
                edl.CIv(0);
                str = "off";
            } else {
                edl.CIv(3);
                str = "torch";
            }
            this.A0G = str;
        }
    }

    public void CQR(C92374hC r2) {
        this.A0Y.A01(r2);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public int getCameraApi() {
        return this.A0R.Bgs() ? 1 : 0;
    }

    public int getCameraFacing() {
        if (C18020vd.A05(C18040vf.A02, this.A07, 12270)) {
            return this.A00;
        }
        return this.A0R.getCameraFacing();
    }

    public String getFlashMode() {
        return this.A0G;
    }

    public int getMaxZoom() {
        return this.A0R.BUW();
    }

    public int getNumberOfCameras() {
        if (this.A0R.Bgf()) {
            return 2;
        }
        return 1;
    }

    public long getPictureResolution() {
        C26132Csv csv = this.A0W.A00;
        if (csv != null) {
            return ((long) csv.A02) * ((long) csv.A01);
        }
        return 0;
    }

    public int getStoredFlashModeCount() {
        return C17890vO.A00(C17890vO.A0B((C19830z4) this.A0B.get()), AnonymousClass001.A1I("flash_modes_count", AnonymousClass000.A10(), getCameraFacing()));
    }

    public long getVideoResolution() {
        C26132Csv csv = this.A0W.A02;
        if (csv != null) {
            return ((long) csv.A02) * ((long) csv.A01);
        }
        return 0;
    }

    public int getZoomLevel() {
        return this.A0R.Bbz();
    }

    public boolean isRecording() {
        if (C18020vd.A05(C18040vf.A02, this.A07, 12270)) {
            return this.A0M;
        }
        return this.A0R.Bg9();
    }

    public void pause() {
        if (this.A0P && !Bga()) {
            this.A0P = false;
            C128346fq r2 = (C128346fq) this.A0A.get();
            AnonymousClass1OB r1 = r2.A00;
            if (r1 != null) {
                r1.BEM((CancellationException) null);
            }
            r2.A00 = null;
            this.A0V.execute(new AnonymousClass7R9((Object) this, 27));
        }
    }

    public void setFlashMode(String str) {
        if (!str.equals("torch") || this.A0O) {
            this.A0G = str;
            this.A0R.CIv(A00(str));
        }
    }

    public void setOnRenderingStartedCallback(Runnable runnable) {
        this.A0U.A01 = runnable;
    }

    public void setQrDecodeHints(Map map) {
        this.A0T.A03.A01 = map;
    }

    public void setQrScanningEnabled(boolean z) {
        if (z != this.A0L) {
            this.A0L = z;
            if (z) {
                EDL edl = this.A0R;
                C25688CkJ ckJ = this.A0T;
                edl.CK7(ckJ.A01);
                if (!ckJ.A07) {
                    ckJ.A03.A01();
                    ckJ.A07 = true;
                    return;
                }
                return;
            }
            this.A0T.A00();
            this.A0R.CK7((E48) null);
        }
    }

    public void setResizeMode(int i) {
        if (this.A01 != i) {
            this.A01 = i;
        }
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    return 1;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    return 0;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return 2;
                }
                break;
            case 110547964:
                if (str.equals("torch")) {
                    return 3;
                }
                break;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Not able to map app flash mode: ");
        throw AnonymousClass001.A12(str, A10);
    }

    public static void A02(Bitmap bitmap, C28654ECo eCo) {
        try {
            ByteArrayOutputStream A15 = C108945cZ.A15();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, A15);
            C26078Crs.A00(new AnonymousClass7RL(eCo, A15.toByteArray(), 21));
        } catch (Exception e) {
            C17900vP.A0X(e, "LiteCamera/onBitmapReady: Failed to process bitmap - ", AnonymousClass000.A10());
            eCo.Bnv(e);
        } catch (OutOfMemoryError e2) {
            C17900vP.A0X(e2, "LiteCamera/onBitmapReady: Out of memory - ", AnonymousClass000.A10());
            eCo.Bnv(BE6.A0o("Out of memory", e2));
        }
    }

    public static void A03(LiteCameraView liteCameraView) {
        List flashModes = liteCameraView.getFlashModes();
        if (liteCameraView.getFlashModeCount() != flashModes.size()) {
            int size = flashModes.size();
            C17880vN.A1C(C19830z4.A00((C19830z4) liteCameraView.A0B.get()), AnonymousClass001.A1I("flash_modes_count", AnonymousClass000.A10(), liteCameraView.getCameraFacing()), size);
        }
    }

    private String getDebugInfo() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("isVideoCallActive:");
        A10.append(this.A05.A03());
        A10.append(" | isAttachedToWindow:");
        A10.append(isAttachedToWindow());
        A10.append(" | isLiteCameraActive:");
        EDL edl = this.A0R;
        A10.append(edl.Be2());
        A10.append(" | isCameraServiceConnected:");
        A10.append(edl.BeH());
        A10.append(" | isInPreview:");
        A10.append(this.A0a);
        A10.append(" | isSimpleLiteCamera:");
        return AnonymousClass3MY.A0r(A10, edl instanceof DAU);
    }

    public boolean Beu() {
        return C17890vO.A1R(getCameraFacing());
    }

    public boolean Bk9() {
        if (!C17890vO.A1R(getCameraFacing()) || this.A0G.equals("off")) {
            return false;
        }
        return true;
    }

    public String BkM() {
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return "off";
        }
        int indexOf = flashModes.indexOf(this.A0G);
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        String A0w = C17880vN.A0w(flashModes, (indexOf + 1) % flashModes.size());
        this.A0G = A0w;
        this.A0R.CIv(A00(A0w));
        return this.A0G;
    }

    public void COO(File file, int i) {
        if (!Bga()) {
            this.A0M = true;
            this.A0R.COP(this.A0Z, file);
        }
    }

    public List getFlashModes() {
        if (C17890vO.A1R(getCameraFacing())) {
            return this.A0I;
        }
        return this.A0H;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BEp();
    }

    public void setCameraCallback(C28598E9p e9p) {
        this.A06 = e9p;
    }

    public void setCameraSwitchedCallback(Runnable runnable) {
        this.A0F = runnable;
    }

    public void setShouldStoreCameraFacingMode(boolean z) {
        this.A0N = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0129, code lost:
        if (X.BE6.A01(1.0d, r2) <= 0.30000001192092896d) goto L_0x012b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LiteCameraView(int r13, android.content.Context r14, X.EDL r15, int r16, java.lang.Integer r17) {
        /*
            r12 = this;
            r12.<init>(r14)
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x006e
            r0 = 1
            r12.A0K = r0
            java.lang.Object r0 = r12.generatedComponent()
            X.10E r2 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8q(r2)
            r12.A07 = r0
            X.1KB r0 = X.AnonymousClass10E.A13(r2)
            r12.A03 = r0
            X.00S r0 = r2.A31
            java.lang.Object r0 = r0.get()
            X.190 r0 = (X.AnonymousClass190) r0
            r12.A02 = r0
            X.00S r0 = r2.A98
            java.lang.Object r0 = r0.get()
            X.1HS r0 = (X.AnonymousClass1HS) r0
            r12.A05 = r0
            X.10G r1 = r2.A00
            X.00S r0 = r1.A7f
            java.lang.Object r0 = r0.get()
            X.6pb r0 = (X.C133846pb) r0
            r12.A08 = r0
            X.00S r0 = r2.ABl
            X.00H r0 = X.C000200d.A00(r0)
            r12.A0B = r0
            X.00S r0 = r2.ARs
            java.lang.Object r0 = r0.get()
            X.E6T r0 = (X.E6T) r0
            r12.A04 = r0
            X.00S r0 = r1.AD0
            X.00H r0 = X.C000200d.A00(r0)
            r12.A0A = r0
            X.00S r0 = r2.AC1
            java.lang.Object r0 = r0.get()
            X.10I r0 = (X.AnonymousClass10I) r0
            r12.A09 = r0
        L_0x006e:
            java.lang.String r0 = "off"
            r12.A0G = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r12.A0H = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r12.A0I = r0
            r0 = 0
            r12.A0b = r0
            r12.A0c = r0
            r12.A0M = r0
            r8 = 1
            r12.A0N = r8
            r12.A01 = r0
            X.DAQ r0 = new X.DAQ
            r0.<init>(r12)
            r12.A0Q = r0
            r6 = 0
            X.DAc r0 = new X.DAc
            r0.<init>(r12, r6)
            r12.A0S = r0
            X.CY3 r0 = new X.CY3
            r0.<init>(r12)
            r12.A0Z = r0
            r0 = 6
            X.DE8 r5 = new X.DE8
            r5.<init>(r12, r0)
            r12.A0X = r5
            r12.A0R = r15
            if (r17 != 0) goto L_0x0195
            X.00H r0 = r12.A0B
            java.lang.Object r0 = r0.get()
            X.0z4 r0 = (X.C19830z4) r0
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "camera_facing"
            int r0 = r1.getInt(r0, r6)
        L_0x00be:
            r12.A00 = r0
            r15.CJA(r0)
            X.E6T r0 = r12.A04
            X.9so r0 = r0.BGG(r14, r15)
            r12.A0Y = r0
            r0 = 2015(0x7df, float:2.824E-42)
            if (r13 < r0) goto L_0x0185
            r7 = 8388608(0x800000, float:1.17549435E-38)
            r4 = 2073600(0x1fa400, float:2.905732E-39)
        L_0x00d4:
            java.lang.String r0 = "window"
            java.lang.Object r2 = r14.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r1 = r2.getDefaultDisplay()
            boolean r0 = X.AnonymousClass112.A08()
            if (r0 == 0) goto L_0x0177
            android.view.WindowMetrics r0 = r2.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
        L_0x00f6:
            int r1 = r1 * r0
            float r9 = (float) r1
            r0 = 1241325568(0x49fd2000, float:2073600.0)
            float r1 = r9 / r0
            r0 = 1231093760(0x49610000, float:921600.0)
            float r9 = r9 / r0
            double r2 = (double) r1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x0173
            double r10 = X.BE6.A01(r0, r2)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0173
            double r2 = (double) r9
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x012b
            double r9 = X.BE6.A01(r0, r2)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r1 = 307200(0x4b000, float:4.30479E-40)
            if (r0 > 0) goto L_0x012e
        L_0x012b:
            r1 = 921600(0xe1000, float:1.291437E-39)
        L_0x012e:
            X.DEc r0 = new X.DEc
            r0.<init>(r1, r7, r4, r8)
            r12.A0W = r0
            r15.CKo(r0)
            boolean r0 = r15 instanceof X.DAT
            if (r0 == 0) goto L_0x014e
            r0 = r16
            r12.setResizeMode(r0)
            X.BUd r0 = X.EDD.A00
            X.EDK r0 = r15.BP7(r0)
            X.EDD r0 = (X.EDD) r0
            if (r0 == 0) goto L_0x014e
            r0.BBf(r5)
        L_0x014e:
            android.view.View r1 = r15.BOA()
            r0 = -2
            r12.addView(r1, r0)
            X.CLl r1 = new X.CLl
            r1.<init>(r12)
            X.CkJ r0 = new X.CkJ
            r0.<init>(r1)
            r12.A0T = r0
            X.DAi r0 = new X.DAi
            r0.<init>(r15)
            r12.A0U = r0
            X.10I r1 = r12.A09
            X.10s r0 = new X.10s
            r0.<init>(r1, r6)
            r12.A0V = r0
            return
        L_0x0173:
            r1 = 2073600(0x1fa400, float:2.905732E-39)
            goto L_0x012e
        L_0x0177:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1.getRealMetrics(r0)
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            goto L_0x00f6
        L_0x0185:
            r0 = 2013(0x7dd, float:2.821E-42)
            r7 = 2097152(0x200000, float:2.938736E-39)
            r4 = 307200(0x4b000, float:4.30479E-40)
            if (r13 < r0) goto L_0x00d4
            r7 = 5242880(0x500000, float:7.34684E-39)
            r4 = 921600(0xe1000, float:1.291437E-39)
            goto L_0x00d4
        L_0x0195:
            int r0 = r17.intValue()
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.litecamera.LiteCameraView.<init>(int, android.content.Context, X.EDL, int, java.lang.Integer):void");
    }

    public LiteCameraView(int i, Context context, EDL edl, Integer num) {
        this(i, context, edl, 0, num);
    }
}
