package com.whatsapp;

import X.AFE;
import X.AnonymousClass1HF;
import X.AnonymousClass1YH;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NZ;
import X.AnonymousClass3SO;
import X.AnonymousClass3gk;
import X.AnonymousClass4a5;
import X.AnonymousClass5YS;
import X.C107815af;
import X.C72493Mg;
import X.C88754aj;
import X.C89594ci;
import X.C91974gY;
import X.C91984gZ;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;

public final class CodeInputField extends AnonymousClass3gk {
    public static Typeface A07;
    public static Typeface A08;
    public char A00;
    public char A01;
    public int A02;
    public C89594ci A03;
    public boolean A04;
    public ValueAnimator A05;
    public final Context A06;

    public void A0L(C107815af r10, int i) {
        A0N(r10, new C91974gY(this, 0), (String) null, (String) null, 8211, 8226, i);
    }

    public void A0K() {
        ValueAnimator valueAnimator = this.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            float x = getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x, AnonymousClass3MW.A00(getResources(), 2131166685) + x});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            C88754aj.A00(ofFloat, this, 0);
            ofFloat.addListener(new C72493Mg(this, x, 0));
            this.A05 = ofFloat;
        }
        this.A05.start();
        AnonymousClass4a5.A03(this.A02);
    }

    public void A0M(C107815af r11, int i, int i2) {
        C91984gZ r4 = new C91984gZ(this, i2);
        setPasswordTransformationEnabled(true);
        setOnClickListener(new AFE(this, 21));
        setCursorVisible(false);
        A0N(r11, r4, "pin_font", (String) null, ')', '(', i);
    }

    public void A0N(C107815af r3, AnonymousClass5YS r4, String str, String str2, char c, char c2, int i) {
        Typeface typeface;
        this.A02 = i;
        this.A01 = c;
        this.A00 = c2;
        C89594ci r0 = new C89594ci(r3, r4, this);
        this.A03 = r0;
        addTextChangedListener(r0);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            typeface = A07;
            if (typeface == null) {
                typeface = AnonymousClass1YH.A03(getContext(), 2131296259);
                A07 = typeface;
            }
        } else {
            typeface = A08;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
                A08 = typeface;
            }
        }
        setTypeface(typeface);
        setTextDirection(3);
        if (str2 != null) {
            AnonymousClass1HF.A0f(this, new AnonymousClass3SO(this, str2));
        }
    }

    public boolean getErrorState() {
        return this.A04;
    }

    public void onDetachedFromWindow() {
        removeTextChangedListener(this.A03);
        super.onDetachedFromWindow();
    }

    public void onSelectionChanged(int i, int i2) {
        int indexOf;
        if (i == i2 && (indexOf = AnonymousClass3Ma.A12(this).indexOf(this.A01)) > -1 && i > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i, i2);
    }

    public void setCode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = this.A02;
        int length = str.length();
        int i2 = length;
        if (i > 4) {
            while (length < i + 1) {
                sb.append(this.A01);
                length++;
            }
            sb.insert(i / 2, 160);
        } else {
            while (length < i) {
                sb.append(this.A01);
                length++;
            }
        }
        this.A03.A00 = true;
        setText(sb);
        if (this.A02 > 4) {
            setSelection(i2 + 1);
        } else {
            setSelection(i2);
        }
        this.A03.A00 = false;
    }

    public void setErrorState(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z) {
        AnonymousClass3NZ r0;
        if (z) {
            r0 = new AnonymousClass3NZ(this);
        } else {
            r0 = null;
        }
        setTransformationMethod(r0);
    }

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = context;
    }

    public String getCode() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public void setRegistrationVoiceCodeLength(int i) {
        this.A02 = i;
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0G();
        this.A06 = context;
    }

    public CodeInputField(Context context) {
        super(context);
        A0G();
        this.A06 = context;
    }
}
