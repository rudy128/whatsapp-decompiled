package X;

import java.util.Map;

/* renamed from: X.Dq3  reason: case insensitive filesystem */
public final class C28028Dq3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ DVN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28028Dq3(DVN dvn) {
        super(1);
        this.this$0 = dvn;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        Map.Entry A0p = BE8.A0p(obj);
        DVN dvn = this.this$0;
        StringBuilder A10 = AnonymousClass000.A10();
        Object key = A0p.getKey();
        if (key == dvn) {
            valueOf = "(this Map)";
        } else {
            valueOf = String.valueOf(key);
        }
        BE8.A1E(A10, valueOf);
        Object value = A0p.getValue();
        if (value == dvn) {
            valueOf2 = "(this Map)";
        } else {
            valueOf2 = String.valueOf(value);
        }
        return AnonymousClass000.A0y(valueOf2, A10);
    }
}
