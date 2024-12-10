package X;

import java.io.File;

/* renamed from: X.7l8  reason: invalid class name and case insensitive filesystem */
public final class C150717l8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass7H2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150717l8(AnonymousClass7H2 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        File file = this.this$0.A02;
        if (file != null) {
            j = file.length();
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
