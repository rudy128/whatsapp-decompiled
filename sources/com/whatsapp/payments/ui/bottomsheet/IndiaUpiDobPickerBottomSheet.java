package com.whatsapp.payments.ui.bottomsheet;

import X.A56;
import X.A9I;
import X.AFQ;
import X.AFT;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1FP;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass5JM;
import X.AnonymousClass8Dv;
import X.AnonymousClass9R2;
import X.C139436yq;
import X.C1418477e;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Calendar;

public final class IndiaUpiDobPickerBottomSheet extends Hilt_IndiaUpiDobPickerBottomSheet {
    public C18000vb A00;
    public WDSButton A01;
    public AnonymousClass00H A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5JM(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625620, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        boolean z = A15().getBoolean("BUNDLE_KEY_SHOW_TOOLBAR", false);
        View A06 = AnonymousClass1HF.A06(view, 2131436270);
        if (z) {
            A06.setVisibility(0);
            AnonymousClass1FL A1D = A1D();
            C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
            AnonymousClass9R2.A00((AnonymousClass1FP) A1D, 2131232759);
        } else {
            A06.setVisibility(8);
        }
        TextInputLayout textInputLayout = (TextInputLayout) C18070vi.A05(view, 2131430484);
        C1418477e r4 = (C1418477e) A15().getParcelable("BUNDLE_BANK_ACCOUNT");
        if (r4 != null) {
            TextView A0E = AnonymousClass3Ma.A0E(view, 2131430483);
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                r0.get();
                A0E.setText(AnonymousClass3MX.A16(this, A56.A01(r4), A1a, 0, 2131888680));
            } else {
                C18070vi.A11("paymentMethodPresenter");
                throw null;
            }
        }
        WDSButton A0q = AnonymousClass3MW.A0q(view, 2131429537);
        this.A01 = A0q;
        if (A0q != null) {
            A0q.setEnabled(false);
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            Calendar instance = Calendar.getInstance();
            C18070vi.A0X(instance);
            AnonymousClass8Dv r3 = new AnonymousClass8Dv(new A9I(editText, this), A14(), (Calendar) null, 2132083202, instance.get(1), instance.get(2), instance.get(5));
            editText.setOnClickListener(new AFQ(r3, 36));
            DatePicker datePicker = r3.A01;
            C18070vi.A0X(datePicker);
            WDSButton wDSButton = this.A01;
            if (wDSButton != null) {
                wDSButton.setOnClickListener(new AFT(this, datePicker, 23));
                return;
            }
            return;
        }
        throw C17880vN.A0g();
    }

    public void A2I(C139436yq r4) {
        C18070vi.A0d(r4, 0);
        r4.A01(A15().getBoolean("BUNDLE_KEY_SHOW_HANDLE", false));
    }
}
