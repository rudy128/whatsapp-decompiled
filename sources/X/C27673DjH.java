package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.DjH  reason: case insensitive filesystem */
public final class C27673DjH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26993DOp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27673DjH(C26993DOp dOp) {
        super(0);
        this.this$0 = dOp;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26993DOp dOp = this.this$0;
        Matrix A0J = C108945cZ.A0J();
        A0J.setTranslate(0.0f, C26993DOp.A0B(dOp).A0E);
        Path path = new Path((Path) dOp.A0R.getValue());
        path.transform(A0J);
        path.close();
        return path;
    }
}
