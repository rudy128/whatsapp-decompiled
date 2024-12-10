package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.Ady  reason: case insensitive filesystem */
public class C21068Ady implements C108315bU {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C20284AEs A01;
    public final /* synthetic */ C20037A4g A02;
    public final /* synthetic */ boolean A03;

    public void C8a() {
    }

    public void C8b(Bitmap bitmap) {
    }

    public C21068Ady(ImageView imageView, C20284AEs aEs, C20037A4g a4g, boolean z) {
        this.A02 = a4g;
        this.A03 = z;
        this.A01 = aEs;
        this.A00 = imageView;
    }

    public void Bwt() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: Failed to display card art, empty image shown. Re-fetch ");
        boolean z = this.A03;
        Log.w(AnonymousClass3MY.A0r(A10, z));
        if (z) {
            C20037A4g a4g = this.A02;
            C20037A4g.A01(this.A00, this.A01, a4g);
        }
    }
}
