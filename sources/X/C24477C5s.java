package X;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C5s  reason: case insensitive filesystem */
public abstract class C24477C5s {
    public void A00(Object obj) {
        DFL dfl;
        int i;
        List list;
        List list2;
        String str;
        String str2;
        DFL dfl2;
        int A0A;
        Object A10;
        if (this instanceof C23734Bof) {
            C23734Bof bof = (C23734Bof) this;
            dfl2 = (DFL) obj;
            A0A = bof.A00;
            A10 = bof.A01;
        } else if (this instanceof C23733Boe) {
            C23733Boe boe = (C23733Boe) this;
            dfl2 = (DFL) obj;
            switch (boe.A00) {
                case 0:
                    A0A = C25995CqB.A00().A08.A0A(dfl2);
                    A10 = C17880vN.A10(C25882Cnt.A02(dfl2, (List) boe.A01));
                    break;
                case 1:
                    int A0A2 = C25995CqB.A00().A08.A0A(dfl2);
                    ArrayList A102 = C17880vN.A10(dfl2.A0F(A0A2));
                    A102.addAll(0, C25882Cnt.A02(dfl2, (List) boe.A01));
                    dfl2.A0H(A0A2, A102);
                    return;
                case 2:
                    int A0A3 = C25995CqB.A00().A08.A0A(dfl2);
                    ArrayList A103 = C17880vN.A10(dfl2.A0F(A0A3));
                    A103.addAll(C25882Cnt.A02(dfl2, (List) boe.A01));
                    dfl2.A0H(A0A3, A103);
                    return;
                default:
                    dfl2.A0H(35, C17890vO.A0L());
                    return;
            }
        } else {
            if (this instanceof C23732Bod) {
                C23732Bod bod = (C23732Bod) this;
                dfl = (DFL) obj;
                Pair A01 = C25882Cnt.A01(dfl, bod.A00);
                i = C108965cb.A00(A01);
                if (i < 0) {
                    str = "ComponentTree";
                    str2 = "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent.";
                } else {
                    list = (List) A01.first;
                    list.remove(i);
                    list2 = bod.A01;
                    list.addAll(i, C25882Cnt.A02(dfl, list2));
                    return;
                }
            } else if (this instanceof C23731Boc) {
                C23731Boc boc = (C23731Boc) this;
                DFL dfl3 = (DFL) obj;
                Pair A012 = C25882Cnt.A01(dfl3, new C26965DNn(boc.A00));
                int A00 = C108965cb.A00(A012);
                if (A00 < 0) {
                    str = "ComponentTreeMutator";
                    str2 = "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent.";
                } else {
                    List list3 = (List) A012.first;
                    int size = list3.size();
                    while (true) {
                        size--;
                        if (size > A00) {
                            list3.remove(size);
                        } else {
                            list3.addAll(A00 + 1, C25882Cnt.A02(dfl3, boc.A01));
                            return;
                        }
                    }
                }
            } else if (this instanceof C23729Boa) {
                Pair A013 = C25882Cnt.A01((DFL) obj, new C26965DNn(((C23729Boa) this).A00));
                int A002 = C108965cb.A00(A013);
                if (A002 < 0) {
                    str = "ComponentTreeMutator";
                    str2 = "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent.";
                } else {
                    ((List) A013.first).remove(A002);
                    return;
                }
            } else if (this instanceof C23730Bob) {
                C23730Bob bob = (C23730Bob) this;
                Pair A014 = C25882Cnt.A01((DFL) obj, new C26965DNn(bob.A01));
                List list4 = (List) A014.first;
                int A003 = C108965cb.A00(A014);
                int A004 = C25882Cnt.A00(new C26965DNn(bob.A00), list4);
                str = "ComponentTree";
                if (A003 == -1) {
                    str2 = "removeChildren: The starting id doesn't exist. No children have been removed.";
                } else if (A004 == -1) {
                    str2 = "removeChildren: The ending id doesn't exist. No children have been removed.";
                } else if (A003 > A004) {
                    str2 = "removeChildren: The starting index is larger than the ending index. No children have been removed.";
                } else {
                    Iterator it = list4.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        it.next();
                        if (i2 > A003 && i2 < A004) {
                            it.remove();
                        }
                        i2++;
                    }
                    return;
                }
            } else {
                C23735Bog bog = (C23735Bog) this;
                dfl = (DFL) obj;
                Pair A015 = C25882Cnt.A01(dfl, new C26965DNn(bog.A01));
                int A005 = C108965cb.A00(A015);
                if (A005 < 0) {
                    str = "ComponentTree";
                    str2 = "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent.";
                } else {
                    list = (List) A015.first;
                    i = A005 + bog.A00;
                    list2 = bog.A02;
                    list.addAll(i, C25882Cnt.A02(dfl, list2));
                    return;
                }
            }
            Log.w(str, str2);
            return;
        }
        dfl2.A0H(A0A, A10);
    }
}
