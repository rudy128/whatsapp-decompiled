package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.CUw  reason: case insensitive filesystem */
public class C25042CUw {
    public final List A00 = AnonymousClass000.A13();

    public void A00(Path path) {
        List list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                D7c d7c = (D7c) list.get(size);
                if (d7c != null && !d7c.A05) {
                    C40171uH.A03(path, ((C22735BMy) d7c.A02).A0C() / 100.0f, ((C22735BMy) d7c.A00).A0C() / 100.0f, ((C22735BMy) d7c.A01).A0C() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
