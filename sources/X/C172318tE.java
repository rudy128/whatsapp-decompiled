package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8tE  reason: invalid class name and case insensitive filesystem */
public final class C172318tE extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        try {
            JSONObject optJSONObject = jSONObject2.optJSONObject("aim_model_batched_manifest");
            if (optJSONObject != null) {
                JSONArray jSONArray = optJSONObject.getJSONArray("models");
                ArrayList A13 = AnonymousClass000.A13();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("assets");
                    C18070vi.A0b(jSONArray2);
                    ArrayList A132 = AnonymousClass000.A13();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                        C18070vi.A0b(jSONObject4);
                        A132.add(new C136566u1(A6n.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject4, C18070vi.A15(jSONObject4, PublicKeyCredentialControllerUtility.JSON_KEY_NAME)), A6n.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject4, C18070vi.A15(jSONObject4, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), A6n.A03("cache_key", jSONObject4, C18070vi.A15(jSONObject4, "cache_key")), A6n.A03("source_content_hash", jSONObject4, C18070vi.A15(jSONObject4, "source_content_hash")), A6n.A03("md5_hash", jSONObject4, C18070vi.A15(jSONObject4, "md5_hash")), A6n.A03("asset_handle", jSONObject4, C18070vi.A15(jSONObject4, "asset_handle")), A6n.A03("creation_time", jSONObject4, C18070vi.A15(jSONObject4, "creation_time")), A6n.A03("url", jSONObject4, C18070vi.A15(jSONObject4, "url")), A6n.A03("compression_type", jSONObject4, C18070vi.A15(jSONObject4, "compression_type")), A6n.A03("asset_type", jSONObject4, C18070vi.A15(jSONObject4, "asset_type")), jSONObject4.getInt("filesize_bytes")));
                    }
                    A13.add(new C135336s2(A132, jSONObject3.getInt("version"), A6n.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject3, C18070vi.A15(jSONObject3, PublicKeyCredentialControllerUtility.JSON_KEY_NAME))));
                }
                this.A00 = new C136206tR(A6n.A03("entry_point", optJSONObject, C18070vi.A15(optJSONObject, "entry_point")), A6n.A03("status", optJSONObject, C18070vi.A15(optJSONObject, "status")), A6n.A03("status_details", optJSONObject, C18070vi.A15(optJSONObject, "status_details")), A13, optJSONObject.getInt("asset_count"), optJSONObject.getInt("model_count"));
            }
        } catch (JSONException e) {
            C17900vP.A0X(e, "MLModelMetadataGraphqlDataProcessor/processResponse failed to parse parameters json: ", AnonymousClass000.A10());
        }
    }
}
