package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.mediaview.PhotoView;

public final class DPD implements E9X {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ Toolbar A01;
    public final /* synthetic */ AnonymousClass1FU A02;
    public final /* synthetic */ PhotoView A03;
    public final /* synthetic */ Cb1 A04;
    public final /* synthetic */ boolean A05;

    public void BsL(int i) {
    }

    public void C5M() {
    }

    public DPD(Drawable drawable, Toolbar toolbar, AnonymousClass1FU r3, PhotoView photoView, Cb1 cb1, boolean z) {
        this.A05 = z;
        this.A02 = r3;
        this.A00 = drawable;
        this.A01 = toolbar;
        this.A03 = photoView;
        this.A04 = cb1;
    }

    public void Brt() {
        boolean z = this.A05;
        AnonymousClass1FU r1 = this.A02;
        if (z) {
            r1.onBackPressed();
            return;
        }
        r1.finish();
        r1.overridePendingTransition(0, 0);
    }

    public void C5n(float f) {
        float f2;
        float f3 = 1.0f - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        int i = (int) (255.0f * f2);
        this.A00.setAlpha(i);
        this.A01.setAlpha(f2);
        Drawable background = this.A03.getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        Cb1 cb1 = this.A04;
        int i2 = cb1.A01;
        if (i2 != 0) {
            AnonymousClass1FU r3 = this.A02;
            r3.getWindow().setStatusBarColor(AnonymousClass1Z2.A03(f2, i2, -16777216));
            r3.getWindow().setNavigationBarColor(AnonymousClass1Z2.A03(f2, cb1.A00, -16777216));
        }
    }

    public /* synthetic */ boolean BeX(View view) {
        return true;
    }
}
