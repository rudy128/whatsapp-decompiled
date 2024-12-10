package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.4nJ  reason: invalid class name and case insensitive filesystem */
public final class C96104nJ implements C1606889n {
    public final ImageView A00;
    public final AnonymousClass7HZ A01;

    public /* synthetic */ void BCw() {
    }

    public void C7F(Bitmap bitmap, boolean z) {
        C18070vi.A0d(bitmap, 0);
        ImageView imageView = this.A00;
        if (C18070vi.A18(imageView.getTag(), this.A01)) {
            imageView.setTag((Object) null);
            imageView.setImageBitmap(bitmap);
        }
    }

    public void Bti() {
        this.A00.setImageResource(2131232110);
    }

    public C96104nJ(ImageView imageView, AnonymousClass7HZ r2) {
        this.A00 = imageView;
        this.A01 = r2;
        imageView.setTag(r2);
    }
}
