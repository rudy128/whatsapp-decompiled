package com.whatsapp;

import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass3Ma;
import X.C72463Mc;
import X.C72483Me;
import X.C84144If;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CopyableTextView extends WaTextView implements View.OnClickListener {
    public AnonymousClass1KB A00;
    public AnonymousClass11C A01;
    public String A02;
    public String A03;
    public boolean A04;

    private void A0F(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A08);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A03 = context.getString(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A0I() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            this.A00 = AnonymousClass10E.A12(A0X);
            this.A01 = AnonymousClass3Ma.A0a(A0X);
        }
    }

    public void onClick(View view) {
        ClipboardManager A09;
        CharSequence charSequence;
        if (!TextUtils.isEmpty(this.A03) && (A09 = this.A01.A09()) != null) {
            CharSequence text = getText();
            if (TextUtils.isEmpty(this.A02)) {
                charSequence = getText();
            } else {
                charSequence = this.A02;
            }
            try {
                A09.setPrimaryClip(ClipData.newPlainText(text, charSequence));
                this.A00.A0G(this.A03, 0);
            } catch (NullPointerException | SecurityException unused) {
            }
        }
    }

    public CopyableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0I();
        A0F(context, attributeSet);
    }

    public void setDataToCopy(String str) {
        this.A02 = str;
    }

    public void setToastString(String str) {
        this.A03 = str;
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0I();
        A0F(context, attributeSet);
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0I();
    }

    public CopyableTextView(Context context) {
        super(context);
        A0I();
        A0F(context, (AttributeSet) null);
    }
}
