package X;

import android.os.Bundle;

/* renamed from: X.9rs  reason: invalid class name and case insensitive filesystem */
public final class C194529rs {
    public final Bundle A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194529rs) {
                C194529rs r5 = (C194529rs) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass001.A0k(this.A00) * 31, this.A01), this.A02);
    }

    public C194529rs(Bundle bundle, boolean z, boolean z2) {
        this.A00 = bundle;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Configuration(fragmentArgs=");
        A10.append(this.A00);
        A10.append(", finishAfterCompletion=");
        A10.append(this.A01);
        A10.append(", isInterop=");
        return C17900vP.A0F(A10, this.A02);
    }
}
