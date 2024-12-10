package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C35541mP;
import X.C89954dI;
import X.C90874em;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.whatsapp.WaImageButton;
import com.whatsapp.wds.components.button.WDSButton;

public final class SupportNegativeFeedbackBottomSheet extends Hilt_SupportNegativeFeedbackBottomSheet {
    public CheckBox A00;
    public CheckBox A01;
    public CheckBox A02;
    public CheckBox A03;
    public CheckBox A04;
    public WaImageButton A05;
    public AnonymousClass11E A06;
    public WDSButton A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AnonymousClass3MX.A0A(LayoutInflater.from(A1B()), viewGroup, 2131627154);
        C18070vi.A0b(A0A);
        CheckBox checkBox = (CheckBox) A0A.findViewById(2131429085);
        checkBox.setText(2131892430);
        C90874em.A00(checkBox, this, 12);
        this.A02 = checkBox;
        CheckBox checkBox2 = (CheckBox) A0A.findViewById(2131429084);
        checkBox2.setText(2131892429);
        C90874em.A00(checkBox2, this, 13);
        this.A01 = checkBox2;
        CheckBox checkBox3 = (CheckBox) A0A.findViewById(2131429087);
        checkBox3.setText(2131892432);
        C90874em.A00(checkBox3, this, 14);
        this.A04 = checkBox3;
        CheckBox checkBox4 = (CheckBox) A0A.findViewById(2131429081);
        checkBox4.setText(2131892428);
        C90874em.A00(checkBox4, this, 15);
        this.A00 = checkBox4;
        CheckBox checkBox5 = (CheckBox) A0A.findViewById(2131429086);
        checkBox5.setText(2131892431);
        C90874em.A00(checkBox5, this, 16);
        this.A03 = checkBox5;
        WaImageButton waImageButton = (WaImageButton) A0A.findViewById(2131429138);
        C89954dI.A00(waImageButton, this, 7);
        this.A05 = waImageButton;
        WDSButton A0r = AnonymousClass3MW.A0r(A0A, 2131435883);
        A0r.setEnabled(false);
        C89954dI.A00(A0r, this, 8);
        this.A07 = A0r;
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            ((C35541mP) r0.get()).A01(16);
            return A0A;
        }
        C18070vi.A11("supportLogger");
        throw null;
    }

    public void A1r() {
        super.A1r();
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        this.A03 = null;
        this.A05 = null;
        this.A07 = null;
    }
}
