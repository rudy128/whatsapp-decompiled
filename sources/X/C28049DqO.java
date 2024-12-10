package X;

import java.util.UUID;

/* renamed from: X.DqO  reason: case insensitive filesystem */
public final class C28049DqO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C24374C0r $state;
    public final /* synthetic */ UUID $txLinkId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28049DqO(C24374C0r c0r, UUID uuid) {
        super(1);
        this.$txLinkId = uuid;
        this.$state = c0r;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BTY bty = (BTY) obj;
        C18070vi.A0d(bty, 0);
        bty.A06 = this.$txLinkId;
        bty.A04 = this.$state;
        return C27621Wu.A00;
    }
}
