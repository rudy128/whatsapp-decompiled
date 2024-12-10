package X;

import java.io.Serializable;

/* renamed from: X.1eK  reason: invalid class name and case insensitive filesystem */
public final class C30671eK implements Serializable {
    public final Object value;

    public static final Throwable A00(Object obj) {
        if (obj instanceof AnonymousClass1IU) {
            return ((AnonymousClass1IU) obj).exception;
        }
        return null;
    }

    public boolean equals(Object obj) {
        Object obj2 = this.value;
        if (!(obj instanceof C30671eK) || !C18070vi.A18(obj2, ((C30671eK) obj).value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.value;
        if (obj instanceof AnonymousClass1IU) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C30671eK(Object obj) {
        this.value = obj;
    }
}
