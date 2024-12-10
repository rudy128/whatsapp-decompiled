package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.whatsapp.WaImageView;

/* renamed from: X.3Z5  reason: invalid class name */
public final class AnonymousClass3Z5 extends C42011xT {
    public final WaImageView A00;
    public final WaImageView A01;
    public final /* synthetic */ C73543Wj A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Z5(View view, C73543Wj r6) {
        super(view);
        C18070vi.A0d(view, 2);
        this.A02 = r6;
        this.A01 = (WaImageView) C18070vi.A05(view, 2131436134);
        WaImageView waImageView = (WaImageView) C18070vi.A05(view, 2131431500);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AnonymousClass3MW.A00(AnonymousClass000.A0Y(waImageView), 2131169404));
        gradientDrawable.setColor(C19740yt.A00(waImageView.getContext(), 2131103106));
        waImageView.setBackground(gradientDrawable);
        this.A00 = waImageView;
    }
}
