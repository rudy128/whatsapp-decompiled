package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass181;
import X.AnonymousClass1BI;
import X.AnonymousClass1D9;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass28F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6R5;
import X.AnonymousClass6RH;
import X.AnonymousClass73Z;
import X.AnonymousClass782;
import X.AnonymousClass793;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C110745gz;
import X.C111225jD;
import X.C111905kc;
import X.C111945kg;
import X.C113065mU;
import X.C114315qV;
import X.C121196Ih;
import X.C127036dh;
import X.C130296jC;
import X.C1421478i;
import X.C1423479c;
import X.C148577hf;
import X.C148587hg;
import X.C148597hh;
import X.C148607hi;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C21434Ak1;
import X.C28931bI;
import X.C29431cG;
import X.C38391rD;
import X.C42011xT;
import X.C51112Xa;
import X.C6T;
import X.C72453Mb;
import X.C72463Mc;
import X.CIZ;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.imagine.InputPrompt;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;

public final class AiImagineBottomSheet extends Hilt_AiImagineBottomSheet {
    public int A00 = 1;
    public int A01;
    public Uri A02;
    public View A03;
    public View A04;
    public View A05;
    public FrameLayout A06;
    public ConstraintLayout A07;
    public ConstraintLayout A08;
    public CIZ A09;
    public CIZ A0A;
    public RecyclerView A0B;
    public ViewPager2 A0C;
    public ShapeableImageView A0D;
    public C51112Xa A0E;
    public AnonymousClass1KB A0F;
    public AnonymousClass181 A0G;
    public WaImageButton A0H;
    public WaTextView A0I;
    public C111225jD A0J;
    public AnonymousClass73Z A0K;
    public AnonymousClass11C A0L;
    public AnonymousClass118 A0M;
    public C18000vb A0N;
    public C18030ve A0O;
    public AnonymousClass1D9 A0P;
    public InputPrompt A0Q;
    public AnonymousClass1BI A0R;
    public C28931bI A0S;
    public C28931bI A0T;
    public C28931bI A0U;
    public C28931bI A0V;
    public C28931bI A0W;
    public C28931bI A0X;
    public C28931bI A0Y;
    public C28931bI A0Z;
    public C28931bI A0a;
    public C28931bI A0b;
    public C28931bI A0c;
    public AnonymousClass10I A0d;
    public WDSButton A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public final int A0h = 2131624175;
    public final View.OnClickListener A0i = new AnonymousClass782(this, 10);
    public final View.OnClickListener A0j = new AnonymousClass782(this, 1);
    public final View.OnClickListener A0k = new AnonymousClass782(this, 4);
    public final View.OnClickListener A0l = new AnonymousClass782(this, 2);
    public final View.OnClickListener A0m = new AnonymousClass782(this, 3);
    public final View.OnClickListener A0n = new AnonymousClass782(this, 0);
    public final View.OnClickListener A0o = new AnonymousClass782(this, 11);
    public final View.OnLongClickListener A0p = new C1421478i(this, 2);
    public final AnonymousClass02n A0q = CDw(new C1423479c(this, 0), new Object());
    public final C121196Ih A0r = new C121196Ih(this, 0);
    public final C18100vl A0s = AnonymousClass1DF.A01(new C148577hf(this));
    public final C18100vl A0t = AnonymousClass1DF.A01(new C148587hg(this));
    public final C18100vl A0u = AnonymousClass1DF.A01(new C148597hh(this));
    public final C18100vl A0v = AnonymousClass1DF.A01(new C148607hi(this));
    public final View.OnClickListener A0w = new AnonymousClass782(this, 12);
    public final ViewTreeObserver.OnGlobalLayoutListener A0x = new AnonymousClass793(this, 2);

    public static final void A01(C42011xT r6, RecyclerView recyclerView) {
        int[] iArr = new int[2];
        View view = r6.A0H;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        AnonymousClass28F r3 = new AnonymousClass28F(recyclerView.getLayoutManager(), 0);
        int i = iArr[0];
        if (view != null) {
            int width = view.getWidth();
            if (Integer.valueOf(width) != null) {
                recyclerView.A0l((i + (width / 2)) - (r3.A05() / 2), 0);
            }
        }
    }

