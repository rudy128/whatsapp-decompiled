package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.DUt  reason: case insensitive filesystem */
public final class C27110DUt implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ DSP A02;

    public C27110DUt(DSP dsp) {
        this.A02 = dsp;
        this.A01 = dsp.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        try {
            DSP dsp = this.A02;
            int i = this.A00;
            this.A00 = i + 1;
            return Byte.valueOf(dsp.A01(i));
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw C17880vN.A0y();
    }
}
