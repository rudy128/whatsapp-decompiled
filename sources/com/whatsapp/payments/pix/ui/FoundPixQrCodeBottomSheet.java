package com.whatsapp.payments.pix.ui;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass77P;
import X.AnonymousClass78R;
import X.BD4;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C24141Ja;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

public final class FoundPixQrCodeBottomSheet extends Hilt_FoundPixQrCodeBottomSheet {
    public AnonymousClass11C A00;
    public C18000vb A01;
    public BD4 A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626472);
    }

    public void A21(Bundle bundle, View view) {
        AnonymousClass77P r9;
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            r9 = (AnonymousClass77P) C24141Ja.A00(bundle2, AnonymousClass77P.class, "bundle_key_pix_qrcode");
        } else {
            r9 = null;
        }
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str = bundle3.getString("referral_screen");
        } else {
            str = null;
        }
        if (r9 != null) {
            AnonymousClass3MW.A0J(view, 2131433867).setText(r9.A01);
            AnonymousClass3MW.A0J(view, 2131433866).setText(r9.A00);
            View A05 = C18070vi.A05(view, 2131427792);
            String str2 = r9.A02;
            if (str2 == null || AnonymousClass1YF.A0T(str2)) {
                A05.setVisibility(8);
            } else {
                TextView A0E = AnonymousClass3Ma.A0E(view, 2131427793);
                try {
                    C17960vV.A07(str2);
                    AnonymousClass1KN r2 = new AnonymousClass1KN(new BigDecimal(str2), 2);
                    AnonymousClass1KJ r1 = AnonymousClass1KL.A0A;
                    C18000vb r0 = this.A01;
                    if (r0 != null) {
                        A0E.setText(r1.BLc(r0, r2));
                        A05.setVisibility(0);
                    } else {
                        AnonymousClass3MW.A1M();
                        throw null;
                    }
                } catch (NumberFormatException unused) {
                    Log.e("Unable to format the Amount data, showing raw value");
                    A0E.setText(str2);
                }
            }
            AnonymousClass1HF.A06(view, 2131428613).setOnClickListener(new AnonymousClass78R(this, r9, str, 5));
            BD4 bd4 = this.A02;
            if (bd4 != null) {
                bd4.BiL((Integer) null, "pix_qr_code_found_prompt", str, 0);
            } else {
                C18070vi.A11("paymentUIEventLogger");
                throw null;
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unable to read ");
            A10.append(AnonymousClass77P.class.getName());
            C17890vO.A19(A10, " from bundle");
            A28();
        }
    }
}
