package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.1uh  reason: invalid class name and case insensitive filesystem */
public class C40431uh {
    public static final Executor A07 = new C40441ui();
    public int A00;
    public List A01;
    public List A02;
    public Executor A03;
    public final C40481um A04;
    public final C40451uj A05;
    public final List A06;

    public void A00(Runnable runnable, List list) {
        int i = this.A00 + 1;
        this.A00 = i;
        List list2 = this.A01;
        Runnable runnable2 = runnable;
        List list3 = list;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.A01 = null;
                this.A02 = Collections.emptyList();
                this.A05.C34(0, size);
            } else if (list2 == null) {
                this.A01 = list;
                this.A02 = Collections.unmodifiableList(list);
                this.A05.Bw0(0, list.size());
            } else {
                this.A04.A01.execute(new AnonymousClass7Q7(this, runnable2, list3, list2, i, 0));
                return;
            }
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C40431uh(C40481um r2, C40451uj r3) {
        this.A06 = new CopyOnWriteArrayList();
        this.A02 = Collections.emptyList();
        this.A05 = r3;
        this.A04 = r2;
        this.A03 = A07;
    }

    public C40431uh(C40411uf r3, C38391rD r4) {
        this(new C40471ul(r3).A00(), (C40451uj) new C40461uk(r4));
    }
}
