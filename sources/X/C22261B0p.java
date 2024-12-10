package X;

import java.util.List;
import org.json.JSONArray;

/* renamed from: X.B0p  reason: case insensitive filesystem */
public final class C22261B0p extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $cartItems;
    public final /* synthetic */ AnonymousClass9XU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22261B0p(AnonymousClass9XU r2, List list) {
        super(1);
        this.$cartItems = list;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        C22260B0o b0o = new C22260B0o(this.this$0, this.$cartItems);
        JSONArray jSONArray = new JSONArray();
        b0o.invoke(jSONArray);
        A0a.A01("cart", jSONArray);
        return C27621Wu.A00;
    }
}
