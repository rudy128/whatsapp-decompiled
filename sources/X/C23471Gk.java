package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Gk  reason: invalid class name and case insensitive filesystem */
public final class C23471Gk {
    public long A00;
    public Integer A01 = AnonymousClass00R.A01;
    public String A02;
    public List A03;
    public List A04;

    public final void A01(String str) {
        List list = this.A04;
        if (list != null) {
            list.clear();
            list.add(str);
        } else {
            list = AnonymousClass1ZU.A06(str);
        }
        this.A04 = list;
    }

    public final C23471Gk A00() {
        ArrayList arrayList;
        C23471Gk r3 = new C23471Gk();
        r3.A02 = this.A02;
        r3.A00 = this.A00;
        List list = this.A04;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        r3.A04 = arrayList;
        List list2 = this.A03;
        if (list2 != null) {
            arrayList2 = new ArrayList(list2);
        }
        r3.A03 = arrayList2;
        r3.A01 = this.A01;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r2 = this;
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23471Gk.A02():boolean");
    }

    public final boolean A03() {
        List list = this.A04;
        if ((list == null || list.isEmpty()) && !A02()) {
            return false;
        }
        return true;
    }
}
