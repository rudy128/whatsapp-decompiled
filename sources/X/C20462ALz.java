package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ALz  reason: case insensitive filesystem */
public abstract class C20462ALz implements C72353Lp {
    public String A00;
    public String A01;
    public final AnonymousClass190 A02;
    public final C22508BAp A03;
    public final C191659mx A04;
    public final C19989A2b A05;
    public final A34 A06 = new C177789Ap(this);
    public final AnonymousClass10I A07;
    public final C22416B6y A08;

    private void A04() {
        if ((this instanceof C172198t2) || !(((C172208t3) this) instanceof C169198kW)) {
            C17890vO.A0u(this.A06, this.A07);
            return;
        }
        AnonymousClass3MY.A1U(this.A07, this, 6);
    }

    public void A0D() {
        this.A06.A0B(true);
    }

    public static void A05(C184189aY r3, AbstractMap abstractMap) {
        if (r3 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_id", r3.A01);
            jSONObject.put("page_size", r3.A00);
            abstractMap.put("pagination", jSONObject);
        }
    }

    public static void A06(C20462ALz aLz, C186749eh r8) {
        AnonymousClass9NT r1;
        C22508BAp bAp = aLz.A03;
        if (bAp != null) {
            int i = r8.A00;
            if (i == 0) {
                Object obj = r8.A03;
                if (obj != null) {
                    bAp.onSuccess(obj);
                } else {
                    aLz.A02.A0G("GraphApiACSNetworkRequest/postNetworkResult: Null response content", (String) null, true);
                }
            } else {
                C190599lD r12 = r8.A01;
                if (r12 == null) {
                    r12 = new C190599lD((Integer) null, (String) null, 10);
                }
                bAp.BtA(r12, i);
                if (r8.A00 != 4 && (r1 = r8.A02) != null && !(aLz instanceof C172198t2)) {
                    C172208t3 r7 = (C172208t3) aLz;
                    r7.A02.Bib(Integer.valueOf(r1.A00), r1.A01, r1.A02, r7.A0A(), r1.A04, r1.A03);
                }
            }
        }
    }

