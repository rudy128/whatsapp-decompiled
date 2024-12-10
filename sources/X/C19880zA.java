package X;

import java.io.Serializable;

/* renamed from: X.0zA  reason: invalid class name and case insensitive filesystem */
public abstract class C19880zA implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public Object A03() {
        if (this instanceof C23631Ha) {
            return ((C23631Ha) this).reference;
        }
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public Object A04() {
        if (this instanceof C23631Ha) {
            return ((C23631Ha) this).reference;
        }
        return null;
    }

    public Object A06(Object obj) {
        if (this instanceof C23631Ha) {
            C199610h.A05(obj, "use Optional.orNull() instead of Optional.or(null)");
            return ((C23631Ha) this).reference;
        }
        C199610h.A05(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    public boolean A07() {
        if (this instanceof C19890zB) {
            return false;
        }
        return true;
    }

    public static C19890zB A00() {
        return C19890zB.A00;
    }

    public static C23631Ha A01(Object obj) {
        C199610h.A04(obj);
        return new C23631Ha(obj);
    }

    public static void A02(C19880zA r0) {
        ((AnonymousClass00H) r0.A03()).get();
    }

    public Object A05(C27271Vk r3) {
        Object obj = r3.get();
        C199610h.A05(obj, "use Optional.orNull() instead of a Supplier that returns null");
        return obj;
    }
}
