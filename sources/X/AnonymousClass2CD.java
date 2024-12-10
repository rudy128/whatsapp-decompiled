package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2CD  reason: invalid class name */
public class AnonymousClass2CD extends C65802x8 {
    public C30301di A00;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r13, C25681CkC ckC, String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1507852311:
                if (str.equals("bk.action.qpl.userflow.AnnotateV2")) {
                    c = 0;
                    break;
                }
                break;
            case -1330718402:
                if (str.equals("bk.action.qpl.userflow.EndFlowFailureV2")) {
                    c = 1;
                    break;
                }
                break;
            case -921635786:
                if (str.equals("bk.action.qpl.userflow.MarkErrorV2")) {
                    c = 2;
                    break;
                }
                break;
            case -782725013:
                if (str.equals("bk.action.qpl.userflow.StartFlowV2")) {
                    c = 3;
                    break;
                }
                break;
            case 136195447:
                if (str.equals("bk.action.qpl.userflow.EndFlowSuccessV2")) {
                    c = 4;
                    break;
                }
                break;
            case 156743102:
                if (str.equals("bk.action.qpl.userflow.MarkPointV2")) {
                    c = 5;
                    break;
                }
                break;
            case 959076350:
                if (str.equals("bk.action.qpl.userflow.EndFlowCancelV2")) {
                    c = 6;
                    break;
                }
                break;
        }
        C25681CkC ckC2 = ckC;
        switch (c) {
            case 0:
                C30301di r4 = this.A00;
                List list = r13.A00;
                r4.BC6(ckC, (Map) list.get(2), AnonymousClass001.A0n(list, 0), AnonymousClass001.A0n(list, 1));
                return null;
            case 1:
                C30301di r6 = this.A00;
                List list2 = r13.A00;
                r6.BKB(ckC2, C17880vN.A0w(list2, 2), C17880vN.A0w(list2, 3), AnonymousClass001.A0n(list2, 0), AnonymousClass001.A0n(list2, 1));
                return null;
            case 2:
                C30301di r62 = this.A00;
                List list3 = r13.A00;
                r62.Bim(ckC2, C17880vN.A0w(list3, 2), C17880vN.A0w(list3, 3), AnonymousClass001.A0n(list3, 0), AnonymousClass001.A0n(list3, 1));
                return null;
            case 3:
                List list4 = r13.A00;
                DFL dfl = (DFL) list4.get(2);
                boolean equals = "cancel".equals(dfl.A0D(35));
                String A0D = dfl.A0D(36);
                if (A0D == null) {
                    A0D = "WaBloks";
                }
                this.A00.COL(ckC2, A0D, AnonymousClass001.A0n(list4, 0), AnonymousClass001.A0n(list4, 1), equals);
                return null;
            case 4:
                C30301di r3 = this.A00;
                List list5 = r13.A00;
                r3.BKH(ckC, AnonymousClass001.A0n(list5, 0), AnonymousClass001.A0n(list5, 1));
                return null;
            case 5:
                C30301di r63 = this.A00;
                List list6 = r13.A00;
                r63.Bin(ckC2, C17880vN.A0w(list6, 2), (Map) list6.get(3), AnonymousClass001.A0n(list6, 0), AnonymousClass001.A0n(list6, 1));
                return null;
            case 6:
                C30301di r42 = this.A00;
                List list7 = r13.A00;
                r42.BK9(ckC, C17880vN.A0w(list7, 2), AnonymousClass001.A0n(list7, 0), AnonymousClass001.A0n(list7, 1));
                return null;
            default:
                return null;
        }
    }
}
