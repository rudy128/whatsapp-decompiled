package X;

import java.lang.reflect.Method;

/* renamed from: X.Dg9  reason: case insensitive filesystem */
public final class C27480Dg9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CW5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27480Dg9(CW5 cw5) {
        super(0);
        this.this$0 = cw5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = BE7.A0V(this.this$0.A00.A00, "androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", new Class[0]);
        Class A0V = BE7.A0V(this.this$0.A02, "androidx.window.extensions.layout.WindowLayoutComponent");
        if (BE9.A1V(method) && method.getReturnType().equals(A0V)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
