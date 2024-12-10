package X;

import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C26081Qt {
    public static int A06 = 200;
    public final C002100z A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1DL A02;
    public final C22611Cn A03;
    public final AnonymousClass1Cd A04;
    public final C26071Qs A05;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C56852i8 A01(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r6 instanceof X.AnonymousClass2De
            if (r0 == 0) goto L_0x0011
            X.2i8 r0 = r6.A02(r7)
            if (r0 != 0) goto L_0x0010
            X.2i8 r0 = new X.2i8
            r0.<init>()
        L_0x0010:
            return r0
        L_0x0011:
            boolean r0 = r6 instanceof X.C26091Qu
            if (r0 == 0) goto L_0x002a
            r4 = r6
            X.1Qu r4 = (X.C26091Qu) r4
            X.2i8 r3 = r4.A02(r7)
            if (r3 != 0) goto L_0x0068
            long r1 = r7.A0x
            X.205 r0 = r7.A0v
            X.2i8 r3 = X.C26091Qu.A00(r4, r0, r1)
            long r0 = r7.A0x
            monitor-enter(r5)
            goto L_0x0050
        L_0x002a:
            r2 = r6
            X.1Qv r2 = (X.C26101Qv) r2
            boolean r0 = r7 instanceof X.AnonymousClass212
            X.C17960vV.A0C(r0)
            X.2i8 r3 = r2.A02(r7)
            if (r3 != 0) goto L_0x0068
            X.205 r0 = r7.A0v
            X.2i8 r3 = X.C26101Qv.A00(r2, r0)
            long r0 = r7.A0x
            monitor-enter(r5)
            X.00z r2 = r2.A00     // Catch:{ all -> 0x0065 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r2.A04(r1)     // Catch:{ all -> 0x0065 }
            X.2i8 r0 = (X.C56852i8) r0     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0063
            goto L_0x005e
        L_0x0050:
            X.00z r2 = r4.A00     // Catch:{ all -> 0x0065 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r2.A04(r1)     // Catch:{ all -> 0x0065 }
            X.2i8 r0 = (X.C56852i8) r0     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0063
        L_0x005e:
            r2.A08(r1, r3)     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return r3
        L_0x0063:
            monitor-exit(r5)
            return r0
        L_0x0065:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0068:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26081Qt.A01(X.206):X.2i8");
    }

    public C56852i8 A02(AnonymousClass206 r4) {
        Object A042;
        if (this instanceof AnonymousClass2De) {
            C002100z r1 = ((AnonymousClass2De) this).A00;
            AnonymousClass205 r0 = r4.A0v;
            C18070vi.A0W(r0);
            A042 = r1.A04(r0);
        } else {
            A042 = this.A00.A04(Long.valueOf(r4.A0x));
        }
        return (C56852i8) A042;
    }

    public String A03() {
        if (this instanceof AnonymousClass2De) {
            return "TransientMessageReceiptDeviceStore";
        }
        if (this instanceof C26091Qu) {
            return "MessageReceiptDeviceStore/";
        }
        return "MessageAddOnReceiptDeviceStore/";
    }

    public String A04(int i) {
        if (this instanceof AnonymousClass2De) {
            return "";
        }
        if (this instanceof C26091Qu) {
            boolean z = false;
            if (i > 0) {
                z = true;
            }
            C17960vV.A0C(z);
            StringBuilder sb = new StringBuilder("INSERT INTO receipt_device (message_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(" UNION ALL SELECT ?,?,?");
            }
            String obj = sb.toString();
            C18070vi.A0X(obj);
            return obj;
        }
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        C17960vV.A0C(z2);
        StringBuilder sb2 = new StringBuilder("INSERT INTO message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
        for (int i3 = 1; i3 < i; i3++) {
            sb2.append(" UNION ALL SELECT ?,?,?");
        }
        return sb2.toString();
    }

    public Set A05(AnonymousClass205 r3) {
        if (this instanceof AnonymousClass2De) {
            C56852i8 r0 = (C56852i8) ((AnonymousClass2De) this).A00.A04(r3);
            if (r0 == null) {
                return new LinkedHashSet();
            }
            Set keySet = r0.A00.keySet();
            C18070vi.A0X(keySet);
            return new HashSet(keySet);
        } else if (this instanceof C26091Qu) {
            C26091Qu r1 = (C26091Qu) this;
            AnonymousClass206 A052 = ((AnonymousClass1W6) r1.A01.get()).A01.A05(r3);
            if (A052 == null) {
                return new LinkedHashSet();
            }
            Set keySet2 = r1.A01(A052).A00.keySet();
            C18070vi.A0X(keySet2);
            return new HashSet(keySet2);
        } else {
            Set keySet3 = C26101Qv.A00((C26101Qv) this, r3).A00.keySet();
            C18070vi.A0X(keySet3);
            return new HashSet(keySet3);
        }
    }

    public void A06() {
        C002100z r1;
        if (this instanceof AnonymousClass2De) {
            r1 = ((AnonymousClass2De) this).A00;
        } else {
            r1 = this.A00;
        }
        r1.A07(-1);
    }

    public void A07(long j) {
        if (!(this instanceof AnonymousClass2De)) {
            this.A00.A05(Long.valueOf(j));
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.2S4, java.lang.Object] */
    public void A08(AnonymousClass206 r9, Set set) {
        if (this instanceof AnonymousClass2De) {
            AnonymousClass2De r7 = (AnonymousClass2De) this;
            C56852i8 A012 = r7.A01(r9);
            for (Object next : set) {
                ? obj = new Object();
                obj.A00 = 0;
                C18070vi.A0d(next, 0);
                A012.A00.put(next, obj);
            }
            C002100z r1 = r7.A00;
            AnonymousClass205 r0 = r9.A0v;
            C18070vi.A0W(r0);
            r1.A08(r0, A012);
            return;
        }
        set.size();
        A0C(r9, set, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(com.whatsapp.jid.DeviceJid r9, X.AnonymousClass206 r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass2De
            if (r0 == 0) goto L_0x0018
            r0 = r8
            X.2De r0 = (X.AnonymousClass2De) r0
            X.00z r1 = r0.A00
            X.205 r0 = r10.A0v
            X.C18070vi.A0W(r0)
            java.lang.Object r0 = r1.A04(r0)
            X.2i8 r0 = (X.C56852i8) r0
            if (r0 != 0) goto L_0x0072
            r0 = 0
            return r0
        L_0x0018:
            boolean r0 = r8 instanceof X.C26091Qu
            if (r0 == 0) goto L_0x0080
            r5 = 0
            r3 = 1
            X.2i8 r0 = r8.A02(r10)
            if (r0 != 0) goto L_0x0072
            long r0 = r10.A0x
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.1DL r0 = r8.A02
            long r0 = r0.A09(r9)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r5] = r2
            r4[r3] = r1
            X.1Cd r0 = r8.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
            X.1at r3 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0060 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id FROM receipt_device WHERE message_row_id = ? AND receipt_device_jid_row_id = ?"
            java.lang.String r0 = "MessageReceiptDeviceStore/GET_DEVICE_RECEIPT_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x0060 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0059 }
            r2.close()     // Catch:{ all -> 0x0060 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
            return r0
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r8.A03
            r0.A03()
            r0 = 0
            return r0
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r0 = r0.keySet()
            X.C18070vi.A0X(r0)
            boolean r0 = r0.contains(r9)
            return r0
        L_0x0080:
            r4 = r8
            X.1Qv r4 = (X.C26101Qv) r4
            X.2i8 r0 = r4.A02(r10)
            if (r0 == 0) goto L_0x0097
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r0 = r0.keySet()
            X.C18070vi.A0X(r0)
            boolean r1 = r0.contains(r9)
            return r1
        L_0x0097:
            X.205 r3 = r10.A0v
            X.1BI r1 = r3.A00
            X.C17960vV.A07(r1)
            X.1LW r0 = r4.A00
            long r6 = r0.A09(r1)
            X.1DL r0 = r4.A02
            long r0 = r0.A09(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 0
            r5[r0] = r1
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00ca
            java.lang.String r1 = "1"
        L_0x00be:
            r0 = 1
            r5[r0] = r1
            r1 = 2
            java.lang.String r0 = r3.A01
            r5[r1] = r0
            r0 = 3
            r5[r0] = r2
            goto L_0x00cd
        L_0x00ca:
            java.lang.String r1 = "0"
            goto L_0x00be
        L_0x00cd:
            X.1Cd r0 = r4.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0101 }
            X.1at r3 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0101 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ? AND receipt_device_jid_row_id = ?"
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/GET_DEVICE_RECEIPT_SQL"
            android.database.Cursor r0 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x00f7 }
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x00eb }
            r0.close()     // Catch:{ all -> 0x00f7 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0101 }
            return r1
        L_0x00eb:
            r1 = move-exception
            if (r0 == 0) goto L_0x00f6
            r0.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0101 }
        L_0x0100:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0101 }
        L_0x0101:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r4.A03
            r0.A03()
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26081Qt.A0A(com.whatsapp.jid.DeviceJid, X.206):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.2S4, java.lang.Object] */
    public boolean A0B(AnonymousClass206 r10, Set set) {
        if (this instanceof AnonymousClass2De) {
            AnonymousClass2De r8 = (AnonymousClass2De) this;
            C56852i8 r6 = new C56852i8();
            for (Object next : set) {
                ? obj = new Object();
                obj.A00 = 0;
                C18070vi.A0d(next, 0);
                r6.A00.put(next, obj);
            }
            C002100z r1 = r8.A00;
            AnonymousClass205 r0 = r10.A0v;
            C18070vi.A0W(r0);
            r1.A08(r0, r6);
            return true;
        }
        set.size();
        try {
            return A0C(r10, set, false);
        } catch (SQLiteConstraintException e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.2S4, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:33|34|35|36|77|74|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00df */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(X.AnonymousClass206 r20, java.util.Set r21, boolean r22) {
        /*
            r19 = this;
            r3 = r21
            boolean r0 = r3.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x01ab
            r10 = r20
            long r1 = r10.A0x
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
            r9 = r19
            X.00z r2 = r9.A00
            long r0 = r10.A0x
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.A04(r0)
            if (r0 != 0) goto L_0x0038
            X.2i8 r8 = new X.2i8
            r8.<init>()
        L_0x0028:
            X.C17960vV.A07(r8)
            X.1Qs r1 = r9.A05
            X.190 r0 = r9.A01
            java.util.Set r0 = X.C22971Dz.A0D(r0, r3)
            java.util.HashMap r13 = r1.A01(r0)
            goto L_0x0045
        L_0x0038:
            long r0 = r10.A0x
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r8 = r2.A04(r0)
            X.2i8 r8 = (X.C56852i8) r8
            goto L_0x0028
        L_0x0045:
            X.1Cd r0 = r9.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
            X.1au r7 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
            X.1xA r18 = r7.BD0()     // Catch:{ all -> 0x0196 }
            r0 = 1
            if (r22 == 0) goto L_0x00a6
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x018c }
            long r0 = r10.A0x     // Catch:{ all -> 0x018c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x018c }
            r5[r4] = r0     // Catch:{ all -> 0x018c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x018c }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x018c }
            boolean r2 = r9 instanceof X.AnonymousClass2De     // Catch:{ all -> 0x018c }
            if (r2 == 0) goto L_0x006d
            java.lang.String r6 = ""
        L_0x0067:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r1.<init>()     // Catch:{ all -> 0x018c }
            goto L_0x0077
        L_0x006d:
            boolean r0 = r9 instanceof X.C26091Qu     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0074
            java.lang.String r6 = "receipt_device"
            goto L_0x0067
        L_0x0074:
            java.lang.String r6 = "message_add_on_receipt_device"
            goto L_0x0067
        L_0x0077:
            if (r2 == 0) goto L_0x007c
            java.lang.String r0 = ""
            goto L_0x0082
        L_0x007c:
            boolean r0 = r9 instanceof X.C26091Qu     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "message_row_id"
        L_0x0082:
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r1.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r9.A03()     // Catch:{ all -> 0x018c }
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "addBlankReceiptsForTargetDevicesImpl/DELETE_RECEIPT_DEVICE"
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018c }
            r11.A04(r6, r2, r0, r5)     // Catch:{ all -> 0x018c }
        L_0x00a6:
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r4]     // Catch:{ all -> 0x018c }
            java.lang.Object[] r11 = r3.toArray(r0)     // Catch:{ all -> 0x018c }
            com.whatsapp.jid.DeviceJid[] r11 = (com.whatsapp.jid.DeviceJid[]) r11     // Catch:{ all -> 0x018c }
            int r6 = r11.length     // Catch:{ all -> 0x018c }
            int r0 = A06     // Catch:{ all -> 0x018c }
            int r5 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x018c }
            r4 = 0
            goto L_0x00ba
        L_0x00b7:
            java.lang.String r0 = "message_add_on_row_id"
            goto L_0x0082
        L_0x00ba:
            java.lang.String r12 = "INSERT_DEVICE_RECEIPT_SQL"
            if (r4 != 0) goto L_0x00ed
            java.lang.String r3 = r9.A04(r5)     // Catch:{ SQLiteException -> 0x00df }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ SQLiteException -> 0x00df }
            X.1Ev r2 = r0.A02     // Catch:{ SQLiteException -> 0x00df }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00df }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00df }
            java.lang.String r0 = r9.A03()     // Catch:{ SQLiteException -> 0x00df }
            r1.append(r0)     // Catch:{ SQLiteException -> 0x00df }
            r1.append(r12)     // Catch:{ SQLiteException -> 0x00df }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x00df }
            X.2nI r4 = r2.A0D(r3, r0)     // Catch:{ SQLiteException -> 0x00df }
            goto L_0x00ba
        L_0x00df:
            int r1 = A06     // Catch:{ all -> 0x018c }
            r0 = 10
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x018c }
            A06 = r0     // Catch:{ all -> 0x018c }
            int r5 = r5 / 2
            goto L_0x00ba
        L_0x00ed:
            r17 = 0
        L_0x00ef:
            if (r6 <= 0) goto L_0x0178
            if (r5 <= r6) goto L_0x0114
            java.lang.String r3 = r9.A04(r6)     // Catch:{ all -> 0x018c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x018c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r1.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r9.A03()     // Catch:{ all -> 0x018c }
            r1.append(r0)     // Catch:{ all -> 0x018c }
            r1.append(r12)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018c }
            X.2nI r4 = r2.A0D(r3, r0)     // Catch:{ all -> 0x018c }
            r5 = r6
        L_0x0114:
            android.database.sqlite.SQLiteStatement r3 = r4.A00     // Catch:{ all -> 0x018c }
            r3.clearBindings()     // Catch:{ all -> 0x018c }
            r16 = r17
            r2 = 1
        L_0x011c:
            int r0 = r5 * 3
            if (r2 > r0) goto L_0x0166
            r15 = r11[r16]     // Catch:{ all -> 0x018c }
            r0 = 0
            X.2S4 r14 = new X.2S4     // Catch:{ all -> 0x018c }
            r14.<init>()     // Catch:{ all -> 0x018c }
            r14.A00 = r0     // Catch:{ all -> 0x018c }
            r0 = 0
            X.C18070vi.A0d(r15, r0)     // Catch:{ all -> 0x018c }
            java.util.concurrent.ConcurrentHashMap r0 = r8.A00     // Catch:{ all -> 0x018c }
            r0.put(r15, r14)     // Catch:{ all -> 0x018c }
            long r0 = r10.A0x     // Catch:{ all -> 0x018c }
            r3.bindLong(r2, r0)     // Catch:{ all -> 0x018c }
            int r14 = r2 + 1
            X.1DL r1 = r9.A02     // Catch:{ all -> 0x018c }
            r0 = r11[r16]     // Catch:{ all -> 0x018c }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x018c }
            r3.bindLong(r14, r0)     // Catch:{ all -> 0x018c }
            r0 = r11[r16]     // Catch:{ all -> 0x018c }
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x018c }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x018c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0158
            int r0 = r2 + 2
            r3.bindNull(r0)     // Catch:{ all -> 0x018c }
            goto L_0x0161
        L_0x0158:
            int r14 = r2 + 2
            long r0 = r0.longValue()     // Catch:{ all -> 0x018c }
            r3.bindLong(r14, r0)     // Catch:{ all -> 0x018c }
        L_0x0161:
            int r16 = r16 + 1
            int r2 = r2 + 3
            goto L_0x011c
        L_0x0166:
            r3.execute()     // Catch:{ all -> 0x018c }
            X.1CP r3 = r4.A01     // Catch:{ all -> 0x018c }
            java.lang.String r2 = r4.A02     // Catch:{ all -> 0x018c }
            r1 = 7
            java.lang.String r0 = r4.A03     // Catch:{ all -> 0x018c }
            r3.A02(r2, r1, r0)     // Catch:{ all -> 0x018c }
            int r17 = r17 + r5
            int r6 = r6 - r5
            goto L_0x00ef
        L_0x0178:
            r18.A00()     // Catch:{ all -> 0x018c }
            r1 = 0
            X.3C4 r0 = new X.3C4     // Catch:{ all -> 0x018c }
            r0.<init>(r9, r10, r8, r1)     // Catch:{ all -> 0x018c }
            r7.BJ7(r0)     // Catch:{ all -> 0x018c }
            r18.close()     // Catch:{ all -> 0x0196 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
            r0 = 1
            return r0
        L_0x018c:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0191 }
            goto L_0x0195
        L_0x0191:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0196 }
        L_0x0195:
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x019b }
            goto L_0x019f
        L_0x019b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
        L_0x019f:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r9.A03
            r0.A03()
            r0 = 0
            return r0
        L_0x01ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26081Qt.A0C(X.206, java.util.Set, boolean):boolean");
    }

    public C26081Qt(AnonymousClass190 r2, AnonymousClass1DL r3, C22611Cn r4, AnonymousClass1Cd r5, C26071Qs r6, int i) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = new C002100z(i);
    }

    public void A09(Set set) {
        String str;
        String str2;
        String str3;
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid.getDevice() != 0) {
                hashSet.add(Long.toString(this.A02.A09(deviceJid)));
            }
        }
        if (!hashSet.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            boolean z = this instanceof AnonymousClass2De;
            if (z) {
                str = "";
            } else {
                str = "receipt_device_jid_row_id";
            }
            sb.append(str);
            sb.append(" IN ");
            sb.append(AnonymousClass1H2.A00(hashSet.size()));
            sb.append(" AND ");
            if (z) {
                str2 = "";
            } else {
                str2 = "receipt_device_timestamp";
            }
            sb.append(str2);
            sb.append(" IS NULL");
            String obj = sb.toString();
            C28791au A052 = this.A04.A05();
            try {
                C23141Ev r5 = ((C28801av) A052).A02;
                if (z) {
                    str3 = "";
                } else if (this instanceof C26091Qu) {
                    str3 = "receipt_device";
                } else {
                    str3 = "message_add_on_receipt_device";
                }
                StringBuilder sb2 = new StringBuilder();
                String A032 = A03();
                sb2.append(A032);
                sb2.append("deleteCompanionReceiptsForUndeliveredMessages/DELETE_RECEIPT_DEVICE");
                int A042 = r5.A04(str3, obj, sb2.toString(), (String[]) hashSet.toArray(new String[0]));
                A052.close();
                if (A042 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A032);
                    sb3.append("deleteCompanionReceiptsForUndeliveredMessages/deviceIds = ");
                    sb3.append(set);
                    Log.i(sb3.toString());
                    A06();
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }
}
