package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.whatsapp.WaImageView;
import com.whatsapp.ctwa.CtwaFMXAdPreviewFragment;

/* renamed from: X.6LV  reason: invalid class name */
public final class AnonymousClass6LV extends A34 {
    public final Bitmap A00;
    public final /* synthetic */ CtwaFMXAdPreviewFragment A01;

    public AnonymousClass6LV(Bitmap bitmap, CtwaFMXAdPreviewFragment ctwaFMXAdPreviewFragment) {
        this.A01 = ctwaFMXAdPreviewFragment;
        this.A00 = bitmap;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap bitmap = this.A00;
        C18070vi.A0d(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return new C134576qo(0, 0);
        }
        CYk cYk = new CYk(bitmap);
        double d = (double) width;
        cYk.A01(0, 0, (int) (d * 0.05d), height);
        C25587CiR A002 = cYk.A00();
        CYk cYk2 = new CYk(bitmap);
        cYk2.A01((int) (d * (1.0d - 0.05d)), 0, width, height);
        C25587CiR A003 = cYk2.A00();
        int i = 0;
        C25834Cmn cmn = A002.A01;
        if (cmn != null) {
            i = cmn.A05;
        }
        int i2 = 0;
        C25834Cmn cmn2 = A003.A01;
        if (cmn2 != null) {
            i2 = cmn2.A05;
        }
        return new C134576qo(i, i2);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C134576qo r8 = (C134576qo) obj;
        if (r8 != null) {
            CtwaFMXAdPreviewFragment ctwaFMXAdPreviewFragment = this.A01;
            Bitmap bitmap = this.A00;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{r8.A01, r8.A00});
            float dimension = AnonymousClass3MZ.A09(ctwaFMXAdPreviewFragment).getDimension(2131166373);
            float[] fArr = new float[8];
            fArr[0] = dimension;
            fArr[1] = dimension;
            C109005cf.A0Q(gradientDrawable, fArr, dimension);
            WaImageView waImageView = ctwaFMXAdPreviewFragment.A04;
            if (waImageView != null) {
                waImageView.setBackground(gradientDrawable);
            }
            WaImageView waImageView2 = ctwaFMXAdPreviewFragment.A04;
            if (waImageView2 != null) {
                waImageView2.setImageBitmap(bitmap);
            }
            WaImageView waImageView3 = ctwaFMXAdPreviewFragment.A04;
            if (waImageView3 != null) {
                waImageView3.setVisibility(0);
            }
        }
    }
}
