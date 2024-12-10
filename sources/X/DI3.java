package X;

import android.os.Bundle;

@Deprecated
public final class DI3 implements C28622EAu {
    public static final DI3 A02 = new DI3((String) null, AnonymousClass000.A0h());
    public final boolean A00;
    public final String A01;

    public DI3(String str, Boolean bool) {
        this.A00 = bool.booleanValue();
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof DI3) {
                DI3 di3 = (DI3) obj;
                if (this.A00 != di3.A00 || !C25332Cdd.A01(this.A01, di3.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Bundle A00() {
        Bundle A0D = C17880vN.A0D();
        A0D.putString("consumer_package", (String) null);
        A0D.putBoolean("force_save_dialog", this.A00);
        A0D.putString("log_session_id", this.A01);
        return A0D;
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = null;
        BE8.A1O(A1a, this.A00);
        return AnonymousClass000.A0P(this.A01, A1a, 2);
    }
}
