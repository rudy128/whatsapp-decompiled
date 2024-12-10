package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cY  reason: invalid class name and case insensitive filesystem */
public abstract class C29601cY {
    public static final void A02(byte[] bArr, long j, long j2) {
        StringBuilder sb;
        long length = (long) bArr.length;
        if (length < j) {
            sb = new StringBuilder();
            sb.append("Length of binary byte array is less than the specified lower bound value of ");
            sb.append(j);
        } else if (length > j2) {
            sb = new StringBuilder();
            sb.append("Length of binary byte array is greater than the specified upper bound value of ");
            sb.append(j2);
        } else {
            return;
        }
        C17960vV.A0F(false, sb.toString());
    }

    public static final ArrayList A00(C29621ca r11, String[] strArr) {
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            r11 = r11.A0L(strArr[i]);
        }
        String str = strArr[length];
        List A0R = r11.A0R(str);
        C18070vi.A0X(A0R);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0R) {
            C18070vi.A0b(next);
            C18070vi.A0d(next, 0);
            arrayList.add(next);
        }
        if (((long) arrayList.size()) < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid number of children '");
            sb.append(str);
            sb.append("'. Received ");
            sb.append(arrayList.size());
            sb.append(" children but the minimum value specified in the spec is ");
            sb.append(1);
            sb.append('.');
            throw new AnonymousClass1UI(sb.toString());
        } else if (((long) arrayList.size()) <= 1) {
            return arrayList;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid number of children '");
            sb2.append(str);
            sb2.append("'. Received ");
            sb2.append(arrayList.size());
            sb2.append(" children but the maximum value specified in the spec is ");
            sb2.append(1);
            sb2.append('.');
            throw new AnonymousClass1UI(sb2.toString());
        }
    }

    public static final void A01(Jid jid, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isAssignableFrom(jid.getClass())) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JID enum '");
        sb.append(str);
        sb.append("' was expected to be one of '");
        sb.append(C29431cG.A0g(", ", "", "", list, (C22821Di) null));
        sb.append("' but was '");
        sb.append(jid.getClass().getSimpleName());
        sb.append("'.");
        C17960vV.A0F(false, sb.toString());
    }

    public static final boolean A03(Long l, long j, long j2, boolean z) {
        StringBuilder sb;
        if (l != null || z) {
            if (l != null) {
                long longValue = l.longValue();
                if (longValue < j) {
                    sb = new StringBuilder();
                    sb.append("Value is less than the specified lower bound value of ");
                    sb.append(j);
                } else if (longValue > j2) {
                    sb = new StringBuilder();
                    sb.append("Value is greater than the specified lower bound value of ");
                    sb.append(j2);
                }
                C17960vV.A0F(false, sb.toString());
            }
            return true;
        }
        C17960vV.A0F(false, "Received null value for non-optional ':int'.");
        return false;
    }

    public static final boolean A04(String str, long j, long j2, boolean z) {
        StringBuilder sb;
        if (str != null || z) {
            if (str != null) {
                long length = (long) str.length();
                if (length < j) {
                    sb = new StringBuilder();
                    sb.append("Length of string is less than the specified lower bound value of ");
                    sb.append(j);
                } else if (length > j2) {
                    sb = new StringBuilder();
                    sb.append("Length of string is greater than the specified upper bound value of ");
                    sb.append(j2);
                }
                C17960vV.A0F(false, sb.toString());
            }
            return true;
        }
        C17960vV.A0F(false, "Received null value for non-optional ':string'.");
        return false;
    }

    public static final boolean A05(List list, long j, long j2) {
        StringBuilder sb;
        if (list == null) {
            C17960vV.A0F(false, "Received null value for children. Pass `Collections.emptyList()` instead of null for non-present, optional children.");
            return false;
        }
        if (((long) list.size()) < j) {
            sb = new StringBuilder();
            sb.append("Number of children ");
            sb.append(list.size());
            sb.append(" is less than the specified minimum value of ");
            sb.append(j);
        } else {
            if (((long) list.size()) > j2) {
                sb = new StringBuilder();
                sb.append("Number of children ");
                sb.append(list.size());
                sb.append(" is greater than the specified maximum value of ");
                sb.append(j2);
            }
            return true;
        }
        C17960vV.A0F(false, sb.toString());
        return true;
    }
}
