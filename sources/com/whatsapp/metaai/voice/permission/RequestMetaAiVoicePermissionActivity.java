package com.whatsapp.metaai.voice.permission;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4XB;
import X.AnonymousClass6L9;
import X.C108955ca;
import X.C114965t2;
import X.C1423279a;
import X.C18070vi;
import X.C47192Hl;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public final class RequestMetaAiVoicePermissionActivity extends RequestPermissionActivity {
    public AnonymousClass4XB A00;
    public Integer A01;
    public boolean A02;

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            this.A01 = AnonymousClass1K1.A1X(A0K);
            AnonymousClass10E r1 = A0K.AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            AnonymousClass10G r0 = r1.A00;
            C114965t2.A00(r1, r0, r0, this);
            this.A00 = (AnonymousClass4XB) r0.A3F.get();
        }
    }

    public RequestMetaAiVoicePermissionActivity(int i) {
        this.A02 = false;
        C1423279a.A00(this, 14);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A09 = AnonymousClass3MY.A09(this);
        if (A09 == null) {
            Log.e("RequestMetaAiVoicePermissionActivity/extra is null");
            finish();
            return;
        }
        int i = A09.getInt("voice_entrypoint");
        switch (i) {
            case 18:
            case 19:
            case 20:
                this.A01 = Integer.valueOf(i);
                break;
        }
        AnonymousClass4XB r3 = this.A00;
        if (r3 != null) {
            Integer num = this.A01;
            C47192Hl r0 = new C47192Hl();
            AnonymousClass3MZ.A1T(r0, num);
            AnonymousClass4XB.A00(r0, r3, 75);
            findViewById(2131428811).setOnClickListener(new AnonymousClass6L9(this, A09.getInt("entry_point"), A09.getInt("permission_value_for_logging"), 2));
            return;
        }
        C18070vi.A11("metaAiVoiceJourneyLogger");
        throw null;
    }

    public RequestMetaAiVoicePermissionActivity() {
        this(0);
    }
}
