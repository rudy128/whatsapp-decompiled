package com.whatsapp.integrity.survey.activity;

import X.A6O;
import X.AGB;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1FP;
import X.AnonymousClass1FR;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.C137116uw;
import X.C18070vi;
import X.C18100vl;
import X.C183159Xe;
import X.C191609ms;
import X.C195409tI;
import X.C196009uJ;
import X.C21942Av6;
import X.C21943Av7;
import X.C21944Av8;
import X.C21945Av9;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public final class SurveyActivity extends AnonymousClass1FP {
    public AnonymousClass11P A00;
    public C191609ms A01;
    public A6O A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A01 = (C191609ms) A002.A5S.get();
            this.A02 = (A6O) r1.AkQ.get();
            this.A00 = AnonymousClass10E.A6O(r1);
        }
    }

    public SurveyActivity(int i) {
        this.A03 = false;
        AGB.A00(this, 42);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.A00 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C18100vl r1 = this.A04;
            C196009uJ r5 = new C196009uJ((UserJid) r1.getValue(), AnonymousClass00R.A00, AnonymousClass00R.A01, currentTimeMillis);
            String A0y = AnonymousClass3MW.A0y(this.A07);
            String A0y2 = AnonymousClass3MW.A0y(this.A06);
            UserJid userJid = (UserJid) r1.getValue();
            String A0y3 = AnonymousClass3MW.A0y(this.A05);
            if (this.A00 != null) {
                C195409tI r4 = new C195409tI(r5, userJid, A0y, A0y2, A0y3, System.currentTimeMillis());
                A6O a6o = this.A02;
                if (a6o != null) {
                    a6o.A05(r4, 4);
                    C191609ms r2 = this.A01;
                    if (r2 != null) {
                        r2.A00((AnonymousClass1FR) null, new C183159Xe(this), r4, 4);
                        return;
                    }
                    str = "phoenixSurveyFlowManager";
                } else {
                    str = "surveyLogging";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "time";
        C18070vi.A11(str);
        throw null;
    }

    public SurveyActivity() {
        this(0);
        this.A04 = AnonymousClass1DF.A01(new C21942Av6(this));
        this.A07 = AnonymousClass1DF.A01(new C21945Av9(this));
        this.A06 = AnonymousClass1DF.A01(new C21944Av8(this));
        this.A05 = AnonymousClass1DF.A01(new C21943Av7(this));
    }
}
