package X;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Ka  reason: invalid class name */
public class AnonymousClass8Ka extends C188399hM {
    public static AnonymousClass8Ka A08;
    public int A00;
    public long A01;
    public Integer A02;
    public Thread A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public final C185339cQ A07;

    public AnonymousClass8Ka(C185339cQ r3) {
        this.A06 = false;
        this.A05 = false;
        this.A02 = AnonymousClass00R.A00;
        this.A00 = 0;
        this.A07 = r3;
    }

    public void A00() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i <= 0) {
            this.A00 = 0;
            this.A08 = null;
            this.A06 = null;
            this.A07 = null;
            this.A05 = -1;
            this.A09 = true;
            this.A02 = -1;
            this.A01 = -1;
            this.A04 = -1;
            this.A03 = -1;
            this.A00 = 0;
            this.A01 = -1;
            this.A03 = null;
            this.A05 = false;
            this.A06 = false;
            this.A02 = AnonymousClass00R.A00;
            List list = this.A04;
            if (list != null) {
                list.clear();
            }
            C185339cQ r3 = this.A07;
            if (r3 != null) {
                AtomicInteger atomicInteger = r3.A02;
                if (atomicInteger.get() < 256) {
                    LinkedList linkedList = r3.A01;
                    synchronized (linkedList) {
                        linkedList.addLast(this);
                        atomicInteger.set(linkedList.size());
                    }
                }
            }
        }
    }

    public AnonymousClass8Ka() {
        this.A06 = false;
        this.A05 = false;
        this.A02 = AnonymousClass00R.A00;
        this.A00 = 0;
        this.A07 = null;
    }
}
