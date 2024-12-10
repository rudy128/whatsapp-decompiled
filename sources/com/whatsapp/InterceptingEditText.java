package com.whatsapp;

import X.AnonymousClass3gl;
import X.AnonymousClass5YW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class InterceptingEditText extends AnonymousClass3gl {
    public AnonymousClass5YW A00;

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass5YW r0;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (r0 = this.A00) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        r0.Bm6();
        return true;
    }

    public void setOnBackButtonListener(AnonymousClass5YW r1) {
        this.A00 = r1;
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0G();
    }

    public InterceptingEditText(Context context) {
        super(context);
        A0G();
    }
}
