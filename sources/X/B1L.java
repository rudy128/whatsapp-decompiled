package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

public final class B1L extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BaseMexCallback $debugCallback;
    public final /* synthetic */ int $params;
    public final /* synthetic */ C186759ei this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1L(C186759ei r2, BaseMexCallback baseMexCallback, int i) {
        super(1);
        this.this$0 = r2;
        this.$params = i;
        this.$debugCallback = baseMexCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C17900vP.A0X(a6z, "GetParticipatingGroupsMexHelper/sendGetParticipatingGroupsViaMex/onError: ", AnonymousClass3MZ.A19(a6z, 0));
        this.this$0.A01.A0N(this.$params);
        BaseMexCallback baseMexCallback = this.$debugCallback;
        if (baseMexCallback != null) {
            baseMexCallback.A05(a6z);
        }
        return false;
    }
}
