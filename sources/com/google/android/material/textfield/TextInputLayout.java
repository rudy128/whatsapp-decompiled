package com.google.android.material.textfield;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass1HF;
import X.AnonymousClass1X3;
import X.AnonymousClass1X5;
import X.AnonymousClass1YT;
import X.AnonymousClass1YW;
import X.AnonymousClass1Ys;
import X.AnonymousClass1Z2;
import X.AnonymousClass1Z9;
import X.AnonymousClass1ZA;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEA;
import X.BHH;
import X.BIl;
import X.BIm;
import X.BJ1;
import X.BL1;
import X.C108945cZ;
import X.C108975cc;
import X.C17880vN;
import X.C17890vO;
import X.C19740yt;
import X.C22665BJg;
import X.C23517Big;
import X.C26147CtC;
import X.C26165Cte;
import X.C26249Cvn;
import X.C26323Cxg;
import X.C27080DTf;
import X.C27801Xq;
import X.C27811Xs;
import X.C27831Xu;
import X.C28011Ym;
import X.C28021Yn;
import X.C28041Yp;
import X.C28051Yq;
import X.C28131Yz;
import X.C28522E5m;
import X.C28523E5n;
import X.C29071bZ;
import X.C29101bc;
import X.C29191bl;
import X.C29261bv;
import X.D4H;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

