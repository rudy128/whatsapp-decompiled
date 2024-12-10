package X;

import org.json.JSONObject;

/* renamed from: X.8tK  reason: invalid class name and case insensitive filesystem */
public final class C172378tK extends AnonymousClass161 {
    public int A00;
    public Integer A01 = AnonymousClass00R.A00;

    public void A02(JSONObject jSONObject, long j) {
        int i;
        C18070vi.A0d(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("whatsapp_galaxy_forward_flow_data_response");
        if (optJSONObject == null) {
            optJSONObject = jSONObject.optJSONObject("xwa_flows_make_flow_endpoint_request");
        }
        int optInt = optJSONObject.optInt("status_code");
        Integer valueOf = Integer.valueOf(optInt);
        Integer num = AnonymousClass00R.A01;
        if (valueOf == null || optInt != 421) {
            num = AnonymousClass00R.A0C;
            if (valueOf == null || optInt != 504) {
                num = AnonymousClass00R.A0N;
                if (valueOf == null || optInt != 200) {
                    num = AnonymousClass00R.A00;
                }
            }
        }
        this.A01 = num;
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        this.A00 = i;
        String optString = optJSONObject.optString("payload");
        if (optString == null) {
            optString = optJSONObject.optString("body");
        }
        this.A00 = optString;
    }
}
