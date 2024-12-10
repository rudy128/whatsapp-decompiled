package X;

import java.util.List;

/* renamed from: X.BpF  reason: case insensitive filesystem */
public class C23770BpF extends C25278Cca {
    public List A00;
    public final String A01;
    public final String A02;

    public C23770BpF(String str, List list) {
        String str2;
        StringBuilder A11 = AnonymousClass000.A11(str);
        if (list == null || list.size() <= 0) {
            str2 = "()";
        } else {
            str2 = "(...)";
        }
        this.A02 = AnonymousClass000.A0y(str2, A11);
        if (str != null) {
            this.A01 = str;
            this.A00 = list;
            return;
        }
        this.A00 = null;
    }
}
