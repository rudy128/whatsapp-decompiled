package X;

import java.io.IOException;

/* renamed from: X.AvC  reason: case insensitive filesystem */
public final class C21948AvC extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AMY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21948AvC(AMY amy) {
        super(0);
        this.this$0 = amy;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            return this.this$0.A05.A0J().getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
