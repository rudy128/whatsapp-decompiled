package X;

import java.util.List;

/* renamed from: X.2hn  reason: invalid class name and case insensitive filesystem */
public final class C56642hn {
    public final AnonymousClass1UD A00;

    public C56642hn(AnonymousClass1UD r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(String str) {
        if (this.A00.A0C()) {
            List A0R = AnonymousClass1YF.A0R(AnonymousClass1YF.A0I(str), new char[]{' '});
            List A0R2 = AnonymousClass1YF.A0R("imagine me", new char[]{' '});
            if (A0R.size() >= A0R2.size()) {
                int i = 0;
                for (Object next : A0R) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str2 = (String) next;
                        if (A0R2.size() < i + 1) {
                            break;
                        } else if (AnonymousClass1YE.A09(C17880vN.A0w(A0R2, i), str2, true)) {
                            i = i2;
                        }
                    } else {
                        AnonymousClass1ZU.A0B();
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
