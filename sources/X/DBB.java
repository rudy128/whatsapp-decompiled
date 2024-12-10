package X;

import java.util.concurrent.TimeUnit;

public class DBB implements E4K {
    public static final long A00 = TimeUnit.MINUTES.toMillis(5);

    public /* bridge */ /* synthetic */ Object get() {
        int i;
        int A03 = BEA.A03();
        if (A03 < 16777216) {
            i = 1048576;
        } else {
            i = 4194304;
            if (A03 < 33554432) {
                i = 2097152;
            }
        }
        return new CSO(i, Integer.MAX_VALUE, i, A00, i / 8);
    }
}
