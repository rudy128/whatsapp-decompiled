package X;

import java.util.Arrays;

/* renamed from: X.9zS  reason: invalid class name and case insensitive filesystem */
public class C199109zS {
    public final byte[] A00;
    public final byte[] A01;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(byte[] r4) {
        /*
            r3 = 0
        L_0x0001:
            int r2 = r4.length
            if (r3 >= r2) goto L_0x000d
            byte r1 = r4[r3]
            r0 = 45
            if (r1 != r0) goto L_0x000d
            int r3 = r3 + 1
            goto L_0x0001
        L_0x000d:
            if (r3 != r2) goto L_0x0017
            java.lang.String r0 = "BackupFooter/verify-jid/empty-suffix"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = ""
            return r0
        L_0x0017:
            int r2 = r2 - r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3, r2)
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199109zS.A00(byte[]):java.lang.String");
    }

    public C199109zS(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupFooter{digest=");
        C17890vO.A1C(A10, this.A00);
        A10.append(", jidSuffix=");
        byte[] bArr = this.A01;
        if (bArr != null) {
            str = Arrays.toString(bArr);
        } else {
            str = "null";
        }
        A10.append(str);
        return C17890vO.A0b(A10);
    }
}
