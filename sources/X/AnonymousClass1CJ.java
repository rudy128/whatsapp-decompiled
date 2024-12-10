package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1CJ  reason: invalid class name */
public class AnonymousClass1CJ {
    public boolean A00;
    public final HashSet A01 = new HashSet();
    public final C18030ve A02;
    public final ConcurrentHashMap A03;
    public volatile AnonymousClass1EH A04;
    public volatile boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.C29691ci A00(X.AnonymousClass1CJ r2, X.AnonymousClass1BI r3) {
        /*
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = A01(r2)     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0016 }
            X.1ci r1 = (X.C29691ci) r1     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.A0s     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r2)
            return r1
        L_0x0013:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CJ.A00(X.1CJ, X.1BI):X.1ci");
    }

    public int A05(AnonymousClass1BI r6, AnonymousClass1BI r7) {
        if (r6 == null && r7 == null) {
            return 0;
        }
        if (r6 != null) {
            if (r7 == null) {
                return 1;
            }
            C29691ci A002 = A00(this, r6);
            C29691ci A003 = A00(this, r7);
            if (A002 == null) {
                if (A003 == null) {
                    return 0;
                }
            } else if (A003 != null) {
                return (A003.A05() > A002.A05() ? 1 : (A003.A05() == A002.A05() ? 0 : -1));
            } else {
                return 1;
            }
        }
        return -1;
    }

    public AnonymousClass206 A0E(AnonymousClass1BI r4) {
        if (r4 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C29691ci A002 = A00(this, r4);
        if (A002 != null) {
            return A002.A0g;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/last/message/no chat for ");
        sb.append(r4);
        Log.w(sb.toString());
        return null;
    }

    public String A0F(AnonymousClass1BI r3) {
        C29691ci r0;
        if (r3 == null || (r0 = (C29691ci) A01(this).get(r3)) == null) {
            return null;
        }
        return r0.A0k;
    }

    public synchronized Collection A0H() {
        return A01(this).values();
    }

    public synchronized Set A0I() {
        return A01(this).keySet();
    }

    public synchronized void A0K(C29691ci r2, AnonymousClass1BI r3) {
        if (r3 != null) {
            A01(this).put(r3, r2);
            if (r2.A0m) {
                this.A01.add(r3);
            }
        }
    }

    public synchronized void A0L(AnonymousClass1BI r2) {
        if (r2 != null) {
            A01(this).remove(r2);
            this.A01.remove(r2);
        }
    }

    public synchronized void A0M(AnonymousClass206 r7) {
        C29691ci A0A = A0A(r7.A0v.A00);
        if (A0A != null) {
            AnonymousClass206 r0 = A0A.A0g;
            if (r0 != null && r0.A0x == r7.A0x) {
                A0A.A0g = r7;
            }
            AnonymousClass206 r02 = A0A.A0f;
            if (r02 != null && r02.A0x == r7.A0x) {
                A0A.A0f = r7;
            }
        }
    }

    public synchronized void A0N(AnonymousClass205 r4) {
        C29691ci A0A = A0A(r4.A00);
        if (A0A != null) {
            AnonymousClass206 r0 = A0A.A0g;
            if (r0 != null && r0.A0v.equals(r4)) {
                A0A.A0g = null;
            }
            AnonymousClass206 r02 = A0A.A0f;
            if (r02 != null && r02.A0v.equals(r4)) {
                A0A.A0f = null;
            }
            C53812d8 r03 = A0A.A0i;
            if (r03 != null && r03.A00.A0v.equals(r4)) {
                A0A.A0i = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = (X.C29691ci) A01(r2).get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(X.AnonymousClass1BI r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x0014
            java.util.concurrent.ConcurrentHashMap r0 = A01(r2)
            java.lang.Object r0 = r0.get(r3)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0m
            if (r0 == 0) goto L_0x0014
            r1 = 1
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CJ.A0S(X.1BI):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0202 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ConcurrentHashMap A01(X.AnonymousClass1CJ r14) {
        /*
            X.1EH r0 = r14.A04
            if (r0 != 0) goto L_0x000b
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            java.util.concurrent.ConcurrentHashMap r0 = r14.A03
            return r0
        L_0x000b:
            monitor-enter(r14)
            X.1EH r1 = r14.A04     // Catch:{ all -> 0x020b }
            if (r1 == 0) goto L_0x0204
            r5 = 1
            r14.A05 = r5     // Catch:{ all -> 0x020b }
            r0 = 0
            r14.A04 = r0     // Catch:{ all -> 0x020b }
            r2 = 0
            X.1Co r0 = r1.A00     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.00H r7 = r0.A01     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r0 = r7.get()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1Cd r0 = r0.A0A     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r0.A06()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            boolean r0 = r0.A08     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r0 = r7.get()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1Bd r0 = r0.A0I     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.String r3 = "ChatManager_loadChats"
            r0.A09(r3)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r0 = r7.get()     // Catch:{ IllegalStateException -> 0x00a6 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ IllegalStateException -> 0x00a6 }
            X.1Cd r0 = r0.A0A     // Catch:{ IllegalStateException -> 0x00a6 }
            X.1at r11 = r0.get()     // Catch:{ IllegalStateException -> 0x00a6 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x009c }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x009c }
            X.1LW r0 = r0.A07     // Catch:{ all -> 0x009c }
            java.util.HashMap r4 = r0.A0D()     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x009c }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x009c }
            X.1QW r0 = r0.A08     // Catch:{ all -> 0x009c }
            r0.A02(r4)     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x009c }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x009c }
            X.00H r0 = r0.A0T     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x009c }
            X.1i5 r10 = (X.C32991i5) r10     // Catch:{ all -> 0x009c }
            java.util.List r0 = r10.A04()     // Catch:{ all -> 0x009c }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x009c }
        L_0x0070:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0084
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x009c }
            X.2Dk r8 = (X.C46162Dk) r8     // Catch:{ all -> 0x009c }
            X.1CJ r6 = r10.A02     // Catch:{ all -> 0x009c }
            X.1BI r0 = r8.A0u     // Catch:{ all -> 0x009c }
            r6.A0K(r8, r0)     // Catch:{ all -> 0x009c }
            goto L_0x0070
        L_0x0084:
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x009c }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x009c }
            X.00H r0 = r0.A0P     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x009c }
            X.1kb r0 = (X.C34511kb) r0     // Catch:{ all -> 0x009c }
            r0.A0D()     // Catch:{ all -> 0x009c }
            X.AnonymousClass1EH.A00(r1)     // Catch:{ all -> 0x009c }
            r11.close()     // Catch:{ IllegalStateException -> 0x00a6 }
            goto L_0x00f2
        L_0x009c:
            r4 = move-exception
            r11.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r4, r0)     // Catch:{ IllegalStateException -> 0x00a6 }
        L_0x00a5:
            throw r4     // Catch:{ IllegalStateException -> 0x00a6 }
        L_0x00a6:
            r4 = move-exception
            java.lang.String r0 = "msgstore-manager/finish"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x01e5 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x01e5 }
            X.1Cd r0 = r0.A0A     // Catch:{ all -> 0x01e5 }
            r0.A06()     // Catch:{ all -> 0x01e5 }
            X.1Cm r0 = r0.A02     // Catch:{ all -> 0x01e5 }
            r0.close()     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x01e5 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x01e5 }
            X.1QV r0 = r0.A0D     // Catch:{ all -> 0x01e5 }
            r0.A01()     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x01e5 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x01e5 }
            X.1LW r0 = r0.A07     // Catch:{ all -> 0x01e5 }
            java.util.HashMap r4 = r0.A0D()     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x01e5 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x01e5 }
            X.1QW r0 = r0.A08     // Catch:{ all -> 0x01e5 }
            r0.A02(r4)     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x01e5 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ all -> 0x01e5 }
            X.00H r0 = r0.A0P     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01e5 }
            X.1kb r0 = (X.C34511kb) r0     // Catch:{ all -> 0x01e5 }
            r0.A0D()     // Catch:{ all -> 0x01e5 }
            X.AnonymousClass1EH.A00(r1)     // Catch:{ all -> 0x01e5 }
        L_0x00f2:
            java.lang.Object r0 = r7.get()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1Bd r0 = r0.A0I     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r0.A08(r3)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.Set r0 = r4.entrySet()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
        L_0x0105:
            boolean r0 = r6.hasNext()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            if (r0 == 0) goto L_0x0138
            java.lang.Object r4 = r6.next()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.concurrent.ConcurrentHashMap r3 = r14.A03     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r1 = r4.getKey()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1BI r1 = (X.AnonymousClass1BI) r1     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1ci r0 = (X.C29691ci) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r3.put(r1, r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1ci r0 = (X.C29691ci) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            boolean r0 = r0.A0m     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            if (r0 == 0) goto L_0x0105
            java.util.HashSet r1 = r14.A01     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r1.add(r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            goto L_0x0105
        L_0x0138:
            java.util.concurrent.ConcurrentHashMap r0 = r14.A03     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.Set r0 = r0.keySet()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r6.<init>(r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.Object r0 = r7.get()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1aq r9 = r0.A03     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1Nd r11 = r9.A04     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1CJ r10 = r11.A02     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            A01(r10)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r8.<init>()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r7.<init>()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1Ne r4 = r11.A01     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            monitor-enter(r4)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.util.Iterator r13 = r6.iterator()     // Catch:{ all -> 0x01e2 }
        L_0x0163:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x01e2 }
            X.1BI r12 = (X.AnonymousClass1BI) r12     // Catch:{ all -> 0x01e2 }
            boolean r0 = r10.A0P(r12)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0163
            boolean r0 = X.C22971Dz.A0V(r12)     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0163
            long r0 = r10.A08(r12)     // Catch:{ all -> 0x01e2 }
            X.1ng r3 = new X.1ng     // Catch:{ all -> 0x01e2 }
            r3.<init>(r12, r0)     // Catch:{ all -> 0x01e2 }
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x01e2 }
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r12)     // Catch:{ all -> 0x01e2 }
            int r0 = r10.A06(r0)     // Catch:{ all -> 0x01e2 }
            if (r0 == r5) goto L_0x0163
            java.util.concurrent.ConcurrentHashMap r0 = A01(r10)     // Catch:{ all -> 0x01e2 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x01e2 }
            X.1ci r0 = (X.C29691ci) r0     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01a4
            int r0 = r0.A05     // Catch:{ all -> 0x01e2 }
            if (r0 <= 0) goto L_0x01a4
            r7.add(r3)     // Catch:{ all -> 0x01e2 }
            goto L_0x0163
        L_0x01a4:
            r8.add(r3)     // Catch:{ all -> 0x01e2 }
            goto L_0x0163
        L_0x01a8:
            r4.A02(r8)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r4)     // Catch:{ all -> 0x01e2 }
            X.1Ne r1 = r11.A00     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            monitor-enter(r1)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r1.A02(r7)     // Catch:{ all -> 0x01df }
            monitor-exit(r1)     // Catch:{ all -> 0x01df }
            X.1KB r4 = r9.A03     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1NN r3 = r9.A05     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r3.getClass()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r1 = 30
            X.25f r0 = new X.25f     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r0.<init>((java.lang.Object) r3, (int) r1)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r4.CGP(r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r1.<init>()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.String r0 = "msgstore-manager/initialize/chats "
            r1.append(r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            int r0 = r6.size()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r1.append(r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r14.A00 = r5     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            goto L_0x0202
        L_0x01df:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01df }
            goto L_0x0201
        L_0x01e2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e2 }
            goto L_0x0201
        L_0x01e5:
            r1 = move-exception
            java.lang.Object r0 = r7.get()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1as r0 = (X.C28771as) r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1Bd r0 = r0.A0I     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r0.A08(r3)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            throw r1     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
        L_0x01f2:
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r1.<init>()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            java.lang.String r0 = "msgstore-manager/finish/db is not ready yet"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            X.1CK r0 = new X.1CK     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
            r0.<init>()     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
        L_0x0201:
            throw r0     // Catch:{ 1CK -> 0x0202, all -> 0x0207 }
        L_0x0202:
            r14.A05 = r2     // Catch:{ all -> 0x020b }
        L_0x0204:
            monitor-exit(r14)     // Catch:{ all -> 0x020b }
            goto L_0x0008
        L_0x0207:
            r0 = move-exception
            r14.A05 = r2     // Catch:{ all -> 0x020b }
            throw r0     // Catch:{ all -> 0x020b }
        L_0x020b:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x020b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CJ.A01(X.1CJ):java.util.concurrent.ConcurrentHashMap");
    }

    public C29691ci A0A(AnonymousClass1BI r2) {
        if (r2 == null) {
            return null;
        }
        return A00(this, r2);
    }

    public ArrayList A0G() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap A012 = A01(this);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            arrayList.add(A012.get(it.next()));
        }
        return arrayList;
    }

    public boolean A0R(AnonymousClass1BI r4) {
        if (!(r4 instanceof GroupJid) || A06((GroupJid) r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A0U(AnonymousClass1BI r4) {
        C36321nh r0 = GroupJid.Companion;
        if (A06(C36321nh.A00(r4)) == 6) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 5021)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass1CJ(C18030ve r2) {
        this.A02 = r2;
        this.A03 = new ConcurrentHashMap();
    }

    public int A02(AnonymousClass1BI r2) {
        C29691ci r0 = (C29691ci) A01(this).get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A08;
    }

    public int A03(AnonymousClass1BI r2) {
        C29691ci r0 = (C29691ci) A01(this).get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A0A;
    }

    public int A04(AnonymousClass1BI r2) {
        C29691ci r0 = (C29691ci) A01(this).get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A0e.expiration;
    }

    public int A06(GroupJid groupJid) {
        C29691ci r0;
        if (!C22971Dz.A0e(groupJid) || (r0 = (C29691ci) A01(this).get(groupJid)) == null) {
            return 0;
        }
        return r0.A03;
    }

    public long A07(AnonymousClass1BI r3) {
        C29691ci r0 = (C29691ci) A01(this).get(r3);
        if (r0 == null) {
            return 1;
        }
        return r0.A0R;
    }

    public long A08(AnonymousClass1BI r6) {
        C29691ci r4 = (C29691ci) A01(this).get(r6);
        long j = 0;
        if (r4 == null) {
            return 0;
        }
        if (!C36301nf.A01(this.A02, 10172)) {
            return r4.A0Z;
        }
        if (r4.A0v != null) {
            j = r4.A0v.A02();
        }
        return Math.max(j, r4.A0Z);
    }

    public long A09(AnonymousClass1BI r3) {
        C29691ci r0 = (C29691ci) A01(this).get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A0a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.2Rv] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.2Rv] */
    public AnonymousClass2Rv A0B(AnonymousClass1BI r8) {
        ? obj;
        C29691ci r6 = (C29691ci) A01(this).get(r8);
        if (r6 == null) {
            ? obj2 = new Object();
            obj2.A00 = 0;
            obj2.A01 = 0;
            obj2.A02 = 0;
            obj2.A03 = Long.MIN_VALUE;
            return obj2;
        }
        synchronized (r6) {
            int i = r6.A0A;
            int i2 = r6.A0B;
            int i3 = r6.A0C;
            long j = r6.A0S;
            obj = new Object();
            obj.A00 = i;
            obj.A01 = i2;
            obj.A02 = i3;
            obj.A03 = j;
        }
        return obj;
    }

    public C29701cj A0C(AnonymousClass1BI r2) {
        C29691ci r0 = (C29691ci) A01(this).get(r2);
        if (r0 == null) {
            return C29701cj.NOT_PARTICIPANT;
        }
        return r0.A0c;
    }

    public C29721cl A0D(UserJid userJid) {
        C29691ci r0 = (C29691ci) A01(this).get(userJid);
        if (r0 == null) {
            return null;
        }
        return r0.A0e;
    }

    public void A0J() {
        A01(this);
    }

    public boolean A0O() {
        for (C29691ci r1 : A0H()) {
            if (C22971Dz.A0V(r1.A0u) && !AnonymousClass000.A1Z(((C46162Dk) r1).A02, C179509Ig.GUEST)) {
                return true;
            }
        }
        return false;
    }

    public boolean A0P(AnonymousClass1BI r3) {
        if (!A01(this).containsKey(r3) || A0T(r3)) {
            return false;
        }
        return true;
    }

    public boolean A0Q(AnonymousClass1BI r3) {
        C29691ci r0 = (C29691ci) A01(this).get(r3);
        if (r0 == null || !r0.A0l) {
            return false;
        }
        return true;
    }

    public boolean A0T(AnonymousClass1BI r9) {
        C29691ci r7 = (C29691ci) A01(this).get(r9);
        if (r7 == null) {
            return true;
        }
        long j = r7.A0Q;
        if (j == 0 && r7.A0H == Long.MIN_VALUE) {
            return false;
        }
        long j2 = r7.A0H;
        if (j2 != r7.A0I || j2 < j) {
            return false;
        }
        return true;
    }

    public boolean A0V(AnonymousClass1BI r4, int i) {
        String str;
        C29691ci A002 = A00(this, r4);
        if (!(A002 == null || (str = A002.A0j) == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("\"");
            sb.append(i);
            sb.append("\"");
            if (str.contains(sb.toString())) {
                return true;
            }
            return false;
        }
        return true;
    }
}
