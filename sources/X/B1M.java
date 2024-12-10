package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

public final class B1M extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BaseMexCallback $debugCallback = null;
    public final /* synthetic */ int $params;
    public final /* synthetic */ C186759ei this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1M(C186759ei r2, int i) {
        super(1);
        this.this$0 = r2;
        this.$params = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C186759ei r3 = this.this$0;
        int i = this.$params;
        BaseMexCallback baseMexCallback = this.$debugCallback;
        A0S.A00 = new B1K(r3, baseMexCallback, i);
        A0S.A01 = new B1L(r3, baseMexCallback, i);
        return C27621Wu.A00;
    }
}
