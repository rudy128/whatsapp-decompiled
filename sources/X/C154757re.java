package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7re  reason: invalid class name and case insensitive filesystem */
public final class C154757re extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131006kM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154757re(C131006kM r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            String A0r = C17880vN.A0r(C17880vN.A0C(this.this$0.A0C), "locale_counts");
            if (A0r == null) {
                A0r = "{}";
            }
            JSONObject A16 = C17880vN.A16(A0r);
            Iterator<String> keys = A16.keys();
            C18070vi.A0X(keys);
            return AnonymousClass1D7.A08(AnonymousClass1D7.A0H(AnonymousClass1b2.A0C(new C1587081s(A16), AnonymousClass1JO.A01(keys))));
        } catch (JSONException e) {
            Log.e("TranscriptionDailyLoggerStorage failed to parse json", e);
            return C17880vN.A13();
        }
    }
}
