package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.4eQ  reason: invalid class name and case insensitive filesystem */
public class C90654eQ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SolidColorWallpaperPreview A04;

    public boolean onPreDraw() {
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A04;
        AnonymousClass3MX.A1G(solidColorWallpaperPreview.A07, this);
        View findViewById = solidColorWallpaperPreview.findViewById(2131436988);
        View findViewById2 = solidColorWallpaperPreview.findViewById(2131436989);
        int[] iArr = new int[2];
        solidColorWallpaperPreview.A09.getLocationOnScreen(iArr);
        solidColorWallpaperPreview.A02 = this.A02 - iArr[0];
        solidColorWallpaperPreview.A03 = this.A03 - iArr[1];
        solidColorWallpaperPreview.A00 = ((float) this.A01) / ((float) solidColorWallpaperPreview.A09.getWidth());
        solidColorWallpaperPreview.A01 = ((float) this.A00) / ((float) solidColorWallpaperPreview.A09.getHeight());
        int A002 = (int) (C72463Mc.A00(solidColorWallpaperPreview) * 20.0f);
        solidColorWallpaperPreview.A09.setPivotX(0.0f);
        solidColorWallpaperPreview.A09.setPivotY(0.0f);
        solidColorWallpaperPreview.A09.setScaleX(solidColorWallpaperPreview.A00);
        solidColorWallpaperPreview.A09.setScaleY(solidColorWallpaperPreview.A01);
        solidColorWallpaperPreview.A09.setTranslationX((float) solidColorWallpaperPreview.A02);
        solidColorWallpaperPreview.A09.setTranslationY((float) solidColorWallpaperPreview.A03);
        solidColorWallpaperPreview.A04.setAlpha(0.0f);
        solidColorWallpaperPreview.A06.setAlpha(0.0f);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
            findViewById.setTranslationY((float) A002);
        }
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.0f);
            findViewById2.setTranslationY((float) A002);
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        solidColorWallpaperPreview.A05.setBackgroundColor(0);
        solidColorWallpaperPreview.A04.animate().setDuration(250).alpha(1.0f).setInterpolator(decelerateInterpolator);
        solidColorWallpaperPreview.A09.animate().setDuration(250).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass3Mm(findViewById2, decelerateInterpolator, this, findViewById, 2));
        return true;
    }

    public C90654eQ(SolidColorWallpaperPreview solidColorWallpaperPreview, int i, int i2, int i3, int i4) {
        this.A04 = solidColorWallpaperPreview;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
