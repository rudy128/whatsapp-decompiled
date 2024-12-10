package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaMediaThumbnailView;

/* renamed from: X.5nH  reason: invalid class name and case insensitive filesystem */
public class C113555nH extends C42011xT {
    public final int A00;
    public final int A01;
    public final ColorDrawable A02;
    public final WaMediaThumbnailView A03;
    public final C136166tN A04;
    public final AnonymousClass1OS A05;
    public final String A06;

    public void A0B(AnonymousClass8B2 r5) {
        AnonymousClass891 r2;
        WaMediaThumbnailView waMediaThumbnailView = this.A03;
        waMediaThumbnailView.A01 = r5;
        Object tag = waMediaThumbnailView.getTag();
        if ((tag instanceof AnonymousClass891) && (r2 = (AnonymousClass891) tag) != null) {
            this.A04.A01(r2);
        }
        if (r5 != null) {
            waMediaThumbnailView.setContentDescription(this.A06);
            AnonymousClass3MW.A1R(waMediaThumbnailView);
            AnonymousClass7HV r22 = new AnonymousClass7HV(r5, this, 1);
            waMediaThumbnailView.setTag(r22);
            this.A04.A02(r22, new C144397Hd(this, r22, 0));
            C90014dO.A00(waMediaThumbnailView, this, r5, 34);
            return;
        }
        waMediaThumbnailView.setScaleType(ImageView.ScaleType.CENTER);
        waMediaThumbnailView.setBackgroundColor(this.A01);
        waMediaThumbnailView.setImageDrawable((Drawable) null);
    }

    public C113555nH(View view, C136166tN r4, AnonymousClass1OS r5) {
        super(view);
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = AnonymousClass3MY.A0m(view.getResources(), 2131889632);
        this.A00 = view.getResources().getDimensionPixelSize(2131166904);
        int A002 = C19740yt.A00(view.getContext(), 2131100009);
        this.A01 = A002;
        this.A02 = new ColorDrawable(A002);
        this.A03 = (WaMediaThumbnailView) AnonymousClass3MX.A0C(view, 2131435120);
    }
}
