package X;

import org.json.JSONObject;

/* renamed from: X.ATr  reason: case insensitive filesystem */
public final class C20659ATr implements B86 {
    public final B86 A00;

    public /* bridge */ /* synthetic */ Object BFs(JSONObject jSONObject, long j) {
        String str;
        JSONObject optJSONObject;
        boolean equals;
        if (9426523704041647L == j) {
            str = "xfb_whatsapp_catalog_product";
        } else {
            str = "xwa_product_catalog_get_product";
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("product_catalog")) == null) {
            return new C185559cm(C179409Hv.UNKNOWN, (C20287AEv) null, false);
        }
        if (9426523704041647L == j) {
            equals = optJSONObject.optBoolean("cart_enabled");
        } else {
            equals = "CARTENABLED_TRUE".equals(optJSONObject.optString("cart_enabled"));
        }
        C179409Hv A002 = AnonymousClass9PK.A00(optJSONObject.optString("catalog_type"));
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("product");
        if (optJSONObject3 == null) {
            return new C185559cm(A002, (C20287AEv) null, equals);
        }
        return new C185559cm(A002, (C20287AEv) this.A00.BFs(optJSONObject3, j), equals);
    }

    public C20659ATr(B86 b86) {
        this.A00 = b86;
    }
}
