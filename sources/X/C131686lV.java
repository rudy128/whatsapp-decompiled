package X;

import com.whatsapp.media.WamediaManager;
import java.io.File;

/* renamed from: X.6lV  reason: invalid class name and case insensitive filesystem */
public final class C131686lV {
    public final C127926fA A00;

    public C131686lV(C127926fA r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Object A00(C1418377d r25, File file, boolean z) {
        AnonymousClass89Q r6;
        C127926fA r2 = this.A00;
        C1418377d r1 = r25;
        File file2 = file;
        if (r1.A0N) {
            AnonymousClass10E r62 = r2.A00.A00.A00;
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r62);
            C18030ve A8r = AnonymousClass10E.A8r(r62);
            AnonymousClass1KB A12 = AnonymousClass10E.A12(r62);
            AnonymousClass70H r21 = (AnonymousClass70H) r62.AAN.get();
            WamediaManager wamediaManager = (WamediaManager) r62.ABs.get();
            C32431hB r17 = (C32431hB) r62.A66.get();
            C136936ue r18 = (C136936ue) r62.A0V.get();
            C24421Kg r19 = (C24421Kg) r62.A9a.get();
            r6 = new C1195368n(AnonymousClass3MY.A0N(r62), C108965cb.A0G(r62), A12, (C25311Ns) r62.A9R.get(), C108965cb.A0H(r62), A6O, (AnonymousClass11Z) r62.AAV.get(), A8r, (C24371Kb) r62.A6A.get(), wamediaManager, r17, r18, r19, r1, r21, file2, z);
        } else {
            AnonymousClass10E r63 = r2.A01.A00.A00;
            AnonymousClass11P A6O2 = AnonymousClass10E.A6O(r63);
            C18030ve A8r2 = AnonymousClass10E.A8r(r63);
            AnonymousClass181 A0H = C108965cb.A0H(r63);
            r63.A9p.get();
            r6 = new C1195568p(AnonymousClass10E.A12(r63), (C25311Ns) r63.A9R.get(), A0H, A6O2, (AnonymousClass11Z) r63.AAV.get(), A8r2, (C24371Kb) r63.A6A.get(), (C32431hB) r63.A66.get(), (C24421Kg) r63.A9a.get(), r1, file2);
        }
        C1409173o BJF = r6.BJF();
        if (!BJF.A03()) {
            return C30691eM.A00(new C122886Sh(BJF.A01));
        }
        File BQZ = r6.BQZ();
        if (BQZ == null) {
            return C30691eM.A00(new C122886Sh(35));
        }
        return BQZ;
    }
}
