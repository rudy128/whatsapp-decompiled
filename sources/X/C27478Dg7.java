package X;

import android.app.Activity;
import java.lang.reflect.Method;

/* renamed from: X.Dg7  reason: case insensitive filesystem */
public final class C27478Dg7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CW5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27478Dg7(CW5 cw5) {
        super(0);
        this.this$0 = cw5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class cls;
        try {
            cls = BE7.A0V(this.this$0.A01.A00, "java.util.function.Consumer");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        boolean z = false;
        if (cls != null) {
            Class A0V = BE7.A0V(this.this$0.A02, "androidx.window.extensions.layout.WindowLayoutComponent");
            Class[] clsArr = new Class[2];
            int A1X = BE7.A1X(Activity.class, cls, clsArr);
            Method method = A0V.getMethod("addWindowLayoutInfoListener", clsArr);
            Class[] clsArr2 = new Class[A1X];
            clsArr2[0] = cls;
            Method method2 = A0V.getMethod("removeWindowLayoutInfoListener", clsArr2);
            if (BE9.A1V(method) && BE9.A1V(method2)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
