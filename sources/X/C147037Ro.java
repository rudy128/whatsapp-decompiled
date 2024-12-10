package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7Ro  reason: invalid class name and case insensitive filesystem */
public class C147037Ro implements Comparator {
    public HashMap A00;
    public final C128996h5[] A01;

    private synchronized HashMap A01() {
        HashMap hashMap;
        hashMap = this.A00;
        if (hashMap == null) {
            hashMap = C17880vN.A11();
            C128996h5[] r5 = this.A01;
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                for (Object A0z : (List) r5[i2].A03.get()) {
                    C17890vO.A0z(A0z, hashMap, i);
                    i++;
                }
            }
            this.A00 = hashMap;
        }
        return hashMap;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((AnonymousClass737) obj) - A00((AnonymousClass737) obj2);
    }

    public C147037Ro(C128996h5[] r1) {
        this.A01 = r1;
    }

    private int A00(AnonymousClass737 r3) {
        if (A01().containsKey(r3)) {
            return AnonymousClass000.A0M(A01().get(r3));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ");
        C17890vO.A19(A10, r3.toString());
        return 0;
    }
}
