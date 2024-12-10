package X;

import android.graphics.Typeface;
import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.6Hs  reason: invalid class name and case insensitive filesystem */
public final class C121096Hs extends C112905mE {
    public final Typeface A00;
    public final View A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121096Hs(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        View view2 = this.A0H;
        this.A02 = AnonymousClass3Ma.A0N(view2, 2131436208);
        this.A01 = C18070vi.A05(view2, 2131427972);
        Typeface createFromAsset = Typeface.createFromAsset(view.getResources().getAssets(), "fonts/Roboto-Medium.ttf");
        C18070vi.A0X(createFromAsset);
        this.A00 = createFromAsset;
    }
}
