package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0YC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0YC implements AnonymousClass1GI {
    public final /* synthetic */ AnonymousClass0tC A00;

    public final Bundle CGk() {
        ArrayList arrayList;
        Map CBf = this.A00.CBf();
        Bundle bundle = new Bundle();
        Iterator A15 = AnonymousClass000.A15(CBf);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String str = (String) A16.getKey();
            List list = (List) A16.getValue();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        return bundle;
    }

    public /* synthetic */ AnonymousClass0YC(AnonymousClass0tC r1) {
        this.A00 = r1;
    }
}
