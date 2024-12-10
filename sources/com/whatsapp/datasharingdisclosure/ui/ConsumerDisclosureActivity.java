package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4GY;
import X.AnonymousClass4QI;
import X.C000200d;
import X.C18020vd;
import X.C18070vi;
import X.C18100vl;
import X.C34001jj;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C88654aI;
import X.C91004ez;
import X.C95614mW;
import X.C99154sM;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public final class ConsumerDisclosureActivity extends AnonymousClass1FY {
    public UserJid A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C18100vl A04;

    public ConsumerDisclosureActivity() {
        this(0);
        this.A04 = C99154sM.A01(this, 2);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = C000200d.A00(r2.A8r);
            this.A02 = C000200d.A00(A0K.A0w);
        }
    }

    public void onBackPressed() {
        String str;
        super.onBackPressed();
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            AnonymousClass3MW.A0b(r0).A05(this.A00);
            AnonymousClass00H r02 = this.A02;
            if (r02 != null) {
                AnonymousClass4QI r5 = (AnonymousClass4QI) r02.get();
                r5.A00.CC7(r5.A00(AnonymousClass00R.A01, AnonymousClass00R.A00, AnonymousClass00R.A0N, 4));
                return;
            }
            str = "dataSharingCtwaDisclosureLogger";
        } else {
            str = "ctwaCustomerLoggingController";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624041);
        if (bundle == null) {
            this.A00 = UserJid.Companion.A04(C72453Mb.A0u(this));
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                AnonymousClass4QI r02 = (AnonymousClass4QI) r0.get();
                Integer num = AnonymousClass00R.A01;
                Integer num2 = AnonymousClass00R.A00;
                Integer num3 = AnonymousClass00R.A0N;
                r02.A00.CC7(r02.A00(num, num2, num3, 0));
                AnonymousClass00H r03 = this.A01;
                if (r03 != null) {
                    C88654aI A0b = AnonymousClass3MW.A0b(r03);
                    UserJid userJid = this.A00;
                    if (C18020vd.A04(A0b)) {
                        C88654aI.A03(A0b, userJid, (String) null, 28, true);
                    }
                    ConsumerDisclosureFragment A002 = AnonymousClass4GY.A00((AnonymousClass1BI) null, (Boolean) null, num, num2, num3, false);
                    A002.A08 = new C95614mW(this);
                    C34001jj A0H = AnonymousClass3Ma.A0H(this);
                    A0H.A09(A002, 2131430999);
                    A0H.A03();
                    return;
                }
                C18070vi.A11("ctwaCustomerLoggingController");
                throw null;
            }
            C18070vi.A11("dataSharingCtwaDisclosureLogger");
            throw null;
        }
    }

    public ConsumerDisclosureActivity(int i) {
        this.A03 = false;
        C91004ez.A00(this, 44);
    }
}
