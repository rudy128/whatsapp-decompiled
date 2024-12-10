package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.ATs  reason: case insensitive filesystem */
public final class C20660ATs implements B86 {
    public final B86 A00;
    public final AnonymousClass00H A01;

    public C20660ATs(B86 b86, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = b86;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object BFs(JSONObject jSONObject, long j) {
        String str;
        JSONObject optJSONObject;
        C193429q5 r7;
        boolean z;
        if (j != 9044289622249992L) {
            str = "xwa_product_catalog_get_product_catalog";
        } else {
            str = "xfb_whatsapp_catalog";
        }
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("product_catalog")) == null || !A3Q.A01("products", optJSONObject, C17880vN.A1Y(), 0)) {
                return new C186489eH((AN5) null, C179409Hv.UNKNOWN, (String) null, false);
            }
            C179409Hv A002 = AnonymousClass9PK.A00(optJSONObject.optString("catalog_type"));
            JSONArray optJSONArray = optJSONObject.optJSONArray("products");
            if (optJSONArray == null) {
                return new C186489eH((AN5) null, C179409Hv.UNKNOWN, (String) null, false);
            }
            ArrayList A13 = AnonymousClass000.A13();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null) {
                    AnonymousClass8BW.A1A(this.A00, A13, optJSONObject3, j);
                }
            }
            boolean z2 = false;
            if (!A3Q.A01("paging", optJSONObject, new String[1], 0)) {
                r7 = new C193429q5(false, (String) null);
            } else {
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("paging");
                if (optJSONObject4 != null) {
                    String A003 = A3Q.A00("after", optJSONObject4);
                    if (A003 == null || A003.length() == 0) {
                        z2 = true;
                    }
                    r7 = new C193429q5(true ^ z2, A003);
                } else {
                    throw C17880vN.A0g();
                }
            }
            if (9044289622249992L == j) {
                z = optJSONObject.optBoolean("cart_enabled");
            } else {
                z = "CARTENABLED_TRUE".equals(optJSONObject.optString("cart_enabled"));
            }
            optJSONObject.optString("catalog_id");
            String optString = optJSONObject.optString("catalog_name");
            optJSONObject.optBoolean("waba_has_frozen_native_catalog");
            AN5 an5 = new AN5(r7, A13);
            optJSONObject.optString("waba_id");
            an5.A00 = A002;
            ((C189909k3) this.A01.get()).A00(an5, optJSONObject);
            return new C186489eH(an5, A002, optString, z);
        } catch (Exception e) {
            Log.e("GetProductCatalogGraphQLResponseConverter/convert/Could not create GetProductCatalogPageResult from GetProductCatalog GraphQL response", e);
            return new C186489eH((AN5) null, C179409Hv.UNKNOWN, (String) null, false);
        }
    }
}
