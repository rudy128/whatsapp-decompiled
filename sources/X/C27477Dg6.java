package X;

import android.graphics.Rect;
import java.lang.reflect.Method;

/* renamed from: X.Dg6  reason: case insensitive filesystem */
public final class C27477Dg6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CW5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27477Dg6(CW5 cw5) {
        super(0);
        this.this$0 = cw5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class A0V = BE7.A0V(this.this$0.A02, "androidx.window.extensions.layout.FoldingFeature");
        boolean z = false;
        Method method = A0V.getMethod("getBounds", new Class[0]);
        Method method2 = A0V.getMethod("getType", new Class[0]);
        Method method3 = A0V.getMethod("getState", new Class[0]);
        C18070vi.A0X(method);
        if (method.getReturnType().equals(AnonymousClass20W.A00(AnonymousClass3MW.A15(Rect.class))) && BE7.A1Y(method)) {
            C18070vi.A0X(method2);
            Class cls = Integer.TYPE;
            if (method2.getReturnType().equals(AnonymousClass20W.A00(AnonymousClass3MW.A15(cls))) && BE7.A1Y(method2)) {
                C18070vi.A0X(method3);
                if (method3.getReturnType().equals(AnonymousClass20W.A00(AnonymousClass3MW.A15(cls))) && BE7.A1Y(method3)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
