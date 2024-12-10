package X;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.7Io  reason: invalid class name and case insensitive filesystem */
public class C144757Io implements B8D {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C144757Io(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A01(File file, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.setLength(j);
        randomAccessFile.getFD().sync();
        randomAccessFile.close();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v13, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v14, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v15, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v16, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v17, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v18, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v19, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v20, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v21, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v24, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v25, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v26, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v27, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v28, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v29, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v30, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v33, resolved type: X.9Hb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v52, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v53, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v54, resolved type: X.6IQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v55, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v56, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v57, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v58, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v60, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v61, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v62, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v64, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v12, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v66, resolved type: X.6IP} */
    /* JADX WARNING: type inference failed for: r6v37, types: [X.6IQ] */
    /* JADX WARNING: type inference failed for: r6v42, types: [X.6IQ] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1027:0x0ffa A[Catch:{ IOException -> 0x0255, all -> 0x12c6 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:1011:0x0fc3=Splitter:B:1011:0x0fc3, B:998:0x0f75=Splitter:B:998:0x0f75} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:329:0x06a0=Splitter:B:329:0x06a0, B:238:0x0512=Splitter:B:238:0x0512, B:348:0x06dd=Splitter:B:348:0x06dd} */
    public final X.A88 CGA(X.C191779nA r71) {
        /*
            r70 = this;
            r3 = r70
            int r1 = r3.A00
            r0 = r71
            if (r1 == 0) goto L_0x0098
            java.lang.Object r2 = r3.A01
            X.71w r2 = (X.C1405371w) r2
            java.lang.Object r1 = r3.A02
            X.37w r1 = (X.C696137w) r1
            boolean r4 = X.C108975cc.A1J(r0)
            java.lang.String r6 = r1.BLw(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            r1 = move-exception
            X.1IU r6 = X.C108945cZ.A1J(r1)
        L_0x001e:
            boolean r1 = r6 instanceof X.AnonymousClass1IU
            r3 = 0
            if (r1 == 0) goto L_0x0024
            r6 = r3
        L_0x0024:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x002d
            X.A88 r11 = X.A88.A01(r3)
            return r11
        L_0x002d:
            X.1Kb r7 = r2.A01
            java.net.URL r1 = new java.net.URL
            r1.<init>(r6)
            r9 = 0
            r11 = 0
            r13 = -1
            r8 = r0
            r10 = r1
            r15 = r4
            X.AUZ r5 = r7.A02(r8, r9, r10, r11, r13, r15)
            java.net.HttpURLConnection r0 = r5.A01     // Catch:{ all -> 0x0091 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x0091 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0089
            X.181 r1 = r2.A00     // Catch:{ all -> 0x0091 }
            r0 = 35
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0091 }
            X.9Hb r3 = r5.BMP(r1, r3, r0)     // Catch:{ all -> 0x0091 }
            X.6cL r0 = r2.A02     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = X.C17970vW.A04(r6)     // Catch:{ all -> 0x0091 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0091 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0091 }
            X.0vl r1 = r0.A00     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0091 }
            X.A5O r0 = (X.A5O) r0     // Catch:{ all -> 0x0091 }
            r0.A04(r3, r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = X.C17970vW.A04(r6)     // Catch:{ all -> 0x0091 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0091 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0091 }
            X.A5O r1 = (X.A5O) r1     // Catch:{ all -> 0x0091 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Bitmap r0 = r1.A02(r2, r0, r0, r4)     // Catch:{ all -> 0x0091 }
            X.A88 r11 = X.A88.A02(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x008d
        L_0x0089:
            X.A88 r11 = X.A88.A01(r3)     // Catch:{ all -> 0x0091 }
        L_0x008d:
            r5.close()
            return r11
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0098:
            java.lang.Object r5 = r3.A01
            X.5ti r5 = (X.C115295ti) r5
            java.lang.Object r1 = r3.A02
            r30 = r1
            r1 = r30
            java.io.File r1 = (java.io.File) r1
            r30 = r1
            X.10I r12 = r5.A0v
            r2 = 29
            X.7Qr r1 = new X.7Qr
            r1.<init>(r5, r0, r2)
            r12.CGF(r1)
            X.6zF r1 = r5.A0e
            r69 = r1
            X.1So r3 = r1.A0A
            java.lang.String r1 = r3.A02
            r68 = r1
            X.6uk r1 = r5.A0d
            r18 = r1
            monitor-enter(r18)
            java.lang.String r4 = r1.A0E     // Catch:{ all -> 0x12d0 }
            monitor-exit(r18)
            X.1TJ r1 = r5.A0G
            r67 = r1
            java.lang.Object r2 = r67.A00()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7 = 1
            boolean r2 = X.AnonymousClass000.A1Z(r2, r1)
            r1 = r69
            boolean r1 = r1.A0T
            if (r1 != 0) goto L_0x00e1
            r1 = r69
            boolean r1 = r1.A0U
            if (r1 != 0) goto L_0x00e1
            if (r2 == 0) goto L_0x00e4
        L_0x00e1:
            if (r4 != 0) goto L_0x00e4
            r7 = 0
        L_0x00e4:
            r1 = r69
            int r6 = r1.A03
            java.lang.String r1 = r1.A0H
            r66 = r1
            X.C123836Wa.A00(r66)
            r2 = 0
            if (r6 == 0) goto L_0x015b
            r1 = 2
            if (r6 == r1) goto L_0x014b
            r1 = r69
            java.lang.String r1 = r1.A0L
        L_0x00f9:
            android.net.Uri r4 = android.net.Uri.parse(r1)
            java.lang.String r1 = r4.getHost()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0131
            X.C123836Wa.A00(r66)
        L_0x010a:
            X.6Qi r1 = X.C122456Qi.FAILED_BAD_URL
        L_0x010c:
            android.util.Pair r4 = X.C108945cZ.A0N(r1, r2)
        L_0x0110:
            X.70W r1 = r5.A0k
            r65 = r1
            java.lang.Object r7 = r4.second
            java.net.URL r7 = (java.net.URL) r7
            r1.A0e = r7
            java.lang.Object r6 = r4.first
            X.6Qi r1 = X.C122456Qi.FAILED_NO_DIRECT_PATH
            r4 = 8
            if (r6 != r1) goto L_0x019e
            java.lang.String r0 = "MediaDownload/call/got no direct path to download"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.73o r0 = new X.73o
            r0.<init>(r4)
            X.A88 r11 = X.A88.A01(r0)
            return r11
        L_0x0131:
            java.lang.String r1 = r4.toString()     // Catch:{ MalformedURLException -> 0x0141 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0141 }
            r4.<init>(r1)     // Catch:{ MalformedURLException -> 0x0141 }
            X.6Qi r1 = X.C122456Qi.SUCCESS
            android.util.Pair r4 = X.C108945cZ.A0N(r1, r4)
            goto L_0x0110
        L_0x0141:
            X.C123836Wa.A00(r66)
            X.6Qi r1 = X.C122456Qi.FAILED_BAD_URL
            android.util.Pair r4 = X.C108945cZ.A0N(r1, r2)
            goto L_0x0110
        L_0x014b:
            r1 = r69
            java.lang.String r4 = r1.A0L
            if (r4 == 0) goto L_0x010a
            X.37w r1 = new X.37w
            r1.<init>(r4)
            java.lang.String r1 = r1.BLw(r0)
            goto L_0x00f9
        L_0x015b:
            if (r7 == 0) goto L_0x0165
            if (r4 != 0) goto L_0x0168
            r1 = r69
            java.lang.String r4 = r1.A0F
            if (r4 != 0) goto L_0x0168
        L_0x0165:
            X.6Qi r1 = X.C122456Qi.FAILED_NO_DIRECT_PATH
            goto L_0x010c
        L_0x0168:
            java.lang.String r23 = "mms"
            boolean r1 = X.C63972u0.A06(r3)
            if (r1 == 0) goto L_0x0199
            r7 = r66
        L_0x0172:
            X.C17960vV.A07(r7)
            X.0ve r6 = r5.A0Q
            int r1 = r5.A15
            if (r1 != 0) goto L_0x0196
            java.lang.String r25 = "manual"
        L_0x017d:
            java.lang.String r1 = "Required value was null."
            if (r7 == 0) goto L_0x12cb
            X.2NY r1 = new X.2NY
            r19 = r1
            r20 = r6
            r21 = r7
            r22 = r68
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25)
            java.lang.String r1 = r1.BLw(r0)
            goto L_0x00f9
        L_0x0196:
            java.lang.String r25 = "auto"
            goto L_0x017d
        L_0x0199:
            r1 = r69
            java.lang.String r7 = r1.A0G
            goto L_0x0172
        L_0x019e:
            X.6Qi r1 = X.C122456Qi.FAILED_BAD_URL
            if (r6 != r1) goto L_0x01b1
            java.lang.String r0 = "MediaDownload/call/got bad url"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.73o r0 = new X.73o
            r0.<init>(r4)
            X.A88 r11 = X.A88.A00(r0)
            return r11
        L_0x01b1:
            r5.A04 = r7
            int r1 = r0.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = r65
            r1.A0Q = r4
            java.lang.String r4 = r0.A04
            r1.A0Z = r4
            boolean r1 = r0.A08
            if (r1 == 0) goto L_0x01eb
            java.lang.String r4 = r0.A07
        L_0x01c7:
            r1 = r65
            r1.A0b = r4
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "MediaDownload/call/download/mediaHash="
            r4.append(r1)
            java.lang.String r1 = X.C123836Wa.A00(r66)
            X.C17890vO.A1A(r4, r1)
            java.io.File r1 = r5.A02
            long r28 = r1.length()
            java.io.File r1 = r5.A02
            r22 = r1
            java.net.URL r1 = r5.A04
            r59 = r1
            r1 = 7
            goto L_0x01ed
        L_0x01eb:
            r4 = 0
            goto L_0x01c7
        L_0x01ed:
            android.net.TrafficStats.setThreadStatsTag(r1)     // Catch:{ all -> 0x12c6 }
            r1 = r69
            boolean r1 = r1.A0R     // Catch:{ all -> 0x12c6 }
            if (r1 != 0) goto L_0x0279
            boolean r0 = X.C63972u0.A06(r3)     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x01fd
            goto L_0x0202
        L_0x01fd:
            r0 = r69
            java.lang.String r0 = r0.A0G     // Catch:{ all -> 0x12c6 }
            goto L_0x0204
        L_0x0202:
            r0 = r66
        L_0x0204:
            if (r0 != 0) goto L_0x020f
            r0 = 28
            X.73o r12 = new X.73o     // Catch:{ all -> 0x12c6 }
            r12.<init>(r0)     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x020f:
            r0 = r69
            boolean r0 = r0.A0W     // Catch:{ all -> 0x12c6 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x12c6 }
            r0 = r65
            r0.A0K = r1     // Catch:{ all -> 0x12c6 }
            int r0 = r5.A06     // Catch:{ all -> 0x12c6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12c6 }
            r0 = r65
            r0.A0R = r1     // Catch:{ all -> 0x12c6 }
            r0 = r69
            int r0 = r0.A05     // Catch:{ all -> 0x12c6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12c6 }
            r0 = r65
            r0.A0T = r1     // Catch:{ all -> 0x12c6 }
            boolean r1 = r5.A0I()     // Catch:{ all -> 0x12c6 }
            X.68h r0 = X.C115295ti.A00(r5, r1)     // Catch:{ all -> 0x12c6 }
            X.6c4 r0 = r0.A03()     // Catch:{ all -> 0x12c6 }
            X.73o r12 = r0.A00     // Catch:{ all -> 0x12c6 }
            r0 = r69
            boolean r0 = r0.A0a     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x0261
            java.io.File r0 = r5.A02     // Catch:{ IOException -> 0x0255 }
            byte[] r1 = X.C64062u9.A0W(r0)     // Catch:{ IOException -> 0x0255 }
            r0 = r18
            r0.A0F(r1)     // Catch:{ IOException -> 0x0255 }
            r5.A0G()     // Catch:{ IOException -> 0x0255 }
            goto L_0x11a7
        L_0x0255:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12c6 }
            java.lang.String r0 = "MediaDownload/downloadNewsletterMedia Failed loading thumbnail bytes, with exception: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x0261:
            if (r1 == 0) goto L_0x11a7
            r5.A0G()     // Catch:{ all -> 0x12c6 }
            boolean r0 = r5.A0I()     // Catch:{ all -> 0x12c6 }
            if (r0 != 0) goto L_0x11a7
            r0 = 0
            X.68h r0 = X.C115295ti.A00(r5, r0)     // Catch:{ all -> 0x12c6 }
            X.6c4 r0 = r0.A03()     // Catch:{ all -> 0x12c6 }
            X.73o r12 = r0.A00     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x0279:
            boolean r1 = r69.A02()     // Catch:{ all -> 0x12c6 }
            if (r1 == 0) goto L_0x110c
            monitor-enter(r18)     // Catch:{ all -> 0x12c6 }
            r1 = r18
            boolean r1 = r1.A0H     // Catch:{ all -> 0x1109 }
            monitor-exit(r18)     // Catch:{ all -> 0x12c6 }
            if (r1 != 0) goto L_0x110c
            X.2d7 r1 = r69.A01()     // Catch:{ all -> 0x12c6 }
            if (r1 == 0) goto L_0x029f
            byte[] r13 = r1.A00     // Catch:{ all -> 0x12c6 }
            if (r13 == 0) goto L_0x029f
            boolean r4 = X.C63972u0.A08(r3)     // Catch:{ all -> 0x12c6 }
            if (r4 != 0) goto L_0x02af
            X.1So r4 = X.C26551So.A0p     // Catch:{ all -> 0x12c6 }
            if (r3 == r4) goto L_0x02af
            int[] r3 = r1.A01     // Catch:{ all -> 0x12c6 }
            if (r3 != 0) goto L_0x02af
        L_0x029f:
            r1 = 1
            X.C123836Wa.A00(r66)     // Catch:{ all -> 0x12c6 }
            r18.A07()     // Catch:{ all -> 0x12c6 }
            r0 = 30
            X.73o r12 = new X.73o     // Catch:{ all -> 0x12c6 }
            r12.<init>(r0, r2, r1)     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x02af:
            r2 = r69
            java.io.File r2 = r2.A0C     // Catch:{ all -> 0x12c6 }
            r35 = r2
            X.6ug r2 = r5.A0r     // Catch:{ all -> 0x12c6 }
            r64 = r2
            java.io.File r2 = r2.A0C     // Catch:{ all -> 0x12c6 }
            r34 = r2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12c6 }
            X.C17960vV.A07(r66)     // Catch:{ all -> 0x12c6 }
            r2 = r66
            X.C108995ce.A1N(r3, r2)     // Catch:{ all -> 0x12c6 }
            java.lang.String r2 = ".chk.tmp"
            java.lang.String r3 = X.AnonymousClass000.A0y(r2, r3)     // Catch:{ all -> 0x12c6 }
            X.17r r2 = r5.A0B     // Catch:{ all -> 0x12c6 }
            r63 = r2
            java.io.File r57 = r2.A0a(r3)     // Catch:{ all -> 0x12c6 }
            if (r35 == 0) goto L_0x10ef
            if (r34 == 0) goto L_0x10ef
            r5.A0F()     // Catch:{ all -> 0x12c6 }
            X.118 r15 = r5.A0M     // Catch:{ all -> 0x12c6 }
            X.11P r14 = r5.A0L     // Catch:{ all -> 0x12c6 }
            X.0ve r2 = r5.A0Q     // Catch:{ all -> 0x12c6 }
            r62 = r2
            X.190 r12 = r5.A0A     // Catch:{ all -> 0x12c6 }
            X.181 r11 = r5.A0D     // Catch:{ all -> 0x12c6 }
            X.1h6 r10 = r5.A0V     // Catch:{ all -> 0x12c6 }
            X.11Z r9 = r5.A0N     // Catch:{ all -> 0x12c6 }
            com.whatsapp.media.WamediaManager r8 = r5.A0W     // Catch:{ all -> 0x12c6 }
            X.1Sj r7 = r5.A0c     // Catch:{ all -> 0x12c6 }
            X.6lc r6 = r5.A0t     // Catch:{ all -> 0x12c6 }
            int[] r3 = r1.A01     // Catch:{ all -> 0x12c6 }
            X.1Kb r2 = r5.A0S     // Catch:{ all -> 0x12c6 }
            X.6eF r1 = r5.A0f     // Catch:{ all -> 0x12c6 }
            X.2k8 r4 = X.C115295ti.A01(r5)     // Catch:{ all -> 0x12c6 }
            java.lang.String r58 = r4.A00()     // Catch:{ all -> 0x12c6 }
            X.744 r4 = new X.744     // Catch:{ all -> 0x12c6 }
            r36 = r4
            r37 = r12
            r38 = r63
            r39 = r11
            r40 = r14
            r41 = r15
            r42 = r9
            r43 = r62
            r44 = r2
            r45 = r10
            r46 = r8
            r47 = r7
            r48 = r5
            r49 = r18
            r50 = r69
            r51 = r1
            r52 = r0
            r53 = r64
            r54 = r6
            r55 = r35
            r56 = r34
            r60 = r13
            r61 = r3
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)     // Catch:{ all -> 0x12c6 }
            r26 = 1
            X.7Ml r1 = new X.7Ml     // Catch:{ all -> 0x12c6 }
            r0 = r26
            r1.<init>(r5, r0)     // Catch:{ all -> 0x12c6 }
            r0 = r64
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x12c6 }
            r0.add(r1)     // Catch:{ all -> 0x12c6 }
            java.lang.String r16 = "rw"
            java.io.File r0 = r4.A0M     // Catch:{ IOException -> 0x0fdb }
            r46 = r0
            boolean r0 = r46.exists()     // Catch:{ IOException -> 0x0fdb }
            if (r0 != 0) goto L_0x0354
            r46.createNewFile()     // Catch:{ IOException -> 0x0fdb }
        L_0x0354:
            java.io.File r0 = r4.A0L     // Catch:{ IOException -> 0x0fdb }
            r54 = r0
            boolean r0 = r54.exists()     // Catch:{ IOException -> 0x0fdb }
            if (r0 != 0) goto L_0x0361
            r54.createNewFile()     // Catch:{ IOException -> 0x0fdb }
        L_0x0361:
            X.6ug r12 = r4.A0I     // Catch:{ all -> 0x12c6 }
            r0 = 4
            r12.A02(r0)     // Catch:{ all -> 0x12c6 }
            X.5ti r0 = r4.A0E     // Catch:{ all -> 0x12c6 }
            r53 = r0
            boolean r0 = r0.A05     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x03f7
            r0 = r53
            int r1 = r0.A15     // Catch:{ all -> 0x12c6 }
            r0 = r26
            if (r1 == r0) goto L_0x038c
            r0 = r53
            int r1 = r0.A15     // Catch:{ all -> 0x12c6 }
            r0 = 2
            if (r1 == r0) goto L_0x038c
            r0 = r53
            int r1 = r0.A15     // Catch:{ all -> 0x12c6 }
            r0 = 5
            if (r1 == r0) goto L_0x038c
            r0 = r53
            int r1 = r0.A15     // Catch:{ all -> 0x12c6 }
            r0 = 6
            if (r1 != r0) goto L_0x03c5
        L_0x038c:
            X.1Sj r9 = r4.A0D     // Catch:{ all -> 0x12c6 }
            X.6zF r2 = r4.A0G     // Catch:{ all -> 0x12c6 }
            X.1So r8 = r2.A0A     // Catch:{ all -> 0x12c6 }
            long r0 = r2.A07     // Catch:{ all -> 0x12c6 }
            boolean r3 = r2.A0Q     // Catch:{ all -> 0x12c6 }
            if (r3 != 0) goto L_0x039e
            int r3 = r2.A00     // Catch:{ all -> 0x12c6 }
            r42 = 0
            if (r3 <= 0) goto L_0x03a0
        L_0x039e:
            r42 = 1
        L_0x03a0:
            int r7 = r2.A04     // Catch:{ all -> 0x12c6 }
            boolean r6 = r2.A0Z     // Catch:{ all -> 0x12c6 }
            boolean r3 = r2.A0Y     // Catch:{ all -> 0x12c6 }
            boolean r2 = r2.A0S     // Catch:{ all -> 0x12c6 }
            r41 = 0
            r36 = r9
            r37 = r8
            r38 = r7
            r39 = r0
            r43 = r6
            r44 = r3
            r45 = r2
            boolean r0 = r36.A03(r37, r38, r39, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x12c6 }
            if (r0 != 0) goto L_0x03c5
            java.lang.String r0 = "StreamMediaDownloadHandler/cancel/not network safe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12c6 }
            goto L_0x0e06
        L_0x03c5:
            boolean r0 = r53.A0I()     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x03f7
            X.1Sj r3 = r4.A0D     // Catch:{ all -> 0x12c6 }
            X.6zF r0 = r4.A0G     // Catch:{ all -> 0x12c6 }
            r2 = 0
            X.11E r1 = r3.A02     // Catch:{ all -> 0x12c6 }
            int r39 = r1.A03(r2)     // Catch:{ all -> 0x12c6 }
            X.1So r2 = r0.A0A     // Catch:{ all -> 0x12c6 }
            boolean r43 = r0.A02()     // Catch:{ all -> 0x12c6 }
            int r1 = r0.A00     // Catch:{ all -> 0x12c6 }
            X.1BI r0 = r0.A08     // Catch:{ all -> 0x12c6 }
            r41 = 0
            r40 = r1
            r37 = r0
            r38 = r2
            r36 = r3
            boolean r0 = r36.A02(r37, r38, r39, r40, r41, r43)     // Catch:{ all -> 0x12c6 }
            if (r0 != 0) goto L_0x03f7
            java.lang.String r0 = "StreamMediaDownloadHandler/cancel/prefetching not network safe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12c6 }
            goto L_0x0de4
        L_0x03f7:
            X.6zF r0 = r4.A0G     // Catch:{ all -> 0x12c6 }
            r52 = r0
            int r0 = r0.A02     // Catch:{ all -> 0x12c6 }
            r51 = r0
            r17 = 2
            r1 = r0
            r0 = r17
            if (r1 != r0) goto L_0x0415
            com.whatsapp.media.WamediaManager r6 = r4.A0C     // Catch:{ all -> 0x12c6 }
            long r0 = r12.A00()     // Catch:{ all -> 0x12c6 }
            X.72t r3 = new X.72t     // Catch:{ all -> 0x12c6 }
            r2 = r54
            r3.<init>(r6, r2, r0)     // Catch:{ all -> 0x12c6 }
            r4.A01 = r3     // Catch:{ all -> 0x12c6 }
        L_0x0415:
            r27 = 0
            java.lang.String r2 = "r"
            X.6Qb r33 = new X.6Qb     // Catch:{ IOException -> 0x0fbe, NoSuchAlgorithmException -> 0x0fbc, 6Sc -> 0x0f6f, all -> 0x0f68 }
            r1 = r33
            r0 = r46
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x0fbe, NoSuchAlgorithmException -> 0x0fbc, 6Sc -> 0x0f6f, all -> 0x0f68 }
            X.6Qb r32 = new X.6Qb     // Catch:{ all -> 0x0f55 }
            r1 = r54
            r2 = r32
            r0 = r16
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0f55 }
            X.6eF r9 = r4.A0H     // Catch:{ all -> 0x0f44 }
            r0 = r52
            java.lang.String r0 = r0.A0G     // Catch:{ all -> 0x0f44 }
            r19 = r0
            r3 = 0
            long r6 = r46.length()     // Catch:{ all -> 0x0f44 }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04c0
            if (r19 == 0) goto L_0x04c0
            X.1RN r7 = r9.A01     // Catch:{ all -> 0x0f44 }
            monitor-enter(r7)     // Catch:{ all -> 0x0f44 }
            X.1RM r0 = r7.A01     // Catch:{ all -> 0x04bd }
            X.1at r8 = r0.get()     // Catch:{ all -> 0x04bd }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04b3 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x04b3 }
            java.lang.String r2 = "SELECT enc_file_restored FROM express_path_download_data WHERE enc_file_hash=?"
            r0 = r26
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x04b3 }
            r1[r3] = r19     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "ExpressPathDownloadDataStore/getFileRestored"
            android.database.Cursor r1 = r6.A0A(r2, r0, r1)     // Catch:{ all -> 0x04b3 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0479
            java.lang.String r0 = "enc_file_restored"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04a7 }
            boolean r0 = X.AnonymousClass1Eu.A05(r1, r0)     // Catch:{ all -> 0x04a7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04a7 }
            r1.close()     // Catch:{ all -> 0x04b3 }
            r8.close()     // Catch:{ all -> 0x04bd }
            goto L_0x0482
        L_0x0479:
            r1.close()     // Catch:{ all -> 0x04b3 }
            r8.close()     // Catch:{ all -> 0x04bd }
            monitor-exit(r7)     // Catch:{ all -> 0x0f44 }
            r0 = 0
            goto L_0x0483
        L_0x0482:
            monitor-exit(r7)     // Catch:{ all -> 0x0f44 }
        L_0x0483:
            boolean r0 = X.C18070vi.A19(r0, r3)     // Catch:{ all -> 0x0f44 }
            if (r0 == 0) goto L_0x04c0
            X.0ve r2 = r9.A00     // Catch:{ all -> 0x0f44 }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ all -> 0x0f44 }
            r0 = 1917(0x77d, float:2.686E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x0f44 }
            if (r0 != 0) goto L_0x049d
            r0 = 8520(0x2148, float:1.1939E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x0f44 }
            if (r0 == 0) goto L_0x04c0
        L_0x049d:
            r0 = 7020(0x1b6c, float:9.837E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x0f44 }
            if (r0 == 0) goto L_0x04c0
            r3 = 1
            goto L_0x04c0
        L_0x04a7:
            r2 = move-exception
            if (r1 == 0) goto L_0x04b2
            r1.close()     // Catch:{ all -> 0x04ae }
            goto L_0x04b2
        L_0x04ae:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x04b3 }
        L_0x04b2:
            throw r2     // Catch:{ all -> 0x04b3 }
        L_0x04b3:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x04b8 }
            goto L_0x04bc
        L_0x04b8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x04bd }
        L_0x04bc:
            throw r1     // Catch:{ all -> 0x04bd }
        L_0x04bd:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0f44 }
            throw r0     // Catch:{ all -> 0x0f44 }
        L_0x04c0:
            java.lang.String r31 = "StreamMediaDownloadHandler/prefetch/stopped, reached max bytes"
            r7 = 0
            if (r3 == 0) goto L_0x0611
            r0 = r52
            long r2 = r0.A07     // Catch:{ all -> 0x0f44 }
            double r0 = (double) r2     // Catch:{ all -> 0x0f44 }
            r10 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 / r10
            double r2 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x0f44 }
            double r2 = r2 * r10
            double r2 = r2 + r10
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = r2 + r0
            long r0 = (long) r2     // Catch:{ all -> 0x0f44 }
            int[] r6 = r4.A0P     // Catch:{ all -> 0x0f44 }
            r3 = 3
            r2 = r51
            if (r2 != r3) goto L_0x04f2
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0f44 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0f44 }
            java.util.ArrayList r2 = X.AnonymousClass6WD.A00(r2, r6)     // Catch:{ all -> 0x0f44 }
            X.6IQ r6 = new X.6IQ     // Catch:{ all -> 0x0f44 }
            r3 = r27
            r6.<init>(r2, r3, r0)     // Catch:{ all -> 0x0f44 }
            goto L_0x0512
        L_0x04f2:
            r3 = r2
            r2 = r17
            if (r3 != r2) goto L_0x0511
            r41 = 65536(0x10000, double:3.2379E-319)
            double r2 = (double) r0     // Catch:{ all -> 0x0f44 }
            r10 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r2 = r2 / r10
            double r2 = java.lang.Math.ceil(r2)     // Catch:{ all -> 0x0f44 }
            int r10 = (int) r2     // Catch:{ all -> 0x0f44 }
            X.6IP r6 = new X.6IP     // Catch:{ all -> 0x0f44 }
            r36 = r6
            r37 = r27
            r38 = r10
            r39 = r0
            r36.<init>(r37, r38, r39, r41)     // Catch:{ all -> 0x0f44 }
            goto L_0x0512
        L_0x0511:
            r6 = 0
        L_0x0512:
            byte[] r10 = r4.A0O     // Catch:{ all -> 0x0f3c }
            X.9dF r3 = r4.A09     // Catch:{ all -> 0x0f3c }
            X.9l8 r2 = new X.9l8     // Catch:{ all -> 0x0f3c }
            r2.<init>(r3, r10, r0)     // Catch:{ all -> 0x0f3c }
            java.lang.String r0 = "StreamMediaDownloadHandler/attempt restore from expresspath"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0f3c }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0f3c }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0f3c }
            java.io.File r10 = r4.A0K     // Catch:{ all -> 0x0f3c }
            X.7SP r3 = new X.7SP     // Catch:{ all -> 0x0f3c }
            r20 = r3
            r21 = r2
            r22 = r4
            r23 = r6
            r24 = r33
            r25 = r32
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0f3c }
            r25 = 0
            r0 = r26
            X.AnonymousClass3Ma.A1O(r10, r0, r6)     // Catch:{ all -> 0x0f3c }
            long r23 = r46.length()     // Catch:{ all -> 0x0f3c }
            r20 = r6
            r21 = r7
            java.util.ArrayList r11 = r20.A07(r21, r23, r25)     // Catch:{ all -> 0x0f3c }
            X.1Wu r2 = X.C27621Wu.A00     // Catch:{ all -> 0x0f3c }
            X.6r3 r1 = new X.6r3     // Catch:{ all -> 0x0f3c }
            r0 = r27
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0f3c }
            java.util.Iterator r2 = r11.iterator()     // Catch:{ all -> 0x0f3c }
        L_0x0559:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0570
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0f3c }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0f3c }
            java.lang.Object r1 = r3.invoke(r0)     // Catch:{ all -> 0x0f3c }
            X.6r3 r1 = (X.C134726r3) r1     // Catch:{ all -> 0x0f3c }
            java.lang.Exception r0 = r1.A00     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0559
        L_0x0570:
            java.lang.Exception r0 = r1.A00     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0590
            r2 = 1
            boolean r1 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x0f3c }
            if (r1 == 0) goto L_0x057c
            r2 = 9
            goto L_0x0588
        L_0x057c:
            boolean r1 = r0 instanceof X.C26531Sm     // Catch:{ all -> 0x0f3c }
            if (r1 == 0) goto L_0x0582
            r2 = 7
            goto L_0x0588
        L_0x0582:
            boolean r0 = r0 instanceof X.AnonymousClass6S8     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0588
            r2 = 21
        L_0x0588:
            r32.close()     // Catch:{ all -> 0x06c2 }
            r33.close()     // Catch:{ IOException -> 0x0fbe, NoSuchAlgorithmException -> 0x0fbc, 6Sc -> 0x06bb, all -> 0x0f68 }
            goto L_0x0fef
        L_0x0590:
            r36 = r6
            r37 = r7
            r39 = r23
            r41 = r26
            r36.A07(r37, r39, r41)     // Catch:{ all -> 0x0f3c }
            boolean r0 = X.C17880vN.A1X(r11)     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x05a4
            r6.A08(r10)     // Catch:{ all -> 0x0f3c }
        L_0x05a4:
            if (r19 == 0) goto L_0x06cb
            X.1RN r3 = r9.A01     // Catch:{ all -> 0x0f3c }
            monitor-enter(r3)     // Catch:{ all -> 0x0f3c }
            X.C17960vV.A00()     // Catch:{ all -> 0x060e }
            X.1RM r0 = r3.A01     // Catch:{ all -> 0x060e }
            X.1au r11 = r0.A06()     // Catch:{ all -> 0x060e }
            android.content.ContentValues r2 = X.C17880vN.A08()     // Catch:{ all -> 0x0604 }
            java.lang.String r10 = "enc_file_restored"
            r0 = 1
            X.C17880vN.A19(r2, r10, r0)     // Catch:{ all -> 0x0604 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0604 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0604 }
            java.lang.String r22 = "express_path_download_data"
            java.lang.String r23 = "enc_file_hash = ?"
            r0 = r26
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0604 }
            r0[r25] = r19     // Catch:{ all -> 0x0604 }
            java.lang.String r24 = "ExpressPathDownloadDataStore/updateRestored"
            r20 = r1
            r21 = r2
            r25 = r0
            r20.A02(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0604 }
            r11.close()     // Catch:{ all -> 0x060e }
            monitor-exit(r3)     // Catch:{ all -> 0x0f3c }
            X.0ve r2 = r9.A00     // Catch:{ all -> 0x0f3c }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ all -> 0x0f3c }
            r0 = 8520(0x2148, float:1.1939E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x0f3c }
            if (r0 != 0) goto L_0x06cb
            r0 = 7020(0x1b6c, float:9.837E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x06cb
            r0 = r19
            boolean r0 = r3.A01(r0)     // Catch:{ all -> 0x0f3c }
            if (r0 != 0) goto L_0x06cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f3c }
            java.lang.String r0 = "MediaDownload/download failed to delete EP data in DB with encHash: "
            r2 = r19
            X.C17900vP.A0e(r0, r2, r1)     // Catch:{ all -> 0x0f3c }
            goto L_0x06cb
        L_0x0604:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0609 }
            goto L_0x060d
        L_0x0609:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x060e }
        L_0x060d:
            throw r1     // Catch:{ all -> 0x060e }
        L_0x060e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0f3c }
            throw r0     // Catch:{ all -> 0x0f3c }
        L_0x0611:
            long r1 = r54.length()     // Catch:{ all -> 0x0f44 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x06c9
            java.io.File r13 = r4.A0K     // Catch:{ all -> 0x0f44 }
            boolean r0 = r13.exists()     // Catch:{ all -> 0x0f44 }
            if (r0 == 0) goto L_0x06c9
            java.lang.String r0 = "StreamMediaDownloadHandler/attempt restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0f44 }
            r1 = 3
            r0 = r51
            if (r0 != r1) goto L_0x0635
            int[] r0 = r4.A0P     // Catch:{ all -> 0x0f44 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0f44 }
            X.6IQ r6 = X.AnonymousClass6IQ.A00(r13, r0)     // Catch:{ all -> 0x0f44 }
            goto L_0x06a0
        L_0x0635:
            r1 = r0
            r0 = r17
            if (r1 != r0) goto L_0x069e
            java.io.FileInputStream r1 = X.C108945cZ.A18(r13)     // Catch:{ IOException -> 0x0694 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0694 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0694 }
            java.io.DataInputStream r14 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0694 }
            r14.<init>(r0)     // Catch:{ IOException -> 0x0694 }
            long r20 = r14.readLong()     // Catch:{ all -> 0x068a }
            long r10 = r14.readLong()     // Catch:{ all -> 0x068a }
            int r9 = r14.readInt()     // Catch:{ all -> 0x068a }
            r0 = r20
            double r2 = (double) r0     // Catch:{ all -> 0x068a }
            double r0 = (double) r10     // Catch:{ all -> 0x068a }
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)     // Catch:{ all -> 0x068a }
            int r2 = (int) r0     // Catch:{ all -> 0x068a }
            if (r9 == r2) goto L_0x0669
            java.lang.String r0 = "ChunkStore/count didnt match, aborting"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x068a }
            r14.close()     // Catch:{ IOException -> 0x0694 }
            goto L_0x069e
        L_0x0669:
            int[] r1 = new int[r9]     // Catch:{ all -> 0x068a }
            r0 = 0
        L_0x066c:
            if (r0 >= r9) goto L_0x0677
            int r2 = r14.readInt()     // Catch:{ all -> 0x068a }
            r1[r0] = r2     // Catch:{ all -> 0x068a }
            int r0 = r0 + 1
            goto L_0x066c
        L_0x0677:
            X.6IP r6 = new X.6IP     // Catch:{ all -> 0x068a }
            r36 = r6
            r37 = r1
            r38 = r9
            r39 = r20
            r41 = r10
            r36.<init>(r37, r38, r39, r41)     // Catch:{ all -> 0x068a }
            r14.close()     // Catch:{ IOException -> 0x0694 }
            goto L_0x06a0
        L_0x068a:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x068f }
            goto L_0x0693
        L_0x068f:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ IOException -> 0x0694 }
        L_0x0693:
            throw r0     // Catch:{ IOException -> 0x0694 }
        L_0x0694:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f44 }
            java.lang.String r0 = "ChunkStore/chunk object not found: "
            X.C108995ce.A1J(r13, r0, r1, r2)     // Catch:{ all -> 0x0f44 }
        L_0x069e:
            r6 = r27
        L_0x06a0:
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0f3c }
            long r0 = r6.A04()     // Catch:{ all -> 0x0f3c }
            boolean r0 = X.AnonymousClass744.A03(r4, r0)     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x06cb
            X.AnonymousClass744.A02(r4)     // Catch:{ all -> 0x0f3c }
            com.whatsapp.util.Log.i((java.lang.String) r31)     // Catch:{ all -> 0x0f3c }
            r32.close()     // Catch:{ all -> 0x06c2 }
            r33.close()     // Catch:{ IOException -> 0x0fbe, NoSuchAlgorithmException -> 0x0fbc, 6Sc -> 0x06bb, all -> 0x0f68 }
            goto L_0x0de4
        L_0x06bb:
            r1 = move-exception
            r15 = r27
            r47 = r15
            goto L_0x0f75
        L_0x06c2:
            r1 = move-exception
            r15 = r27
            r47 = r15
            goto L_0x0f5b
        L_0x06c9:
            r6 = r27
        L_0x06cb:
            r0 = 0
            r12.A02(r0)     // Catch:{ all -> 0x0f3e }
            if (r6 == 0) goto L_0x06dd
            long r9 = r46.length()     // Catch:{ all -> 0x0f3e }
            long r1 = r6.A04()     // Catch:{ all -> 0x0f3e }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0814
        L_0x06dd:
            java.io.File r3 = r4.A0K     // Catch:{ all -> 0x0f3c }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0812
            int[] r2 = r4.A0P     // Catch:{ all -> 0x0f3c }
            if (r2 == 0) goto L_0x0812
            r0 = r52
            boolean r0 = r0.A0O     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0812
            r1 = 3
            r0 = r51
            if (r0 != r1) goto L_0x0812
            X.6lc r10 = r4.A0J     // Catch:{ all -> 0x0f3c }
            r0 = r52
            X.6r5 r9 = r0.A09     // Catch:{ all -> 0x0f3c }
            boolean r1 = r0.A0Z     // Catch:{ all -> 0x0f3c }
            if (r9 == 0) goto L_0x0812
            X.00H r0 = r10.A00     // Catch:{ all -> 0x0f3c }
            X.6ub r0 = X.C108945cZ.A0j(r0)     // Catch:{ all -> 0x0f3c }
            boolean r0 = r0.A02(r9, r1)     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0812
            X.0ve r9 = r4.A0A     // Catch:{ all -> 0x0f3c }
            r1 = 4169(0x1049, float:5.842E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0f3c }
            boolean r0 = X.C18020vd.A05(r0, r9, r1)     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0812
            X.6IQ r0 = X.AnonymousClass6IQ.A00(r3, r2)     // Catch:{ all -> 0x0f3c }
            if (r0 == 0) goto L_0x0812
            long r0 = r0.A01     // Catch:{ all -> 0x0f3c }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0f3c }
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0f3c }
            java.util.ArrayList r11 = X.AnonymousClass6WD.A00(r9, r2)     // Catch:{ all -> 0x0f3c }
            X.6IQ r10 = new X.6IQ     // Catch:{ all -> 0x0f3c }
            r9 = r27
            r10.<init>(r11, r9, r0)     // Catch:{ all -> 0x0f3c }
            r6 = r10
            r0 = r52
            java.io.File r13 = r0.A0D     // Catch:{ all -> 0x0f3c }
            X.190 r1 = r4.A05     // Catch:{ all -> 0x0f3c }
            X.9dF r11 = r4.A09     // Catch:{ all -> 0x0f3c }
            java.lang.String r15 = "StreamMediaDownloadHandler/encryptSavedImage failed to write to encrypted file "
            r14 = 0
            r0 = 4
            X.C18070vi.A0g(r1, r0, r11)     // Catch:{ all -> 0x0f3c }
            java.lang.String r0 = "StreamMediaDownloadHandler/encryptSavedImage re-encrypt partially saved mid-scan image"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0f3c }
            if (r13 == 0) goto L_0x0814
            boolean r1 = r13.exists()     // Catch:{ all -> 0x0f3c }
            r0 = r26
            if (r1 != r0) goto L_0x0814
            long r9 = r46.length()     // Catch:{ all -> 0x0f3c }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0814
            long r9 = r54.length()     // Catch:{ all -> 0x0f3c }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0814
            r1 = r2[r14]     // Catch:{ all -> 0x0f3c }
            r0 = r2[r26]     // Catch:{ all -> 0x0f3c }
            int r1 = r1 + r0
            r0 = r2[r17]     // Catch:{ all -> 0x0f3c }
            int r1 = r1 + r0
            int r0 = r1 % 16
            int r1 = r1 - r0
            long r0 = (long) r1     // Catch:{ all -> 0x0f3c }
            java.io.FileInputStream r10 = X.C26511Sk.A0J(r13)     // Catch:{ IOException -> 0x07e0 }
            X.6QY r9 = new X.6QY     // Catch:{ all -> 0x07d9 }
            r9.<init>(r10, r0)     // Catch:{ all -> 0x07d9 }
            r2 = r54
            X.C64062u9.A0T(r2, r9)     // Catch:{ all -> 0x07d2 }
            r9.close()     // Catch:{ all -> 0x07d9 }
            r10.close()     // Catch:{ IOException -> 0x07e0 }
            java.io.FileInputStream r10 = X.C26511Sk.A0J(r13)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x07ec }
            X.9Ha r9 = new X.9Ha     // Catch:{ all -> 0x07cb }
            r9.<init>(r11, r10)     // Catch:{ all -> 0x07cb }
            java.security.MessageDigest r2 = X.C108945cZ.A1I()     // Catch:{ all -> 0x07c4 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x07c4 }
            X.9HQ r11 = new X.9HQ     // Catch:{ all -> 0x07c4 }
            r11.<init>(r9, r2)     // Catch:{ all -> 0x07c4 }
            r2 = r46
            X.C64062u9.A0T(r2, r11)     // Catch:{ all -> 0x07bd }
            A01(r2, r0)     // Catch:{ all -> 0x07bd }
            r11.close()     // Catch:{ all -> 0x07c4 }
            r9.close()     // Catch:{ all -> 0x07cb }
            r10.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x07ec }
            long r23 = r46.length()     // Catch:{ all -> 0x0f3c }
            r20 = r6
            r21 = r7
            r25 = r26
            java.util.ArrayList r0 = r20.A07(r21, r23, r25)     // Catch:{ all -> 0x0f3c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0f3c }
            if (r0 != 0) goto L_0x0814
            r6.A08(r3)     // Catch:{ all -> 0x0f3c }
            goto L_0x0814
        L_0x07bd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07bf }
        L_0x07bf:
            r1 = move-exception
            X.CDX.A00(r11, r0)     // Catch:{ all -> 0x07c4 }
            throw r1     // Catch:{ all -> 0x07c4 }
        L_0x07c4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07c6 }
        L_0x07c6:
            r1 = move-exception
            X.CDX.A00(r9, r0)     // Catch:{ all -> 0x07cb }
            throw r1     // Catch:{ all -> 0x07cb }
        L_0x07cb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07cd }
        L_0x07cd:
            r1 = move-exception
            X.CDX.A00(r10, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x07ec }
            throw r1     // Catch:{ IOException | NoSuchAlgorithmException -> 0x07ec }
        L_0x07d2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07d4 }
        L_0x07d4:
            r1 = move-exception
            X.CDX.A00(r9, r0)     // Catch:{ all -> 0x07d9 }
            throw r1     // Catch:{ all -> 0x07d9 }
        L_0x07d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07db }
        L_0x07db:
            r1 = move-exception
            X.CDX.A00(r10, r0)     // Catch:{ IOException -> 0x07e0 }
            throw r1     // Catch:{ IOException -> 0x07e0 }
        L_0x07e0:
            r1 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f3c }
            java.lang.String r0 = "StreamMediaDownloadHandler/encryptSavedImage failed to write decrypted file "
            java.lang.String r0 = X.C108955ca.A10(r0, r2, r1)     // Catch:{ all -> 0x0f3c }
            goto L_0x07f5
        L_0x07ec:
            r0 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r15)     // Catch:{ all -> 0x0f3c }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0f3c }
        L_0x07f5:
            X.C17890vO.A1B(r2, r0)     // Catch:{ all -> 0x0f3c }
            r0 = r46
            A01(r0, r7)     // Catch:{ IOException -> 0x0803 }
            r0 = r54
            A01(r0, r7)     // Catch:{ IOException -> 0x0803 }
            goto L_0x0814
        L_0x0803:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f3c }
            java.lang.String r0 = "StreamMediaDownloadHandler/reset failed to reset file"
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ all -> 0x0f3c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0f3c }
            goto L_0x0814
        L_0x0812:
            if (r6 == 0) goto L_0x0899
        L_0x0814:
            long r9 = r46.length()     // Catch:{ all -> 0x0f3a }
            long r1 = r6.A04()     // Catch:{ all -> 0x0f3a }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0899
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f38 }
            java.lang.String r0 = "StreamMediaDownloadHandler/restore succeeded, downloaded_bytes="
            r2.append(r0)     // Catch:{ all -> 0x0f38 }
            long r0 = r6.A04()     // Catch:{ all -> 0x0f38 }
            X.C17890vO.A16(r2, r0)     // Catch:{ all -> 0x0f38 }
            java.io.File r0 = r4.A0K     // Catch:{ all -> 0x0f38 }
            r49 = r0
            monitor-enter(r12)     // Catch:{ all -> 0x0f38 }
            r12.A03 = r0     // Catch:{ all -> 0x0896 }
            long r0 = r6.A01     // Catch:{ all -> 0x0896 }
            r24 = r0
            r12.A00 = r0     // Catch:{ all -> 0x0896 }
            r12.A02 = r6     // Catch:{ all -> 0x0896 }
            monitor-exit(r12)     // Catch:{ all -> 0x0f38 }
            long r2 = r6.A06(r7)     // Catch:{ all -> 0x0f38 }
            long r0 = r6.A04()     // Catch:{ all -> 0x0f38 }
            r12.A0A = r0     // Catch:{ all -> 0x0f38 }
            long r0 = r6.A04()     // Catch:{ all -> 0x0f38 }
            r12.A04(r0, r7)     // Catch:{ all -> 0x0f38 }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0885
            java.net.URL r0 = r4.A0N     // Catch:{ all -> 0x0f38 }
            r50 = r0
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x0873
            int r1 = r6.A03(r2)     // Catch:{ all -> 0x0f38 }
        L_0x0861:
            int r1 = r1 + 1
            int r0 = r6.A00     // Catch:{ all -> 0x0f38 }
            if (r1 >= r0) goto L_0x0870
            long r10 = X.AnonymousClass70M.A01(r6, r1)     // Catch:{ all -> 0x0f38 }
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0870
            goto L_0x0861
        L_0x0870:
            if (r1 == r0) goto L_0x0873
            goto L_0x0876
        L_0x0873:
            r40 = -1
            goto L_0x087a
        L_0x0876:
            long r40 = r6.A05(r1)     // Catch:{ all -> 0x0f38 }
        L_0x087a:
            r36 = r4
            r37 = r50
            r38 = r2
            X.AUZ r15 = X.AnonymousClass744.A00(r36, r37, r38, r40)     // Catch:{ all -> 0x0f38 }
            goto L_0x08ff
        L_0x0885:
            java.net.URL r0 = r4.A0N     // Catch:{ all -> 0x0f38 }
            r50 = r0
            r40 = -1
            r36 = r4
            r37 = r0
            r38 = r7
            X.AUZ r15 = X.AnonymousClass744.A00(r36, r37, r38, r40)     // Catch:{ all -> 0x0f38 }
            goto L_0x08ff
        L_0x0896:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0f38 }
            throw r0     // Catch:{ all -> 0x0f38 }
        L_0x0899:
            java.net.URL r0 = r4.A0N     // Catch:{ all -> 0x0f3a }
            r50 = r0
            r2 = 3
            r24 = -1
            r20 = r4
            r21 = r0
            r22 = r7
            X.AUZ r15 = X.AnonymousClass744.A00(r20, r21, r22, r24)     // Catch:{ all -> 0x0f38 }
            java.net.HttpURLConnection r0 = r15.A01     // Catch:{ all -> 0x0f32 }
            int r0 = r0.getContentLength()     // Catch:{ all -> 0x0f32 }
            long r0 = (long) r0     // Catch:{ all -> 0x0f32 }
            r24 = r0
            r0 = r51
            if (r0 != r2) goto L_0x08cf
            int[] r1 = r4.A0P     // Catch:{ all -> 0x0f32 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x0f32 }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0f32 }
            java.util.ArrayList r9 = X.AnonymousClass6WD.A00(r0, r1)     // Catch:{ all -> 0x0f32 }
            X.6IQ r3 = new X.6IQ     // Catch:{ all -> 0x0f32 }
            r2 = r27
            r0 = r24
            r3.<init>(r9, r2, r0)     // Catch:{ all -> 0x0f32 }
            r6 = r3
            goto L_0x08ef
        L_0x08cf:
            r1 = r0
            r0 = r17
            if (r1 != r0) goto L_0x08ef
            r41 = 65536(0x10000, double:3.2379E-319)
            r0 = r24
            double r2 = (double) r0     // Catch:{ all -> 0x0f32 }
            r0 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)     // Catch:{ all -> 0x0f32 }
            int r2 = (int) r0     // Catch:{ all -> 0x0f32 }
            X.6IP r36 = new X.6IP     // Catch:{ all -> 0x0f32 }
            r37 = r27
            r38 = r2
            r39 = r24
            r36.<init>(r37, r38, r39, r41)     // Catch:{ all -> 0x0f32 }
            r6 = r36
        L_0x08ef:
            java.io.File r0 = r4.A0K     // Catch:{ all -> 0x0f32 }
            r49 = r0
            monitor-enter(r12)     // Catch:{ all -> 0x0f32 }
            r12.A03 = r0     // Catch:{ all -> 0x0f2f }
            long r0 = r6.A01     // Catch:{ all -> 0x0f2f }
            r12.A00 = r0     // Catch:{ all -> 0x0f2f }
            r12.A02 = r6     // Catch:{ all -> 0x0f2f }
            monitor-exit(r12)     // Catch:{ all -> 0x0f32 }
            r2 = 0
        L_0x08ff:
            r0 = r26
            r12.A02(r0)     // Catch:{ all -> 0x0f34 }
            byte[] r11 = r4.A0O     // Catch:{ all -> 0x0f34 }
            X.9dF r10 = r4.A09     // Catch:{ all -> 0x0f34 }
            X.9l8 r36 = new X.9l8     // Catch:{ all -> 0x0f34 }
            r9 = r36
            r0 = r24
            r9.<init>(r10, r11, r0)     // Catch:{ all -> 0x0f34 }
            X.11Z r0 = r4.A08     // Catch:{ 6S7 -> 0x0f0f }
            long r20 = r0.A01()     // Catch:{ 6S7 -> 0x0f0f }
            X.0ve r1 = r4.A0A     // Catch:{ 6S7 -> 0x0f0f }
            r0 = 1291(0x50b, float:1.809E-42)
            long r13 = X.C108995ce.A07(r1, r0)     // Catch:{ 6S7 -> 0x0f0f }
            r0 = 2
            long r9 = r24 * r0
            long r9 = r9 + r13
            int r0 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0f04
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0f34 }
            long r22 = r6.A04()     // Catch:{ all -> 0x0f34 }
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0eeb }
            r1 = r46
            r0 = r16
            r14.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x0eeb }
            java.lang.String r39 = "StreamMediaDownloadHandler/failed to open url connection input stream"
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0994
            r14.seek(r2)     // Catch:{ IOException -> 0x0982 }
            java.net.HttpURLConnection r1 = r15.A01     // Catch:{ IOException -> 0x096c }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x096c }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ IOException -> 0x096c }
            r12.A0D = r0     // Catch:{ IOException -> 0x096c }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r1.getHeaderField(r0)     // Catch:{ IOException -> 0x096c }
            r12.A0E = r0     // Catch:{ IOException -> 0x096c }
            X.181 r7 = r4.A07     // Catch:{ IOException -> 0x096c }
            r0 = r52
            boolean r0 = r0.A0Z     // Catch:{ IOException -> 0x096c }
            r1 = 0
            if (r0 == 0) goto L_0x095f
            r1 = 4
        L_0x095f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x096c }
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()     // Catch:{ IOException -> 0x096c }
            X.9Hb r27 = r15.BMP(r7, r1, r0)     // Catch:{ IOException -> 0x096c }
            goto L_0x0994
        L_0x096c:
            r0 = move-exception
            r4.A02 = r0     // Catch:{ all -> 0x0ee3 }
            com.whatsapp.util.Log.w((java.lang.String) r39)     // Catch:{ all -> 0x0ee3 }
            r32.close()     // Catch:{ all -> 0x0edb }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed2, 6Sc -> 0x0ec9, all -> 0x0ec0 }
            X.AnonymousClass1EY.A02(r14)     // Catch:{ all -> 0x12c6 }
            X.AnonymousClass1EY.A02(r15)     // Catch:{ all -> 0x12c6 }
            r2 = 18
            goto L_0x0fef
        L_0x0982:
            r0 = move-exception
            r4.A02 = r0     // Catch:{ all -> 0x0ee3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ee3 }
            java.lang.String r0 = "StreamMediaDownloadHandler/failed to seek to position="
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ all -> 0x0ee3 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0ee3 }
            goto L_0x0eb9
        L_0x0994:
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0ee3 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0ee3 }
            r48 = r0
            r16 = r22
        L_0x09a0:
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r47 = r27
            if (r0 < 0) goto L_0x0ce7
            r8 = 8192(0x2000, float:1.14794E-41)
            r7 = 0
            r1 = r48
            r0 = r27
            int r9 = r0.read(r1, r7, r8)     // Catch:{ IOException -> 0x0e2b }
        L_0x09b3:
            if (r9 < 0) goto L_0x0cd1
            r0 = r48
            r14.write(r0, r7, r9)     // Catch:{ IOException -> 0x0e90 }
            java.io.FileDescriptor r0 = r14.getFD()     // Catch:{ IOException -> 0x0e90 }
            r0.sync()     // Catch:{ IOException -> 0x0e90 }
            long r0 = (long) r9     // Catch:{ IOException -> 0x0e90 }
            r40 = r6
            r41 = r2
            r43 = r0
            r45 = r7
            java.util.ArrayList r40 = r40.A07(r41, r43, r45)     // Catch:{ IOException -> 0x0e90 }
            boolean r0 = r40.isEmpty()     // Catch:{ IOException -> 0x0e90 }
            if (r0 != 0) goto L_0x09f6
            java.util.Iterator r1 = r40.iterator()     // Catch:{ IOException -> 0x0e90 }
        L_0x09d8:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0e90 }
            if (r0 == 0) goto L_0x09f6
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0e90 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x0e90 }
            int r46 = r0.intValue()     // Catch:{ 1Sm -> 0x0d9c, 6S8 -> 0x0d7c }
            r41 = r36
            r42 = r4
            r43 = r6
            r44 = r33
            r45 = r32
            X.AnonymousClass744.A01(r41, r42, r43, r44, r45, r46)     // Catch:{ 1Sm -> 0x0d7a, 6S8 -> 0x0d78 }
            goto L_0x09d8
        L_0x09f6:
            long r0 = (long) r9     // Catch:{ 1Sm -> 0x0d7a, 6S8 -> 0x0d78 }
            r41 = r6
            r42 = r2
            r44 = r0
            r46 = r26
            r41.A07(r42, r44, r46)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r40.isEmpty()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 != 0) goto L_0x0a50
            r0 = r49
            r6.A08(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r1 = 3
            r0 = r51
            if (r0 != r1) goto L_0x0a50
            boolean r10 = X.AnonymousClass744.A02(r4)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r52
            boolean r7 = r0.A0Z     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6lc r1 = r4.A0J     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6r5 r8 = r0.A09     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r8 == 0) goto L_0x0a3a
            X.00H r1 = r1.A00     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6ub r0 = X.C108945cZ.A0j(r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r0.A02(r8, r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0a3a
            X.6ub r0 = X.C108945cZ.A0j(r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r0.A04(r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0a3a
            if (r10 != 0) goto L_0x0a3a
            if (r7 == 0) goto L_0x0a50
        L_0x0a3a:
            java.util.List r0 = r12.A05     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0a40:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0a50
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.8Ab r0 = (X.C160828Ab) r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0.C3T()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0a40
        L_0x0a50:
            long r0 = (long) r9     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            long r16 = r16 + r0
            long r2 = r2 + r0
            r7 = 2
            r0 = r51
            if (r0 != r7) goto L_0x0a8a
            X.72t r8 = r4.A01     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.C17960vV.A07(r8)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r1 = r8.A00     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r1 == 0) goto L_0x0a8a
            r0 = r26
            if (r1 != r0) goto L_0x0a8a
            long r0 = r8.A01     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r8 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x0a8a
            boolean r0 = r12.A0F     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 != 0) goto L_0x0a8a
            r0 = r26
            r12.A0F = r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.util.List r0 = r12.A05     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0a7a:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0a8a
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.8Ab r0 = (X.C160828Ab) r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0.C3T()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0a7a
        L_0x0a8a:
            r12.A02(r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r53
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r0.isCancelled()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0aa3
            java.lang.String r0 = "StreamMediaDownloadHandler/download cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r49
            r6.A08(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0dc5
        L_0x0aa3:
            X.6gc r10 = r12.A04     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            monitor-enter(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            long r0 = r10.A00     // Catch:{ all -> 0x0e39 }
            r7 = -1
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r11)
            monitor-exit(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0ae5
            r1 = 3
            r0 = r51
            if (r0 == r1) goto L_0x0ac1
            X.72t r0 = r4.A01     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.C17960vV.A07(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0ae5
        L_0x0ac1:
            monitor-enter(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            long r0 = r10.A00     // Catch:{ all -> 0x0e39 }
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0dd2
            r10.A00 = r7     // Catch:{ all -> 0x0e39 }
            monitor-exit(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            long r7 = r6.A06(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0ae5
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.String r10 = "StreamMediaDownloadHandler/attempting seek old="
            r11.append(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r11.append(r2)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.String r10 = ", new="
            X.C17900vP.A0m(r10, r11, r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0ae6
        L_0x0ae5:
            r0 = r2
        L_0x0ae6:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0aec
            goto L_0x0ccb
        L_0x0aec:
            long r7 = (long) r9     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r16
            r12.A04(r0, r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int[] r11 = r4.A0P     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r11 == 0) goto L_0x0bb1
            X.6lc r1 = r4.A0J     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6uk r0 = r4.A0F     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r41 = r0
            r0 = r52
            boolean r9 = r0.A0Z     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.String r0 = r0.A0M     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            long r7 = r7 - r20
            long r37 = r16 - r22
            r13 = 0
            r10 = 2
            r27 = 3
            if (r0 == 0) goto L_0x0bb1
            r0 = r40
            boolean r0 = X.C108965cb.A1Z(r0, r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0bb1
            r0 = r11[r13]     // Catch:{ IOException -> 0x0ba9 }
            r10 = r54
            boolean r0 = r1.A00(r10, r0, r9)     // Catch:{ IOException -> 0x0ba9 }
            if (r0 != 0) goto L_0x0b2c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)     // Catch:{ IOException -> 0x0ba9 }
            r0 = r41
            r0.A06 = r1     // Catch:{ IOException -> 0x0ba9 }
            goto L_0x0bb1
        L_0x0b2c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r26)     // Catch:{ IOException -> 0x0ba9 }
            r0 = r41
            r0.A06 = r10     // Catch:{ IOException -> 0x0ba9 }
            if (r9 == 0) goto L_0x0b45
            X.00H r0 = r1.A00     // Catch:{ IOException -> 0x0ba9 }
            X.6ub r9 = X.C108945cZ.A0j(r0)     // Catch:{ IOException -> 0x0ba9 }
            r0 = r26
            boolean r0 = r9.A04(r0)     // Catch:{ IOException -> 0x0ba9 }
            if (r0 != 0) goto L_0x0b45
            goto L_0x0bb1
        L_0x0b45:
            X.00H r0 = r1.A00     // Catch:{ IOException -> 0x0ba9 }
            X.6ub r13 = X.C108945cZ.A0j(r0)     // Catch:{ IOException -> 0x0ba9 }
            X.0vc r1 = r13.A05     // Catch:{ IOException -> 0x0ba9 }
            X.11C r0 = r13.A00     // Catch:{ IOException -> 0x0ba9 }
            int r1 = X.C24191Jf.A02(r0, r1)     // Catch:{ IOException -> 0x0ba9 }
            r0 = 2013(0x7dd, float:2.821E-42)
            if (r1 < r0) goto L_0x0b9d
            X.1SK r1 = r13.A04     // Catch:{ IOException -> 0x0ba9 }
            r0 = r26
            java.lang.Float r0 = r1.BNL(r0)     // Catch:{ IOException -> 0x0ba9 }
            if (r0 == 0) goto L_0x0b7b
            float r10 = r0.floatValue()     // Catch:{ IOException -> 0x0ba9 }
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b7b
            X.0ve r0 = r13.A02     // Catch:{ IOException -> 0x0ba9 }
            r9 = 1579(0x62b, float:2.213E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ IOException -> 0x0ba9 }
            int r0 = X.C18020vd.A00(r1, r0, r9)     // Catch:{ IOException -> 0x0ba9 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0ba9 }
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0b7b
            goto L_0x0bb1
        L_0x0b7b:
            r9 = 51200(0xc800, double:2.5296E-319)
            int r0 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0b9d
            r9 = 50
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0b9d
            r0 = r37
            double r9 = (double) r0     // Catch:{ IOException -> 0x0ba9 }
            double r0 = (double) r7     // Catch:{ IOException -> 0x0ba9 }
            double r9 = r9 / r0
            X.0ve r7 = r13.A02     // Catch:{ IOException -> 0x0ba9 }
            r1 = 1579(0x62b, float:2.213E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x0ba9 }
            int r0 = X.C18020vd.A00(r0, r7, r1)     // Catch:{ IOException -> 0x0ba9 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0ba9 }
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0b9d
            goto L_0x0bb1
        L_0x0b9d:
            r1 = r27
            r0 = r40
            boolean r0 = X.C108965cb.A1Z(r0, r1)     // Catch:{ IOException -> 0x0ba9 }
            r13 = 1
            if (r0 == 0) goto L_0x0bb2
            goto L_0x0bb1
        L_0x0ba9:
            java.lang.Integer r1 = X.C17880vN.A0l()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r41
            r0.A06 = r1     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0bb1:
            r13 = 0
        L_0x0bb2:
            r0 = r16
            boolean r0 = X.AnonymousClass744.A03(r4, r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0bc3
            com.whatsapp.util.Log.i((java.lang.String) r31)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = 3
            r12.A02(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0dd9
        L_0x0bc3:
            X.6lc r7 = r4.A0J     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r52
            X.6r5 r1 = r0.A09     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r8 = r0.A0Z     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r1 == 0) goto L_0x0c9f
            X.00H r0 = r7.A00     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r10 = r0
            X.6ub r0 = X.C108945cZ.A0j(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r0.A02(r1, r8)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0c9f
            X.6ub r0 = X.C108945cZ.A0j(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r0.A04(r8)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0c9f
            r7 = 3
            r0 = r51
            if (r0 != r7) goto L_0x0cbc
            if (r11 == 0) goto L_0x0cbc
            int r7 = r11.length     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = 4
            if (r7 != r0) goto L_0x0cbc
            r0 = r52
            java.lang.String r9 = r0.A0M     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = r0.A0O     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r7 = 0
            if (r0 != 0) goto L_0x0cbc
            if (r8 != 0) goto L_0x0cbc
            if (r9 == 0) goto L_0x0cbc
            java.lang.Integer r8 = X.C17880vN.A0i()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r40
            boolean r0 = r0.contains(r8)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0cbc
            X.6ub r0 = X.C108945cZ.A0j(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r1 = r0.A02(r1, r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r1 == 0) goto L_0x0cbc
            boolean r0 = r0.A04(r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0cbc
            java.lang.Integer r1 = X.C17880vN.A0j()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r40
            boolean r0 = r0.contains(r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 != 0) goto L_0x0cbc
            boolean r0 = X.AnonymousClass744.A05(r4, r9)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0cbc
            r0 = r11[r7]     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r1 = r11[r26]     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r0 = r0 + r1
            r1 = 2
            r1 = r11[r1]     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r0 = r0 + r1
            long r0 = (long) r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r10 = 0
            r7 = r54
            X.6QR r8 = X.C124336Xy.A00(r7, r0)     // Catch:{ IOException -> 0x0c73 }
            X.17r r0 = r4.A06     // Catch:{ all -> 0x0c69 }
            java.lang.String r9 = X.C137256vA.A01(r50)     // Catch:{ all -> 0x0c69 }
            java.io.File r7 = r0.A0G()     // Catch:{ all -> 0x0c69 }
            java.lang.String r1 = ".partial.tmp"
            r0 = r19
            java.io.File r1 = X.C218617r.A03(r7, r0, r9, r1)     // Catch:{ all -> 0x0c69 }
            if (r1 == 0) goto L_0x0c64
            boolean r0 = X.C64062u9.A0T(r1, r8)     // Catch:{ all -> 0x0c69 }
            if (r0 == 0) goto L_0x0c64
            X.6uk r7 = r4.A0F     // Catch:{ all -> 0x0c69 }
            monitor-enter(r7)     // Catch:{ all -> 0x0c69 }
            r0 = r26
            r7.A0F = r0     // Catch:{ all -> 0x0c61 }
            monitor-exit(r7)     // Catch:{ all -> 0x0c69 }
            r8.close()     // Catch:{ IOException -> 0x0c73 }
            goto L_0x0c74
        L_0x0c61:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0c69 }
            throw r0     // Catch:{ all -> 0x0c69 }
        L_0x0c64:
            r8.close()     // Catch:{ IOException -> 0x0c73 }
            r1 = r10
            goto L_0x0c74
        L_0x0c69:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0c6e }
            goto L_0x0c72
        L_0x0c6e:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ IOException -> 0x0c73 }
        L_0x0c72:
            throw r0     // Catch:{ IOException -> 0x0c73 }
        L_0x0c73:
            r1 = r10
        L_0x0c74:
            if (r13 == 0) goto L_0x0c7e
            r0 = r53
            int r8 = r0.A15     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r7 = 1
            if (r8 != r7) goto L_0x0c7e
            goto L_0x0c7f
        L_0x0c7e:
            r7 = 0
        L_0x0c7f:
            if (r1 == 0) goto L_0x0c9b
            java.util.List r0 = r12.A05     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0c87:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0c97
            java.lang.Object r0 = r8.next()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.8Ab r0 = (X.C160828Ab) r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0.C06(r1, r7)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0c87
        L_0x0c97:
            if (r7 == 0) goto L_0x0cbc
            goto L_0x0de8
        L_0x0c9b:
            if (r7 == 0) goto L_0x0cbc
            goto L_0x0dfb
        L_0x0c9f:
            r1 = 3
            r0 = r51
            if (r0 != r1) goto L_0x0cbc
            if (r11 == 0) goto L_0x0cbc
            int r1 = r11.length     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = 4
            if (r1 != r0) goto L_0x0cbc
            if (r13 == 0) goto L_0x0cbc
            r0 = r52
            java.lang.String r0 = r0.A0M     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            boolean r0 = X.AnonymousClass744.A05(r4, r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r0 == 0) goto L_0x0cbc
            boolean r0 = X.AnonymousClass744.A06(r4, r11)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0e0a
        L_0x0cbc:
            r8 = 8192(0x2000, float:1.14794E-41)
            r7 = 0
            r1 = r47
            r0 = r48
            int r9 = r1.read(r0, r7, r8)     // Catch:{ IOException -> 0x0e1f, all -> 0x0ee7 }
            r27 = r1
            goto L_0x09b3
        L_0x0ccb:
            r2 = r49
            r6.A08(r2)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r2 = r0
        L_0x0cd1:
            long r0 = r6.A06(r2)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x09a0
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0cf9
            long r0 = r6.A06(r2)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0cf9
        L_0x0ce7:
            r0 = 3
            r12.A02(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.String r0 = r33.A01()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r4.A04 = r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.String r0 = r32.A01()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r4.A03 = r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0e3c
        L_0x0cf9:
            r37 = 16
            int r2 = (r0 > r37 ? 1 : (r0 == r37 ? 0 : -1))
            if (r2 <= 0) goto L_0x0d02
            long r42 = r0 - r37
            goto L_0x0d04
        L_0x0d02:
            r42 = r0
        L_0x0d04:
            long r2 = r6.A01     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0d22
            int r3 = r6.A03(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0d0e:
            int r3 = r3 + 1
            int r2 = r6.A00     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            if (r3 >= r2) goto L_0x0d1f
            long r10 = X.AnonymousClass70M.A01(r6, r3)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r8 = 0
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0d1f
            goto L_0x0d0e
        L_0x0d1f:
            if (r3 == r2) goto L_0x0d22
            goto L_0x0d25
        L_0x0d22:
            r44 = -1
            goto L_0x0d29
        L_0x0d25:
            long r44 = r6.A05(r3)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0d29:
            java.net.HttpURLConnection r2 = r15.A01     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.net.URL r41 = r2.getURL()     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.AnonymousClass1EY.A02(r15)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r40 = r4
            X.AUZ r15 = X.AnonymousClass744.A00(r40, r41, r42, r44)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.181 r3 = r4.A07     // Catch:{ IOException -> 0x0e63, all -> 0x0ee7 }
            r2 = r52
            boolean r2 = r2.A0Z     // Catch:{ IOException -> 0x0e63, all -> 0x0ee7 }
            r7 = 0
            if (r2 == 0) goto L_0x0d42
            r7 = 4
        L_0x0d42:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0e63, all -> 0x0ee7 }
            r9 = 0
            X.9Hb r27 = X.C108955ca.A0N(r3, r15, r2, r9)     // Catch:{ IOException -> 0x0e63, all -> 0x0ee7 }
            int r2 = (r0 > r37 ? 1 : (r0 == r37 ? 0 : -1))
            if (r2 <= 0) goto L_0x0d72
            r8 = 16
            byte[] r7 = new byte[r8]     // Catch:{ IOException -> 0x0e61 }
            r3 = 0
        L_0x0d54:
            int r10 = r8 - r3
            r2 = r27
            int r10 = r2.read(r7, r3, r10)     // Catch:{ IOException -> 0x0e61 }
            r2 = -1
            if (r10 == r2) goto L_0x0e5a
            int r3 = r3 + r10
            if (r3 < r8) goto L_0x0d54
            long r2 = r0 - r37
            r14.seek(r2)     // Catch:{ IOException -> 0x0e61 }
            r14.write(r7, r9, r8)     // Catch:{ IOException -> 0x0e61 }
            java.io.FileDescriptor r2 = r14.getFD()     // Catch:{ IOException -> 0x0e61 }
            r2.sync()     // Catch:{ IOException -> 0x0e61 }
            goto L_0x0d75
        L_0x0d72:
            r14.seek(r0)     // Catch:{ IOException -> 0x0e61 }
        L_0x0d75:
            r2 = r0
            goto L_0x09a0
        L_0x0d78:
            r0 = move-exception
            goto L_0x0d7f
        L_0x0d7a:
            r3 = move-exception
            goto L_0x0d9f
        L_0x0d7c:
            r0 = move-exception
            r47 = r27
        L_0x0d7f:
            r4.A02 = r0     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.String r0 = "StreamMediaDownloadHandler/stream check failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6uk r0 = r4.A0F     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r1 = r26
            r0.A09(r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r27
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
            r2 = 21
            goto L_0x0fef
        L_0x0d9c:
            r3 = move-exception
            r47 = r27
        L_0x0d9f:
            X.1h6 r2 = r4.A0B     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r1 = r52
            int r1 = r1.A05     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            java.lang.Long r8 = X.C17890vO.A0N(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int[] r0 = r4.A0P     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r7 = r2
            r9 = r0
            r10 = r1
            r11 = r24
            r13 = r26
            r7.A02(r8, r9, r10, r11, r13)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r4.A02 = r3     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r27
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
            r2 = 7
            goto L_0x0fef
        L_0x0dc5:
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r27
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
            goto L_0x0e56
        L_0x0dd2:
            java.lang.String r0 = "error in getting request"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0e39 }
            throw r0     // Catch:{ all -> 0x0e39 }
        L_0x0dd9:
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r47
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
        L_0x0de4:
            r2 = 14
            goto L_0x0fef
        L_0x0de8:
            r0 = 3
            r12.A02(r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r47
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
            r2 = 23
            goto L_0x0fef
        L_0x0dfb:
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r47
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
        L_0x0e06:
            r2 = 24
            goto L_0x0fef
        L_0x0e0a:
            if (r0 == 0) goto L_0x0e17
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            X.AnonymousClass1EY.A02(r14)     // Catch:{ all -> 0x12c6 }
            goto L_0x0f7e
        L_0x0e17:
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            goto L_0x0fce
        L_0x0e1f:
            r3 = move-exception
            r1 = 0
            int r0 = X.C123856Wc.A00(r3)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6Sc r2 = new X.6Sc     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r2.<init>(r3, r1, r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0e3b
        L_0x0e2b:
            r1 = move-exception
            r47 = r0
            r3 = 0
            int r0 = X.C123856Wc.A00(r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            X.6Sc r2 = new X.6Sc     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r2.<init>(r1, r3, r0)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            goto L_0x0e3b
        L_0x0e39:
            r2 = move-exception
            monitor-exit(r10)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0e3b:
            throw r2     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
        L_0x0e3c:
            r32.close()     // Catch:{ all -> 0x0edf }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed6, 6Sc -> 0x0ecd, all -> 0x0ec4 }
            r0 = r27
            A00(r14, r0, r15)     // Catch:{ all -> 0x12c6 }
            java.lang.String r0 = "StreamMediaDownloadHandler/download complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12c6 }
            r0 = r53
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ all -> 0x12c6 }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x0f8b
        L_0x0e56:
            r2 = 13
            goto L_0x0fef
        L_0x0e5a:
            java.lang.String r0 = "attempting to read end of file"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x0e61 }
            throw r0     // Catch:{ IOException -> 0x0e61 }
        L_0x0e61:
            r2 = move-exception
            goto L_0x0e95
        L_0x0e63:
            r1 = move-exception
            r4.A02 = r1     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r0 = r39
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            int r2 = X.C123856Wc.A00(r1)     // Catch:{ IOException -> 0x0e8e, all -> 0x0ee7 }
            r32.close()     // Catch:{ all -> 0x0e89 }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0e84, 6Sc -> 0x0e7f, all -> 0x0e7a }
            X.AnonymousClass1EY.A02(r14)     // Catch:{ all -> 0x12c6 }
            goto L_0x0fe9
        L_0x0e7a:
            r2 = move-exception
            r27 = r14
            goto L_0x1101
        L_0x0e7f:
            r1 = move-exception
            r27 = r14
            goto L_0x0f75
        L_0x0e84:
            r0 = move-exception
            r27 = r14
            goto L_0x0fc3
        L_0x0e89:
            r1 = move-exception
            r27 = r14
            goto L_0x0f5b
        L_0x0e8e:
            r2 = move-exception
            goto L_0x0e93
        L_0x0e90:
            r2 = move-exception
            r47 = r27
        L_0x0e93:
            r27 = r47
        L_0x0e95:
            boolean r0 = X.AnonymousClass744.A04(r4, r6)     // Catch:{ all -> 0x0ee3 }
            if (r0 == 0) goto L_0x0ea3
            r32.close()     // Catch:{ all -> 0x0edb }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed2, 6Sc -> 0x0ec9, all -> 0x0ec0 }
            goto L_0x0f82
        L_0x0ea3:
            r4.A02 = r2     // Catch:{ all -> 0x0ee3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ee3 }
            java.lang.String r0 = "StreamMediaDownloadHandler/download failed with IOException; url="
            r1.append(r0)     // Catch:{ all -> 0x0ee3 }
            java.lang.String r0 = X.C137256vA.A01(r50)     // Catch:{ all -> 0x0ee3 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0ee3 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0ee3 }
        L_0x0eb9:
            r32.close()     // Catch:{ all -> 0x0edb }
            r33.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0ed2, 6Sc -> 0x0ec9, all -> 0x0ec0 }
            goto L_0x0efa
        L_0x0ec0:
            r2 = move-exception
            r47 = r27
            goto L_0x0ec5
        L_0x0ec4:
            r2 = move-exception
        L_0x0ec5:
            r27 = r14
            goto L_0x1101
        L_0x0ec9:
            r1 = move-exception
            r47 = r27
            goto L_0x0ece
        L_0x0ecd:
            r1 = move-exception
        L_0x0ece:
            r27 = r14
            goto L_0x0f75
        L_0x0ed2:
            r0 = move-exception
            r47 = r27
            goto L_0x0ed7
        L_0x0ed6:
            r0 = move-exception
        L_0x0ed7:
            r27 = r14
            goto L_0x0fc3
        L_0x0edb:
            r1 = move-exception
            r47 = r27
            goto L_0x0ee0
        L_0x0edf:
            r1 = move-exception
        L_0x0ee0:
            r27 = r14
            goto L_0x0f5b
        L_0x0ee3:
            r0 = move-exception
            r47 = r27
            goto L_0x0ee8
        L_0x0ee7:
            r0 = move-exception
        L_0x0ee8:
            r27 = r14
            goto L_0x0f4a
        L_0x0eeb:
            r0 = move-exception
            r4.A02 = r0     // Catch:{ all -> 0x0f02 }
            java.lang.String r0 = "StreamMediaDownloadHandler/failed to open outputstream"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0f02 }
            r32.close()     // Catch:{ all -> 0x0f2b }
            r33.close()     // Catch:{ IOException -> 0x0f26, NoSuchAlgorithmException -> 0x0f24, 6Sc -> 0x0f20, all -> 0x0f1b }
            goto L_0x0efd
        L_0x0efa:
            X.AnonymousClass1EY.A02(r14)     // Catch:{ all -> 0x12c6 }
        L_0x0efd:
            X.AnonymousClass1EY.A02(r27)     // Catch:{ all -> 0x12c6 }
            goto L_0x0fd4
        L_0x0f02:
            r0 = move-exception
            goto L_0x0f35
        L_0x0f04:
            java.lang.String r0 = "StreamMediaDownloadHandler/download failed due to insufficient space;"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 6S7 -> 0x0f0f }
            X.6S7 r0 = new X.6S7     // Catch:{ 6S7 -> 0x0f0f }
            r0.<init>()     // Catch:{ 6S7 -> 0x0f0f }
            throw r0     // Catch:{ 6S7 -> 0x0f0f }
        L_0x0f0f:
            r32.close()     // Catch:{ all -> 0x0f2b }
            r33.close()     // Catch:{ IOException -> 0x0f26, NoSuchAlgorithmException -> 0x0f24, 6Sc -> 0x0f20, all -> 0x0f1b }
            X.AnonymousClass1EY.A02(r15)     // Catch:{ all -> 0x12c6 }
            r2 = 4
            goto L_0x0fef
        L_0x0f1b:
            r2 = move-exception
            r47 = r27
            goto L_0x1101
        L_0x0f20:
            r1 = move-exception
            r47 = r27
            goto L_0x0f75
        L_0x0f24:
            r0 = move-exception
            goto L_0x0f27
        L_0x0f26:
            r0 = move-exception
        L_0x0f27:
            r47 = r27
            goto L_0x0fc3
        L_0x0f2b:
            r1 = move-exception
            r47 = r27
            goto L_0x0f5b
        L_0x0f2f:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0f32 }
            throw r0     // Catch:{ all -> 0x0f32 }
        L_0x0f32:
            r0 = move-exception
            goto L_0x0f35
        L_0x0f34:
            r0 = move-exception
        L_0x0f35:
            r47 = r27
            goto L_0x0f4a
        L_0x0f38:
            r0 = move-exception
            goto L_0x0f3f
        L_0x0f3a:
            r0 = move-exception
            goto L_0x0f3f
        L_0x0f3c:
            r0 = move-exception
            goto L_0x0f3f
        L_0x0f3e:
            r0 = move-exception
        L_0x0f3f:
            r15 = r27
            r47 = r15
            goto L_0x0f4a
        L_0x0f44:
            r0 = move-exception
            r15 = r27
            r6 = r15
            r47 = r15
        L_0x0f4a:
            r32.close()     // Catch:{ all -> 0x0f4e }
            goto L_0x0f52
        L_0x0f4e:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ all -> 0x0f53 }
        L_0x0f52:
            throw r0     // Catch:{ all -> 0x0f53 }
        L_0x0f53:
            r1 = move-exception
            goto L_0x0f5b
        L_0x0f55:
            r1 = move-exception
            r15 = r27
            r6 = r15
            r47 = r15
        L_0x0f5b:
            r33.close()     // Catch:{ all -> 0x0f5f }
            goto L_0x0f63
        L_0x0f5f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0f66, 6Sc -> 0x0f64 }
        L_0x0f63:
            throw r1     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0f66, 6Sc -> 0x0f64 }
        L_0x0f64:
            r1 = move-exception
            goto L_0x0f75
        L_0x0f66:
            r0 = move-exception
            goto L_0x0fc3
        L_0x0f68:
            r2 = move-exception
            r15 = r27
            r47 = r15
            goto L_0x1101
        L_0x0f6f:
            r1 = move-exception
            r15 = r27
            r6 = r15
            r47 = r15
        L_0x0f75:
            boolean r0 = X.AnonymousClass744.A04(r4, r6)     // Catch:{ all -> 0x0fd8 }
            if (r0 == 0) goto L_0x0f8d
            X.AnonymousClass1EY.A02(r27)     // Catch:{ all -> 0x12c6 }
        L_0x0f7e:
            X.AnonymousClass1EY.A02(r47)     // Catch:{ all -> 0x12c6 }
            goto L_0x0f88
        L_0x0f82:
            X.AnonymousClass1EY.A02(r14)     // Catch:{ all -> 0x12c6 }
            X.AnonymousClass1EY.A02(r27)     // Catch:{ all -> 0x12c6 }
        L_0x0f88:
            X.AnonymousClass1EY.A02(r15)     // Catch:{ all -> 0x12c6 }
        L_0x0f8b:
            r2 = 0
            goto L_0x0fef
        L_0x0f8d:
            r4.A02 = r1     // Catch:{ all -> 0x0fd8 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fd8 }
            java.lang.String r0 = "StreamMediaDownloadHandler/connection error: "
            r2.append(r0)     // Catch:{ all -> 0x0fd8 }
            r2.append(r1)     // Catch:{ all -> 0x0fd8 }
            java.lang.String r0 = "; mediaHash="
            r2.append(r0)     // Catch:{ all -> 0x0fd8 }
            r0 = r52
            java.lang.String r0 = r0.A0H     // Catch:{ all -> 0x0fd8 }
            r2.append(r0)     // Catch:{ all -> 0x0fd8 }
            java.lang.String r0 = "; url="
            r2.append(r0)     // Catch:{ all -> 0x0fd8 }
            java.net.URL r0 = r4.A0N     // Catch:{ all -> 0x0fd8 }
            java.lang.String r0 = X.C137256vA.A01(r0)     // Catch:{ all -> 0x0fd8 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x0fd8 }
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0fd8 }
            int r2 = r1.downloadStatus     // Catch:{ all -> 0x0fd8 }
            goto L_0x0fe6
        L_0x0fbc:
            r0 = move-exception
            goto L_0x0fbf
        L_0x0fbe:
            r0 = move-exception
        L_0x0fbf:
            r15 = r27
            r47 = r15
        L_0x0fc3:
            r4.A02 = r0     // Catch:{ all -> 0x0fd8 }
            java.lang.String r0 = "StreamMediaDownloadHandler/failed to create decrypter"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0fd8 }
            X.AnonymousClass1EY.A02(r27)     // Catch:{ all -> 0x12c6 }
            goto L_0x0fd1
        L_0x0fce:
            X.AnonymousClass1EY.A02(r14)     // Catch:{ all -> 0x12c6 }
        L_0x0fd1:
            X.AnonymousClass1EY.A02(r47)     // Catch:{ all -> 0x12c6 }
        L_0x0fd4:
            X.AnonymousClass1EY.A02(r15)     // Catch:{ all -> 0x12c6 }
            goto L_0x0fe3
        L_0x0fd8:
            r2 = move-exception
            goto L_0x1101
        L_0x0fdb:
            r1 = move-exception
            r4.A02 = r1     // Catch:{ all -> 0x12c6 }
            java.lang.String r0 = "StreamMediaDownloadHandler/unable to create output file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x12c6 }
        L_0x0fe3:
            r2 = 9
            goto L_0x0fef
        L_0x0fe6:
            X.AnonymousClass1EY.A02(r27)     // Catch:{ all -> 0x12c6 }
        L_0x0fe9:
            X.AnonymousClass1EY.A02(r47)     // Catch:{ all -> 0x12c6 }
            X.AnonymousClass1EY.A02(r15)     // Catch:{ all -> 0x12c6 }
        L_0x0fef:
            java.lang.Exception r1 = r4.A02     // Catch:{ all -> 0x12c6 }
            r0 = r65
            r0.A0C(r1)     // Catch:{ all -> 0x12c6 }
            X.6gE r0 = r4.A00     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x1000
            java.lang.Boolean r1 = r0.A00     // Catch:{ all -> 0x12c6 }
            r0 = r65
            r0.A0I = r1     // Catch:{ all -> 0x12c6 }
        L_0x1000:
            r5.A0F()     // Catch:{ all -> 0x12c6 }
            r0 = r64
            long r0 = r0.A0A     // Catch:{ all -> 0x12c6 }
            r3 = r65
            r3.A09 = r0     // Catch:{ all -> 0x12c6 }
            r0 = r64
            java.lang.Long r1 = r0.A0D     // Catch:{ all -> 0x12c6 }
            r3.A0W = r1     // Catch:{ all -> 0x12c6 }
            r0 = r64
            java.lang.String r1 = r0.A0E     // Catch:{ all -> 0x12c6 }
            r3.A0c = r1     // Catch:{ all -> 0x12c6 }
            r3 = 7
            r0 = 34
            if (r2 == 0) goto L_0x1061
            if (r2 == r0) goto L_0x1061
            java.lang.String r1 = X.A7N.A01(r59)     // Catch:{ all -> 0x12c6 }
            r0 = r65
            r0.A0d = r1     // Catch:{ all -> 0x12c6 }
            if (r2 == r3) goto L_0x102c
            r0 = 32
            if (r2 != r0) goto L_0x102f
        L_0x102c:
            r18.A07()     // Catch:{ all -> 0x12c6 }
        L_0x102f:
            monitor-enter(r18)     // Catch:{ all -> 0x12c6 }
            r0 = r18
            boolean r0 = r0.A0F     // Catch:{ all -> 0x10ec }
            monitor-exit(r18)     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x1059
            r3 = 4169(0x1049, float:5.842E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x12c6 }
            r0 = r62
            boolean r0 = X.C18020vd.A05(r1, r0, r3)     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x1059
            boolean r0 = r35.delete()     // Catch:{ all -> 0x12c6 }
            if (r0 != 0) goto L_0x104e
            java.lang.String r0 = "MediaDownloadUtils/deleteTempFilesDueToPartialDownload failed to delete encrypted file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x12c6 }
        L_0x104e:
            boolean r0 = r34.delete()     // Catch:{ all -> 0x12c6 }
            if (r0 != 0) goto L_0x1059
            java.lang.String r0 = "MediaDownloadUtils/deleteTempFilesDueToPartialDownload failed delete decryptedFile file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x12c6 }
        L_0x1059:
            r0 = r26
            X.73o r12 = X.C1409173o.A00(r2, r0)     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x1061:
            r2 = 0
            monitor-enter(r18)     // Catch:{ all -> 0x12c6 }
            r0 = r18
            boolean r0 = r0.A0G     // Catch:{ all -> 0x10ec }
            monitor-exit(r18)     // Catch:{ all -> 0x12c6 }
            if (r0 == 0) goto L_0x1088
            r0 = r69
            java.lang.String r0 = r0.A0J     // Catch:{ all -> 0x12c6 }
            java.lang.String r8 = X.AnonymousClass74L.A07(r0)     // Catch:{ all -> 0x12c6 }
            r9 = 0
            X.73o r12 = new X.73o     // Catch:{ all -> 0x12c6 }
            r6 = r12
            r7 = r2
            r10 = r26
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x12c6 }
            r2 = r63
            r1 = r35
            r0 = r34
            X.AnonymousClass74L.A0C(r2, r12, r1, r0)     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x1088:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x12c6 }
            r6 = r65
            r6.A0D = r0     // Catch:{ all -> 0x12c6 }
            r1 = 3
            r6.A03 = r1     // Catch:{ all -> 0x12c6 }
            java.lang.String r8 = r4.A04     // Catch:{ all -> 0x10e7 }
            X.6gE r7 = r4.A00     // Catch:{ all -> 0x10e7 }
            r6 = r34
            r1 = r59
            r0 = r69
            int r1 = X.AnonymousClass74L.A00(r7, r0, r6, r8, r1)     // Catch:{ all -> 0x10e7 }
            if (r1 == 0) goto L_0x10b4
            X.73o r12 = new X.73o     // Catch:{ all -> 0x10e7 }
            r0 = r26
            r12.<init>(r1, r2, r0)     // Catch:{ all -> 0x10e7 }
        L_0x10aa:
            r2 = r63
            r1 = r35
            r0 = r34
            X.AnonymousClass74L.A0C(r2, r12, r1, r0)     // Catch:{ all -> 0x10e7 }
            goto L_0x10e2
        L_0x10b4:
            java.lang.String r4 = r4.A03     // Catch:{ all -> 0x10e7 }
            r1 = r59
            int r1 = X.AnonymousClass74L.A01(r0, r4, r1)     // Catch:{ all -> 0x10e7 }
            if (r1 == 0) goto L_0x10d0
            r0 = r26
            if (r1 == r0) goto L_0x10c8
            X.73o r12 = new X.73o     // Catch:{ all -> 0x10e7 }
            r12.<init>(r3, r2, r0)     // Catch:{ all -> 0x10e7 }
            goto L_0x10aa
        L_0x10c8:
            r1 = 31
            X.73o r12 = new X.73o     // Catch:{ all -> 0x10e7 }
            r12.<init>(r1, r2, r0)     // Catch:{ all -> 0x10e7 }
            goto L_0x10aa
        L_0x10d0:
            java.lang.String r0 = r0.A0J     // Catch:{ all -> 0x10e7 }
            java.lang.String r8 = X.AnonymousClass74L.A07(r0)     // Catch:{ all -> 0x10e7 }
            r9 = 0
            X.73o r12 = new X.73o     // Catch:{ all -> 0x10e7 }
            r6 = r12
            r7 = r2
            r10 = r26
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x10e7 }
            goto L_0x10aa
        L_0x10e2:
            r65.A09()     // Catch:{ all -> 0x12c6 }
            goto L_0x11a7
        L_0x10e7:
            r2 = move-exception
            r65.A09()     // Catch:{ all -> 0x12c6 }
            goto L_0x1108
        L_0x10ec:
            r2 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x12c6 }
            goto L_0x1108
        L_0x10ef:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12c6 }
            java.lang.String r0 = "MediaDownload/MMS download failed due to message allowed into download encrypted without sufficient information to compute a download file; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x12c6 }
            java.lang.String r0 = X.C123836Wa.A00(r66)     // Catch:{ all -> 0x12c6 }
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x12c6 }
            goto L_0x1108
        L_0x1101:
            r1 = r47
            r0 = r27
            A00(r0, r1, r15)     // Catch:{ all -> 0x12c6 }
        L_0x1108:
            throw r2     // Catch:{ all -> 0x12c6 }
        L_0x1109:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x12c6 }
            throw r0     // Catch:{ all -> 0x12c6 }
        L_0x110c:
            X.6ug r14 = r5.A0r     // Catch:{ all -> 0x12c6 }
            r10 = 0
            X.7Ml r2 = new X.7Ml     // Catch:{ all -> 0x12c6 }
            r2.<init>(r5, r10)     // Catch:{ all -> 0x12c6 }
            java.util.List r1 = r14.A05     // Catch:{ all -> 0x12c6 }
            r1.add(r2)     // Catch:{ all -> 0x12c6 }
            X.0ve r1 = r5.A0Q     // Catch:{ all -> 0x12c6 }
            r21 = r1
            X.190 r1 = r5.A0A     // Catch:{ all -> 0x12c6 }
            r20 = r1
            X.17r r1 = r5.A0B     // Catch:{ all -> 0x12c6 }
            r19 = r1
            X.11Z r1 = r5.A0N     // Catch:{ all -> 0x12c6 }
            r17 = r1
            X.1Kg r1 = r5.A0n     // Catch:{ all -> 0x12c6 }
            r16 = r1
            X.2r8 r15 = r5.A0s     // Catch:{ all -> 0x12c6 }
            X.6xt r13 = r5.A0q     // Catch:{ all -> 0x12c6 }
            X.1h6 r11 = r5.A0V     // Catch:{ all -> 0x12c6 }
            X.73l r9 = r5.A0u     // Catch:{ all -> 0x12c6 }
            com.whatsapp.media.WamediaManager r8 = r5.A0W     // Catch:{ all -> 0x12c6 }
            X.19K r7 = r5.A0w     // Catch:{ all -> 0x12c6 }
            X.1Sj r6 = r5.A0c     // Catch:{ all -> 0x12c6 }
            X.1KX r4 = r5.A0T     // Catch:{ all -> 0x12c6 }
            X.1Kb r3 = r5.A0S     // Catch:{ all -> 0x12c6 }
            X.181 r2 = r5.A0D     // Catch:{ all -> 0x12c6 }
            X.2h4 r1 = r5.A01     // Catch:{ all -> 0x12c6 }
            X.71q r31 = new X.71q     // Catch:{ all -> 0x12c6 }
            r32 = r20
            r33 = r19
            r34 = r2
            r35 = r17
            r36 = r21
            r37 = r3
            r38 = r4
            r39 = r11
            r40 = r8
            r41 = r1
            r42 = r6
            r43 = r5
            r44 = r18
            r45 = r69
            r46 = r65
            r47 = r16
            r48 = r13
            r49 = r14
            r50 = r15
            r51 = r9
            r52 = r12
            r53 = r7
            r54 = r59
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x12c6 }
            boolean r16 = r5.A0I()     // Catch:{ all -> 0x12c6 }
            X.2k8 r1 = X.C115295ti.A01(r5)     // Catch:{ all -> 0x12c6 }
            java.lang.String r14 = r1.A00()     // Catch:{ all -> 0x12c6 }
            r11 = r31
            r12 = r0
            r13 = r22
            r15 = r59
            X.73o r12 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x12c6 }
            if (r16 == 0) goto L_0x11a7
            r5.A0G()     // Catch:{ all -> 0x12c6 }
            boolean r1 = r5.A0I()     // Catch:{ all -> 0x12c6 }
            if (r1 != 0) goto L_0x11a7
            X.2k8 r1 = X.C115295ti.A01(r5)     // Catch:{ all -> 0x12c6 }
            java.lang.String r14 = r1.A00()     // Catch:{ all -> 0x12c6 }
            r12 = r0
            r16 = r10
            X.73o r12 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x12c6 }
        L_0x11a7:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r0 = r5.A02
            long r3 = r0.length()
            long r3 = r3 - r28
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r15 = X.AnonymousClass000.A1R(r0)
            int r3 = r12.A01
            r0 = 20
            if (r3 != r0) goto L_0x11e4
            X.1Kg r3 = r5.A0n
            r0 = r69
            java.lang.String r2 = r0.A0G
            java.lang.String r1 = r0.A0F
            int r0 = r5.A15
            r7 = 1
            if (r0 != 0) goto L_0x11ce
            r7 = 2
        L_0x11ce:
            X.9kM r0 = r5.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r8 = r0.get()
            r4 = r68
            r5 = r2
            r6 = r1
            X.37z r0 = r3.A0C(r4, r5, r6, r7, r8)
            X.A88 r11 = new X.A88
            r11.<init>(r0, r15)
            return r11
        L_0x11e4:
            r0 = 6
            if (r3 == r0) goto L_0x1265
            r0 = 7
            if (r3 == r0) goto L_0x1265
            r0 = 32
            if (r3 == r0) goto L_0x1265
            r0 = 5
            if (r3 != r0) goto L_0x1228
            r0 = r69
            boolean r0 = r0.A0U
            if (r0 != 0) goto L_0x124a
            X.C123836Wa.A00(r66)
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            r0 = r67
            r0.A04(r1)
            java.util.concurrent.CountDownLatch r3 = r5.A0y     // Catch:{ InterruptedException -> 0x1217 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x1217 }
            r0 = 12
            boolean r0 = r3.await(r0, r2)     // Catch:{ InterruptedException -> 0x1217 }
            if (r0 == 0) goto L_0x121e
            X.C123836Wa.A00(r66)
            X.A88 r11 = X.A88.A00(r12)
            return r11
        L_0x1217:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x121e:
            java.lang.String r0 = "MediaDownload/all/reupload failed, will not retry; media too old"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A88 r11 = X.A88.A01(r12)
            return r11
        L_0x1228:
            r0 = 22
            if (r3 != r0) goto L_0x124a
            r0 = r65
            java.lang.Exception r1 = r0.A0M
            boolean r0 = r1 instanceof X.C122836Sc
            if (r0 == 0) goto L_0x1237
            r1.getCause()
        L_0x1237:
            r14 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaDownload/failed/cronet_error, should retry "
            X.C17900vP.A0n(r0, r1, r14)
            r13 = -1
            X.A88 r11 = new X.A88
            r16 = r14
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x124a:
            boolean r0 = r12.A03()
            if (r0 != 0) goto L_0x1260
            r0 = 14
            if (r3 == r0) goto L_0x1260
            boolean r16 = X.C1409173o.A02(r3)
            r14 = 0
            r13 = -1
            X.A88 r11 = new X.A88
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x1260:
            X.A88 r11 = X.A88.A02(r12)
            return r11
        L_0x1265:
            r0 = r65
            r0.A09 = r1
            java.io.File r0 = r5.A02
            if (r0 == 0) goto L_0x1293
            X.0ve r2 = r5.A0Q
            r1 = 6039(0x1797, float:8.462E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x1293
            java.io.File r2 = r5.A02
            monitor-enter(r2)
            X.17r r1 = r5.A0B     // Catch:{ all -> 0x1290 }
            java.io.File r0 = r5.A02     // Catch:{ all -> 0x1290 }
            boolean r0 = X.C115295ti.A08(r1, r0)     // Catch:{ all -> 0x1290 }
            if (r0 != 0) goto L_0x128e
            X.C123836Wa.A00(r66)     // Catch:{ all -> 0x1290 }
            java.io.File r0 = r5.A02     // Catch:{ all -> 0x1290 }
            r0.getAbsolutePath()     // Catch:{ all -> 0x1290 }
        L_0x128e:
            monitor-exit(r2)     // Catch:{ all -> 0x1290 }
            goto L_0x12a5
        L_0x1290:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x1290 }
            throw r0
        L_0x1293:
            X.17r r1 = r5.A0B
            java.io.File r0 = r5.A02
            boolean r0 = X.C115295ti.A08(r1, r0)
            if (r0 != 0) goto L_0x12a5
            X.C123836Wa.A00(r66)
            java.io.File r0 = r5.A02
            r0.getAbsolutePath()
        L_0x12a5:
            r0 = r69
            byte[] r0 = r0.A0e
            if (r0 == 0) goto L_0x12c1
            if (r30 == 0) goto L_0x12c1
            boolean r0 = r30.delete()
            if (r0 != 0) goto L_0x12c1
            X.C123836Wa.A00(r66)
            boolean r0 = r69.A02()
            if (r0 == 0) goto L_0x12c1
            X.6ug r0 = r5.A0r
            r0.A01()
        L_0x12c1:
            X.A88 r11 = X.A88.A00(r12)
            return r11
        L_0x12c6:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x12cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x12d0:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144757Io.CGA(X.9nA):X.A88");
    }

    public static void A00(Closeable closeable, Closeable closeable2, Closeable closeable3) {
        AnonymousClass1EY.A02(closeable);
        AnonymousClass1EY.A02(closeable2);
        AnonymousClass1EY.A02(closeable3);
    }
}
