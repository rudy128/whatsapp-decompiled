package X;

import java.util.Iterator;

/* renamed from: X.DcV  reason: case insensitive filesystem */
public final class C27359DcV extends C25254Cbt implements Iterator, C18450wR {
    public /* bridge */ /* synthetic */ Object next() {
        A00();
        int i = this.A00;
        DVM dvm = this.A03;
        DVM dvm2 = DVM.A00;
        if (i < dvm.length) {
            this.A00 = i + 1;
            this.A01 = i;
            DVK dvk = new DVK(dvm, i);
            A01();
            return dvk;
        }
        throw BE6.A14();
    }
}
