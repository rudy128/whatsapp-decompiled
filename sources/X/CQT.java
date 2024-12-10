package X;

import org.json.JSONObject;

public class CQT {
    public final int A00;
    public final int A01;
    public final String A02;

    public CQT(JSONObject jSONObject) {
        this.A01 = jSONObject.getInt("offset");
        this.A00 = jSONObject.getInt("length");
        this.A02 = jSONObject.getString("url");
    }
}
