package X;

import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Nl  reason: invalid class name and case insensitive filesystem */
public class C180669Nl {
    public String A00;
    public AnonymousClass9Nz A01;

    public String A00(JSONObject jSONObject) {
        try {
            String str = this.A00;
            if (str == null || str.isEmpty()) {
                return null;
            }
            Matcher A0z = AnonymousClass8BU.A0z(str, "\\[([^\\]]*)\\]");
            StringBuffer stringBuffer = new StringBuffer(1000);
            while (A0z.find()) {
                String group = A0z.group();
                A0z.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
            }
            A0z.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
