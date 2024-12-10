package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.A0z  reason: case insensitive filesystem */
public class C19964A0z {
    public LinkedList A00 = AnonymousClass8BR.A14();
    public C20082A6i A01 = new C20082A6i();
    public boolean A02 = true;

    public void A00() {
        C20082A6i a6i = new C20082A6i();
        LinkedList linkedList = this.A00;
        linkedList.addFirst(this.A01);
        this.A01 = a6i;
        if (linkedList.size() > 40) {
            linkedList.removeLast();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.A6i, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.A6i, java.lang.Object] */
    public C19964A0z(byte[] bArr) {
        C164598Zl r2 = (C164598Zl) C23577Bm6.A07(C164598Zl.DEFAULT_INSTANCE, bArr);
        C166068cI r1 = r2.currentSession_;
        r1 = r1 == null ? C166068cI.DEFAULT_INSTANCE : r1;
        ? obj = new Object();
        obj.A00 = r1;
        this.A01 = obj;
        this.A02 = false;
        for (C166068cI r22 : r2.previousSessions_) {
            LinkedList linkedList = this.A00;
            ? obj2 = new Object();
            obj2.A00 = r22;
            linkedList.add(obj2);
        }
    }

    public byte[] A01() {
        LinkedList A14 = AnonymousClass8BR.A14();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            A14.add(((C20082A6i) it.next()).A00);
        }
        C23624Bmt A0N = C164598Zl.DEFAULT_INSTANCE.A0N();
        DND.A09(A14, AnonymousClass8BY.A0H(A0N, this.A01.A00));
        return AnonymousClass8BT.A1Z(A0N);
    }

    public C19964A0z() {
    }
}
