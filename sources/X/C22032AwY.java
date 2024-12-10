package X;

import java.util.UUID;

/* renamed from: X.AwY  reason: case insensitive filesystem */
public final class C22032AwY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C22821Di $failure;
    public final /* synthetic */ UUID $serviceUUID;
    public final /* synthetic */ C24337BzY $transportType;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22032AwY(Cw1 cw1, C24337BzY bzY, UUID uuid, C22821Di r5) {
        super(0);
        this.this$0 = cw1;
        this.$serviceUUID = uuid;
        this.$transportType = bzY;
        this.$failure = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26294Cx6.A06("lam:LinkedAppManager", "Link switch failed, attempting to establish BTC link.");
        Cw1 cw1 = this.this$0;
        UUID uuid = this.$serviceUUID;
        C24337BzY bzY = this.$transportType;
        C22821Di r2 = this.$failure;
        Cw1.A03(cw1, bzY, uuid, new C22093AxX(r2), new C22324B3b(cw1, uuid, r2));
        return C27621Wu.A00;
    }
}
