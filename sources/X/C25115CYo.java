package X;

import java.util.List;

/* renamed from: X.CYo  reason: case insensitive filesystem */
public class C25115CYo {
    public Integer A00;
    public String A01;
    public List A02 = null;
    public List A03 = null;

    public void A00(Integer num, String str, String str2) {
        List list = this.A02;
        if (list == null) {
            list = AnonymousClass000.A13();
            this.A02 = list;
        }
        list.add(new CP4(num, str, str2));
    }

    public C25115CYo(Integer num, String str) {
        this.A00 = num == null ? AnonymousClass00R.A00 : num;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0060
            java.lang.String r0 = "> "
        L_0x000c:
            r3.append(r0)
        L_0x000f:
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "*"
        L_0x0015:
            r3.append(r0)
            java.util.List r0 = r5.A02
            if (r0 == 0) goto L_0x0067
            java.util.Iterator r4 = r0.iterator()
        L_0x0020:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r2 = r4.next()
            X.CP4 r2 = (X.CP4) r2
            r0 = 91
            r3.append(r0)
            java.lang.String r0 = r2.A01
            r3.append(r0)
            X.C7s r0 = X.C24523C7s.$redex_init_class
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x005a
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 3
            if (r1 != r0) goto L_0x0051
            java.lang.String r0 = "|="
        L_0x0049:
            r3.append(r0)
        L_0x004c:
            java.lang.String r0 = r2.A02
            r3.append(r0)
        L_0x0051:
            r0 = 93
            r3.append(r0)
            goto L_0x0020
        L_0x0057:
            java.lang.String r0 = "~="
            goto L_0x0049
        L_0x005a:
            r0 = 61
            r3.append(r0)
            goto L_0x004c
        L_0x0060:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x000f
            java.lang.String r0 = "+ "
            goto L_0x000c
        L_0x0067:
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L_0x0082
            java.util.Iterator r2 = r0.iterator()
        L_0x006f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()
            r0 = 58
            r3.append(r0)
            r3.append(r1)
            goto L_0x006f
        L_0x0082:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25115CYo.toString():java.lang.String");
    }
}
