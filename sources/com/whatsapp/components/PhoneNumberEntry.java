package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1LA;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass8D4;
import X.AnonymousClass9AJ;
import X.AnonymousClass9AL;
import X.C139576z4;
import X.C17880vN;
import X.C17960vV;
import X.C180599Ne;
import X.C20455ALs;
import X.C24931Mf;
import X.C27651Wy;
import X.C42771yi;
import X.C42811ym;
import X.C63942tw;
import X.C84144If;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;

public class PhoneNumberEntry extends LinearLayout implements AnonymousClass009, C27651Wy {
    public AnonymousClass1LA A00;
    public WaEditText A01;
    public WaEditText A02;
    public C180599Ne A03;
    public AnonymousClass11C A04;
    public AnonymousClass031 A05;
    public String A06;
    public TextWatcher A07;
    public boolean A08;

    private void A00(Context context, AttributeSet attributeSet) {
        setSaveEnabled(true);
        setLayoutDirection(0);
        View.inflate(context, 2131626453, this);
        this.A01 = (WaEditText) findViewById(2131434454);
        WaEditText waEditText = (WaEditText) findViewById(2131434462);
        this.A02 = waEditText;
        waEditText.setSaveEnabled(false);
        this.A01.setSaveEnabled(false);
        this.A01.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        this.A02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        this.A02.setTextDirection(3);
        C20455ALs aLs = new C20455ALs(this);
        WaEditText waEditText2 = this.A01;
        waEditText2.A01 = aLs;
        this.A02.A01 = aLs;
        AnonymousClass9AL.A00(waEditText2, this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0H);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            AnonymousClass1HF.A0L(colorStateList, this.A02);
            AnonymousClass1HF.A0L(colorStateList, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public void A02() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A04 = AnonymousClass3Ma.A0a(A0O);
            this.A00 = (AnonymousClass1LA) A0O.AeS.get();
        }
    }

    public void A03(String str) {
        this.A06 = str;
        TextWatcher textWatcher = this.A07;
        if (textWatcher != null) {
            this.A02.removeTextChangedListener(textWatcher);
        }
        try {
            AnonymousClass9AJ r1 = new AnonymousClass9AJ(0, str, this);
            this.A07 = r1;
            this.A02.addTextChangedListener(r1);
        } catch (NullPointerException unused) {
            Log.e("PhoneNumberEntry/formatter exception");
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass8D4 r3 = (AnonymousClass8D4) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        this.A01.setText(r3.A00);
        this.A02.setText(r3.A01);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A00(context, attributeSet);
    }

    public static String[] A01(AnonymousClass1LA r5, AnonymousClass11C r6, int i, boolean z) {
        ClipboardManager A09;
        ClipData primaryClip;
        String str;
        int i2;
        if (!((i != 16908322 && i != 16908337) || (A09 = r6.A09()) == null || (primaryClip = A09.getPrimaryClip()) == null || primaryClip.getItemCount() == 0)) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt == null || itemAt.getText() == null) {
                str = "";
            } else {
                str = itemAt.getText().toString();
            }
            if (!str.startsWith("+")) {
                return null;
            }
            try {
                C42811ym A0H = C42771yi.A00().A0H(str, (String) null);
                String num = Integer.toString(A0H.countryCode_);
                String A032 = C42771yi.A03(A0H);
                if (z) {
                    i2 = C63942tw.A01(r5, num, A032);
                } else {
                    i2 = C63942tw.A00(r5, (C139576z4) null, num, A032);
                }
                if (i2 != 1) {
                    return null;
                }
                return C17880vN.A1b(num, A032, 2, 1);
            } catch (C24931Mf unused) {
            }
        }
        return null;
    }

    public WaEditText getCountryCodeField() {
        return this.A01;
    }

    public WaEditText getPhoneNumberField() {
        return this.A02;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable text = this.A01.getText();
        C17960vV.A07(text);
        String obj = text.toString();
        Editable text2 = this.A02.getText();
        C17960vV.A07(text2);
        return new AnonymousClass8D4(onSaveInstanceState, obj, text2.toString());
    }

    public void setOnPhoneNumberChangeListener(C180599Ne r1) {
        this.A03 = r1;
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00(context, attributeSet);
    }

    public PhoneNumberEntry(Context context) {
        super(context);
        A02();
        A00(context, (AttributeSet) null);
    }
}
