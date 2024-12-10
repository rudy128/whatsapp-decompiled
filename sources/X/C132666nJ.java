package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.6nJ  reason: invalid class name and case insensitive filesystem */
public final class C132666nJ {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final C18600wl A02;
    public final C18600wl A03;

    public final void A00(Context context, ImageView imageView, C134866rH r19, C88284Zb r20, Float f, Integer num, String str, String str2, int i, int i2, int i3) {
        ImageView imageView2 = imageView;
        C18070vi.A0d(imageView2, 1);
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        Context context2 = context;
        if (f != null) {
            layoutParams.height = (int) TypedValue.applyDimension(1, f.floatValue(), C108965cb.A08(context2));
        }
        imageView2.setLayoutParams(layoutParams);
        Resources resources = imageView2.getResources();
        C18600wl r0 = this.A03;
        r0.A0D(new C146647Qb(context2, resources, imageView2, r19, this, r20, num, str, str2, i, i2, i3), r0);
    }

    public C132666nJ(AnonymousClass00H r1, AnonymousClass00H r2, C18600wl r3, C18600wl r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
