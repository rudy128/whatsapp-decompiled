package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.Cbt  reason: case insensitive filesystem */
public abstract class C25254Cbt {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final DVM A03;

    public final void A00() {
        DVM dvm = this.A03;
        DVM dvm2 = DVM.A00;
        if (dvm.modCount != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01() {
        while (true) {
            int i = this.A00;
            DVM dvm = this.A03;
            DVM dvm2 = DVM.A00;
            if (i < dvm.length && dvm.presenceArray[i] < 0) {
                this.A00 = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        int i = this.A00;
        DVM dvm = this.A03;
        DVM dvm2 = DVM.A00;
        return AnonymousClass000.A1U(i, dvm.length);
    }

    public C25254Cbt(DVM dvm) {
        this.A03 = dvm;
        DVM dvm2 = DVM.A00;
        this.A02 = dvm.modCount;
        A01();
    }

    public final void remove() {
        A00();
        if (this.A01 != -1) {
            DVM dvm = this.A03;
            dvm.A05();
            DVM.A03(dvm, this.A01);
            this.A01 = -1;
            this.A02 = dvm.modCount;
            return;
        }
        throw AnonymousClass000.A0n("Call next() before removing element from the iterator.");
    }
}