    public int A08() {
        return this.A06.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        r3.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r5 = new java.lang.UnsupportedOperationException(X.AnonymousClass001.A1H("UnifiedHomeRequest/parseDynamicWidget: widget not supported: ", r7, X.AnonymousClass000.A10()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A09(org.json.JSONObject r21) {
        /*
            r20 = this;
            r1 = r20
            boolean r2 = r1 instanceof X.C169178kU
            r0 = r21
            if (r2 == 0) goto L_0x0119
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r1 = "widgets_order"
            org.json.JSONArray r2 = r0.getJSONArray(r1)
            java.lang.String r1 = "widgets"
            org.json.JSONObject r4 = r0.getJSONObject(r1)
            r1 = 0
        L_0x0019:
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x0118
            java.lang.String r7 = r2.getString(r1)
            org.json.JSONObject r6 = r4.getJSONObject(r7)
            java.lang.String r5 = X.AnonymousClass8BS.A0n(r7)     // Catch:{ UnsupportedOperationException -> 0x010c }
            int r0 = r5.hashCode()     // Catch:{ UnsupportedOperationException -> 0x010c }
            switch(r0) {
                case -1049482625: goto L_0x00a3;
                case -805635793: goto L_0x00f1;
                case 1594529602: goto L_0x0074;
                case 2000104852: goto L_0x0042;
                default: goto L_0x0032;
            }     // Catch:{ UnsupportedOperationException -> 0x010c }
        L_0x0032:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.lang.String r0 = "UnifiedHomeRequest/parseDynamicWidget: widget not supported: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r5)     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
        L_0x0041:
            throw r5     // Catch:{ UnsupportedOperationException -> 0x010c }
        L_0x0042:
            java.lang.String r0 = "popular_businesses"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r0 == 0) goto L_0x0032
            r0 = 0
            X.C18070vi.A0d(r6, r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.lang.String r0 = "businesses"
            org.json.JSONArray r8 = r6.getJSONArray(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.util.ArrayList r7 = X.C108965cb.A0t(r8)     // Catch:{ UnsupportedOperationException -> 0x010c }
            int r6 = r8.length()     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5 = 0
        L_0x005d:
            if (r5 >= r6) goto L_0x006d
            org.json.JSONObject r0 = r8.getJSONObject(r5)     // Catch:{ UnsupportedOperationException -> 0x010c }
            X.AF0 r0 = X.AF0.A01(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            r7.add(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            int r5 = r5 + 1
            goto L_0x005d
        L_0x006d:
            X.8kK r5 = new X.8kK     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5.<init>(r7)     // Catch:{ UnsupportedOperationException -> 0x010c }
            goto L_0x0108
        L_0x0074:
            java.lang.String r0 = "popular_categories"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "categories"
            org.json.JSONArray r7 = r6.getJSONArray(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r7 == 0) goto L_0x009b
            r5 = 0
        L_0x0089:
            int r0 = r7.length()     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r5 >= r0) goto L_0x0095
            X.C196749va.A01(r6, r7, r5)     // Catch:{ UnsupportedOperationException -> 0x010c }
            int r5 = r5 + 1
            goto L_0x0089
        L_0x0095:
            X.8kJ r5 = new X.8kJ     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5.<init>(r6)     // Catch:{ UnsupportedOperationException -> 0x010c }
            goto L_0x0108
        L_0x009b:
            java.lang.String r0 = "PopularCategoriesWidget/fromJson categories not found"
            org.json.JSONException r5 = new org.json.JSONException     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            goto L_0x0041
        L_0x00a3:
            java.lang.String r0 = "nearby"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r0 == 0) goto L_0x0032
            java.util.ArrayList r15 = X.AnonymousClass000.A13()     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.lang.String r0 = "businesses"
            org.json.JSONArray r7 = r6.getJSONArray(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5 = 0
        L_0x00b6:
            int r0 = r7.length()     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r5 >= r0) goto L_0x00ca
            org.json.JSONObject r0 = r7.getJSONObject(r5)     // Catch:{ UnsupportedOperationException -> 0x010c }
            X.AF0 r0 = X.AF0.A01(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            r15.add(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            int r5 = r5 + 1
            goto L_0x00b6
        L_0x00ca:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.util.ArrayList r16 = X.AnonymousClass000.A13()     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.lang.String r0 = "csvm_config"
            java.lang.String r9 = ""
            java.lang.String r12 = r6.optString(r0, r9)     // Catch:{ UnsupportedOperationException -> 0x010c }
            X.A1X r7 = new X.A1X     // Catch:{ UnsupportedOperationException -> 0x010c }
            r7.<init>()     // Catch:{ UnsupportedOperationException -> 0x010c }
            r8 = 0
            X.9tl r6 = new X.9tl     // Catch:{ UnsupportedOperationException -> 0x010c }
            r10 = r9
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ UnsupportedOperationException -> 0x010c }
            X.8kI r5 = new X.8kI     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5.<init>(r6)     // Catch:{ UnsupportedOperationException -> 0x010c }
            goto L_0x0108
        L_0x00f1:
            java.lang.String r0 = "frequently_contacted_biz"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            if (r0 == 0) goto L_0x0032
            X.C18070vi.A0b(r6)     // Catch:{ UnsupportedOperationException -> 0x010c }
            java.lang.String r5 = "max_items"
            r0 = 3
            int r0 = r6.optInt(r5, r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
            X.8kH r5 = new X.8kH     // Catch:{ UnsupportedOperationException -> 0x010c }
            r5.<init>(r0)     // Catch:{ UnsupportedOperationException -> 0x010c }
        L_0x0108:
            r3.add(r5)     // Catch:{ UnsupportedOperationException -> 0x010c }
            goto L_0x0114
        L_0x010c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0114:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0118:
            return r3
        L_0x0119:
            boolean r2 = r1 instanceof X.C169148kR
            if (r2 == 0) goto L_0x0169
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r1 = "popular_categories"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            if (r4 == 0) goto L_0x0161
            r2 = 0
        L_0x012e:
            int r1 = r4.length()
            if (r2 >= r1) goto L_0x013a
            X.C196749va.A01(r3, r4, r2)
            int r2 = r2 + 1
            goto L_0x012e
        L_0x013a:
            X.8kJ r1 = new X.8kJ
            r1.<init>(r3)
            r5.add(r1)
            java.lang.String r1 = "popular_biz"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            java.util.ArrayList r3 = X.C72463Mc.A0s(r4)
            int r2 = r4.length()
            r1 = 0
        L_0x0151:
            if (r1 >= r2) goto L_0x024a
            org.json.JSONObject r0 = r4.getJSONObject(r1)
            X.AF0 r0 = X.AF0.A01(r0)
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x0151
        L_0x0161:
            java.lang.String r1 = "PopularCategoriesWidget/fromJson categories not found"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x0169:
            boolean r2 = r1 instanceof X.C169138kQ
            if (r2 == 0) goto L_0x019a
            java.util.HashMap r5 = X.C17880vN.A11()
            java.lang.String r1 = "tiles"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            r3 = 0
        L_0x0178:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x0194
            org.json.JSONObject r2 = r4.getJSONObject(r3)
            java.lang.String r0 = "tile_id"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "imprecise_location_tile_level"
            int r0 = r2.getInt(r0)
            X.C17890vO.A0z(r1, r5, r0)
            int r3 = r3 + 1
            goto L_0x0178
        L_0x0194:
            X.9X0 r0 = new X.9X0
            r0.<init>(r5)
            return r0
        L_0x019a:
            boolean r2 = r1 instanceof X.C169168kT
            if (r2 == 0) goto L_0x020a
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.lang.String r1 = "business_profiles"
            org.json.JSONArray r8 = r0.getJSONArray(r1)
            int r6 = r8.length()
            r5 = 0
        L_0x01ad:
            if (r5 >= r6) goto L_0x0209
            org.json.JSONObject r9 = r8.getJSONObject(r5)
            java.lang.String r0 = "full_details"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            if (r0 == 0) goto L_0x0206
            X.AF0 r4 = X.AF0.A01(r0)
            java.lang.String r0 = "description"
            java.lang.String r0 = r9.optString(r0)
            r4.A04 = r0
            java.lang.String r0 = "product_images"
            org.json.JSONArray r3 = r9.optJSONArray(r0)
            if (r3 == 0) goto L_0x01e1
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            int r1 = r3.length()
            r0 = 0
        L_0x01d8:
            if (r0 >= r1) goto L_0x01df
            int r0 = X.AnonymousClass8BW.A04(r2, r3, r0)
            goto L_0x01d8
        L_0x01df:
            r4.A06 = r2
        L_0x01e1:
            java.lang.String r0 = "post_images"
            org.json.JSONArray r3 = r9.optJSONArray(r0)
            if (r3 == 0) goto L_0x01fb
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            int r1 = r3.length()
            r0 = 0
        L_0x01f2:
            if (r0 >= r1) goto L_0x01f9
            int r0 = X.AnonymousClass8BW.A04(r2, r3, r0)
            goto L_0x01f2
        L_0x01f9:
            r4.A05 = r2
        L_0x01fb:
            r0 = 1
            r4.A01 = r0
            java.lang.String r0 = r4.A0E
            X.C18070vi.A0W(r0)
            r7.put(r0, r4)
        L_0x0206:
            int r5 = r5 + 1
            goto L_0x01ad
        L_0x0209:
            return r7
        L_0x020a:
            boolean r2 = r1 instanceof X.C169128kP
            if (r2 == 0) goto L_0x0253
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r1 = "categories"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            r3 = 0
        L_0x0219:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x0252
            org.json.JSONObject r1 = r4.getJSONObject(r3)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)
            X.C17960vV.A06(r2)
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.getString(r0)
            X.C17960vV.A06(r1)
            X.C18070vi.A0X(r1)
            X.AEQ r0 = new X.AEQ
            r0.<init>(r2, r1)
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x0219
        L_0x024a:
            X.8kK r0 = new X.8kK
            r0.<init>(r3)
            r5.add(r0)
        L_0x0252:
            return r5
        L_0x0253:
            boolean r2 = r1 instanceof X.C169198kW
            if (r2 == 0) goto L_0x030a
            X.8kW r1 = (X.C169198kW) r1
            java.util.ArrayList r15 = X.AnonymousClass000.A13()
            java.lang.String r2 = "categories"
            org.json.JSONArray r4 = r0.getJSONArray(r2)
            r8 = 0
            r3 = 0
        L_0x0265:
            int r2 = r4.length()
            if (r3 >= r2) goto L_0x0271
            X.C196749va.A01(r15, r4, r3)
            int r3 = r3 + 1
            goto L_0x0265
        L_0x0271:
            java.lang.String r2 = "request_id"
            java.lang.String r12 = r0.optString(r2)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r2 = "businesses"
            org.json.JSONArray r5 = r0.getJSONArray(r2)
            r4 = 0
        L_0x0282:
            int r2 = r5.length()
            if (r4 >= r2) goto L_0x028d
            int r4 = A03(r12, r3, r5, r4)
            goto L_0x0282
        L_0x028d:
            java.lang.String r2 = "suggested_queries"
            org.json.JSONArray r7 = r0.optJSONArray(r2)
            r6 = 0
            if (r7 == 0) goto L_0x02a6
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            r4 = 0
        L_0x029b:
            int r2 = r7.length()
            if (r4 >= r2) goto L_0x02a7
            int r4 = X.AnonymousClass8BU.A05(r5, r7, r4)
            goto L_0x029b
        L_0x02a6:
            r5 = r6
        L_0x02a7:
            java.lang.String r2 = "alternative_queries"
            org.json.JSONArray r7 = r0.optJSONArray(r2)
            if (r7 == 0) goto L_0x02bf
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r4 = 0
        L_0x02b4:
            int r2 = r7.length()
            if (r4 >= r2) goto L_0x02bf
            int r4 = X.AnonymousClass8BU.A05(r6, r7, r4)
            goto L_0x02b4
        L_0x02bf:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r4 = "filter_categories"
            org.json.JSONArray r7 = r0.optJSONArray(r4)
            if (r7 == 0) goto L_0x02d7
        L_0x02cb:
            int r4 = r7.length()
            if (r8 >= r4) goto L_0x02d7
            X.C196749va.A01(r2, r7, r8)
            int r8 = r8 + 1
            goto L_0x02cb
        L_0x02d7:
            java.lang.String r4 = "proximity_weight"
            java.lang.Double r8 = X.AnonymousClass8BU.A0h(r4, r0)
            java.lang.String r4 = "ranking_logic_ver"
            java.lang.String r13 = r0.optString(r4)
            java.lang.String r4 = "page_id"
            java.lang.String r9 = r0.optString(r4)
            java.lang.String r4 = "csvm_config"
            java.lang.String r14 = r0.getString(r4)
            java.util.ArrayList r16 = X.AnonymousClass000.A13()
            X.A1Z r7 = new X.A1Z
            r7.<init>(r5, r6)
            java.lang.String r10 = r1.A07
            java.lang.String r11 = r1.A08
            int r0 = r1.A01
            X.9hi r6 = new X.9hi
            r19 = r0
            r18 = r2
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r6
        L_0x030a:
            boolean r2 = r1 instanceof X.C169188kV
            if (r2 == 0) goto L_0x039e
            X.8kV r1 = (X.C169188kV) r1
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.lang.String r2 = "request_id"
            java.lang.String r8 = r0.optString(r2)
            java.lang.String r2 = "business_profiles"
            org.json.JSONArray r4 = r0.getJSONArray(r2)
            r7 = 0
            r3 = 0
        L_0x0322:
            int r2 = r4.length()
            if (r3 >= r2) goto L_0x032d
            int r3 = A03(r8, r13, r4, r3)
            goto L_0x0322
        L_0x032d:
            r2 = 0
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            X.0ve r5 = r1.A03
            r4 = 3400(0xd48, float:4.764E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r5, r4)
            if (r1 == 0) goto L_0x0370
            java.lang.String r1 = "filter_categories"
            org.json.JSONArray r6 = r0.optJSONArray(r1)
            java.lang.String r1 = "subcategories"
            org.json.JSONArray r5 = r0.optJSONArray(r1)
            if (r5 == 0) goto L_0x0362
            r4 = 0
        L_0x0356:
            int r1 = r5.length()
            if (r4 >= r1) goto L_0x0362
            X.C196749va.A01(r11, r5, r4)
            int r4 = r4 + 1
            goto L_0x0356
        L_0x0362:
            if (r6 == 0) goto L_0x0373
        L_0x0364:
            int r1 = r6.length()
            if (r7 >= r1) goto L_0x0373
            X.C196749va.A01(r14, r6, r7)
            int r7 = r7 + 1
            goto L_0x0364
        L_0x0370:
            r7 = 0
            r9 = r7
            goto L_0x0389
        L_0x0373:
            java.lang.String r1 = "proximity_weight"
            double r1 = r0.optDouble(r1, r2)
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
            java.lang.String r1 = "ranking_logic_ver"
            java.lang.String r9 = r0.optString(r1)
            java.lang.String r1 = "page_id"
            java.lang.String r7 = r0.optString(r1)
        L_0x0389:
            java.lang.String r1 = "csvm_config"
            java.lang.String r10 = r0.getString(r1)
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            X.A1X r5 = new X.A1X
            r5.<init>()
            X.9tl r4 = new X.9tl
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x039e:
            boolean r1 = r1 instanceof X.C169158kS
            if (r1 == 0) goto L_0x0407
            java.lang.String r1 = "business_profiles"
            org.json.JSONArray r11 = r0.getJSONArray(r1)
            java.util.LinkedHashMap r10 = X.C17880vN.A13()
            int r9 = r11.length()
            r8 = 0
        L_0x03b1:
            if (r8 >= r9) goto L_0x0406
            org.json.JSONObject r1 = r11.getJSONObject(r8)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "jid"
            java.lang.String r12 = r1.getString(r0)
            java.lang.String r0 = "description"
            java.lang.String r7 = r1.optString(r0)
            java.lang.String r0 = "product_images"
            org.json.JSONArray r6 = r1.optJSONArray(r0)
            java.lang.String r0 = "post_images"
            org.json.JSONArray r5 = r1.optJSONArray(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r2 = 0
            if (r5 == 0) goto L_0x03e9
            int r1 = r5.length()
            r0 = 0
        L_0x03e2:
            if (r0 >= r1) goto L_0x03e9
            int r0 = X.AnonymousClass8BW.A04(r3, r5, r0)
            goto L_0x03e2
        L_0x03e9:
            if (r6 == 0) goto L_0x03f6
            int r0 = r6.length()
        L_0x03ef:
            if (r2 >= r0) goto L_0x03f6
            int r2 = X.AnonymousClass8BW.A04(r4, r6, r2)
            goto L_0x03ef
        L_0x03f6:
            X.C18070vi.A0b(r12)
            X.9sO r1 = new X.9sO
            r1.<init>(r12, r7, r3, r4)
            java.lang.String r0 = r1.A00
            r10.put(r0, r1)
            int r8 = r8 + 1
            goto L_0x03b1
        L_0x0406:
            return r10
        L_0x0407:
            r2 = 0
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            X.A1Z r1 = new X.A1Z
            r1.<init>(r2, r2)
            java.util.ArrayList r10 = X.C02790Fj.A00(r0)
            r13 = 4
            X.9hi r0 = new X.9hi
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20462ALz.A09(org.json.JSONObject):java.lang.Object");
    }

    public String A0A() {
        if (this instanceof C169178kU) {
            return "unified_home";
        }
        if (this instanceof C169148kR) {
            return "home";
        }
        if (this instanceof C169138kQ) {
            return "imprecise_location_tile";
        }
        if (this instanceof C169168kT) {
            return "business_info";
        }
        if (this instanceof C169128kP) {
            return "categories";
        }
        if (this instanceof C169198kW) {
            return "query";
        }
        if (this instanceof C169188kV) {
            return "recommendations";
        }
        if (this instanceof C169208kX) {
            return "businesses";
        }
        if (this instanceof C169158kS) {
            return "cached_data";
        }
        return "query";
    }

    public Map A0B() {
        HashMap hashMap;
        JSONObject jSONObject;
        HashMap A11;
        Object A0I;
        String str;
        String str2;
        HashMap A112;
        String str3;
        String A0I2;
        String str4;
        String str5;
        Object obj;
        String str6;
        Double d;
        Double d2;
        Object obj2;
        String str7;
        String str8;
        String str9;
        Double d3;
        Double d4;
        if (this instanceof C169178kU) {
            C169178kU r2 = (C169178kU) this;
            A11 = C17880vN.A11();
            A11.put("module_config_ver", r2.A02.A0I(4385));
            A11.put("flavour", "DIRECTORY");
            if (C108965cb.A08(r2.A01.A00).densityDpi <= 240) {
                str9 = "hdpi";
            } else {
                str9 = "xxhdpi";
            }
            A11.put("icon_spec", str9);
            A11.put("country_code", C197659x3.A00(r2.A03.A00));
            C20079A6f a6f = r2.A00;
            String str10 = a6f.A08;
            A11.put("location_type", str10);
            if (!str10.equals("country_default")) {
                boolean A062 = a6f.A06();
                if (A062) {
                    d3 = a6f.A03;
                } else {
                    d3 = a6f.A01;
                }
                A11.put("latitude", d3);
                if (A062) {
                    d4 = a6f.A04;
                } else {
                    d4 = a6f.A02;
                }
                A11.put("longitude", d4);
                A11.put("radius", a6f.A05);
            }
        } else {
            if (this instanceof C169148kR) {
                C169148kR r5 = (C169148kR) this;
                A112 = C17880vN.A11();
                C20079A6f a6f2 = r5.A01;
                String str11 = a6f2.A08;
                A112.put("location_type", str11);
                if (str11.equals("country_default")) {
                    obj2 = a6f2.A06;
                    C17960vV.A07(obj2);
                    str7 = "country_code";
                } else {
                    boolean A063 = a6f2.A06();
                    if (A063) {
                        d = a6f2.A03;
                    } else {
                        d = a6f2.A01;
                    }
                    A112.put("wa_biz_directory_lat", d);
                    if (A063) {
                        d2 = a6f2.A04;
                    } else {
                        d2 = a6f2.A02;
                    }
                    A112.put("wa_biz_directory_long", d2);
                    obj2 = a6f2.A05;
                    str7 = "radius";
                }
                A112.put(str7, obj2);
                C18030ve r6 = r5.A02;
                A112.put("ranking_logic_ver", r6.A0I(2878));
                ArrayList A13 = AnonymousClass000.A13();
                if (r5.A00 <= 240) {
                    str8 = "hdpi";
                } else {
                    str8 = "xxhdpi";
                }
                A112.put("screen_res", str8);
                C195269t4 r1 = new C195269t4("popular_categories");
                r1.A02(str8, "screen_res");
                r1.A02 = r6.A0I(4040);
                A13.add(r1);
                if (C18020vd.A05(C18040vf.A02, r6, 3161)) {
                    C195269t4 r12 = new C195269t4("popular_biz");
                    r12.A02 = r6.A0I(3173);
                    A13.add(r12);
                }
                str5 = "module_config";
                obj = C181489Qr.A00(A13);
            } else if (this instanceof C169138kQ) {
                C169138kQ r62 = (C169138kQ) this;
                HashMap A113 = C17880vN.A11();
                JSONObject A15 = C17880vN.A15();
                LatLng latLng = r62.A01;
                A15.put("wa_biz_directory_lat", latLng.A00);
                A15.put("wa_biz_directory_long", latLng.A01);
                A113.put("location", A15);
                A113.put("max_tiles", Integer.valueOf(r62.A00));
                return A113;
            } else {
                if (this instanceof C169168kT) {
                    C169168kT r52 = (C169168kT) this;
                    hashMap = C17880vN.A11();
                    JSONArray A1A = AnonymousClass8BR.A1A();
                    Iterator it = r52.A03.iterator();
                    while (it.hasNext()) {
                        A07(hashMap, it, A1A);
                    }
                    jSONObject = C17880vN.A15();
                    JSONArray A12 = AnonymousClass8BT.A12(A1A, "requested_fields", jSONObject);
                    Iterator it2 = r52.A02.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass8BS.A1J(it2, A12);
                    }
                    String str12 = r52.A01;
                    if (str12 != null) {
                        hashMap.put("request_query", str12);
                    }
                    String A0I3 = r52.A00.A0I(4384);
                    if (A0I3 != null) {
                        hashMap.put("experiment_ver", A0I3);
                    }
                    hashMap.put("business_ids", A12);
                } else {
                    if (this instanceof C169128kP) {
                        A11 = C17880vN.A11();
                        C172208t3.A00(((C169128kP) this).A00, A11);
                        A0I = AnonymousClass000.A0i();
                        str = "tiered_onboarding_supported";
                    } else if (this instanceof C169198kW) {
                        C169198kW r22 = (C169198kW) this;
                        A112 = C17880vN.A11();
                        C172208t3.A00(r22.A04, A112);
                        A112.put("query", r22.A06);
                        int i = r22.A01;
                        if (i == 1) {
                            str3 = "typeahead_category";
                        } else if (i != 2) {
                            str3 = null;
                        } else {
                            str3 = "typeahead_business";
                        }
                        A112.put("search_type", str3);
                        boolean z = r22.A0B;
                        A112.put("business_load_all", Boolean.valueOf(z));
                        A112.put("search_by_business_enabled", Boolean.valueOf(r22.A0A));
                        C18030ve r4 = r22.A05;
                        if (z) {
                            A0I2 = r4.A0I(1413);
                            str4 = "ranking_logic_ver";
                        } else {
                            A0I2 = r4.A0I(3440);
                            str4 = "typeahead_experiment_ver";
                        }
                        A112.put(str4, A0I2);
                        A112.put("tiered_onboarding_supported", AnonymousClass000.A0i());
                        A05(r22.A02, A112);
                        if (C18020vd.A05(C18040vf.A02, r4, 3250)) {
                            if (r22.A00 <= 240) {
                                str6 = "hdpi";
                            } else {
                                str6 = "xxhdpi";
                            }
                            A112.put("category_icons_resolution", str6);
                        }
                        C190499l3 r0 = r22.A03;
                        if (r0 != null) {
                            A112.put("filters", r0.A00());
                        }
                        String str13 = r22.A09;
                        if (str13 != null) {
                            A112.put("search_session_id", str13);
                        }
                        A112.put("query_id", r22.A07);
                        str5 = "search_id";
                        obj = r22.A08;
                    } else if (this instanceof C169188kV) {
                        C169188kV r42 = (C169188kV) this;
                        A11 = C17880vN.A11();
                        A11.put("business_jid", r42.A04.getRawString());
                        C18030ve r23 = r42.A03;
                        if (C18020vd.A05(C18040vf.A02, r23, 3400)) {
                            A11.put("ranking_logic_ver", r23.A0I(3399));
                            C20079A6f a6f3 = r42.A02;
                            if (a6f3 != null) {
                                C172208t3.A00(a6f3, A11);
                            }
                            C190499l3 r02 = r42.A01;
                            if (r02 != null) {
                                A11.put("filters", r02.A00());
                            }
                            A05(r42.A00, A11);
                            return A11;
                        }
                    } else if (this instanceof C169208kX) {
                        C169208kX r24 = (C169208kX) this;
                        A11 = C17880vN.A11();
                        C172208t3.A00(r24.A05, A11);
                        AEQ aeq = r24.A06;
                        if (aeq != null) {
                            A11.put("category_id", aeq.A00);
                        }
                        A11.put("businesses_list_inclusion_level", r24.A00);
                        A11.put("subcategories_list_inclusion_level", r24.A01);
                        String str14 = r24.A08;
                        if (str14 != null) {
                            A11.put("browse_use_case", str14);
                            if ("map_view_serp".equals(str14)) {
                                A11.put("map_view_config_version", r24.A07.A0I(4461));
                            }
                        }
                        A11.put("ranking_formula_ver", "linear_weights_v1");
                        A11.put("ranking_logic_ver", r24.A07.A0I(1412));
                        A11.put("tiered_onboarding_supported", AnonymousClass000.A0i());
                        if (r24.A02 <= 240) {
                            str2 = "hdpi";
                        } else {
                            str2 = "xxhdpi";
                        }
                        A11.put("category_icons_resolution", str2);
                        C190499l3 r03 = r24.A04;
                        if (r03 != null) {
                            A11.put("filters", r03.A00());
                        }
                        A05(r24.A03, A11);
                        A0I = r24.A09;
                        if (A0I != null) {
                            str = "search_session_id";
                        }
                    } else if (this instanceof C169158kS) {
                        C169158kS r63 = (C169158kS) this;
                        hashMap = C17880vN.A11();
                        JSONArray A1A2 = AnonymousClass8BR.A1A();
                        Iterator it3 = r63.A03.iterator();
                        while (it3.hasNext()) {
                            A07(hashMap, it3, A1A2);
                        }
                        jSONObject = C17880vN.A15();
                        jSONObject.put("requested_fields", A1A2);
                        hashMap.put("request_id", r63.A01);
                        String str15 = r63.A02;
                        if (str15 != null) {
                            if (C18020vd.A05(C18040vf.A02, r63.A00, 3225)) {
                                hashMap.put("request_query", str15);
                            }
                        }
                        String A0I4 = r63.A00.A0I(3226);
                        C18070vi.A0b(A0I4);
                        hashMap.put("experiment_ver", A0I4);
                    } else {
                        C173718vc r25 = (C173718vc) this;
                        A11 = C17880vN.A11();
                        A11.put("query", r25.A01);
                        C192069nk r04 = new C192069nk();
                        r04.A01();
                        A11.put("fields_config", r04.A00());
                        A0I = r25.A00.A0I(2969);
                        str = "ranking_logic_ver";
                    }
                    A11.put(str, A0I);
                    return A11;
                }
                hashMap.put("fields_config", jSONObject);
                return hashMap;
            }
            A112.put(str5, obj);
            return A112;
        }
        return A11;
    }

    public JSONObject A0C() {
        JSONObject jSONObject;
        if (this instanceof C172198t2) {
            C172198t2 r2 = (C172198t2) this;
            jSONObject = C17880vN.A15();
            String A002 = C197659x3.A00(r2.A01.A00);
            String A0H = C18070vi.A0H(new Locale(r2.A00.A05(), A002));
            if ("in_ID".equalsIgnoreCase(A0H) || "in_IN".equalsIgnoreCase(A0H)) {
                A0H = "id_ID";
            } else if ("en".equalsIgnoreCase(A0H)) {
                A0H = "en_US";
            } else if ("iw_IL".equalsIgnoreCase(A0H)) {
                A0H = "he_IL";
            } else if ("ES".equalsIgnoreCase(A0H)) {
                A0H = "es_ES";
            }
            jSONObject.put("locale", A0H);
            jSONObject.put("country_code", A002);
            if (!TextUtils.isEmpty(r2.A01)) {
                jSONObject.put("credential", r2.A01);
            }
            jSONObject.put("version", "1.0");
            Iterator A15 = AnonymousClass000.A15(r2.A0B());
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                jSONObject.put(C17880vN.A0x(A16), A16.getValue());
            }
        } else {
            C172208t3 r22 = (C172208t3) this;
            jSONObject = C17880vN.A15();
            jSONObject.put("locale", r22.A03.A0N().toString());
            jSONObject.put("version", r22.A00);
            if (!TextUtils.isEmpty(r22.A01)) {
                jSONObject.put("credential", r22.A01);
            }
            Iterator A152 = AnonymousClass000.A15(r22.A0B());
            while (A152.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A152);
                jSONObject.put(C17880vN.A0x(A162), A162.getValue());
            }
        }
        return jSONObject;
    }

    public void A0E() {
        C19989A2b a2b = this.A05;
        if (a2b != null) {
            Integer num = a2b.A00;
            if (num != null) {
                int intValue = num.intValue();
                AnonymousClass19T r3 = a2b.A03;
                int i = a2b.A02;
                String str = a2b.A01;
                if (str != null) {
                    r3.markerPoint(i, intValue, C17890vO.A0Z("graphapi_request_start", AnonymousClass000.A11(str), '_'));
                }
            } else {
                AnonymousClass19T r32 = a2b.A03;
                int i2 = a2b.A02;
                String str2 = a2b.A01;
                if (str2 != null) {
                    r32.markerPoint(i2, C17890vO.A0Z("graphapi_request_start", AnonymousClass000.A11(str2), '_'));
                }
            }
            C18070vi.A11("endpointName");
            throw null;
        }
        this.A08.BLo(this, (C55882gW) null, this.A00);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.9NT, java.lang.Object] */
    public void A0F(C186749eh r8, C198089xl r9) {
        JSONObject optJSONObject;
        Integer num;
        Integer num2;
        String str;
        String str2;
        int i = r9.A01;
        if (i == -1 || i == 3) {
            r8.A00 = i;
            r8.A01 = new C190599lD(Integer.valueOf(i), (String) null, r9.A00);
        } else if (i / 100 == 2) {
            JSONObject jSONObject = r9.A02;
            if (jSONObject != null) {
                r8.A03 = A09(jSONObject);
                r8.A00 = 0;
                return;
            }
            this.A02.A0G("GraphApiACSNetworkRequest/parseNetworkResponse: cannot parse empty response from server", "", true);
            r8.A01 = new C190599lD(Integer.valueOf(i), (String) null, 4);
            r8.A00 = 1;
        } else if (i == 410) {
            r8.A01 = new C190599lD(Integer.valueOf(i), (String) null, 5);
            r8.A00 = 4;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GraphApiACSNetworkRequest/parseNetworkResponse Request has failed with code ");
            A10.append(i);
            C17890vO.A19(A10, "");
            r8.A00 = 2;
            r8.A01 = new C190599lD(Integer.valueOf(i), (String) null, 9);
            ? obj = new Object();
            obj.A00 = i;
            JSONObject jSONObject2 = r9.A02;
            if (!(jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("error")) == null)) {
                if (optJSONObject.has("code")) {
                    num = AnonymousClass8BT.A0k("code", optJSONObject);
                } else {
                    num = null;
                }
                obj.A01 = num;
                if (optJSONObject.has("error_subcode")) {
                    num2 = AnonymousClass8BT.A0k("error_subcode", optJSONObject);
                } else {
                    num2 = null;
                }
                obj.A02 = num2;
                if (optJSONObject.has("message")) {
                    str = optJSONObject.optString("message");
                } else {
                    str = null;
                }
                obj.A04 = str;
                if (optJSONObject.has("fbtrace_id")) {
                    str2 = optJSONObject.optString("fbtrace_id");
                } else {
                    str2 = null;
                }
                obj.A03 = str2;
            }
            r8.A02 = obj;
        }
    }

    public void A0G(String str) {
        if (!(this instanceof C172198t2)) {
            C172208t3 r0 = (C172208t3) this;
            r0.A02.Bib((Integer) null, (Integer) null, (Integer) null, r0.A0A(), str, (String) null);
        }
    }

    public boolean A0H() {
        return C108945cZ.A1T(this.A06);
    }

    public void C8m(int i) {
        String str;
        if (!C108945cZ.A1T(this.A06)) {
            C22508BAp bAp = this.A03;
            if (bAp != null) {
                if (i == 4) {
                    bAp.BtA(new C190599lD((Integer) null, (String) null, 0), -1);
                } else {
                    A04();
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (!(this instanceof C172198t2)) {
                ((C172208t3) this).A02.Bi1(valueOf, (Integer) null);
            } else if (valueOf != null && valueOf.intValue() != 4) {
                AnonymousClass190 r3 = this.A02;
                JSONObject A15 = C17880vN.A15();
                try {
                    A15.put("error_code", valueOf);
                } catch (JSONException e) {
                    e.getMessage();
                } catch (Throwable unused) {
                    str = A15.toString();
                }
                str = A15.toString();
                r3.A0G("BusinessApiSearchNetworkRequest/onAcsError", str, false);
            }
        }
    }

    public void C8n(String str) {
        if (!C108945cZ.A1T(this.A06)) {
            this.A01 = str;
            A04();
        }
    }

    public void C8o(int i) {
        if (!C108945cZ.A1T(this.A06)) {
            if (this.A03 != null) {
                A04();
            }
            Integer valueOf = Integer.valueOf(i);
            if (!(this instanceof C172198t2)) {
                ((C172208t3) this).A02.Bi1((Integer) null, valueOf);
            }
        }
    }

    public C20462ALz(AnonymousClass190 r2, C22416B6y b6y, C22508BAp bAp, C191659mx r5, C19989A2b a2b, AnonymousClass10I r7, String str) {
        this.A02 = r2;
        this.A07 = r7;
        this.A04 = r5;
        this.A08 = b6y;
        this.A03 = bAp;
        this.A00 = str;
        this.A05 = a2b;
        if (a2b != null) {
            a2b.A01 = A0A();
        }
    }

    public static int A03(String str, AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        AF0 A012 = AF0.A01(jSONArray.getJSONObject(i));
        A012.A03 = str;
        abstractCollection.add(A012);
        return i + 1;
    }

    public static void A07(AbstractMap abstractMap, Iterator it, JSONArray jSONArray) {
        String str;
        AnonymousClass9M4 r2 = (AnonymousClass9M4) it.next();
        boolean z = r2 instanceof C169118kO;
        if (z) {
            str = "product_images";
        } else if (r2 instanceof C169098kM) {
            str = "description";
        } else if (r2 instanceof C169108kN) {
            str = "post_images";
        } else {
            str = "full_details";
        }
        jSONArray.put(str);
        if (z) {
            C169118kO r22 = (C169118kO) r2;
            abstractMap.put("product_image_width", Integer.valueOf(r22.A01));
            abstractMap.put("product_image_height", Integer.valueOf(r22.A00));
        }
    }
}
