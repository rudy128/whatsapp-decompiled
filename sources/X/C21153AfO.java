package X;

import android.util.Log;

/* renamed from: X.AfO  reason: case insensitive filesystem */
public class C21153AfO implements BCH {
    public final /* synthetic */ C185209cD A00;
    public final /* synthetic */ String A01;

    public void C3l(String str) {
    }

    public C21153AfO(C185209cD r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void C3j(C187029f9 r6) {
        int i = r6.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i == 5) {
            A10.append("BLOKS: Prefetch successful (");
            A10.append(this.A01);
        } else {
            A10.append("BLOKS: Prefetch failed (");
            A10.append(this.A01);
            A10.append(", status=");
            A10.append(i);
        }
        Log.v("WaBkPreloadHelper", AnonymousClass000.A0y(")", A10));
    }

    public void C3d(CQF cqf) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Should not prefetch async actions: ");
        Log.e("WaBkPreloadHelper", AnonymousClass000.A0y(this.A01, A10));
    }
}
