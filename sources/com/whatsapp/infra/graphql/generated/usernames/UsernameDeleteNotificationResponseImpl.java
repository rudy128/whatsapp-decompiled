package com.whatsapp.infra.graphql.generated.usernames;

import X.AnonymousClass000;
import X.AnonymousClass1E2;
import X.C17900vP;
import X.C20125A8k;
import X.C42501yH;
import com.whatsapp.util.Log;
import org.json.JSONObject;

public final class UsernameDeleteNotificationResponseImpl extends C20125A8k {

    public final class Xwa2NotifyUsernameDelete extends C20125A8k {
        public AnonymousClass1E2 A0H() {
            String optString = this.A00.optString("lid");
            try {
                C42501yH r0 = AnonymousClass1E2.A01;
                return C42501yH.A00(optString);
            } catch (Throwable th) {
                Log.e(C17900vP.A0C("Failed to parse LidUserJid due to: ", AnonymousClass000.A10(), th), th);
                return null;
            }
        }

        public Xwa2NotifyUsernameDelete(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public UsernameDeleteNotificationResponseImpl(JSONObject jSONObject) {
        super(jSONObject);
    }
}
