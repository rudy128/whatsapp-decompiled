package com.whatsapp.payments.ui;

import X.AE0;
import X.AEV;
import X.AF3;
import X.AFP;
import X.AGD;
import X.AH1;
import X.AS7;
import X.AZ6;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass114;
import X.AnonymousClass11S;
import X.AnonymousClass12Q;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1R2;
import X.AnonymousClass205;
import X.AnonymousClass29y;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass8F3;
import X.AnonymousClass9YX;
import X.C003401n;
import X.C137116uw;
import X.C161708Hk;
import X.C18070vi;
import X.C18100vl;
import X.C182599Uz;
import X.C191499mh;
import X.C196819vh;
import X.C20263ADv;
import X.C20279AEn;
import X.C20339AGv;
import X.C22019AwL;
import X.C22238Azs;
import X.C22239Azt;
import X.C22941Dw;
import X.C63662tU;
import X.C63932tv;
import X.C72483Me;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

public final class IndiaUpiSavingsOfferActivity extends AnonymousClass1FY {
    public Button A00;
    public TextInputLayout A01;
    public C182599Uz A02;
    public AZ6 A03;
    public C20263ADv A04;
    public C161708Hk A05;
    public AnonymousClass8F3 A06;
    public AnonymousClass205 A07;
    public String A08;
    public String A09;
    public String A0A;
    public C18100vl A0B;
    public RecyclerView A0C;
    public boolean A0D;
    public final AnonymousClass29y A0E;

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A03 = AnonymousClass8BU.A0T(r2);
            this.A02 = (C182599Uz) A002.A3C.get();
        }
    }

    /* JADX INFO: finally extract failed */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        AE0 ae0;
        String str4;
        String str5;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625608);
        C003401n A0K = AnonymousClass3MY.A0K(this, AnonymousClass3Ma.A0G(this));
        if (A0K != null) {
            A0K.A0M(2131894219);
            A0K.A0W(true);
        }
        IndiaUpiSavingsOfferActivity$onCreate$layoutManager$1 indiaUpiSavingsOfferActivity$onCreate$layoutManager$1 = new IndiaUpiSavingsOfferActivity$onCreate$layoutManager$1(this);
        Intent intent = getIntent();
        if (intent == null || (extras3 = intent.getExtras()) == null) {
            str = null;
        } else {
            str = extras3.getString("extra_order_type");
        }
        this.A09 = str;
        Intent intent2 = getIntent();
        if (intent2 == null || (extras2 = intent2.getExtras()) == null) {
            str2 = null;
        } else {
            str2 = extras2.getString("extra_payment_config_id");
        }
        this.A08 = str2;
        Intent intent3 = getIntent();
        if (intent3 == null || (extras = intent3.getExtras()) == null) {
            str3 = null;
        } else {
            str3 = extras.getString("extra_referral_screen");
        }
        this.A0A = str3;
        this.A0C = (RecyclerView) C18070vi.A05(this.A00, 2131431619);
        this.A00 = (Button) C18070vi.A05(this.A00, 2131431615);
        TextInputLayout textInputLayout = (TextInputLayout) C18070vi.A05(this.A00, 2131431616);
        this.A01 = textInputLayout;
        if (textInputLayout == null) {
            C18070vi.A11("savingsOfferCodeInput");
            throw null;
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            editText.setHint(getResources().getString(2131894192));
        }
        TextInputLayout textInputLayout2 = this.A01;
        if (textInputLayout2 == null) {
            C18070vi.A11("savingsOfferCodeInput");
            throw null;
        }
        EditText editText2 = textInputLayout2.A0B;
        if (editText2 != null) {
            editText2.addTextChangedListener(new AF3(this, 5));
        }
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            C18070vi.A11("savingsOfferRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(indiaUpiSavingsOfferActivity$onCreate$layoutManager$1);
        RecyclerView recyclerView2 = this.A0C;
        if (recyclerView2 == null) {
            C18070vi.A11("savingsOfferRecyclerView");
            throw null;
        }
        recyclerView2.A0R = true;
        AnonymousClass29y r1 = this.A0E;
        AnonymousClass9YX r0 = new AnonymousClass9YX(this);
        Context A0A2 = C72483Me.A0A(r1);
        try {
            C161708Hk r12 = new C161708Hk(r0);
            AnonymousClass12Q.A04();
            AnonymousClass114.A02(A0A2);
            this.A05 = r12;
            RecyclerView recyclerView3 = this.A0C;
            if (recyclerView3 == null) {
                C18070vi.A11("savingsOfferRecyclerView");
                throw null;
            }
            recyclerView3.setAdapter(r12);
            Button button = this.A00;
            if (button == null) {
                C18070vi.A11("applySavingsOfferButton");
                throw null;
            }
            AFP.A00(button, this, 45);
            this.A07 = AnonymousClass1R2.A03(getIntent());
            this.A0B = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C22019AwL(this));
            C182599Uz r2 = this.A02;
            if (r2 != null) {
                AnonymousClass8F3 r02 = (AnonymousClass8F3) AnonymousClass8BR.A0C(new AH1(r2, 3), this).A00(AnonymousClass8F3.class);
                this.A06 = r02;
                if (r02 == null) {
                    C18070vi.A11("savingsOfferViewModel");
                    throw null;
                }
                C20339AGv.A00(this, r02.A06, new C22238Azs(this), 42);
                AnonymousClass8F3 r03 = this.A06;
                if (r03 == null) {
                    C18070vi.A11("savingsOfferViewModel");
                    throw null;
                }
                C20339AGv.A00(this, r03.A07, new C22239Azt(this), 42);
                AnonymousClass8F3 r22 = this.A06;
                if (r22 == null) {
                    C18070vi.A11("savingsOfferViewModel");
                    throw null;
                }
                AnonymousClass205 r13 = this.A07;
                C18100vl r04 = this.A0B;
                if (r04 == null) {
                    C18070vi.A11("checkoutInfoContent");
                    throw null;
                }
                C20279AEn aEn = (C20279AEn) r04.getValue();
                C22941Dw r05 = UserJid.Companion;
                AnonymousClass1BI r06 = null;
                if (r13 != null) {
                    r06 = r13.A00;
                }
                UserJid A012 = C22941Dw.A01(r06);
                PhoneUserJid A002 = AnonymousClass11S.A00(r22.A00);
                C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                if (aEn != null && (ae0 = aEn.A0C) != null && A012 != null && (str4 = ae0.A01) != null && (str5 = ae0.A02) != null) {
                    JSONObject A013 = C196819vh.A01((AEV) null, A002, aEn, AnonymousClass00R.A00, (String) null, (String) null);
                    C191499mh r3 = r22.A03;
                    String A062 = r22.A01.A06();
                    C18070vi.A0X(A062);
                    r3.A00(new AS7(r22), A012, A062, ae0.A00, str5, str4, A013);
                    return;
                }
                return;
            }
            C18070vi.A11("indiaUpiSavingsOfferViewModelFactory");
            throw null;
        } catch (Throwable th) {
            AnonymousClass12Q.A04();
            AnonymousClass114.A02(A0A2);
            throw th;
        }
    }

    public IndiaUpiSavingsOfferActivity(int i) {
        this.A0D = false;
        AGD.A00(this, 29);
    }

    public IndiaUpiSavingsOfferActivity() {
        this(0);
        this.A0E = (AnonymousClass29y) AnonymousClass12Q.A01(16465);
    }
}
