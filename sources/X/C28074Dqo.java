package X;

import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.Dqo  reason: case insensitive filesystem */
public final class C28074Dqo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UUID $id;
    public final /* synthetic */ C24496C6o $linkToSwitchTo;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28074Dqo(C24496C6o c6o, C26256Cw0 cw0, UUID uuid) {
        super(1);
        this.$id = uuid;
        this.this$0 = cw0;
        this.$linkToSwitchTo = c6o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder A19 = AnonymousClass3MZ.A19(th, 0);
        A19.append("Error occurred while switching Tx: ");
        String A0V = C17890vO.A0V(this.$id, A19);
        C18070vi.A0d(A0V, 2);
        C26294Cx6.A0D("LinkManagerImpl", A0V, th, Arrays.copyOf(new Object[0], 0));
        C26256Cw0 cw0 = this.this$0;
        C24496C6o c6o = this.$linkToSwitchTo;
        C25330Cdb.A01(AnonymousClass001.A1E(c6o, "setSessionFailure: readyLink=", AnonymousClass000.A10()), new Object[0]);
        C26256Cw0.A06(cw0, new C28076Dqq(c6o, cw0, th));
        return C27621Wu.A00;
    }
}
