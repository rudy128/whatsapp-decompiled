package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7CA  reason: invalid class name */
public final class AnonymousClass7CA implements AnonymousClass8BG {
    public final AnonymousClass11S A00;
    public final TreeSet A01 = new TreeSet();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public synchronized void BBg(AnonymousClass212 r14) {
        AnonymousClass7PW r0;
        TreeSet treeSet;
        String str;
        C18070vi.A0d(r14, 0);
        if (!(r14 instanceof AnonymousClass227)) {
            str = "Wrong message add on passed into MessageReactionsImpl";
        } else {
            AnonymousClass11S r4 = this.A00;
            AnonymousClass1BI A002 = AnonymousClass11S.A00(r4);
            if (A002 == null) {
                str = "myUserJid is null. User logged out?";
            } else {
                ConcurrentHashMap concurrentHashMap = this.A03;
                AnonymousClass205 r1 = r14.A0v;
                concurrentHashMap.put(r1.A01, r14);
                if (!r1.A02) {
                    A002 = ((AnonymousClass227) r14).A0I();
                    C17960vV.A07(A002);
                    C18070vi.A0X(A002);
                }
                AnonymousClass227 r02 = (AnonymousClass227) r14;
                AnonymousClass7PX r3 = new AnonymousClass7PX(r4, A002, r02.A01, r02.A00, r14.A0I, r02.A02);
                String A003 = A00(r3.A05);
                if (A003.length() != 0) {
                    ConcurrentHashMap concurrentHashMap2 = this.A02;
                    if (!concurrentHashMap2.containsKey(A003)) {
                        r0 = new AnonymousClass7PW(r4, r3, A003);
                        concurrentHashMap2.put(A003, r0);
                        treeSet = this.A01;
                    } else {
                        Object obj = concurrentHashMap2.get(A003);
                        C17960vV.A07(obj);
                        C18070vi.A0X(obj);
                        r0 = (AnonymousClass7PW) obj;
                        treeSet = this.A01;
                        treeSet.remove(r0);
                        r0.A01(r3);
                    }
                    treeSet.add(r0);
                }
            }
        }
        C17960vV.A0F(false, str);
    }

    public synchronized AnonymousClass7PW BMg(String str) {
        C18070vi.A0d(str, 0);
        return (AnonymousClass7PW) this.A02.get(str);
    }

    public synchronized Iterator BMh() {
        Iterator descendingIterator;
        descendingIterator = this.A01.descendingIterator();
        C18070vi.A0X(descendingIterator);
        return descendingIterator;
    }

    public synchronized int BMi() {
        return this.A01.size();
    }

    public synchronized Collection BMv() {
        return C108955ca.A17(this.A03);
    }

    public synchronized int BXt() {
        int i;
        Iterator BMh = BMh();
        i = 0;
        while (BMh.hasNext()) {
            AnonymousClass7PW r1 = (AnonymousClass7PW) BMh.next();
            if (r1.A02.length() != 0) {
                i += r1.A00();
            }
        }
        return i;
    }

