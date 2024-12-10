package X;

import java.io.InputStream;

/* renamed from: X.8Qq  reason: invalid class name */
public final class AnonymousClass8Qq extends AnonymousClass3BP {
    public int A00;
    public final /* synthetic */ C162488Qs A01;

    public AnonymousClass8Qq(C162488Qs r1) {
        this.A01 = r1;
    }

    public AnonymousClass3BS A00() {
        C162488Qs r3 = this.A01;
        r3.A02();
        AnonymousClass8Qo[] r2 = r3.A00;
        int i = this.A00;
        this.A00 = i + 1;
        AnonymousClass8Qo r22 = r2[i];
        InputStream inputStream = r3.A03.getInputStream(r22.A01);
        try {
            return new AnonymousClass3BS(r22, inputStream);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public boolean A01() {
        C162488Qs r0 = this.A01;
        r0.A02();
        return AnonymousClass000.A1U(this.A00, r0.A00.length);
    }
}
