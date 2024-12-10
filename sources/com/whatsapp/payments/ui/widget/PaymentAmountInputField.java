package com.whatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass1KB;
import X.AnonymousClass1KJ;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Mo;
import X.AnonymousClass448;
import X.AnonymousClass5YC;
import X.AnonymousClass6Z4;
import X.AnonymousClass9QB;
import X.C108275bQ;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C21448AkF;
import X.C43421zm;
import X.C64142uI;
import X.C74603c1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.HashSet;

public class PaymentAmountInputField extends AnonymousClass448 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public Animation A05;
    public TextView A06;
    public AnonymousClass1KB A07;
    public C18000vb A08;
    public C18000vb A09;
    public AnonymousClass1KJ A0A;
    public C108275bQ A0B;
    public AnonymousClass5YC A0C;
    public BigDecimal A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public ValueAnimator A0I;
    public ValueAnimator A0J;
    public TextPaint A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public final Runnable A0O;

    public static String A08(C18000vb r4) {
        C18070vi.A0d(r4, 0);
        String str = ",";
        String str2 = str;
        if (AnonymousClass1YF.A0Y(AnonymousClass9QB.A00(r4), str, false)) {
            str = ".";
        }
        if (str.equals(".")) {
            return "\\.";
        }
        return str2;
    }

    private void A0A(AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass6Z4.A02);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            this.A0E = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            z = z2;
        } else {
            this.A0E = false;
        }
        this.A09 = this.A08;
        this.A0L = AnonymousClass3Ma.A12(this);
        this.A02 = -1;
        this.A0H = AnonymousClass000.A0Y(this).getConfiguration().orientation;
        setInputType(2);
        A09();
        setFilterTouchesWhenObscured(true);
        setCursorVisible(true);
        setFocusable(true);
        setSingleLine(true);
        addTextChangedListener(this);
        setAutoScaleTextSize(z);
        this.A0G = true;
    }

    private void A09() {
        String str = "0123456789";
        if (this.A0M) {
            str = C17890vO.A0c(AnonymousClass000.A11(str), AnonymousClass9QB.A00(this.A09).charAt(0));
        }
        setKeyListener(DigitsKeyListener.getInstance(str));
    }

    private void setAmount(String str, String str2) {
        if (this.A0E) {
            char charAt = AnonymousClass9QB.A00(this.A09).charAt(0);
            int indexOf = TextUtils.indexOf(str, charAt);
            AnonymousClass1KJ r2 = this.A0A;
            if (r2 != null) {
                C18000vb r1 = this.A09;
                this.A0L = r2.BLb(r1, r2.BLk(r1, str2));
            }
            if (indexOf != -1) {
                int indexOf2 = TextUtils.indexOf(this.A0L, charAt);
                StringBuilder A10 = AnonymousClass000.A10();
                String str3 = this.A0L;
                if (indexOf2 != -1) {
                    str3 = str3.substring(0, indexOf2);
                }
                A10.append(str3);
                str = AnonymousClass000.A0y(str.substring(indexOf), A10);
            } else {
                return;
            }
        }
        this.A0L = str;
    }

    public void A0K() {
        if (this.A04 != null) {
            ValueAnimator valueAnimator = this.A0I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                float A002 = AnonymousClass3MW.A00(getResources(), 2131166388);
                View view = this.A04;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.setRepeatCount(3);
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(65);
                ofFloat.addUpdateListener(new C64142uI(view, A002, 1));
                this.A0I = ofFloat;
                AnonymousClass3Mo.A00(ofFloat, this, 19);
            }
            this.A0I.start();
        }
    }

    public C18000vb getWhatsAppLocale() {
        return this.A09;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i != this.A0H) {
            this.A0H = i;
            this.A02 = -1;
        }
        super.onConfigurationChanged(configuration);
    }

    public void setAllowDecimal(boolean z) {
        this.A0M = z;
        A09();
    }

    public void setAutoScaleTextSize(boolean z) {
        this.A0N = z;
        if (z) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
        }
    }

    public void setErrorTextView(TextView textView) {
        this.A06 = textView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A05 = alphaAnimation;
        alphaAnimation.setDuration(500);
        C74603c1.A00(this.A05, this, textView, 11);
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0G();
        this.A0O = new C21448AkF(this, 6);
        this.A0G = false;
        this.A0M = true;
        A0A(attributeSet);
    }

    public static float A06(PaymentAmountInputField paymentAmountInputField, String str, float f) {
        String str2;
        String str3;
        float f2 = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (paymentAmountInputField.A0K == null) {
            TextPaint textPaint = new TextPaint();
            paymentAmountInputField.A0K = textPaint;
            paymentAmountInputField.getContext();
            textPaint.setTypeface(C43421zm.A03());
        }
        int indexOf = TextUtils.indexOf(str, AnonymousClass9QB.A00(paymentAmountInputField.A09).charAt(0));
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf);
        } else {
            str2 = str;
            str3 = "";
        }
        paymentAmountInputField.A0K.setTextSize(f);
        float measureText = paymentAmountInputField.A0K.measureText(str2);
        if (!TextUtils.isEmpty(str3)) {
            paymentAmountInputField.A0K.setTextSize(f * 1.0f);
            f2 = paymentAmountInputField.A0K.measureText(str3);
        }
        return measureText + f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(java.lang.String r7) {
        /*
            r6 = this;
            float r4 = r6.getTextSize()
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x0078
            int r0 = r6.A02
            if (r0 <= 0) goto L_0x0078
            r5 = 0
        L_0x000d:
            float r3 = r6.A00
            float r1 = (float) r5
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r3 = r3 * r0
            float r2 = A06(r6, r7, r3)
            if (r5 != 0) goto L_0x0063
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0023:
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006c
        L_0x0028:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            android.animation.ValueAnimator r0 = r6.A0J
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003b
            android.animation.ValueAnimator r0 = r6.A0J
            r0.cancel()
        L_0x003b:
            float[] r0 = X.C72473Md.A1a(r4, r3)
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r6.A0J = r2
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r2.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r6.A0J
            r0 = 100
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r6.A0J
            r0 = 18
            X.C88754aj.A00(r1, r6, r0)
            android.animation.ValueAnimator r0 = r6.A0J
            r0.start()
        L_0x0062:
            return
        L_0x0063:
            r0 = 1
            if (r5 != r0) goto L_0x006c
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            goto L_0x0023
        L_0x006c:
            int r5 = r5 + 1
            r0 = 2
            if (r5 <= r0) goto L_0x000d
            float r0 = r6.A01
            float r3 = java.lang.Math.max(r3, r0)
            goto L_0x0028
        L_0x0078:
            float r3 = r6.A00
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.A0B(java.lang.String):void");
    }

    private ViewGroup getFirstNonWrapContentParent() {
        if (getParent() != null) {
            ViewParent parent = getParent();
            while (true) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup == null) {
                    break;
                } else if (viewGroup.getLayoutParams().width != -2) {
                    return viewGroup;
                } else {
                    parent = viewGroup.getParent();
                }
            }
        }
        return null;
    }

    public /* synthetic */ void A0L(ValueAnimator valueAnimator) {
        super.setTextSize(0, AnonymousClass000.A04(valueAnimator.getAnimatedValue()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r5 != false) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = r10.A0L
            boolean r0 = r1.equals(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0127
            X.5YC r0 = r10.A0C
            if (r0 == 0) goto L_0x0127
            java.lang.String r7 = r11.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x00a3
            r10.A0L = r7
            java.lang.String r0 = "0"
            r10.setHint(r0)
        L_0x0022:
            r5 = 0
        L_0x0023:
            java.lang.String r1 = r10.A0L
            X.0vb r0 = r10.A09
            java.lang.String r0 = X.AnonymousClass9QB.A00(r0)
            char r0 = r0.charAt(r6)
            int r3 = android.text.TextUtils.indexOf(r1, r0)
            java.lang.String r2 = r10.A0L
            r0 = -1
            if (r3 == r0) goto L_0x0054
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3MW.A09(r2)
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r3, r0)
            java.lang.String r0 = r0.toString()
            X.3Nq r1 = new X.3Nq
            r1.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r6)
        L_0x0054:
            r10.setText(r2)
            java.lang.String r0 = r10.A0L
            int r0 = r0.length()
            r10.setSelection(r0)
            boolean r0 = r10.A0N
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = r10.A0L
            r10.A0B(r0)
        L_0x0069:
            if (r5 != 0) goto L_0x007d
        L_0x006b:
            X.5bQ r1 = r10.A0B
            if (r1 == 0) goto L_0x007d
            android.text.Editable r0 = r10.getText()
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.toString()
            r1.BlN(r0)
        L_0x007d:
            android.widget.TextView r0 = r10.A06
            if (r0 == 0) goto L_0x00a2
            if (r5 != 0) goto L_0x0085
            r6 = 8
        L_0x0085:
            r0.setVisibility(r6)
            X.1KB r0 = r10.A07
            java.lang.Runnable r3 = r10.A0O
            r0.A0I(r3)
            if (r5 == 0) goto L_0x00a2
            android.view.animation.Animation r0 = r10.A05
            r0.cancel()
            android.view.animation.Animation r0 = r10.A05
            r0.reset()
            X.1KB r2 = r10.A07
            r0 = 1200(0x4b0, double:5.93E-321)
            r2.A0K(r3, r0)
        L_0x00a2:
            return
        L_0x00a3:
            X.0vb r0 = r10.A09
            java.lang.String r0 = A08(r0)
            java.lang.String r8 = ""
            java.lang.String r4 = r7.replaceAll(r0, r8)
            java.lang.String r1 = r10.A0L
            X.0vb r0 = r10.A09
            java.lang.String r0 = A08(r0)
            java.lang.String r0 = r1.replaceAll(r0, r8)
            X.5YC r9 = r10.A0C
            int r3 = r10.A03
            int r1 = r4.length()
            int r0 = r0.length()
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1U(r1, r0)
            X.Aaj r9 = (X.C20867Aaj) r9
            java.lang.String r0 = "^([0]([.,]\\d{0,2})?|[1-9]\\d*([.,]\\d{0,2})?)"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L_0x00ed
            X.1KJ r1 = r9.A03
            X.0vb r0 = r9.A02
            java.math.BigDecimal r0 = r1.BLk(r0, r4)
            if (r0 == 0) goto L_0x00ed
            X.4Mo r2 = X.C20867Aaj.A00(r9, r4, r0, r3, r2)
        L_0x00e4:
            int r1 = r2.A00
            if (r1 != 0) goto L_0x00f3
            r10.setAmount(r7, r4)
            goto L_0x0022
        L_0x00ed:
            X.4Mo r2 = new X.4Mo
            r2.<init>(r5, r8)
            goto L_0x00e4
        L_0x00f3:
            r10.A0K()
            r0 = 3
            if (r1 != r0) goto L_0x0022
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x0022
            android.widget.TextView r0 = r10.A06
            if (r0 == 0) goto L_0x0109
            r0.setText(r3)
            X.11C r0 = r10.A02
            X.AnonymousClass4a5.A03(r0)
        L_0x0109:
            java.math.BigDecimal r2 = r10.A0D
            if (r2 == 0) goto L_0x011e
            X.1KJ r1 = r10.A0A
            X.0vb r0 = r10.A09
            java.math.BigDecimal r0 = r1.BLk(r0, r4)
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L_0x011e
            r10.setAmount(r7, r4)
        L_0x011e:
            X.5bQ r0 = r10.A0B
            if (r0 == 0) goto L_0x0023
            r0.Bt0(r3)
            goto L_0x0023
        L_0x0127:
            r5 = 0
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.afterTextChanged(android.text.Editable):void");
    }

    public int getCursorColor() {
        return AnonymousClass3MZ.A02(getContext(), getContext(), 2130970828, 2131102239);
    }

    public int getCursorVerticalPadding() {
        return getResources().getDimensionPixelSize(2131168180);
    }

    public int getCursorWidth() {
        return getResources().getDimensionPixelSize(2131168181);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0N && this.A02 == -1) {
            if (getLayoutParams().width == -2) {
                ViewGroup firstNonWrapContentParent = getFirstNonWrapContentParent();
                if (firstNonWrapContentParent == null) {
                    width = Resources.getSystem().getDisplayMetrics().widthPixels;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    HashSet A12 = C17880vN.A12();
                    i5 = firstNonWrapContentParent.getWidth();
                    while (!A12.contains(firstNonWrapContentParent)) {
                        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                            View childAt = viewGroup.getChildAt(i6);
                            if (childAt != this && !A12.contains(childAt)) {
                                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(childAt);
                                i5 -= (childAt.getWidth() + A0B2.rightMargin) + A0B2.leftMargin;
                                A12.add(childAt);
                            }
                        }
                        ViewGroup.MarginLayoutParams A0B3 = AnonymousClass3MW.A0B(viewGroup);
                        i5 -= ((A0B3.leftMargin + A0B3.rightMargin) + viewGroup.getPaddingRight()) + viewGroup.getPaddingLeft();
                        A12.add(viewGroup);
                        viewGroup = (ViewGroup) viewGroup.getParent();
                    }
                    this.A02 = i5;
                }
            } else {
                width = getWidth();
            }
            i5 = (width - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.A02 = i5;
        }
    }

    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && this.A06 != null) {
            this.A07.A0I(this.A0O);
            this.A05.cancel();
            this.A05.reset();
            this.A06.setVisibility(8);
        }
    }

    public void setCurrency(AnonymousClass1KJ r1) {
        this.A0A = r1;
    }

    public void setFormatWithCommas(boolean z) {
        this.A0E = z;
    }

    public void setInputAmountType(int i) {
        this.A03 = i;
    }

    public void setInputAmountValidator(AnonymousClass5YC r1) {
        this.A0C = r1;
    }

    public void setOnAmountChangedLister(C108275bQ r1) {
        this.A0B = r1;
    }

    public void setPaymentAmountContainer(View view) {
        this.A04 = view;
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        if (this.A0N) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
            A0B(this.A0L);
        }
    }

    public void setWhatsAppLocale(C18000vb r1) {
        this.A09 = r1;
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0G();
        this.A0O = new C21448AkF(this, 6);
        this.A0G = false;
        this.A0M = true;
        A0A(attributeSet);
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0G();
    }

    public PaymentAmountInputField(Context context) {
        super(context);
        A0G();
        this.A0O = new C21448AkF(this, 6);
        this.A0G = false;
        this.A0M = true;
        A0A((AttributeSet) null);
    }
}
