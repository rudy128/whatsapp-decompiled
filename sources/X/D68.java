package X;

import android.os.LocaleList;
import java.util.ArrayList;

public final class D68 implements E3X {
    public LocaleList A00;
    public DUE A01;
    public final C77 A02 = new Object();

    public DUE BPq() {
        DUE due;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.A02) {
            due = this.A01;
            if (due == null || localeList != this.A00) {
                int size = localeList.size();
                ArrayList A0z = C17880vN.A0z(size);
                for (int i = 0; i < size; i++) {
                    A0z.add(new C25756ClR(new D66(localeList.get(i))));
                }
                due = new DUE(A0z);
                this.A00 = localeList;
                this.A01 = due;
            }
        }
        return due;
    }
}