    public synchronized String BXu(AnonymousClass1BI r4, long j) {
        C18070vi.A0d(r4, 0);
        Iterator BMh = BMh();
        while (BMh.hasNext()) {
            AnonymousClass7PX r0 = (AnonymousClass7PX) ((AnonymousClass7PW) BMh.next()).A03.get(C108945cZ.A0N(r4, Long.valueOf(j)));
            if (r0 != null) {
                return r0.A05;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r11.A0v.A02 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void CFH(X.AnonymousClass212 r11, X.AnonymousClass212 r12, boolean r13) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            boolean r0 = r11 instanceof X.AnonymousClass227     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009c
            boolean r0 = r12 instanceof X.AnonymousClass227     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009c
            X.205 r0 = r12.A0v     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x001a
            X.205 r0 = r11.A0v     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x009c
            if (r13 != 0) goto L_0x0020
            goto L_0x009c
        L_0x001a:
            X.205 r0 = r11.A0v     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009c
        L_0x0020:
            X.227 r11 = (X.AnonymousClass227) r11     // Catch:{ all -> 0x00a4 }
            X.11S r0 = r10.A00     // Catch:{ all -> 0x009a }
            com.whatsapp.jid.PhoneUserJid r8 = X.AnonymousClass11S.A00(r0)     // Catch:{ all -> 0x009a }
            if (r8 != 0) goto L_0x0031
            java.lang.String r1 = "myUserJid is null. User logged out?"
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x009a }
            goto L_0x0096
        L_0x0031:
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x009a }
            java.lang.String r6 = A00(r0)     // Catch:{ all -> 0x009a }
            java.util.concurrent.ConcurrentHashMap r5 = r10.A02     // Catch:{ all -> 0x009a }
            java.lang.Object r4 = r5.get(r6)     // Catch:{ all -> 0x009a }
            X.7PW r4 = (X.AnonymousClass7PW) r4     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x0096
            java.util.TreeSet r3 = r10.A01     // Catch:{ all -> 0x009a }
            r3.remove(r4)     // Catch:{ all -> 0x009a }
            X.205 r2 = r11.A0v     // Catch:{ all -> 0x009a }
            boolean r0 = r2.A02     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0056
            com.whatsapp.jid.UserJid r8 = r11.A0I()     // Catch:{ all -> 0x009a }
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x009a }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x009a }
        L_0x0056:
            long r0 = r11.A02     // Catch:{ all -> 0x009a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009a }
            android.util.Pair r7 = X.C108945cZ.A0N(r8, r0)     // Catch:{ all -> 0x009a }
            java.util.HashMap r0 = r4.A03     // Catch:{ all -> 0x009a }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x007e
            r0.remove(r7)     // Catch:{ all -> 0x009a }
            java.util.TreeSet r0 = r4.A04     // Catch:{ all -> 0x009a }
            r0.remove(r1)     // Catch:{ all -> 0x009a }
            X.11S r0 = r4.A01     // Catch:{ all -> 0x009a }
            boolean r0 = r0.A0O(r8)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x007e
            int r0 = r4.A00     // Catch:{ all -> 0x009a }
            int r0 = r0 + -1
            r4.A00 = r0     // Catch:{ all -> 0x009a }
        L_0x007e:
            int r0 = r4.A00()     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0092
            r3.remove(r4)     // Catch:{ all -> 0x009a }
            r5.remove(r6)     // Catch:{ all -> 0x009a }
        L_0x008a:
            java.util.concurrent.ConcurrentHashMap r1 = r10.A03     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x009a }
            r1.remove(r0)     // Catch:{ all -> 0x009a }
            goto L_0x0096
        L_0x0092:
            r3.add(r4)     // Catch:{ all -> 0x009a }
            goto L_0x008a
        L_0x0096:
            r10.BBg(r12)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x009c:
            java.lang.String r1 = "Wrong message add on passed into MessageReactionsImpl"
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x00a4 }
        L_0x00a2:
            monitor-exit(r9)
            return
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CA.CFH(X.212, X.212, boolean):void");
    }

    public static final String A00(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        C17960vV.A07(str);
        if (AnonymousClass72X.A02(str)) {
            return C137176v2.A01(AnonymousClass74I.A08(new AnonymousClass737(AnonymousClass72X.A00(str)).A00));
        }
        String str2 = C43271zX.A00;
        C18070vi.A0Z(str2);
        return str2;
    }

    public AnonymousClass8BG BHF() {
        AnonymousClass11S r2 = this.A00;
        List A0t = C29431cG.A0t(BMv());
        C18070vi.A0z(A0t, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.protocol.message.FMessageReaction>");
        return new AnonymousClass7CA(r2, A0t);
    }

    public boolean isEmpty() {
        return this.A03.isEmpty();
    }

    public AnonymousClass7CA(AnonymousClass11S r3, List list) {
        C18070vi.A0j(r3, list);
        this.A00 = r3;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BBg((AnonymousClass212) it.next());
        }
    }
}
