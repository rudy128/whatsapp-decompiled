package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.Aye  reason: case insensitive filesystem */
public final class C22162Aye extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C169498lk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22162Aye(C169498lk r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C18070vi.A0d(bitmap, 0);
        C169498lk r1 = this.this$0;
        List list = C42011xT.A0I;
        ((ImageView) r1.A01.getValue()).setImageBitmap(bitmap);
        return C27621Wu.A00;
    }
}
