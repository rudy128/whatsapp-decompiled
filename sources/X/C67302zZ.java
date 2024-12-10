package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.2zZ  reason: invalid class name and case insensitive filesystem */
public final class C67302zZ implements AnonymousClass1L0 {
    public final C36421nr A00;

    public C67302zZ(C36421nr r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        List list;
        C36421nr r5 = this.A00;
        for (Object A0M : C36421nr.A02) {
            int A0M2 = AnonymousClass000.A0M(A0M);
            String str = "0,0,0";
            String string = C18070vi.A03(r5.A01.A01).getString(C36411nq.A00(A0M2), str);
            if (string != null) {
                str = string;
            }
            List A01 = new C41661wr(",").A01(str, 0);
            if (!A01.isEmpty()) {
                ListIterator listIterator = A01.listIterator(A01.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = C29431cG.A0v(A01, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = C18460wS.A00;
            String[] strArr = (String[]) list.toArray(new String[0]);
            if (strArr.length != 3) {
                break;
            }
            int parseInt = Integer.parseInt(strArr[0]);
            int parseInt2 = Integer.parseInt(strArr[1]);
            int parseInt3 = Integer.parseInt(strArr[2]);
            if (parseInt > 0 || parseInt2 > 0 || parseInt3 > 0) {
                AnonymousClass2G5 r1 = new AnonymousClass2G5();
                r1.A00 = 0;
                r1.A04 = C17880vN.A0n(parseInt);
                r1.A02 = C17880vN.A0n(parseInt2);
                r1.A03 = C17880vN.A0n(parseInt3);
                r1.A01 = Integer.valueOf(A0M2);
                r5.A00.CC7(r1);
            }
        }
        C17900vP.A0J(C18070vi.A03(r5.A01.A01));
    }
}
