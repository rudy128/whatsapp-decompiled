package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3vW  reason: invalid class name and case insensitive filesystem */
public final class C79493vW extends C94984lV {
    public final C33251iW A00;
    public final C26811To A01;
    public final C56812i4 A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final C88104Yi A06;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131232320);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (collection.size() == 1) {
            AnonymousClass206 A0s = AnonymousClass3MX.A0s(collection);
            C88104Yi r1 = this.A06;
            if (r1.A02(A0s) || r1.A03(A0s) || C22971Dz.A0S(A0s.A0v.A00) || C20120A8f.A09(A0s)) {
                return false;
            }
        }
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!C17880vN.A0Y(it).A0q) {
                if (!A00(collection)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int getId() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79493vW(C33251iW r2, C26811To r3, C56812i4 r4, C88104Yi r5, C18030ve r6, AnonymousClass18K r7, C88174Yp r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        super(r6, r8);
        C18070vi.A0w(r6, r8, r9, r7, r3);
        C18070vi.A0q(r2, r10, r5);
        C18070vi.A0d(r4, 9);
        this.A04 = r9;
        this.A03 = r7;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r10;
        this.A06 = r5;
        this.A02 = r4;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131886509);
    }
}
