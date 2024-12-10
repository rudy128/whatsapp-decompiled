package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lb  reason: invalid class name and case insensitive filesystem */
public final class C95044lb implements C108445bi {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231847);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        AnonymousClass00H r4 = this.A01;
        if (!C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0y(r4).A01, 8632)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((C88534a3) C18070vi.A0E(r4)).A0C(C17880vN.A0Y(it), false)) {
            }
        }
        return true;
        return false;
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 37;
    }

    public C95044lb(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131889219);
    }
}
