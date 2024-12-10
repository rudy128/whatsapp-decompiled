package X;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.Doc  reason: case insensitive filesystem */
public final class C27940Doc extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BFG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27940Doc(BFG bfg) {
        super(1);
        this.this$0 = bfg;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Closeable closeable = (Closeable) obj;
        C18070vi.A0d(closeable, 0);
        C25707Ckd.A02.A00(this.this$0);
        try {
            closeable.close();
        } catch (IOException unused) {
        }
        return C27621Wu.A00;
    }
}
