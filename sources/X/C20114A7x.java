package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.LRUCache;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.A7x  reason: case insensitive filesystem */
public final class C20114A7x {
    public static final A76 A08 = new Object();
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final Map A04 = new LRUCache(5);
    public final Map A05 = new LRUCache(100);
    public final Map A06 = C17880vN.A11();
    public final Map A07 = new ConcurrentHashMap(100);

    public static final C198639yf A00(C20114A7x a7x, UserJid userJid) {
        C198639yf r2;
        synchronized (a7x) {
            UserJid A022 = A76.A02(a7x, userJid);
            Map map = a7x.A04;
            r2 = (C198639yf) map.get(A022);
            if (r2 == null) {
                r2 = new C198639yf((C193429q5) null, (C193429q5) null, (List) null, (List) null, (List) null, (Map) null, (AnonymousClass1Y1) null, 63);
                map.put(A022, r2);
            }
        }
        return r2;
    }

    public static final AnonymousClass9O1 A01(C20114A7x a7x, UserJid userJid, String str) {
        AnonymousClass9O1 r0;
        synchronized (a7x) {
            r0 = (AnonymousClass9O1) A00(a7x, A76.A02(a7x, userJid)).A07.get(str);
        }
        return r0;
    }

    public final int A04(UserJid userJid) {
        int i;
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            List A0D = A0D(A76.A02(this, userJid));
            i = 7;
            if (A0D != null) {
                Iterator it = A0D.iterator();
                while (it.hasNext()) {
                    i = AnonymousClass000.A0O(AnonymousClass8BS.A0B(it), i * 31);
                }
            }
        }
        return i;
    }

    public final C193429q5 A05(UserJid userJid) {
        C193429q5 r0;
        C18070vi.A0d(userJid, 0);
        UserJid A022 = A76.A02(this, userJid);
        synchronized (this) {
            C198639yf r02 = (C198639yf) this.A04.get(A022);
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final C193429q5 A06(UserJid userJid) {
        C193429q5 r0;
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 != null) {
                r0 = A002.A01;
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final C195129sq A08(UserJid userJid, String str) {
        C195129sq r0;
        AnonymousClass9O1 r02;
        C18070vi.A0d(str, 1);
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 == null || (r02 = (AnonymousClass9O1) A002.A07.get(str)) == null) {
                r0 = null;
            } else {
                r0 = r02.A01;
            }
        }
        return r0;
    }

    public final C179409Hv A09(UserJid userJid) {
        C179409Hv r0;
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 != null) {
                r0 = A002.A02;
            } else {
                r0 = C179409Hv.UNKNOWN;
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20287AEv A0A(com.whatsapp.jid.UserJid r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            X.0ve r1 = r7.A01     // Catch:{ all -> 0x009d }
            X.00H r0 = r7.A03     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x009d }
            X.1Lx r0 = (X.C24851Lx) r0     // Catch:{ all -> 0x009d }
            com.whatsapp.jid.UserJid r1 = X.A76.A03(r0, r1, r8)     // Catch:{ all -> 0x009d }
            r6 = 0
            if (r9 == 0) goto L_0x009b
            int r0 = r9.length()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x009b
            java.util.Map r4 = r7.A05     // Catch:{ all -> 0x009d }
            X.9q6 r0 = new X.9q6     // Catch:{ all -> 0x009d }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x009d }
            X.AEv r0 = (X.C20287AEv) r0     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0029
            monitor-exit(r7)
            return r0
        L_0x0029:
            java.util.Map r0 = r7.A06     // Catch:{ all -> 0x009d }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x009d }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x009b
            if (r1 == 0) goto L_0x003c
            boolean r0 = r3.equals(r1)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x003c
            goto L_0x009b
        L_0x003c:
            java.util.Map r0 = r7.A04     // Catch:{ all -> 0x009d }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x009d }
            X.9yf r2 = (X.C198639yf) r2     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x009b
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x009d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x009d }
        L_0x004c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0067
            X.AEv r5 = X.AnonymousClass8BS.A0B(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r5.A0H     // Catch:{ all -> 0x009d }
            boolean r0 = X.C18070vi.A18(r0, r9)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x004c
            X.9q6 r0 = new X.9q6     // Catch:{ all -> 0x009d }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x009d }
        L_0x0063:
            r4.put(r0, r5)     // Catch:{ all -> 0x009d }
            goto L_0x0099
        L_0x0067:
            java.util.Map r0 = r2.A07     // Catch:{ all -> 0x009d }
            java.util.Iterator r2 = X.C17890vO.A0l(r0)     // Catch:{ all -> 0x009d }
        L_0x006d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x009d }
            X.9O1 r0 = (X.AnonymousClass9O1) r0     // Catch:{ all -> 0x009d }
            X.9sq r0 = r0.A01     // Catch:{ all -> 0x009d }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x009d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x009d }
        L_0x0081:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x006d
            X.AEv r5 = X.AnonymousClass8BS.A0B(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r5.A0H     // Catch:{ all -> 0x009d }
            boolean r0 = X.C18070vi.A18(r0, r9)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0081
            X.9q6 r0 = new X.9q6     // Catch:{ all -> 0x009d }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x009d }
            goto L_0x0063
        L_0x0099:
            monitor-exit(r7)
            return r5
        L_0x009b:
            monitor-exit(r7)
            return r6
        L_0x009d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20114A7x.A0A(com.whatsapp.jid.UserJid, java.lang.String):X.AEv");
    }

    public final AEI A0B(UserJid userJid) {
        AEI aei;
        Object obj;
        synchronized (this) {
            List A0D = A0D(A76.A02(this, userJid));
            aei = null;
            if (A0D != null) {
                Iterator it = A0D.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C20287AEv aEv = (C20287AEv) obj;
                    AEJ aej = aEv.A03;
                    if (aej != null && aej.A00 == 0 && !aEv.A0C && AnonymousClass000.A1a(aEv.A0A)) {
                        break;
                    }
                }
                C20287AEv aEv2 = (C20287AEv) obj;
                if (aEv2 != null) {
                    aei = (AEI) C29431cG.A0c(aEv2.A0A);
                }
            }
        }
        return aei;
    }

    public final ArrayList A0C(UserJid userJid) {
        ArrayList A13;
        synchronized (this) {
            UserJid A022 = A76.A02(this, userJid);
            A13 = AnonymousClass000.A13();
            C198639yf r3 = (C198639yf) this.A04.get(A022);
            if (r3 != null) {
                Iterator it = r3.A05.iterator();
                while (it.hasNext()) {
                    AnonymousClass9O1 r0 = (AnonymousClass9O1) r3.A07.get(C17880vN.A0v(it));
                    if (r0 != null) {
                        A13.add(r0.A01);
                    }
                }
            }
        }
        return A13;
    }

    public final List A0D(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        UserJid A022 = A76.A02(this, userJid);
        synchronized (this) {
            C198639yf A002 = A76.A00(this, A022);
            if (A002 == null) {
                return null;
            }
            List unmodifiableList = Collections.unmodifiableList(A002.A06);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9O1, java.lang.Object] */
    public final void A0E(C194219rN r8, UserJid userJid, boolean z) {
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            UserJid A022 = A76.A02(this, userJid);
            C198639yf A002 = A00(this, A022);
            if (!z) {
                A002.A05.clear();
            }
            for (C195129sq r5 : r8.A02) {
                C193429q5 r0 = new C193429q5(true, (String) null);
                C18070vi.A0d(r5, 1);
                ? obj = new Object();
                obj.A01 = r5;
                obj.A00 = r0;
                Iterator it = r5.A04.iterator();
                while (it.hasNext()) {
                    A02(this, AnonymousClass8BS.A0B(it), A022);
                }
                List list = A002.A05;
                String str = r5.A03;
                list.add(str);
                A002.A07.put(str, obj);
            }
            A002.A00 = r8.A00;
        }
    }

    public final void A0F(AN5 an5, UserJid userJid, boolean z) {
        C18070vi.A0d(userJid, 0);
        UserJid A022 = A76.A02(this, userJid);
        synchronized (this) {
            C198639yf A002 = A00(this, A022);
            if (!z) {
                List list = A002.A06;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.A06.remove(AnonymousClass8BS.A0B(it).A0H);
                }
                list.clear();
            }
            Iterator it2 = an5.A03.iterator();
            while (it2.hasNext()) {
                C20287AEv A0B = AnonymousClass8BS.A0B(it2);
                A03(A0B, A022);
                A002.A06.add(A0B);
                A02(this, A0B, A022);
            }
            A002.A02 = an5.A00;
            A002.A01 = an5.A02;
            ((C190909li) this.A02.get()).A00(A022);
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.9O1, java.lang.Object] */
    public final void A0G(AN4 an4, UserJid userJid, boolean z) {
        AnonymousClass9O1 r2;
        C18070vi.A0h(userJid, an4);
        synchronized (this) {
            A76 a76 = A08;
            C18030ve r8 = this.A01;
            AnonymousClass00H r7 = this.A03;
            UserJid A012 = A76.A01(a76, r8, userJid, r7);
            C195129sq r5 = an4.A02;
            List list = r5.A04;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A02(this, AnonymousClass8BS.A0B(it), A012);
            }
            String str = r5.A03;
            AnonymousClass9O1 A013 = A01(this, A012, str);
            if (A013 != null) {
                if (!z) {
                    A013.A01.A04.clear();
                }
                C195129sq r1 = A013.A01;
                r1.A02 = r5.A02;
                r1.A01 = r5.A01;
                r1.A00 = r5.A00;
                r1.A04.addAll(list);
                r2 = A013;
            } else {
                C198639yf A002 = A00(this, A76.A01(a76, r8, A012, r7));
                C193429q5 r0 = new C193429q5(true, (String) null);
                ? obj = new Object();
                obj.A01 = r5;
                obj.A00 = r0;
                A002.A07.put(str, obj);
                r2 = obj;
            }
            r2.A00 = an4.A01;
        }
    }

    public final void A0H(C179409Hv r2, UserJid userJid) {
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 != null) {
                A002.A02 = r2;
            }
        }
    }

    public final void A0I(C20287AEv aEv, UserJid userJid) {
        int i;
        ADW adw;
        List<C20256ADo> list;
        C18070vi.A0d(aEv, 0);
        UserJid A032 = A76.A03((C24851Lx) C18070vi.A0E(this.A03), this.A01, userJid);
        synchronized (this) {
            A03(aEv, A032);
            Map map = this.A05;
            String str = aEv.A0H;
            map.put(new C193439q6(A032, str), aEv);
            A0N(str);
            Object obj = A032;
            if (A032 == null) {
                obj = this.A06.get(str);
            }
            UserJid userJid2 = (UserJid) obj;
            if (userJid2 != null) {
                C198639yf A002 = A00(this, userJid2);
                Iterator A0l = C17890vO.A0l(A002.A07);
                while (true) {
                    i = 0;
                    if (!A0l.hasNext()) {
                        break;
                    }
                    List list2 = ((AnonymousClass9O1) A0l.next()).A01.A04;
                    int size = list2.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (C18070vi.A18(str, ((C20287AEv) list2.get(i)).A0H)) {
                            list2.set(i, aEv);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                List list3 = A002.A06;
                int size2 = list3.size();
                while (true) {
                    if (i >= size2) {
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            loop3:
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                AE6 ae6 = AnonymousClass8BS.A0B(it).A05;
                                if (!(ae6 == null || (adw = ae6.A00) == null || (list = adw.A00) == null)) {
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        for (C20256ADo aDo : list) {
                                            if (C18070vi.A18(aDo.A00, str)) {
                                                list3.add(aEv);
                                                break loop3;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                            this.A06.put(str, userJid2);
                        }
                        list3.add(0, aEv);
                        this.A06.put(str, userJid2);
                    } else if (C18070vi.A18(str, ((C20287AEv) list3.get(i)).A0H)) {
                        list3.set(i, aEv);
                        break;
                    } else {
                        i++;
                    }
                }
                ((C190909li) this.A02.get()).A00(userJid2);
            }
        }
    }

    public final void A0J(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            UserJid A022 = A76.A02(this, userJid);
            Map map = this.A04;
            C198639yf r4 = (C198639yf) map.get(A022);
            if (r4 != null) {
                Iterator it = r4.A06.iterator();
                while (it.hasNext()) {
                    C20287AEv A0B = AnonymousClass8BS.A0B(it);
                    Map map2 = this.A06;
                    String str = A0B.A0H;
                    map2.remove(str);
                    this.A05.remove(new C193439q6(A022, str));
                    A0M(str);
                }
                Iterator A0l = C17890vO.A0l(r4.A07);
                while (A0l.hasNext()) {
                    Iterator it2 = ((AnonymousClass9O1) A0l.next()).A01.A04.iterator();
                    while (it2.hasNext()) {
                        C20287AEv A0B2 = AnonymousClass8BS.A0B(it2);
                        Map map3 = this.A06;
                        String str2 = A0B2.A0H;
                        map3.remove(str2);
                        this.A05.remove(new C193439q6(A022, str2));
                        A0M(str2);
                    }
                }
            }
            map.remove(A022);
            ((C190909li) this.A02.get()).A00(A022);
        }
    }

    public final void A0K(UserJid userJid, int i) {
        C18070vi.A0d(userJid, 0);
        if (i < 0) {
            C17900vP.A0i("CatalogCacheManager/trimProductsInCatalogCache/Invalid size argument - ", AnonymousClass000.A10(), i);
            return;
        }
        synchronized (this) {
            UserJid A022 = A76.A02(this, userJid);
            C198639yf r2 = (C198639yf) this.A04.get(A022);
            if (r2 != null) {
                r2.A01 = new C193429q5(true, (String) null);
                List list = r2.A06;
                int A023 = AnonymousClass3MX.A02(list, i);
                for (int i2 = 0; i2 < A023; i2++) {
                    int A024 = AnonymousClass3MX.A02(list, 1);
                    String str = ((C20287AEv) list.get(A024)).A0H;
                    this.A06.remove(str);
                    this.A05.remove(new C193439q6(A022, str));
                    list.remove(A024);
                    A0M(str);
                }
            }
        }
    }

    public final void A0L(UserJid userJid, boolean z) {
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 != null) {
                A002.A05.clear();
                A002.A07.clear();
                if (z) {
                    A002.A00 = new C193429q5(true, (String) null);
                }
            }
        }
    }

    public final void A0M(String str) {
        C18070vi.A0d(str, 0);
        if (C18020vd.A05(C18040vf.A02, this.A01, 8209)) {
            Map map = this.A07;
            if (map.containsKey(str)) {
                map.remove(str);
            }
        }
    }

    public final void A0N(String str) {
        C18070vi.A0d(str, 0);
        if (C18020vd.A05(C18040vf.A02, this.A01, 8209)) {
            AnonymousClass8BT.A1O(str, this.A07, AnonymousClass11P.A01(this.A00));
        }
    }

    public final boolean A0O(UserJid userJid) {
        boolean containsKey;
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            containsKey = this.A04.containsKey(A76.A02(this, userJid));
        }
        return containsKey;
    }

    public final boolean A0P(UserJid userJid) {
        boolean z;
        C18070vi.A0d(userJid, 0);
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 != null) {
                z = AnonymousClass000.A1a(A002.A06);
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void A02(C20114A7x a7x, C20287AEv aEv, UserJid userJid) {
        Map map = a7x.A05;
        String str = aEv.A0H;
        map.put(new C193439q6(userJid, str), aEv);
        a7x.A06.put(str, userJid);
        a7x.A0N(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        r5 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        r1 = new X.AE6(r5, r2, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(X.C20287AEv r8, com.whatsapp.jid.UserJid r9) {
        /*
            r7 = this;
            X.0ve r1 = r7.A01
            X.00H r0 = r7.A03
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1Lx r0 = (X.C24851Lx) r0
            com.whatsapp.jid.UserJid r1 = X.A76.A03(r0, r1, r9)
            java.lang.String r0 = r8.A0H
            X.AEv r6 = r7.A0A(r1, r0)
            r5 = 0
            if (r6 == 0) goto L_0x0087
            X.AE6 r1 = r6.A05
            if (r1 == 0) goto L_0x0087
            X.AE6 r0 = r8.A05
            if (r0 == 0) goto L_0x006f
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0084
            X.AE6 r0 = r8.A05
        L_0x002b:
            if (r0 == 0) goto L_0x0082
            java.util.List r4 = r0.A03
        L_0x002f:
            X.AE6 r0 = r8.A05
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0079
            X.AE6 r0 = r8.A05
            if (r0 == 0) goto L_0x0080
            java.util.List r3 = r0.A02
        L_0x0043:
            X.AE6 r1 = r8.A05
            if (r1 == 0) goto L_0x004b
            X.ADp r2 = r1.A01
            if (r2 != 0) goto L_0x0053
        L_0x004b:
            X.AE6 r0 = r6.A05
            if (r0 == 0) goto L_0x0077
            X.ADp r2 = r0.A01
        L_0x0051:
            if (r1 == 0) goto L_0x0072
        L_0x0053:
            X.ADW r0 = r1.A00
            if (r0 == 0) goto L_0x0072
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0072
            X.AE6 r0 = r8.A05
            if (r0 == 0) goto L_0x006a
        L_0x0068:
            X.ADW r5 = r0.A00
        L_0x006a:
            X.AE6 r1 = new X.AE6
            r1.<init>(r5, r2, r4, r3)
        L_0x006f:
            r8.A05 = r1
            return
        L_0x0072:
            X.AE6 r0 = r6.A05
            if (r0 == 0) goto L_0x006a
            goto L_0x0068
        L_0x0077:
            r2 = r5
            goto L_0x0051
        L_0x0079:
            X.AE6 r0 = r6.A05
            if (r0 == 0) goto L_0x0080
            java.util.List r3 = r0.A02
            goto L_0x0043
        L_0x0080:
            r3 = r5
            goto L_0x0043
        L_0x0082:
            r4 = r5
            goto L_0x002f
        L_0x0084:
            X.AE6 r0 = r6.A05
            goto L_0x002b
        L_0x0087:
            X.AE6 r1 = r8.A05
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20114A7x.A03(X.AEv, com.whatsapp.jid.UserJid):void");
    }

    public C20114A7x(AnonymousClass11P r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0s(r3, r4, r5, r6);
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r6;
    }

    public final C193429q5 A07(UserJid userJid, String str) {
        C193429q5 r0;
        AnonymousClass9O1 r02;
        C18070vi.A0h(userJid, str);
        synchronized (this) {
            C198639yf A002 = A76.A00(this, userJid);
            if (A002 == null || (r02 = (AnonymousClass9O1) A002.A07.get(str)) == null) {
                r0 = null;
            } else {
                r0 = r02.A00;
            }
        }
        return r0;
    }
}
