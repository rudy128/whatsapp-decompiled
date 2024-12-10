package com.whatsapp.contact.picker;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass1HF;
import X.AnonymousClass1LA;
import X.AnonymousClass3T3;
import X.C136736uJ;
import X.C181769Rt;
import X.C24071It;
import X.C73383Vj;
import X.C77623qq;
import X.C87544Vz;
import X.C91624fz;
import X.CW0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class ContactsAttachmentSelector extends C77623qq {
    public AnonymousClass1LA A00;
    public AnonymousClass3T3 A01;
    public AnonymousClass118 A02;
    public CW0 A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public BottomSheetBehavior A06;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = C87544Vz.A00(this.A0E);
        AnonymousClass3T3 r0 = (AnonymousClass3T3) new C24071It(new C73383Vj(this), this).A00(AnonymousClass3T3.class);
        this.A01 = r0;
        C91624fz.A00(this, r0.A03, 25);
        C91624fz.A00(this, this.A01.A00, 26);
        if (this.A05) {
            View A062 = AnonymousClass1HF.A06(this.A00, 2131429440);
            this.A06 = new BottomSheetBehavior();
            ((C136736uJ) this.A04.get()).A01(A062, this.A06, this, this.A09);
            this.A04.get();
            C181769Rt.A00(this, getSupportActionBar());
            ((C136736uJ) this.A04.get()).A03(this.A06, false);
        }
    }
}
