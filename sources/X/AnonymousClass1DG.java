package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1DG  reason: invalid class name */
public final class AnonymousClass1DG implements C18100vl, Serializable {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass1DG.class, Object.class, "_value");
    public volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    public final Object f0final;
    public volatile C18090vk initializer;

    public boolean Bf6() {
        if (this._value != C18120vn.A00) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj = this._value;
        C18120vn r1 = C18120vn.A00;
        if (obj == r1) {
            C18090vk r0 = this.initializer;
            if (r0 != null) {
                obj = r0.invoke();
                if (C30561e9.A00(this, r1, obj, A00)) {
                    this.initializer = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    public AnonymousClass1DG(C18090vk r2) {
        this.initializer = r2;
        C18120vn r0 = C18120vn.A00;
        this._value = r0;
        this.f0final = r0;
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
