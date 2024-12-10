package X;

import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.7J8  reason: invalid class name */
public final class AnonymousClass7J8 implements AnonymousClass8BC {
    public final Runnable A00;
    public final /* synthetic */ AnonymousClass7JF A01;

    public AnonymousClass7J8(AnonymousClass7JF r1, Runnable runnable) {
        this.A01 = r1;
        this.A00 = runnable;
    }

    public void Bs6() {
        AnonymousClass7JF r2 = this.A01;
        r2.A0W.A0B = true;
        if (r2.A0R.A02 || r2.A0S.A00 != null) {
            Handler handler = r2.A08;
            Runnable runnable = this.A00;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 400);
        }
    }

    public void Bs7() {
        AnonymousClass7JF r4 = this.A01;
        C136986uj r2 = r4.A0W;
        int i = 0;
        r2.A0B = false;
        C139256yX r6 = r4.A0R;
        if (r6.A02 || r4.A0S.A00 != null) {
            AnonymousClass70N r5 = r4.A0V;
            C1409773u r7 = r5.A01;
            r4.A08.removeCallbacks(this.A00);
            if (!AnonymousClass7JF.A08(r4)) {
                if (r7 == null) {
                    r4.A0L.A05(true);
                    r4.A0J.A00();
                } else if (r6.A02) {
                    ColorPickerComponent colorPickerComponent = r4.A0L;
                    if (!colorPickerComponent.A06()) {
                        colorPickerComponent.A03();
                    }
                }
                AnonymousClass7JS r62 = r2.A0G;
                if (r62.A09() == 2) {
                    r2.A0I.A03(r2.A0F);
                    if (r7 != null && r7.A0S()) {
                        ColorPickerComponent colorPickerComponent2 = r4.A0L;
                        colorPickerComponent2.setColorAndInvalidate(r7.A05.getColor());
                        colorPickerComponent2.A03();
                    }
                } else if (r62.A09() != 6) {
                    r2.A04();
                }
                r4.A0P.setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
                if (!AnonymousClass000.A1a(r5.A03.A00)) {
                    i = 4;
                }
                r2.A08(i);
                boolean A1Z = AnonymousClass3MW.A1Z(r4.A0G);
                TitleBarView titleBarView = r2.A0I;
                RelativeLayout toolbarExtra = titleBarView.getToolbarExtra();
                View startingViewFromToolbarExtra = titleBarView.getStartingViewFromToolbarExtra();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) toolbarExtra.getLayoutParams();
                layoutParams.addRule(A1Z ^ true ? 1 : 0, startingViewFromToolbarExtra.getId());
                toolbarExtra.setLayoutParams(layoutParams);
                r4.A0J.A03();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [X.5d0, android.app.Dialog] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c8, code lost:
        if (((r0 * r0) + (r2 * r2)) <= (r1 * r1)) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C5N(X.C1409773u r9, float r10, float r11) {
        /*
            r8 = this;
            X.7JF r4 = r8.A01
            X.6ud r5 = r4.A0J
            r6 = r5
            X.696 r6 = (X.AnonymousClass696) r6
            int r0 = r6.A00
            switch(r0) {
                case 2: goto L_0x00d1;
                case 3: goto L_0x00a0;
                default: goto L_0x000c;
            }
        L_0x000c:
            boolean r0 = r9 instanceof X.AnonymousClass69c
            if (r0 == 0) goto L_0x001d
            X.6uj r1 = r4.A0W
            r0 = 3
            r1.A07(r0)
            X.69c r9 = (X.AnonymousClass69c) r9
            X.AnonymousClass7JF.A07(r4, r9)
        L_0x001b:
            r0 = 0
            return r0
        L_0x001d:
            boolean r0 = r9 instanceof X.AnonymousClass69Z
            if (r0 == 0) goto L_0x007c
            X.69Z r9 = (X.AnonymousClass69Z) r9
            X.1FL r7 = r4.A0A
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L_0x001b
            X.AnonymousClass7JF.A00(r4)
            android.view.View r0 = r4.A09
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r0)
            r0 = 2131624141(0x7f0e00cd, float:1.8875453E38)
            android.view.View r6 = X.AnonymousClass3MY.A0D(r1, r0)
            X.11C r3 = r4.A0E
            X.C18070vi.A0b(r6)
            java.lang.String r1 = r9.A03
            X.C108985cd.A1D(r6, r1)
            r0 = 2132083223(0x7f150217, float:1.9806582E38)
            X.5d0 r2 = new X.5d0
            r2.<init>(r7, r0)
            r2.A01 = r3
            r2.A00 = r6
            r2.A02 = r1
            X.70N r0 = r4.A0V
            r0.A07(r9)
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r4.A0P
            r0.invalidate()
            X.AnonymousClass7JF.A00(r4)
            r5.A04()
            r1 = 1
            X.75C r0 = new X.75C
            r0.<init>(r4, r1)
            r2.setOnShowListener(r0)
            X.6uj r0 = r4.A0W
            r0.A0B = r1
            X.75A r0 = new X.75A
            r0.<init>(r6, r4, r9, r1)
            r2.setOnDismissListener(r0)
            r2.show()
            goto L_0x001b
        L_0x007c:
            if (r9 == 0) goto L_0x001b
            boolean r0 = r9.A0S()
            if (r0 == 0) goto L_0x001b
            X.6uj r1 = r4.A0W
            android.graphics.Paint r2 = r9.A05
            int r0 = r2.getColor()
            r1.A01 = r0
            r0 = 2
            r1.A07(r0)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r4.A0L
            int r0 = r2.getColor()
            r1.setColorAndInvalidate(r0)
            r1.A03()
            goto L_0x001b
        L_0x00a0:
            if (r9 == 0) goto L_0x00ca
            java.lang.Object r0 = r6.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            android.view.View r3 = r0.A09
            r2 = 0
            if (r3 == 0) goto L_0x00d5
            float r1 = X.C108945cZ.A04(r3)
        L_0x00af:
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            if (r3 == 0) goto L_0x00d3
            float r0 = r3.getX()
        L_0x00b8:
            float r0 = r0 + r1
            if (r3 == 0) goto L_0x00bf
            float r2 = r3.getY()
        L_0x00bf:
            float r2 = r2 + r1
            float r0 = r0 - r10
            float r2 = r2 - r11
            float r0 = r0 * r0
            float r2 = r2 * r2
            float r0 = r0 + r2
            float r1 = r1 * r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x000c
        L_0x00ca:
            java.lang.Object r0 = r6.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            r0.A2X()
        L_0x00d1:
            r0 = 1
            return r0
        L_0x00d3:
            r0 = 0
            goto L_0x00b8
        L_0x00d5:
            r1 = 0
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J8.C5N(X.73u, float, float):boolean");
    }

    public void C5P(C1409773u r6) {
        AnonymousClass7JF r3 = this.A01;
        AnonymousClass7JS r4 = r3.A0W.A0G;
        if (r4.A09() != 2) {
            boolean A0T = r6.A0T();
            if (A0T || r6.A0S()) {
                if (r4.A09() == 5) {
                    r3.A0L.A03();
                }
                if (r6.A0S()) {
                    int color = r6.A05.getColor();
                    if (color != 0) {
                        r3.A0L.setColorAndInvalidate(color);
                    }
                    ColorPickerView colorPickerView = r3.A0L.A01;
                    if (colorPickerView != null) {
                        ColorPickerView.A01(colorPickerView);
                        colorPickerView.invalidate();
                    }
                }
                if (A0T) {
                    r3.A0L.setSizeAndInvalidate(r6.A0B() * r3.A0P.A00);
                }
            } else {
                r3.A0L.A05(true);
                r3.A0J.A00();
            }
            AnonymousClass7JF.A05(r3);
        }
    }
}
