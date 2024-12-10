package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0mi  reason: invalid class name and case insensitive filesystem */
public final class C13030mi extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13030mi(AnonymousClass1OS r2) {
        super(2);
        this.$save = r2;
    }

    /* renamed from: A00 */
    public final ArrayList invoke(C15760rA r6, Object obj) {
        AnonymousClass0tC r0;
        List list = (List) this.$save.invoke(r6, obj);
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj2 = list.get(i);
            if (obj2 == null || (r0 = ((C05720Vl) r6).A00) == null || r0.BE7(obj2)) {
                i++;
            } else {
                throw AnonymousClass000.A0k("item can't be saved");
            }
        }
        if (AnonymousClass000.A1a(list)) {
            return new ArrayList(list);
        }
        return null;
    }
}
