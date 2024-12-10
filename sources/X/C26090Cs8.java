package X;

import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;

/* renamed from: X.Cs8  reason: case insensitive filesystem */
public abstract class C26090Cs8 {
    public static final InetSocketAddress A00;
    public static final InetSocketAddress A01;

    static {
        try {
            A00 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), 53);
            A01 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 4, 4}), 53);
        } catch (UnknownHostException e) {
            throw new Error(e);
        }
    }

    public static Pair A00(byte[] bArr, int i) {
        int length;
        int i2;
        if (i < 0 || i >= (length = bArr.length)) {
            throw new UnknownHostException("offset is outside of the data array");
        }
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        StringBuilder A10 = AnonymousClass000.A10();
        while (true) {
            byte b = bArr[i];
            int i3 = i + 1;
            if (((b >> 6) & 3) == 3) {
                int i4 = (b & 63) << 8;
                if (i3 < length) {
                    i2 = i4 + bArr[i3];
                } else {
                    throw new UnknownHostException("offset is outside of the data array, when getting a pointer");
                }
            } else if (b == 0) {
                i2 = -1;
                break;
            } else if (i3 + b < length) {
                try {
                    AnonymousClass8BS.A1D(newDecoder.decode(ByteBuffer.wrap(bArr, i3, b)), A10);
                    A10.append(".");
                    i = i3 + b;
                } catch (CharacterCodingException unused) {
                    throw new UnknownHostException("failed to parse canonical name");
                }
            } else {
                throw new UnknownHostException("failed to parse canonical name");
            }
        }
        return C17890vO.A0E(A10, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(java.lang.String r19, int r20) {
        /*
            java.lang.String r14 = " ms timeout"
            java.lang.String r15 = " with "
            java.lang.String r17 = "timed out while querying "
            java.lang.String r16 = "querying "
            java.lang.String r5 = " for "
            r1 = 2
            r18 = r20
            r0 = r18
            if (r0 >= r1) goto L_0x01c0
            java.security.SecureRandom r0 = X.C26237CvZ.A04
            java.lang.String r7 = "\\."
            r3 = r19
            java.lang.String[] r0 = r3.split(r7)
            r6 = 1
            X.CRk[] r8 = new X.C24960CRk[r6]
            r4 = 0
            X.Cpr r2 = X.C25978Cpr.A01(r0)
            int r0 = r2.A00
            int r1 = r0 + 4
            X.CRk r0 = new X.CRk
            r0.<init>(r2, r1, r6, r6)
            r8[r4] = r0
            X.CvZ r10 = X.C26237CvZ.A01(r8)
            byte[] r12 = r10.A05()
            r4 = 512(0x200, float:7.175E-43)
            byte[] r9 = new byte[r4]
            java.net.DatagramPacket r11 = new java.net.DatagramPacket
            r11.<init>(r9, r4)
            java.lang.String[] r0 = r3.split(r7)
            r8 = 1
            X.CRk[] r7 = new X.C24960CRk[r6]
            r13 = 0
            X.Cpr r6 = X.C25978Cpr.A01(r0)
            r2 = 28
            int r0 = r6.A00
            int r1 = r0 + 4
            X.CRk r0 = new X.CRk
            r0.<init>(r6, r1, r2, r8)
            r7[r13] = r0
            X.CvZ r8 = X.C26237CvZ.A01(r7)
            byte[] r6 = r8.A05()
            byte[] r7 = new byte[r4]
            java.net.DatagramPacket r2 = new java.net.DatagramPacket
            r2.<init>(r7, r4)
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ IOException -> 0x019a }
            r4.<init>()     // Catch:{ IOException -> 0x019a }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A11(r16)     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.InetSocketAddress r1 = A00     // Catch:{ InterruptedIOException -> 0x00a4 }
            r13.append(r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C17890vO.A10(r5, r3, r15, r13)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r13.append(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C17890vO.A1A(r13, r14)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.connect(r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            int r1 = r12.length     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0.<init>(r12, r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C17960vV.A07(r6)     // Catch:{ InterruptedIOException -> 0x00a4 }
            int r1 = r6.length     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.receive(r2)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.receive(r11)     // Catch:{ InterruptedIOException -> 0x00a4 }
            goto L_0x00f2
        L_0x00a4:
            r1 = move-exception
            java.lang.StringBuilder r13 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x0190 }
            java.net.InetSocketAddress r0 = A00     // Catch:{ all -> 0x0190 }
            r13.append(r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = X.AnonymousClass001.A1H(r5, r3, r13)     // Catch:{ all -> 0x0190 }
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0190 }
            r4.disconnect()     // Catch:{ AssertionError -> 0x018e }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A11(r16)     // Catch:{ InterruptedIOException -> 0x016d }
            java.net.InetSocketAddress r1 = A01     // Catch:{ InterruptedIOException -> 0x016d }
            r13.append(r1)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C17890vO.A10(r5, r3, r15, r13)     // Catch:{ InterruptedIOException -> 0x016d }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r13.append(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C17890vO.A1A(r13, r14)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.connect(r1)     // Catch:{ InterruptedIOException -> 0x016d }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C17960vV.A07(r12)     // Catch:{ InterruptedIOException -> 0x016d }
            int r1 = r12.length     // Catch:{ InterruptedIOException -> 0x016d }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x016d }
            r0.<init>(r12, r1)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C17960vV.A07(r6)     // Catch:{ InterruptedIOException -> 0x016d }
            int r1 = r6.length     // Catch:{ InterruptedIOException -> 0x016d }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x016d }
            r0.<init>(r6, r1)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.receive(r2)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.receive(r11)     // Catch:{ InterruptedIOException -> 0x016d }
        L_0x00f2:
            r4.close()     // Catch:{ IOException -> 0x019a }
            X.CvZ r6 = X.C26237CvZ.A00(r9)     // Catch:{ 1Cq -> 0x016b, RuntimeException -> 0x0157 }
            X.CvZ r5 = X.C26237CvZ.A00(r7)     // Catch:{ 1Cq -> 0x016b, RuntimeException -> 0x0157 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.CU8 r0 = r10.A01
            short r1 = r0.A01
            X.CU8 r0 = r6.A01
            short r2 = r0.A01
            if (r2 != r1) goto L_0x0142
            r14 = r9
            r11 = r6
        L_0x010d:
            r12 = r3
            r13 = r4
            r15 = r18
            A02(r10, r11, r12, r13, r14, r15)
        L_0x0114:
            X.C17960vV.A07(r8)
            X.CU8 r0 = r8.A01
            short r1 = r0.A01
            if (r2 == r1) goto L_0x0125
            X.CU8 r0 = r5.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x012d
            r9 = r7
            r6 = r5
        L_0x0125:
            r1 = r8
            r2 = r6
            r5 = r9
            r6 = r18
            A02(r1, r2, r3, r4, r5, r6)
        L_0x012d:
            boolean r0 = r4.isEmpty()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 != 0) goto L_0x014b
            java.lang.String r0 = "resolved "
            X.C17890vO.A14(r0, r1, r4)
            java.lang.String r0 = " addresses using backup DNS for "
            X.C17900vP.A0f(r0, r3, r1)
            return r4
        L_0x0142:
            X.CU8 r0 = r5.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x0114
            r14 = r7
            r11 = r5
            goto L_0x010d
        L_0x014b:
            java.lang.String r0 = "no addresses found for "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unexpected runtime exception: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Cq r0 = new X.1Cq
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x016b:
            r1 = move-exception
            throw r1
        L_0x016d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x0190 }
            java.net.InetSocketAddress r0 = A01     // Catch:{ all -> 0x0190 }
            r1.append(r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = X.AnonymousClass001.A1H(r5, r3, r1)     // Catch:{ all -> 0x0190 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x0190 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "timeout while trying to resolve "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ all -> 0x0190 }
            java.net.UnknownHostException r0 = new java.net.UnknownHostException     // Catch:{ all -> 0x0190 }
            r0.<init>(r1)     // Catch:{ all -> 0x0190 }
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x018e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0195 }
            goto L_0x0199
        L_0x0195:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x019a }
        L_0x0199:
            throw r1     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unexpected IOException "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " while trying to resolve "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            com.whatsapp.util.Log.w(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ioexception while trying to resolve "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.net.UnknownHostException r1 = new java.net.UnknownHostException
            r1.<init>(r0)
            throw r1
        L_0x01c0:
            java.lang.String r1 = "failed to resolve cnames"
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26090Cs8.A01(java.lang.String, int):java.util.ArrayList");
    }

    public static void A02(C26237CvZ cvZ, C26237CvZ cvZ2, String str, List list, byte[] bArr, int i) {
        short length;
        C26237CvZ cvZ3 = cvZ2;
        CU8 cu8 = cvZ3.A01;
        String str2 = str;
        if (cu8.A01 != cvZ.A01.A01) {
            throw new UnknownHostException(AnonymousClass001.A1H("received response with unexpected id while trying to resolve ", str2, AnonymousClass000.A10()));
        } else if (!cu8.A0A) {
            throw new UnknownHostException(AnonymousClass001.A1H("did not receive response from server while trying to resolve ", str2, AnonymousClass000.A10()));
        } else if (cu8.A0B) {
            throw new UnknownHostException(AnonymousClass001.A1H("received truncated response while trying to resolve ", str2, AnonymousClass000.A10()));
        } else if (cu8.A06 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C24998CSy cSy = null;
            int i2 = 0;
            while (true) {
                C24998CSy[] cSyArr = cvZ3.A02;
                List list2 = list;
                if (i2 < cSyArr.length) {
                    C24998CSy cSy2 = cSyArr[i2];
                    if (cSy2.A03 == 1) {
                        if (cSy2.A04 == 5) {
                            cSy = cSy2;
                        } else if (cSy2.A04 != 1 && cSy2.A04 != 28) {
                            throw new UnknownHostException(AnonymousClass001.A1H("unexpected type returned while trying to resolve ", str2, AnonymousClass000.A10()));
                        } else if (cSy2.A04 == 1 && ((short) cSy2.A05.length) != 4) {
                            throw new UnknownHostException(C17900vP.A0A("unexpected record length returned while trying to resolve ", str2));
                        } else if (cSy2.A04 != 28 || (length = (short) cSy2.A05.length) == 16) {
                            C25978Cpr cpr = cSy2.A02;
                            StringBuilder A10 = AnonymousClass000.A10();
                            for (String append : cpr.A02) {
                                A10.append(append);
                                A10.append('.');
                            }
                            short s = cpr.A01;
                            if (s != 0) {
                                for (String append2 : C25978Cpr.A00(cvZ3.A00, s).A02) {
                                    A10.append(append2);
                                    A10.append('.');
                                }
                            }
                            if (A10.length() > 0) {
                                A10.setLength(A10.length() - 1);
                            }
                            list2.add(new C25064CVw(InetAddress.getByAddress(A10.toString(), cSy2.A05), C17890vO.A03(cSy2.A01) + currentTimeMillis));
                            list2.get(AnonymousClass3MX.A02(list2, 1));
                        } else {
                            throw new UnknownHostException(AnonymousClass001.A1I(" ", AnonymousClass8BW.A0o("unexpected record length returned while trying to resolve ", str2), length));
                        }
                        i2++;
                    } else {
                        throw new UnknownHostException(AnonymousClass001.A1H("unexpected class returned while trying to resolve ", str2, AnonymousClass000.A10()));
                    }
                } else if (list2.isEmpty() && cSy != null) {
                    Pair A002 = A00(cSy.A05, 0);
                    StringBuilder sb = (StringBuilder) A002.first;
                    int A003 = C108965cb.A00(A002);
                    if (A003 != -1) {
                        sb.append((CharSequence) A00(bArr, A003).first);
                    }
                    String obj = sb.toString();
                    if (!obj.equals(str2)) {
                        list2.addAll(A01(obj, i + 1));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new UnknownHostException(AnonymousClass001.A1H("error code was set in response while trying to resolve ", str2, AnonymousClass000.A10()));
        }
    }
}
