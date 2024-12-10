package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.9QN  reason: invalid class name */
public abstract class AnonymousClass9QN {
    public static final AEV A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C170398pn r8 = new C170398pn(C108955ca.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject));
        C170328pg r1 = new C170328pg(C108955ca.A11("address", jSONObject));
        C170368pk r5 = new C170368pk(C108955ca.A11("house_number", jSONObject));
        C170358pj r4 = new C170358pj(C108955ca.A11("floor_number", jSONObject));
        C170338ph r2 = new C170338ph(C108955ca.A11("building_name", jSONObject));
        C170428pq r11 = new C170428pq(C108955ca.A11("tower_number", jSONObject));
        C170408po r9 = new C170408po(C108955ca.A11("phone_number", jSONObject));
        C170388pm r7 = new C170388pm(C108955ca.A11("landmark_area", jSONObject));
        return new AEV(r1, r2, new C170348pi(C108955ca.A11("city", jSONObject)), r4, r5, new C170378pl(C108955ca.A11("in_pin_code", jSONObject)), r7, r8, r9, new C170418pp(C108955ca.A11("state", jSONObject)), r11, jSONObject.optBoolean("is_default"));
    }
}
