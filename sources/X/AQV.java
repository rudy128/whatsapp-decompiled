package X;

import android.util.JsonWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AQV implements C22541BBy {
    public final String A00;

    public void BBo(String str, JSONObject jSONObject) {
        C18070vi.A0d(str, 1);
        jSONObject.put(str, this.A00);
    }

    public void BBn(JSONArray jSONArray) {
        jSONArray.put(this.A00);
    }

    public void CSK(JsonWriter jsonWriter) {
        jsonWriter.value(this.A00);
    }

    public boolean equals(Object obj) {
        String str = this.A00;
        if (!(obj instanceof AQV) || !C18070vi.A18(str, ((AQV) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ AQV(String str) {
        this.A00 = str;
    }

    public String toString() {
        return this.A00;
    }
}
