package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Nn  reason: invalid class name and case insensitive filesystem */
public final class C180689Nn {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public String toString() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("shard-key", this.A03);
            A15.put("entry-key", this.A02);
            A15.put("expiration-time", this.A01);
            A15.put("create-time", this.A00);
        } catch (JSONException unused) {
            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/toJson threw exception");
        }
        return C18070vi.A0H(A15);
    }
}
