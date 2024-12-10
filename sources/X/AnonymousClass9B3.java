package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;

/* renamed from: X.9B3  reason: invalid class name */
public final class AnonymousClass9B3 extends A34 {
    public final C002100z A00;
    public final C189959k8 A01;
    public final AnonymousClass118 A02;
    public final String A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.A00.A08(this.A03, AnonymousClass3MW.A0z(bitmap));
            this.A01.A00(bitmap);
            return;
        }
        Log.e("ImageComponentBinder/bindView/bitmap read failed");
    }

    public AnonymousClass9B3(C002100z r1, C189959k8 r2, AnonymousClass118 r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
