package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.16Z  reason: invalid class name */
public class AnonymousClass16Z {
    public final String A00;
    public final List A01;

    public AnonymousClass16Z(String str) {
        this.A01 = new ArrayList();
        this.A00 = str;
    }

    public AnonymousClass16Z(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A00 = str;
        arrayList.addAll(list);
    }
}
