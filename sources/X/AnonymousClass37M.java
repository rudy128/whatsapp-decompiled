package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.37M  reason: invalid class name */
public class AnonymousClass37M implements AnonymousClass3MD {
    public final C54012dS A00;
    public final AnonymousClass190 A01;
    public final C18030ve A02;
    public final C30961en A03;

    public static void A05(OutputStream outputStream, String str, boolean z, boolean z2) {
        byte[] bArr;
        Jid A022;
        String str2 = str;
        C18070vi.A0d(str2, 0);
        if (C61102p8.A00 == null) {
            synchronized (C61102p8.A01) {
                if (C61102p8.A00 == null) {
                    LinkedHashMap A13 = C17880vN.A13();
                    String[] strArr = AnonymousClass2WT.A00;
                    int i = 0;
                    int i2 = 0;
                    do {
                        String str3 = strArr[i];
                        int i3 = i2 + 1;
                        if (!(str3 == null || str3.length() == 0)) {
                            A13.put(str3, new C54482eD(0, i2, false));
                        }
                        i++;
                        i2 = i3;
                    } while (i < 236);
                    String[][] strArr2 = AnonymousClass2WT.A01;
                    int i4 = 0;
                    int i5 = 0;
                    do {
                        String[] strArr3 = strArr2[i4];
                        int i6 = i5 + 1;
                        int length = strArr3.length;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            String str4 = strArr3[i7];
                            int i9 = i8 + 1;
                            if (str4.length() > 0) {
                                A13.put(str4, new C54482eD(i5 + 236, i8, true));
                            }
                            i7++;
                            i8 = i9;
                        }
                        i4++;
                        i5 = i6;
                    } while (i4 < 4);
                    C61102p8.A00 = A13;
                }
            }
        }
        Map map = C61102p8.A00;
        if (map == null) {
            C18070vi.A11("tokenReverseLookup");
            throw null;
        }
        C54482eD r3 = (C54482eD) map.get(str2);
        OutputStream outputStream2 = outputStream;
        if (r3 == null) {
            if (z2) {
                if (str2.indexOf(64) < 1) {
                    C22911Dt r0 = Jid.Companion;
                    A022 = C22921Du.A00(str2);
                } else {
                    A022 = Jid.Companion.A02(str2);
                }
                if (A022 != null && A022.isProtocolCompliant()) {
                    A00(A022, outputStream2);
                    return;
                }
            }
            try {
                bArr = str2.getBytes(C19620yd.A0A);
            } catch (UnsupportedEncodingException unused) {
                bArr = null;
            }
            A06(outputStream2, bArr, z);
            return;
        }
        if (r3.A02) {
            short s = r3.A01;
            if (s < 0 || s > 255) {
                throw C17880vN.A0f("invalid token");
            }
            outputStream2.write((byte) s);
        }
        short s2 = r3.A00;
        if (s2 < 0 || s2 > 255) {
            throw C17880vN.A0f("invalid token");
        }
        outputStream2.write((byte) s2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if ((r5 % 2) != r9) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r4 = r4 - r9;
        r3[r4] = (byte) (r3[r4] | 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        r10.write(r6);
        r10.write(((r5 & 1) << 7) | r3.length);
        r11 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(java.io.OutputStream r10, byte[] r11, boolean r12) {
        /*
            int r5 = r11.length
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r5 < r0) goto L_0x002c
            r0 = 254(0xfe, float:3.56E-43)
            r10.write(r0)
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            r0 = r0 & r5
            int r0 = r0 >> 24
            r10.write(r0)
            r0 = 16711680(0xff0000, float:2.3418052E-38)
        L_0x0014:
            r0 = r0 & r5
            int r0 = r0 >> 16
            r10.write(r0)
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r5
            int r0 = r0 >> 8
            r10.write(r0)
            r0 = r5 & 255(0xff, float:3.57E-43)
            r10.write(r0)
        L_0x0028:
            r10.write(r11)
            return
        L_0x002c:
            r0 = 256(0x100, float:3.59E-43)
            if (r5 < r0) goto L_0x0038
            r0 = 253(0xfd, float:3.55E-43)
            r10.write(r0)
            r0 = 983040(0xf0000, float:1.377532E-39)
            goto L_0x0014
        L_0x0038:
            if (r12 == 0) goto L_0x005f
            r6 = 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 >= r0) goto L_0x005f
            int r0 = r5 + 1
            int r4 = r0 / 2
            byte[] r3 = new byte[r4]
            r8 = 0
        L_0x0047:
            r9 = 1
            if (r8 >= r5) goto L_0x00a3
            byte r0 = r11[r8]
            switch(r0) {
                case 45: goto L_0x0084;
                case 46: goto L_0x0084;
                case 47: goto L_0x004f;
                case 48: goto L_0x0089;
                case 49: goto L_0x0089;
                case 50: goto L_0x0089;
                case 51: goto L_0x0089;
                case 52: goto L_0x0089;
                case 53: goto L_0x0089;
                case 54: goto L_0x0089;
                case 55: goto L_0x0089;
                case 56: goto L_0x0089;
                case 57: goto L_0x0089;
                case 58: goto L_0x008f;
                default: goto L_0x004f;
            }
        L_0x004f:
            r6 = 251(0xfb, float:3.52E-43)
            byte[] r3 = new byte[r4]
            r7 = 0
        L_0x0054:
            r9 = 1
            if (r7 >= r5) goto L_0x00a3
            byte r0 = r11[r7]
            switch(r0) {
                case 48: goto L_0x006d;
                case 49: goto L_0x006d;
                case 50: goto L_0x006d;
                case 51: goto L_0x006d;
                case 52: goto L_0x006d;
                case 53: goto L_0x006d;
                case 54: goto L_0x006d;
                case 55: goto L_0x006d;
                case 56: goto L_0x006d;
                case 57: goto L_0x006d;
                default: goto L_0x005c;
            }
        L_0x005c:
            switch(r0) {
                case 65: goto L_0x0068;
                case 66: goto L_0x0068;
                case 67: goto L_0x0068;
                case 68: goto L_0x0068;
                case 69: goto L_0x0068;
                case 70: goto L_0x0068;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = 252(0xfc, float:3.53E-43)
            r10.write(r0)
            A04(r10, r5)
            goto L_0x0028
        L_0x0068:
            int r0 = r0 + -65
            int r8 = r0 + 10
            goto L_0x006f
        L_0x006d:
            int r8 = r0 + -48
        L_0x006f:
            r0 = -1
            if (r8 == r0) goto L_0x005f
            int r2 = r7 / 2
            byte r1 = r3[r2]
            int r0 = r7 % 2
            int r9 = r9 - r0
            int r0 = r9 * 4
            int r8 = r8 << r0
            byte r0 = (byte) r8
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3[r2] = r0
            int r7 = r7 + 1
            goto L_0x0054
        L_0x0084:
            int r0 = r0 + -45
            int r7 = r0 + 10
            goto L_0x008b
        L_0x0089:
            int r7 = r0 + -48
        L_0x008b:
            r0 = -1
            if (r7 != r0) goto L_0x0091
            goto L_0x004f
        L_0x008f:
            r7 = 12
        L_0x0091:
            int r2 = r8 / 2
            byte r1 = r3[r2]
            int r0 = r8 % 2
            int r9 = r9 - r0
            int r0 = r9 * 4
            int r7 = r7 << r0
            byte r0 = (byte) r7
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3[r2] = r0
            int r8 = r8 + 1
            goto L_0x0047
        L_0x00a3:
            int r0 = r5 % 2
            if (r0 != r9) goto L_0x00af
            int r4 = r4 - r9
            byte r0 = r3[r4]
            r0 = r0 | 15
            byte r0 = (byte) r0
            r3[r4] = r0
        L_0x00af:
            r10.write(r6)
            r0 = r5 & 1
            int r1 = r0 << 7
            int r0 = r3.length
            r1 = r1 | r0
            r10.write(r1)
            r11 = r3
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37M.A06(java.io.OutputStream, byte[], boolean):void");
    }

    public static void A00(Jid jid, OutputStream outputStream) {
        if (!(jid instanceof AnonymousClass1ED)) {
            if (jid instanceof AnonymousClass1EF) {
                jid = ((DeviceJid) jid).userJid;
                C18070vi.A0z(jid, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            } else if (jid instanceof C173418v2) {
                outputStream.write(244);
                A05(outputStream, jid.user, true, false);
                A03(outputStream, 0);
                A03(outputStream, 0);
                outputStream.write(2);
                return;
            } else if (jid.getAgent() > 0 || jid.getDevice() > 0) {
                outputStream.write(247);
                int i = 0;
                if (C62832s4.A00(jid)) {
                    i = 128;
                }
                if (jid instanceof C42521yJ) {
                    i |= 1;
                }
                A04(outputStream, i);
                A04(outputStream, jid.getDevice());
                A05(outputStream, jid.user, true, false);
                return;
            } else if (jid.isProtocolCompliant()) {
                outputStream.write(250);
                if (TextUtils.isEmpty(jid.user)) {
                    outputStream.write(0);
                } else {
                    A05(outputStream, jid.user, true, false);
                }
                A05(outputStream, jid.getServer(), false, false);
                return;
            } else {
                C17900vP.A0X(jid, "frame-tree-node-writer/writeJid/failed to write jid: ", AnonymousClass000.A10());
                throw C17880vN.A0f("failed to write jid");
            }
        }
        AnonymousClass1ED r3 = (AnonymousClass1ED) jid;
        outputStream.write(244);
        A05(outputStream, r3.A01, true, false);
        A03(outputStream, r3.getDevice());
        A03(outputStream, r3.A00);
        outputStream.write(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r7.length <= 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C29621ca r10, java.io.OutputStream r11) {
        /*
            X.1ca[] r7 = r10.A02
            r9 = 1
            r6 = 0
            if (r7 == 0) goto L_0x000a
            int r0 = r7.length
            r2 = 1
            if (r0 > 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            byte[] r8 = r10.A01
            if (r8 == 0) goto L_0x0022
            int r2 = r2 + 1
            if (r2 <= r9) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "more than one source of inner data for node; countValues="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0022:
            X.1MD[] r5 = r10.A0S()
            if (r5 != 0) goto L_0x005b
            r0 = 0
        L_0x0029:
            int r0 = r0 + 1
            int r0 = r0 + r2
            A02(r11, r0)
            java.lang.String r0 = r10.A00
            A05(r11, r0, r6, r9)
            if (r5 == 0) goto L_0x005f
            int r4 = r5.length
            r3 = 0
        L_0x0038:
            if (r3 >= r4) goto L_0x005f
            r2 = r5[r3]
            java.lang.String r0 = r2.A02
            A05(r11, r0, r6, r6)
            com.whatsapp.jid.Jid r1 = r2.A01
            byte r0 = r2.A00
            if (r9 != r0) goto L_0x0055
            if (r1 == 0) goto L_0x0055
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x0055
            A00(r1, r11)
        L_0x0052:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0055:
            java.lang.String r0 = r2.A03
            A05(r11, r0, r9, r9)
            goto L_0x0052
        L_0x005b:
            int r0 = r5.length
            int r0 = r0 * 2
            goto L_0x0029
        L_0x005f:
            if (r8 == 0) goto L_0x0065
            A06(r11, r8, r6)
        L_0x0064:
            return
        L_0x0065:
            if (r7 == 0) goto L_0x0064
            int r1 = r7.length
            if (r1 <= 0) goto L_0x0064
            A02(r11, r1)
        L_0x006d:
            r0 = r7[r6]
            A01(r0, r11)
            int r6 = r6 + 1
            if (r6 >= r1) goto L_0x0064
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37M.A01(X.1ca, java.io.OutputStream):void");
    }

    public static void A02(OutputStream outputStream, int i) {
        if (i == 0) {
            outputStream.write(0);
        } else if (i < 256) {
            outputStream.write(248);
            A04(outputStream, i);
        } else if (i < 65536) {
            outputStream.write(249);
            A03(outputStream, i);
        } else {
            throw C17880vN.A0f(AnonymousClass001.A1I("list too long; count=", AnonymousClass000.A10(), i));
        }
    }

    public static void A03(OutputStream outputStream, int i) {
        if (i < 0 || i >= 65536) {
            throw C17880vN.A0f(AnonymousClass001.A1I("value out of range; value=", AnonymousClass000.A10(), i));
        }
        outputStream.write((65280 & i) >> 8);
        outputStream.write(i & 255);
    }

    public static void A04(OutputStream outputStream, int i) {
        if (i < 0 || i >= 256) {
            throw C17880vN.A0f(AnonymousClass001.A1I("value out of range; value=", AnonymousClass000.A10(), i));
        }
        outputStream.write(i & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CSL(X.C29621ca r13, int r14) {
        /*
            r12 = this;
            r0 = r14 & 1
            r4 = 0
            r6 = 1
            boolean r5 = X.AnonymousClass000.A1O(r0)
            r3 = 2
            r0 = r14 & 2
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r2 = 8192(0x2000, float:1.14794E-41)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r2)
            if (r1 != 0) goto L_0x001b
            r0.write(r4)
        L_0x001b:
            A01(r13, r0)
            byte[] r8 = r0.toByteArray()
            if (r1 == 0) goto L_0x005f
            int r1 = r8.length
            byte[] r0 = new byte[r6]
            r0[r4] = r3
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0058 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0058 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ all -> 0x0051 }
            r3.write(r0)     // Catch:{ all -> 0x004a }
            r2.write(r8, r4, r1)     // Catch:{ all -> 0x004a }
            r2.close()     // Catch:{ all -> 0x004a }
            byte[] r8 = r3.toByteArray()     // Catch:{ all -> 0x004a }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x004a }
            r2.close()     // Catch:{ all -> 0x0051 }
            r3.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x005f
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0058 }
            throw r0     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x005f:
            X.2dS r2 = r12.A00
            int r9 = r8.length
            X.2fv r0 = r2.A01
            X.Ckk r6 = r0.A04
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01
            long r10 = r0.getAndIncrement()
            byte[] r7 = new byte[r4]
            byte[] r1 = r6.A01(r7, r8, r9, r10)
            java.io.OutputStream r0 = r2.A00
            r0.write(r1)
            if (r5 == 0) goto L_0x007c
            r0.flush()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37M.CSL(X.1ca, int):void");
    }

    public AnonymousClass37M(AnonymousClass190 r1, C18030ve r2, C30961en r3, C54012dS r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r4;
        this.A03 = r3;
    }
}
