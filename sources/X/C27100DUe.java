package X;

import java.util.Enumeration;

/* renamed from: X.DUe  reason: case insensitive filesystem */
public class C27100DUe implements Enumeration {
    public final Enumeration A00;
    public final /* synthetic */ C28280Dwo A01;

    public C27100DUe(Enumeration enumeration, C28280Dwo dwo) {
        this.A01 = dwo;
        this.A00 = enumeration;
    }

    public boolean hasMoreElements() {
        return this.A00.hasMoreElements();
    }

    public Object nextElement() {
        return C28303DxB.A01(this.A00.nextElement());
    }
}
