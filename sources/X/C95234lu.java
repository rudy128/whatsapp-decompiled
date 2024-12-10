package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.4lu  reason: invalid class name and case insensitive filesystem */
public class C95234lu implements C108245bN {
    public final /* synthetic */ C75413hS A00;
    public final /* synthetic */ WallPaperView A01;
    public final /* synthetic */ Runnable A02;

    public C95234lu(C75413hS r1, WallPaperView wallPaperView, Runnable runnable) {
        this.A00 = r1;
        this.A02 = runnable;
        this.A01 = wallPaperView;
    }

    public void BEx() {
        C72473Md.A1F(this.A01);
    }

    public void CLS(Drawable drawable) {
        C75413hS.A00(drawable, this.A00);
    }

    public void CS1() {
        this.A02.run();
    }
}
