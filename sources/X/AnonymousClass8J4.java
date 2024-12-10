package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.8J4  reason: invalid class name */
public final class AnonymousClass8J4 extends C42011xT {
    public final ImageView A00;
    public final ThumbnailButton A01;
    public final View A02;
    public final /* synthetic */ CatalogCarouselDetailImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8J4(View view, CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        super(view);
        C18070vi.A0d(view, 2);
        this.A03 = catalogCarouselDetailImageView;
        this.A02 = AnonymousClass1HF.A06(view, 2131434109);
        this.A01 = (ThumbnailButton) AnonymousClass1HF.A06(view, 2131434108);
        this.A00 = AnonymousClass3MW.A0G(view, 2131433882);
    }

    public static final void A00(Bitmap bitmap, AnonymousClass8J4 r12, String str, Map map, int i, int i2, boolean z) {
        AnonymousClass8J4 r5 = r12;
        int i3 = i2;
        int i4 = i;
        ThumbnailButton thumbnailButton = r12.A01;
        String str2 = str;
        if (C18070vi.A18(thumbnailButton.getTag(), str)) {
            Bitmap bitmap2 = bitmap;
            boolean z2 = z;
            if (i == 0 || i2 == 0) {
                i4 = bitmap.getWidth();
                i3 = bitmap.getHeight();
                A01(r12, i4, i3, z2);
            }
            boolean A1U = AnonymousClass000.A1U(i4, i3);
            if (i4 == i3 || (z && A1U)) {
                thumbnailButton.setImageBitmap(bitmap);
                return;
            }
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = r12.A03;
            int A022 = AnonymousClass3MZ.A02(catalogCarouselDetailImageView.getContext(), catalogCarouselDetailImageView.getContext(), 2130968970, 2131100029);
            Map map2 = map;
            AnonymousClass9a2 r13 = (AnonymousClass9a2) map.get(str);
            if (r13 != null) {
                catalogCarouselDetailImageView.setImageAndGradient(r13, A1U, thumbnailButton, bitmap2, r5.A02);
                return;
            }
            AnonymousClass3MW.A1T(new AnonymousClass6M0(bitmap2, r5.A02, catalogCarouselDetailImageView, thumbnailButton, str2, map2, A022), catalogCarouselDetailImageView.getWaWorkers(), 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r9 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass8J4 r11, int r12, int r13, boolean r14) {
        /*
            if (r13 != 0) goto L_0x007a
            r2 = 0
        L_0x0004:
            r10 = 1
            boolean r9 = X.AnonymousClass000.A1U(r12, r13)
            if (r12 == r13) goto L_0x000c
            r10 = 0
        L_0x000c:
            android.view.View r4 = r11.A02
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r8 = -1
            r1.height = r8
            if (r14 == 0) goto L_0x001a
            r0 = -2
            if (r9 != 0) goto L_0x001b
        L_0x001a:
            r0 = -1
        L_0x001b:
            r1.width = r0
            r4.setLayoutParams(r1)
            com.whatsapp.components.button.ThumbnailButton r5 = r11.A01
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            r6 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r0 = r11.A03
            android.content.Context r0 = r0.getContext()
            android.view.WindowManager r0 = X.AnonymousClass11C.A01(r0)
            android.graphics.Point r0 = X.C62762rw.A02(r0)
            int r0 = r0.x
            r4.height = r0
            double r0 = (double) r0
            double r0 = r0 * r6
            int r8 = (int) r0
        L_0x0044:
            r4.width = r8
        L_0x0046:
            r5.setLayoutParams(r4)
            return
        L_0x004a:
            r6 = 4611280694460924559(0x3ffe8f5c28f5c28f, double:1.91)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r0 = r11.A03
            android.content.Context r0 = r0.getContext()
            android.view.WindowManager r0 = X.AnonymousClass11C.A01(r0)
            android.graphics.Point r0 = X.C62762rw.A02(r0)
            int r0 = r0.x
            r4.width = r0
            double r1 = (double) r0
            double r1 = r1 / r6
            int r0 = (int) r1
            r4.height = r0
            goto L_0x0046
        L_0x006b:
            if (r10 == 0) goto L_0x0070
            r4.height = r8
            goto L_0x0044
        L_0x0070:
            r0 = -2
            if (r9 == 0) goto L_0x0074
            r0 = -1
        L_0x0074:
            r4.height = r0
            if (r9 == 0) goto L_0x0044
            r8 = -2
            goto L_0x0044
        L_0x007a:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = (double) r12
            double r2 = r2 * r0
            double r0 = (double) r13
            double r2 = r2 / r0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8J4.A01(X.8J4, int, int, boolean):void");
    }
}
