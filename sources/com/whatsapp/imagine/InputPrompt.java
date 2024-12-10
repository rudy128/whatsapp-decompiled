package com.whatsapp.imagine;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C124416Yg;
import X.C18070vi;
import X.C19740yt;
import X.C24261Jm;
import X.C72453Mb;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;

public final class InputPrompt extends ConstraintLayout {
    public WaEditText A00 = ((WaEditText) findViewById(2131436063));
    public WaImageButton A01;
    public WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WaImageButton waImageButton;
        int A0G = C72453Mb.A0G(context, attributeSet, 1);
        View.inflate(context, 2131625705, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C124416Yg.A00);
        C18070vi.A0X(obtainStyledAttributes);
        ImageView A0H = AnonymousClass3MW.A0H(this, 2131431652);
        View findViewById = findViewById(2131431653);
        this.A01 = (WaImageButton) findViewById(2131427483);
        this.A02 = AnonymousClass3MW.A0U(this, 2131434028);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId != 0) {
                A0H.setImageResource(resourceId);
            } else {
                A0H.setVisibility(8);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
            if (resourceId2 != 0) {
                WaTextView waTextView = this.A02;
                if (waTextView != null) {
                    waTextView.setText(resourceId2);
                }
            } else {
                WaTextView waTextView2 = this.A02;
                if (waTextView2 != null) {
                    waTextView2.setVisibility(8);
                }
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(3, 2131891362);
            WaEditText waEditText = this.A00;
            if (waEditText != null) {
                waEditText.setHint(resourceId3);
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(7, 2131103229);
            WaEditText waEditText2 = this.A00;
            if (waEditText2 != null) {
                AnonymousClass3MX.A1C(context, waEditText2, resourceId4);
            }
            findViewById.setBackgroundTintList(C19740yt.A03(context, obtainStyledAttributes.getResourceId(0, 2131103229)));
            int resourceId5 = obtainStyledAttributes.getResourceId(1, 2131103383);
            WaImageButton waImageButton2 = this.A01;
            if (waImageButton2 != null) {
                waImageButton2.setBackgroundTintList(C19740yt.A03(context, resourceId5));
            }
            int resourceId6 = obtainStyledAttributes.getResourceId(A0G, 2131103100);
            WaImageButton waImageButton3 = this.A01;
            if (waImageButton3 != null) {
                waImageButton3.setImageTintList(C19740yt.A03(context, resourceId6));
            }
            if (obtainStyledAttributes.getBoolean(6, false) && (waImageButton = this.A01) != null) {
                waImageButton.setBackgroundDrawable(C24261Jm.A00(context, 2131232505));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setHintText(String str) {
        C18070vi.A0d(str, 0);
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            waEditText.setHint(str);
        }
    }

    public final Editable getEditable() {
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            return waEditText.getText();
        }
        return null;
    }

    public final void setPrefix(int i) {
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            waTextView.setText(i);
        }
    }

    public final void setText(Editable editable) {
        int i;
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            waEditText.setText(editable);
            Editable text = waEditText.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            waEditText.setSelection(i);
        }
    }

    public final WaEditText getTextInputEntry() {
        return this.A00;
    }

    public final void setHintText(int i) {
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            waEditText.setHint(i);
        }
    }
}
