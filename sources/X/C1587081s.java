package X;

import org.json.JSONObject;

/* renamed from: X.81s  reason: invalid class name and case insensitive filesystem */
public final class C1587081s extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ JSONObject $json;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1587081s(JSONObject jSONObject) {
        super(1);
        this.$json = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        return AnonymousClass1D6.A01(str, Long.valueOf(this.$json.optLong(str, 0)));
    }
}
