package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.5fL  reason: invalid class name and case insensitive filesystem */
public final class C110345fL extends FrameLayout {
    public final AnonymousClass6F3 A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.6F3, X.5fc, android.view.View, X.6F9] */
    public C110345fL(Context context) {
        super(context);
        AnonymousClass3MZ.A0D(this).inflate(2131625320, this, true);
        View A05 = C18070vi.A05(this, 2131433419);
        ? r2 = new AnonymousClass6F9(context);
        r2.A03();
        AnonymousClass3Ma.A18(r2, -1, -2);
        this.A00 = r2;
        ((ViewGroup) C18070vi.A05(this, 2131429100)).addView(r2);
        AnonymousClass3MX.A1A(getContext(), A05, AnonymousClass1YL.A00(getContext(), 2130969148, 2131100157));
    }
}
