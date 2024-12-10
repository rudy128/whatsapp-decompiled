package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9iz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C189379iz {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A00;

    public final void A00(AF1 af1, AnonymousClass8KV r24) {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.A00;
        AF1 af12 = af1;
        AnonymousClass8KV r8 = r24;
        if (af12.A09) {
            AF0 af0 = af12.A0B.A03;
            if (af0 != null) {
                AnonymousClass8FG.A03(af12, r8, businessDirectorySERPMapViewActivity.A4b(), C17880vN.A0k());
                A6I a6i = businessDirectorySERPMapViewActivity.A05;
                if (a6i != null) {
                    a6i.A04(businessDirectorySERPMapViewActivity.A00, (C22435B7r) null, (BD3) null, af0.A0F);
                    return;
                }
                C18070vi.A11("businessProfileSyncUtil");
                throw null;
            }
            return;
        }
        AnonymousClass8FG A4b = businessDirectorySERPMapViewActivity.A4b();
        A4b.A07 = af12;
        AnonymousClass1DT r4 = A4b.A0G;
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(new C174178wM(af12));
        r4.A0E(A13);
        C20269AEc BXJ = af12.BXJ();
        C20269AEc A002 = C25915CoZ.A00(new C20269AEc(BXJ.A00 + (500.0d / 111132.0d), BXJ.A01), 500.0d);
        C20269AEc BXJ2 = af12.BXJ();
        double d = 500.0d * -1.0d;
        C20278AEl aEl = new C20278AEl(C25915CoZ.A00(new C20269AEc(BXJ2.A00 + (d / 111132.0d), BXJ2.A01), d), A002);
        A8P a8p = A4b.A08.A0B;
        A64 a64 = a8p.A03;
        C199339zp A08 = a8p.A08(aEl, 60);
        HashSet A12 = C17880vN.A12();
        A64.A00(a64.A00, a64, A08, A12);
        ArrayList A0D = C29351c6.A0D(A12);
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            A0D.add(((C21345AiY) it.next()).A03);
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : A0D) {
            AF1 af13 = (AF1) next;
            float f = af13.A06;
            float f2 = af12.A06;
            if (f <= f2 || af13.A05 <= f2) {
                A132.add(next);
            }
        }
        Set A122 = C29431cG.A12(A132);
        ArrayList A133 = AnonymousClass000.A13();
        A133.add(C29431cG.A0m(C41841x9.A04(A4b.A0B, A122)));
        C195459tN r1 = A4b.A06;
        if (r1 != null) {
            r1.A00 = true;
        }
        C20291AEz aEz = af12.A0B;
        LatLng latLng = new LatLng(aEz.A06, aEz.A07);
        Double valueOf = Double.valueOf(800.0d);
        Double valueOf2 = Double.valueOf(latLng.A00);
        Double valueOf3 = Double.valueOf(latLng.A01);
        Double A0Q = AnonymousClass8BV.A0Q();
        C20079A6f a6f = new C20079A6f(valueOf, valueOf2, valueOf3, valueOf2, valueOf3, A0Q, (String) null, (String) null, "pin_on_map");
        C20079A6f a6f2 = a6f;
        C195459tN r10 = new C195459tN(a6f2, new AP1(af12, A4b, A133, A122, 1), A0Q, A4b.A09, A133, 2);
        A4b.A0M.A00(r10);
        A4b.A06 = r10;
        AnonymousClass8FG.A03(af12, r8, A4b, (Integer) null);
    }

    public /* synthetic */ C189379iz(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        this.A00 = businessDirectorySERPMapViewActivity;
    }
}
