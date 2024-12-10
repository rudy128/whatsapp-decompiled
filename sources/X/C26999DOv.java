package X;

import android.hardware.Camera;

/* renamed from: X.DOv  reason: case insensitive filesystem */
public class C26999DOv implements C28526E6a {
    public final CQV A00 = new Object();
    public final /* synthetic */ Bq6 A01;

    public synchronized CQV BM5() {
        CQV cqv;
        cqv = this.A00;
        byte[] bArr = cqv.A02;
        if (bArr != null) {
            Bq6 bq6 = this.A01;
            Camera camera = bq6.A07;
            if (camera != null && !bq6.A0Q && bArr == bq6.A0R) {
                camera.addCallbackBuffer(bArr);
            }
            cqv.A02 = null;
        }
        while (cqv.A02 == null) {
            wait();
        }
        return cqv;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CQV] */
    public C26999DOv(Bq6 bq6) {
        this.A01 = bq6;
    }
}
