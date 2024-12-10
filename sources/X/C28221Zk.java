package X;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* renamed from: X.1Zk  reason: invalid class name and case insensitive filesystem */
public class C28221Zk {
    public int A00 = 1;
    public TextView A01;
    public TextView A02;
    public C109955eT A03;
    public Integer A04 = AnonymousClass00R.A00;
    public boolean A05;
    public boolean A06 = true;
    public MaterialButton A07;
    public final ViewStub A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final C18000vb A0B;
    public final C18030ve A0C;
    public final AnonymousClass11A A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final AnonymousClass11P A0G;
    public final C19830z4 A0H;
    public final AnonymousClass1LE A0I;
    public final AnonymousClass10I A0J;

    public static Drawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        if (drawable == null || Build.VERSION.SDK_INT < 23) {
            return drawable2;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(50);
        A01(drawable, transitionDrawable, 0);
        A01(drawable2, transitionDrawable, 1);
        return transitionDrawable;
    }

    private void A02(TextView textView) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100);
        this.A0D.CGP(new C70713Cf(textView, alphaAnimation, 31));
    }

    public static void A04(C28221Zk r5) {
        TextView textView = r5.A01;
        if (textView != null && textView.getVisibility() != 8) {
            C19830z4 r4 = r5.A0H;
            long j = ((SharedPreferences) r4.A00.get()).getLong("create_group_tool_tip_nudge_show_time", 0);
            C19830z4.A00(r4).putLong("create_group_tool_tip_nudge_last_impression_time", System.currentTimeMillis() - j).apply();
            r5.A02(r5.A01);
        }
    }

    public MaterialButton A05() {
        ViewStub viewStub;
        C18030ve r2;
        if (this.A07 == null && (viewStub = this.A0E) != null && (r2 = this.A0C) != null && C18020vd.A05(C18040vf.A01, r2, 12698)) {
            this.A07 = (MaterialButton) viewStub.inflate();
        }
        return this.A07;
    }

    public void A06(C29201bm r5) {
        AnonymousClass1KB r2;
        if (C18020vd.A05(C18040vf.A02, this.A0C, 11825)) {
            C109955eT r3 = this.A03;
            if (r3 != null && r3.A03 != null && (r2 = r3.A04) != null) {
                r2.A0J(new C146787Qp(r3, 49));
                return;
            }
            return;
        }
        TextView textView = this.A02;
        if (textView != null && textView.getVisibility() != 8) {
            A02(this.A02);
            r5.CKb();
        }
    }

    public C28221Zk(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ImageView imageView, ImageView imageView2, AnonymousClass11P r8, C19830z4 r9, C18000vb r10, C18030ve r11, AnonymousClass1LE r12, AnonymousClass11A r13, AnonymousClass10I r14) {
        this.A0G = r8;
        this.A0C = r11;
        this.A0I = r12;
        this.A0B = r10;
        this.A0D = r13;
        this.A0J = r14;
        this.A0H = r9;
        C17960vV.A05(imageView);
        this.A09 = imageView;
        C17960vV.A05(imageView2);
        this.A0A = imageView2;
        this.A0E = viewStub;
        this.A0F = viewStub2;
        this.A08 = viewStub3;
        if (this.A07 == null && viewStub != null) {
            if (r11 == null || !C18020vd.A05(C18040vf.A01, r11, 12698)) {
                this.A07 = (MaterialButton) viewStub.inflate();
            }
        }
    }

    public static void A01(Drawable drawable, TransitionDrawable transitionDrawable, int i) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        transitionDrawable.setLayerWidth(i, drawable.getIntrinsicWidth());
        transitionDrawable.setLayerHeight(i, intrinsicHeight);
        transitionDrawable.setLayerGravity(i, 17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r7 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C29201bm r8, X.C28221Zk r9) {
        /*
            android.graphics.drawable.Drawable r7 = r8.BUL()
            java.lang.String r4 = r8.BUK()
            android.widget.ImageView r3 = r9.A09
            r1 = 0
            X.48h r0 = new X.48h
            r0.<init>(r9, r8, r1)
            r3.setOnClickListener(r0)
            android.widget.ImageView r2 = r9.A0A
            r8.CI2(r2)
            r1 = 1
            X.48h r0 = new X.48h
            r0.<init>(r9, r8, r1)
            r2.setOnClickListener(r0)
            r1 = 0
            X.78j r0 = new X.78j
            r0.<init>(r8, r9, r1)
            r2.setOnLongClickListener(r0)
            if (r4 == 0) goto L_0x002f
            r3.setContentDescription(r4)
        L_0x002f:
            if (r7 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            android.graphics.drawable.Drawable r0 = A00(r0, r7)
            r3.setImageDrawable(r0)
        L_0x003c:
            boolean r0 = r9.A05
            r4 = 8
            if (r0 != 0) goto L_0x0045
            r5 = 0
            if (r7 != 0) goto L_0x0047
        L_0x0045:
            r5 = 8
        L_0x0047:
            java.lang.Integer r1 = r9.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x00fd
            java.lang.String r6 = r8.BUM()
            if (r6 == 0) goto L_0x00fd
            com.google.android.material.button.MaterialButton r0 = r9.A05()
            if (r0 == 0) goto L_0x00a2
            com.google.android.material.button.MaterialButton r2 = r9.A05()
            r1 = 2
            X.48h r0 = new X.48h
            r0.<init>(r9, r8, r1)
            r2.setOnClickListener(r0)
            r3.setVisibility(r4)
            com.google.android.material.button.MaterialButton r0 = r9.A05()
            r0.setVisibility(r5)
            if (r5 != 0) goto L_0x009b
            com.google.android.material.button.MaterialButton r0 = r9.A05()
            r0.setIcon(r7)
            com.google.android.material.button.MaterialButton r0 = r9.A05()
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009b
            X.11A r5 = r9.A0D
            r0 = 13
            X.AkJ r3 = new X.AkJ
            r3.<init>(r0, r6, r9)
            r1 = 3000(0xbb8, double:1.482E-320)
            android.os.Handler r0 = r5.A00
            r0.postDelayed(r3, r1)
        L_0x009b:
            com.google.android.material.button.MaterialButton r0 = r9.A05()
            r0.setContentDescription(r6)
        L_0x00a2:
            X.0ve r2 = r9.A0C
            r1 = 12836(0x3224, float:1.7987E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e8
            X.10I r2 = r9.A0J
            r1 = 29
            X.3Cf r0 = new X.3Cf
            r0.<init>(r9, r8, r1)
            r2.CGF(r0)
        L_0x00ba:
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = r8.BaZ()
            if (r0 == 0) goto L_0x00c5
            r4 = 0
        L_0x00c5:
            android.widget.TextView r0 = r9.A01
            if (r0 != 0) goto L_0x00e3
            r0 = 8
        L_0x00cb:
            if (r4 == r0) goto L_0x00d2
            if (r4 != 0) goto L_0x00df
            r9.A07(r8)
        L_0x00d2:
            X.10I r2 = r9.A0J
            r1 = 30
            X.3Cf r0 = new X.3Cf
            r0.<init>(r9, r8, r1)
            r2.CGF(r0)
            return
        L_0x00df:
            A04(r9)
            goto L_0x00d2
        L_0x00e3:
            int r0 = r0.getVisibility()
            goto L_0x00cb
        L_0x00e8:
            android.graphics.drawable.Drawable r5 = r8.BYm()
            java.lang.String r3 = r8.BYl()
            X.11A r2 = r9.A0D
            r1 = 10
            X.AkQ r0 = new X.AkQ
            r0.<init>(r9, r5, r3, r1)
            r2.A00(r0)
            goto L_0x00ba
        L_0x00fd:
            com.google.android.material.button.MaterialButton r0 = r9.A07
            if (r0 == 0) goto L_0x0104
            r0.setVisibility(r4)
        L_0x0104:
            int r0 = r3.getVisibility()
            if (r5 == r0) goto L_0x00a2
            r3.setVisibility(r5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            if (r5 != 0) goto L_0x0115
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0115:
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 100
            r2.setDuration(r0)
            r3.startAnimation(r2)
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28221Zk.A03(X.1bm, X.1Zk):void");
    }

    public void A07(C29201bm r5) {
        ViewStub viewStub;
        if (r5.BaZ() != null && (viewStub = this.A0F) != null && !this.A0I.A00()) {
            TextView textView = this.A01;
            if (textView == null) {
                textView = (TextView) viewStub.inflate();
                this.A01 = textView;
            }
            textView.setText(r5.BaZ());
            TextView textView2 = this.A01;
            textView2.setBackground(new C74743cP(C24261Jm.A00(textView2.getContext(), 2131233097), this.A0B));
            this.A01.setVisibility(0);
            TextView textView3 = this.A01;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(100);
            textView3.startAnimation(alphaAnimation);
        }
    }

    public void A08(C29201bm r4, boolean z) {
        if (A05() != null && r4 != null) {
            AnonymousClass1LG r2 = new AnonymousClass1LG();
            r2.A0E(A05());
            r2.A0C(300);
            if (z) {
                r2.A0N(new C453828t(r4, this, 3));
            }
            C29191bl.A02((ViewGroup) A05().getParent(), r2);
            int dimensionPixelSize = A05().getContext().getResources().getDimensionPixelSize(2131168777);
            A05().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            A05().setIconPadding(0);
            A05().setText("");
        }
    }
}
