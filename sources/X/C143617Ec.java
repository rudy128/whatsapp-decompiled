package X;

import com.whatsapp.TextEmojiLabel;
import com.whatsapp.status.advertise.AdvertiseViewModel;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Ec  reason: invalid class name and case insensitive filesystem */
public class C143617Ec implements C43451zp {
    public final int A00;
    public final Object A01;

    public C143617Ec(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BpK(Object obj) {
        List list;
        AnonymousClass1DS r0;
        ArrayList arrayList;
        switch (this.A00) {
            case 0:
                AnonymousClass2D5.A00((C128376ft) obj, (AnonymousClass2D5) this.A01);
                return;
            case 1:
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A01;
                textEmojiLabel.setPlaceholder(0);
                textEmojiLabel.A0R((CharSequence) obj);
                return;
            case 2:
                AdvertiseViewModel advertiseViewModel = (AdvertiseViewModel) this.A01;
                List list2 = (List) obj;
                if (list2 != null) {
                    List list3 = advertiseViewModel.A01;
                    boolean z = false;
                    if (list2.size() == list3.size()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list3));
                        for (Object next : list3) {
                            linkedHashMap.put(((AnonymousClass206) next).A0v.A01, next);
                        }
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!linkedHashMap.containsKey(AnonymousClass3MZ.A10(it).A01)) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    advertiseViewModel.A01 = list2;
                    if (!z) {
                        r0 = advertiseViewModel.A03;
                        list = list2;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                r0 = (AnonymousClass1DS) this.A01;
                list = obj;
                break;
            case 4:
                r0 = ((UpdatesViewModel) this.A01).A0O;
                list = obj;
                break;
            case 5:
                C72463Mc.A1B(((UpdatesViewModel) this.A01).A0Q);
                return;
            default:
                UpdatesViewModel updatesViewModel = (UpdatesViewModel) this.A01;
                List list4 = (List) obj;
                if (list4 != null) {
                    C18100vl r7 = updatesViewModel.A0q;
                    Set A12 = C29431cG.A12((Iterable) r7.getValue());
                    AnonymousClass1DT r4 = updatesViewModel.A0P;
                    AnonymousClass1c4 r3 = updatesViewModel.A0U;
                    if (r3.A0A()) {
                        arrayList = list4;
                    } else {
                        ArrayList A13 = AnonymousClass000.A13();
                        for (Object next2 : list4) {
                            if (!A12.contains(((C121346Jh) next2).A0A.A08())) {
                                A13.add(next2);
                            }
                        }
                        arrayList = A13;
                    }
                    r4.A0F(arrayList);
                    if (!r3.A0A()) {
                        ArrayList A132 = AnonymousClass000.A13();
                        for (Object next3 : list4) {
                            if (A12.contains(((C121346Jh) next3).A0A.A08())) {
                                A132.add(next3);
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C200510q.A00(A132));
                        for (Object next4 : A132) {
                            linkedHashMap2.put(((C121346Jh) next4).A0A.A08(), next4);
                        }
                        AnonymousClass1DS A0Q = C108945cZ.A0Q(updatesViewModel.A0r);
                        List<Object> A11 = AnonymousClass3MW.A11(r7);
                        ArrayList A133 = AnonymousClass000.A13();
                        for (Object obj2 : A11) {
                            Object obj3 = linkedHashMap2.get(obj2);
                            if (obj3 != null) {
                                A133.add(obj3);
                            }
                        }
                        A0Q.A0F(A133);
                    }
                    if (r3.A0A()) {
                        C129326hc r2 = (C129326hc) updatesViewModel.A0b.get();
                        List A10 = AnonymousClass3MW.A10(r4);
                        boolean z2 = true;
                        if (A10 != null && A10.size() > 1) {
                            z2 = false;
                        }
                        r2.A00 = z2;
                    }
                    C129326hc r1 = (C129326hc) updatesViewModel.A0b.get();
                    boolean z3 = r1.A00;
                    r1.A00 = false;
                    if (z3) {
                        boolean z4 = updatesViewModel.A0D;
                        boolean A0O = UpdatesViewModel.A0O(updatesViewModel);
                        updatesViewModel.A0D = A0O;
                        if (A0O != z4) {
                            UpdatesViewModel.A0K(updatesViewModel, (Boolean) null, (Integer) null, false);
                        }
                    }
                    if (AnonymousClass000.A1a(list4)) {
                        UpdatesViewModel.A0I(updatesViewModel);
                        return;
                    }
                    return;
                }
                return;
        }
        r0.A0E(list);
    }
}
