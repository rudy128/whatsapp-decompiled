package X;

import com.meta.common.monad.railway.Result;
import java.util.UUID;

/* renamed from: X.Dqp  reason: case insensitive filesystem */
public final class C28075Dqp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UUID $id;
    public final /* synthetic */ C24496C6o $linkToSwitchTo;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28075Dqp(C24496C6o c6o, C26256Cw0 cw0, UUID uuid) {
        super(1);
        this.$id = uuid;
        this.this$0 = cw0;
        this.$linkToSwitchTo = c6o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Result result = (Result) obj;
        C18070vi.A0d(result, 0);
        UUID uuid = this.$id;
        C28073Dqn dqn = new C28073Dqn(this.$linkToSwitchTo, this.this$0, uuid);
        boolean z = result.A01;
        if (z) {
            dqn.invoke(result.A00);
        }
        UUID uuid2 = this.$id;
        C28074Dqo dqo = new C28074Dqo(this.$linkToSwitchTo, this.this$0, uuid2);
        if (!z) {
            dqo.invoke(result.A00);
        }
        return C27621Wu.A00;
    }
}
