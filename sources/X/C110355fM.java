package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.5fM  reason: invalid class name and case insensitive filesystem */
public class C110355fM extends FrameLayout {
    public C32151gj A00;
    public final AnonymousClass6F5 A01;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.5fc, X.6F5, android.view.View, X.6F9] */
    public C110355fM(Context context, C32151gj r7) {
        super(context);
        this.A00 = r7;
        AnonymousClass3MZ.A0D(this).inflate(2131626780, this, true);
        View A06 = AnonymousClass1HF.A06(this, 2131434876);
        ViewGroup A0C = AnonymousClass3MW.A0C(this, 2131429100);
        AnonymousClass3MW.A0J(this, 2131436208).setText(2131887028);
        ? r2 = new AnonymousClass6F9(context);
        r2.A03();
        AnonymousClass3Ma.A18(r2, -1, -2);
        this.A01 = r2;
        A0C.addView(r2);
        AnonymousClass3MX.A1A(getContext(), A06, AnonymousClass1YL.A00(getContext(), 2130969148, 2131100157));
    }
}
