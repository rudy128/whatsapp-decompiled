package X;

import java.util.Iterator;

/* renamed from: X.DcW  reason: case insensitive filesystem */
public final class C27360DcW extends C25254Cbt implements Iterator, C18450wR {
    public Object next() {
        A00();
        int i = this.A00;
        DVM dvm = this.A03;
        DVM dvm2 = DVM.A00;
        if (i < dvm.length) {
            this.A00 = i + 1;
            this.A01 = i;
            Object obj = dvm.keysArray[i];
            A01();
            return obj;
        }
        throw BE6.A14();
    }
}
