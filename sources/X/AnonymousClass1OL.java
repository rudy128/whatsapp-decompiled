package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1OL  reason: invalid class name */
public class AnonymousClass1OL {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02;
    public volatile /* synthetic */ Object _next$volatile = this;
    public volatile /* synthetic */ Object _prev$volatile = this;
    public volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<Object> cls = Object.class;
        Class<AnonymousClass1OL> cls2 = AnonymousClass1OL.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next$volatile");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev$volatile");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef$volatile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (X.C30561e9.A00(r4, r0, ((X.C57042iR) r2).A00, r3) == false) goto L_0x0001;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass1OL A00(X.AnonymousClass1OL r8) {
        /*
            r7 = 0
        L_0x0001:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A01
            java.lang.Object r5 = r6.get(r8)
            X.1OL r5 = (X.AnonymousClass1OL) r5
            r0 = r5
        L_0x000a:
            r4 = r7
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = A00
            java.lang.Object r2 = r3.get(r0)
            if (r2 != r8) goto L_0x001c
            if (r5 == r0) goto L_0x0053
            boolean r1 = X.C30561e9.A00(r8, r5, r0, r6)
            if (r1 != 0) goto L_0x0053
            goto L_0x0001
        L_0x001c:
            boolean r1 = r8 instanceof X.AnonymousClass3JV
            if (r1 != 0) goto L_0x0029
            java.lang.Object r1 = r8.A01()
            boolean r1 = r1 instanceof X.C57042iR
            if (r1 == 0) goto L_0x0029
            return r7
        L_0x0029:
            if (r2 == r7) goto L_0x0053
            boolean r1 = r2 instanceof X.C30521e5
            if (r1 == 0) goto L_0x0035
            X.1e5 r2 = (X.C30521e5) r2
            r2.A00(r0)
            goto L_0x0001
        L_0x0035:
            boolean r1 = r2 instanceof X.C57042iR
            if (r1 == 0) goto L_0x004e
            if (r4 == 0) goto L_0x0047
            X.2iR r2 = (X.C57042iR) r2
            X.1OL r1 = r2.A00
            boolean r0 = X.C30561e9.A00(r4, r0, r1, r3)
            if (r0 == 0) goto L_0x0001
            r0 = r4
            goto L_0x000a
        L_0x0047:
            java.lang.Object r0 = r6.get(r0)
            X.1OL r0 = (X.AnonymousClass1OL) r0
            goto L_0x000b
        L_0x004e:
            X.1OL r2 = (X.AnonymousClass1OL) r2
            r4 = r0
            r0 = r2
            goto L_0x000b
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OL.A00(X.1OL):X.1OL");
    }

    public final Object A01() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C30521e5)) {
                return obj;
            }
            ((C30521e5) obj).A00(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new C28237Dtx(this, 3));
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public final AnonymousClass1OL A02() {
        C57042iR r0;
        Object A012 = A01();
        if ((A012 instanceof C57042iR) && (r0 = (C57042iR) A012) != null) {
            return r0.A00;
        }
        C18070vi.A0z(A012, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (AnonymousClass1OL) A012;
    }
}
