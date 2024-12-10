package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.9HO  reason: invalid class name */
public class AnonymousClass9HO extends ByteArrayOutputStream {
    public final /* synthetic */ C21333AiI A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9HO(C21333AiI aiI, int i) {
        super(i);
        this.A00 = aiI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.buf[r4] == 13) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            int r2 = r5.count
            if (r2 <= 0) goto L_0x000f
            byte[] r0 = r5.buf
            int r4 = r2 + -1
            byte r1 = r0[r4]
            r0 = 13
            if (r1 != r0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r2
        L_0x0010:
            byte[] r3 = r5.buf     // Catch:{ UnsupportedEncodingException -> 0x0021 }
            X.AiI r0 = r5.A00     // Catch:{ UnsupportedEncodingException -> 0x0021 }
            java.nio.charset.Charset r0 = r0.A04     // Catch:{ UnsupportedEncodingException -> 0x0021 }
            java.lang.String r2 = r0.name()     // Catch:{ UnsupportedEncodingException -> 0x0021 }
            r1 = 0
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0021 }
            r0.<init>(r3, r1, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0021 }
            return r0
        L_0x0021:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9HO.toString():java.lang.String");
    }
}
