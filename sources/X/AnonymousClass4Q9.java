package X;

import java.util.LinkedList;

/* renamed from: X.4Q9  reason: invalid class name */
public final class AnonymousClass4Q9 {
    public final LinkedList A00;
    public final /* synthetic */ AnonymousClass3UB A01;

    public AnonymousClass4Q9(AnonymousClass3UB r3) {
        this.A01 = r3;
        LinkedList linkedList = new LinkedList();
        this.A00 = linkedList;
        linkedList.add(new C95004lX(r3));
    }

    public final boolean A00() {
        LinkedList linkedList = this.A00;
        if (!(!linkedList.isEmpty()) || !(C29431cG.A0d(linkedList) instanceof C95004lX)) {
            return false;
        }
        return true;
    }
}
