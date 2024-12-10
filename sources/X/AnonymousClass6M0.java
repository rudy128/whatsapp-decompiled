package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.6M0  reason: invalid class name */
public final class AnonymousClass6M0 extends A34 {
    public final int A00;
    public final Bitmap A01;
    public final View A02;
    public final ThumbnailButton A03;
    public final String A04;
    public final Map A05;
    public final /* synthetic */ CatalogCarouselDetailImageView A06;

    public AnonymousClass6M0(Bitmap bitmap, View view, CatalogCarouselDetailImageView catalogCarouselDetailImageView, ThumbnailButton thumbnailButton, String str, Map map, int i) {
        C18070vi.A0d(view, 3);
        this.A06 = catalogCarouselDetailImageView;
        this.A01 = bitmap;
        this.A02 = view;
        this.A03 = thumbnailButton;
        this.A00 = i;
        this.A05 = map;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass9a2 r5 = (AnonymousClass9a2) obj;
        if (r5 != null) {
            this.A05.put(this.A04, r5);
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A06;
            Bitmap bitmap = this.A01;
            boolean A1U = AnonymousClass000.A1U(bitmap.getWidth(), bitmap.getHeight());
            catalogCarouselDetailImageView.setImageAndGradient(r5, A1U, this.A03, bitmap, this.A02);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C25587CiR A002;
        CYk cYk;
        Bitmap bitmap = this.A01;
        int i = this.A00;
        C18070vi.A0d(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return new AnonymousClass9a2(i, i);
        }
        boolean A1U = AnonymousClass000.A1U(width, height);
        CYk cYk2 = new CYk(bitmap);
        if (A1U) {
            double d = (double) width;
            cYk2.A01(0, 0, (int) (d * 0.05d), height);
            A002 = cYk2.A00();
            cYk = new CYk(bitmap);
            cYk.A01((int) (d * 0.95d), 0, width, height);
        } else {
            double d2 = (double) height;
            cYk2.A01(0, 0, width, (int) (d2 * 0.05d));
            A002 = cYk2.A00();
            cYk = new CYk(bitmap);
            cYk.A01(0, (int) (d2 * 0.95d), width, height);
        }
        C25587CiR A003 = cYk.A00();
        int i2 = i;
        C25834Cmn cmn = A002.A01;
        if (cmn != null) {
            i2 = cmn.A05;
        }
        C25834Cmn cmn2 = A003.A01;
        if (cmn2 != null) {
            i = cmn2.A05;
        }
        return new AnonymousClass9a2(i2, i);
    }
}
