package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.BVf  reason: case insensitive filesystem */
public abstract class C22917BVf extends C3Q {
    public A53 A00;
    public C28512E4w A01;

    public File A00(int i) {
        new HashMap();
        File A02 = this.A00.A02(i);
        A02.mkdirs();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            A02.setLastModified(currentTimeMillis);
        }
        C24571C9s.A00(this.A01, new C25649Cjf(i), A02);
        return A02;
    }
}
