package com.whatsapp.payments.care.csat;

import X.ADL;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1GP;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass7A4;
import X.AnonymousClass7OM;
import X.C000200d;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C114935sU;
import X.C127596ec;
import X.C133096oA;
import X.C1423279a;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C28281Zt;
import X.C72463Mc;
import android.os.Bundle;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class CsatSurveyBloksActivity extends WaBloksActivity {
    public AnonymousClass00H A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114935sU.A03(A0K, A0A, r1, this);
            this.A00 = C000200d.A00(A0K.A0U);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72463Mc.A19(this, 2131436959);
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Z.add(new AnonymousClass7A4(this, 1));
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            C127596ec r3 = (C127596ec) C18070vi.A0E(r0);
            String stringExtra = getIntent().getStringExtra("survey_id");
            if (stringExtra != null) {
                String stringExtra2 = getIntent().getStringExtra("entry_point");
                String stringExtra3 = getIntent().getStringExtra("session_id");
                C133096oA r9 = (C133096oA) r3.A01.get();
                WeakReference A0z = AnonymousClass3MW.A0z(this);
                boolean A0B = C28281Zt.A0B(this);
                String A0j = C108985cd.A0j(r3.A00);
                JSONObject A15 = C17880vN.A15();
                A15.put("survey_id", stringExtra);
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    A15.put("entry_point", stringExtra2);
                }
                if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                    A15.put("session_id", stringExtra3);
                }
                r9.A00(new AnonymousClass7OM(2), (ADL) null, "com.bloks.www.novi.care.start_survey_action", A0j, C18070vi.A0H(C17880vN.A15().put("params", C17880vN.A15().put("server_params", A15))), A0z, A0B);
                return;
            }
            throw C17890vO.A0K();
        }
        C18070vi.A11("csatSurveyLauncherProxy");
        throw null;
    }

    public CsatSurveyBloksActivity(int i) {
        this.A01 = false;
        C1423279a.A00(this, 23);
    }

    public CsatSurveyBloksActivity() {
        this(0);
    }
}
