package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1UO  reason: invalid class name */
public class AnonymousClass1UO {
    public C53372cQ A00;
    public Long A01;
    public C20995Acn A02;
    public final C19880zA A03;
    public final AnonymousClass190 A04;
    public final C26811To A05;
    public final AnonymousClass1M9 A06;
    public final AnonymousClass1PM A07;
    public final AnonymousClass1UH A08;
    public final C26861Tt A09;
    public final AnonymousClass1UK A0A;
    public final C26851Ts A0B;
    public final C26871Tu A0C;
    public final AnonymousClass1UP A0D = new AnonymousClass1UQ(this);
    public final C25161Nd A0E;
    public final AnonymousClass11P A0F;
    public final C19830z4 A0G;
    public final AnonymousClass1MR A0H;
    public final AnonymousClass1UN A0I;
    public final C18030ve A0J;
    public final AnonymousClass1QO A0K;
    public final AnonymousClass1QS A0L;
    public final AnonymousClass1UM A0M;
    public final AnonymousClass1UJ A0N;
    public final AnonymousClass10I A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final HashSet A0Z = new HashSet();
    public final HashSet A0a = new HashSet();
    public final Map A0b = new HashMap();
    public final Map A0c = new HashMap();
    public final Map A0d = new HashMap();
    public final Map A0e = new HashMap();
    public final Map A0f = new HashMap();
    public final C26881Tv A0g;
    public final C24751Ln A0h;
    public final AnonymousClass00H A0i;

    public static synchronized C20995Acn A01(AnonymousClass1UO r7) {
        C20995Acn acn;
        synchronized (r7) {
            acn = r7.A02;
            if (acn == null) {
                C18030ve r5 = r7.A0J;
                C24751Ln r3 = r7.A0h;
                AnonymousClass1UN r4 = r7.A0I;
                acn = new C20995Acn(r7.A04, r7.A0D, r3, r4, r5, (AnonymousClass1OZ) r7.A0i.get());
                r7.A02 = acn;
            }
        }
        return acn;
    }

