package X;

import java.util.Iterator;

/* renamed from: X.0Zo  reason: invalid class name and case insensitive filesystem */
public final class C06760Zo implements Iterator, C18450wR {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0Qu A02;

    public C06760Zo(AnonymousClass0Qu r1, int i, int i2) {
        this.A01 = i2;
        this.A02 = r1;
        this.A00 = i;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public Object next() {
        if (!hasNext()) {
            return null;
        }
        AnonymousClass0Qu r3 = this.A02;
        Object[] objArr = r3.A0H;
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= r3.A0B) {
            i += r3.A09;
        }
        return objArr[i];
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }
}
