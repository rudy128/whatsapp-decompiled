package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1AT  reason: invalid class name */
public abstract class AnonymousClass1AT extends PhantomReference {
    public AnonymousClass1AT next;
    public AnonymousClass1AT previous;

    public abstract void destruct();

    public AnonymousClass1AT(Object obj) {
        super(obj, C24730CHs.A02);
        AtomicReference atomicReference;
        AnonymousClass1AT r0;
        C24779CJw cJw = C24730CHs.A01;
        do {
            atomicReference = cJw.A00;
            r0 = (AnonymousClass1AT) atomicReference.get();
            this.next = r0;
        } while (!AnonymousClass00N.A00(r0, this, atomicReference));
    }

    public AnonymousClass1AT() {
        super((Object) null, C24730CHs.A02);
    }
}
