package X;

import java.util.List;

/* renamed from: X.COx  reason: case insensitive filesystem */
public class C24904COx {
    public final List A00;
    public final List A01;
    public final List A02;

    public C24904COx(List list) {
        this.A01 = list;
        this.A00 = AnonymousClass000.A14(list);
        this.A02 = AnonymousClass000.A14(list);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new AnonymousClass29I(((C24947CQx) list.get(i)).A01.A00));
            this.A02.add(((C24947CQx) list.get(i)).A00.BHA());
        }
    }
}
