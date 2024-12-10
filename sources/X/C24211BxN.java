package X;

import java.io.IOException;

/* renamed from: X.BxN  reason: case insensitive filesystem */
public final class C24211BxN extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24211BxN(java.lang.String r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r1 = r2.length()
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r0 = X.BE9.A0o(r0, r2, r1)
            r3.<init>(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24211BxN.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public C24211BxN(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C24211BxN() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
