package X;

import java.util.Arrays;

public final class CWM {
    public long A00;
    public Integer A01 = AnonymousClass00R.A00;
    public final C25074CWj A02 = new C25074CWj();

    public final void A00() {
        C25074CWj cWj = this.A02;
        synchronized (cWj) {
            cWj.A01 = 0;
            cWj.A02 = 0;
            cWj.A00 = 0;
            Arrays.fill(cWj.A03, 0, 32, (Object) null);
        }
    }
}
