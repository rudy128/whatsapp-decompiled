package com.whatsapp.payments.ui;

import X.AFQ;
import X.AFT;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11S;
import X.AnonymousClass17K;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.B93;
import X.C108995ce;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C20112A7u;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.List;

public class IndiaUpiSimPickerDialogFragment extends Hilt_IndiaUpiSimPickerDialogFragment {
    public AnonymousClass11S A00;
    public AZ6 A01;
    public B93 A02;
    public List A03;

    public void A21(Bundle bundle, View view) {
        String A0V;
        int i;
        Object[] A1a;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A03 = bundle2.getParcelableArrayList("extra_subscriptions");
        }
        View view2 = view;
        AnonymousClass8BT.A18(AnonymousClass3MW.A0J(view2, 2131436208), this, new Object[]{AnonymousClass17K.A02(AnonymousClass3MZ.A0Q(this.A00))}, 2131894059);
        ViewGroup A0C = AnonymousClass3MW.A0C(view2, 2131434314);
        A0C.removeAllViews();
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        if (this.A03 != null) {
            for (int i2 = 0; i2 < this.A03.size(); i2++) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) this.A03.get(i2);
                TextView textView = (TextView) LayoutInflater.from(A1n()).inflate(2131625692, A0C, false);
                textView.setId(i2);
                int i3 = i2 + 1;
                if (Build.VERSION.SDK_INT < 22 || TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                    Object[] objArr = new Object[1];
                    C17880vN.A1T(objArr, i3, 0);
                    AnonymousClass8BT.A18(textView, this, objArr, 2131896148);
                } else {
                    if (C18020vd.A05(C18040vf.A02, this.A02, 8809)) {
                        if (TextUtils.isEmpty(subscriptionInfo.getNumber())) {
                            i = 2131896150;
                            A1a = new Object[2];
                            C17880vN.A1T(A1a, i3, 0);
                            A1a[1] = subscriptionInfo.getDisplayName();
                        } else {
                            i = 2131896149;
                            A1a = AnonymousClass8BR.A1a();
                            C17880vN.A1T(A1a, i3, 0);
                            A1a[1] = subscriptionInfo.getDisplayName();
                            A1a[2] = subscriptionInfo.getNumber();
                        }
                        A0V = A1I(i, A1a);
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        Object[] objArr2 = new Object[1];
                        C17880vN.A1T(objArr2, i3, 0);
                        A10.append(A1I(2131896148, objArr2));
                        A10.append(" - ");
                        A0V = C17890vO.A0V(subscriptionInfo.getDisplayName(), A10);
                    }
                    textView.setText(A0V);
                    A032.A07(AnonymousClass001.A1I("SIM_", AnonymousClass000.A10(), i2), String.valueOf(subscriptionInfo.getDisplayName()));
                }
                A0C.addView(textView);
            }
            if (A0C.getChildCount() > 0) {
                ((CompoundButton) A0C.getChildAt(0)).setChecked(true);
            }
        }
        this.A01.BiM(A032, (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck", 0);
        AFQ.A00(AnonymousClass1HF.A06(view2, 2131428815), this, 5);
        AFT.A00(AnonymousClass1HF.A06(view2, 2131429338), this, A0C, 20);
    }

    public void A1K() {
        super.A1K();
        this.A02 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625691);
    }

    public void A1v() {
        super.A1v();
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            this.A03.getWindow().setLayout(-1, -2);
        }
    }

    public void A1x(Context context) {
        super.A1x(context);
        try {
            this.A02 = (B93) A1B();
        } catch (ClassCastException e) {
            C108995ce.A1M("onAttach:", AnonymousClass000.A10(), e);
        }
    }

    public /* synthetic */ void A2H(RadioGroup radioGroup) {
        List list;
        A28();
        if (this.A02 != null && (list = this.A03) != null) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) list.get(radioGroup.getCheckedRadioButtonId());
            C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
            A032.A07("sim_slot_picked", String.valueOf(radioGroup.getCheckedRadioButtonId()));
            if (Build.VERSION.SDK_INT >= 22 && !TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                A032.A07("sim_carrier_picked", String.valueOf(subscriptionInfo.getDisplayName()));
            }
            this.A01.BiM(A032, (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck", 1);
            this.A02.C5i(subscriptionInfo);
        }
    }
}
