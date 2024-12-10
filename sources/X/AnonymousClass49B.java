package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.49B  reason: invalid class name */
public final class AnonymousClass49B extends A34 {
    public final C84834La A00;
    public final AnonymousClass1BI A01;
    public final AnonymousClass4aW A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass4aW r2 = this.A02;
        return r2.A0B(r2.A0E((Context) this.A03.get(), this.A01));
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C75413hS.A00((Drawable) obj, this.A00.A00);
    }

    public AnonymousClass49B(Context context, C84834La r3, AnonymousClass1BI r4, AnonymousClass4aW r5) {
        this.A03 = AnonymousClass3MW.A0z(context);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }
}
