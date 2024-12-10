package X;

import java.util.List;

/* renamed from: X.BOe  reason: case insensitive filesystem */
public final class C22766BOe extends BOY implements E91 {
    public long A00;
    public E91 A01;
    public final C22767BOg A02;

    public void clear() {
        this.A00 = 0;
        this.A01 = null;
    }

    public List BPm(long j) {
        E91 e91 = this.A01;
        C26056CrS.A01(e91);
        return e91.BPm(j - this.A00);
    }

    public long BRP(int i) {
        E91 e91 = this.A01;
        C26056CrS.A01(e91);
        return e91.BRP(i) + this.A00;
    }

    public int BRQ() {
        E91 e91 = this.A01;
        C26056CrS.A01(e91);
        return e91.BRQ();
    }

    public int BVM(long j) {
        E91 e91 = this.A01;
        C26056CrS.A01(e91);
        return e91.BVM(j - this.A00);
    }

    public final void release() {
        this.A02.A07(this);
    }

    public C22766BOe(C22767BOg bOg) {
        this.A02 = bOg;
    }

    public C22766BOe() {
    }
}
