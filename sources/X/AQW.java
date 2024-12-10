package X;

import android.util.JsonWriter;
import java.util.AbstractMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AQW implements C22541BBy {
    public final boolean A00;

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
        boolean z = this.A00;
        if (!(obj instanceof AQW) || z != ((AQW) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        return String.valueOf(this.A00);
    }

    public /* synthetic */ AQW(boolean z) {
        this.A00 = z;
    }

    public static void A00(AnonymousClass1NP r2, AbstractMap abstractMap) {
        abstractMap.put("backupFrequency", new AQU(Integer.valueOf(r2.A03())));
        abstractMap.put("backupNetworkSettings", new AQU(Integer.valueOf(r2.A04())));
        abstractMap.put("includeVideosInBackup", new AQW(r2.A0P()));
    }
}
