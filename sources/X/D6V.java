package X;

import android.content.ClipData;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

public final /* synthetic */ class D6V implements E3a {
    public final C25997CqD C2a(View view, C25997CqD cqD) {
        Pair create;
        Pair A0L;
        ClipData BOm = cqD.A00.BOm();
        C25997CqD cqD2 = null;
        if (BOm.getItemCount() == 1) {
            C25997CqD cqD3 = cqD;
            if (BOm.getItemAt(0).getUri() == null) {
                cqD3 = null;
                cqD2 = cqD;
            }
            A0L = Pair.create(cqD3, cqD2);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < BOm.getItemCount(); i++) {
                ClipData.Item itemAt = BOm.getItemAt(i);
                if (itemAt.getUri() != null) {
                    if (arrayList == null) {
                        arrayList = AnonymousClass000.A13();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass000.A13();
                    }
                    arrayList2.add(itemAt);
                }
            }
            if (arrayList == null) {
                create = Pair.create((Object) null, BOm);
            } else if (arrayList2 == null) {
                create = Pair.create(BOm, (Object) null);
            } else {
                create = Pair.create(C25997CqD.A00(BOm.getDescription(), arrayList), C25997CqD.A00(BOm.getDescription(), arrayList2));
            }
            A0L = BEB.A0L(create, cqD);
        }
        C18070vi.A0b(A0L);
        return (C25997CqD) A0L.second;
    }
}
