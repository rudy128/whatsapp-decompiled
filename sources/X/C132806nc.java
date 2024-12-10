package X;

import android.widget.ImageView;
import java.util.Map;

/* renamed from: X.6nc  reason: invalid class name and case insensitive filesystem */
public final class C132806nc {
    public final AnonymousClass11A A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final Map A03 = C17880vN.A13();
    public final AnonymousClass10I A04;

    public final void A00(ImageView imageView, String str) {
        C18070vi.A0d(imageView, 1);
        String A042 = C17970vW.A04(str);
        if (A042 != null) {
            Map map = this.A03;
            synchronized (map) {
                imageView.setTag(-1641051461, A042);
                map.put(A042, AnonymousClass3MW.A0z(imageView));
            }
            this.A04.CGF(new AnonymousClass7Pq(this, str, A042, 13));
            return;
        }
        throw C17890vO.A0K();
    }

    public C132806nc(AnonymousClass11A r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r4, r3, r5, r2);
        this.A02 = r4;
        this.A04 = r3;
        this.A01 = r5;
        this.A00 = r2;
    }
}
