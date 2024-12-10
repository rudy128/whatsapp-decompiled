package X;

/* renamed from: X.3Gs  reason: invalid class name */
public abstract class AnonymousClass3Gs extends AnonymousClass1JG implements EEE {
    public final boolean syntheticJavaProperty;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass3Gs) {
                AnonymousClass1JG r4 = (AnonymousClass1JG) obj;
                if (!getOwner().equals(r4.getOwner()) || !this.name.equals(r4.name) || !this.signature.equals(r4.signature) || !C18070vi.A18(this.receiver, r4.receiver)) {
                    return false;
                }
            } else if (obj instanceof EEE) {
                return obj.equals(compute());
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Gs(Class cls, Object obj, String str, String str2, int i) {
        super(obj, cls, str, str2, AnonymousClass000.A1T(i & 1, 1));
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }

    /* renamed from: A00 */
    public EEE getReflected() {
        if (!this.syntheticJavaProperty) {
            return (EEE) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public AnonymousClass1JF compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        AnonymousClass1JF r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
    }

    public int hashCode() {
        return C17890vO.A02(this.name, AnonymousClass000.A0L(getOwner())) + this.signature.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.1JF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.1JF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1JF} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            X.1JF r1 = r2.compute()
            if (r1 != r2) goto L_0x0019
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "property "
            r1.append(r0)
            java.lang.String r0 = r2.name
            r1.append(r0)
            java.lang.String r0 = " (Kotlin reflection is not available)"
            r1.append(r0)
        L_0x0019:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Gs.toString():java.lang.String");
    }
}
