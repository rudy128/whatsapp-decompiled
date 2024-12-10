package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.16I  reason: invalid class name */
public class AnonymousClass16I implements AnonymousClass16H {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C54532eI BVF(X.C34141jz r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = r6.A07
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.9gq r4 = r6.A05
            if (r4 == 0) goto L_0x0060
            boolean r0 = r4.A04
            java.lang.String r1 = "n"
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "q"
            r2.add(r0)
            r2.add(r1)
        L_0x0034:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "s"
            r1.add(r0)
        L_0x0042:
            X.9RF r0 = r4.A00
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "r"
            r1.add(r0)
        L_0x004b:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "c"
            r1.add(r0)
        L_0x0054:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "i"
            r1.add(r0)
        L_0x005d:
            r3.addAll(r1)
        L_0x0060:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = ""
            r3.add(r0)
        L_0x006b:
            X.2eI r0 = new X.2eI
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r2
            return r0
        L_0x0075:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0034
            r3.add(r1)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16I.BVF(X.1jz):X.2eI");
    }

    public Set BUj(AnonymousClass206 r5) {
        String str;
        String str2;
        String str3;
        if (AnonymousClass25B.A01(r5) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("");
        AW0 A00 = AnonymousClass25B.A00(r5);
        if (A00 != null) {
            if (AW0.A00(A00)) {
                str = "c";
            } else {
                str = "i";
            }
            hashSet.add(str);
            if (A00.A0K()) {
                int i = A00.A02;
                if (i == 12) {
                    str3 = "n";
                } else if (i == 17) {
                    str3 = "q";
                }
                hashSet.add(str3);
            }
            if (A00.A0Q) {
                str2 = "s";
            } else {
                str2 = "r";
            }
            hashSet.add(str2);
        }
        return hashSet;
    }

    public String BVE() {
        return "p";
    }
}
