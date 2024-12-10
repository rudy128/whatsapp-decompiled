package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import java.io.Serializable;

/* renamed from: X.11G  reason: invalid class name */
public abstract class AnonymousClass11G implements AnonymousClass11F, Serializable {
    public final int arity;

    public AnonymousClass11G(int i) {
        this.arity = i;
    }

    public static C64012u4 A0J(AccountSwitchingContentProvider accountSwitchingContentProvider) {
        return (C64012u4) accountSwitchingContentProvider.A0A().get();
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String A00 = C60672oQ.A00(this);
        C18070vi.A0X(A00);
        return A00;
    }
}
