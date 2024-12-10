package X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Cll  reason: case insensitive filesystem */
public class C25774Cll {
    public final float A00;
    public final A5W A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25774Cll cll = (C25774Cll) obj;
            if (Float.compare(cll.A00, this.A00) != 0 || !this.A01.equals(cll.A01)) {
                return false;
            }
        }
        return true;
    }

    public C25774Cll(A5W a5w, float f) {
        this.A01 = a5w;
        this.A00 = f;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        BE8.A1J(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }

    public String toString() {
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("mTargetTimeRange", this.A01.A04());
            A15.put("mSpeed", (double) this.A00);
            return A15.toString();
        } catch (JSONException e) {
            if (e.getMessage() == null) {
                return "";
            }
            return e.getMessage();
        }
    }

    public C25774Cll(JSONObject jSONObject) {
        this.A01 = A5W.A00(jSONObject.getJSONObject("mTargetTimeRange"));
        this.A00 = (float) jSONObject.getDouble("mSpeed");
    }
}
