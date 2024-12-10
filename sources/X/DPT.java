package X;

import android.graphics.Bitmap;

public class DPT implements AnonymousClass5a2 {
    public final AnonymousClass205 A00;
    public final /* synthetic */ AnonymousClass206 A01;
    public final /* synthetic */ DR0 A02;
    public final /* synthetic */ Bitmap[] A03;

    public DPT(AnonymousClass206 r1, AnonymousClass205 r2, DR0 dr0, Bitmap[] bitmapArr) {
        this.A02 = dr0;
        this.A03 = bitmapArr;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void Bzv(C143887Fe r8, boolean z) {
        AnonymousClass205 r4 = this.A00;
        DR0 dr0 = this.A02;
        if (r4 == dr0.A06) {
            int i = dr0.A03;
            Bitmap[] bitmapArr = this.A03;
            dr0.A02(r8.A06, this.A01, r4, bitmapArr, i);
        }
    }
}
