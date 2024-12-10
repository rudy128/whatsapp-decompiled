package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.3wT  reason: invalid class name and case insensitive filesystem */
public final class C80053wT extends AnonymousClass3Q2 implements AnonymousClass009 {
    public int A00;
    public View A01;
    public FrameLayout A02;
    public RecyclerView A03;
    public AnonymousClass11S A04;
    public AnonymousClass11C A05;
    public AnonymousClass11P A06;
    public C18000vb A07;
    public AnonymousClass1CJ A08;
    public C1193167q A09;
    public C18030ve A0A;
    public C18010vc A0B;
    public C32731hf A0C;
    public C191569mo A0D;
    public AnonymousClass1DC A0E;
    public AnonymousClass10I A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass031 A0H;
    public boolean A0I;
    public final VelocityTracker A0J;
    public final ReactionsTrayViewModel A0K;
    public final int[] A0L;
    public final AnimatorSet A0M;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setFMessagePropertySubsystem(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public final void setFrequentReactions(C1193167q r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setReactionStatsManager(C32731hf r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setReactionUserJourney(C191569mo r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.graphics.drawable.Drawable} */
    /* JADX WARNING: type inference failed for: r19v1, types: [java.lang.Object, X.4rD] */
    /* JADX WARNING: type inference failed for: r20v1, types: [java.lang.Object, X.4rD] */
    /* JADX WARNING: type inference failed for: r21v1, types: [java.lang.Object, X.4rD] */
    /* JADX WARNING: type inference failed for: r18v1, types: [java.lang.Object, X.DRh] */
    /* JADX WARNING: type inference failed for: r17v1, types: [java.lang.Object, X.DRh] */
    /* JADX WARNING: type inference failed for: r16v1, types: [X.1Dh, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C80053wT(android.content.Context r25, com.whatsapp.reactions.ReactionsTrayViewModel r26) {
        /*
            r24 = this;
            r15 = r24
            r0 = r25
            r15.<init>(r0)
            boolean r0 = r15.A0I
            if (r0 != 0) goto L_0x007c
            r0 = 1
            r15.A0I = r0
            java.lang.Object r0 = r15.generatedComponent()
            X.10E r2 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r2)
            r15.A0A = r0
            X.1CJ r0 = X.AnonymousClass3Ma.A0d(r2)
            r15.A08 = r0
            X.00S r0 = r2.AP1
            X.00H r0 = X.C000200d.A00(r0)
            r15.A0G = r0
            X.10G r1 = r2.A00
            X.00S r0 = r1.ABP
            java.lang.Object r0 = r0.get()
            X.67q r0 = (X.C1193167q) r0
            r15.A09 = r0
            X.11S r0 = X.AnonymousClass10E.A17(r2)
            r15.A04 = r0
            X.00S r0 = r2.Afs
            java.lang.Object r0 = r0.get()
            X.1hf r0 = (X.C32731hf) r0
            r15.A0C = r0
            X.00S r0 = r1.AG1
            java.lang.Object r0 = r0.get()
            X.9mo r0 = (X.C191569mo) r0
            r15.A0D = r0
            X.0vc r0 = X.AnonymousClass3Ma.A0r(r2)
            r15.A0B = r0
            X.1DC r0 = X.AnonymousClass3MZ.A13(r2)
            r15.A0E = r0
            X.11C r0 = X.AnonymousClass3Ma.A0a(r2)
            r15.A05 = r0
            X.11P r0 = X.AnonymousClass10E.A6O(r2)
            r15.A06 = r0
            X.10I r0 = X.AnonymousClass10E.AL1(r2)
            r15.A0F = r0
            X.0vb r0 = X.AnonymousClass10E.A6Q(r2)
            r15.A07 = r0
        L_0x007c:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r15.A0M = r0
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            X.C18070vi.A0X(r0)
            r15.A0J = r0
            r0 = r26
            r15.A0K = r0
            int r0 = r0.A00
            int r0 = r0 + 1
            int[] r0 = new int[r0]
            r15.A0L = r0
            r0 = 2131434375(0x7f0b1b87, float:1.8490562E38)
            r15.setId(r0)
            r0 = 0
            r15.setClipChildren(r0)
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass3Ma.A0D()
            r15.setLayoutParams(r1)
            r15.setOrientation(r0)
            android.content.Context r3 = r15.getContext()
            r2 = 2130970914(0x7f040922, float:1.7550552E38)
            r1 = 2131102343(0x7f060a87, float:1.7817121E38)
            int r7 = X.AnonymousClass1YL.A00(r3, r2, r1)
            r4 = 2131168420(0x7f070ca4, float:1.7951141E38)
            r3 = 2131168417(0x7f070ca1, float:1.7951135E38)
            r2 = 2131099876(0x7f0600e4, float:1.7812118E38)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r15)
            float r8 = r1.getDimension(r3)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r15)
            int r6 = X.AnonymousClass3MW.A01(r1, r4)
            int r5 = X.AnonymousClass3MY.A02(r15, r2)
            int r2 = X.AnonymousClass3MY.A02(r15, r7)
            r1 = 8
            float[] r3 = new float[r1]
            r3[r0] = r8
            r7 = 1
            X.C72483Me.A19(r3, r8)
            android.graphics.drawable.ShapeDrawable r5 = X.C72483Me.A0H(r6, r2, r5)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r2 >= r1) goto L_0x00f6
            android.graphics.Paint r1 = r5.getPaint()
            r15.setLayerType(r7, r1)
        L_0x00f6:
            r2 = 0
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r1.<init>(r3, r2, r2)
            r5.setShape(r1)
            X.0ve r3 = r15.getAbProps()
            r2 = 11823(0x2e2f, float:1.6568E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r1, r3, r2)
            if (r2 == 0) goto L_0x03bd
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            r3.<init>(r5, r6)
        L_0x0112:
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r15.setBackground(r3)
            android.content.res.Resources r3 = r15.getResources()
            r2 = 2131168427(0x7f070cab, float:1.7951156E38)
            int r3 = r3.getDimensionPixelSize(r2)
            int r2 = X.AnonymousClass3Ma.A02(r15, r4)
            int r3 = r3 + r2
            r15.A00 = r3
            r15.setPadding(r3, r3, r3, r3)
            com.whatsapp.reactions.ReactionsTrayViewModel r5 = r15.A0K
            java.util.List r2 = r5.A07
            int r2 = r2.size()
            float r4 = (float) r2
            boolean r14 = r5.A0X()
            X.0ve r2 = r15.getAbProps()
            r13 = 11094(0x2b56, float:1.5546E-41)
            boolean r2 = X.C18020vd.A05(r1, r2, r13)
            r10 = -1
            if (r2 == 0) goto L_0x021f
            java.util.List r2 = r5.A07
            int r3 = r2.size()
            int r2 = r5.A00
            if (r3 <= r2) goto L_0x03b4
            if (r14 == 0) goto L_0x03b4
            float r4 = (float) r2
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r4 = r4 + r2
        L_0x0157:
            android.widget.FrameLayout r7 = X.AnonymousClass3Ma.A0B(r15)
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r7)
            r2 = 2131168425(0x7f070ca9, float:1.7951151E38)
            int r3 = r3.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r7)
            r6 = 2131168421(0x7f070ca5, float:1.7951143E38)
            int r2 = X.AnonymousClass3MX.A00(r2, r6, r3)
            float r2 = (float) r2
            float r2 = r2 * r4
            int r3 = (int) r2
            int r2 = X.AnonymousClass3Ma.A02(r7, r6)
            int r3 = r3 - r2
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r3, r10)
            r7.setLayoutParams(r2)
            r7.setClipChildren(r0)
            r7.setClipToOutline(r0)
            r15.A02 = r7
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r15)
            r2 = 2131168418(0x7f070ca2, float:1.7951137E38)
            int r3 = r3.getDimensionPixelSize(r2)
            android.view.View r12 = X.C72453Mb.A0R(r15)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r3, r3)
            r12.setLayoutParams(r2)
            android.content.Context r6 = r15.getContext()
            r2 = 2131102343(0x7f060a87, float:1.7817121E38)
            int r8 = X.C19740yt.A00(r6, r2)
            r7 = 5
            int[] r11 = new int[r7]
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r8 & r2
            r11[r0] = r6
            r2 = 1
            r11[r2] = r6
            r2 = 150(0x96, float:2.1E-43)
            int r6 = X.AnonymousClass1Z2.A06(r8, r2)
            r2 = 2
            r11[r2] = r6
            r2 = 220(0xdc, float:3.08E-43)
            int r6 = X.AnonymousClass1Z2.A06(r8, r2)
            r2 = 3
            r11[r2] = r6
            r2 = 255(0xff, float:3.57E-43)
            int r6 = X.AnonymousClass1Z2.A06(r8, r2)
            r2 = 4
            r11[r2] = r6
            float[] r9 = new float[r7]
            r9 = {0, 1057803469, 1060320051, 1061997773, 1063675494} // fill-array
            android.graphics.drawable.ShapeDrawable r8 = X.C72453Mb.A0P()
            android.graphics.Paint r7 = r8.getPaint()
            X.0vb r2 = r15.getWhatsAppLocale()
            boolean r2 = X.AnonymousClass3MY.A1b(r2)
            r6 = 0
            if (r2 == 0) goto L_0x01ec
            float r6 = (float) r3
        L_0x01ec:
            float r3 = (float) r3
            r2 = 1073741824(0x40000000, float:2.0)
            float r18 = r3 / r2
            android.graphics.Shader$TileMode r22 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            r20 = r11
            r21 = r9
            r17 = r6
            r19 = r3
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7.setShader(r2)
            r12.setBackground(r8)
            r15.A01 = r12
            r15.getWhatsAppLocale()
            android.view.View r6 = r15.A01
            if (r6 == 0) goto L_0x03d5
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r15)
            r2 = 2131168419(0x7f070ca3, float:1.795114E38)
            int r2 = r3.getDimensionPixelSize(r2)
            X.C27641Ww.A03(r6, r2, r0)
        L_0x021f:
            android.content.Context r3 = r15.getContext()
            r2 = 0
            androidx.recyclerview.widget.RecyclerView r6 = new androidx.recyclerview.widget.RecyclerView
            r6.<init>(r3, r2)
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r6)
            r2 = 2131168425(0x7f070ca9, float:1.7951151E38)
            r3 = 2131168425(0x7f070ca9, float:1.7951151E38)
            int r8 = r7.getDimensionPixelSize(r2)
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r6)
            r2 = 2131168421(0x7f070ca5, float:1.7951143E38)
            int r7 = X.AnonymousClass3MX.A00(r7, r2, r8)
            float r7 = (float) r7
            float r7 = r7 * r4
            int r7 = (int) r7
            int r4 = X.AnonymousClass3Ma.A02(r6, r2)
            int r7 = r7 - r4
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r7, r10)
            r6.setLayoutParams(r4)
            android.content.Context r7 = r6.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r7, r0, r0)
            r6.setLayoutManager(r4)
            r4 = 2
            r6.setOverScrollMode(r4)
            android.content.res.Resources r4 = X.AnonymousClass000.A0Y(r6)
            int r8 = r4.getDimensionPixelSize(r3)
            X.0vb r4 = r15.getWhatsAppLocale()
            boolean r7 = X.AnonymousClass3MY.A1b(r4)
            X.3OL r4 = new X.3OL
            r4.<init>(r8, r7)
            r6.setOutlineProvider(r4)
            r4 = 1
            r6.setClipToOutline(r4)
            android.content.Context r17 = X.AnonymousClass3MY.A04(r6)
            X.1DC r22 = r15.getSystemFeatures()
            X.0ve r20 = r15.getAbProps()
            X.67q r19 = r15.getFrequentReactions()
            X.10I r23 = r15.getWaWorkers()
            X.0vb r18 = r15.getWhatsAppLocale()
            X.3Wo r4 = new X.3Wo
            r21 = r5
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r6.setAdapter(r4)
            r15.A03 = r6
            X.0ve r4 = r15.getAbProps()
            boolean r4 = X.C18020vd.A05(r1, r4, r13)
            java.lang.String r7 = "emojiRecyclerView"
            if (r4 == 0) goto L_0x03a9
            android.widget.FrameLayout r5 = r15.A02
            java.lang.String r6 = "reactionTrayContainer"
            if (r5 == 0) goto L_0x03d1
            androidx.recyclerview.widget.RecyclerView r4 = r15.A03
            if (r4 == 0) goto L_0x03db
            r5.addView(r4)
            android.widget.FrameLayout r5 = r15.A02
            if (r5 == 0) goto L_0x03d1
            android.view.View r4 = r15.A01
            if (r4 == 0) goto L_0x03d5
            r5.addView(r4)
            android.widget.FrameLayout r4 = r15.A02
            if (r4 == 0) goto L_0x03d1
            r15.addView(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r15.A03
            if (r5 == 0) goto L_0x03db
            X.3XX r4 = new X.3XX
            r4.<init>(r15)
            r5.A0t(r4)
            if (r14 == 0) goto L_0x0383
            X.0ve r5 = r15.getAbProps()
            r4 = 12533(0x30f5, float:1.7562E-41)
            boolean r4 = X.C18020vd.A05(r1, r5, r4)
            if (r4 == 0) goto L_0x0326
            X.4rD r19 = new X.4rD
            r19.<init>()
            X.4rD r20 = new X.4rD
            r20.<init>()
            X.4rD r21 = new X.4rD
            r21.<init>()
            X.DRh r18 = new X.DRh
            r18.<init>()
            X.DRh r17 = new X.DRh
            r17.<init>()
            X.1Dh r16 = new X.1Dh
            r16.<init>()
            int r22 = X.AnonymousClass3Ma.A02(r15, r3)
            int r3 = X.AnonymousClass3Ma.A02(r15, r2)
            int r22 = r22 + r3
            androidx.recyclerview.widget.RecyclerView r4 = r15.A03
            if (r4 == 0) goto L_0x03db
            X.3XW r3 = new X.3XW
            r3.<init>()
            r4.A0E = r3
            X.D74 r14 = new X.D74
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r3 = r4.A12
            r3.add(r14)
        L_0x0326:
            X.0ve r4 = r15.getAbProps()
            boolean r1 = X.C18020vd.A05(r1, r4, r13)
            android.content.Context r3 = r15.getContext()
            if (r1 == 0) goto L_0x0384
            r0 = 2131626672(0x7f0e0ab0, float:1.8880587E38)
            android.view.View.inflate(r3, r0, r15)
            r0 = 2131434367(0x7f0b1b7f, float:1.8490546E38)
            android.view.View r4 = X.AnonymousClass3MX.A0C(r15, r0)
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131168438(0x7f070cb6, float:1.7951178E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131168425(0x7f070ca9, float:1.7951151E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r3 = r3 - r0
            float r1 = (float) r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r1 = (int) r1
            if (r1 < 0) goto L_0x037e
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.C18070vi.A0z(r3, r0)
            X.0vb r5 = r15.getWhatsAppLocale()
            int r7 = -r1
            android.content.res.Resources r0 = r15.getResources()
            int r6 = r0.getDimensionPixelSize(r2)
            int r6 = r6 + r7
            r9 = r7
            r8 = r7
            X.C27641Ww.A06(r4, r5, r6, r7, r8, r9)
        L_0x037b:
            r4.setLayoutParams(r3)
        L_0x037e:
            r0 = 10
            X.C89914dE.A00(r4, r15, r0)
        L_0x0383:
            return
        L_0x0384:
            r1 = 2131626671(0x7f0e0aaf, float:1.8880585E38)
            android.view.View.inflate(r3, r1, r15)
            r1 = 2131434366(0x7f0b1b7e, float:1.8490544E38)
            android.view.View r4 = X.AnonymousClass3MX.A0C(r15, r1)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.C18070vi.A0z(r3, r1)
            r15.getWhatsAppLocale()
            android.content.res.Resources r1 = r15.getResources()
            int r1 = r1.getDimensionPixelSize(r2)
            X.C27641Ww.A03(r4, r1, r0)
            goto L_0x037b
        L_0x03a9:
            androidx.recyclerview.widget.RecyclerView r3 = r15.A03
            if (r3 == 0) goto L_0x03db
            r15.addView(r3)
            if (r14 == 0) goto L_0x0383
            goto L_0x0326
        L_0x03b4:
            java.util.List r2 = r5.A07
            int r2 = r2.size()
            float r4 = (float) r2
            goto L_0x0157
        L_0x03bd:
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r7]
            r2[r0] = r5
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            r3.<init>(r2)
            r10 = r6
            r11 = r6
            r12 = r6
            r7 = r3
            r8 = r0
            r9 = r6
            r7.setLayerInset(r8, r9, r10, r11, r12)
            goto L_0x0112
        L_0x03d1:
            X.C18070vi.A11(r6)
            goto L_0x03de
        L_0x03d5:
            java.lang.String r0 = "leftEndBlurView"
            X.C18070vi.A11(r0)
            goto L_0x03de
        L_0x03db:
            X.C18070vi.A11(r7)
        L_0x03de:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80053wT.<init>(android.content.Context, com.whatsapp.reactions.ReactionsTrayViewModel):void");
    }

    public static final void A00(C80053wT r8, C22811Dh r9) {
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerView recyclerView = r8.A03;
        if (recyclerView == null) {
            C18070vi.A11("emojiRecyclerView");
            throw null;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{childAt.getTranslationX(), 0.0f});
            C88754aj.A00(ofFloat, childAt, 16);
            animatorSet.playTogether(new Animator[]{ofFloat});
        }
        animatorSet.setDuration(250);
        animatorSet.start();
        r9.element = false;
    }

    public void A02(int i, int i2, boolean z) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(120);
        C88754aj.A00(duration, this, 15);
        AnonymousClass3Mo.A00(duration, this, 16);
        Interpolator interpolator = C1409073n.A01;
        duration.setInterpolator(interpolator);
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{1.0f, 1.0f}).setDuration(120);
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        duration2.addUpdateListener(new C88734ah(this, measuredHeight, measuredWidth, i4, i3, z2));
        duration2.setInterpolator(AnonymousClass4IU.A00);
        C88744ai r10 = new C88744ai(this, measuredWidth - measuredHeight, measuredHeight, measuredWidth, i4, i3, z2);
        ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.05f}).setDuration(150);
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{1.05f, 1.0f}).setDuration(70);
        duration3.addUpdateListener(r10);
        duration3.setInterpolator(interpolator);
        duration3.addListener(new AnonymousClass3Mp(2, this, z2));
        duration4.addUpdateListener(r10);
        duration4.setInterpolator(interpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration3, duration4});
        AnimatorSet animatorSet2 = this.A0M;
        animatorSet2.playTogether(new Animator[]{duration, duration2});
        animatorSet2.playSequentially(new Animator[]{duration2, animatorSet});
        animatorSet2.start();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0H;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass00H getFMessagePropertySubsystem() {
        AnonymousClass00H r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessagePropertySubsystem");
        throw null;
    }

    public final C1193167q getFrequentReactions() {
        C1193167q r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("frequentReactions");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final C32731hf getReactionStatsManager() {
        C32731hf r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("reactionStatsManager");
        throw null;
    }

    public final C191569mo getReactionUserJourney() {
        C191569mo r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("reactionUserJourney");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public void onDetachedFromWindow() {
        this.A0J.recycle();
        super.onDetachedFromWindow();
    }
}
