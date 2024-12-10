package X;

import android.content.Intent;

/* renamed from: X.6qL  reason: invalid class name and case insensitive filesystem */
public final class C134286qL {
    public final Intent A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134286qL) && C18070vi.A18(this.A00, ((C134286qL) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C134286qL(Intent intent) {
        this.A00 = intent;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LaunchIntent(intent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
