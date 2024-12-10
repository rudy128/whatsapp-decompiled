package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.WaImageView;

/* renamed from: X.6Li  reason: invalid class name and case insensitive filesystem */
public final class C121746Li extends A34 {
    public final int A00 = 2131233686;
    public final Context A01;
    public final C126736dD A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Context context = this.A01;
        Drawable A08 = AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, this.A00), AnonymousClass3Ma.A00(context, 2130971740, 2131102873));
        C18070vi.A0X(A08);
        return A08;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Drawable drawable = (Drawable) obj;
        WaImageView waImageView = this.A02.A00.A0T;
        if (waImageView != null) {
            waImageView.setImageDrawable(drawable);
        }
    }

    public C121746Li(Context context, C126736dD r5) {
        super((AnonymousClass1F9) context, true);
        this.A01 = context;
        this.A02 = r5;
    }
}
