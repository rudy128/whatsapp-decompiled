package com.whatsapp.payments.ui;

import X.A4C;
import X.A5Y;
import X.AGC;
import X.AW0;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass93Q;
import X.AnonymousClass953;
import X.AnonymousClass9NU;
import X.BD4;
import X.C000200d;
import X.C108955ca;
import X.C137116uw;
import X.C17880vN;
import X.C18030ve;
import X.C188029gl;
import X.C188919iD;
import X.C198789yu;
import X.C20112A7u;
import X.C20128A8n;
import X.C20153A9p;
import X.C24751Ln;
import X.C31061ex;
import X.C42011xT;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import X.C73203Rj;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.List;

public class BrazilPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public C188029gl A00;
    public BD4 A01;
    public A5Y A02;
    public C188919iD A03;
    public boolean A04;

    private void A0Q(C198789yu r9, Integer num, String str) {
        AW0 aw0;
        C20112A7u A022;
        AnonymousClass9NU r0 = this.A0Q.A06;
        if (r0 != null) {
            aw0 = r0.A01;
        } else {
            aw0 = r9.A05;
        }
        if (aw0 == null || !A4C.A01(aw0)) {
            A022 = C20112A7u.A02();
        } else {
            A022 = C20112A7u.A02();
            A022.A07("product_flow", "p2m");
            A022.A07("transaction_id", aw0.A0K);
            A022.A07("transaction_status", C20128A8n.A04(aw0.A03, aw0.A02));
            A022.A07("transaction_status_name", this.A0A.A0A(this.A0T.A0G(aw0)));
        }
        A022.A07("hc_entrypoint", str);
        A022.A07("app_type", "consumer");
        this.A01.BiM(A022, num, "payment_transaction_details", (String) null, 1);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            AnonymousClass93Q.A0q(r1, r2, this);
            AnonymousClass93Q.A0d(r1, r2, AnonymousClass8BT.A0J(r1), this);
            this.A0N = AnonymousClass3MZ.A0z(r1);
            AnonymousClass93Q.A0V(A002, r1, r2, AnonymousClass3MZ.A0q(r1), this);
            AnonymousClass93Q.A0c(A002, r1, r2, this);
            this.A02 = (A5Y) r2.A7B.get();
            this.A03 = (C188919iD) r2.A7F.get();
            this.A01 = AnonymousClass8BT.A0T(r2);
            AnonymousClass00H A003 = C000200d.A00(r1.A84);
            C18030ve A8q = AnonymousClass10E.A8q(r1);
            AnonymousClass10I AL0 = AnonymousClass10E.AL0(r1);
            this.A00 = new C188029gl((AnonymousClass1KB) r1.A4b.get(), (AnonymousClass11S) r1.A63.get(), (C24751Ln) r1.ABe.get(), A8q, (C31061ex) r1.A8E.get(), AL0, A003);
        }
    }

    public C42011xT A4b(ViewGroup viewGroup, int i) {
        if (i != 217) {
            return super.A4b(viewGroup, i);
        }
        List list = C42011xT.A0I;
        return new AnonymousClass953(C108955ca.A0G(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626402, false));
    }

    public void A4f(C198789yu r5) {
        AW0 aw0;
        String str;
        int i = r5.A00;
        if (i != 10) {
            if (i != 201) {
                switch (i) {
                    case 22:
                        break;
                    case 23:
                        A0Q(r5, 124, "wa_p2m_receipt_report_transaction");
                        break;
                    case 24:
                        Intent A07 = AnonymousClass8BR.A07(this, BrazilPaymentSettingsActivity.class);
                        A07.putExtra("referral_screen", "chat");
                        startActivity(A07);
                        finish();
                        return;
                }
            } else {
                AW0 aw02 = r5.A05;
                if (aw02 != null) {
                    C73203Rj A002 = AnonymousClass4a6.A00(this);
                    A002.A0E(2131887915);
                    C108955ca.A1D(getBaseContext(), A002, 2131887914);
                    A002.A0X((DialogInterface.OnClickListener) null, 2131898783);
                    C20153A9p.A00(A002, aw02, this, 18, 2131887912);
                    AnonymousClass3MY.A1G(A002);
                    A4g(C17880vN.A0h(), 161);
                    return;
                }
                return;
            }
        }
        if (i == 22) {
            AnonymousClass9NU r0 = this.A0Q.A06;
            if (r0 != null) {
                aw0 = r0.A01;
            } else {
                aw0 = r5.A05;
            }
            if (aw0 == null || !A4C.A01(aw0)) {
                str = null;
            } else if (aw0.A03 == 200) {
                str = "wa_smb_p2m_payment_details";
            } else {
                str = "wa_p2m_receipt_support";
            }
            A0Q(r5, 39, str);
        } else {
            A4g(C17880vN.A0h(), 39);
        }
        super.A4f(r5);
    }

    public BrazilPaymentTransactionDetailActivity(int i) {
        this.A04 = false;
        AGC.A00(this, 27);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0h = C17880vN.A0h();
        A4g(A0h, A0h);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            Integer A0h = C17880vN.A0h();
            A4g(A0h, A0h);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BrazilPaymentTransactionDetailActivity() {
        this(0);
    }
}
