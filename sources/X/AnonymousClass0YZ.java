package X;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0YZ  reason: invalid class name */
public class AnonymousClass0YZ implements AutoCloseable {
    public String[] A00;
    public final ArrayDeque A01;

    public void close() {
        this.A01.removeFirst();
    }

    public AnonymousClass0YZ(Object obj, String str, ArrayDeque arrayDeque) {
        this.A01 = arrayDeque;
        if (obj != null) {
            AnonymousClass0I7 r4 = new AnonymousClass0I7(obj, str);
            arrayDeque.addFirst(r4);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder A10 = AnonymousClass000.A10();
                int min = Math.min(arrayDeque.size(), 11);
                String[] strArr = this.A00;
                if (strArr == null) {
                    strArr = new String[12];
                    this.A00 = strArr;
                }
                String str2 = strArr[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    str2 = new String(cArr);
                    str2 = min == 11 ? AnonymousClass000.A0y("...", AnonymousClass000.A11(str2)) : str2;
                    this.A00[min] = str2;
                }
                A10.append(str2);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(C05110Ql.A07(r4.A00.getClass()));
                A102.append(" ");
                Log.v("CarApp.Bun", AnonymousClass000.A0y(AnonymousClass000.A0y(r4.A01, A102), A10));
            }
        }
    }

    public String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        ArrayDeque arrayDeque = this.A01;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            AnonymousClass0I7 r2 = (AnonymousClass0I7) descendingIterator.next();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("[");
            A102.append(r2.A01);
            A102.append(", ");
            A102.append(C05110Ql.A07(r2.A00.getClass()));
            A10.append(AnonymousClass000.A0z(A102));
            min = i;
        }
        if (descendingIterator.hasNext()) {
            A10.append("[...]");
        }
        return A10.toString();
    }
}
