package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;

/* renamed from: X.ANx  reason: case insensitive filesystem */
public class C20512ANx implements B7N {
    public final int A00;
    public final Object A01;

    public C20512ANx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bwd(long j) {
        int i;
        View view;
        C18000vb r2;
        Window window;
        if (this.A00 != 0) {
            ProductBottomSheet productBottomSheet = (ProductBottomSheet) this.A01;
            i = 0;
            Dialog dialog = productBottomSheet.A03;
            if (dialog != null && (window = dialog.getWindow()) != null && (view = window.getDecorView()) != null) {
                r2 = productBottomSheet.A07;
                if (r2 == null) {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            } else {
                return;
            }
        } else {
            C168648jP r0 = (C168648jP) this.A01;
            i = 0;
            view = r0.A0i;
            if (view != null) {
                r2 = r0.A00;
            } else {
                return;
            }
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MX.A1S(A1a, i, j);
        AnonymousClass8BS.A15(view, r2.A0K(A1a, 2131755346, j), -1);
    }
}
