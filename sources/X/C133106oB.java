package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6oB  reason: invalid class name and case insensitive filesystem */
public final class C133106oB {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1SJ A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public C133106oB(C218617r r1, AnonymousClass1KB r2, AnonymousClass1SJ r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        C18070vi.A0q(r6, r7, r8);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A06 = r8;
    }

    public final void A00(AnonymousClass8A1 r18, String str, List list, List list2, List list3, int i) {
        String str2;
        C17960vV.A0C(!C22781De.A03());
        ArrayList A13 = AnonymousClass000.A13();
        List list4 = list;
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(AnonymousClass3MW.A0k(list4, i2).A0I + 86400000);
            List list5 = list2;
            if (list2 != null) {
                str2 = C17880vN.A0w(list5, i2);
            } else {
                str2 = null;
            }
            A13.add(new C135086rd(str2, seconds));
        }
        String str3 = str;
        List list6 = list3;
        C132926ns r5 = new C132926ns(r18, this, str3, list4, list6, i);
        ArrayList A0D = C29351c6.A0D(list4);
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        AnonymousClass74A.A06(this.A01, (AnonymousClass2LF) C18070vi.A0E(this.A03), this.A05, A0D, list6, 1);
        C138356ww r6 = (C138356ww) this.A07.get();
        C22562BCv bCv = C19945A0c.A00().A00;
        byte[] BLs = bCv.BLs();
        byte[] generatePublicKey = bCv.generatePublicKey(BLs);
        C18070vi.A0X(generatePublicKey);
        C18070vi.A0X(BLs);
        C147137Ry r7 = new C147137Ry(generatePublicKey, BLs);
        if (!C22781De.A03()) {
            C31081ez.A02("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onSuccess");
            C138356ww.A00(AnonymousClass705.A00(), r5, r6, r7, str3, A13, list6);
            return;
        }
        throw AnonymousClass000.A0n("Check failed.");
    }
}
