package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.9kB  reason: invalid class name and case insensitive filesystem */
public class C189989kB {
    public final C18030ve A00;
    public final AnonymousClass4VT A01;

    public C189989kB(AnonymousClass1KB r11, AnonymousClass181 r12, AnonymousClass118 r13, C18030ve r14, AnonymousClass1D9 r15, AnonymousClass10I r16) {
        this.A00 = r14;
        Context context = r13.A00;
        C86284Ra r3 = new C86284Ra(r11, r12, r15, r16, C17880vN.A0e(context.getCacheDir(), "biz_directory_cache"), "directory-image");
        AnonymousClass8BY.A0e(context, r3);
        r3.A05 = true;
        this.A01 = r3.A00();
        if (C18020vd.A05(C18040vf.A02, this.A00, 2185)) {
            this.A01.A02.A03.A00 = true;
        }
    }

    public void A00(ImageView imageView, String str) {
        this.A01.A01((Drawable) null, AnonymousClass4aX.A02(imageView.getContext(), 2131231781, 2131101222), imageView, str);
    }
}
