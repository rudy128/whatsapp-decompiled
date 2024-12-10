package X;

import java.util.LinkedHashMap;
import java.util.Map;

public final class B1W extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Map $initialStateMachineInput;
    public final /* synthetic */ BBM $resourceResultCallback;
    public final /* synthetic */ AnonymousClass908 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1W(BBM bbm, AnonymousClass908 r3, Map map) {
        super(1);
        this.this$0 = r3;
        this.$resourceResultCallback = bbm;
        this.$initialStateMachineInput = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        AnonymousClass908 r2 = this.this$0;
        r2.A0A.get();
        LinkedHashMap A00 = C20052A4y.A00(((C20052A4y) this.this$0.A0A.get()).A02(), this.this$0.A01);
        BBM bbm = this.$resourceResultCallback;
        String message = th.getMessage();
        if (message == null) {
            message = "extensions-data-exchange-graphql-response-error";
        }
        AnonymousClass908.A02(bbm, r2, message, th.getMessage(), A00, this.$initialStateMachineInput, false);
        return C27621Wu.A00;
    }
}
