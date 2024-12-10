package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.7uk  reason: invalid class name and case insensitive filesystem */
public final class C156677uk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ C1412875a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156677uk(C1412875a r2, JSONObject jSONObject) {
        super(0);
        this.this$0 = r2;
        this.$response = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WebMessagePort A00 = this.this$0.A01;
        if (A00 == null) {
            C18070vi.A11("sendPort");
            throw null;
        }
        A00.postMessage(new WebMessage(this.$response.toString()));
        return C27621Wu.A00;
    }
}
