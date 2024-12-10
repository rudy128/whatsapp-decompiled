package X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.DXj  reason: case insensitive filesystem */
public final class C27174DXj implements AnonymousClass1JQ {
    public final File A00;
    public final Integer A01;

    public Iterator iterator() {
        return new C27349DcL(this);
    }

    public C27174DXj(File file, Integer num) {
        this.A00 = file;
        this.A01 = num;
    }
}
