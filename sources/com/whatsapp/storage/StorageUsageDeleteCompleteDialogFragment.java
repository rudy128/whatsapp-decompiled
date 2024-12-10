package com.whatsapp.storage;

import X.AnonymousClass1GP;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.C113775ni;
import X.C17960vV;
import X.C18000vb;
import X.C34001jj;
import X.C454028v;
import X.C73203Rj;
import X.C88584aA;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class StorageUsageDeleteCompleteDialogFragment extends Hilt_StorageUsageDeleteCompleteDialogFragment {
    public AnonymousClass1KB A00;

    public void A2C(AnonymousClass1GP r2, String str) {
        C34001jj r0 = new C34001jj(r2);
        r0.A0B(this, str);
        r0.A02();
    }

    public void A1u() {
        super.A1u();
        this.A03.getWindow().setLayout(AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168947), -2);
    }

    public Dialog A27(Bundle bundle) {
        Context A1n = A1n();
        Bundle A15 = A15();
        View A09 = AnonymousClass3MX.A09(LayoutInflater.from(A1n), (ViewGroup) null, 2131627133);
        ImageView A0G = AnonymousClass3MW.A0G(A09, 2131429077);
        C454028v A03 = C454028v.A03(A14(), 2131233545);
        C17960vV.A07(A03);
        A0G.setImageDrawable(A03);
        A03.start();
        A03.A08(new C113775ni(this, 2));
        TextView A0J = AnonymousClass3MW.A0J(A09, 2131436245);
        C18000vb r6 = this.A01;
        Pair A002 = C88584aA.A00(r6, A15.getLong("deleted_disk_size"), true, false);
        A0J.setText(r6.A0H((String) A002.second, new Object[]{A002.first}, 2131755416));
        C73203Rj A003 = AnonymousClass4a6.A00(A1n);
        A003.A0c(A09);
        A003.A0T(true);
        return A003.create();
    }
}
