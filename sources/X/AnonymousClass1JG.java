package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: X.1JG  reason: invalid class name */
public abstract class AnonymousClass1JG implements AnonymousClass1JF, Serializable {
    public static final Object NO_RECEIVER = AnonymousClass1JK.A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient AnonymousClass1JF reflected;
    public final String signature;

    public abstract AnonymousClass1JF computeReflected();

    public AnonymousClass1JF compute() {
        AnonymousClass1JF r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
    }

    public AnonymousClass20C getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return new C71093Dt(cls);
        }
        return new AnonymousClass20F(cls);
    }

    public AnonymousClass1JG(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        getReflected().call(objArr);
        throw null;
    }

    public Object callBy(Map map) {
        getReflected().callBy(map);
        throw null;
    }

    public List getAnnotations() {
        getReflected().getAnnotations();
        throw null;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public List getParameters() {
        getReflected().getParameters();
        throw null;
    }

    public AnonymousClass1JF getReflected() {
        AnonymousClass1JF compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new AnonymousClass2RI();
    }

    public AnonymousClass3MU getReturnType() {
        getReflected().getReturnType();
        throw null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List getTypeParameters() {
        getReflected().getTypeParameters();
        throw null;
    }

    public AnonymousClass9I4 getVisibility() {
        getReflected().getVisibility();
        throw null;
    }

    public boolean isAbstract() {
        getReflected().isAbstract();
        throw null;
    }

    public boolean isFinal() {
        getReflected().isFinal();
        throw null;
    }

    public boolean isOpen() {
        getReflected().isOpen();
        throw null;
    }

    public boolean isSuspend() {
        getReflected().isSuspend();
        throw null;
    }
}
