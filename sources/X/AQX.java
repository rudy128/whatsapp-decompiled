package X;

import android.util.JsonWriter;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AQX implements C22541BBy {
    public final Map A00;

    public void BBo(String str, JSONObject jSONObject) {
        C18070vi.A0d(str, 1);
        jSONObject.put(str, A00(this.A00));
    }

    public void BBn(JSONArray jSONArray) {
        jSONArray.put(A00(this.A00));
    }

    public void CSK(JsonWriter jsonWriter) {
        Map map = this.A00;
        jsonWriter.beginObject();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            jsonWriter.name(C17880vN.A0x(A16));
            ((C22541BBy) A16.getValue()).CSK(jsonWriter);
        }
        jsonWriter.endObject();
    }

    public boolean equals(Object obj) {
        Map map = this.A00;
        if (!(obj instanceof AQX) || !C18070vi.A18(map, ((AQX) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public /* synthetic */ AQX(Map map) {
        this.A00 = map;
    }

    public static final JSONObject A00(Map map) {
        JSONObject A15 = C17880vN.A15();
        Iterator A152 = AnonymousClass000.A15(map);
        while (A152.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A152);
            ((C22541BBy) A16.getValue()).BBo(C17880vN.A0x(A16), A15);
        }
        return A15;
    }
}
