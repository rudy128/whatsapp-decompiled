package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaImageView;
import java.io.File;

/* renamed from: X.8cw  reason: invalid class name and case insensitive filesystem */
public class C166468cw extends BV6 {
    public final /* synthetic */ DFL A00;
    public final /* synthetic */ C26025Cqj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166468cw(DOZ doz, DFL dfl, DFL dfl2, C26025Cqj cqj) {
        super(doz, dfl);
        this.A01 = cqj;
        this.A00 = dfl2;
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        ImageView.ScaleType A08;
        ImageView imageView = (ImageView) view;
        DFL dfl2 = this.A00;
        String A0D = dfl2.A0D(42);
        if (A0D == null) {
            A08 = ImageView.ScaleType.CENTER_CROP;
        } else {
            try {
                A08 = A90.A08(A0D);
            } catch (AnonymousClass9HX e) {
                throw AnonymousClass8BR.A0x(e);
            }
        }
        imageView.setScaleType(A08);
        DFL A09 = dfl2.A09(44);
        DOZ doz2 = doz;
        if (A09 != null) {
            imageView.setColorFilter(C25340Cdz.A01(doz2, A09, 0));
        }
        D6N d6n = new D6N(doz2, A09, 1);
        D6M d6m = new D6M(doz2);
        C26025Cqj cqj = this.A01;
        String A0D2 = dfl2.A0D(38);
        String A0D3 = dfl2.A0D(41);
        String A0D4 = dfl2.A0D(35);
        String A0D5 = dfl2.A0D(36);
        if (!TextUtils.isEmpty(A0D2)) {
            C198229y0 r9 = (C198229y0) cqj.A09.get();
            C187619g6 r1 = cqj.A02;
            C18070vi.A0d(doz2, 0);
            C18070vi.A0p(A0D2, r9, r1);
            if (!(A0D3 == null || A0D3.length() == 0)) {
                C181069Pa.A00(imageView, d6m, d6n, r9, A0D3, A0D4);
            }
            r1.A00.A02(imageView, new C21069Adz(imageView, d6n, d6m, r9, A0D3, A0D4, AnonymousClass3MW.A0z(imageView), AnonymousClass3MW.A0z(doz2)), A0D2);
            return null;
        } else if (!TextUtils.isEmpty(A0D3)) {
            C181069Pa.A00(imageView, d6m, d6n, (C198229y0) cqj.A09.get(), A0D3, A0D4);
            return null;
        } else if (TextUtils.isEmpty(A0D5)) {
            return null;
        } else {
            C189369iy r0 = (C189369iy) cqj.A08.get();
            C18070vi.A0e(A0D5, 1, r0);
            File A002 = r0.A00(A0D5);
            if (A002 == null) {
                return null;
            }
            imageView.setImageBitmap(BitmapFactory.decodeFile(A002.getAbsolutePath()));
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        ImageView imageView = (ImageView) view;
        imageView.setImageBitmap((Bitmap) null);
        imageView.setImageDrawable((Drawable) null);
        imageView.setColorFilter((ColorFilter) null);
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return new WaImageView(context);
    }
}
