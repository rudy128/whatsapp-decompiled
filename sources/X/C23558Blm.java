package X;

import java.io.Serializable;

/* renamed from: X.Blm  reason: case insensitive filesystem */
public final class C23558Blm extends DUS implements Serializable {
    public static final long serialVersionUID = 0;
    public final DUS forwardOrder;

    public int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23558Blm) {
            return this.forwardOrder.equals(((C23558Blm) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public C23558Blm(DUS dus) {
        C199610h.A04(dus);
        this.forwardOrder = dus;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.forwardOrder);
        return AnonymousClass000.A0y(".reverse()", A10);
    }
}
