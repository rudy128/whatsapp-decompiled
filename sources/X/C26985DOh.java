package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.DOh  reason: case insensitive filesystem */
public final /* synthetic */ class C26985DOh implements E6U {
    public final /* synthetic */ C24882COa A00;

    public final void BtR(JSONObject jSONObject) {
        String A02;
        String A022;
        C24307Bz4 bz4;
        CM1 cm1 = this.A00.A00;
        if (cm1 != null && (A02 = A6n.A02(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject)) != null) {
            C26027Cql cql = cm1.A00;
            BRH brh = new BRH(AnonymousClass1D6.A01(A02, jSONObject));
            C25050CVe cVe = cql.A00;
            if (cVe != null) {
                cVe.A00(brh);
            }
            cql.A0D.CPw(brh);
            if (A02.equals("avatar_fetch_event") && (A022 = A6n.A02("event_name", jSONObject)) != null) {
                int hashCode = A022.hashCode();
                if (hashCode != -947300602) {
                    if (hashCode != 1486525436) {
                        if (hashCode == 1598121314 && A022.equals("fetch_failed")) {
                            bz4 = C24307Bz4.AVATAR_FETCH_FAILED;
                        } else {
                            return;
                        }
                    } else if (A022.equals("fetch_started")) {
                        bz4 = C24307Bz4.AVATAR_FETCH_STARTED;
                    } else {
                        return;
                    }
                    C26027Cql.A00(bz4, cql);
                } else if (A022.equals("fetch_completed")) {
                    C26027Cql.A00(C24307Bz4.AVATAR_FETCH_COMPLETED, cql);
                    C61212pJ.A00(cql.A08, 2, 231947811);
                }
            }
        }
    }

    public /* synthetic */ C26985DOh(C24882COa cOa) {
        this.A00 = cOa;
    }
}
