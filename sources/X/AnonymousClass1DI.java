package X;

import java.io.Serializable;

/* renamed from: X.1DI  reason: invalid class name */
public final class AnonymousClass1DI implements C18100vl, Serializable {
    public Object _value;
    public C18090vk initializer;

    public boolean Bf6() {
        if (this._value != C18120vn.A00) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj = this._value;
        if (obj != C18120vn.A00) {
            return obj;
        }
        C18090vk r0 = this.initializer;
        C18070vi.A0b(r0);
        Object invoke = r0.invoke();
        this._value = invoke;
        this.initializer = null;
        return invoke;
    }

    private final Object writeReplace() {
        return new C71043Do(getValue());
    }

    public String toString() {
        if (Bf6()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
