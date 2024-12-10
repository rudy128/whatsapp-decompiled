package X;

import java.util.Map;

public abstract class DMn implements C28579E8q {
    public abstract Map asMap();

    public boolean equals(Object obj) {
        return C24606CBk.equalsImpl(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public String toString() {
        return asMap().toString();
    }
}
