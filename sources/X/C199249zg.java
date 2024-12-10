package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.9zg  reason: invalid class name and case insensitive filesystem */
public class C199249zg {
    public boolean A00;
    public final AnonymousClass9XJ A01;
    public final LinkedList A02;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9XJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.9XJ, java.lang.Object] */
    public C199249zg(byte[] bArr) {
        this.A02 = AnonymousClass8BR.A14();
        this.A00 = false;
        C164598Zl r2 = (C164598Zl) C23577Bm6.A07(C164598Zl.DEFAULT_INSTANCE, bArr);
        C166068cI r1 = r2.currentSession_;
        r1 = r1 == null ? C166068cI.DEFAULT_INSTANCE : r1;
        ? obj = new Object();
        obj.A00 = r1;
        this.A01 = obj;
        this.A00 = false;
        for (C166068cI r22 : r2.previousSessions_) {
            LinkedList linkedList = this.A02;
            ? obj2 = new Object();
            obj2.A00 = r22;
            linkedList.add(obj2);
        }
    }

    public byte[] A00() {
        LinkedList A14 = AnonymousClass8BR.A14();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A14.add(((AnonymousClass9XJ) it.next()).A00);
        }
        C23624Bmt A0N = C164598Zl.DEFAULT_INSTANCE.A0N();
        DND.A09(A14, AnonymousClass8BY.A0H(A0N, this.A01.A00));
        return AnonymousClass8BT.A1Z(A0N);
    }

    public C199249zg() {
        this.A02 = AnonymousClass8BR.A14();
        this.A00 = true;
        this.A01 = new AnonymousClass9XJ();
    }
}
