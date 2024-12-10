package com.whatsapp.companionmode.registration;

import X.AGB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1VJ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.C134036pu;
import X.C137116uw;
import X.C146437Pc;
import X.C17880vN;
import X.C36401np;
import X.C63662tU;
import X.C63932tv;
import X.C89984dL;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class CompanionPostLogoutActivity extends AnonymousClass1FY {
    public AnonymousClass1VJ A00;
    public C134036pu A01;
    public AnonymousClass1LU A02;
    public C36401np A03;
    public AnonymousClass00H A04;
    public boolean A05;

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A03 = AnonymousClass3MY.A0e(r1);
            this.A04 = AnonymousClass8BT.A0g(r2);
            this.A01 = (C134036pu) r1.AB8.get();
            this.A00 = (AnonymousClass1VJ) r2.A2W.get();
            this.A02 = AnonymousClass3MY.A0Z(r2);
        }
    }

    public CompanionPostLogoutActivity(int i) {
        this.A05 = false;
        AGB.A00(this, 37);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624610);
        boolean A1S = AnonymousClass8BV.A1S(this.A04);
        if (A1S) {
            if (!TextUtils.isEmpty(this.A0A.A0i())) {
                AnonymousClass3MY.A0y(this, AnonymousClass3MX.A0L(this, 2131434003), new Object[]{this.A00.A0G(this.A0A.A0i())}, 2131886390);
            } else {
                Log.e("CompanionPostLogoutActivity/init/LoggedOutPhoneNumber is null or empty");
            }
        }
        TextView A0L = AnonymousClass3MX.A0L(this, 2131434002);
        A0L.setText(this.A03.A05(A0L.getContext(), new C146437Pc(this, 11), C17880vN.A0q(this, "contact-help", new Object[1], 0, 2131894707), "contact-help"));
        AnonymousClass3Ma.A1I(A0L, this.A0E);
        findViewById(2131429535).setOnClickListener(new C89984dL(1, this, A1S));
    }

    public CompanionPostLogoutActivity() {
        this(0);
    }
}
