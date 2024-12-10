package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.DgK  reason: case insensitive filesystem */
public final class C27491DgK extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BUF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27491DgK(BUF buf) {
        super(0);
        this.this$0 = buf;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WeakReference A0z = AnonymousClass3MW.A0z(this.this$0);
        Context applicationContext = this.this$0.A03.getApplicationContext();
        C18070vi.A0X(applicationContext);
        return new BH6(applicationContext, A0z);
    }
}
