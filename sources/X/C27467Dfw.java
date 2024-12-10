package X;

import java.lang.reflect.Method;

/* renamed from: X.Dfw  reason: case insensitive filesystem */
public final class C27467Dfw extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24744CIg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27467Dfw(C24744CIg cIg) {
        super(0);
        this.this$0 = cIg;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method declaredMethod = BE7.A0V(this.this$0.A00, "androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class A0V = BE7.A0V(this.this$0.A00, "androidx.window.extensions.WindowExtensions");
        C18070vi.A0X(declaredMethod);
        if (declaredMethod.getReturnType().equals(A0V) && BE7.A1Y(declaredMethod)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
