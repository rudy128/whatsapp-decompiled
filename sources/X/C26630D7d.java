package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.D7d  reason: case insensitive filesystem */
public class C26630D7d implements C28645ECd, E3j {
    public final Path A00 = C108945cZ.A0L();
    public final Path A01 = C108945cZ.A0L();
    public final Path A02 = C108945cZ.A0L();
    public final List A03 = AnonymousClass000.A13();
    public final C26649D7y A04;

    public void CIY(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.A03;
            if (i < list3.size()) {
                ((E7G) list3.get(i)).CIY(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    public Path BWP() {
        Path.Op op;
        Matrix matrix;
        Matrix matrix2;
        Path path = this.A01;
        path.reset();
        C26649D7y d7y = this.A04;
        if (!d7y.A01) {
            int intValue = d7y.A00.intValue();
            if (intValue == 0) {
                int i = 0;
                while (true) {
                    List list = this.A03;
                    if (i >= list.size()) {
                        break;
                    }
                    path.addPath(((C28645ECd) list.get(i)).BWP());
                    i++;
                }
            } else {
                if (intValue == 1) {
                    op = Path.Op.UNION;
                } else if (intValue == 2) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else if (intValue == 3) {
                    op = Path.Op.INTERSECT;
                } else if (intValue == 4) {
                    op = Path.Op.XOR;
                }
                Path path2 = this.A02;
                path2.reset();
                Path path3 = this.A00;
                path3.reset();
                List list2 = this.A03;
                for (int size = list2.size() - 1; size >= 1; size--) {
                    C28645ECd eCd = (C28645ECd) list2.get(size);
                    if (eCd instanceof C26636D7j) {
                        List A002 = ((C26636D7j) eCd).A00();
                        for (int A022 = AnonymousClass3MX.A02(A002, 1); A022 >= 0; A022--) {
                            Path BWP = ((C28645ECd) A002.get(A022)).BWP();
                            C26636D7j d7j = (C26636D7j) eCd;
                            C25266Cc7 cc7 = d7j.A00;
                            if (cc7 != null) {
                                matrix2 = cc7.A00();
                            } else {
                                matrix2 = d7j.A02;
                                matrix2.reset();
                            }
                            BWP.transform(matrix2);
                            path2.addPath(BWP);
                        }
                    } else {
                        path2.addPath(eCd.BWP());
                    }
                }
                C28645ECd eCd2 = (C28645ECd) list2.get(0);
                if (eCd2 instanceof C26636D7j) {
                    C26636D7j d7j2 = (C26636D7j) eCd2;
                    List A003 = d7j2.A00();
                    for (int i2 = 0; i2 < A003.size(); i2++) {
                        Path BWP2 = ((C28645ECd) A003.get(i2)).BWP();
                        C25266Cc7 cc72 = d7j2.A00;
                        if (cc72 != null) {
                            matrix = cc72.A00();
                        } else {
                            matrix = d7j2.A02;
                            matrix.reset();
                        }
                        BWP2.transform(matrix);
                        path3.addPath(BWP2);
                    }
                } else {
                    path3.set(eCd2.BWP());
                }
                path.op(path3, path2, op);
                return path;
            }
        }
        return path;
    }

    public C26630D7d(C26649D7y d7y) {
        this.A04 = d7y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BAN(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.previous()
            boolean r0 = r1 instanceof X.C28645ECd
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = r2.A03
            r0.add(r1)
            r3.remove()
            goto L_0x000d
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26630D7d.BAN(java.util.ListIterator):void");
    }

    public String getName() {
        throw AnonymousClass04E.createAndThrow();
    }
}
