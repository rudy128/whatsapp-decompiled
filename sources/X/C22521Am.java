package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Am  reason: invalid class name and case insensitive filesystem */
public abstract class C22521Am extends PhantomReference {
    public C22521Am next;
    public C22521Am previous;

    public abstract void destruct();

    public C22521Am(Object obj) {
        super(obj, AnonymousClass1Ea.A02);
        AtomicReference atomicReference;
        C22521Am r0;
        C22981Eb r2 = AnonymousClass1Ea.A01;
        do {
            atomicReference = r2.A00;
            r0 = (C22521Am) atomicReference.get();
            this.next = r0;
        } while (!AnonymousClass00N.A00(r0, this, atomicReference));
    }

    public C22521Am() {
        super((Object) null, AnonymousClass1Ea.A02);
    }
}
