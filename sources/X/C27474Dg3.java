package X;

/* renamed from: X.Dg3  reason: case insensitive filesystem */
public final class C27474Dg3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CYm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27474Dg3(CYm cYm) {
        super(0);
        this.this$0 = cYm;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class cls;
        try {
            cls = BE7.A0V(this.this$0.A01.A00, "java.util.function.Consumer");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return false;
        }
        return Boolean.valueOf(BE9.A1V(BE7.A0V(this.this$0.A02, "androidx.window.extensions.embedding.ActivityEmbeddingComponent").getMethod("setSplitInfoCallback", new Class[]{cls})));
    }
}
