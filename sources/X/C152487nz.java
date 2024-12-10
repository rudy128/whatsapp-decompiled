package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.7nz  reason: invalid class name and case insensitive filesystem */
public final class C152487nz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C127556eY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152487nz(C127556eY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        File A0e = C17880vN.A0e(C108945cZ.A16(this.this$0.A00), "newsletter_image_cache");
        if (!A0e.mkdirs() && !A0e.isDirectory()) {
            Log.w("NewsletterBitmapCache Unable to create newsletter cache dir");
        }
        return new A5O(A0e, 1048576);
    }
}
