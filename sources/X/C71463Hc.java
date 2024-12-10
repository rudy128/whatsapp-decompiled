package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Hc  reason: invalid class name and case insensitive filesystem */
public final class C71463Hc extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62582rd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71463Hc(C62582rd r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        String A0r = C17880vN.A0r(C17880vN.A0C(((C63332st) this.this$0.A05.get()).A01), "user_notices_metadata");
        if (A0r != null) {
            try {
                JSONObject A16 = C17880vN.A16(A0r);
                Iterator<String> keys = A16.keys();
                while (keys.hasNext()) {
                    String A0v = C17880vN.A0v(keys);
                    C63592tN A00 = C63592tN.A00(C17880vN.A16(A16.get(A0v).toString()));
                    if (A00 != null) {
                        if (A00.A02 != 1) {
                            C63592tN r7 = new C63592tN(A00.A01, A00.A00, A00.A03, A00.A04, 1);
                            Integer valueOf = Integer.valueOf(A0v);
                            C18070vi.A0X(valueOf);
                            A132.put(valueOf, r7);
                        } else {
                            Integer valueOf2 = Integer.valueOf(A0v);
                            C18070vi.A0X(valueOf2);
                            A132.put(valueOf2, A00);
                        }
                    }
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        A13.putAll(AnonymousClass1D7.A0F(A132));
        return A13;
    }
}
