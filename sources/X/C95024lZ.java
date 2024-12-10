package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lZ  reason: invalid class name and case insensitive filesystem */
public abstract class C95024lZ implements C108445bi {
    public final C108445bi A00;
    public final int A01;

    public boolean BRj() {
        return this.A00.BRj();
    }

    public String BaW(C108015az r4) {
        C18070vi.A0d(r4, 0);
        Collection BYq = r4.BYq();
        if (BYq != null) {
            if (!BYq.isEmpty()) {
                Iterator it = BYq.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(it.next() instanceof AnonymousClass21V)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (BYq.size() >= 4) {
                return ((Context) ((C94964lT) r4).A01).getString(this.A01);
            }
        }
        return this.A00.BaW(r4);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A00.CMC(collection);
    }

    public int getId() {
        return this.A00.getId();
    }

    public C95024lZ(C108445bi r1, int i) {
        this.A00 = r1;
        this.A01 = i;
    }

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0h(context, r3);
        return this.A00.BSc(context, r3);
    }
}
