package X;

import android.content.Context;

/* renamed from: X.8o7  reason: invalid class name */
public final class AnonymousClass8o7 extends C42601yR {
    public final AnonymousClass1E7 A00;
    public final /* synthetic */ AnonymousClass8o8 A01;

    public AnonymousClass8o7(AnonymousClass1E7 r1, AnonymousClass8o8 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        boolean A03 = this.A00.A03();
        AnonymousClass8o8 r2 = this.A01;
        if (A03) {
            r2.A00 = null;
            return null;
        }
        Context context = r2.A02.A00;
        return r2.A01.A04(context, this.A00, "NewsletterPhotoLoaderTask.cancellableCall", 0.0f, context.getResources().getDimensionPixelSize(2131165474), false);
    }
}
