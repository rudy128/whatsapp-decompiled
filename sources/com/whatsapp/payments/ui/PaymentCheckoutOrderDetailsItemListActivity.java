package com.whatsapp.payments.ui;

import X.A8Q;
import X.AE3;
import X.AER;
import X.AET;
import X.AGD;
import X.AH8;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass2UJ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass8F5;
import X.C000200d;
import X.C108945cZ;
import X.C137116uw;
import X.C161688Hi;
import X.C17960vV;
import X.C18000vb;
import X.C182519Ur;
import X.C191899nN;
import X.C192789oz;
import X.C20005A2v;
import X.C20243ADb;
import X.C20254ADm;
import X.C20279AEn;
import X.C20330AGm;
import X.C22417B6z;
import X.C22941Dw;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCheckoutOrderDetailsItemListActivity extends AnonymousClass1FY {
    public C182519Ur A00;
    public C22417B6z A01;
    public A8Q A02;
    public C192789oz A03;
    public C191899nN A04;
    public C18000vb A05;
    public AnonymousClass2UJ A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public RecyclerView A0A;
    public AnonymousClass8F5 A0B;
    public boolean A0C;

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            this.A07 = C000200d.A00(r3.A1o);
            this.A06 = (AnonymousClass2UJ) r2.A3d.get();
            this.A05 = AnonymousClass10E.A6Q(r3);
            this.A04 = (C191899nN) r2.A7i.get();
            this.A03 = (C192789oz) r3.A8n.get();
            this.A02 = AnonymousClass8BU.A0D(r3);
            this.A09 = C000200d.A00(r2.A7j);
            this.A08 = C000200d.A00(A002.A0V);
            this.A00 = (C182519Ur) A002.A2l.get();
            this.A01 = (C22417B6z) A002.A2N.get();
        }
    }

    public PaymentCheckoutOrderDetailsItemListActivity(int i) {
        this.A0C = false;
        AGD.A00(this, 43);
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.1uz] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = AnonymousClass8BS.A05(this, 2131626334).getStringExtra("message_title");
        C20279AEn aEn = (C20279AEn) getIntent().getParcelableExtra("message_content");
        UserJid A022 = C22941Dw.A02(getIntent().getStringExtra("business_owner_jid"));
        C17960vV.A07(aEn);
        List<AET> list = aEn.A0D.A09;
        C17960vV.A0C(AnonymousClass000.A1a(list));
        C17960vV.A07(A022);
        ArrayList A13 = AnonymousClass000.A13();
        for (AET A002 : list) {
            String A003 = A002.A00();
            if (!TextUtils.isEmpty(A003)) {
                A13.add(new C20243ADb(A003));
            }
        }
        C20254ADm aDm = new C20254ADm((String) null, A13);
        AER aer = new AER(A022, new AE3(aEn.A0U, ((AET) list.get(0)).A00(), false), Collections.singletonList(aDm));
        AnonymousClass8BX.A11(this, stringExtra);
        this.A0A = C108945cZ.A0U(this.A00, 2131431837);
        C161688Hi r3 = new C161688Hi(C20005A2v.A00(this.A04, this.A09), this.A05, aEn);
        this.A0A.A0r(new Object());
        this.A0A.setAdapter(r3);
        AnonymousClass8F5 r0 = (AnonymousClass8F5) AnonymousClass8BR.A0C(new AH8(this.A00, this.A01.BGF(A022), A022, this.A06, aer), this).A00(AnonymousClass8F5.class);
        this.A0B = r0;
        r0.A00.A0A(this, new C20330AGm(r3, this, 2));
    }

    public void onResume() {
        super.onResume();
        this.A0B.A0T();
    }

    public PaymentCheckoutOrderDetailsItemListActivity() {
        this(0);
    }
}
