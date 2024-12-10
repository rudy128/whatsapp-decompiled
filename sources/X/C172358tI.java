package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.8tI  reason: invalid class name and case insensitive filesystem */
public final class C172358tI extends AnonymousClass161 {
    public final C18030ve A00;

    public C172358tI(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A02(JSONObject jSONObject, long j) {
        String str;
        C129806iO r1;
        Object obj;
        C18070vi.A0d(jSONObject, 0);
        int i = 2;
        if (C18020vd.A05(C18040vf.A02, this.A00, 1849)) {
            i = 3;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("xwa_custom_url_get_user");
        if (optJSONObject != null) {
            int i2 = 0;
            if (!optJSONObject.optBoolean("success")) {
                String optString = optJSONObject.optString("error_code");
                String optString2 = optJSONObject.optString("error_text");
                C18070vi.A0b(optString);
                C18070vi.A0d(optString, 0);
                Iterator it = C179649Iu.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C18070vi.A18(((C179649Iu) obj).codeStr, optString)) {
                        break;
                    }
                }
                C179649Iu r12 = (C179649Iu) obj;
                if (r12 != null) {
                    i2 = r12.code;
                }
                r1 = new C129806iO((UserJid) null, (String) null, optString2, -1, i2);
            } else {
                C22941Dw r3 = UserJid.Companion;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                if (optJSONObject2 != null) {
                    str = A6n.A03("jid", optJSONObject2, C18070vi.A15(optJSONObject2, "jid"));
                } else {
                    str = null;
                }
                UserJid A04 = r3.A04(str);
                if (A04 != null) {
                    r1 = new C129806iO(A04, (String) null, (String) null, i, 0);
                } else {
                    r1 = new C129806iO((UserJid) null, (String) null, (String) null, -1, 0);
                }
            }
            this.A00 = r1;
        }
    }
}
