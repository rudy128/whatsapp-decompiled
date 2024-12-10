package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.03P  reason: invalid class name */
public class AnonymousClass03P extends TextView implements C27751Xk, C27761Xl {
    public Future A00;
    public C007003d A01;
    public C16920tR A02;
    public boolean A03;
    public final AnonymousClass03U A04;
    public final C007703l A05;
    public final C007103e A06;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r1 != 2) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r3 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25837Cmr A05(android.widget.TextView r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0010
            android.text.PrecomputedText$Params r0 = X.C62702rp.A00(r5)
            X.Cmr r4 = new X.Cmr
            r4.<init>(r0)
            return r4
        L_0x0010:
            android.text.TextPaint r1 = r5.getPaint()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            X.CYj r4 = new X.CYj
            r4.<init>(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0032
            int r0 = X.C63762te.A00(r5)
            r4.A00(r0)
            int r0 = X.C63762te.A01(r5)
            r4.A01(r0)
        L_0x0032:
            android.text.method.TransformationMethod r0 = r5.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 != 0) goto L_0x0090
            r0 = 28
            r3 = 0
            r2 = 1
            if (r1 < r0) goto L_0x0074
            int r0 = r5.getInputType()
            r1 = r0 & 15
            r0 = 3
            if (r1 != r0) goto L_0x0074
            java.util.Locale r0 = r5.getTextLocale()
            android.icu.text.DecimalFormatSymbols r0 = X.AnonymousClass2SR.A00(r0)
            java.lang.String[] r0 = X.C62702rp.A02(r0)
            r0 = r0[r3]
            int r0 = r0.codePointAt(r3)
            byte r1 = java.lang.Character.getDirectionality(r0)
            if (r1 == r2) goto L_0x0064
            r0 = 2
            if (r1 != r0) goto L_0x0090
        L_0x0064:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
        L_0x0066:
            r4.A02 = r3
            android.text.TextPaint r2 = r4.A03
            int r1 = r4.A00
            int r0 = r4.A01
            X.Cmr r4 = new X.Cmr
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0074:
            int r0 = r5.getLayoutDirection()
            if (r0 != r2) goto L_0x007b
            r3 = 1
        L_0x007b:
            int r0 = r5.getTextDirection()
            switch(r0) {
                case 2: goto L_0x008a;
                case 3: goto L_0x0090;
                case 4: goto L_0x0064;
                case 5: goto L_0x008d;
                case 6: goto L_0x0087;
                case 7: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            if (r3 == 0) goto L_0x0087
        L_0x0084:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0066
        L_0x0087:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x0066
        L_0x008a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0066
        L_0x008d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0066
        L_0x0090:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03P.A05(android.widget.TextView):X.Cmr");
    }

    public static void A07(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new NullPointerException("getPrecomputedText");
        }
        A05(textView);
        throw new NullPointerException("getParams");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r2 != android.text.TextDirectionHeuristics.LOCALE) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(android.widget.TextView r3, X.C25837Cmr r4) {
        /*
            android.text.TextDirectionHeuristic r2 = r4.A03
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r2 == r0) goto L_0x004c
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 == r0) goto L_0x004c
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r2 != r0) goto L_0x003b
            r1 = 2
        L_0x000f:
            r3.setTextDirection(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x004e
            android.text.TextPaint r1 = r4.A04
            float r2 = r1.getTextScaleX()
            android.text.TextPaint r0 = r3.getPaint()
            r0.set(r1)
            float r0 = r3.getTextScaleX()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r3.setTextScaleX(r1)
        L_0x0037:
            r3.setTextScaleX(r2)
            return
        L_0x003b:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r2 != r0) goto L_0x0041
            r1 = 3
            goto L_0x000f
        L_0x0041:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r2 != r0) goto L_0x0047
            r1 = 4
            goto L_0x000f
        L_0x0047:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            r1 = 5
            if (r2 == r0) goto L_0x000f
        L_0x004c:
            r1 = 1
            goto L_0x000f
        L_0x004e:
            android.text.TextPaint r1 = r3.getPaint()
            android.text.TextPaint r0 = r4.A04
            r1.set(r0)
            int r0 = r4.A00()
            X.C63762te.A04(r3, r0)
            int r0 = r4.A01()
            X.C63762te.A05(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03P.A08(android.widget.TextView, X.Cmr):void");
    }

    private C007003d getEmojiTextViewHelper() {
        C007003d r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C007003d r02 = new C007003d(this);
        this.A01 = r02;
        return r02;
    }

    public int getAutoSizeMaxTextSize() {
        if (C002801g.A01) {
            return getSuperCaller().BNC();
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C002801g.A01) {
            return getSuperCaller().BND();
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C002801g.A01) {
            return getSuperCaller().BNE();
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C002801g.A01) {
            return getSuperCaller().BNF();
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            return r0.A0C.A06;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C002801g.A01) {
            C007103e r0 = this.A06;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (getSuperCaller().BNG() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public C16920tR getSuperCaller() {
        C16920tR r2 = this.A02;
        if (r2 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                r2 = new AnonymousClass06H(this);
            } else if (i >= 26) {
                r2 = new AnonymousClass0SH(this);
            }
            this.A02 = r2;
        }
        return r2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C007903o r0;
        AnonymousClass03U r02 = this.A04;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C007903o r0;
        AnonymousClass03U r02 = this.A04;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C007903o r0 = this.A06.A07;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C007903o r0 = this.A06.A07;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A07(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C007703l r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A05) == null) {
            return getSuperCaller().BaH();
        }
        return r0.A00();
    }

    public void onMeasure(int i, int i2) {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A07(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C002801g.A01) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A0C.A0C(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C002801g.A01) {
            getSuperCaller().CI0(iArr, i);
            return;
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A0C.A0E(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C002801g.A01) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A0C.A0A(i);
        }
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().CIt(i);
        } else {
            C29261bv.A05(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().CJH(i);
        } else {
            C29261bv.A06(this, i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass03U r0 = this.A04;
        if (r0 != null) {
            r0.A04(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass03U r0 = this.A04;
        if (r0 != null) {
            r0.A05(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C007103e r0 = this.A06;
        r0.A0A(colorStateList);
        r0.A08();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C007103e r0 = this.A06;
        r0.A0B(mode);
        r0.A08();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C007703l r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A05) == null) {
            getSuperCaller().CL5(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextSize(int i, float f) {
        if (C002801g.A01) {
            super.setTextSize(i, f);
            return;
        }
        C007103e r0 = this.A06;
        if (r0 != null) {
            AnonymousClass03f r1 = r0.A0C;
            if (!r1.A0F()) {
                r1.A0B(i, f);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.A03) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                C002100z r0 = C29271bw.A00;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.A03 = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.A03 = false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.03l] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass03P(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A03 = false;
        this.A02 = null;
        AnonymousClass03T.A04(getContext(), this);
        AnonymousClass03U r0 = new AnonymousClass03U(this);
        this.A04 = r0;
        r0.A06(attributeSet, i);
        C007103e r02 = new C007103e(this);
        this.A06 = r02;
        r02.A0C(attributeSet, i);
        r02.A08();
        ? obj = new Object();
        obj.A00 = this;
        this.A05 = obj;
        getEmojiTextViewHelper().A02(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
        C007103e r02 = this.A06;
        if (r02 != null) {
            r02.A08();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C29261bv.A00(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public C25837Cmr getTextMetricsParamsCompat() {
        return A05(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C007103e.A05(editorInfo, onCreateInputConnection, this);
        AnonymousClass0D8.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C007103e r1 = this.A06;
        if (r1 != null && !C002801g.A01) {
            r1.A0C.A09();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C007103e r1 = this.A06;
        if (r1 != null && !C002801g.A01) {
            AnonymousClass03f r12 = r1.A0C;
            if (r12.A0F()) {
                r12.A09();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass03U r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass03U r0 = this.A04;
        if (r0 != null) {
            r0.A03(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass02D.A03().A09(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass02D.A03().A09(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass02D.A03().A09(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass02D.A03().A09(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass02D.A03().A09(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass02D.A03().A09(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass02D.A03().A09(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass02D.A03().A09(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C29261bv.A01(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A03(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A04(inputFilterArr));
    }

    public void setPrecomputedText(D4I d4i) {
        A07(this);
        throw null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A09(context, i);
        }
    }

    public void setLineHeight(int i) {
        C29261bv.A07(this, i);
    }

    public void setTextMetricsParamsCompat(C25837Cmr cmr) {
        A08(this, cmr);
    }

    public AnonymousClass03P(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A06;
        if (r0 != null) {
            r0.A08();
        }
    }

    public AnonymousClass03P(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
