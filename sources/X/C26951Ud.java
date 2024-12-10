package X;

import android.os.Parcelable;
import com.whatsapp.contact.sync.NativeContactsDownloadHelper;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ud  reason: invalid class name and case insensitive filesystem */
public final class C26951Ud {
    public C26961Ue A00;
    public final NativeContactsDownloadHelper A01;
    public final AnonymousClass1M2 A02;

    public C26951Ud(AnonymousClass1M2 r2, NativeContactsDownloadHelper nativeContactsDownloadHelper) {
        C18070vi.A0d(nativeContactsDownloadHelper, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = nativeContactsDownloadHelper;
        this.A02 = r2;
    }

    public static final LinkedHashMap A00(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AnonymousClass1E7 r1 = (AnonymousClass1E7) next;
            if (!(r1 == null || r1.A0H == null || r1.A0J == null || r1.A01 == 2)) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList) {
            AnonymousClass1BI r0 = ((AnonymousClass1E7) next2).A0J;
            if (r0 != null) {
                String rawString = r0.getRawString();
                Object obj = linkedHashMap.get(rawString);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(rawString, obj);
                }
                ((List) obj).add(next2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap A01(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            String rawString = ((C64582v0) next).A00.getRawString();
            Object obj = linkedHashMap.get(rawString);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(rawString, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap;
    }

    public static final void A02(C26951Ud r19, C50852Wa r20) {
        ArrayList arrayList;
        C26961Ue r3;
        C26981Ug r1;
        Object obj;
        C50852Wa r12 = r20;
        C26951Ud r4 = r19;
        if (r12 instanceof C46062Cs) {
            ArrayList A0L = r4.A02.A0L();
            List list = ((C46062Cs) r12).A00;
            C18070vi.A0d(list, 1);
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap A002 = A00(A0L);
            LinkedHashMap A012 = A01(list);
            for (Map.Entry entry : A002.entrySet()) {
                List list2 = (List) A002.get(entry.getKey());
                List list3 = (List) A012.get(entry.getKey());
                if (list2 != null) {
                    if (list3 == null || list2.size() != list3.size()) {
                        arrayList2.addAll(list2);
                    } else {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                continue;
                                break;
                            }
                            AnonymousClass1E7 r10 = (AnonymousClass1E7) it.next();
                            Parcelable.Creator creator = PhoneUserJid.CREATOR;
                            AnonymousClass1BI r0 = r10.A0J;
                            if (r0 != null) {
                                PhoneUserJid A003 = C22951Dx.A00(r0.getRawString());
                                String str = r10.A0T;
                                String str2 = "";
                                if (str == null) {
                                    str = str2;
                                }
                                String str3 = r10.A0S;
                                if (str3 == null) {
                                    str3 = str2;
                                }
                                String str4 = r10.A0Q;
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                if (!list3.contains(new C64582v0(A003, str, str3, str2, r10.A09))) {
                                    break;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        arrayList2.addAll(list2);
                    }
                } else if (list3 != null) {
                    list3.isEmpty();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("NativeContactsMetadataUploadSyncUtils/getContactsToBeAdded/");
            sb.append(arrayList2.size());
            sb.append(' ');
            Log.i(sb.toString());
            ArrayList arrayList3 = new ArrayList();
            LinkedHashMap A004 = A00(A0L);
            LinkedHashMap A013 = A01(list);
            for (Object obj2 : C41841x9.A06(A004.keySet(), A013.keySet())) {
                List<C64582v0> list4 = (List) A013.get(obj2);
                if (list4 != null) {
                    for (C64582v0 r02 : list4) {
                        arrayList3.add(new AnonymousClass1E7(r02.A00));
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NativeContactsMetadataUploadSyncUtils/getContactsToBeDeleted/");
            sb2.append(arrayList3.size());
            sb2.append(' ');
            Log.i(sb2.toString());
            AnonymousClass1D6 r03 = new AnonymousClass1D6(arrayList2, arrayList3);
            r3 = r4.A00;
            if (r3 != null) {
                List list5 = (List) r03.first;
                Object obj3 = r03.second;
                C18070vi.A0d(list5, 1);
                C18070vi.A0d(obj3, 2);
                arrayList = new ArrayList();
                for (Object next : list5) {
                    if (((AnonymousClass1E7) next).A0J != null) {
                        arrayList.add(next);
                    }
                }
            }
            C18070vi.A11("callback");
            throw null;
        }
        r3 = r4.A00;
        if (r3 != null) {
            C18460wS r13 = C18460wS.A00;
            C18070vi.A0d(r13, 1);
            arrayList = new ArrayList();
            Iterator it2 = r13.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((AnonymousClass1E7) next2).A0J != null) {
                    arrayList.add(next2);
                }
            }
        }
        C18070vi.A11("callback");
        throw null;
        arrayList.size();
        if (!arrayList.isEmpty()) {
            r3.A03.CGL(new C146497Pi(r3, arrayList, 20), "update_wa_contacts_by_jid_to_mark_as_dirty");
            r1 = r3.A02;
            obj = C46042Cq.A00;
        } else {
            r1 = r3.A02;
            obj = C46052Cr.A00;
        }
        r1.BrF(obj);
    }
}
