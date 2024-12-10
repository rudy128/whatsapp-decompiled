package X;

import java.util.List;

/* renamed from: X.BpE  reason: case insensitive filesystem */
public class C23769BpE extends C25278Cca {
    public final String A00;
    public final List A01;

    public C23769BpE(List list, char c) {
        if (!list.isEmpty()) {
            this.A01 = list;
            this.A00 = Character.toString(c);
            return;
        }
        throw C23741Bom.A00("Empty properties");
    }
}
