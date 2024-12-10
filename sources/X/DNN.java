package X;

import android.util.SparseArray;
import java.util.List;

public class DNN implements E6C {
    public final /* synthetic */ DFL A00;

    public DNN(DFL dfl) {
        this.A00 = dfl;
    }

    public /* bridge */ /* synthetic */ Object get() {
        Object obj = this.A00.A06.get(135);
        if (!(obj instanceof List)) {
            return BE6.A0Q();
        }
        List list = (List) obj;
        SparseArray sparseArray = new SparseArray(list.size() / 2);
        for (int i = 0; i < list.size(); i += 2) {
            sparseArray.put(AnonymousClass001.A0n(list, i), list.get(i + 1));
        }
        return sparseArray;
    }
}
