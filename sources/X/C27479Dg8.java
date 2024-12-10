package X;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;

/* renamed from: X.Dg8  reason: case insensitive filesystem */
public final class C27479Dg8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CW5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27479Dg8(CW5 cw5) {
        super(0);
        this.this$0 = cw5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class A0V = BE7.A0V(this.this$0.A02, "androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z = false;
        Class<Consumer> cls = Consumer.class;
        Method method = A0V.getMethod("addWindowLayoutInfoListener", new Class[]{Context.class, cls});
        Method method2 = A0V.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
        if (BE9.A1V(method) && BE9.A1V(method2)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
