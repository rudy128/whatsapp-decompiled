package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4la  reason: invalid class name and case insensitive filesystem */
public final class C95034la implements C108445bi {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231641);
    }

    public String BaW(C108015az r5) {
        C18070vi.A0d(r5, 0);
        Collection BYq = r5.BYq();
        boolean z = false;
        if (BYq != null && !BYq.isEmpty()) {
            Iterator it = BYq.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                C88534a3 A0y = AnonymousClass3MX.A0y(this.A01);
                C18070vi.A0d(A0Y, 0);
                if (C88534a3.A00(A0Y, A0y) == AnonymousClass00R.A0N) {
                    z = true;
                    break;
                }
            }
        }
        Context context = (Context) ((C94964lT) r5).A01;
        int i = 2131888034;
        if (z) {
            i = 2131888035;
        }
        return AnonymousClass3MX.A15(context, i);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        return AnonymousClass000.A1Z(AnonymousClass4GO.A00(AnonymousClass3MX.A0y(this.A01), collection), AnonymousClass00R.A0C);
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 44;
    }

    public C95034la(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r2;
        this.A01 = r1;
    }
}
