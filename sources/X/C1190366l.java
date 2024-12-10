package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66l  reason: invalid class name and case insensitive filesystem */
public final class C1190366l extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C122646Re r1;
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("waffle_xe_root");
        JSONArray jSONArray = jSONObject3.getJSONArray("waffle_d");
        if (jSONArray.length() != 0) {
            ArrayList A13 = AnonymousClass000.A13();
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String string = jSONObject4.getString("waffle_di");
                JSONObject jSONObject5 = jSONObject4.getJSONObject("waffle_xas");
                String string2 = jSONObject5.getString("waffle_xan");
                String string3 = jSONObject5.getString("waffle_xs");
                if ((!C18070vi.A18(string2, "F") && !C18070vi.A18(string2, "I")) || !C18070vi.A18(string3, "S")) {
                    throw new JSONException("Error: unexpected response");
                } else if (!(string == null || string.length() == 0)) {
                    C18070vi.A0b(string2);
                    C18070vi.A0d(string2, 0);
                    for (C122646Re r2 : C122646Re.A00) {
                        if (C18070vi.A18(r2.gqlValue, string2)) {
                            A13.add(new C139886zb(r2, string));
                            i++;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            JSONArray jSONArray2 = jSONObject3.getJSONArray("waffle_unique_ids");
            if (jSONArray2.length() != 0) {
                ArrayList A132 = AnonymousClass000.A13();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    String string4 = jSONArray2.getString(i2);
                    C18070vi.A0X(string4);
                    A132.add(string4);
                }
                JSONArray jSONArray3 = jSONObject3.getJSONArray("waffle_xps");
                if (jSONArray3.length() != 0) {
                    LinkedHashMap A133 = C17880vN.A13();
                    int length3 = jSONArray3.length();
                    int i3 = 0;
                    while (i3 < length3) {
                        JSONObject jSONObject6 = jSONArray3.getJSONObject(i3);
                        JSONObject jSONObject7 = jSONObject6.getJSONObject("waffle_xas");
                        String string5 = jSONObject7.getString("waffle_xan");
                        String string6 = jSONObject7.getString("waffle_xs");
                        if ((C18070vi.A18(string5, "F") || C18070vi.A18(string5, "I")) && C18070vi.A18(string6, "S")) {
                            JSONArray jSONArray4 = jSONObject6.getJSONArray("waffle_hcbc");
                            if (jSONArray4.length() == jSONArray2.length()) {
                                ArrayList A134 = AnonymousClass000.A13();
                                int length4 = jSONArray4.length();
                                for (int i4 = 0; i4 < length4; i4++) {
                                    A134.add(Boolean.valueOf(jSONArray4.getBoolean(i4)));
                                }
                                C18070vi.A0b(string5);
                                if (C18070vi.A18(string5, "F")) {
                                    r1 = C122646Re.FACEBOOK;
                                } else if (C18070vi.A18(string5, "I")) {
                                    r1 = C122646Re.INSTAGRAM;
                                } else {
                                    throw new JSONException("Error: unexpected response");
                                }
                                A133.put(r1, A134);
                                i3++;
                            } else {
                                throw new JSONException("Error: unexpected response");
                            }
                        } else {
                            throw new JSONException("Error: unexpected response");
                        }
                    }
                    JSONObject jSONObject8 = jSONObject3.getJSONObject("purpose_public_keys");
                    byte[] decode = Base64.decode(jSONObject8.getString("purpose_public_ik"), 8);
                    String string7 = jSONObject8.getString("purpose_public_ik_sig");
                    String string8 = jSONObject8.getString("purpose_public_ik_enc_certificate");
                    byte[] decode2 = Base64.decode(jSONObject8.getString("purpose_public_ek"), 8);
                    byte[] decode3 = Base64.decode(jSONObject8.getString("purpose_dummy_ciphertext"), 8);
                    byte[] decode4 = Base64.decode(jSONObject8.getString("purpose_dummy_nonce"), 8);
                    C108995ce.A1H(decode2, decode, string7, string8);
                    C18070vi.A0b(decode3);
                    C18070vi.A0b(decode4);
                    this.A00 = new C136076tE(new C136456tq(string7, string8, decode2, decode, decode3, decode4), A13, A132, A133, true);
                    return;
                }
                throw new JSONException("Error: unexpected response");
            }
            throw new JSONException("Error: unexpected response");
        }
        C18460wS r11 = C18460wS.A00;
        this.A00 = new C136076tE((C136456tq) null, r11, r11, AnonymousClass1D7.A0I(), false);
    }
}
