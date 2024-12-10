package X;

import android.content.Context;
import android.util.Pair;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.73n  reason: invalid class name and case insensitive filesystem */
public final class C1409073n {
    public static final Interpolator A00;
    public static final Interpolator A01;
    public static final AnonymousClass4MZ A02 = new AnonymousClass4MZ(false, false);
    public static final C1409073n A03 = new Object();
    public static final String[] A04;

    public static final AnonymousClass7PX A00(AnonymousClass7PX r11) {
        AnonymousClass7PX r2 = r11;
        C18070vi.A0d(r11, 0);
        String str = r11.A05;
        if (str == null || str.length() == 0 || AnonymousClass72X.A02(str)) {
            return r2;
        }
        return new AnonymousClass7PX(r11.A03, r11.A04, C43271zX.A00, r11.A01, r11.A02, r11.A00);
    }

    public final String A04(String str) {
        C18070vi.A0d(str, 0);
        return C137176v2.A01(AnonymousClass74I.A08(new AnonymousClass737(AnonymousClass72X.A00(str)).A00));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.73n, java.lang.Object] */
    static {
        Interpolator A002 = C29111bd.A00(0.83f, 0.0f, 0.17f, 1.0f);
        C18070vi.A0X(A002);
        A01 = A002;
        Interpolator A003 = C29111bd.A00(0.85f, 0.0f, 0.15f, 1.0f);
        C18070vi.A0X(A003);
        A00 = A003;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "👍";
        A04 = A1Y;
    }

    public static final String A02(String str) {
        if (str == null || str.length() == 0 || AnonymousClass72X.A02(str)) {
            return str;
        }
        return C43271zX.A00;
    }

    public static final String A01(Context context, C18000vb r2, int i) {
        String format;
        C18070vi.A0h(r2, context);
        if (i > 999) {
            format = context.getString(2131891906);
        } else {
            format = r2.A0L().format((long) i);
        }
        C18070vi.A0b(format);
        return format;
    }

    public static final ArrayList A03(Iterator it) {
        boolean A0O;
        C115125tR r0;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        while (it.hasNext()) {
            AnonymousClass7PW r8 = (AnonymousClass7PW) it.next();
            ArrayList A133 = AnonymousClass000.A13();
            ArrayList A134 = AnonymousClass000.A13();
            Iterator descendingIterator = r8.A04.descendingIterator();
            C18070vi.A0X(descendingIterator);
            while (descendingIterator.hasNext()) {
                Object next = descendingIterator.next();
                C18070vi.A0X(next);
                AnonymousClass7PX A002 = A00((AnonymousClass7PX) next);
                if (!(r8 instanceof C115125tR) || (r0 = (C115125tR) r8) == null) {
                    A0O = A002.A03.A0O(A002.A04);
                } else {
                    A0O = r0.A01;
                }
                if (A0O) {
                    A133.add(A002);
                } else {
                    A134.add(A002);
                }
            }
            Pair A0N = C108945cZ.A0N(A133, A134);
            Object obj = A0N.first;
            C18070vi.A0W(obj);
            A13.addAll((Collection) obj);
            Object obj2 = A0N.second;
            C18070vi.A0W(obj2);
            A132.addAll((Collection) obj2);
        }
        A13.addAll(A132);
        return A13;
    }

    public final ArrayList A05(AnonymousClass8BG r10, int i, boolean z) {
        Iterator BMh = r10.BMh();
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        while (BMh.hasNext()) {
            AnonymousClass7PW r5 = (AnonymousClass7PW) BMh.next();
            if (r5 instanceof C115125tR) {
                C115125tR r52 = (C115125tR) r5;
                String str = r52.A02;
                String A042 = A04(str);
                if (z && r52.A01) {
                    A132.put(A042, str);
                }
                A13.put(A042, C17880vN.A0o(C17900vP.A01(C108945cZ.A1D(A042, A13)), r52.A00));
            }
        }
        ArrayList A133 = AnonymousClass000.A13();
        if (!A132.isEmpty()) {
            Iterator A15 = AnonymousClass000.A15(A132);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                A133.add(A16.getValue());
                A13.remove(key);
                i--;
            }
        }
        int min = Math.min(i, A13.size());
        ArrayList A10 = C17880vN.A10(A13.entrySet());
        C29391cC.A0H(A10, new C146997Rk((Object) AnonymousClass84N.A00, 9));
        for (int i2 = 0; i2 < min; i2++) {
            A133.add(((Map.Entry) A10.get(i2)).getKey());
        }
        return A133;
    }
}
