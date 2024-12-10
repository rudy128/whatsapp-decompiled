package com.google.common.base;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BW;
import X.BE7;
import X.BE8;
import X.BE9;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    public static String A00(String str, Object... objArr) {
        int length;
        String A0y;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                A0y = "null";
            } else {
                try {
                    A0y = obj.toString();
                } catch (Exception e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BW.A1M(obj, A10);
                    A10.append('@');
                    String A0y2 = AnonymousClass000.A0y(BE8.A0h(obj), A10);
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, AnonymousClass001.A1H("Exception during lenientFormat for ", A0y2, AnonymousClass000.A10()), e);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("<");
                    A102.append(A0y2);
                    A102.append(" threw ");
                    AnonymousClass8BW.A1M(e, A102);
                    A0y = AnonymousClass000.A0y(">", A102);
                }
            }
            objArr[i2] = A0y;
            i2++;
        }
        int length2 = valueOf.length();
        StringBuilder A0q = BE7.A0q(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0q.append(valueOf, i3, indexOf);
            A0q.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0q.append(valueOf, i3, length2);
        if (i < length) {
            int A0H = BE9.A0H(" [", A0q, objArr, i);
            while (A0H < length) {
                A0H = BE9.A0H(", ", A0q, objArr, A0H);
            }
            A0q.append(']');
        }
        return A0q.toString();
    }
}
