package com.whatsapp.calling.schedulecall.upcomingcalls.view;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8HV;
import X.C003401n;
import X.C27081Uq;
import X.C27201Vd;
import X.C37451pZ;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import X.C91574fu;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;

public class UpcomingScheduledCallsActivity extends AnonymousClass1FY {
    public AnonymousClass1VP A00;
    public AnonymousClass8HV A01;
    public AnonymousClass1M9 A02;
    public C27201Vd A03;
    public AnonymousClass1MZ A04;
    public C27081Uq A05;
    public boolean A06;
    public RecyclerView A07;
    public UpcomingActivityViewModel A08;
    public C37451pZ A09;
    public boolean A0A;

    public UpcomingScheduledCallsActivity() {
        this(0);
        this.A06 = true;
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = AnonymousClass1K1.A0k(A0K);
            this.A00 = AnonymousClass3MZ.A0W(r2);
            this.A02 = AnonymousClass10E.A4z(r2);
            this.A03 = AnonymousClass3MZ.A0i(r2);
            this.A04 = AnonymousClass3MY.A0V(r2);
            this.A05 = (C27081Uq) r2.A9g.get();
        }
    }

    public void A3H() {
        this.A08.A0T();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131627258);
        C003401n A0J = AnonymousClass3MY.A0J(this);
        A0J.A0W(true);
        A0J.A0M(2131887803);
        this.A09 = this.A03.A06(this, "upcoming-activity-single");
        RecyclerView recyclerView = (RecyclerView) AnonymousClass1HF.A06(this.A00, 2131436530);
        this.A07 = recyclerView;
        AnonymousClass3Ma.A15(this, recyclerView);
        AnonymousClass8HV r1 = this.A01;
        r1.A00 = this.A09;
        this.A07.setAdapter(r1);
        UpcomingActivityViewModel upcomingActivityViewModel = (UpcomingActivityViewModel) AnonymousClass3MW.A0N(this).A00(UpcomingActivityViewModel.class);
        this.A08 = upcomingActivityViewModel;
        C91574fu.A00(this, upcomingActivityViewModel.A03, 14);
    }

    public void onDestroy() {
        super.onDestroy();
        C37451pZ r0 = this.A09;
        if (r0 != null) {
            r0.A02();
            this.A01.A00 = null;
        }
    }

    public UpcomingScheduledCallsActivity(int i) {
        this.A0A = false;
        C90994ey.A00(this, 33);
    }
}
