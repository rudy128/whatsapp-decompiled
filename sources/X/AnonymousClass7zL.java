package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;

/* renamed from: X.7zL  reason: invalid class name */
public final class AnonymousClass7zL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsInitialLoadingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zL(FlowsInitialLoadingView flowsInitialLoadingView) {
        super(1);
        this.this$0 = flowsInitialLoadingView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C28931bI r2 = this.this$0.A08;
        if (r2 != null) {
            int i = 8;
            if (bitmap != null) {
                i = 0;
            }
            r2.A04(i);
            if (bitmap != null) {
                C28931bI r0 = this.this$0.A08;
                if (r0 != null) {
                    ((ImageView) r0.A02()).setImageBitmap(bitmap);
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("businessLogoViewStubHolder");
        throw null;
    }
}
