package X;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1nr  reason: invalid class name and case insensitive filesystem */
public final class C36421nr {
    public static final List A02;
    public final AnonymousClass18K A00;
    public final C36411nq A01;

    public C36421nr(AnonymousClass18K r2, C36411nq r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    static {
        List asList = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        C18070vi.A0X(asList);
        A02 = asList;
    }

    public final void A00(int i, int i2) {
        List list;
        C36411nq r2 = this.A01;
        synchronized (r2) {
            String A002 = C36411nq.A00(i);
            C18100vl r4 = r2.A01;
            Object value = r4.getValue();
            C18070vi.A0X(value);
            String str = "0,0,0";
            String string = ((SharedPreferences) value).getString(A002, str);
            if (string != null) {
                str = string;
            }
            List A012 = new C41661wr(",").A01(str, 0);
            if (!A012.isEmpty()) {
                ListIterator listIterator = A012.listIterator(A012.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = C29431cG.A0v(A012, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = C18460wS.A00;
            String[] strArr = (String[]) list.toArray(new String[0]);
            if (i2 < strArr.length) {
                strArr[i2] = String.valueOf(Integer.parseInt(strArr[i2]) + 1);
                String A0I = C200410p.A0I(",", "", "", strArr);
                Object value2 = r4.getValue();
                C18070vi.A0X(value2);
                SharedPreferences.Editor edit = ((SharedPreferences) value2).edit();
                C18070vi.A0X(edit);
                edit.putString(A002, A0I).apply();
            } else {
                throw new IllegalStateException("position exceeds event array length");
            }
        }
    }
}
