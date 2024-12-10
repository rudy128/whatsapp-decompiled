package X;

import java.lang.ref.WeakReference;

/* renamed from: X.C5z  reason: case insensitive filesystem */
public class C24483C5z {
    public CWV A00;
    public WeakReference A01;

    public synchronized void A00(CWV cwv) {
        this.A00 = cwv;
        if (cwv != null) {
            cwv.A00(this.A01);
        }
    }
}