public class TextInputLayout extends LinearLayout {
    public static final int[][] A1B = {new int[]{16842919}, new int[0]};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ValueAnimator A09;
    public ColorStateList A0A;
    public EditText A0B;
    public TextView A0C;
    public TextView A0D;
    public C29071bZ A0E;
    public C29071bZ A0F;
    public C27801Xq A0G;
    public C27801Xq A0H;
    public C27801Xq A0I;
    public C28011Ym A0J;
    public C28522E5m A0K;
    public CharSequence A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public ColorStateList A0j;
    public ColorStateList A0k;
    public ColorStateList A0l;
    public ColorStateList A0m;
    public ColorStateList A0n;
    public Typeface A0o;
    public Drawable A0p;
    public Drawable A0q;
    public Drawable A0r;
    public StateListDrawable A0s;
    public C27801Xq A0t;
    public CharSequence A0u;
    public CharSequence A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public final int A11;
    public final Rect A12;
    public final FrameLayout A13;
    public final C26249Cvn A14;
    public final BIm A15;
    public final C26147CtC A16;
    public final BIl A17;
    public final LinkedHashSet A18;
    public final Rect A19;
    public final RectF A1A;

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0S = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0S = false;
    }

    private int A00() {
        float A062;
        if (this.A0O) {
            int i = this.A01;
            if (i == 0) {
                A062 = this.A14.A06();
            } else if (i == 2) {
                A062 = this.A14.A06() / 2.0f;
            }
            return (int) A062;
        }
        return 0;
    }

    private C29071bZ A01() {
        C29071bZ r3 = new C29071bZ();
        r3.A0C((long) AnonymousClass1Z9.A00(getContext(), 2130970540, 87));
        r3.A0D(C29101bc.A01(AnonymousClass1YW.A03, getContext(), 2130970550));
        return r3;
    }

    private void A03() {
        int i;
        int i2;
        int i3;
        C27801Xq r2 = this.A0G;
        if (r2 != null) {
            C28011Ym r1 = r2.A01.A0K;
            C28011Ym r0 = this.A0J;
            if (r1 != r0) {
                r2.setShapeAppearanceModel(r0);
            }
            if (this.A01 == 2 && (i2 = this.A06) > -1 && (i3 = this.A03) != 0) {
                C27801Xq r22 = this.A0G;
                r22.A01.A04 = (float) i2;
                r22.invalidateSelf();
                r22.A0G(ColorStateList.valueOf(i3));
            }
            int i4 = this.A00;
            if (this.A01 == 1) {
                i4 = AnonymousClass1Z2.A05(this.A00, AnonymousClass1ZA.A01(getContext(), 2130969148, 0));
            }
            this.A00 = i4;
            BE7.A1C(this.A0G, i4);
            C27801Xq r23 = this.A0H;
            if (!(r23 == null || this.A0I == null)) {
                if (this.A06 > -1 && this.A03 != 0) {
                    if (this.A0B.isFocused()) {
                        i = this.A08;
                    } else {
                        i = this.A03;
                    }
                    BE7.A1C(r23, i);
                    BE7.A1C(this.A0I, this.A03);
                }
                invalidate();
            }
            A0E();
        }
    }

    private void A04() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText;
        int paddingStart;
        int dimensionPixelSize;
        int paddingEnd;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        C27801Xq r1;
        int i3 = this.A01;
        if (i3 == 0) {
            this.A0G = null;
            this.A0H = null;
            this.A0I = null;
        } else if (i3 == 1) {
            this.A0G = new C27801Xq(this.A0J);
            this.A0H = new C27801Xq();
            this.A0I = new C27801Xq();
        } else if (i3 == 2) {
            if (!this.A0O || (this.A0G instanceof C23517Big)) {
                r1 = new C27801Xq(this.A0J);
            } else {
                r1 = new C23517Big(this.A0J);
            }
            this.A0G = r1;
            this.A0H = null;
            this.A0I = null;
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(i3);
            throw AnonymousClass001.A12(" is illegal; only @BoxBackgroundMode constants are supported.", A102);
        }
        A0E();
        A0F();
        if (this.A01 == 1) {
            if (AnonymousClass000.A0Y(this).getConfiguration().fontScale >= 2.0f) {
                resources2 = getResources();
                i2 = 2131167663;
            } else if (AnonymousClass1YT.A04(getContext())) {
                resources2 = getResources();
                i2 = 2131167662;
            }
            this.A02 = resources2.getDimensionPixelSize(i2);
        }
        if (this.A0B != null && this.A01 == 1) {
            if (AnonymousClass000.A0Y(this).getConfiguration().fontScale >= 2.0f) {
                editText = this.A0B;
                paddingStart = editText.getPaddingStart();
                dimensionPixelSize = getResources().getDimensionPixelSize(2131167661);
                paddingEnd = this.A0B.getPaddingEnd();
                resources = getResources();
                i = 2131167660;
            } else if (AnonymousClass1YT.A04(getContext())) {
                editText = this.A0B;
                paddingStart = editText.getPaddingStart();
                dimensionPixelSize = getResources().getDimensionPixelSize(2131167659);
                paddingEnd = this.A0B.getPaddingEnd();
                resources = getResources();
                i = 2131167658;
            }
            editText.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, resources.getDimensionPixelSize(i));
        }
        if (this.A01 != 0) {
            A07();
        }
        EditText editText2 = this.A0B;
        if (editText2 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.A01;
                if (i4 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i4 == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private void A06() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A0C;
        if (textView != null) {
            if (this.A0y) {
                i = this.A0T;
            } else {
                i = this.A0U;
            }
            A0I(textView, i);
            if (!this.A0y && (colorStateList2 = this.A0k) != null) {
                this.A0C.setTextColor(colorStateList2);
            }
            if (this.A0y && (colorStateList = this.A0j) != null) {
                this.A0C.setTextColor(colorStateList);
            }
        }
    }

    private void A07() {
        if (this.A01 != 1) {
            FrameLayout frameLayout = this.A13;
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(frameLayout);
            int A002 = A00();
            if (A002 != A0B2.topMargin) {
                A0B2.topMargin = A002;
                frameLayout.requestLayout();
            }
        }
    }

    public static void A08(Editable editable, TextInputLayout textInputLayout) {
        if (textInputLayout.A0K.BG3(editable) != 0 || textInputLayout.A0P) {
            TextView textView = textInputLayout.A0D;
            if (textView != null && textInputLayout.A0R) {
                textView.setText((CharSequence) null);
                C29191bl.A02(textInputLayout.A13, textInputLayout.A0F);
                textInputLayout.A0D.setVisibility(4);
            }
        } else if (textInputLayout.A0D != null && textInputLayout.A0R && !TextUtils.isEmpty(textInputLayout.A0L)) {
            textInputLayout.A0D.setText(textInputLayout.A0L);
            C29191bl.A02(textInputLayout.A13, textInputLayout.A0E);
            textInputLayout.A0D.setVisibility(0);
            textInputLayout.A0D.bringToFront();
            textInputLayout.announceForAccessibility(textInputLayout.A0L);
        }
    }

    private boolean A0C() {
        if (!this.A0O || TextUtils.isEmpty(this.A0u) || !(this.A0G instanceof C23517Big)) {
            return false;
        }
        return true;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.A0B;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.A0G;
        }
        int A032 = AnonymousClass1ZA.A03(this.A0B, 2130969112);
        int i = this.A01;
        if (i == 2) {
            Context context = getContext();
            C27801Xq r6 = this.A0G;
            int[][] iArr = A1B;
            int A022 = AnonymousClass1ZA.A02(context, "TextInputLayout", 2130969148);
            C27801Xq r7 = new C27801Xq(r6.A01.A0K);
            int A002 = AnonymousClass1ZA.A00(0.1f, A032, A022);
            r7.A0F(new ColorStateList(iArr, new int[]{A002, 0}));
            r7.setTint(A022);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{A002, A022});
            C27801Xq r1 = new C27801Xq(r6.A01.A0K);
            r1.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, r7, r1), r6});
        } else if (i != 1) {
            return null;
        } else {
            C27801Xq r5 = this.A0G;
            int i2 = this.A00;
            int[][] iArr2 = A1B;
            int A003 = AnonymousClass1ZA.A00(0.1f, A032, i2);
            int[] A1W = C108945cZ.A1W();
            A1W[0] = A003;
            A1W[1] = i2;
            return new RippleDrawable(new ColorStateList(iArr2, A1W), r5, r5);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.A0s == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.A0s = stateListDrawable;
            int[] A1X = BE6.A1X();
            A1X[0] = 16842922;
            stateListDrawable.addState(A1X, getOrCreateOutlinedDropDownMenuBackground());
            this.A0s.addState(new int[0], A02(false));
        }
        return this.A0s;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        C27801Xq r0 = this.A0t;
        if (r0 != null) {
            return r0;
        }
        C27801Xq A022 = A02(true);
        this.A0t = A022;
        return A022;
    }

    private void setEditText(EditText editText) {
        if (this.A0B == null) {
            BIm bIm = this.A15;
            if (bIm.A01 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A0B = editText;
            int i = this.A0f;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.A0g);
            }
            int i2 = this.A0d;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.A0e);
            }
            this.A0x = false;
            A04();
            setTextInputAccessibilityDelegate(new C22665BJg(this));
            C26249Cvn cvn = this.A14;
            Typeface typeface = this.A0B.getTypeface();
            boolean A042 = C26249Cvn.A04(typeface, cvn);
            boolean A052 = C26249Cvn.A05(typeface, cvn);
            if (A042 || A052) {
                cvn.A0D(false);
            }
            float textSize = this.A0B.getTextSize();
            if (cvn.A0M != textSize) {
                cvn.A0M = textSize;
                cvn.A0D(false);
            }
            float letterSpacing = this.A0B.getLetterSpacing();
            if (cvn.A0H != letterSpacing) {
                cvn.A0H = letterSpacing;
                cvn.A0D(false);
            }
            int gravity = this.A0B.getGravity();
            cvn.A09((gravity & -113) | 48);
            if (cvn.A0V != gravity) {
                cvn.A0V = gravity;
                cvn.A0D(false);
            }
            this.A0B.addTextChangedListener(new D4H(this, 1));
            if (this.A0l == null) {
                this.A0l = this.A0B.getHintTextColors();
            }
            if (this.A0O) {
                if (TextUtils.isEmpty(this.A0u)) {
                    CharSequence hint = this.A0B.getHint();
                    this.A0v = hint;
                    setHint(hint);
                    this.A0B.setHint((CharSequence) null);
                }
                this.A0Q = true;
            }
            if (this.A0C != null) {
                A0H(this.A0B.getText());
            }
            A0D();
            this.A16.A03();
            this.A17.bringToFront();
            bIm.bringToFront();
            Iterator it = this.A18.iterator();
            while (it.hasNext()) {
                ((C28523E5n) it.next()).BsV(this);
            }
            bIm.A04();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A0A(this, false, true);
            return;
        }
        throw AnonymousClass000.A0k("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0u)) {
            this.A0u = charSequence;
            C26249Cvn cvn = this.A14;
            if (charSequence == null || !TextUtils.equals(cvn.A0j, charSequence)) {
                cvn.A0j = charSequence;
                cvn.A0k = null;
                cvn.A0D(false);
            }
            if (!this.A0P) {
                A05();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.A0R != z) {
            TextView textView = this.A0D;
            if (!z) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.A0D = null;
            } else if (textView != null) {
                this.A13.addView(textView);
                this.A0D.setVisibility(0);
            }
            this.A0R = z;
        }
    }

    public void A0D() {
        Drawable background;
        int currentTextColor;
        EditText editText = this.A0B;
        if (editText != null && this.A01 == 0 && (background = editText.getBackground()) != null) {
            Drawable mutate = background.mutate();
            C26147CtC ctC = this.A16;
            if (ctC.A07()) {
                TextView textView = ctC.A0A;
                if (textView == null) {
                    currentTextColor = -1;
                }
                currentTextColor = textView.getCurrentTextColor();
            } else {
                if (!this.A0y || (textView = this.A0C) == null) {
                    C27831Xu.A09(mutate);
                    this.A0B.refreshDrawableState();
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
            }
            mutate.setColorFilter(AnonymousClass01X.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
        }
    }

    public void A0E() {
        EditText editText = this.A0B;
        if (editText != null && this.A0G != null) {
            if ((this.A0x || editText.getBackground() == null) && this.A01 != 0) {
                this.A0B.setBackground(getEditTextBoxBackground());
                this.A0x = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010f, code lost:
        if (r1 != null) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F() {
        /*
            r9 = this;
            X.1Xq r0 = r9.A0G
            if (r0 == 0) goto L_0x00d9
            int r0 = r9.A01
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r9.isFocused()
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x001a
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x0151
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0151
        L_0x001a:
            r8 = 1
        L_0x001b:
            boolean r0 = r9.isHovered()
            if (r0 != 0) goto L_0x002b
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x014e
            boolean r0 = r0.isHovered()
            if (r0 == 0) goto L_0x014e
        L_0x002b:
            r7 = 1
        L_0x002c:
            X.CtC r2 = r9.A16
            boolean r0 = r2.A07()
            if (r0 != 0) goto L_0x003c
            android.widget.TextView r0 = r9.A0C
            if (r0 == 0) goto L_0x003d
            boolean r0 = r9.A0y
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r6 = 1
        L_0x003d:
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00f4
            int r0 = r9.A0W
        L_0x0045:
            r9.A03 = r0
        L_0x0047:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0050
            r9.A0B(r6)
        L_0x0050:
            X.BIm r4 = r9.A15
            X.BIm.A01(r4)
            com.google.android.material.textfield.TextInputLayout r3 = r4.A0J
            com.google.android.material.internal.CheckableImageButton r1 = r4.A0H
            android.content.res.ColorStateList r0 = r4.A03
            X.C26165Cte.A02(r0, r1, r3)
            com.google.android.material.internal.CheckableImageButton r2 = r4.A0G
            android.content.res.ColorStateList r0 = r4.A02
            X.C26165Cte.A02(r0, r2, r3)
            X.CcZ r0 = r4.A03()
            boolean r0 = r0 instanceof X.Bio
            if (r0 == 0) goto L_0x008d
            X.CtC r0 = r3.A16
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            android.graphics.drawable.Drawable r1 = X.BE7.A0E(r0)
            int r0 = r3.getErrorCurrentTextColors()
            X.C27831Xu.A0C(r1, r0)
            r2.setImageDrawable(r1)
        L_0x008d:
            X.BIl r0 = r9.A17
            com.google.android.material.textfield.TextInputLayout r2 = r0.A09
            com.google.android.material.internal.CheckableImageButton r1 = r0.A08
            android.content.res.ColorStateList r0 = r0.A01
            X.C26165Cte.A02(r0, r1, r2)
            int r1 = r9.A01
            r0 = 2
            if (r1 != r0) goto L_0x00c8
            int r1 = r9.A06
            if (r8 == 0) goto L_0x00e9
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00e9
            int r0 = r9.A05
        L_0x00a9:
            r9.A06 = r0
            if (r0 == r1) goto L_0x00c8
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x00c5
            X.1Xq r1 = r9.A0G
            X.Big r1 = (X.C23517Big) r1
            r0 = 0
            r1.A0K(r0, r0, r0, r0)
        L_0x00c5:
            r9.A05()
        L_0x00c8:
            int r0 = r9.A01
            if (r0 != r5) goto L_0x00d6
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00da
            int r0 = r9.A0X
        L_0x00d4:
            r9.A00 = r0
        L_0x00d6:
            r9.A03()
        L_0x00d9:
            return
        L_0x00da:
            if (r7 == 0) goto L_0x00e1
            if (r8 != 0) goto L_0x00e6
            int r0 = r9.A0b
            goto L_0x00d4
        L_0x00e1:
            if (r8 != 0) goto L_0x00e6
            int r0 = r9.A0V
            goto L_0x00d4
        L_0x00e6:
            int r0 = r9.A0Z
            goto L_0x00d4
        L_0x00e9:
            int r0 = r9.A04
            goto L_0x00a9
        L_0x00ec:
            android.content.res.ColorStateList r1 = r4.A02
            android.graphics.PorterDuff$Mode r0 = r4.A04
            X.C26165Cte.A01(r1, r0, r2, r3)
            goto L_0x008d
        L_0x00f4:
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0105
            android.content.res.ColorStateList r1 = r9.A0A
            if (r1 != 0) goto L_0x0111
            android.widget.TextView r0 = r2.A0A
            if (r0 != 0) goto L_0x0138
            r0 = -1
            goto L_0x0045
        L_0x0105:
            boolean r0 = r9.A0y
            if (r0 == 0) goto L_0x013e
            android.widget.TextView r0 = r9.A0C
            if (r0 == 0) goto L_0x013e
            android.content.res.ColorStateList r1 = r9.A0A
            if (r1 == 0) goto L_0x0138
        L_0x0111:
            int r4 = r1.getDefaultColor()
            android.content.res.ColorStateList r1 = r9.A0A
            r3 = 2
            int[] r0 = new int[r3]
            r0 = {16843623, 16842910} // fill-array
            int r2 = r1.getColorForState(r0, r4)
            android.content.res.ColorStateList r1 = r9.A0A
            int[] r0 = new int[r3]
            r0 = {16843518, 16842910} // fill-array
            int r0 = r1.getColorForState(r0, r4)
            if (r8 != 0) goto L_0x0045
            if (r7 == 0) goto L_0x0134
            r9.A03 = r2
            goto L_0x0047
        L_0x0134:
            r9.A03 = r4
            goto L_0x0047
        L_0x0138:
            int r0 = r0.getCurrentTextColor()
            goto L_0x0045
        L_0x013e:
            if (r8 == 0) goto L_0x0144
            int r0 = r9.A0a
            goto L_0x0045
        L_0x0144:
            if (r7 == 0) goto L_0x014a
            int r0 = r9.A0c
            goto L_0x0045
        L_0x014a:
            int r0 = r9.A08
            goto L_0x0045
        L_0x014e:
            r7 = 0
            goto L_0x002c
        L_0x0151:
            r8 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0F():void");
    }

    public void A0G(float f) {
        C26249Cvn cvn = this.A14;
        if (cvn.A0G != f) {
            if (this.A09 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A09 = valueAnimator;
                valueAnimator.setInterpolator(C29101bc.A01(AnonymousClass1YW.A02, getContext(), 2130970548));
                this.A09.setDuration((long) AnonymousClass1Z9.A00(getContext(), 2130970538, 167));
                C26323Cxg.A00(this.A09, this, 17);
            }
            ValueAnimator valueAnimator2 = this.A09;
            float[] A1V = C108945cZ.A1V();
            A1V[0] = cvn.A0G;
            A1V[1] = f;
            valueAnimator2.setFloatValues(A1V);
            this.A09.start();
        }
    }

    public void A0H(Editable editable) {
        AnonymousClass1X3 r5;
        String obj;
        int BG3 = this.A0K.BG3(editable);
        boolean z = this.A0y;
        int i = this.A07;
        if (i == -1) {
            this.A0C.setText(String.valueOf(BG3));
            this.A0C.setContentDescription((CharSequence) null);
            this.A0y = false;
        } else {
            this.A0y = C108975cc.A1D(BG3, i);
            Context context = getContext();
            TextView textView = this.A0C;
            int i2 = this.A07;
            int i3 = 2131898777;
            if (this.A0y) {
                i3 = 2131898778;
            }
            Object[] A1b = AnonymousClass3MW.A1b();
            Integer valueOf = Integer.valueOf(BG3);
            BE8.A1A(valueOf, A1b, 0, i2, 1);
            textView.setContentDescription(context.getString(i3, A1b));
            if (z != this.A0y) {
                A06();
            }
            AnonymousClass1X3 r0 = AnonymousClass1X3.A02;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                r5 = AnonymousClass1X3.A03;
            } else {
                r5 = AnonymousClass1X3.A02;
            }
            TextView textView2 = this.A0C;
            Context context2 = getContext();
            Object[] A1b2 = AnonymousClass3MX.A1b(valueOf, 0);
            C17880vN.A1T(A1b2, this.A07, 1);
            String string = context2.getString(2131898779, A1b2);
            AnonymousClass1X5 r02 = r5.A00;
            if (string == null) {
                obj = null;
            } else {
                obj = r5.A02(r02, string).toString();
            }
            textView2.setText(obj);
        }
        if (this.A0B != null && z != this.A0y) {
            A0A(this, false, false);
            A0F();
            A0D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2.getMeasuredWidth() <= 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2.A07.getVisibility() == 0) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J() {
        /*
            r11 = this;
            android.widget.EditText r0 = r11.A0B
            r8 = 0
            if (r0 != 0) goto L_0x0006
            return r8
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r11.getStartIconDrawable()
            if (r0 != 0) goto L_0x001a
            X.BIl r2 = r11.A17
            java.lang.CharSequence r0 = r2.A05
            if (r0 == 0) goto L_0x0023
            android.widget.TextView r0 = r2.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0023
        L_0x001a:
            X.BIl r2 = r11.A17
            int r1 = r2.getMeasuredWidth()
            r0 = 1
            if (r1 > 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r6 = 0
            r10 = 2
            r9 = 3
            r5 = 1
            if (r0 == 0) goto L_0x00ea
            int r1 = r2.getMeasuredWidth()
            android.widget.EditText r0 = r11.A0B
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            android.graphics.drawable.Drawable r0 = r11.A0r
            if (r0 == 0) goto L_0x003d
            int r0 = r11.A0i
            if (r0 == r1) goto L_0x0049
        L_0x003d:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r11.A0r = r0
            r11.A0i = r1
            r0.setBounds(r8, r8, r1, r5)
        L_0x0049:
            android.widget.EditText r0 = r11.A0B
            android.graphics.drawable.Drawable[] r7 = r0.getCompoundDrawablesRelative()
            r0 = r7[r8]
            android.graphics.drawable.Drawable r4 = r11.A0r
            if (r0 == r4) goto L_0x0103
            android.widget.EditText r3 = r11.A0B
            r2 = r7[r5]
            r1 = r7[r10]
            r0 = r7[r9]
            r3.setCompoundDrawablesRelative(r4, r2, r1, r0)
        L_0x0060:
            r4 = 1
        L_0x0061:
            X.BIm r1 = r11.A15
            com.google.android.material.internal.CheckableImageButton r3 = r1.A0H
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x0079
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0075
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x0079
        L_0x0075:
            java.lang.CharSequence r0 = r1.A0B
            if (r0 == 0) goto L_0x0107
        L_0x0079:
            int r0 = r1.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0107
            android.widget.TextView r0 = r1.A0F
            int r2 = r0.getMeasuredWidth()
            android.widget.EditText r0 = r11.A0B
            int r0 = r0.getPaddingRight()
            int r2 = r2 - r0
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x00a0
            int r0 = r1.A01
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x00ae
            com.google.android.material.internal.CheckableImageButton r3 = r1.A0G
            if (r3 == 0) goto L_0x00ae
        L_0x00a0:
            int r0 = r3.getMeasuredWidth()
            int r2 = r2 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r3)
            int r0 = r0.getMarginStart()
            int r2 = r2 + r0
        L_0x00ae:
            android.widget.EditText r0 = r11.A0B
            android.graphics.drawable.Drawable[] r6 = r0.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r1 = r11.A0p
            if (r1 == 0) goto L_0x00cf
            int r0 = r11.A0Y
            if (r0 == r2) goto L_0x00db
            r11.A0Y = r2
            r1.setBounds(r8, r8, r2, r5)
            android.widget.EditText r4 = r11.A0B
            r3 = r6[r8]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r1 = r11.A0p
        L_0x00c9:
            r0 = r6[r9]
            r4.setCompoundDrawablesRelative(r3, r2, r1, r0)
            return r5
        L_0x00cf:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r11.A0p = r0
            r11.A0Y = r2
            r0.setBounds(r8, r8, r2, r5)
        L_0x00db:
            r0 = r6[r10]
            android.graphics.drawable.Drawable r1 = r11.A0p
            if (r0 == r1) goto L_0x0106
            r11.A0q = r0
            android.widget.EditText r4 = r11.A0B
            r3 = r6[r8]
            r2 = r6[r5]
            goto L_0x00c9
        L_0x00ea:
            android.graphics.drawable.Drawable r0 = r11.A0r
            if (r0 == 0) goto L_0x0103
            android.widget.EditText r0 = r11.A0B
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r3 = r11.A0B
            r2 = r0[r5]
            r1 = r0[r10]
            r0 = r0[r9]
            r3.setCompoundDrawablesRelative(r6, r2, r1, r0)
            r11.A0r = r6
            goto L_0x0060
        L_0x0103:
            r4 = 0
            goto L_0x0061
        L_0x0106:
            return r4
        L_0x0107:
            android.graphics.drawable.Drawable r0 = r11.A0p
            if (r0 == 0) goto L_0x0129
            android.widget.EditText r0 = r11.A0B
            android.graphics.drawable.Drawable[] r7 = r0.getCompoundDrawablesRelative()
            r1 = r7[r10]
            android.graphics.drawable.Drawable r0 = r11.A0p
            if (r1 != r0) goto L_0x0127
            android.widget.EditText r4 = r11.A0B
            r3 = r7[r8]
            r2 = r7[r5]
            android.graphics.drawable.Drawable r1 = r11.A0q
            r0 = r7[r9]
            r4.setCompoundDrawablesRelative(r3, r2, r1, r0)
        L_0x0124:
            r11.A0p = r6
            return r5
        L_0x0127:
            r5 = r4
            goto L_0x0124
        L_0x0129:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0J():boolean");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.A13;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A07();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A0B;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.A0v != null) {
            boolean z = this.A0Q;
            this.A0Q = false;
            CharSequence hint = editText.getHint();
            this.A0B.setHint(this.A0v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.A0B.setHint(hint);
                this.A0Q = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.A13;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.A0B) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.A10
            if (r0 != 0) goto L_0x004d
            r3 = 1
            r4.A10 = r3
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            X.Cvn r1 = r4.A14
            r2 = 0
            if (r1 == 0) goto L_0x0050
            r1.A0q = r0
            android.content.res.ColorStateList r0 = r1.A0b
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0029
        L_0x001f:
            android.content.res.ColorStateList r0 = r1.A0d
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0050
        L_0x0029:
            r1.A0D(r2)
            r1 = 1
        L_0x002d:
            android.widget.EditText r0 = r4.A0B
            if (r0 == 0) goto L_0x0040
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x004e
        L_0x003d:
            A0A(r4, r3, r2)
        L_0x0040:
            r4.A0D()
            r4.A0F()
            if (r1 == 0) goto L_0x004b
            r4.invalidate()
        L_0x004b:
            r4.A10 = r2
        L_0x004d:
            return
        L_0x004e:
            r3 = 0
            goto L_0x003d
        L_0x0050:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public int getBaseline() {
        EditText editText = this.A0B;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + A00();
        }
        return super.getBaseline();
    }

    public C27801Xq getBoxBackground() {
        int i = this.A01;
        if (i == 1 || i == 2) {
            return this.A0G;
        }
        throw BE6.A0k();
    }

    public int getBoxBackgroundColor() {
        return this.A00;
    }

    public int getBoxBackgroundMode() {
        return this.A01;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.A02;
    }

    public int getBoxStrokeColor() {
        return this.A0a;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0A;
    }

    public int getBoxStrokeWidth() {
        return this.A04;
    }

    public int getBoxStrokeWidthFocused() {
        return this.A05;
    }

    public int getCounterMaxLength() {
        return this.A07;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A0M || !this.A0y || (textView = this.A0C) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A0j;
    }

    public ColorStateList getCounterTextColor() {
        return this.A0k;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0l;
    }

    public EditText getEditText() {
        return this.A0B;
    }

    public CharSequence getEndIconContentDescription() {
        return this.A15.A0G.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.A15.A0G.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.A15.A00;
    }

    public int getEndIconMode() {
        return this.A15.A01;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.A15.A09;
    }

    public CheckableImageButton getEndIconView() {
        return this.A15.A0G;
    }

    public CharSequence getError() {
        C26147CtC ctC = this.A16;
        if (ctC.A0F) {
            return ctC.A0C;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.A16.A03;
    }

    public CharSequence getErrorContentDescription() {
        return this.A16.A0D;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A16.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.A15.A0H.getDrawable();
    }

    public CharSequence getHelperText() {
        C26147CtC ctC = this.A16;
        if (ctC.A0G) {
            return ctC.A0E;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A16.A0B;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0O) {
            return this.A0u;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A14.A06();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C26249Cvn cvn = this.A14;
        return C26249Cvn.A01(cvn.A0b, cvn);
    }

    public ColorStateList getHintTextColor() {
        return this.A0m;
    }

    public C28522E5m getLengthCounter() {
        return this.A0K;
    }

    public int getMaxEms() {
        return this.A0d;
    }

    public int getMaxWidth() {
        return this.A0e;
    }

    public int getMinEms() {
        return this.A0f;
    }

    public int getMinWidth() {
        return this.A0g;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A15.A0G.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A15.A0G.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A0R) {
            return this.A0L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A0h;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A0n;
    }

    public CharSequence getPrefixText() {
        return this.A17.A05;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A17.A07.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A17.A07;
    }

    public C28011Ym getShapeAppearanceModel() {
        return this.A0J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.A17.A08.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.A17.A08.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.A17.A00;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.A17.A04;
    }

    public CharSequence getSuffixText() {
        return this.A15.A0B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A15.A0F.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A15.A0F;
    }

    public Typeface getTypeface() {
        return this.A0o;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BL1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BL1 bl1 = (BL1) parcelable;
        super.onRestoreInstanceState(bl1.A00);
        setError(bl1.A00);
        if (bl1.A01) {
            post(new C27080DTf((Object) this, 26));
        }
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0V = i;
            this.A0Z = i;
            this.A0b = i;
            A03();
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (this.A0B != null) {
                A04();
            }
        }
    }

    public void setBoxCornerFamily(int i) {
        C28011Ym r3 = this.A0J;
        C28041Yp r2 = new C28041Yp(r3);
        C28021Yn r1 = r3.A02;
        r2.A06 = C27811Xs.A00(i);
        r2.A02 = r1;
        C28021Yn r12 = r3.A03;
        r2.A07 = C27811Xs.A00(i);
        r2.A03 = r12;
        C28021Yn r13 = r3.A00;
        r2.A04 = C27811Xs.A00(i);
        r2.A00 = r13;
        C28021Yn r14 = r3.A01;
        r2.A05 = C27811Xs.A00(i);
        r2.A01 = r14;
        this.A0J = new C28011Ym(r2);
        A03();
    }

    public void setBoxStrokeColor(int i) {
        if (this.A0a != i) {
            this.A0a = i;
            A0F();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0A != colorStateList) {
            this.A0A = colorStateList;
            A0F();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.A04 = i;
        A0F();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.A05 = i;
        A0F();
    }

    public void setCounterEnabled(boolean z) {
        Editable text;
        if (this.A0M != z) {
            if (z) {
                AnonymousClass03P r1 = new AnonymousClass03P(getContext());
                this.A0C = r1;
                r1.setId(2131436095);
                Typeface typeface = this.A0o;
                if (typeface != null) {
                    this.A0C.setTypeface(typeface);
                }
                this.A0C.setMaxLines(1);
                this.A16.A05(this.A0C, 2);
                AnonymousClass3MW.A0B(this.A0C).setMarginStart(getResources().getDimensionPixelOffset(2131167940));
                A06();
                if (this.A0C != null) {
                    EditText editText = this.A0B;
                    if (editText == null) {
                        text = null;
                    } else {
                        text = editText.getText();
                    }
                    A0H(text);
                }
            } else {
                this.A16.A06(this.A0C, 2);
                this.A0C = null;
            }
            this.A0M = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.A07 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.A07 = i;
            if (this.A0M && this.A0C != null) {
                EditText editText = this.A0B;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                A0H(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A0T != i) {
            this.A0T = i;
            A06();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A0j != colorStateList) {
            this.A0j = colorStateList;
            A06();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.A0U != i) {
            this.A0U = i;
            A06();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A0k != colorStateList) {
            this.A0k = colorStateList;
            A06();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0l = colorStateList;
        this.A0m = colorStateList;
        if (this.A0B != null) {
            A0A(this, false, false);
        }
    }

    public void setEndIconActivated(boolean z) {
        this.A15.A0G.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.A15.A0G.setCheckable(z);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A15.A0G;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        BIm bIm = this.A15;
        if (i != 0) {
            drawable = BE7.A0F(bIm, i);
        } else {
            drawable = null;
        }
        bIm.A07(drawable);
    }

    public void setEndIconMinSize(int i) {
        this.A15.A05(i);
    }

    public void setEndIconMode(int i) {
        this.A15.A06(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        BIm bIm = this.A15;
        CheckableImageButton checkableImageButton = bIm.A0G;
        View.OnLongClickListener onLongClickListener = bIm.A06;
        checkableImageButton.setOnClickListener(onClickListener);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        BIm bIm = this.A15;
        bIm.A06 = onLongClickListener;
        CheckableImageButton checkableImageButton = bIm.A0G;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        BIm bIm = this.A15;
        bIm.A09 = scaleType;
        bIm.A0G.setScaleType(scaleType);
        bIm.A0H.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        BIm bIm = this.A15;
        if (bIm.A02 != colorStateList) {
            bIm.A02 = colorStateList;
            TextInputLayout textInputLayout = bIm.A0J;
            C26165Cte.A01(colorStateList, bIm.A04, bIm.A0G, textInputLayout);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        BIm bIm = this.A15;
        if (bIm.A04 != mode) {
            bIm.A04 = mode;
            TextInputLayout textInputLayout = bIm.A0J;
            C26165Cte.A01(bIm.A02, mode, bIm.A0G, textInputLayout);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.A15.A0A(z);
    }

    public void setError(CharSequence charSequence) {
        C26147CtC ctC = this.A16;
        if (!ctC.A0F) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = ctC.A05;
            if (animator != null) {
                animator.cancel();
            }
            ctC.A0C = charSequence;
            ctC.A0A.setText(charSequence);
            int i = ctC.A00;
            if (i != 1) {
                ctC.A01 = 1;
            }
            C26147CtC.A01(ctC, i, ctC.A01, C26147CtC.A02(ctC.A0A, ctC, charSequence));
            return;
        }
        ctC.A04();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C26147CtC ctC = this.A16;
        ctC.A03 = i;
        TextView textView = ctC.A0A;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C26147CtC ctC = this.A16;
        ctC.A0D = charSequence;
        TextView textView = ctC.A0A;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C26147CtC ctC = this.A16;
        if (ctC.A0F != z) {
            Animator animator = ctC.A05;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass03P r1 = new AnonymousClass03P(ctC.A0Q);
                ctC.A0A = r1;
                r1.setId(2131436096);
                ctC.A0A.setTextAlignment(5);
                Typeface typeface = ctC.A08;
                if (typeface != null) {
                    ctC.A0A.setTypeface(typeface);
                }
                int i = ctC.A02;
                ctC.A02 = i;
                TextView textView = ctC.A0A;
                if (textView != null) {
                    ctC.A0R.A0I(textView, i);
                }
                ColorStateList colorStateList = ctC.A06;
                ctC.A06 = colorStateList;
                TextView textView2 = ctC.A0A;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = ctC.A0D;
                ctC.A0D = charSequence;
                TextView textView3 = ctC.A0A;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                int i2 = ctC.A03;
                ctC.A03 = i2;
                TextView textView4 = ctC.A0A;
                if (textView4 != null) {
                    textView4.setAccessibilityLiveRegion(i2);
                }
                ctC.A0A.setVisibility(4);
                ctC.A05(ctC.A0A, 0);
            } else {
                ctC.A04();
                ctC.A06(ctC.A0A, 0);
                ctC.A0A = null;
                TextInputLayout textInputLayout = ctC.A0R;
                textInputLayout.A0D();
                textInputLayout.A0F();
            }
            ctC.A0F = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        BIm bIm = this.A15;
        if (i != 0) {
            drawable = BE7.A0F(bIm, i);
        } else {
            drawable = null;
        }
        bIm.A08(drawable);
        TextInputLayout textInputLayout = bIm.A0J;
        C26165Cte.A02(bIm.A03, bIm.A0H, textInputLayout);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        BIm bIm = this.A15;
        CheckableImageButton checkableImageButton = bIm.A0H;
        View.OnLongClickListener onLongClickListener = bIm.A07;
        checkableImageButton.setOnClickListener(onClickListener);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        BIm bIm = this.A15;
        bIm.A07 = onLongClickListener;
        CheckableImageButton checkableImageButton = bIm.A0H;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        BIm bIm = this.A15;
        if (bIm.A03 != colorStateList) {
            bIm.A03 = colorStateList;
            TextInputLayout textInputLayout = bIm.A0J;
            C26165Cte.A01(colorStateList, bIm.A05, bIm.A0H, textInputLayout);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        BIm bIm = this.A15;
        if (bIm.A05 != mode) {
            bIm.A05 = mode;
            TextInputLayout textInputLayout = bIm.A0J;
            C26165Cte.A01(bIm.A03, mode, bIm.A0H, textInputLayout);
        }
    }

    public void setErrorTextAppearance(int i) {
        C26147CtC ctC = this.A16;
        ctC.A02 = i;
        TextView textView = ctC.A0A;
        if (textView != null) {
            ctC.A0R.A0I(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C26147CtC ctC = this.A16;
        ctC.A06 = colorStateList;
        TextView textView = ctC.A0A;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.A0z != z) {
            this.A0z = z;
            A0A(this, false, false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C26147CtC ctC = this.A16;
        ctC.A07 = colorStateList;
        TextView textView = ctC.A0B;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C26147CtC ctC = this.A16;
        if (ctC.A0G != z) {
            Animator animator = ctC.A05;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass03P r1 = new AnonymousClass03P(ctC.A0Q);
                ctC.A0B = r1;
                r1.setId(2131436097);
                ctC.A0B.setTextAlignment(5);
                Typeface typeface = ctC.A08;
                if (typeface != null) {
                    ctC.A0B.setTypeface(typeface);
                }
                ctC.A0B.setVisibility(4);
                ctC.A0B.setAccessibilityLiveRegion(1);
                int i = ctC.A04;
                ctC.A04 = i;
                TextView textView = ctC.A0B;
                if (textView != null) {
                    C29261bv.A08(textView, i);
                }
                ColorStateList colorStateList = ctC.A07;
                ctC.A07 = colorStateList;
                TextView textView2 = ctC.A0B;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                ctC.A05(ctC.A0B, 1);
                ctC.A0B.setAccessibilityDelegate(new BHH(ctC));
            } else {
                Animator animator2 = ctC.A05;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = ctC.A00;
                if (i2 == 2) {
                    ctC.A01 = 0;
                }
                C26147CtC.A01(ctC, i2, ctC.A01, C26147CtC.A02(ctC.A0B, ctC, ""));
                ctC.A06(ctC.A0B, 1);
                ctC.A0B = null;
                TextInputLayout textInputLayout = ctC.A0R;
                textInputLayout.A0D();
                textInputLayout.A0F();
            }
            ctC.A0G = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C26147CtC ctC = this.A16;
        ctC.A04 = i;
        TextView textView = ctC.A0B;
        if (textView != null) {
            C29261bv.A08(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0O) {
            this.A0O = z;
            if (!z) {
                this.A0Q = false;
                if (!TextUtils.isEmpty(this.A0u) && TextUtils.isEmpty(this.A0B.getHint())) {
                    this.A0B.setHint(this.A0u);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A0B.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0u)) {
                        setHint(hint);
                    }
                    this.A0B.setHint((CharSequence) null);
                }
                this.A0Q = true;
            }
            if (this.A0B != null) {
                A07();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C26249Cvn cvn = this.A14;
        cvn.A08(i);
        this.A0m = cvn.A0b;
        if (this.A0B != null) {
            A0A(this, false, false);
            A07();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0m != colorStateList) {
            if (this.A0l == null) {
                C26249Cvn cvn = this.A14;
                if (cvn.A0b != colorStateList) {
                    cvn.A0b = colorStateList;
                    cvn.A0D(false);
                }
            }
            this.A0m = colorStateList;
            if (this.A0B != null) {
                A0A(this, false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.A0d = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.A0e = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMinEms(int i) {
        this.A0f = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.A0g = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        BIm bIm = this.A15;
        bIm.A0G.setContentDescription(BEA.A0a(bIm, i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        BIm bIm = this.A15;
        if (i != 0) {
            drawable = BE7.A0F(bIm, i);
        } else {
            drawable = null;
        }
        bIm.A0G.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i;
        BIm bIm = this.A15;
        if (z) {
            i = 1;
            if (bIm.A01 == 1) {
                return;
            }
        } else {
            i = 0;
        }
        bIm.A06(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        BIm bIm = this.A15;
        bIm.A02 = colorStateList;
        TextInputLayout textInputLayout = bIm.A0J;
        C26165Cte.A01(colorStateList, bIm.A04, bIm.A0G, textInputLayout);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        BIm bIm = this.A15;
        bIm.A04 = mode;
        TextInputLayout textInputLayout = bIm.A0J;
        C26165Cte.A01(bIm.A02, mode, bIm.A0G, textInputLayout);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable text;
        if (this.A0D == null) {
            AnonymousClass03P r1 = new AnonymousClass03P(getContext());
            this.A0D = r1;
            r1.setId(2131436098);
            this.A0D.setImportantForAccessibility(2);
            C29071bZ A012 = A01();
            this.A0E = A012;
            A012.A01 = 67;
            this.A0F = A01();
            setPlaceholderTextAppearance(this.A0h);
            setPlaceholderTextColor(this.A0n);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.A0R) {
                setPlaceholderTextEnabled(true);
            }
            this.A0L = charSequence;
        }
        EditText editText = this.A0B;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        A08(text, this);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.A0h = i;
        TextView textView = this.A0D;
        if (textView != null) {
            C29261bv.A08(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A0n != colorStateList) {
            this.A0n = colorStateList;
            TextView textView = this.A0D;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        BIl bIl = this.A17;
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        bIl.A05 = charSequence2;
        bIl.A07.setText(charSequence);
        BIl.A00(bIl);
    }

    public void setPrefixTextAppearance(int i) {
        C29261bv.A08(this.A17.A07, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A17.A07.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C28011Ym r2) {
        C27801Xq r0 = this.A0G;
        if (r0 != null && r0.A01.A0K != r2) {
            this.A0J = r2;
            A03();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.A17.A08.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A17.A08;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = BE7.A0F(this, i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i) {
        BIl bIl = this.A17;
        if (i < 0) {
            throw AnonymousClass000.A0k("startIconSize cannot be less than 0");
        } else if (i != bIl.A00) {
            bIl.A00 = i;
            CheckableImageButton checkableImageButton = bIl.A08;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        BIl bIl = this.A17;
        CheckableImageButton checkableImageButton = bIl.A08;
        View.OnLongClickListener onLongClickListener = bIl.A03;
        checkableImageButton.setOnClickListener(onClickListener);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        BIl bIl = this.A17;
        bIl.A03 = onLongClickListener;
        CheckableImageButton checkableImageButton = bIl.A08;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C26165Cte.A03(onLongClickListener, checkableImageButton);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        BIl bIl = this.A17;
        bIl.A04 = scaleType;
        bIl.A08.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        BIl bIl = this.A17;
        if (bIl.A01 != colorStateList) {
            bIl.A01 = colorStateList;
            TextInputLayout textInputLayout = bIl.A09;
            C26165Cte.A01(colorStateList, bIl.A02, bIl.A08, textInputLayout);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        BIl bIl = this.A17;
        if (bIl.A02 != mode) {
            bIl.A02 = mode;
            TextInputLayout textInputLayout = bIl.A09;
            C26165Cte.A01(bIl.A01, mode, bIl.A08, textInputLayout);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.A17.A03(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        BIm bIm = this.A15;
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        bIm.A0B = charSequence2;
        bIm.A0F.setText(charSequence);
        BIm.A02(bIm);
    }

    public void setSuffixTextAppearance(int i) {
        C29261bv.A08(this.A15.A0F, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A15.A0F.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C22665BJg bJg) {
        EditText editText = this.A0B;
        if (editText != null) {
            AnonymousClass1HF.A0f(editText, bJg);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0o) {
            this.A0o = typeface;
            C26249Cvn cvn = this.A14;
            boolean A042 = C26249Cvn.A04(typeface, cvn);
            boolean A052 = C26249Cvn.A05(typeface, cvn);
            if (A042 || A052) {
                cvn.A0D(false);
            }
            C26147CtC ctC = this.A16;
            if (typeface != ctC.A08) {
                ctC.A08 = typeface;
                TextView textView = ctC.A0A;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = ctC.A0B;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0C;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r5 = 2132084550(0x7f150746, float:1.9809274E38)
            r0 = r22
            r7 = r23
            r6 = r24
            android.content.Context r0 = X.C27771Xm.A00(r0, r7, r6, r5)
            r12 = r21
            r12.<init>(r0, r7, r6)
            r0 = -1
            r12.A0f = r0
            r12.A0d = r0
            r12.A0g = r0
            r12.A0e = r0
            X.CtC r1 = new X.CtC
            r1.<init>(r12)
            r12.A16 = r1
            r11 = 0
            X.4gR r1 = new X.4gR
            r1.<init>(r11)
            r12.A0K = r1
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            r12.A19 = r1
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            r12.A12 = r1
            android.graphics.RectF r1 = X.AnonymousClass3MW.A08()
            r12.A1A = r1
            java.util.LinkedHashSet r1 = X.C17880vN.A14()
            r12.A18 = r1
            X.Cvn r2 = new X.Cvn
            r2.<init>(r12)
            r12.A14 = r2
            android.content.Context r4 = r12.getContext()
            r3 = 1
            r12.setOrientation(r3)
            r12.setWillNotDraw(r11)
            r12.setAddStatesFromChildren(r3)
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r4)
            r12.A13 = r10
            r10.setAddStatesFromChildren(r3)
            android.animation.TimeInterpolator r1 = X.AnonymousClass1YW.A03
            r2.A0Z = r1
            r2.A0D(r11)
            r2.A0Y = r1
            r2.A0D(r11)
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r2.A09(r1)
            int[] r17 = X.C27781Xn.A0k
            r1 = 5
            int[] r9 = new int[r1]
            r1 = 22
            r9[r11] = r1
            r1 = 20
            r9[r3] = r1
            r1 = 38
            r2 = 2
            r9[r2] = r1
            r8 = 3
            r1 = 43
            r9[r8] = r1
            r14 = 4
            r1 = 47
            r9[r14] = r1
            r15 = r4
            r16 = r7
            r18 = r9
            r19 = r6
            r20 = r5
            X.01c r13 = X.C27791Xo.A01(r15, r16, r17, r18, r19, r20)
            X.BIl r9 = new X.BIl
            r9.<init>(r13, r12)
            r12.A17 = r9
            r1 = 46
            android.content.res.TypedArray r8 = r13.A02
            boolean r1 = r8.getBoolean(r1, r3)
            r12.A0O = r1
            java.lang.CharSequence r1 = r8.getText(r14)
            r12.setHint((java.lang.CharSequence) r1)
            r1 = 45
            boolean r1 = r8.getBoolean(r1, r3)
            r12.A0N = r1
            r1 = 40
            boolean r1 = r8.getBoolean(r1, r3)
            r12.A0z = r1
            r1 = 6
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L_0x035c
            r1 = 6
            int r1 = r8.getInt(r1, r0)
            r12.setMinEms(r1)
        L_0x00d3:
            r1 = 5
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L_0x034d
            r1 = 5
            int r1 = r8.getInt(r1, r0)
            r12.setMaxEms(r1)
        L_0x00e2:
            X.1Yp r5 = X.C28011Ym.A01(r4, r7, r6, r5)
            X.1Ym r1 = new X.1Ym
            r1.<init>(r5)
            r12.A0J = r1
            android.content.res.Resources r5 = r4.getResources()
            r1 = 2131167937(0x7f070ac1, float:1.7950162E38)
            int r1 = r5.getDimensionPixelOffset(r1)
            r12.A11 = r1
            r1 = 9
            int r1 = r8.getDimensionPixelOffset(r1, r11)
            r12.A02 = r1
            android.content.res.Resources r5 = r4.getResources()
            r1 = 2131167938(0x7f070ac2, float:1.7950164E38)
            int r5 = r5.getDimensionPixelSize(r1)
            r1 = 16
            int r1 = r8.getDimensionPixelSize(r1, r5)
            r12.A04 = r1
            android.content.res.Resources r5 = r4.getResources()
            r1 = 2131167939(0x7f070ac3, float:1.7950166E38)
            int r5 = r5.getDimensionPixelSize(r1)
            r1 = 17
            int r1 = r8.getDimensionPixelSize(r1, r5)
            r12.A05 = r1
            int r1 = r12.A04
            r12.A06 = r1
            r1 = 13
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r15 = r8.getDimension(r1, r5)
            r1 = 12
            float r14 = r8.getDimension(r1, r5)
            r1 = 10
            float r7 = r8.getDimension(r1, r5)
            r1 = 11
            float r6 = r8.getDimension(r1, r5)
            X.1Ym r1 = r12.A0J
            X.1Yp r5 = new X.1Yp
            r5.<init>(r1)
            r16 = 0
            int r1 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x015a
            X.1Ys r1 = new X.1Ys
            r1.<init>(r15)
            r5.A02 = r1
        L_0x015a:
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x0165
            X.1Ys r1 = new X.1Ys
            r1.<init>(r14)
            r5.A03 = r1
        L_0x0165:
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x0170
            X.1Ys r1 = new X.1Ys
            r1.<init>(r7)
            r5.A01 = r1
        L_0x0170:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x017b
            X.1Ys r1 = new X.1Ys
            r1.<init>(r6)
            r5.A00 = r1
        L_0x017b:
            X.1Ym r1 = new X.1Ym
            r1.<init>(r5)
            r12.A0J = r1
            r1 = 7
            android.content.res.ColorStateList r5 = X.AnonymousClass1YT.A02(r4, r13, r1)
            if (r5 == 0) goto L_0x0341
            int r1 = r5.getDefaultColor()
            r12.A0V = r1
            r12.A00 = r1
            boolean r1 = r5.isStateful()
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r1 == 0) goto L_0x0323
            int[] r1 = new int[r3]
            r1[r11] = r6
            int r1 = r5.getColorForState(r1, r0)
            r12.A0X = r1
            int[] r1 = new int[r2]
            r1 = {16842908, 16842910} // fill-array
            int r1 = r5.getColorForState(r1, r0)
            r12.A0Z = r1
            int[] r2 = new int[r2]
            r2 = {16843623, 16842910} // fill-array
        L_0x01b4:
            int r1 = r5.getColorForState(r2, r0)
            r12.A0b = r1
        L_0x01ba:
            r7 = 1
            boolean r1 = r8.hasValue(r3)
            if (r1 == 0) goto L_0x01c9
            android.content.res.ColorStateList r1 = r13.A01(r3)
            r12.A0m = r1
            r12.A0l = r1
        L_0x01c9:
            r1 = 14
            android.content.res.ColorStateList r2 = X.AnonymousClass1YT.A02(r4, r13, r1)
            int r1 = r8.getColor(r1, r11)
            r12.A0a = r1
            r1 = 2131101940(0x7f0608f4, float:1.7816304E38)
            int r1 = X.C19740yt.A00(r4, r1)
            r12.A08 = r1
            r1 = 2131101941(0x7f0608f5, float:1.7816306E38)
            int r1 = X.C19740yt.A00(r4, r1)
            r12.A0W = r1
            r1 = 2131101944(0x7f0608f8, float:1.7816312E38)
            int r1 = X.C19740yt.A00(r4, r1)
            r12.A0c = r1
            if (r2 == 0) goto L_0x01f5
            r12.setBoxStrokeColorStateList(r2)
        L_0x01f5:
            r2 = 15
            boolean r1 = r8.hasValue(r2)
            if (r1 == 0) goto L_0x0204
            android.content.res.ColorStateList r1 = X.AnonymousClass1YT.A02(r4, r13, r2)
            r12.setBoxStrokeErrorColor(r1)
        L_0x0204:
            r1 = 47
            int r1 = r8.getResourceId(r1, r0)
            if (r1 == r0) goto L_0x0215
            r1 = 47
            int r1 = r8.getResourceId(r1, r11)
            r12.setHintTextAppearance(r1)
        L_0x0215:
            r1 = 38
            int r18 = r8.getResourceId(r1, r11)
            r1 = 33
            java.lang.CharSequence r17 = r8.getText(r1)
            r1 = 32
            int r16 = r8.getInt(r1, r3)
            r1 = 34
            boolean r6 = r8.getBoolean(r1, r11)
            r1 = 43
            int r14 = r8.getResourceId(r1, r11)
            r1 = 42
            boolean r5 = r8.getBoolean(r1, r11)
            r1 = 41
            java.lang.CharSequence r4 = r8.getText(r1)
            r1 = 55
            int r3 = r8.getResourceId(r1, r11)
            r1 = 54
            java.lang.CharSequence r2 = r8.getText(r1)
            r1 = 18
            boolean r1 = r8.getBoolean(r1, r11)
            r15 = 19
            int r0 = r8.getInt(r15, r0)
            r12.setCounterMaxLength(r0)
            r0 = 22
            int r0 = r8.getResourceId(r0, r11)
            r12.A0U = r0
            r0 = 20
            int r0 = r8.getResourceId(r0, r11)
            r12.A0T = r0
            r0 = 8
            int r0 = r8.getInt(r0, r11)
            r12.setBoxBackgroundMode(r0)
            r0 = r17
            r12.setErrorContentDescription(r0)
            r0 = r16
            r12.setErrorAccessibilityLiveRegion(r0)
            int r0 = r12.A0T
            r12.setCounterOverflowTextAppearance(r0)
            r12.setHelperTextTextAppearance(r14)
            r0 = r18
            r12.setErrorTextAppearance(r0)
            int r0 = r12.A0U
            r12.setCounterTextAppearance(r0)
            r12.setPlaceholderText(r2)
            r12.setPlaceholderTextAppearance(r3)
            r2 = 39
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L_0x02a4
            android.content.res.ColorStateList r0 = r13.A01(r2)
            r12.setErrorTextColor(r0)
        L_0x02a4:
            r2 = 44
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L_0x02b3
            android.content.res.ColorStateList r0 = r13.A01(r2)
            r12.setHelperTextColor(r0)
        L_0x02b3:
            r2 = 48
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L_0x02c2
            android.content.res.ColorStateList r0 = r13.A01(r2)
            r12.setHintTextColor(r0)
        L_0x02c2:
            r2 = 23
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L_0x02d1
            android.content.res.ColorStateList r0 = r13.A01(r2)
            r12.setCounterTextColor(r0)
        L_0x02d1:
            r2 = 21
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L_0x02e0
            android.content.res.ColorStateList r0 = r13.A01(r2)
            r12.setCounterOverflowTextColor(r0)
        L_0x02e0:
            r2 = 56
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L_0x02ef
            android.content.res.ColorStateList r0 = r13.A01(r2)
            r12.setPlaceholderTextColor(r0)
        L_0x02ef:
            X.BIm r14 = new X.BIm
            r14.<init>(r13, r12)
            r12.A15 = r14
            boolean r3 = r8.getBoolean(r11, r7)
            r8.recycle()
            r0 = 2
            r12.setImportantForAccessibility(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x030a
            X.AnonymousClass1HF.A0c(r12, r7)
        L_0x030a:
            r10.addView(r9)
            r10.addView(r14)
            r12.addView(r10)
            r12.setEnabled(r3)
            r12.setHelperTextEnabled(r5)
            r12.setErrorEnabled(r6)
            r12.setCounterEnabled(r1)
            r12.setHelperText(r4)
            return
        L_0x0323:
            int r1 = r12.A0V
            r12.A0Z = r1
            r1 = 2131101913(0x7f0608d9, float:1.781625E38)
            android.content.res.ColorStateList r5 = X.C19740yt.A03(r4, r1)
            int[] r1 = new int[r3]
            r1[r11] = r6
            int r1 = r5.getColorForState(r1, r0)
            r12.A0X = r1
            int[] r2 = new int[r3]
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r2[r11] = r1
            goto L_0x01b4
        L_0x0341:
            r12.A00 = r11
            r12.A0V = r11
            r12.A0X = r11
            r12.A0Z = r11
            r12.A0b = r11
            goto L_0x01ba
        L_0x034d:
            boolean r1 = r8.hasValue(r2)
            if (r1 == 0) goto L_0x00e2
            int r1 = r8.getDimensionPixelSize(r2, r0)
            r12.setMaxWidth(r1)
            goto L_0x00e2
        L_0x035c:
            r1 = 3
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L_0x00d3
            r1 = 3
            int r1 = r8.getDimensionPixelSize(r1, r0)
            r12.setMinWidth(r1)
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private C27801Xq A02(boolean z) {
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = (float) getResources().getDimensionPixelOffset(2131167914);
        float f = 0.0f;
        if (z) {
            f = dimensionPixelOffset2;
        }
        EditText editText = this.A0B;
        if (editText instanceof BJ1) {
            dimensionPixelOffset = ((BJ1) editText).A02;
        } else {
            dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(2131167466);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131167851);
        C28041Yp r1 = new C28041Yp();
        r1.A02 = new AnonymousClass1Ys(f);
        r1.A03 = new AnonymousClass1Ys(f);
        r1.A00 = new AnonymousClass1Ys(dimensionPixelOffset2);
        r1.A01 = new AnonymousClass1Ys(dimensionPixelOffset2);
        C28011Ym r4 = new C28011Ym(r1);
        Context context = getContext();
        Paint paint = C27801Xq.A0N;
        int A022 = AnonymousClass1ZA.A02(context, "MaterialShapeDrawable", 2130969148);
        C27801Xq r3 = new C27801Xq();
        r3.A0E(context);
        BE7.A1C(r3, A022);
        r3.A0C(dimensionPixelOffset);
        r3.setShapeAppearanceModel(r4);
        C28131Yz r12 = r3.A01;
        if (r12.A0I == null) {
            r12.A0I = AnonymousClass3MW.A07();
        }
        r3.A01.A0I.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        r3.invalidateSelf();
        return r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05() {
        /*
            r10 = this;
            boolean r0 = r10.A0C()
            if (r0 == 0) goto L_0x00d5
            android.graphics.RectF r5 = r10.A1A
            X.Cvn r2 = r10.A14
            android.widget.EditText r0 = r10.A0B
            int r8 = r0.getWidth()
            android.widget.EditText r0 = r10.A0B
            int r4 = r0.getGravity()
            java.lang.CharSequence r6 = r2.A0j
            android.view.View r0 = r2.A16
            int r0 = r0.getLayoutDirection()
            boolean r3 = X.C17890vO.A1R(r0)
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x00f6
            X.1X5 r1 = X.AnonymousClass1X4.A02
        L_0x002a:
            int r0 = r6.length()
            boolean r3 = r1.BgG(r6, r0)
        L_0x0032:
            r2.A0o = r3
            r0 = 17
            if (r4 == r0) goto L_0x00ed
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00ed
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00e4
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00e4
            if (r3 == 0) goto L_0x00e6
        L_0x004b:
            android.graphics.Rect r0 = r2.A11
            int r0 = r0.right
            float r6 = (float) r0
            float r0 = r2.A08
        L_0x0052:
            float r6 = r6 - r0
        L_0x0053:
            android.graphics.Rect r9 = r2.A11
            int r0 = r9.left
            float r0 = (float) r0
            float r7 = java.lang.Math.max(r6, r0)
            r5.left = r7
            int r0 = r9.top
            float r6 = (float) r0
            r5.top = r6
            r0 = 17
            if (r4 == r0) goto L_0x00db
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00db
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00d6
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00d6
            if (r3 == 0) goto L_0x00d8
        L_0x007a:
            int r0 = r9.right
            float r7 = (float) r0
        L_0x007d:
            int r0 = r9.right
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r7, r0)
            r5.right = r0
            float r0 = r2.A06()
            float r6 = r6 + r0
            r5.bottom = r6
            float r0 = r5.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            float r0 = r5.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            float r2 = r5.left
            int r0 = r10.A11
            float r1 = (float) r0
            float r2 = r2 - r1
            r5.left = r2
            float r0 = r5.right
            float r0 = r0 + r1
            r5.right = r0
            int r0 = r10.getPaddingLeft()
            int r0 = -r0
            float r3 = (float) r0
            int r0 = r10.getPaddingTop()
            int r0 = -r0
            float r2 = (float) r0
            float r1 = r5.height()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            int r0 = r10.A06
            float r0 = (float) r0
            float r2 = r2 + r0
            r5.offset(r3, r2)
            X.1Xq r4 = r10.A0G
            X.Big r4 = (X.C23517Big) r4
            float r3 = r5.left
            float r2 = r5.top
            float r1 = r5.right
            float r0 = r5.bottom
            r4.A0K(r3, r2, r1, r0)
        L_0x00d5:
            return
        L_0x00d6:
            if (r3 == 0) goto L_0x007a
        L_0x00d8:
            float r0 = r2.A08
            goto L_0x00e2
        L_0x00db:
            float r7 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r1
            float r0 = r2.A08
            float r0 = r0 / r1
        L_0x00e2:
            float r7 = r7 + r0
            goto L_0x007d
        L_0x00e4:
            if (r3 == 0) goto L_0x004b
        L_0x00e6:
            android.graphics.Rect r0 = r2.A11
            int r0 = r0.left
            float r6 = (float) r0
            goto L_0x0053
        L_0x00ed:
            float r6 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            float r0 = r2.A08
            float r0 = r0 / r1
            goto L_0x0052
        L_0x00f6:
            X.1X5 r1 = X.AnonymousClass1X4.A01
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A05():void");
    }

    public static void A09(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A09((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.hasFocus() == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(com.google.android.material.textfield.TextInputLayout r8, boolean r9, boolean r10) {
        /*
            boolean r7 = r8.isEnabled()
            android.widget.EditText r0 = r8.A0B
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r6 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r6 = 0
        L_0x0016:
            android.widget.EditText r0 = r8.A0B
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.hasFocus()
            r5 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            android.content.res.ColorStateList r2 = r8.A0l
            if (r2 == 0) goto L_0x0037
            X.Cvn r1 = r8.A14
            android.content.res.ColorStateList r0 = r1.A0b
            if (r0 != r2) goto L_0x0030
            android.content.res.ColorStateList r0 = r1.A0d
            if (r0 == r2) goto L_0x0037
        L_0x0030:
            r1.A0b = r2
            r1.A0d = r2
            r1.A0D(r4)
        L_0x0037:
            if (r7 != 0) goto L_0x012b
            android.content.res.ColorStateList r2 = r8.A0l
            if (r2 == 0) goto L_0x0127
            int[] r1 = new int[r3]
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r1[r4] = r0
            int r0 = r8.A0W
            int r0 = r2.getColorForState(r1, r0)
        L_0x004a:
            X.Cvn r2 = r8.A14
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
        L_0x0050:
            android.content.res.ColorStateList r0 = r2.A0b
            if (r0 != r1) goto L_0x0058
            android.content.res.ColorStateList r0 = r2.A0d
            if (r0 == r1) goto L_0x005f
        L_0x0058:
            r2.A0b = r1
            r2.A0d = r1
            r2.A0D(r4)
        L_0x005f:
            if (r6 != 0) goto L_0x006d
            boolean r0 = r8.A0z
            if (r0 == 0) goto L_0x006d
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
        L_0x006d:
            if (r10 != 0) goto L_0x0073
            boolean r0 = r8.A0P
            if (r0 == 0) goto L_0x00ae
        L_0x0073:
            android.animation.ValueAnimator r0 = r8.A09
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0082
            android.animation.ValueAnimator r0 = r8.A09
            r0.cancel()
        L_0x0082:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x00b4
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x00b4
            r8.A0G(r1)
        L_0x008d:
            r8.A0P = r4
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x0098
            r8.A05()
        L_0x0098:
            android.widget.EditText r0 = r8.A0B
            if (r0 != 0) goto L_0x00af
            r0 = 0
        L_0x009d:
            A08(r0, r8)
            X.BIl r0 = r8.A17
            r0.A06 = r4
            X.BIl.A00(r0)
            X.BIm r0 = r8.A15
            r0.A0C = r4
        L_0x00ab:
            X.BIm.A02(r0)
        L_0x00ae:
            return
        L_0x00af:
            android.text.Editable r0 = r0.getText()
            goto L_0x009d
        L_0x00b4:
            X.Cvn r0 = r8.A14
            r0.A07(r1)
            goto L_0x008d
        L_0x00ba:
            if (r10 != 0) goto L_0x00c0
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x00ae
        L_0x00c0:
            android.animation.ValueAnimator r0 = r8.A09
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00cf
            android.animation.ValueAnimator r0 = r8.A09
            r0.cancel()
        L_0x00cf:
            r1 = 0
            if (r9 == 0) goto L_0x0121
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x0121
            r8.A0G(r1)
        L_0x00d9:
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x00fa
            X.1Xq r0 = r8.A0G
            X.Big r0 = (X.C23517Big) r0
            android.graphics.RectF r0 = r0.A00
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x00fa
            X.1Xq r0 = r8.A0G
            X.Big r0 = (X.C23517Big) r0
            r0.A0K(r1, r1, r1, r1)
        L_0x00fa:
            r8.A0P = r3
            android.widget.TextView r1 = r8.A0D
            if (r1 == 0) goto L_0x0115
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0115
            r0 = 0
            r1.setText(r0)
            android.widget.FrameLayout r1 = r8.A13
            X.1bZ r0 = r8.A0F
            X.C29191bl.A02(r1, r0)
            android.widget.TextView r1 = r8.A0D
            r0 = 4
            r1.setVisibility(r0)
        L_0x0115:
            X.BIl r0 = r8.A17
            r0.A06 = r3
            X.BIl.A00(r0)
            X.BIm r0 = r8.A15
            r0.A0C = r3
            goto L_0x00ab
        L_0x0121:
            X.Cvn r0 = r8.A14
            r0.A07(r1)
            goto L_0x00d9
        L_0x0127:
            int r0 = r8.A0W
            goto L_0x004a
        L_0x012b:
            X.CtC r1 = r8.A16
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x013c
            X.Cvn r2 = r8.A14
            android.widget.TextView r0 = r1.A0A
            if (r0 != 0) goto L_0x0146
            r1 = 0
            goto L_0x0050
        L_0x013c:
            boolean r0 = r8.A0y
            if (r0 == 0) goto L_0x014c
            android.widget.TextView r0 = r8.A0C
            if (r0 == 0) goto L_0x014c
            X.Cvn r2 = r8.A14
        L_0x0146:
            android.content.res.ColorStateList r1 = r0.getTextColors()
            goto L_0x0050
        L_0x014c:
            if (r5 == 0) goto L_0x005f
            android.content.res.ColorStateList r2 = r8.A0m
            if (r2 == 0) goto L_0x005f
            X.Cvn r1 = r8.A14
            android.content.res.ColorStateList r0 = r1.A0b
            if (r0 == r2) goto L_0x005f
            r1.A0b = r2
            r1.A0D(r4)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0A(com.google.android.material.textfield.TextInputLayout, boolean, boolean):void");
    }

    private void A0B(boolean z) {
        Context context = getContext();
        TypedValue A012 = AnonymousClass1Z9.A01(context, 2130969111);
        ColorStateList colorStateList = null;
        if (A012 != null) {
            int i = A012.resourceId;
            if (i != 0) {
                colorStateList = C19740yt.A03(context, i);
            } else {
                int i2 = A012.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        EditText editText = this.A0B;
        if (editText != null && editText.getTextCursorDrawable() != null && colorStateList != null) {
            Drawable textCursorDrawable = this.A0B.getTextCursorDrawable();
            if (z && (colorStateList = this.A0A) == null) {
                colorStateList = ColorStateList.valueOf(this.A03);
            }
            C27831Xu.A03(colorStateList, textCursorDrawable);
        }
    }

    public void A0I(TextView textView, int i) {
        try {
            C29261bv.A08(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        C29261bv.A08(textView, 2132083789);
        AnonymousClass3MX.A1C(getContext(), textView, 2131100353);
    }

    public void draw(Canvas canvas) {
        C27801Xq r0;
        super.draw(canvas);
        if (this.A0O) {
            this.A14.A0C(canvas);
        }
        if (this.A0I != null && (r0 = this.A0H) != null) {
            r0.draw(canvas);
            if (this.A0B.isFocused()) {
                Rect bounds = this.A0I.getBounds();
                Rect bounds2 = this.A0H.getBounds();
                float f = this.A14.A0G;
                int centerX = bounds2.centerX();
                int i = bounds2.left;
                TimeInterpolator timeInterpolator = AnonymousClass1YW.A00;
                bounds.left = BE6.A04(f, (float) (i - centerX)) + centerX;
                bounds.right = centerX + BE6.A04(f, (float) (bounds2.right - centerX));
                this.A0I.draw(canvas);
            }
        }
    }

    public float getBoxCornerRadiusBottomEnd() {
        C28021Yn r1;
        boolean A1R = C17890vO.A1R(getLayoutDirection());
        C28011Ym r0 = this.A0J;
        if (A1R) {
            r1 = r0.A00;
        } else {
            r1 = r0.A01;
        }
        return r1.BPT(this.A1A);
    }

    public float getBoxCornerRadiusBottomStart() {
        C28021Yn r1;
        boolean A1R = C17890vO.A1R(getLayoutDirection());
        C28011Ym r0 = this.A0J;
        if (A1R) {
            r1 = r0.A01;
        } else {
            r1 = r0.A00;
        }
        return r1.BPT(this.A1A);
    }

    public float getBoxCornerRadiusTopEnd() {
        C28021Yn r1;
        boolean A1R = C17890vO.A1R(getLayoutDirection());
        C28011Ym r0 = this.A0J;
        if (A1R) {
            r1 = r0.A02;
        } else {
            r1 = r0.A03;
        }
        return r1.BPT(this.A1A);
    }

    public float getBoxCornerRadiusTopStart() {
        C28021Yn r1;
        boolean A1R = C17890vO.A1R(getLayoutDirection());
        C28011Ym r0 = this.A0J;
        if (A1R) {
            r1 = r0.A03;
        } else {
            r1 = r0.A02;
        }
        return r1.BPT(this.A1A);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A14.A0B(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            super.onLayout(r10, r11, r12, r13, r14)
            android.widget.EditText r3 = r9.A0B
            if (r3 == 0) goto L_0x0162
            android.graphics.Rect r5 = r9.A19
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            r2 = 0
            r5.set(r2, r2, r1, r0)
            X.C25923Coh.A01(r5, r3, r9)
            X.1Xq r6 = r9.A0H
            if (r6 == 0) goto L_0x0029
            int r4 = r5.bottom
            int r0 = r9.A04
            int r3 = r4 - r0
            int r1 = r5.left
            int r0 = r5.right
            r6.setBounds(r1, r3, r0, r4)
        L_0x0029:
            X.1Xq r6 = r9.A0I
            if (r6 == 0) goto L_0x003a
            int r4 = r5.bottom
            int r0 = r9.A05
            int r3 = r4 - r0
            int r1 = r5.left
            int r0 = r5.right
            r6.setBounds(r1, r3, r0, r4)
        L_0x003a:
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x0162
            X.Cvn r4 = r9.A14
            android.widget.EditText r0 = r9.A0B
            float r1 = r0.getTextSize()
            float r0 = r4.A0M
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r4.A0M = r1
            r4.A0D(r2)
        L_0x0051:
            android.widget.EditText r0 = r9.A0B
            int r1 = r0.getGravity()
            r0 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r0 = r0 | 48
            r4.A09(r0)
            int r0 = r4.A0V
            if (r0 == r1) goto L_0x0067
            r4.A0V = r1
            r4.A0D(r2)
        L_0x0067:
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x01d0
            android.graphics.Rect r3 = r9.A12
            int r0 = r9.getLayoutDirection()
            boolean r7 = X.C17890vO.A1R(r0)
            int r0 = r5.bottom
            r3.bottom = r0
            int r1 = r9.A01
            r0 = 1
            if (r1 == r0) goto L_0x01a5
            r0 = 2
            if (r1 == r0) goto L_0x0186
            int r2 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            X.BIl r6 = r9.A17
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x009e
            if (r7 != 0) goto L_0x009e
            android.widget.TextView r1 = r6.A07
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x009e:
            r3.left = r2
            int r1 = r9.getPaddingTop()
        L_0x00a4:
            r3.top = r1
            int r8 = r5.right
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingRight()
            int r8 = r8 - r0
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x00c1
            if (r7 == 0) goto L_0x00c1
            android.widget.TextView r0 = r6.A07
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getPaddingRight()
            int r1 = r1 - r0
            int r8 = r8 + r1
        L_0x00c1:
            r3.right = r8
            int r7 = r3.left
            int r6 = r3.top
            int r2 = r3.bottom
            android.graphics.Rect r1 = r4.A11
            int r0 = r1.left
            if (r0 != r7) goto L_0x017e
            int r0 = r1.top
            if (r0 != r6) goto L_0x017e
            int r0 = r1.right
            if (r0 != r8) goto L_0x017e
            int r0 = r1.bottom
            if (r0 != r2) goto L_0x017e
        L_0x00db:
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x01cb
            android.text.TextPaint r1 = r4.A15
            float r0 = r4.A0M
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = r4.A0f
            r1.setTypeface(r0)
            float r0 = r4.A0H
            r1.setLetterSpacing(r0)
            float r0 = r1.ascent()
            float r2 = -r0
            int r1 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r0 = r9.A01
            r1 = 1
            if (r0 != r1) goto L_0x0174
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x0174
            int r0 = r5.centerY()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r1 = (int) r1
        L_0x0118:
            r3.top = r1
            int r1 = r5.right
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingRight()
            int r1 = r1 - r0
            r3.right = r1
            int r0 = r9.A01
            r1 = 1
            if (r0 != r1) goto L_0x016a
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x016a
            int r0 = r3.top
            float r0 = (float) r0
            float r0 = r0 + r2
            int r1 = (int) r0
        L_0x0137:
            r3.bottom = r1
            int r6 = r3.left
            int r5 = r3.top
            int r3 = r3.right
            android.graphics.Rect r2 = r4.A12
            int r0 = r2.left
            if (r0 != r6) goto L_0x0163
            int r0 = r2.top
            if (r0 != r5) goto L_0x0163
            int r0 = r2.right
            if (r0 != r3) goto L_0x0163
            int r0 = r2.bottom
            if (r0 != r1) goto L_0x0163
        L_0x0151:
            r0 = 0
            r4.A0D(r0)
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x0162
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x0162
            r9.A05()
        L_0x0162:
            return
        L_0x0163:
            r2.set(r6, r5, r3, r1)
            r0 = 1
            r4.A0m = r0
            goto L_0x0151
        L_0x016a:
            int r1 = r5.bottom
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingBottom()
            int r1 = r1 - r0
            goto L_0x0137
        L_0x0174:
            int r1 = r5.top
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingTop()
            int r1 = r1 + r0
            goto L_0x0118
        L_0x017e:
            r1.set(r7, r6, r8, r2)
            r0 = 1
            r4.A0m = r0
            goto L_0x00db
        L_0x0186:
            int r1 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r1 = r5.top
            int r0 = r9.A00()
            int r1 = r1 - r0
            r3.top = r1
            int r8 = r5.right
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getPaddingRight()
            int r8 = r8 - r0
            goto L_0x00c1
        L_0x01a5:
            int r2 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            X.BIl r6 = r9.A17
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x01c2
            if (r7 != 0) goto L_0x01c2
            android.widget.TextView r1 = r6.A07
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x01c2:
            r3.left = r2
            int r1 = r5.top
            int r0 = r9.A02
            int r1 = r1 + r0
            goto L_0x00a4
        L_0x01cb:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        L_0x01d0:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.A0B == null || this.A0B.getMeasuredHeight() >= (max = Math.max(this.A15.getMeasuredHeight(), this.A17.getMeasuredHeight()))) {
            z = false;
        } else {
            this.A0B.setMinimumHeight(max);
            z = true;
        }
        boolean A0J2 = A0J();
        if (z || A0J2) {
            this.A0B.post(new C27080DTf((Object) this, 27));
        }
        if (!(this.A0D == null || (editText = this.A0B) == null)) {
            this.A0D.setGravity(editText.getGravity());
            this.A0D.setPadding(this.A0B.getCompoundPaddingLeft(), this.A0B.getCompoundPaddingTop(), this.A0B.getCompoundPaddingRight(), this.A0B.getCompoundPaddingBottom());
        }
        this.A15.A04();
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean A1R = C17890vO.A1R(i);
        if (A1R != this.A0w) {
            C28021Yn r0 = this.A0J.A02;
            RectF rectF = this.A1A;
            float BPT = r0.BPT(rectF);
            float BPT2 = this.A0J.A03.BPT(rectF);
            float BPT3 = this.A0J.A00.BPT(rectF);
            float BPT4 = this.A0J.A01.BPT(rectF);
            C28011Ym r02 = this.A0J;
            C28051Yq r4 = r02.A06;
            C28051Yq r3 = r02.A07;
            C28051Yq r2 = r02.A04;
            C28051Yq r03 = r02.A05;
            C28041Yp r1 = new C28041Yp();
            r1.A06 = r3;
            r1.A07 = r4;
            r1.A04 = r03;
            r1.A05 = r2;
            r1.A02 = new AnonymousClass1Ys(BPT2);
            r1.A03 = new AnonymousClass1Ys(BPT);
            r1.A00 = new AnonymousClass1Ys(BPT4);
            r1.A01 = new AnonymousClass1Ys(BPT3);
            C28011Ym r04 = new C28011Ym(r1);
            this.A0w = A1R;
            setShapeAppearanceModel(r04);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Xj, android.os.Parcelable, X.BL1] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.A0G.isChecked() == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.BL1 r2 = new X.BL1
            r2.<init>(r0)
            X.CtC r0 = r3.A16
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0017
            java.lang.CharSequence r0 = r3.getError()
            r2.A00 = r0
        L_0x0017:
            X.BIm r1 = r3.A15
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0026
            com.google.android.material.internal.CheckableImageButton r0 = r1.A0G
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C19740yt.A00(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0V = defaultColor;
        this.A00 = defaultColor;
        int[] A1X = BE6.A1X();
        A1X[0] = -16842910;
        this.A0X = colorStateList.getColorForState(A1X, -1);
        this.A0Z = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A0b = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        A03();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.A08 = colorStateList.getDefaultColor();
            int[] A1X = BE6.A1X();
            A1X[0] = -16842910;
            this.A0W = colorStateList.getColorForState(A1X, -1);
            this.A0c = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.A0a != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0F();
        }
        this.A0a = defaultColor;
        A0F();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(AnonymousClass3Ma.A02(this, i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(AnonymousClass3Ma.A02(this, i));
    }

    public void setEnabled(boolean z) {
        A09(this, z);
        super.setEnabled(z);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C26147CtC ctC = this.A16;
            if (!ctC.A0G) {
                setHelperTextEnabled(true);
            }
            Animator animator = ctC.A05;
            if (animator != null) {
                animator.cancel();
            }
            ctC.A0E = charSequence;
            ctC.A0B.setText(charSequence);
            int i = ctC.A00;
            if (i != 2) {
                ctC.A01 = 2;
            }
            C26147CtC.A01(ctC, i, ctC.A01, C26147CtC.A02(ctC.A0B, ctC, charSequence));
        } else if (this.A16.A0G) {
            setHelperTextEnabled(false);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(AnonymousClass000.A0Y(this).getDimensionPixelSize(i));
    }

    public void setMinWidthResource(int i) {
        setMinWidth(AnonymousClass000.A0Y(this).getDimensionPixelSize(i));
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.A02 = i;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0N = z;
    }

    public void setLengthCounter(C28522E5m e5m) {
        this.A0K = e5m;
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setEndIconContentDescription(int i) {
        BIm bIm = this.A15;
        BE9.A16(bIm.A0G, BEA.A0a(bIm, i));
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.A15.A07(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.A15.A08(drawable);
    }

    public void setHint(int i) {
        setHint(BEA.A0a(this, i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A15.A0G.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A15.A0G.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(BEA.A0a(this, i));
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.A17.A02(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971551);
    }
}
