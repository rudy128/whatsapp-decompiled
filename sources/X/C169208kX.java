package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8kX  reason: invalid class name and case insensitive filesystem */
public class C169208kX extends C172208t3 {
    public String A00;
    public String A01;
    public final int A02;
    public final C184189aY A03;
    public final C190499l3 A04;
    public final C20079A6f A05;
    public final AEQ A06;
    public final C18030ve A07;
    public final String A08;
    public final String A09;
    public final AnonymousClass1XN A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C169208kX(X.AnonymousClass190 r15, X.C22416B6y r16, X.AM5 r17, X.C184189aY r18, X.C190499l3 r19, X.C20079A6f r20, X.AEQ r21, X.AnonymousClass118 r22, X.C24521Kq r23, X.C18000vb r24, X.C18030ve r25, X.C22508BAp r26, X.C191659mx r27, X.AnonymousClass1XN r28, X.AnonymousClass7CB r29, X.AnonymousClass10I r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34) {
        /*
            r14 = this;
            r12 = 0
            r3 = r14
            r11 = r27
            r10 = r26
            r9 = r24
            r8 = r23
            r13 = r30
            r7 = r17
            r6 = r29
            r5 = r16
            r4 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r25
            r14.A07 = r0
            r0 = r19
            r14.A04 = r0
            r0 = r21
            r14.A06 = r0
            r0 = r31
            r14.A08 = r0
            r0 = r20
            r14.A05 = r0
            r0 = r32
            r14.A09 = r0
            r1 = r28
            r14.A0A = r1
            r0 = r33
            r14.A00 = r0
            r0 = r34
            r14.A01 = r0
            r0 = r18
            r14.A03 = r0
            r0 = r22
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r0)
            int r0 = r0.densityDpi
            r14.A02 = r0
            X.0ve r2 = r1.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r2)
            if (r0 == 0) goto L_0x0061
            r1 = 4844(0x12ec, float:6.788E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "6.0"
        L_0x005e:
            r14.A00 = r0
            return
        L_0x0061:
            java.lang.String r0 = "5.0"
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169208kX.<init>(X.190, X.B6y, X.AM5, X.9aY, X.9l3, X.A6f, X.AEQ, X.118, X.1Kq, X.0vb, X.0ve, X.BAp, X.9mx, X.1XN, X.7CB, X.10I, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public /* bridge */ /* synthetic */ Object A09(JSONObject jSONObject) {
        ArrayList A13;
        C20272AEf aEf;
        boolean z;
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = jSONObject2.getJSONArray("business_profiles");
        String optString = jSONObject2.optString("request_id");
        for (int i = 0; i < jSONArray.length(); i = C20462ALz.A03(optString, A132, jSONArray, i)) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("api_business_profiles");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2 = C20462ALz.A03(optString, A133, optJSONArray, i2)) {
            }
        }
        ArrayList A134 = AnonymousClass000.A13();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("subcategories");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                C196749va.A01(A134, optJSONArray2, i3);
            }
        }
        ArrayList A135 = AnonymousClass000.A13();
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("filter_categories");
        if (optJSONArray3 != null) {
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                C196749va.A01(A135, optJSONArray3, i4);
            }
        }
        Double A0h = AnonymousClass8BU.A0h("proximity_weight", jSONObject2);
        String optString2 = jSONObject2.optString("ranking_logic_ver");
        String optString3 = jSONObject2.optString("page_id");
        String string = jSONObject2.getString("csvm_config");
        JSONObject optJSONObject = jSONObject2.optJSONObject("map_view");
        if (optJSONObject == null) {
            A13 = AnonymousClass000.A13();
        } else {
            HashMap A11 = C17880vN.A11();
            JSONArray optJSONArray4 = optJSONObject.optJSONArray("categories");
            if (optJSONArray4 != null) {
                for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                    AnonymousClass8nD A002 = C196749va.A00(optJSONArray4.getJSONObject(i5));
                    A11.put(A002.A00, A002);
                }
            }
            JSONArray optJSONArray5 = optJSONObject.optJSONArray("business_profiles");
            A13 = AnonymousClass000.A13();
            if (optJSONArray5 != null) {
                for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                    JSONObject jSONObject3 = optJSONArray5.getJSONObject(i6);
                    C18070vi.A0d(jSONObject3, 0);
                    String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject3);
                    double d = jSONObject3.getDouble("latitude");
                    double d2 = jSONObject3.getDouble("longitude");
                    if (jSONObject3.has("responsive")) {
                        z = true;
                        if (jSONObject3.getBoolean("responsive")) {
                            double d3 = jSONObject3.getDouble("biz_pre_rank_score");
                            Object obj = A11.get(jSONObject3.getString("category_id"));
                            C17960vV.A07(obj);
                            C18070vi.A0X(obj);
                            AnonymousClass8nD r2 = (AnonymousClass8nD) obj;
                            C18070vi.A0d(r2, 6);
                            A13.add(new C20291AEz((AF0) null, r2, (Double) null, (Double) null, A0J, d, d2, d3, Double.NaN, -1, -1, z));
                        }
                    }
                    z = false;
                    double d32 = jSONObject3.getDouble("biz_pre_rank_score");
                    Object obj2 = A11.get(jSONObject3.getString("category_id"));
                    C17960vV.A07(obj2);
                    C18070vi.A0X(obj2);
                    AnonymousClass8nD r22 = (AnonymousClass8nD) obj2;
                    C18070vi.A0d(r22, 6);
                    A13.add(new C20291AEz((AF0) null, r22, (Double) null, (Double) null, A0J, d, d2, d32, Double.NaN, -1, -1, z));
                }
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("config");
            if (optJSONObject2 != null) {
                double d4 = optJSONObject2.getDouble("max_allowed_business_distance_in_meters");
                int i7 = optJSONObject2.getInt("max_num_of_businesses_to_select");
                ArrayList A136 = AnonymousClass000.A13();
                JSONArray jSONArray2 = optJSONObject2.getJSONArray("zoom_level_for_layers");
                int length = jSONArray2.length();
                for (int i8 = 0; i8 < length; i8++) {
                    A136.add(Float.valueOf((float) jSONArray2.getDouble(i8)));
                }
                float f = (float) optJSONObject2.getDouble("default_zoom_level");
                JSONArray jSONArray3 = optJSONObject2.getJSONArray("segments");
                ArrayList A0t = C108965cb.A0t(jSONArray3);
                int length2 = jSONArray3.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i9);
                    float optDouble = (float) jSONObject4.optDouble("start_distance_in_meters");
                    float optDouble2 = (float) jSONObject4.optDouble("end_distance_in_meters");
                    int optInt = jSONObject4.optInt("show_compact_pin_for_layer_upto");
                    ArrayList A137 = AnonymousClass000.A13();
                    JSONArray optJSONArray6 = jSONObject4.optJSONArray("layers");
                    if (optJSONArray6 != null) {
                        int length3 = optJSONArray6.length();
                        for (int i10 = 0; i10 < length3; i10++) {
                            JSONObject jSONObject5 = optJSONArray6.getJSONObject(i10);
                            A137.add(new C20247ADf(jSONObject5.optInt("zoom_level_index"), jSONObject5.optInt("regular_pin_count")));
                        }
                    }
                    A0t.add(new AEK(A137, optDouble, optDouble2, optInt, jSONObject4.getInt("grid_size")));
                }
                aEf = new C20272AEf(A136, A0t, d4, f, i7);
                return new C195699tl(new A1X(aEf, A13), A0h, optString3, optString, optString2, string, A134, A133, A132, A135);
            }
        }
        aEf = null;
        return new C195699tl(new A1X(aEf, A13), A0h, optString3, optString, optString2, string, A134, A133, A132, A135);
    }
}
