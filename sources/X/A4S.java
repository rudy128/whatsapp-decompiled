package X;

import com.whatsapp.util.Log;

public class A4S {
    public final int A00;
    public final byte[] A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A4S(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0015
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r4 != r0) goto L_0x0015
            java.lang.String r0 = "Invalid signature!"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r4 = -1203(0xfffffffffffffb4d, float:NaN)
        L_0x0015:
            r2.<init>((byte[]) r1, (int) r4)
            return
        L_0x0019:
            java.lang.String r0 = "Unknown type: "
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "No keys for: "
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "Bad key type: "
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "Over 2000 messages into the future!"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003c
            r4 = -1202(0xfffffffffffffb4e, float:NaN)
            goto L_0x0015
        L_0x003c:
            java.lang.String r0 = "Bad Mac!"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0047
            r4 = -1204(0xfffffffffffffb4c, float:NaN)
            goto L_0x0015
        L_0x0047:
            java.lang.String r0 = "No valid sessions."
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0015
            r4 = -1205(0xfffffffffffffb4b, float:NaN)
            goto L_0x0015
        L_0x0052:
            r4 = -1002(0xfffffffffffffc16, float:NaN)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4S.<init>(java.lang.String, int):void");
    }

    public static A4S A00(Exception exc, byte[] bArr, int i) {
        int i2;
        int length;
        String str;
        if (exc != null) {
            Log.w("axolotl", exc);
        }
        String str2 = null;
        if (i == 0) {
            if (bArr == null || (length = bArr.length) == 0) {
                Log.w("SignalCoordinator/createDecryptionResult axolotl derived null or empty plaintext from message");
                i2 = -1000;
            } else {
                byte b = bArr[length - 1] & 255;
                if (b == 0) {
                    str = "SignalCoordinatorDefault/removePadding/ axolotl derived plaintext has invalid padding";
                } else if (b >= length) {
                    str = "SignalCoordinatorDefault/removePadding/ axolotl derived entire plaintext as padding";
                } else {
                    int i3 = length - b;
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    if (bArr2.length != 0) {
                        return new A4S(bArr2, 0);
                    }
                    i2 = -10000;
                }
                Log.w(str);
                i2 = -10000;
            }
            return new A4S((byte[]) null, i2);
        }
        if (exc != null) {
            str2 = exc.getMessage();
        }
        return new A4S(str2, i);
    }

    public boolean A01() {
        int i = this.A00;
        if (i == -1008 || i == -1002 || i == -1003 || i == -1005 || i == -1203 || i == -1202 || i == -1204 || i == -1205 || i == -1206) {
            return true;
        }
        return false;
    }

    public A4S(byte[] bArr, int i) {
        this.A01 = bArr;
        this.A00 = i;
    }
}
