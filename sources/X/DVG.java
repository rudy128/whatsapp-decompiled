package X;

import java.util.Map;

public abstract class DVG implements Map.Entry {
    public abstract Object getKey();

    public abstract Object getValue();

    public abstract Object setValue(Object obj);

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C24604CBi.A00(getKey(), entry.getKey()) || !C24604CBi.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0k(getKey()) ^ C17880vN.A02(getValue());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(getKey());
        A10.append("=");
        return C17890vO.A0V(getValue(), A10);
    }
}
