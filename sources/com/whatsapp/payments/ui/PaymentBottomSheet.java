package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1GP;
import X.AnonymousClass1QE;
import X.AnonymousClass3MW;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.C108955ca;
import X.C139436yq;
import X.C20157A9t;
import X.C34001jj;
import X.C72453Mb;
import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;

public class PaymentBottomSheet extends Hilt_PaymentBottomSheet {
    public DialogInterface.OnCancelListener A00;
    public DialogInterface.OnDismissListener A01;
    public Fragment A02;
    public C20157A9t A03 = new Object();
    public AnonymousClass1QE A04 = AnonymousClass1QE.A00("PaymentBottomSheet", "payment", "COMMON");

    public void A2I(C139436yq r2) {
        r2.A01(false);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.i("onCreateView()");
        View inflate = layoutInflater.inflate(2131626315, viewGroup, false);
        ViewGroup A0D = AnonymousClass3MW.A0D(inflate, 2131430999);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        A0D.setLayoutTransition(layoutTransition);
        return inflate;
    }

    public Dialog A27(Bundle bundle) {
        Log.i("onCreateDialog()");
        Dialog A27 = super.A27(bundle);
        A27.getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        return A27;
    }

    public void A2L(Fragment fragment) {
        AnonymousClass1QE r2 = this.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("navigate-to fragment=");
        AnonymousClass8BW.A1M(fragment, A10);
        r2.A04(A10.toString());
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A06(17432576, 17432577, 17432576, 17432577);
        A0Y.A07((Fragment) C108955ca.A0p(A1E().A0U.A04()));
        A0Y.A09(fragment, 2131430999);
        AnonymousClass8BU.A19(A0Y, (String) null);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A00;
        if (onCancelListener != null) {
            onCancelListener.onCancel((DialogInterface) null);
        }
        C20157A9t a9t = this.A03;
        if (a9t != null) {
            a9t.onDismiss(dialogInterface);
        }
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        Log.i("onViewCreated()");
        if (this.A02 == null) {
            A28();
            return;
        }
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A08(this.A02, 2131430999);
        AnonymousClass8BU.A19(A0Y, (String) null);
    }

    public void A2K() {
        AnonymousClass1GP A1E = A1E();
        int A0K = A1E.A0K();
        A1E.A0b();
        if (A0K <= 1) {
            A28();
            DialogInterface.OnCancelListener onCancelListener = this.A00;
            if (onCancelListener != null) {
                onCancelListener.onCancel((DialogInterface) null);
            }
            this.A03.onDismiss((DialogInterface) null);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Log.i("onDismiss(dialog)");
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
