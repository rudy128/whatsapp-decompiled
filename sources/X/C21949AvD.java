package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.AvD  reason: case insensitive filesystem */
public final class C21949AvD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AMY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21949AvD(AMY amy) {
        super(0);
        this.this$0 = amy;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            File file = this.this$0.A05.A08().A0P;
            C218617r.A07(file, false);
            return file.getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
