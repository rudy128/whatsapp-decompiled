package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Lf  reason: invalid class name and case insensitive filesystem */
public final class C121716Lf extends A34 {
    public final AnonymousClass1TG A00;
    public final CY4 A01;
    public final C126476cn A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121716Lf(AnonymousClass1F9 r3, AnonymousClass1TG r4, CY4 cy4, C126476cn r6) {
        super(r3, true);
        C18070vi.A0d(cy4, 2);
        this.A00 = r4;
        this.A01 = cy4;
        this.A02 = r6;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str;
        ArrayList A0m = C29431cG.A0m(this.A00.A04(AnonymousClass1E5.A00, -1));
        C29421cF.A0S(A0m);
        MyStatusesActivity myStatusesActivity = this.A02.A00;
        AnonymousClass00H r0 = myStatusesActivity.A0q;
        if (r0 != null) {
            if (C108985cd.A1a(r0)) {
                AnonymousClass00H r02 = myStatusesActivity.A0r;
                if (r02 != null) {
                    C62422rN.A00((C62422rN) r02.get());
                } else {
                    str = "xFamilyStatusCrosspostStateCacheLazy";
                }
            }
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                C18070vi.A0b(A0Y);
                if (A0Y instanceof C441822l) {
                    this.A01.A01((C441822l) A0Y);
                }
            }
            return A0m;
        }
        str = "xFamilyGating";
        C18070vi.A11(str);
        throw null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        StringBuilder A0K = C18070vi.A0K(list);
        C17890vO.A15("mystatuses/loaded ", A0K, list);
        C17890vO.A1A(A0K, " messages");
        C126476cn r4 = this.A02;
        if (list.isEmpty()) {
            MyStatusesActivity myStatusesActivity = r4.A00;
            if (!C18020vd.A05(C18040vf.A02, myStatusesActivity.A0E, 11417)) {
                myStatusesActivity.finish();
                return;
            }
        }
        MyStatusesActivity myStatusesActivity2 = r4.A00;
        C110235f9 r0 = myStatusesActivity2.A0W;
        if (r0 == null) {
            C18070vi.A11("myStatusesAdapter");
            throw null;
        }
        r0.A00 = list;
        r0.notifyDataSetChanged();
        MyStatusesActivity.A12(myStatusesActivity2);
        AnonymousClass7AE r02 = myStatusesActivity2.A0S;
        if (r02 != null) {
            r02.A00();
        }
        C72453Mb.A1D(myStatusesActivity2.findViewById(2131434180));
    }
}
