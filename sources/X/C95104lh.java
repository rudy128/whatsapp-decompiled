package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lh  reason: invalid class name and case insensitive filesystem */
public final class C95104lh implements C108445bi {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231960);
    }

    public String BaW(C108015az r6) {
        C18070vi.A0d(r6, 0);
        ArrayList A002 = A00(r6.BYq());
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (A01((AnonymousClass21V) next)) {
                A13.add(next);
            }
        }
        int size = A13.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, size, 0);
        String string = ((Context) ((C94964lT) r6).A01).getString(2131889564, A1a);
        C18070vi.A0X(string);
        return string;
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList A002 = A00(collection);
        if (!(A002 instanceof Collection) || !A002.isEmpty()) {
            Iterator it = A002.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (A01(C17880vN.A0b(it))) {
                    if (!C18020vd.A05(C18040vf.A02, this.A02, 4048)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A01(AnonymousClass21V r4) {
        boolean A002;
        C62572rc r1 = r4.A02;
        if (r1 == null || r1.A0f || r1.A0V) {
            return false;
        }
        if (r4 instanceof C438421d) {
            A002 = ((C136906ub) this.A01.get()).A01(r1, false);
        } else {
            A002 = C63652tT.A00(this.A02, (C139506yx) this.A03.get(), r4);
        }
        if (A002) {
            return true;
        }
        return false;
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 30;
    }

    public C95104lh(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A02 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }

    public static final ArrayList A00(Collection collection) {
        ArrayList A13 = AnonymousClass000.A13();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                if (A0Y instanceof AnonymousClass21V) {
                    A13.add(A0Y);
                } else if (A0Y instanceof AnonymousClass247) {
                    A13.addAll(((AnonymousClass247) A0Y).A17());
                }
            }
        }
        return A13;
    }
}
