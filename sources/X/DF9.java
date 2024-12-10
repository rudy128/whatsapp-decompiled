package X;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class DF9 implements EDN {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public boolean BEI(C26552D3s d3s, File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((EDN) it.next()).BEI(d3s, file)) {
                return false;
            }
        }
        return true;
    }

    public void C28(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C28(d3s);
        }
    }

    public void C29(C26552D3s d3s, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C29(d3s, i);
        }
    }

    public void C8u(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C8u(d3s);
        }
    }

    public void C8v(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C8v(i, i2, i3, i4);
        }
    }

    public void C8w(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C8w(d3s);
        }
    }

    public void C8x(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C8x(d3s);
        }
    }

    public void C8y(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((EDN) it.next()).C8y(d3s);
        }
    }

    public void C8z(C26552D3s d3s, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((E9D) it.next()).C8z(d3s, i);
        }
    }

    public void C90(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((E9D) it.next()).C90(d3s);
        }
    }

    public void C91(C26552D3s d3s, Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((E9D) it.next()).C91(d3s, th);
        }
    }

    public void C92(C26552D3s d3s) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((E9D) it.next()).C92(d3s);
        }
    }
}