    public static final void A0E(AiImagineBottomSheet aiImagineBottomSheet, boolean z) {
        WaTextView waTextView;
        if (z) {
            WaTextView waTextView2 = aiImagineBottomSheet.A0I;
            if (waTextView2 != null) {
                waTextView2.setVisibility(0);
            }
            View view = aiImagineBottomSheet.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = aiImagineBottomSheet.A05;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            RecyclerView recyclerView = aiImagineBottomSheet.A0B;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            A0C(aiImagineBottomSheet, false);
        } else {
            View view3 = aiImagineBottomSheet.A03;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            WaTextView waTextView3 = aiImagineBottomSheet.A0I;
            if (waTextView3 != null) {
                waTextView3.setVisibility(8);
            }
            View view4 = aiImagineBottomSheet.A05;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            RecyclerView recyclerView2 = aiImagineBottomSheet.A0B;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(4);
            }
        }
        DisplayMetrics A072 = C108965cb.A07();
        if (((int) (((float) A072.heightPixels) / A072.density)) <= 650 && (waTextView = aiImagineBottomSheet.A0I) != null) {
            waTextView.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x043e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            r2 = 0
            X.C18070vi.A0d(r14, r2)
            super.A21(r13, r14)
            r0 = 2131436300(0x7f0b230c, float:1.8494467E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            com.whatsapp.WaImageButton r0 = (com.whatsapp.WaImageButton) r0
            r12.A0H = r0
            r0 = 2131431657(0x7f0b10e9, float:1.848505E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0a = r0
            r0 = 2131431536(0x7f0b1070, float:1.8484804E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0W = r0
            r0 = 2131431569(0x7f0b1091, float:1.848487E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0Z = r0
            r0 = 2131430269(0x7f0b0b7d, float:1.8482234E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0S = r0
            r0 = 2131431558(0x7f0b1086, float:1.8484849E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0T = r0
            r0 = 2131431564(0x7f0b108c, float:1.848486E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0b = r0
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r14, r0)
            r12.A0e = r0
            r0 = 2131431548(0x7f0b107c, float:1.8484828E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0X = r0
            X.1bI r0 = r12.A0a
            if (r0 == 0) goto L_0x007d
            android.view.View r1 = r0.A02()
            if (r1 == 0) goto L_0x007d
            r0 = 2131436063(0x7f0b221f, float:1.8493986E38)
            android.view.View r1 = r1.findViewById(r0)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            if (r1 == 0) goto L_0x007d
            r0 = 2
            r1.setImeOptions(r0)
            r0 = 1
            r1.setRawInputType(r0)
            r1.requestFocus()
            r1.A0I(r2)
        L_0x007d:
            r0 = 2131431559(0x7f0b1087, float:1.848485E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0V = r0
            r0 = 2131431557(0x7f0b1085, float:1.8484847E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0U = r0
            r0 = 2131431103(0x7f0b0ebf, float:1.8483926E38)
            r1 = 2131431103(0x7f0b0ebf, float:1.8483926E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            r12.A0D = r0
            X.1bI r0 = r12.A0a
            if (r0 == 0) goto L_0x03c8
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x03c8
            android.view.View r0 = r0.findViewById(r1)
            com.whatsapp.imagine.InputPrompt r0 = (com.whatsapp.imagine.InputPrompt) r0
        L_0x00ad:
            r12.A0Q = r0
            r0 = 2131431560(0x7f0b1088, float:1.8484853E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            com.whatsapp.imagine.InputPrompt r0 = (com.whatsapp.imagine.InputPrompt) r0
            r12.A0Q = r0
            if (r0 == 0) goto L_0x00c1
            com.whatsapp.WaImageButton r0 = r0.A01
            X.C72453Mb.A1D(r0)
        L_0x00c1:
            r0 = 2131432223(0x7f0b131f, float:1.8486197E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0c = r0
            boolean r1 = X.C39761tb.A03()
            r0 = 2131625580(0x7f0e066c, float:1.8878372E38)
            if (r1 == 0) goto L_0x00d6
            r0 = 2131625581(0x7f0e066d, float:1.8878374E38)
        L_0x00d6:
            r12.A01 = r0
            r0 = 2131433224(0x7f0b1708, float:1.8488228E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            r12.A03 = r0
            r0 = 2131433225(0x7f0b1709, float:1.848823E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r14, r0)
            r12.A0I = r0
            r0 = 2131436302(0x7f0b230e, float:1.849447E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            r12.A05 = r0
            r0 = 2131431550(0x7f0b107e, float:1.8484832E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r12.A08 = r0
            r0 = 2131430066(0x7f0b0ab2, float:1.8481822E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r12.A07 = r0
            r0 = 2131430395(0x7f0b0bfb, float:1.848249E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.C108945cZ.A0U(r14, r0)
            r12.A0B = r0
            r0 = 2131431551(0x7f0b107f, float:1.8484834E38)
            X.1bI r0 = X.C28931bI.A00(r14, r0)
            r12.A0Y = r0
            android.content.Context r1 = r12.A1n()
            if (r1 == 0) goto L_0x012f
            X.0vl r0 = r12.A0t
            java.lang.Object r0 = r0.getValue()
            X.5dy r0 = (X.C109765dy) r0
            X.CIZ r0 = X.C108965cb.A0C(r1, r0)
            r12.A0A = r0
        L_0x012f:
            android.content.Context r1 = r12.A1n()
            if (r1 == 0) goto L_0x0143
            X.0vl r0 = r12.A0s
            java.lang.Object r0 = r0.getValue()
            X.5dy r0 = (X.C109765dy) r0
            X.CIZ r0 = X.C108965cb.A0C(r1, r0)
            r12.A09 = r0
        L_0x0143:
            r0 = 2131430070(0x7f0b0ab6, float:1.848183E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r12.A0C = r0
            r0 = 2131431562(0x7f0b108a, float:1.8484857E38)
            android.widget.FrameLayout r0 = X.C108945cZ.A0P(r14, r0)
            r12.A06 = r0
            boolean r0 = X.C108995ce.A1V(r12)
            r1 = 8
            if (r0 == 0) goto L_0x03bf
            r0 = 2131430067(0x7f0b0ab3, float:1.8481824E38)
            android.view.View r0 = X.C18070vi.A05(r14, r0)
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r12.A07
            r1 = 0
            if (r4 == 0) goto L_0x019d
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r0 = r3 instanceof X.C39151sZ
            if (r0 == 0) goto L_0x03bc
            X.1sZ r3 = (X.C39151sZ) r3
            if (r3 == 0) goto L_0x017d
            r0 = -1
            r3.A0B = r0
        L_0x017d:
            android.content.Context r0 = r12.A1n()
            if (r0 == 0) goto L_0x019a
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x019a
            r0 = 2131167041(0x7f070741, float:1.7948344E38)
            int r1 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x019a
            if (r3 == 0) goto L_0x019a
            r3.topMargin = r1
        L_0x019a:
            r4.setLayoutParams(r3)
        L_0x019d:
            android.content.Context r0 = r12.A1n()
            if (r0 == 0) goto L_0x01bf
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x01bf
            r0 = 2131167026(0x7f070732, float:1.7948314E38)
            int r1 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x01bf
            int r1 = r1 + -1
            android.widget.FrameLayout r0 = r12.A06
            if (r0 == 0) goto L_0x01bf
            r0.setPadding(r1, r1, r1, r1)
        L_0x01bf:
            android.util.DisplayMetrics r3 = X.C108965cb.A07()
            int r0 = r3.heightPixels
            float r1 = (float) r0
            float r0 = r3.density
            float r1 = r1 / r0
            int r1 = (int) r1
            r0 = 650(0x28a, float:9.11E-43)
            if (r1 > r0) goto L_0x01d3
            com.whatsapp.WaTextView r0 = r12.A0I
            X.C72453Mb.A1D(r0)
        L_0x01d3:
            android.util.DisplayMetrics r3 = X.C108965cb.A07()
            int r0 = r3.heightPixels
            float r1 = (float) r0
            float r0 = r3.density
            float r1 = r1 / r0
            int r1 = (int) r1
            r0 = 900(0x384, float:1.261E-42)
            if (r1 > r0) goto L_0x0205
            com.whatsapp.WaTextView r3 = r12.A0I
            if (r3 == 0) goto L_0x0205
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 == 0) goto L_0x04bc
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r2
            r3.setLayoutParams(r0)
            r0 = 2132084412(0x7f1506bc, float:1.9808994E38)
            X.C29261bv.A08(r3, r0)
            android.content.Context r1 = r12.A1n()
            if (r1 == 0) goto L_0x0205
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            X.AnonymousClass3MX.A1C(r1, r3, r0)
        L_0x0205:
            X.2Xa r5 = r12.A0E
            if (r5 == 0) goto L_0x04b2
            X.1BI r4 = r12.A0R
            android.net.Uri r3 = r12.A02
            int r1 = r12.A00
            X.2vo r0 = new X.2vo
            r0.<init>(r3, r5, r4, r1)
            X.1It r1 = new X.1It
            r1.<init>(r0, r12)
            java.lang.Class<X.5jD> r0 = X.C111225jD.class
            X.1J2 r6 = r1.A00(r0)
            X.5jD r6 = (X.C111225jD) r6
            r12.A0J = r6
            if (r6 == 0) goto L_0x04b5
            X.1BI r5 = r6.A0i
            if (r5 == 0) goto L_0x0248
            X.1Pp r4 = r6.A0Z
            int r0 = r6.A0E
            r4.A00 = r0
            r4.A04 = r2
            java.util.Map r0 = r4.A07
            r0.clear()
            r4.A02 = r5
            X.10I r3 = r4.A06
            r1 = 28
            X.AkI r0 = new X.AkI
            r0.<init>(r4, r5, r1)
            r3.CGF(r0)
            r0 = 1
            r4.A06(r2, r0)
        L_0x0248:
            X.1Pp r4 = r6.A0Z
            int r5 = r6.A0E
            r0 = 6
            r3 = 5
            if (r5 == r0) goto L_0x0394
            if (r5 == r3) goto L_0x0394
        L_0x0252:
            if (r5 != r3) goto L_0x025b
            X.1DT r1 = r6.A0R
            X.6RA r0 = X.AnonymousClass6RA.IMAGINE_ME
            r1.A0E(r0)
        L_0x025b:
            r0 = 2
            r4.A06(r0, r2)
            r0 = 3
            int[] r6 = new int[r0]
            r0 = 2131891269(0x7f121445, float:1.9417253E38)
            r5 = 0
            r6[r2] = r0
            r1 = 1
            r0 = 2131891271(0x7f121447, float:1.9417257E38)
            r6[r1] = r0
            r1 = 2
            r0 = 2131891270(0x7f121446, float:1.9417255E38)
            r6[r1] = r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r3 = 3
        L_0x0279:
            r1 = r6[r5]
            android.content.Context r0 = r12.A1n()
            if (r0 == 0) goto L_0x0294
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0294
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x0294
            java.lang.String r0 = X.C108975cc.A0d(r0)
            r4.add(r0)
        L_0x0294:
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x0279
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04b5
            r0.A07 = r4
            com.whatsapp.WaImageButton r1 = r12.A0H
            if (r1 == 0) goto L_0x02a6
            r0 = 7
            X.AnonymousClass3MZ.A1H(r1, r12, r0)
        L_0x02a6:
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A0e
            if (r1 == 0) goto L_0x02af
            r0 = 8
            X.AnonymousClass3MZ.A1H(r1, r12, r0)
        L_0x02af:
            boolean r0 = X.C108995ce.A1V(r12)
            if (r0 != 0) goto L_0x02be
            com.google.android.material.imageview.ShapeableImageView r1 = r12.A0D
            if (r1 == 0) goto L_0x02be
            android.view.View$OnLongClickListener r0 = r12.A0p
            r1.setOnLongClickListener(r0)
        L_0x02be:
            com.whatsapp.imagine.InputPrompt r0 = r12.A0Q
            if (r0 == 0) goto L_0x02ce
            X.6Ih r1 = r12.A0r
            X.C18070vi.A0d(r1, r2)
            com.whatsapp.WaEditText r0 = r0.A00
            if (r0 == 0) goto L_0x02ce
            r0.addTextChangedListener(r1)
        L_0x02ce:
            com.whatsapp.imagine.InputPrompt r0 = r12.A0Q
            if (r0 == 0) goto L_0x02de
            android.view.View$OnClickListener r1 = r12.A0i
            X.C18070vi.A0d(r1, r2)
            com.whatsapp.WaImageButton r0 = r0.A01
            if (r0 == 0) goto L_0x02de
            r0.setOnClickListener(r1)
        L_0x02de:
            X.5jD r0 = r12.A0J
            java.lang.String r11 = "viewModel"
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0K
            X.7y7 r0 = new X.7y7
            r0.<init>(r12)
            r2 = 10
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0O
            X.7y8 r0 = new X.7y8
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0U
            X.7y9 r0 = new X.7y9
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0R
            X.7yA r0 = new X.7yA
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0S
            X.7yB r0 = new X.7yB
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0L
            X.7yC r0 = new X.7yC
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0Q
            X.7yD r0 = new X.7yD
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0J
            X.7xy r0 = new X.7xy
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r4 = r12.A0J
            if (r4 == 0) goto L_0x04ae
            X.00H r0 = r4.A0o
            X.1UD r1 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0424
            X.0ve r3 = r1.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 10351(0x286f, float:1.4505E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x0424
            X.6ip r4 = r4.A0e
            X.1DT r5 = r4.A00
            java.lang.Object r0 = r5.A06()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C137476vW.A00(r0)
            if (r0 == 0) goto L_0x0432
            X.6e1 r0 = r4.A01
            X.0z4 r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "pref_imagine_edit_suggestions"
            r3 = 0
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 == 0) goto L_0x0409
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            goto L_0x03cb
        L_0x0394:
            X.63w r1 = new X.63w
            r1.<init>()
            r0 = 43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A03 = r0
            r0 = 1
            if (r5 != r3) goto L_0x03ab
            r0 = 2
        L_0x03ab:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            java.lang.Integer r0 = r4.A03
            r1.A05 = r0
            X.18K r0 = r4.A05
            r0.CC7(r1)
            goto L_0x0252
        L_0x03bc:
            r3 = r1
            goto L_0x017d
        L_0x03bf:
            androidx.viewpager2.widget.ViewPager2 r0 = r12.A0C
            if (r0 == 0) goto L_0x01bf
            r0.setVisibility(r1)
            goto L_0x01bf
        L_0x03c8:
            r0 = 0
            goto L_0x00ad
        L_0x03cb:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            java.lang.String r0 = "suggestions"
            org.json.JSONArray r10 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            int r8 = r10.length()     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            r7 = 0
        L_0x03da:
            if (r7 >= r8) goto L_0x042f
            org.json.JSONObject r1 = r10.getJSONObject(r7)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            java.lang.String r0 = "image_uri"
            java.lang.String r6 = r1.getString(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            java.lang.String r0 = "prompt"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            java.lang.String r0 = "short_prompt"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            java.lang.String r0 = "intent_uri"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            X.C108995ce.A1H(r6, r1, r4, r3)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            X.6se r0 = new X.6se     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            r0.<init>(r6, r1, r4, r3)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            r9.add(r0)     // Catch:{ JSONException -> 0x042a, NullPointerException -> 0x0406 }
            int r7 = r7 + 1
            goto L_0x03da
        L_0x0406:
            java.lang.String r0 = "deserializeSuggestionsFromString: Null pointer exception when parsing"
            goto L_0x042c
        L_0x0409:
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.11E r0 = (X.AnonymousClass11E) r0
            X.2mn r0 = r0.A00
            if (r0 == 0) goto L_0x0432
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0432
            X.1OX r1 = r4.A05
            com.whatsapp.data.graphql.imagine.suggestions.get.ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1 r0 = new com.whatsapp.data.graphql.imagine.suggestions.get.ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1
            r0.<init>(r5, r4, r3)
            X.AnonymousClass3MX.A1Q(r0, r1)
            goto L_0x0432
        L_0x0424:
            r0 = 0
            X.1DT r5 = X.AnonymousClass3MW.A0M(r0)
            goto L_0x0432
        L_0x042a:
            java.lang.String r0 = "deserializeSuggestionsFromString: JSON exception error when parsing"
        L_0x042c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x042f:
            r5.A0E(r9)
        L_0x0432:
            X.7xz r0 = new X.7xz
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r5, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0G
            X.7y0 r0 = new X.7y0
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0T
            X.7y1 r0 = new X.7y1
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0I
            X.7y2 r0 = new X.7y2
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1DT r1 = r0.A0H
            X.7y3 r0 = new X.7y3
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1wy r1 = r0.A0m
            X.7y4 r0 = new X.7y4
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1wy r1 = r0.A0k
            X.7y5 r0 = new X.7y5
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            X.5jD r0 = r12.A0J
            if (r0 == 0) goto L_0x04ae
            X.1wy r1 = r0.A0l
            X.7y6 r0 = new X.7y6
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r2)
            android.view.View r1 = r12.A0B
            boolean r0 = r1 instanceof com.whatsapp.bot.metaai.imagine.InterceptKeyboardPopupLayout
            if (r0 == 0) goto L_0x04ad
            com.whatsapp.bot.metaai.imagine.InterceptKeyboardPopupLayout r1 = (com.whatsapp.bot.metaai.imagine.InterceptKeyboardPopupLayout) r1
            if (r1 == 0) goto L_0x04ad
            X.7D3 r0 = new X.7D3
            r0.<init>(r12)
            r1.A00 = r0
        L_0x04ad:
            return
        L_0x04ae:
            X.C18070vi.A11(r11)
            goto L_0x04ba
        L_0x04b2:
            java.lang.String r0 = "aiImagineBottomSheetViewModelFactory"
            goto L_0x04b7
        L_0x04b5:
            java.lang.String r0 = "viewModel"
        L_0x04b7:
            X.C18070vi.A11(r0)
        L_0x04ba:
            r0 = 0
            throw r0
        L_0x04bc:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public static final void A02(AiImagineBottomSheet aiImagineBottomSheet) {
        View A022;
        View findViewById;
        View A023;
        ImageView A0H2;
        View A024;
        View findViewById2;
        C28931bI r0 = aiImagineBottomSheet.A0Z;
        int i = 0;
        if (r0 != null) {
            r0.A04(0);
        }
        C28931bI r02 = aiImagineBottomSheet.A0Z;
        if (!(r02 == null || (A024 = r02.A02()) == null || (findViewById2 = A024.findViewById(2131435142)) == null)) {
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(aiImagineBottomSheet.A0o);
        }
        C28931bI r03 = aiImagineBottomSheet.A0Z;
        if (!(r03 == null || (A023 = r03.A02()) == null || (A0H2 = AnonymousClass3MW.A0H(A023, 2131435001)) == null)) {
            if (aiImagineBottomSheet.A00 != 1) {
                i = 8;
            }
            A0H2.setVisibility(i);
            A0H2.setImageResource(2131233513);
            AnonymousClass3MZ.A1H(A0H2, aiImagineBottomSheet, 5);
        }
        C28931bI r04 = aiImagineBottomSheet.A0Z;
        if (r04 != null && (A022 = r04.A02()) != null && (findViewById = A022.findViewById(2131429013)) != null) {
            AnonymousClass3MY.A0v(findViewById.getContext(), findViewById, 2131232906);
            findViewById.setVisibility(8);
        }
    }

    public static final void A03(AiImagineBottomSheet aiImagineBottomSheet) {
        View A022;
        View findViewById;
        View A023;
        View A024;
        View findViewById2;
        View A025;
        int i = aiImagineBottomSheet.A00;
        if (i != 6 && i != 5) {
            C28931bI r0 = aiImagineBottomSheet.A0W;
            if (r0 != null) {
                r0.A04(0);
            }
            C28931bI r02 = aiImagineBottomSheet.A0W;
            if (!(r02 == null || (A025 = r02.A02()) == null)) {
                C72463Mc.A16(A025, 2131430265, 0);
            }
            C28931bI r03 = aiImagineBottomSheet.A0W;
            if (!(r03 == null || (A024 = r03.A02()) == null || (findViewById2 = A024.findViewById(2131435373)) == null)) {
                findViewById2.setOnClickListener(aiImagineBottomSheet.A0o);
            }
            C28931bI r04 = aiImagineBottomSheet.A0W;
            if (!(r04 == null || (A023 = r04.A02()) == null)) {
                C72453Mb.A1B(A023.findViewById(2131431576));
            }
            C28931bI r05 = aiImagineBottomSheet.A0W;
            if (r05 != null && (A022 = r05.A02()) != null && (findViewById = A022.findViewById(2131430268)) != null) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(aiImagineBottomSheet.A0w);
            }
        }
    }

    public static final void A04(AiImagineBottomSheet aiImagineBottomSheet) {
        ViewPager2 viewPager2 = aiImagineBottomSheet.A0C;
        if ((viewPager2 == null || viewPager2.A04.A0B == null) && C108995ce.A1V(aiImagineBottomSheet)) {
            C111225jD r0 = aiImagineBottomSheet.A0J;
            if (r0 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            C111905kc r1 = new C111905kc(r0);
            ViewPager2 viewPager22 = aiImagineBottomSheet.A0C;
            if (viewPager22 != null) {
                viewPager22.setAdapter(r1);
            }
            ViewPager2 viewPager23 = aiImagineBottomSheet.A0C;
            if (viewPager23 != null) {
                viewPager23.A04((C6T) aiImagineBottomSheet.A0u.getValue());
            }
        }
    }

    public static final void A05(AiImagineBottomSheet aiImagineBottomSheet) {
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        int i;
        int i2;
        ConstraintLayout constraintLayout;
        ViewTreeObserver viewTreeObserver;
        ConstraintLayout constraintLayout2 = aiImagineBottomSheet.A07;
        if (constraintLayout2 != null) {
            C111225jD r0 = aiImagineBottomSheet.A0J;
            if (r0 == null) {
                C18070vi.A11("viewModel");
                throw null;
            } else if (r0.A0Y.A03 == 0.0f) {
                ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                ShapeableImageView shapeableImageView = aiImagineBottomSheet.A0D;
                if (shapeableImageView != null) {
                    layoutParams = shapeableImageView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                boolean A1V = C108995ce.A1V(aiImagineBottomSheet);
                Context A1n = aiImagineBottomSheet.A1n();
                if (A1V) {
                    if (A1n != null && (resources = A1n.getResources()) != null) {
                        i = 2131167032;
                    } else {
                        return;
                    }
                } else if (A1n != null && (resources = A1n.getResources()) != null) {
                    i = 2131167031;
                } else {
                    return;
                }
                float A002 = AnonymousClass3MW.A00(resources, i);
                if (Float.valueOf(A002) != null) {
                    ConstraintLayout constraintLayout3 = aiImagineBottomSheet.A08;
                    int i3 = 0;
                    if (constraintLayout3 != null) {
                        i2 = constraintLayout3.getWidth();
                    } else {
                        i2 = 0;
                    }
                    ConstraintLayout constraintLayout4 = aiImagineBottomSheet.A08;
                    if (constraintLayout4 != null) {
                        i3 = constraintLayout4.getHeight();
                    }
                    float min = ((float) Math.min(i2, i3)) - A002;
                    if (Float.valueOf(min) != null && layoutParams2 != null) {
                        int i4 = (int) min;
                        layoutParams2.height = i4;
                        layoutParams2.width = i4;
                        ConstraintLayout constraintLayout5 = aiImagineBottomSheet.A07;
                        if (constraintLayout5 != null) {
                            constraintLayout5.setLayoutParams(layoutParams2);
                        }
                        ConstraintLayout constraintLayout6 = aiImagineBottomSheet.A07;
                        if (constraintLayout6 != null) {
                            constraintLayout6.requestLayout();
                        }
                        C111225jD r02 = aiImagineBottomSheet.A0J;
                        if (r02 == null) {
                            C18070vi.A11("viewModel");
                            throw null;
                        }
                        if (!(r02.A0U.A06() != AnonymousClass6RH.SELECTING_OPTION || (constraintLayout = aiImagineBottomSheet.A07) == null || (viewTreeObserver = constraintLayout.getViewTreeObserver()) == null)) {
                            viewTreeObserver.addOnGlobalLayoutListener(aiImagineBottomSheet.A0x);
                        }
                        if (layoutParams != null) {
                            layoutParams.width = i4;
                            layoutParams.height = i4;
                        }
                        ShapeableImageView shapeableImageView2 = aiImagineBottomSheet.A0D;
                        if (shapeableImageView2 != null) {
                            shapeableImageView2.setLayoutParams(layoutParams);
                        }
                        ShapeableImageView shapeableImageView3 = aiImagineBottomSheet.A0D;
                        if (shapeableImageView3 != null) {
                            shapeableImageView3.requestLayout();
                        }
                        C111225jD r03 = aiImagineBottomSheet.A0J;
                        if (r03 == null) {
                            C18070vi.A11("viewModel");
                            throw null;
                        } else {
                            r03.A0Y.A03 = min;
                        }
                    }
                }
            }
        }
    }

    public static final void A06(AiImagineBottomSheet aiImagineBottomSheet) {
        View A022;
        C28931bI r0 = aiImagineBottomSheet.A0Y;
        if (r0 != null && r0.A01() == 8) {
            C28931bI r1 = aiImagineBottomSheet.A0Y;
            if (r1 != null) {
                r1.A04(0);
            }
            C28931bI r02 = aiImagineBottomSheet.A0Y;
            if (r02 != null && (A022 = r02.A02()) != null) {
                A022.setAlpha(0.0f);
                C108985cd.A0G(A022).setDuration(250).start();
            }
        }
    }

    public static final void A07(AiImagineBottomSheet aiImagineBottomSheet) {
        WaEditText waEditText;
        InputPrompt inputPrompt = aiImagineBottomSheet.A0Q;
        if (inputPrompt != null && (waEditText = inputPrompt.A00) != null) {
            waEditText.requestFocus();
            waEditText.A0I(false);
        }
    }

    public static final void A08(AiImagineBottomSheet aiImagineBottomSheet) {
        C28931bI r5;
        int A042 = C108975cc.A04(aiImagineBottomSheet.A0S);
        C108955ca.A1N(aiImagineBottomSheet, A042);
        C28931bI r0 = aiImagineBottomSheet.A0S;
        if (r0 != null) {
            r0.A04(A042);
        }
        if (A0G(aiImagineBottomSheet) && (r5 = aiImagineBottomSheet.A0Z) != null) {
            C111225jD r02 = aiImagineBottomSheet.A0J;
            if (r02 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            Object A062 = r02.A0U.A06();
            int i = 0;
            if (A062 == AnonymousClass6RH.GENERATING_IMAGINE_FLASH) {
                i = 8;
            }
            ImageView A0H2 = AnonymousClass3MW.A0H(AnonymousClass3MY.A0I(r5, i), 2131435142);
            if (A0H2 != null) {
                A0H2.setVisibility(0);
                A0H2.setOnClickListener(aiImagineBottomSheet.A0o);
                A0H2.setImageResource(2131231491);
            }
            C72463Mc.A16(r5.A02(), 2131435001, A042);
            C72463Mc.A16(r5.A02(), 2131429013, A042);
        }
    }

    public static final void A09(AiImagineBottomSheet aiImagineBottomSheet, int i) {
        C28931bI r0;
        View A022;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        Resources resources;
        C111225jD r02 = aiImagineBottomSheet.A0J;
        Integer num = null;
        if (r02 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else if (!r02.A0D && (r0 = aiImagineBottomSheet.A0W) != null && (A022 = r0.A02()) != null && (findViewById = A022.findViewById(2131435373)) != null) {
            if (!(findViewById instanceof LinearLayout)) {
                findViewById = null;
            }
            Context A1n = aiImagineBottomSheet.A1n();
            if (!(A1n == null || (resources = A1n.getResources()) == null)) {
                num = AnonymousClass3MY.A0i(resources, 2131167020);
            }
            if (findViewById != null && num != null) {
                int intValue = num.intValue();
                if (i == -2) {
                    layoutParams = new LinearLayout.LayoutParams(i, intValue);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(i, intValue, 1.0f);
                }
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void A0A(AiImagineBottomSheet aiImagineBottomSheet, C130296jC r7) {
        View A022;
        String str;
        String str2;
        C111225jD r0 = aiImagineBottomSheet.A0J;
        RecyclerView recyclerView = null;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        List A10 = AnonymousClass3MW.A10(r0.A0G);
        if (A10 != null) {
            Iterator it = A10.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                C130296jC r02 = ((C127036dh) it.next()).A00;
                if (r02 != null) {
                    str = r02.A03;
                } else {
                    str = null;
                }
                if (r7 != null) {
                    str2 = r7.A03;
                } else {
                    str2 = null;
                }
                if (C18070vi.A18(str, str2)) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                C28931bI r03 = aiImagineBottomSheet.A0Y;
                if (!(r03 == null || (A022 = r03.A02()) == null || (recyclerView = AnonymousClass3MX.A0Q(A022, 2131431555)) == null)) {
                    int intValue = valueOf.intValue();
                    C42011xT A0P2 = recyclerView.A0P(intValue, false);
                    if (A0P2 != null) {
                        A01(A0P2, recyclerView);
                        return;
                    }
                    recyclerView.A0f(intValue);
                }
                AnonymousClass1KB r3 = aiImagineBottomSheet.A0F;
                if (r3 != null) {
                    r3.A0K(new C21434Ak1(recyclerView, valueOf, aiImagineBottomSheet, 4), 50);
                } else {
                    AnonymousClass3MW.A1C();
                    throw null;
                }
            }
        }
    }

    public static final void A0B(AiImagineBottomSheet aiImagineBottomSheet, C127036dh r10, int i) {
        Integer num;
        View A022;
        RecyclerView A0Q2;
        C113065mU r2;
        AnonymousClass1DT r3;
        Object A062;
        AnonymousClass6R5 r22;
        C127036dh r0;
        C113065mU r4;
        C127036dh r02;
        C111225jD r03 = aiImagineBottomSheet.A0J;
        if (r03 == null) {
            C18070vi.A11("viewModel");
            throw null;
        }
        List A10 = AnonymousClass3MW.A10(r03.A0G);
        if (A10 != null) {
            Iterator it = A10.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((C127036dh) it.next()).A01.A06() == AnonymousClass6R5.DISPLAY_IMAGE_SELECTED) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            num = Integer.valueOf(i2);
            if (num != null && num.intValue() == i) {
                return;
            }
        } else {
            num = null;
        }
        C28931bI r04 = aiImagineBottomSheet.A0Y;
        if (r04 != null && (A022 = r04.A02()) != null && (A0Q2 = AnonymousClass3MX.A0Q(A022, 2131431555)) != null) {
            C38391rD r5 = A0Q2.A0B;
            if (!(r5 instanceof C111945kg)) {
                r5 = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                C42011xT A0O2 = A0Q2.A0O(intValue);
                if ((A0O2 instanceof C113065mU) && (r4 = (C113065mU) A0O2) != null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(aiImagineBottomSheet.A1n(), 2130772000);
                    C72453Mb.A1R(loadAnimation);
                    loadAnimation.setFillAfter(true);
                    r4.A01.startAnimation(loadAnimation);
                    C111225jD r05 = aiImagineBottomSheet.A0J;
                    if (r05 == null) {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                    int intValue2 = num.intValue();
                    List A102 = AnonymousClass3MW.A10(r05.A0G);
                    if (!(A102 == null || (r02 = (C127036dh) C29431cG.A0f(A102, intValue2)) == null)) {
                        r02.A01.A0F(AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED);
                    }
                    if (r5 != null) {
                        r5.A0G(intValue);
                    }
                } else if (intValue >= 0) {
                    C111225jD r06 = aiImagineBottomSheet.A0J;
                    if (r06 == null) {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                    int intValue3 = num.intValue();
                    List A103 = AnonymousClass3MW.A10(r06.A0G);
                    if (!(A103 == null || (r0 = (C127036dh) C29431cG.A0f(A103, intValue3)) == null)) {
                        r0.A01.A0F(AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED);
                    }
                    if (r5 != null) {
                        r5.A0G(intValue);
                    }
                }
            }
            C42011xT A0O3 = A0Q2.A0O(i);
            if (A0O3 instanceof C113065mU) {
                r2 = (C113065mU) A0O3;
            } else {
                r2 = null;
            }
            Animation loadAnimation2 = AnimationUtils.loadAnimation(aiImagineBottomSheet.A1n(), 2130772001);
            if (r2 != null) {
                C72453Mb.A1R(loadAnimation2);
                loadAnimation2.setFillAfter(true);
                r2.A01.startAnimation(loadAnimation2);
            }
            C111225jD r42 = aiImagineBottomSheet.A0J;
            if (r42 == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            if (!(r10 == null || r10.A00 == null || (A062 = r3.A06()) == null || (A062 != (r22 = AnonymousClass6R5.DISPLAY_IMAGE_SELECTED) && A062 != AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED))) {
                r42.A0O.A0E(r10.A00);
                (r3 = r10.A01).A0F(r22);
            }
            if (r5 != null) {
                r5.A0G(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r3, boolean r4) {
        /*
            java.lang.String r2 = "viewModel"
            if (r4 == 0) goto L_0x000a
            boolean r0 = A0G(r3)
            if (r0 != 0) goto L_0x003f
        L_0x000a:
            X.5jD r0 = r3.A0J
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x003f
            com.whatsapp.imagine.InputPrompt r0 = r3.A0Q
            if (r0 == 0) goto L_0x001f
            com.whatsapp.WaImageButton r1 = r0.A01
            if (r1 == 0) goto L_0x001f
            r0 = 8
        L_0x001c:
            r1.setVisibility(r0)
        L_0x001f:
            X.5jD r0 = r3.A0J
            if (r0 == 0) goto L_0x0049
            X.1DT r0 = r0.A0U
            java.lang.Object r1 = r0.A06()
            if (r1 == 0) goto L_0x003e
            X.6RH r0 = X.AnonymousClass6RH.IMAGINE_EDIT_PREFIX_SELECTED
            if (r1 == r0) goto L_0x0033
            X.6RH r0 = X.AnonymousClass6RH.IMAGINE_EDIT
            if (r1 != r0) goto L_0x003e
        L_0x0033:
            X.1bI r1 = r3.A0T
            if (r1 == 0) goto L_0x003e
            int r0 = X.C72453Mb.A01(r4)
            r1.A04(r0)
        L_0x003e:
            return
        L_0x003f:
            com.whatsapp.imagine.InputPrompt r0 = r3.A0Q
            if (r0 == 0) goto L_0x001f
            com.whatsapp.WaImageButton r1 = r0.A01
            if (r1 == 0) goto L_0x001f
            r0 = 0
            goto L_0x001c
        L_0x0049:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet.A0D(com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet, boolean):void");
    }

    public static final void A0F(AiImagineBottomSheet aiImagineBottomSheet, boolean z, boolean z2) {
        View A022;
        C28931bI r0;
        View A023;
        ViewStub viewStub;
        WDSButton wDSButton;
        C28931bI r02 = aiImagineBottomSheet.A0b;
        if (z2) {
            if (r02 != null) {
                r02.A04(0);
            }
            C111225jD r03 = aiImagineBottomSheet.A0J;
            if (r03 != null) {
                if (!(r03.A0U.A06() == AnonymousClass6RH.GENERATING_IMAGINE_FLASH || (wDSButton = aiImagineBottomSheet.A0e) == null)) {
                    wDSButton.setVisibility(0);
                }
                C28931bI r04 = aiImagineBottomSheet.A0b;
                if (!(r04 == null || (viewStub = r04.A01) == null)) {
                    viewStub.setLayoutResource(aiImagineBottomSheet.A01);
                }
                C111225jD r1 = aiImagineBottomSheet.A0J;
                if (r1 != null) {
                    if (!(r1.A06 == null || r1.A0U.A06() != AnonymousClass6RH.SELECTING_OPTION || (r0 = aiImagineBottomSheet.A0b) == null || (A023 = r0.A02()) == null)) {
                        A023.setAlpha(0.0f);
                        ViewPropertyAnimator duration = C108985cd.A0G(A023).setDuration(50);
                        C18070vi.A0X(duration);
                        duration.setStartDelay(250);
                        duration.start();
                    }
                    C28931bI r05 = aiImagineBottomSheet.A0b;
                    if (r05 != null && (A022 = r05.A02()) != null) {
                        if (z) {
                            A022.setBackgroundResource(2131103241);
                            return;
                        } else {
                            A022.setBackgroundResource(0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        int A042 = C108975cc.A04(r02);
        WDSButton wDSButton2 = aiImagineBottomSheet.A0e;
        if (wDSButton2 != null) {
            wDSButton2.setVisibility(A042);
        }
    }

    public static final boolean A0G(AiImagineBottomSheet aiImagineBottomSheet) {
        C111225jD r0 = aiImagineBottomSheet.A0J;
        if (r0 != null) {
            if (r0.A0O.A06() != null) {
                C111225jD r02 = aiImagineBottomSheet.A0J;
                if (r02 != null) {
                    C130296jC A032 = C111225jD.A03(r02);
                    if (A032 == null || A032.A00 == null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void A1t() {
        C28931bI r0;
        View A022;
        VideoView videoView;
        C111225jD r02 = this.A0J;
        if (r02 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        if (!(r02.A0U.A06() != AnonymousClass6RH.IMAGINE_ANIMATE || (r0 = this.A0X) == null || (A022 = r0.A02()) == null || (videoView = (VideoView) A022.findViewById(2131431549)) == null)) {
            videoView.pause();
        }
        super.A1t();
    }

    public void A1u() {
        C28931bI r0;
        View A022;
        VideoView videoView;
        C111225jD r02 = this.A0J;
        if (r02 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        if (!(r02.A0U.A06() != AnonymousClass6RH.IMAGINE_ANIMATE || (r0 = this.A0X) == null || (A022 = r0.A02()) == null || (videoView = (VideoView) A022.findViewById(2131431549)) == null)) {
            videoView.start();
        }
        super.A1u();
    }

    public static final void A00(MotionEvent motionEvent, AiImagineBottomSheet aiImagineBottomSheet) {
        View A022;
        Rect A072 = AnonymousClass3MW.A07();
        C28931bI r0 = aiImagineBottomSheet.A0c;
        if (!(r0 == null || (A022 = r0.A02()) == null)) {
            A022.getGlobalVisibleRect(A072);
        }
        if (!A072.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            AnonymousClass3Ma.A1M(aiImagineBottomSheet.A0c);
        }
    }

    public static final void A0C(AiImagineBottomSheet aiImagineBottomSheet, boolean z) {
        int A0D2;
        View view;
        if (C108995ce.A1V(aiImagineBottomSheet)) {
            A0D2 = C72453Mb.A0D(aiImagineBottomSheet.A0D);
            view = aiImagineBottomSheet.A0C;
        } else {
            A0D2 = C72453Mb.A0D(aiImagineBottomSheet.A0C);
            view = aiImagineBottomSheet.A0D;
        }
        if (z) {
            if (view != null) {
                A0D2 = 0;
            } else {
                return;
            }
        } else if (view == null) {
            return;
        }
        view.setVisibility(A0D2);
    }

    public void A1r() {
        super.A1r();
        C111225jD r0 = this.A0J;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else {
            r0.A0T();
        }
    }

    public void A1s() {
        InterceptKeyboardPopupLayout interceptKeyboardPopupLayout;
        super.A1s();
        this.A0I = null;
        this.A03 = null;
        this.A05 = null;
        this.A04 = null;
        this.A0C = null;
        this.A06 = null;
        this.A08 = null;
        this.A0B = null;
        this.A0H = null;
        this.A0D = null;
        this.A07 = null;
        this.A0Q = null;
        View view = this.A0B;
        if ((view instanceof InterceptKeyboardPopupLayout) && (interceptKeyboardPopupLayout = (InterceptKeyboardPopupLayout) view) != null) {
            interceptKeyboardPopupLayout.A00 = null;
        }
        this.A0e = null;
    }

    public Dialog A27(Bundle bundle) {
        Window window;
        Dialog A27 = super.A27(bundle);
        Context A1n = A1n();
        if (!(A1n == null || (window = A27.getWindow()) == null)) {
            window.setNavigationBarColor(C19740yt.A00(A1n, 2131099919));
        }
        C110745gz r1 = (C110745gz) A27;
        if (r1 != null) {
            if (r1.A01 == null) {
                C110745gz.A02(r1);
            }
            BottomSheetBehavior bottomSheetBehavior = r1.A01;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0Z(new C114315qV(this, 3));
            }
        }
        return A27;
    }
}
