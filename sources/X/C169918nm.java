package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8nm  reason: invalid class name and case insensitive filesystem */
public abstract class C169918nm extends C196289ul {
    public static final JSONObject A01(String str) {
        if (str != null) {
            try {
                return C17880vN.A16(str);
            } catch (JSONException e) {
                C108995ce.A1M("UrlAction/getNativeFlowInfoParamJson: /", AnonymousClass000.A10(), e);
            }
        }
        return null;
    }
}
