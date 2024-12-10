package X;

import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.8Ij  reason: invalid class name and case insensitive filesystem */
public final class C161948Ij extends C42011xT {
    public final WaTextView A00;
    public final WaTextView A01;

    public C161948Ij(View view, C22380B5j b5j) {
        super(view);
        this.A01 = AnonymousClass3Ma.A0N(view, 2131436208);
        this.A00 = AnonymousClass3Ma.A0N(view, 2131429738);
        View A06 = AnonymousClass1HF.A06(view, 2131430520);
        if (b5j != null) {
            A06.setOnClickListener(new C89964dJ(b5j, 6));
        }
    }
}
