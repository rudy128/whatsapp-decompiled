package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.DPd  reason: case insensitive filesystem */
public abstract class C27007DPd implements E8G {
    public final int A00;

    public WaImageView BbV(Context context) {
        int i;
        int i2;
        WaImageView waImageView = new WaImageView(context);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        waImageView.setImageResource(this.A00);
        C28081Yu.A01(PorterDuff.Mode.SRC_IN, waImageView);
        C28081Yu.A00(ColorStateList.valueOf(AnonymousClass3Ma.A00(context, 2130970613, 2131102002)), waImageView);
        boolean z = this instanceof C24075Bv1;
        if (z) {
            i = 2131893092;
        } else {
            i = 2131893091;
        }
        if (context.getString(i) != null) {
            if (z) {
                i2 = 2131893092;
            } else {
                i2 = 2131893091;
            }
            waImageView.setContentDescription(context.getString(i2));
        }
        return waImageView;
    }

    public C27007DPd(int i) {
        this.A00 = i;
    }
}
