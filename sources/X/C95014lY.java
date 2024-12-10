package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lY  reason: invalid class name and case insensitive filesystem */
public final class C95014lY implements C108445bi {
    public final C18030ve A00;

    public C95014lY(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131232038);
    }

    public boolean CMC(Collection collection) {
        String A18;
        C18070vi.A0d(collection, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A00, 9141)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (A0Y instanceof AnonymousClass210) {
                A18 = A0Y.A0X;
            } else if (A0Y instanceof C438921i) {
                A18 = ((C438921i) A0Y).A01;
            } else if (!(A0Y instanceof AnonymousClass21V)) {
                return false;
            } else {
                A18 = ((AnonymousClass21V) A0Y).A18();
            }
            if (A18 == null || A18.length() == 0 || A0Y.A0v.A02) {
                return false;
            }
            String A0S = A0Y.A0S();
            if (A0S != null && A0S.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 41;
    }

    public String BaW(C108015az r3) {
        return C72463Mc.A0E(r3).getString(2131897131);
    }
}
