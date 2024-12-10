package X;

import java.util.List;

/* renamed from: X.7vD  reason: invalid class name */
public final class AnonymousClass7vD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ long $clickDelayUntilMs;
    public final /* synthetic */ AnonymousClass66G this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vD(AnonymousClass66G r2, long j) {
        super(0);
        this.this$0 = r2;
        this.$clickDelayUntilMs = j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list = C42011xT.A0I;
        return Boolean.valueOf(AnonymousClass000.A1R((System.currentTimeMillis() > this.$clickDelayUntilMs ? 1 : (System.currentTimeMillis() == this.$clickDelayUntilMs ? 0 : -1))));
    }
}
