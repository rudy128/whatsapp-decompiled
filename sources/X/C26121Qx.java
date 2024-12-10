package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Qx  reason: invalid class name and case insensitive filesystem */
public class C26121Qx {
    public final AnonymousClass1LW A00;

    public static String A00(int[] iArr) {
        int length = iArr.length;
        StringBuilder sb = new StringBuilder();
        sb.append("message_type");
        sb.append(" NOT IN (");
        sb.append(iArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(",");
            sb.append(iArr[i]);
        }
        sb.append(")");
        return sb.toString();
    }

    public static ArrayList A01(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(8);
        }
        if (z2) {
            arrayList.add(87);
            arrayList.add(88);
            arrayList.add(100);
            arrayList.add(102);
        }
        return arrayList;
    }

    public static void A03(StringBuilder sb, boolean z, boolean z2) {
        String str;
        String str2;
        if (z) {
            str = " ORDER BY sort_id DESC";
            if (z2) {
                str2 = " AND sort_id <= ?";
            } else {
                str2 = " AND sort_id < ?";
            }
        } else {
            str = " ORDER BY sort_id ASC";
            if (z2) {
                str2 = " AND sort_id >= ?";
            } else {
                str2 = " AND sort_id > ?";
            }
        }
        sb.append(str2);
        sb.append(str);
    }

    public C19760yx A04(AnonymousClass206 r11) {
        String str;
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass1BI> A0T = r11.A0T();
        if (A0T == null || A0T.size() < r11.A0A) {
            arrayList.add(String.valueOf(r11.A0I));
            arrayList.add(r11.A0v.A01);
            arrayList.add(String.valueOf(r11.A0x));
            str = " WHERE timestamp = ? AND from_me = 1 AND key_id = ? AND _id!=?";
        } else {
            arrayList.add(r11.A0v.A01);
            AnonymousClass1LW r9 = this.A00;
            HashMap hashMap = new HashMap();
            for (AnonymousClass1BI r1 : A0T) {
                long A09 = r9.A09(r1);
                if (A09 != -1) {
                    hashMap.put(r1, Long.valueOf(A09));
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" WHERE from_me=1 AND key_id=? AND chat_row_id IN ");
            sb.append(AnonymousClass1H2.A00(hashMap.size()));
            str = sb.toString();
            for (Object obj : hashMap.values()) {
                arrayList.add(obj.toString());
            }
        }
        return new C19760yx(str, arrayList);
    }

    public C26121Qx(AnonymousClass1LW r1) {
        this.A00 = r1;
    }

    public static void A02(StringBuilder sb, List list) {
        String str;
        if (list.isEmpty()) {
            str = " ";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" AND message_type NOT IN ('");
            sb2.append(list.get(0));
            sb2.append("'");
            sb.append(sb2.toString());
            for (int i = 1; i < list.size(); i++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", '");
                sb3.append(list.get(i));
                sb3.append("'");
                sb.append(sb3.toString());
            }
            str = ") ";
        }
        sb.append(str);
    }
}
