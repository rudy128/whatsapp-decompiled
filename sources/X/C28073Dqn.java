package X;

import java.util.UUID;

/* renamed from: X.Dqn  reason: case insensitive filesystem */
public final class C28073Dqn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UUID $id;
    public final /* synthetic */ C24496C6o $linkToSwitchTo;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28073Dqn(C24496C6o c6o, C26256Cw0 cw0, UUID uuid) {
        super(1);
        this.$id = uuid;
        this.this$0 = cw0;
        this.$linkToSwitchTo = c6o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Switching physical Tx: ");
        C25330Cdb.A01(C17890vO.A0V(this.$id, A10), new Object[0]);
        C26256Cw0.A03(this.$linkToSwitchTo, this.this$0);
        C26256Cw0 cw0 = this.this$0;
        C26256Cw0.A06(cw0, new C28047DqM(this.$linkToSwitchTo, cw0));
        if (this.this$0.A05.A09.compareAndSet(true, false)) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Switching physical Rx right after Tx: ");
            C25330Cdb.A00(C17890vO.A0V(this.$id, A102), new Object[0]);
            C26256Cw0 cw02 = this.this$0;
            CL5 cl5 = cw02.A00;
            if (cl5 != null) {
                C26256Cw0.A06(cw02, new C28072Dqm(this.$linkToSwitchTo, cl5, cw02));
            } else {
                throw AnonymousClass000.A0n("Link expected not null");
            }
        }
        return C27621Wu.A00;
    }
}
