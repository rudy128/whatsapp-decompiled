package X;

import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7FQ  reason: invalid class name */
public class AnonymousClass7FQ implements C1606589k {
    public final int A00;
    public final Object A01;

    public AnonymousClass7FQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BoH(C125806bi r5) {
        AnonymousClass1KB r2;
        Runnable A002;
        if (this.A00 != 0) {
            ArrayList arrayList = r5.A00;
            r2 = ((AnonymousClass1FU) this.A01).A05;
            A002 = new AnonymousClass7RD(this, arrayList, 0);
        } else {
            Log.i("storage-usage-activity/fetch chats/completed");
            StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A01;
            ArrayList arrayList2 = r5.A00;
            C18070vi.A0W(arrayList2);
            storageUsageActivity.A0U = arrayList2;
            StorageUsageActivity.A0q(storageUsageActivity, arrayList2, (List) null, true);
            r2 = storageUsageActivity.A05;
            A002 = AnonymousClass7RI.A00(storageUsageActivity, 38);
        }
        r2.A0J(A002);
    }

    public void BoI(C125816bj r12) {
        Object obj;
        List list;
        if (this.A00 != 0) {
            ((AnonymousClass1FU) this.A01).A05.A0J(new AnonymousClass7RD(this, r12.A00, 0));
            return;
        }
        StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A01;
        ArrayList arrayList = storageUsageActivity.A0U;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AnonymousClass7PZ r5 = (AnonymousClass7PZ) next;
            List list2 = r12.A00;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnonymousClass7PZ r3 = (AnonymousClass7PZ) it2.next();
                    if (C18070vi.A18(r3.A01(), r5.A01()) && r5.compareTo(r3) != 0) {
                        break;
                    }
                }
            }
            A13.add(next);
        }
        boolean A1S = AnonymousClass000.A1S(storageUsageActivity.A0U.size(), A13.size());
        storageUsageActivity.A0U = A13;
        if (storageUsageActivity.A0D != null) {
            List list3 = r12.A00;
            Collections.sort(list3);
            int i = 0;
            AnonymousClass7PZ r1 = (AnonymousClass7PZ) list3.get(0);
            if (!C1406372h.A02(r1)) {
                C19760yx r4 = new C19760yx(C17880vN.A10(A13), AnonymousClass000.A13());
                int i2 = 0;
                while (true) {
                    obj = r4.A00;
                    List list4 = (List) obj;
                    if (i >= list4.size()) {
                        while (i2 < list3.size()) {
                            AnonymousClass7PZ r13 = (AnonymousClass7PZ) list3.get(i2);
                            if (C1406372h.A02(r13)) {
                                break;
                            }
                            list4.add(r13);
                            ((List) r4.A01).add(Integer.valueOf(AnonymousClass3MX.A01(list4)));
                            i2++;
                        }
                    } else {
                        if (((AnonymousClass7PZ) list4.get(i)).A01().equals(r1.A01())) {
                            i2++;
                            if (i2 >= list3.size()) {
                                break;
                            }
                            r1 = (AnonymousClass7PZ) list3.get(i2);
                            if (C1406372h.A02(r1)) {
                                break;
                            }
                        }
                        if (r1.compareTo((AnonymousClass7PZ) list4.get(i)) < 0) {
                            list4.add(i, r1);
                            ((List) r4.A01).add(Integer.valueOf(i));
                            i2++;
                            if (i2 >= list3.size()) {
                                break;
                            }
                            r1 = (AnonymousClass7PZ) list3.get(i2);
                            if (C1406372h.A02(r1)) {
                                break;
                            }
                            i--;
                        }
                        i++;
                    }
                }
                C18070vi.A0z(obj, "null cannot be cast to non-null type java.util.ArrayList<com.whatsapp.data.StorageUsageModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.whatsapp.data.StorageUsageModel> }");
                ArrayList arrayList2 = (ArrayList) obj;
                storageUsageActivity.A0U = arrayList2;
                if (A1S) {
                    list = null;
                } else {
                    list = (List) r4.A01;
                }
                StorageUsageActivity.A0q(storageUsageActivity, arrayList2, list, A1S);
                return;
            }
            return;
        }
        C18070vi.A11("storageUsageManager");
        throw null;
    }

    public void Br6(D3j d3j, AnonymousClass1BI r5) {
        if (this.A00 == 0) {
            AnonymousClass1FU r2 = (AnonymousClass1FU) this.A01;
            AnonymousClass7RO.A01(r2.A05, r2, r5, d3j, 13);
        }
    }
}
