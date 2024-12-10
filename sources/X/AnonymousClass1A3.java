package X;

import java.util.NoSuchElementException;

/* renamed from: X.1A3  reason: invalid class name */
public final class AnonymousClass1A3 {
    public static final AnonymousClass1A3 A01 = new AnonymousClass1A3();
    public final Object A00;

    public Object A00() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1A3)) {
            return false;
        }
        return C42171xk.A00(this.A00, ((AnonymousClass1A3) obj).A00);
    }

    public int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.A00;
        if (obj == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{obj});
    }

    public AnonymousClass1A3(Object obj) {
        C17960vV.A07(obj);
        this.A00 = obj;
    }

    public AnonymousClass1A3() {
        this.A00 = null;
    }
}
