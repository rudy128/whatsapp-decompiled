package X;

import android.graphics.Bitmap;

public class APD implements C1605088t {
    public final int A00;
    public final Object A01;

    public APD(AnonymousClass8KV r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void Bmd() {
        int i = this.A00;
        AnonymousClass8KV r2 = (AnonymousClass8KV) this.A01;
        if (i != 0) {
            r2.A0B.A0E = r2.A07;
        } else {
            Bitmap bitmap = r2.A08;
            r2.A01 = bitmap;
            r2.A03.A02(bitmap);
        }
        r2.A03();
    }

    public void Bme(Bitmap bitmap) {
        int i = this.A00;
        AnonymousClass8KV r1 = (AnonymousClass8KV) this.A01;
        if (i != 0) {
            r1.A0B.A0E = bitmap;
        } else {
            r1.A01 = bitmap;
            r1.A03.A02(bitmap);
        }
        r1.A03();
    }
}
