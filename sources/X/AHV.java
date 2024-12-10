package X;

import android.content.Context;

public final class AHV implements BE1 {
    public boolean A00;
    public final Context A01;
    public final C188939iF A02;
    public final String A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21829AtH(this));
    public final boolean A05;
    public final boolean A06;

    public void close() {
        C18100vl r1 = this.A04;
        if (r1.Bf6()) {
            ((AnonymousClass8CH) r1.getValue()).close();
        }
    }

    public AHV(Context context, C188939iF r3, String str, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = r3;
        this.A06 = z;
        this.A05 = z2;
    }
}
