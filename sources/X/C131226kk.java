package X;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6kk  reason: invalid class name and case insensitive filesystem */
public final class C131226kk {
    public final C138106wX A00(Context context, AnonymousClass12C r13, List list) {
        int i;
        File file;
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            boolean z = A0Y instanceof C438421d;
            if (z || (A0Y instanceof C441822l) || (A0Y instanceof AnonymousClass21X)) {
                C18070vi.A0z(A0Y, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia");
                C62572rc r0 = ((AnonymousClass21V) A0Y).A02;
                if (!(r0 == null || (file = r0.A0G) == null)) {
                    if (!z) {
                        if (A0Y instanceof C441822l) {
                            i3 = 1;
                        } else {
                            i4 = 1;
                        }
                        A13.put(A0Y, new C127786ev(file, (String) obj));
                    }
                }
            } else if (A0Y instanceof AnonymousClass210) {
                AnonymousClass210 r2 = (AnonymousClass210) A0Y;
                C18070vi.A0d(r2, 0);
                C110485fs A00 = AnonymousClass6XY.A00(context, (C36381nn) null, r2);
                obj = C29431cG.A0c(A00.A0D);
                file = r13.A00(r2, A00);
                if (file == null) {
                }
            }
            i2 = 1;
            A13.put(A0Y, new C127786ev(file, (String) obj));
        }
        if (i2 + i3 + i4 > 1) {
            i = 7;
        } else {
            boolean A1T = AnonymousClass000.A1T(A13.size(), 1);
            if (i2 != 0) {
                i = 4;
                if (A1T) {
                    i = 1;
                }
            } else if (i3 != 0) {
                i = 5;
                if (A1T) {
                    i = 2;
                }
            } else if (i4 != 0) {
                i = 6;
                if (A1T) {
                    i = 3;
                }
            } else {
                i = 0;
            }
        }
        return new C138106wX(A13, i);
    }
}
