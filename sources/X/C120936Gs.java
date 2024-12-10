package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;

/* renamed from: X.6Gs  reason: invalid class name and case insensitive filesystem */
public final class C120936Gs extends AnonymousClass7EZ {
    public final AnonymousClass00H A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02;

    public String BaW(C108015az r3) {
        C18070vi.A0d(r3, 0);
        return C18070vi.A0F(r3.getContext(), 2131892013);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        AnonymousClass00H r3 = this.A00;
        boolean A04 = ((AnonymousClass72B) C18070vi.A0E(r3)).A04(C122646Re.FACEBOOK, collection, 6, false);
        if (((AnonymousClass72B) r3.get()).A02(false) != AnonymousClass6R1.DISABLED) {
            return A04;
        }
        if (!((C41701wv) this.A02.get()).A02() || !super.CMC(collection)) {
            return false;
        }
        return true;
    }

    public Drawable BSc(Context context, C18000vb r4) {
        return C24261Jm.A00(this.A01.A00, 2131233617);
    }

    public C120936Gs(AnonymousClass118 r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public int getId() {
        return 13;
    }
}
