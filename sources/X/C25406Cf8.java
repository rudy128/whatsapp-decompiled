package X;

/* renamed from: X.Cf8  reason: case insensitive filesystem */
public abstract class C25406Cf8 {
    public static final C6H A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.C6H] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            boolean r0 = X.C26277CwW.A05
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.C26277CwW.A04
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.C25440Cfn.A00()
            if (r0 != 0) goto L_0x0016
            X.Bhw r0 = new X.Bhw
            r0.<init>()
        L_0x0013:
            A00 = r0
            return
        L_0x0016:
            X.Bhv r0 = new X.Bhv
            r0.<init>()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25406Cf8.<clinit>():void");
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C24407C2e(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass000.A0k(C17890vO.A0a("UTF-8 length does not fit in int: ", BE6.A0t(54), ((long) i3) + 4294967296L));
    }
}
