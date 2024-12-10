package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.BVg  reason: case insensitive filesystem */
public class C22918BVg extends C24473C5o implements C28514E4y {
    public final C24473C5o A00;
    public final String A01;

    public JSONObject CPJ() {
        JSONObject CPJ = ((C28514E4y) this.A00).CPJ();
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            CPJ.put("feature_name", str);
        }
        return CPJ;
    }

    public C22918BVg(C24473C5o c5o, String str) {
        this.A01 = str;
        this.A00 = c5o;
    }
}
