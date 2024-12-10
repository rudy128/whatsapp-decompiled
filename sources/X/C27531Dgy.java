package X;

/* renamed from: X.Dgy  reason: case insensitive filesystem */
public final class C27531Dgy extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27531Dgy(BXJ bxj) {
        super(0);
        this.this$0 = bxj;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BXJ bxj = this.this$0;
        E7u e7u = bxj.A00;
        if (e7u != null) {
            e7u.stop();
            C24712CGy.A01.A02("sup:InitialStateDelegate", "[INITIAL]: Stopped device discovery manager");
            bxj.A00 = null;
        }
        C27531Dgy.super.A08();
        return C27621Wu.A00;
    }
}
