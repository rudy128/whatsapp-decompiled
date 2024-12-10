package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DFo  reason: case insensitive filesystem */
public final class C26832DFo implements C16890tO {
    public static final E6A A02 = DNK.A00;
    public final DOZ A00;
    public final DFL A01;

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        C18070vi.A0d(obj2, 1);
        A00();
        return true;
    }

    private final void A00() {
        C18070vi.A0X(this.A00.A02(A02, this.A01, 2131428172));
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) obj2;
        C18070vi.A0j(obj, list);
        A00();
        A00();
        DFL dfl = this.A01;
        DOZ doz = this.A00;
        C26272CwJ.A01(doz);
        C26176Ctu.A02("Evaluation Context can only be gotten from the UI Thread");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DFL A0d = BE6.A0d(it);
            int i = A0d.A05;
            C18070vi.A0Z(C25416CfO.A00);
            String A1I = AnonymousClass001.A1I("unbindExtension: ", AnonymousClass000.A10(), i);
            try {
                if (AnonymousClass0O7.A01.A02()) {
                    AnonymousClass0O7.A01(A1I);
                }
                C25995CqB.A00().A05.A04(doz, A0d, dfl, obj);
            } finally {
                BE9.A13();
            }
        }
    }

    public C26832DFo(DOZ doz, DFL dfl) {
        this.A00 = doz;
        this.A01 = dfl;
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        C18070vi.A0n(context, obj, obj2);
        C26272CwJ.A01(this.A00);
        C26176Ctu.A02("Evaluation Context can only be gotten from the UI Thread");
        throw C17880vN.A0g();
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
