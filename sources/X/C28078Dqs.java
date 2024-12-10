package X;

import java.util.UUID;

/* renamed from: X.Dqs  reason: case insensitive filesystem */
public final class C28078Dqs extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C24374C0r $state;
    public final /* synthetic */ UUID $txLinkId;
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28078Dqs(C26193CuL cuL, C24374C0r c0r, UUID uuid) {
        super(1);
        this.this$0 = cuL;
        this.$txLinkId = uuid;
        this.$state = c0r;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26193CuL cuL = this.this$0;
        C26193CuL.A01(cuL, new C27844Dmf(cuL, this.$state, this.$txLinkId));
        return C25792Cm4.A08;
    }
}
