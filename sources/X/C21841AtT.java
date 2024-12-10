package X;

import java.io.IOException;

/* renamed from: X.AtT  reason: case insensitive filesystem */
public final class C21841AtT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AMX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21841AtT(AMX amx) {
        super(0);
        this.this$0 = amx;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            return this.this$0.A00.A04().getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
