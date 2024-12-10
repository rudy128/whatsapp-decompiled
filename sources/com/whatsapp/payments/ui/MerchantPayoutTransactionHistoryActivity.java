package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DT;
import X.AnonymousClass1F9;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.AnonymousClass8Ff;
import X.AnonymousClass8Gg;
import X.AnonymousClass9B0;
import X.C003401n;
import X.C137116uw;
import X.C161818Hw;
import X.C17890vO;
import X.C188889iA;
import X.C19740yt;
import X.C20328AGk;
import X.C20337AGt;
import X.C38391rD;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.StickyHeadersRecyclerView;

public class MerchantPayoutTransactionHistoryActivity extends AnonymousClass1FY {
    public FrameLayout A00;
    public C161818Hw A01;
    public C188889iA A02;
    public StickyHeadersRecyclerView A03;
    public AnonymousClass8Ff A04;
    public boolean A05;

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A02 = (C188889iA) r1.AEY.get();
        }
    }

    public MerchantPayoutTransactionHistoryActivity(int i) {
        this.A05 = false;
        AGD.A00(this, 36);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1rD, X.8Hw] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626442);
        int A002 = C19740yt.A00(this, 2131100602);
        C003401n A0K = AnonymousClass3MY.A0K(this, (Toolbar) findViewById(2131433485));
        if (A0K != null) {
            AnonymousClass8BU.A17(A0K, 2131893658);
            AnonymousClass8BY.A0d(this, A0K, A002);
        }
        ? r1 = new C38391rD();
        r1.A02 = AnonymousClass000.A13();
        r1.A01 = AnonymousClass000.A13();
        r1.A00 = this;
        this.A01 = r1;
        this.A00 = (FrameLayout) findViewById(2131432156);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) findViewById(2131436363);
        this.A03 = stickyHeadersRecyclerView;
        stickyHeadersRecyclerView.setAdapter(this.A01);
        AnonymousClass8Ff r3 = (AnonymousClass8Ff) AnonymousClass8BR.A0C(new AnonymousClass8Gg(this, this.A02, 3), this).A00(AnonymousClass8Ff.class);
        this.A04 = r3;
        AnonymousClass3MY.A1L(r3.A00, true);
        AnonymousClass3MY.A1L(r3.A01, false);
        C17890vO.A0u(new AnonymousClass9B0(r3.A06, r3), r3.A09);
        AnonymousClass8Ff r5 = this.A04;
        C20337AGt aGt = new C20337AGt(this, 43);
        C20337AGt aGt2 = new C20337AGt(this, 44);
        C20328AGk aGk = new C20328AGk(6);
        AnonymousClass1DT r0 = r5.A02;
        AnonymousClass1F9 r12 = r5.A03;
        r0.A0A(r12, aGt);
        r5.A00.A0A(r12, aGt2);
        r5.A01.A0A(r12, aGk);
    }

    public MerchantPayoutTransactionHistoryActivity() {
        this(0);
    }
}
