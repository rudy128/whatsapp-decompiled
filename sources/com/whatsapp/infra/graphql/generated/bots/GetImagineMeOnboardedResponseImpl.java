package com.whatsapp.infra.graphql.generated.bots;

import X.C18070vi;
import X.C20125A8k;
import org.json.JSONObject;

public final class GetImagineMeOnboardedResponseImpl extends C20125A8k {

    public final class Xwa2FetchWaUsers extends C20125A8k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Xwa2FetchWaUsers(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [X.A8k, com.whatsapp.infra.graphql.generated.bots.ImagineMeFieldsImpl] */
        public ImagineMeFieldsImpl A0H() {
            JSONObject jSONObject = this.A00;
            if (jSONObject.optString("__typename").hashCode() != 561612603) {
                return null;
            }
            return new C20125A8k(jSONObject);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetImagineMeOnboardedResponseImpl(JSONObject jSONObject) {
        super(jSONObject);
        C18070vi.A0d(jSONObject, 1);
    }
}
