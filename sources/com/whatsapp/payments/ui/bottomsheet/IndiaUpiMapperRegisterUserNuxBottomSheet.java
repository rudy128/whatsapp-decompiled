package com.whatsapp.payments.ui.bottomsheet;

import X.AFQ;
import X.AXS;
import X.AZ6;
import X.AnonymousClass1QD;
import X.AnonymousClass1QS;
import X.AnonymousClass4AH;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BY;
import X.C139436yq;
import X.C171858sO;
import X.C18070vi;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class IndiaUpiMapperRegisterUserNuxBottomSheet extends Hilt_IndiaUpiMapperRegisterUserNuxBottomSheet {
    public AXS A00;
    public AnonymousClass1QS A01;
    public AZ6 A02;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AFQ.A00(view.findViewById(2131429534), this, 37);
        AXS axs = this.A00;
        if (axs != null) {
            synchronized (axs) {
                try {
                    AnonymousClass1QD r2 = axs.A01;
                    JSONObject A0c = AnonymousClass8BY.A0c(r2);
                    A0c.put("registeredMapperUserNuxSheetDismissed", true);
                    AnonymousClass8BT.A1G(r2, A0c);
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs storeRegisterMapperUserNuxSheetDismissed threw: ", e);
                }
            }
            A00(this, (Integer) null, 0);
            return;
        }
        C18070vi.A11("indiaUpiPaymentSharedPrefs");
        throw null;
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A00(AnonymousClass4AH.A00);
        r2.A01(true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        A00(this, 128, 1);
    }

    public static final void A00(IndiaUpiMapperRegisterUserNuxBottomSheet indiaUpiMapperRegisterUserNuxBottomSheet, Integer num, int i) {
        String str;
        AZ6 az6 = indiaUpiMapperRegisterUserNuxBottomSheet.A02;
        if (az6 != null) {
            C171858sO A07 = az6.A07(Integer.valueOf(i), num, "mapper_value_prompt", AnonymousClass8BR.A0y(indiaUpiMapperRegisterUserNuxBottomSheet.A15()));
            AnonymousClass1QS r1 = indiaUpiMapperRegisterUserNuxBottomSheet.A01;
            if (r1 != null) {
                A07.A01 = Boolean.valueOf(r1.A02("p2p_context").A0D());
                AZ6 az62 = indiaUpiMapperRegisterUserNuxBottomSheet.A02;
                if (az62 != null) {
                    az62.BiH(A07);
                    return;
                }
            } else {
                str = "paymentsManager";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "indiaUpiFieldStatsLogger";
        C18070vi.A11(str);
        throw null;
    }

    public int A2F() {
        return 2131625638;
    }
}
