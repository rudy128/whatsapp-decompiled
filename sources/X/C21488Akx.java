package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Akx  reason: case insensitive filesystem */
public final class C21488Akx implements Iterator, C30391dr, C18450wR {
    public int A00;
    public C30391dr A01;
    public Object A02;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void A00(Object obj, C30391dr r3) {
        this.A02 = obj;
        this.A00 = 3;
        this.A01 = r3;
    }

    public boolean hasNext() {
        int i;
        while (true) {
            i = this.A00;
            if (i != 0) {
                break;
            }
            this.A00 = 5;
            C30391dr r1 = this.A01;
            C18070vi.A0b(r1);
            this.A01 = null;
            r1.resumeWith(C27621Wu.A00);
        }
        if (i == 1) {
            C18070vi.A0b((Object) null);
            throw AnonymousClass000.A0s("hasNext");
        } else if (i == 2 || i == 3) {
            return true;
        } else {
            if (i == 4) {
                return false;
            }
            throw AnonymousClass000.A0n("Iterator has failed.");
        }
    }

    public Object next() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.A00 = 1;
            C18070vi.A0b((Object) null);
            throw AnonymousClass000.A0s("next");
        } else if (i == 3) {
            this.A00 = 0;
            Object obj = this.A02;
            this.A02 = null;
            return obj;
        } else if (i != 4) {
            throw AnonymousClass000.A0n("Iterator has failed.");
        } else {
            throw new NoSuchElementException();
        }
    }

    public C18560wh getContext() {
        return AnonymousClass1OR.A00;
    }

    public void resumeWith(Object obj) {
        C30691eM.A01(obj);
        this.A00 = 4;
    }
}
