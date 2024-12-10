package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1WM  reason: invalid class name */
public class AnonymousClass1WM implements C218917u, C201511a {
    public final AnonymousClass11S A00;
    public final C23651Hc A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1LW A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass1Q2 A07;
    public final AnonymousClass1DL A08;
    public final AnonymousClass1Cd A09;
    public final AnonymousClass1WH A0A;
    public final AnonymousClass1WF A0B;
    public final AnonymousClass1WB A0C;
    public final AnonymousClass1WE A0D;
    public final C202711m A0E;
    public final AnonymousClass00H A0F;
    public final HashSet A0G = new HashSet(Arrays.asList(new Integer[]{79}));
    public final AnonymousClass190 A0H;
    public final AnonymousClass1RW A0I;
    public final C26011Qm A0J;
    public final AnonymousClass1W7 A0K;
    public final C27081Uq A0L;
    public final AnonymousClass1W8 A0M;
    public final AnonymousClass1WL A0N;
    public final C18030ve A0O;
    public final AnonymousClass1N9 A0P;
    public final AnonymousClass1WK A0Q;
    public final AnonymousClass10I A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public volatile C32311gz A0W;

    @Deprecated
    public static C183509Yn A03(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String obj;
        boolean z = false;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        String str2 = str;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        if (!(bArr == null || bArr2 == null)) {
            byte[] bArr6 = bArr3;
            if (!(bArr3 == null || str == null || userJid == null || userJid4 == null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(0);
                sb.append(userJid4.getRawString());
                byte[] A002 = AnonymousClass9RZ.A00(userJid3, userJid4, jniBridge, str2, "Poll Vote", bArr6, bArr5, sb.toString().getBytes(C19620yd.A0C), bArr4);
                if (A002 == null) {
                    obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload pollUpdateMessageContent is null";
                    Log.e(obj);
                    return null;
                }
                try {
                    return A3W.A01((AnonymousClass8XH) C23577Bm6.A07(AnonymousClass8XH.DEFAULT_INSTANCE, A002), list, i);
                } catch (AnonymousClass1PN unused) {
                    Log.e("MessageAddOnPollVoteUtils/decryptPollVoteMessage: failed to parse payload into protobuf");
                    return null;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageAddOnPollVoteUtils/decryptPollVotePayload one of the params is null messageSecret is null = ");
        boolean z2 = false;
        if (bArr == null) {
            z2 = true;
        }
        sb2.append(z2);
        sb2.append(" pollVoteEncPayload is null = ");
        boolean z3 = false;
        if (bArr2 == null) {
            z3 = true;
        }
        sb2.append(z3);
        sb2.append(" pollMessageId is null = ");
        boolean z4 = false;
        if (str == null) {
            z4 = true;
        }
        sb2.append(z4);
        sb2.append(" pollMessageId is null = ");
        boolean z5 = false;
        if (str == null) {
            z5 = true;
        }
        sb2.append(z5);
        sb2.append(" pollCreatorSenderJid is null = ");
        boolean z6 = false;
        if (userJid == null) {
            z6 = true;
        }
        sb2.append(z6);
        sb2.append(" pollVoteSenderJid is null = ");
        if (userJid4 == null) {
            z = true;
        }
        sb2.append(z);
        obj = sb2.toString();
        Log.e(obj);
        return null;
    }

    public int A09(AnonymousClass205 r6) {
        Cursor A042;
        C28781at A043 = this.A09.get();
        try {
            A042 = this.A0E.A04(A043, r6);
            int columnIndexOrThrow = A042.getColumnIndexOrThrow("message_add_on_type");
            if (!A042.moveToNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageAddOnManager/getMessageAddOnTypeMessageKey message add on not found for key=");
                sb.append(r6);
                Log.w(sb.toString());
                A042.close();
                A043.close();
                return -1;
            }
            int i = A042.getInt(columnIndexOrThrow);
            A042.close();
            A043.close();
            return i;
        } catch (Throwable th) {
            try {
                A043.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0091=Splitter:B:28:0x0091, B:24:0x008a=Splitter:B:24:0x008a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass212 A0B(X.AnonymousClass205 r9) {
        /*
            r8 = this;
            r7 = 0
            X.1BI r0 = r9.A00
            if (r0 == 0) goto L_0x00ae
            X.1Cd r0 = r8.A09
            X.1at r4 = r0.get()
            X.11m r6 = r8.A0E     // Catch:{ all -> 0x00a4 }
            android.database.Cursor r5 = r6.A04(r4, r9)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "_id"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "message_add_on_type"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0098 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "MessageAddOnManager/getMessageAddOnForMessageKey message add on not found for "
            if (r0 != 0) goto L_0x0038
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            r0.append(r9)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0098 }
            goto L_0x0091
        L_0x0038:
            long r0 = r5.getLong(r3)     // Catch:{ all -> 0x0098 }
            int r2 = r5.getInt(r2)     // Catch:{ all -> 0x0098 }
            r5.close()     // Catch:{ all -> 0x00a4 }
            android.database.Cursor r5 = r6.A01(r4, r2, r0)     // Catch:{ all -> 0x00a4 }
            java.util.HashMap r1 = X.C63792th.A01(r5, r2)     // Catch:{ all -> 0x0098 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0091
            X.212 r6 = r6.A05(r5, r1)     // Catch:{ all -> 0x0098 }
            if (r6 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r1.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "MessageAddOnManager/getMessageAddOnForMessageKey failed to read fmessage for "
            r1.append(r0)     // Catch:{ all -> 0x0098 }
            r1.append(r9)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0098 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0098 }
            goto L_0x0091
        L_0x006c:
            X.1DL r0 = r8.A08     // Catch:{ all -> 0x0098 }
            r6.A1B(r5, r0, r1)     // Catch:{ all -> 0x0098 }
            boolean r0 = r6 instanceof X.AnonymousClass22E     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x008a
            X.1WB r0 = r8.A0C     // Catch:{ all -> 0x0098 }
            r3 = r6
            X.22E r3 = (X.AnonymousClass22E) r3     // Catch:{ all -> 0x0098 }
            X.1WA r2 = r0.A06     // Catch:{ all -> 0x0098 }
            long r0 = r3.A0x     // Catch:{ all -> 0x0098 }
            java.util.ArrayList r1 = r2.A00(r0)     // Catch:{ all -> 0x0098 }
            java.util.List r0 = r3.A06     // Catch:{ all -> 0x0098 }
            r0.clear()     // Catch:{ all -> 0x0098 }
            r0.addAll(r1)     // Catch:{ all -> 0x0098 }
        L_0x008a:
            r5.close()     // Catch:{ all -> 0x00a4 }
            r4.close()
            return r6
        L_0x0091:
            r5.close()     // Catch:{ all -> 0x00a4 }
            r4.close()
            return r7
        L_0x0098:
            r1 = move-exception
            if (r5 == 0) goto L_0x00a3
            r5.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00a4 }
        L_0x00a3:
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00a9 }
            throw r1
        L_0x00a9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00ae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WM.A0B(X.205):X.212");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r7 = (X.AnonymousClass22H) r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r2 = 1
            boolean r0 = r10.A10(r2)
            r8 = 17
            if (r0 == 0) goto L_0x002b
            X.8BG r0 = X.C63892tr.A01(r10)
            if (r0 == 0) goto L_0x002b
            java.util.Collection r0 = r0.BMv()
            java.util.Iterator r3 = r0.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            X.212 r1 = (X.AnonymousClass212) r1
            r1.A0a(r8)
            r0 = 0
            A00(r9, r1, r0)
            goto L_0x0017
        L_0x002b:
            boolean r0 = r10 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x007a
            r7 = r10
            X.22H r7 = (X.AnonymousClass22H) r7
            java.util.List r0 = r7.A17()
            if (r0 == 0) goto L_0x007a
            java.util.Iterator r6 = r0.iterator()
        L_0x003c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r5 = r6.next()
            X.212 r5 = (X.AnonymousClass212) r5
            r5.A0a(r8)
            r4 = r5
            X.22E r4 = (X.AnonymousClass22E) r4
            java.util.List r3 = r4.A01
            java.util.List r1 = r7.A07
            if (r3 != 0) goto L_0x0059
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0059:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0070
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0064:
            java.util.List r0 = r4.A06
            r0.clear()
            r0.addAll(r1)
            A00(r9, r5, r2)
            goto L_0x003c
        L_0x0070:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            java.util.ArrayList r1 = X.A3W.A02(r1, r0)
            goto L_0x0064
        L_0x007a:
            boolean r0 = r10 instanceof X.C445823z
            if (r0 == 0) goto L_0x009b
            r0 = r10
            X.23z r0 = (X.C445823z) r0
            java.util.List r0 = r0.A18()
            if (r0 == 0) goto L_0x009b
            java.util.Iterator r1 = r0.iterator()
        L_0x008b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r1.next()
            X.212 r0 = (X.AnonymousClass212) r0
            A00(r9, r0, r2)
            goto L_0x008b
        L_0x009b:
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = r10.A11(r0)
            if (r0 == 0) goto L_0x00d3
            X.1W8 r0 = r9.A0M
            android.util.Pair r0 = r0.A01(r10)
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x00d3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageAddOnManager/Unable to insert message into msgstore.db.message_add_on key="
            r1.append(r0)
            X.205 r0 = r10.A0v
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.190 r3 = r9.A0H
            r2 = 0
            r1 = 0
            java.lang.String r0 = "MessageAddOnManager/Unable to write FMessageEdit to DB"
            r3.A0G(r0, r2, r1)
        L_0x00d3:
            r0 = 4
            boolean r0 = r10.A10(r0)
            if (r0 == 0) goto L_0x00e4
            X.22A r1 = X.C63892tr.A02(r10)
            if (r1 == 0) goto L_0x00e4
            r0 = 0
            A00(r9, r1, r0)
        L_0x00e4:
            r0 = 8
            boolean r0 = r10.A10(r0)
            if (r0 == 0) goto L_0x00f6
            X.22C r1 = X.C63892tr.A03(r10)
            if (r1 == 0) goto L_0x00f6
            r0 = 0
            A00(r9, r1, r0)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WM.A0I(X.206):void");
    }

    public /* synthetic */ void BzP() {
    }

    public /* synthetic */ void BzQ(Integer num, Integer num2) {
    }

    public /* synthetic */ void BzR() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.1WF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: X.1WH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: X.1WE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.23k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: X.23k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.23k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: X.1WK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: X.23k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: X.23k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.23k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: X.23k} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1094 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05c8 A[Catch:{ all -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05cb A[Catch:{ all -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x073c A[Catch:{ all -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0854 A[SYNTHETIC, Splitter:B:477:0x0854] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0880 A[Catch:{ all -> 0x0903, all -> 0x0908, all -> 0x090d }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x089f A[SYNTHETIC, Splitter:B:489:0x089f] */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x0a2d A[SYNTHETIC, Splitter:B:571:0x0a2d] */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0a65 A[Catch:{ all -> 0x0bd7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0a84 A[SYNTHETIC, Splitter:B:591:0x0a84] */
    /* JADX WARNING: Removed duplicated region for block: B:936:0x0fa5 A[Catch:{ all -> 0x0ddf, all -> 0x103e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:693:0x0bf0=Splitter:B:693:0x0bf0, B:930:0x0f86=Splitter:B:930:0x0f86, B:486:0x089c=Splitter:B:486:0x089c, B:464:0x082d=Splitter:B:464:0x082d} */
    public static int A00(X.AnonymousClass1WM r29, X.AnonymousClass212 r30, boolean r31) {
        /*
            r4 = r30
            X.205 r13 = r4.A0v
            r2 = 6
            r3 = 1
            r6 = r29
            if (r31 != 0) goto L_0x0021
            boolean r0 = r4 instanceof X.AnonymousClass2M1
            if (r0 == 0) goto L_0x0021
            X.11m r0 = r6.A0E
            long r6 = r0.A00(r4)
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0020
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn placeholder message did not get stored"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x0020:
            return r3
        L_0x0021:
            X.205 r9 = r4.A18()
            if (r9 != 0) goto L_0x002e
            java.lang.String r1 = "MessageAddOnManager/storeMessageAddOn parent key must be present"
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            return r2
        L_0x002e:
            if (r31 != 0) goto L_0x003c
            int r0 = r4.A17()
            if (r0 <= 0) goto L_0x003c
            int r0 = r4.A00
            if (r0 != 0) goto L_0x003c
            r4.A00 = r3
        L_0x003c:
            X.00H r10 = r6.A0F
            java.lang.Object r0 = r10.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r5 = r0.A05(r9)
            if (r5 != 0) goto L_0x00db
            boolean r0 = r4 instanceof X.C444923q
            if (r0 == 0) goto L_0x00c2
            X.1Uq r11 = r6.A0L
            java.lang.String r7 = r9.A01
            X.1BI r1 = r9.A00
            r5 = 0
            if (r1 == 0) goto L_0x00c2
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 0
            r8[r0] = r7
            X.1LW r0 = r11.A01
            long r0 = r0.A09(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8[r3] = r0
            X.1Cd r0 = r11.A03
            X.1at r12 = r0.get()
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b8 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_id = ?  AND key_chat_row_id = ? "
            java.lang.String r0 = "ScheduledCallsStore/GET_SCHEDULED_CALL_MESSAGE"
            android.database.Cursor r8 = r7.A0A(r1, r0, r8)     // Catch:{ all -> 0x00b8 }
            boolean r0 = r8.moveToLast()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00a8
            X.2mw r7 = X.C27081Uq.A00(r8, r11)     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ac }
            X.23k r5 = new X.23k     // Catch:{ all -> 0x00ac }
            r5.<init>(r9, r0)     // Catch:{ all -> 0x00ac }
            long r0 = r7.A02     // Catch:{ all -> 0x00ac }
            r5.A0x = r0     // Catch:{ all -> 0x00ac }
            com.whatsapp.jid.UserJid r0 = r7.A05     // Catch:{ all -> 0x00ac }
            r5.A0d(r0)     // Catch:{ all -> 0x00ac }
            long r0 = r7.A03     // Catch:{ all -> 0x00ac }
            r5.A01 = r0     // Catch:{ all -> 0x00ac }
            int r0 = r7.A00     // Catch:{ all -> 0x00ac }
            r5.A00 = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x00ac }
            r5.A02 = r0     // Catch:{ all -> 0x00ac }
        L_0x00a8:
            r8.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bd
        L_0x00ac:
            r1 = move-exception
            if (r8 == 0) goto L_0x00b7
            r8.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x104d }
            throw r1
        L_0x00bd:
            r12.close()
            if (r5 != 0) goto L_0x00db
        L_0x00c2:
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x00db
            java.lang.Object r7 = r10.get()
            X.1W6 r7 = (X.AnonymousClass1W6) r7
            X.1BI r5 = r9.A00
            java.lang.String r0 = r9.A01
            X.205 r1 = new X.205
            r1.<init>(r5, r0, r3)
            X.1W2 r0 = r7.A01
            X.206 r5 = r0.A05(r1)
        L_0x00db:
            boolean r0 = X.C20133A8t.A0B(r5)
            r7 = 2
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message not found, storing orphan message add on"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            boolean r0 = r4 instanceof X.AnonymousClass22A
            if (r0 == 0) goto L_0x00f8
            X.1WH r8 = r6.A0A
            r2 = r4
            X.22A r2 = (X.AnonymousClass22A) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0 = 0
            r8.A00(r0, r2, r1, r1)
        L_0x00f8:
            X.00H r0 = r6.A0U
            java.lang.Object r2 = r0.get()
            X.ARP r2 = (X.ARP) r2
            if (r5 == 0) goto L_0x0103
            r3 = 0
        L_0x0103:
            X.1BI r11 = r4.A0H()
            X.205 r14 = r4.A18()
            X.A51 r0 = r4.A05
            if (r0 != 0) goto L_0x019e
            r12 = 0
        L_0x0110:
            long r0 = r4.A0I
            boolean r5 = r4 instanceof X.AnonymousClass227
            if (r5 == 0) goto L_0x0158
            r5 = r4
            X.227 r5 = (X.AnonymousClass227) r5
            byte[] r5 = r5.A02
            if (r5 == 0) goto L_0x0158
        L_0x011d:
            boolean r4 = r4 instanceof X.AnonymousClass22C
            if (r4 != 0) goto L_0x013a
            r17 = 0
        L_0x0123:
            r19 = 2
            if (r3 == 0) goto L_0x0129
            r19 = 1
        L_0x0129:
            r18 = 1
            r15 = 0
            X.9tq r10 = new X.9tq
            r20 = r0
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r0 = r2.A01(r10)
            return r0
        L_0x013a:
            X.8av r4 = X.C165308av.DEFAULT_INSTANCE
            X.Bmt r8 = r4.A0N()
            r8.A0E()
            X.Bm6 r6 = r8.A00
            X.8av r6 = (X.C165308av) r6
            int r4 = r6.bitField0_
            r4 = r4 | 2
            r6.bitField0_ = r4
            r6.editVersion_ = r7
            X.Bm6 r4 = r8.A0C()
            byte[] r17 = r4.A0M()
            goto L_0x0123
        L_0x0158:
            boolean r5 = r4 instanceof X.AnonymousClass22E
            if (r5 == 0) goto L_0x016e
            X.0ve r8 = r2.A02
            X.0vf r6 = X.C18040vf.A01
            r5 = 6772(0x1a74, float:9.49E-42)
            boolean r5 = X.C18020vd.A05(r6, r8, r5)
            if (r5 == 0) goto L_0x016e
            r5 = r4
            X.22E r5 = (X.AnonymousClass22E) r5
            byte[] r5 = r5.A02
            goto L_0x011d
        L_0x016e:
            boolean r5 = r4 instanceof X.AnonymousClass24H
            if (r5 == 0) goto L_0x0178
            r5 = r4
            X.24H r5 = (X.AnonymousClass24H) r5
            byte[] r5 = r5.A03
            goto L_0x011d
        L_0x0178:
            X.8X8 r9 = X.C166418cr.A00()
            X.00H r5 = r2.A03     // Catch:{ 1T8 -> 0x01a2 }
            java.lang.Object r8 = r5.get()     // Catch:{ 1T8 -> 0x01a2 }
            X.12N r8 = (X.AnonymousClass12N) r8     // Catch:{ 1T8 -> 0x01a2 }
            X.C18070vi.A0b(r9)     // Catch:{ 1T8 -> 0x01a2 }
            X.9n5 r6 = X.C181349Qd.A00(r9)     // Catch:{ 1T8 -> 0x01a2 }
            r5 = 1
            r6.A03 = r5     // Catch:{ 1T8 -> 0x01a2 }
            X.A2m r5 = r6.A00()     // Catch:{ 1T8 -> 0x01a2 }
            r8.A01(r5, r4)     // Catch:{ 1T8 -> 0x01a2 }
            X.Bm6 r5 = r9.A0C()
            byte[] r5 = r5.A0M()
            goto L_0x011d
        L_0x019e:
            X.1BI r12 = r0.A00
            goto L_0x0110
        L_0x01a2:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanStore/getMessageAddOnOrphanData/failed to build protobuf message"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid message addon: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01bf:
            boolean r1 = X.AnonymousClass25A.A0p(r5)
            r3 = 7
            boolean r0 = r4 instanceof X.AnonymousClass22A
            r16 = r0
            if (r1 == 0) goto L_0x01e8
            if (r0 == 0) goto L_0x01e2
            int r0 = r4.A0C()
            if (r0 == 0) goto L_0x021a
            X.1WH r2 = r6.A0A
            X.22A r4 = (X.AnonymousClass22A) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00(r5, r4, r1, r0)
        L_0x01e2:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is revoked, not storing orphan message add on"
        L_0x01e4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x01e8:
            if (r0 != 0) goto L_0x01f9
            X.11P r0 = r6.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            boolean r0 = X.AnonymousClass25A.A0y(r5, r0)
            if (r0 == 0) goto L_0x01f9
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is ephemerally expired, not storing orphan message add on"
            goto L_0x01e4
        L_0x01f9:
            boolean r0 = r4 instanceof X.AnonymousClass22E
            if (r0 == 0) goto L_0x0204
            boolean r0 = r5 instanceof X.AnonymousClass22H
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not poll message for poll vote add on"
            goto L_0x01e4
        L_0x0204:
            boolean r0 = r4 instanceof X.C444923q
            if (r0 == 0) goto L_0x020f
            boolean r0 = r5 instanceof X.C444323k
            if (r0 != 0) goto L_0x020f
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not scheduled call message for scheduled call edit add on"
            goto L_0x01e4
        L_0x020f:
            boolean r0 = r4 instanceof X.AnonymousClass24H
            if (r0 == 0) goto L_0x021a
            boolean r0 = r5 instanceof X.C445823z
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not event message for event's response add on"
            goto L_0x01e4
        L_0x021a:
            long r0 = r5.A0x
            r4.A02 = r0
            X.1RW r0 = r6.A0I
            X.1RX r1 = r0.A00()
            X.1BI r0 = r13.A00
            r21 = r0
            boolean r17 = r1.A01(r0)
            int r0 = r4.A00
            if (r0 != r7) goto L_0x0233
            A08(r6, r5, r4)
        L_0x0233:
            if (r17 == 0) goto L_0x023c
            if (r31 != 0) goto L_0x023c
            r0 = 17
            r4.A0a(r0)
        L_0x023c:
            X.1Cd r0 = r6.A09
            X.1au r20 = r0.A05()
            X.1xA r19 = r20.BD0()     // Catch:{ all -> 0x1048 }
            boolean r0 = r4 instanceof X.AnonymousClass227     // Catch:{ all -> 0x103e }
            r18 = r0
            if (r0 == 0) goto L_0x0479
            X.1WE r7 = r6.A0D     // Catch:{ all -> 0x103e }
            r8 = r4
            X.227 r8 = (X.AnonymousClass227) r8     // Catch:{ all -> 0x103e }
            monitor-enter(r7)     // Catch:{ all -> 0x103e }
            X.1BI r0 = r8.A0H()     // Catch:{ all -> 0x0cf7 }
            X.205 r9 = r8.A0v     // Catch:{ all -> 0x0cf7 }
            boolean r10 = r9.A02     // Catch:{ all -> 0x0cf7 }
            X.227 r2 = X.AnonymousClass1WE.A00(r7, r0, r5, r10)     // Catch:{ all -> 0x0cf7 }
            X.0ve r3 = r7.A04     // Catch:{ all -> 0x0cf7 }
            r1 = 11531(0x2d0b, float:1.6158E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0cf7 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0386
            if (r2 == 0) goto L_0x02c4
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0cf7 }
            boolean r0 = X.C25452Cg4.A00(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x02c4
            X.1WC r12 = r7.A05     // Catch:{ all -> 0x0cf7 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0cf7 }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            X.205 r0 = r2.A0v     // Catch:{ all -> 0x0cf7 }
            java.lang.String r13 = r0.A01     // Catch:{ all -> 0x0cf7 }
            r0 = 1
            X.C18070vi.A0d(r13, r0)     // Catch:{ all -> 0x0cf7 }
            X.0vl r1 = r12.A01     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.contains(r14)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x02c4
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0cf7 }
            r0 = 0
            java.lang.String r11 = r1.getString(r14, r0)     // Catch:{ all -> 0x0cf7 }
            if (r11 == 0) goto L_0x02c4
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0cf7 }
            r1 = 0
            java.lang.String r0 = ","
            r3[r1] = r0     // Catch:{ all -> 0x0cf7 }
            java.util.List r1 = X.AnonymousClass1YF.A0S(r11, r3, r1)     // Catch:{ all -> 0x0cf7 }
            java.util.HashSet r3 = X.C29431cG.A0n(r1)     // Catch:{ all -> 0x0cf7 }
            boolean r1 = r3.remove(r13)     // Catch:{ all -> 0x0cf7 }
            if (r1 == 0) goto L_0x02c4
            int r1 = r3.size()     // Catch:{ all -> 0x0cf7 }
            if (r1 != 0) goto L_0x02e2
            r12.A01(r14)     // Catch:{ all -> 0x0cf7 }
        L_0x02c4:
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0cf7 }
            boolean r0 = X.C25452Cg4.A00(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0386
            X.1WC r12 = r7.A05     // Catch:{ all -> 0x0cf7 }
            X.1BI r0 = r9.A00     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0386
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0386
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0cf7 }
            boolean r0 = X.C25452Cg4.A00(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x02f8
            goto L_0x0386
        L_0x02e2:
            android.content.SharedPreferences$Editor r12 = X.AnonymousClass1WC.A00(r12)     // Catch:{ all -> 0x0cf7 }
            r11 = 0
            java.lang.String r1 = ""
            java.lang.String r0 = X.C29431cG.A0g(r0, r1, r1, r3, r11)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences$Editor r0 = r12.putString(r14, r0)     // Catch:{ all -> 0x0cf7 }
            r0.apply()     // Catch:{ all -> 0x0cf7 }
            goto L_0x02c4
        L_0x02f5:
            r12.A01(r0)     // Catch:{ all -> 0x0cf7 }
        L_0x02f8:
            X.0vl r13 = r12.A01     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0cf7 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0cf7 }
            int r1 = r0.size()     // Catch:{ all -> 0x0cf7 }
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto L_0x0329
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0cf7 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0cf7 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r0 = X.C29431cG.A0Y(r0)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x02f8
            goto L_0x02f5
        L_0x0329:
            java.lang.String r3 = r9.A01     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0cf7 }
            long r0 = r8.A02     // Catch:{ all -> 0x0cf7 }
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0356
            java.lang.Object r1 = r13.getValue()     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0cf7 }
            r0 = 0
            java.lang.String r13 = r1.getString(r11, r0)     // Catch:{ all -> 0x0cf7 }
            if (r13 != 0) goto L_0x0372
            r12.A01(r11)     // Catch:{ all -> 0x0cf7 }
        L_0x0356:
            java.util.Set r13 = java.util.Collections.singleton(r3)     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x0cf7 }
        L_0x035d:
            android.content.SharedPreferences$Editor r12 = X.AnonymousClass1WC.A00(r12)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r3 = ","
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C29431cG.A0g(r3, r0, r0, r13, r1)     // Catch:{ all -> 0x0cf7 }
            android.content.SharedPreferences$Editor r0 = r12.putString(r11, r0)     // Catch:{ all -> 0x0cf7 }
            r0.apply()     // Catch:{ all -> 0x0cf7 }
            goto L_0x0386
        L_0x0372:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0cf7 }
            r0 = 0
            java.lang.String r14 = ","
            r1[r0] = r14     // Catch:{ all -> 0x0cf7 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r13, r1, r0)     // Catch:{ all -> 0x0cf7 }
            java.util.HashSet r13 = X.C29431cG.A0n(r0)     // Catch:{ all -> 0x0cf7 }
            r13.add(r3)     // Catch:{ all -> 0x0cf7 }
            goto L_0x035d
        L_0x0386:
            r3 = 17
            if (r2 != 0) goto L_0x03ee
            X.1Ln r1 = r7.A01     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r0 = r8.A0I()     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r0 = r1.A0F(r0)     // Catch:{ all -> 0x0cf7 }
            X.227 r2 = X.AnonymousClass1WE.A00(r7, r0, r5, r10)     // Catch:{ all -> 0x0cf7 }
            if (r2 != 0) goto L_0x03ee
            X.1Cd r0 = r7.A00     // Catch:{ all -> 0x0cf7 }
            X.1au r2 = r0.A05()     // Catch:{ all -> 0x0cf7 }
            X.1xA r11 = r2.BD0()     // Catch:{ all -> 0x03e8 }
            if (r10 != 0) goto L_0x03b7
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x03de }
            boolean r0 = r0.A02     // Catch:{ all -> 0x03de }
            if (r0 == 0) goto L_0x03b4
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x03de }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03de }
            if (r0 == 0) goto L_0x03b7
        L_0x03b4:
            r8.A0a(r3)     // Catch:{ all -> 0x03de }
        L_0x03b7:
            X.11m r0 = r7.A03     // Catch:{ all -> 0x03de }
            long r0 = r0.A00(r8)     // Catch:{ all -> 0x03de }
            X.AnonymousClass1WD.A00(r2, r8, r0)     // Catch:{ all -> 0x03de }
            r9 = -1
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x03ce
            r11.close()     // Catch:{ all -> 0x03e8 }
            r2.close()     // Catch:{ all -> 0x0cf7 }
            goto L_0x089c
        L_0x03ce:
            r11.A00()     // Catch:{ all -> 0x03de }
            r11.close()     // Catch:{ all -> 0x03e8 }
            r2.close()     // Catch:{ all -> 0x0cf7 }
            r0 = 0
            X.AnonymousClass1WE.A01(r7, r5, r0, r8)     // Catch:{ all -> 0x0cf7 }
            monitor-exit(r7)     // Catch:{ all -> 0x103e }
            goto L_0x0f4f
        L_0x03de:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x03e3 }
            goto L_0x03e7
        L_0x03e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03e8 }
        L_0x03e7:
            throw r1     // Catch:{ all -> 0x03e8 }
        L_0x03e8:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0912 }
            goto L_0x0916
        L_0x03ee:
            if (r31 == 0) goto L_0x0402
            java.lang.String r0 = "MessageAddOnReactionManager/adjustSenderClientTimestamp"
            X.C17960vV.A0G(r10, r0)     // Catch:{ all -> 0x0cf7 }
            long r0 = r2.A00     // Catch:{ all -> 0x0cf7 }
            long r11 = r8.A00     // Catch:{ all -> 0x0cf7 }
            int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0402
            r11 = 1
            long r0 = r0 + r11
            r8.A00 = r0     // Catch:{ all -> 0x0cf7 }
        L_0x0402:
            long r11 = r2.A00     // Catch:{ all -> 0x0cf7 }
            long r0 = r8.A00     // Catch:{ all -> 0x0cf7 }
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x082d
            X.1Cd r0 = r7.A00     // Catch:{ SQLiteConstraintException -> 0x0461 }
            X.1au r11 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x0461 }
            X.1xA r13 = r11.BD0()     // Catch:{ all -> 0x0457 }
            long r0 = r2.A0x     // Catch:{ all -> 0x044d }
            X.11m r12 = r7.A03     // Catch:{ all -> 0x044d }
            r12.A08(r0)     // Catch:{ all -> 0x044d }
            if (r10 != 0) goto L_0x042e
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x044d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x044d }
            if (r0 != 0) goto L_0x042b
            int r0 = r2.A0D()     // Catch:{ all -> 0x044d }
            if (r0 != r3) goto L_0x042e
        L_0x042b:
            r8.A0a(r3)     // Catch:{ all -> 0x044d }
        L_0x042e:
            long r0 = r12.A00(r8)     // Catch:{ all -> 0x044d }
            X.AnonymousClass1WD.A00(r11, r8, r0)     // Catch:{ all -> 0x044d }
            r8.A0x = r0     // Catch:{ all -> 0x044d }
            X.AnonymousClass1WE.A01(r7, r5, r2, r8)     // Catch:{ all -> 0x044d }
            r13.A00()     // Catch:{ all -> 0x044d }
            int r0 = r2.A0D()     // Catch:{ all -> 0x044d }
            r2 = 2
            if (r0 != r3) goto L_0x0445
            r2 = 3
        L_0x0445:
            r13.close()     // Catch:{ all -> 0x0457 }
            r11.close()     // Catch:{ SQLiteConstraintException -> 0x0461 }
            goto L_0x0f9e
        L_0x044d:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0452 }
            goto L_0x0456
        L_0x0452:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0457 }
        L_0x0456:
            throw r1     // Catch:{ all -> 0x0457 }
        L_0x0457:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x045c }
            goto L_0x0460
        L_0x045c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x0461 }
        L_0x0460:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x0461 }
        L_0x0461:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cf7 }
            r1.<init>()     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = "MessageAddOnReactionManager/storeFMessageReactionIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0cf7 }
            r1.append(r0)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x089c
        L_0x0479:
            if (r16 == 0) goto L_0x074a
            X.1WH r7 = r6.A0A     // Catch:{ all -> 0x103e }
            r9 = r4
            X.22A r9 = (X.AnonymousClass22A) r9     // Catch:{ all -> 0x103e }
            monitor-enter(r7)     // Catch:{ all -> 0x103e }
            X.11m r12 = r7.A09     // Catch:{ all -> 0x0cf7 }
            r0 = 68
            X.212 r8 = r12.A06(r5, r0)     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r8 instanceof X.AnonymousClass22A     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x04a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cf7 }
            r1.<init>()     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/getMessageAddOnKeepInChatForParentMessage unexpected fmessage "
            r1.append(r0)     // Catch:{ all -> 0x0cf7 }
            r1.append(r8)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            r8 = 0
            goto L_0x054b
        L_0x04a4:
            X.22A r8 = (X.AnonymousClass22A) r8     // Catch:{ all -> 0x0cf7 }
            if (r8 == 0) goto L_0x054b
            long r2 = r8.A0I     // Catch:{ all -> 0x0cf7 }
            long r0 = r9.A0I     // Catch:{ all -> 0x0cf7 }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x04c7
            r11 = 2
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x04fa
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current and new messages' timestamps are equal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            long r2 = r8.A02     // Catch:{ all -> 0x0cf7 }
            long r0 = r9.A02     // Catch:{ all -> 0x0cf7 }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x04d6
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current sender client timestamp is newer"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
        L_0x04c7:
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            r0 = 5
        L_0x04cd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            r7.A00(r5, r9, r1, r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x082d
        L_0x04d6:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x04fa
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current and new sender client timestamps are equal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            X.205 r0 = r8.A0v     // Catch:{ all -> 0x0cf7 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0cf7 }
            X.205 r0 = r9.A0v     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0cf7 }
            if (r1 != 0) goto L_0x04ec
            if (r0 != 0) goto L_0x04fa
            goto L_0x04f4
        L_0x04ec:
            if (r0 == 0) goto L_0x04f4
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 > 0) goto L_0x04fa
        L_0x04f4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0cf7 }
            r0 = 7
            goto L_0x04cd
        L_0x04fa:
            com.whatsapp.jid.UserJid r1 = r5.A0I()     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r0 = r9.A0I()     // Catch:{ all -> 0x0cf7 }
            if (r1 == 0) goto L_0x050a
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x0516
        L_0x050a:
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0cf7 }
            boolean r2 = r0.A02     // Catch:{ all -> 0x0cf7 }
            if (r2 == 0) goto L_0x051c
            X.205 r0 = r9.A0v     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x051c
        L_0x0516:
            long r0 = r8.A0x     // Catch:{ all -> 0x0cf7 }
            r12.A08(r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x054f
        L_0x051c:
            int r0 = r8.A01     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x0516
            com.whatsapp.jid.UserJid r1 = r5.A0I()     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r0 = r8.A0I()     // Catch:{ all -> 0x0cf7 }
            if (r1 == 0) goto L_0x0530
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x0538
        L_0x0530:
            if (r2 == 0) goto L_0x0516
            X.205 r0 = r8.A0v     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0516
        L_0x0538:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0cf7 }
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            r7.A00(r5, r9, r1, r0)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/isKeepInChatAllowed: false"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x082d
        L_0x054b:
            int r0 = r5.A05     // Catch:{ all -> 0x0cf7 }
            if (r0 <= 0) goto L_0x089c
        L_0x054f:
            if (r31 != 0) goto L_0x05fa
            int r0 = r9.A01     // Catch:{ all -> 0x0cf7 }
            r13 = 1
            r14 = 0
            if (r0 != r13) goto L_0x0558
            r14 = 1
        L_0x0558:
            java.lang.Long r0 = r5.A0U     // Catch:{ all -> 0x0cf7 }
            X.205 r1 = r5.A0v     // Catch:{ all -> 0x0cf7 }
            X.1BI r15 = r1.A00     // Catch:{ all -> 0x0cf7 }
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.GroupJid r11 = X.C36321nh.A00(r15)     // Catch:{ all -> 0x0cf7 }
            X.11S r10 = r7.A00     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass25A.A08(r10, r5)     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass25A.A08(r10, r9)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0581
            if (r14 == 0) goto L_0x0583
            long r24 = r0.longValue()     // Catch:{ all -> 0x0cf7 }
            long r22 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cf7 }
            int r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x05ac
            r2 = 4
            goto L_0x0733
        L_0x0581:
            if (r14 != 0) goto L_0x05ac
        L_0x0583:
            X.0ve r14 = r7.A0A     // Catch:{ all -> 0x0cf7 }
            X.11P r0 = r7.A02     // Catch:{ all -> 0x0cf7 }
            X.C18070vi.A0h(r14, r0)     // Catch:{ all -> 0x0cf7 }
            java.lang.Long r0 = r5.A0U     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x05ac
            long r22 = r0.longValue()     // Catch:{ all -> 0x0cf7 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cf7 }
            long r0 = r0 - r22
            long r22 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x0cf7 }
            r1 = 1698(0x6a2, float:2.38E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0cf7 }
            int r0 = X.C18020vd.A00(r0, r14, r1)     // Catch:{ all -> 0x0cf7 }
            long r0 = (long) r0     // Catch:{ all -> 0x0cf7 }
            int r14 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x05ac
            r2 = 6
            goto L_0x0733
        L_0x05ac:
            boolean r0 = X.C22971Dz.A0e(r15)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x05fa
            if (r11 == 0) goto L_0x05fa
            X.1M9 r0 = r7.A01     // Catch:{ all -> 0x0cf7 }
            X.1E7 r14 = r0.A0E(r11)     // Catch:{ all -> 0x0cf7 }
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR     // Catch:{ all -> 0x0cf7 }
            X.1EC r1 = X.C42941yz.A00(r11)     // Catch:{ all -> 0x0cf7 }
            X.1MZ r0 = r7.A05     // Catch:{ all -> 0x0cf7 }
            boolean r15 = r0.A0J(r11)     // Catch:{ all -> 0x0cf7 }
            if (r15 != 0) goto L_0x05cb
            r2 = 2
            goto L_0x0733
        L_0x05cb:
            boolean r0 = r0.A0L(r11, r3)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x05d4
            r2 = 3
            goto L_0x0733
        L_0x05d4:
            if (r14 == 0) goto L_0x05fa
            if (r2 == 0) goto L_0x05fa
            if (r1 == 0) goto L_0x05fa
            X.1Ln r11 = r7.A07     // Catch:{ all -> 0x0cf7 }
            r0 = 0
            X.C18070vi.A0d(r10, r0)     // Catch:{ all -> 0x0cf7 }
            r0 = 2
            X.C18070vi.A0d(r11, r0)     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass25A.A08(r10, r5)     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass25A.A08(r10, r9)     // Catch:{ all -> 0x0cf7 }
            int r0 = r5.A0C()     // Catch:{ all -> 0x0cf7 }
            if (r13 != r0) goto L_0x0601
            if (r3 == 0) goto L_0x0601
            boolean r0 = r11.A0Q(r3, r10)     // Catch:{ all -> 0x0cf7 }
            if (r0 == 0) goto L_0x0601
        L_0x05fa:
            X.1Cd r0 = r7.A06     // Catch:{ all -> 0x0cf7 }
            X.1au r3 = r0.A05()     // Catch:{ all -> 0x0cf7 }
            goto L_0x0652
        L_0x0601:
            X.00H r0 = r7.A0C     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0cf7 }
            X.2eM r10 = (X.C54572eM) r10     // Catch:{ all -> 0x0cf7 }
            X.00H r0 = r10.A02     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0cf7 }
            X.1xo r3 = (X.C42211xo) r3     // Catch:{ all -> 0x0cf7 }
            X.1MZ r0 = r10.A00     // Catch:{ all -> 0x0cf7 }
            boolean r15 = r0.A0L(r1, r2)     // Catch:{ all -> 0x0cf7 }
            boolean r11 = r0.A0Q(r1, r2)     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r3.A00(r14)     // Catch:{ all -> 0x0cf7 }
            if (r15 == 0) goto L_0x0626
            if (r11 == 0) goto L_0x0626
            if (r0 != 0) goto L_0x0626
            goto L_0x05fa
        L_0x0626:
            X.1Pu r3 = r10.A01     // Catch:{ all -> 0x0cf7 }
            X.1MZ r0 = r3.A01     // Catch:{ all -> 0x0cf7 }
            boolean r10 = r0.A0L(r1, r2)     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.A0Q(r1, r2)     // Catch:{ all -> 0x0cf7 }
            if (r10 == 0) goto L_0x0732
            if (r0 != 0) goto L_0x063a
            boolean r0 = r14.A13     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x0732
        L_0x063a:
            X.1CJ r0 = r3.A00     // Catch:{ all -> 0x0cf7 }
            int r1 = r0.A06(r1)     // Catch:{ all -> 0x0cf7 }
            r0 = 3
            if (r1 == r0) goto L_0x0732
            X.00H r0 = r3.A02     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0cf7 }
            X.1xo r0 = (X.C42211xo) r0     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.A00(r14)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x0732
            goto L_0x05fa
        L_0x0652:
            X.1xA r14 = r3.BD0()     // Catch:{ all -> 0x072c }
            r10 = 0
            if (r8 == 0) goto L_0x065a
            goto L_0x065c
        L_0x065a:
            r1 = 0
            goto L_0x065e
        L_0x065c:
            int r1 = r8.A00     // Catch:{ all -> 0x0722 }
        L_0x065e:
            int r0 = r9.A01     // Catch:{ all -> 0x0722 }
            r2 = 1
            if (r0 != r2) goto L_0x0664
            r10 = 1
        L_0x0664:
            int r1 = r1 + r10
            r9.A00 = r1     // Catch:{ all -> 0x0722 }
            if (r31 == 0) goto L_0x0678
            if (r8 == 0) goto L_0x0678
            long r0 = r8.A02     // Catch:{ all -> 0x0722 }
            long r10 = r9.A02     // Catch:{ all -> 0x0722 }
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x0678
            r10 = 1
            long r0 = r0 + r10
            r9.A02 = r0     // Catch:{ all -> 0x0722 }
        L_0x0678:
            long r12 = r12.A00(r9)     // Catch:{ all -> 0x0722 }
            r10 = -1
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x06a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0722 }
            r1.<init>()     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/storeFMessageKeepInChatIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0722 }
            X.205 r0 = r9.A0v     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0722 }
            r1.append(r0)     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0722 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0722 }
            r14.close()     // Catch:{ all -> 0x072c }
            r3.close()     // Catch:{ all -> 0x0cf7 }
            goto L_0x089c
        L_0x06a2:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0722 }
            r10.<init>()     // Catch:{ all -> 0x0722 }
            java.lang.String r1 = "message_add_on_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0722 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0722 }
            int r0 = r9.A01     // Catch:{ all -> 0x0722 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = "keep_in_chat_state"
            r10.put(r0, r1)     // Catch:{ all -> 0x0722 }
            long r0 = r9.A02     // Catch:{ all -> 0x0722 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = "sender_timestamp"
            r10.put(r0, r1)     // Catch:{ all -> 0x0722 }
            int r0 = r9.A00     // Catch:{ all -> 0x0722 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = "keep_count"
            r10.put(r0, r1)     // Catch:{ all -> 0x0722 }
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = "actor_device_jid_row_id"
            r10.put(r0, r1)     // Catch:{ all -> 0x0722 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0722 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0722 }
            java.lang.String r1 = "MessageAddOnKeepInChatStore/insertMessageAddOnKeepInChat"
            java.lang.String r0 = "message_add_on_keep_in_chat"
            r11.A06(r0, r1, r10)     // Catch:{ all -> 0x0722 }
            X.C63892tr.A05(r5, r9)     // Catch:{ all -> 0x0722 }
            X.1Qz r0 = r7.A04     // Catch:{ all -> 0x0722 }
            r0.A09(r5)     // Catch:{ all -> 0x0722 }
            r1 = 4
            boolean r0 = r5.A10(r1)     // Catch:{ all -> 0x0722 }
            if (r0 != 0) goto L_0x06ff
            r5.A0W(r1)     // Catch:{ all -> 0x0722 }
            X.121 r0 = r7.A03     // Catch:{ all -> 0x0722 }
            r0.CQv(r5)     // Catch:{ all -> 0x0722 }
        L_0x06ff:
            X.1RU r0 = r7.A0B     // Catch:{ all -> 0x0722 }
            r0.BjL(r3, r5)     // Catch:{ all -> 0x0722 }
            X.121 r0 = r7.A03     // Catch:{ all -> 0x0722 }
            X.122 r0 = (X.AnonymousClass122) r0     // Catch:{ all -> 0x0722 }
            X.1Q6 r0 = r0.A0R     // Catch:{ all -> 0x0722 }
            r0.A0B(r5)     // Catch:{ all -> 0x0722 }
            r14.A00()     // Catch:{ all -> 0x0722 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0722 }
            r7.A00(r5, r9, r0, r0)     // Catch:{ all -> 0x0722 }
            if (r8 == 0) goto L_0x071a
            r2 = 2
        L_0x071a:
            r14.close()     // Catch:{ all -> 0x072c }
            r3.close()     // Catch:{ all -> 0x0cf7 }
            goto L_0x0f9e
        L_0x0722:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0727 }
            goto L_0x072b
        L_0x0727:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x072c }
        L_0x072b:
            throw r1     // Catch:{ all -> 0x072c }
        L_0x072c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0912 }
            goto L_0x0916
        L_0x0732:
            r2 = 7
        L_0x0733:
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            int r0 = r9.A01     // Catch:{ all -> 0x0cf7 }
            if (r0 == r13) goto L_0x073d
            r13 = 0
        L_0x073d:
            int r0 = X.AnonymousClass4W2.A00(r2, r13)     // Catch:{ all -> 0x0cf7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cf7 }
            r7.A00(r5, r9, r1, r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x089c
        L_0x074a:
            boolean r0 = r4 instanceof X.AnonymousClass22C     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0917
            X.1WF r7 = r6.A0B     // Catch:{ all -> 0x103e }
            r10 = r4
            X.22C r10 = (X.AnonymousClass22C) r10     // Catch:{ all -> 0x103e }
            monitor-enter(r7)     // Catch:{ all -> 0x103e }
            X.205 r9 = r10.A0v     // Catch:{ all -> 0x0cf7 }
            X.1BI r12 = r9.A00     // Catch:{ all -> 0x0cf7 }
            r1 = 1
            if (r12 != 0) goto L_0x0762
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat newPinInChatMessage has null chatJid"
        L_0x075d:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x089c
        L_0x0762:
            boolean r0 = r5 instanceof X.C445823z     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x077e
            int r0 = r10.A00     // Catch:{ all -> 0x0cf7 }
            if (r0 != r1) goto L_0x077e
            boolean r0 = r9.A02     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x077e
            int r1 = r10.A17()     // Catch:{ all -> 0x0cf7 }
            int r0 = X.AnonymousClass1WF.A0B     // Catch:{ all -> 0x0cf7 }
            if (r1 <= r0) goto L_0x0779
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat expiry duration longer than 60 days"
            goto L_0x075d
        L_0x0779:
            if (r1 > 0) goto L_0x077e
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat expiry duration shorter than 0"
            goto L_0x075d
        L_0x077e:
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0cf7 }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x078b
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat newPinInChatMessage and parentMessage does not have same chatJid"
            goto L_0x075d
        L_0x078b:
            X.00H r2 = r7.A06     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x0cf7 }
            X.4XQ r1 = (X.AnonymousClass4XQ) r1     // Catch:{ all -> 0x0cf7 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r1.A01(r5, r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x07c9
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0cf7 }
            X.4XQ r0 = (X.AnonymousClass4XQ) r0     // Catch:{ all -> 0x0cf7 }
            X.0vl r0 = r0.A03     // Catch:{ all -> 0x0cf7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0cf7 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x0cf7 }
            int r1 = r5.A0u     // Catch:{ all -> 0x0cf7 }
            X.20A r0 = r0.A00(r1)     // Catch:{ all -> 0x0cf7 }
            X.20q r0 = (X.C437120q) r0     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r0.CS5()     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x07c9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cf7 }
            r2.<init>()     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat message type not pinnable:"
            r2.append(r0)     // Catch:{ all -> 0x0cf7 }
            r2.append(r1)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0cf7 }
            goto L_0x075d
        L_0x07c9:
            X.11m r11 = r7.A03     // Catch:{ all -> 0x0cf7 }
            r0 = 79
            X.212 r2 = r11.A06(r5, r0)     // Catch:{ all -> 0x0cf7 }
            r8 = 0
            if (r2 == 0) goto L_0x0830
            boolean r0 = r2 instanceof X.AnonymousClass22C     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x07ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cf7 }
            r1.<init>()     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = "MessageAddOnPinInChatManager/getMessageAddOnPinInChatForParentMessage Unexpected FMessage "
            r1.append(r0)     // Catch:{ all -> 0x0cf7 }
            r1.append(r2)     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0cf7 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0cf7 }
            goto L_0x0830
        L_0x07ed:
            X.22C r2 = (X.AnonymousClass22C) r2     // Catch:{ all -> 0x0cf7 }
            r8 = r2
            if (r2 == 0) goto L_0x0830
            if (r31 != 0) goto L_0x0832
            long r2 = r2.A03     // Catch:{ all -> 0x0cf7 }
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x07fe
            long r2 = r8.A0I     // Catch:{ all -> 0x0cf7 }
        L_0x07fe:
            long r0 = r10.A03     // Catch:{ all -> 0x0cf7 }
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0806
            long r0 = r10.A0I     // Catch:{ all -> 0x0cf7 }
        L_0x0806:
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x082d
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x0848
            long r2 = r8.A01     // Catch:{ all -> 0x0cf7 }
            long r0 = r10.A01     // Catch:{ all -> 0x0cf7 }
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x082d
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x0848
            X.205 r0 = r8.A0v     // Catch:{ all -> 0x0cf7 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0cf7 }
            if (r1 != 0) goto L_0x0825
            if (r0 != 0) goto L_0x082d
            goto L_0x0848
        L_0x0825:
            if (r0 == 0) goto L_0x0848
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 <= 0) goto L_0x0848
        L_0x082d:
            monitor-exit(r7)     // Catch:{ all -> 0x103e }
            goto L_0x0e59
        L_0x0830:
            if (r31 == 0) goto L_0x0848
        L_0x0832:
            if (r8 == 0) goto L_0x0848
            boolean r1 = r9.A02     // Catch:{ all -> 0x0cf7 }
            java.lang.String r0 = "MessageAddOnPinInChatManager/updateSenderTimestampIfNeeded"
            X.C17960vV.A0G(r1, r0)     // Catch:{ all -> 0x0cf7 }
            long r0 = r8.A01     // Catch:{ all -> 0x0cf7 }
            long r2 = r10.A01     // Catch:{ all -> 0x0cf7 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 < 0) goto L_0x0848
            r2 = 1
            long r0 = r0 + r2
            r10.A01 = r0     // Catch:{ all -> 0x0cf7 }
        L_0x0848:
            X.1Cd r0 = r7.A02     // Catch:{ all -> 0x0cf7 }
            X.1au r15 = r0.A05()     // Catch:{ all -> 0x0cf7 }
            X.1xA r3 = r15.BD0()     // Catch:{ all -> 0x090d }
            if (r8 == 0) goto L_0x0876
            long r0 = r8.A0x     // Catch:{ all -> 0x0903 }
            r11.A08(r0)     // Catch:{ all -> 0x0903 }
            X.00H r2 = r7.A04     // Catch:{ all -> 0x0903 }
            r2.get()     // Catch:{ all -> 0x0903 }
            r13 = 0
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0903 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0903 }
            r2[r13] = r0     // Catch:{ all -> 0x0903 }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0903 }
            X.1Ev r14 = r0.A02     // Catch:{ all -> 0x0903 }
            java.lang.String r13 = "message_add_on_pin_in_chat"
            java.lang.String r1 = "MessageAddOnPinInChatStore/deleteMessageAddOnPinInChat"
            java.lang.String r0 = "message_add_on_row_id = ?"
            r14.A04(r13, r0, r1, r2)     // Catch:{ all -> 0x0903 }
        L_0x0876:
            long r13 = r11.A00(r10)     // Catch:{ all -> 0x0903 }
            r1 = -1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x089f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0903 }
            r1.<init>()     // Catch:{ all -> 0x0903 }
            java.lang.String r0 = "MessageAddOnPinInChatManager/storeFMessagePinInChatWithSystemMessageIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0903 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0903 }
            r1.append(r0)     // Catch:{ all -> 0x0903 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0903 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0903 }
            r3.close()     // Catch:{ all -> 0x090d }
            r15.close()     // Catch:{ all -> 0x0cf7 }
        L_0x089c:
            monitor-exit(r7)     // Catch:{ all -> 0x103e }
            goto L_0x0f9c
        L_0x089f:
            X.00H r0 = r7.A04     // Catch:{ all -> 0x0903 }
            r0.get()     // Catch:{ all -> 0x0903 }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0903 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0903 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0903 }
            r2.<init>()     // Catch:{ all -> 0x0903 }
            java.lang.String r1 = "message_add_on_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0903 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0903 }
            int r0 = r10.A00     // Catch:{ all -> 0x0903 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0903 }
            java.lang.String r0 = "pin_in_chat_state"
            r2.put(r0, r1)     // Catch:{ all -> 0x0903 }
            long r0 = r10.A01     // Catch:{ all -> 0x0903 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0903 }
            java.lang.String r0 = "sender_timestamp"
            r2.put(r0, r1)     // Catch:{ all -> 0x0903 }
            java.lang.String r1 = "MessageAddOnPinInChatStore/insertMessageAddOnPinInChat"
            java.lang.String r0 = "message_add_on_pin_in_chat"
            r9.A06(r0, r1, r2)     // Catch:{ all -> 0x0903 }
            r7.A02(r3, r5, r10)     // Catch:{ all -> 0x0903 }
            r3.A00()     // Catch:{ all -> 0x0903 }
            if (r31 == 0) goto L_0x08e6
            X.11S r0 = r7.A00     // Catch:{ all -> 0x0903 }
            boolean r0 = r0.A0O(r12)     // Catch:{ all -> 0x0903 }
            if (r0 != 0) goto L_0x08e6
            goto L_0x08f7
        L_0x08e6:
            int r0 = r10.A00     // Catch:{ all -> 0x0903 }
            r1 = 1
            if (r0 != r1) goto L_0x08f7
            if (r8 == 0) goto L_0x08f4
            int r0 = r8.A00     // Catch:{ all -> 0x0903 }
            r2 = 9
            if (r0 != r1) goto L_0x08fb
            goto L_0x08fa
        L_0x08f4:
            r2 = 8
            goto L_0x08fb
        L_0x08f7:
            r2 = 1
            if (r8 == 0) goto L_0x08fb
        L_0x08fa:
            r2 = 2
        L_0x08fb:
            r3.close()     // Catch:{ all -> 0x090d }
            r15.close()     // Catch:{ all -> 0x0cf7 }
            goto L_0x0f9e
        L_0x0903:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0908 }
            goto L_0x090c
        L_0x0908:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x090d }
        L_0x090c:
            throw r1     // Catch:{ all -> 0x090d }
        L_0x090d:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0912 }
            goto L_0x0916
        L_0x0912:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0cf7 }
        L_0x0916:
            throw r1     // Catch:{ all -> 0x0cf7 }
        L_0x0917:
            boolean r0 = r4 instanceof X.AnonymousClass22E     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0cfa
            r3 = r5
            X.22H r3 = (X.AnonymousClass22H) r3     // Catch:{ all -> 0x103e }
            java.util.List r0 = r3.A17()     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x092d
            r0 = 67
            java.util.ArrayList r0 = r6.A0D(r3, r0)     // Catch:{ all -> 0x103e }
            r3.A19(r0)     // Catch:{ all -> 0x103e }
        L_0x092d:
            X.1Qm r0 = r6.A0J     // Catch:{ all -> 0x103e }
            com.whatsapp.jid.UserJid r13 = r0.A01(r5)     // Catch:{ all -> 0x103e }
            X.1WB r2 = r6.A0C     // Catch:{ all -> 0x103e }
            r8 = r4
            X.22E r8 = (X.AnonymousClass22E) r8     // Catch:{ all -> 0x103e }
            int r0 = r3.A00     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x0bef
            if (r31 != 0) goto L_0x09d2
            X.205 r1 = r8.A0v     // Catch:{ all -> 0x103e }
            X.1BI r12 = r1.A00     // Catch:{ all -> 0x103e }
            X.0ve r9 = r2.A08     // Catch:{ all -> 0x103e }
            X.0vf r7 = X.C18040vf.A01     // Catch:{ all -> 0x103e }
            r0 = 6772(0x1a74, float:9.49E-42)
            boolean r0 = X.C18020vd.A05(r7, r9, r0)     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x09d2
            com.whatsapp.wamsys.JniBridge r0 = r2.A0B     // Catch:{ all -> 0x103e }
            r24 = r0
            byte[] r15 = r3.A1D     // Catch:{ all -> 0x103e }
            java.util.List r0 = r3.A07     // Catch:{ all -> 0x103e }
            r26 = r0
            int r11 = r3.A02     // Catch:{ all -> 0x103e }
            byte[] r10 = r8.A04     // Catch:{ all -> 0x103e }
            byte[] r9 = r8.A03     // Catch:{ all -> 0x103e }
            X.205 r0 = r3.A0v     // Catch:{ all -> 0x103e }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x103e }
            r25 = r0
            boolean r7 = r1.A02     // Catch:{ all -> 0x103e }
            if (r7 == 0) goto L_0x09b6
            X.11S r14 = r2.A00     // Catch:{ all -> 0x103e }
            X.1CJ r1 = r2.A01     // Catch:{ all -> 0x103e }
            X.1MZ r0 = r2.A03     // Catch:{ all -> 0x103e }
            boolean r0 = r0.A0I(r12)     // Catch:{ all -> 0x103e }
            com.whatsapp.jid.UserJid r23 = X.A3W.A00(r14, r1, r12, r0)     // Catch:{ all -> 0x103e }
        L_0x0976:
            r22 = r13
            r27 = r15
            r28 = r10
            r29 = r9
            r30 = r11
            X.9Yn r0 = A03(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x09c8
            X.1Ln r0 = r2.A05     // Catch:{ all -> 0x103e }
            com.whatsapp.jid.UserJid r22 = r0.A0F(r13)     // Catch:{ all -> 0x103e }
            byte[] r11 = r3.A1D     // Catch:{ all -> 0x103e }
            int r10 = r3.A02     // Catch:{ all -> 0x103e }
            byte[] r9 = r8.A04     // Catch:{ all -> 0x103e }
            byte[] r1 = r8.A03     // Catch:{ all -> 0x103e }
            if (r7 == 0) goto L_0x09b1
            X.11S r13 = r2.A00     // Catch:{ all -> 0x103e }
            X.1CJ r7 = r2.A01     // Catch:{ all -> 0x103e }
            X.1MZ r0 = r2.A03     // Catch:{ all -> 0x103e }
            boolean r0 = r0.A0I(r12)     // Catch:{ all -> 0x103e }
            com.whatsapp.jid.UserJid r23 = X.A3W.A00(r13, r7, r12, r0)     // Catch:{ all -> 0x103e }
        L_0x09a4:
            r27 = r11
            r28 = r9
            r29 = r1
            r30 = r10
            X.9Yn r0 = A03(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x103e }
            goto L_0x09bb
        L_0x09b1:
            com.whatsapp.jid.UserJid r23 = r8.A0I()     // Catch:{ all -> 0x103e }
            goto L_0x09a4
        L_0x09b6:
            com.whatsapp.jid.UserJid r23 = r8.A0I()     // Catch:{ all -> 0x103e }
            goto L_0x0976
        L_0x09bb:
            if (r0 != 0) goto L_0x09c8
            X.1W9 r2 = r2.A0A     // Catch:{ all -> 0x103e }
            r1 = 3
            r0 = 38
            r2.A02(r1, r0)     // Catch:{ all -> 0x103e }
            r2 = 6
            goto L_0x0bf0
        L_0x09c8:
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x103e }
            java.util.List r0 = r8.A06     // Catch:{ all -> 0x103e }
            r0.clear()     // Catch:{ all -> 0x103e }
            r0.addAll(r1)     // Catch:{ all -> 0x103e }
        L_0x09d2:
            java.lang.Object r0 = r2.A0C     // Catch:{ all -> 0x103e }
            r27 = r0
            monitor-enter(r27)     // Catch:{ all -> 0x103e }
            X.1BI r0 = r8.A0H()     // Catch:{ all -> 0x0beb }
            X.205 r12 = r8.A0v     // Catch:{ all -> 0x0beb }
            boolean r9 = r12.A02     // Catch:{ all -> 0x0beb }
            X.22E r7 = X.AnonymousClass1WB.A00(r2, r0, r3, r9)     // Catch:{ all -> 0x0beb }
            if (r7 != 0) goto L_0x09ff
            X.1BI r1 = r8.A0H()     // Catch:{ all -> 0x0beb }
            boolean r0 = X.C22971Dz.A0d(r1)     // Catch:{ all -> 0x0beb }
            if (r0 == 0) goto L_0x0a1f
            X.1Ln r0 = r2.A05     // Catch:{ all -> 0x0beb }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0beb }
            com.whatsapp.jid.UserJid r0 = r0.A0F(r1)     // Catch:{ all -> 0x0beb }
            if (r0 == 0) goto L_0x0a1f
            X.22E r7 = X.AnonymousClass1WB.A00(r2, r0, r3, r9)     // Catch:{ all -> 0x0beb }
            if (r7 == 0) goto L_0x0a1f
        L_0x09ff:
            if (r31 == 0) goto L_0x0a13
            java.lang.String r0 = "MessageAddOnPollVoteManager/adjustSenderClientTimestamp"
            X.C17960vV.A0G(r9, r0)     // Catch:{ all -> 0x0beb }
            long r0 = r7.A00     // Catch:{ all -> 0x0beb }
            long r10 = r8.A00     // Catch:{ all -> 0x0beb }
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a13
            r10 = 1
            long r0 = r0 + r10
            r8.A00 = r0     // Catch:{ all -> 0x0beb }
        L_0x0a13:
            long r10 = r7.A00     // Catch:{ all -> 0x0beb }
            long r0 = r8.A00     // Catch:{ all -> 0x0beb }
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a1f
            monitor-exit(r27)     // Catch:{ all -> 0x0beb }
            r2 = 5
            goto L_0x0bf0
        L_0x0a1f:
            X.1Cd r0 = r2.A04     // Catch:{ all -> 0x0beb }
            r29 = r0
            X.1au r26 = r29.A05()     // Catch:{ all -> 0x0beb }
            X.1xA r25 = r26.BD0()     // Catch:{ all -> 0x0be1 }
            if (r7 == 0) goto L_0x0a34
            long r0 = r7.A0x     // Catch:{ all -> 0x0bd7 }
            X.11m r10 = r2.A07     // Catch:{ all -> 0x0bd7 }
            r10.A08(r0)     // Catch:{ all -> 0x0bd7 }
        L_0x0a34:
            if (r9 != 0) goto L_0x0a59
            X.205 r0 = r3.A0v     // Catch:{ all -> 0x0bd7 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0bd7 }
            r1 = 17
            if (r0 == 0) goto L_0x0a56
            java.util.List r0 = r8.A06     // Catch:{ all -> 0x0bd7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0bd7 }
            if (r0 != 0) goto L_0x0a56
            if (r7 == 0) goto L_0x0a59
            java.util.List r0 = r7.A06     // Catch:{ all -> 0x0bd7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0bd7 }
            if (r0 != 0) goto L_0x0a59
            int r0 = r7.A0D()     // Catch:{ all -> 0x0bd7 }
            if (r0 != r1) goto L_0x0a59
        L_0x0a56:
            r8.A0a(r1)     // Catch:{ all -> 0x0bd7 }
        L_0x0a59:
            X.11m r0 = r2.A07     // Catch:{ all -> 0x0bd7 }
            long r0 = r0.A00(r8)     // Catch:{ all -> 0x0bd7 }
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0a84
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bd7 }
            r1.<init>()     // Catch:{ all -> 0x0bd7 }
            java.lang.String r0 = "MessageAddOnPollVoteManager/storeFMessagePollVoteIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0bd7 }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x0bd7 }
            r1.append(r0)     // Catch:{ all -> 0x0bd7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0bd7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0bd7 }
            r25.close()     // Catch:{ all -> 0x0be1 }
            r26.close()     // Catch:{ all -> 0x0beb }
            r2 = 7
            goto L_0x0bb2
        L_0x0a84:
            r8.A0x = r0     // Catch:{ all -> 0x0bd7 }
            X.1xA r24 = r26.BD0()     // Catch:{ all -> 0x0bd7 }
            r9 = 3
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0bcd }
            r14.<init>(r9)     // Catch:{ all -> 0x0bcd }
            java.lang.String r13 = "message_add_on_row_id"
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0bcd }
            r14.put(r13, r12)     // Catch:{ all -> 0x0bcd }
            java.lang.String r11 = "sender_timestamp"
            long r9 = r8.A00     // Catch:{ all -> 0x0bcd }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0bcd }
            r14.put(r11, r9)     // Catch:{ all -> 0x0bcd }
            r9 = r26
            X.1av r9 = (X.C28801av) r9     // Catch:{ all -> 0x0bcd }
            X.1Ev r10 = r9.A02     // Catch:{ all -> 0x0bcd }
            java.lang.String r15 = "message_add_on_poll_vote"
            java.lang.String r9 = "MessageAddOnPollVoteStore/insertMessageAddOnPollVote"
            r11 = 0
            r10.A06(r15, r9, r14)     // Catch:{ all -> 0x0bcd }
            X.1xA r23 = r26.BD0()     // Catch:{ all -> 0x0bcd }
            r14 = 1
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ all -> 0x0bc3 }
            r14 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0bc3 }
            r15[r14] = r0     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = "message_add_on_row_id = ?"
            java.lang.String r0 = "MessageAddOnPollVoteStore/deletePollVoteSelectedOptions"
            java.lang.String r14 = "message_add_on_poll_vote_selected_option"
            r10.A04(r14, r1, r0, r15)     // Catch:{ all -> 0x0bc3 }
            java.util.List r0 = r8.A06     // Catch:{ all -> 0x0bc3 }
            r28 = r0
            boolean r0 = r28.isEmpty()     // Catch:{ all -> 0x0bc3 }
            if (r0 != 0) goto L_0x0af6
            java.util.Iterator r22 = r28.iterator()     // Catch:{ all -> 0x0bc3 }
        L_0x0ad8:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x0af6
            java.lang.Object r15 = r22.next()     // Catch:{ all -> 0x0bc3 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0bc3 }
            r0 = 2
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0bc3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0bc3 }
            r1.put(r13, r12)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = "message_poll_option_id"
            r1.put(r0, r15)     // Catch:{ all -> 0x0bc3 }
            r10.A06(r14, r9, r1)     // Catch:{ all -> 0x0bc3 }
            goto L_0x0ad8
        L_0x0af6:
            r23.A00()     // Catch:{ all -> 0x0bc3 }
            r23.close()     // Catch:{ all -> 0x0bcd }
            r24.A00()     // Catch:{ all -> 0x0bcd }
            r24.close()     // Catch:{ all -> 0x0bd7 }
            java.util.List r0 = r3.A17()     // Catch:{ all -> 0x0bd7 }
            X.1au r22 = r29.A05()     // Catch:{ all -> 0x0bd7 }
            X.1xA r15 = r22.BD0()     // Catch:{ all -> 0x0bbe }
            if (r0 != 0) goto L_0x0b39
            r9 = 2
            boolean r0 = r3.A10(r9)     // Catch:{ all -> 0x0bb4 }
            if (r0 != 0) goto L_0x0b7c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0bb4 }
            r1.<init>()     // Catch:{ all -> 0x0bb4 }
            r1.add(r8)     // Catch:{ all -> 0x0bb4 }
            r0 = r28
            X.AnonymousClass1WB.A02(r3, r1, r0, r11)     // Catch:{ all -> 0x0bb4 }
            r3.A0W(r9)     // Catch:{ all -> 0x0bb4 }
            X.121 r1 = r2.A02     // Catch:{ all -> 0x0bb4 }
            r1.CQv(r3)     // Catch:{ all -> 0x0bb4 }
            X.2mH r0 = r2.A09     // Catch:{ all -> 0x0bb4 }
            r0.A02(r3)     // Catch:{ all -> 0x0bb4 }
            X.122 r1 = (X.AnonymousClass122) r1     // Catch:{ all -> 0x0bb4 }
            X.1Q6 r0 = r1.A0R     // Catch:{ all -> 0x0bb4 }
            r0.A0B(r3)     // Catch:{ all -> 0x0bb4 }
            goto L_0x0b7c
        L_0x0b39:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0bb4 }
            r12.<init>(r0)     // Catch:{ all -> 0x0bb4 }
            if (r7 == 0) goto L_0x0b66
            goto L_0x0b80
        L_0x0b41:
            X.205 r1 = r7.A0v     // Catch:{ all -> 0x0bb4 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0bb4 }
            if (r1 != 0) goto L_0x0b86
            com.whatsapp.jid.UserJid r1 = r0.A0I()     // Catch:{ all -> 0x0bb4 }
            if (r1 == 0) goto L_0x0b86
            com.whatsapp.jid.UserJid r9 = r0.A0I()     // Catch:{ all -> 0x0bb4 }
            com.whatsapp.jid.UserJid r1 = r7.A0I()     // Catch:{ all -> 0x0bb4 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0bb4 }
            if (r1 == 0) goto L_0x0b86
        L_0x0b5b:
            long r9 = r0.A02     // Catch:{ all -> 0x0bb4 }
            long r0 = r7.A02     // Catch:{ all -> 0x0bb4 }
            int r14 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0b86
            r13.remove()     // Catch:{ all -> 0x0bb4 }
        L_0x0b66:
            r12.add(r8)     // Catch:{ all -> 0x0bb4 }
            r0 = r28
            X.AnonymousClass1WB.A02(r3, r12, r0, r11)     // Catch:{ all -> 0x0bb4 }
            X.2mH r0 = r2.A09     // Catch:{ all -> 0x0bb4 }
            r0.A02(r3)     // Catch:{ all -> 0x0bb4 }
            X.121 r0 = r2.A02     // Catch:{ all -> 0x0bb4 }
            X.122 r0 = (X.AnonymousClass122) r0     // Catch:{ all -> 0x0bb4 }
            X.1Q6 r0 = r0.A0R     // Catch:{ all -> 0x0bb4 }
            r0.A0B(r3)     // Catch:{ all -> 0x0bb4 }
        L_0x0b7c:
            r15.A00()     // Catch:{ all -> 0x0bb4 }
            goto L_0x0b9f
        L_0x0b80:
            java.util.List r11 = r7.A06     // Catch:{ all -> 0x0bb4 }
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x0bb4 }
        L_0x0b86:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0bb4 }
            if (r0 == 0) goto L_0x0b66
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0bb4 }
            X.212 r0 = (X.AnonymousClass212) r0     // Catch:{ all -> 0x0bb4 }
            X.205 r1 = r0.A0v     // Catch:{ all -> 0x0bb4 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0bb4 }
            if (r1 == 0) goto L_0x0b41
            X.205 r1 = r7.A0v     // Catch:{ all -> 0x0bb4 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0bb4 }
            if (r1 != 0) goto L_0x0b5b
            goto L_0x0b86
        L_0x0b9f:
            r15.close()     // Catch:{ all -> 0x0bbe }
            r22.close()     // Catch:{ all -> 0x0bd7 }
            r25.A00()     // Catch:{ all -> 0x0bd7 }
            r25.close()     // Catch:{ all -> 0x0be1 }
            r26.close()     // Catch:{ all -> 0x0beb }
            r2 = 2
            if (r7 != 0) goto L_0x0bb2
            r2 = 1
        L_0x0bb2:
            monitor-exit(r27)     // Catch:{ all -> 0x0beb }
            goto L_0x0bf0
        L_0x0bb4:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0bb9 }
            goto L_0x0bbd
        L_0x0bb9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bbe }
        L_0x0bbd:
            throw r1     // Catch:{ all -> 0x0bbe }
        L_0x0bbe:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0bd2 }
            goto L_0x0bd6
        L_0x0bc3:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0bc8 }
            goto L_0x0bcc
        L_0x0bc8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bcd }
        L_0x0bcc:
            throw r1     // Catch:{ all -> 0x0bcd }
        L_0x0bcd:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0bd2 }
            goto L_0x0bd6
        L_0x0bd2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bd7 }
        L_0x0bd6:
            throw r1     // Catch:{ all -> 0x0bd7 }
        L_0x0bd7:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x0bdc }
            goto L_0x0be0
        L_0x0bdc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0be1 }
        L_0x0be0:
            throw r1     // Catch:{ all -> 0x0be1 }
        L_0x0be1:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0be6 }
            goto L_0x0bea
        L_0x0be6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0beb }
        L_0x0bea:
            throw r1     // Catch:{ all -> 0x0beb }
        L_0x0beb:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x0beb }
            goto L_0x0cf9
        L_0x0bef:
            r2 = 7
        L_0x0bf0:
            X.AnonymousClass1WB.A01(r3, r8)     // Catch:{ all -> 0x103e }
            X.1WK r7 = r6.A0Q     // Catch:{ all -> 0x103e }
            monitor-enter(r7)     // Catch:{ all -> 0x103e }
            long r0 = r3.A04     // Catch:{ all -> 0x0cf7 }
            boolean r9 = r7.A02     // Catch:{ all -> 0x0cf7 }
            if (r9 == 0) goto L_0x0f9e
            X.205 r9 = r3.A0v     // Catch:{ all -> 0x0cf7 }
            boolean r10 = r9.A02     // Catch:{ all -> 0x0cf7 }
            if (r10 == 0) goto L_0x0f9e
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0f9e
            r10 = 2
            r11 = 1
            if (r2 == r11) goto L_0x0c10
            if (r2 == r10) goto L_0x0c10
            goto L_0x0f9e
        L_0x0c10:
            java.util.List r8 = r8.A06     // Catch:{ all -> 0x0cf7 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0cf7 }
            if (r8 != 0) goto L_0x0c23
            if (r2 != r11) goto L_0x0c22
            X.1WJ r10 = r7.A01     // Catch:{ all -> 0x0cf7 }
            r8 = 4
            r10.A00(r8, r0)     // Catch:{ all -> 0x0cf7 }
            r10 = 0
            goto L_0x0c23
        L_0x0c22:
            r10 = 1
        L_0x0c23:
            X.1WJ r11 = r7.A01     // Catch:{ all -> 0x0cf7 }
            boolean r0 = r11.A00(r10, r0)     // Catch:{ all -> 0x0cf7 }
            if (r0 != 0) goto L_0x0f9e
            monitor-enter(r7)     // Catch:{ all -> 0x0cf7 }
            X.1BI r12 = r9.A00     // Catch:{ all -> 0x0cf4 }
            long r0 = r3.A0I     // Catch:{ all -> 0x0cf4 }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r0 % r8
            long r0 = r0 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r8
            java.util.List r8 = r3.A17()     // Catch:{ all -> 0x0cf4 }
            if (r8 != 0) goto L_0x0c42
            r24 = 0
            goto L_0x0c46
        L_0x0c42:
            int r24 = r8.size()     // Catch:{ all -> 0x0cf4 }
        L_0x0c46:
            java.util.List r8 = r3.A07     // Catch:{ all -> 0x0cf4 }
            int r23 = r8.size()     // Catch:{ all -> 0x0cf4 }
            long r8 = r3.A04     // Catch:{ all -> 0x0cf4 }
            boolean r22 = X.C22971Dz.A0e(r12)     // Catch:{ all -> 0x0cf4 }
            if (r22 == 0) goto L_0x0c64
            X.1MZ r3 = r7.A00     // Catch:{ all -> 0x0cf4 }
            X.1EC r12 = (X.AnonymousClass1EC) r12     // Catch:{ all -> 0x0cf4 }
            X.1MW r3 = r3.A08     // Catch:{ all -> 0x0cf4 }
            int r3 = r3.A09(r12)     // Catch:{ all -> 0x0cf4 }
            int r15 = X.C64002u3.A03(r3)     // Catch:{ all -> 0x0cf4 }
        L_0x0c62:
            monitor-enter(r11)     // Catch:{ all -> 0x0cf4 }
            goto L_0x0c66
        L_0x0c64:
            r15 = 0
            goto L_0x0c62
        L_0x0c66:
            if (r10 == 0) goto L_0x0c6f
            r3 = 1
            if (r10 == r3) goto L_0x0c6c
            goto L_0x0c72
        L_0x0c6c:
            java.lang.String r12 = "poll_votes_changed"
            goto L_0x0c74
        L_0x0c6f:
            java.lang.String r12 = "poll_votes"
            goto L_0x0c74
        L_0x0c72:
            java.lang.String r12 = "poll_vote_deletes"
        L_0x0c74:
            X.1WI r3 = r11.A00     // Catch:{ all -> 0x0cf1 }
            X.1au r14 = r3.A06()     // Catch:{ all -> 0x0cf1 }
            X.1xA r13 = r14.BD0()     // Catch:{ all -> 0x0ce7 }
            r3 = 6
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0cdd }
            r10.<init>(r3)     // Catch:{ all -> 0x0cdd }
            java.lang.String r3 = "poll_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0cdd }
            r10.put(r3, r8)     // Catch:{ all -> 0x0cdd }
            java.lang.String r8 = "option_count"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0cdd }
            r10.put(r8, r3)     // Catch:{ all -> 0x0cdd }
            java.lang.String r3 = "poll_creation_ds"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0cdd }
            r10.put(r3, r0)     // Catch:{ all -> 0x0cdd }
            java.lang.String r1 = "users_participated"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cdd }
            r10.put(r1, r0)     // Catch:{ all -> 0x0cdd }
            java.lang.String r1 = "is_a_group_flag"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x0cdd }
            r10.put(r1, r0)     // Catch:{ all -> 0x0cdd }
            java.lang.String r1 = "group_size_bucket"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0cdd }
            r10.put(r1, r0)     // Catch:{ all -> 0x0cdd }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cdd }
            r10.put(r12, r0)     // Catch:{ all -> 0x0cdd }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0cdd }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0cdd }
            java.lang.String r1 = "poll_event_logging"
            java.lang.String r0 = "update_poll_action"
            r3.A05(r1, r0, r10)     // Catch:{ all -> 0x0cdd }
            r13.A00()     // Catch:{ all -> 0x0cdd }
            r13.close()     // Catch:{ all -> 0x0ce7 }
            r14.close()     // Catch:{ all -> 0x0cf1 }
            monitor-exit(r11)     // Catch:{ all -> 0x0cf4 }
            monitor-exit(r7)     // Catch:{ all -> 0x0cf7 }
            goto L_0x0f9e
        L_0x0cdd:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0ce2 }
            goto L_0x0ce6
        L_0x0ce2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0ce7 }
        L_0x0ce6:
            throw r1     // Catch:{ all -> 0x0ce7 }
        L_0x0ce7:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0cec }
            goto L_0x0cf0
        L_0x0cec:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0cf1 }
        L_0x0cf0:
            throw r1     // Catch:{ all -> 0x0cf1 }
        L_0x0cf1:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0cf4 }
            throw r0     // Catch:{ all -> 0x0cf4 }
        L_0x0cf4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0cf7 }
            throw r0     // Catch:{ all -> 0x0cf7 }
        L_0x0cf7:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x103e }
        L_0x0cf9:
            throw r0     // Catch:{ all -> 0x103e }
        L_0x0cfa:
            boolean r0 = r4 instanceof X.AnonymousClass213     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0d20
            X.1W8 r0 = r6.A0M     // Catch:{ all -> 0x103e }
            android.util.Pair r9 = r0.A01(r5)     // Catch:{ all -> 0x103e }
            java.lang.Object r0 = r9.first     // Catch:{ all -> 0x103e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x103e }
            int r2 = r0.intValue()     // Catch:{ all -> 0x103e }
            long r0 = r4.A0x     // Catch:{ all -> 0x103e }
            r7 = -1
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0f9f
            java.lang.Object r0 = r9.second     // Catch:{ all -> 0x103e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x103e }
            long r0 = r0.longValue()     // Catch:{ all -> 0x103e }
            r4.A0x = r0     // Catch:{ all -> 0x103e }
            goto L_0x0f9f
        L_0x0d20:
            boolean r0 = r4 instanceof X.C444923q     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0de4
            X.1WL r2 = r6.A0N     // Catch:{ all -> 0x103e }
            r3 = r5
            X.23k r3 = (X.C444323k) r3     // Catch:{ all -> 0x103e }
            r1 = r4
            X.23q r1 = (X.C444923q) r1     // Catch:{ all -> 0x103e }
            X.11m r7 = r2.A02     // Catch:{ all -> 0x103e }
            r0 = 86
            X.212 r9 = r7.A06(r3, r0)     // Catch:{ all -> 0x103e }
            boolean r0 = r9 instanceof X.C444923q     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x0d53
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x103e }
            r8.<init>()     // Catch:{ all -> 0x103e }
            java.lang.String r0 = "MessageAddOnScheduledCallEditManager/getMessageAddOnScheduledCallEditForParentMessage no existing add on fmessage "
            r8.append(r0)     // Catch:{ all -> 0x103e }
            r8.append(r9)     // Catch:{ all -> 0x103e }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x103e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x103e }
        L_0x0d4c:
            X.1Cd r0 = r2.A01     // Catch:{ all -> 0x103e }
            X.1au r13 = r0.A05()     // Catch:{ all -> 0x103e }
            goto L_0x0d5e
        L_0x0d53:
            X.23q r9 = (X.C444923q) r9     // Catch:{ all -> 0x103e }
            if (r9 == 0) goto L_0x0d4c
            X.205 r0 = r3.A0v     // Catch:{ all -> 0x103e }
            X.AnonymousClass1WL.A00(r2, r0, r1)     // Catch:{ all -> 0x103e }
            goto L_0x0e59
        L_0x0d5e:
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x0dda }
            long r10 = r7.A00(r1)     // Catch:{ all -> 0x0dd0 }
            X.00H r0 = r2.A03     // Catch:{ all -> 0x0dd0 }
            r0.get()     // Catch:{ all -> 0x0dd0 }
            r0 = 2
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0dd0 }
            r9.<init>(r0)     // Catch:{ all -> 0x0dd0 }
            java.lang.String r7 = "message_add_on_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0dd0 }
            r9.put(r7, r0)     // Catch:{ all -> 0x0dd0 }
            int r0 = r1.A00     // Catch:{ all -> 0x0dd0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0dd0 }
            java.lang.String r0 = "edit_type"
            r9.put(r0, r7)     // Catch:{ all -> 0x0dd0 }
            int r0 = r1.A01     // Catch:{ all -> 0x0dd0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0dd0 }
            java.lang.String r0 = "message_edit_version"
            r9.put(r0, r7)     // Catch:{ all -> 0x0dd0 }
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0dd0 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0dd0 }
            java.lang.String r7 = "MessageAddOnScheduledCallEditStore/insertMessage"
            java.lang.String r0 = "message_add_on_scheduled_call_edit"
            r8.A06(r0, r7, r9)     // Catch:{ all -> 0x0dd0 }
            X.25F r7 = r3.A00     // Catch:{ all -> 0x0dd0 }
            X.36s r0 = new X.36s     // Catch:{ all -> 0x0dd0 }
            r0.<init>(r1)     // Catch:{ all -> 0x0dd0 }
            r7.A02(r0)     // Catch:{ all -> 0x0dd0 }
            r7 = 16
            boolean r0 = r3.A10(r7)     // Catch:{ all -> 0x0dd0 }
            if (r0 != 0) goto L_0x0db6
            r3.A0W(r7)     // Catch:{ all -> 0x0dd0 }
            X.121 r0 = r2.A00     // Catch:{ all -> 0x0dd0 }
            r0.CQv(r3)     // Catch:{ all -> 0x0dd0 }
        L_0x0db6:
            X.121 r0 = r2.A00     // Catch:{ all -> 0x0dd0 }
            X.122 r0 = (X.AnonymousClass122) r0     // Catch:{ all -> 0x0dd0 }
            X.1Q6 r0 = r0.A0R     // Catch:{ all -> 0x0dd0 }
            r0.A0B(r3)     // Catch:{ all -> 0x0dd0 }
            X.205 r0 = r3.A0v     // Catch:{ all -> 0x0dd0 }
            X.AnonymousClass1WL.A00(r2, r0, r1)     // Catch:{ all -> 0x0dd0 }
            r12.A00()     // Catch:{ all -> 0x0dd0 }
            r2 = 1
            r12.close()     // Catch:{ all -> 0x0dda }
            r13.close()     // Catch:{ all -> 0x103e }
            goto L_0x0f9f
        L_0x0dd0:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0dd5 }
            goto L_0x0dd9
        L_0x0dd5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0dda }
        L_0x0dd9:
            throw r1     // Catch:{ all -> 0x0dda }
        L_0x0dda:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0ddf }
            goto L_0x0de3
        L_0x0ddf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x103e }
        L_0x0de3:
            throw r1     // Catch:{ all -> 0x103e }
        L_0x0de4:
            boolean r0 = r4 instanceof X.AnonymousClass24H     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0f9f
            X.00H r0 = r6.A0S     // Catch:{ all -> 0x103e }
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x103e }
            X.2q9 r8 = (X.C61722q9) r8     // Catch:{ all -> 0x103e }
            r7 = r5
            X.23z r7 = (X.C445823z) r7     // Catch:{ all -> 0x103e }
            r3 = r4
            X.24H r3 = (X.AnonymousClass24H) r3     // Catch:{ all -> 0x103e }
            X.11S r13 = r6.A00     // Catch:{ all -> 0x103e }
            r0 = 0
            X.C18070vi.A0d(r7, r0)     // Catch:{ all -> 0x103e }
            r0 = 1
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x103e }
            r0 = 3
            X.C18070vi.A0d(r13, r0)     // Catch:{ all -> 0x103e }
            java.lang.Integer r1 = r7.A02     // Catch:{ all -> 0x103e }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x103e }
            if (r1 != r0) goto L_0x0f9c
            X.1BI r0 = r3.A0H()     // Catch:{ all -> 0x103e }
            X.205 r12 = r3.A0v     // Catch:{ all -> 0x103e }
            boolean r9 = r12.A02     // Catch:{ all -> 0x103e }
            X.24H r2 = X.C61722q9.A00(r8, r7, r0, r9)     // Catch:{ all -> 0x103e }
            if (r2 != 0) goto L_0x0e37
            X.1BI r10 = r3.A0H()     // Catch:{ all -> 0x103e }
            boolean r0 = X.C22971Dz.A0d(r10)     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0e5c
            X.1Ln r1 = r8.A03     // Catch:{ all -> 0x103e }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r10, r0)     // Catch:{ all -> 0x103e }
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x103e }
            com.whatsapp.jid.UserJid r0 = r1.A0F(r10)     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0e5c
            X.24H r2 = X.C61722q9.A00(r8, r7, r0, r9)     // Catch:{ all -> 0x103e }
            if (r2 == 0) goto L_0x0e5c
        L_0x0e37:
            if (r31 == 0) goto L_0x0e51
            if (r9 == 0) goto L_0x0e51
            long r0 = r2.A01     // Catch:{ all -> 0x103e }
            long r10 = r3.A01     // Catch:{ all -> 0x103e }
            int r14 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0e51
            r10 = 1
            long r0 = r0 + r10
            r3.A01 = r0     // Catch:{ all -> 0x103e }
            X.190 r11 = r8.A00     // Catch:{ all -> 0x103e }
            r10 = 0
            r1 = 0
            java.lang.String r0 = "event_response_timestamp_adjustment"
            r11.A0G(r0, r10, r1)     // Catch:{ all -> 0x103e }
        L_0x0e51:
            long r10 = r2.A01     // Catch:{ all -> 0x103e }
            long r0 = r3.A01     // Catch:{ all -> 0x103e }
            int r14 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x0e5c
        L_0x0e59:
            r2 = 5
            goto L_0x0f9f
        L_0x0e5c:
            X.1Cd r0 = r8.A02     // Catch:{ SQLiteConstraintException -> 0x0f86 }
            X.1au r11 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x0f86 }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x0f7f }
            if (r2 == 0) goto L_0x0e6f
            long r0 = r2.A0x     // Catch:{ all -> 0x0f78 }
            X.11m r14 = r8.A04     // Catch:{ all -> 0x0f78 }
            r14.A08(r0)     // Catch:{ all -> 0x0f78 }
        L_0x0e6f:
            if (r9 != 0) goto L_0x0e90
            X.205 r0 = r7.A0v     // Catch:{ all -> 0x0f78 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0f78 }
            if (r0 == 0) goto L_0x0e90
            r9 = 17
            r14 = 0
            if (r2 == 0) goto L_0x0e83
            int r0 = r2.A0D()     // Catch:{ all -> 0x0f78 }
            if (r0 != r9) goto L_0x0e83
            r14 = 1
        L_0x0e83:
            X.2Qx r1 = r3.A02     // Catch:{ all -> 0x0f78 }
            if (r1 == 0) goto L_0x0e8d
            X.2Qx r0 = X.C49552Qx.A05     // Catch:{ all -> 0x0f78 }
            if (r0 == r1) goto L_0x0e8d
            if (r14 == 0) goto L_0x0e90
        L_0x0e8d:
            r3.A0a(r9)     // Catch:{ all -> 0x0f78 }
        L_0x0e90:
            X.11m r0 = r8.A04     // Catch:{ all -> 0x0f78 }
            long r0 = r0.A00(r3)     // Catch:{ all -> 0x0f78 }
            r22 = -1
            int r9 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r9 != 0) goto L_0x0ea5
            r10.close()     // Catch:{ all -> 0x0f7f }
            r11.close()     // Catch:{ SQLiteConstraintException -> 0x0f86 }
            r2 = 6
            goto L_0x0f9f
        L_0x0ea5:
            r3.A0x = r0     // Catch:{ all -> 0x0f78 }
            X.00H r0 = r8.A05     // Catch:{ all -> 0x0f78 }
            r0.get()     // Catch:{ all -> 0x0f78 }
            r0 = 4
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0f71 }
            r9.<init>(r0)     // Catch:{ all -> 0x0f71 }
            X.2Qx r0 = r3.A02     // Catch:{ all -> 0x0f71 }
            if (r0 != 0) goto L_0x0eb8
            X.2Qx r0 = X.C49552Qx.A05     // Catch:{ all -> 0x0f71 }
        L_0x0eb8:
            int r14 = r0.value     // Catch:{ all -> 0x0f71 }
            long r0 = r3.A0x     // Catch:{ all -> 0x0f71 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0f71 }
            java.lang.String r0 = "message_add_on_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x0f71 }
            java.lang.String r1 = "response"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0f71 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0f71 }
            long r0 = r3.A01     // Catch:{ all -> 0x0f71 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0f71 }
            java.lang.String r0 = "sender_timestamp"
            r9.put(r0, r1)     // Catch:{ all -> 0x0f71 }
            int r0 = r3.A00     // Catch:{ all -> 0x0f71 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0f71 }
            java.lang.String r0 = "extra_guest_count"
            r9.put(r0, r1)     // Catch:{ all -> 0x0f71 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0f71 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x0f71 }
            java.lang.String r14 = "message_add_on_event_response"
            java.lang.String r1 = "EventResponseMessageStore/insertOrUpdateMessageEventResponse"
            r0 = 5
            long r14 = r15.A09(r14, r1, r9, r0)     // Catch:{ all -> 0x0f71 }
            int r0 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x0f69
            r11.close()     // Catch:{ all -> 0x0f78 }
            r14 = 32
            boolean r15 = r7.A10(r14)     // Catch:{ all -> 0x0f78 }
            X.25F r0 = r7.A0A     // Catch:{ all -> 0x0f78 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0f78 }
            if (r0 != 0) goto L_0x0f08
            if (r15 != 0) goto L_0x0f22
        L_0x0f08:
            X.1BI r9 = r3.A0H()     // Catch:{ all -> 0x0f78 }
            boolean r0 = X.C22971Dz.A0d(r9)     // Catch:{ all -> 0x0f78 }
            if (r0 == 0) goto L_0x0f32
            X.1Ln r1 = r8.A03     // Catch:{ all -> 0x0f78 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r9, r0)     // Catch:{ all -> 0x0f78 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x0f78 }
            com.whatsapp.jid.UserJid r0 = r1.A0F(r9)     // Catch:{ all -> 0x0f78 }
        L_0x0f1f:
            r7.A19(r13, r0, r3)     // Catch:{ all -> 0x0f78 }
        L_0x0f22:
            boolean r0 = r7.A10(r14)     // Catch:{ all -> 0x0f78 }
            if (r0 != 0) goto L_0x0f2b
            r7.A0W(r14)     // Catch:{ all -> 0x0f78 }
        L_0x0f2b:
            boolean r0 = r7.A10(r14)     // Catch:{ all -> 0x0f78 }
            if (r15 != 0) goto L_0x0f3b
            goto L_0x0f34
        L_0x0f32:
            r0 = 0
            goto L_0x0f1f
        L_0x0f34:
            if (r0 == 0) goto L_0x0f3b
            X.121 r0 = r8.A01     // Catch:{ all -> 0x0f78 }
            r0.CQv(r7)     // Catch:{ all -> 0x0f78 }
        L_0x0f3b:
            X.121 r0 = r8.A01     // Catch:{ all -> 0x0f78 }
            X.122 r0 = (X.AnonymousClass122) r0     // Catch:{ all -> 0x0f78 }
            X.1Q6 r0 = r0.A0R     // Catch:{ all -> 0x0f78 }
            r0.A0B(r7)     // Catch:{ all -> 0x0f78 }
            r10.A00()     // Catch:{ all -> 0x0f78 }
            if (r2 != 0) goto L_0x0f51
            r10.close()     // Catch:{ all -> 0x0f7f }
            r11.close()     // Catch:{ SQLiteConstraintException -> 0x0f86 }
        L_0x0f4f:
            r2 = 1
            goto L_0x0f9f
        L_0x0f51:
            int r1 = r2.A0D()     // Catch:{ all -> 0x0f78 }
            r0 = 17
            if (r1 != r0) goto L_0x0f61
            r10.close()     // Catch:{ all -> 0x0f7f }
            r11.close()     // Catch:{ SQLiteConstraintException -> 0x0f86 }
            r2 = 3
            goto L_0x0f9f
        L_0x0f61:
            r10.close()     // Catch:{ all -> 0x0f7f }
            r11.close()     // Catch:{ SQLiteConstraintException -> 0x0f86 }
            r2 = 2
            goto L_0x0f9f
        L_0x0f69:
            java.lang.String r1 = "EventResponseMessageStore/insertOrUpdateMessageEventResponse the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0f71 }
            r0.<init>(r1)     // Catch:{ all -> 0x0f71 }
            throw r0     // Catch:{ all -> 0x0f71 }
        L_0x0f71:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0f73 }
        L_0x0f73:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x0f78 }
            throw r0     // Catch:{ all -> 0x0f78 }
        L_0x0f78:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0f7a }
        L_0x0f7a:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x0f7f }
            throw r0     // Catch:{ all -> 0x0f7f }
        L_0x0f7f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0f81 }
        L_0x0f81:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ SQLiteConstraintException -> 0x0f86 }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0f86 }
        L_0x0f86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x103e }
            r1.<init>()     // Catch:{ all -> 0x103e }
            java.lang.String r0 = "EventResponseMessageManager/storeEventResponseMessage failed to insert addon message "
            r1.append(r0)     // Catch:{ all -> 0x103e }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x103e }
            r1.append(r0)     // Catch:{ all -> 0x103e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x103e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x103e }
        L_0x0f9c:
            r2 = 7
            goto L_0x0f9f
        L_0x0f9e:
            monitor-exit(r7)     // Catch:{ all -> 0x103e }
        L_0x0f9f:
            boolean r0 = X.C63792th.A02(r2)     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x1034
            boolean r0 = r4 instanceof X.C444923q     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0fac
            r1 = 16
            goto L_0x0fcf
        L_0x0fac:
            if (r18 == 0) goto L_0x0fb0
            r1 = 1
            goto L_0x0fcf
        L_0x0fb0:
            boolean r0 = r4 instanceof X.AnonymousClass22E     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0fb6
            r1 = 2
            goto L_0x0fcf
        L_0x0fb6:
            boolean r0 = r4 instanceof X.AnonymousClass22C     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0fbd
            r1 = 8
            goto L_0x0fcf
        L_0x0fbd:
            if (r16 == 0) goto L_0x0fc1
            r1 = 4
            goto L_0x0fcf
        L_0x0fc1:
            boolean r0 = r4 instanceof X.AnonymousClass24H     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0fc8
            r1 = 32
            goto L_0x0fcf
        L_0x0fc8:
            boolean r0 = r4 instanceof X.AnonymousClass213     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x0fce
            r1 = -1
            goto L_0x0fcf
        L_0x0fce:
            r1 = 0
        L_0x0fcf:
            boolean r0 = r5.A10(r1)     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x0fdd
            r5.A0W(r1)     // Catch:{ all -> 0x103e }
            X.121 r0 = r6.A06     // Catch:{ all -> 0x103e }
            r0.CQv(r5)     // Catch:{ all -> 0x103e }
        L_0x0fdd:
            int r7 = A01(r4)     // Catch:{ all -> 0x103e }
            X.1Q2 r0 = r6.A07     // Catch:{ all -> 0x103e }
            android.os.Handler r3 = r0.A02     // Catch:{ all -> 0x103e }
            r1 = 2
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r7, r0, r5)     // Catch:{ all -> 0x103e }
            r0.sendToTarget()     // Catch:{ all -> 0x103e }
            long r0 = r4.A0x     // Catch:{ all -> 0x103e }
            r4.A0y = r0     // Catch:{ all -> 0x103e }
            if (r17 == 0) goto L_0x1003
            X.11S r0 = r6.A00     // Catch:{ all -> 0x103e }
            boolean r0 = X.AnonymousClass25A.A0P(r0, r4)     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x1003
            java.util.Set r0 = java.util.Collections.singleton(r4)     // Catch:{ all -> 0x103e }
            r6.A07(r0)     // Catch:{ all -> 0x103e }
        L_0x1003:
            X.10I r3 = r6.A0R     // Catch:{ all -> 0x103e }
            r1 = 7
            X.3Ch r0 = new X.3Ch     // Catch:{ all -> 0x103e }
            r0.<init>(r6, r4, r1)     // Catch:{ all -> 0x103e }
            r3.CGF(r0)     // Catch:{ all -> 0x103e }
            if (r21 == 0) goto L_0x1034
            boolean r0 = r4 instanceof X.AnonymousClass22C     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x1034
            X.1Hc r0 = r6.A01     // Catch:{ all -> 0x103e }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x103e }
            if (r0 != 0) goto L_0x1034
            X.22C r4 = (X.AnonymousClass22C) r4     // Catch:{ all -> 0x103e }
            int r1 = r4.A00     // Catch:{ all -> 0x103e }
            r0 = 1
            if (r1 != r0) goto L_0x1034
            X.1WF r5 = r6.A0B     // Catch:{ all -> 0x103e }
            X.1LW r1 = r6.A04     // Catch:{ all -> 0x103e }
            r0 = r21
            long r3 = r1.A09(r0)     // Catch:{ all -> 0x103e }
            r1 = r19
            r0 = r20
            r5.A01(r1, r0, r3)     // Catch:{ all -> 0x103e }
        L_0x1034:
            r19.A00()     // Catch:{ all -> 0x103e }
            r19.close()     // Catch:{ all -> 0x1048 }
            r20.close()
            return r2
        L_0x103e:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x1043 }
            goto L_0x1047
        L_0x1043:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1048 }
        L_0x1047:
            throw r1     // Catch:{ all -> 0x1048 }
        L_0x1048:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x104d }
            throw r1
        L_0x104d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WM.A00(X.1WM, X.212, boolean):int");
    }

    public static int A01(AnonymousClass212 r1) {
        int i;
        boolean z;
        if (r1 instanceof AnonymousClass227) {
            i = 27;
        } else if (r1 instanceof AnonymousClass22A) {
            i = 30;
        } else if (r1 instanceof AnonymousClass22C) {
            i = 34;
        } else if (r1 instanceof AnonymousClass22E) {
            i = 32;
        } else if (r1 instanceof AnonymousClass213) {
            i = 9;
        } else if (r1 instanceof C444923q) {
            i = 37;
        } else {
            boolean z2 = r1 instanceof AnonymousClass24H;
            i = 41;
            if (!z2) {
                i = -1;
                z = false;
                C17960vV.A0C(z);
                return i;
            }
        }
        z = true;
        C17960vV.A0C(z);
        return i;
    }

    public static long A02(AnonymousClass1WM r15, Set set) {
        C41851xA BD0;
        Set<AnonymousClass206> set2 = set;
        long j = -1;
        if (!set2.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (AnonymousClass206 r7 : set2) {
                if (j < r7.A0x) {
                    j = r7.A0x;
                }
                hashSet.add(Long.valueOf(r7.A0x));
            }
            AnonymousClass1WM r72 = r15;
            if (!hashSet.isEmpty()) {
                C202711m r8 = r15.A0E;
                if (!hashSet.isEmpty()) {
                    ArrayList A0D2 = C29351c6.A0D(hashSet);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        A0D2.add(String.valueOf(C17890vO.A07(it)));
                    }
                    C443423b r4 = new C443423b((String[]) A0D2.toArray(new String[0]), 975);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", 17);
                    C28791au A052 = r8.A03.A05();
                    try {
                        BD0 = A052.BD0();
                        Iterator it2 = r4.iterator();
                        while (it2.hasNext()) {
                            String[] strArr = (String[]) it2.next();
                            StringBuilder sb = new StringBuilder();
                            sb.append("_id IN ");
                            sb.append(AnonymousClass1H2.A00(strArr.length));
                            ((C28801av) A052).A02.A02(contentValues, "message_add_on", sb.toString(), "MessageAddOnStore/updateMessageAddOnsStatus", strArr);
                        }
                        BD0.A00();
                        BD0.close();
                        A052.close();
                    } catch (Throwable th) {
                        try {
                            A052.close();
                            throw th;
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                            throw th;
                        }
                    }
                }
            }
            hashSet.size();
            r72.A07(set2);
        }
        return j;
        throw th;
    }

    public static ArrayList A04(Cursor cursor, AnonymousClass1WM r8, AnonymousClass206 r9, int i) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        HashMap A012 = C63792th.A01(cursor, i);
        while (cursor.moveToNext()) {
            AnonymousClass212 A052 = r8.A0E.A05(cursor, A012);
            if (A052 == null) {
                sb = new StringBuilder();
                str = "MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage";
            } else {
                boolean z = A052 instanceof AnonymousClass22E;
                if (!z || (r9 instanceof AnonymousClass22H)) {
                    A052.A1B(cursor, r8.A08, A012);
                    A052.A05 = new A51(r9.A0H(), r9.A0v);
                    if (z) {
                        AnonymousClass22E r3 = (AnonymousClass22E) A052;
                        ArrayList A002 = r8.A0C.A06.A00(r3.A0x);
                        List list = r3.A06;
                        list.clear();
                        list.addAll(A002);
                        AnonymousClass1WB.A01((AnonymousClass22H) r9, r3);
                    }
                    arrayList.add(A052);
                } else {
                    sb = new StringBuilder();
                    str = "MessageAddOnManager/getMessageAddOnForParentMessage parent is not poll for poll vote";
                }
            }
            sb.append(str);
            sb.append(r9.A0v);
            Log.e(sb.toString());
        }
        return arrayList;
    }

    public static HashSet A05(C28781at r8, AnonymousClass1WM r9, int i, long j, long j2, boolean z) {
        String[] strArr;
        C23141Ev r5;
        String A022;
        String str;
        HashSet hashSet = new HashSet();
        C202711m r3 = r9.A0E;
        if (!z) {
            strArr = new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(AnonymousClass11P.A01(r3.A00)), String.valueOf(0)};
            r5 = ((C28801av) r8).A02;
            String str2 = C63702tY.A01;
            StringBuilder sb = new StringBuilder();
            sb.append(C63702tY.A02(i));
            sb.append(" AND ");
            sb.append("message_add_on.status = ?");
            A022 = sb.toString();
            str = "MessageAddOnStore/getSelectUnreadMessageAddOnForJid";
        } else {
            strArr = new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(AnonymousClass11P.A01(r3.A00))};
            r5 = ((C28801av) r8).A02;
            A022 = C63702tY.A02(i);
            str = "MessageAddOnStore/getSelectUnreadMessageAddOnForJidAndIgnoreStatus";
        }
        Cursor A0A2 = r5.A0A(A022, str, strArr);
        try {
            HashMap A012 = C63792th.A01(A0A2, i);
            while (A0A2.moveToNext()) {
                AnonymousClass212 A052 = r3.A05(A0A2, A012);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getUnreadMessageAddOnForAddOnType unexpected fmessage");
                } else {
                    A052.A1B(A0A2, r9.A08, A012);
                    hashSet.add(A052);
                }
            }
            A0A2.close();
            return hashSet;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static void A06(AnonymousClass1WM r5, AnonymousClass212 r6) {
        AnonymousClass206 A002 = C63792th.A00(r6, (AnonymousClass1W6) r5.A0F.get());
        if (A002 != null) {
            Message.obtain(r5.A07.A02, 14, A01(r6), 0, new Pair(r6, A002)).sendToTarget();
        }
    }

    private void A07(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass206 r2 = (AnonymousClass206) it.next();
            if (!AnonymousClass25A.A0P(this.A00, r2)) {
                hashSet.add(r2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageAddOnManager/filterOutSelfReactionsAndSendReadSefReceipts this msg should not be part of the set ");
                sb.append(r2.A0v);
                Log.w(sb.toString());
            }
        }
        AnonymousClass1N9 r1 = this.A0P;
        r1.A0H(r1.A07(hashSet));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r6 > r4) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(X.AnonymousClass1WM r9, X.AnonymousClass206 r10, X.AnonymousClass212 r11) {
        /*
            X.00H r0 = r9.A0T
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x000c:
            boolean r0 = r8.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x006c
            r8.next()
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            boolean r0 = r10 instanceof X.C445823z
            if (r0 == 0) goto L_0x000c
            boolean r0 = r11 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x000c
            r0 = r10
            X.23z r0 = (X.C445823z) r0
            long r4 = r0.A00
            java.lang.Long r0 = r0.A03
            if (r0 == 0) goto L_0x0066
            long r6 = r0.longValue()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
        L_0x0034:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            if (r0 == 0) goto L_0x000c
            long r4 = r0.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            long r6 = r11.A03
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x004e
            X.11P r0 = r9.A03
            long r6 = X.AnonymousClass11P.A01(r0)
        L_0x004e:
            long r0 = r4 - r6
            long r0 = java.lang.Math.max(r0, r2)
            double r2 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            int r0 = X.C22339B3q.A00(r2)
            r11.A19(r0)
            r11.A01 = r4
            r0 = 1
            return r0
        L_0x0066:
            r0 = 10800000(0xa4cb80, double:5.335909E-317)
            long r6 = r4 + r0
            goto L_0x0034
        L_0x006c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WM.A08(X.1WM, X.206, X.212):boolean");
    }

    public AnonymousClass212 A0A(C28781at r8, long j) {
        Cursor A012;
        C202711m r2 = this.A0E;
        Cursor A0A2 = ((C28801av) r8).A02.A0A(C63702tY.A03, "MessageAddOnStore/getMessageAddOnTypeForRowId", new String[]{String.valueOf(j), String.valueOf(AnonymousClass11P.A01(r2.A00))});
        try {
            int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("message_add_on_type");
            if (!A0A2.moveToNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageAddOnManager/getMessageAddOn message add on not found for rowId=");
                sb.append(j);
                Log.w(sb.toString());
                A0A2.close();
                return null;
            }
            int i = A0A2.getInt(columnIndexOrThrow);
            A012 = r2.A01(r8, i, j);
            HashMap A013 = C63792th.A01(A012, i);
            AnonymousClass212 r6 = null;
            if (!A012.moveToNext()) {
                Log.e("MessageAddOnManager/getMessageAddOn couldn't collect data for message add on");
            } else {
                AnonymousClass212 A052 = r2.A05(A012, A013);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getMessageAddOn couldn't load message add on from cursor");
                } else {
                    A052.A1B(A012, this.A08, A013);
                    AnonymousClass206 A032 = ((AnonymousClass1W6) this.A0F.get()).A01.A03(A052.A02);
                    if (A032 == null) {
                        Log.e("MessageAddOnManager/getMessageAddOn parent message missing");
                    } else {
                        A052.A05 = new A51(A032.A0H(), A032.A0v);
                        A012.close();
                        r6 = A052;
                        A0A2.close();
                        return r6;
                    }
                }
            }
            A012.close();
            A0A2.close();
            return r6;
        } catch (Throwable th) {
            if (A0A2 != null) {
                try {
                    A0A2.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }

    public ArrayList A0D(AnonymousClass206 r5, int i) {
        Cursor A022;
        C28781at A042 = this.A09.get();
        try {
            A022 = this.A0E.A02(A042, i, r5.A0x);
            ArrayList A043 = A04(A022, this, r5, i);
            if (A022 != null) {
                A022.close();
            }
            A042.close();
            return A043;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    public List A0E(AnonymousClass1BI r24) {
        AnonymousClass1BI r6 = r24;
        C29691ci A0A2 = this.A05.A0A(r6);
        if (A0A2 == null || A0A2.A03() == A0A2.A04()) {
            return new ArrayList();
        }
        long A092 = this.A04.A09(r6);
        long A042 = A0A2.A04();
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        C28781at A043 = this.A09.get();
        try {
            C202711m r62 = this.A0E;
            C23141Ev r3 = ((C28801av) A043).A02;
            String str = C63702tY.A00;
            String valueOf = String.valueOf(A092);
            String valueOf2 = String.valueOf(0);
            String valueOf3 = String.valueOf(A042);
            AnonymousClass11P r22 = r62.A00;
            Cursor A0A3 = r3.A0A(str, "MessageAddOnStore/getMessageAddOnKeepInChatInfoCursorForNotification", new String[]{valueOf, valueOf2, valueOf3, String.valueOf(AnonymousClass11P.A01(r22)), String.valueOf(7)});
            try {
                int columnIndex = A0A3.getColumnIndex("last_message_add_on_row_id");
                int columnIndex2 = A0A3.getColumnIndex("parent_message_row_id");
                while (A0A3.moveToNext()) {
                    long j = A0A3.getLong(columnIndex2);
                    Cursor A012 = r62.A01(A043, 68, A0A3.getLong(columnIndex));
                    try {
                        HashMap A013 = C63792th.A01(A012, 68);
                        C54502eF r11 = null;
                        if (!A012.moveToNext()) {
                            Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview couldn't collect data for message add on");
                        } else {
                            AnonymousClass212 A052 = r62.A05(A012, A013);
                            if (!(A052 instanceof AnonymousClass22A)) {
                                Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview unexpected fmessage");
                            } else {
                                AnonymousClass22A r12 = (AnonymousClass22A) A052;
                                r12.A1B(A012, this.A08, A013);
                                AnonymousClass206 A032 = ((AnonymousClass1W6) this.A0F.get()).A01.A03(r12.A02);
                                if (A032 == null) {
                                    Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview parent message missing");
                                } else {
                                    A052.A05 = new A51(A032.A0H(), A032.A0v);
                                    r11 = new C54502eF(A032, r12);
                                }
                            }
                        }
                        A012.close();
                        if (r11 != null && r11.A00.A0v.A02) {
                            linkedList.addFirst(r11);
                            hashMap.put(Long.valueOf(j), r11);
                        }
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                    }
                }
                if (!hashMap.keySet().isEmpty()) {
                    Set<Long> keySet = hashMap.keySet();
                    boolean z = false;
                    if (keySet.size() > 0) {
                        z = true;
                    }
                    C17960vV.A0C(z);
                    String[] strArr = new String[(keySet.size() + 4)];
                    strArr[0] = valueOf;
                    strArr[1] = valueOf2;
                    int i = 3;
                    strArr[2] = valueOf3;
                    for (Long longValue : keySet) {
                        strArr[i] = String.valueOf(longValue.longValue());
                        i++;
                    }
                    strArr[i] = String.valueOf(AnonymousClass11P.A01(r22));
                    Cursor A0A4 = r3.A0A(C63702tY.A03(keySet.size(), 68), "MessageAddOnStore/getMessageAddOnKeepInChatSendersCursorForNotification", strArr);
                    try {
                        int columnIndex3 = A0A4.getColumnIndex("parent_message_row_id");
                        int columnIndex4 = A0A4.getColumnIndex("sender_jid_row_id");
                        while (A0A4.moveToNext()) {
                            long j2 = A0A4.getLong(columnIndex3);
                            long j3 = A0A4.getLong(columnIndex4);
                            C54502eF r0 = (C54502eF) hashMap.get(Long.valueOf(j2));
                            C17960vV.A07(r0);
                            r0.A02.add(Long.valueOf(j3));
                        }
                        A0A4.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                }
                A0A3.close();
                A043.close();
                return linkedList;
            } catch (Throwable th3) {
                if (A0A3 != null) {
                    A0A3.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A043.close();
                throw th4;
            } catch (Throwable th5) {
                AnonymousClass0DT.A00(th4, th5);
                throw th4;
            }
        }
        throw th;
    }

    public List A0F(AnonymousClass1BI r23, int i) {
        Cursor A0A2;
        AnonymousClass206 A052;
        AnonymousClass1BI r6 = r23;
        C29691ci A0A3 = this.A05.A0A(r6);
        if (A0A3 == null || A0A3.A03() == A0A3.A04()) {
            return new ArrayList();
        }
        long A092 = this.A04.A09(r6);
        long A042 = A0A3.A04();
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        C28781at A043 = this.A09.get();
        try {
            C202711m r7 = this.A0E;
            C23141Ev r3 = ((C28801av) A043).A02;
            int i2 = i;
            String A012 = C63702tY.A01(i2);
            String valueOf = String.valueOf(A092);
            String valueOf2 = String.valueOf(0);
            String valueOf3 = String.valueOf(A042);
            AnonymousClass11P r72 = r7.A00;
            Cursor A0A4 = r3.A0A(A012, "MessageAddOnStore/getMessageAddOnInfoCursorForNotification", new String[]{valueOf, valueOf2, valueOf3, String.valueOf(AnonymousClass11P.A01(r72)), String.valueOf(7)});
            try {
                int columnIndex = A0A4.getColumnIndex("last_message_add_on_row_id");
                int columnIndex2 = A0A4.getColumnIndex("unread_count");
                int columnIndex3 = A0A4.getColumnIndex("parent_message_row_id");
                while (A0A4.moveToNext()) {
                    long j = A0A4.getLong(columnIndex3);
                    long j2 = A0A4.getLong(columnIndex);
                    int i3 = A0A4.getInt(columnIndex2);
                    AnonymousClass212 A0A5 = A0A(A043, j2);
                    C55072fA r1 = null;
                    if (!(A0A5 == null || (A052 = ((AnonymousClass1W6) this.A0F.get()).A01.A05(A0A5.A18())) == null)) {
                        r1 = new C55072fA(A052, A0A5, i3);
                    }
                    if (r1 != null && r1.A01.A0v.A02) {
                        linkedList.addFirst(r1);
                        hashMap.put(Long.valueOf(j), r1);
                    }
                }
                if (!hashMap.keySet().isEmpty()) {
                    Set<Long> keySet = hashMap.keySet();
                    boolean z = false;
                    if (keySet.size() > 0) {
                        z = true;
                    }
                    C17960vV.A0C(z);
                    String[] strArr = new String[(keySet.size() + 4)];
                    strArr[0] = valueOf;
                    strArr[1] = valueOf2;
                    int i4 = 3;
                    strArr[2] = valueOf3;
                    for (Long longValue : keySet) {
                        strArr[i4] = String.valueOf(longValue.longValue());
                        i4++;
                    }
                    strArr[i4] = String.valueOf(AnonymousClass11P.A01(r72));
                    A0A2 = r3.A0A(C63702tY.A03(keySet.size(), i2), "MessageAddOnStore/getMessageAddOnSendersCursorForNotification", strArr);
                    int columnIndex4 = A0A2.getColumnIndex("parent_message_row_id");
                    int columnIndex5 = A0A2.getColumnIndex("sender_jid_row_id");
                    while (A0A2.moveToNext()) {
                        long j3 = A0A2.getLong(columnIndex4);
                        long j4 = A0A2.getLong(columnIndex5);
                        C55072fA r0 = (C55072fA) hashMap.get(Long.valueOf(j3));
                        C17960vV.A07(r0);
                        r0.A03.add(Long.valueOf(j4));
                    }
                    A0A2.close();
                }
                A0A4.close();
                A043.close();
                return linkedList;
            } catch (Throwable th) {
                if (A0A4 != null) {
                    A0A4.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
        throw th;
    }

    public void A0G(AnonymousClass1BI r6, int i, int i2, long j) {
        if (C63792th.A00.contains(Integer.valueOf(i))) {
            AnonymousClass1LW r4 = this.A04;
            C29691ci A0A2 = r4.A00.A0A(r6);
            if (A0A2 != null && j >= 1) {
                if (A0A2.A0O < j) {
                    A0A2.A0O = j;
                }
                int i3 = A0A2.A09 + i2;
                A0A2.A09 = i3;
                if (i3 < 0) {
                    A0A2.A09 = 0;
                }
                r4.A0G(A0A2);
            }
        }
    }

    public void A0H(AnonymousClass1BI r3, C53812d8 r4) {
        C29691ci A0A2 = this.A05.A0A(r3);
        if (A0A2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/last/message/no chat for ");
            sb.append(r3);
            Log.w(sb.toString());
            return;
        }
        A0A2.A0i = r4;
    }

    public void A0J(AnonymousClass212 r19, long j) {
        long j2;
        Long valueOf;
        C41851xA BD0;
        String str;
        AnonymousClass212 r5 = r19;
        r5.A0a(4);
        r5.A1A(j);
        C202711m r4 = this.A0E;
        ContentValues contentValues = new ContentValues();
        contentValues.put("server_timestamp", Long.valueOf(r5.A03));
        boolean z = r5 instanceof AnonymousClass22C;
        if (z) {
            j2 = r5.A01;
        } else {
            j2 = 0;
        }
        Integer num = null;
        if (j2 <= 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(j2);
        }
        contentValues.put("expiry_timestamp", valueOf);
        int A17 = r5.A17();
        if (A17 > 0) {
            num = Integer.valueOf(A17);
        }
        contentValues.put("expiry_duration_in_secs", num);
        contentValues.put("status", Integer.valueOf(r5.A0D()));
        AnonymousClass205 r9 = r5.A0v;
        C28791au A052 = r4.A03.A05();
        try {
            BD0 = A052.BD0();
            String[] strArr = new String[3];
            AnonymousClass1LW r2 = r4.A01;
            AnonymousClass1BI r42 = r9.A00;
            C17960vV.A07(r42);
            strArr[0] = String.valueOf(r2.A09(r42));
            if (r9.A02) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[1] = str;
            strArr[2] = r9.A01;
            ((C28801av) A052).A02.A02(contentValues, "message_add_on", "chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnStore/updateMessageAddOnUsingKey", strArr);
            BD0.A00();
            BD0.close();
            A052.close();
            A06(this, r5);
            if (z && !this.A00.A0O(r42) && j == r5.A03) {
                this.A0B.A03((AnonymousClass22C) r5);
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0K(Map map, Set set) {
        this.A0E.A0A(set, 17);
        for (Map.Entry entry : map.entrySet()) {
            this.A04.A0L((AnonymousClass1BI) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r1 != 93) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.AnonymousClass212 r4) {
        /*
            r3 = this;
            int r1 = r4.A0u
            r0 = 56
            r2 = 0
            if (r1 == r0) goto L_0x0031
            r0 = 67
            if (r1 == r0) goto L_0x0044
            r0 = 74
            if (r1 == r0) goto L_0x0014
            r0 = 93
            if (r1 == r0) goto L_0x0031
        L_0x0013:
            return r2
        L_0x0014:
            X.00H r0 = r3.A0F
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.205 r1 = r4.A18()
            X.1W2 r0 = r0.A01
            X.206 r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0 instanceof X.C445823z
            if (r0 == 0) goto L_0x0013
            X.0ve r2 = r3.A0O
            r1 = 7358(0x1cbe, float:1.0311E-41)
            goto L_0x0048
        L_0x0031:
            X.205 r0 = r4.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0042
            X.205 r0 = r4.A18()
            X.C17960vV.A07(r0)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0013
        L_0x0042:
            r2 = 1
            return r2
        L_0x0044:
            X.0ve r2 = r3.A0O
            r1 = 2720(0xaa0, float:3.812E-42)
        L_0x0048:
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WM.A0L(X.212):boolean");
    }

    public AnonymousClass1WM(AnonymousClass190 r4, AnonymousClass11S r5, C23651Hc r6, AnonymousClass1M9 r7, AnonymousClass1RW r8, AnonymousClass11P r9, AnonymousClass1LW r10, AnonymousClass1CJ r11, AnonymousClass121 r12, AnonymousClass1Q2 r13, AnonymousClass1DL r14, C26011Qm r15, AnonymousClass1W7 r16, AnonymousClass1Cd r17, C27081Uq r18, AnonymousClass1W8 r19, AnonymousClass1WH r20, AnonymousClass1WF r21, AnonymousClass1WB r22, AnonymousClass1WE r23, AnonymousClass1WL r24, C202711m r25, C18030ve r26, AnonymousClass1N9 r27, AnonymousClass1WK r28, AnonymousClass10I r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34) {
        Boolean bool = C17960vV.A01;
        this.A03 = r9;
        C18030ve r1 = r26;
        this.A0O = r1;
        this.A08 = r14;
        this.A04 = r10;
        this.A00 = r5;
        this.A0R = r29;
        this.A05 = r11;
        this.A0H = r4;
        this.A02 = r7;
        this.A07 = r13;
        this.A01 = r6;
        this.A0F = r30;
        this.A0E = r25;
        this.A0U = r31;
        this.A0K = r16;
        this.A0P = r27;
        this.A0V = r32;
        this.A0J = r15;
        this.A09 = r17;
        this.A0L = r18;
        this.A06 = r12;
        this.A0M = r19;
        this.A0S = r33;
        this.A0C = r22;
        this.A0D = r23;
        this.A0B = r21;
        this.A0A = r20;
        this.A0T = r34;
        this.A0I = r8;
        this.A0Q = r28;
        this.A0N = r24;
        r1.A0G(987);
    }

    public AnonymousClass212 A0C(AnonymousClass205 r8) {
        UserJid A0I2;
        AnonymousClass212 A0B2 = A0B(r8);
        if (A0B2 == null) {
            return null;
        }
        AnonymousClass206 A032 = ((AnonymousClass1W6) this.A0F.get()).A01.A03(A0B2.A02);
        if (A032 == null && !(A0B2 instanceof C444923q)) {
            return null;
        }
        C59392mE r3 = (C59392mE) this.A0V.get();
        AnonymousClass206 A022 = AnonymousClass1W2.A02(r3.A00, A0B2.A02);
        if (A022 != null) {
            AnonymousClass205 r0 = A022.A0v;
            C18070vi.A0W(r0);
            AnonymousClass205 A023 = r3.A02(r0);
            if (A023 != null) {
                if (A032 == null) {
                    A0I2 = null;
                } else {
                    A0I2 = A032.A0I();
                }
                A0B2.A05 = new A51(A0I2, A023);
                if (A0B2 instanceof AnonymousClass227) {
                    A0B2.A04 = AnonymousClass9AT.A01(A032);
                } else if (A0B2 instanceof AnonymousClass22E) {
                    AnonymousClass22E r1 = (AnonymousClass22E) A0B2;
                    if (!(A032 instanceof AnonymousClass22H)) {
                        Log.i("MessageAddOn/getMessageAddOnForMessageKeyForSend/missing parent message");
                        return null;
                    }
                    AnonymousClass1WB.A01((AnonymousClass22H) A032, r1);
                    return A0B2;
                }
                return A0B2;
            }
        }
        Log.e("MessageAddOnManager/getMessageAddOnForMessageKeyForSend/parent reference key was not found");
        return null;
    }
}
