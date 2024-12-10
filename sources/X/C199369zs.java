package X;

import com.whatsapp.group.batch.FetchTruncatedGroupsJob;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9zs  reason: invalid class name and case insensitive filesystem */
public final class C199369zs {
    public final C25001Mm A00;
    public final AnonymousClass126 A01;
    public final AnonymousClass127 A02;
    public final AnonymousClass00H A03;

    public final C194449rk A01(C179429Hx r22, List list, int i, int i2) {
        String str;
        String str2;
        C194449rk r2;
        StringBuilder sb;
        String str3;
        C179429Hx r15 = r22;
        C18070vi.A0d(r15, 3);
        boolean z = true;
        List<C19983A1t> list2 = list;
        int i3 = i;
        int i4 = i2;
        if (i <= 0) {
            C183129Xa r3 = (C183129Xa) this.A03.get();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C19983A1t) it.next()).A03) {
                        if (C18020vd.A05(C18040vf.A02, r3.A00, 6350)) {
                            if (i == 0 && r15 == C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED) {
                                this.A02.A01 = true;
                            }
                        }
                    }
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A15("GroupInfoBatchProcessor/processGroupInfo/legacy - \n              |processing ", A10, list2);
            str = "\n";
            str2 = "";
            AnonymousClass1YE.A07(AnonymousClass1Y7.A02(AnonymousClass001.A1I(" groups, round=", A10, i3)), str, str2, false);
            if (r15 != C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED) {
                z = false;
            }
            ArrayList A0D = C29351c6.A0D(list2);
            for (C19983A1t a1t : list2) {
                A00(a1t);
                A0D.add(a1t.A01);
            }
            Set A12 = C29431cG.A12(A0D);
            AnonymousClass126 r0 = this.A01;
            if (z) {
                r0.A0k(A12, i4);
            } else {
                r0.A0j(A12);
            }
            r2 = new C194449rk(AnonymousClass1D7.A0I(), AnonymousClass1D7.A0I(), A12);
            sb = AnonymousClass000.A10();
            str3 = "GroupInfoBatchProcessor/processGroupInfo/legacy - \n              |completed syncing of ";
            sb.append(str3);
            sb.append(r2.A02.size());
            AnonymousClass1YE.A07(AnonymousClass1Y7.A02(AnonymousClass001.A1I(" groups, round=", sb, i3)), str, str2, false);
            return r2;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        C17890vO.A15("GroupInfoBatchProcessor/processGroupInfo/threshold pipeline - \n              |processing ", A102, list2);
        str = "\n";
        str2 = "";
        AnonymousClass1YE.A07(AnonymousClass1Y7.A02(AnonymousClass001.A1I(" groups, round=", A102, i3)), str, str2, false);
        LinkedHashSet A14 = C17880vN.A14();
        ArrayList A13 = AnonymousClass000.A13();
        for (C19983A1t a1t2 : list2) {
            if (a1t2.A03) {
                A13.add(a1t2);
            } else {
                A00(a1t2);
                A14.add(a1t2.A01);
            }
        }
        if (r15 == C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED && i == 0) {
            if (C17880vN.A1X(A13)) {
                ArrayList A0E = C29351c6.A0E(A13);
                Iterator it2 = A13.iterator();
                while (it2.hasNext()) {
                    C19983A1t a1t3 = (C19983A1t) it2.next();
                    AnonymousClass1D6.A02(a1t3.A01.getRawString(), Integer.valueOf(C72463Mc.A0B(a1t3.A02)), A0E);
                }
                ArrayList A0E2 = C29351c6.A0E(A14);
                Iterator it3 = A14.iterator();
                while (it3.hasNext()) {
                    AnonymousClass8BX.A1N(A0E2, it3);
                }
                this.A00.A01(new FetchTruncatedGroupsJob(r15, (Integer) null, A0E, C29431cG.A12(A0E2), 1, i4));
            } else {
                this.A01.A0k(A14, i4);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(C29351c6.A0C(A13, 10)));
        Iterator it4 = A13.iterator();
        while (it4.hasNext()) {
            C19983A1t a1t4 = (C19983A1t) it4.next();
            linkedHashMap.put(a1t4.A01.getRawString(), a1t4.A02);
        }
        r2 = new C194449rk(AnonymousClass1D7.A0I(), linkedHashMap, A14);
        sb = AnonymousClass000.A10();
        str3 = "GroupInfoBatchProcessor/processGroupInfo/threshold pipeline - \n              |completed syncing of ";
        sb.append(str3);
        sb.append(r2.A02.size());
        AnonymousClass1YE.A07(AnonymousClass1Y7.A02(AnonymousClass001.A1I(" groups, round=", sb, i3)), str, str2, false);
        return r2;
    }

    private final void A00(C19983A1t a1t) {
        C19983A1t a1t2 = a1t;
        A2S a2s = a1t2.A00;
        if (a2s != null) {
            AnonymousClass126 r54 = this.A01;
            AnonymousClass1EC r53 = a1t2.A01;
            UserJid userJid = a2s.A0C;
            long j = a2s.A06;
            String str = a2s.A0H;
            long j2 = a2s.A07;
            long j3 = a2s.A05;
            Integer num = a1t2.A02;
            C42661yX r29 = a2s.A0E;
            boolean z = a2s.A0L;
            boolean z2 = a2s.A0U;
            boolean z3 = a2s.A0K;
            boolean z4 = a2s.A0T;
            boolean z5 = a2s.A0S;
            C29741cn r21 = a2s.A0F;
            int i = a2s.A02;
            C63262sm r17 = a2s.A08;
            int i2 = a2s.A03;
            AnonymousClass1EC r18 = a2s.A09;
            Map map = a2s.A0I;
            boolean z6 = a2s.A0P;
            boolean z7 = a2s.A0Q;
            int i3 = a2s.A00;
            String str2 = a2s.A0G;
            int i4 = a2s.A04;
            boolean z8 = a2s.A0M;
            boolean z9 = a2s.A0R;
            boolean z10 = a2s.A0J;
            boolean z11 = a2s.A0O;
            AnonymousClass126 r15 = r54;
            C63262sm r16 = r17;
            AnonymousClass1EC r172 = r53;
            UserJid userJid2 = userJid;
            C42661yX r20 = r29;
            Integer num2 = num;
            String str3 = str;
            String str4 = str2;
            int i5 = i3;
            r15.A0R(r16, r172, r18, userJid2, r20, r21, num2, str3, str4, map, (Map) null, i, i2, i5, i4, a2s.A01, j, j2, j3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, a2s.A0N);
            return;
        }
        throw AnonymousClass000.A0n("Expected group data info but got null");
    }

    public C199369zs(C25001Mm r1, AnonymousClass127 r2, AnonymousClass126 r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r2, r4);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = r4;
    }
}
