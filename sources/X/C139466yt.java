package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6yt  reason: invalid class name and case insensitive filesystem */
public class C139466yt {
    public static List A02;
    public final List A00 = AnonymousClass000.A13();
    public final List A01 = AnonymousClass000.A13();

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 128105);
        AnonymousClass000.A1M(numArr, 128104);
        AnonymousClass3Ma.A1S(numArr, 129489);
        C17890vO.A1G(numArr, 129777);
        AnonymousClass3Ma.A1T(numArr, 129778);
        A02 = Arrays.asList(numArr);
    }

    public C139466yt A00(int i, int i2) {
        int i3 = i - 1;
        List list = this.A01;
        if (i3 >= list.size()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MultiSkinToneEmoji/createSkinTonedEmoji/error/person index ");
            A10.append(i3);
            C17890vO.A15(" is bigger than the total length of sequence ", A10, list);
            C17890vO.A0w(A10);
            return this;
        }
        C139466yt r2 = new C139466yt(A01());
        List list2 = r2.A01;
        if (list2.size() > i3) {
            list2.set(i3, C17890vO.A0E(((Pair) list2.get(i3)).first, i2));
        }
        return r2;
    }

    public C139466yt(int[] iArr) {
        ArrayList arrayList = null;
        char c = 0;
        int i = 0;
        for (int i2 : iArr) {
            if (AnonymousClass3Ma.A1b(A02, i2)) {
                if (arrayList != null) {
                    this.A00.add(arrayList);
                }
                i++;
                this.A01.add(C17890vO.A0E(Integer.valueOf(i2), -1));
                arrayList = AnonymousClass000.A13();
                c = 1;
            } else {
                int[] iArr2 = AnonymousClass74I.A05;
                int i3 = 0;
                while (true) {
                    if (iArr2[i3] != i2) {
                        i3++;
                        if (i3 >= 5) {
                            break;
                        }
                    } else if (c == 1) {
                        List list = this.A01;
                        int i4 = i - 1;
                        list.set(i4, C17890vO.A0E(((Pair) list.get(i4)).first, i2));
                        c = 2;
                    }
                }
                if (i2 == 8205) {
                    C17960vV.A07(arrayList);
                    C17890vO.A1D(arrayList, i2);
                    c = 3;
                } else if (c == 3) {
                    C17960vV.A07(arrayList);
                    C17890vO.A1D(arrayList, i2);
                }
            }
        }
    }

    public int[] A01() {
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i >= list.size()) {
                return C25336Cdv.A01(A13);
            }
            A13.add(((Pair) list.get(i)).first);
            if (!(list.size() <= i || list.get(i) == null || C108965cb.A00((Pair) list.get(i)) == -1)) {
                A13.add(((Pair) list.get(i)).second);
            }
            List list2 = this.A00;
            if (list2.size() > i && list2.get(i) != null) {
                A13.addAll((Collection) list2.get(i));
            }
            i++;
        }
    }
}
