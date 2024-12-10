package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.7tV  reason: invalid class name and case insensitive filesystem */
public final class C155907tV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ C136716uH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155907tV(C136716uH r2, JSONObject jSONObject) {
        super(0);
        this.this$0 = r2;
        this.$response = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WebMessagePort A01 = this.this$0.A01();
        if (A01 != null) {
            A01.postMessage(new WebMessage(this.$response.toString()));
        }
        return C27621Wu.A00;
    }
}
