package X;

import java.io.File;

/* renamed from: X.7l9  reason: invalid class name and case insensitive filesystem */
public final class C150727l9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass7H2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150727l9(AnonymousClass7H2 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        File file = this.this$0.A02;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }
}
