package X;

/* renamed from: X.CfK  reason: case insensitive filesystem */
public abstract class C25412CfK {
    public static final CZV A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.CZV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.CZV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.CZV} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = com.google.protobuf.UnsafeUtil.A05
            if (r0 == 0) goto L_0x0010
            boolean r0 = com.google.protobuf.UnsafeUtil.A06
            if (r0 == 0) goto L_0x0010
            java.lang.Class r0 = X.CHO.A00
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.CHO.A01
            if (r0 != 0) goto L_0x0018
        L_0x0010:
            X.BnZ r0 = new X.BnZ
            r0.<init>()
        L_0x0015:
            A00 = r0
            return
        L_0x0018:
            X.Bna r0 = new X.Bna
            r0.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25412CfK.<clinit>():void");
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) >= 65536) {
                                i++;
                            } else {
                                throw new C24408C2g(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UTF-8 length does not fit in int: ");
        A10.append(((long) i2) + 4294967296L);
        throw AnonymousClass000.A0j(A10);
    }
}
