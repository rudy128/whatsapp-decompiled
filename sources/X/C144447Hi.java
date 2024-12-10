package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

/* renamed from: X.7Hi  reason: invalid class name and case insensitive filesystem */
public final class C144447Hi implements C1606889n {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ AnonymousClass8B2 A04;
    public final /* synthetic */ C139226yS A05;
    public final /* synthetic */ AnonymousClass891 A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ void Bti() {
    }

    public void C7F(Bitmap bitmap, boolean z) {
        C18070vi.A0d(bitmap, 0);
        ImageView imageView = this.A02;
        if (imageView.getTag() == this.A06) {
            Fragment fragment = this.A03;
            if (fragment.A1B() == null) {
                return;
            }
            if (bitmap.equals(AnonymousClass6YZ.A00)) {
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i = this.A00;
                imageView.setBackgroundColor(i);
                AnonymousClass8B2 r0 = this.A04;
                if (r0 != null) {
                    int type = r0.getType();
                    if (Integer.valueOf(type) != null && (type == 0 || type == 1 || type == 2)) {
                        imageView.setBackgroundColor(i);
                        int i2 = 2131232110;
                        if (this.A07) {
                            i2 = 2131232112;
                        }
                        imageView.setImageResource(i2);
                        return;
                    }
                }
                if (this.A05.A02 == 12) {
                    imageView.setImageResource(2131231946);
                    AnonymousClass1ZE r4 = AnonymousClass1ZE.GOOGLE_GALLERY_SHORTCUT;
                    Context A042 = AnonymousClass3MY.A04(imageView);
                    imageView.setImageTintList(C19740yt.A03(A042, AnonymousClass1YL.A00(A042, r4.contentAttrb, r4.content)));
                    Context A043 = AnonymousClass3MY.A04(imageView);
                    imageView.setBackgroundTintList(C19740yt.A03(A043, AnonymousClass1YL.A00(A043, r4.backgroundAttrb, r4.background)));
                    return;
                }
                imageView.setImageResource(0);
                imageView.setBackgroundColor(i);
                return;
            }
            AnonymousClass3MW.A1R(imageView);
            imageView.setBackgroundResource(0);
            if (!z) {
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = this.A01;
                C108995ce.A10(imageView, new BitmapDrawable(AnonymousClass3MZ.A09(fragment), bitmap), drawableArr);
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    public C144447Hi(Drawable drawable, ImageView imageView, Fragment fragment, AnonymousClass8B2 r4, C139226yS r5, AnonymousClass891 r6, int i, boolean z) {
        this.A02 = imageView;
        this.A06 = r6;
        this.A03 = fragment;
        this.A00 = i;
        this.A04 = r4;
        this.A07 = z;
        this.A05 = r5;
        this.A01 = drawable;
    }

    public void BCw() {
        C108975cc.A0x(this.A02, this.A00);
    }
}
