package com.whatsapp.payments.ui;

import X.AFQ;
import X.AnonymousClass000;
import X.AnonymousClass118;
import X.AnonymousClass8BV;
import X.AnonymousClass8Hd;
import X.AnonymousClass9NL;
import X.BD4;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C184939bl;
import X.C20112A7u;
import X.C20264ADw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public final class InstallmentBottomSheetFragment extends Hilt_InstallmentBottomSheetFragment {
    public AnonymousClass118 A00;
    public C18000vb A01;
    public BD4 A02;
    public AnonymousClass9NL A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07 = AnonymousClass000.A13();

    public static final void A00(InstallmentBottomSheetFragment installmentBottomSheetFragment) {
        A01(installmentBottomSheetFragment, 4);
        Fragment A0L = Fragment.A0L(installmentBottomSheetFragment, true);
        Fragment fragment = installmentBottomSheetFragment.A0E;
        C18070vi.A0z(fragment, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) fragment;
        if (A0L instanceof ConfirmPaymentFragment) {
            ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A0L;
            Integer valueOf = Integer.valueOf(AnonymousClass8BV.A03(installmentBottomSheetFragment.A04));
            confirmPaymentFragment.A0O = valueOf;
            ConfirmPaymentFragment.A01(confirmPaymentFragment.A0C, confirmPaymentFragment, confirmPaymentFragment.A0J, valueOf);
            paymentBottomSheet.A2L(A0L);
        }
    }

    public static final void A01(InstallmentBottomSheetFragment installmentBottomSheetFragment, int i) {
        List list;
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        Integer num = installmentBottomSheetFragment.A04;
        if (!(num == null || (list = installmentBottomSheetFragment.A07) == null)) {
            C17960vV.A07(num);
            C20264ADw aDw = (C20264ADw) list.get(num.intValue());
            if (aDw != null) {
                int i2 = aDw.A00;
                if (Integer.valueOf(i2) != null) {
                    A032.A06("num_installments", i2);
                }
            }
        }
        Integer num2 = installmentBottomSheetFragment.A05;
        if (num2 != null) {
            C17960vV.A07(num2);
            A032.A06("max_num_installments", num2.intValue());
        }
        BD4 bd4 = installmentBottomSheetFragment.A02;
        if (bd4 != null) {
            bd4.BiM(A032, Integer.valueOf(i), "installments_selection_prompt", installmentBottomSheetFragment.A06, 1);
        } else {
            C18070vi.A11("paymentUiEventLogger");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.9NL] */
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        Integer num;
        String str;
        String str2;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131626332, viewGroup, false);
        Bundle bundle2 = this.A06;
        Integer num2 = null;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("arg_installment_list");
        } else {
            arrayList = null;
        }
        this.A07 = arrayList;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            num = Integer.valueOf(bundle3.getInt("arg_selected_position"));
        } else {
            num = null;
        }
        this.A04 = num;
        Bundle bundle4 = this.A06;
        if (bundle4 != null) {
            str = bundle4.getString("arg_referral_screen");
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle5 = this.A06;
        if (bundle5 != null) {
            num2 = Integer.valueOf(bundle5.getInt("arg_max_installment_count"));
        }
        this.A05 = num2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131431710);
        C18000vb r1 = this.A01;
        if (r1 != null) {
            AnonymousClass118 r0 = this.A00;
            if (r0 != null) {
                AnonymousClass8Hd r10 = new AnonymousClass8Hd(r0, r1);
                List list = this.A07;
                C17960vV.A07(list);
                C18070vi.A0X(list);
                int A032 = AnonymousClass8BV.A03(this.A04);
                r10.A00 = A032;
                C184939bl r7 = new C184939bl(this, r10);
                if (AnonymousClass000.A1a(list)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C20264ADw aDw = (C20264ADw) list.get(i);
                        boolean A1T = AnonymousClass000.A1T(A032, i);
                        C18070vi.A0d(aDw, 1);
                        ? obj = new Object();
                        obj.A01 = aDw;
                        obj.A02 = A1T;
                        obj.A00 = r7;
                        r10.A03.add(obj);
                    }
                }
                recyclerView.setAdapter(r10);
                AFQ.A00(inflate.findViewById(2131428012), this, 7);
                AFQ.A00(inflate.findViewById(2131435080), this, 8);
                return inflate;
            }
            str2 = "waContext";
        } else {
            str2 = "whatsAppLocale";
        }
        C18070vi.A11(str2);
        throw null;
    }
}
