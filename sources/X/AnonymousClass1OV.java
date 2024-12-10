package X;

import java.io.Serializable;

/* renamed from: X.1OV  reason: invalid class name */
public final class AnonymousClass1OV implements C18560wh, Serializable {
    public final C18570wi element;
    public final C18560wh left;

    public AnonymousClass1OV(C18570wi r2, C18560wh r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.left = r3;
        this.element = r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4rD] */
    private final Object writeReplace() {
        int i = 2;
        AnonymousClass1OV r1 = this;
        while (true) {
            C18560wh r12 = r1.left;
            if (!(r12 instanceof AnonymousClass1OV) || (r1 = (AnonymousClass1OV) r12) == null) {
                C18560wh[] r3 = new C18560wh[i];
                ? obj = new Object();
                fold(C27621Wu.A00, new AnonymousClass3J6(obj, r3));
            } else {
                i++;
            }
        }
        C18560wh[] r32 = new C18560wh[i];
        ? obj2 = new Object();
        fold(C27621Wu.A00, new AnonymousClass3J6(obj2, r32));
        if (obj2.element == i) {
            return new C70443Bb(r32);
        }
        throw new IllegalStateException("Check failed.");
    }

    public Object fold(Object obj, AnonymousClass1OS r4) {
        C18070vi.A0d(r4, 1);
        return r4.invoke(this.left.fold(obj, r4), this.element);
    }

    public C18570wi get(C23801Hr r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass1OV r1 = this;
        while (true) {
            C18570wi r0 = r1.element.get(r3);
            if (r0 != null) {
                return r0;
            }
            C18560wh r12 = r1.left;
            if (!(r12 instanceof AnonymousClass1OV)) {
                return r12.get(r3);
            }
            r1 = (AnonymousClass1OV) r12;
        }
    }

    public C18560wh minusKey(C23801Hr r4) {
        C18560wh r1;
        C18070vi.A0d(r4, 0);
        if (this.element.get(r4) != null) {
            return this.left;
        }
        C18560wh minusKey = this.left.minusKey(r4);
        if (minusKey == this.left) {
            r1 = this;
        } else if (minusKey == AnonymousClass1OR.A00) {
            r1 = this.element;
        } else {
            r1 = new AnonymousClass1OV(this.element, minusKey);
        }
        return r1;
    }

    public C18560wh plus(C18560wh r3) {
        C18070vi.A0d(r3, 1);
        if (r3 != AnonymousClass1OR.A00) {
            return (C18560wh) r3.fold(this, AnonymousClass1OT.A00);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[LOOP:2: B:16:0x0029->B:20:0x003f, LOOP_START, PHI: r1 
      PHI: (r1v4 X.1OV) = (r1v3 X.1OV), (r1v7 X.1OV) binds: [B:15:0x0027, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0057
            boolean r0 = r6 instanceof X.AnonymousClass1OV
            if (r0 == 0) goto L_0x0059
            X.1OV r6 = (X.AnonymousClass1OV) r6
            r4 = 2
            r1 = r6
        L_0x000a:
            X.0wh r1 = r1.left
            boolean r0 = r1 instanceof X.AnonymousClass1OV
            if (r0 == 0) goto L_0x0017
            X.1OV r1 = (X.AnonymousClass1OV) r1
            if (r1 == 0) goto L_0x0017
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0017:
            r1 = r5
            r3 = 2
            r2 = r5
        L_0x001a:
            X.0wh r2 = r2.left
            boolean r0 = r2 instanceof X.AnonymousClass1OV
            if (r0 == 0) goto L_0x0027
            X.1OV r2 = (X.AnonymousClass1OV) r2
            if (r2 == 0) goto L_0x0027
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0027:
            if (r4 != r3) goto L_0x0059
        L_0x0029:
            X.0wi r2 = r1.element
            X.1Hr r0 = r2.getKey()
            X.0wi r0 = r6.get(r0)
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x0059
            X.0wh r1 = r1.left
            boolean r0 = r1 instanceof X.AnonymousClass1OV
            if (r0 == 0) goto L_0x0042
            X.1OV r1 = (X.AnonymousClass1OV) r1
            goto L_0x0029
        L_0x0042:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            X.C18070vi.A0z(r1, r0)
            X.0wi r1 = (X.C18570wi) r1
            X.1Hr r0 = r1.getKey()
            X.0wi r0 = r6.get(r0)
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r0 = 1
            return r0
        L_0x0059:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OV.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append((String) fold("", AnonymousClass3J8.A00));
        sb.append(']');
        return sb.toString();
    }
}
