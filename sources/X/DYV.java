package X;

import java.io.IOException;

public class DYV implements EEM {
    public C25193Cak A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Dxl, X.1Bz] */
    public AnonymousClass1Bz BU4() {
        C26135Csy A01 = this.A00.A01();
        ? obj = new Object();
        obj.A00 = A01.A03();
        return obj;
    }

    public AnonymousClass1Bz CP9() {
        try {
            return BU4();
        } catch (IOException e) {
            throw AnonymousClass000.A0n(e.getMessage());
        }
    }
}
