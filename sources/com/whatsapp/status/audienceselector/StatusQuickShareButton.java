package com.whatsapp.status.audienceselector;

import X.C18070vi;
import X.C24261Jm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

public final class StatusQuickShareButton extends LinearLayout {
    public Button A00 = ((Button) findViewById(2131434719));
    public MaterialButton A01 = ((MaterialButton) findViewById(2131431978));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusQuickShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        View.inflate(context, 2131627067, this);
    }

    public static /* synthetic */ void getLeftSegmentBtn$annotations() {
    }

    public static /* synthetic */ void getRightSegmentBtn$annotations() {
    }

    public final void setLabel(String str) {
        C18070vi.A0d(str, 0);
        this.A01.setText(str);
    }

    public final void setLeftSegmentBtn(MaterialButton materialButton) {
        C18070vi.A0d(materialButton, 0);
        this.A01 = materialButton;
    }

    public final void setPrimaryOnClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A01.setOnClickListener(onClickListener);
    }

    public final void setRightSegmentBtn(Button button) {
        C18070vi.A0d(button, 0);
        this.A00 = button;
    }

    public final void setSecondaryOnClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A00.setOnClickListener(onClickListener);
    }

    public final void setIcon(int i) {
        this.A01.setIcon(C24261Jm.A00(getContext(), i));
    }

    public final MaterialButton getLeftSegmentBtn() {
        return this.A01;
    }

    public final Button getRightSegmentBtn() {
        return this.A00;
    }
}
