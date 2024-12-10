package X;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0m4  reason: invalid class name and case insensitive filesystem */
public final class C12630m4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12630m4(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public final void A02(C18090vk r3) {
        Looper looper;
        Handler handler = this.this$0.getHandler();
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (looper == Looper.myLooper()) {
            r3.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new AnonymousClass0Z5(r3));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A02((C18090vk) obj);
        return C27621Wu.A00;
    }

    public static final void A00(C18090vk r0) {
        r0.invoke();
    }
}
