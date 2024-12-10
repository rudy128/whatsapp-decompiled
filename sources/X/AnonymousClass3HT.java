package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3HT  reason: invalid class name */
public final class AnonymousClass3HT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass34T this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HT(AnonymousClass34T r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass10I r2 = this.this$0.A00;
        return new C49302Py((AnonymousClass10J) r2, new ArrayBlockingQueue(2), new AnonymousClass10O(1, "happy-eyeball-v2"), TimeUnit.SECONDS, 2, 2, 30, false);
    }
}
