package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9vu  reason: invalid class name and case insensitive filesystem */
public abstract class C196949vu {
    public static final C21319Ai4 A00(JSONObject jSONObject) {
        C188169gz r20;
        Boolean bool;
        Integer num;
        String str;
        Integer num2;
        String str2;
        AnonymousClass9ZF r0;
        C198249y2 r02;
        String str3;
        String str4;
        C187549fz r46;
        C187549fz r47;
        C187549fz r48;
        C186319e0 r4;
        String str5;
        String str6;
        byte[] bArr;
        JSONObject jSONObject2 = jSONObject;
        try {
            String A02 = C20064A5n.A02("promotionId", jSONObject2);
            HashSet A12 = C17880vN.A12();
            JSONArray jSONArray = jSONObject2.getJSONArray("triggers");
            int length = jSONArray.length();
            for (int i = 0; i < length; i = AnonymousClass8BU.A05(A12, jSONArray, i)) {
            }
            boolean z = jSONObject2.getBoolean("isServerForcePass");
            long j = jSONObject2.getLong("startTimeEpochSeconds");
            long j2 = jSONObject2.getLong("endTimeEpochSeconds");
            long j3 = jSONObject2.getLong("clientTtlSeconds");
            boolean z2 = jSONObject2.getBoolean("isUncancelable");
            boolean z3 = jSONObject2.getBoolean("isBypassSurfaceDelay");
            boolean z4 = jSONObject2.getBoolean("isExposureHoldout");
            int i2 = jSONObject2.getInt("maxImpressions");
            if (jSONObject2.has("primaryCreative")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("primaryCreative");
                C72453Mb.A1R(jSONObject3);
                AnonymousClass9ZG r7 = null;
                if (jSONObject3.has("title")) {
                    str3 = C20064A5n.A02("title", jSONObject3);
                } else {
                    str3 = null;
                }
                if (jSONObject3.has("content")) {
                    str4 = C20064A5n.A02("content", jSONObject3);
                } else {
                    str4 = null;
                }
                if (jSONObject3.has("primaryAction")) {
                    r46 = C196939vt.A00(AnonymousClass8BS.A0w("primaryAction", jSONObject3));
                } else {
                    r46 = null;
                }
                if (jSONObject3.has("secondaryAction")) {
                    r47 = C196939vt.A00(AnonymousClass8BS.A0w("secondaryAction", jSONObject3));
                } else {
                    r47 = null;
                }
                if (jSONObject3.has("dismissPromotion")) {
                    r48 = C196939vt.A00(AnonymousClass8BS.A0w("dismissPromotion", jSONObject3));
                } else {
                    r48 = null;
                }
                if (jSONObject3.has("image")) {
                    JSONObject A0w = AnonymousClass8BS.A0w("image", jSONObject3);
                    byte[] bArr2 = null;
                    if (A0w.has("description")) {
                        str6 = C20064A5n.A02("description", A0w);
                    } else {
                        str6 = null;
                    }
                    if (A0w.has("lightDataValue")) {
                        bArr = Base64.decode(C20064A5n.A02("lightDataValue", A0w), 2);
                    } else {
                        bArr = null;
                    }
                    if (A0w.has("darkDataValue")) {
                        bArr2 = Base64.decode(C20064A5n.A02("darkDataValue", A0w), 2);
                    }
                    r4 = new C186319e0(str6, bArr, bArr2);
                } else {
                    r4 = null;
                }
                if (jSONObject3.has("header")) {
                    JSONObject A0w2 = AnonymousClass8BS.A0w("header", jSONObject3);
                    if (A0w2.has("title")) {
                        str5 = C20064A5n.A02("title", A0w2);
                    } else {
                        str5 = null;
                    }
                    r7 = new AnonymousClass9ZG(str5);
                }
                r20 = new C188169gz(r46, r47, r48, r7, r4, str3, str4);
            } else {
                r20 = null;
            }
            Integer num3 = AnonymousClass00R.A0N;
            AnonymousClass9ZJ r42 = new AnonymousClass9ZJ(new C198249y2(num3, AnonymousClass000.A13(), AnonymousClass000.A13()));
            if (jSONObject2.has("booleanFilter")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("booleanFilter");
                A3Z a3z = C198249y2.A03;
                String obj = jSONObject4.toString();
                if (obj == null || obj.length() == 0) {
                    r02 = new C198249y2(num3, AnonymousClass000.A13(), AnonymousClass000.A13());
                } else {
                    r02 = A3Z.A00(a3z, C17880vN.A16(obj));
                }
                r42 = new AnonymousClass9ZJ(r02);
            }
            boolean z5 = jSONObject2.getBoolean("hasNativeTemplate");
            boolean z6 = jSONObject2.getBoolean("hasBloks");
            boolean z7 = jSONObject2.getBoolean("skipsContentValidation");
            long j4 = jSONObject2.getLong("priority");
            String A022 = C20064A5n.A02("instanceLogData", jSONObject2);
            String A023 = C20064A5n.A02("templateName", jSONObject2);
            int i3 = jSONObject2.getInt("eligibilityDurationAfterImpressionMs");
            if (jSONObject2.has("dismissable")) {
                bool = Boolean.valueOf(jSONObject2.getBoolean("dismissable"));
            } else {
                bool = null;
            }
            if (jSONObject2.has("surfaceDelayTime")) {
                num = Integer.valueOf(jSONObject2.getInt("surfaceDelayTime"));
            } else {
                num = null;
            }
            if (jSONObject2.has("experimentKey")) {
                str = C20064A5n.A02("experimentKey", jSONObject2);
            } else {
                str = null;
            }
            if (jSONObject2.has("impressionCooldown")) {
                num2 = Integer.valueOf(jSONObject2.getInt("impressionCooldown"));
            } else {
                num2 = null;
            }
            if (jSONObject2.has("instanceId")) {
                str2 = jSONObject2.getString("instanceId");
            } else {
                str2 = null;
            }
            if (jSONObject2.has("contentAttributes")) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("contentAttributes");
                HashMap A11 = C17880vN.A11();
                if (jSONObject5 != null) {
                    Iterator<String> keys = jSONObject5.keys();
                    while (keys.hasNext()) {
                        String A0v = C17880vN.A0v(keys);
                        String string = jSONObject5.getString(A0v);
                        C18070vi.A0b(A0v);
                        C18070vi.A0b(string);
                        A11.put(A0v, string);
                    }
                    r0 = new AnonymousClass9ZF(A11);
                    return new C21319Ai4(r0, r20, r42, bool, num, num2, A02, A022, A023, str, str2, A12, i2, i3, j, j2, j3, j4, z, z2, z3, z4, z5, z6, z7, jSONObject2.optBoolean("logEligibilityWaterfall"));
                }
            }
            r0 = null;
            return new C21319Ai4(r0, r20, r42, bool, num, num2, A02, A022, A023, str, str2, A12, i2, i3, j, j2, j3, j4, z, z2, z3, z4, z5, z6, z7, jSONObject2.optBoolean("logEligibilityWaterfall"));
        } catch (Exception e) {
            Log.e("waquickpromotionclient/WAQuickPromotion/Error parsing FromJson.", e);
            return null;
        }
    }

    public static final JSONObject A01(AnonymousClass5YR r12) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject A0u = C108985cd.A0u(r12);
        try {
            C21319Ai4 ai4 = (C21319Ai4) r12;
            A0u.put("promotionId", ai4.A0F);
            A0u.put("triggers", new JSONArray(ai4.A0H));
            A0u.put("isServerForcePass", ai4.A0M);
            A0u.put("startTimeEpochSeconds", ai4.A05);
            A0u.put("endTimeEpochSeconds", ai4.A03);
            A0u.put("clientTtlSeconds", ai4.A02);
            A0u.put("isUncancelable", ai4.A0N);
            A0u.put("isBypassSurfaceDelay", ai4.A0K);
            A0u.put("isExposureHoldout", ai4.A0L);
            A0u.put("maxImpressions", ai4.A01);
            C188169gz r9 = ai4.A07;
            if (r9 != null) {
                JSONObject A15 = C17880vN.A15();
                A15.putOpt("title", r9.A06);
                A15.putOpt("content", r9.A05);
                C187549fz r0 = r9.A01;
                JSONObject jSONObject6 = null;
                if (r0 != null) {
                    jSONObject2 = C196939vt.A01(r0);
                } else {
                    jSONObject2 = null;
                }
                A15.putOpt("primaryAction", jSONObject2);
                C187549fz r02 = r9.A02;
                if (r02 != null) {
                    jSONObject3 = C196939vt.A01(r02);
                } else {
                    jSONObject3 = null;
                }
                A15.putOpt("secondaryAction", jSONObject3);
                C187549fz r03 = r9.A00;
                if (r03 != null) {
                    jSONObject4 = C196939vt.A01(r03);
                } else {
                    jSONObject4 = null;
                }
                A15.putOpt("dismissPromotion", jSONObject4);
                C186319e0 r10 = r9.A04;
                if (r10 != null) {
                    jSONObject5 = C17880vN.A15();
                    jSONObject5.putOpt("description", r10.A00);
                    byte[] bArr = r10.A02;
                    if (bArr != null) {
                        jSONObject5.putOpt("lightDataValue", Base64.encodeToString(bArr, 2));
                    }
                    byte[] bArr2 = r10.A01;
                    if (bArr2 != null) {
                        jSONObject5.putOpt("darkDataValue", Base64.encodeToString(bArr2, 2));
                    }
                } else {
                    jSONObject5 = null;
                }
                A15.putOpt("image", jSONObject5);
                AnonymousClass9ZG r04 = r9.A03;
                if (r04 != null) {
                    jSONObject6 = C17880vN.A15();
                    jSONObject6.putOpt("title", r04.A00);
                }
                A15.putOpt("header", jSONObject6);
                A0u.putOpt("primaryCreative", A15);
            }
            A0u.putOpt("booleanFilter", A3Z.A01(C198249y2.A03, ai4.A08.A00));
            A0u.put("hasNativeTemplate", ai4.A0J);
            A0u.put("hasBloks", ai4.A0I);
            A0u.put("skipsContentValidation", ai4.A0P);
            A0u.put("priority", ai4.A04);
            A0u.put("instanceLogData", ai4.A0E);
            A0u.put("templateName", ai4.A0G);
            A0u.put("eligibilityDurationAfterImpressionMs", ai4.A00);
            A0u.putOpt("dismissable", ai4.A09);
            A0u.putOpt("surfaceDelayTime", ai4.A0B);
            A0u.putOpt("experimentKey", ai4.A0C);
            A0u.putOpt("impressionCooldown", ai4.A0A);
            A0u.putOpt("instanceId", ai4.A0D);
            AnonymousClass9ZF r05 = ai4.A06;
            if (r05 == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject(r05.A00);
            }
            A0u.putOpt("contentAttributes", jSONObject);
            A0u.putOpt("logEligibilityWaterfall", Boolean.valueOf(ai4.A0O));
            return A0u;
        } catch (Exception e) {
            Log.e("waquickpromotionclient/WAQuickPromotion/Error parsing toJson.", e);
            return null;
        }
    }
}
