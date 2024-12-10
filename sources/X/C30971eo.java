package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1eo  reason: invalid class name and case insensitive filesystem */
public class C30971eo {
    public byte[] A00;
    public final AnonymousClass190 A01;
    public final C30961en A02;
    public final C54002dR A03;

    private int A00(InputStream inputStream, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 248) {
            return inputStream.read();
        }
        if (i == 249) {
            return (inputStream.read() << 8) + inputStream.read();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid list size in readListSize: token ");
        sb.append(i);
        throw new AnonymousClass1UI(sb.toString(), A07());
    }

    public static void A04(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, i, length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new IOException("ran out of bytes while reading into buffer");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw new X.AnonymousClass1UI("invalid token index in getToken()", A07());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        r1 = new byte[r3];
        A04(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        return new java.lang.String(r1, X.C19620yd.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        throw new X.AnonymousClass1UI("invalid token index in getToken()", A07());
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: ArrayIndexOutOfBoundsException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ExcHandler: ArrayIndexOutOfBoundsException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:44:0x00df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(java.io.InputStream r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r6 == r0) goto L_0x0130
            r0 = 2
            if (r6 <= r0) goto L_0x004e
            r0 = 236(0xec, float:3.31E-43)
            if (r6 >= r0) goto L_0x0052
            r3 = 0
            java.lang.String[] r0 = X.AnonymousClass2WT.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0024 }
            r2 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0024 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = "Token was null for singlebyte idx: "
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            X.C17960vV.A08(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            return r2
        L_0x0024:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            throw r2     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
        L_0x0042:
            java.lang.String r2 = "invalid token index in getToken()"
            java.lang.String r1 = r4.A07()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            throw r0
        L_0x004e:
            if (r6 != 0) goto L_0x005c
            r2 = 0
            return r2
        L_0x0052:
            r0 = 247(0xf7, float:3.46E-43)
            if (r6 == r0) goto L_0x0126
            switch(r6) {
                case 236: goto L_0x00d3;
                case 237: goto L_0x00d3;
                case 238: goto L_0x00d3;
                case 239: goto L_0x00d3;
                default: goto L_0x0059;
            }
        L_0x0059:
            switch(r6) {
                case 250: goto L_0x00b8;
                case 251: goto L_0x006d;
                case 252: goto L_0x0068;
                case 253: goto L_0x0095;
                case 254: goto L_0x0079;
                case 255: goto L_0x006d;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.String r2 = "readString couldn't match token"
            java.lang.String r1 = r4.A07()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            throw r0
        L_0x0068:
            int r3 = r5.read()
            goto L_0x00a9
        L_0x006d:
            byte[] r1 = A05(r5, r6)
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x00b6 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00b6 }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00b6 }
            return r2
        L_0x0079:
            int r0 = r5.read()
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r5.read()
            int r2 = r5.read()
            int r3 = r5.read()
            int r1 = r1 << 24
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r3 = r3 | r1
            goto L_0x00a9
        L_0x0095:
            int r0 = r5.read()
            r2 = r0 & 15
            int r0 = r5.read()
            int r1 = r5.read()
            int r3 = r2 << 16
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r3 = r3 + r1
        L_0x00a9:
            byte[] r1 = new byte[r3]
            A04(r5, r1)
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x00b6 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00b6 }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00b6 }
            return r2
        L_0x00b6:
            r2 = 0
            return r2
        L_0x00b8:
            java.lang.String r0 = "Unexpected ReadString for token JID_PAIR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r0 = r5.read()
            java.lang.String r2 = r4.A08(r5, r0)
            int r0 = r5.read()
            java.lang.String r1 = r4.A08(r5, r0)
            r0 = 0
            java.lang.String r2 = X.C22971Dz.A08(r2, r1, r0)
            return r2
        L_0x00d3:
            int r3 = r5.read()
            java.lang.String[][] r1 = X.AnonymousClass2WT.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fc }
            int r0 = r6 + -236
            r0 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fc }
            r2 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            java.lang.String r0 = "Token was null for doublebyte dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            X.C17960vV.A08(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            return r2
        L_0x00fc:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
            throw r2     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a, ArrayIndexOutOfBoundsException | NullPointerException -> 0x011a }
        L_0x011a:
            java.lang.String r2 = "invalid token index in getToken()"
            java.lang.String r1 = r4.A07()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            throw r0
        L_0x0126:
            java.lang.String r0 = "Unexpected ReadString for token JID_4"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = r4.A02(r5)
            return r2
        L_0x0130:
            java.lang.String r2 = "-1 token in readString"
            java.lang.String r1 = r4.A07()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30971eo.A08(java.io.InputStream, int):java.lang.String");
    }

    private void A03(Jid jid, String str) {
        AnonymousClass190 r3 = this.A01;
        if (r3 != null && !jid.isProtocolCompliant()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Jid: '");
            sb.append(jid);
            sb.append("' key: '");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("'");
            r3.A0G("invalid jid!", sb.toString(), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C29621ca A06() {
        /*
            r8 = this;
            X.2dR r7 = r8.A03
            java.lang.String r0 = "frameInputStream is null"
            X.C17960vV.A08(r7, r0)
        L_0x0007:
            X.A42 r1 = r7.A00     // Catch:{ 1ep -> 0x00a7 }
            r0 = 3
            byte[] r0 = new byte[r0]     // Catch:{ 1ep -> 0x00a7 }
            X.A42.A00(r1, r0)     // Catch:{ 1ep -> 0x00a7 }
            r6 = 0
            int r0 = X.A8G.A00(r0)     // Catch:{ 1ep -> 0x00a7 }
            byte[] r4 = new byte[r0]     // Catch:{ 1ep -> 0x00a7 }
            X.A42.A00(r1, r4)     // Catch:{ 1ep -> 0x00a7 }
            X.2fv r0 = r7.A01     // Catch:{ 1ep -> 0x00a7 }
            X.Ckk r3 = r0.A03     // Catch:{ 1ep -> 0x00a7 }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A00     // Catch:{ 1ep -> 0x00a7 }
            long r1 = r0.getAndIncrement()     // Catch:{ 1ep -> 0x00a7 }
            byte[] r0 = new byte[r6]     // Catch:{ 1ep -> 0x00a7 }
            byte[] r5 = r3.A02(r0, r4, r1)     // Catch:{ 1ep -> 0x00a7 }
            int r4 = r5.length
            if (r4 == 0) goto L_0x0007
            r0 = 1
            if (r4 == r0) goto L_0x009f
            byte r3 = r5[r6]
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0081
            r2 = 1
            int r4 = r4 - r2
            byte[] r1 = new byte[r2]
            r1[r6] = r3
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r5, r2, r4)
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream
            r3.<init>(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0077 }
            r2.<init>(r0)     // Catch:{ all -> 0x0077 }
            r2.write(r1)     // Catch:{ all -> 0x0070 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0070 }
            int r0 = r3.read(r1)     // Catch:{ all -> 0x0070 }
        L_0x0055:
            if (r0 < 0) goto L_0x005f
            r2.write(r1, r6, r0)     // Catch:{ all -> 0x0070 }
            int r0 = r3.read(r1)     // Catch:{ all -> 0x0070 }
            goto L_0x0055
        L_0x005f:
            r3.close()     // Catch:{ all -> 0x0070 }
            r2.close()     // Catch:{ all -> 0x0070 }
            byte[] r5 = r2.toByteArray()     // Catch:{ all -> 0x0070 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x0070 }
            r2.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007e
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        L_0x007e:
            r3.close()
        L_0x0081:
            r8.A00 = r5
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            int r0 = r1.read()
            byte r0 = (byte) r0
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0096
            X.1ca r0 = A01(r8, r1)
            return r0
        L_0x0096:
            java.lang.String r1 = "server to client stanza fragmentation not supported"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x009f:
            java.lang.String r1 = "header only frame received"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00a7:
            r0 = move-exception
            X.2QS r1 = new X.2QS
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30971eo.A06():X.1ca");
    }

    public String A07() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size = ");
        int length = bArr.length;
        sb.append(length);
        sb.append('<');
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(bArr[i] & 255);
            if (((long) sb.length()) >= 262144) {
                break;
            }
        }
        if (((long) sb.length()) < 262144) {
            sb.append('>');
        } else {
            sb.append("...");
        }
        return sb.toString();
    }

    public C30971eo(AnonymousClass190 r1, C30961en r2, C54002dR r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static C29621ca A01(C30971eo r12, InputStream inputStream) {
        AnonymousClass1MD[] r4;
        String str;
        AnonymousClass1MD r9;
        String obj;
        byte[] A05;
        int read;
        int A002 = r12.A00(inputStream, inputStream.read());
        int read2 = inputStream.read();
        if (read2 == 2) {
            return null;
        }
        String A08 = r12.A08(inputStream, read2);
        if (A002 == 0 || A08 == null) {
            throw new AnonymousClass1UI("nextTree sees 0 list or null tag", r12.A07());
        }
        int i = ((A002 - 2) + (A002 % 2)) / 2;
        if (i == 0) {
            r4 = null;
        } else {
            r4 = new AnonymousClass1MD[i];
            for (int i2 = 0; i2 < i; i2++) {
                String A082 = r12.A08(inputStream, inputStream.read());
                int read3 = inputStream.read();
                if (read3 == 244) {
                    String A083 = r12.A08(inputStream, inputStream.read());
                    int read4 = (inputStream.read() << 8) + inputStream.read();
                    int read5 = (inputStream.read() << 8) + inputStream.read();
                    int read6 = inputStream.read();
                    if (read6 != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("invalid domain received for JID_INTEROP tuple: ");
                        sb.append(read6);
                        throw new AnonymousClass1UI(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(read5);
                    sb2.append("-");
                    C17960vV.A06(A083);
                    sb2.append(A083);
                    if (read4 == 0) {
                        obj = "";
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(":");
                        sb3.append(read4);
                        obj = sb3.toString();
                    }
                    sb2.append(obj);
                    sb2.append('@');
                    sb2.append("interop");
                    str = sb2.toString();
                    C22911Dt r0 = Jid.Companion;
                    Jid A003 = C22911Dt.A00(str);
                    r12.A03(A003, A082);
                    r9 = new AnonymousClass1MD(A003, A082);
                } else if (read3 == 247) {
                    str = r12.A02(inputStream);
                    C22911Dt r02 = Jid.Companion;
                    Jid A004 = C22911Dt.A00(str);
                    r12.A03(A004, A082);
                    r9 = new AnonymousClass1MD(A004, A082);
                } else if (read3 != 250) {
                    r9 = new AnonymousClass1MD(A082, r12.A08(inputStream, read3));
                } else {
                    str = C22971Dz.A08(r12.A08(inputStream, inputStream.read()), r12.A08(inputStream, inputStream.read()), 0);
                    try {
                        C22911Dt r03 = Jid.Companion;
                        Jid A005 = C22911Dt.A00(str);
                        r12.A03(A005, A082);
                        r9 = new AnonymousClass1MD(A005, A082);
                    } catch (AnonymousClass11T unused) {
                        r9 = new AnonymousClass1MD(A082, str);
                    }
                }
                r4[i2] = r9;
            }
        }
        if (A002 % 2 == 1) {
            return new C29621ca(A08, r4);
        }
        int read7 = inputStream.read();
        if (read7 == 0 || read7 == 248 || read7 == 249) {
            int A006 = r12.A00(inputStream, read7);
            C29621ca[] r2 = new C29621ca[A006];
            for (int i3 = 0; i3 < A006; i3++) {
                r2[i3] = A01(r12, inputStream);
            }
            return new C29621ca(A08, r4, r2);
        }
        if (read7 == 252) {
            read = inputStream.read();
        } else if (read7 == 253) {
            read = ((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read();
        } else if (read7 == 254) {
            read = inputStream.read() | ((inputStream.read() & StringTreeSet.OFFSET_BASE_ENCODING) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
        } else if (read7 != 255 && read7 != 251) {
            return new C29621ca(A08, r12.A08(inputStream, read7), r4);
        } else {
            A05 = A05(inputStream, read7);
            return new C29621ca(A08, A05, r4);
        }
        A05 = new byte[read];
        A04(inputStream, A05);
        return new C29621ca(A08, A05, r4);
    }

    private String A02(InputStream inputStream) {
        String str;
        StringBuilder sb;
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        String A08 = A08(inputStream, inputStream.read());
        boolean z = false;
        boolean z2 = false;
        if ((read & 1) == 0) {
            z2 = true;
        }
        if ((read & 128) != 0) {
            z = true;
        }
        boolean z3 = false;
        if (read2 == 99) {
            z3 = true;
        }
        if (z3 != z) {
            AnonymousClass190 r2 = this.A01;
            if (r2 != null) {
                sb.append("jid read; isHosted: ");
                sb.append(z);
                sb.append("; proceeding since no validation");
                r2.A0G("invalid-hosted-flag", sb.toString(), false);
            } else {
                sb = new StringBuilder();
                sb.append("Hosted flag mismatch on jid; user=");
                sb.append(A08);
                sb.append("; device=");
                sb.append(read2);
                sb.append("; flag=");
                sb.append(z);
                sb.append("; not reporting and proceeding");
                Log.e(sb.toString());
            }
        }
        if (z) {
            if (z2) {
                str = "hosted";
            } else {
                str = "hosted.lid";
            }
        } else if (z2) {
            str = "s.whatsapp.net";
        } else {
            str = "lid";
        }
        return C22971Dz.A08(A08, str, read2);
    }

    public static byte[] A05(InputStream inputStream, int i) {
        int i2;
        int read = inputStream.read();
        int i3 = 0;
        if ((read & 128) != 0) {
            i3 = 1;
        }
        int i4 = read & StringTreeSet.OFFSET_BASE_ENCODING;
        byte[] bArr = new byte[i4];
        A04(inputStream, bArr);
        int i5 = (i4 * 2) - i3;
        byte[] bArr2 = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = (1 - (i6 % 2)) * 4;
            int i8 = (bArr[i6 / 2] & (15 << i7)) >> i7;
            if (i == 251) {
                switch (i8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i2 = (i8 - 10) + 65;
                        continue;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("bad hex ");
                        sb.append(i8);
                        throw new AnonymousClass1UI(sb.toString());
                }
            } else if (i == 255) {
                switch (i8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                        i2 = (i8 - 10) + 45;
                        continue;
                    case 12:
                        i2 = 58;
                        continue;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("bad nibble ");
                        sb2.append(i8);
                        throw new AnonymousClass1UI(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("bad packed type ");
                sb3.append(i);
                throw new AnonymousClass1UI(sb3.toString());
            }
            i2 = i8 + 48;
            bArr2[i6] = (byte) i2;
        }
        return bArr2;
    }
}
