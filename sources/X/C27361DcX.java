package X;

import java.util.Iterator;

/* renamed from: X.DcX  reason: case insensitive filesystem */
public final class C27361DcX extends C25254Cbt implements Iterator, C18450wR {
    public Object next() {
        A00();
        int i = this.A00;
        DVM dvm = this.A03;
        DVM dvm2 = DVM.A00;
        if (i < dvm.length) {
            this.A00 = i + 1;
            this.A01 = i;
            Object[] objArr = dvm.valuesArray;
            C18070vi.A0b(objArr);
            Object obj = objArr[this.A01];
            A01();
            return obj;
        }
        throw BE6.A14();
    }
}
