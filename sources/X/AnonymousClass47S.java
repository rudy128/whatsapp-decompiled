package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.47S  reason: invalid class name */
public class AnonymousClass47S extends AnonymousClass3PL {
    public Resources A00;
    public Button A01;
    public FrameLayout A02;
    public ProgressBar A03;
    public WallpaperImagePreview A04;
    public WallpaperImagePreview A05;
    public WallpaperImagePreview A06;
    public int A07;

    public AnonymousClass47S(Context context, Resources resources, String str, String str2, int i) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A07 = i;
        this.A00 = resources;
        View.inflate(context, 2131627541, this);
        this.A05 = (WallpaperImagePreview) AnonymousClass1HF.A06(this, 2131436982);
        this.A04 = (WallpaperImagePreview) AnonymousClass1HF.A06(this, 2131436981);
        WallpaperImagePreview wallpaperImagePreview = (WallpaperImagePreview) AnonymousClass1HF.A06(this, 2131436983);
        this.A06 = wallpaperImagePreview;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        ((WallpaperMockChatView) AnonymousClass1HF.A06(this, 2131436988)).setMessages(str, str2, (C108875cR) null);
        this.A02 = (FrameLayout) AnonymousClass1HF.A06(this, 2131436987);
        this.A03 = (ProgressBar) AnonymousClass1HF.A06(this, 2131436991);
        this.A01 = (Button) AnonymousClass1HF.A06(this, 2131436986);
    }

    public void A00() {
        this.A02.setVisibility(0);
        this.A03.setVisibility(0);
        this.A01.setVisibility(8);
    }

    public void setBackgroundColor(int i) {
        this.A06.setVisibility(8);
        WallpaperImagePreview wallpaperImagePreview = this.A04;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        wallpaperImagePreview.setBackgroundColor(i);
    }

    public void setDimLevel(int i) {
        this.A04.setColorFilter(C72473Md.A01(i, this.A07));
    }

    public void setDownloadClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.A06.setVisibility(8);
        this.A04.setImageBitmap(bitmap);
    }

    public void setWallpaper(Drawable drawable) {
        this.A06.setVisibility(8);
        this.A04.setImageDrawable(drawable);
    }
}
