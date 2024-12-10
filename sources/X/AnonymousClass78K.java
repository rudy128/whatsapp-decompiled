package X;

import android.view.View;

/* renamed from: X.78K  reason: invalid class name */
public class AnonymousClass78K implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass78K(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass78K(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ca, code lost:
        r1.A0h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = r1.A03;
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04cf, code lost:
        if (r1 != true) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06ac, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06ba, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06e0, code lost:
        r0 = "mediaSharingUserJourneyLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06e3, code lost:
        r0 = "penDialogController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06e8, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06ec, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x071f, code lost:
        r2 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0722, code lost:
        if (r2 == 0) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0724, code lost:
        if (r2 == 1) goto L_0x072a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0727, code lost:
        if (r2 == 2) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0729, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x072a, code lost:
        r3.setLocationMode(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x072e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x072f, code lost:
        r3.setLocationMode(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0732, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0765, code lost:
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0768, code lost:
        if (r2 == 0) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x076a, code lost:
        if (r2 == 1) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x076d, code lost:
        if (r2 == 2) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x076f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0770, code lost:
        r3.setLocationMode(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0774, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0775, code lost:
        r3.setLocationMode(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0778, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0195, code lost:
        r1 = r1.A00;
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019b, code lost:
        r1.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x06b0;
                case 1: goto L_0x06a2;
                case 2: goto L_0x0697;
                case 3: goto L_0x068c;
                case 4: goto L_0x0683;
                case 5: goto L_0x075a;
                case 6: goto L_0x0714;
                case 7: goto L_0x064a;
                case 8: goto L_0x02ce;
                case 9: goto L_0x028f;
                case 10: goto L_0x0273;
                case 11: goto L_0x023a;
                case 12: goto L_0x0640;
                case 13: goto L_0x0638;
                case 14: goto L_0x062f;
                case 15: goto L_0x0627;
                case 16: goto L_0x022e;
                case 17: goto L_0x0558;
                case 18: goto L_0x01e4;
                case 19: goto L_0x04f5;
                case 20: goto L_0x04ed;
                case 21: goto L_0x04b6;
                case 22: goto L_0x04ae;
                case 23: goto L_0x020f;
                case 24: goto L_0x030b;
                case 25: goto L_0x019f;
                case 26: goto L_0x0182;
                case 27: goto L_0x005e;
                case 28: goto L_0x004f;
                case 29: goto L_0x0047;
                case 30: goto L_0x04a6;
                case 31: goto L_0x03d5;
                case 32: goto L_0x03cd;
                case 33: goto L_0x03c5;
                case 34: goto L_0x03bd;
                case 35: goto L_0x03b5;
                case 36: goto L_0x03ad;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x013a;
                case 40: goto L_0x00c2;
                case 41: goto L_0x007f;
                case 42: goto L_0x038e;
                case 43: goto L_0x0382;
                case 44: goto L_0x0073;
                case 45: goto L_0x0067;
                case 46: goto L_0x0365;
                case 47: goto L_0x035d;
                case 48: goto L_0x0350;
                case 49: goto L_0x034a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A01
            X.6uj r3 = (X.C136986uj) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            X.A4v r4 = r3.A0J
            X.7JS r0 = r3.A0G
            int r1 = r0.A06()
            r0 = 12
            X.C72463Mc.A1F(r4, r0, r1)
            boolean r0 = r3.A0C()
            if (r0 != 0) goto L_0x0046
            X.6ud r0 = r3.A04
            if (r0 == 0) goto L_0x02ea
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A00
            X.7JF r0 = r0.A0J
            if (r0 == 0) goto L_0x02ea
            X.0vq r0 = r0.A0a
            java.lang.Object r0 = r0.get()
            X.72m r0 = (X.AnonymousClass72m) r0
            X.5iA r0 = r0.A0N
            X.1vp r0 = r0.A00
            boolean r1 = X.C72463Mc.A1O(r0)
            r0 = 1
            if (r1 != r0) goto L_0x02ea
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r0)
            r0.onBackPressed()
        L_0x0046:
            return
        L_0x0047:
            java.lang.Object r0 = r10.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            X.5iA r1 = r0.A0C
            r0 = 1
            goto L_0x0056
        L_0x004f:
            java.lang.Object r0 = r10.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            X.5iA r1 = r0.A0C
            r0 = 0
        L_0x0056:
            X.1vp r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x019b
        L_0x005e:
            java.lang.Object r0 = r10.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            X.5iA r1 = r0.A0C
            r0 = 1
            goto L_0x0195
        L_0x0067:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = (com.whatsapp.mediacomposer.ui.caption.CaptionView) r0
            X.5bp r0 = r0.A03
            if (r0 == 0) goto L_0x0046
            r0.C6h()
            return
        L_0x0073:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = (com.whatsapp.mediacomposer.ui.caption.CaptionView) r0
            X.5bp r0 = r0.A03
            if (r0 == 0) goto L_0x0046
            r0.CAB()
            return
        L_0x007f:
            java.lang.Object r4 = r10.A01
            X.6uj r4 = (X.C136986uj) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x0046
            android.animation.ValueAnimator r0 = r4.A0D
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0046
            X.A4v r3 = r4.A0J
            X.7JS r2 = r4.A0G
            int r1 = r2.A06()
            r0 = 56
            X.C72463Mc.A1F(r3, r0, r1)
            int r1 = r2.A09()
            r0 = 3
            if (r1 != r0) goto L_0x00ae
            r0 = 0
        L_0x00ae:
            r2.A0E(r0)
            X.7JF r1 = r4.A05
            if (r1 == 0) goto L_0x0046
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0P
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0046
            r0 = 0
            X.AnonymousClass7JF.A07(r1, r0)
            return
        L_0x00c2:
            java.lang.Object r4 = r10.A01
            X.6uj r4 = (X.C136986uj) r4
            r5 = 0
            X.C18070vi.A0d(r4, r5)
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x0046
            X.7JF r0 = r4.A05
            if (r0 == 0) goto L_0x0046
            android.animation.ValueAnimator r0 = r4.A0D
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0046
            X.A4v r3 = r4.A0J
            X.7JS r2 = r4.A0G
            int r1 = r2.A06()
            r0 = 14
            X.C72463Mc.A1F(r3, r0, r1)
            r2.A0E(r5)
            X.7JF r4 = r4.A05
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r4.A0P
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0046
            X.70N r0 = r4.A0V
            java.util.List r0 = r0.A04
            java.util.List r0 = X.C108995ce.A0d(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            r3 = 0
            if (r0 == 0) goto L_0x06be
            X.6sm r0 = r4.A0N
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x06be
            android.view.View r0 = r4.A09
            android.content.Context r0 = X.AnonymousClass3MY.A04(r0)
            X.3Ri r2 = X.C73193Ri.A00(r0)
            r0 = 2131895116(0x7f12234c, float:1.9425056E38)
            r2.A0V(r0)
            r0 = 2131895115(0x7f12234b, float:1.9425054E38)
            r2.A0U(r0)
            r1 = 2131887451(0x7f12055b, float:1.940951E38)
            X.758 r0 = new X.758
            r0.<init>(r4, r5)
            r2.A0X(r0, r1)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r2.A0W(r3, r0)
            X.AnonymousClass3MY.A1G(r2)
            return
        L_0x013a:
            java.lang.Object r6 = r10.A01
            X.6uj r6 = (X.C136986uj) r6
            r5 = 0
            X.C18070vi.A0d(r6, r5)
            boolean r0 = r6.A0C()
            if (r0 != 0) goto L_0x0046
            android.animation.ValueAnimator r0 = r6.A0D
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0046
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0046
            X.A4v r4 = r6.A0J
            X.7JS r3 = r6.A0G
            int r2 = r3.A06()
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r4.A02(r0, r1, r2)
            int r0 = r3.A09()
            if (r0 != r1) goto L_0x0177
            r3.A0E(r5)
            X.7JF r0 = r6.A05
            if (r0 == 0) goto L_0x0046
            r0.A0A()
            return
        L_0x0177:
            r3.A0E(r1)
            X.7JF r0 = r6.A05
            if (r0 == 0) goto L_0x0046
            r0.A09()
            return
        L_0x0182:
            java.lang.Object r0 = r10.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            X.5iA r1 = r0.A0C
            X.1vp r0 = r1.A02
            java.lang.String r0 = X.C108945cZ.A1F(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
            r0 = 0
        L_0x0195:
            X.1vp r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x019b:
            r1.A0F(r0)
            return
        L_0x019f:
            java.lang.Object r8 = r10.A01
            X.5mm r8 = (X.C113245mm) r8
            X.8B0 r0 = r8.A00
            if (r0 == 0) goto L_0x0046
            X.5lP r9 = r8.A02
            X.72m r7 = r9.A05
            X.10I r6 = r7.A0Y
            X.67s r0 = r7.A0F
            X.6LW r2 = new X.6LW
            r2.<init>(r0, r9)
            r5 = 1
            X.8B0[] r1 = new X.AnonymousClass8B0[r5]
            X.8B0 r0 = r8.A00
            r4 = 0
            r1[r4] = r0
            r6.CGD(r2, r1)
            X.87S r3 = r7.A0H
            r0 = r3
            X.7JF r0 = (X.AnonymousClass7JF) r0
            X.AnonymousClass7JF.A00(r0)
            X.8B0 r2 = r8.A00
            boolean r0 = r2.CFb()
            if (r0 == 0) goto L_0x06c2
            X.0vb r1 = r7.A0B
            android.content.Context r0 = r11.getContext()
            X.6Lc r2 = new X.6Lc
            r2.<init>(r0, r1, r9)
            X.8B0[] r1 = new X.AnonymousClass8B0[r5]
            X.8B0 r0 = r8.A00
            r1[r4] = r0
            r6.CGM(r2, r1)
            return
        L_0x01e4:
            java.lang.Object r4 = r10.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            boolean r0 = r4.A0g
            if (r0 != 0) goto L_0x0046
            X.00H r0 = r4.A0Z
            if (r0 == 0) goto L_0x06e0
            java.lang.Object r3 = r0.get()
            X.A4v r3 = (X.C20050A4v) r3
            r0 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r0 = 11
            r3.A02(r2, r1, r0)
            boolean r0 = r4.A0e
            r0 = r0 ^ 1
            r4.A0e = r0
            com.whatsapp.mediacomposer.VideoComposerFragment.A0D(r4)
            com.whatsapp.mediacomposer.VideoComposerFragment.A0D(r4)
            return
        L_0x020f:
            java.lang.Object r3 = r10.A01
            X.5cz r3 = (X.C109205cz) r3
            X.6z9 r0 = r3.A08
            if (r0 == 0) goto L_0x06e3
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0046
            X.A4v r2 = r3.A0M
            X.6uj r0 = r3.A0K
            X.7JS r0 = r0.A0G
            int r1 = r0.A06()
            r0 = 15
            X.C72463Mc.A1F(r2, r0, r1)
            r3.dismiss()
            return
        L_0x022e:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.740 r0 = r0.A05
            if (r0 == 0) goto L_0x0046
            X.AnonymousClass740.A05(r0)
            return
        L_0x023a:
            java.lang.Object r3 = r10.A01
            com.whatsapp.location.LocationPicker2 r3 = (com.whatsapp.location.LocationPicker2) r3
            X.75M r1 = r3.A0V
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x06ed
            android.location.Location r0 = r1.A05
            if (r0 == 0) goto L_0x0046
            android.widget.ImageView r1 = r1.A0K
            r0 = 2131231147(0x7f0801ab, float:1.8078367E38)
            r1.setImageResource(r0)
            X.Ccm r6 = r3.A02
            if (r6 == 0) goto L_0x0270
            X.75M r0 = r3.A0V
            android.location.Location r0 = r0.A05
            double r4 = r0.getLatitude()
            X.75M r0 = r3.A0V
            android.location.Location r0 = r0.A05
            double r1 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r4, r1)
            X.CLK r0 = X.C26080Crv.A01(r0)
            r6.A08(r0)
        L_0x0270:
            X.75M r1 = r3.A0V
            goto L_0x02ca
        L_0x0273:
            java.lang.Object r2 = r10.A01
            com.whatsapp.location.LocationPicker2 r2 = (com.whatsapp.location.LocationPicker2) r2
            X.75M r0 = r2.A0V
            android.view.View r1 = r0.A08
            r0 = 0
            r1.setVisibility(r0)
            X.75M r0 = r2.A0V
            com.whatsapp.location.PlaceInfo r0 = r0.A0U
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r0.A0D
            if (r0 == 0) goto L_0x0046
            X.Ccd r0 = (X.C25280Ccd) r0
            r0.A02()
            return
        L_0x028f:
            java.lang.Object r4 = r10.A01
            com.whatsapp.location.LocationPicker r4 = (com.whatsapp.location.LocationPicker) r4
            X.75M r1 = r4.A0O
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x0733
            android.location.Location r0 = r1.A05
            if (r0 == 0) goto L_0x0046
            android.widget.ImageView r1 = r1.A0K
            r0 = 2131231147(0x7f0801ab, float:1.8078367E38)
            r1.setImageResource(r0)
            X.DAE r7 = r4.A03
            if (r7 == 0) goto L_0x02c8
            X.75M r0 = r4.A0O
            android.location.Location r0 = r0.A05
            double r5 = r0.getLatitude()
            X.75M r0 = r4.A0O
            android.location.Location r0 = r0.A05
            double r2 = r0.getLongitude()
            X.AEc r1 = new X.AEc
            r1.<init>(r5, r2)
            X.CXL r0 = new X.CXL
            r0.<init>()
            r0.A06 = r1
            r7.A08(r0)
        L_0x02c8:
            X.75M r1 = r4.A0O
        L_0x02ca:
            r0 = 1
            r1.A0h = r0
            return
        L_0x02ce:
            java.lang.Object r2 = r10.A01
            com.whatsapp.location.LocationPicker r2 = (com.whatsapp.location.LocationPicker) r2
            X.75M r0 = r2.A0O
            android.view.View r1 = r0.A08
            r0 = 0
            r1.setVisibility(r0)
            X.75M r0 = r2.A0O
            com.whatsapp.location.PlaceInfo r0 = r0.A0U
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r0.A0D
            if (r0 == 0) goto L_0x0046
            X.BPT r0 = (X.BPT) r0
            r0.A09()
            return
        L_0x02ea:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x02ff
            android.animation.AnimatorSet r0 = r3.A02
            if (r0 == 0) goto L_0x02ff
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x02ff
            android.animation.AnimatorSet r0 = r3.A02
            r0.start()
            r3.A07 = r2
        L_0x02ff:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r0)
            r0.onBackPressed()
            r3.A08 = r2
            return
        L_0x030b:
            java.lang.Object r3 = r10.A01
            X.5cz r3 = (X.C109205cz) r3
            r1 = 0
            com.whatsapp.WaImageView r0 = r3.A06
            if (r0 != 0) goto L_0x0318
            java.lang.String r0 = "undoButton"
            goto L_0x06e8
        L_0x0318:
            r0.setEnabled(r1)
            X.0vl r2 = r3.A0N
            java.lang.Object r1 = r2.getValue()
            X.6nr r1 = (X.C132916nr) r1
            X.7nF r0 = new X.7nF
            r0.<init>(r3)
            r1.A00 = r0
            X.6z9 r1 = r3.A08
            if (r1 == 0) goto L_0x06e3
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0340
            X.87P r0 = r1.A08
            r0.CFU()
            X.6m4 r0 = r1.A0B
            r0.A00()
            r0 = 1
            X.C139616z9.A00(r1, r0)
        L_0x0340:
            java.lang.Object r0 = r2.getValue()
            X.6nr r0 = (X.C132916nr) r0
            r0.A00()
            return
        L_0x034a:
            java.lang.Object r0 = r10.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x0350:
            java.lang.Object r2 = r10.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r2 = (com.whatsapp.mediaview.MediaViewBaseFragment) r2
            boolean r0 = r2.A0I
            r1 = r0 ^ 1
            r0 = 1
            r2.A2L(r1, r0)
            return
        L_0x035d:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A2F()
            return
        L_0x0365:
            java.lang.Object r1 = r10.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = (com.whatsapp.mediaview.MediaViewBaseFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x037e
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            com.whatsapp.mediaview.MediaViewFragment.A0C(r1)
            X.21V r0 = r1.A0y
            if (r0 == 0) goto L_0x037a
            r1.A2C()
            return
        L_0x037a:
            r1.A2D()
            return
        L_0x037e:
            r1.A2E()
            return
        L_0x0382:
            java.lang.Object r1 = r10.A01
            X.5kz r1 = (X.C112135kz) r1
            r0 = 1
            r1.A0U(r0)
            r1.notifyDataSetChanged()
            return
        L_0x038e:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView r0 = (com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView) r0
            X.71Q r2 = r0.getViewModel()
            int r0 = X.AnonymousClass71Q.A00(r2)
            r2.A04 = r0
            X.1G4 r1 = r2.A08
            int r0 = X.AnonymousClass71Q.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setValue(r0)
            X.AnonymousClass71Q.A01(r2)
            return
        L_0x03ad:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setMusicToolVisibility$lambda$25$lambda$24(r0, r11)
            return
        L_0x03b5:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setTemplateToolVisibility$lambda$23$lambda$22(r0, r11)
            return
        L_0x03bd:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            r0.A02()
            return
        L_0x03c5:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setShapeToolVisibility$lambda$21$lambda$20(r0, r11)
            return
        L_0x03cd:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setTooltipInPosition$lambda$12$lambda$11(r0, r11)
            return
        L_0x03d5:
            java.lang.Object r5 = r10.A01
            X.6uj r5 = (X.C136986uj) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.6c7 r0 = r5.A0H
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = r0.A00
            boolean r0 = com.whatsapp.mediacomposer.MediaComposerActivity.A1H(r2)
            r4 = 31
            if (r0 == 0) goto L_0x03eb
            r4 = 30
        L_0x03eb:
            X.0vq r3 = r2.A1s
            java.lang.Object r0 = r3.get()
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x03fb
            r4 = 66
        L_0x03fb:
            X.A4v r1 = X.C108965cb.A0f(r2)
            X.7JS r0 = r2.A0X
            int r0 = r0.A06()
            X.C72463Mc.A1F(r1, r4, r0)
            java.lang.Object r0 = r3.get()
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x0430
            X.3Rj r1 = X.AnonymousClass4a6.A00(r2)
            r0 = 2131891941(0x7f1216e5, float:1.9418616E38)
            r1.A0E(r0)
            r0 = 2131891940(0x7f1216e4, float:1.9418614E38)
            r1.A0D(r0)
            X.C73203Rj.A06(r1)
            X.AnonymousClass3MY.A1G(r1)
        L_0x042a:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r5.A0I
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.A01(r0)
            return
        L_0x0430:
            boolean r0 = com.whatsapp.mediacomposer.MediaComposerActivity.A1H(r2)
            if (r0 == 0) goto L_0x043c
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r0 = r2.A0j
            r0.A0V()
            goto L_0x042a
        L_0x043c:
            com.whatsapp.mediacomposer.MediaComposerFragment r6 = com.whatsapp.mediacomposer.MediaComposerActivity.A0d(r2)
            X.7JS r0 = r2.A0X
            android.net.Uri r1 = r0.A0A()
            if (r6 == 0) goto L_0x042a
            if (r1 == 0) goto L_0x042a
            java.lang.Integer r7 = com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel.A03(r2)
            X.73D r0 = r2.A1q
            X.72S r3 = r0.A02(r1)
            boolean r0 = r6 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x047d
            com.whatsapp.mediacomposer.VideoComposerFragment r6 = (com.whatsapp.mediacomposer.VideoComposerFragment) r6
            X.1FL r1 = r6.A1B()
            boolean r0 = r1 instanceof X.AnonymousClass85N
            r4 = 0
            if (r0 == 0) goto L_0x047b
            X.85N r1 = (X.AnonymousClass85N) r1
        L_0x0465:
            X.7w1 r3 = new X.7w1
            r3.<init>(r6, r1, r7)
            X.1pm r2 = X.AnonymousClass3MZ.A0G(r6)
            X.0wl r1 = r6.A0b
            if (r1 == 0) goto L_0x04a0
            com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2 r0 = new com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2
            r0.<init>(r6, r4, r3)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            goto L_0x042a
        L_0x047b:
            r1 = r4
            goto L_0x0465
        L_0x047d:
            boolean r0 = r6 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x042a
            X.1FL r1 = r6.A1B()
            boolean r0 = r1 instanceof X.AnonymousClass85N
            if (r0 == 0) goto L_0x049e
            X.85N r1 = (X.AnonymousClass85N) r1
        L_0x048b:
            com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment r2 = new com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment
            r2.<init>(r3, r1, r7)
            X.1FL r0 = r6.A1D()
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "media_quality_fragment"
            r2.A2C(r1, r0)
            goto L_0x042a
        L_0x049e:
            r1 = 0
            goto L_0x048b
        L_0x04a0:
            java.lang.String r0 = "latencySensitiveDispatcher"
            X.C18070vi.A11(r0)
            throw r4
        L_0x04a6:
            java.lang.Object r0 = r10.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x04ae:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = (com.whatsapp.mediacomposer.bottombar.BottomBarView) r0
            com.whatsapp.mediacomposer.bottombar.BottomBarView.setStatusMentionsToolTipVisible$lambda$1(r0, r11)
            return
        L_0x04b6:
            java.lang.Object r4 = r10.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.00H r0 = r4.A0Z
            if (r0 == 0) goto L_0x06e0
            java.lang.Object r3 = r0.get()
            X.A4v r3 = (X.C20050A4v) r3
            X.70X r0 = r4.A0W
            r2 = 1
            if (r0 == 0) goto L_0x04d1
            boolean r1 = r0.A0a()
            r0 = 39
            if (r1 == r2) goto L_0x04d3
        L_0x04d1:
            r0 = 38
        L_0x04d3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 11
            r3.A02(r1, r2, r0)
            X.7JF r1 = r4.A0J
            if (r1 == 0) goto L_0x04e9
            X.6yX r0 = r1.A0R
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x04e9
            r1.A0A()
        L_0x04e9:
            r4.A2X()
            return
        L_0x04ed:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            r0.A2X()
            return
        L_0x04f5:
            java.lang.Object r3 = r10.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r3 = (com.whatsapp.mediacomposer.VideoComposerFragment) r3
            android.animation.AnimatorSet r2 = X.C108945cZ.A0B()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r0 = 4
            android.animation.Animator[] r4 = new android.animation.Animator[r0]
            android.widget.FrameLayout r1 = r3.A0F
            r5 = 0
            if (r1 == 0) goto L_0x0556
            int r0 = r3.A01
            android.animation.ValueAnimator r1 = X.C123986Wp.A00(r1, r0)
        L_0x0510:
            r0 = 0
            r4[r0] = r1
            android.view.View r1 = r3.A0B
            if (r1 == 0) goto L_0x0554
            int r0 = r3.A01
            android.animation.ValueAnimator r1 = X.C123986Wp.A00(r1, r0)
        L_0x051d:
            r0 = 1
            r4[r0] = r1
            X.6uj r0 = r3.A0R
            if (r0 == 0) goto L_0x0552
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            android.animation.Animator r1 = r0.getTitleBarHideAnimator()
        L_0x052a:
            r0 = 2
            r4[r0] = r1
            X.8Ai r0 = r3.A29()
            if (r0 == 0) goto L_0x053f
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r0 = r0.A0a
            if (r0 == 0) goto L_0x053f
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A07
            android.animation.Animator r5 = r0.getBottomBarHideAnimator()
        L_0x053f:
            r0 = 3
            r4[r0] = r5
            java.util.List r0 = X.C200410p.A0P(r4)
            r2.playTogether(r0)
            r0 = 12
            X.C109195cy.A02(r2, r3, r0)
            r2.start()
            return
        L_0x0552:
            r1 = r5
            goto L_0x052a
        L_0x0554:
            r1 = r5
            goto L_0x051d
        L_0x0556:
            r1 = r5
            goto L_0x0510
        L_0x0558:
            java.lang.Object r4 = r10.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.00H r0 = r4.A0Z
            if (r0 == 0) goto L_0x06e0
            java.lang.Object r2 = r0.get()
            X.A4v r2 = (X.C20050A4v) r2
            boolean r1 = r4.A0g
            r0 = 28
            if (r1 == 0) goto L_0x056e
            r0 = 29
        L_0x056e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r0 = 11
            r2.A02(r1, r3, r0)
            boolean r0 = r4.A0g
            r6 = r0 ^ 1
            r4.A0g = r6
            android.net.Uri r0 = r4.A01
            if (r0 == 0) goto L_0x05a8
            X.8Ai r5 = r4.A29()
            if (r5 == 0) goto L_0x05a8
            com.whatsapp.mediacomposer.MediaComposerActivity r5 = (com.whatsapp.mediacomposer.MediaComposerActivity) r5
            X.7JS r2 = r5.A0X
            android.net.Uri r1 = r2.A0A()
            if (r1 == 0) goto L_0x05a5
            X.73D r0 = r2.A08
            X.72S r1 = r0.A02(r1)
            monitor-enter(r1)
            r1.A0P = r6     // Catch:{ all -> 0x059c }
            goto L_0x059f
        L_0x059c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x059f:
            monitor-exit(r1)
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = r2.A0B
            r0.A0V()
        L_0x05a5:
            com.whatsapp.mediacomposer.MediaComposerActivity.A15(r5)
        L_0x05a8:
            boolean r0 = r4.A0g
            android.widget.ImageView r1 = r4.A0H
            if (r0 == 0) goto L_0x05ea
            if (r1 == 0) goto L_0x05b6
            r0 = 2131231942(0x7f0804c6, float:1.807998E38)
            r1.setImageResource(r0)
        L_0x05b6:
            com.whatsapp.mediacomposer.VideoTimelineView r2 = r4.A0Q
            if (r2 == 0) goto L_0x05be
            r0 = 7000(0x1b58, double:3.4585E-320)
            r2.A09 = r0
        L_0x05be:
            com.whatsapp.mediacomposer.VideoComposerFragment.A0B(r4)
            X.1FL r2 = r4.A1D()
            X.11C r1 = r4.A09
            if (r1 == 0) goto L_0x061d
            r0 = 2131890777(0x7f121259, float:1.9416255E38)
        L_0x05cc:
            java.lang.String r0 = r4.A1H(r0)
            X.AnonymousClass1Y5.A00(r2, r1, r0)
            com.whatsapp.mediacomposer.VideoComposerFragment.A0C(r4)
            X.7x3 r5 = X.AnonymousClass7x3.A00
            X.1pm r3 = X.AnonymousClass3MZ.A0G(r4)
            X.0wl r2 = r4.A0b
            if (r2 == 0) goto L_0x06e6
            r1 = 0
            com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2 r0 = new com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2
            r0.<init>(r4, r1, r5)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x05ea:
            if (r1 == 0) goto L_0x05f2
            r0 = 2131231941(0x7f0804c5, float:1.8079977E38)
            r1.setImageResource(r0)
        L_0x05f2:
            com.whatsapp.mediacomposer.VideoTimelineView r2 = r4.A0Q
            if (r2 == 0) goto L_0x05fa
            long r0 = r4.A02
            r2.A09 = r0
        L_0x05fa:
            X.70X r0 = r4.A0W
            if (r0 == 0) goto L_0x0607
            boolean r0 = r0.A0a()
            if (r0 != r3) goto L_0x0607
            r4.A2T()
        L_0x0607:
            X.70X r3 = r4.A0W
            if (r3 == 0) goto L_0x0611
            long r1 = r4.A06
            int r0 = (int) r1
            r3.A0M(r0)
        L_0x0611:
            X.1FL r2 = r4.A1D()
            X.11C r1 = r4.A09
            if (r1 == 0) goto L_0x0622
            r0 = 2131897858(0x7f122e02, float:1.9430617E38)
            goto L_0x05cc
        L_0x061d:
            X.AnonymousClass3MW.A1N()
            goto L_0x06eb
        L_0x0622:
            X.AnonymousClass3MW.A1N()
            goto L_0x06eb
        L_0x0627:
            java.lang.Object r0 = r10.A01
            X.75M r0 = (X.AnonymousClass75M) r0
            X.AnonymousClass75M.A06(r0)
            return
        L_0x062f:
            java.lang.Object r1 = r10.A01
            X.75M r1 = (X.AnonymousClass75M) r1
            r0 = 1
            X.AnonymousClass75M.A0F(r1, r0)
            return
        L_0x0638:
            java.lang.Object r0 = r10.A01
            X.75M r0 = (X.AnonymousClass75M) r0
            X.AnonymousClass75M.A08(r0)
            return
        L_0x0640:
            java.lang.Object r1 = r10.A01
            X.75M r1 = (X.AnonymousClass75M) r1
            com.whatsapp.location.PlaceInfo r0 = r1.A1D
            X.AnonymousClass75M.A0D(r1, r0)
            return
        L_0x064a:
            java.lang.Object r0 = r10.A01
            X.68A r0 = (X.AnonymousClass68A) r0
            X.7By r3 = r0.A00
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0679
            android.app.Activity r2 = r3.A05
            X.6q5 r1 = new X.6q5
            r1.<init>(r2)
            r0 = 2131232061(0x7f08053d, float:1.808022E38)
            r1.A01 = r0
            java.lang.String[] r0 = X.C27091Ur.A09
            r1.A01(r0)
            r0 = 2131894345(0x7f122049, float:1.9423492E38)
            r1.A03 = r0
            r0 = 2131894346(0x7f12204a, float:1.9423494E38)
            r1.A02 = r0
            android.content.Intent r1 = r1.A00()
            r0 = 34
            r2.startActivityForResult(r1, r0)
            return
        L_0x0679:
            X.689 r2 = r3.A15
            android.app.Activity r1 = r3.A05
            X.1BI r0 = r3.A0I
            r2.A07(r1, r0)
            return
        L_0x0683:
            java.lang.Object r1 = r10.A01
            X.4oE r1 = (X.C96674oE) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A01
            goto L_0x06ac
        L_0x068c:
            java.lang.Object r1 = r10.A01
            X.4oK r1 = (X.C96734oK) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r2 = r1.A01
            X.1x1 r0 = r1.A00
            goto L_0x06ba
        L_0x0697:
            java.lang.Object r1 = r10.A01
            X.5Y4 r1 = (X.AnonymousClass5Y4) r1
            java.util.List r0 = X.C42011xT.A0I
            X.4oJ r1 = (X.C96724oJ) r1
            X.0vk r0 = r1.A00
            goto L_0x06ac
        L_0x06a2:
            java.lang.Object r1 = r10.A01
            X.5Y4 r1 = (X.AnonymousClass5Y4) r1
            java.util.List r0 = X.C42011xT.A0I
            X.4oI r1 = (X.C96714oI) r1
            X.0vk r0 = r1.A00
        L_0x06ac:
            r0.invoke()
            return
        L_0x06b0:
            java.lang.Object r1 = r10.A01
            X.4oN r1 = (X.C96764oN) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r2 = r1.A03
            X.1x1 r0 = r1.A00
        L_0x06ba:
            r2.invoke(r0)
            return
        L_0x06be:
            X.AnonymousClass7JF.A01(r4)
            return
        L_0x06c2:
            android.content.Context r1 = r11.getContext()
            X.0vb r0 = r7.A0B
            X.73u r1 = r2.BHq(r1, r0, r4)
            boolean r0 = r1.A0S()
            if (r0 == 0) goto L_0x06d7
            int r0 = r7.A01
            r1.A0K(r0)
        L_0x06d7:
            float r0 = r7.A00
            r1.A0J(r0)
            r3.C5O(r1)
            return
        L_0x06e0:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            goto L_0x06e8
        L_0x06e3:
            java.lang.String r0 = "penDialogController"
            goto L_0x06e8
        L_0x06e6:
            java.lang.String r0 = "latencySensitiveDispatcher"
        L_0x06e8:
            X.C18070vi.A11(r0)
        L_0x06eb:
            r0 = 0
            throw r0
        L_0x06ed:
            com.whatsapp.location.PlaceInfo r0 = r1.A0U
            if (r0 == 0) goto L_0x0704
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x06fc
            X.Ccd r1 = (X.C25280Ccd) r1
            X.CLL r0 = r3.A03
            r1.A04(r0)
        L_0x06fc:
            X.75M r1 = r3.A0V
            r0 = 0
            r1.A0U = r0
            X.AnonymousClass75M.A0B(r1)
        L_0x0704:
            X.75M r1 = r3.A0V
            boolean r0 = r1.A0e
            android.view.View r1 = r1.A0B
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            X.Bti r3 = r3.A0U
            goto L_0x071f
        L_0x0714:
            java.lang.Object r1 = r10.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            X.7By r0 = r1.A0O
            r0.A0N()
            X.Bti r3 = r1.A0N
        L_0x071f:
            int r2 = r3.A03
            r1 = 1
            if (r2 == 0) goto L_0x072f
            if (r2 == r1) goto L_0x072a
            r0 = 2
            if (r2 == r0) goto L_0x072f
            return
        L_0x072a:
            r0 = 0
            r3.setLocationMode(r0)
            return
        L_0x072f:
            r3.setLocationMode(r1)
            return
        L_0x0733:
            com.whatsapp.location.PlaceInfo r0 = r1.A0U
            if (r0 == 0) goto L_0x074a
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0742
            X.BPT r1 = (X.BPT) r1
            X.CgX r0 = r4.A05
            r1.A0C(r0)
        L_0x0742:
            X.75M r1 = r4.A0O
            r0 = 0
            r1.A0U = r0
            X.AnonymousClass75M.A0B(r1)
        L_0x074a:
            X.75M r1 = r4.A0O
            boolean r0 = r1.A0e
            android.view.View r1 = r1.A0B
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            X.Bth r3 = r4.A0N
            goto L_0x0765
        L_0x075a:
            java.lang.Object r1 = r10.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r1
            X.7By r0 = r1.A0N
            r0.A0N()
            X.Bth r3 = r1.A0M
        L_0x0765:
            int r2 = r3.A02
            r1 = 1
            if (r2 == 0) goto L_0x0775
            if (r2 == r1) goto L_0x0770
            r0 = 2
            if (r2 == r0) goto L_0x0775
            return
        L_0x0770:
            r0 = 0
            r3.setLocationMode(r0)
            return
        L_0x0775:
            r3.setLocationMode(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78K.onClick(android.view.View):void");
    }
}
