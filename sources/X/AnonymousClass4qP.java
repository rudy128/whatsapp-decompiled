package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.4qP  reason: invalid class name */
public final class AnonymousClass4qP implements C108315bU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InteropComposeEnterInfoActivity A01;
    public final /* synthetic */ WDSTextLayout A02;

    public void Bwt() {
    }

    public void C8a() {
    }

    public void C8b(Bitmap bitmap) {
        Drawable r0;
        C18070vi.A0d(bitmap, 0);
        WDSTextLayout wDSTextLayout = this.A02;
        InteropComposeEnterInfoActivity interopComposeEnterInfoActivity = this.A01;
        AnonymousClass1VU r6 = interopComposeEnterInfoActivity.A0A;
        if (r6 != null) {
            Resources resources = interopComposeEnterInfoActivity.getResources();
            Drawable A07 = AnonymousClass4aX.A07(interopComposeEnterInfoActivity.getResources(), new BitmapDrawable(interopComposeEnterInfoActivity.getResources(), bitmap), this.A00);
            C65482wZ A0J = AnonymousClass3Ma.A0J();
            if (C18020vd.A05(C18040vf.A02, r6.A00, 1257)) {
                r0 = new AnonymousClass26q(resources, A07, (C43011z6) A0J);
            } else {
                r0 = new C43031z8(resources, A07, (C43011z6) A0J);
            }
            wDSTextLayout.setHeaderImage(r0);
            return;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public AnonymousClass4qP(InteropComposeEnterInfoActivity interopComposeEnterInfoActivity, WDSTextLayout wDSTextLayout, int i) {
        this.A02 = wDSTextLayout;
        this.A01 = interopComposeEnterInfoActivity;
        this.A00 = i;
    }
}
