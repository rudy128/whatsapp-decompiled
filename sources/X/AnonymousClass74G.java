package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.ptv.PushToVideoRecordingCountdown;
import com.whatsapp.pushtorecordmedia.MediaProgressRing;
import com.whatsapp.pushtorecordmedia.MediaTimeDisplay;
import java.io.File;
import java.util.List;

/* renamed from: X.74G  reason: invalid class name */
public class AnonymousClass74G {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = -1;
    public C1419577p A03;
    public LiteCameraView A04;
    public C133796pV A05;
    public AnonymousClass206 A06;
    public C130966kI A07;
    public C127676ek A08;
    public C130906kC A09;
    public File A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public Boolean A0J;
    public boolean A0K = false;
    public boolean A0L;
    public boolean A0M;
    public final int A0N;
    public final long A0O;
    public final View A0P;
    public final View A0Q;
    public final AnonymousClass190 A0R;
    public final AnonymousClass6ZO A0S;
    public final AnonymousClass6ZP A0T;
    public final AnonymousClass1T1 A0U;
    public final AnonymousClass1FU A0V;
    public final AnonymousClass1KB A0W;
    public final C34531kd A0X;
    public final CX1 A0Y;
    public final AnonymousClass1HS A0Z;
    public final C1606289h A0a;
    public final CX2 A0b;
    public final C23501Gn A0c = new C143707Em(this, 4);
    public final AnonymousClass1NM A0d;
    public final AnonymousClass11C A0e;
    public final AnonymousClass11P A0f;
    public final C19830z4 A0g;
    public final C18000vb A0h;
    public final AnonymousClass11Z A0i;
    public final C18030ve A0j;
    public final AnonymousClass18K A0k;
    public final WamediaManager A0l;
    public final C18180vt A0m = new C18180vt(1, 100, SearchActionVerificationClientService.NOTIFICATION_ID, false);
    public final C18180vt A0n = new C18180vt(1, 10, 1000, false);
    public final C18010vc A0o;
    public final PushToVideoRecordingCountdown A0p;
    public final MediaProgressRing A0q;
    public final MediaTimeDisplay A0r;
    public final MediaTimeDisplay A0s;
    public final MediaTimeDisplay A0t;
    public final C136246tV A0u;
    public final AnonymousClass70F A0v;
    public final C41111vp A0w = AnonymousClass3MW.A0n(false);
    public final C41111vp A0x = AnonymousClass3MW.A0n(1);
    public final C41111vp A0y = AnonymousClass3MW.A0n(false);
    public final AnonymousClass10I A0z;
    public final AnonymousClass1IV A10 = new AnonymousClass7OI(this, 2);
    public final AnonymousClass1VT A11;
    public final List A12;
    public final boolean A13;
    public final View A14;
    public final View A15;
    public final View A16;
    public final View A17;
    public final AnonymousClass3TF A18;
    public final C218617r A19;
    public final AnonymousClass118 A1A;
    public final C219217x A1B;
    public final C223819r A1C;
    public final Runnable A1D;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3.A0G() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AnonymousClass206 r21, boolean r22) {
        /*
            r20 = this;
            r2 = 0
            r0 = r20
            r0.A0K = r2
            X.17x r3 = r0.A1B
            java.lang.String r1 = "android.permission.CAMERA"
            int r1 = r3.A02(r1)
            r7 = 1
            boolean r8 = X.AnonymousClass000.A1O(r1)
            boolean r1 = r3.A0E()
            r6 = r1 ^ 1
            boolean r1 = X.AnonymousClass112.A07()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.A0G()
            r5 = 1
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r8 != 0) goto L_0x02dd
            if (r6 != 0) goto L_0x02dd
            if (r5 != 0) goto L_0x02dd
            X.1HS r1 = r0.A0Z
            boolean r3 = r1.A01()
            X.1FU r1 = r0.A0V
            if (r3 != 0) goto L_0x02d1
            X.1NM r4 = r0.A0d
            X.1Gn r3 = r0.A0c
            boolean r3 = r4.A04(r3)
            if (r3 == 0) goto L_0x0058
            X.11Z r3 = r0.A0i
            long r9 = r3.A01()
            X.0ve r8 = r0.A0j
            r3 = 3658(0xe4a, float:5.126E-42)
            long r4 = X.C108995ce.A08(r8, r3)
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0059
            X.18K r2 = r0.A0k
            r0 = 5
            X.C31141f5.A05(r1, r1, r2, r0)
        L_0x0058:
            return
        L_0x0059:
            X.3TF r3 = r0.A18
            X.1vp r3 = r3.A00
            java.lang.Object r3 = r3.A06()
            X.4YI r3 = (X.AnonymousClass4YI) r3
            X.70F r6 = r0.A0v
            float r4 = r3.A00
            float r3 = r3.A01
            r6.A00 = r4
            r6.A01 = r3
            android.view.View r3 = r0.A0Q
            r3.setVisibility(r2)
            android.content.Context r5 = r3.getContext()
            r4 = 2131102306(0x7f060a62, float:1.7817046E38)
            X.AnonymousClass3MX.A1A(r5, r3, r4)
            X.01n r4 = r1.getSupportActionBar()
            if (r4 == 0) goto L_0x0085
            r4.A0E()
        L_0x0085:
            X.1VT r5 = r0.A11
            X.1IV r4 = r0.A10
            r5.registerObserver(r4)
            X.11C r9 = r0.A0e
            X.C84094Hv.A00(r9)
            long r4 = java.lang.System.currentTimeMillis()
            r0.A01 = r4
            X.0vc r4 = r0.A0o
            int r9 = X.C24191Jf.A02(r9, r4)
            X.CX2 r11 = r0.A0b
            X.CX1 r12 = r0.A0Y
            r4 = 12284(0x2ffc, float:1.7214E-41)
            X.0vf r13 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r13, r8, r4)
            java.lang.String r10 = "whatsapp_ptv"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            if (r4 == 0) goto L_0x02ae
            r4 = 8233(0x2029, float:1.1537E-41)
            boolean r4 = X.C18020vd.A05(r13, r8, r4)
            if (r4 == 0) goto L_0x02ae
            java.lang.String r4 = "CameraUtils/getPTVCameraImpl ArLiteCameraImpl"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.4D9 r13 = X.AnonymousClass4D9.PRE_CAPTURE
            r11 = r12
            r12 = r1
            r14 = r8
            r15 = r10
            r16 = r2
            X.DAT r10 = r11.A00(r12, r13, r14, r15, r16)
        L_0x00ca:
            com.whatsapp.camera.litecamera.LiteCameraView r4 = new com.whatsapp.camera.litecamera.LiteCameraView
            r4.<init>(r9, r1, r10, r5)
            r0.A04 = r4
            r4.setQrScanningEnabled(r2)
            com.whatsapp.camera.litecamera.LiteCameraView r4 = r0.A04
            r4.A0N = r2
            r4 = 2131428803(0x7f0b05c3, float:1.847926E38)
            android.view.View r10 = X.AnonymousClass1HF.A06(r3, r4)
            X.6ZP r5 = r0.A0T
            com.whatsapp.camera.litecamera.LiteCameraView r11 = r0.A04
            r4 = 2131428809(0x7f0b05c9, float:1.8479273E38)
            android.widget.FrameLayout r13 = X.C108945cZ.A0P(r3, r4)
            r4 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r3, r4)
            X.1K2 r4 = r5.A00
            X.10E r4 = r4.A01
            X.118 r14 = X.AnonymousClass3MZ.A0l(r4)
            X.6ek r9 = new X.6ek
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A08 = r9
            X.6ZO r9 = r0.A0S
            r4 = 2131434051(0x7f0b1a43, float:1.8489905E38)
            android.widget.FrameLayout r10 = X.C108945cZ.A0P(r3, r4)
            r4 = 2131433884(0x7f0b199c, float:1.8489566E38)
            X.1bI r18 = X.C28931bI.A00(r3, r4)
            X.6cQ r5 = new X.6cQ
            r5.<init>(r0)
            X.1K2 r4 = r9.A00
            X.10E r4 = r4.A01
            X.190 r11 = X.AnonymousClass3MY.A0N(r4)
            X.0ve r15 = X.AnonymousClass10E.A8r(r4)
            X.1KB r12 = X.AnonymousClass10E.A12(r4)
            X.11C r13 = X.AnonymousClass3Ma.A0a(r4)
            X.118 r14 = X.AnonymousClass3MZ.A0l(r4)
            X.10I r19 = X.AnonymousClass10E.AL1(r4)
            X.10G r4 = r4.A00
            X.00S r4 = r4.A2V
            java.lang.Object r4 = r4.get()
            X.6gC r4 = (X.AnonymousClass6gC) r4
            X.6kC r9 = new X.6kC
            r16 = r4
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.A09 = r9
            r4 = 2131428777(0x7f0b05a9, float:1.8479208E38)
            android.view.View r11 = X.AnonymousClass1HF.A06(r3, r4)
            X.0vb r4 = r0.A0h
            com.whatsapp.camera.litecamera.LiteCameraView r12 = r0.A04
            int r9 = r0.A0N
            X.6kI r10 = new X.6kI
            r13 = r4
            r14 = r8
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A07 = r10
            com.whatsapp.WaImageView r5 = r10.A07
            r4 = 14
            X.AnonymousClass3Ma.A1A(r5, r0, r4)
            com.whatsapp.WaImageButton r5 = r10.A05
            r4 = 15
            X.AnonymousClass3Ma.A1A(r5, r0, r4)
            com.whatsapp.WaImageButton r5 = r10.A06
            r4 = 16
            X.AnonymousClass3Ma.A1A(r5, r0, r4)
            android.view.View r5 = r10.A04
            r4 = 17
            X.AnonymousClass3Ma.A1A(r5, r0, r4)
            android.view.View r5 = r10.A03
            r4 = 18
            X.AnonymousClass3Ma.A1A(r5, r0, r4)
            X.1vp r4 = r0.A0w
            X.1Dg r8 = X.C22791Df.A00(r4)
            X.AGM r5 = new X.AGM
            r5.<init>(r7)
            X.1Dg r10 = X.C108945cZ.A0R()
            X.AGp r4 = new X.AGp
            r4.<init>(r5, r10)
            r10.A0H(r8, r4)
            r4 = 27
            X.7AQ r8 = new X.7AQ
            r8.<init>(r0, r4)
            java.lang.Runnable r4 = r0.A0B
            if (r4 == 0) goto L_0x01a5
            r4.run()
        L_0x01a5:
            r5 = 28
            X.3C5 r4 = new X.3C5
            r4.<init>(r0, r10, r8, r5)
            r0.A0B = r4
            r10.A0A(r1, r8)
            X.7Lb r5 = new X.7Lb
            r5.<init>(r0, r7)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r4 = r0.A0s
            r4.A03(r1, r5)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r4 = r0.A0t
            r4.A03(r1, r5)
            com.whatsapp.camera.litecamera.LiteCameraView r8 = r0.A04
            r4 = 2131428799(0x7f0b05bf, float:1.8479253E38)
            android.view.ViewGroup r5 = X.AnonymousClass3MW.A0C(r3, r4)
            X.6pV r4 = new X.6pV
            r4.<init>(r5, r8, r2)
            r0.A05 = r4
            X.7Lc r4 = new X.7Lc
            r4.<init>(r0)
            r6.A04 = r4
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r5 = r0.A0r
            r8 = 2
            X.7Lb r4 = new X.7Lb
            r4.<init>(r0, r8)
            r5.A03(r1, r4)
            X.7DV r5 = new X.7DV
            r5.<init>(r0, r7)
            X.77p r4 = new X.77p
            r4.<init>(r1, r5, r2)
            r0.A03 = r4
            X.6ek r10 = r0.A08
            r4 = 21
            X.78u r5 = new X.78u
            r5.<init>((java.lang.Object) r0, (int) r4)
            android.view.View r4 = r10.A01
            r4.setOnTouchListener(r5)
            boolean r4 = r0.A13
            if (r4 == 0) goto L_0x020b
            com.whatsapp.camera.litecamera.LiteCameraView r10 = r0.A04
            r5 = 7
            X.7RB r4 = new X.7RB
            r4.<init>((java.lang.Object) r0, (int) r5)
            r10.setOnRenderingStartedCallback(r4)
        L_0x020b:
            com.whatsapp.camera.litecamera.LiteCameraView r5 = r0.A04
            X.7DT r4 = new X.7DT
            r4.<init>(r0, r8)
            r5.A06 = r4
            com.whatsapp.pushtorecordmedia.MediaProgressRing r5 = r0.A0q
            X.7La r4 = new X.7La
            r4.<init>(r0, r8)
            r5.A02(r1, r4)
            X.AnonymousClass6Y1.A00(r1)
            X.6kI r5 = r0.A07
            android.view.View r1 = r5.A01
            r4 = 4
            r1.setVisibility(r4)
            com.whatsapp.WaImageButton r1 = r5.A05
            r1.setVisibility(r4)
            android.view.View r4 = r0.A17
            r5 = 1
            if (r9 == r7) goto L_0x02ab
            if (r9 == r8) goto L_0x02ab
            r5 = 0
            r1 = 0
        L_0x0237:
            r4.setVisibility(r1)
            android.view.View r4 = r0.A16
            r8 = 4
            r1 = 4
            if (r5 == 0) goto L_0x0241
            r1 = 0
        L_0x0241:
            r4.setVisibility(r1)
            android.view.View r1 = r0.A0P
            r1.setVisibility(r8)
            r6.A01()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6.A02 = r4
            r6.A09 = r7
            android.widget.ImageView r4 = r6.A0O
            boolean r1 = r4.isLaidOut()
            if (r1 == 0) goto L_0x02a1
            X.AnonymousClass70F.A00(r6)
        L_0x025f:
            android.view.View r1 = r0.A14
            r1.setVisibility(r8)
            r3.setVisibility(r2)
            r0.A0L = r2
            r0.A0D = r7
            X.89h r1 = r0.A0a
            X.7DX r1 = (X.AnonymousClass7DX) r1
            java.lang.Object r1 = r1.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.AnonymousClass4aY.A1i(r1, r2)
            com.whatsapp.camera.litecamera.LiteCameraView r1 = r0.A04
            r1.CG0()
            X.6ek r4 = r0.A08
            android.view.View r3 = r4.A01
            int r1 = r3.getVisibility()
            if (r1 != 0) goto L_0x029d
            android.view.View r3 = r4.A00
            r1 = 8
            r3.setVisibility(r1)
        L_0x028c:
            r0.A0M = r7
            A01(r0)
            if (r22 == 0) goto L_0x0296
            r0.A0B(r2)
        L_0x0296:
            r1 = r21
            if (r21 == 0) goto L_0x0058
            r0.A06 = r1
            return
        L_0x029d:
            r3.setVisibility(r2)
            goto L_0x028c
        L_0x02a1:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            r1 = 17
            X.AnonymousClass793.A00(r4, r6, r1)
            goto L_0x025f
        L_0x02ab:
            r1 = 8
            goto L_0x0237
        L_0x02ae:
            r4 = 8708(0x2204, float:1.2203E-41)
            boolean r4 = X.C18020vd.A05(r13, r8, r4)
            if (r4 == 0) goto L_0x02c1
            java.lang.String r4 = "CameraUtils/getPTVCameraImpl newLiteCameraController"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.DAT r10 = r11.A00(r1, r8, r10, r2)
            goto L_0x00ca
        L_0x02c1:
            java.lang.String r4 = "CameraUtils/getPTVCameraImpl oldLiteCameraController"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            android.view.TextureView r4 = new android.view.TextureView
            r4.<init>(r1)
            X.DAU r10 = X.C25307CdB.A01(r1, r4)
            goto L_0x00ca
        L_0x02d1:
            r2 = 2131890022(0x7f120f66, float:1.9414724E38)
            r1.BhQ(r2)
            X.89h r0 = r0.A0a
            r0.BnQ()
            return
        L_0x02dd:
            boolean r1 = A08(r0)
            if (r1 == 0) goto L_0x02ee
            com.whatsapp.ptv.PushToVideoRecordingCountdown r4 = r0.A0p
            android.os.Handler r3 = r4.A08
            r1 = 0
            r3.removeCallbacksAndMessages(r1)
            com.whatsapp.ptv.PushToVideoRecordingCountdown.A02(r4, r2)
        L_0x02ee:
            X.1FU r2 = r0.A0V
            X.1KB r1 = r0.A0W
            X.AnonymousClass74O.A0C(r2, r1, r8, r6, r5)
            java.lang.Runnable r0 = r0.A1D
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74G.A0A(X.206, boolean):void");
    }

    public void A0B(boolean z) {
        this.A0F = true;
        C130966kI r3 = this.A07;
        r3.A01.setVisibility(0);
        r3.A04.setVisibility(0);
        r3.A07.setVisibility(C72453Mb.A07(r3.A0A ? 1 : 0));
        r3.A05.setVisibility(0);
        this.A17.setVisibility(8);
        this.A16.setVisibility(0);
        AnonymousClass70F r2 = this.A0v;
        r2.A0A = z;
        r2.A08 = true;
        ImageView imageView = r2.A0O;
        if (imageView.isLaidOut()) {
            AnonymousClass70F.A00(r2);
        } else {
            AnonymousClass793.A00(imageView.getViewTreeObserver(), r2, 17);
        }
    }

    private void A00() {
        AnonymousClass1FU r1;
        int i;
        int i2 = this.A0N;
        boolean z = true;
        if (!(i2 == 1 || i2 == 2)) {
            z = false;
        }
        Drawable drawable = null;
        if (!z || !C72463Mc.A1O(this.A0w)) {
            r1 = this.A0V;
            i = 2131100006;
        } else {
            drawable = C40501uo.A00((Resources.Theme) null, AnonymousClass3MW.A05(this.A1A), 2131232874);
            r1 = this.A0V;
            i = 2131100007;
        }
        int A002 = C19740yt.A00(r1, i);
        MediaTimeDisplay mediaTimeDisplay = this.A0s;
        mediaTimeDisplay.setBackground(drawable);
        mediaTimeDisplay.setTextColor(A002);
    }

    public static void A01(AnonymousClass74G r9) {
        long A002;
        if (r9.A0M && r9.A0C) {
            r9.A0M = false;
            if (A08(r9)) {
                PushToVideoRecordingCountdown pushToVideoRecordingCountdown = r9.A0p;
                AnonymousClass7RB r5 = new AnonymousClass7RB((Object) r9, 6);
                Handler handler = pushToVideoRecordingCountdown.A08;
                handler.removeCallbacksAndMessages((Object) null);
                PushToVideoRecordingCountdown.A02(pushToVideoRecordingCountdown, 0);
                if (((AccessibilityManager) pushToVideoRecordingCountdown.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                    A002 = 1000;
                } else {
                    A002 = (long) C18020vd.A00(C18040vf.A02, pushToVideoRecordingCountdown.getAbProps(), 5412);
                }
                PushToVideoRecordingCountdown.A02(pushToVideoRecordingCountdown, 3);
                handler.postDelayed(new AnonymousClass3C3(r5, pushToVideoRecordingCountdown, 17, A002), A002);
                return;
            }
            A05(r9);
        }
    }

    public static void A02(AnonymousClass74G r3) {
        if (C108995ce.A1U(r3.A05.A01)) {
            r3.A05.A01(false, true);
        }
        if (!r3.A0G) {
            r3.A0G = true;
            r3.A04.BkL();
        }
    }

    public static void A03(AnonymousClass74G r3) {
        r3.A04.pause();
        LiteCameraView liteCameraView = r3.A04;
        C200710s r32 = liteCameraView.A0V;
        EDL edl = liteCameraView.A0R;
        edl.getClass();
        r32.execute(new AnonymousClass7R9((Object) edl, 29));
    }

    public static void A04(AnonymousClass74G r16) {
        File file;
        AnonymousClass74G r2 = r16;
        if (r2.A0I && (file = r2.A0A) != null) {
            C130906kC r1 = r2.A09;
            AnonymousClass190 r5 = r1.A02;
            C18030ve r9 = r1.A06;
            AnonymousClass1KB r6 = r1.A03;
            AnonymousClass11C r7 = r1.A04;
            FrameLayout frameLayout = r1.A01;
            AnonymousClass70X A042 = AnonymousClass70X.A04(frameLayout.getContext(), r5, r6, r7, r1.A05, r9, r1.A07, r1.A0A, (C135056ra) null, file, false, true, false);
            r1.A00 = A042;
            View A092 = A042.A09();
            frameLayout.addView(A092, new FrameLayout.LayoutParams(-1, -1, 17));
            A092.setClickable(true);
            r1.A09.A04(0);
            AnonymousClass3Ma.A1A(A092, A042, 19);
            A042.A08 = new C146067Nr(1);
            A042.A0T(new C146137Ny(A042, r1, 2));
            MediaProgressRing mediaProgressRing = r2.A0q;
            AnonymousClass1FU r3 = r2.A0V;
            mediaProgressRing.A02(r3, new C145377La(r2, 3));
            r2.A0s.A03(r3, new C145387Lb(r2, 2));
        }
    }

    public static void A05(AnonymousClass74G r5) {
        Integer num;
        if (!r5.A0Z.A01()) {
            r5.A1C.A02("PTVRecording", "Resume");
            r5.A0A = C1403270y.A00(r5.A19, r5.A0o, C26551So.A0q, ".mp4", 1);
            r5.A0I = true;
            r5.A08.A01.setKeepScreenOn(true);
            r5.A04.COO(r5.A0A, 360);
            AnonymousClass3MY.A1L(r5.A0w, true);
            r5.A00();
            AnonymousClass4a5.A03(r5.A0e);
            C136246tV r1 = r5.A0u;
            if (r5.A04.Beu()) {
                num = AnonymousClass00R.A01;
            } else {
                num = AnonymousClass00R.A00;
            }
            r1.A04 = num;
            return;
        }
        r5.A0V.BhQ(2131890022);
        r5.A0a.BnQ();
    }

    public static boolean A08(AnonymousClass74G r3) {
        Boolean bool = r3.A0J;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass000.A1R(C18020vd.A00(C18040vf.A02, r3.A0j, 5412)));
            r3.A0J = bool;
        }
        return bool.booleanValue();
    }

    public static boolean A09(AnonymousClass74G r6) {
        if (!r6.A0I || System.currentTimeMillis() - r6.A02 < 1000) {
            return false;
        }
        return true;
    }

    public static void A06(AnonymousClass74G r4, Integer num, boolean z) {
        num.intValue();
        if (r4.A0D && !r4.A0K) {
            r4.A0K = true;
            C84094Hv.A00(r4.A0e);
            A07(r4, new C146517Pk(r4, num, 12));
            AnonymousClass1FU r1 = r4.A0V;
            r1.setRequestedOrientation(-1);
            C003401n supportActionBar = r1.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0I();
            }
            r4.A0L = true;
            r4.A0P.setVisibility(0);
            r4.A14.setVisibility(0);
            C130906kC r2 = r4.A09;
            AnonymousClass70X r0 = r2.A00;
            if (r0 != null) {
                r0.A0F();
            }
            AnonymousClass70X r12 = r2.A00;
            if (r12 != null) {
                r12.A0T((AnonymousClass88S) null);
            }
            r2.A00 = null;
            r2.A01.removeAllViews();
            r2.A09.A04(8);
            AnonymousClass70F r22 = r4.A0v;
            r22.A0G.removeCallbacks(r22.A0T);
            r22.A02();
            r22.A04(z);
            r4.A0Q.setVisibility(8);
            AnonymousClass4aY r23 = (AnonymousClass4aY) ((AnonymousClass7DX) r4.A0a).A01;
            AnonymousClass4aY.A1i(r23, true);
            r4.A11.unregisterObserver(r4.A10);
            Runnable runnable = r4.A0B;
            if (runnable != null) {
                runnable.run();
            }
            r4.A0q.A01();
            Runnable runnable2 = r4.A0s.A04;
            if (runnable2 != null) {
                runnable2.run();
            }
            Runnable runnable3 = r4.A0t.A04;
            if (runnable3 != null) {
                runnable3.run();
            }
            Runnable runnable4 = r4.A0r.A04;
            if (runnable4 != null) {
                runnable4.run();
            }
            r4.A0M = false;
            r23.A42 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A0j, 6885) == false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass74G r7, java.lang.Runnable r8) {
        /*
            boolean r0 = A08(r7)
            if (r0 == 0) goto L_0x0016
            com.whatsapp.ptv.PushToVideoRecordingCountdown r2 = r7.A0p
            android.os.Handler r1 = r2.A08
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            r0 = 0
            com.whatsapp.ptv.PushToVideoRecordingCountdown.A02(r2, r0)
            r0 = 0
            r2.A01 = r0
        L_0x0016:
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x00bd
            X.6ek r0 = r7.A08
            r3 = 0
            android.view.View r0 = r0.A01
            r0.setKeepScreenOn(r3)
            X.6ek r0 = r7.A08
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x0040
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0040
            X.0ve r2 = r7.A0j
            r1 = 6885(0x1ae5, float:9.648E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r6 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x00d3
            if (r6 == 0) goto L_0x00ce
            r0 = 14
            X.7Pk r5 = new X.7Pk
            r5.<init>(r7, r8, r0)
            X.1KB r4 = r7.A0W
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.A0K(r5, r0)
            boolean r0 = A09(r7)
            if (r0 == 0) goto L_0x00c1
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r7.A04
            r0 = 29
            X.3C5 r1 = new X.3C5
            r1.<init>(r7, r5, r8, r0)
            r0 = 0
            r2.COa(r1, r0)
        L_0x0068:
            r0 = 1
            r7.A0H = r0
            X.1vp r0 = r7.A0w
            X.AnonymousClass3MY.A1L(r0, r3)
            X.1FU r4 = r7.A0V
            android.view.Window r2 = r4.getWindow()
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.screenBrightness = r0
            r2.setAttributes(r1)
            X.6kI r5 = r7.A07
            android.view.View r0 = r5.A04
            r2 = 4
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r1 = r5.A07
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0091
            r2 = 8
        L_0x0091:
            r1.setVisibility(r2)
            int r0 = r5.A00
            if (r0 != 0) goto L_0x009d
            android.view.View r0 = r5.A02
            r0.setVisibility(r3)
        L_0x009d:
            r7.A00()
            android.view.View r2 = r7.A16
            int r1 = r7.A0N
            r0 = 1
            if (r1 == r0) goto L_0x00ab
            r0 = 2
            if (r1 == r0) goto L_0x00ab
            r3 = 4
        L_0x00ab:
            r2.setVisibility(r3)
            X.19r r2 = r7.A1C
            java.lang.String r1 = "PTVRecording"
            java.lang.String r0 = "End"
            r2.A02(r1, r0)
            r0 = -1
            r4.setRequestedOrientation(r0)
            if (r6 != 0) goto L_0x00c0
        L_0x00bd:
            r8.run()
        L_0x00c0:
            return
        L_0x00c1:
            r0 = 27
            X.3C5 r2 = new X.3C5
            r2.<init>(r7, r5, r8, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.A0K(r2, r0)
            goto L_0x0068
        L_0x00ce:
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r7.A04
            r0.COZ()
        L_0x00d3:
            A03(r7)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74G.A07(X.74G, java.lang.Runnable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r3 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getAction()
            r2 = 0
            if (r3 == 0) goto L_0x002b
            r1 = 1
            if (r3 == r1) goto L_0x0021
            r0 = 2
            if (r3 == r0) goto L_0x0011
            r0 = 3
            if (r3 == r0) goto L_0x0021
        L_0x0010:
            return r2
        L_0x0011:
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x0010
            X.70F r1 = r4.A0v
            android.view.View r0 = r4.A15
            int r0 = r0.getWidth()
            r1.A03(r5, r0, r2)
            return r2
        L_0x0021:
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x0010
            X.70F r0 = r4.A0v
            r0.A05(r1, r2, r2)
            return r2
        L_0x002b:
            X.70F r1 = r4.A0v
            float r0 = r5.getX()
            r1.A00 = r0
            float r0 = r5.getY()
            r1.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74G.A0C(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x018f, code lost:
        if (r2 == 2) goto L_0x0191;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass74G(android.view.View r34, android.view.View r35, android.view.View r36, android.view.ViewGroup r37, X.AnonymousClass3TF r38, X.AnonymousClass190 r39, X.AnonymousClass6ZO r40, X.AnonymousClass6ZP r41, X.AnonymousClass1T1 r42, X.AnonymousClass1FU r43, X.C218617r r44, X.AnonymousClass1KB r45, X.C34531kd r46, X.CX1 r47, X.AnonymousClass1HS r48, X.C1606289h r49, X.CX2 r50, X.AnonymousClass1NM r51, X.AnonymousClass11C r52, X.AnonymousClass11P r53, X.AnonymousClass118 r54, X.C219217x r55, X.C19830z4 r56, X.C18000vb r57, X.AnonymousClass11Z r58, X.C223819r r59, X.C18030ve r60, X.AnonymousClass18K r61, com.whatsapp.media.WamediaManager r62, X.C18010vc r63, X.AnonymousClass206 r64, X.AnonymousClass10I r65, X.AnonymousClass1VT r66, java.lang.Runnable r67, java.util.List r68, int r69) {
        /*
            r33 = this;
            r1 = r33
            r1.<init>()
            r6 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            X.1vp r0 = X.AnonymousClass3MW.A0n(r2)
            r1.A0w = r0
            X.1vp r0 = X.AnonymousClass3MW.A0n(r2)
            r1.A0y = r0
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.1vp r2 = X.AnonymousClass3MW.A0n(r2)
            r1.A0x = r2
            r2 = 0
            r1.A01 = r2
            r2 = -1
            r1.A02 = r2
            r1.A00 = r6
            r1.A0F = r6
            r1.A0K = r6
            r1.A0E = r6
            r4 = 10
            r3 = 1000(0x3e8, float:1.401E-42)
            X.0vt r2 = new X.0vt
            r2.<init>(r0, r4, r3, r6)
            r1.A0n = r2
            r4 = 100
            r3 = 10000(0x2710, float:1.4013E-41)
            X.0vt r2 = new X.0vt
            r2.<init>(r0, r4, r3, r6)
            r1.A0m = r2
            r11 = 2
            X.7OI r2 = new X.7OI
            r2.<init>(r1, r11)
            r1.A10 = r2
            r3 = 4
            X.7Em r2 = new X.7Em
            r2.<init>(r1, r3)
            r1.A0c = r2
            r2 = r59
            r1.A1C = r2
            r2 = r42
            r1.A0U = r2
            r9 = r54
            r1.A1A = r9
            r10 = r53
            r1.A0f = r10
            r3 = r60
            r1.A0j = r3
            r2 = r45
            r1.A0W = r2
            r2 = r39
            r1.A0R = r2
            r2 = r46
            r1.A0X = r2
            r2 = r65
            r1.A0z = r2
            r2 = r61
            r1.A0k = r2
            r2 = r44
            r1.A19 = r2
            r2 = r58
            r1.A0i = r2
            r2 = r66
            r1.A11 = r2
            r2 = r48
            r1.A0Z = r2
            r2 = r52
            r1.A0e = r2
            r2 = r62
            r1.A0l = r2
            r7 = r57
            r1.A0h = r7
            r2 = r51
            r1.A0d = r2
            r8 = r56
            r1.A0g = r8
            r2 = r55
            r1.A1B = r2
            r2 = r63
            r1.A0o = r2
            r2 = r50
            r1.A0b = r2
            r2 = r47
            r1.A0Y = r2
            r2 = r40
            r1.A0S = r2
            r2 = r41
            r1.A0T = r2
            r2 = r49
            r1.A0a = r2
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            X.4VJ r2 = X.C87414Vm.A00(r3, r2)
            X.0vl r2 = r2.A04
            long r4 = X.C72453Mb.A0K(r2)
            r1.A0O = r4
            r14 = r43
            r1.A0V = r14
            r2 = r68
            r1.A12 = r2
            r2 = r34
            r1.A0P = r2
            r2 = r35
            r1.A15 = r2
            r2 = r36
            r1.A14 = r2
            r2 = r69
            r1.A0N = r2
            r4 = r38
            r1.A18 = r4
            r4 = r67
            r1.A1D = r4
            r5 = r37
            r1.A0Q = r5
            X.6tV r4 = new X.6tV
            r4.<init>()
            r1.A0u = r4
            r4 = 2131434414(0x7f0b1bae, float:1.8490641E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r5, r4)
            com.whatsapp.pushtorecordmedia.MediaProgressRing r4 = (com.whatsapp.pushtorecordmedia.MediaProgressRing) r4
            r1.A0q = r4
            r4 = 2131434416(0x7f0b1bb0, float:1.8490645E38)
            android.view.View r5 = r1.A0Q
            android.view.View r12 = X.AnonymousClass1HF.A06(r5, r4)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r12 = (com.whatsapp.pushtorecordmedia.MediaTimeDisplay) r12
            r13 = 8
            r12.setVisibility(r13)
            r4 = 2131428789(0x7f0b05b5, float:1.8479232E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r5, r4)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r5 = (com.whatsapp.pushtorecordmedia.MediaTimeDisplay) r5
            int r4 = r1.A0N
            if (r4 == r0) goto L_0x021e
            if (r4 == r11) goto L_0x021e
            r5.setVisibility(r13)
        L_0x0125:
            r1.A0s = r12
            r12.setVisibility(r6)
            r4 = 2131434417(0x7f0b1bb1, float:1.8490647E38)
            android.view.View r5 = r1.A0Q
            android.view.View r12 = X.AnonymousClass1HF.A06(r5, r4)
            r12.setVisibility(r13)
            r4 = 2131428790(0x7f0b05b6, float:1.8479234E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r5, r4)
            r5.setVisibility(r13)
            int r4 = r1.A0N
            if (r4 == r0) goto L_0x021b
            if (r4 == r11) goto L_0x021b
        L_0x0146:
            r1.A16 = r12
            r12.setVisibility(r6)
            r5 = 2131434419(0x7f0b1bb3, float:1.8490651E38)
            android.view.View r4 = r1.A0Q
            android.view.View r4 = X.AnonymousClass1HF.A06(r4, r5)
            r1.A17 = r4
            r5 = 2131434418(0x7f0b1bb2, float:1.849065E38)
            android.view.View r4 = r1.A0Q
            android.view.View r4 = X.AnonymousClass1HF.A06(r4, r5)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r4 = (com.whatsapp.pushtorecordmedia.MediaTimeDisplay) r4
            r1.A0t = r4
            r4 = r64
            r1.A06 = r4
            r5 = 2131434411(0x7f0b1bab, float:1.8490635E38)
            android.view.View r4 = r1.A0Q
            android.view.View r4 = X.AnonymousClass1HF.A06(r4, r5)
            com.whatsapp.ptv.PushToVideoRecordingCountdown r4 = (com.whatsapp.ptv.PushToVideoRecordingCountdown) r4
            r1.A0p = r4
            r5 = 2131433897(0x7f0b19a9, float:1.8489593E38)
            android.view.View r4 = r1.A0Q
            android.view.View r4 = X.AnonymousClass1HF.A06(r4, r5)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r4 = (com.whatsapp.pushtorecordmedia.MediaTimeDisplay) r4
            r1.A0r = r4
            r5 = 2131436881(0x7f0b2551, float:1.8495645E38)
            android.view.View r4 = r1.A0Q
            android.widget.ImageView r6 = X.AnonymousClass3MW.A0G(r4, r5)
            if (r2 == r0) goto L_0x0191
            r4 = 2131232401(0x7f080691, float:1.808091E38)
            if (r2 != r11) goto L_0x0194
        L_0x0191:
            r4 = 2131231203(0x7f0801e3, float:1.807848E38)
        L_0x0194:
            r6.setImageResource(r4)
            r5 = 2131436899(0x7f0b2563, float:1.8495681E38)
            android.view.View r4 = r1.A0Q
            android.view.ViewGroup r22 = X.AnonymousClass3MW.A0C(r4, r5)
            r5 = 2131436901(0x7f0b2565, float:1.8495685E38)
            android.view.View r4 = r1.A0Q
            android.widget.TextView r24 = X.AnonymousClass3MW.A0J(r4, r5)
            r5 = 2131436904(0x7f0b2568, float:1.8495692E38)
            android.view.View r4 = r1.A0Q
            android.view.View r15 = X.AnonymousClass1HF.A06(r4, r5)
            r5 = 2131436903(0x7f0b2567, float:1.849569E38)
            android.view.View r4 = r1.A0Q
            android.view.View r16 = X.AnonymousClass1HF.A06(r4, r5)
            r5 = 2131436902(0x7f0b2566, float:1.8495688E38)
            android.view.View r4 = r1.A0Q
            android.view.View r17 = X.AnonymousClass1HF.A06(r4, r5)
            r5 = 2131436865(0x7f0b2541, float:1.8495612E38)
            android.view.View r4 = r1.A0Q
            android.view.View r18 = X.AnonymousClass1HF.A06(r4, r5)
            r5 = 2131436864(0x7f0b2540, float:1.849561E38)
            android.view.View r4 = r1.A0Q
            android.view.View r19 = X.AnonymousClass1HF.A06(r4, r5)
            r5 = 2131436867(0x7f0b2543, float:1.8495617E38)
            android.view.View r4 = r1.A0Q
            android.view.View r20 = X.AnonymousClass1HF.A06(r4, r5)
            r5 = 2131436898(0x7f0b2562, float:1.849568E38)
            android.view.View r4 = r1.A0Q
            android.view.View r21 = X.AnonymousClass1HF.A06(r4, r5)
            android.content.res.Resources r5 = r14.getResources()
            r4 = 2131169225(0x7f070fc9, float:1.7952774E38)
            float r30 = r5.getDimension(r4)
            r4 = 0
            X.7Le r5 = new X.7Le
            r5.<init>(r1, r4)
            X.70F r13 = new X.70F
            r23 = r6
            r25 = r10
            r26 = r9
            r27 = r8
            r28 = r7
            r29 = r5
            r31 = r2
            r32 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.A0v = r13
            r2 = 9722(0x25fa, float:1.3623E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            r1.A13 = r0
            return
        L_0x021b:
            r12 = r5
            goto L_0x0146
        L_0x021e:
            r12 = r5
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74G.<init>(android.view.View, android.view.View, android.view.View, android.view.ViewGroup, X.3TF, X.190, X.6ZO, X.6ZP, X.1T1, X.1FU, X.17r, X.1KB, X.1kd, X.CX1, X.1HS, X.89h, X.CX2, X.1NM, X.11C, X.11P, X.118, X.17x, X.0z4, X.0vb, X.11Z, X.19r, X.0ve, X.18K, com.whatsapp.media.WamediaManager, X.0vc, X.206, X.10I, X.1VT, java.lang.Runnable, java.util.List, int):void");
    }
}
