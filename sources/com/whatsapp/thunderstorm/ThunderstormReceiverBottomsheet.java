package com.whatsapp.thunderstorm;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C132106mD;
import X.C18000vb;
import X.C18070vi;
import X.C72463Mc;
import X.C88584aA;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.NumberFormat;

public final class ThunderstormReceiverBottomsheet extends Hilt_ThunderstormReceiverBottomsheet {
    public C18000vb A00;
    public C132106mD A01;
    public boolean A02;
    public WDSButton A03;
    public WDSButton A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        Integer num;
        Long l;
        Long l2;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131627204, viewGroup, false);
        this.A03 = AnonymousClass3MW.A0q(inflate, 2131436139);
        this.A04 = AnonymousClass3MW.A0q(inflate, 2131436151);
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        } else {
            str = null;
        }
        this.A08 = str;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            num = Integer.valueOf(bundle3.getInt("num_files"));
        } else {
            num = null;
        }
        this.A05 = num;
        Bundle bundle4 = this.A06;
        if (bundle4 != null) {
            l = Long.valueOf(bundle4.getLong("total_bytes"));
        } else {
            l = null;
        }
        this.A06 = l;
        Bundle bundle5 = this.A06;
        if (bundle5 != null) {
            str2 = bundle5.getString("authentication_pin");
        }
        this.A07 = str2;
        AnonymousClass3MY.A0y(A14(), AnonymousClass3MW.A0J(inflate, 2131436178), new Object[]{this.A08}, 2131896877);
        if (this.A05 == null || (l2 = this.A06) == null) {
            AnonymousClass3MY.A1A(inflate, 2131436175, 8);
        } else {
            C18000vb r2 = this.A00;
            if (r2 != null) {
                String A022 = C88584aA.A02(r2, l2.longValue());
                C18070vi.A0X(A022);
                C18000vb r0 = this.A00;
                if (r0 != null) {
                    String format = NumberFormat.getNumberInstance(r0.A0N()).format(this.A05);
                    TextView A0J = AnonymousClass3MW.A0J(inflate, 2131436175);
                    Resources A09 = AnonymousClass3MZ.A09(this);
                    int A0B = C72463Mc.A0B(this.A05);
                    Object[] A1b = AnonymousClass3MX.A1b(format, 0);
                    A1b[1] = A022;
                    AnonymousClass3MX.A1E(A09, A0J, A1b, 2131755456, A0B);
                }
            }
            AnonymousClass3MW.A1M();
            throw null;
        }
        String str3 = this.A07;
        if (str3 != null) {
            AnonymousClass3MW.A0J(inflate, 2131436176).setText(str3);
        } else {
            AnonymousClass3MY.A1A(inflate, 2131436176, 8);
        }
        C18070vi.A0b(inflate);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WDSButton wDSButton = this.A03;
        if (wDSButton != null) {
            AnonymousClass3Ma.A1E(wDSButton, this, 3);
        }
        WDSButton wDSButton2 = this.A04;
        if (wDSButton2 != null) {
            AnonymousClass3Ma.A1E(wDSButton2, this, 4);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C132106mD r0;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (!this.A02 && (r0 = this.A01) != null) {
            r0.A00();
        }
    }
}
