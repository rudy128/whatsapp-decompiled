package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.2SA  reason: invalid class name */
public abstract class AnonymousClass2SA {
    public Bitmap A00() {
        if (this instanceof AnonymousClass2P8) {
            return C32021gV.A01((Bitmap.Config) null, ((AnonymousClass2P8) this).A00, 100, false, false);
        }
        AnonymousClass2P9 r0 = (AnonymousClass2P9) this;
        AnonymousClass206 r4 = r0.A03;
        boolean z = r0.A07;
        boolean z2 = r0.A0A;
        return C32021gV.A01(r0.A01, r4, r0.A00, z, z2);
    }

    public void A01(Bitmap bitmap) {
        if (this instanceof AnonymousClass2P9) {
            AnonymousClass2P9 r3 = (AnonymousClass2P9) this;
            Resources resources = r3.A02.getResources();
            if (resources == null) {
                Log.w("MessageThumbCache/maybeFetchThumb not fetched");
                return;
            }
            int BZK = (int) (((float) r3.A04.BZK()) / resources.getDisplayMetrics().density);
            if (BZK > bitmap.getWidth() || BZK == 0) {
                r3.A02((C693536w) null);
            }
        }
    }

    public void A02(C693536w r17) {
        if (this instanceof AnonymousClass2P9) {
            AnonymousClass2P9 r2 = (AnonymousClass2P9) this;
            C32021gV r1 = r2.A05;
            AnonymousClass206 r3 = r2.A03;
            View view = r2.A02;
            AnonymousClass3M2 r6 = r2.A04;
            Object obj = r2.A06;
            BitmapFactory.Options options = C32021gV.A0E;
            C693536w r4 = r17;
            C130226j5 r9 = new C130226j5(view, r3, r4, r6, r1, obj);
            if (r2.A08) {
                r1.A05.CGF(new C21440Ak7(r2, r3, r4, view, r6, r9, obj, 3, r2.A09));
            }
        }
    }
}
