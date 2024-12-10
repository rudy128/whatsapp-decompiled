package X;

import java.io.Serializable;

/* renamed from: X.3BW  reason: invalid class name */
public abstract class AnonymousClass3BW implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public Object A00() {
        if (this instanceof AnonymousClass3K3) {
            return ((AnonymousClass3K3) this).reference;
        }
        throw AnonymousClass000.A0n("value is absent");
    }
}
