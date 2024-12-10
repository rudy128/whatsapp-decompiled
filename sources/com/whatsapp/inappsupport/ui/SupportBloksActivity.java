package com.whatsapp.inappsupport.ui;

import X.ADL;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1X0;
import X.AnonymousClass3MW;
import X.AnonymousClass7OM;
import X.C000200d;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C114935sU;
import X.C133096oA;
import X.C1423279a;
import X.C17880vN;
import X.C18070vi;
import X.C28281Zt;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class SupportBloksActivity extends WaBloksActivity {
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
            this.A00 = C000200d.A00(A0K.A05);
        }
    }

    public SupportBloksActivity(int i) {
        this.A01 = false;
        C1423279a.A00(this, 6);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (AnonymousClass11S.A00(this.A02) != null) {
            try {
                JSONObject A15 = C17880vN.A15();
                JSONObject A152 = C17880vN.A15();
                Locale A0N = this.A00.A0N();
                String[] strArr = AnonymousClass1X0.A04;
                str = A15.put("params", A152.put("locale", A0N.toLanguageTag())).toString();
            } catch (JSONException unused) {
                Log.e("SupportBloksActivity - Could not create bloks parameter");
                str = null;
            }
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                WeakReference A0z = AnonymousClass3MW.A0z(this);
                boolean A0B = C28281Zt.A0B(this);
                ((C133096oA) r0.get()).A00(new AnonymousClass7OM(1), (ADL) null, "com.bloks.www.csf.whatsapp.gethelp.locale.async", C108985cd.A0j(this.A02), str, A0z, A0B);
            } else {
                C18070vi.A11("asyncActionLauncherLazy");
                throw null;
            }
        }
        C28281Zt.A07(this, 2131101276, 1);
    }

    public SupportBloksActivity() {
        this(0);
    }
}
