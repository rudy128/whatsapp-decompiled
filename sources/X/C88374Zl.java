package X;

import android.content.res.Resources;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4Zl  reason: invalid class name and case insensitive filesystem */
public abstract class C88374Zl {
    public static final String A00(AnonymousClass11S r6, AnonymousClass1M9 r7, C24921Me r8, AnonymousClass118 r9, AnonymousClass1MZ r10, AnonymousClass1E9 r11) {
        C18070vi.A0n(r9, r6, r7);
        C18070vi.A0g(r10, 4, r11);
        return A01(r6, r7, r8, r9, r10, r11, 10);
    }

    public static final String A02(AnonymousClass118 r7, List list, int i) {
        String string;
        C18070vi.A0d(r7, 0);
        int size = list.size();
        if (size == i) {
            return A03(r7, list, 3);
        }
        Resources A05 = AnonymousClass3MW.A05(r7);
        if (size > 0) {
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = list.get(0);
            C17880vN.A1T(A1b, i - 1, 1);
            string = A05.getQuantityString(2131755311, i - 1, A1b);
        } else {
            string = A05.getString(2131890864);
        }
        C18070vi.A0b(string);
        return string;
    }

    public static final String A01(AnonymousClass11S r6, AnonymousClass1M9 r7, C24921Me r8, AnonymousClass118 r9, AnonymousClass1MZ r10, AnonymousClass1E9 r11, int i) {
        HashSet A12 = C17880vN.A12();
        AnonymousClass1IZ it = r10.A08.A0C(r11).A08().iterator();
        boolean z = false;
        while (it.hasNext()) {
            UserJid userJid = ((C63312sr) it.next()).A04;
            if (r6.A0O(userJid)) {
                z = true;
            } else {
                AnonymousClass3MY.A1O(r7, userJid, A12);
            }
        }
        if (!z || !A12.isEmpty()) {
            return A03(r9, r8.A0e(A12, r8.A0A(r11), false), i);
        }
        return C18070vi.A0F(r9.A00, 2131898595);
    }

    public static final String A03(AnonymousClass118 r8, List list, int i) {
        Resources A05;
        int i2;
        Object[] objArr;
        Object obj;
        String quantityString;
        if (list.isEmpty()) {
            quantityString = AnonymousClass3MW.A05(r8).getString(2131890864);
        } else if (list.size() == 1) {
            return C17880vN.A0w(list, 0);
        } else {
            if (list.size() == 2) {
                A05 = AnonymousClass3MW.A05(r8);
                i2 = 2131897208;
                objArr = new Object[2];
                objArr[0] = list.get(0);
                obj = list.get(1);
            } else if (list.size() == 3) {
                Resources A052 = AnonymousClass3MW.A05(r8);
                Object[] objArr2 = new Object[3];
                C72473Md.A1O(list, objArr2);
                quantityString = AnonymousClass3MW.A0x(A052, list.get(2), objArr2, 2, 2131896872);
            } else if (list.size() > i) {
                Resources A053 = AnonymousClass3MW.A05(r8);
                int A02 = AnonymousClass3MX.A02(list, 1);
                Object[] objArr3 = new Object[2];
                objArr3[0] = list.get(0);
                C17880vN.A1T(objArr3, AnonymousClass3MX.A02(list, 1), 1);
                quantityString = A053.getQuantityString(2131755311, A02, objArr3);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                int A022 = AnonymousClass3MX.A02(list, 2);
                for (int i3 = 0; i3 < A022; i3++) {
                    A10.append(C17880vN.A0w(list, i3));
                    A10.append(", ");
                }
                A10.append(C17880vN.A0w(list, AnonymousClass3MX.A02(list, 2)));
                A05 = AnonymousClass3MW.A05(r8);
                i2 = 2131897208;
                objArr = new Object[2];
                objArr[0] = A10.toString();
                obj = list.get(AnonymousClass3MX.A02(list, 1));
            }
            quantityString = AnonymousClass3MW.A0x(A05, obj, objArr, 1, i2);
        }
        C18070vi.A0b(quantityString);
        return quantityString;
    }
}
