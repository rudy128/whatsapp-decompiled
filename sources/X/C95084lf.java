package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;

/* renamed from: X.4lf  reason: invalid class name and case insensitive filesystem */
public abstract class C95084lf implements C108445bi {
    public final C87794Wz A00;

    public boolean A00(AnonymousClass1FU r5, Collection collection) {
        AnonymousClass4Yv.A01(r5, 13);
        C87794Wz r2 = this.A00;
        if (r2.A03 && r2.A00 == 2) {
            r2.A00 = 3;
            C87794Wz.A00(r2, 1);
        }
        return true;
    }

    public final Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231847);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (collection.size() == 1) {
            AnonymousClass206 A0s = AnonymousClass3MX.A0s(collection);
            if ((!(A0s instanceof AnonymousClass21V) || !AnonymousClass25A.A11((AnonymousClass21V) A0s)) && !C20120A8f.A09(A0s)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean BRj() {
        return false;
    }

    public final int getId() {
        return 21;
    }

    public C95084lf(C87794Wz r1) {
        this.A00 = r1;
    }

    public final String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131898874);
    }
}
