package X;

import java.io.Serializable;

/* renamed from: X.0vm  reason: invalid class name and case insensitive filesystem */
public final class C18110vm implements C18100vl, Serializable {
    public volatile Object _value = C18120vn.A00;
    public C18090vk initializer;
    public final Object lock = this;

    public boolean Bf6() {
        if (this._value != C18120vn.A00) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this._value;
        C18120vn r0 = C18120vn.A00;
        if (obj2 != r0) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == r0) {
                C18090vk r02 = this.initializer;
                C18070vi.A0b(r02);
                obj = r02.invoke();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    public C18110vm(C18090vk r2) {
        this.initializer = r2;
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
