package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1e5  reason: invalid class name and case insensitive filesystem */
public abstract class C30521e5 {
    public Object A00(Object obj) {
        boolean z;
        AnonymousClass1OL r1;
        AnonymousClass3JW r3 = (AnonymousClass3JW) this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass3JW.A00;
        Object obj2 = atomicReferenceFieldUpdater.get(r3);
        Object obj3 = AnonymousClass2WB.A00;
        if (obj2 == obj3) {
            Object A01 = r3.A01();
            obj2 = atomicReferenceFieldUpdater.get(r3);
            if (obj2 == obj3) {
                if (!C30561e9.A00(r3, obj3, A01, atomicReferenceFieldUpdater)) {
                    A01 = atomicReferenceFieldUpdater.get(r3);
                }
                obj2 = A01;
            }
        }
        AnonymousClass3JU r32 = (AnonymousClass3JU) r3;
        if (obj2 == null) {
            z = true;
            r1 = r32.A01;
        } else {
            z = false;
            r1 = r32.A00;
        }
        if (r1 != null && C30561e9.A00(obj, r32, r1, AnonymousClass1OL.A00) && z) {
            AnonymousClass1OL r4 = r32.A01;
            AnonymousClass1OL r33 = r32.A00;
            C18070vi.A0b(r33);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AnonymousClass1OL.A01;
            while (true) {
                Object obj4 = atomicReferenceFieldUpdater2.get(r33);
                if (r4.A01() != r33) {
                    break;
                } else if (C30561e9.A00(r33, obj4, r4, atomicReferenceFieldUpdater2)) {
                    if (!(r4 instanceof AnonymousClass3JV) && (r4.A01() instanceof C57042iR)) {
                        AnonymousClass1OL.A00(r33);
                    }
                }
            }
        }
        return obj2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
