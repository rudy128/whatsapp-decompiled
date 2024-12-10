package X;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: X.DcL  reason: case insensitive filesystem */
public final class C27349DcL extends DV6 {
    public final ArrayDeque A00;
    public final /* synthetic */ C27174DXj A01;

    public C27349DcL(C27174DXj dXj) {
        Object dfS;
        this.A01 = dXj;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A00 = arrayDeque;
        File file = dXj.A00;
        if (file.isDirectory()) {
            if (this.A01.A01.intValue() != 0) {
                dfS = new C27439DfQ(file, this);
            } else {
                dfS = new C27438DfP(file, this);
            }
        } else if (file.isFile()) {
            dfS = new C27441DfS(file, this);
        } else {
            this.A00 = 2;
            return;
        }
        arrayDeque.push(dfS);
    }
}
