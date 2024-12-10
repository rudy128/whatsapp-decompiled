package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8t6  reason: invalid class name and case insensitive filesystem */
public final class C172238t6 extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        String str;
        Throwable A0k;
        Integer num;
        Integer num2;
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        try {
            JSONObject A0w = AnonymousClass8BS.A0w("aim_model_batched_manifest", jSONObject2);
            JSONArray jSONArray = A0w.getJSONArray("models");
            ArrayList A13 = AnonymousClass000.A13();
            int length = jSONArray.length();
            int i = 0;
            loop0:
            while (true) {
                if (i < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    C18070vi.A0b(jSONObject3);
                    C18070vi.A0d(jSONObject3, 0);
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("assets");
                    ArrayList A132 = AnonymousClass000.A13();
                    int length2 = jSONArray2.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                        C18070vi.A0b(jSONObject4);
                        C18070vi.A0d(jSONObject4, 0);
                        JSONArray jSONArray3 = jSONObject4.getJSONArray("delta_cache");
                        ArrayList A133 = AnonymousClass000.A13();
                        int length3 = jSONArray3.length();
                        int i3 = 0;
                        for (int i4 = 0; i4 < length3; i4++) {
                            JSONObject jSONObject5 = jSONArray3.getJSONObject(i4);
                            C18070vi.A0b(jSONObject5);
                            C18070vi.A0d(jSONObject5, 0);
                            A133.add(new C193319pt(C18070vi.A0J("base_md5", jSONObject5), C18070vi.A0J("delta_url", jSONObject5)));
                        }
                        AnonymousClass9JJ[] values = AnonymousClass9JJ.values();
                        int length4 = values.length;
                        while (i3 < length4) {
                            AnonymousClass9JJ r23 = values[i3];
                            if (AnonymousClass1YE.A09(r23.name(), AnonymousClass1YE.A07(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject4), "_", "", false), true)) {
                                String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject4);
                                String A0J2 = C18070vi.A0J("cache_key", jSONObject4);
                                String A0J3 = C18070vi.A0J("source_content_hash", jSONObject4);
                                String A0J4 = C18070vi.A0J("md5_hash", jSONObject4);
                                String A0J5 = C18070vi.A0J("asset_handle", jSONObject4);
                                String A0J6 = C18070vi.A0J("creation_time", jSONObject4);
                                String A0J7 = C18070vi.A0J("url", jSONObject4);
                                int i5 = jSONObject4.getInt("filesize_bytes");
                                ARRequestAsset$CompressionMethod fromString = ARRequestAsset$CompressionMethod.fromString(jSONObject4.getString("compression_type"));
                                C18070vi.A0X(fromString);
                                JSONObject A0w2 = AnonymousClass8BS.A0w("metadata", jSONObject4);
                                A132.add(new C195789tu(fromString, r23, new C194199rL(AnonymousClass8BT.A0k("bytecode_version", A0w2), C18070vi.A0J("file_name", A0w2), C18070vi.A0J("operators", A0w2)), A0J, A0J2, A0J3, A0J4, A0J5, A0J6, A0J7, A133, i5));
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                        A0k = new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    JSONArray jSONArray4 = jSONObject3.getJSONArray("properties");
                    ArrayList A134 = AnonymousClass000.A13();
                    int length5 = jSONArray4.length();
                    for (int i6 = 0; i6 < length5; i6++) {
                        JSONObject jSONObject6 = jSONArray4.getJSONObject(i6);
                        C18070vi.A0b(jSONObject6);
                        C18070vi.A0d(jSONObject6, 0);
                        A134.add(new C193329pu(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject6), C18070vi.A0J("value", jSONObject6)));
                    }
                    A13.add(new C194749sE(VersionedCapability.valueOf(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject3)), A132, A134, jSONObject3.getInt("version")));
                    i++;
                } else {
                    String A0J8 = C18070vi.A0J("entry_point", A0w);
                    if (A0J8.equals("AIM_MODEL_BATCHED_MANIFEST")) {
                        num = AnonymousClass00R.A00;
                    } else if (A0J8.equals("AIM_MODEL_MANIFEST")) {
                        num = AnonymousClass00R.A01;
                    } else if (A0J8.equals("AIM_MODEL_MANIFEST_GRAPH_API")) {
                        num = AnonymousClass00R.A0C;
                    } else if (A0J8.equals("AIM_MODEL_VERSION_MANIFEST")) {
                        num = AnonymousClass00R.A0N;
                    } else if (A0J8.equals("LIGHTSPEED_ML_MODEL")) {
                        num = AnonymousClass00R.A0Y;
                    } else if (A0J8.equals("NATIVE_ML_MODEL")) {
                        num = AnonymousClass00R.A0j;
                    } else if (A0J8.equals("NATIVE_ML_MODELS")) {
                        num = AnonymousClass00R.A0u;
                    } else {
                        A0k = AnonymousClass000.A0k(A0J8);
                    }
                    int i7 = A0w.getInt("asset_count");
                    int i8 = A0w.getInt("model_count");
                    String A0J9 = C18070vi.A0J("status", A0w);
                    if (A0J9.equals("FAILURE")) {
                        num2 = AnonymousClass00R.A00;
                    } else if (A0J9.equals("SUCCESS")) {
                        num2 = AnonymousClass00R.A01;
                    } else {
                        A0k = AnonymousClass000.A0k(A0J9);
                    }
                    this.A00 = new C192959pJ(new A22(num, num2, C18070vi.A0J("status_details", A0w), A13, i7, i8));
                    return;
                }
            }
            throw A0k;
        } catch (JSONException e) {
            e = e;
            str = "ArdGetModelMetadataDataProcessor/processResponse Failed to parse data";
            Log.e(str, e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = "ArdGetModelMetadataDataProcessor/processResponse Likely invalid enum value";
            Log.e(str, e);
        } catch (NoSuchElementException e3) {
            e = e3;
            str = "ArdGetModelMetadataDataProcessor/processResponse Invalid enum value";
            Log.e(str, e);
        }
    }
}
