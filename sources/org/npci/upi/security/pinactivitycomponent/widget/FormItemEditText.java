package org.npci.upi.security.pinactivitycomponent.widget;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass6Z3;
import X.AnonymousClass785;
import X.AnonymousClass86J;
import X.C108945cZ;
import X.C108995ce;
import X.C109005cf;
import X.C1410474b;
import X.C1411074h;
import X.C1421478i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;

public class FormItemEditText extends EditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public ColorStateList A06;
    public Paint A07;
    public Paint A08;
    public Rect A09;
    public Drawable A0A;
    public View.OnClickListener A0B;
    public String A0C;
    public String A0D;
    public StringBuilder A0E;
    public AnonymousClass86J A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public float[] A0J;
    public RectF[] A0K;
    public int[][] A0L;
    public float A0M;
    public ColorStateList A0N;
    public Paint A0O;
    public Paint A0P;
    public boolean A0Q;
    public int[] A0R;

    private CharSequence getFullText() {
        return this.A0C == null ? getText() : getMaskChars();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A0I = false;
        RectF[] rectFArr = this.A0K;
        if (rectFArr != null && this.A0H) {
            int i4 = this.A05;
            if (i4 == -1) {
                invalidate();
            } else if (i3 <= i2) {
            } else {
                if (i4 == 0) {
                    this.A07.setAlpha(125);
                    int[] A1W = C108945cZ.A1W();
                    // fill-array-data instruction
                    A1W[0] = 125;
                    A1W[1] = 255;
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
                    ofInt.setDuration(150);
                    C1411074h.A00(ofInt, this, 44);
                    AnimatorSet A0B2 = C108945cZ.A0B();
                    charSequence.length();
                    A0B2.playTogether(new Animator[]{ofInt});
                    A0B2.start();
                    return;
                }
                float[] fArr = this.A0J;
                float f = rectFArr[i].bottom - this.A02;
                fArr[i] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f + getPaint().getTextSize(), this.A0J[i]});
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new OvershootInterpolator());
                ofFloat.addUpdateListener(new C1410474b(this, i, 3));
                this.A07.setAlpha(255);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, 255});
                ofInt2.setDuration(300);
                C1411074h.A00(ofInt2, this, 45);
                AnimatorSet A0B3 = C108945cZ.A0B();
                charSequence.length();
                A0B3.playTogether(C108945cZ.A1Z(ofFloat, ofInt2, 2, 0));
                A0B3.start();
            }
        }
    }

    public void setAnimateText(boolean z) {
        this.A0H = z;
    }

    public void setCharSize(float f) {
        this.A0M = f;
        invalidate();
    }

    public void setColorStates(ColorStateList colorStateList) {
        this.A06 = colorStateList;
        invalidate();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public void setError(boolean z) {
        this.A0I = z;
    }

    public void setFontSize(float f) {
        this.A0O.setTextSize(f);
        this.A07.setTextSize(f);
        this.A0P.setTextSize(f);
    }

    public void setLineStroke(float f) {
        this.A03 = f;
        invalidate();
    }

    public void setLineStrokeCentered(boolean z) {
        this.A0Q = z;
        invalidate();
    }

    public void setLineStrokeSelected(float f) {
        this.A04 = f;
        invalidate();
    }

    public void setMaxLength(int i) {
        this.A01 = (float) i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0B = onClickListener;
    }

    public void setOnPinEnteredListener(AnonymousClass86J r1) {
        this.A0F = r1;
    }

    public void setSpace(float f) {
        this.A00 = f;
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    private void A00(Context context, AttributeSet attributeSet) {
        this.A03 = C108995ce.A00(this, this.A03);
        this.A04 = C108995ce.A00(this, this.A04);
        this.A00 = C108995ce.A00(this, this.A00);
        this.A02 = C108995ce.A00(this, this.A02);
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z3.A00, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(0, typedValue);
            this.A05 = typedValue.data;
            this.A0C = obtainStyledAttributes.getString(3);
            this.A0D = obtainStyledAttributes.getString(11);
            this.A03 = obtainStyledAttributes.getDimension(8, this.A03);
            this.A04 = obtainStyledAttributes.getDimension(10, this.A04);
            this.A0Q = obtainStyledAttributes.getBoolean(9, false);
            this.A0M = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A00 = obtainStyledAttributes.getDimension(5, this.A00);
            this.A02 = obtainStyledAttributes.getDimension(12, this.A02);
            this.A0G = obtainStyledAttributes.getBoolean(2, this.A0G);
            this.A0A = obtainStyledAttributes.getDrawable(1);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
            if (colorStateList != null) {
                this.A06 = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.A0O = new Paint(getPaint());
            this.A07 = new Paint(getPaint());
            this.A0P = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A08 = paint;
            paint.setStrokeWidth(this.A03);
            setFontSize(this.A0M);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130969111, typedValue2, true);
            int i = typedValue2.data;
            int[] iArr = this.A0R;
            iArr[0] = i;
            iArr[1] = -7829368;
            iArr[2] = -7829368;
            setBackgroundResource(0);
            this.A01 = (float) attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
            super.setOnClickListener(new AnonymousClass785(this, 34));
            super.setOnLongClickListener(new C1421478i(this, 14));
            if (((getInputType() & 128) == 128 && TextUtils.isEmpty(this.A0C)) || ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.A0C))) {
                this.A0C = "●";
            }
            if (!TextUtils.isEmpty(this.A0C)) {
                this.A0E = getMaskChars();
            }
            getPaint().getTextBounds("|", 0, 1, this.A09);
            if (this.A05 > -1) {
                z = true;
            }
            this.A0H = z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private StringBuilder getMaskChars() {
        if (this.A0E == null) {
            this.A0E = AnonymousClass000.A10();
        }
        int A032 = AnonymousClass3Ma.A03(this);
        while (true) {
            StringBuilder sb = this.A0E;
            if (sb.length() == A032) {
                return sb;
            }
            if (sb.length() < A032) {
                sb.append(this.A0C);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        int i;
        Paint paint;
        int[] iArr;
        int i2;
        int i3;
        float f2;
        float f3;
        Paint paint2;
        int[] iArr2;
        int i4;
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(fullText, 0, length, fArr);
        String str = this.A0D;
        float f4 = 0.0f;
        if (str != null) {
            float[] fArr2 = new float[str.length()];
            getPaint().getTextWidths(this.A0D, fArr2);
            for (float f5 : fArr2) {
                f4 += f5;
            }
        }
        for (int i5 = 0; ((float) i5) < this.A01; i5++) {
            Drawable drawable = this.A0A;
            boolean z = true;
            Canvas canvas2 = canvas;
            if (drawable != null) {
                boolean A1U = AnonymousClass000.A1U(i5, length);
                boolean A1T = AnonymousClass000.A1T(i5, length);
                if (this.A0I) {
                    iArr2 = new int[1];
                    i4 = 16842914;
                } else {
                    boolean isFocused = isFocused();
                    drawable = this.A0A;
                    iArr2 = new int[1];
                    if (isFocused) {
                        iArr2[0] = 16842908;
                        drawable.setState(iArr2);
                        if (A1T) {
                            drawable = this.A0A;
                            iArr2 = new int[]{16842908, 16842913};
                        } else {
                            if (A1U) {
                                drawable = this.A0A;
                                iArr2 = new int[]{16842908, 16842912};
                            }
                            Drawable drawable2 = this.A0A;
                            RectF rectF = this.A0K[i5];
                            drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            this.A0A.draw(canvas2);
                        }
                        drawable.setState(iArr2);
                        Drawable drawable22 = this.A0A;
                        RectF rectF2 = this.A0K[i5];
                        drawable22.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        this.A0A.draw(canvas2);
                    } else {
                        i4 = -16842908;
                    }
                }
                iArr2[0] = i4;
                drawable.setState(iArr2);
                Drawable drawable222 = this.A0A;
                RectF rectF22 = this.A0K[i5];
                drawable222.setBounds((int) rectF22.left, (int) rectF22.top, (int) rectF22.right, (int) rectF22.bottom);
                this.A0A.draw(canvas2);
            }
            float f6 = this.A0K[i5].left + (this.A0M / 2.0f);
            if (length > i5) {
                if (!this.A0H || i5 != length - 1) {
                    i3 = i5 + 1;
                    f2 = f6 - (fArr[i5] / 2.0f);
                    f3 = this.A0J[i5];
                    paint2 = this.A0O;
                } else {
                    i3 = i5 + 1;
                    f2 = f6 - (fArr[i5] / 2.0f);
                    f3 = this.A0J[i5];
                    paint2 = this.A07;
                }
                canvas2.drawText(fullText, i5, i3, f2, f3, paint2);
            } else {
                String str2 = this.A0D;
                if (str2 != null) {
                    canvas2.drawText(str2, f6 - (f4 / 2.0f), this.A0J[i5], this.A0P);
                }
            }
            if (this.A0A == null) {
                boolean A1U2 = AnonymousClass000.A1U(i5, length);
                if (i5 != length) {
                    z = false;
                }
                if (this.A0I) {
                    paint = this.A08;
                    iArr = new int[1];
                    i2 = 16842914;
                } else {
                    Paint paint3 = this.A08;
                    if (isFocused()) {
                        f = this.A04;
                    } else {
                        f = this.A03;
                    }
                    paint3.setStrokeWidth(f);
                    if (A1U2) {
                        paint = this.A08;
                        iArr = new int[1];
                        i2 = 16842913;
                    } else {
                        boolean isFocused2 = isFocused();
                        int[] iArr3 = new int[1];
                        if (z) {
                            i = -16842918;
                            if (isFocused2) {
                                i = 16842918;
                            }
                        } else {
                            i = -16842908;
                            if (isFocused2) {
                                i = 16842908;
                            }
                        }
                        iArr3[0] = i;
                        this.A08.setColor(this.A06.getColorForState(iArr3, -7829368));
                        RectF rectF3 = this.A0K[i5];
                        canvas2.drawLine(rectF3.left, rectF3.top + 20.0f, rectF3.right, rectF3.bottom + 20.0f, this.A08);
                    }
                }
                iArr[0] = i2;
                paint.setColor(this.A06.getColorForState(iArr, -7829368));
                RectF rectF32 = this.A0K[i5];
                canvas2.drawLine(rectF32.left, rectF32.top + 20.0f, rectF32.right, rectF32.bottom + 20.0f, this.A08);
            }
        }
    }

    public FormItemEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] A0v = C109005cf.A0v(this);
        // fill-array-data instruction
        A0v[0] = -16711936;
        A0v[1] = -65536;
        A0v[2] = -16777216;
        A0v[3] = -7829368;
        this.A0R = A0v;
        this.A06 = new ColorStateList(this.A0L, A0v);
        A00(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            super.onSizeChanged(r11, r12, r13, r14)
            android.content.res.ColorStateList r0 = r10.getTextColors()
            r10.A0N = r0
            if (r0 == 0) goto L_0x0028
            android.graphics.Paint r1 = r10.A07
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A0O
            android.content.res.ColorStateList r0 = r10.A0N
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A0P
            int r0 = r10.getCurrentHintTextColor()
            r1.setColor(r0)
        L_0x0028:
            int r1 = r10.getWidth()
            int r0 = r10.getPaddingEnd()
            int r1 = r1 - r0
            int r0 = r10.getPaddingStart()
            int r1 = r1 - r0
            float r4 = r10.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f2
            float r2 = (float) r1
            float r0 = r10.A01
            float r0 = r0 * r8
            float r0 = r0 - r3
            float r2 = r2 / r0
        L_0x0047:
            r10.A0M = r2
        L_0x0049:
            float r0 = r10.A01
            int r1 = (int) r0
            android.graphics.RectF[] r0 = new android.graphics.RectF[r1]
            r10.A0K = r0
            float[] r0 = new float[r1]
            r10.A0J = r0
            int r5 = X.C108985cd.A05(r10)
            int r0 = r10.getPaddingTop()
            int r5 = r5 - r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            r4 = 1
            if (r0 != r4) goto L_0x00ed
            int r1 = r10.getWidth()
            int r0 = r10.getPaddingStart()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r10.A0M
            float r1 = r1 - r0
            int r7 = (int) r1
            r4 = -1
        L_0x0077:
            r3 = 0
        L_0x0078:
            float r1 = (float) r3
            float r0 = r10.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0102
            android.graphics.RectF[] r6 = r10.A0K
            float r7 = (float) r7
            float r2 = (float) r5
            float r0 = r10.A0M
            float r1 = r7 + r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r1, r2)
            r6[r3] = r0
            android.graphics.drawable.Drawable r0 = r10.A0A
            if (r0 == 0) goto L_0x00ac
            boolean r1 = r10.A0G
            android.graphics.RectF[] r0 = r10.A0K
            r6 = r0[r3]
            if (r1 == 0) goto L_0x00dc
            int r0 = r10.getPaddingTop()
            float r0 = (float) r0
            r6.top = r0
            android.graphics.RectF[] r0 = r10.A0K
            r1 = r0[r3]
            float r0 = r1.height()
            float r0 = r0 + r7
            r1.right = r0
        L_0x00ac:
            float r6 = r10.A00
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            float r1 = (float) r4
            float r0 = r10.A0M
            if (r2 >= 0) goto L_0x00d9
            float r1 = r1 * r0
            float r1 = r1 * r8
        L_0x00b7:
            float r7 = r7 + r1
            int r7 = (int) r7
            float[] r6 = r10.A0J
            android.graphics.RectF[] r2 = r10.A0K
            r0 = r2[r3]
            float r1 = r0.bottom
            float r0 = r10.A02
            float r1 = r1 - r0
            r6[r3] = r1
            boolean r0 = r10.A0Q
            if (r0 == 0) goto L_0x00d6
            r1 = r2[r3]
            float r0 = r1.top
            float r0 = r0 / r8
            r1.top = r0
            float r0 = r1.bottom
            float r0 = r0 / r8
            r1.bottom = r0
        L_0x00d6:
            int r3 = r3 + 1
            goto L_0x0078
        L_0x00d9:
            float r0 = r0 + r6
            float r1 = r1 * r0
            goto L_0x00b7
        L_0x00dc:
            float r2 = r6.top
            android.graphics.Rect r0 = r10.A09
            int r0 = r0.height()
            float r1 = (float) r0
            float r0 = r10.A02
            float r0 = r0 * r8
            float r1 = r1 + r0
            float r2 = r2 - r1
            r6.top = r2
            goto L_0x00ac
        L_0x00ed:
            int r7 = r10.getPaddingStart()
            goto L_0x0077
        L_0x00f2:
            float r0 = r10.A0M
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            float r2 = (float) r1
            float r1 = r10.A01
            float r0 = r1 - r3
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r2 = r2 / r1
            goto L_0x0047
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.onSizeChanged(int, int, int, int):void");
    }

    public void setMargin(int[] iArr) {
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this);
        A0B2.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        setLayoutParams(A0B2);
    }

    public FormItemEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int[] A0v = C109005cf.A0v(this);
        // fill-array-data instruction
        A0v[0] = -16711936;
        A0v[1] = -65536;
        A0v[2] = -16777216;
        A0v[3] = -7829368;
        this.A0R = A0v;
        this.A06 = new ColorStateList(this.A0L, A0v);
        A00(context, attributeSet);
    }

    public FormItemEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] A0v = C109005cf.A0v(this);
        // fill-array-data instruction
        A0v[0] = -16711936;
        A0v[1] = -65536;
        A0v[2] = -16777216;
        A0v[3] = -7829368;
        this.A0R = A0v;
        this.A06 = new ColorStateList(this.A0L, A0v);
        A00(context, attributeSet);
    }

    public FormItemEditText(Context context) {
        super(context);
        int[] A0v = C109005cf.A0v(this);
        // fill-array-data instruction
        A0v[0] = -16711936;
        A0v[1] = -65536;
        A0v[2] = -16777216;
        A0v[3] = -7829368;
        this.A0R = A0v;
        this.A06 = new ColorStateList(this.A0L, A0v);
    }
}
