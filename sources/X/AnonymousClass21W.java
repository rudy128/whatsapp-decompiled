package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

/* renamed from: X.21W  reason: invalid class name */
public abstract class AnonymousClass21W extends AnonymousClass21V {
    public final AnonymousClass25F A00 = A0N(C692436l.class);

    public synchronized List A1G() {
        C692436l r0 = (C692436l) this.A00.A02;
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public synchronized void A1H(List list) {
        this.A00.A02(new C692436l(list));
        if (C137476vW.A00(list)) {
            A0X(DefaultCrypto.BUFFER_SIZE);
        } else {
            A0V(DefaultCrypto.BUFFER_SIZE);
        }
    }

    public AnonymousClass21W(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }

    public C693336u A0O() {
        C693336u A0O = super.A0O();
        C17960vV.A07(A0O);
        return A0O;
    }
}
