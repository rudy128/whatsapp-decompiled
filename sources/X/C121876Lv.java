package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Lv  reason: invalid class name and case insensitive filesystem */
public final class C121876Lv extends A34 {
    public final AnonymousClass1WX A00;
    public final C18030ve A01;
    public final C25931Qe A02;
    public final AnonymousClass206 A03;
    public final C127846f1 A04;

    public C121876Lv(AnonymousClass1F9 r2, AnonymousClass1WX r3, C18030ve r4, C25931Qe r5, AnonymousClass206 r6, C127846f1 r7) {
        super(r2, true);
        this.A03 = r6;
        this.A00 = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = r7;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass1WX r0 = this.A00;
        AnonymousClass206 r4 = this.A03;
        C56862i9 A002 = r0.A00(r4);
        HashSet A12 = C17880vN.A12();
        Set entrySet = A002.A00.entrySet();
        C18070vi.A0X(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            if (((C62452rQ) A16.getValue()).A01(13) > 0) {
                A12.add(A16.getKey());
            }
        }
        if (C18020vd.A05(C18040vf.A02, this.A01, 7497)) {
            C18070vi.A0d(r4, 0);
            C108985cd.A19(this.A02, r4, AnonymousClass8BG.class, new AnonymousClass25F[1]);
            AnonymousClass8BG A012 = C63892tr.A01(r4);
            if (A012 != null) {
                Iterator it2 = C1409073n.A03(A012.BMh()).iterator();
                while (it2.hasNext()) {
                    AnonymousClass7PX r1 = (AnonymousClass7PX) it2.next();
                    String str = r1.A05;
                    if (!(str == null || str.length() == 0)) {
                        AnonymousClass1BI r12 = r1.A04;
                        if (C22971Dz.A0d(r12)) {
                            C18070vi.A0z(r12, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                            A12.add(r12);
                        }
                    }
                }
            }
        }
        return Integer.valueOf(A12.size());
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        C127846f1 r0 = this.A04;
        MyStatusesActivity myStatusesActivity = r0.A01;
        HashMap hashMap = myStatusesActivity.A0z;
        AnonymousClass205 r1 = r0.A00.A0v;
        C18070vi.A0W(r1);
        C17890vO.A0z(r1, hashMap, A0M);
        myStatusesActivity.A10.remove(r1);
        MyStatusesActivity.A0z(myStatusesActivity);
    }
}
