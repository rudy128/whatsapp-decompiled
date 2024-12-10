package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ve  reason: invalid class name and case insensitive filesystem */
public abstract class C196789ve {
    /* JADX WARNING: type inference failed for: r4v3, types: [X.90a, java.lang.Object, X.AD9] */
    public static final ADT A00(C29621ca r9) {
        C1762490b r4;
        try {
            String A0P = r9.A0P("step_up_id");
            String A0P2 = r9.A0P("service");
            boolean A1T = AnonymousClass000.A1T(r9.A0A("sticky_service_hub_cta", 1), 1);
            String A02 = C29621ca.A02(r9, "step_up_reason");
            C29621ca A0L = r9.A0L("step_up_challenge");
            String A0P3 = A0L.A0P("challenge_id");
            C29621ca A0I = A0L.A0I();
            C18070vi.A0X(A0I);
            String str = A0I.A00;
            int hashCode = str.hashCode();
            if (hashCode != -956705371) {
                if (hashCode == 1224424441 && str.equals("webview")) {
                    boolean z = true;
                    try {
                        if (A0I.A0A("auth_required", 1) != 1) {
                            z = false;
                        }
                        r4 = new C1762490b(A0P3, z);
                    } catch (AnonymousClass1UI e) {
                        Log.e("PAY: Can't build WebViewChallenge ", e);
                    }
                }
                r4 = null;
            } else {
                if (str.equals("document_upload")) {
                    ? obj = new Object();
                    obj.A00 = "DOC_UPLOAD";
                    obj.A00 = A0P3;
                    r4 = obj;
                }
                r4 = null;
            }
            return new ADT(r4, A0P2, A0P, A02, A1T);
        } catch (AnonymousClass1UI e2) {
            Log.e("PAY: PaymentStepUpInfo/fromProtocolTreeNode ", e2);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.90a, java.lang.Object, X.AD9] */
    public static final ADT A01(String str) {
        C1762490b r4;
        if (!AnonymousClass1YF.A0T(str)) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                String string = A16.getString("service");
                String string2 = A16.getString("step_up_id");
                boolean optBoolean = A16.optBoolean("sticky_service_hub_cta", true);
                JSONObject A0w = AnonymousClass8BS.A0w("step_up_challenge", A16);
                AD9 ad9 = null;
                try {
                    String string3 = A0w.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (C18070vi.A18(string3, "WEBVIEW")) {
                        try {
                            String string4 = A0w.getString("challenge_id");
                            boolean z = A0w.getBoolean("auth_required");
                            C18070vi.A0b(string4);
                            r4 = new C1762490b(string4, z);
                        } catch (JSONException e) {
                            Log.e("PAY: WebViewChallenge fromJsonObject threw exception ", e);
                            r4 = null;
                            ad9 = r4;
                            String optString = A16.optString("step_up_reason", (String) null);
                            C18070vi.A0b(string);
                            C18070vi.A0b(string2);
                            return new ADT(ad9, string, string2, optString, optBoolean);
                        }
                    } else {
                        if (C18070vi.A18(string3, "DOC_UPLOAD")) {
                            try {
                                String string5 = A0w.getString("challenge_id");
                                C72453Mb.A1S(string5);
                                ? obj = new Object();
                                obj.A00 = "DOC_UPLOAD";
                                obj.A00 = string5;
                                r4 = obj;
                            } catch (JSONException e2) {
                                Log.e("PAY: DocumentUploadChallenge fromJsonObject threw exception ", e2);
                                r4 = null;
                                ad9 = r4;
                                String optString2 = A16.optString("step_up_reason", (String) null);
                                C18070vi.A0b(string);
                                C18070vi.A0b(string2);
                                return new ADT(ad9, string, string2, optString2, optBoolean);
                            }
                        }
                        String optString22 = A16.optString("step_up_reason", (String) null);
                        C18070vi.A0b(string);
                        C18070vi.A0b(string2);
                        return new ADT(ad9, string, string2, optString22, optBoolean);
                    }
                    ad9 = r4;
                } catch (JSONException e3) {
                    Log.e("PAY: PaymentStepUpChallenge fromJsonObject threw exception ", e3);
                }
                String optString222 = A16.optString("step_up_reason", (String) null);
                C18070vi.A0b(string);
                C18070vi.A0b(string2);
                return new ADT(ad9, string, string2, optString222, optBoolean);
            } catch (JSONException e4) {
                Log.e("PAY: PaymentStepUpInfo fromJsonString threw exception ", e4);
            }
        }
        return null;
    }
}
