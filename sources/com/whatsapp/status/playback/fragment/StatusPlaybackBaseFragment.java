package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3NL;
import X.AnonymousClass6LG;
import X.AnonymousClass70K;
import X.AnonymousClass78S;
import X.AnonymousClass7ME;
import X.AnonymousClass7RH;
import X.AnonymousClass89M;
import X.AnonymousClass89N;
import X.C131096kV;
import X.C1409373q;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C23661Hd;
import X.C24641Lc;
import X.C72453Mb;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import java.util.Iterator;
import java.util.List;

public abstract class StatusPlaybackBaseFragment extends Hilt_StatusPlaybackBaseFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public C24641Lc A04;
    public C131096kV A05;
    public AnonymousClass00H A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Runnable A0C = new AnonymousClass7RH((Object) this, 36);
    public final AnonymousClass89N A0D = new AnonymousClass7ME(this, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, A2C().A01, 9839) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r8, android.view.LayoutInflater r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r9, r6)
            boolean r1 = r7.A09
            r0 = 2131627028(0x7f0e0c14, float:1.8881309E38)
            if (r1 == 0) goto L_0x000e
            r0 = 2131627029(0x7f0e0c15, float:1.888131E38)
        L_0x000e:
            android.view.View r4 = r9.inflate(r0, r10, r6)
            java.lang.String r0 = X.C108985cd.A0i(r7)
            com.whatsapp.jid.UserJid r1 = X.C22971Dz.A05(r0)
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r1 != r0) goto L_0x0039
            X.11S r0 = r7.A01
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0039
            X.1Lc r0 = r7.A2C()
            X.0ve r2 = r0.A01
            r1 = 9839(0x266f, float:1.3787E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0055
            r0 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0F(r4, r0)
            boolean r1 = r7.A0A
            r0 = 2131627031(0x7f0e0c17, float:1.8881315E38)
            if (r1 == 0) goto L_0x004f
            r0 = 2131627030(0x7f0e0c16, float:1.8881313E38)
        L_0x004f:
            r2.setLayoutResource(r0)
            r2.inflate()
        L_0x0055:
            X.C18070vi.A0b(r4)
            X.6kV r0 = new X.6kV
            r0.<init>(r4, r3)
            r7.A05 = r0
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x006b
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00c6
        L_0x006b:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r7)
            r0 = 2131168833(0x7f070e41, float:1.795198E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.6kV r0 = r7.A05
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            if (r0 == 0) goto L_0x0099
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r3 = r0.A0E
            if (r3 == 0) goto L_0x0099
            r3.setPadding(r1, r1, r1, r6)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x00cc
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168831(0x7f070e3f, float:1.7951975E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            r3.setLayoutParams(r2)
        L_0x0099:
            X.6kV r0 = r7.A05
            if (r0 == 0) goto L_0x00c6
            android.view.View r3 = r0.A05
            int r2 = r3.getPaddingStart()
            int r1 = r3.getPaddingEnd()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r2, r6, r1, r0)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x00c7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168831(0x7f070e3f, float:1.7951975E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
            r3.setLayoutParams(r2)
        L_0x00c6:
            return r4
        L_0x00c7:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r5)
            throw r0
        L_0x00cc:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r5)
            throw r0
        L_0x00d1:
            java.lang.String r0 = "meManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1y(Bundle bundle) {
        this.A0X = true;
        A2D(this.A01);
        AnonymousClass89M r1 = (AnonymousClass89M) A1B();
        if (r1 != null) {
            r1.BwK(A26());
        }
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1D = A1D();
        AnonymousClass6LG r4 = new AnonymousClass6LG(this, 9);
        C131096kV r3 = this.A05;
        if (r3 != null) {
            if (!this.A09) {
                ImageView imageView = r3.A0A;
                C18000vb r1 = this.A03;
                if (r1 != null) {
                    AnonymousClass3NL.A01(A1D, imageView, r1, 2131231764);
                }
                AnonymousClass3MW.A1M();
                throw null;
            }
            r3.A0A.setOnClickListener(r4);
            View view2 = r3.A02;
            C18000vb r12 = this.A03;
            if (r12 != null) {
                view2.setOnClickListener(new AnonymousClass78S(A1D, view2, r12, this));
                return;
            }
            AnonymousClass3MW.A1M();
            throw null;
        }
    }

    public void A2B(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.A2B(rect);
        A2D(rect);
        Rect rect2 = this.A01;
        C18070vi.A0d(rect2, 0);
        Iterator A0l = C17890vO.A0l(((StatusPlaybackContactFragment) this).A17.A06());
        while (A0l.hasNext()) {
            ((AnonymousClass70K) A0l.next()).A0I(rect2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0169, code lost:
        if (r0 != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D(android.graphics.Rect r9) {
        /*
            r8 = this;
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            X.6kV r2 = r8.A05
            if (r2 == 0) goto L_0x00d1
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x0010
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x00d1
        L_0x0010:
            X.1FL r0 = r8.A1B()
            if (r0 == 0) goto L_0x0023
            X.11C r4 = r8.A02
            if (r4 == 0) goto L_0x016e
            android.view.Window r1 = r0.getWindow()
            android.widget.FrameLayout r0 = r2.A09
            X.C39761tb.A00(r0, r1, r4)
        L_0x0023:
            android.view.View r5 = r2.A06
            int r4 = r9.left
            int r1 = r9.top
            int r0 = r9.right
            r5.setPadding(r4, r1, r0, r3)
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x00b3
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "SM-G960"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "SM-G955"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "SM-G950"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0160
            r4 = 1084437299(0x40a33333, float:5.1)
        L_0x005d:
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r8)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 5
            float r7 = android.util.TypedValue.applyDimension(r0, r4, r1)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r8)
            r0 = 2131168832(0x7f070e40, float:1.7951977E38)
            r6 = 2131168832(0x7f070e40, float:1.7951977E38)
            float r4 = X.AnonymousClass3MW.A00(r1, r0)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00f5
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r2.A0E
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x00f5
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x00f5
            int r0 = r0.getSafeInsetTop()
            if (r0 <= 0) goto L_0x00f5
        L_0x0096:
            r7 = 0
        L_0x0097:
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r8)
            int r6 = r0.getDimensionPixelSize(r6)
            double r0 = (double) r7
            double r4 = java.lang.Math.ceil(r0)
            int r0 = (int) r4
            int r6 = r6 + r0
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r4 = r2.A0E
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r6, r1, r6, r0)
        L_0x00b3:
            android.view.ViewStub r5 = r2.A08
            android.view.ViewGroup$MarginLayoutParams r4 = X.C72463Mc.A0P(r5)
            X.C18070vi.A0d(r4, r3)
            android.content.Context r0 = r8.A14()
            int r1 = X.C72453Mb.A08(r0)
            r0 = 1
            if (r1 == r0) goto L_0x00d2
            r0 = 2
            if (r1 == r0) goto L_0x00e9
            int r1 = r4.bottomMargin
        L_0x00cc:
            r4.bottomMargin = r1
            r5.setLayoutParams(r4)
        L_0x00d1:
            return
        L_0x00d2:
            android.graphics.Rect r0 = r8.A01
            int r1 = r0.bottom
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r8)
            if (r1 <= 0) goto L_0x00e5
            r0 = 2131165280(0x7f070060, float:1.7944773E38)
            int r0 = r2.getDimensionPixelOffset(r0)
            int r1 = r1 + r0
            goto L_0x00cc
        L_0x00e5:
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            goto L_0x00f0
        L_0x00e9:
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r8)
            r0 = 2131165279(0x7f07005f, float:1.794477E38)
        L_0x00f0:
            int r1 = r2.getDimensionPixelOffset(r0)
            goto L_0x00cc
        L_0x00f5:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r4
            float r0 = r0 * r7
            float r4 = r4 * r4
            float r0 = r0 - r4
            double r0 = (double) r0
            double r4 = java.lang.Math.sqrt(r0)
            float r0 = (float) r4
            float r7 = r7 - r0
            goto L_0x0097
        L_0x0103:
            r4 = 1084856730(0x40a9999a, float:5.3)
            goto L_0x005d
        L_0x0108:
            java.lang.String r0 = "Google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x011f
            r4 = 1082759578(0x4089999a, float:4.3)
            goto L_0x005d
        L_0x011f:
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r1.equals(r0)
            r4 = 1082340147(0x40833333, float:4.1)
            goto L_0x0169
        L_0x0129:
            java.lang.String r0 = "LGE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016b
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "H87"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "G600"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "LS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "AS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "VS998"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x016b
        L_0x015b:
            r4 = 1084919644(0x40aa8f5c, float:5.33)
            goto L_0x005d
        L_0x0160:
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            r4 = 1085695590(0x40b66666, float:5.7)
        L_0x0169:
            if (r0 != 0) goto L_0x005d
        L_0x016b:
            r4 = 0
            goto L_0x005d
        L_0x016e:
            X.AnonymousClass3MW.A1N()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A2D(android.graphics.Rect):void");
    }

    public final C24641Lc A2C() {
        C24641Lc r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public void A2E(ViewGroup viewGroup) {
        float f;
        Button button;
        ViewGroup viewGroup2;
        C131096kV r0 = this.A05;
        if (r0 != null) {
            r0.A06.setTranslationY((float) viewGroup.getTop());
        }
        C131096kV r02 = this.A05;
        if (r02 != null) {
            r02.A04.setTranslationY((float) viewGroup.getTop());
        }
        C131096kV r03 = this.A05;
        if (r03 == null || (viewGroup2 = r03.A07) == null) {
            f = 0.0f;
        } else {
            int intValue = Integer.valueOf(viewGroup2.getBottom()).intValue();
            float dimensionPixelOffset = (float) AnonymousClass000.A0Y(viewGroup).getDimensionPixelOffset(2131169358);
            AnonymousClass1FL A1B = A1B();
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.status.playback.StatusPlaybackActivity");
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) A1B;
            if (C23661Hd.A03.A01(statusPlaybackActivity) || C72453Mb.A1a(statusPlaybackActivity.A0i)) {
                f = ((float) (intValue - viewGroup.getBottom())) + dimensionPixelOffset;
            } else {
                f = ((float) (intValue - viewGroup.getBottom())) - (((float) AnonymousClass000.A0Y(viewGroup).getDimensionPixelOffset(2131169351)) + dimensionPixelOffset);
            }
        }
        C131096kV r04 = this.A05;
        if (r04 != null && (button = r04.A00) != null) {
            button.setTranslationY(-f);
        }
    }

    public void A1s() {
        super.A1s();
        this.A05 = null;
    }

    public void A1t() {
        super.A1t();
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            AnonymousClass89N r1 = this.A0D;
            C18070vi.A0d(r1, 0);
            List list = ((C1409373q) r0.get()).A02;
            if (list != null) {
                list.remove(r1);
                return;
            }
            return;
        }
        C18070vi.A11("statusPlaybackAudioManager");
        throw null;
    }

    public void A1u() {
        super.A1u();
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            C1409373q r2 = (C1409373q) r0.get();
            AnonymousClass89N r1 = this.A0D;
            C18070vi.A0d(r1, 0);
            List list = r2.A02;
            if (list == null) {
                list = AnonymousClass000.A13();
                r2.A02 = list;
            }
            list.add(r1);
            return;
        }
        C18070vi.A11("statusPlaybackAudioManager");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.C18020vd.A05(r2, r1, 9228) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r5) {
        /*
            r4 = this;
            super.A1z(r5)
            X.1Lc r0 = r4.A2C()
            X.0ve r1 = r0.A01
            X.0vf r2 = X.C18040vf.A01
            r0 = 9228(0x240c, float:1.2931E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            r4.A09 = r0
            X.1Lc r0 = r4.A2C()
            X.0ve r1 = r0.A01
            r0 = 11189(0x2bb5, float:1.5679E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x002a
            r0 = 9228(0x240c, float:1.2931E-41)
            boolean r1 = X.C18020vd.A05(r2, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r4.A0A = r0
            X.1FL r3 = r4.A1B()
            boolean r2 = r3 instanceof com.whatsapp.status.playback.StatusPlaybackActivity
            r0 = 0
            if (r2 == 0) goto L_0x0039
            r0 = r3
            com.whatsapp.status.playback.StatusPlaybackActivity r0 = (com.whatsapp.status.playback.StatusPlaybackActivity) r0
        L_0x0039:
            r1 = 0
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.A0Z
        L_0x003e:
            r4.A0B = r0
            if (r2 == 0) goto L_0x0048
            com.whatsapp.status.playback.StatusPlaybackActivity r3 = (com.whatsapp.status.playback.StatusPlaybackActivity) r3
            if (r3 == 0) goto L_0x0048
            boolean r1 = r3.A0S
        L_0x0048:
            r4.A08 = r1
            return
        L_0x004b:
            r0 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A1z(android.os.Bundle):void");
    }
}
