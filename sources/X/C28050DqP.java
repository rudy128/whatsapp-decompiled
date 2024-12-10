package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.DqP  reason: case insensitive filesystem */
public final class C28050DqP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onDeviceFound;
    public final /* synthetic */ C26878DHk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28050DqP(C26878DHk dHk, C22821Di r3) {
        super(1);
        this.this$0 = dHk;
        this.$onDeviceFound = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        UUID uuid;
        String str2;
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A15("Found ", A10, list);
        cn1.A02("sup:LAMDeviceDiscoveryManager", AnonymousClass000.A0y(" device config(s).", A10));
        C22868BTc bTc = (C22868BTc) C29431cG.A0c(list);
        if (bTc != null) {
            C24459C4z.A02 = bTc.A06;
            C24459C4z.A00 = bTc.A02;
            C24459C4z.A01 = bTc.A05;
            C24459C4z.A03 = bTc.A07;
        }
        ArrayList<C22868BTc> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C22868BTc bTc2 = (C22868BTc) next;
            if ((!AnonymousClass1YF.A0T(C18070vi.A0H(bTc2.A09))) && (str2 = bTc2.A01) != null && (!AnonymousClass1YF.A0T(str2)) && bTc2.A00 != null) {
                String str3 = bTc2.A05;
                if (!C18070vi.A18(str3, "colada") && !C18070vi.A18(str3, "greatwhite")) {
                    A13.add(next);
                }
            }
        }
        ArrayList<C22871BTf> A0D = C29351c6.A0D(A13);
        for (C22868BTc bTc3 : A13) {
            A0D.add(new C22871BTf((C26127Csp) null, bTc3, bTc3.A09));
        }
        if (AnonymousClass000.A1a(A0D)) {
            for (C22871BTf bTf : A0D) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Device Config:");
                StringBuilder A0j = BE8.A0j(A102);
                A0j.append("  - BtcAddress = ");
                C22868BTc bTc4 = bTf.A01;
                BTW btw = null;
                if (bTc4 != null) {
                    str = bTc4.A01;
                } else {
                    str = null;
                }
                C108985cd.A1L(str, A0j, A102);
                StringBuilder A0j2 = BE8.A0j(A102);
                A0j2.append("  - serviceUUID = ");
                if (bTc4 != null) {
                    uuid = bTc4.A09;
                } else {
                    uuid = null;
                }
                BEA.A1L(uuid, A0j2, A102);
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("  - linkSecurity = ");
                if (bTc4 != null) {
                    btw = bTc4.A00;
                }
                BEA.A1L(btw, A103, A102);
                cn1.A02("sup:LAMDeviceDiscoveryManager", C18070vi.A0H(A102));
            }
            this.$onDeviceFound.invoke(A0D);
        } else {
            cn1.A06("sup:LAMDeviceDiscoveryManager", "No valid devices found.", (Throwable) null);
        }
        return C27621Wu.A00;
    }
}
