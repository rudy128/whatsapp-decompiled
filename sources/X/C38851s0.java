package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1s0  reason: invalid class name and case insensitive filesystem */
public final class C38851s0 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C38831ry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38851s0(C38831ry r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(Looper.getMainLooper(), new C26370CyW(this.this$0, 5));
    }
}
