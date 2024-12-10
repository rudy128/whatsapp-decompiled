package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ATm  reason: case insensitive filesystem */
public class C20654ATm implements C22508BAp {
    public final String A00;
    public final /* synthetic */ C20653ATl A01;

    public static final List A00(String str, List list) {
        C18070vi.A0d(list, 0);
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AF0 af0 = (AF0) it.next();
            if (C18070vi.A18(str, af0.A03)) {
                af0 = AF0.A00(af0);
                af0.A01 = 2;
            }
            A0D.add(af0);
        }
        return A0D;
    }

    public C20654ATm(C20653ATl aTl, String str) {
        this.A01 = aTl;
        this.A00 = str;
    }

    public void BtA(C190599lD r7, int i) {
        AP5 ap5 = this.A01.A09;
        if (ap5 != null) {
            String str = this.A00;
            if (ap5.A0A.Bfl()) {
                C188769hx r5 = ap5.A09;
                if (r5.A05 != null) {
                    C198469yO r4 = ap5.A0D;
                    List list = r4.A03;
                    List A002 = A00(str, list);
                    list.clear();
                    list.addAll(A002);
                    List A003 = A00(str, r4.A01);
                    r4.A01.clear();
                    r4.A01.addAll(A003);
                    List list2 = r5.A05.A09;
                    list2.clear();
                    list2.addAll(list);
                    AP5.A06(ap5);
                    return;
                }
                return;
            }
            C188769hx r2 = ap5.A09;
            C195699tl r0 = r2.A05;
            if (r0 != null) {
                List A004 = A00(str, r0.A09);
                List list3 = r2.A05.A09;
                list3.clear();
                list3.addAll(A004);
                r2.A0J.clear();
                AP5.A05(ap5);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Map map = (Map) obj;
        AP5 ap5 = this.A01.A09;
        if (ap5 != null) {
            ap5.A0E(map);
        }
    }
}
