package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.LRUCache;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1NH  reason: invalid class name */
public class AnonymousClass1NH {
    public final AnonymousClass1NA A00;
    public final AnonymousClass1DL A01;
    public final C22611Cn A02;
    public final AnonymousClass1Cd A03;
    public final C24621La A04;
    public final AnonymousClass1NG A05;
    public final AnonymousClass1ND A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final Map A09 = Collections.synchronizedMap(new LRUCache(200));

    public HashSet A01(List list) {
        Cursor A0A;
        String[] strArr = (String[]) list.toArray(new String[0]);
        HashSet hashSet = new HashSet();
        C28781at A042 = this.A03.get();
        try {
            C23141Ev r5 = ((C28801av) A042).A02;
            int size = list.size();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT jid_row_id FROM labeled_jid JOIN labels ON labeled_jid.label_id = labels._id WHERE label_name = ?");
            for (int i = 1; i < size; i++) {
                sb.append(" INTERSECT ");
                sb.append("SELECT jid_row_id FROM labeled_jid JOIN labels ON labeled_jid.label_id = labels._id WHERE label_name = ?");
            }
            A0A = r5.A0A(sb.toString(), "ASSEMBLE_MULTIPLE_SEARCH_LABELED_JID", strArr);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("jid_row_id");
            while (A0A.moveToNext()) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) this.A01.A0E(AnonymousClass1BI.class, A0A.getLong(columnIndexOrThrow));
                if (r1 != null && (r1 instanceof PhoneUserJid)) {
                    C42701yb.A01(r1);
                }
                if (r1 != null) {
                    hashSet.add(r1);
                }
            }
            A0A.close();
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public List A03(long[] jArr) {
        Cursor A0A;
        int length = jArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        ArrayList arrayList = new ArrayList();
        C28781at A042 = this.A03.get();
        try {
            C23141Ev r3 = ((C28801av) A042).A02;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT jid_row_id FROM labeled_jid WHERE label_id in ");
            sb.append("(");
            sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
            sb.append(")");
            A0A = r3.A0A(sb.toString(), "getJidsForLabelsV2/QUERY_LABELED_JID", strArr);
            while (A0A.moveToNext()) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) this.A01.A0E(AnonymousClass1BI.class, A0A.getLong(A0A.getColumnIndexOrThrow("jid_row_id")));
                if (r1 != null && (r1 instanceof PhoneUserJid)) {
                    C42701yb.A01(r1);
                }
                if (r1 != null) {
                    arrayList.add(r1);
                }
            }
            A0A.close();
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public HashMap A00(Collection collection, List list) {
        int i;
        int intValue;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            for (Object next : A02((AnonymousClass1BI) it.next())) {
                Number number = (Number) hashMap.get(next);
                if (number == null) {
                    number = 0;
                }
                hashMap.put(next, Integer.valueOf(number.intValue() + 1));
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C41761x1 r3 = (C41761x1) it2.next();
            Number number2 = (Number) hashMap.get(Long.valueOf(r3.A03));
            if (number2 == null || (intValue = number2.intValue()) == 0) {
                i = 0;
            } else {
                i = 1;
                if (intValue < collection.size()) {
                    i = 2;
                }
            }
            hashMap2.put(r3, new AnonymousClass4TZ(r3, i));
        }
        return hashMap2;
    }

    public List A02(AnonymousClass1BI r9) {
        Cursor A0A;
        Map map = this.A09;
        List list = (List) map.get(r9);
        ArrayList arrayList = list;
        if (list == null) {
            C28781at A042 = this.A03.get();
            try {
                long A092 = this.A01.A09(r9);
                A0A = ((C28801av) A042).A02.A0A("SELECT label_id FROM labeled_jid WHERE jid_row_id = ? ORDER BY _id DESC", "SELECT_LABEL_IDS_FOR_JID_V2", new String[]{String.valueOf(A092)});
                ArrayList arrayList2 = new ArrayList();
                while (A0A.moveToNext()) {
                    arrayList2.add(Long.valueOf(A0A.getLong(A0A.getColumnIndexOrThrow("label_id"))));
                }
                map.put(r9, arrayList2);
                A0A.close();
                A042.close();
                arrayList = arrayList2;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
        return arrayList;
        throw th;
    }

    public AnonymousClass1NH(AnonymousClass1NA r3, AnonymousClass1DL r4, C22611Cn r5, AnonymousClass1Cd r6, C24621La r7, AnonymousClass1NG r8, AnonymousClass1ND r9, C18030ve r10, AnonymousClass00H r11) {
        this.A07 = r10;
        this.A01 = r4;
        this.A00 = r3;
        this.A06 = r9;
        this.A04 = r7;
        this.A03 = r6;
        this.A08 = r11;
        this.A02 = r5;
        this.A05 = r8;
    }
}
