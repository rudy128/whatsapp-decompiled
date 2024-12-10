package X;

import android.util.SparseIntArray;
import java.util.List;
import java.util.Set;

/* renamed from: X.1fY  reason: invalid class name and case insensitive filesystem */
public class C31431fY {
    public boolean A00;
    public final AnonymousClass1O4 A01;
    public final AnonymousClass00H A02;

    public synchronized void A00() {
        if (!this.A00) {
            for (AnonymousClass1RJ r1 : (Set) this.A02.get()) {
                AnonymousClass1O4 r8 = this.A01;
                int[] BSG = r1.BSG();
                List list = r8.A0C;
                int size = list.size();
                list.add(r1);
                int length = BSG.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        int i2 = BSG[i];
                        SparseIntArray sparseIntArray = r8.A02;
                        if (sparseIntArray.get(i2, -1) == -1) {
                            sparseIntArray.put(i2, size);
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Already have registered handler for recv message type:");
                            sb.append(i2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
            this.A00 = true;
        }
    }

    public C31431fY(AnonymousClass1O4 r1, AnonymousClass00H r2) {
        this.A02 = r2;
        this.A01 = r1;
    }
}
