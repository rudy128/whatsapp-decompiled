package X;

import java.util.UUID;

/* renamed from: X.Dr2  reason: case insensitive filesystem */
public final class C28088Dr2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $callback;
    public final /* synthetic */ UUID $id;
    public final /* synthetic */ int $maxAttempts;
    public final /* synthetic */ boolean $usingLinkReady;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28088Dr2(C26256Cw0 cw0, UUID uuid, C22821Di r4, int i, boolean z) {
        super(1);
        this.this$0 = cw0;
        this.$id = uuid;
        this.$maxAttempts = i;
        this.$usingLinkReady = z;
        this.$callback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        C26256Cw0.A05(this.this$0, this.$id, this.$callback, A0M, this.$maxAttempts, this.$usingLinkReady);
        return C27621Wu.A00;
    }
}
