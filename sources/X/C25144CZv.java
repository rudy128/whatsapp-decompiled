package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.CZv  reason: case insensitive filesystem */
public final class C25144CZv {
    public final TimeUnit A00;

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof C25144CZv);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass8BV.A00(100));
    }

    public C25144CZv(TimeUnit timeUnit) {
        this.A00 = timeUnit;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Emitter(duration=");
        A10.append(100);
        A10.append(", timeUnit=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
