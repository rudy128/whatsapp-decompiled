package X;

import android.app.Activity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3XP  reason: invalid class name */
public class AnonymousClass3XP extends C38391rD implements AnonymousClass5Z3 {
    public C74173Yu A00 = null;
    public List A01 = AnonymousClass000.A13();
    public List A02;
    public Map A03 = Collections.emptyMap();
    public boolean A04 = false;
    public final C25851Pw A05;
    public final AnonymousClass11P A06;
    public final List A07 = AnonymousClass000.A13();
    public final Activity A08;
    public final AnonymousClass1L9 A09;
    public final AnonymousClass1KB A0A;
    public final AnonymousClass4L4 A0B;
    public final C86404Rm A0C;
    public final C36531o3 A0D;
    public final AnonymousClass11C A0E;
    public final C18000vb A0F;
    public final COR A0G;
    public final AnonymousClass1RK A0H;
    public final AnonymousClass1U5 A0I;
    public final C18030ve A0J;
    public final AnonymousClass1HV A0K;
    public final AnonymousClass129 A0L;
    public final AnonymousClass10I A0M;

    public static void A01(Object obj, List list, int i) {
        list.add(new AnonymousClass4MG(obj, i));
    }

    public int A0Q() {
        return this.A02.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r12, int r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C74153Ys
            if (r0 == 0) goto L_0x001e
            X.3Ys r12 = (X.C74153Ys) r12
            X.0ve r2 = r12.A01
            r1 = 4757(0x1295, float:6.666E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            com.whatsapp.WaTextView r1 = r12.A00
            r0 = 2131891667(0x7f1215d3, float:1.941806E38)
            if (r2 == 0) goto L_0x001a
            r0 = 2131891681(0x7f1215e1, float:1.9418089E38)
        L_0x001a:
            r1.setText(r0)
        L_0x001d:
            return
        L_0x001e:
            boolean r0 = r12 instanceof X.C77483qA
            if (r0 == 0) goto L_0x006e
            X.3ZT r12 = (X.AnonymousClass3ZT) r12
            java.util.List r0 = r11.A02
            java.lang.Object r0 = r0.get(r13)
            X.4MG r0 = (X.AnonymousClass4MG) r0
            java.lang.Object r5 = r0.A00
            X.4O6 r5 = (X.AnonymousClass4O6) r5
            android.widget.ImageView r1 = r12.A01
            int r0 = r5.A00
            r1.setImageResource(r0)
            android.widget.TextView r9 = r12.A04
            X.0vb r8 = r12.A07
            long r3 = r5.A02
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r3
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0069
            r0 = 2131891651(0x7f1215c3, float:1.9418028E38)
            java.lang.String r0 = r8.A09(r0)
        L_0x004f:
            r9.setText(r0)
            android.widget.TextView r3 = r12.A03
            android.view.View r2 = r12.A0H
            android.content.Context r1 = r2.getContext()
            int r0 = r5.A01
            java.lang.CharSequence r0 = r1.getText(r0)
            r3.setText(r0)
            r0 = 21
            X.C90004dN.A00(r2, r12, r5, r0)
            return
        L_0x0069:
            java.lang.String r0 = X.C64052u8.A05(r8, r3)
            goto L_0x004f
        L_0x006e:
            boolean r0 = r12 instanceof X.AnonymousClass3ZT
            if (r0 == 0) goto L_0x014d
            java.util.List r0 = r11.A02
            java.lang.Object r0 = r0.get(r13)
            X.4MG r0 = (X.AnonymousClass4MG) r0
            java.lang.Object r5 = r0.A00
            X.3xV r5 = (X.C80623xV) r5
            X.3ZT r12 = (X.AnonymousClass3ZT) r12
            X.1RK r0 = r11.A0H
            com.whatsapp.jid.DeviceJid r1 = r5.A08
            java.util.Set r0 = r0.A0N
            boolean r8 = r0.contains(r1)
            android.view.View r4 = r12.A0H
            X.AnonymousClass3MW.A1Q(r4)
            android.widget.ImageView r1 = r12.A01
            int r0 = X.C87404Vl.A00(r5)
            r1.setImageResource(r0)
            android.widget.TextView r2 = r12.A03
            android.content.Context r1 = r2.getContext()
            X.0ve r0 = r12.A08
            java.lang.String r0 = X.C88344Zh.A01(r1, r5, r0)
            r2.setText(r0)
            long r1 = r5.A01
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1R(r0)
            if (r9 == 0) goto L_0x012a
            android.widget.TextView r1 = r12.A04
            r0 = 2131891663(0x7f1215cf, float:1.9418052E38)
        L_0x00b8:
            r1.setText(r0)
        L_0x00bb:
            boolean r8 = r5.A00
            android.widget.ImageView r6 = r12.A02
            android.widget.ImageView r10 = r12.A00
            X.11P r0 = r12.A06
            r7 = 8
            if (r9 == 0) goto L_0x00e4
            long r8 = X.AnonymousClass11P.A01(r0)
            long r0 = r5.A01
            long r8 = r8 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r0 = 8
            if (r1 <= 0) goto L_0x00d8
            r0 = 0
        L_0x00d8:
            r10.setVisibility(r0)
            r6.setVisibility(r7)
        L_0x00de:
            r0 = 22
            X.C90004dN.A00(r4, r12, r5, r0)
            return
        L_0x00e4:
            r10.setVisibility(r7)
            r0 = 500(0x1f4, double:2.47E-321)
            r3 = 0
            int r2 = r6.getVisibility()
            if (r8 == 0) goto L_0x010e
            if (r2 != r7) goto L_0x00de
            r6.clearAnimation()
            r6.setAlpha(r3)
            r2 = 0
            r6.setVisibility(r2)
            android.view.ViewPropertyAnimator r3 = r6.animate()
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
        L_0x010a:
            r0.start()
            goto L_0x00de
        L_0x010e:
            if (r2 != 0) goto L_0x00de
            r6.clearAnimation()
            android.view.ViewPropertyAnimator r2 = r6.animate()
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r1 = 6
            X.3Mo r0 = new X.3Mo
            r0.<init>(r6, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            goto L_0x010a
        L_0x012a:
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0134
            android.widget.TextView r1 = r12.A04
            r0 = 2131891683(0x7f1215e3, float:1.9418093E38)
            goto L_0x00b8
        L_0x0134:
            android.widget.TextView r3 = r12.A04
            X.0vb r2 = r12.A07
            long r0 = r5.A00
            if (r8 == 0) goto L_0x0148
            r0 = 2131891651(0x7f1215c3, float:1.9418028E38)
            java.lang.String r0 = r2.A09(r0)
        L_0x0143:
            r3.setText(r0)
            goto L_0x00bb
        L_0x0148:
            java.lang.String r0 = X.C64052u8.A05(r2, r0)
            goto L_0x0143
        L_0x014d:
            boolean r0 = r12 instanceof X.C74163Yt
            if (r0 == 0) goto L_0x015d
            X.3Yt r12 = (X.C74163Yt) r12
            X.4L4 r0 = r12.A01
            com.whatsapp.TextEmojiLabel r1 = r12.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r0 = r0.A00
            r0.A4b(r1)
            return
        L_0x015d:
            boolean r0 = r12 instanceof X.C74283Zf
            if (r0 == 0) goto L_0x001d
            X.3Zf r12 = (X.C74283Zf) r12
            java.util.List r3 = r11.A07
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            com.airbnb.lottie.LottieAnimationView r0 = r12.A00
            if (r0 == 0) goto L_0x0170
            r0.A04()
        L_0x0170:
            X.C74283Zf.A01(r12, r3)
            X.0ve r2 = r12.A04
            r1 = 8966(0x2306, float:1.2564E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001d
            android.view.View r1 = r12.A0H
            r0 = 2131432012(0x7f0b124c, float:1.848577E38)
            android.view.View r1 = X.C18070vi.A05(r1, r0)
            boolean r0 = r3.isEmpty()
            int r0 = X.C72453Mb.A01(r0)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XP.Bmc(X.1xT, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0142, code lost:
        r6 = new X.C42011xT(r1);
        r9 = (com.whatsapp.wds.components.banners.WDSBanner) r1.findViewById(2131428058);
        r9.setOnDismissListener((android.view.View.OnClickListener) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0153, code lost:
        if (r4 != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0155, code lost:
        r9.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0158, code lost:
        r1 = new X.AnonymousClass4XT();
        r1.A02 = X.AnonymousClass4A9.A00;
        X.AnonymousClass4XT.A00(r9, r1, X.AnonymousClass4W6.A00(r9.getContext(), r2));
        r9.setOnClickListener(new X.AFH(r8, r9, r10, r11, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0174, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0193, code lost:
        r6 = new X.C42011xT(r1);
        X.AnonymousClass1HF.A06(r1, 2131428826).setOnClickListener(r5);
        r7 = r1.getContext();
        X.C26302CxJ.A0K(r7, r2.A04(r3), r9, r10, X.AnonymousClass3MX.A0V(r1, 2131437014), r12, r13, X.C17880vN.A0q(r7, "learn-more", X.AnonymousClass3MW.A1a(), 0, r4), "learn-more");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01bf, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42011xT BqY(android.view.ViewGroup r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            switch(r19) {
                case 1: goto L_0x00d8;
                case 2: goto L_0x011d;
                case 3: goto L_0x0009;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0089;
                case 6: goto L_0x0070;
                case 7: goto L_0x0009;
                case 8: goto L_0x0057;
                case 9: goto L_0x003e;
                case 10: goto L_0x0019;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid viewType: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            android.app.Activity r6 = r0.A08
            X.1o3 r5 = r0.A0D
            java.util.List r2 = X.C42011xT.A0I
            r4 = 0
            X.C18070vi.A0j(r5, r1)
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r1)
            r2 = 2131625034(0x7f0e044a, float:1.8877265E38)
            android.view.View r3 = r3.inflate(r2, r1, r4)
            if (r3 != 0) goto L_0x0034
            r6 = 0
        L_0x0031:
            r0.A00 = r6
            return r6
        L_0x0034:
            java.lang.ref.WeakReference r2 = X.AnonymousClass3MW.A0z(r6)
            X.3Yu r6 = new X.3Yu
            r6.<init>(r3, r1, r5, r2)
            goto L_0x0031
        L_0x003e:
            X.4L4 r4 = r0.A0B
            java.util.List r0 = X.C42011xT.A0I
            boolean r3 = X.C18070vi.A15(r1, r4)
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r1)
            r0 = 2131625829(0x7f0e0765, float:1.8878877E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r1, r0, r3)
            X.3Yt r6 = new X.3Yt
            r6.<init>(r0, r4)
            return r6
        L_0x0057:
            X.11P r9 = r0.A06
            X.0ve r11 = r0.A0J
            X.0vb r10 = r0.A0F
            X.4L4 r8 = r0.A0B
            android.view.LayoutInflater r2 = X.AnonymousClass3MY.A0B(r1)
            r0 = 2131625826(0x7f0e0762, float:1.887887E38)
            android.view.View r7 = X.AnonymousClass3MX.A09(r2, r1, r0)
            X.3qA r6 = new X.3qA
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0070:
            X.11P r9 = r0.A06
            X.0ve r11 = r0.A0J
            X.0vb r10 = r0.A0F
            X.4L4 r8 = r0.A0B
            android.view.LayoutInflater r2 = X.AnonymousClass3MY.A0B(r1)
            r0 = 2131625826(0x7f0e0762, float:1.887887E38)
            android.view.View r7 = X.AnonymousClass3MX.A09(r2, r1, r0)
            X.3ZT r6 = new X.3ZT
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0089:
            X.0ve r4 = r0.A0J
            java.util.List r0 = X.C42011xT.A0I
            boolean r3 = X.C18070vi.A15(r1, r4)
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r1)
            r0 = 2131625086(0x7f0e047e, float:1.887737E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r2, r1, r0, r3)
            X.3Ys r6 = new X.3Ys
            r6.<init>(r0, r4)
            return r6
        L_0x00a2:
            X.0ve r13 = r0.A0J
            X.1KB r9 = r0.A0A
            X.10I r15 = r0.A0M
            X.1L9 r8 = r0.A09
            X.11C r12 = r0.A0E
            X.129 r14 = r0.A0L
            X.4Rm r11 = r0.A0C
            X.4L4 r10 = r0.A0B
            java.util.List r4 = r0.A07
            java.util.List r0 = X.C42011xT.A0I
            r3 = 0
            X.C18070vi.A0d(r1, r3)
            X.C18070vi.A0w(r13, r9, r15, r8, r12)
            X.C18070vi.A0q(r14, r11, r10)
            r0 = 9
            X.C18070vi.A0d(r4, r0)
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r1)
            r0 = 2131625834(0x7f0e076a, float:1.8878887E38)
            android.view.View r7 = X.AnonymousClass3MX.A0B(r2, r1, r0, r3)
            X.3Zf r6 = new X.3Zf
            r16 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        L_0x00d8:
            X.0ve r13 = r0.A0J
            boolean r2 = X.AnonymousClass1J8.A02(r13)
            if (r2 == 0) goto L_0x00fe
            X.1L9 r8 = r0.A09
            X.129 r10 = r0.A0L
            r2 = 0
            X.783 r3 = new X.783
            r3.<init>(r0, r2)
            boolean r4 = X.C22891Dp.A02
            android.view.LayoutInflater r2 = X.AnonymousClass3MY.A0B(r1)
            r0 = 2131624145(0x7f0e00d1, float:1.8875461E38)
            r12 = 0
            android.view.View r1 = r2.inflate(r0, r1, r12)
            r2 = 2131889399(0x7f120cf7, float:1.941346E38)
            java.lang.String r11 = "seeing-devices-out-of-sync"
            goto L_0x0142
        L_0x00fe:
            X.1KB r10 = r0.A0A
            X.1L9 r9 = r0.A09
            X.129 r2 = r0.A0L
            X.11C r12 = r0.A0E
            r4 = 0
            X.783 r5 = new X.783
            r5.<init>(r0, r4)
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r1)
            r0 = 2131624144(0x7f0e00d0, float:1.887546E38)
            android.view.View r1 = r3.inflate(r0, r1, r4)
            r4 = 2131889395(0x7f120cf3, float:1.9413452E38)
            java.lang.String r3 = "seeing-devices-out-of-sync"
            goto L_0x0193
        L_0x011d:
            X.0ve r13 = r0.A0J
            boolean r2 = X.AnonymousClass1J8.A02(r13)
            if (r2 == 0) goto L_0x0175
            X.1L9 r8 = r0.A09
            X.129 r10 = r0.A0L
            r2 = 1
            X.783 r3 = new X.783
            r3.<init>(r0, r2)
            boolean r4 = X.C22891Dp.A02
            android.view.LayoutInflater r2 = X.AnonymousClass3MY.A0B(r1)
            r0 = 2131624145(0x7f0e00d1, float:1.8875461E38)
            r12 = 0
            android.view.View r1 = r2.inflate(r0, r1, r12)
            r2 = 2131889400(0x7f120cf8, float:1.9413462E38)
            java.lang.String r11 = "seeing-devices-logged-out-unexpected-issue"
        L_0x0142:
            X.3Xh r6 = new X.3Xh
            r6.<init>(r1)
            r0 = 2131428058(0x7f0b02da, float:1.847775E38)
            android.view.View r9 = r1.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBanner r9 = (com.whatsapp.wds.components.banners.WDSBanner) r9
            r9.setOnDismissListener((android.view.View.OnClickListener) r3)
            if (r4 != 0) goto L_0x0158
            r9.A08()
        L_0x0158:
            X.4XT r1 = new X.4XT
            r1.<init>()
            X.4A9 r0 = X.AnonymousClass4A9.A00
            r1.A02 = r0
            android.content.Context r0 = r9.getContext()
            android.text.Spanned r0 = X.AnonymousClass4W6.A00(r0, r2)
            X.AnonymousClass4XT.A00(r9, r1, r0)
            X.AFH r7 = new X.AFH
            r7.<init>(r8, r9, r10, r11, r12)
            r9.setOnClickListener(r7)
            return r6
        L_0x0175:
            X.1KB r10 = r0.A0A
            X.1L9 r9 = r0.A09
            X.129 r2 = r0.A0L
            X.11C r12 = r0.A0E
            r3 = 1
            X.783 r5 = new X.783
            r5.<init>(r0, r3)
            android.view.LayoutInflater r3 = X.AnonymousClass3MY.A0B(r1)
            r0 = 2131624144(0x7f0e00d0, float:1.887546E38)
            android.view.View r1 = X.AnonymousClass3MX.A09(r3, r1, r0)
            r4 = 2131889398(0x7f120cf6, float:1.9413458E38)
            java.lang.String r3 = "seeing-devices-logged-out-unexpected-issue"
        L_0x0193:
            X.3Xh r6 = new X.3Xh
            r6.<init>(r1)
            r0 = 2131428826(0x7f0b05da, float:1.8479307E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r0.setOnClickListener(r5)
            android.content.Context r7 = r1.getContext()
            r0 = 2131437014(0x7f0b25d6, float:1.8495915E38)
            com.whatsapp.TextEmojiLabel r11 = X.AnonymousClass3MX.A0V(r1, r0)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 0
            java.lang.String r15 = "learn-more"
            java.lang.String r14 = X.C17880vN.A0q(r7, r15, r1, r0, r4)
            android.net.Uri r8 = r2.A04(r3)
            X.C26302CxJ.A0K(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XP.BqY(android.view.ViewGroup, int):X.1xT");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r1 == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQe(java.util.Map r8) {
        /*
            r7 = this;
            r7.A03 = r8
            java.util.List r0 = r7.A07
            java.util.Iterator r6 = r0.iterator()
        L_0x0008:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r5 = r6.next()
            X.3xV r5 = (X.C80623xV) r5
            long r3 = r5.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 != 0) goto L_0x0008
            com.whatsapp.jid.DeviceJid r0 = r5.A08
            java.lang.Object r0 = r8.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0031
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r5.A00 = r0
            goto L_0x0008
        L_0x0035:
            r7.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XP.CQe(java.util.Map):void");
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass4MG) this.A02.get(i)).A01;
    }

    public AnonymousClass3XP(Activity activity, AnonymousClass1L9 r3, AnonymousClass1KB r4, AnonymousClass4L4 r5, C86404Rm r6, C25851Pw r7, C36531o3 r8, AnonymousClass11C r9, AnonymousClass11P r10, C18000vb r11, COR cor, AnonymousClass1RK r13, AnonymousClass1U5 r14, C18030ve r15, AnonymousClass1HV r16, AnonymousClass129 r17, AnonymousClass10I r18) {
        this.A0B = r5;
        this.A06 = r10;
        this.A0J = r15;
        this.A0A = r4;
        this.A0M = r18;
        this.A09 = r3;
        this.A0L = r17;
        this.A0E = r9;
        this.A0F = r11;
        this.A0K = r16;
        this.A0C = r6;
        this.A0I = r14;
        this.A0D = r8;
        this.A0H = r13;
        this.A05 = r7;
        this.A0G = cor;
        this.A08 = activity;
        A00(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097 A[LOOP:0: B:21:0x0091->B:23:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[LOOP:1: B:36:0x00e9->B:38:0x00ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass3XP r13) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r13.A02 = r0
            X.4Rm r0 = r13.A0C
            boolean r0 = r0.A01()
            r5 = 0
            if (r0 == 0) goto L_0x001c
            android.app.Activity r0 = r13.A08
            boolean r0 = r0 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x001c
            java.util.List r1 = r13.A02
            r0 = 10
            A01(r5, r1, r0)
        L_0x001c:
            java.util.List r4 = r13.A07
            boolean r0 = r4.isEmpty()
            r10 = 1
            if (r0 != 0) goto L_0x00a2
            X.11P r3 = r13.A06
            long r0 = r3.A02
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0036
            long r6 = r3.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 + r0
        L_0x0036:
            long r1 = r3.A05()
            long r8 = r6 - r1
            long r11 = java.lang.Math.abs(r8)
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LinkedDevicesAdapter/shouldShowAdvWarningBanner ntpTs="
            r3.append(r0)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r3.append(r6)
            java.lang.String r0 = "; waServerTs="
            r3.append(r0)
            long r1 = r1 / r8
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x00a2
            java.util.List r0 = r13.A02
            A01(r5, r0, r10)
        L_0x006f:
            java.util.List r2 = r13.A02
            java.lang.Object r1 = X.C17880vN.A0p()
            r0 = 4
            A01(r1, r2, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0087
            java.util.List r0 = r13.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008d
        L_0x0087:
            java.util.List r1 = r13.A02
            r0 = 5
            A01(r5, r1, r0)
        L_0x008d:
            java.util.Iterator r3 = r4.iterator()
        L_0x0091:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r13.A02
            r0 = 6
            A01(r2, r1, r0)
            goto L_0x0091
        L_0x00a2:
            X.1HV r0 = r13.A0K
            X.0z4 r0 = r0.A01
            boolean r0 = r0.A2S()
            if (r0 == 0) goto L_0x006f
            X.0ve r2 = r13.A0J
            r1 = 1037(0x40d, float:1.453E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x006f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x006f
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x006f
            X.11P r0 = r13.A06
            long r6 = X.AnonymousClass11P.A01(r0)
            X.1Pw r0 = r13.A05
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r0)
            java.lang.String r0 = "syncd_last_fatal_error_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r6 = r6 - r0
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            java.util.List r1 = r13.A02
            r0 = 2
            A01(r5, r1, r0)
            goto L_0x006f
        L_0x00e3:
            java.util.List r0 = r13.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x00e9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r13.A02
            r0 = 8
            A01(r2, r1, r0)
            goto L_0x00e9
        L_0x00fb:
            X.0ve r2 = r13.A0J
            r1 = 8966(0x2306, float:1.2564E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x010d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0117
        L_0x010d:
            java.util.List r1 = r13.A02
            r0 = 9
            A01(r5, r1, r0)
            r4.isEmpty()
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XP.A00(X.3XP):void");
    }
}
