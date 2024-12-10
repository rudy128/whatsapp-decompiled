package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bgf  reason: case insensitive filesystem */
public final class C23414Bgf extends C22604BFk implements E5R, EBw {
    public final Context A00;
    public final CWD A01;
    public final C25583CiN A02;
    public final Map A03;

    public final synchronized void CTc() {
        Map map = this.A03;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            this.A01.A00(new C23428Bgt((C23134Bbn) A16.getValue(), ((CYI) A16.getKey()).A00));
        }
        map.clear();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.Bbn, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean A00(android.os.Parcel r21, int r22) {
        /*
            r20 = this;
            r4 = r20
            r0 = 2
            r2 = r21
            r1 = r22
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 == r0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            android.os.Parcelable$Creator r0 = X.C23185Bcf.CREATOR
            android.os.Parcelable r6 = X.BEA.A0M(r2, r0)
            X.Bcf r6 = (X.C23185Bcf) r6
            X.C25909CoN.A00(r2)
            monitor-enter(r4)
            goto L_0x01ab
        L_0x001c:
            android.os.Parcelable$Creator r0 = X.C23188Bci.CREATOR
            android.os.Parcelable r3 = X.BEA.A0M(r2, r0)
            X.Bci r3 = (X.C23188Bci) r3
            X.C25909CoN.A00(r2)
            monitor-enter(r4)
            android.content.Context r12 = r4.A00     // Catch:{ all -> 0x022e }
            X.Bbw r2 = r3.A00     // Catch:{ all -> 0x022e }
            java.lang.String r11 = "Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s."
            long r0 = r2.A01     // Catch:{ all -> 0x022e }
            int r7 = r2.A00     // Catch:{ all -> 0x022e }
            r10 = 1
            if (r7 == r10) goto L_0x0144
            r13 = 0
            r9 = 0
            r8 = 2
            java.lang.String r6 = "NearbyConnections"
            if (r7 == r8) goto L_0x006d
            r5 = 3
            if (r7 == r5) goto L_0x004f
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x022e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x022e }
            X.BE8.A1A(r0, r3, r9, r7, r10)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = "Incoming ParcelablePayload %d has unknown type %d"
            X.BE7.A1M(r0, r6, r3)     // Catch:{ all -> 0x022e }
            goto L_0x012d
        L_0x004f:
            android.os.ParcelFileDescriptor r6 = r2.A06     // Catch:{ all -> 0x022e }
            java.lang.String r5 = "Data ParcelFileDescriptor cannot be null for type STREAM"
            if (r6 == 0) goto L_0x0067
            X.CNv r5 = new X.CNv     // Catch:{ all -> 0x022e }
            r5.<init>(r6)     // Catch:{ all -> 0x022e }
            r16 = 3
            X.CpR r12 = new X.CpR     // Catch:{ all -> 0x022e }
            r14 = r5
            r15 = r13
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x022e }
            goto L_0x0178
        L_0x0067:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r5)     // Catch:{ all -> 0x022e }
            goto L_0x022d
        L_0x006d:
            java.lang.String r5 = r2.A09     // Catch:{ all -> 0x022e }
            android.net.Uri r7 = r2.A05     // Catch:{ all -> 0x022e }
            if (r5 == 0) goto L_0x0141
            if (r7 == 0) goto L_0x0195
            android.content.ContentResolver r13 = r12.getContentResolver()     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r16 = r13.openFileDescriptor(r7, r12)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r16 != 0) goto L_0x008c
            java.lang.String r1 = "Failed to get ParcelFileDescriptor for %s"
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            r0[r9] = r7     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            X.BE7.A1M(r1, r6, r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            goto L_0x012d
        L_0x008c:
            java.io.File r17 = X.C108945cZ.A17(r5)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            long r12 = r2.A02     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            X.CRa r14 = new X.CRa     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            r15 = r7
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            X.CpR r12 = X.C25959CpR.A00(r14, r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            java.lang.String r0 = r2.A0B     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r0 != 0) goto L_0x00ce
            java.lang.String r15 = r2.A0B     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r15 == 0) goto L_0x011a
            boolean r0 = r15.isEmpty()     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r0 != 0) goto L_0x011a
            X.Bgy r14 = X.C25959CpR.A0C     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            int r13 = r14.size()     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            r1 = 0
        L_0x00b7:
            if (r1 >= r13) goto L_0x00cc
            java.lang.String r0 = X.C17880vN.A0w(r14, r1)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            boolean r0 = r15.contains(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            int r1 = r1 + 1
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "Folder name contains illegal string."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            goto L_0x0120
        L_0x00cc:
            r12.A02 = r15     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
        L_0x00ce:
            java.lang.String r0 = r2.A0A     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r0 != 0) goto L_0x0178
            java.lang.String r14 = r2.A0A     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r14 == 0) goto L_0x0113
            boolean r0 = r14.isEmpty()     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            if (r0 != 0) goto L_0x0113
            X.Bgy r15 = X.C25959CpR.A08     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            int r1 = r15.size()     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            r0 = 0
        L_0x00e7:
            if (r0 >= r1) goto L_0x0110
            java.lang.String r13 = X.C17880vN.A0w(r15, r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            boolean r16 = r14.contains(r13)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            int r0 = r0 + 1
            if (r16 == 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            java.lang.String r0 = "File name "
            r1.append(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            r1.append(r14)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            java.lang.String r0 = " contains illegal string "
            r1.append(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            r1.append(r13)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            java.lang.String r0 = "."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            goto L_0x0120
        L_0x0110:
            r12.A01 = r14     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            goto L_0x0178
        L_0x0113:
            java.lang.String r0 = "Payload file name should not be null or empty."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
            goto L_0x0120
        L_0x011a:
            java.lang.String r0 = "Payload parent folder should not be null or empty."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
        L_0x0120:
            throw r0     // Catch:{ FileNotFoundException | SecurityException -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            java.lang.Object[] r0 = X.C108945cZ.A1a(r7, r5, r8, r10)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = java.lang.String.format(r11, r0)     // Catch:{ all -> 0x022e }
            android.util.Log.w(r6, r0, r1)     // Catch:{ all -> 0x022e }
        L_0x012d:
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x022e }
            long r0 = r2.A01     // Catch:{ all -> 0x022e }
            X.AnonymousClass3MX.A1S(r3, r9, r0)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = "Failed to convert incoming ParcelablePayload %d to Payload."
            java.lang.String r1 = java.lang.String.format(r0, r3)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = "NearbyConnectionsClient"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x022e }
            goto L_0x021e
        L_0x0141:
            if (r7 == 0) goto L_0x0195
            goto L_0x015e
        L_0x0144:
            X.Bcb r5 = r2.A08     // Catch:{ all -> 0x022e }
            if (r5 == 0) goto L_0x015b
            byte[] r6 = r5.A01     // Catch:{ all -> 0x022e }
        L_0x014a:
            java.lang.String r5 = "Payload bytes cannot be null if type is BYTES."
            if (r6 == 0) goto L_0x0226
            r13 = 0
            X.CpR r12 = new X.CpR     // Catch:{ all -> 0x022e }
            r14 = r13
            r15 = r6
            r16 = r10
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x022e }
            goto L_0x0178
        L_0x015b:
            byte[] r6 = r2.A0D     // Catch:{ all -> 0x022e }
            goto L_0x014a
        L_0x015e:
            android.os.ParcelFileDescriptor r5 = r2.A06     // Catch:{ all -> 0x022e }
            if (r5 != 0) goto L_0x0195
            java.lang.String r5 = "Created file payload based on uri instead pfd"
            android.util.Log.d(r6, r5)     // Catch:{ all -> 0x022e }
            long r5 = r2.A04     // Catch:{ all -> 0x022e }
            X.Bgy r8 = X.C25959CpR.A08     // Catch:{ all -> 0x022e }
            X.CRa r8 = new X.CRa     // Catch:{ all -> 0x022e }
            r11 = r13
            r9 = r7
            r10 = r13
            r12 = r5
            r8.<init>(r9, r10, r11, r12)     // Catch:{ all -> 0x022e }
            X.CpR r12 = X.C25959CpR.A00(r8, r0)     // Catch:{ all -> 0x022e }
        L_0x0178:
            java.util.Map r6 = r4.A03     // Catch:{ all -> 0x022e }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x022e }
            long r1 = r2.A01     // Catch:{ all -> 0x022e }
            X.CYI r5 = new X.CYI     // Catch:{ all -> 0x022e }
            r5.<init>(r0, r1)     // Catch:{ all -> 0x022e }
            X.Bbn r0 = new X.Bbn     // Catch:{ all -> 0x022e }
            r0.<init>()     // Catch:{ all -> 0x022e }
            r0.A01 = r1     // Catch:{ all -> 0x022e }
            r6.put(r5, r0)     // Catch:{ all -> 0x022e }
            X.CWD r1 = r4.A01     // Catch:{ all -> 0x022e }
            X.5qK r0 = new X.5qK     // Catch:{ all -> 0x022e }
            r0.<init>(r3, r12)     // Catch:{ all -> 0x022e }
            goto L_0x01c7
        L_0x0195:
            android.os.ParcelFileDescriptor r7 = r2.A06     // Catch:{ all -> 0x022e }
            java.lang.String r5 = "Data ParcelFileDescriptor cannot be null for type FILE"
            if (r7 == 0) goto L_0x0221
            long r9 = r7.getStatSize()     // Catch:{ all -> 0x022e }
            X.CRa r5 = new X.CRa     // Catch:{ all -> 0x022e }
            r6 = r13
            r8 = r13
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x022e }
            X.CpR r12 = X.C25959CpR.A00(r5, r0)     // Catch:{ all -> 0x022e }
            goto L_0x0178
        L_0x01ab:
            X.Bbn r7 = r6.A00     // Catch:{ all -> 0x022e }
            int r1 = r7.A00     // Catch:{ all -> 0x022e }
            r0 = 3
            if (r1 != r0) goto L_0x01cb
            java.util.Map r5 = r4.A03     // Catch:{ all -> 0x022e }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x022e }
            long r1 = r7.A01     // Catch:{ all -> 0x022e }
            X.CYI r0 = new X.CYI     // Catch:{ all -> 0x022e }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x022e }
            r5.put(r0, r7)     // Catch:{ all -> 0x022e }
        L_0x01c0:
            X.CWD r1 = r4.A01     // Catch:{ all -> 0x022e }
            X.Bgr r0 = new X.Bgr     // Catch:{ all -> 0x022e }
            r0.<init>(r6)     // Catch:{ all -> 0x022e }
        L_0x01c7:
            r1.A00(r0)     // Catch:{ all -> 0x022e }
            goto L_0x021e
        L_0x01cb:
            java.util.Map r5 = r4.A03     // Catch:{ all -> 0x022e }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x022e }
            long r1 = r7.A01     // Catch:{ all -> 0x022e }
            X.CYI r0 = new X.CYI     // Catch:{ all -> 0x022e }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x022e }
            r5.remove(r0)     // Catch:{ all -> 0x022e }
            X.CiN r5 = r4.A02     // Catch:{ all -> 0x022e }
            if (r5 == 0) goto L_0x01c0
            long r2 = r7.A01     // Catch:{ all -> 0x022e }
            monitor-enter(r5)     // Catch:{ all -> 0x022e }
            X.00O r1 = r5.A00     // Catch:{ all -> 0x022b }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x022b }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x022b }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x01f1
            r0.close()     // Catch:{ IOException -> 0x01f1 }
        L_0x01f1:
            r1.remove(r2)     // Catch:{ all -> 0x022b }
            X.00O r1 = r5.A01     // Catch:{ all -> 0x022b }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x022b }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x0201
            r0.close()     // Catch:{ IOException -> 0x0201 }
        L_0x0201:
            r1.remove(r2)     // Catch:{ all -> 0x022b }
            X.00O r0 = r5.A02     // Catch:{ all -> 0x022b }
            java.lang.Object r1 = r0.remove(r2)     // Catch:{ all -> 0x022b }
            X.Bbw r1 = (X.C23143Bbw) r1     // Catch:{ all -> 0x022b }
            if (r1 == 0) goto L_0x021c
            android.os.ParcelFileDescriptor r0 = r1.A06     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x0215
            r0.close()     // Catch:{ IOException -> 0x0215 }
        L_0x0215:
            android.os.ParcelFileDescriptor r0 = r1.A07     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x021c
            r0.close()     // Catch:{ IOException -> 0x021c }
        L_0x021c:
            monitor-exit(r5)     // Catch:{ all -> 0x022e }
            goto L_0x01c0
        L_0x021e:
            monitor-exit(r4)
            r0 = 1
            return r0
        L_0x0221:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r5)     // Catch:{ all -> 0x022e }
            goto L_0x022d
        L_0x0226:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r5)     // Catch:{ all -> 0x022e }
            goto L_0x022d
        L_0x022b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x022e }
        L_0x022d:
            throw r0     // Catch:{ all -> 0x022e }
        L_0x022e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23414Bgf.A00(android.os.Parcel, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    public C23414Bgf(Context context, CWD cwd, C25583CiN ciN) {
        this();
        this.A03 = new AnonymousClass00O(0);
        C18210vx.A00(context);
        this.A00 = context;
        C18210vx.A00(cwd);
        this.A01 = cwd;
        this.A02 = ciN;
    }

    public C23414Bgf() {
        attachInterface(this, "com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }
}
