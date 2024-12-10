package X;

import java.lang.reflect.Method;

/* renamed from: X.Dfz  reason: case insensitive filesystem */
public final class C27470Dfz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CYm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27470Dfz(CYm cYm) {
        super(0);
        this.this$0 = cYm;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = BE7.A0V(this.this$0.A00.A00, "androidx.window.extensions.WindowExtensions").getMethod("getActivityEmbeddingComponent", new Class[0]);
        Class A0V = BE7.A0V(this.this$0.A02, "androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        if (BE9.A1V(method) && method.getReturnType().equals(A0V)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
