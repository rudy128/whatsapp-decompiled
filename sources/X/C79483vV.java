package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3vV  reason: invalid class name and case insensitive filesystem */
public final class C79483vV extends C94984lV {
    public final AnonymousClass1KB A00;
    public final C26811To A01;
    public final C28531aO A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231644);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C17880vN.A0Y(it).A0q) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return false;
        }
        if (A00(collection)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return 3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79483vV(AnonymousClass1KB r1, C26811To r2, C18030ve r3, C88174Yp r4, C28531aO r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        super(r3, r4);
        C18070vi.A0w(r3, r4, r1, r6, r2);
        C18070vi.A0l(r5, r7);
        this.A00 = r1;
        this.A03 = r6;
        this.A01 = r2;
        this.A02 = r5;
        this.A04 = r7;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131895141);
    }
}
