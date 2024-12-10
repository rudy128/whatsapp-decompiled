package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6nG  reason: invalid class name and case insensitive filesystem */
public class C132646nG {
    public final C218617r A00;
    public final C26611Su A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final AnonymousClass10I A03;

    public C132646nG(C218617r r2, C26611Su r3, AnonymousClass10I r4) {
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A00(ImageView imageView, AEX aex, int i, int i2) {
        Drawable drawable;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentBackgroundMetadata{id='");
        AEX aex2 = aex;
        A10.append(aex.A0F);
        A10.append("',fileSize=");
        A10.append(aex.A0E);
        A10.append(",width=");
        A10.append(aex.A0D);
        A10.append(",height=");
        A10.append(aex.A09);
        A10.append(",mimetype='");
        A10.append(aex.A0G);
        A10.append("'}_");
        int i3 = i;
        A10.append(i);
        int i4 = i2;
        String A1I = AnonymousClass001.A1I("_", A10, i2);
        ImageView imageView2 = imageView;
        imageView.setTag(A1I);
        Drawable drawable2 = imageView.getDrawable();
        Reference reference = (Reference) this.A02.get(A1I);
        if (reference != null) {
            drawable = (Drawable) reference.get();
        } else {
            drawable = null;
        }
        if (drawable2 != null && drawable2.equals(drawable)) {
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        C17890vO.A0u(new C121916Lz(imageView2, aex2, this, A1I, i3, i4), this.A03);
    }
}
