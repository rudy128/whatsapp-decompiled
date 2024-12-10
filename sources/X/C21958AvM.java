package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.AvM  reason: case insensitive filesystem */
public final class C21958AvM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ A0u this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21958AvM(A0u a0u) {
        super(0);
        this.this$0 = a0u;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String A0r;
        LinkedHashMap A13 = C17880vN.A13();
        AXS axs = this.this$0.A00;
        synchronized (axs) {
            A0r = C17880vN.A0r(axs.A01.A03(), "payments_upi_international_status");
        }
        if (!(A0r == null || A0r.length() == 0)) {
            JSONArray jSONArray = new JSONArray(A0r);
            Iterator it = C28851b7.A08(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((AnonymousClass20T) it).A00());
                A13.put(C18070vi.A0J("credentialId", jSONObject), new C195029sg(jSONObject.getLong("startTime"), C18070vi.A0J("credentialId", jSONObject), jSONObject.getLong("endTime"), C18070vi.A0J("internationalActivationStatus", jSONObject)));
            }
        }
        return A13;
    }
}
