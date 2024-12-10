package X;

import android.util.JsonWriter;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AQT implements C22541BBy {
    public final List A00;

    public void BBo(String str, JSONObject jSONObject) {
        C18070vi.A0d(str, 1);
        List<C22541BBy> list = this.A00;
        JSONArray A1A = AnonymousClass8BR.A1A();
        for (C22541BBy BBn : list) {
            BBn.BBn(A1A);
        }
        jSONObject.put(str, A1A);
    }

    public void BBn(JSONArray jSONArray) {
        List<C22541BBy> list = this.A00;
        JSONArray A1A = AnonymousClass8BR.A1A();
        for (C22541BBy BBn : list) {
            BBn.BBn(A1A);
        }
        jSONArray.put(A1A);
    }

    public void CSK(JsonWriter jsonWriter) {
        List<C22541BBy> list = this.A00;
        jsonWriter.beginArray();
        for (C22541BBy CSK : list) {
            CSK.CSK(jsonWriter);
        }
        jsonWriter.endArray();
    }

    public boolean equals(Object obj) {
        List list = this.A00;
        if (!(obj instanceof AQT) || !C18070vi.A18(list, ((AQT) obj).A00)) {
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

    public /* synthetic */ AQT(List list) {
        this.A00 = list;
    }
}
