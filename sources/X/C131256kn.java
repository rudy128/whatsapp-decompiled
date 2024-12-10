package X;

/* renamed from: X.6kn  reason: invalid class name and case insensitive filesystem */
public final class C131256kn {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.8Jk} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0258, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        r2 = new X.C162178Jk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        com.whatsapp.util.Log.w("NtpSyncWorker/sync; NTP offset is null");
        r2 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d7, code lost:
        if (r0 >= 2085978496000L) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d9, code lost:
        r19 = true;
        r15 = -2208988800000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        r0 = r0 - r15;
        r15 = r0 / 1000;
        r0 = ((r0 % 1000) * 4294967296L) / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        if (r19 == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r15 = r15 | 2147483648L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
        r2 = new X.C146417Pa(r0 | (r15 << 32)).ntpTime;
        r17 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
        r7[r17 + 40] = (byte) ((int) (255 & r2));
        r2 = r2 >>> 8;
        r17 = r17 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        if (r17 >= 0) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0114, code lost:
        r8.send(r6);
        r8.receive(r5);
        r6 = java.lang.System.currentTimeMillis();
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0150, code lost:
        r8.close();
        r9 = X.AnonymousClass000.A13();
        r13 = X.C1405171t.A01(r4, 24);
        r23 = X.C146417Pa.A00(r13.ntpTime);
        r12 = X.C1405171t.A01(r4, 32);
        r21 = X.C146417Pa.A00(r12.ntpTime);
        r8 = X.C1405171t.A01(r4, 40);
        r4 = r8.ntpTime;
        r2 = X.C146417Pa.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        if (r13.ntpTime != 0) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0185, code lost:
        if (r4 == 0) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0188, code lost:
        r0 = "Error: zero orig time -- cannot compute delay/offset";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018b, code lost:
        r15 = X.C108945cZ.A1B(r2, r6);
        r0 = "Error: zero orig time -- cannot compute delay";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0191, code lost:
        r9.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0195, code lost:
        r0 = r12.ntpTime;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019b, code lost:
        if (r0 == 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019f, code lost:
        if (r4 == 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a1, code lost:
        r17 = r6 - r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a5, code lost:
        if (r2 >= r21) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a8, code lost:
        r15 = r2 - r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ac, code lost:
        if (r15 <= r17) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b4, code lost:
        if ((r15 - r17) != 1) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b8, code lost:
        if (r17 == 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ba, code lost:
        r0 = "Info: processing time > total network time by 1 ms -> assume zero delay";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bd, code lost:
        r0 = "Warning: processing time > total network time";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        r0 = "Error: xmitTime < rcvTime";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c2, code lost:
        r9.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c7, code lost:
        if (r23 <= r6) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ca, code lost:
        r9.add("Warning: zero rcvNtpTime or xmitNtpTime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d1, code lost:
        if (r23 <= r6) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d3, code lost:
        r9.add("Error: OrigTime > DestRcvTime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        if (r0 == 0) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01da, code lost:
        r21 = r21 - r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01dd, code lost:
        r9.add("Error: OrigTime > DestRcvTime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e0, code lost:
        r21 = ((r21 - r23) + (r2 - r6)) / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e9, code lost:
        r15 = java.lang.Long.valueOf(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f2, code lost:
        if (r8.ntpTime == 0) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f4, code lost:
        r15 = X.C108945cZ.A1B(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f8, code lost:
        if (r15 == null) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fa, code lost:
        r0 = r15.longValue();
        r6 = r6 + r0;
        r4 = r11.A05();
        r12 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0212, code lost:
        if (java.lang.Math.abs(r6 - r4) <= 86400000) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021c, code lost:
        if (java.lang.Math.abs(r6 - r12) <= 86400000) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0226, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14, 2225) == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0228, code lost:
        com.whatsapp.util.Log.w(X.C17890vO.A0a("NtpSyncWorker/sync; NTP time too far from server or device time; ntpTimeMs=", X.AnonymousClass000.A10(), r6));
        r2 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023b, code lost:
        X.AnonymousClass11P.A02(r11, r0);
        r4 = r11.A00.A00;
        X.C17880vN.A1D(r4.edit(), "client_ntp_time_diff", r0);
        X.C17880vN.A1D(r4.edit(), "last_ntp_client_time", java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C180129Lg A00(android.content.Context r26, X.AnonymousClass11P r27, X.C22631Cp r28, X.C18030ve r29, X.C132726nS r30) {
        /*
            r25 = this;
            r0 = 0
            r6 = r26
            X.C18070vi.A0d(r6, r0)
            r11 = r27
            r3 = r28
            r14 = r29
            r10 = r30
            X.C18070vi.A0s(r11, r14, r3, r10)
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r0 = com.whatsapp.workers.ntp.NtpSyncWorker.A06
            long r7 = r7 - r0
            long r4 = com.whatsapp.workers.ntp.NtpSyncWorker.A06
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            r1 = 21600000(0x1499700, double:1.0671818E-316)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            java.lang.String r0 = "NtpSyncWorker/executeNtpSync(); another sync happened recently, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8Jk r2 = new X.8Jk
            r2.<init>()
            return r2
        L_0x0032:
            java.lang.String r0 = "/ntp/started"
            r10.A00(r0)
            java.lang.String r13 = " at resolved address "
            android.content.res.Resources r4 = X.C108955ca.A0D(r6)
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android:string/config_ntpServer"
            r0 = 0
            int r0 = r2.getIdentifier(r1, r0, r0)
            java.lang.String r12 = "2.android.pool.ntp.org"
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = X.AnonymousClass3MY.A0m(r4, r0)     // Catch:{ NotFoundException -> 0x005e }
            int r0 = r1.length()     // Catch:{ NotFoundException -> 0x005e }
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "NtpSyncWorker/ntp-server; empty ntp server configuration"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x005e }
            goto L_0x0064
        L_0x005c:
            r12 = r1
            goto L_0x0064
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "NtpSyncWorker/ntp-server; unresolvable ntp server configuration"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0064:
            r0 = 4
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x02ad }
            X.2q6 r0 = r3.A03(r12)     // Catch:{ UnknownHostException -> 0x0284 }
            java.net.InetAddress[] r0 = r0.A05     // Catch:{ UnknownHostException -> 0x0284 }
            if (r0 == 0) goto L_0x0078
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ UnknownHostException -> 0x0284 }
            X.C18070vi.A0X(r0)     // Catch:{ UnknownHostException -> 0x0284 }
            goto L_0x007a
        L_0x0078:
            X.0wS r0 = X.C18460wS.A00     // Catch:{ UnknownHostException -> 0x0284 }
        L_0x007a:
            r22 = 0
            r21 = 0
            java.util.Iterator r20 = r0.iterator()     // Catch:{ all -> 0x02ad }
        L_0x0082:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x02ad }
            if (r0 == 0) goto L_0x0275
            java.lang.Object r9 = r20.next()     // Catch:{ all -> 0x02ad }
            java.net.InetAddress r9 = (java.net.InetAddress) r9     // Catch:{ all -> 0x02ad }
            java.net.DatagramSocket r8 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r8.<init>()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r22 = r8
            r0 = 20000(0x4e20, float:2.8026E-41)
            r8.setSoTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r21 = 1
            r2 = 123(0x7b, float:1.72E-43)
            X.71t r3 = new X.71t     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            byte[] r7 = r3.A00     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r4 = 0
            byte r0 = r7[r4]     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r0 = 3
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r7[r4] = r0     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r1 = r0 & 199(0xc7, float:2.79E-43)
            r0 = 24
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r7[r4] = r0     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            java.net.DatagramPacket r6 = r3.A02()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r6.setAddress(r9)     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r6.setPort(r2)     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            X.71t r4 = new X.71t     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            java.net.DatagramPacket r5 = r4.A02()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r15 = 2085978496000(0x1e5ae01dc00, double:1.030610312837E-311)
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r19 = 0
            if (r2 >= 0) goto L_0x00e0
            r19 = 1
            r15 = -2208988800000(0xfffffdfdae01dc00, double:NaN)
        L_0x00e0:
            long r0 = r0 - r15
            r17 = 1000(0x3e8, double:4.94E-321)
            long r15 = r0 / r17
            long r0 = r0 % r17
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 * r2
            long r0 = r0 / r17
            if (r19 == 0) goto L_0x00f7
            r2 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r15 = r15 | r2
        L_0x00f7:
            r2 = 32
            long r15 = r15 << r2
            long r0 = r0 | r15
            X.7Pa r2 = new X.7Pa     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r2.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            long r2 = r2.ntpTime     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r17 = 7
        L_0x0104:
            int r16 = r17 + 40
            r0 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r15 = (int) r0     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            byte r0 = (byte) r15     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r7[r16] = r0     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r0 = 8
            long r2 = r2 >>> r0
            int r17 = r17 + -1
            if (r17 >= 0) goto L_0x0104
            r8.send(r6)     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r8.receive(r5)     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0132, IOException -> 0x0120 }
            r15 = 0
            goto L_0x0150
        L_0x0120:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x026c }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from "
            X.C17890vO.A10(r0, r12, r13, r1)     // Catch:{ all -> 0x026c }
            java.lang.String r0 = X.C17890vO.A0V(r9, r1)     // Catch:{ all -> 0x026c }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x026c }
            goto L_0x0143
        L_0x0132:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x026c }
            java.lang.String r0 = "NtpSyncWorker/sync; socket timeout occurred while retrieving ntp time from "
            X.C17890vO.A10(r0, r12, r13, r1)     // Catch:{ all -> 0x026c }
            java.lang.String r0 = X.C17890vO.A0V(r9, r1)     // Catch:{ all -> 0x026c }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x026c }
        L_0x0143:
            if (r21 == 0) goto L_0x0082
            if (r22 == 0) goto L_0x014a
            r22.close()     // Catch:{ all -> 0x02ad }
        L_0x014a:
            r22 = 0
            r21 = 0
            goto L_0x0082
        L_0x0150:
            r8.close()     // Catch:{ all -> 0x02ad }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02ad }
            r0 = 24
            X.7Pa r13 = X.C1405171t.A01(r4, r0)     // Catch:{ all -> 0x02ad }
            long r0 = r13.ntpTime     // Catch:{ all -> 0x02ad }
            long r23 = X.C146417Pa.A00(r0)     // Catch:{ all -> 0x02ad }
            r0 = 32
            X.7Pa r12 = X.C1405171t.A01(r4, r0)     // Catch:{ all -> 0x02ad }
            long r0 = r12.ntpTime     // Catch:{ all -> 0x02ad }
            long r21 = X.C146417Pa.A00(r0)     // Catch:{ all -> 0x02ad }
            r0 = 40
            X.7Pa r8 = X.C1405171t.A01(r4, r0)     // Catch:{ all -> 0x02ad }
            long r4 = r8.ntpTime     // Catch:{ all -> 0x02ad }
            long r2 = X.C146417Pa.A00(r4)     // Catch:{ all -> 0x02ad }
            long r0 = r13.ntpTime     // Catch:{ all -> 0x02ad }
            r19 = 0
            int r13 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r13 != 0) goto L_0x0195
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0188
            goto L_0x018b
        L_0x0188:
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay/offset"
            goto L_0x0191
        L_0x018b:
            java.lang.Long r15 = X.C108945cZ.A1B(r2, r6)     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay"
        L_0x0191:
            r9.add(r0)     // Catch:{ all -> 0x02ad }
            goto L_0x01f8
        L_0x0195:
            long r0 = r12.ntpTime     // Catch:{ all -> 0x02ad }
            java.lang.String r12 = "Error: OrigTime > DestRcvTime"
            int r13 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x01ca
            int r13 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x01ca
            long r17 = r6 - r23
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a8
            goto L_0x01c0
        L_0x01a8:
            long r15 = r2 - r21
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c5
            long r15 = r15 - r17
            r4 = 1
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01bd
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = "Info: processing time > total network time by 1 ms -> assume zero delay"
            goto L_0x01c2
        L_0x01bd:
            java.lang.String r0 = "Warning: processing time > total network time"
            goto L_0x01c2
        L_0x01c0:
            java.lang.String r0 = "Error: xmitTime < rcvTime"
        L_0x01c2:
            r9.add(r0)     // Catch:{ all -> 0x02ad }
        L_0x01c5:
            int r0 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e0
            goto L_0x01dd
        L_0x01ca:
            java.lang.String r4 = "Warning: zero rcvNtpTime or xmitNtpTime"
            r9.add(r4)     // Catch:{ all -> 0x02ad }
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x01d6
            r9.add(r12)     // Catch:{ all -> 0x02ad }
        L_0x01d6:
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x01ee
            long r21 = r21 - r23
            goto L_0x01e9
        L_0x01dd:
            r9.add(r12)     // Catch:{ all -> 0x02ad }
        L_0x01e0:
            long r21 = r21 - r23
            long r2 = r2 - r6
            long r21 = r21 + r2
            r0 = 2
            long r21 = r21 / r0
        L_0x01e9:
            java.lang.Long r15 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x02ad }
            goto L_0x01f8
        L_0x01ee:
            long r0 = r8.ntpTime     // Catch:{ all -> 0x02ad }
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x0261
            java.lang.Long r15 = X.C108945cZ.A1B(r2, r6)     // Catch:{ all -> 0x02ad }
        L_0x01f8:
            if (r15 == 0) goto L_0x0261
            long r0 = r15.longValue()     // Catch:{ all -> 0x02ad }
            long r6 = r6 + r0
            long r4 = r11.A05()     // Catch:{ all -> 0x02ad }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ad }
            long r2 = r6 - r4
            long r3 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x02ad }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x023b
            long r2 = r6 - r12
            long r3 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x02ad }
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x023b
            r3 = 2225(0x8b1, float:3.118E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x02ad }
            boolean r2 = X.C18020vd.A05(r2, r14, r3)     // Catch:{ all -> 0x02ad }
            if (r2 == 0) goto L_0x023b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = "NtpSyncWorker/sync; NTP time too far from server or device time; ntpTimeMs="
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r6)     // Catch:{ all -> 0x02ad }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02ad }
            X.8Ji r2 = new X.8Ji     // Catch:{ all -> 0x02ad }
            r2.<init>()     // Catch:{ all -> 0x02ad }
            goto L_0x0297
        L_0x023b:
            X.AnonymousClass11P.A02(r11, r0)     // Catch:{ all -> 0x02ad }
            X.11O r2 = r11.A00     // Catch:{ all -> 0x02ad }
            android.content.SharedPreferences r4 = r2.A00     // Catch:{ all -> 0x02ad }
            android.content.SharedPreferences$Editor r3 = r4.edit()     // Catch:{ all -> 0x02ad }
            java.lang.String r2 = "client_ntp_time_diff"
            X.C17880vN.A1D(r3, r2, r0)     // Catch:{ all -> 0x02ad }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ad }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = "last_ntp_client_time"
            X.C17880vN.A1D(r1, r0, r2)     // Catch:{ all -> 0x02ad }
            android.net.TrafficStats.clearThreadStatsTag()
            X.8Jk r2 = new X.8Jk
            r2.<init>()
            goto L_0x029a
        L_0x0261:
            java.lang.String r0 = "NtpSyncWorker/sync; NTP offset is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02ad }
            X.8Ji r2 = new X.8Ji     // Catch:{ all -> 0x02ad }
            r2.<init>()     // Catch:{ all -> 0x02ad }
            goto L_0x0297
        L_0x026c:
            r0 = move-exception
            if (r21 == 0) goto L_0x0274
            if (r22 == 0) goto L_0x0274
            r22.close()     // Catch:{ all -> 0x02ad }
        L_0x0274:
            throw r0     // Catch:{ all -> 0x02ad }
        L_0x0275:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from any of the resolved addresses for "
            X.C17900vP.A0g(r0, r12, r1)     // Catch:{ all -> 0x02ad }
            X.8Ji r2 = new X.8Ji     // Catch:{ all -> 0x02ad }
            r2.<init>()     // Catch:{ all -> 0x02ad }
            goto L_0x0297
        L_0x0284:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to resolve ntp server "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)     // Catch:{ all -> 0x02ad }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x02ad }
            X.8Ji r2 = new X.8Ji     // Catch:{ all -> 0x02ad }
            r2.<init>()     // Catch:{ all -> 0x02ad }
        L_0x0297:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x029a:
            boolean r0 = r2 instanceof X.C162178Jk
            if (r0 == 0) goto L_0x02aa
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.whatsapp.workers.ntp.NtpSyncWorker.A06 = r0
            java.lang.String r0 = "/ntp/succeeded"
        L_0x02a6:
            r10.A00(r0)
            return r2
        L_0x02aa:
            java.lang.String r0 = "/ntp/failed"
            goto L_0x02a6
        L_0x02ad:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131256kn.A00(android.content.Context, X.11P, X.1Cp, X.0ve, X.6nS):X.9Lg");
    }
}
