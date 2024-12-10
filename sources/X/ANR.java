package X;

import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.util.List;

public final /* synthetic */ class ANR implements B7F {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ List A02;

    public final void Bli(C20467AMe aMe) {
        AnonymousClass1FU r7 = this.A01;
        List list = this.A02;
        int i = this.A00;
        Resources resources = r7.getResources();
        int size = list.size();
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, i + 1);
        C17880vN.A1T(A1b, list.size(), 1);
        String quantityString = resources.getQuantityString(2131755042, size, A1b);
        if (C23451Gc.A02) {
            r7.CRG(quantityString);
        } else {
            r7.A44(quantityString);
        }
        Log.i("product-details/send-product/async load begin");
    }

    public /* synthetic */ ANR(AnonymousClass1FU r1, List list, int i) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = i;
    }
}
