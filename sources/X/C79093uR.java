package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.util.Log;

/* renamed from: X.3uR  reason: invalid class name and case insensitive filesystem */
public abstract class C79093uR extends C79103uS implements AnonymousClass5Z7 {
    public float A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03;
    public Pair A04;
    public View A05;
    public LinearLayout A06;
    public AnonymousClass190 A07;
    public C72043Kk A08;
    public C108355bZ A09;
    public AnonymousClass3QI A0A;
    public AnonymousClass4SX A0B;
    public AnonymousClass11C A0C;
    public C18000vb A0D;
    public AnonymousClass1CJ A0E;
    public C18030ve A0F;
    public AnonymousClass689 A0G;
    public C25461Oh A0H;
    public AnonymousClass206 A0I;
    public C36331ni A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public boolean A0U = true;
    public boolean A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public Paint A0a;
    public Drawable A0b;
    public Drawable A0c;
    public boolean A0d;
    public View A0e;
    public C85684Oi A0f;
    public boolean A0g = false;
    public final int A0h;
    public final Rect A0i = AnonymousClass3MW.A07();
    public final View A0j;
    public final C108875cR A0k;
    public final C108675c7 A0l;
    public final int A0m;
    public final Rect A0n = AnonymousClass3MW.A07();
    public final AnonymousClass00H A0o;
    public final AnonymousClass00H A0p;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r4 == 2131624946) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0118, code lost:
        if (r0.inflate(r4, r9, true) != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0132, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("rootview for conversationRow is null, rightLayout=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0148, code lost:
        throw new java.lang.RuntimeException(X.AnonymousClass3MY.A0r(r1, r12.A0v.A02));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79093uR(android.content.Context r10, X.C108875cR r11, X.AnonymousClass206 r12) {
        /*
            r9 = this;
            r0 = 0
            r2 = 0
            r9.<init>(r10, r0, r2)
            r9.A1M()
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r9.A0i = r0
            r0 = -1
            r9.A01 = r0
            r3 = 1
            r9.A0U = r3
            r9.A0g = r2
            r9.A02 = r2
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r9.A0n = r0
            r9.A0k = r11
            r9.A0I = r12
            X.5c7 r0 = r9.getRowCustomizer()
            r9.A0l = r0
            boolean r0 = r9.A1b()
            r8 = 2
            if (r0 == 0) goto L_0x0128
            r0 = 1
        L_0x0030:
            r9.A0h = r0
            if (r0 == r3) goto L_0x0122
            if (r0 == r8) goto L_0x011c
            int r4 = r9.getOutgoingLayoutId()
        L_0x003a:
            X.0ve r0 = r9.A0F
            boolean r0 = X.AnonymousClass1J8.A03(r0)
            android.content.Context r5 = r9.getContext()
            X.0ve r7 = r9.A0F
            if (r0 == 0) goto L_0x00d7
            X.00H r0 = r9.A0T
            java.lang.Object r0 = r0.get()
            X.1LT r0 = (X.AnonymousClass1LT) r0
            X.5bZ r1 = r9.A09
            X.C18070vi.A0d(r5, r2)
            X.C18070vi.A0d(r7, r3)
            X.C18070vi.A0k(r0, r1)
            android.view.View r0 = r0.A00(r5, r9, r4, r2)
            if (r0 != 0) goto L_0x008a
            X.4NH r6 = new X.4NH
            r6.<init>(r5, r1, r7)
            r0 = 2131626665(0x7f0e0aa9, float:1.8880573E38)
            if (r4 != r0) goto L_0x00bd
            X.0ve r5 = r6.A02
            r1 = 3783(0xec7, float:5.301E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r5, r1)
            if (r1 == r3) goto L_0x00b4
            r0 = 2
        L_0x0078:
            if (r1 != r0) goto L_0x00d0
            r0 = 2131626665(0x7f0e0aa9, float:1.8880573E38)
            if (r4 == r0) goto L_0x00b4
            r0 = 2131624946(0x7f0e03f2, float:1.8877086E38)
            if (r4 != r0) goto L_0x0132
        L_0x0084:
            android.content.Context r0 = r6.A00
            android.widget.LinearLayout r0 = A18(r0)
        L_0x008a:
            r9.addView(r0)
        L_0x008d:
            android.view.View r0 = r9.getChildAt(r2)
            r9.A0j = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r10)
            int r0 = r0.getScaledTouchSlop()
            double r2 = (double) r0
            r0 = 4610785298501913805(0x3ffccccccccccccd, double:1.8)
            double r2 = r2 * r0
            int r0 = (int) r2
            r9.A0m = r0
            r0 = 3
            X.1Hk r0 = X.C99054sC.A01(r9, r0)
            r9.A0p = r0
            r0 = 4
            X.1Hk r0 = X.C99054sC.A01(r9, r0)
            r9.A0o = r0
            return
        L_0x00b4:
            android.content.Context r1 = r6.A00
            X.5bZ r0 = r6.A01
            com.whatsapp.WaFrameLayout r0 = X.AnonymousClass4GN.A00(r1, r0)
            goto L_0x008a
        L_0x00bd:
            r0 = 2131624946(0x7f0e03f2, float:1.8877086E38)
            if (r4 != r0) goto L_0x00d0
            X.0ve r5 = r6.A02
            r1 = 3783(0xec7, float:5.301E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r5, r1)
            if (r1 == r3) goto L_0x0084
            r0 = 3
            goto L_0x0078
        L_0x00d0:
            android.content.Context r0 = r6.A00
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            goto L_0x0114
        L_0x00d7:
            X.5bZ r6 = r9.A09
            X.C18070vi.A0d(r5, r2)
            X.C18070vi.A0d(r7, r3)
            X.C18070vi.A0d(r6, r8)
            r0 = 2131626665(0x7f0e0aa9, float:1.8880573E38)
            if (r4 != r0) goto L_0x00f8
            r1 = 3783(0xec7, float:5.301E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r7, r1)
            if (r0 == r3) goto L_0x00f3
            if (r0 != r8) goto L_0x0110
        L_0x00f3:
            com.whatsapp.WaFrameLayout r0 = X.AnonymousClass4GN.A00(r5, r6)
            goto L_0x008a
        L_0x00f8:
            r0 = 2131624946(0x7f0e03f2, float:1.8877086E38)
            if (r4 != r0) goto L_0x0110
            r1 = 3783(0xec7, float:5.301E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r7, r1)
            if (r1 == r3) goto L_0x010a
            r0 = 3
            if (r1 != r0) goto L_0x0110
        L_0x010a:
            android.widget.LinearLayout r0 = A18(r5)
            goto L_0x008a
        L_0x0110:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
        L_0x0114:
            android.view.View r0 = r0.inflate(r4, r9, r3)
            if (r0 == 0) goto L_0x0132
            goto L_0x008d
        L_0x011c:
            int r4 = r9.getIncomingLayoutId()
            goto L_0x003a
        L_0x0122:
            int r4 = r9.getCenteredLayoutId()
            goto L_0x003a
        L_0x0128:
            X.205 r0 = r12.A0v
            boolean r0 = r0.A02
            int r0 = X.C72453Mb.A05(r0)
            goto L_0x0030
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "rootview for conversationRow is null, rightLayout="
            r1.append(r0)
            X.205 r0 = r12.A0v
            boolean r0 = r0.A02
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79093uR.<init>(android.content.Context, X.5cR, X.206):void");
    }

    public static final LinearLayout A18(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(2131432248);
        AnonymousClass3Ma.A17(linearLayout);
        linearLayout.setGravity(19);
        linearLayout.setMinimumHeight(AnonymousClass3MZ.A03(displayMetrics, 30.0f, 1));
        linearLayout.setOrientation(1);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(2131429608);
        AnonymousClass3Ma.A18(viewStub, -1, -2);
        ViewStub A17 = A17(context, viewStub, linearLayout);
        A17.setId(2131434296);
        A17.setLayoutResource(2131624913);
        AnonymousClass3Ma.A18(A17, -1, -2);
        ViewStub A172 = A17(context, A17, linearLayout);
        A172.setId(2131429585);
        AnonymousClass3Ma.A18(A172, -1, -2);
        ViewStub A173 = A17(context, A172, linearLayout);
        A173.setId(2131435949);
        AnonymousClass3Ma.A18(A173, -1, -2);
        ViewStub A174 = A17(context, A173, linearLayout);
        A174.setId(2131437044);
        A174.setLayoutResource(2131624964);
        ViewStub A175 = A17(context, A174, linearLayout);
        A175.setId(2131429590);
        AnonymousClass3Ma.A18(A175, -1, -2);
        A175.setLayoutResource(2131624790);
        linearLayout.addView(A175);
        TextAndDateLayout textAndDateLayout = new TextAndDateLayout(context);
        textAndDateLayout.setId(2131429622);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 3;
        textAndDateLayout.setLayoutParams(layoutParams);
        textAndDateLayout.setPadding(resources.getDimensionPixelSize(2131168783), 0, resources.getDimensionPixelSize(2131168783), resources.getDimensionPixelSize(2131168783));
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(context);
        textEmojiLabel.setId(2131432683);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        textEmojiLabel.setLayoutParams(layoutParams2);
        textEmojiLabel.setPadding(resources.getDimensionPixelSize(2131166256), AnonymousClass3MZ.A03(displayMetrics, 2.0f, 1), resources.getDimensionPixelSize(2131166256), AnonymousClass3MZ.A03(displayMetrics, 5.0f, 1));
        Resources.Theme theme = context.getTheme();
        C18070vi.A0X(theme);
        int i = 2132084424;
        try {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(2130971887, typedValue, true);
            i = typedValue.data;
        } catch (Resources.NotFoundException e) {
            Log.e("TypographyUtils/getTextStyleFromThemeStyle/resource not found", e);
        }
        textEmojiLabel.setTextAppearance(context, i);
        textAndDateLayout.addView(textEmojiLabel);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(2131429812);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 85;
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(AnonymousClass3MZ.A03(displayMetrics2, 6.0f, 1), 0, AnonymousClass3MZ.A03(displayMetrics2, 6.0f, 1), 0);
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(2131433054);
        viewStub2.setInflatedId(2131433054);
        AnonymousClass3Ma.A17(viewStub2);
        ViewStub A176 = A17(context, viewStub2, linearLayout2);
        A176.setId(2131434950);
        A176.setInflatedId(2131434950);
        AnonymousClass3Ma.A17(A176);
        linearLayout2.addView(A176);
        WaTextView waTextView = new WaTextView(context);
        waTextView.setTextAppearance(context, 2132084357);
        waTextView.setId(2131429789);
        waTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        waTextView.setPadding(0, 0, 0, AnonymousClass3MZ.A03(displayMetrics2, 1.0f, 1));
        ViewStub A177 = A17(context, waTextView, linearLayout2);
        A177.setId(2131437005);
        A177.setInflatedId(2131437005);
        AnonymousClass3Ma.A18(A177, AnonymousClass3MZ.A03(displayMetrics2, 18.0f, 1), AnonymousClass3MZ.A03(displayMetrics2, 18.0f, 1));
        linearLayout2.addView(A177);
        textAndDateLayout.addView(linearLayout2);
        ViewStub A178 = A17(context, textAndDateLayout, linearLayout);
        A178.setId(2131428855);
        A178.setLayoutResource(2131626829);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 3;
        A178.setLayoutParams(layoutParams4);
        ViewStub A179 = A17(context, A178, linearLayout);
        A179.setId(2131432736);
        A179.setLayoutResource(2131626057);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 3;
        A179.setLayoutParams(layoutParams5);
        linearLayout.addView(A179);
        return linearLayout;
    }

    public void A1R() {
    }

    public boolean A1V() {
        return false;
    }

    public boolean A1W() {
        return false;
    }

    public boolean A1X() {
        return false;
    }

    public boolean A1Y() {
        return false;
    }

    public boolean A1Z() {
        return false;
    }

    public boolean A1a() {
        return true;
    }

    public boolean A1c() {
        return false;
    }

    public boolean A1d() {
        return false;
    }

    public boolean A1e() {
        return false;
    }

    public boolean A1g() {
        return false;
    }

    public boolean A1h() {
        return false;
    }

    public boolean A1i() {
        return false;
    }

    public abstract boolean A1j();

    public int getCapabilities() {
        return 3;
    }

    public abstract int getCenteredLayoutId();

    public abstract int getIncomingLayoutId();

    public int getMainChildMaxWidth() {
        return 0;
    }

    public abstract int getOutgoingLayoutId();

    public abstract int getUserNameInGroupLayoutOption();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int A1O() {
        AnonymousClass3QI r1 = this.A0A;
        if (r1 == null) {
            return 0;
        }
        if (r1.A02.getVisibility() != 0 && r1.A01.getVisibility() != 0) {
            return 0;
        }
        AnonymousClass3QI r3 = this.A0A;
        int measuredHeight = this.A0j.getMeasuredHeight();
        r3.setOrientation(1);
        C72463Mc.A12(r3);
        if (r3.getMeasuredHeight() > measuredHeight) {
            r3.setOrientation(0);
            C72463Mc.A12(r3);
        }
        AnonymousClass3QI r0 = this.A0A;
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(r0);
        return r0.getMeasuredWidth() + A0B2.leftMargin + A0B2.rightMargin;
    }

    public int A1P(int i, int i2, int i3) {
        LinearLayout linearLayout = this.A06;
        if (linearLayout == null || linearLayout.getVisibility() == 8) {
            return 0;
        }
        C42491yG.A0A(this.A06, i, C72453Mb.A0C(this), 0, i2, i3);
        return this.A06.getMeasuredHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r9 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r9 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A1Q(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            X.5bZ r5 = r6.A09
            X.5c7 r0 = r6.A0l
            boolean r4 = r0.CLp()
            X.4iP r5 = (X.C93084iP) r5
            r3 = 1
            if (r7 == r3) goto L_0x006d
            r2 = -1
            r1 = 3
            r0 = 2
            if (r7 == r0) goto L_0x0039
            if (r7 != r1) goto L_0x0055
            if (r8 == r2) goto L_0x002a
            if (r8 == r3) goto L_0x002a
            if (r8 == r0) goto L_0x001c
            if (r8 != r1) goto L_0x0055
        L_0x001c:
            if (r9 == 0) goto L_0x0036
        L_0x001e:
            X.0vp r0 = r5.A0N
        L_0x0020:
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x002a:
            if (r9 == 0) goto L_0x0031
            if (r4 != 0) goto L_0x001e
            X.0vp r0 = r5.A0L
            goto L_0x0020
        L_0x0031:
            if (r4 != 0) goto L_0x0036
            X.0vp r0 = r5.A0H
            goto L_0x0020
        L_0x0036:
            X.0vp r0 = r5.A0G
            goto L_0x0020
        L_0x0039:
            if (r8 == r2) goto L_0x0046
            if (r8 == r3) goto L_0x0046
            if (r8 == r0) goto L_0x0041
            if (r8 != r1) goto L_0x0055
        L_0x0041:
            if (r9 == 0) goto L_0x0052
        L_0x0043:
            X.0vp r0 = r5.A0E
            goto L_0x0020
        L_0x0046:
            if (r9 == 0) goto L_0x004d
            if (r4 != 0) goto L_0x0043
            X.0vp r0 = r5.A0C
            goto L_0x0020
        L_0x004d:
            if (r4 != 0) goto L_0x0052
            X.0vp r0 = r5.A08
            goto L_0x0020
        L_0x0052:
            X.0vp r0 = r5.A07
            goto L_0x0020
        L_0x0055:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unreachable code: direction="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; collapse="
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r8)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x006d:
            if (r9 == 0) goto L_0x007b
            X.0vp r0 = r5.A06
        L_0x0071:
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0b(r0)
            return r0
        L_0x007b:
            X.0vp r0 = r5.A05
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79093uR.A1Q(int, int, boolean):android.graphics.drawable.Drawable");
    }

    public void A1T(AnonymousClass205 r4) {
        AnonymousClass3OO r2 = new AnonymousClass3OO(this);
        r2.setDuration(2400);
        r2.setInterpolator(new AccelerateInterpolator());
        startAnimation(r2);
    }

    public boolean A1b() {
        return this.A0l.Bfw();
    }

    public C82854Ci getBubbleType() {
        return A19(this.A0l, this.A0F, this.A0H, getFMessage());
    }

    public AnonymousClass206 getFMessage() {
        return this.A0I;
    }

    public int getGlowContentBottom() {
        LinearLayout linearLayout = this.A06;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return this.A0W;
        }
        return this.A06.getBottom();
    }

    public View getMainView() {
        return this.A0j;
    }

    public C85684Oi getOrCreateBubbleDrawState() {
        C85684Oi r2 = this.A0f;
        if (r2 != null) {
            return r2;
        }
        int i = this.A0h;
        Drawable A1Q = A1Q(i, this.A01, false);
        Rect BNj = this.A09.BNj(i);
        Drawable A1Q2 = A1Q(i, this.A01, true);
        Rect BNj2 = this.A09.BNj(i);
        View bubbleAnchorView = getBubbleAnchorView();
        Rect A072 = AnonymousClass3MW.A07();
        A072.left = 0;
        A072.top = 0;
        A072.right = bubbleAnchorView.getWidth();
        A072.bottom = bubbleAnchorView.getHeight();
        while (bubbleAnchorView != this && bubbleAnchorView != null) {
            A072.offset(bubbleAnchorView.getLeft(), bubbleAnchorView.getTop());
            bubbleAnchorView = (View) bubbleAnchorView.getParent();
        }
        C85684Oi r22 = new C85684Oi(BNj, BNj2, A072, A1Q, A1Q2, i);
        this.A0f = r22;
        return r22;
    }

    public C108675c7 getRowCustomizer() {
        C108875cR r0 = this.A0k;
        if (r0 != null) {
            return r0.getConversationRowCustomizer();
        }
        return this.A0B.A08;
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Rect rect;
        int i;
        boolean A1b;
        boolean z;
        int i2;
        int i3;
        int i4;
        View view;
        Canvas canvas2 = canvas;
        if (this.A0V) {
            if (this.A0c == null) {
                Drawable A002 = C40501uo.A00(AnonymousClass3Ma.A06(this), getResources(), 2131231004);
                C17960vV.A07(A002);
                this.A0c = A002;
            }
            if (this.A0b == null) {
                Drawable A003 = C40501uo.A00(AnonymousClass3Ma.A06(this), getResources(), 2131231003);
                C17960vV.A07(A003);
                this.A0b = A003;
            }
            this.A0c.setBounds(0, getPaddingTop() - this.A0c.getIntrinsicHeight(), getWidth(), getPaddingTop());
            this.A0c.draw(canvas2);
            this.A0b.setBounds(0, this.A0W, getWidth(), this.A0W + this.A0b.getIntrinsicHeight());
            this.A0b.draw(canvas2);
        } else {
            C85684Oi orCreateBubbleDrawState = getOrCreateBubbleDrawState();
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0F, 12291);
            if (!isPressed() || A052) {
                drawable = orCreateBubbleDrawState.A04;
            } else {
                drawable = orCreateBubbleDrawState.A05;
            }
            if (isPressed()) {
                rect = orCreateBubbleDrawState.A03;
            } else {
                rect = orCreateBubbleDrawState.A02;
            }
            Rect rect2 = orCreateBubbleDrawState.A01;
            if (this.A00 > 0.0f) {
                int A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130969230, 2131100227);
                int i5 = (A022 & 16777215) | (((int) (((float) (A022 >> 24)) * this.A00)) << 24);
                Paint paint = this.A0a;
                if (paint == null) {
                    paint = new Paint(1);
                    this.A0a = paint;
                }
                paint.setColor(i5);
                canvas2.drawRect(0.0f, (float) ((this.A0X - rect.top) - getResources().getDimensionPixelSize(2131168615)), (float) getWidth(), (float) (getGlowContentBottom() + rect.bottom + Math.max(1, (int) (C72473Md.A00(this) / 2.0f))), this.A0a);
            }
            if (isSelected() || (((view = this.A05) == null || view.getVisibility() != 0) && (isPressed() || isFocused()))) {
                C108675c7 r11 = this.A0l;
                if (r11.CMN()) {
                    canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), r11.BRs());
                }
            }
            AnonymousClass206 r112 = this.A0I;
            int A0D2 = r112.A0D();
            if (A0D2 == -1 || ((A0D2 == 6 && (i4 = r112.A0u) != 8 && i4 != 90 && !C20120A8f.A09(r112)) || (i = r112.A0u) == 21 || i == 22 || i == 36)) {
                this.A0i.set(0, this.A0X - rect.top, getWidth(), this.A0W + rect.bottom);
            } else {
                int i6 = orCreateBubbleDrawState.A00;
                if (i6 == 1) {
                    z = this.A0l.CLw();
                } else {
                    if (i6 == 3) {
                        A1b = this.A0l.BgQ();
                    } else {
                        A1b = AnonymousClass3MY.A1b(this.A0D);
                    }
                    z = !A1b;
                }
                Rect rect3 = this.A0i;
                int i7 = rect2.left;
                if (z) {
                    i2 = rect.right;
                } else {
                    i2 = rect.left;
                }
                int i8 = i7 - i2;
                int i9 = rect2.top - rect.top;
                int i10 = rect2.right;
                if (z) {
                    i3 = rect.left;
                } else {
                    i3 = rect.right;
                }
                rect3.set(i8, i9, i10 + i3, rect2.bottom + rect.bottom);
                View view2 = this.A0j;
                rect3.offset((int) view2.getTranslationX(), 0);
                if (this.A0U) {
                    drawable.setAlpha(getBubbleAlpha());
                    drawable.setDither(true);
                    drawable.setBounds(rect3);
                    if (z) {
                        canvas2.save();
                        canvas2.scale(-1.0f, 1.0f, rect3.exactCenterX(), 0.0f);
                        if (A1a()) {
                            drawable.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (A1a()) {
                        drawable.draw(canvas2);
                    }
                }
                if (this.A03 > 0) {
                    float translationX = ((float) ((int) view2.getTranslationX())) / ((float) (getWidth() / 6));
                    int min = Math.min((int) view2.getTranslationX(), getWidth() / 6);
                    int top = view2.getTop();
                    int bottom = view2.getBottom();
                    int A012 = AnonymousClass3MW.A01(getResources(), 2131168479);
                    Drawable drawable2 = (Drawable) this.A0p.get();
                    Drawable drawable3 = (Drawable) this.A0o.get();
                    Rect rect4 = this.A0n;
                    drawable3.getPadding(rect4);
                    int i11 = (top + bottom) / 2;
                    drawable3.setBounds(((min - drawable2.getIntrinsicWidth()) - A012) - rect4.right, (i11 - (drawable2.getIntrinsicHeight() / 2)) - A012, (min + A012) - rect4.right, (drawable2.getIntrinsicHeight() / 2) + i11 + A012);
                    drawable2.setBounds((min - drawable2.getIntrinsicWidth()) - rect4.right, i11 - (drawable2.getIntrinsicHeight() / 2), min - rect4.right, i11 + (drawable2.getIntrinsicHeight() / 2));
                    int min2 = (int) (Math.min(1.0f, 2.0f * translationX) * 255.0f);
                    drawable3.setAlpha(min2);
                    drawable2.setAlpha(min2);
                    drawable3.draw(canvas2);
                    drawable2.draw(canvas2);
                    AnonymousClass3QI r1 = this.A0A;
                    if (r1 != null) {
                        r1.setTranslationX(view2.getTranslationX());
                        r1.setAlpha(Math.max(0.0f, 1.0f - (translationX * 4.0f)));
                    }
                    if (this.A03 == 2) {
                        invalidate();
                    }
                }
            }
        }
        super.onDraw(canvas2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r4 = r17
            int r6 = r4.getPaddingTop()
            android.view.View r0 = r4.A0e
            r2 = 8
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x003a
            android.view.View r0 = r4.A0e
            android.view.ViewGroup$MarginLayoutParams r8 = X.AnonymousClass3MW.A0B(r0)
            int r0 = r8.topMargin
            int r6 = r6 + r0
            android.view.View r0 = r4.A0e
            int r7 = r0.getMeasuredWidth()
            android.view.View r0 = r4.A0e
            int r5 = r0.getMeasuredHeight()
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r7
            int r3 = r0 / 2
            android.view.View r1 = r4.A0e
            int r7 = r7 + r3
            int r0 = r6 + r5
            r1.layout(r3, r6, r7, r0)
            int r0 = r8.bottomMargin
            int r5 = r5 + r0
            int r6 = r6 + r5
        L_0x003a:
            android.view.View r3 = r4.A0j
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass3MW.A0B(r3)
            int r0 = r1.topMargin
            int r6 = r6 + r0
            X.0vb r0 = r4.A0D
            boolean r11 = X.AnonymousClass3MY.A1b(r0)
            if (r11 == 0) goto L_0x0279
            int r9 = r1.leftMargin
            int r8 = r1.rightMargin
            int r1 = r4.getPaddingLeft()
            int r10 = r4.getPaddingRight()
        L_0x0057:
            boolean r0 = r4.A1b()
            if (r0 != 0) goto L_0x0074
            X.206 r7 = r4.A0I
            int r5 = r7.A0D()
            r0 = 6
            if (r5 != r0) goto L_0x0258
            int r5 = r7.A0u
            if (r5 == r2) goto L_0x0258
            r0 = 90
            if (r5 == r0) goto L_0x0258
            boolean r0 = X.C20120A8f.A09(r7)
            if (r0 != 0) goto L_0x0258
        L_0x0074:
            android.util.Pair r0 = r4.A04
            if (r0 == 0) goto L_0x0255
            java.lang.Object r0 = r0.second
            int r5 = X.AnonymousClass000.A0M(r0)
        L_0x007e:
            int r1 = r4.getMeasuredWidth()
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            int r1 = r1 - r5
            int r1 = r1 / 2
        L_0x008a:
            android.util.Pair r0 = r4.A04
            if (r0 == 0) goto L_0x0252
            java.lang.Object r9 = r0.first
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r0 = r0.second
            int r8 = X.AnonymousClass000.A0M(r0)
            if (r9 == 0) goto L_0x00b7
            int r0 = r9.getVisibility()
            if (r0 == r2) goto L_0x00b7
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r9)
            int r7 = r0.leftMargin
            int r5 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            if (r11 == 0) goto L_0x0249
            int r0 = r1 + r7
        L_0x00b2:
            int r5 = r5 + r0
            int r2 = r2 + r6
            r9.layout(r0, r6, r5, r2)
        L_0x00b7:
            int r1 = r1 + r8
            if (r11 != 0) goto L_0x00c5
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 - r1
            int r0 = r3.getMeasuredWidth()
            int r1 = r2 - r0
        L_0x00c5:
            int r2 = r3.getMeasuredWidth()
            int r2 = r2 + r1
            int r0 = r3.getMeasuredHeight()
            int r0 = r0 + r6
            r3.layout(r1, r6, r2, r0)
            r14 = 3
            int r0 = r4.getCapabilities()
            r0 = r0 & 3
            if (r0 == 0) goto L_0x0187
            X.5cR r1 = r4.A0k
            if (r1 == 0) goto L_0x0187
            android.widget.LinearLayout r0 = r4.A06
            if (r0 == 0) goto L_0x0187
            X.00H r0 = r4.A0P
            java.lang.Object r2 = r0.get()
            X.4Zj r2 = (X.C88354Zj) r2
            int r1 = r1.getContainerType()
            X.206 r0 = r4.getFMessage()
            boolean r0 = r2.A06(r0, r1)
            if (r0 == 0) goto L_0x0187
            X.00H r0 = r4.A0P
            java.lang.Object r9 = r0.get()
            X.4Zj r9 = (X.C88354Zj) r9
            android.widget.LinearLayout r6 = r4.A06
            boolean r0 = r4.A1c()
            if (r0 != 0) goto L_0x010a
            r14 = 5
        L_0x010a:
            X.206 r1 = r4.getFMessage()
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            r13 = 3
            X.C18070vi.A0d(r1, r13)
            int r16 = r6.getMeasuredWidth()
            int r15 = r6.getMeasuredHeight()
            int r12 = r6.getMeasuredWidth()
            int r11 = X.C72463Mc.A08(r6)
            android.view.View r10 = X.AnonymousClass3MY.A0F(r4)
            int r7 = r10.getLeft()
            float r0 = r10.getY()
            int r5 = (int) r0
            X.4Ci r0 = r4.getBubbleType()
            X.4Ci r8 = X.C82854Ci.FULL
            if (r0 == r8) goto L_0x021a
            r0 = 2131429812(0x7f0b09b4, float:1.8481307E38)
            android.view.View r2 = X.C18070vi.A05(r4, r0)
            int r0 = r2.getLeft()
            int r7 = r7 + r0
            float r1 = (float) r5
            float r0 = r2.getY()
            float r1 = r1 + r0
            int r5 = (int) r1
            X.0vb r0 = r9.A03
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x0217
            int r0 = r2.getMeasuredWidth()
            int r7 = r7 + r0
            int r7 = r7 - r12
            int r7 = r7 - r11
        L_0x015d:
            int r0 = r2.getMeasuredHeight()
        L_0x0161:
            int r5 = r5 + r0
            X.4Ci r2 = r4.getBubbleType()
            android.content.res.Resources r1 = X.AnonymousClass3MX.A05(r6)
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            if (r2 != r8) goto L_0x0172
            r0 = 2131168779(0x7f070e0b, float:1.795187E38)
        L_0x0172:
            int r0 = r1.getDimensionPixelOffset(r0)
            int r5 = r5 - r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r7, r5)
            int r5 = r0.x
            int r2 = r0.y
            int r1 = r5 + r16
            int r0 = r2 + r15
            r6.layout(r5, r2, r1, r0)
        L_0x0187:
            X.3QI r0 = r4.A0A
            if (r0 == 0) goto L_0x01cd
            android.view.ViewGroup$MarginLayoutParams r9 = X.AnonymousClass3MW.A0B(r0)
            boolean r0 = X.C79103uS.A1I(r4)
            if (r0 == 0) goto L_0x0210
            X.5c7 r0 = r4.A0l
            boolean r2 = r0.BgQ()
        L_0x019b:
            X.3QI r0 = r4.A0A
            int r0 = r0.getMeasuredHeight()
            int r8 = r0 / 2
            int r1 = r3.getTop()
            int r0 = r3.getBottom()
            int r1 = r1 + r0
            int r7 = r1 / 2
            X.3QI r6 = r4.A0A
            if (r2 == 0) goto L_0x01f8
            int r5 = r3.getLeft()
            X.3QI r0 = r4.A0A
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            int r0 = r9.leftMargin
            int r5 = r5 - r0
            int r2 = r7 - r8
            int r1 = r3.getLeft()
            int r0 = r9.leftMargin
            int r1 = r1 - r0
        L_0x01c9:
            int r7 = r7 + r8
            r6.layout(r5, r2, r1, r7)
        L_0x01cd:
            X.4Ci r1 = r4.getBubbleType()
            X.4Ci r0 = X.C82854Ci.NONE
            if (r1 == r0) goto L_0x01f3
            r0 = 2131428460(0x7f0b046c, float:1.8478565E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x01f3
            int r1 = r3.getTop()
            int r0 = r0.getPaddingTop()
            int r1 = r1 + r0
        L_0x01e7:
            r4.A0X = r1
            int r0 = r4.A1N()
            r4.A0W = r0
            r0 = 0
            r4.A0f = r0
            return
        L_0x01f3:
            int r1 = r3.getTop()
            goto L_0x01e7
        L_0x01f8:
            int r5 = r3.getRight()
            int r0 = r9.leftMargin
            int r5 = r5 + r0
            int r2 = r7 - r8
            int r1 = r3.getRight()
            X.3QI r0 = r4.A0A
            int r0 = r0.getMeasuredWidth()
            int r1 = r1 + r0
            int r0 = r9.leftMargin
            int r1 = r1 + r0
            goto L_0x01c9
        L_0x0210:
            X.0vb r0 = r4.A0D
            boolean r2 = X.AnonymousClass3MW.A1Z(r0)
            goto L_0x019b
        L_0x0217:
            int r7 = r7 + r11
            goto L_0x015d
        L_0x021a:
            int r2 = r10.getMeasuredWidth()
            if (r14 == r13) goto L_0x023f
            X.5c7 r0 = r4.getRowCustomizer()
            boolean r0 = r0.CLx()
            if (r0 != 0) goto L_0x023f
            X.205 r0 = r1.A0v
            boolean r1 = r0.A02
            X.0vb r0 = r9.A03
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r1 != r0) goto L_0x0247
        L_0x0236:
            int r7 = r7 + r2
            int r7 = r7 - r12
            int r7 = r7 - r11
        L_0x0239:
            int r0 = r10.getMeasuredHeight()
            goto L_0x0161
        L_0x023f:
            X.0vb r0 = r9.A03
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x0236
        L_0x0247:
            int r7 = r7 + r11
            goto L_0x0239
        L_0x0249:
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r1
            int r0 = r0 - r7
            int r0 = r0 - r5
            goto L_0x00b2
        L_0x0252:
            r8 = 0
            goto L_0x00b7
        L_0x0255:
            r5 = 0
            goto L_0x007e
        L_0x0258:
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0276
            X.5c7 r0 = r4.A0l
            boolean r0 = r0.Beq()
            if (r0 == 0) goto L_0x0273
            int r1 = r4.getMeasuredWidth()
            int r1 = r1 - r10
            int r1 = r1 - r8
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            goto L_0x008a
        L_0x0273:
            int r1 = r1 + r8
            goto L_0x008a
        L_0x0276:
            int r1 = r1 + r9
            goto L_0x008a
        L_0x0279:
            int r9 = r1.rightMargin
            int r8 = r1.leftMargin
            int r1 = r4.getPaddingRight()
            int r10 = r4.getPaddingLeft()
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79093uR.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int size = View.MeasureSpec.getSize(i4);
        int A0C2 = C72453Mb.A0C(this);
        int mainChildMaxWidth = getMainChildMaxWidth();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        View view = this.A0e;
        int i5 = i2;
        if (!(view == null || view.getVisibility() == 8)) {
            int i6 = 0;
            if (this.A0l.Beq()) {
                i6 = A0C2;
            }
            C42491yG.A0A(this.A0e, i4, i6, 0, i5, paddingTop);
            paddingTop += C42491yG.A00(this.A0e);
        }
        int A1P = A1P(i4, i5, paddingTop);
        if (A1P != 0) {
            paddingTop += A1P - getReactionsViewVerticalOverlap();
        }
        Pair pair = this.A04;
        boolean z = false;
        if (pair != null) {
            View view2 = (View) pair.first;
            i3 = AnonymousClass000.A0M(pair.second);
            if (!(view2 == null || view2.getVisibility() == 8)) {
                C42491yG.A0A(view2, i4, A0C2, 0, i5, paddingTop);
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view2);
                if (i3 == view2.getMeasuredWidth() + A0B2.leftMargin + A0B2.rightMargin) {
                    z = true;
                }
                C17960vV.A0F(z, "Profile picture optimistic width should be same as measured");
            }
        } else {
            i3 = 0;
        }
        int i7 = A0C2 + i3;
        View view3 = this.A0j;
        ViewGroup.MarginLayoutParams A0B3 = AnonymousClass3MW.A0B(view3);
        C108675c7 r1 = this.A0l;
        int BNk = r1.BNk(getFMessage());
        int BNi = r1.BNi();
        int i8 = this.A0h;
        if (i8 == 2 || i8 != 3) {
            C27641Ww.A03(view3, BNi, BNk);
        } else {
            C27641Ww.A03(view3, BNk, BNi);
        }
        int i9 = i4;
        int i10 = i5;
        int i11 = paddingTop;
        C42491yG.A0A(view3, i9, i7, mainChildMaxWidth, i10, i11);
        int i12 = A0B3.leftMargin + A0B3.rightMargin;
        int A1O = A1O();
        if (A1O > i12) {
            i7 += A1O - i12;
            C42491yG.A0A(view3, i9, i7, mainChildMaxWidth, i10, i11);
        }
        int A002 = paddingTop + C42491yG.A00(view3);
        ViewGroup.MarginLayoutParams A0B4 = AnonymousClass3MW.A0B(view3);
        int measuredWidth = i7 + view3.getMeasuredWidth() + A0B4.leftMargin + A0B4.rightMargin;
        if (Integer.MIN_VALUE == View.MeasureSpec.getMode(i4)) {
            setMeasuredDimension(measuredWidth, A002);
        } else {
            setMeasuredDimension(size, A002);
        }
    }

    public static ViewStub A17(Context context, View view, ViewGroup viewGroup) {
        viewGroup.addView(view);
        return new ViewStub(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4.CN6() != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r4.CLh() == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C82854Ci A19(X.C108675c7 r4, X.C18030ve r5, X.C25461Oh r6, X.AnonymousClass206 r7) {
        /*
            X.206 r0 = r7.A0K()
            boolean r3 = X.AnonymousClass000.A1W(r0)
            X.205 r1 = r7.A0v
            X.1BI r0 = r1.A00
            boolean r2 = X.C22971Dz.A0e(r0)
            boolean r1 = r1.A02
            boolean r0 = r7 instanceof X.C440922c
            if (r0 != 0) goto L_0x002a
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r7.A0P()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r7.A0P()
            boolean r0 = X.C26180Cu0.A02(r5, r6, r0)
            if (r0 == 0) goto L_0x0033
        L_0x002a:
            if (r3 != 0) goto L_0x0030
            if (r2 == 0) goto L_0x0054
            if (r1 != 0) goto L_0x0054
        L_0x0030:
            X.4Ci r0 = X.C82854Ci.CONTACT
            return r0
        L_0x0033:
            X.206 r0 = r7.A0K()
            if (r0 != 0) goto L_0x0057
            boolean r0 = r7 instanceof X.C441322g
            if (r0 == 0) goto L_0x0057
            X.Abv r0 = X.C60532oB.A00(r7)
            if (r0 != 0) goto L_0x0057
            if (r2 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x004d
            boolean r0 = r4.CN6()
            if (r0 == 0) goto L_0x0054
        L_0x004d:
            boolean r0 = r4.CLh()
            if (r0 != 0) goto L_0x0054
            goto L_0x0030
        L_0x0054:
            X.4Ci r0 = X.C82854Ci.NONE
            return r0
        L_0x0057:
            X.4Ci r0 = X.C82854Ci.FULL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79093uR.A19(X.5c7, X.0ve, X.1Oh, X.206):X.4Ci");
    }

    private boolean A1A(MotionEvent motionEvent) {
        this.A0Z = (int) motionEvent.getX();
        boolean z = false;
        this.A0d = false;
        if (this.A03 == 2) {
            z = true;
            this.A03 = 1;
            C98774rh.A00(this, 37);
            invalidate();
        }
        View view = this.A0j;
        this.A0Y = (int) view.getTranslationX();
        view.animate().cancel();
        return z;
    }

    private boolean A1B(MotionEvent motionEvent) {
        Object obj;
        int x = (int) motionEvent.getX();
        if (this.A03 != 1 && Math.abs(x - this.A0Z) > this.A0m) {
            this.A03 = 1;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            cancelLongPress();
            setPressed(false);
        }
        if (this.A03 != 1) {
            return false;
        }
        int max = Math.max(0, ((this.A0Y + x) - this.A0Z) - this.A0m);
        float max2 = (float) Math.max(0, max - (getWidth() / 6));
        int min = Math.min(max, getWidth() / 6);
        double d = (double) max2;
        int width = min + ((int) (d / (((d * 0.75d) / ((double) (getWidth() / 6))) + 1.0d)));
        float f = (float) width;
        this.A0j.setTranslationX(f);
        LinearLayout linearLayout = this.A06;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f);
        }
        Pair pair = this.A04;
        if (!(pair == null || (obj = pair.first) == null)) {
            ((View) obj).setTranslationX(f);
        }
        if (width > getWidth() / 6 && !this.A0d) {
            try {
                if (Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled") != 0) {
                    AnonymousClass4a5.A03(this.A0C);
                }
            } catch (Settings.SettingNotFoundException e) {
                Log.e("swipetoreply/vibrate", e);
            }
            this.A0d = true;
        }
        invalidate();
        return true;
    }

    public int A1N() {
        View findViewById;
        if (getBubbleType() != C82854Ci.NONE) {
            AnonymousClass206 r1 = this.A0I;
            if (r1.A0K() == null && C60532oB.A00(r1) == null && (findViewById = findViewById(2131428460)) != null) {
                return this.A0j.getBottom() + findViewById.getBottom();
            }
        }
        return this.A0j.getBottom();
    }

    public void A1S() {
        clearAnimation();
        this.A00 = 0.0f;
        invalidate();
    }

    public boolean A1U() {
        return AnonymousClass000.A1Z(getBubbleType(), C82854Ci.FULL);
    }

    public boolean A1f() {
        if (!getFMessage().A0w() || !this.A0l.CML()) {
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getBubbleAlpha() {
        if (getBubbleType() == C82854Ci.NONE) {
            return 0;
        }
        return 255;
    }

    public View getBubbleAnchorView() {
        View findViewById;
        if (getBubbleType() != C82854Ci.CONTACT || (findViewById = findViewById(2131428460)) == null) {
            return this.A0j;
        }
        return findViewById;
    }

    public int getReactionsViewVerticalOverlap() {
        C82854Ci bubbleType = getBubbleType();
        C82854Ci r2 = C82854Ci.FULL;
        Resources resources = getResources();
        int i = 2131168774;
        if (bubbleType == r2) {
            i = 2131168779;
        }
        return resources.getDimensionPixelOffset(i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A1A;
        if (A1j() && !this.A0g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                A1A = A1A(motionEvent);
            } else if (actionMasked == 2) {
                A1A = A1B(motionEvent);
            }
            if (A1A) {
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.A02 = (int) motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.A1j()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r7.A0g
            if (r0 != 0) goto L_0x0019
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x00e5
            if (r1 == r4) goto L_0x002b
            r0 = 2
            if (r1 == r0) goto L_0x00ea
            r0 = 3
            if (r1 == r0) goto L_0x002b
        L_0x0019:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0026
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.A02 = r0
        L_0x0026:
            boolean r0 = super.onTouchEvent(r8)
            return r0
        L_0x002b:
            int r0 = r7.A03
            if (r0 != r4) goto L_0x0019
            r0 = 2
            r7.A03 = r0
            X.5cR r3 = r7.A0k
            if (r3 == 0) goto L_0x005a
            android.view.View r0 = r7.A0j
            float r0 = r0.getTranslationX()
            int r1 = (int) r0
            int r0 = r7.getWidth()
            int r0 = r0 / 6
            if (r1 <= r0) goto L_0x005a
            X.206 r2 = r7.getFMessage()
            X.00H r0 = r7.A0N
            java.lang.Object r0 = r0.get()
            X.37u r0 = (X.C695937u) r0
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x00b8
            r3.CMe(r2)
        L_0x005a:
            android.view.View r0 = r7.A0j
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r5 = 0
            android.view.ViewPropertyAnimator r3 = r0.translationX(r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r6 = r3.setInterpolator(r0)
            r3 = 10
            X.3Mo r0 = new X.3Mo
            r0.<init>(r7, r3)
            r6.setListener(r0)
            android.widget.LinearLayout r0 = r7.A06
            if (r0 == 0) goto L_0x0096
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.ViewPropertyAnimator r3 = r0.translationX(r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
        L_0x0096:
            android.util.Pair r0 = r7.A04
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r0.first
            if (r0 == 0) goto L_0x00b4
            android.view.View r0 = (android.view.View) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.ViewPropertyAnimator r1 = r0.translationX(r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
        L_0x00b4:
            r7.invalidate()
            return r4
        L_0x00b8:
            boolean r1 = r3.Bfy()
            boolean r0 = r3.BfZ()
            r3.setQuotedMessage(r2)
            if (r1 == 0) goto L_0x00ca
            r0 = r0 ^ 1
            r3.C3D(r2, r0)
        L_0x00ca:
            r1 = r7
            X.3uP r1 = (X.AnonymousClass3uP) r1
            r1.A2d = r4
            r0 = 49
            X.AnonymousClass3uP.A0f(r1, r0)
            X.0z4 r0 = r1.A0v
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "pref_last_swipe_reply_ts"
            X.C17880vN.A1D(r1, r0, r2)
            goto L_0x005a
        L_0x00e5:
            boolean r0 = r7.A1A(r8)
            goto L_0x00ee
        L_0x00ea:
            boolean r0 = r7.A1B(r8)
        L_0x00ee:
            if (r0 == 0) goto L_0x0019
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79093uR.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawBubble(boolean z) {
        this.A0U = z;
    }

    public void setFMessage(AnonymousClass206 r1) {
        this.A0I = r1;
    }

    public int getUserNameViewId() {
        return 2131432908;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
