package X;

import android.app.Activity;
import com.whatsapp.bubble.di.BubbleModule;
import com.whatsapp.calling.di.ActivityModule;
import com.whatsapp.gallery.di.GalleryModule;
import com.whatsapp.gallery.di.GalleryPickerFragmentModule;
import com.whatsapp.stickers.di.StickersDependencyBridgeModule;

/* renamed from: X.1Jv  reason: invalid class name and case insensitive filesystem */
public final class C24351Jv implements C006502w {
    public Activity A00;
    public final C24331Jt A01;
    public final AnonymousClass10E A02;

    /* renamed from: A00 */
    public AnonymousClass1K1 BDQ() {
        AnonymousClass00W.A00(Activity.class, this.A00);
        AnonymousClass10E r4 = this.A02;
        C24331Jt r3 = this.A01;
        ActivityModule activityModule = new ActivityModule();
        return new AnonymousClass1K1(this.A00, (C49622Rf) null, r3, r4, new BubbleModule(), activityModule, new GalleryModule(), new GalleryPickerFragmentModule(), new StickersDependencyBridgeModule());
    }

    public C24351Jv(C24331Jt r1, AnonymousClass10E r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    /* renamed from: A01 */
    public void BAj(Activity activity) {
        AnonymousClass00W.A01(activity);
        this.A00 = activity;
    }
}
