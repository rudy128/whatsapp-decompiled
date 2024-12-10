package X;

import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.A7h  reason: case insensitive filesystem */
public abstract class C20103A7h {
    public static final ThreadLocal A00 = new C21592Amg();
    public static final Pattern A01 = Pattern.compile("[\\p{ASCII}&&[^\\p{Alnum}]]");
    public static final ThreadLocal A02 = new C21593Amh();

    public static ArrayList A03(C18000vb r1, String str) {
        Object obj = A00(r1, str, true).A01;
        C17960vV.A07(obj);
        return (ArrayList) obj;
    }

    public static boolean A04(C18000vb r9, String str, List list, boolean z) {
        boolean equals;
        if (str == null) {
            return false;
        }
        String replaceAll = A01.matcher(str).replaceAll(" ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            BreakIterator A022 = A02(r9);
            A022.setText(replaceAll);
            int first = A022.first();
            while (true) {
                int next = A022.next();
                int i = first;
                first = next;
                if (next == -1) {
                    return false;
                }
                String A05 = AnonymousClass1EG.A05(replaceAll.substring(i, next));
                if (z) {
                    equals = A05.startsWith(A0v);
                    continue;
                } else {
                    equals = A05.equals(A0v);
                    continue;
                }
                if (equals) {
                }
            }
        }
        return true;
    }

    public static C19760yx A00(C18000vb r9, String str, boolean z) {
        String A06;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = A01.matcher(str).replaceAll(" ");
            BreakIterator A022 = A02(r9);
            A022.setText(replaceAll);
            int first = A022.first();
            while (true) {
                int next = A022.next();
                int i = first;
                first = next;
                if (next == -1) {
                    break;
                }
                String substring = replaceAll.substring(i, next);
                if (z) {
                    A06 = AnonymousClass1EG.A05(substring);
                } else {
                    A06 = AnonymousClass1EG.A06(substring);
                }
                if (!TextUtils.isEmpty(A06) && !Character.isSpaceChar(A06.codePointAt(0))) {
                    C17890vO.A1D(A132, i);
                    C17890vO.A1D(A132, next);
                    A13.add(A06);
                }
            }
        }
        return AnonymousClass8BR.A0B(A132, A13);
    }

    public static String A01(C18000vb r9, String str) {
        if (str.isEmpty()) {
            return str;
        }
        boolean z = false;
        if (!AnonymousClass2W6.A00.matcher(str).find()) {
            z = true;
            str = AnonymousClass1EG.A06(str);
        }
        StringBuilder sb = new StringBuilder(str.length());
        BreakIterator A022 = A02(r9);
        A022.setText(str);
        int first = A022.first();
        while (true) {
            int next = A022.next();
            int i = first;
            first = next;
            if (next == -1) {
                break;
            } else if (next - i != 1 || str.codePointAt(i) != 32) {
                CharSequence subSequence = str.subSequence(i, next);
                if (!z) {
                    subSequence = AnonymousClass1EG.A06(subSequence);
                }
                sb.append(subSequence);
                sb.append(' ');
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static BreakIterator A02(C18000vb r3) {
        Locale A0N = r3.A0N();
        ThreadLocal threadLocal = A00;
        if (A0N.equals(threadLocal.get())) {
            return (BreakIterator) A02.get();
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(A0N);
        threadLocal.set(A0N);
        A02.set(wordInstance);
        return wordInstance;
    }
}
