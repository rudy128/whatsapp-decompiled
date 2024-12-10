package X;

public class BSC extends BSD {
    public C25524ChM A00;

    public synchronized void BSS() {
        C25524ChM chM = this.A00;
        if (chM != null) {
            chM.A01.getHeight();
        }
    }

    public synchronized void Bbq() {
        C25524ChM chM = this.A00;
        if (chM != null) {
            chM.A01.getWidth();
        }
    }

    public void close() {
        synchronized (this) {
            C25524ChM chM = this.A00;
            if (chM != null) {
                this.A00 = null;
                synchronized (chM) {
                }
            }
        }
    }

    public synchronized int getSizeInBytes() {
        int i;
        C25524ChM chM = this.A00;
        if (chM == null) {
            i = 0;
        } else {
            i = chM.A01.getSizeInBytes();
        }
        return i;
    }

    public synchronized boolean isClosed() {
        return AnonymousClass000.A1X(this.A00);
    }

    public BSC(C25524ChM chM) {
        this.A00 = chM;
    }
}
