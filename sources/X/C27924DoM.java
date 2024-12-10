package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.DoM  reason: case insensitive filesystem */
public final class C27924DoM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BJD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27924DoM(BJD bjd) {
        super(1);
        this.this$0 = bjd;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Looper looper;
        C18090vk r4 = (C18090vk) obj;
        Handler handler = this.this$0.getHandler();
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (looper == Looper.myLooper()) {
            r4.invoke();
        } else {
            Handler handler2 = this.this$0.getHandler();
            if (handler2 != null) {
                handler2.post(new C21466AkX(r4, 1));
            }
        }
        return C27621Wu.A00;
    }
}
