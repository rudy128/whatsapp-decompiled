package X;

import android.widget.SeekBar;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;

/* renamed from: X.4er  reason: invalid class name and case insensitive filesystem */
public class C90924er implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ WallpaperCurrentPreviewActivity A00;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C90924er(WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity) {
        this.A00 = wallpaperCurrentPreviewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProgressChanged(android.widget.SeekBar r6, int r7, boolean r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002f
            com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity r4 = r5.A00
            X.4SC r0 = r4.A0M
            if (r0 == 0) goto L_0x002f
            android.graphics.drawable.Drawable r3 = r0.A00
            if (r3 == 0) goto L_0x002f
            int r2 = r6.getProgress()
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r0 = X.AnonymousClass3Ma.A00(r4, r1, r0)
            int r2 = X.C72473Md.A01(r2, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DARKEN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            r3.setColorFilter(r0)
            com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview r0 = r4.A0N
            r0.setImageDrawable(r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90924er.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = this.A00;
            wallpaperCurrentPreviewActivity.A0P.A0G(wallpaperCurrentPreviewActivity, C88594aB.A03(wallpaperCurrentPreviewActivity), progress);
        }
    }
}
