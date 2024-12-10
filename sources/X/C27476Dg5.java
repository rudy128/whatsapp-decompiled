package X;

import androidx.window.extensions.core.util.function.Function;
import java.lang.reflect.Method;

/* renamed from: X.Dg5  reason: case insensitive filesystem */
public final class C27476Dg5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CYm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27476Dg5(CYm cYm) {
        super(0);
        this.this$0 = cYm;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = true;
        Method method = BE7.A0V(this.this$0.A02, "androidx.window.extensions.embedding.ActivityEmbeddingComponent").getMethod("setSplitAttributesCalculator", new Class[]{Function.class});
        Method method2 = BE7.A0V(this.this$0.A02, "androidx.window.extensions.embedding.ActivityEmbeddingComponent").getMethod("clearSplitAttributesCalculator", new Class[0]);
        if (!BE9.A1V(method) || !BE9.A1V(method2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
