package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.Ayf  reason: case insensitive filesystem */
public final class C22163Ayf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C169458lg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22163Ayf(C169458lg r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C18070vi.A0d(bitmap, 0);
        C169458lg r1 = this.this$0;
        List list = C42011xT.A0I;
        ((ImageView) r1.A01.getValue()).setImageBitmap(bitmap);
        return C27621Wu.A00;
    }
}
