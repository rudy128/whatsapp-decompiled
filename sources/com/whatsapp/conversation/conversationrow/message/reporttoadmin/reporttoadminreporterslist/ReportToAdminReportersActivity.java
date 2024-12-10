package com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4JF;
import X.C18070vi;
import X.C18460wS;
import X.C27201Vd;
import X.C37451pZ;
import X.C72473Md;
import X.C72483Me;
import X.C73553Wk;
import X.C91004ez;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class ReportToAdminReportersActivity extends AnonymousClass1FY {
    public AnonymousClass4JF A00;
    public C27201Vd A01;
    public boolean A02;

    public ReportToAdminReportersActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = (AnonymousClass4JF) A0K.A2S.get();
            this.A01 = AnonymousClass3MZ.A0i(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C72473Md.A18(this);
        setContentView(2131626725);
        setTitle(2131895228);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131434571);
        List parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("reporters_user_jid");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C18460wS.A00;
        }
        AnonymousClass3Ma.A15(this, recyclerView);
        AnonymousClass4JF r2 = this.A00;
        if (r2 != null) {
            C27201Vd r1 = this.A01;
            if (r1 != null) {
                C37451pZ A06 = r1.A06(this, "report-to-admin");
                AnonymousClass10E r0 = r2.A00.A01;
                AnonymousClass1LU A0Z = AnonymousClass3MY.A0Z(r0);
                recyclerView.setAdapter(new C73553Wk(AnonymousClass3MZ.A0T(r0.A00), AnonymousClass10E.A4z(r0), A06, A0Z, parcelableArrayListExtra));
                return;
            }
            str = "contactPhotos";
        } else {
            str = "adapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ReportToAdminReportersActivity(int i) {
        this.A02 = false;
        C91004ez.A00(this, 34);
    }
}
