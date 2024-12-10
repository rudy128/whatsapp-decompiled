package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ab8  reason: case insensitive filesystem */
public final class C20892Ab8 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            C22941Dw r0 = UserJid.Companion;
            UserJid A03 = C22941Dw.A03(A16.getString("user_jid_raw"));
            String string = A16.getString("promotion_id");
            long j = A16.getLong("last_impression_ts");
            JSONArray jSONArray = A16.getJSONArray("actions");
            C18070vi.A0X(jSONArray);
            List A06 = AnonymousClass1b2.A06(AnonymousClass1b2.A0C(B2B.A00, new C99434so(new C21718Aom((C30391dr) null, jSONArray), 5)));
            C18070vi.A0b(string);
            return new C194919sV(A03, string, A06, j);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CtwaQualitySurveyPromotionDataTransformer invalid CtwaQualitySurveyPromotionData JSON", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CtwaQualitySurveyPromotionDataTransformer invalid CtwaQualitySurveyPromotionData JSON", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C194919sV r4 = (C194919sV) obj;
        C18070vi.A0d(r4, 0);
        try {
            String obj2 = AnonymousClass84U.A00(new C22183Ayz(r4)).toString();
            C18070vi.A0b(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CtwaQualitySurveyPromotionDataTransformer toData/JSONException", e);
        }
    }
}
