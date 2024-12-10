package com.whatsapp.payments.ui;

import X.A8e;
import X.AFQ;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1KB;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.AnonymousClass8DB;
import X.BDA;
import X.BDt;
import X.C108945cZ;
import X.C170278pb;
import X.C175378yc;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C180609Nf;
import X.C20284AEs;
import X.C20312AFu;
import X.C22466B8y;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodsListPickerFragment extends Hilt_PaymentMethodsListPickerFragment implements BDt {
    public AnonymousClass1KB A00;
    public C18000vb A01;
    public AnonymousClass1QS A02;
    public C22466B8y A03;
    public AnonymousClass8DB A04;
    public BDA A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public final C180609Nf A08 = new C175378yc(this, 5);

    public boolean CMD() {
        return true;
    }

    public static PaymentMethodsListPickerFragment A00(List list) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelableArrayList("arg_methods", C17880vN.A10(list));
        paymentMethodsListPickerFragment.A1R(A0D);
        return paymentMethodsListPickerFragment;
    }

    public int BUr(C20284AEs aEs) {
        BDA bda = this.A05;
        if (bda != null) {
            return bda.BUr(aEs);
        }
        return 0;
    }

    public String BUt(C20284AEs aEs) {
        String BUt;
        BDA bda = this.A05;
        if (bda != null && (BUt = bda.BUt(aEs)) != null) {
            return BUt;
        }
        Context A14 = A14();
        C170278pb r0 = aEs.A08;
        C17960vV.A07(r0);
        if (!r0.A0A()) {
            return A14.getString(2131893673);
        }
        if (A8e.A03(A14, aEs) != null) {
            return A8e.A03(A14, aEs);
        }
        return "";
    }

    public String BUu(C20284AEs aEs) {
        BDA bda = this.A05;
        if (bda != null) {
            return bda.BUu(aEs);
        }
        return null;
    }

    public boolean CLr(C20284AEs aEs) {
        BDA bda = this.A05;
        if (bda == null || bda.CLr(aEs)) {
            return true;
        }
        return false;
    }

    public boolean CMH() {
        return AnonymousClass000.A1W(this.A05);
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        BDA bda = this.A05;
        if (bda != null) {
            bda.CMg(aEs, paymentMethodRow);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626383);
    }

    public void A1r() {
        super.A1r();
        C17880vN.A0V(this.A06).unregisterObserver(this.A08);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C17880vN.A0V(this.A06).registerObserver(this.A08);
    }

    public void A21(Bundle bundle, View view) {
        View BMa;
        ArrayList parcelableArrayList = A15().getParcelableArrayList("arg_methods");
        C17960vV.A07(parcelableArrayList);
        ListView listView = (ListView) view.findViewById(2131432751);
        BDA bda = this.A05;
        View view2 = null;
        if (bda != null) {
            A16();
            bda.BWm();
        }
        AnonymousClass8DB r0 = new AnonymousClass8DB(view.getContext(), AnonymousClass8BR.A0c(this.A07), this);
        this.A04 = r0;
        r0.A00 = parcelableArrayList;
        r0.notifyDataSetChanged();
        listView.setAdapter(this.A04);
        BDA bda2 = this.A05;
        if (bda2 != null && bda2.CMF()) {
            view2 = A16().inflate(2131624138, (ViewGroup) null);
            AnonymousClass8BU.A15(view2, 2131427620, AnonymousClass8BY.A00(view));
            AnonymousClass3MW.A0J(view2, 2131427621).setText(2131894040);
            listView.addFooterView(view2);
        }
        ViewGroup A0C = AnonymousClass3MW.A0C(view, 2131427657);
        BDA bda3 = this.A05;
        if (!(bda3 == null || (BMa = bda3.BMa(A16())) == null)) {
            A0C.addView(BMa);
            AFQ.A00(A0C, this, 15);
        }
        if (this.A05 != null) {
            FrameLayout A0P = C108945cZ.A0P(view, 2131430967);
            View BRv = this.A05.BRv(A16(), A0P);
            if (BRv != null) {
                A0P.setVisibility(0);
                A0P.addView(BRv);
            } else {
                A0P.setVisibility(8);
            }
        }
        listView.setOnItemClickListener(new C20312AFu(view2, listView, this));
        View findViewById = view.findViewById(2131428012);
        findViewById.setVisibility(0);
        AFQ.A00(findViewById, this, 16);
        View findViewById2 = view.findViewById(2131431505);
        BDA bda4 = this.A05;
        if (bda4 == null || bda4.CMP()) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(4);
        }
    }
}
