package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;

/* renamed from: X.7N9  reason: invalid class name */
public final class AnonymousClass7N9 implements AnonymousClass3M2 {
    public final Context A00;

    public /* synthetic */ void BuW() {
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r5) {
        C18070vi.A0d(view, 0);
        if (bitmap != null && view.getParent() != null) {
            if (view instanceof ViewStub) {
                view = AnonymousClass3MY.A0I(new C28931bI(view), 0);
            }
            ImageView imageView = (ImageView) view;
            C18070vi.A0b(imageView);
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
        }
    }

    public /* synthetic */ void CN4(View view) {
    }

    public int BZK() {
        return this.A00.getResources().getDimensionPixelSize(2131165842);
    }

    public AnonymousClass7N9(Context context) {
        this.A00 = context;
    }
}
