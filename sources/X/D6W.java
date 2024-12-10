package X;

import android.content.ClipData;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.facebook.primitive.textinput.TextInputView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class D6W implements E3a {
    public final /* synthetic */ WeakReference A00;

    public D6W(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    public final C25997CqD C2a(View view, C25997CqD cqD) {
        Pair create;
        Pair A0L;
        TextInputView textInputView;
        E1H e1h;
        D6L d6l = D6L.A00;
        ClipData BOm = cqD.A00.BOm();
        C25997CqD cqD2 = null;
        if (BOm.getItemCount() == 1) {
            C25997CqD cqD3 = cqD;
            if (!d6l.test(BOm.getItemAt(0))) {
                cqD3 = null;
                cqD2 = cqD;
            }
            A0L = Pair.create(cqD3, cqD2);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < BOm.getItemCount(); i++) {
                ClipData.Item itemAt = BOm.getItemAt(i);
                if (d6l.test(itemAt)) {
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
        C18070vi.A0X(A0L);
        C25997CqD cqD4 = (C25997CqD) A0L.first;
        C25997CqD cqD5 = (C25997CqD) A0L.second;
        if (cqD4 != null) {
            WeakReference weakReference = this.A00;
            ClipData BOm2 = cqD4.A00.BOm();
            C18070vi.A0X(BOm2);
            int itemCount = BOm2.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                Uri uri = BOm2.getItemAt(i2).getUri();
                if (!(uri == null || (textInputView = (TextInputView) weakReference.get()) == null || (e1h = textInputView.A00) == null)) {
                    DF5 df5 = (DF5) e1h;
                    C26176Ctu.A01(new C21456AkN(df5.A01, df5.A02, df5.A00, uri.toString(), 0));
                }
            }
        }
        return cqD5;
    }
}
