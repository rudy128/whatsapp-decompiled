package X;

import java.util.ArrayList;

/* renamed from: X.1s4  reason: invalid class name and case insensitive filesystem */
public abstract class C38881s4 extends C38871s3 {
    public ArrayList A00 = new ArrayList();

    public abstract void A0J();

    public void A07() {
        this.A00.clear();
        super.A07();
    }

    public void A0B(C39001sK r4) {
        super.A0B(r4);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((C38871s3) this.A00.get(i)).A0B(r4);
        }
    }
}
