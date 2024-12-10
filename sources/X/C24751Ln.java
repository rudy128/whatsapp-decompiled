package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Ln  reason: invalid class name and case insensitive filesystem */
public final class C24751Ln extends C24741Lm {
    public final int A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11S A02;
    public final C24711Lj A03;
    public final AnonymousClass1DL A04;
    public final AnonymousClass1Cd A05;
    public final C18030ve A06;
    public final C24571Kv A07;
    public final AnonymousClass00H A08;
    public final Object A09 = new Object();
    public final Map A0A;
    public final Map A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24751Ln(AnonymousClass190 r3, AnonymousClass11S r4, C24711Lj r5, AnonymousClass1DL r6, AnonymousClass1Cd r7, C18030ve r8, C24571Kv r9, AnonymousClass00H r10) {
        super(r9);
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r10, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r7, 8);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.A06 = r8;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r10;
        this.A0A = linkedHashMap;
        this.A07 = r9;
        this.A05 = r7;
        this.A0B = linkedHashMap2;
        int A002 = C18020vd.A00(C18040vf.A02, r8, 7863);
        this.A00 = A002;
        if (A002 >= 0) {
            A09();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass1E1 A00(long r7) {
        /*
            r6 = this;
            r5 = 0
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0008
            return r5
        L_0x0008:
            java.lang.Object r2 = r6.A09
            monitor-enter(r2)
            java.util.Map r1 = r6.A0B     // Catch:{ all -> 0x0043 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0043 }
            X.3Bk r0 = (X.C70523Bk) r0     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x001e
            java.lang.Long r0 = r0.A00()     // Catch:{ all -> 0x0043 }
            goto L_0x001f
        L_0x001e:
            r0 = r5
        L_0x001f:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0031
            X.1Lj r0 = r6.A03
            X.3Bk r0 = r0.A01(r7)
            r6.A04(r0, r7)
            java.lang.Long r0 = r0.A00()
            if (r0 == 0) goto L_0x0042
        L_0x0031:
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            java.lang.Class<X.1E1> r0 = X.AnonymousClass1E1.class
            com.whatsapp.jid.Jid r0 = r6.A0B(r0, r1)
            X.1E1 r0 = (X.AnonymousClass1E1) r0
            return r0
        L_0x0042:
            return r5
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24751Ln.A00(long):X.1E1");
    }

    private final PhoneUserJid A01(long j) {
        Map map;
        Long valueOf;
        Long l;
        Cursor A0A2;
        long j2;
        if (j > 0) {
            Object obj = this.A09;
            synchronized (obj) {
                map = this.A0A;
                valueOf = Long.valueOf(j);
                l = (Long) map.get(valueOf);
            }
            if (l == null) {
                C28781at A042 = this.A03.A00.get();
                try {
                    A0A2 = ((C28801av) A042).A02.A0A("SELECT jid_row_id\nFROM jid_map\nWHERE lid_row_id = ?", "JidMapStore/GET_JID_BY_LID", new String[]{String.valueOf(j)});
                    int columnIndex = A0A2.getColumnIndex("jid_row_id");
                    if (columnIndex < 0 || !A0A2.moveToFirst()) {
                        A0A2.close();
                        A042.close();
                        j2 = -1;
                    } else {
                        j2 = (long) A0A2.getInt(columnIndex);
                        A0A2.close();
                        A042.close();
                    }
                    l = Long.valueOf(j2);
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            }
            long longValue = l.longValue();
            if (longValue > 0) {
                PhoneUserJid phoneUserJid = (PhoneUserJid) A0B(PhoneUserJid.class, longValue);
                synchronized (obj) {
                    map.put(valueOf, Long.valueOf(longValue));
                }
                return phoneUserJid;
            }
        }
        return null;
        throw th;
    }

    public AnonymousClass1E1 A0A(PhoneUserJid phoneUserJid) {
        C18070vi.A0d(phoneUserJid, 0);
        AnonymousClass1Cd r0 = this.A05;
        r0.A06();
        if (!r0.A08) {
            return null;
        }
        AnonymousClass11S r1 = this.A02;
        if (r1.A0O(phoneUserJid)) {
            return r1.A09();
        }
        return A00(this.A04.A0A(phoneUserJid));
    }

    public AnonymousClass1E2 A0C(PhoneUserJid phoneUserJid) {
        C18070vi.A0d(phoneUserJid, 0);
        AnonymousClass1E1 A0A2 = A0A(phoneUserJid);
        if (!(A0A2 instanceof AnonymousClass1E2)) {
            return null;
        }
        return (AnonymousClass1E2) A0A2;
    }

    public PhoneUserJid A0D(AnonymousClass1E1 r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass11S r1 = this.A02;
        if (!r1.A0O(r3)) {
            return A01(this.A04.A09(r3));
        }
        r1.A0I();
        return r1.A0E;
    }

    public UserJid A0F(UserJid userJid) {
        UserJid A0A2;
        if (userJid == null || C22971Dz.A0S(userJid)) {
            return null;
        }
        if (C22971Dz.A0T(userJid)) {
            A0A2 = A0D((AnonymousClass1E1) userJid);
        } else if (!C22971Dz.A0X(userJid)) {
            return null;
        } else {
            A0A2 = A0A((PhoneUserJid) userJid);
        }
        return A0A2;
    }

    public LinkedHashMap A0G(Set set) {
        C18070vi.A0d(set, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (next instanceof PhoneUserJid) {
                arrayList.add(next);
            }
        }
        Set A12 = C29431cG.A12(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : set) {
            if (next2 instanceof AnonymousClass1E1) {
                arrayList2.add(next2);
            }
        }
        Set A122 = C29431cG.A12(arrayList2);
        Set<Map.Entry> entrySet = A0L(A12).entrySet();
        int A032 = C200610r.A03(C29351c6.A0C(entrySet, 10));
        if (A032 < 16) {
            A032 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A032);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        Set<Map.Entry> entrySet2 = A0H(A122).entrySet();
        int A033 = C200610r.A03(C29351c6.A0C(entrySet2, 10));
        if (A033 < 16) {
            A033 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A033);
        for (Map.Entry entry2 : entrySet2) {
            linkedHashMap2.put(entry2.getValue(), entry2.getKey());
        }
        return AnonymousClass1D7.A09(linkedHashMap, linkedHashMap2);
    }

    public LinkedHashMap A0H(Set set) {
        C18070vi.A0d(set, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass1Cd r0 = this.A05;
        r0.A06();
        if (r0.A08) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r2 = (AnonymousClass1BI) it.next();
                AnonymousClass11S r1 = this.A02;
                if (r1.A0O(r2)) {
                    r1.A0I();
                    PhoneUserJid phoneUserJid = r1.A0E;
                    C17960vV.A07(phoneUserJid);
                    C18070vi.A0X(phoneUserJid);
                    linkedHashMap.put(phoneUserJid, r2);
                } else {
                    long A092 = this.A04.A09(r2);
                    synchronized (this.A09) {
                        Map map = this.A0A;
                        Long valueOf = Long.valueOf(A092);
                        Long l = (Long) map.get(valueOf);
                        if (l == null) {
                            linkedHashSet.add(valueOf);
                        } else {
                            linkedHashMap2.put(l, valueOf);
                        }
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : C24711Lj.A00(this.A03, "GET_JIDS_BY_LIDS", linkedHashSet, true).entrySet()) {
                Number number = (Number) entry.getKey();
                C70523Bk r3 = (C70523Bk) entry.getValue();
                Iterator it2 = r3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (linkedHashSet.contains(next)) {
                        C18070vi.A0b(number);
                        C18070vi.A0b(next);
                        hashMap.put(number, next);
                    }
                }
                C18070vi.A0b(number);
                A04(r3, number.longValue());
            }
            linkedHashMap2.putAll(hashMap);
            A05(linkedHashMap2, linkedHashMap);
        }
        return linkedHashMap;
    }

    public List A0I(PhoneUserJid phoneUserJid) {
        C70523Bk r0;
        C18070vi.A0d(phoneUserJid, 0);
        AnonymousClass1Cd r02 = this.A05;
        r02.A06();
        if (r02.A08) {
            AnonymousClass11S r1 = this.A02;
            if (r1.A0O(phoneUserJid)) {
                AnonymousClass1E2 A092 = r1.A09();
                if (A092 != null) {
                    return AnonymousClass1ZU.A05(A092);
                }
            } else {
                long A0A2 = this.A04.A0A(phoneUserJid);
                if (A0A2 <= 0) {
                    r0 = new C70523Bk();
                } else {
                    synchronized (this.A09) {
                        r0 = (C70523Bk) this.A0B.get(Long.valueOf(A0A2));
                    }
                    if (r0 == null) {
                        r0 = this.A03.A01(A0A2);
                        A04(r0, A0A2);
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    Number number = (Number) it.next();
                    C18070vi.A0b(number);
                    long longValue = number.longValue();
                    if (longValue > 0) {
                        arrayList.add(A0B(AnonymousClass1E1.class, longValue));
                    }
                }
                return arrayList;
            }
        }
        return C18460wS.A00;
    }

    public Set A0M(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        UserJid A0F = A0F(userJid);
        if (A0F == null) {
            Set singleton = Collections.singleton(userJid);
            C18070vi.A0X(singleton);
            return singleton;
        }
        return C200410p.A0S(new UserJid[]{userJid, A0F});
    }

    public void A0P(AnonymousClass1E1 r11, PhoneUserJid phoneUserJid) {
        C18070vi.A0d(r11, 0);
        C18070vi.A0d(phoneUserJid, 1);
        AnonymousClass1Cd r0 = this.A05;
        r0.A06();
        if (r0.A08 && !this.A02.A0O(phoneUserJid)) {
            AnonymousClass1DL r4 = this.A04;
            long A092 = r4.A09(r11);
            long A093 = r4.A09(phoneUserJid);
            if (A092 > 0 && A093 > 0 && A092 != A093) {
                AnonymousClass1E1 A002 = A00(A093);
                if ((A002 == null || r4.A09(A002) != A092) && (!this.A03.A02(Collections.singletonList(new C58512ko((Long) null, A092, A093))).isEmpty())) {
                    A03(A092, A093);
                    ((AnonymousClass2LT) this.A08.get()).A00((AnonymousClass1E1) A0B(AnonymousClass1E1.class, A092), A002, (PhoneUserJid) A0B(PhoneUserJid.class, A093));
                }
            }
        }
    }

    public boolean A0Q(UserJid userJid, UserJid userJid2) {
        if (userJid == null) {
            return userJid2 == null;
        }
        if (!userJid.equals(userJid2)) {
            if ((!C22971Dz.A0X(userJid) || !C22971Dz.A0T(userJid2)) && (!C22971Dz.A0T(userJid) || !C22971Dz.A0X(userJid2))) {
                return false;
            }
            return C18070vi.A18(A0F(userJid), userJid2);
        }
    }

    public void C9L(C122516Qr r3, boolean z) {
        C18070vi.A0d(r3, 1);
        if (r3.ordinal() >= this.A00) {
            A0O();
        }
    }

    public static final HashMap A02(C24751Ln r5, Set set) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : C24711Lj.A00(r5.A03, "GET_LIDS_BY_JIDS", set, false).entrySet()) {
            Number number = (Number) entry.getKey();
            C70523Bk r2 = (C70523Bk) entry.getValue();
            Long A002 = r2.A00();
            if (A002 != null) {
                C18070vi.A0b(number);
                hashMap.put(number, A002);
            }
            C18070vi.A0b(number);
            r5.A04(r2, number.longValue());
        }
        return hashMap;
    }

    private final void A03(long j, long j2) {
        synchronized (this.A09) {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            this.A0A.put(valueOf, valueOf2);
            this.A0B.remove(valueOf2);
        }
    }

    private final void A04(C70523Bk r6, long j) {
        if (!r6.A00.isEmpty()) {
            synchronized (this.A09) {
                Iterator it = r6.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    Long valueOf = Long.valueOf(j);
                    Map map = this.A0A;
                    C18070vi.A0b(l);
                    map.put(l, valueOf);
                }
                this.A0B.put(Long.valueOf(j), r6);
            }
        }
    }

    private final void A05(Map map, Map map2) {
        AnonymousClass1DL r2 = this.A04;
        HashMap A0F = r2.A0F(AnonymousClass1E1.class, C29431cG.A12(map.values()));
        HashMap A0F2 = r2.A0F(PhoneUserJid.class, C29431cG.A12(map.keySet()));
        for (Map.Entry entry : map.entrySet()) {
            boolean z = true;
            if (((Number) entry.getKey()).longValue() <= 0 || ((Number) entry.getValue()).longValue() <= 0) {
                AnonymousClass190 r5 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("getBulkAccountUserJidsByPhoneJids; invalidPhoneJid:");
                boolean z2 = false;
                if (((Number) entry.getKey()).longValue() <= 0) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append("; invalidAccountJid:");
                if (((Number) entry.getValue()).longValue() > 0) {
                    z = false;
                }
                sb.append(z);
                r5.A0G("WaJidMapRepository/invalid_jid_row_id", sb.toString(), false);
            } else {
                Object obj = A0F.get(entry.getValue());
                Object obj2 = A0F2.get(entry.getKey());
                if (obj == null || obj2 == null) {
                    AnonymousClass190 r22 = this.A01;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getBulkAccountUserJidsByPhoneJids; invalidPhoneJid:");
                    boolean z3 = false;
                    if (obj2 == null) {
                        z3 = true;
                    }
                    sb2.append(z3);
                    sb2.append("; invalidAccountJid:");
                    if (obj != null) {
                        z = false;
                    }
                    sb2.append(z);
                    r22.A0G("WaJidMapRepository/invalid_jid_row_id", sb2.toString(), false);
                } else {
                    map2.put(obj2, obj);
                }
            }
        }
    }

    public final Jid A0B(Class cls, long j) {
        AnonymousClass1DL r3 = this.A04;
        boolean containsKey = r3.A03.containsKey(Long.valueOf(j));
        Jid jid = (Jid) cls.cast(r3.A0B(j));
        if (jid != null) {
            return jid;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WaJidMapRepository/readJidByRowId; invalidRowId: ");
        sb.append(j);
        sb.append(", expected type: ");
        sb.append(cls);
        sb.append(", from cache: ");
        sb.append(containsKey);
        throw new IllegalStateException(sb.toString());
    }

    public PhoneUserJid A0E(AnonymousClass1E1 r8) {
        AnonymousClass1Cd r0 = this.A05;
        r0.A06();
        if (!r0.A08) {
            return null;
        }
        long A0A2 = this.A04.A0A(r8);
        Long valueOf = Long.valueOf(A0A2);
        if (A0A2 == -1 || valueOf == null) {
            return null;
        }
        return A01(A0A2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r11 == r13) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r1 != 0) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0J(java.util.List r16) {
        /*
            r15 = this;
            r4 = r16
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x016d
            X.1Cd r0 = r15.A05
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x016d
            r0 = 10
            int r0 = X.C29351c6.A0C(r4, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            X.0yx r0 = (X.C19760yx) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto L_0x0020
        L_0x0032:
            java.util.Set r0 = X.C29431cG.A12(r2)
            r15.A0H(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r4.iterator()
        L_0x004c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r4 = r5.next()
            r0 = r4
            X.0yx r0 = (X.C19760yx) r0
            X.11S r1 = r15.A02
            java.lang.Object r0 = r0.A01
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r1.A0O(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004c
            r6.add(r4)
            goto L_0x004c
        L_0x006b:
            java.util.Iterator r8 = r6.iterator()
        L_0x006f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r4 = r8.next()
            X.0yx r4 = (X.C19760yx) r4
            X.1DL r1 = r15.A04
            java.lang.Object r6 = r4.A00
            r0 = r6
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r11 = r1.A09(r0)
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r13 = r1.A09(r0)
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x006f
            java.lang.Object r7 = r15.A09
            monitor-enter(r7)
            java.util.Map r1 = r15.A0A     // Catch:{ all -> 0x00ce }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00ce }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ce }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00ba
            long r4 = r0.longValue()     // Catch:{ all -> 0x00ce }
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            monitor-exit(r7)
            if (r0 != 0) goto L_0x006f
            r10 = 0
            X.2ko r9 = new X.2ko
            r9.<init>(r10, r11, r13)
            r2.add(r9)
            X.C18070vi.A0W(r6)
            r3.add(r6)
            goto L_0x006f
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00d1:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x016c
            X.1DL r6 = r15.A04
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r7 = com.whatsapp.jid.PhoneUserJid.class
            r0 = 10
            int r0 = X.C29351c6.A0C(r2, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r2.iterator()
        L_0x00ea:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r4.next()
            X.2ko r0 = (X.C58512ko) r0
            long r0 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            goto L_0x00ea
        L_0x0100:
            java.util.HashMap r0 = r6.A0F(r7, r5)
            java.util.Collection r0 = r0.values()
            java.util.List r0 = X.C29431cG.A0q(r0)
            java.util.Set r0 = X.C29431cG.A12(r0)
            java.util.Map r6 = r15.A0L(r0)
            X.1Lj r0 = r15.A03
            java.util.ArrayList r0 = r0.A02(r2)
            java.util.Iterator r8 = r0.iterator()
        L_0x011e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r8.next()
            X.2ko r0 = (X.C58512ko) r0
            long r4 = r0.A01
            long r0 = r0.A00
            r15.A03(r4, r0)
            goto L_0x011e
        L_0x0132:
            java.util.Iterator r8 = r2.iterator()
        L_0x0136:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x016c
            java.lang.Object r5 = r8.next()
            X.2ko r5 = (X.C58512ko) r5
            long r0 = r5.A00
            com.whatsapp.jid.Jid r4 = r15.A0B(r7, r0)
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4
            java.lang.Class<X.1E1> r2 = X.AnonymousClass1E1.class
            long r0 = r5.A01
            com.whatsapp.jid.Jid r2 = r15.A0B(r2, r0)
            X.1E1 r2 = (X.AnonymousClass1E1) r2
            java.lang.Object r1 = r6.get(r4)
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            boolean r0 = X.C18070vi.A18(r2, r1)
            if (r0 != 0) goto L_0x0136
            X.00H r0 = r15.A08
            java.lang.Object r0 = r0.get()
            X.2LT r0 = (X.AnonymousClass2LT) r0
            r0.A00(r2, r1, r4)
            goto L_0x0136
        L_0x016c:
            return r3
        L_0x016d:
            X.0wS r0 = X.C18460wS.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24751Ln.A0J(java.util.List):java.util.List");
    }

    public DVM A0N(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (next instanceof AnonymousClass1E3) {
                arrayList.add(next);
            }
        }
        Set A12 = C29431cG.A12(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : A12) {
            UserJid userJid = ((DeviceJid) next2).userJid;
            Object obj = linkedHashMap.get(userJid);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(userJid, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next3 : set) {
            if (next3 instanceof AnonymousClass1EE) {
                arrayList2.add(next3);
            }
        }
        Set A122 = C29431cG.A12(arrayList2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next4 : A122) {
            UserJid userJid2 = ((DeviceJid) next4).userJid;
            Object obj2 = linkedHashMap2.get(userJid2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(userJid2, obj2);
            }
            ((List) obj2).add(next4);
        }
        LinkedHashMap A0G = A0G(C41841x9.A04(linkedHashMap2.keySet(), linkedHashMap.keySet()));
        DVM dvm = new DVM();
        for (Map.Entry entry : A0G.entrySet()) {
            UserJid userJid3 = (UserJid) entry.getKey();
            UserJid userJid4 = (UserJid) entry.getValue();
            List<AnonymousClass1E3> list = (List) linkedHashMap.get(userJid4);
            if (list != null) {
                for (AnonymousClass1E3 r2 : list) {
                    DeviceJid A032 = DeviceJid.Companion.A03(userJid3, r2.A00);
                    if ((A032 instanceof AnonymousClass1EE) && A032 != null) {
                        dvm.put(A032, r2);
                    }
                }
            }
            List<Jid> list2 = (List) linkedHashMap2.get(userJid3);
            if (list2 != null) {
                for (Jid jid : list2) {
                    DeviceJid A033 = DeviceJid.Companion.A03(userJid4, jid.getDevice());
                    if ((A033 instanceof AnonymousClass1E3) && A033 != null) {
                        dvm.put(jid, A033);
                    }
                }
            }
        }
        return C200610r.A05(dvm);
    }

    public void A0O() {
        synchronized (this.A09) {
            this.A0A.clear();
            this.A0B.clear();
        }
    }

    public String BZc() {
        String obj;
        synchronized (this.A09) {
            StringBuilder sb = new StringBuilder();
            sb.append("JidMapRepository/a2J=");
            sb.append(this.A0A.size());
            sb.append(", p2A");
            sb.append(this.A0B.size());
            obj = sb.toString();
        }
        return obj;
    }

    public List A0K(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C19760yx(entry.getKey(), entry.getValue()));
        }
        return A0J(arrayList);
    }

    public Map A0L(Set set) {
        Long l;
        if (!set.isEmpty()) {
            AnonymousClass1Cd r0 = this.A05;
            r0.A06();
            if (r0.A08) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI r2 = (AnonymousClass1BI) it.next();
                    AnonymousClass11S r1 = this.A02;
                    if (r1.A0O(r2)) {
                        AnonymousClass1E2 A092 = r1.A09();
                        if (A092 != null) {
                            linkedHashMap.put(r2, A092);
                        }
                    } else {
                        long A093 = this.A04.A09(r2);
                        synchronized (this.A09) {
                            Map map = this.A0B;
                            Long valueOf = Long.valueOf(A093);
                            C70523Bk r02 = (C70523Bk) map.get(valueOf);
                            if (r02 != null) {
                                l = r02.A00();
                            } else {
                                l = null;
                            }
                            if (l == null) {
                                linkedHashSet.add(valueOf);
                            } else {
                                linkedHashMap2.put(valueOf, l);
                            }
                        }
                    }
                }
                linkedHashMap2.putAll(A02(this, linkedHashSet));
                A05(linkedHashMap2, linkedHashMap);
                return linkedHashMap;
            }
        }
        AnonymousClass1CQ r12 = AnonymousClass1CQ.A00;
        C18070vi.A0z(r12, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r12;
    }
}
