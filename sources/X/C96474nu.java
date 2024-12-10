package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4nu  reason: invalid class name and case insensitive filesystem */
public final class C96474nu implements C22509BAq {
    public final /* synthetic */ AnonymousClass1GV A00;
    public final /* synthetic */ C84814Ky A01;
    public final /* synthetic */ C85654Of A02;
    public final /* synthetic */ AnonymousClass1EC A03;

    public C96474nu(AnonymousClass1GV r1, C84814Ky r2, C85654Of r3, AnonymousClass1EC r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void C7D(AnonymousClass1EC r21, UserJid userJid, C42661yX r23, String str, Map map, int i, int i2, int i3, long j, boolean z, boolean z2) {
        int A1O;
        C85654Of r6 = this.A02;
        Map map2 = map;
        ArrayList A0M = r6.A05.A0M(map2);
        AnonymousClass1EC r8 = r21;
        C63872tp r4 = new C63872tp(r8, 0);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String str2 = ((C60052nJ) A16.getValue()).A04;
            if (C18070vi.A18(str2, "admin") || C18070vi.A18(str2, "superadmin")) {
                A13.put(A16.getKey(), A16.getValue());
            }
        }
        Iterator A152 = AnonymousClass000.A15(A13);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            UserJid userJid2 = (UserJid) A162.getKey();
            HashSet A0A = r6.A04.A0A(userJid2);
            String str3 = ((C60052nJ) A162.getValue()).A04;
            if (C18070vi.A18(str3, "superadmin")) {
                A1O = 2;
            } else {
                A1O = AnonymousClass000.A1O(C18070vi.A18(str3, "admin") ? 1 : 0);
            }
            r4.A0P(userJid2, A0A, A1O, false);
        }
        r6.A03.A00.put(r8, r4);
        AnonymousClass4PG r7 = new AnonymousClass4PG(r8, userJid, r23, str, (String) null, A0M, i, i2, i3, j, z2);
        r7.A00 = z;
        this.A00.accept(r7);
    }

    public void onError(int i) {
        C84814Ky r0 = this.A01;
        AnonymousClass1EC r5 = this.A03;
        AnonymousClass3VM r2 = r0.A00;
        AnonymousClass4PG r4 = new AnonymousClass4PG(r5, (UserJid) null, (C42661yX) null, (String) null, (String) null, (List) null, 0, 2, 0, 0, false);
        AnonymousClass1DT r1 = r2.A0G;
        int i2 = i;
        if (i2 != -1) {
            r1.A0E(new C86394Rl(r4, i2));
            AnonymousClass3MX.A1K(r2.A0d, 5);
            return;
        }
        throw AnonymousClass000.A0n("Error code expected but default success code '-1' was provided.");
    }
}
