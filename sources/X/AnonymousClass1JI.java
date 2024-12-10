package X;

/* renamed from: X.1JI  reason: invalid class name */
public abstract class AnonymousClass1JI extends AnonymousClass1JG implements AnonymousClass1JH, AnonymousClass11F {
    public final int arity;
    public final int flags;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass1JI) {
                AnonymousClass1JI r4 = (AnonymousClass1JI) obj;
                if (!this.name.equals(r4.name) || !this.signature.equals(r4.signature) || this.flags != r4.flags || this.arity != r4.arity || !C18070vi.A18(this.receiver, r4.receiver) || !C18070vi.A18(getOwner(), r4.getOwner())) {
                    return false;
                }
            } else if (obj instanceof AnonymousClass1JH) {
                return obj.equals(compute());
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JI(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public AnonymousClass1JF computeReflected() {
        return this;
    }

    public int getArity() {
        return this.arity;
    }

    public AnonymousClass1JH getReflected() {
        return (AnonymousClass1JH) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    public boolean isExternal() {
        ((AnonymousClass1JH) super.getReflected()).isExternal();
        throw null;
    }

    public boolean isInfix() {
        ((AnonymousClass1JH) super.getReflected()).isInfix();
        throw null;
    }

    public boolean isInline() {
        ((AnonymousClass1JH) super.getReflected()).isInline();
        throw null;
    }

    public boolean isOperator() {
        ((AnonymousClass1JH) super.getReflected()).isOperator();
        throw null;
    }

    public boolean isSuspend() {
        ((AnonymousClass1JH) super.getReflected()).isSuspend();
        throw null;
    }

    public String toString() {
        AnonymousClass1JF compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        String str = this.name;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("function ");
        sb.append(str);
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
