package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.72r  reason: invalid class name and case insensitive filesystem */
public final class C1407172r {
    public float A00 = 1.0f;
    public final WDSButton A01;
    public final Runnable A02 = new AnonymousClass7R9((Object) this, 24);
    public final Context A03;

    public static final String A00(C1407172r r7, float f) {
        int i;
        Object[] objArr;
        Object valueOf;
        float rint = ((float) Math.rint((double) (f * 10.0f))) / 10.0f;
        int i2 = ((rint % 1.0f) > 0.0f ? 1 : ((rint % 1.0f) == 0.0f ? 0 : -1));
        Context context = r7.A03;
        if (i2 == 0) {
            i = 2131887885;
            objArr = new Object[1];
            valueOf = Integer.valueOf((int) rint);
        } else {
            i = 2131887884;
            objArr = new Object[1];
            valueOf = Float.valueOf(rint);
        }
        return AnonymousClass3Ma.A10(context, valueOf, objArr, 0, i);
    }

    public static final void A01(C1407172r r2) {
        View view;
        WDSButton wDSButton = r2.A01;
        ViewParent viewParent = null;
        if (wDSButton != null) {
            viewParent = wDSButton.getParent();
        }
        if ((viewParent instanceof View) && (view = (View) viewParent) != null && view.getVisibility() != 0) {
            view.setVisibility(C72453Mb.A07(r2.A03() ? 1 : 0));
        }
    }

    public static final void A02(C1407172r r9, CharSequence charSequence) {
        WDSButton wDSButton = r9.A01;
        if (wDSButton != null) {
            Context context = r9.A03;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169591);
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas A0E = C108955ca.A0E(createBitmap);
            Paint A0K = C108945cZ.A0K(1);
            A0K.setTextSize(context.getResources().getDimension(2131169589));
            A0K.setColor(-1);
            A0K.setTextAlign(Paint.Align.CENTER);
            A0K.setFakeBoldText(true);
            A0K.getTextBounds(charSequence.toString(), 0, charSequence.length(), AnonymousClass3MW.A07());
            float A022 = C108945cZ.A02(dimensionPixelSize);
            A0E.drawText(charSequence.toString(), A022, A022 - ((A0K.descent() + A0K.ascent()) / 2.0f), A0K);
            wDSButton.setIcon((Drawable) C108975cc.A08(context, createBitmap));
            wDSButton.invalidate();
        }
    }

    public final boolean A03() {
        return !AnonymousClass000.A1P(((((float) Math.rint((double) (this.A00 * 10.0f))) / 10.0f) > 1.0f ? 1 : ((((float) Math.rint((double) (this.A00 * 10.0f))) / 10.0f) == 1.0f ? 0 : -1)));
    }

    public C1407172r(Context context, WDSButton wDSButton) {
        this.A03 = context;
        this.A01 = wDSButton;
    }
}
