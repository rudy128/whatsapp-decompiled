package X;

import java.util.List;

/* renamed from: X.7Sq  reason: invalid class name and case insensitive filesystem */
public class C147307Sq implements C1604388m {
    public int A00 = -1;
    public final int A01;
    public final List A02;

    public String readLine() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i < this.A01) {
            return ((C128216fd) this.A02.get(i)).A00;
        }
        return null;
    }

    public C147307Sq(List list) {
        this.A02 = list;
        this.A01 = list.size();
    }
}
