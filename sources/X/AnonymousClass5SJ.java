package X;

import org.json.JSONObject;

/* renamed from: X.5SJ  reason: invalid class name */
public final class AnonymousClass5SJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C70503Bi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SJ(C70503Bi r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U r3 = (AnonymousClass84U) obj;
        C18070vi.A0d(r3, 0);
        r3.A01("j", this.this$0.A00.getRawString());
        Object obj2 = this.this$0.A01;
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        r3.A01("d", obj2);
        return C27621Wu.A00;
    }
}
