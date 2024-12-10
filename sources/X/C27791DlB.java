package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DlB  reason: case insensitive filesystem */
public final class C27791DlB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25611Cir this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27791DlB(C25611Cir cir) {
        super(0);
        this.this$0 = cir;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new AtomicLong(C25611Cir.A00(this.this$0).getLong("unlinked_banner_last_seen_time_ms", 0));
    }
}