    public static A01 A02(AnonymousClass1UO r9, AnonymousClass2R1 r10, List list, int i) {
        boolean z;
        AnonymousClass2R1 r6 = r10;
        C49542Qw r0 = r10.mode;
        C49542Qw r5 = C49542Qw.FULL;
        List list2 = list;
        int i2 = i;
        if (r0 == r5 || r10.A00()) {
            AnonymousClass1UN r1 = r9.A0I;
            if (!r1.A08() || r1.A02.A0O() > 0) {
                z = true;
            } else {
                z = false;
            }
            if ((r10.A00() || r10.mode == r5) && z) {
                return new A01(r6, list2, i2, false, true);
            }
        }
        return new A01(r6, list2, i2, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r9 == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r14 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r12 != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A0J, 8420) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r6 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r7 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r8 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r11 != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(X.AnonymousClass1UO r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r3 = 0
            if (r5 != 0) goto L_0x0017
            if (r10 != 0) goto L_0x0017
            if (r13 != 0) goto L_0x0017
            if (r15 != 0) goto L_0x0017
            if (r12 != 0) goto L_0x0018
            if (r14 != 0) goto L_0x001a
            if (r6 != 0) goto L_0x0037
            if (r7 != 0) goto L_0x0046
            if (r8 != 0) goto L_0x0055
            if (r11 != 0) goto L_0x0064
            if (r9 != 0) goto L_0x0073
        L_0x0017:
            return r3
        L_0x0018:
            if (r14 == 0) goto L_0x0028
        L_0x001a:
            X.0ve r2 = r4.A0J
            r1 = 8421(0x20e5, float:1.18E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0017
            if (r12 == 0) goto L_0x0035
        L_0x0028:
            X.0ve r2 = r4.A0J
            r1 = 8420(0x20e4, float:1.1799E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0035
            return r3
        L_0x0035:
            if (r6 == 0) goto L_0x0044
        L_0x0037:
            X.0ve r2 = r4.A0J
            r1 = 9524(0x2534, float:1.3346E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0044
            return r3
        L_0x0044:
            if (r7 == 0) goto L_0x0053
        L_0x0046:
            X.0ve r2 = r4.A0J
            r1 = 9736(0x2608, float:1.3643E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0053
            return r3
        L_0x0053:
            if (r8 == 0) goto L_0x0062
        L_0x0055:
            X.0ve r2 = r4.A0J
            r1 = 9732(0x2604, float:1.3637E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0062
            return r3
        L_0x0062:
            if (r11 == 0) goto L_0x0071
        L_0x0064:
            X.0ve r2 = r4.A0J
            r1 = 9731(0x2603, float:1.3636E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0071
            return r3
        L_0x0071:
            if (r9 == 0) goto L_0x0080
        L_0x0073:
            X.0ve r2 = r4.A0J
            r1 = 9733(0x2605, float:1.3639E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0080
            return r3
        L_0x0080:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UO.A0D(X.1UO, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):boolean");
    }

    public static String A03(C188899iB r2) {
        String str;
        String str2 = r2.A0E;
        if (str2 != null) {
            return str2;
        }
        AnonymousClass1E7 r22 = r2.A07;
        if (r22 == null) {
            return null;
        }
        AnonymousClass1BI r1 = r22.A0J;
        if (r1 != null && C22971Dz.A0Y(r1)) {
            return r1.user;
        }
        C59042lf r0 = r22.A0H;
        if (r0 == null || (str = r0.A01) == null) {
            return null;
        }
        return str;
    }

    public static String A04(AnonymousClass1E7 r2) {
        C59042lf r1 = r2.A0H;
        AnonymousClass1BI r0 = r2.A0J;
        if (r1 != null) {
            return r1.A01;
        }
        if (r0 != null) {
            return r0.getRawString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hc_");
        sb.append(r2.hashCode());
        return sb.toString();
    }

    public static ArrayList A05(List list, List list2) {
        String str;
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String A032 = A03((C188899iB) it.next());
            if (A032 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1E7 r2 = (AnonymousClass1E7) it2.next();
                    AnonymousClass1BI r1 = r2.A0J;
                    if (r1 == null || !C22971Dz.A0Y(r1)) {
                        C59042lf r0 = r2.A0H;
                        if (r0 == null || (str = r0.A01) == null) {
                            str = null;
                        }
                    } else {
                        str = r1.user;
                    }
                    if (A032.equals(str)) {
                        hashSet.add(r2);
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public static ArrayList A06(List list, Map map) {
        Jid A062;
        C188829i3 r0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 r2 = (AnonymousClass1E7) it.next();
            if (!(r2 == null || r2.A0H == null || (A062 = r2.A06(UserJid.class)) == null || (r0 = (C188829i3) map.get(A062)) == null || r0.A04 != 1)) {
                C20043A4m a4m = new C20043A4m(r2);
                a4m.A0L = true;
                arrayList.add(a4m.A00());
            }
        }
        return arrayList;
    }

    public static void A07(AnonymousClass1UO r7, C58152kE r8, Set set) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet(r8.A01);
        for (AnonymousClass1E7 r4 : r8.A08) {
            if ((r4 != null && r4.A0J != null && r4.A0H != null && !C63412t2.A01(r4, set, true)) || r4.A09 == 1) {
                AnonymousClass1M9 r0 = r7.A06;
                Iterator it = r0.A04.A0N(r4.A0J).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!hashSet2.contains(next)) {
                        if (r7.A0I.A09()) {
                            r8.A0D.add(r4);
                            hashSet.add(next);
                        } else {
                            C18070vi.A0d(next, 0);
                            r8.A06.add(next);
                        }
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            r7.A06.A0r(hashSet, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.AnonymousClass1UO r5, X.C20043A4m r6, boolean r7, boolean r8) {
        /*
            X.1E7 r1 = r6.A0R
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r1.A06(r0)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            if (r7 != 0) goto L_0x000f
            if (r8 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            if (r4 == 0) goto L_0x0036
            X.0ve r2 = r5.A0J
            r0 = 9667(0x25c3, float:1.3546E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0036
            r0 = 10080(0x2760, float:1.4125E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            X.1UM r0 = r5.A0M
            X.2eA r3 = r0.A00(r4, r1)
            r6.A06 = r3
        L_0x002b:
            if (r7 == 0) goto L_0x000e
            X.1UJ r2 = r5.A0N
            java.lang.String r1 = "ContactSyncHelper.setProfilePrivacyEnrichmentIfNeeded"
            r0 = 0
            r2.A00(r4, r3, r1, r0)
            return
        L_0x0036:
            r3 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UO.A09(X.1UO, X.A4m, boolean, boolean):void");
    }

    public static boolean A0B(AnonymousClass1UO r6, AnonymousClass2HO r7, C46932Gl r8, String str, Future future) {
        try {
            future.get(64000, TimeUnit.MILLISECONDS);
            if (r6.A00 != null) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/no result");
            Log.i(sb.toString());
            Long l = r6.A01;
            if (l != null) {
                if (r7 != null) {
                    r7.A0B = l;
                }
                r7.A0B = l;
                if (r8 != null) {
                    r8.A05 = l;
                    return false;
                }
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/exception");
            Log.e(sb2.toString(), e);
            r6.A04.A0G(str, e.getMessage(), true);
            return false;
        } catch (ExecutionException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("/exception");
            Log.e(sb3.toString(), e2);
            if ((e2.getCause() instanceof RuntimeException) || ((e2.getCause() instanceof Error) && !(e2.getCause() instanceof AssertionError) && !(e2.getCause() instanceof OutOfMemoryError))) {
                r6.A04.A0G(str, e2.getMessage(), true);
            }
        } catch (InterruptedException | TimeoutException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(X.AnonymousClass1UO r4, java.util.List r5, java.util.List r6, java.util.List r7, java.util.List r8) {
        /*
            X.1To r4 = r4.A05
            r3 = 1
            r4.A0O(r5, r6, r3)
            boolean r0 = r6.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x001f
            r4.A0P(r7, r2, r3)
            r1 = 1
        L_0x001f:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0026
            return r1
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UO.A0C(X.1UO, java.util.List, java.util.List, java.util.List, java.util.List):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.1BI] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C58152kE r9) {
        /*
            r8 = this;
            X.00H r5 = r8.A0P
            java.lang.Object r1 = r5.get()
            X.1Lo r1 = (X.C24761Lo) r1
            java.util.List r4 = r9.A01
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.00H r0 = r1.A00
            java.lang.Object r2 = r0.get()
            X.1Ly r2 = (X.C24861Ly) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AddressBookStore/removeContacts "
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Lt r0 = r2.A00
            X.1au r3 = r0.A06()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x00fb }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x003c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f4 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x00f4 }
            X.AnonymousClass2Q6.A04(r0, r3)     // Catch:{ all -> 0x00f4 }
            goto L_0x003c
        L_0x004c:
            r2.A00()     // Catch:{ all -> 0x00f4 }
            r2.close()     // Catch:{ all -> 0x00fb }
            r3.close()
            java.lang.Object r0 = r5.get()
            X.1Lo r0 = (X.C24761Lo) r0
            java.util.List r4 = r9.A00
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.2Q6 r2 = (X.AnonymousClass2Q6) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AddressBookStore/addContacts after usync diff calculation "
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            X.AnonymousClass2Q6.A08(r2, r4, r0)
            java.lang.Object r0 = r5.get()
            X.1Lo r0 = (X.C24761Lo) r0
            java.util.List r2 = r9.A04
            X.C18070vi.A0d(r2, r3)
            X.00H r0 = r0.A00
            java.lang.Object r7 = r0.get()
            X.2Q6 r7 = (X.AnonymousClass2Q6) r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AddressBookStore/updateContacts "
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Lt r0 = r7.A00
            X.1au r6 = r0.A06()
            X.1xA r5 = r6.BD0()     // Catch:{ all -> 0x00ed }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x00e6 }
        L_0x00be:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00e6 }
            r3 = 0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x00e6 }
            X.1E7 r2 = (X.AnonymousClass1E7) r2     // Catch:{ all -> 0x00e6 }
            X.1BI r1 = r2.A0J     // Catch:{ all -> 0x00e6 }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00d4
            r3 = r1
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x00e6 }
        L_0x00d4:
            android.content.ContentValues r0 = r7.A0I(r2, r3)     // Catch:{ all -> 0x00e6 }
            X.AnonymousClass2Q6.A07(r0, r2, r6)     // Catch:{ all -> 0x00e6 }
            goto L_0x00be
        L_0x00dc:
            r5.A00()     // Catch:{ all -> 0x00e6 }
            r5.close()     // Catch:{ all -> 0x00ed }
            r6.close()
            return
        L_0x00e6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00ed }
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r1 = move-exception
            X.CDX.A00(r6, r0)
            throw r1
        L_0x00f4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UO.A0E(X.2kE):void");
    }

    public static int A00(AnonymousClass1UO r2, AnonymousClass2R1 r3, List list) {
        boolean A062 = A01(r2).A06(r3);
        int i = 0;
        if (A062) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C188899iB r1 = (C188899iB) it.next();
                if (r1.A0K && !r1.A0O && !TextUtils.isEmpty(r1.A0E) && r1.A00 != null) {
                    i++;
                }
            }
        }
        return i;
    }

    public static void A08(AnonymousClass1UO r5, C62602rf r6, AnonymousClass2R1 r7, C46932Gl r8) {
        AnonymousClass1UK r1;
        int i;
        if (A01(r5).A06(r7)) {
            if (r6.A00()) {
                Long l = r8.A08;
                if (l != null && l.longValue() > 0) {
                    r1 = r5.A0A;
                    i = 0;
                    r8.A01 = 0;
                } else {
                    return;
                }
            } else {
                r1 = r5.A0A;
                r8.A01 = 0;
                i = 1;
            }
            r8.A02 = i;
            AnonymousClass1UK.A00(r1, r8);
            r1.A02.CC7(r8);
        }
    }

    public static void A0A(AnonymousClass1UO r8, Collection collection, List list, Map map) {
        C59042lf r0;
        StringBuilder sb;
        String str;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass1E7 r5 = (AnonymousClass1E7) it.next();
            boolean z2 = true;
            if (r5 == null || (r0 = r5.A0H) == null) {
                z = true;
            } else {
                C17960vV.A07(r0);
                String str2 = r0.A01;
                C188829i3 r1 = (C188829i3) map.get(str2);
                if (r1 == null) {
                    sb = new StringBuilder();
                    str = "sync/phone-number/missing_response/";
                } else {
                    int i = r1.A04;
                    if (i == 0) {
                        sb = new StringBuilder();
                        str = "sync/phone-number/unassigned/";
                    } else {
                        if (i != 1) {
                            z2 = false;
                        }
                        UserJid userJid = r1.A0D;
                        AnonymousClass1BI r12 = (AnonymousClass1BI) r5.A06(UserJid.class);
                        if (r5.A10 != z2 || !C42171xk.A00(r5.A0J, userJid)) {
                            r5.A10 = z2;
                            r5.A0J = userJid;
                            if (collection != null) {
                                collection.add(r5);
                            }
                            if (!r5.A10 && r12 != null) {
                                r8.A0g.A03(r12);
                            }
                        }
                    }
                }
                sb.append(str);
                sb.append(AnonymousClass1EG.A0B(str2, 4));
                Log.w(sb.toString());
            }
        }
        if (z) {
            r8.A04.A0G("sync/updateContactsFromSyncUsers/found-invalid-contacts", (String) null, false);
        }
    }

    public AnonymousClass1UO(C19880zA r2, AnonymousClass190 r3, C26811To r4, AnonymousClass1M9 r5, AnonymousClass1PM r6, C26881Tv r7, AnonymousClass1UH r8, C26861Tt r9, AnonymousClass1UK r10, C26851Ts r11, C26871Tu r12, C25161Nd r13, AnonymousClass11P r14, C19830z4 r15, C24751Ln r16, AnonymousClass1MR r17, AnonymousClass1UN r18, C18030ve r19, AnonymousClass1QO r20, AnonymousClass1QS r21, AnonymousClass1UM r22, AnonymousClass1UJ r23, AnonymousClass10I r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35) {
        this.A0F = r14;
        this.A0J = r19;
        this.A04 = r3;
        this.A05 = r4;
        this.A0i = r25;
        this.A0B = r11;
        this.A0L = r21;
        this.A0h = r16;
        this.A0Y = r26;
        this.A0C = r12;
        this.A0H = r17;
        this.A0P = r27;
        this.A03 = r2;
        this.A0g = r7;
        this.A07 = r6;
        this.A0E = r13;
        this.A0K = r20;
        this.A08 = r8;
        this.A0N = r23;
        this.A09 = r9;
        this.A0A = r10;
        this.A0Q = r28;
        this.A0M = r22;
        this.A0R = r29;
        this.A0T = r30;
        this.A06 = r5;
        this.A0S = r31;
        this.A0V = r32;
        this.A0G = r15;
        this.A0X = r33;
        this.A0O = r24;
        this.A0I = r18;
        this.A0U = r34;
        this.A0W = r35;
    }
}
