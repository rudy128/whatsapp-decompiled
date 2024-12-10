package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7NF  reason: invalid class name */
public final class AnonymousClass7NF implements AnonymousClass3M2 {
    public static final Bitmap.Config A02 = Bitmap.Config.RGB_565;
    public final int A00;
    public final int A01;

    public /* synthetic */ void BuW() {
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r6) {
        C18070vi.A0d(view, 0);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, A02);
            bitmap.setPixel(0, 0, this.A00);
        }
        ((ImageView) view).setImageBitmap(bitmap);
    }

    public void CN4(View view) {
        ImageView imageView;
        C18070vi.A0d(view, 0);
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageResource(2131231230);
        }
    }

    public AnonymousClass7NF(Context context) {
        this.A01 = context.getResources().getDimensionPixelSize(2131168877);
        this.A00 = C19740yt.A00(context, C28281Zt.A0B(context) ? 2131102599 : 2131102598);
    }

    public int BZK() {
        return this.A01;
    }
}
