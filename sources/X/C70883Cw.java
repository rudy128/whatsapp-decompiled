package X;

import android.content.ContentProviderOperation;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Cw  reason: invalid class name and case insensitive filesystem */
public class C70883Cw implements Runnable {
    public final C62592re A00;
    public final /* synthetic */ AnonymousClass1US A01;

    public static final String A05(String str) {
        C18070vi.A0d(str, 0);
        int i = 0;
        while (true) {
            int length = str.length();
            if (i >= length) {
                return str;
            }
            if (!Character.isDigit(str.charAt(i))) {
                StringBuilder A10 = AnonymousClass000.A10();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        A10.append(charAt);
                    }
                }
                return C18070vi.A0H(A10);
            }
            i++;
        }
    }

    public static final boolean A0C(C18030ve r6, AnonymousClass00H r7, Collection collection) {
        C18070vi.A0d(r7, 1);
        if (collection == null || collection.isEmpty() || !C18020vd.A05(C18040vf.A02, r6, 10180)) {
            return false;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Jid A06 = C17880vN.A0O(it).A06(PhoneUserJid.class);
            if (A06 != null) {
                A13.add(A06);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : A13) {
            if (!C42701yb.A01((AnonymousClass1BI) next)) {
                A132.add(next);
            }
        }
        Set A12 = C29431cG.A12(A132);
        if (A12.size() != ((AnonymousClass1MK) r7.get()).A06("ContactSyncHelperUtils/filterMissingLIDsPhoneNumbers", "USYNC", A12).keySet().size()) {
            return true;
        }
        return false;
    }

    public C70883Cw(AnonymousClass1US r1, C62592re r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static long A00(C26861Tt r3, String str) {
        return C26861Tt.A00(r3).getLong(str, -1);
    }

    public static ContentProviderOperation.Builder A01(ContentProviderOperation.Builder builder, Jid jid, Object obj) {
        return builder.withValue("data1", jid.getRawString()).withValue("data2", obj);
    }

    public static ContentProviderOperation.Builder A02(Uri uri, Object obj, Object obj2) {
        return ContentProviderOperation.newInsert(uri).withYieldAllowed(true).withValue("raw_contact_id", obj).withValue("mimetype", obj2);
    }

    public static C62512rW A03(C20043A4m a4m, AnonymousClass1MR r4, UserJid userJid) {
        String str = "";
        if (userJid != null) {
            HashSet hashSet = new HashSet(r4.A0A(userJid));
            if (!hashSet.isEmpty()) {
                str = C63442t5.A03(hashSet);
            }
        }
        a4m.A09 = str;
        a4m.A03 = r4.A01(userJid);
        return r4.A05(userJid);
    }

    public static void A07(AnonymousClass1UO r2, AnonymousClass1UH r3) {
        r3.A02(r2.A00.A00, Arrays.asList(r2.A00.A01));
    }

    private void A08(C62602rf r7) {
        boolean isEmpty;
        C62592re r5 = this.A00;
        List<AnonymousClass2P4> list = r5.A04;
        synchronized (list) {
            ArrayList A13 = AnonymousClass000.A13();
            for (AnonymousClass2P4 r1 : list) {
                if (!r1.A00) {
                    A13.add(r1);
                    r1.BrF(r7);
                }
            }
            list.removeAll(A13);
            isEmpty = list.isEmpty();
        }
        if (!isEmpty) {
            r5.A02 = false;
            AnonymousClass1US.A03(this.A01, r5);
        }
    }

    private void A09(C62602rf r4) {
        List<AnonymousClass2P4> list = this.A00.A04;
        synchronized (list) {
            for (AnonymousClass2P4 BrF : list) {
                BrF.BrF(r4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.9ee} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.8pI] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C20043A4m r4, com.whatsapp.jid.UserJid r5, X.AnonymousClass1QP r6) {
        /*
            java.lang.String r3 = r4.A0U
            com.whatsapp.payments.PaymentConfiguration r0 = r6.A00
            X.BD1 r2 = r0.A01()
            r0 = 0
            if (r2 == 0) goto L_0x0019
            java.util.Map r1 = r6.A01
            if (r1 == 0) goto L_0x0015
            java.lang.Object r0 = r1.get(r5)
            X.8pI r0 = (X.AnonymousClass8pI) r0
        L_0x0015:
            X.9ee r0 = r2.Bb9(r0, r5, r3)
        L_0x0019:
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70883Cw.A0A(X.A4m, com.whatsapp.jid.UserJid, X.1QP):void");
    }

    public static C26981Ug A04(C20995Acn acn, A01 a01, String str) {
        return acn.A05(a01, str, 64000);
    }

    public static void A06(ContentProviderOperation.Builder builder, Object obj, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(builder.withValue(str, obj).build());
    }

    public static void A0B(C20043A4m a4m, Object obj, Map map, Map map2) {
        a4m.A08 = (String) map.get(obj);
        a4m.A0A = (String) map2.get(obj);
    }

    public static boolean A0D(AnonymousClass2HO r2, AbstractCollection abstractCollection) {
        r2.A0H = Long.valueOf((long) abstractCollection.size());
        return abstractCollection.isEmpty();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 2044 */
    public void run() {
        /*
            r70 = this;
            r69 = r70
            r0 = r69
            X.1US r0 = r0.A01
            r68 = r0
            r0 = r69
            X.2re r0 = r0.A00
            r67 = r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0029
            r0 = r68
            X.1Hc r0 = r0.A05
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "ContactSyncRequestExecutor/onStartRun exiting early for non-urgent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2rf r1 = X.C62602rf.A05
            r0 = r69
            r0.A09(r1)
            return
        L_0x0029:
            r0 = r68
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0X
            r28 = r0
            monitor-enter(r28)
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x2cdf }
            r0 = r68
            X.1UT r0 = r0.A0E     // Catch:{ all -> 0x2cdf }
            r22 = r0
            monitor-enter(r22)     // Catch:{ all -> 0x2cdf }
            java.util.Set r1 = r0.A02     // Catch:{ all -> 0x2cdc }
            r0 = r67
            r1.remove(r0)     // Catch:{ all -> 0x2cdc }
            r0 = r22
            java.util.Map r1 = r0.A01     // Catch:{ all -> 0x2cdc }
            r0 = r67
            r1.remove(r0)     // Catch:{ all -> 0x2cdc }
            X.AnonymousClass1UT.A00(r22)     // Catch:{ all -> 0x2cdc }
            monitor-exit(r22)     // Catch:{ all -> 0x2cdf }
            monitor-enter(r22)     // Catch:{ all -> 0x2cdf }
            r1 = r0
            r0 = r22
            r0.A00 = r1     // Catch:{ all -> 0x2cdc }
            X.AnonymousClass1UT.A00(r22)     // Catch:{ all -> 0x2cdc }
            monitor-exit(r22)     // Catch:{ all -> 0x2cdf }
            monitor-exit(r28)     // Catch:{ all -> 0x2cdf }
            r0 = r68
            X.1KB r0 = r0.A03
            r66 = r0
            r0 = r68
            X.00H r0 = r0.A0T
            java.lang.Object r2 = r0.get()
            r2.getClass()
            r0 = 37
            X.3Bp r1 = new X.3Bp
            r1.<init>(r2, r0)
            r0 = r66
            r0.A0J(r1)
            r0 = r67
            boolean r0 = r0.A0C
            r24 = r0
            r0 = r67
            boolean r0 = r0.A0I
            r21 = r0
            r0 = r67
            boolean r0 = r0.A0J
            r29 = r0
            r0 = r67
            boolean r3 = r0.A0H
            boolean r0 = r0.A0B
            r17 = r0
            r0 = r67
            boolean r0 = r0.A0D
            r16 = r0
            r0 = r67
            boolean r4 = r0.A0G
            boolean r0 = r0.A0E
            r26 = r0
            r0 = r67
            boolean r0 = r0.A0F
            r18 = r0
            r0 = r67
            boolean r0 = r0.A0A
            r19 = r0
            r0 = r67
            boolean r0 = r0.A0L
            r27 = r0
            r0 = r67
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x00c3
            r0 = r68
            X.0ve r0 = r0.A0M
            boolean r0 = X.C18020vd.A06(r0)
            r23 = 1
            if (r0 != 0) goto L_0x00c5
        L_0x00c3:
            r23 = 0
        L_0x00c5:
            r0 = r67
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x00ef
            r0 = r68
            X.11S r0 = r0.A04
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x00e0
            r0 = r68
            X.1CM r0 = r0.A0O
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00ef
        L_0x00e0:
            java.lang.String r0 = "ContactSyncRequestExecutor/registration not complete"
        L_0x00e2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e5:
            X.2rf r1 = X.C62602rf.A03
        L_0x00e7:
            r0 = r69
            r0.A09(r1)
        L_0x00ec:
            monitor-enter(r28)
            goto L_0x2c39
        L_0x00ef:
            r0 = r68
            X.11E r0 = r0.A08
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0101
            X.2rf r1 = X.C62602rf.A04
        L_0x00fb:
            r0 = r69
            r0.A08(r1)
            goto L_0x00ec
        L_0x0101:
            r0 = r68
            X.11P r8 = r0.A0H
            long r6 = X.AnonymousClass11P.A01(r8)
            X.1Tt r0 = r0.A0B
            r65 = r0
            android.content.SharedPreferences r5 = X.C26861Tt.A00(r65)
            java.lang.String r2 = "global_backoff_time"
            r0 = -1
            long r9 = r5.getLong(r2, r0)
            java.lang.String r5 = "ms"
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x013d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/global backoff for another "
            r3.append(r0)
            r0 = r65
            long r0 = A00(r0, r2)
            long r0 = r0 - r6
            r3.append(r0)
            r3.append(r5)
        L_0x0135:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00e5
        L_0x013d:
            r0 = r67
            X.2R1 r2 = r0.A03
            X.2Qw r1 = r2.mode
            X.2Qw r0 = X.C49542Qw.DOWNLOAD
            if (r1 != r0) goto L_0x0279
            r7 = 1
            r0 = r68
            X.1UO r3 = r0.A0A
            r8 = 2
            java.lang.String r0 = "sync/restore/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1UN r6 = r3.A0I
            X.0z4 r0 = r6.A02
            long r4 = r0.A0O()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            java.lang.String r0 = "sync/restore/done before"
        L_0x0164:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2rf r1 = X.C62602rf.A08
        L_0x0169:
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x06af
            X.2R1 r0 = X.AnonymousClass2R1.A02
            X.2sh r3 = X.C63212sh.A00(r0)
            r3.A05 = r7
            X.2qq r0 = X.C62132qq.A0C
            r3.A00 = r0
            r3.A03 = r7
            X.2re r2 = r3.A02()
            r0 = r68
            X.AnonymousClass1US.A03(r0, r2)
            goto L_0x00e7
        L_0x0188:
            X.0z4 r4 = r3.A0G
            int r0 = r4.A0D()
            if (r0 == r7) goto L_0x0194
            java.lang.String r0 = "sync/restore/integrity check failed"
            goto L_0x0164
        L_0x0194:
            boolean r0 = r6.A06()
            if (r0 != 0) goto L_0x01b9
            X.00H r0 = r3.A0W
            java.lang.Object r5 = r0.get()
            X.1Ua r5 = (X.C26931Ua) r5
            X.11P r0 = r5.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            r2 = 7
            X.C26931Ua.A00(r5, r2, r0)
            X.11P r0 = r3.A0F
            long r0 = X.AnonymousClass11P.A01(r0)
            r4.A1M(r0)
            java.lang.String r0 = "sync/restore/disable"
            goto L_0x0164
        L_0x01b9:
            X.00H r0 = r3.A0S
            java.lang.Object r0 = r0.get()
            X.1jR r0 = (X.C33821jR) r0
            X.1UW r0 = r0.A00
            X.8ct r0 = r0.A00()
            if (r0 != 0) goto L_0x01cd
            java.lang.String r0 = "sync/restore/no key"
            goto L_0x0164
        L_0x01cd:
            X.00H r0 = r3.A0V
            java.lang.Object r1 = r0.get()
            com.whatsapp.contact.sync.NativeContactsDownloadHelper r1 = (com.whatsapp.contact.sync.NativeContactsDownloadHelper) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.1Ug r9 = r1.A01(r0, r7)
            java.lang.String r5 = "contact/restore"
            java.lang.String r8 = "/exception"
            r2 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException -> 0x01ee, ExecutionException -> 0x0200, InterruptedException | TimeoutException -> 0x021e }
            r0 = 64000(0xfa00, double:3.162E-319)
            java.lang.Object r0 = r9.get(r0, r6)     // Catch:{ RuntimeException -> 0x01ee, ExecutionException -> 0x0200, InterruptedException | TimeoutException -> 0x021e }
            X.2Wa r0 = (X.C50852Wa) r0     // Catch:{ RuntimeException -> 0x01ee, ExecutionException -> 0x0200, InterruptedException | TimeoutException -> 0x021e }
            goto L_0x0220
        L_0x01ee:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0h(r5, r8, r0, r2)
            X.190 r1 = r3.A04
            java.lang.String r0 = r2.getMessage()
            r1.A0G(r5, r0, r7)
            goto L_0x021e
        L_0x0200:
            r6 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0h(r5, r8, r0, r6)
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof X.C26941Uc
            if (r0 == 0) goto L_0x0248
            X.190 r1 = r3.A04
            java.lang.Throwable r0 = r6.getCause()
            java.lang.String r0 = r0.getMessage()
            r2 = 0
        L_0x021b:
            r1.A0G(r5, r0, r2)
        L_0x021e:
            X.2Cv r0 = X.C50852Wa.A02
        L_0x0220:
            boolean r0 = r0 instanceof X.C46062Cs
            if (r0 == 0) goto L_0x026f
            X.11P r0 = r3.A0F
            long r0 = X.AnonymousClass11P.A01(r0)
            r4.A1M(r0)
            X.1To r0 = r3.A05
            r0.A0G()
            r0.A0I()
            X.1M9 r3 = r3.A06
            X.11A r2 = r3.A0I
            r1 = 29
            X.7Pc r0 = new X.7Pc
            r0.<init>(r3, r1)
            r2.A00(r0)
            java.lang.String r0 = "sync/restore/success"
            goto L_0x0164
        L_0x0248:
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0268
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L_0x021e
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.AssertionError
            if (r0 != 0) goto L_0x021e
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.OutOfMemoryError
            if (r0 != 0) goto L_0x021e
        L_0x0268:
            X.190 r1 = r3.A04
            java.lang.String r0 = r6.getMessage()
            goto L_0x021b
        L_0x026f:
            java.lang.String r0 = "sync/restore/fail"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2rf r1 = X.C62602rf.A03
            goto L_0x0169
        L_0x0279:
            r0 = r68
            X.1UN r0 = r0.A0K
            r64 = r0
            boolean r0 = r64.A09()
            if (r0 == 0) goto L_0x02a2
            X.2R1 r0 = X.AnonymousClass2R1.A0A
            if (r2 == r0) goto L_0x028d
            X.2R1 r1 = X.AnonymousClass2R1.A09
            if (r2 != r1) goto L_0x02a2
        L_0x028d:
            X.2R1 r12 = X.AnonymousClass2R1.A09
            if (r2 != r12) goto L_0x0596
            r1 = r68
            X.1M9 r6 = r1.A09
            X.1M2 r1 = r6.A04
            r5 = 1
            X.1Ez r7 = new X.1Ez
            r7.<init>((boolean) r5)
            r7.A04()
            goto L_0x0529
        L_0x02a2:
            X.2Qw r1 = r2.mode
            X.2Qw r40 = X.C49542Qw.FULL
            r0 = r40
            if (r1 != r0) goto L_0x0504
            if (r24 == 0) goto L_0x02d4
            android.content.SharedPreferences r8 = X.C26861Tt.A00(r65)
            java.lang.String r9 = "contact_sync_backoff"
            r0 = -1
            long r10 = r8.getLong(r9, r0)
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d4
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/contact backoff for another "
            r8.append(r0)
            r0 = r65
            long r0 = A00(r0, r9)
            long r0 = r0 - r6
            r8.append(r0)
            X.C17890vO.A1A(r8, r5)
            r24 = 0
        L_0x02d4:
            if (r21 == 0) goto L_0x02ff
            android.content.SharedPreferences r9 = X.C26861Tt.A00(r65)
            java.lang.String r8 = "sidelist_sync_backoff"
            r0 = -1
            long r9 = r9.getLong(r8, r0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ff
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/sidelist backoff for another "
            r9.append(r0)
            r0 = r65
            long r0 = A00(r0, r8)
            long r0 = r0 - r6
            r9.append(r0)
            X.C17890vO.A1A(r9, r5)
            r21 = 0
        L_0x02ff:
            if (r29 == 0) goto L_0x032a
            android.content.SharedPreferences r8 = X.C26861Tt.A00(r65)
            java.lang.String r9 = "status_sync_backoff"
            r0 = -1
            long r10 = r8.getLong(r9, r0)
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x032a
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/status backoff for another "
            r8.append(r0)
            r0 = r65
            long r0 = A00(r0, r9)
            long r0 = r0 - r6
            r8.append(r0)
            X.C17890vO.A1A(r8, r5)
            r29 = 0
        L_0x032a:
            if (r23 == 0) goto L_0x0355
            android.content.SharedPreferences r9 = X.C26861Tt.A00(r65)
            java.lang.String r8 = "text_status_sync_backoff"
            r0 = -1
            long r9 = r9.getLong(r8, r0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0355
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/text status backoff for another "
            r9.append(r0)
            r0 = r65
            long r0 = A00(r0, r8)
            long r0 = r0 - r6
            r9.append(r0)
            X.C17890vO.A1A(r9, r5)
            r23 = 0
        L_0x0355:
            if (r3 == 0) goto L_0x037d
            android.content.SharedPreferences r3 = X.C26861Tt.A00(r65)
            java.lang.String r8 = "picture_sync_backoff"
            r0 = -1
            long r9 = r3.getLong(r8, r0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f3
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/picture backoff for another "
            r3.append(r0)
            r0 = r65
            long r0 = A00(r0, r8)
            long r0 = r0 - r6
            r3.append(r0)
            X.C17890vO.A1A(r3, r5)
        L_0x037d:
            r11 = 0
        L_0x037e:
            if (r17 == 0) goto L_0x03a8
            android.content.SharedPreferences r8 = X.C26861Tt.A00(r65)
            java.lang.String r3 = "business_sync_backoff"
            r0 = -1
            long r8 = r8.getLong(r3, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a8
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/business backoff for another "
            r8.append(r0)
            r0 = r65
            long r0 = A00(r0, r3)
            long r0 = r0 - r6
            r8.append(r0)
            X.C17890vO.A1A(r8, r5)
            r17 = 0
        L_0x03a8:
            if (r16 == 0) goto L_0x03dc
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            java.lang.String r1 = "devices_sync_backoff"
            long r8 = X.C17890vO.A04(r0, r1)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x03dc
            X.2Qy r3 = r2.context
            X.2Qy r0 = X.C49562Qy.MESSAGE
            if (r3 == r0) goto L_0x03dc
            X.2Qy r0 = X.C49562Qy.VOIP
            if (r3 == r0) goto L_0x03dc
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/devices backoff for another "
            r3.append(r0)
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            long r0 = X.C17890vO.A04(r0, r1)
            long r0 = r0 - r6
            r3.append(r0)
            X.C17890vO.A1A(r3, r5)
            r16 = 0
        L_0x03dc:
            if (r4 == 0) goto L_0x0404
            android.content.SharedPreferences r3 = X.C26861Tt.A00(r65)
            java.lang.String r4 = "payment_sync_backoff"
            r0 = -1
            long r8 = r3.getLong(r4, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e6
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/payment backoff for another "
            r3.append(r0)
            r0 = r65
            long r0 = A00(r0, r4)
            long r0 = r0 - r6
            r3.append(r0)
            X.C17890vO.A1A(r3, r5)
        L_0x0404:
            r9 = 0
        L_0x0405:
            if (r26 == 0) goto L_0x042f
            android.content.SharedPreferences r3 = X.C26861Tt.A00(r65)
            java.lang.String r4 = "disappearing_mode_sync_backoff"
            r0 = -1
            long r12 = r3.getLong(r4, r0)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x042f
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/disappearing_mode backoff for another "
            r3.append(r0)
            r0 = r65
            long r0 = A00(r0, r4)
            long r0 = r0 - r6
            r3.append(r0)
            X.C17890vO.A1A(r3, r5)
            r26 = 0
        L_0x042f:
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r65)
            java.lang.String r0 = "lid_sync_backoff"
            r3 = -1
            long r0 = r1.getLong(r0, r3)
            if (r18 == 0) goto L_0x0453
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0453
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r8 = "ContactSyncRequestExecutor/lid backoff for another "
            r10.append(r8)
            long r0 = r0 - r6
            r10.append(r0)
            X.C17890vO.A1A(r10, r5)
            r18 = 0
        L_0x0453:
            r0 = r68
            X.0ve r0 = r0.A0M
            r63 = r0
            r8 = 5290(0x14aa, float:7.413E-42)
            X.0vf r39 = X.C18040vf.A02
            r1 = r39
            boolean r0 = X.C18020vd.A05(r1, r0, r8)
            r27 = r27 & r0
            if (r27 == 0) goto L_0x048e
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            java.lang.String r1 = "username_sync_backoff"
            long r12 = r0.getLong(r1, r3)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x048e
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/username backoff for another "
            r8.append(r0)
            r0 = r65
            long r0 = A00(r0, r1)
            long r0 = r0 - r6
            r8.append(r0)
            X.C17890vO.A1A(r8, r5)
            r27 = 0
        L_0x048e:
            r0 = r68
            X.0zA r0 = r0.A01
            boolean r1 = r0.A07()
            if (r1 == 0) goto L_0x04a5
            java.lang.Object r0 = r0.A03()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L_0x04a6
        L_0x04a5:
            r0 = 0
        L_0x04a6:
            r19 = r19 & r0
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r65)
            java.lang.String r0 = "bot_sync_backoff"
            long r0 = r1.getLong(r0, r3)
            if (r19 == 0) goto L_0x04ca
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x04ca
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "ContactSyncRequestExecutor/bot backoff for another "
            r4.append(r3)
            long r0 = r0 - r6
            r4.append(r0)
            X.C17890vO.A1A(r4, r5)
            r19 = 0
        L_0x04ca:
            if (r24 != 0) goto L_0x06d2
            if (r21 != 0) goto L_0x06d2
            if (r11 != 0) goto L_0x06d2
            if (r29 != 0) goto L_0x06d2
            if (r17 != 0) goto L_0x06d2
            if (r16 != 0) goto L_0x06d2
            if (r9 != 0) goto L_0x06d2
            if (r26 != 0) goto L_0x06d2
            if (r18 != 0) goto L_0x06d2
            if (r19 != 0) goto L_0x06d2
            if (r27 != 0) goto L_0x06d2
            if (r23 != 0) goto L_0x06d2
            java.lang.String r0 = "ContactSyncRequestExecutor/no syncing protocol should be requested at this moment due to error backoff"
            goto L_0x00e2
        L_0x04e6:
            r0 = r68
            X.1QO r0 = r0.A0N
            boolean r0 = r0.A0D()
            r9 = 1
            if (r0 != 0) goto L_0x0405
            goto L_0x0404
        L_0x04f3:
            X.2R1 r0 = X.AnonymousClass2R1.A0L
            if (r2 == r0) goto L_0x0501
            X.2R1 r0 = X.AnonymousClass2R1.A06
            if (r2 == r0) goto L_0x0501
            X.2R1 r0 = X.AnonymousClass2R1.A07
            if (r2 == r0) goto L_0x0501
            if (r19 == 0) goto L_0x037d
        L_0x0501:
            r11 = 1
            goto L_0x037e
        L_0x0504:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x02ff
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r65)
            java.lang.String r0 = "delta_sync_backoff"
            long r0 = X.C17890vO.A04(r1, r0)
            long r0 = r0 - r6
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x02ff
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ContactSyncRequestExecutor/delta sync backoff time="
            r3.append(r2)
            r3.append(r0)
            goto L_0x0135
        L_0x0529:
            X.1Lt r1 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0550 }
            X.1au r9 = r1.A06()     // Catch:{ IllegalArgumentException -> 0x0550 }
            android.content.ContentValues r10 = X.C17880vN.A09(r5)     // Catch:{ all -> 0x0546 }
            java.lang.String r3 = "is_contact_synced"
            r1 = 0
            X.C17880vN.A18(r10, r3, r1)     // Catch:{ all -> 0x0546 }
            java.lang.String r4 = "wa_contacts"
            java.lang.String r3 = "is_contact_synced = 1"
            r1 = 0
            X.C24861Ly.A01(r10, r9, r4, r3, r1)     // Catch:{ all -> 0x0546 }
            r9.close()     // Catch:{ IllegalArgumentException -> 0x0550 }
            goto L_0x0556
        L_0x0546:
            r3 = move-exception
            r9.close()     // Catch:{ all -> 0x054b }
            goto L_0x054f
        L_0x054b:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0550 }
        L_0x054f:
            throw r3     // Catch:{ IllegalArgumentException -> 0x0550 }
        L_0x0550:
            r3 = move-exception
            java.lang.String r1 = "ContactManagerDatabase/resetContactSyncStatus failed "
            X.C17960vV.A09(r1, r3)
        L_0x0556:
            r7.A01()
            X.1Lo r1 = r6.A02
            X.00H r1 = r1.A00
            java.lang.Object r4 = r1.get()
            X.1Ly r4 = (X.C24861Ly) r4
            android.content.ContentValues r7 = X.C17880vN.A09(r5)
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "is_contact_synced"
            r7.put(r1, r3)
            X.1Lt r1 = r4.A00
            X.1au r5 = r1.A06()
            java.lang.String r4 = "wa_address_book"
            java.lang.String r3 = "is_contact_synced = 1"
            r1 = 0
            X.C24861Ly.A01(r7, r5, r4, r3, r1)     // Catch:{ all -> 0x2c5f }
            r5.close()
            X.1MA r1 = r6.A03
            java.util.Map r1 = r1.A02
            r1.clear()
            X.11A r4 = r6.A0I
            r3 = 30
            X.7Pc r1 = new X.7Pc
            r1.<init>(r6, r3)
            r4.A00(r1)
        L_0x0596:
            r1 = r68
            X.1UO r11 = r1.A0A
            r1 = r67
            java.lang.Integer r3 = r1.A01
            X.1UK r1 = r11.A0A
            X.2Gl r10 = r1.A01(r3)
            java.lang.String r13 = "ContactSyncHelper/upload"
            X.1UN r1 = r11.A0I     // Catch:{ RuntimeException -> 0x067f }
            boolean r1 = r1.A03()     // Catch:{ RuntimeException -> 0x067f }
            if (r1 != 0) goto L_0x05b8
            java.lang.String r1 = "sync/upload/not eligible to upload contact"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x067f }
        L_0x05b4:
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x068b
        L_0x05b8:
            X.00H r1 = r11.A0S     // Catch:{ RuntimeException -> 0x067f }
            java.lang.Object r1 = r1.get()     // Catch:{ RuntimeException -> 0x067f }
            X.1jR r1 = (X.C33821jR) r1     // Catch:{ RuntimeException -> 0x067f }
            X.1UW r1 = r1.A00     // Catch:{ RuntimeException -> 0x067f }
            X.8ct r9 = r1.A00()     // Catch:{ RuntimeException -> 0x067f }
            if (r9 != 0) goto L_0x05dd
            java.lang.String r1 = "sync/upload/no key"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x067f }
            X.10I r4 = r11.A0O     // Catch:{ RuntimeException -> 0x067f }
            r1 = 31
            X.3Bp r3 = new X.3Bp     // Catch:{ RuntimeException -> 0x067f }
            r3.<init>(r11, r1)     // Catch:{ RuntimeException -> 0x067f }
            java.lang.String r1 = "hsm-handshake-from-delta-sync"
            r4.CGL(r3, r1)     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x05b4
        L_0x05dd:
            X.1M9 r7 = r11.A06     // Catch:{ RuntimeException -> 0x067f }
            java.util.ArrayList r6 = r7.A0N()     // Catch:{ RuntimeException -> 0x067f }
            r16 = 0
        L_0x05e5:
            boolean r1 = r6.isEmpty()     // Catch:{ RuntimeException -> 0x067f }
            if (r1 != 0) goto L_0x0677
            r6.size()     // Catch:{ RuntimeException -> 0x067f }
            java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x067f }
            java.util.Iterator r15 = r6.iterator()     // Catch:{ RuntimeException -> 0x067f }
        L_0x05f6:
            boolean r1 = r15.hasNext()     // Catch:{ RuntimeException -> 0x067f }
            r5 = 1
            if (r1 == 0) goto L_0x061a
            X.1E7 r1 = X.C17880vN.A0O(r15)     // Catch:{ RuntimeException -> 0x067f }
            X.A4m r3 = new X.A4m     // Catch:{ RuntimeException -> 0x067f }
            r3.<init>(r1)     // Catch:{ RuntimeException -> 0x067f }
            r3.A0D = r5     // Catch:{ RuntimeException -> 0x067f }
            X.00H r4 = r11.A0T     // Catch:{ RuntimeException -> 0x067f }
            java.lang.Object r4 = r4.get()     // Catch:{ RuntimeException -> 0x067f }
            X.1UV r4 = (X.AnonymousClass1UV) r4     // Catch:{ RuntimeException -> 0x067f }
            byte[] r1 = r4.A00(r1, r9)     // Catch:{ RuntimeException -> 0x067f }
            r3.A0Q = r1     // Catch:{ RuntimeException -> 0x067f }
            X.C17880vN.A1H(r3, r14)     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x05f6
        L_0x061a:
            X.Acn r4 = X.AnonymousClass1UO.A01(r11)     // Catch:{ RuntimeException -> 0x067f }
            java.lang.String r1 = "sync_sid_upload"
            java.lang.String r3 = X.C63412t2.A00(r1)     // Catch:{ RuntimeException -> 0x067f }
            r1 = 0
            X.A01 r1 = X.AnonymousClass1UO.A02(r11, r0, r14, r1)     // Catch:{ RuntimeException -> 0x067f }
            X.1Ug r3 = A04(r4, r1, r3)     // Catch:{ RuntimeException -> 0x067f }
            r1 = 0
            boolean r1 = X.AnonymousClass1UO.A0B(r11, r1, r1, r13, r3)     // Catch:{ RuntimeException -> 0x067f }
            if (r1 != 0) goto L_0x063e
            java.lang.String r1 = "sync/upload/fail to wait for callback"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x067f }
        L_0x063b:
            X.2rf r1 = X.C62602rf.A03     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x068b
        L_0x063e:
            X.2cQ r1 = r11.A00     // Catch:{ RuntimeException -> 0x067f }
            if (r1 == 0) goto L_0x0670
            X.2n4 r1 = r1.A00     // Catch:{ RuntimeException -> 0x067f }
            X.A00 r4 = r1.A02     // Catch:{ RuntimeException -> 0x067f }
            if (r4 == 0) goto L_0x0670
            boolean r1 = r4.A04     // Catch:{ RuntimeException -> 0x067f }
            if (r1 == 0) goto L_0x0661
            java.lang.String r1 = "sync/upload/update state"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x067f }
            int r1 = r6.size()     // Catch:{ RuntimeException -> 0x067f }
            long r3 = (long) r1     // Catch:{ RuntimeException -> 0x067f }
            long r16 = r16 + r3
            r7.A0r(r6, r5)     // Catch:{ RuntimeException -> 0x067f }
            java.util.ArrayList r6 = r7.A0N()     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x05e5
        L_0x0661:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x067f }
            java.lang.String r1 = "sync/upload/update error code:"
            r3.append(r1)     // Catch:{ RuntimeException -> 0x067f }
            java.lang.Integer r1 = r4.A01     // Catch:{ RuntimeException -> 0x067f }
            X.C17900vP.A0b(r1, r3)     // Catch:{ RuntimeException -> 0x067f }
        L_0x0670:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x067f }
            r10.A08 = r1     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x063b
        L_0x0677:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x067f }
            r10.A08 = r1     // Catch:{ RuntimeException -> 0x067f }
            goto L_0x05b4
        L_0x067f:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "ContactSyncHelper/runAndHandleExceptions "
            X.C17900vP.A0h(r1, r13, r3, r4)
            X.2rf r1 = X.C62602rf.A02
        L_0x068b:
            X.AnonymousClass1UO.A08(r11, r1, r0, r10)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x06af
            if (r2 != r12) goto L_0x00e7
            r0 = r68
            X.1UZ r0 = r0.A0L
            long r2 = X.AnonymousClass11P.A01(r8)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.lang.String r0 = "force_full_contacts_backup_timestamp"
            X.C17880vN.A1D(r4, r0, r2)
            goto L_0x00e7
        L_0x06af:
            r0 = r67
            int r0 = r0.A00
            int r2 = r0 + 1
            r0 = r67
            r0.A00 = r2
            r0 = r68
            X.0ve r3 = r0.A0M
            r2 = 1390(0x56e, float:1.948E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r3, r2)
            r0 = r67
            int r0 = r0.A00
            if (r0 > r2) goto L_0x00e7
            int r2 = r1.A00
            r0 = 6
            if (r2 != r0) goto L_0x00fb
            goto L_0x00e7
        L_0x06d2:
            r0 = r68
            X.1UR r0 = r0.A0C
            r62 = r0
            X.2HO r8 = new X.2HO
            r8.<init>()
            java.lang.String r0 = r2.toString()
            r8.A0L = r0
            r0 = r67
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A02 = r0
            r0 = r67
            boolean r0 = r0.A07
            r38 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r38)
            r8.A01 = r0
            r0 = r67
            int r0 = r0.A00
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r8.A0G = r0
            boolean r0 = r67.A03()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A03 = r0
            r0 = r62
            java.util.HashMap r3 = r0.A03
            X.11P r0 = r0.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            X.C17880vN.A1N(r8, r3, r0)
            r0 = r68
            X.00H r0 = r0.A0U
            r61 = r0
            java.lang.Object r0 = r61.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r35 = r0.A02()
            X.2Qe r1 = r2.scope
            X.2Qe r32 = X.C49362Qe.PHONEBOOK
            r0 = r32
            if (r1 == r0) goto L_0x0738
            X.2Qe r0 = X.C49362Qe.PHONEBOOK_AND_SIDELIST
            r25 = 0
            if (r1 != r0) goto L_0x073a
        L_0x0738:
            r25 = 1
        L_0x073a:
            X.2Qe r31 = X.C49362Qe.SIDELIST
            r0 = r31
            if (r1 == r0) goto L_0x0746
            X.2Qe r0 = X.C49362Qe.PHONEBOOK_AND_SIDELIST
            r34 = 0
            if (r1 != r0) goto L_0x0748
        L_0x0746:
            r34 = 1
        L_0x0748:
            if (r25 == 0) goto L_0x0a0a
            r0 = r68
            X.1M9 r4 = r0.A09
            X.11C r3 = r0.A0G
            X.17x r1 = r0.A0J
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0918
            java.lang.String r0 = "system-contacts-query/all/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Map r3 = java.util.Collections.emptyMap()
            if (r3 != 0) goto L_0x096a
        L_0x0766:
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.Map r1 = java.util.Collections.emptyMap()
            X.2c2 r30 = new X.2c2
            r0 = r30
            r0.<init>(r3, r1)
        L_0x0775:
            java.util.Map r0 = r0.A01
            int r1 = r0.size()
            r0 = r30
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            int r1 = r1 + r0
            java.lang.Long r0 = X.C17880vN.A0n(r1)
            r8.A07 = r0
            r20 = 0
        L_0x078c:
            r0 = r67
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x07ca
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x07ca
            X.2Qy r1 = r2.context
            X.2Qy r0 = X.C49562Qy.CONTACT_DISCOVERY
            if (r1 == r0) goto L_0x07ca
            if (r34 == 0) goto L_0x0915
            if (r21 == 0) goto L_0x0915
            r0 = r68
            X.1M9 r1 = r0.A09
            X.1Nd r0 = r0.A0F
            java.util.HashSet r0 = r0.A0D()
            java.util.ArrayList r20 = r1.A0O(r0)
            int r1 = r20.size()
        L_0x07b4:
            if (r30 == 0) goto L_0x083a
            r0 = r30
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x07ca
            r0 = r30
            java.util.Map r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x083a
        L_0x07ca:
            X.2Qe r1 = r2.scope
            X.2Qe r46 = X.C49362Qe.MULTI_PROTOCOLS_QUERY
            r0 = r46
            if (r1 != r0) goto L_0x07e2
            r0 = r67
            java.util.Set r1 = r0.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x2c05
            r0 = r68
            java.util.ArrayList r20 = X.AnonymousClass1US.A01(r0, r1)
        L_0x07e2:
            X.2Qw r5 = r2.mode
            java.lang.String r4 = r5.modeString
            java.lang.String r3 = "; isContact="
            java.lang.String r1 = "; isSidelist="
            r0 = r40
            if (r5 != r0) goto L_0x07f0
            if (r24 != 0) goto L_0x0802
        L_0x07f0:
            X.2Qy r5 = r2.context
            X.2Qy r0 = X.C49562Qy.NOTIFICATION
            if (r5 != r0) goto L_0x07f8
            if (r25 != 0) goto L_0x0802
        L_0x07f8:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0838
            if (r25 == 0) goto L_0x0838
            if (r34 == 0) goto L_0x0838
        L_0x0802:
            r10 = 1
        L_0x0803:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "syncMode:"
            X.C17890vO.A10(r0, r4, r3, r5)
            r0 = r24
            r5.append(r0)
            r5.append(r1)
            r0 = r21
            r5.append(r0)
            r5.toString()
            if (r10 == 0) goto L_0x0abe
            r0 = r68
            X.1M9 r0 = r0.A09
            X.1M2 r1 = r0.A04
            r15 = 1
            X.1Ez r14 = new X.1Ez
            r14.<init>((boolean) r15)
            r14.A04()
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            X.1at r12 = X.C24801Ls.A00(r1)
            goto L_0x0a34
        L_0x0838:
            r10 = 0
            goto L_0x0803
        L_0x083a:
            if (r1 != 0) goto L_0x07ca
            boolean r0 = r64.A08()
            r12 = 0
            r10 = 1
            if (r0 == 0) goto L_0x08d7
            boolean r0 = r64.A03()
            if (r0 == 0) goto L_0x08a9
            boolean r0 = r64.A09()
            if (r0 == 0) goto L_0x08a9
            r0 = r68
            X.1M9 r0 = r0.A09
            X.1M2 r0 = r0.A04
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r10)
            r5.A04()
            X.1at r4 = X.C24801Ls.A00(r0)     // Catch:{ IllegalStateException -> 0x089b }
            java.lang.String r3 = "SELECT is_whatsapp_user FROM wa_contacts WHERE is_whatsapp_user = 1 AND sync_policy = 1 AND raw_contact_id = -1 LIMIT 1"
            java.lang.String r1 = "UNSYNCED_NATIVE_CONTACTS"
            r0 = 0
            android.database.Cursor r13 = X.C24861Ly.A03(r4, r3, r1, r0)     // Catch:{ all -> 0x088e }
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0882 }
            if (r0 == 0) goto L_0x0873
            r3 = 1
            goto L_0x0879
        L_0x0873:
            java.lang.String r0 = "ContactManagerDatabase/isUnsyncedNativeContactsAvailable missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0882 }
            r3 = 0
        L_0x0879:
            r13.close()     // Catch:{ all -> 0x0880 }
            r4.close()     // Catch:{ IllegalStateException -> 0x0899 }
            goto L_0x08a2
        L_0x0880:
            r0 = move-exception
            goto L_0x0890
        L_0x0882:
            r1 = move-exception
            if (r13 == 0) goto L_0x088d
            r13.close()     // Catch:{ all -> 0x0889 }
            goto L_0x088d
        L_0x0889:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x088e }
        L_0x088d:
            throw r1     // Catch:{ all -> 0x088e }
        L_0x088e:
            r0 = move-exception
            r3 = 0
        L_0x0890:
            r4.close()     // Catch:{ all -> 0x0894 }
            goto L_0x0898
        L_0x0894:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ IllegalStateException -> 0x0899 }
        L_0x0898:
            throw r0     // Catch:{ IllegalStateException -> 0x0899 }
        L_0x0899:
            r1 = move-exception
            goto L_0x089d
        L_0x089b:
            r1 = move-exception
            r3 = 0
        L_0x089d:
            java.lang.String r0 = "ContactManagerDatabase/isUnsyncedNativeContactsAvailable/"
            X.AnonymousClass1M2.A0G(r1, r0, r12, r12)
        L_0x08a2:
            r5.A01()
            if (r3 == 0) goto L_0x08a9
            goto L_0x07ca
        L_0x08a9:
            r0 = r68
            X.17x r1 = r0.A0J
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r1 = r1.A03(r0)
            r0 = -1
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            r0 = r64
            X.0z4 r0 = r0.A02
            boolean r0 = r0.A2J()
            r0 = r0 ^ 1
            if (r1 == 0) goto L_0x08d7
            if (r0 == 0) goto L_0x08d7
            r0 = r68
            X.1M9 r0 = r0.A09
            int r1 = r0.A07()
            int r0 = r0.A08()
            int r1 = r1 + r0
            if (r1 <= 0) goto L_0x2c1d
            goto L_0x07ca
        L_0x08d7:
            boolean r0 = r64.A09()
            if (r0 != 0) goto L_0x2c1d
            boolean r0 = r64.A03()
            if (r0 == 0) goto L_0x2c1d
            r0 = r68
            X.1M9 r0 = r0.A09
            X.1M2 r0 = r0.A04
            java.util.ArrayList r0 = r0.A0L()
            java.util.Iterator r3 = r0.iterator()
        L_0x08f1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x2c1d
            X.1E7 r1 = X.C17880vN.A0O(r3)
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x08f1
            int r0 = r1.A09
            if (r0 != r10) goto L_0x0909
            int r0 = r1.A01
            if (r0 != r10) goto L_0x07ca
        L_0x0909:
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x08f1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x08f1
            goto L_0x07ca
        L_0x0915:
            r1 = 0
            goto L_0x07b4
        L_0x0918:
            X.11B r41 = r3.A0O()
            r45 = 0
            if (r41 != 0) goto L_0x0928
            java.lang.String r0 = "system-contacts-query/all cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0766
        L_0x0928:
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.String[] r43 = X.C17880vN.A1Z()
            r0 = 0
            java.lang.String r1 = "_id"
            r43[r0] = r1
            r5 = 1
            java.lang.String r0 = "version"
            r43[r5] = r0
            android.net.Uri r42 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ Exception -> 0x0a01 }
            java.lang.String r44 = X.C63562tJ.A01()     // Catch:{ Exception -> 0x0a01 }
            r46 = r45
            android.database.Cursor r5 = r41.A03(r42, r43, r44, r45, r46)     // Catch:{ Exception -> 0x0a01 }
            if (r5 == 0) goto L_0x09ed
            int r10 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x09f5 }
            int r12 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09f5 }
        L_0x0951:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x09f5 }
            if (r0 == 0) goto L_0x0967
            long r13 = r5.getLong(r10)     // Catch:{ all -> 0x09f5 }
            int r1 = r5.getInt(r12)     // Catch:{ all -> 0x09f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x09f5 }
            X.C17890vO.A0z(r0, r3, r1)     // Catch:{ all -> 0x09f5 }
            goto L_0x0951
        L_0x0967:
            r5.close()     // Catch:{ Exception -> 0x0a01 }
        L_0x096a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "system-contacts-query/all/"
            r1.append(r0)
            int r0 = r3.size()
            X.C17900vP.A0o(r1, r0)
            X.1M2 r0 = r4.A04
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            X.1at r12 = X.C24801Ls.A00(r0)
            java.lang.String r4 = "SELECT id, version FROM system_contacts_version_table"
            java.lang.String r1 = "CONTACT_SYSTEM_VERSIONS"
            r0 = 0
            android.database.Cursor r10 = X.C24861Ly.A03(r12, r4, r1, r0)     // Catch:{ all -> 0x2cd2 }
            java.lang.String r0 = "id"
            int r13 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x2cc6 }
            java.lang.String r0 = "version"
            int r5 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x2cc6 }
        L_0x099b:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x2cc6 }
            if (r0 == 0) goto L_0x09ca
            int r0 = r10.getInt(r13)     // Catch:{ all -> 0x2cc6 }
            long r0 = (long) r0     // Catch:{ all -> 0x2cc6 }
            int r4 = r10.getInt(r5)     // Catch:{ all -> 0x2cc6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x2cc6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x2cc6 }
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x2cc6 }
            if (r0 != 0) goto L_0x09bc
            r14.add(r1)     // Catch:{ all -> 0x2cc6 }
            goto L_0x099b
        L_0x09bc:
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x2cc6 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x2cc6 }
            if (r0 == 0) goto L_0x099b
            r3.remove(r1)     // Catch:{ all -> 0x2cc6 }
            goto L_0x099b
        L_0x09ca:
            r10.close()     // Catch:{ all -> 0x2cd2 }
            r12.close()
            r14.size()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "system-contacts-query/updated/"
            r1.append(r0)
            int r0 = r14.size()
            X.C17900vP.A0o(r1, r0)
            X.2c2 r30 = new X.2c2
            r0 = r30
            r0.<init>(r14, r3)
            goto L_0x0775
        L_0x09ed:
            java.lang.String r0 = "system-contacts-query/contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09f5 }
            goto L_0x0766
        L_0x09f5:
            r0 = move-exception
            if (r5 == 0) goto L_0x0a00
            r5.close()     // Catch:{ all -> 0x09fc }
            goto L_0x0a00
        L_0x09fc:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ Exception -> 0x0a01 }
        L_0x0a00:
            throw r0     // Catch:{ Exception -> 0x0a01 }
        L_0x0a01:
            r1 = move-exception
            java.lang.String r0 = "system-contacts-query/contact exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0766
        L_0x0a0a:
            if (r34 == 0) goto L_0x0a31
            if (r21 == 0) goto L_0x0a31
            r0 = r67
            java.util.Set r1 = r0.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0a22
            r0 = r68
            java.util.ArrayList r20 = X.AnonymousClass1US.A01(r0, r1)
        L_0x0a1e:
            r30 = 0
            goto L_0x078c
        L_0x0a22:
            r0 = r68
            X.1M9 r1 = r0.A09
            X.1Nd r0 = r0.A0F
            java.util.HashSet r0 = r0.A0D()
            java.util.ArrayList r20 = r1.A0O(r0)
            goto L_0x0a1e
        L_0x0a31:
            r20 = 0
            goto L_0x0a1e
        L_0x0a34:
            java.lang.String r3 = X.C42631yU.A00     // Catch:{ all -> 0x2cd2 }
            java.lang.String r5 = "GET_ALL_DB_CONTACTS_FOR_SYNC"
            r0 = 0
            android.database.Cursor r10 = X.C24861Ly.A03(r12, r3, r5, r0)     // Catch:{ all -> 0x2cd2 }
            int r4 = r10.getCount()     // Catch:{ all -> 0x2cc6 }
        L_0x0a41:
            boolean r0 = r10.moveToNext()     // Catch:{ IllegalStateException -> 0x0a57 }
            if (r0 == 0) goto L_0x0a61
            X.0vb r0 = r1.A00     // Catch:{ IllegalStateException -> 0x0a57 }
            X.1E7 r0 = X.C42651yW.A02(r10, r0)     // Catch:{ IllegalStateException -> 0x0a57 }
            boolean r3 = r0.A0H()     // Catch:{ IllegalStateException -> 0x0a57 }
            if (r3 == 0) goto L_0x0a41
            r13.add(r0)     // Catch:{ IllegalStateException -> 0x0a57 }
            goto L_0x0a41
        L_0x0a57:
            r3 = move-exception
            java.lang.String r1 = "ContactManagerDatabase/getAllDBContactsForSync/"
            int r0 = r13.size()     // Catch:{ all -> 0x2cc6 }
            X.AnonymousClass1M2.A0G(r3, r1, r4, r0)     // Catch:{ all -> 0x2cc6 }
        L_0x0a61:
            r10.close()     // Catch:{ all -> 0x2cd2 }
            r12.close()
            r13.size()
            r14.A01()
            r0 = r68
            X.00H r0 = r0.A0R
            java.lang.Object r0 = r0.get()
            X.1Lo r0 = (X.C24761Lo) r0
            X.00H r0 = r0.A00
            java.lang.Object r12 = r0.get()
            X.2Q6 r12 = (X.AnonymousClass2Q6) r12
            java.lang.String r0 = "AddressBookStore/getAllDBContactsForSync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ez r10 = new X.1Ez
            r10.<init>((boolean) r15)
            r10.A04()
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.1at r3 = X.C24801Ls.A00(r12)
            java.lang.String r1 = "SELECT _id, company, display_name, family_name, given_name, is_contact_synced, is_starred, is_whatsapp_user, jid, nickname, number, phone_label, phone_type, raw_contact_id, sort_name, sync_policy, title FROM wa_address_book"
            r0 = 0
            android.database.Cursor r1 = X.C24861Ly.A03(r3, r1, r5, r0)     // Catch:{ all -> 0x2c75 }
        L_0x0a9f:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x2c6e }
            if (r0 == 0) goto L_0x0aba
            X.0vb r0 = r12.A00     // Catch:{ all -> 0x2c6e }
            if (r0 == 0) goto L_0x2c66
            X.1E7 r0 = X.C42651yW.A01(r1, r0)     // Catch:{ all -> 0x2c6e }
            r4.add(r0)     // Catch:{ all -> 0x2c6e }
            boolean r5 = r0.A0H()     // Catch:{ all -> 0x2c6e }
            if (r5 == 0) goto L_0x0a9f
            r14.add(r0)     // Catch:{ all -> 0x2c6e }
            goto L_0x0a9f
        L_0x0aba:
            r1.close()     // Catch:{ all -> 0x2c75 }
            goto L_0x0ac5
        L_0x0abe:
            r0 = 0
            X.1D6 r1 = new X.1D6
            r1.<init>(r0, r0)
            goto L_0x0adb
        L_0x0ac5:
            r3.close()
            r14.size()
            r4.size()
            r10.A01()
            X.1D6 r0 = X.AnonymousClass1D6.A01(r14, r4)
            java.lang.Object r0 = r0.second
            X.1D6 r1 = X.AnonymousClass1D6.A01(r13, r0)
        L_0x0adb:
            java.lang.Object r0 = r1.first
            r41 = r0
            r0 = r41
            java.util.List r0 = (java.util.List) r0
            r41 = r0
            java.lang.Object r0 = r1.second
            r33 = r0
            r0 = r33
            java.util.List r0 = (java.util.List) r0
            r33 = r0
            X.2R1 r0 = X.AnonymousClass2R1.A09
            if (r2 != r0) goto L_0x0b19
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r41.iterator()
        L_0x0afb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0b11
            X.1E7 r3 = X.C17880vN.A0O(r5)
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x0afb
            r0 = 0
            r3.A01 = r0
            r4.add(r3)
            goto L_0x0afb
        L_0x0b11:
            r1 = 0
            r0 = r68
            X.1M9 r0 = r0.A09
            r0.A0t(r4, r1)
        L_0x0b19:
            X.2Qw r1 = r2.mode
            r0 = r40
            if (r1 != r0) goto L_0x0b65
            r0 = r68
            X.1M9 r0 = r0.A09
            java.util.ArrayList r47 = r0.A0L()
        L_0x0b27:
            X.2Qy r1 = r2.context
            X.2Qy r48 = X.C49562Qy.NOTIFICATION
            r0 = r48
            if (r1 != r0) goto L_0x0b68
            if (r34 == 0) goto L_0x0b68
            r0 = r68
            X.11S r0 = r0.A04
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0b6a
            r0 = r68
            X.1M9 r1 = r0.A09
            X.1Nd r0 = r0.A0F
            java.util.HashSet r0 = r0.A0D()
            java.util.ArrayList r0 = r1.A0O(r0)
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0b51:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b79
            X.1E7 r0 = X.C17880vN.A0O(r1)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r0)
            if (r0 == 0) goto L_0x0b51
            r12.add(r0)
            goto L_0x0b51
        L_0x0b65:
            r47 = 0
            goto L_0x0b27
        L_0x0b68:
            r12 = 0
            goto L_0x0b79
        L_0x0b6a:
            r0 = r68
            X.1M9 r0 = r0.A09
            X.1M2 r1 = r0.A04
            r0 = 1
            java.util.ArrayList r0 = X.AnonymousClass1M2.A08(r1, r0)
            java.util.ArrayList r12 = X.C17880vN.A10(r0)
        L_0x0b79:
            r0 = r68
            X.1UO r0 = r0.A0A
            r1 = r68
            X.00H r1 = r1.A0S
            java.lang.Object r1 = r1.get()
            X.9nw r1 = (X.C192179nw) r1
            int r34 = r1.A00()
            r1 = r67
            java.util.List r10 = r1.A05
            r1 = r68
            X.1Ty r1 = r1.A07
            java.util.HashMap r13 = r1.A0B()
            r1 = r67
            java.lang.Integer r1 = r1.A01
            r50 = r1
            X.1QS r1 = r0.A0L
            r60 = r1
            X.AnonymousClass1QS.A00(r60)
            X.1QP r1 = r1.A07
            r59 = r1
            r37 = 0
            X.2rf r1 = X.C62602rf.A03     // Catch:{ all -> 0x2c9a }
            r58 = r1
            X.0ve r3 = r0.A0J     // Catch:{ all -> 0x2c9a }
            r55 = r3
            r5 = 11234(0x2be2, float:1.5742E-41)
            r4 = r39
            boolean r3 = X.C18020vd.A05(r4, r3, r5)     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0c58
            X.00H r3 = r0.A0U     // Catch:{ all -> 0x2c9a }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x2c9a }
            X.2gH r5 = (X.C55732gH) r5     // Catch:{ all -> 0x2c9a }
            X.11P r3 = r5.A05     // Catch:{ all -> 0x2c9a }
            r49 = r3
            long r44 = X.AnonymousClass11P.A01(r49)     // Catch:{ all -> 0x2c9a }
            java.lang.Long r3 = r5.A02     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0bd5
            long r42 = r3.longValue()     // Catch:{ all -> 0x2c9a }
            goto L_0x0bd7
        L_0x0bd5:
            r42 = r44
        L_0x0bd7:
            long r14 = r44 - r42
            if (r3 != 0) goto L_0x0be1
            java.lang.Long r3 = java.lang.Long.valueOf(r44)     // Catch:{ all -> 0x2c9a }
            r5.A02 = r3     // Catch:{ all -> 0x2c9a }
        L_0x0be1:
            long r3 = X.C17880vN.A04(r14)     // Catch:{ all -> 0x2c9a }
            int r14 = (int) r3     // Catch:{ all -> 0x2c9a }
            r3 = 120(0x78, float:1.68E-43)
            if (r14 >= r3) goto L_0x0c23
            int r3 = r5.A00     // Catch:{ all -> 0x2c9a }
            int r15 = r3 + 1
            r5.A00 = r15     // Catch:{ all -> 0x2c9a }
            X.0ve r14 = r5.A06     // Catch:{ all -> 0x2c9a }
            r4 = 11235(0x2be3, float:1.5744E-41)
            r3 = r39
            int r3 = X.C18020vd.A00(r3, r14, r4)     // Catch:{ all -> 0x2c9a }
            if (r15 <= r3) goto L_0x0c58
            r3 = 0
            r5.A00 = r3     // Catch:{ all -> 0x2c9a }
            long r44 = X.AnonymousClass11P.A01(r49)     // Catch:{ all -> 0x2c9a }
            long r3 = r5.A01     // Catch:{ all -> 0x2c9a }
            r42 = -1
            int r14 = (r3 > r42 ? 1 : (r3 == r42 ? 0 : -1))
            if (r14 != 0) goto L_0x0c19
            X.1Tt r3 = r5.A04     // Catch:{ all -> 0x2c9a }
            android.content.SharedPreferences r4 = X.C26861Tt.A00(r3)     // Catch:{ all -> 0x2c9a }
            java.lang.String r3 = "contact_sync_infinite_loop_error_start_time"
            long r3 = X.C17890vO.A05(r4, r3)     // Catch:{ all -> 0x2c9a }
            r5.A01 = r3     // Catch:{ all -> 0x2c9a }
        L_0x0c19:
            long r44 = r44 - r3
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r44 > r14 ? 1 : (r44 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x0c58
            goto L_0x0c31
        L_0x0c23:
            r3 = 1
            r5.A00 = r3     // Catch:{ all -> 0x2c9a }
            long r3 = X.AnonymousClass11P.A01(r49)     // Catch:{ all -> 0x2c9a }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x2c9a }
            r5.A02 = r3     // Catch:{ all -> 0x2c9a }
            goto L_0x0c58
        L_0x0c31:
            long r3 = X.AnonymousClass11P.A01(r49)     // Catch:{ all -> 0x2c9a }
            X.1Tt r14 = r5.A04     // Catch:{ all -> 0x2c9a }
            android.content.SharedPreferences r14 = X.C26861Tt.A00(r14)     // Catch:{ all -> 0x2c9a }
            android.content.SharedPreferences$Editor r15 = r14.edit()     // Catch:{ all -> 0x2c9a }
            java.lang.String r14 = "contact_sync_infinite_loop_error_start_time"
            X.C17880vN.A1D(r15, r14, r3)     // Catch:{ all -> 0x2c9a }
            r5.A01 = r3     // Catch:{ all -> 0x2c9a }
            X.190 r14 = r5.A03     // Catch:{ all -> 0x2c9a }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c9a }
            java.lang.String r3 = "Endless loop detected in contact sync for "
            java.lang.String r5 = X.AnonymousClass001.A1E(r2, r3, r4)     // Catch:{ all -> 0x2c9a }
            java.lang.String r4 = "ContactSyncLoopDetector"
            r3 = 1
            r14.A0G(r4, r5, r3)     // Catch:{ all -> 0x2c9a }
        L_0x0c58:
            java.util.Map r3 = r0.A0c     // Catch:{ all -> 0x2c9a }
            r57 = r3
            r3.putAll(r13)     // Catch:{ all -> 0x2c9a }
            java.util.Map r3 = r0.A0e     // Catch:{ all -> 0x2c9a }
            r56 = r3
            X.1PM r3 = r0.A07     // Catch:{ all -> 0x2c9a }
            X.1PL r3 = r3.A03     // Catch:{ all -> 0x2c9a }
            r45 = r3
            java.util.HashMap r15 = X.C17880vN.A11()     // Catch:{ all -> 0x2c9a }
            X.1at r44 = X.C24801Ls.A00(r45)     // Catch:{ all -> 0x2c9a }
            java.lang.String r13 = "SELECT jid, serial FROM wa_vnames"
            java.lang.String r5 = "CONTACT_VNAMES"
            r4 = r44
            r3 = r37
            android.database.Cursor r14 = X.C24861Ly.A03(r4, r13, r5, r3)     // Catch:{ all -> 0x2c90 }
            java.lang.String r3 = "jid"
            int r13 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x2c84 }
            java.lang.String r3 = "serial"
            int r5 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x2c84 }
        L_0x0c8a:
            boolean r3 = r14.moveToNext()     // Catch:{ all -> 0x2c84 }
            if (r3 == 0) goto L_0x0cae
            r3 = r45
            X.1Lx r4 = r3.A01     // Catch:{ all -> 0x2c84 }
            java.lang.String r3 = r14.getString(r13)     // Catch:{ all -> 0x2c84 }
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A02(r3)     // Catch:{ all -> 0x2c84 }
            com.whatsapp.jid.UserJid r4 = r4.A00(r3)     // Catch:{ all -> 0x2c84 }
            if (r4 == 0) goto L_0x0c8a
            long r42 = r14.getLong(r5)     // Catch:{ all -> 0x2c84 }
            java.lang.String r3 = java.lang.String.valueOf(r42)     // Catch:{ all -> 0x2c84 }
            r15.put(r4, r3)     // Catch:{ all -> 0x2c84 }
            goto L_0x0c8a
        L_0x0cae:
            r14.close()     // Catch:{ all -> 0x2c90 }
            r44.close()     // Catch:{ all -> 0x2c9a }
            r3 = r56
            r3.putAll(r15)     // Catch:{ all -> 0x2c9a }
            if (r19 == 0) goto L_0x0d3b
            X.0zA r4 = r0.A03     // Catch:{ all -> 0x2c9a }
            boolean r3 = r4.A07()     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0d3b
            java.lang.Object r3 = r4.A03()     // Catch:{ all -> 0x2c9a }
            X.1PW r3 = (X.AnonymousClass1PW) r3     // Catch:{ all -> 0x2c9a }
            boolean r3 = r3.A08()     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0d3b
            java.util.Map r13 = r0.A0b     // Catch:{ all -> 0x2c9a }
            java.lang.Object r3 = r4.A03()     // Catch:{ all -> 0x2c9a }
            X.1PW r3 = (X.AnonymousClass1PW) r3     // Catch:{ all -> 0x2c9a }
            X.00H r3 = r3.A03     // Catch:{ all -> 0x2c9a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2c9a }
            X.1iT r3 = (X.C33221iT) r3     // Catch:{ all -> 0x2c9a }
            com.whatsapp.bot.home.sync.discovery.DiscoveryBots r3 = r3.A00()     // Catch:{ all -> 0x2c9a }
            if (r3 != 0) goto L_0x0d10
            X.0wS r3 = X.C18460wS.A00     // Catch:{ all -> 0x2c9a }
        L_0x0ce7:
            int r4 = r3.size()     // Catch:{ all -> 0x2c9a }
            X.DVM r5 = new X.DVM     // Catch:{ all -> 0x2c9a }
            r5.<init>(r4)     // Catch:{ all -> 0x2c9a }
            java.util.Iterator r15 = r3.iterator()     // Catch:{ all -> 0x2c9a }
        L_0x0cf4:
            boolean r3 = r15.hasNext()     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0d34
            java.lang.Object r3 = r15.next()     // Catch:{ all -> 0x2c9a }
            X.20Q r3 = (X.AnonymousClass20Q) r3     // Catch:{ all -> 0x2c9a }
            java.lang.String r4 = r3.A01     // Catch:{ all -> 0x2c9a }
            if (r4 == 0) goto L_0x0cf4
            int r14 = r4.length()     // Catch:{ all -> 0x2c9a }
            if (r14 == 0) goto L_0x0cf4
            com.whatsapp.jid.UserJid r3 = r3.A00     // Catch:{ all -> 0x2c9a }
            r5.put(r3, r4)     // Catch:{ all -> 0x2c9a }
            goto L_0x0cf4
        L_0x0d10:
            java.util.List r5 = r3.A02     // Catch:{ all -> 0x2c9a }
            r4 = 1
            X.20Q[] r4 = new X.AnonymousClass20Q[r4]     // Catch:{ all -> 0x2c9a }
            r14 = 0
            X.20Q r3 = r3.A01     // Catch:{ all -> 0x2c9a }
            r4[r14] = r3     // Catch:{ all -> 0x2c9a }
            java.util.ArrayList r3 = X.AnonymousClass1ZU.A06(r4)     // Catch:{ all -> 0x2c9a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x2c9a }
        L_0x0d22:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x2c9a }
            if (r4 == 0) goto L_0x0ce7
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x2c9a }
            X.20d r4 = (X.C435920d) r4     // Catch:{ all -> 0x2c9a }
            java.util.List r4 = r4.A02     // Catch:{ all -> 0x2c9a }
            X.C29401cD.A0J(r4, r3)     // Catch:{ all -> 0x2c9a }
            goto L_0x0d22
        L_0x0d34:
            X.DVM r3 = X.C200610r.A05(r5)     // Catch:{ all -> 0x2c9a }
            r13.putAll(r3)     // Catch:{ all -> 0x2c9a }
        L_0x0d3b:
            if (r9 == 0) goto L_0x0d75
            X.1QO r3 = r0.A0K     // Catch:{ all -> 0x2c9a }
            boolean r3 = r3.A0D()     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0d75
            r3 = r59
            X.1QO r3 = r3.A03     // Catch:{ all -> 0x2c9a }
            boolean r3 = r3.A0D()     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0d75
            r3 = r59
            X.1KH r3 = r3.A02     // Catch:{ all -> 0x2c9a }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x2c9a }
            java.util.ArrayList r3 = r3.A0C()     // Catch:{ all -> 0x2c9a }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x2c9a }
        L_0x0d5f:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x2c9a }
            if (r3 == 0) goto L_0x0d71
            java.lang.Object r5 = r13.next()     // Catch:{ all -> 0x2c9a }
            X.8pI r5 = (X.AnonymousClass8pI) r5     // Catch:{ all -> 0x2c9a }
            com.whatsapp.jid.UserJid r3 = r5.A03     // Catch:{ all -> 0x2c9a }
            r4.put(r3, r5)     // Catch:{ all -> 0x2c9a }
            goto L_0x0d5f
        L_0x0d71:
            r3 = r59
            r3.A01 = r4     // Catch:{ all -> 0x2c9a }
        L_0x0d75:
            X.2Qe r4 = r2.scope     // Catch:{ all -> 0x2c9a }
            r3 = r32
            if (r4 == r3) goto L_0x0d80
            X.2Qe r3 = X.C49362Qe.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x2c9a }
            r15 = 0
            if (r4 != r3) goto L_0x0d81
        L_0x0d80:
            r15 = 1
        L_0x0d81:
            r3 = r31
            if (r4 == r3) goto L_0x0d8a
            X.2Qe r3 = X.C49362Qe.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x2c9a }
            r14 = 0
            if (r4 != r3) goto L_0x0d8b
        L_0x0d8a:
            r14 = 1
        L_0x0d8b:
            r3 = r46
            if (r4 != r3) goto L_0x0f27
            java.lang.String r14 = "ContactSyncHelper/syncQueryMultiProtocols"
            java.lang.String r32 = "multi_protocols"
            java.lang.String r31 = " scope="
            long r53 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0f19 }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0f14 }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ all -> 0x0f14 }
            if (r18 != 0) goto L_0x0db0
            X.00H r4 = r0.A0Q     // Catch:{ all -> 0x0f14 }
            r3 = r55
            r1 = r20
            boolean r1 = A0C(r3, r4, r1)     // Catch:{ all -> 0x0f14 }
            r13 = 0
            if (r1 == 0) goto L_0x0db1
        L_0x0db0:
            r13 = 1
        L_0x0db1:
            if (r20 == 0) goto L_0x0e83
            X.1Nd r1 = r0.A0E     // Catch:{ all -> 0x0f14 }
            java.util.HashSet r15 = r1.A0D()     // Catch:{ all -> 0x0f14 }
            java.util.Iterator r18 = r20.iterator()     // Catch:{ all -> 0x0f14 }
        L_0x0dbd:
            boolean r1 = r18.hasNext()     // Catch:{ all -> 0x0f14 }
            if (r1 == 0) goto L_0x0e83
            X.1E7 r4 = X.C17880vN.A0O(r18)     // Catch:{ all -> 0x0f14 }
            X.1BI r3 = r4.A0J     // Catch:{ all -> 0x0f14 }
            boolean r1 = X.C63412t2.A03(r3)     // Catch:{ all -> 0x0f14 }
            if (r1 != 0) goto L_0x0dbd
            boolean r1 = r3 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x0f14 }
            if (r1 == 0) goto L_0x0dd6
            r15.contains(r3)     // Catch:{ all -> 0x0f14 }
        L_0x0dd6:
            X.A4m r5 = new X.A4m     // Catch:{ all -> 0x0f14 }
            r5.<init>(r4)     // Catch:{ all -> 0x0f14 }
            com.whatsapp.jid.UserJid r1 = r5.A0T     // Catch:{ all -> 0x0f14 }
            if (r1 == 0) goto L_0x0e6c
            r3 = r24
            r5.A0D = r3     // Catch:{ all -> 0x0f14 }
            r3 = r29
            r5.A0N = r3     // Catch:{ all -> 0x0f14 }
            r5.A0K = r11     // Catch:{ all -> 0x0f14 }
            X.2R1 r3 = X.AnonymousClass2R1.A06     // Catch:{ all -> 0x0f14 }
            if (r2 != r3) goto L_0x0e69
            int r3 = r4.A07     // Catch:{ all -> 0x0f14 }
        L_0x0def:
            r5.A01 = r3     // Catch:{ all -> 0x0f14 }
            r3 = r17
            r5.A0C = r3     // Catch:{ all -> 0x0f14 }
            r3 = r16
            r5.A0F = r3     // Catch:{ all -> 0x0f14 }
            r5.A0J = r9     // Catch:{ all -> 0x0f14 }
            r3 = r26
            r5.A0G = r3     // Catch:{ all -> 0x0f14 }
            r5.A0I = r13     // Catch:{ all -> 0x0f14 }
            r3 = r27
            r5.A0P = r3     // Catch:{ all -> 0x0f14 }
            r3 = r19
            r5.A0B = r3     // Catch:{ all -> 0x0f14 }
            r3 = r23
            r5.A0O = r3     // Catch:{ all -> 0x0f14 }
            if (r17 == 0) goto L_0x0e16
            r4 = r57
            r3 = r56
            A0B(r5, r1, r4, r3)     // Catch:{ all -> 0x0f14 }
        L_0x0e16:
            if (r16 == 0) goto L_0x0e24
            X.1MR r3 = r0.A0H     // Catch:{ all -> 0x0f14 }
            X.2rW r3 = A03(r5, r3, r1)     // Catch:{ all -> 0x0f14 }
            if (r3 == 0) goto L_0x0e2a
            long r3 = r3.A02     // Catch:{ all -> 0x0f14 }
        L_0x0e22:
            r5.A02 = r3     // Catch:{ all -> 0x0f14 }
        L_0x0e24:
            r3 = r29
            X.AnonymousClass1UO.A09(r0, r5, r11, r3)     // Catch:{ all -> 0x0f14 }
            goto L_0x0e2d
        L_0x0e2a:
            r3 = 0
            goto L_0x0e22
        L_0x0e2d:
            if (r9 == 0) goto L_0x0e37
            X.AnonymousClass1QS.A00(r60)     // Catch:{ all -> 0x0f14 }
            r3 = r59
            A0A(r5, r1, r3)     // Catch:{ all -> 0x0f14 }
        L_0x0e37:
            if (r19 == 0) goto L_0x0e5f
            X.00H r3 = r0.A0R     // Catch:{ all -> 0x0f14 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0f14 }
            X.0zA r3 = (X.C19880zA) r3     // Catch:{ all -> 0x0f14 }
            boolean r4 = r3.A07()     // Catch:{ all -> 0x0f14 }
            if (r4 == 0) goto L_0x0e67
            java.lang.Object r3 = r3.A03()     // Catch:{ all -> 0x0f14 }
            X.1Pl r3 = (X.C25741Pl) r3     // Catch:{ all -> 0x0f14 }
            X.24e r3 = r3.A00(r1)     // Catch:{ all -> 0x0f14 }
            if (r3 == 0) goto L_0x0e67
            int r3 = r3.A01     // Catch:{ all -> 0x0f14 }
        L_0x0e55:
            r5.A00 = r3     // Catch:{ all -> 0x0f14 }
            java.util.Map r3 = r0.A0b     // Catch:{ all -> 0x0f14 }
            java.lang.String r3 = X.C17880vN.A0s(r1, r3)     // Catch:{ all -> 0x0f14 }
            r5.A07 = r3     // Catch:{ all -> 0x0f14 }
        L_0x0e5f:
            X.C17880vN.A1H(r5, r12)     // Catch:{ all -> 0x0f14 }
            r10.add(r1)     // Catch:{ all -> 0x0f14 }
            goto L_0x0dbd
        L_0x0e67:
            r3 = 0
            goto L_0x0e55
        L_0x0e69:
            int r3 = r4.A08     // Catch:{ all -> 0x0f14 }
            goto L_0x0def
        L_0x0e6c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f14 }
            java.lang.String r1 = "ContactSyncHelper/syncMultiProtocolsInternal/request invalid jid, contact="
            r3.append(r1)     // Catch:{ all -> 0x0f14 }
            java.lang.String r1 = r5.A0U     // Catch:{ all -> 0x0f14 }
            r3.append(r1)     // Catch:{ all -> 0x0f14 }
            r4 = r31
            r1 = r32
            X.C17900vP.A0e(r4, r1, r3)     // Catch:{ all -> 0x0f14 }
            goto L_0x0dbd
        L_0x0e83:
            r12.size()     // Catch:{ all -> 0x0f14 }
            boolean r1 = A0D(r8, r12)     // Catch:{ all -> 0x0f14 }
            if (r1 == 0) goto L_0x0e90
            X.2rf r1 = X.C62602rf.A08     // Catch:{ all -> 0x0f14 }
            goto L_0x0f0f
        L_0x0e90:
            java.lang.String r1 = "sync_sid_multi_protocols"
            java.lang.String r3 = X.C63412t2.A00(r1)     // Catch:{ all -> 0x0f14 }
            r1 = r34
            X.A01 r1 = X.AnonymousClass1UO.A02(r0, r2, r12, r1)     // Catch:{ all -> 0x0f14 }
            r41 = r0
            r42 = r24
            r43 = r29
            r44 = r11
            r45 = r17
            r46 = r16
            r47 = r9
            r48 = r26
            r49 = r13
            r50 = r19
            r51 = r27
            r52 = r23
            boolean r4 = X.AnonymousClass1UO.A0D(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ all -> 0x0f14 }
            if (r4 == 0) goto L_0x0ed7
            X.00H r4 = r0.A0Y     // Catch:{ all -> 0x0f14 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x0f14 }
            X.1PY r9 = (X.AnonymousClass1PY) r9     // Catch:{ all -> 0x0f14 }
            X.190 r5 = r0.A04     // Catch:{ all -> 0x0f14 }
            X.9zf r4 = new X.9zf     // Catch:{ all -> 0x0f14 }
            r4.<init>(r5, r9)     // Catch:{ all -> 0x0f14 }
            X.1UP r5 = r0.A0D     // Catch:{ all -> 0x0f14 }
            X.1Ug r3 = r4.A01(r5, r1, r3)     // Catch:{ all -> 0x0f14 }
        L_0x0ed0:
            r1 = r37
            boolean r1 = X.AnonymousClass1UO.A0B(r0, r8, r1, r14, r3)     // Catch:{ all -> 0x0f14 }
            goto L_0x0ee0
        L_0x0ed7:
            X.Acn r4 = X.AnonymousClass1UO.A01(r0)     // Catch:{ all -> 0x0f14 }
            X.1Ug r3 = A04(r4, r1, r3)     // Catch:{ all -> 0x0f14 }
            goto L_0x0ed0
        L_0x0ee0:
            if (r1 != 0) goto L_0x0ee5
            r1 = r58
            goto L_0x0f0f
        L_0x0ee5:
            X.2cQ r1 = r0.A00     // Catch:{ all -> 0x0f14 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x0f14 }
            X.AnonymousClass1UR.A01(r1, r8)     // Catch:{ all -> 0x0f14 }
            X.1UH r4 = r0.A08     // Catch:{ all -> 0x0f14 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x0f14 }
            X.2n4 r3 = r1.A00     // Catch:{ all -> 0x0f14 }
            java.util.Map r1 = r0.A0d     // Catch:{ all -> 0x0f14 }
            r55 = 0
            r46 = r4
            r47 = r2
            r48 = r3
            r49 = r8
            r50 = r12
            r51 = r1
            r52 = r56
            r46.A01(r47, r48, r49, r50, r51, r52, r53, r55)     // Catch:{ all -> 0x0f14 }
            r3 = 3
            X.2rf r1 = new X.2rf     // Catch:{ all -> 0x0f14 }
            r1.<init>(r10, r3)     // Catch:{ all -> 0x0f14 }
        L_0x0f0f:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0f19 }
            goto L_0x1eab
        L_0x0f14:
            r1 = move-exception
            android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0f19 }
            throw r1     // Catch:{ RuntimeException -> 0x0f19 }
        L_0x0f19:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c82 }
            java.lang.String r1 = "ContactSyncHelper/runAndHandleExceptions "
            X.C17900vP.A0h(r1, r14, r3, r4)     // Catch:{ all -> 0x2c82 }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c82 }
            goto L_0x1eab
        L_0x0f27:
            X.2Qw r4 = r2.mode     // Catch:{ all -> 0x2c82 }
            r3 = r40
            boolean r3 = X.AnonymousClass000.A1Z(r4, r3)
            r5 = 1
            if (r3 == 0) goto L_0x1385
            X.1UN r1 = r0.A0I     // Catch:{ all -> 0x2c82 }
            boolean r1 = r1.A08()     // Catch:{ all -> 0x2c82 }
            if (r1 == 0) goto L_0x0f62
            X.00H r1 = r0.A0Y     // Catch:{ all -> 0x2c7c }
            java.lang.Object r13 = r1.get()     // Catch:{ all -> 0x2c7c }
            X.1PY r13 = (X.AnonymousClass1PY) r13     // Catch:{ all -> 0x2c7c }
            X.0z4 r12 = r0.A0G     // Catch:{ all -> 0x2c7c }
            X.00H r1 = r0.A0X     // Catch:{ all -> 0x2c7c }
            X.11S r10 = X.C17880vN.A0H(r1)     // Catch:{ all -> 0x2c7c }
            r4 = 0
            X.C18070vi.A0d(r13, r4)     // Catch:{ all -> 0x2c7c }
            X.C18070vi.A0e(r12, r5, r10)     // Catch:{ all -> 0x2c7c }
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r12)     // Catch:{ all -> 0x2c7c }
            java.lang.String r1 = "native_contacts_backup_contacts_updated"
            boolean r1 = r3.getBoolean(r1, r4)     // Catch:{ all -> 0x2c7c }
            if (r1 != 0) goto L_0x0f62
            X.3I6 r1 = X.AnonymousClass3I6.A00     // Catch:{ all -> 0x2c7c }
            X.AnonymousClass9Q2.A00(r10, r12, r13, r1)     // Catch:{ all -> 0x2c7c }
        L_0x0f62:
            if (r15 == 0) goto L_0x0f67
            r1 = 1
            if (r14 != 0) goto L_0x0f68
        L_0x0f67:
            r1 = 0
        L_0x0f68:
            X.C17960vV.A0D(r1)     // Catch:{ all -> 0x2c82 }
            if (r24 != 0) goto L_0x0f80
            if (r21 != 0) goto L_0x0f80
            if (r29 != 0) goto L_0x0f80
            if (r17 != 0) goto L_0x0f80
            if (r11 != 0) goto L_0x0f80
            if (r16 != 0) goto L_0x0f80
            if (r9 != 0) goto L_0x0f80
            if (r26 != 0) goto L_0x0f80
            if (r18 != 0) goto L_0x0f80
            if (r23 != 0) goto L_0x0f80
            r5 = 0
        L_0x0f80:
            X.C17960vV.A0D(r5)     // Catch:{ all -> 0x2c82 }
            if (r24 == 0) goto L_0x1212
            X.C17960vV.A07(r41)     // Catch:{ all -> 0x2c82 }
            X.C17960vV.A07(r33)     // Catch:{ all -> 0x2c82 }
            java.lang.String r31 = "ContactSyncHelper/syncAll"
            long r48 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x1202 }
            X.1Tu r10 = r0.A0C     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r5 = "sync/sync_all/"
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r41
            r1 = r33
            X.2kE r1 = r10.A06(r5, r3, r1, r4)     // Catch:{ RuntimeException -> 0x1202 }
            if (r1 != 0) goto L_0x0fae
            r3 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ RuntimeException -> 0x1202 }
            r8.A0B = r1     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x1ea9
        L_0x0fae:
            r0.A0E(r1)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r20 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1202 }
            X.1Nd r3 = r0.A0E     // Catch:{ RuntimeException -> 0x1202 }
            java.util.HashSet r19 = r3.A0D()     // Catch:{ RuntimeException -> 0x1202 }
            java.util.HashSet r15 = X.C17880vN.A12()     // Catch:{ RuntimeException -> 0x1202 }
            java.util.HashSet r14 = X.C17880vN.A12()     // Catch:{ RuntimeException -> 0x1202 }
            if (r18 != 0) goto L_0x0fd4
            X.00H r5 = r0.A0Q     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r4 = r1.A00()     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r55
            boolean r3 = A0C(r3, r5, r4)     // Catch:{ RuntimeException -> 0x1202 }
            r12 = 0
            if (r3 == 0) goto L_0x0fd5
        L_0x0fd4:
            r12 = 1
        L_0x0fd5:
            java.util.ArrayList r3 = r1.A00()     // Catch:{ RuntimeException -> 0x1202 }
            java.util.Iterator r18 = r3.iterator()     // Catch:{ RuntimeException -> 0x1202 }
        L_0x0fdd:
            boolean r3 = r18.hasNext()     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 == 0) goto L_0x1073
            X.1E7 r10 = X.C17880vN.A0O(r18)     // Catch:{ RuntimeException -> 0x1202 }
            r3 = 1
            r4 = r19
            boolean r4 = X.C63412t2.A01(r10, r4, r3)     // Catch:{ RuntimeException -> 0x1202 }
            if (r4 != 0) goto L_0x0fdd
            X.A4m r5 = new X.A4m     // Catch:{ RuntimeException -> 0x1202 }
            r5.<init>(r10)     // Catch:{ RuntimeException -> 0x1202 }
            r5.A0D = r3     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r29
            r5.A0N = r3     // Catch:{ RuntimeException -> 0x1202 }
            r5.A0K = r11     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r17
            r5.A0C = r3     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r16
            r5.A0F = r3     // Catch:{ RuntimeException -> 0x1202 }
            r5.A0J = r9     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r26
            r5.A0G = r3     // Catch:{ RuntimeException -> 0x1202 }
            X.2R1 r3 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x1202 }
            if (r2 != r3) goto L_0x1070
            int r3 = r10.A07     // Catch:{ RuntimeException -> 0x1202 }
        L_0x1011:
            r5.A01 = r3     // Catch:{ RuntimeException -> 0x1202 }
            r5.A0I = r12     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r27
            r5.A0P = r3     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r23
            r5.A0O = r3     // Catch:{ RuntimeException -> 0x1202 }
            if (r17 == 0) goto L_0x1028
            com.whatsapp.jid.UserJid r13 = r5.A0T     // Catch:{ RuntimeException -> 0x1202 }
            r4 = r57
            r3 = r56
            A0B(r5, r13, r4, r3)     // Catch:{ RuntimeException -> 0x1202 }
        L_0x1028:
            if (r16 == 0) goto L_0x1038
            X.1MR r4 = r0.A0H     // Catch:{ RuntimeException -> 0x1202 }
            com.whatsapp.jid.UserJid r3 = r5.A0T     // Catch:{ RuntimeException -> 0x1202 }
            X.2rW r3 = A03(r5, r4, r3)     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 == 0) goto L_0x103e
            long r3 = r3.A02     // Catch:{ RuntimeException -> 0x1202 }
        L_0x1036:
            r5.A02 = r3     // Catch:{ RuntimeException -> 0x1202 }
        L_0x1038:
            r3 = r29
            X.AnonymousClass1UO.A09(r0, r5, r11, r3)     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x1041
        L_0x103e:
            r3 = 0
            goto L_0x1036
        L_0x1041:
            if (r9 == 0) goto L_0x104d
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x1202 }
            com.whatsapp.jid.UserJid r4 = r5.A0T     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r59
            A0A(r5, r4, r3)     // Catch:{ RuntimeException -> 0x1202 }
        L_0x104d:
            r3 = r20
            X.C17880vN.A1H(r5, r3)     // Catch:{ RuntimeException -> 0x1202 }
            boolean r3 = r10.A0B()     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 == 0) goto L_0x105f
            X.2lf r3 = r10.A0H     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r3 = r3.A01     // Catch:{ RuntimeException -> 0x1202 }
            r14.add(r3)     // Catch:{ RuntimeException -> 0x1202 }
        L_0x105f:
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r10.A06(r3)     // Catch:{ RuntimeException -> 0x1202 }
            if (r4 == 0) goto L_0x0fdd
            com.whatsapp.jid.Jid r3 = r10.A06(r3)     // Catch:{ RuntimeException -> 0x1202 }
            r15.add(r3)     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x0fdd
        L_0x1070:
            int r3 = r10.A08     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x1011
        L_0x1073:
            r3 = r20
            boolean r3 = A0D(r8, r3)     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 == 0) goto L_0x1087
            X.2Qw r4 = r2.mode     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r40
            if (r4 != r3) goto L_0x11fe
            X.2Qy r4 = r2.context     // Catch:{ RuntimeException -> 0x1202 }
            X.2Qy r3 = X.C49562Qy.REGISTRATION     // Catch:{ RuntimeException -> 0x1202 }
            if (r4 != r3) goto L_0x11fe
        L_0x1087:
            X.Acn r9 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r3 = "sync_sid_full"
            java.lang.String r5 = X.C63412t2.A00(r3)     // Catch:{ RuntimeException -> 0x1202 }
            r4 = r34
            r3 = r20
            X.A01 r3 = X.AnonymousClass1UO.A02(r0, r2, r3, r4)     // Catch:{ RuntimeException -> 0x1202 }
            X.1Ug r5 = A04(r9, r3, r5)     // Catch:{ RuntimeException -> 0x1202 }
            r4 = r37
            r3 = r31
            boolean r3 = X.AnonymousClass1UO.A0B(r0, r8, r4, r3, r5)     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 != 0) goto L_0x10ac
            r1 = r58
            goto L_0x1eab
        L_0x10ac:
            X.1UH r3 = r0.A08     // Catch:{ RuntimeException -> 0x1202 }
            r18 = r3
            A07(r0, r3)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.Map r9 = r0.A0f     // Catch:{ RuntimeException -> 0x1202 }
            java.util.List r11 = r1.A05     // Catch:{ RuntimeException -> 0x1202 }
            X.AnonymousClass1UO.A0A(r0, r4, r11, r9)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.List r10 = r1.A0C     // Catch:{ RuntimeException -> 0x1202 }
            X.AnonymousClass1UO.A0A(r0, r4, r10, r9)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r15 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1202 }
            java.util.List r13 = r1.A0B     // Catch:{ RuntimeException -> 0x1202 }
            X.AnonymousClass1UO.A0A(r0, r15, r13, r9)     // Catch:{ RuntimeException -> 0x1202 }
            X.2Qw r4 = r2.mode     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r40
            if (r4 != r3) goto L_0x1130
            X.2Qy r4 = r2.context     // Catch:{ RuntimeException -> 0x1202 }
            X.2Qy r3 = X.C49562Qy.REGISTRATION     // Catch:{ RuntimeException -> 0x1202 }
            if (r4 != r3) goto L_0x1130
        L_0x10d4:
            java.util.List r4 = r1.A08     // Catch:{ RuntimeException -> 0x1202 }
            java.util.List r3 = r1.A0A     // Catch:{ RuntimeException -> 0x1202 }
            boolean r3 = X.AnonymousClass1UO.A0C(r0, r11, r4, r10, r3)     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r4 = "sync/sync_all/contacts update="
            X.C17900vP.A0n(r4, r5, r3)     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r4 = "sync/sync_all/contacts_changed_by_server"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ RuntimeException -> 0x1202 }
            boolean r4 = r15.isEmpty()     // Catch:{ RuntimeException -> 0x1202 }
            if (r4 != 0) goto L_0x10f9
            X.1To r5 = r0.A05     // Catch:{ RuntimeException -> 0x1202 }
            r4 = 0
            r3 = 1
            r5.A0P(r15, r4, r3)     // Catch:{ RuntimeException -> 0x1202 }
        L_0x10f9:
            X.2cQ r4 = r0.A00     // Catch:{ RuntimeException -> 0x1202 }
            X.C17960vV.A07(r4)     // Catch:{ RuntimeException -> 0x1202 }
            X.AnonymousClass1UR.A01(r4, r8)     // Catch:{ RuntimeException -> 0x1202 }
            X.2n4 r5 = r4.A00     // Catch:{ RuntimeException -> 0x1202 }
            java.util.Map r4 = r0.A0d     // Catch:{ RuntimeException -> 0x1202 }
            r50 = 0
            r41 = r18
            r42 = r2
            r43 = r5
            r44 = r8
            r45 = r20
            r46 = r4
            r47 = r56
            r41.A01(r42, r43, r44, r45, r46, r47, r48, r50)     // Catch:{ RuntimeException -> 0x1202 }
            X.00H r4 = r0.A0P     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.Object r5 = r4.get()     // Catch:{ RuntimeException -> 0x1202 }
            X.1Lo r5 = (X.C24761Lo) r5     // Catch:{ RuntimeException -> 0x1202 }
            java.util.List r4 = r1.A00     // Catch:{ RuntimeException -> 0x1202 }
            java.util.List r1 = r1.A02     // Catch:{ RuntimeException -> 0x1202 }
            r15 = 1
            r10 = r5
            r11 = r33
            r12 = r4
            r13 = r1
            r14 = r9
            r10.A02(r11, r12, r13, r14, r15)     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x11f4
        L_0x1130:
            r5 = 8434(0x20f2, float:1.1819E-41)
            r4 = r39
            r3 = r55
            boolean r3 = X.C18020vd.A05(r4, r3, r5)     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 == 0) goto L_0x10d4
            X.1Tt r14 = r0.A09     // Catch:{ RuntimeException -> 0x1202 }
            android.content.SharedPreferences r4 = X.C26861Tt.A00(r14)     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r3 = "reachability_sync_backoff"
            long r3 = X.C17890vO.A04(r4, r3)     // Catch:{ RuntimeException -> 0x1202 }
            X.11P r12 = r0.A0F     // Catch:{ RuntimeException -> 0x1202 }
            long r16 = X.AnonymousClass11P.A01(r12)     // Catch:{ RuntimeException -> 0x1202 }
            long r3 = r3 - r16
            r16 = 0
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x1161
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r5 = "reachability sync need to wait for another "
            X.C17900vP.A0m(r5, r12, r3)     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x10d4
        L_0x1161:
            X.2yp r5 = new X.2yp     // Catch:{ RuntimeException -> 0x1202 }
            r5.<init>(r14, r12)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1202 }
            java.util.Map r4 = r0.A0d     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r3 = X.AnonymousClass1UO.A06(r11, r4)     // Catch:{ RuntimeException -> 0x1202 }
            r12.addAll(r3)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r3 = X.AnonymousClass1UO.A06(r10, r4)     // Catch:{ RuntimeException -> 0x1202 }
            r12.addAll(r3)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.ArrayList r3 = X.AnonymousClass1UO.A06(r13, r4)     // Catch:{ RuntimeException -> 0x1202 }
            r12.addAll(r3)     // Catch:{ RuntimeException -> 0x1202 }
            boolean r3 = r12.isEmpty()     // Catch:{ RuntimeException -> 0x1202 }
            if (r3 != 0) goto L_0x10d4
            X.00H r3 = r0.A0Y     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.Object r4 = r3.get()     // Catch:{ RuntimeException -> 0x1202 }
            X.1PY r4 = (X.AnonymousClass1PY) r4     // Catch:{ RuntimeException -> 0x1202 }
            X.190 r3 = r0.A04     // Catch:{ RuntimeException -> 0x1202 }
            X.9zf r13 = new X.9zf     // Catch:{ RuntimeException -> 0x1202 }
            r13.<init>(r3, r4)     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r3 = "sync_sid_full_reachability"
            java.lang.String r4 = X.C63412t2.A00(r3)     // Catch:{ RuntimeException -> 0x1202 }
            r3 = r34
            X.A01 r3 = X.AnonymousClass1UO.A02(r0, r2, r12, r3)     // Catch:{ RuntimeException -> 0x1202 }
            X.1Ug r13 = r13.A01(r5, r3, r4)     // Catch:{ RuntimeException -> 0x1202 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            r3 = 64000(0xfa00, double:3.162E-319)
            r13.get(r3, r12)     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            X.2cQ r3 = r5.A00     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            if (r3 != 0) goto L_0x11be
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r31)     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            java.lang.String r3 = "/reachability/no result"
            X.C17890vO.A1A(r4, r3)     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            goto L_0x10d4
        L_0x11be:
            java.util.Iterator r13 = X.C17890vO.A0l(r9)     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
        L_0x11c2:
            boolean r3 = r13.hasNext()     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            if (r3 == 0) goto L_0x10d4
            java.lang.Object r12 = r13.next()     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            X.9i3 r12 = (X.C188829i3) r12     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            java.util.HashMap r4 = r5.A01     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            com.whatsapp.jid.UserJid r3 = r12.A0D     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            boolean r3 = r4.containsKey(r3)     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            if (r3 == 0) goto L_0x11c2
            com.whatsapp.jid.UserJid r3 = r12.A0D     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            X.9i3 r3 = (X.C188829i3) r3     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            boolean r3 = r3.A0M     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            r12.A0M = r3     // Catch:{ RuntimeException | ExecutionException -> 0x11e5, InterruptedException | TimeoutException -> 0x10d4 }
            goto L_0x11c2
        L_0x11e5:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r31)     // Catch:{ RuntimeException -> 0x1202 }
            java.lang.String r3 = "/reachability/exception"
            r4.append(r3)     // Catch:{ RuntimeException -> 0x1202 }
            X.C17880vN.A1M(r4, r5)     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x10d4
        L_0x11f4:
            if (r3 == 0) goto L_0x11fa
            X.2rf r1 = X.C62602rf.A07     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x1eab
        L_0x11fa:
            X.2rf r1 = X.C62602rf.A06     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x1eab
        L_0x11fe:
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x1202 }
            goto L_0x1eab
        L_0x1202:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c82 }
            java.lang.String r3 = "ContactSyncHelper/runAndHandleExceptions "
            r1 = r31
            X.C17900vP.A0h(r3, r1, r4, r5)     // Catch:{ all -> 0x2c82 }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c82 }
            goto L_0x1eab
        L_0x1212:
            X.C17960vV.A07(r47)     // Catch:{ all -> 0x2c82 }
            java.lang.String r15 = "ContactSyncHelper/syncFullNonContact"
            long r48 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x1377 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1377 }
            r4 = 7896(0x1ed8, float:1.1065E-41)
            r3 = r39
            r1 = r55
            int r12 = X.C18020vd.A00(r3, r1, r4)     // Catch:{ RuntimeException -> 0x1377 }
            if (r12 <= 0) goto L_0x1274
            X.1Nd r10 = r0.A0E     // Catch:{ RuntimeException -> 0x1377 }
            X.11P r1 = r0.A0F     // Catch:{ RuntimeException -> 0x1377 }
            long r31 = X.AnonymousClass11P.A01(r1)     // Catch:{ RuntimeException -> 0x1377 }
            r4 = 10822(0x2a46, float:1.5165E-41)
            r1 = r55
            int r1 = X.C18020vd.A00(r3, r1, r4)     // Catch:{ RuntimeException -> 0x1377 }
            long r3 = (long) r1     // Catch:{ RuntimeException -> 0x1377 }
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r13
            long r31 = r31 - r3
            X.1CJ r1 = r10.A02     // Catch:{ RuntimeException -> 0x1377 }
            X.AnonymousClass1CJ.A01(r1)     // Catch:{ RuntimeException -> 0x1377 }
            X.1Ne r4 = r10.A01     // Catch:{ RuntimeException -> 0x1377 }
            monitor-enter(r4)     // Catch:{ RuntimeException -> 0x1377 }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ all -> 0x1271 }
            java.util.Iterator r20 = r4.iterator()     // Catch:{ all -> 0x1271 }
            r3 = 0
        L_0x1253:
            boolean r1 = r20.hasNext()     // Catch:{ all -> 0x1271 }
            if (r1 == 0) goto L_0x126f
            java.lang.Object r1 = r20.next()     // Catch:{ all -> 0x1271 }
            X.1ng r1 = (X.C36311ng) r1     // Catch:{ all -> 0x1271 }
            if (r3 < r12) goto L_0x1267
            long r13 = r1.A00     // Catch:{ all -> 0x1271 }
            int r19 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r19 < 0) goto L_0x126f
        L_0x1267:
            X.1BI r1 = r1.A01     // Catch:{ all -> 0x1271 }
            r10.add(r1)     // Catch:{ all -> 0x1271 }
            int r3 = r3 + 1
            goto L_0x1253
        L_0x126f:
            monitor-exit(r4)     // Catch:{ all -> 0x1271 }
            goto L_0x127a
        L_0x1271:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x1271 }
            throw r1     // Catch:{ RuntimeException -> 0x1377 }
        L_0x1274:
            X.1Nd r1 = r0.A0E     // Catch:{ RuntimeException -> 0x1377 }
            java.util.HashSet r10 = r1.A0D()     // Catch:{ RuntimeException -> 0x1377 }
        L_0x127a:
            if (r18 != 0) goto L_0x1289
            X.00H r4 = r0.A0Q     // Catch:{ RuntimeException -> 0x1377 }
            r3 = r55
            r1 = r47
            boolean r1 = A0C(r3, r4, r1)     // Catch:{ RuntimeException -> 0x1377 }
            r13 = 0
            if (r1 == 0) goto L_0x128a
        L_0x1289:
            r13 = 1
        L_0x128a:
            java.util.Iterator r14 = r47.iterator()     // Catch:{ RuntimeException -> 0x1377 }
        L_0x128e:
            boolean r1 = r14.hasNext()     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 == 0) goto L_0x1327
            X.1E7 r4 = X.C17880vN.A0O(r14)     // Catch:{ RuntimeException -> 0x1377 }
            X.1BI r3 = r4.A0J     // Catch:{ RuntimeException -> 0x1377 }
            boolean r1 = X.C63412t2.A03(r3)     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 != 0) goto L_0x128e
            boolean r1 = r3 instanceof X.AnonymousClass1E2     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 == 0) goto L_0x12ab
            boolean r1 = r10.contains(r3)     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 != 0) goto L_0x12ab
            goto L_0x128e
        L_0x12ab:
            boolean r1 = r4.A0B()     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 != 0) goto L_0x128e
            com.whatsapp.jid.Jid r1 = X.AnonymousClass1E7.A01(r4)     // Catch:{ RuntimeException -> 0x1377 }
            boolean r1 = r10.contains(r1)     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 == 0) goto L_0x128e
            r3 = 1
            X.A4m r12 = new X.A4m     // Catch:{ RuntimeException -> 0x1377 }
            r12.<init>(r4)     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r29
            r12.A0N = r1     // Catch:{ RuntimeException -> 0x1377 }
            r12.A0K = r11     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r17
            r12.A0C = r1     // Catch:{ RuntimeException -> 0x1377 }
            r12.A0H = r3     // Catch:{ RuntimeException -> 0x1377 }
            if (r21 != 0) goto L_0x12d0
            r3 = 0
        L_0x12d0:
            r12.A0M = r3     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r16
            r12.A0F = r1     // Catch:{ RuntimeException -> 0x1377 }
            X.2R1 r1 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x1377 }
            if (r2 != r1) goto L_0x12ef
            int r1 = r4.A07     // Catch:{ RuntimeException -> 0x1377 }
        L_0x12dc:
            r12.A01 = r1     // Catch:{ RuntimeException -> 0x1377 }
            r12.A0J = r9     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r26
            r12.A0G = r1     // Catch:{ RuntimeException -> 0x1377 }
            r12.A0I = r13     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r27
            r12.A0P = r1     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r23
            r12.A0O = r1     // Catch:{ RuntimeException -> 0x1377 }
            goto L_0x12f2
        L_0x12ef:
            int r1 = r4.A08     // Catch:{ RuntimeException -> 0x1377 }
            goto L_0x12dc
        L_0x12f2:
            if (r17 == 0) goto L_0x12fd
            com.whatsapp.jid.UserJid r4 = r12.A0T     // Catch:{ RuntimeException -> 0x1377 }
            r3 = r57
            r1 = r56
            A0B(r12, r4, r3, r1)     // Catch:{ RuntimeException -> 0x1377 }
        L_0x12fd:
            if (r16 == 0) goto L_0x130d
            X.1MR r3 = r0.A0H     // Catch:{ RuntimeException -> 0x1377 }
            com.whatsapp.jid.UserJid r1 = r12.A0T     // Catch:{ RuntimeException -> 0x1377 }
            X.2rW r1 = A03(r12, r3, r1)     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 == 0) goto L_0x1313
            long r3 = r1.A02     // Catch:{ RuntimeException -> 0x1377 }
        L_0x130b:
            r12.A02 = r3     // Catch:{ RuntimeException -> 0x1377 }
        L_0x130d:
            r1 = r29
            X.AnonymousClass1UO.A09(r0, r12, r11, r1)     // Catch:{ RuntimeException -> 0x1377 }
            goto L_0x1316
        L_0x1313:
            r3 = 0
            goto L_0x130b
        L_0x1316:
            if (r9 == 0) goto L_0x1322
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x1377 }
            com.whatsapp.jid.UserJid r3 = r12.A0T     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r59
            A0A(r12, r3, r1)     // Catch:{ RuntimeException -> 0x1377 }
        L_0x1322:
            X.C17880vN.A1H(r12, r5)     // Catch:{ RuntimeException -> 0x1377 }
            goto L_0x128e
        L_0x1327:
            boolean r1 = A0D(r8, r5)     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 == 0) goto L_0x1331
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x1377 }
            goto L_0x1eab
        L_0x1331:
            X.Acn r4 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1377 }
            java.lang.String r1 = "sync_sid_full"
            java.lang.String r3 = X.C63412t2.A00(r1)     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r34
            X.A01 r1 = X.AnonymousClass1UO.A02(r0, r2, r5, r1)     // Catch:{ RuntimeException -> 0x1377 }
            X.1Ug r3 = A04(r4, r1, r3)     // Catch:{ RuntimeException -> 0x1377 }
            r1 = r37
            boolean r1 = X.AnonymousClass1UO.A0B(r0, r8, r1, r15, r3)     // Catch:{ RuntimeException -> 0x1377 }
            if (r1 != 0) goto L_0x1352
            r1 = r58
            goto L_0x1eab
        L_0x1352:
            X.2cQ r1 = r0.A00     // Catch:{ RuntimeException -> 0x1377 }
            X.C17960vV.A07(r1)     // Catch:{ RuntimeException -> 0x1377 }
            X.AnonymousClass1UR.A01(r1, r8)     // Catch:{ RuntimeException -> 0x1377 }
            X.1UH r4 = r0.A08     // Catch:{ RuntimeException -> 0x1377 }
            X.2n4 r3 = r1.A00     // Catch:{ RuntimeException -> 0x1377 }
            java.util.Map r1 = r0.A0d     // Catch:{ RuntimeException -> 0x1377 }
            r50 = 0
            r41 = r4
            r42 = r2
            r43 = r3
            r44 = r8
            r45 = r5
            r46 = r1
            r47 = r56
            r41.A01(r42, r43, r44, r45, r46, r47, r48, r50)     // Catch:{ RuntimeException -> 0x1377 }
            X.2rf r1 = X.C62602rf.A06     // Catch:{ RuntimeException -> 0x1377 }
            goto L_0x1eab
        L_0x1377:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c82 }
            java.lang.String r1 = "ContactSyncHelper/runAndHandleExceptions "
            X.C17900vP.A0h(r1, r15, r3, r4)     // Catch:{ all -> 0x2c82 }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c82 }
            goto L_0x1eab
        L_0x1385:
            X.2Qy r4 = r2.context     // Catch:{ all -> 0x2c82 }
            r3 = r48
            if (r4 != r3) goto L_0x1681
            boolean r3 = r10.isEmpty()     // Catch:{ all -> 0x2c82 }
            if (r3 != 0) goto L_0x1663
            if (r15 == 0) goto L_0x14e4
            r1 = r14 ^ 1
            X.C17960vV.A0D(r1)     // Catch:{ all -> 0x2c82 }
            X.C17960vV.A07(r41)     // Catch:{ all -> 0x2c82 }
            X.C17960vV.A07(r33)     // Catch:{ all -> 0x2c82 }
            java.lang.String r20 = "ContactSyncHelper/syncNotificationContact"
            long r48 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x14d4 }
            java.lang.String r1 = ""
            X.C17960vV.A0A(r1, r10)     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x14d4 }
            X.1Tu r13 = r0.A0C     // Catch:{ RuntimeException -> 0x14d4 }
            java.lang.String r4 = "sync/sync_notification/"
            r3 = r41
            r1 = r33
            X.2kE r10 = r13.A06(r4, r3, r1, r10)     // Catch:{ RuntimeException -> 0x14d4 }
            if (r10 == 0) goto L_0x14d0
            X.1Nd r1 = r0.A0E     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.HashSet r19 = r1.A0D()     // Catch:{ RuntimeException -> 0x14d4 }
            if (r18 != 0) goto L_0x13d1
            X.00H r4 = r0.A0Q     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.List r3 = r10.A07     // Catch:{ RuntimeException -> 0x14d4 }
            r1 = r55
            boolean r1 = A0C(r1, r4, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            r15 = 0
            if (r1 == 0) goto L_0x13d2
        L_0x13d1:
            r15 = 1
        L_0x13d2:
            java.util.List r13 = r10.A07     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.Iterator r18 = r13.iterator()     // Catch:{ RuntimeException -> 0x14d4 }
        L_0x13d8:
            boolean r1 = r18.hasNext()     // Catch:{ RuntimeException -> 0x14d4 }
            if (r1 == 0) goto L_0x144d
            X.1E7 r4 = X.C17880vN.A0O(r18)     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = 0
            r1 = r19
            boolean r1 = X.C63412t2.A01(r4, r1, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            if (r1 != 0) goto L_0x13d8
            X.A4m r1 = new X.A4m     // Catch:{ RuntimeException -> 0x14d4 }
            r1.<init>(r4)     // Catch:{ RuntimeException -> 0x14d4 }
            r1.A0D = r5     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r29
            r1.A0N = r3     // Catch:{ RuntimeException -> 0x14d4 }
            r1.A0K = r11     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r17
            r1.A0C = r3     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r16
            r1.A0F = r3     // Catch:{ RuntimeException -> 0x14d4 }
            X.2R1 r3 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x14d4 }
            if (r2 != r3) goto L_0x144a
            int r3 = r4.A07     // Catch:{ RuntimeException -> 0x14d4 }
        L_0x1406:
            r1.A01 = r3     // Catch:{ RuntimeException -> 0x14d4 }
            r1.A0J = r9     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r26
            r1.A0G = r3     // Catch:{ RuntimeException -> 0x14d4 }
            r1.A0I = r15     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r27
            r1.A0P = r3     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r23
            r1.A0O = r3     // Catch:{ RuntimeException -> 0x14d4 }
            if (r16 == 0) goto L_0x1428
            X.1MR r4 = r0.A0H     // Catch:{ RuntimeException -> 0x14d4 }
            com.whatsapp.jid.UserJid r3 = r1.A0T     // Catch:{ RuntimeException -> 0x14d4 }
            X.2rW r3 = A03(r1, r4, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            if (r3 == 0) goto L_0x142e
            long r3 = r3.A02     // Catch:{ RuntimeException -> 0x14d4 }
        L_0x1426:
            r1.A02 = r3     // Catch:{ RuntimeException -> 0x14d4 }
        L_0x1428:
            r3 = r29
            X.AnonymousClass1UO.A09(r0, r1, r11, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            goto L_0x1431
        L_0x142e:
            r3 = 0
            goto L_0x1426
        L_0x1431:
            if (r9 == 0) goto L_0x143d
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x14d4 }
            com.whatsapp.jid.UserJid r4 = r1.A0T     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r59
            A0A(r1, r4, r3)     // Catch:{ RuntimeException -> 0x14d4 }
        L_0x143d:
            com.whatsapp.jid.UserJid r14 = r1.A0T     // Catch:{ RuntimeException -> 0x14d4 }
            r4 = r57
            r3 = r56
            A0B(r1, r14, r4, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            X.C17880vN.A1H(r1, r12)     // Catch:{ RuntimeException -> 0x14d4 }
            goto L_0x13d8
        L_0x144a:
            int r3 = r4.A08     // Catch:{ RuntimeException -> 0x14d4 }
            goto L_0x1406
        L_0x144d:
            r12.size()     // Catch:{ RuntimeException -> 0x14d4 }
            boolean r1 = A0D(r8, r12)     // Catch:{ RuntimeException -> 0x14d4 }
            if (r1 == 0) goto L_0x145a
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x14d4 }
            goto L_0x1eab
        L_0x145a:
            X.Acn r4 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x14d4 }
            java.lang.String r1 = "sync_sid_notification_contact"
            java.lang.String r3 = X.C63412t2.A00(r1)     // Catch:{ RuntimeException -> 0x14d4 }
            r1 = r34
            X.A01 r1 = X.AnonymousClass1UO.A02(r0, r2, r12, r1)     // Catch:{ RuntimeException -> 0x14d4 }
            X.1Ug r4 = A04(r4, r1, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = r37
            r1 = r20
            boolean r1 = X.AnonymousClass1UO.A0B(r0, r8, r3, r1, r4)     // Catch:{ RuntimeException -> 0x14d4 }
            if (r1 == 0) goto L_0x14d0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.Map r1 = r0.A0f     // Catch:{ RuntimeException -> 0x14d4 }
            X.AnonymousClass1UO.A0A(r0, r3, r13, r1)     // Catch:{ RuntimeException -> 0x14d4 }
            boolean r3 = r13.isEmpty()     // Catch:{ RuntimeException -> 0x14d4 }
            if (r3 != 0) goto L_0x1493
            X.1UH r3 = r0.A08     // Catch:{ RuntimeException -> 0x14d4 }
            A07(r0, r3)     // Catch:{ RuntimeException -> 0x14d4 }
            X.1To r4 = r0.A05     // Catch:{ RuntimeException -> 0x14d4 }
            r3 = 0
            r4.A0P(r13, r3, r5)     // Catch:{ RuntimeException -> 0x14d4 }
        L_0x1493:
            X.2cQ r3 = r0.A00     // Catch:{ RuntimeException -> 0x14d4 }
            X.C17960vV.A07(r3)     // Catch:{ RuntimeException -> 0x14d4 }
            X.AnonymousClass1UR.A01(r3, r8)     // Catch:{ RuntimeException -> 0x14d4 }
            X.1UH r5 = r0.A08     // Catch:{ RuntimeException -> 0x14d4 }
            X.2n4 r4 = r3.A00     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.Map r3 = r0.A0d     // Catch:{ RuntimeException -> 0x14d4 }
            r50 = 0
            r41 = r5
            r42 = r2
            r43 = r4
            r44 = r8
            r45 = r12
            r46 = r3
            r47 = r56
            r41.A01(r42, r43, r44, r45, r46, r47, r48, r50)     // Catch:{ RuntimeException -> 0x14d4 }
            X.00H r3 = r0.A0P     // Catch:{ RuntimeException -> 0x14d4 }
            java.lang.Object r3 = r3.get()     // Catch:{ RuntimeException -> 0x14d4 }
            X.1Lo r3 = (X.C24761Lo) r3     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.List r4 = r10.A00     // Catch:{ RuntimeException -> 0x14d4 }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x14d4 }
            r9 = r3
            r10 = r33
            r11 = r4
            r13 = r1
            r14 = r50
            r9.A02(r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x14d4 }
            X.2rf r1 = X.C62602rf.A07     // Catch:{ RuntimeException -> 0x14d4 }
            goto L_0x1eab
        L_0x14d0:
            r1 = r58
            goto L_0x1eab
        L_0x14d4:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c82 }
            java.lang.String r3 = "ContactSyncHelper/runAndHandleExceptions "
            r1 = r20
            X.C17900vP.A0h(r3, r1, r4, r5)     // Catch:{ all -> 0x2c82 }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c82 }
            goto L_0x1eab
        L_0x14e4:
            if (r14 == 0) goto L_0x1eab
            java.lang.String r15 = "ContactSyncHelper/syncNotificationSidelist"
            long r53 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x1655 }
            java.lang.String r1 = ""
            X.C17960vV.A0A(r1, r10)     // Catch:{ RuntimeException -> 0x1655 }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1655 }
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x164e }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1655 }
            java.util.Iterator r14 = r12.iterator()     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1503:
            boolean r12 = r14.hasNext()     // Catch:{ RuntimeException -> 0x1655 }
            if (r12 == 0) goto L_0x151d
            X.1BI r12 = X.C17880vN.A0Q(r14)     // Catch:{ RuntimeException -> 0x1655 }
            boolean r13 = X.C63412t2.A03(r12)     // Catch:{ RuntimeException -> 0x1655 }
            if (r13 != 0) goto L_0x1503
            boolean r13 = X.C63412t2.A02(r12, r4, r10)     // Catch:{ RuntimeException -> 0x1655 }
            if (r13 == 0) goto L_0x1503
            r3.add(r12)     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x1503
        L_0x151d:
            int r4 = r3.size()     // Catch:{ RuntimeException -> 0x1655 }
            if (r4 <= 0) goto L_0x1532
            X.1M9 r4 = r0.A06     // Catch:{ RuntimeException -> 0x1655 }
            java.util.HashMap r3 = r4.A0P(r3)     // Catch:{ RuntimeException -> 0x1655 }
            java.util.Collection r3 = r3.values()     // Catch:{ RuntimeException -> 0x1655 }
            java.util.ArrayList r4 = X.C17880vN.A10(r3)     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x1536
        L_0x1532:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1536:
            if (r18 != 0) goto L_0x1543
            X.00H r10 = r0.A0Q     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r55
            boolean r3 = A0C(r3, r10, r4)     // Catch:{ RuntimeException -> 0x1655 }
            r14 = 0
            if (r3 == 0) goto L_0x1544
        L_0x1543:
            r14 = 1
        L_0x1544:
            int r3 = r4.size()     // Catch:{ RuntimeException -> 0x1655 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x1655 }
            r10.<init>(r3)     // Catch:{ RuntimeException -> 0x1655 }
            java.util.Iterator r18 = r4.iterator()     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1551:
            boolean r3 = r18.hasNext()     // Catch:{ RuntimeException -> 0x1655 }
            if (r3 == 0) goto L_0x15c2
            X.1E7 r4 = X.C17880vN.A0O(r18)     // Catch:{ RuntimeException -> 0x1655 }
            X.A4m r12 = new X.A4m     // Catch:{ RuntimeException -> 0x1655 }
            r12.<init>(r4)     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r29
            r12.A0N = r3     // Catch:{ RuntimeException -> 0x1655 }
            r12.A0K = r11     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r17
            r12.A0C = r3     // Catch:{ RuntimeException -> 0x1655 }
            r12.A0H = r5     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r16
            r12.A0F = r3     // Catch:{ RuntimeException -> 0x1655 }
            X.2R1 r3 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x1655 }
            if (r2 != r3) goto L_0x15bf
            int r3 = r4.A07     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1576:
            r12.A01 = r3     // Catch:{ RuntimeException -> 0x1655 }
            r12.A0J = r9     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r26
            r12.A0G = r3     // Catch:{ RuntimeException -> 0x1655 }
            r12.A0I = r14     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r27
            r12.A0P = r3     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r23
            r12.A0O = r3     // Catch:{ RuntimeException -> 0x1655 }
            if (r16 == 0) goto L_0x1598
            X.1MR r4 = r0.A0H     // Catch:{ RuntimeException -> 0x1655 }
            com.whatsapp.jid.UserJid r3 = r12.A0T     // Catch:{ RuntimeException -> 0x1655 }
            X.2rW r3 = A03(r12, r4, r3)     // Catch:{ RuntimeException -> 0x1655 }
            if (r3 == 0) goto L_0x159e
            long r3 = r3.A02     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1596:
            r12.A02 = r3     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1598:
            r3 = r29
            X.AnonymousClass1UO.A09(r0, r12, r11, r3)     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x15a1
        L_0x159e:
            r3 = 0
            goto L_0x1596
        L_0x15a1:
            if (r9 == 0) goto L_0x15ad
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x1655 }
            com.whatsapp.jid.UserJid r4 = r12.A0T     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r59
            A0A(r12, r4, r3)     // Catch:{ RuntimeException -> 0x1655 }
        L_0x15ad:
            com.whatsapp.jid.UserJid r13 = r12.A0T     // Catch:{ RuntimeException -> 0x1655 }
            r4 = r57
            r3 = r56
            A0B(r12, r13, r4, r3)     // Catch:{ RuntimeException -> 0x1655 }
            X.C17880vN.A1H(r12, r1)     // Catch:{ RuntimeException -> 0x1655 }
            if (r13 == 0) goto L_0x1551
            r10.add(r13)     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x1551
        L_0x15bf:
            int r3 = r4.A08     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x1576
        L_0x15c2:
            r1.size()     // Catch:{ RuntimeException -> 0x1655 }
            boolean r3 = A0D(r8, r1)     // Catch:{ RuntimeException -> 0x1655 }
            if (r3 == 0) goto L_0x15cf
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x1eab
        L_0x15cf:
            java.lang.String r3 = "sync_sid_notification_sidelist"
            java.lang.String r4 = X.C63412t2.A00(r3)     // Catch:{ RuntimeException -> 0x1655 }
            r3 = r34
            X.A01 r3 = X.AnonymousClass1UO.A02(r0, r2, r1, r3)     // Catch:{ RuntimeException -> 0x1655 }
            r42 = 0
            r41 = r0
            r43 = r29
            r44 = r11
            r45 = r17
            r46 = r16
            r47 = r9
            r48 = r26
            r49 = r14
            r50 = r42
            r51 = r27
            r52 = r23
            boolean r5 = X.AnonymousClass1UO.A0D(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ RuntimeException -> 0x1655 }
            if (r5 == 0) goto L_0x1618
            X.00H r5 = r0.A0Y     // Catch:{ RuntimeException -> 0x1655 }
            java.lang.Object r11 = r5.get()     // Catch:{ RuntimeException -> 0x1655 }
            X.1PY r11 = (X.AnonymousClass1PY) r11     // Catch:{ RuntimeException -> 0x1655 }
            X.190 r9 = r0.A04     // Catch:{ RuntimeException -> 0x1655 }
            X.9zf r5 = new X.9zf     // Catch:{ RuntimeException -> 0x1655 }
            r5.<init>(r9, r11)     // Catch:{ RuntimeException -> 0x1655 }
            X.1UP r9 = r0.A0D     // Catch:{ RuntimeException -> 0x1655 }
            X.1Ug r4 = r5.A01(r9, r3, r4)     // Catch:{ RuntimeException -> 0x1655 }
        L_0x160f:
            r3 = r37
            boolean r3 = X.AnonymousClass1UO.A0B(r0, r8, r3, r15, r4)     // Catch:{ RuntimeException -> 0x1655 }
            if (r3 != 0) goto L_0x1625
            goto L_0x1621
        L_0x1618:
            X.Acn r5 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1655 }
            X.1Ug r4 = A04(r5, r3, r4)     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x160f
        L_0x1621:
            r1 = r58
            goto L_0x1eab
        L_0x1625:
            X.2cQ r3 = r0.A00     // Catch:{ RuntimeException -> 0x1655 }
            X.C17960vV.A07(r3)     // Catch:{ RuntimeException -> 0x1655 }
            X.AnonymousClass1UR.A01(r3, r8)     // Catch:{ RuntimeException -> 0x1655 }
            X.1UH r5 = r0.A08     // Catch:{ RuntimeException -> 0x1655 }
            X.2n4 r4 = r3.A00     // Catch:{ RuntimeException -> 0x1655 }
            java.util.Map r3 = r0.A0d     // Catch:{ RuntimeException -> 0x1655 }
            r46 = r5
            r47 = r2
            r48 = r4
            r49 = r8
            r50 = r1
            r51 = r3
            r52 = r56
            r55 = r42
            r46.A01(r47, r48, r49, r50, r51, r52, r53, r55)     // Catch:{ RuntimeException -> 0x1655 }
            r3 = 3
            X.2rf r1 = new X.2rf     // Catch:{ RuntimeException -> 0x1655 }
            r1.<init>(r10, r3)     // Catch:{ RuntimeException -> 0x1655 }
            goto L_0x1eab
        L_0x164e:
            r3 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ RuntimeException -> 0x1655 }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x1655 }
            throw r1     // Catch:{ RuntimeException -> 0x1655 }
        L_0x1655:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c82 }
            java.lang.String r1 = "ContactSyncHelper/runAndHandleExceptions "
            X.C17900vP.A0h(r1, r15, r3, r4)     // Catch:{ all -> 0x2c82 }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c82 }
            goto L_0x1eab
        L_0x1663:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c82 }
            java.lang.String r3 = "empty jid hash: "
            r4.append(r3)     // Catch:{ all -> 0x2c82 }
            int r3 = r2.code     // Catch:{ all -> 0x2c82 }
            r4.append(r3)     // Catch:{ all -> 0x2c82 }
            X.C17890vO.A0w(r4)     // Catch:{ all -> 0x2c82 }
            X.190 r9 = r0.A04     // Catch:{ all -> 0x2c7c }
            java.lang.String r5 = "sync/sync_notification_no_jidhash/error"
            r4 = 0
            r3 = r37
            r9.A0G(r5, r3, r4)     // Catch:{ all -> 0x2c9c }
            goto L_0x1eab
        L_0x1681:
            boolean r3 = r2.A00()     // Catch:{ all -> 0x2c9c }
            if (r3 == 0) goto L_0x1eab
            if (r15 == 0) goto L_0x1d9e
            if (r14 == 0) goto L_0x1e8b
            X.1UK r3 = r0.A0A     // Catch:{ all -> 0x2c9c }
            r1 = r50
            X.2Gl r9 = r3.A01(r1)     // Catch:{ all -> 0x2c9c }
            X.C17960vV.A07(r41)     // Catch:{ all -> 0x2c9c }
            X.C17960vV.A07(r33)     // Catch:{ all -> 0x2c9c }
            java.lang.String r19 = "ContactSyncHelper/syncDelta"
            long r50 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1UN r1 = r0.A0I     // Catch:{ RuntimeException -> 0x1d83 }
            r54 = r1
            boolean r12 = r54.A03()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r12 == 0) goto L_0x16dd
            X.00H r1 = r0.A0S     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.Object r1 = r1.get()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1jR r1 = (X.C33821jR) r1     // Catch:{ RuntimeException -> 0x1d83 }
            X.1UW r1 = r1.A00     // Catch:{ RuntimeException -> 0x1d83 }
            X.8ct r49 = r1.A00()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x16b7:
            X.1Tu r11 = r0.A0C     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r10 = "sync/sync_delta/"
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r41
            r1 = r33
            X.2kE r1 = r11.A06(r10, r3, r1, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            r16 = 0
            if (r1 != 0) goto L_0x16e4
            r3 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r8.A0B = r1     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.Long r3 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A08 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A05 = r1     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x16e0
        L_0x16dd:
            r49 = 0
            goto L_0x16b7
        L_0x16e0:
            r1 = r58
            goto L_0x1d91
        L_0x16e4:
            r0.A0E(r1)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r31 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1Nd r3 = r0.A0E     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashSet r11 = r3.A0D()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashSet r48 = X.C17880vN.A12()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashSet r47 = X.C17880vN.A12()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1To r3 = r0.A05     // Catch:{ RuntimeException -> 0x1d83 }
            X.1Rp r4 = r3.A0X     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = "SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION"
            java.util.HashSet r46 = r4.A0M(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r54.A09()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x174b
            boolean r3 = r54.A08()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x18e4
            java.util.List r13 = r1.A06     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x1d83 }
            r12.<init>(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r3 = r1.A00()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r15 = r3.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x171e:
            boolean r3 = r15.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x173c
            X.1E7 r10 = X.C17880vN.A0O(r15)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2lf r3 = r10.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x171e
            long r3 = r3.A00     // Catch:{ RuntimeException -> 0x1d83 }
            r41 = -5
            int r14 = (r3 > r41 ? 1 : (r3 == r41 ? 0 : -1))
            if (r14 != 0) goto L_0x171e
            boolean r3 = r10.A10     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x171e
            r12.add(r10)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x171e
        L_0x173c:
            java.util.ArrayList r3 = X.C17880vN.A10(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r13.clear()     // Catch:{ RuntimeException -> 0x1d83 }
            r13.addAll(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            X.AnonymousClass1UO.A07(r0, r1, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x18e4
        L_0x174b:
            if (r12 == 0) goto L_0x18e4
            if (r49 == 0) goto L_0x18c5
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r3 = r1.A00()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x175b:
            boolean r3 = r13.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1776
            X.1E7 r12 = X.C17880vN.A0O(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            int r3 = r12.A01     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x175b
            java.lang.String r4 = r12.A0K()     // Catch:{ RuntimeException -> 0x1d83 }
            X.0yx r3 = new X.0yx     // Catch:{ RuntimeException -> 0x1d83 }
            r3.<init>(r4, r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r10.add(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x175b
        L_0x1776:
            java.util.List r3 = r1.A06     // Catch:{ RuntimeException -> 0x1d83 }
            r53 = r3
            java.util.Iterator r13 = r53.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x177e:
            boolean r3 = r13.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1795
            X.1E7 r12 = X.C17880vN.A0O(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r4 = r12.A0K()     // Catch:{ RuntimeException -> 0x1d83 }
            X.0yx r3 = new X.0yx     // Catch:{ RuntimeException -> 0x1d83 }
            r3.<init>(r4, r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r10.add(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x177e
        L_0x1795:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x179d:
            boolean r3 = r10.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x17af
            java.lang.Object r3 = r10.next()     // Catch:{ RuntimeException -> 0x1d83 }
            X.0yx r3 = (X.C19760yx) r3     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.Object r3 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            r4.add(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x179d
        L_0x17af:
            r53.clear()     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r53
            r3.addAll(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            X.AnonymousClass1UO.A07(r0, r1, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashMap r15 = X.C17880vN.A11()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashMap r45 = X.C17880vN.A11()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r12 = r53.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x17c6:
            boolean r3 = r12.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x17f2
            X.1E7 r10 = X.C17880vN.A0O(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2lf r3 = r10.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x17c6
            java.lang.String r3 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x17c6
            boolean r3 = X.C63412t2.A01(r10, r11, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x17c6
            X.2lf r3 = r10.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r4 = A05(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r4.isEmpty()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x17c6
            r3 = r45
            r3.put(r10, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x17c6
        L_0x17f2:
            java.util.Iterator r13 = X.C17890vO.A0k(r45)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x17f6:
            boolean r3 = r13.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1817
            X.1E7 r12 = X.C17880vN.A0O(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r10 = r12.A0K()     // Catch:{ RuntimeException -> 0x1d83 }
            X.2lf r3 = r12.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r4 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            X.0yx r3 = new X.0yx     // Catch:{ RuntimeException -> 0x1d83 }
            r3.<init>(r10, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r4 = r15.containsKey(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r4 != 0) goto L_0x17f6
            r15.put(r3, r12)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x17f6
        L_0x1817:
            java.util.Iterator r44 = r41.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x181b:
            boolean r3 = r44.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x18d4
            X.1E7 r13 = X.C17880vN.A0O(r44)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r45
            boolean r3 = r3.containsKey(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x181b
            X.2lf r3 = r13.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x181b
            java.lang.String r3 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x181b
            boolean r3 = X.C63412t2.A01(r13, r11, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x181b
            X.2lf r3 = r13.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r43 = A05(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r42 = X.C17890vO.A0i(r45)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1847:
            boolean r3 = r42.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x181b
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r42)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A08     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r3.contains(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1847
            java.lang.Object r14 = r4.getValue()     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ RuntimeException -> 0x1d83 }
            r52 = r43
            r3 = 0
            X.C18070vi.A0d(r14, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            int r4 = r14.length()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r4 == 0) goto L_0x1847
            int r3 = r43.length()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1847
            if (r4 > r3) goto L_0x1877
            r52 = r14
            r14 = r43
        L_0x1877:
            int r41 = r14.length()     // Catch:{ RuntimeException -> 0x1d83 }
            int r41 = r41 - r5
            int r12 = r52.length()     // Catch:{ RuntimeException -> 0x1d83 }
            int r12 = r12 - r5
        L_0x1882:
            r4 = -1
            if (r4 >= r12) goto L_0x18ae
            r3 = r52
            char r32 = r3.charAt(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = java.lang.Character.isDigit(r32)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x18ab
            r10 = r41
        L_0x1893:
            if (r4 >= r10) goto L_0x18ab
            char r26 = r14.charAt(r10)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = java.lang.Character.isDigit(r26)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x18a0
            goto L_0x18a3
        L_0x18a0:
            int r10 = r10 + -1
            goto L_0x1893
        L_0x18a3:
            r4 = r32
            r3 = r26
            if (r4 != r3) goto L_0x1847
            int r41 = r10 + -1
        L_0x18ab:
            int r12 = r12 + -1
            goto L_0x1882
        L_0x18ae:
            java.lang.String r10 = r13.A0K()     // Catch:{ RuntimeException -> 0x1d83 }
            X.2lf r3 = r13.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r4 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            X.0yx r3 = new X.0yx     // Catch:{ RuntimeException -> 0x1d83 }
            r3.<init>(r10, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r4 = r15.containsKey(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r4 != 0) goto L_0x1847
            r15.put(r3, r13)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1847
        L_0x18c5:
            X.10I r10 = r0.A0O     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = 31
            X.3Bp r4 = new X.3Bp     // Catch:{ RuntimeException -> 0x1d83 }
            r4.<init>(r0, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = "hsm-handshake-from-delta-sync"
            r10.CGL(r4, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x18e4
        L_0x18d4:
            java.util.Collection r3 = r15.values()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r4 = X.C17880vN.A10(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r53.clear()     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r53
            r3.addAll(r4)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x18e4:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A06     // Catch:{ RuntimeException -> 0x1d83 }
            r42 = r3
            r4.addAll(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A09     // Catch:{ RuntimeException -> 0x1d83 }
            r41 = r3
            r4.addAll(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r20 == 0) goto L_0x18fd
            r3 = r20
            r4.addAll(r3)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x18fd:
            if (r18 != 0) goto L_0x190a
            X.00H r10 = r0.A0Q     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r55
            boolean r3 = A0C(r3, r10, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            r10 = 0
            if (r3 == 0) goto L_0x190b
        L_0x190a:
            r10 = 1
        L_0x190b:
            java.util.Iterator r18 = r42.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
            r26 = 0
        L_0x1911:
            boolean r3 = r18.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x19ba
            X.1E7 r13 = X.C17880vN.A0O(r18)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = X.C63412t2.A01(r13, r11, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1911
            X.2lf r3 = r13.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1930
            java.lang.String r4 = r3.A01     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r46
            boolean r3 = r3.contains(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1930
            goto L_0x1911
        L_0x1930:
            if (r49 == 0) goto L_0x1934
            r26 = 1
        L_0x1934:
            X.A4m r12 = new X.A4m     // Catch:{ RuntimeException -> 0x1d83 }
            r12.<init>(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1QO r3 = r0.A0K     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r15 = r3.A0D()     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0D = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0N = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0C = r5     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.UserJid r14 = r12.A0T     // Catch:{ RuntimeException -> 0x1d83 }
            r4 = r57
            r3 = r56
            A0B(r12, r14, r4, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0F = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0J = r15     // Catch:{ RuntimeException -> 0x1d83 }
            X.1E7 r13 = r12.A0R     // Catch:{ RuntimeException -> 0x1d83 }
            X.C17960vV.A07(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2R1 r3 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x1d83 }
            if (r2 != r3) goto L_0x1978
            int r3 = r13.A07     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x195d:
            r12.A01 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0G = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0I = r10     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r27
            r12.A0P = r3     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r54.A09()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x198d
            X.Acn r3 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r3.A06(r2)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x198d
            goto L_0x197b
        L_0x1978:
            int r3 = r13.A08     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x195d
        L_0x197b:
            if (r49 == 0) goto L_0x198d
            X.00H r3 = r0.A0T     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.Object r4 = r3.get()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1UV r4 = (X.AnonymousClass1UV) r4     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r49
            byte[] r3 = r4.A00(r13, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0Q = r3     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x198d:
            boolean r3 = X.C18020vd.A06(r55)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1995
            r12.A0O = r5     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1995:
            r3 = 0
            X.AnonymousClass1UO.A09(r0, r12, r3, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1MR r3 = r0.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            X.2rW r3 = A03(r12, r3, r14)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x19a6
            long r3 = r3.A02     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x19a3:
            r12.A02 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x19a9
        L_0x19a6:
            r3 = 0
            goto L_0x19a3
        L_0x19a9:
            if (r15 == 0) goto L_0x19b3
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r59
            A0A(r12, r14, r3)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x19b3:
            r3 = r31
            X.C17880vN.A1H(r12, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1911
        L_0x19ba:
            java.util.List r3 = r1.A05     // Catch:{ RuntimeException -> 0x1d83 }
            r32 = r3
            java.util.Iterator r12 = r32.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x19c2:
            boolean r3 = r12.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x19d6
            X.1E7 r3 = X.C17880vN.A0O(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r4 = X.AnonymousClass1UO.A04(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r48
            r3.add(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x19c2
        L_0x19d6:
            boolean r15 = r54.A08()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r14 = r41.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x19de:
            boolean r3 = r14.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a79
            X.1E7 r12 = X.C17880vN.A0O(r14)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = X.C63412t2.A01(r12, r11, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x19fd
            java.lang.String r4 = X.AnonymousClass1UO.A04(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r48
            boolean r3 = r3.contains(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x19fd
            if (r15 == 0) goto L_0x1a31
            goto L_0x1a05
        L_0x19fd:
            if (r15 == 0) goto L_0x19de
            int r4 = r12.A01     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = 2
            if (r4 == r3) goto L_0x1a05
            goto L_0x19de
        L_0x1a05:
            boolean r3 = r54.A09()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a14
            java.util.Set r3 = r1.A0D     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r3.contains(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a31
            goto L_0x19de
        L_0x1a14:
            java.util.Iterator r13 = r42.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1a18:
            boolean r3 = r13.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a31
            X.1E7 r3 = X.C17880vN.A0O(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1BI r4 = r3.A0J     // Catch:{ RuntimeException -> 0x1d83 }
            if (r4 == 0) goto L_0x1a18
            X.1BI r3 = r12.A0J     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a18
            boolean r3 = r4.equals(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a18
            goto L_0x19de
        L_0x1a31:
            X.A4m r13 = new X.A4m     // Catch:{ RuntimeException -> 0x1d83 }
            r13.<init>(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r13.A0D = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r13.A0E = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r31
            X.C17880vN.A1H(r13, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.Jid r3 = X.AnonymousClass1E7.A01(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r11.contains(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x19de
            X.A4m r4 = new X.A4m     // Catch:{ RuntimeException -> 0x1d83 }
            r4.<init>(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r4.A0N = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r4.A0C = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r4.A0H = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r4.A0M = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r4.A0I = r10     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = X.C18020vd.A06(r55)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1a60
            r4.A0O = r5     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1a60:
            r3 = 0
            X.AnonymousClass1UO.A09(r0, r13, r3, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.UserJid r12 = r4.A0T     // Catch:{ RuntimeException -> 0x1d83 }
            r13 = r57
            r3 = r56
            A0B(r4, r12, r13, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r47
            r3.add(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r31
            X.C17880vN.A1H(r4, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x19de
        L_0x1a79:
            if (r20 == 0) goto L_0x1afb
            java.util.Iterator r14 = r20.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1a7f:
            boolean r3 = r14.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1afb
            X.1E7 r4 = X.C17880vN.A0O(r14)     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.Jid r11 = X.AnonymousClass1E7.A01(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r47
            boolean r3 = r3.contains(r11)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1a7f
            X.1BI r3 = r4.A0J     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = X.C63412t2.A03(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1a7f
            X.1QO r3 = r0.A0K     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r13 = r3.A0D()     // Catch:{ RuntimeException -> 0x1d83 }
            X.A4m r12 = new X.A4m     // Catch:{ RuntimeException -> 0x1d83 }
            r12.<init>(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0N = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0C = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0H = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0M = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0F = r5     // Catch:{ RuntimeException -> 0x1d83 }
            X.2R1 r3 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x1d83 }
            if (r2 != r3) goto L_0x1af8
            int r3 = r4.A07     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1ab8:
            r12.A01 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0J = r13     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0G = r5     // Catch:{ RuntimeException -> 0x1d83 }
            r12.A0I = r10     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r27
            r12.A0P = r3     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = X.C18020vd.A06(r55)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1acc
            r12.A0O = r5     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1acc:
            r3 = 0
            X.AnonymousClass1UO.A09(r0, r12, r3, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.UserJid r11 = r12.A0T     // Catch:{ RuntimeException -> 0x1d83 }
            r4 = r57
            r3 = r56
            A0B(r12, r11, r4, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1MR r3 = r0.A0H     // Catch:{ RuntimeException -> 0x1d83 }
            X.2rW r3 = A03(r12, r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1af5
            long r3 = r3.A02     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1ae3:
            r12.A02 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            if (r13 == 0) goto L_0x1aef
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r59
            A0A(r12, r11, r3)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1aef:
            r3 = r31
            X.C17880vN.A1H(r12, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1a7f
        L_0x1af5:
            r3 = 0
            goto L_0x1ae3
        L_0x1af8:
            int r3 = r4.A08     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1ab8
        L_0x1afb:
            r31.size()     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r31
            boolean r3 = A0D(r8, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1b22
            java.lang.Long r3 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A08 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r4 = r1.A08     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A0C     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r5 = r1.A0A     // Catch:{ RuntimeException -> 0x1d83 }
            r1 = r32
            boolean r1 = X.AnonymousClass1UO.A0C(r0, r1, r4, r3, r5)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r1 == 0) goto L_0x1b1e
            X.2rf r1 = X.C62602rf.A07     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1d91
        L_0x1b1e:
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1d91
        L_0x1b22:
            r11 = 11042(0x2b22, float:1.5473E-41)
            r4 = r39
            r3 = r55
            int r3 = X.C18020vd.A00(r4, r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            r12 = -1
            if (r3 == r12) goto L_0x1cb3
            java.util.HashMap r10 = X.C17880vN.A11()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r14 = r31.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1b37:
            boolean r3 = r14.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1b5c
            java.lang.Object r13 = r14.next()     // Catch:{ RuntimeException -> 0x1d83 }
            X.9iB r13 = (X.C188899iB) r13     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r4 = X.AnonymousClass1UO.A03(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r4 == 0) goto L_0x1b37
            java.lang.Object r3 = r10.get(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1b55
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1b55:
            r3.add(r13)     // Catch:{ RuntimeException -> 0x1d83 }
            r10.put(r4, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1b37
        L_0x1b5c:
            r4 = r39
            r3 = r55
            int r13 = X.C18020vd.A00(r4, r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r13 != r12) goto L_0x1c72
            java.lang.String r3 = "contactsynchelper/syncDelta/partitionRequestsIntoBatches threshold: None"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r31
            r11.add(r3)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1b78:
            boolean r3 = r4.isEmpty()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1b81
            r11.add(r4)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1b81:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = "contactsynchelper/syncDelta/partitionRequestsIntoBatches batches count: "
            r4.append(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            int r3 = r11.size()     // Catch:{ RuntimeException -> 0x1d83 }
            X.C17900vP.A0o(r4, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Set r3 = r10.keySet()     // Catch:{ RuntimeException -> 0x1d83 }
            r3.size()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r20 = r11.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
            r52 = 0
            r18 = 0
        L_0x1ba4:
            boolean r3 = r20.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1ca2
            java.lang.Object r11 = r20.next()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = "sync_sid_delta"
            java.lang.String r4 = X.C63412t2.A00(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r26 == 0) goto L_0x1bbe
            java.util.HashSet r3 = r0.A0Z     // Catch:{ RuntimeException -> 0x1d83 }
            r3.add(r4)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1bbe:
            X.Acn r12 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r34
            X.A01 r3 = X.AnonymousClass1UO.A02(r0, r2, r11, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1Ug r12 = A04(r12, r3, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r19
            boolean r3 = X.AnonymousClass1UO.A0B(r0, r8, r9, r3, r12)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1bdc
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A08 = r1     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1c9c
        L_0x1bdc:
            java.util.HashSet r3 = r0.A0Z     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r3.contains(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1be8
            if (r26 == 0) goto L_0x1be8
            r52 = 1
        L_0x1be8:
            int r3 = X.AnonymousClass1UO.A00(r0, r2, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            long r3 = (long) r3     // Catch:{ RuntimeException -> 0x1d83 }
            long r16 = r16 + r3
            r3 = r32
            java.util.ArrayList r12 = X.AnonymousClass1UO.A05(r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A00     // Catch:{ RuntimeException -> 0x1d83 }
            r27 = r3
            X.AnonymousClass1UO.A05(r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A08     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r15 = X.AnonymousClass1UO.A05(r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A0C     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r14 = X.AnonymousClass1UO.A05(r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A0A     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r13 = X.AnonymousClass1UO.A05(r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2cQ r3 = r0.A00     // Catch:{ RuntimeException -> 0x1d83 }
            X.C17960vV.A07(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Map r4 = r0.A0f     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r37
            X.AnonymousClass1UO.A0A(r0, r3, r12, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1UH r3 = r0.A08     // Catch:{ RuntimeException -> 0x1d83 }
            A07(r0, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r14 = X.AnonymousClass1UO.A0C(r0, r12, r15, r14, r13)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2cQ r12 = r0.A00     // Catch:{ RuntimeException -> 0x1d83 }
            X.AnonymousClass1UR.A01(r12, r8)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2n4 r13 = r12.A00     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Map r12 = r0.A0d     // Catch:{ RuntimeException -> 0x1d83 }
            r43 = r3
            r44 = r2
            r45 = r13
            r46 = r8
            r47 = r11
            r48 = r12
            r49 = r56
            r43.A01(r44, r45, r46, r47, r48, r49, r50, r52)     // Catch:{ RuntimeException -> 0x1d83 }
            X.00H r3 = r0.A0P     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.Object r12 = r3.get()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1Lo r12 = (X.C24761Lo) r12     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A02     // Catch:{ RuntimeException -> 0x1d83 }
            r41 = r12
            r42 = r33
            r43 = r27
            r44 = r3
            r45 = r4
            r46 = r5
            r41.A02(r42, r43, r44, r45, r46)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r14 == 0) goto L_0x1c5a
            r18 = 1
        L_0x1c5a:
            java.util.Iterator r4 = r11.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1c5e:
            boolean r3 = r4.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1ba4
            java.lang.Object r3 = r4.next()     // Catch:{ RuntimeException -> 0x1d83 }
            X.9iB r3 = (X.C188899iB) r3     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.UserJid r3 = r3.A09     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1c5e
            r10.add(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1c5e
        L_0x1c72:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.String r3 = "contactsynchelper/syncDelta/partitionRequestsIntoBatches threshold: "
            X.C17900vP.A0j(r3, r12, r13)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r12 = X.C17890vO.A0i(r10)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1c7f:
            boolean r3 = r12.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1b78
            java.lang.Object r3 = X.C17890vO.A0P(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ RuntimeException -> 0x1d83 }
            r4.addAll(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            int r3 = r4.size()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 < r13) goto L_0x1c7f
            r11.add(r4)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1c7f
        L_0x1c9c:
            if (r52 != 0) goto L_0x1ca2
            r1 = r58
            goto L_0x1d91
        L_0x1ca2:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A08 = r1     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = 3
            if (r18 == 0) goto L_0x1cac
            r3 = 2
        L_0x1cac:
            X.2rf r1 = new X.2rf     // Catch:{ RuntimeException -> 0x1d83 }
            r1.<init>(r10, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1d91
        L_0x1cb3:
            int r3 = r31.size()     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x1d83 }
            r10.<init>(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Iterator r4 = r31.iterator()     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1cc0:
            boolean r3 = r4.hasNext()     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1cd4
            java.lang.Object r3 = r4.next()     // Catch:{ RuntimeException -> 0x1d83 }
            X.9iB r3 = (X.C188899iB) r3     // Catch:{ RuntimeException -> 0x1d83 }
            com.whatsapp.jid.UserJid r3 = r3.A09     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 == 0) goto L_0x1cc0
            r10.add(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1cc0
        L_0x1cd4:
            java.lang.String r3 = "sync_sid_delta"
            java.lang.String r12 = X.C63412t2.A00(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r26 == 0) goto L_0x1ce2
            java.util.HashSet r3 = r0.A0Z     // Catch:{ RuntimeException -> 0x1d83 }
            r3.add(r12)     // Catch:{ RuntimeException -> 0x1d83 }
        L_0x1ce2:
            X.Acn r11 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1d83 }
            r4 = r34
            r3 = r31
            X.A01 r3 = X.AnonymousClass1UO.A02(r0, r2, r3, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1Ug r4 = A04(r11, r3, r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r19
            boolean r3 = X.AnonymousClass1UO.A0B(r0, r8, r9, r3, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r3 != 0) goto L_0x1d04
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A08 = r1     // Catch:{ RuntimeException -> 0x1d83 }
            r1 = r58
            goto L_0x1d91
        L_0x1d04:
            if (r26 == 0) goto L_0x1d10
            java.util.HashSet r3 = r0.A0Z     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r3 = r3.contains(r12)     // Catch:{ RuntimeException -> 0x1d83 }
            r52 = 1
            if (r3 != 0) goto L_0x1d12
        L_0x1d10:
            r52 = 0
        L_0x1d12:
            r3 = r31
            int r3 = X.AnonymousClass1UO.A00(r0, r2, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            long r11 = (long) r3     // Catch:{ RuntimeException -> 0x1d83 }
            r3 = r16
            java.lang.Long r3 = X.C17880vN.A0o(r3, r11)     // Catch:{ RuntimeException -> 0x1d83 }
            r9.A08 = r3     // Catch:{ RuntimeException -> 0x1d83 }
            X.2cQ r3 = r0.A00     // Catch:{ RuntimeException -> 0x1d83 }
            X.C17960vV.A07(r3)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Map r14 = r0.A0f     // Catch:{ RuntimeException -> 0x1d83 }
            r4 = r37
            r3 = r32
            X.AnonymousClass1UO.A0A(r0, r4, r3, r14)     // Catch:{ RuntimeException -> 0x1d83 }
            X.1UH r13 = r0.A08     // Catch:{ RuntimeException -> 0x1d83 }
            A07(r0, r13)     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r12 = r1.A08     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r11 = r1.A0C     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r4 = r1.A0A     // Catch:{ RuntimeException -> 0x1d83 }
            boolean r11 = X.AnonymousClass1UO.A0C(r0, r3, r12, r11, r4)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2cQ r3 = r0.A00     // Catch:{ RuntimeException -> 0x1d83 }
            X.AnonymousClass1UR.A01(r3, r8)     // Catch:{ RuntimeException -> 0x1d83 }
            X.2n4 r4 = r3.A00     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.Map r3 = r0.A0d     // Catch:{ RuntimeException -> 0x1d83 }
            r43 = r13
            r44 = r2
            r45 = r4
            r46 = r8
            r47 = r31
            r48 = r3
            r49 = r56
            r43.A01(r44, r45, r46, r47, r48, r49, r50, r52)     // Catch:{ RuntimeException -> 0x1d83 }
            X.00H r3 = r0.A0P     // Catch:{ RuntimeException -> 0x1d83 }
            java.lang.Object r4 = r3.get()     // Catch:{ RuntimeException -> 0x1d83 }
            X.1Lo r4 = (X.C24761Lo) r4     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r3 = r1.A00     // Catch:{ RuntimeException -> 0x1d83 }
            java.util.List r1 = r1.A02     // Catch:{ RuntimeException -> 0x1d83 }
            r41 = r4
            r42 = r33
            r43 = r3
            r44 = r1
            r45 = r14
            r46 = r5
            r41.A02(r42, r43, r44, r45, r46)     // Catch:{ RuntimeException -> 0x1d83 }
            if (r11 == 0) goto L_0x1d7c
            r3 = 2
            X.2rf r1 = new X.2rf     // Catch:{ RuntimeException -> 0x1d83 }
            r1.<init>(r10, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1d91
        L_0x1d7c:
            r3 = 3
            X.2rf r1 = new X.2rf     // Catch:{ RuntimeException -> 0x1d83 }
            r1.<init>(r10, r3)     // Catch:{ RuntimeException -> 0x1d83 }
            goto L_0x1d91
        L_0x1d83:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c9c }
            java.lang.String r3 = "ContactSyncHelper/runAndHandleExceptions "
            r1 = r19
            X.C17900vP.A0h(r3, r1, r4, r5)     // Catch:{ all -> 0x2c9c }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c9c }
        L_0x1d91:
            X.1UN r3 = r0.A0I     // Catch:{ all -> 0x2c9c }
            boolean r3 = r3.A09()     // Catch:{ all -> 0x2c9c }
            if (r3 != 0) goto L_0x1eab
            X.AnonymousClass1UO.A08(r0, r1, r2, r9)     // Catch:{ all -> 0x2c9c }
            goto L_0x1eab
        L_0x1d9e:
            if (r14 == 0) goto L_0x1e8b
            java.lang.String r10 = "ContactSyncHelper/syncDeltaSidelist"
            long r48 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x1e7e }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ RuntimeException -> 0x1e7e }
            if (r20 == 0) goto L_0x1e2e
            if (r18 != 0) goto L_0x1dbb
            X.00H r3 = r0.A0Q     // Catch:{ RuntimeException -> 0x1e7e }
            r1 = r55
            r4 = r20
            boolean r1 = A0C(r1, r3, r4)     // Catch:{ RuntimeException -> 0x1e7e }
            r12 = 0
            if (r1 == 0) goto L_0x1dbc
        L_0x1dbb:
            r12 = 1
        L_0x1dbc:
            java.util.Iterator r14 = r20.iterator()     // Catch:{ RuntimeException -> 0x1e7e }
        L_0x1dc0:
            boolean r1 = r14.hasNext()     // Catch:{ RuntimeException -> 0x1e7e }
            if (r1 == 0) goto L_0x1e2e
            X.1E7 r3 = X.C17880vN.A0O(r14)     // Catch:{ RuntimeException -> 0x1e7e }
            X.1BI r1 = r3.A0J     // Catch:{ RuntimeException -> 0x1e7e }
            boolean r1 = X.C63412t2.A03(r1)     // Catch:{ RuntimeException -> 0x1e7e }
            if (r1 != 0) goto L_0x1dc0
            X.1QO r1 = r0.A0K     // Catch:{ RuntimeException -> 0x1e7e }
            boolean r13 = r1.A0D()     // Catch:{ RuntimeException -> 0x1e7e }
            X.A4m r11 = new X.A4m     // Catch:{ RuntimeException -> 0x1e7e }
            r11.<init>(r3)     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0N = r5     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0C = r5     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0H = r5     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0M = r5     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0F = r5     // Catch:{ RuntimeException -> 0x1e7e }
            X.2R1 r1 = X.AnonymousClass2R1.A06     // Catch:{ RuntimeException -> 0x1e7e }
            if (r2 != r1) goto L_0x1e2b
            int r1 = r3.A07     // Catch:{ RuntimeException -> 0x1e7e }
        L_0x1ded:
            r11.A01 = r1     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0J = r13     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0G = r5     // Catch:{ RuntimeException -> 0x1e7e }
            r11.A0I = r12     // Catch:{ RuntimeException -> 0x1e7e }
            r1 = r27
            r11.A0P = r1     // Catch:{ RuntimeException -> 0x1e7e }
            boolean r1 = X.C18020vd.A06(r55)     // Catch:{ RuntimeException -> 0x1e7e }
            if (r1 == 0) goto L_0x1e01
            r11.A0O = r5     // Catch:{ RuntimeException -> 0x1e7e }
        L_0x1e01:
            r1 = 0
            X.AnonymousClass1UO.A09(r0, r11, r1, r5)     // Catch:{ RuntimeException -> 0x1e7e }
            X.1MR r3 = r0.A0H     // Catch:{ RuntimeException -> 0x1e7e }
            com.whatsapp.jid.UserJid r1 = r11.A0T     // Catch:{ RuntimeException -> 0x1e7e }
            X.2rW r3 = A03(r11, r3, r1)     // Catch:{ RuntimeException -> 0x1e7e }
            if (r3 == 0) goto L_0x1e28
            long r3 = r3.A02     // Catch:{ RuntimeException -> 0x1e7e }
        L_0x1e11:
            r11.A02 = r3     // Catch:{ RuntimeException -> 0x1e7e }
            if (r13 == 0) goto L_0x1e1d
            X.AnonymousClass1QS.A00(r60)     // Catch:{ RuntimeException -> 0x1e7e }
            r3 = r59
            A0A(r11, r1, r3)     // Catch:{ RuntimeException -> 0x1e7e }
        L_0x1e1d:
            r4 = r57
            r3 = r56
            A0B(r11, r1, r4, r3)     // Catch:{ RuntimeException -> 0x1e7e }
            X.C17880vN.A1H(r11, r9)     // Catch:{ RuntimeException -> 0x1e7e }
            goto L_0x1dc0
        L_0x1e28:
            r3 = 0
            goto L_0x1e11
        L_0x1e2b:
            int r1 = r3.A08     // Catch:{ RuntimeException -> 0x1e7e }
            goto L_0x1ded
        L_0x1e2e:
            r9.size()     // Catch:{ RuntimeException -> 0x1e7e }
            boolean r1 = A0D(r8, r9)     // Catch:{ RuntimeException -> 0x1e7e }
            if (r1 == 0) goto L_0x1e3a
            X.2rf r1 = X.C62602rf.A08     // Catch:{ RuntimeException -> 0x1e7e }
            goto L_0x1eab
        L_0x1e3a:
            X.Acn r4 = X.AnonymousClass1UO.A01(r0)     // Catch:{ RuntimeException -> 0x1e7e }
            java.lang.String r1 = "sync_sid_sidelist"
            java.lang.String r3 = X.C63412t2.A00(r1)     // Catch:{ RuntimeException -> 0x1e7e }
            r1 = r34
            X.A01 r1 = X.AnonymousClass1UO.A02(r0, r2, r9, r1)     // Catch:{ RuntimeException -> 0x1e7e }
            X.1Ug r3 = A04(r4, r1, r3)     // Catch:{ RuntimeException -> 0x1e7e }
            r1 = r37
            boolean r1 = X.AnonymousClass1UO.A0B(r0, r8, r1, r10, r3)     // Catch:{ RuntimeException -> 0x1e7e }
            if (r1 != 0) goto L_0x1e5a
            r1 = r58
            goto L_0x1eab
        L_0x1e5a:
            X.2cQ r1 = r0.A00     // Catch:{ RuntimeException -> 0x1e7e }
            X.C17960vV.A07(r1)     // Catch:{ RuntimeException -> 0x1e7e }
            X.AnonymousClass1UR.A01(r1, r8)     // Catch:{ RuntimeException -> 0x1e7e }
            X.1UH r4 = r0.A08     // Catch:{ RuntimeException -> 0x1e7e }
            X.2n4 r3 = r1.A00     // Catch:{ RuntimeException -> 0x1e7e }
            java.util.Map r1 = r0.A0d     // Catch:{ RuntimeException -> 0x1e7e }
            r50 = 0
            r41 = r4
            r42 = r2
            r43 = r3
            r44 = r8
            r45 = r9
            r46 = r1
            r47 = r56
            r41.A01(r42, r43, r44, r45, r46, r47, r48, r50)     // Catch:{ RuntimeException -> 0x1e7e }
            X.2rf r1 = X.C62602rf.A06     // Catch:{ RuntimeException -> 0x1e7e }
            goto L_0x1eab
        L_0x1e7e:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c9c }
            java.lang.String r1 = "ContactSyncHelper/runAndHandleExceptions "
            X.C17900vP.A0h(r1, r10, r3, r4)     // Catch:{ all -> 0x2c9c }
            X.2rf r1 = X.C62602rf.A02     // Catch:{ all -> 0x2c9c }
            goto L_0x1eab
        L_0x1e8b:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2c9c }
            java.lang.String r3 = "wrong sync type and query scope: "
            r4.append(r3)     // Catch:{ all -> 0x2c9c }
            int r3 = r2.code     // Catch:{ all -> 0x2c9c }
            r4.append(r3)     // Catch:{ all -> 0x2c9c }
            X.C17890vO.A0w(r4)     // Catch:{ all -> 0x2c9c }
            X.190 r9 = r0.A04     // Catch:{ all -> 0x2c9c }
            java.lang.String r5 = "sync/sync_delta/error"
            r4 = 0
            r3 = r37
            r9.A0G(r5, r3, r4)     // Catch:{ all -> 0x2c9c }
            goto L_0x1eab
        L_0x1ea9:
            r1 = r58
        L_0x1eab:
            java.util.Map r3 = r0.A0f
            r3.clear()
            java.util.Map r3 = r0.A0d
            r3.clear()
            r57.clear()
            r56.clear()
            java.util.Map r3 = r0.A0b
            r3.clear()
            r3 = r37
            r0.A00 = r3
            r0.A01 = r3
            r0 = r59
            java.util.Map r0 = r0.A01
            if (r0 == 0) goto L_0x1ecf
            r0.clear()
        L_0x1ecf:
            r0 = r68
            X.118 r0 = r0.A0I
            android.content.Context r0 = r0.A00
            r54 = r0
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x2a63
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x1eec
            r0 = r68
            java.lang.Runnable r3 = r0.A0V
            r0 = r66
            r0.A0J(r3)
        L_0x1eec:
            r0 = r69
            r0.A09(r1)
            if (r38 == 0) goto L_0x1f76
            r0 = r68
            X.1Rm r12 = r0.A06
            monitor-enter(r12)
            X.11S r0 = r12.A01     // Catch:{ all -> 0x2c7f }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x2c7f }
            r14 = 1
            if (r0 != 0) goto L_0x1f6c
            X.00H r0 = r12.A07     // Catch:{ all -> 0x2c7f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2c7f }
            X.1dX r0 = (X.C30191dX) r0     // Catch:{ all -> 0x2c7f }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x2c7f }
            if (r0 != 0) goto L_0x1f15
            java.lang.String r0 = "androidcontactssync/clearsyncdata/permission_denied"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2c7f }
            goto L_0x1f6c
        L_0x1f15:
            X.11C r0 = r12.A02     // Catch:{ all -> 0x2c7f }
            X.11B r11 = r0.A0O()     // Catch:{ all -> 0x2c7f }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x2c7f }
            android.net.Uri$Builder r4 = r0.buildUpon()     // Catch:{ all -> 0x2c7f }
            java.lang.String r3 = "account_name"
            r10 = 2131898700(0x7f12314c, float:1.9432325E38)
            r0 = r54
            java.lang.String r0 = r0.getString(r10)     // Catch:{ all -> 0x2c7f }
            android.net.Uri$Builder r3 = r4.appendQueryParameter(r3, r0)     // Catch:{ all -> 0x2c7f }
            java.lang.String r0 = "account_type"
            java.lang.String r9 = "com.whatsapp"
            android.net.Uri$Builder r4 = r3.appendQueryParameter(r0, r9)     // Catch:{ all -> 0x2c7f }
            java.lang.String r3 = "caller_is_syncadapter"
            java.lang.String r0 = "true"
            android.net.Uri r5 = X.C17890vO.A0C(r4, r3, r0)     // Catch:{ all -> 0x2c7f }
            r13 = 0
            java.lang.String r4 = "account_name = ? AND account_type = ?"
            java.lang.String[] r3 = X.C17880vN.A1Z()     // Catch:{ SecurityException -> 0x1f58, IllegalArgumentException -> 0x1f56 }
            r0 = r54
            java.lang.String r0 = r0.getString(r10)     // Catch:{ SecurityException -> 0x1f58, IllegalArgumentException -> 0x1f56 }
            r3[r13] = r0     // Catch:{ SecurityException -> 0x1f58, IllegalArgumentException -> 0x1f56 }
            r3[r14] = r9     // Catch:{ SecurityException -> 0x1f58, IllegalArgumentException -> 0x1f56 }
            r11.A01(r5, r4, r3)     // Catch:{ SecurityException -> 0x1f58, IllegalArgumentException -> 0x1f56 }
            goto L_0x1f6c
        L_0x1f56:
            monitor-exit(r12)
            goto L_0x1f6f
        L_0x1f58:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x2c7f }
            if (r0 == 0) goto L_0x2c7e
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x2c7f }
            java.lang.String r0 = "User 0 tying to get authenticator types for "
            boolean r0 = r3.startsWith(r0)     // Catch:{ all -> 0x2c7f }
            if (r0 == 0) goto L_0x2c7e
            goto L_0x1f6e
        L_0x1f6c:
            monitor-exit(r12)
            goto L_0x1f76
        L_0x1f6e:
            monitor-exit(r12)
        L_0x1f6f:
            r3 = r69
            r0 = r58
            r3.A09(r0)
        L_0x1f76:
            X.2Qw r3 = r2.mode
            r0 = r40
            if (r3 != r0) goto L_0x1fc0
            if (r24 == 0) goto L_0x1f8b
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "last_contact_full_sync"
            X.C17880vN.A1D(r2, r0, r6)
        L_0x1f8b:
            if (r21 == 0) goto L_0x1f9a
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "last_sidelist_full_sync"
            X.C17880vN.A1D(r2, r0, r6)
        L_0x1f9a:
            if (r29 == 0) goto L_0x1fa9
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "last_status_full_sync"
            X.C17880vN.A1D(r2, r0, r6)
        L_0x1fa9:
            if (r23 == 0) goto L_0x1fb8
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "last_text_status_full_sync"
            X.C17880vN.A1D(r2, r0, r6)
        L_0x1fb8:
            if (r25 == 0) goto L_0x2ace
            int r2 = r1.A00
            r0 = 2
            if (r2 != r0) goto L_0x2ace
            goto L_0x1fd0
        L_0x1fc0:
            boolean r0 = r64.A09()
            if (r0 == 0) goto L_0x1fb8
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x1fb8
            X.AnonymousClass1US.A02(r68)
            goto L_0x1fb8
        L_0x1fd0:
            r0 = r68
            X.1Rm r7 = r0.A06     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r0 = r30
            java.util.Map r0 = r0.A01     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            java.util.Set r21 = r0.keySet()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r0 = r68
            X.1M9 r0 = r0.A09     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r53 = r0
            X.1M2 r2 = r0.A04     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r0 = 1
            X.1Ez r6 = new X.1Ez     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r6.<init>((boolean) r0)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r6.A04()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            java.util.ArrayList r39 = X.AnonymousClass000.A13()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            X.1at r5 = X.C24801Ls.A00(r2)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            java.lang.String r4 = "SELECT wa_contacts._id, wa_contacts.jid, is_whatsapp_user, number, raw_contact_id, display_name, phone_type, phone_label, is_reachable FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE is_whatsapp_user = 1"
            java.lang.String r3 = "GET_ALL_WA_CONTACTS"
            r2 = r37
            android.database.Cursor r4 = X.C24861Ly.A03(r5, r4, r3, r2)     // Catch:{ all -> 0x2a37 }
        L_0x1fff:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x2a2b }
            if (r2 == 0) goto L_0x2064
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x2a2b }
            X.1Dt r2 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x2a2b }
            com.whatsapp.jid.Jid r3 = r2.A02(r3)     // Catch:{ all -> 0x2a2b }
            boolean r2 = X.C22971Dz.A0Y(r3)     // Catch:{ all -> 0x2a2b }
            if (r2 == 0) goto L_0x1fff
            com.whatsapp.jid.UserJid r12 = X.C22941Dw.A00(r3)     // Catch:{ all -> 0x2a2b }
            r2 = 2
            int r3 = r4.getInt(r2)     // Catch:{ all -> 0x2a2b }
            r2 = 0
            boolean r19 = X.AnonymousClass000.A1T(r3, r0)
            r3 = 3
            java.lang.String r13 = r4.getString(r3)     // Catch:{ all -> 0x2a2b }
            r3 = 4
            long r17 = r4.getLong(r3)     // Catch:{ all -> 0x2a2b }
            r3 = 5
            java.lang.String r14 = r4.getString(r3)     // Catch:{ all -> 0x2a2b }
            r3 = 6
            int r16 = r4.getInt(r3)     // Catch:{ all -> 0x2a2b }
            r3 = 7
            java.lang.String r15 = r4.getString(r3)     // Catch:{ all -> 0x2a2b }
            X.1E7 r11 = new X.1E7     // Catch:{ all -> 0x2a2b }
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x2a2b }
            java.lang.String r10 = "is_reachable"
            int r3 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x2a2b }
            boolean r3 = r4.isNull(r3)     // Catch:{ all -> 0x2a2b }
            r9 = 1
            if (r3 != 0) goto L_0x2055
            int r3 = X.C17890vO.A01(r4, r10)     // Catch:{ all -> 0x2a2b }
            if (r3 == r0) goto L_0x2055
            r9 = 0
        L_0x2055:
            r11.A0q = r9     // Catch:{ all -> 0x2a2b }
            long r2 = r4.getLong(r2)     // Catch:{ all -> 0x2a2b }
            r11.A0M(r2)     // Catch:{ all -> 0x2a2b }
            r2 = r39
            r2.add(r11)     // Catch:{ all -> 0x2a2b }
            goto L_0x1fff
        L_0x2064:
            r4.close()     // Catch:{ all -> 0x2a37 }
            r5.close()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r39.size()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r6.A01()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            monitor-enter(r7)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            X.11S r2 = r7.A01     // Catch:{ all -> 0x2a28 }
            boolean r2 = r2.A0N()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2084
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to companion mode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x2a28 }
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x2a28 }
            goto L_0x2a08
        L_0x2084:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x2a28 }
            r2 = r54
            android.accounts.Account r16 = r7.A05(r2)     // Catch:{ all -> 0x2a28 }
            X.0vc r2 = r7.A05     // Catch:{ all -> 0x2a28 }
            r52 = r2
            java.lang.String r29 = X.C19620yd.A09     // Catch:{ all -> 0x2a28 }
            r3 = r2
            r2 = r29
            android.content.SharedPreferences r3 = r3.A05(r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r31 = "perform_sync_manager_version"
            r2 = r31
            int r3 = X.C17890vO.A00(r3, r2)     // Catch:{ all -> 0x2a28 }
            r12 = 3
            if (r3 >= r12) goto L_0x2258
            if (r16 != 0) goto L_0x20ae
            java.lang.String r0 = "androidcontactssync/skipping onVersionUpgrade"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x2a28 }
            goto L_0x21c1
        L_0x20ae:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x2a28 }
            X.11C r2 = r7.A02     // Catch:{ all -> 0x2a28 }
            X.11B r11 = r2.A0O()     // Catch:{ all -> 0x2a28 }
            boolean r2 = r39.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2265
            java.util.HashMap r10 = X.C17880vN.A11()     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r5 = r39.iterator()     // Catch:{ all -> 0x2a28 }
        L_0x20c6:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x20d8
            X.1E7 r4 = X.C17880vN.A0O(r5)     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.Jid r2 = X.AnonymousClass1E7.A01(r4)     // Catch:{ all -> 0x2a28 }
            r10.put(r2, r4)     // Catch:{ all -> 0x2a28 }
            goto L_0x20c6
        L_0x20d8:
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r5 = r2.buildUpon()     // Catch:{ all -> 0x2a28 }
            java.lang.String r4 = "account_name"
            r2 = r16
            java.lang.String r2 = r2.name     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r4, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r4 = "account_type"
            r2 = r16
            java.lang.String r2 = r2.type     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r2 = r5.appendQueryParameter(r4, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r5 = "caller_is_syncadapter"
            java.lang.String r4 = "true"
            android.net.Uri r41 = X.C17890vO.A0C(r2, r5, r4)     // Catch:{ all -> 0x2a28 }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x2a28 }
            android.net.Uri r26 = X.C17890vO.A0C(r2, r5, r4)     // Catch:{ all -> 0x2a28 }
            r2 = 100
            java.lang.String r9 = "androidcontactssync/onVersionUpgrade/error"
            java.lang.String r6 = "sync1"
            java.lang.String r5 = "_id"
            r4 = 2
            if (r3 == 0) goto L_0x2121
            if (r3 == r0) goto L_0x2121
            if (r3 == r4) goto L_0x21c7
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2a28 }
            java.lang.String r0 = "unexpected old version during AndroidContactsSyncHelper upgrade, version="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r2, r3)     // Catch:{ all -> 0x2a28 }
            throw r0     // Catch:{ all -> 0x2a28 }
        L_0x2121:
            java.lang.String[] r42 = X.C17880vN.A1b(r5, r6, r12, r0)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "deleted"
            r42[r4] = r3     // Catch:{ all -> 0x2a28 }
            r44 = r37
            r45 = r37
            r40 = r11
            r43 = r37
            android.database.Cursor r4 = r40.A03(r41, r42, r43, r44, r45)     // Catch:{ all -> 0x2a28 }
            if (r4 == 0) goto L_0x21b5
            int r25 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x2252 }
            int r24 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x2252 }
            int r23 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x2252 }
        L_0x2143:
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x2252 }
            if (r3 == 0) goto L_0x21b2
            int r3 = r13.size()     // Catch:{ all -> 0x2252 }
            if (r3 < r2) goto L_0x2157
            boolean r2 = X.C26271Rm.A04(r11, r9, r13)     // Catch:{ all -> 0x2252 }
            if (r2 != 0) goto L_0x2157
            goto L_0x223d
        L_0x2157:
            r2 = r25
            long r19 = r4.getLong(r2)     // Catch:{ all -> 0x2252 }
            r2 = r24
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x2252 }
            com.whatsapp.jid.UserJid r14 = X.C22941Dw.A02(r2)     // Catch:{ all -> 0x2252 }
            r2 = r23
            boolean r2 = r4.isNull(r2)     // Catch:{ all -> 0x2252 }
            if (r2 == 0) goto L_0x2170
            goto L_0x2177
        L_0x2170:
            r2 = r23
            int r3 = r4.getInt(r2)     // Catch:{ all -> 0x2252 }
            goto L_0x2178
        L_0x2177:
            r3 = 0
        L_0x2178:
            if (r14 == 0) goto L_0x21af
            boolean r2 = r10.containsKey(r14)     // Catch:{ all -> 0x2252 }
            if (r2 == 0) goto L_0x21af
            if (r3 != 0) goto L_0x21af
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r41)     // Catch:{ all -> 0x2252 }
            android.content.ContentProviderOperation$Builder r18 = r2.withYieldAllowed(r0)     // Catch:{ all -> 0x2252 }
            java.lang.String r17 = "_id = ?"
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x2252 }
            r2 = r19
            X.C17890vO.A1J(r15, r2)     // Catch:{ all -> 0x2252 }
            r3 = r18
            r2 = r17
            android.content.ContentProviderOperation$Builder r3 = r3.withSelection(r2, r15)     // Catch:{ all -> 0x2252 }
            java.lang.String r2 = "sync2"
            java.lang.Object r14 = r10.get(r14)     // Catch:{ all -> 0x2252 }
            X.1E7 r14 = (X.AnonymousClass1E7) r14     // Catch:{ all -> 0x2252 }
            long r14 = r14.A0J()     // Catch:{ all -> 0x2252 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x2252 }
            A06(r3, r14, r2, r13)     // Catch:{ all -> 0x2252 }
        L_0x21af:
            r2 = 100
            goto L_0x2143
        L_0x21b2:
            r4.close()     // Catch:{ all -> 0x2a28 }
        L_0x21b5:
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r3 != 0) goto L_0x21c7
            boolean r3 = X.C26271Rm.A04(r11, r9, r13)     // Catch:{ all -> 0x2a28 }
            if (r3 != 0) goto L_0x21c7
        L_0x21c1:
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x2a28 }
            goto L_0x2a08
        L_0x21c7:
            r10 = 0
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x2a28 }
            r4[r10] = r5     // Catch:{ all -> 0x2a28 }
            r4[r0] = r6     // Catch:{ all -> 0x2a28 }
            r44 = r37
            r45 = r37
            r40 = r11
            r42 = r4
            r43 = r37
            android.database.Cursor r4 = r40.A03(r41, r42, r43, r44, r45)     // Catch:{ all -> 0x2a28 }
            if (r4 == 0) goto L_0x2244
            int r18 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x2252 }
            int r17 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x2252 }
        L_0x21e7:
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x2252 }
            if (r5 == 0) goto L_0x2241
            int r5 = r13.size()     // Catch:{ all -> 0x2252 }
            if (r5 < r2) goto L_0x21fa
            boolean r5 = X.C26271Rm.A04(r11, r9, r13)     // Catch:{ all -> 0x2252 }
            if (r5 != 0) goto L_0x21fa
            goto L_0x223d
        L_0x21fa:
            r5 = r18
            long r5 = r4.getLong(r5)     // Catch:{ all -> 0x2252 }
            r10 = r17
            java.lang.String r10 = r4.getString(r10)     // Catch:{ all -> 0x2252 }
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A02(r10)     // Catch:{ all -> 0x2252 }
            if (r10 == 0) goto L_0x21e7
            android.content.ContentProviderOperation$Builder r10 = android.content.ContentProviderOperation.newDelete(r26)     // Catch:{ all -> 0x2252 }
            android.content.ContentProviderOperation$Builder r15 = r10.withYieldAllowed(r0)     // Catch:{ all -> 0x2252 }
            java.lang.String r14 = "raw_contact_id = ? AND mimetype in (?,?,?,?,?)"
            r10 = 5
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x2252 }
            X.C17890vO.A1J(r10, r5)     // Catch:{ all -> 0x2252 }
            java.lang.String r5 = "vnd.android.cursor.item/name"
            r10[r0] = r5     // Catch:{ all -> 0x2252 }
            java.lang.String r5 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r10[r3] = r5     // Catch:{ all -> 0x2252 }
            java.lang.String r5 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r10[r12] = r5     // Catch:{ all -> 0x2252 }
            java.lang.String r6 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r5 = 4
            r10[r5] = r6     // Catch:{ all -> 0x2252 }
            android.content.ContentProviderOperation$Builder r5 = r15.withSelection(r14, r10)     // Catch:{ all -> 0x2252 }
            android.content.ContentProviderOperation r5 = r5.build()     // Catch:{ all -> 0x2252 }
            r13.add(r5)     // Catch:{ all -> 0x2252 }
            goto L_0x21e7
        L_0x223d:
            r4.close()     // Catch:{ all -> 0x2a28 }
            goto L_0x21c1
        L_0x2241:
            r4.close()     // Catch:{ all -> 0x2a28 }
        L_0x2244:
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2265
            boolean r2 = X.C26271Rm.A04(r11, r9, r13)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2265
            goto L_0x21c1
        L_0x2252:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x238d }
            goto L_0x2391
        L_0x2258:
            if (r16 != 0) goto L_0x2265
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to null account"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x2a28 }
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x2a28 }
            goto L_0x2a08
        L_0x2265:
            X.00H r2 = r7.A07     // Catch:{ all -> 0x2a28 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a28 }
            X.1dX r2 = (X.C30191dX) r2     // Catch:{ all -> 0x2a28 }
            boolean r2 = r2.A00()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2279
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x2a28 }
            goto L_0x2a08
        L_0x2279:
            boolean r2 = r39.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2285
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x2a28 }
            goto L_0x2a08
        L_0x2285:
            java.util.HashMap r9 = X.C17880vN.A11()     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r4 = r39.iterator()     // Catch:{ all -> 0x2a28 }
        L_0x228d:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x22a1
            X.1E7 r3 = X.C17880vN.A0O(r4)     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.Jid r2 = X.AnonymousClass1E7.A01(r3)     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x2a28 }
            r9.put(r2, r3)     // Catch:{ all -> 0x2a28 }
            goto L_0x228d
        L_0x22a1:
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r3 = r2.buildUpon()     // Catch:{ all -> 0x2a28 }
            java.lang.String r27 = "account_name"
            r2 = r16
            java.lang.String r2 = r2.name     // Catch:{ all -> 0x2a28 }
            r4 = r27
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r26 = "account_type"
            r2 = r16
            java.lang.String r2 = r2.type     // Catch:{ all -> 0x2a28 }
            r4 = r26
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r25 = "caller_is_syncadapter"
            java.lang.String r24 = "true"
            r4 = r25
            r2 = r24
            android.net.Uri r32 = X.C17890vO.A0C(r3, r4, r2)     // Catch:{ all -> 0x2a28 }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r3 = r2.buildUpon()     // Catch:{ all -> 0x2a28 }
            r2 = r24
            android.net.Uri r34 = X.C17890vO.A0C(r3, r4, r2)     // Catch:{ all -> 0x2a28 }
            java.util.HashSet r23 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            java.util.HashMap r38 = X.C17880vN.A11()     // Catch:{ all -> 0x2a28 }
            r39.size()     // Catch:{ all -> 0x2a28 }
            X.11C r2 = r7.A02     // Catch:{ all -> 0x2a28 }
            r51 = r2
            X.11B r33 = r51.A0O()     // Catch:{ all -> 0x2a28 }
            r2 = 4
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x2a28 }
            java.lang.String r4 = "_id"
            r6 = 0
            r5[r6] = r4     // Catch:{ all -> 0x2a28 }
            java.lang.String r17 = "sync1"
            r5[r0] = r17     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "deleted"
            r2 = 2
            r5[r2] = r3     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = "display_name"
            r5[r12] = r2     // Catch:{ all -> 0x2a28 }
            r14 = r37
            r15 = r14
            r10 = r33
            r11 = r32
            r12 = r5
            r13 = r14
            android.database.Cursor r15 = r10.A03(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x2a28 }
            if (r15 == 0) goto L_0x2395
            int r18 = r15.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x2383 }
            r4 = r17
            int r14 = r15.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x2383 }
            int r13 = r15.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x2383 }
            int r12 = r15.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x2383 }
        L_0x2322:
            boolean r2 = r15.moveToNext()     // Catch:{ all -> 0x2383 }
            if (r2 == 0) goto L_0x2392
            r2 = r18
            long r2 = r15.getLong(r2)     // Catch:{ all -> 0x2383 }
            java.lang.String r4 = r15.getString(r14)     // Catch:{ all -> 0x2383 }
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A02(r4)     // Catch:{ all -> 0x2383 }
            boolean r4 = r15.isNull(r13)     // Catch:{ all -> 0x2383 }
            if (r4 == 0) goto L_0x233e
            r11 = 0
            goto L_0x2342
        L_0x233e:
            int r11 = r15.getInt(r13)     // Catch:{ all -> 0x2383 }
        L_0x2342:
            java.lang.String r5 = r15.getString(r12)     // Catch:{ all -> 0x2383 }
            X.2j3 r4 = new X.2j3     // Catch:{ all -> 0x2383 }
            r4.<init>(r10, r5, r2)     // Catch:{ all -> 0x2383 }
            if (r11 == 0) goto L_0x236e
            java.lang.String r11 = "raw_contact_id=?"
            java.lang.String[] r10 = X.C17880vN.A1Y()     // Catch:{ Exception -> 0x235e }
            X.C17880vN.A1V(r10, r6, r2)     // Catch:{ Exception -> 0x235e }
            r5 = r34
            r4 = r33
            r4.A01(r5, r11, r10)     // Catch:{ Exception -> 0x235e }
            goto L_0x2364
        L_0x235e:
            r5 = move-exception
            java.lang.String r4 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r4, r5)     // Catch:{ all -> 0x2383 }
        L_0x2364:
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x2383 }
            r2 = r23
            r2.add(r3)     // Catch:{ all -> 0x2383 }
            goto L_0x2322
        L_0x236e:
            r2 = r38
            java.lang.Object r3 = r2.get(r10)     // Catch:{ all -> 0x2383 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x2383 }
            if (r3 != 0) goto L_0x237f
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x2383 }
            r2.put(r10, r3)     // Catch:{ all -> 0x2383 }
        L_0x237f:
            r3.add(r4)     // Catch:{ all -> 0x2383 }
            goto L_0x2322
        L_0x2383:
            r2 = move-exception
            r15.close()     // Catch:{ all -> 0x2388 }
            goto L_0x2391
        L_0x2388:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x2a28 }
            goto L_0x2391
        L_0x238d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x2a28 }
        L_0x2391:
            throw r2     // Catch:{ all -> 0x2a28 }
        L_0x2392:
            r15.close()     // Catch:{ all -> 0x2a28 }
        L_0x2395:
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r19 = X.C17890vO.A0i(r38)     // Catch:{ all -> 0x2a28 }
        L_0x239d:
            boolean r2 = r19.hasNext()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2400
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r19)     // Catch:{ all -> 0x2a28 }
            java.lang.Object r12 = r3.getKey()     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ all -> 0x2a28 }
            java.lang.Object r2 = r9.get(r12)     // Catch:{ all -> 0x2a28 }
            X.1E7 r2 = (X.AnonymousClass1E7) r2     // Catch:{ all -> 0x2a28 }
            boolean r18 = X.C26271Rm.A03(r2)     // Catch:{ all -> 0x2a28 }
            java.lang.Object r11 = r3.getValue()     // Catch:{ all -> 0x2a28 }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x2a28 }
            int r2 = r11.size()     // Catch:{ all -> 0x2a28 }
            int r10 = r2 + -1
            if (r18 == 0) goto L_0x23c7
            int r10 = r2 + -2
        L_0x23c7:
            r5 = 0
        L_0x23c8:
            if (r5 > r10) goto L_0x23fa
            java.lang.Object r15 = r11.get(r5)     // Catch:{ all -> 0x2a28 }
            X.2j3 r15 = (X.C57422j3) r15     // Catch:{ all -> 0x2a28 }
            long r2 = r15.A00     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x2a28 }
            r2 = r23
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x23f7
            java.lang.String r14 = "_id = ?"
            java.lang.String[] r4 = X.C17880vN.A1Y()     // Catch:{ Exception -> 0x23f1 }
            long r2 = r15.A00     // Catch:{ Exception -> 0x23f1 }
            X.C17880vN.A1V(r4, r6, r2)     // Catch:{ Exception -> 0x23f1 }
            r3 = r33
            r2 = r32
            r3.A01(r2, r14, r4)     // Catch:{ Exception -> 0x23f1 }
            goto L_0x23f7
        L_0x23f1:
            r3 = move-exception
            java.lang.String r2 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ all -> 0x2a28 }
        L_0x23f7:
            int r5 = r5 + 1
            goto L_0x23c8
        L_0x23fa:
            if (r18 != 0) goto L_0x239d
            r13.add(r12)     // Catch:{ all -> 0x2a28 }
            goto L_0x239d
        L_0x2400:
            java.util.Set r2 = r38.keySet()     // Catch:{ all -> 0x2a28 }
            r2.removeAll(r13)     // Catch:{ all -> 0x2a28 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x2a28 }
            java.util.ArrayList r20 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x2a28 }
            java.util.HashSet r44 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            java.util.HashSet r43 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            java.util.HashSet r42 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            java.util.HashSet r41 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            java.util.HashSet r40 = X.C17880vN.A12()     // Catch:{ all -> 0x2a28 }
            X.00H r2 = r7.A08     // Catch:{ all -> 0x2a28 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2a28 }
            X.2hp r2 = (X.C56662hp) r2     // Catch:{ all -> 0x2a28 }
            java.util.HashMap r45 = r2.A00()     // Catch:{ all -> 0x2a28 }
            java.lang.String r4 = "data3"
            java.lang.String r18 = "data2"
            java.lang.String r19 = "raw_contact_id"
            java.util.HashMap r48 = X.C17880vN.A11()     // Catch:{ all -> 0x2a28 }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r3 = r2.buildUpon()     // Catch:{ all -> 0x2a28 }
            r9 = 2131898700(0x7f12314c, float:1.9432325E38)
            r2 = r54
            java.lang.String r9 = r2.getString(r9)     // Catch:{ all -> 0x2a28 }
            r2 = r27
            android.net.Uri$Builder r9 = r3.appendQueryParameter(r2, r9)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "com.whatsapp"
            r2 = r26
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r2, r3)     // Catch:{ all -> 0x2a28 }
            r3 = r25
            r2 = r24
            android.net.Uri r11 = X.C17890vO.A0C(r9, r3, r2)     // Catch:{ all -> 0x2a28 }
            X.11B r10 = r51.A0O()     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            r2 = 3
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            r3[r6] = r19     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            r3[r0] = r18     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            r2 = 2
            r3[r2] = r4     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            java.lang.String r13 = "mimetype = ?"
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            java.lang.String r9 = "vnd.android.cursor.item/phone_v2"
            r2[r6] = r9     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            r12 = r3
            r14 = r2
            r15 = r37
            android.database.Cursor r13 = r10.A03(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            if (r13 != 0) goto L_0x2485
            java.lang.String r2 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x24b9 }
            goto L_0x24e3
        L_0x2485:
            r2 = r19
            int r12 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x24b9 }
            r2 = r18
            int r11 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x24b9 }
            int r10 = r13.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x24b9 }
        L_0x2495:
            boolean r2 = r13.moveToNext()     // Catch:{ all -> 0x24b9 }
            if (r2 == 0) goto L_0x24b5
            java.lang.Long r9 = X.C17890vO.A0M(r13, r12)     // Catch:{ all -> 0x24b9 }
            int r2 = r13.getInt(r11)     // Catch:{ all -> 0x24b9 }
            java.lang.String r3 = r13.getString(r10)     // Catch:{ all -> 0x24b9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x24b9 }
            android.util.Pair r3 = android.util.Pair.create(r2, r3)     // Catch:{ all -> 0x24b9 }
            r2 = r48
            r2.put(r9, r3)     // Catch:{ all -> 0x24b9 }
            goto L_0x2495
        L_0x24b5:
            r13.close()     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
            goto L_0x24e0
        L_0x24b9:
            r2 = move-exception
            if (r13 == 0) goto L_0x24c4
            r13.close()     // Catch:{ all -> 0x24c0 }
            goto L_0x24c4
        L_0x24c0:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
        L_0x24c4:
            throw r2     // Catch:{ Exception -> 0x24da, OutOfMemoryError -> 0x24c5 }
        L_0x24c5:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x2a28 }
            java.lang.String r0 = "androidcontactssync/hasCustomLabel/too-many-rows/size/"
            r2.append(r0)     // Catch:{ all -> 0x2a28 }
            int r0 = r48.size()     // Catch:{ all -> 0x2a28 }
            r2.append(r0)     // Catch:{ all -> 0x2a28 }
            X.C17890vO.A0w(r2)     // Catch:{ all -> 0x2a28 }
            throw r3     // Catch:{ all -> 0x2a28 }
        L_0x24da:
            r3 = move-exception
            java.lang.String r2 = "androidcontactssync/hasCustomLabel/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x2a28 }
        L_0x24e0:
            r48.size()     // Catch:{ all -> 0x2a28 }
        L_0x24e3:
            r3 = 2131898572(0x7f1230cc, float:1.9432066E38)
            r2 = r54
            java.lang.String r47 = r2.getString(r3)     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r46 = r39.iterator()     // Catch:{ all -> 0x2a28 }
        L_0x24f0:
            boolean r2 = r46.hasNext()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x27db
            X.1E7 r9 = X.C17880vN.A0O(r46)     // Catch:{ all -> 0x2a28 }
            int r3 = r5.size()     // Catch:{ all -> 0x2a28 }
            r2 = 100
            if (r3 < r2) goto L_0x2509
            java.lang.String r3 = "error adding/updating contact data MIMETYPE labels"
            r2 = r33
            X.C26271Rm.A04(r2, r3, r5)     // Catch:{ all -> 0x2a28 }
        L_0x2509:
            com.whatsapp.jid.Jid r12 = X.AnonymousClass1E7.A01(r9)     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ all -> 0x2a28 }
            X.C17960vV.A07(r12)     // Catch:{ all -> 0x2a28 }
            boolean r2 = X.C26271Rm.A03(r9)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2526
            r2 = r38
            boolean r2 = r2.containsKey(r12)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2563
            r2 = r20
            r2.add(r9)     // Catch:{ all -> 0x2a28 }
            goto L_0x24f0
        L_0x2526:
            r2 = r38
            boolean r2 = r2.containsKey(r12)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2563
            r2 = r38
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x2a28 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r12 = r2.iterator()     // Catch:{ all -> 0x2a28 }
        L_0x253a:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x24f0
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x2a28 }
            X.2j3 r2 = (X.C57422j3) r2     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newDelete(r32)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r11 = r3.withYieldAllowed(r0)     // Catch:{ all -> 0x2a28 }
            java.lang.String r10 = "_id=?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x2a28 }
            long r2 = r2.A00     // Catch:{ all -> 0x2a28 }
            X.C17880vN.A1V(r9, r6, r2)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r2 = r11.withSelection(r10, r9)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation r2 = r2.build()     // Catch:{ all -> 0x2a28 }
            r5.add(r2)     // Catch:{ all -> 0x2a28 }
            goto L_0x253a
        L_0x2563:
            r2 = r38
            boolean r2 = r2.containsKey(r12)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x24f0
            r2 = r38
            java.lang.Object r3 = r2.get(r12)     // Catch:{ all -> 0x2a28 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x2a28 }
            int r2 = r3.size()     // Catch:{ all -> 0x2a28 }
            int r2 = r2 - r0
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x2a28 }
            X.2j3 r2 = (X.C57422j3) r2     // Catch:{ all -> 0x2a28 }
            long r2 = r2.A00     // Catch:{ all -> 0x2a28 }
            r49 = r2
            java.lang.Long r11 = java.lang.Long.valueOf(r49)     // Catch:{ all -> 0x2a28 }
            r2 = r45
            java.lang.Object r10 = r2.get(r11)     // Catch:{ all -> 0x2a28 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x2a28 }
            if (r10 == 0) goto L_0x26a6
            java.lang.String r13 = "vnd.android.cursor.item/name"
            java.lang.Byte r2 = java.lang.Byte.valueOf(r6)     // Catch:{ all -> 0x2a28 }
            boolean r2 = r10.contains(r2)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x26be
            r2 = r44
            boolean r2 = r2.contains(r11)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x25b9
            r2 = r34
            android.content.ContentProviderOperation$Builder r13 = A02(r2, r11, r13)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "data1"
            java.lang.String r2 = r9.A0K()     // Catch:{ all -> 0x2a28 }
            A06(r13, r2, r3, r5)     // Catch:{ all -> 0x2a28 }
            r2 = r44
            r2.add(r11)     // Catch:{ all -> 0x2a28 }
        L_0x25b9:
            X.0vb r13 = r7.A04     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = r12.user     // Catch:{ all -> 0x2a28 }
            X.1yi r2 = X.C42771yi.A00()     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = X.AnonymousClass17K.A01(r2, r3)     // Catch:{ all -> 0x2a28 }
            java.lang.String r14 = r13.A0G(r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r2 = 2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x2a28 }
            boolean r2 = r10.contains(r2)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x25fc
            r2 = r43
            boolean r2 = r2.contains(r11)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x25fc
            r2 = r34
            android.content.ContentProviderOperation$Builder r3 = A02(r2, r11, r3)     // Catch:{ all -> 0x2a28 }
            r2 = r47
            android.content.ContentProviderOperation$Builder r13 = A01(r3, r12, r2)     // Catch:{ all -> 0x2a28 }
            r3 = 2131886401(0x7f120141, float:1.940738E38)
            r2 = r54
            java.lang.String r2 = X.C17890vO.A0R(r2, r14, r0, r6, r3)     // Catch:{ all -> 0x2a28 }
            A06(r13, r2, r4, r5)     // Catch:{ all -> 0x2a28 }
            r2 = r43
            r2.add(r11)     // Catch:{ all -> 0x2a28 }
        L_0x25fc:
            java.lang.String r39 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r2 = 3
            java.lang.Byte r13 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x2a28 }
            boolean r2 = r10.contains(r13)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2637
            r2 = r42
            boolean r2 = r2.contains(r11)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2637
            boolean r2 = X.C26271Rm.A02(r7, r9)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2637
            r3 = r34
            r2 = r39
            android.content.ContentProviderOperation$Builder r3 = A02(r3, r11, r2)     // Catch:{ all -> 0x2a28 }
            r2 = r47
            android.content.ContentProviderOperation$Builder r15 = A01(r3, r12, r2)     // Catch:{ all -> 0x2a28 }
            r3 = 2131886403(0x7f120143, float:1.9407384E38)
            r2 = r54
            java.lang.String r2 = X.C17890vO.A0R(r2, r14, r0, r6, r3)     // Catch:{ all -> 0x2a28 }
            A06(r15, r2, r4, r5)     // Catch:{ all -> 0x2a28 }
            r2 = r42
            r2.add(r11)     // Catch:{ all -> 0x2a28 }
        L_0x2637:
            java.lang.String r37 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r2 = 4
            java.lang.Byte r3 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x2a28 }
            boolean r2 = r10.contains(r3)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2672
            r2 = r41
            boolean r2 = r2.contains(r11)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2672
            boolean r2 = X.C26271Rm.A02(r7, r9)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2672
            r15 = r34
            r2 = r37
            android.content.ContentProviderOperation$Builder r2 = A02(r15, r11, r2)     // Catch:{ all -> 0x2a28 }
            r15 = r47
            android.content.ContentProviderOperation$Builder r15 = A01(r2, r12, r15)     // Catch:{ all -> 0x2a28 }
            r12 = 2131886402(0x7f120142, float:1.9407382E38)
            r2 = r54
            java.lang.String r12 = X.C17890vO.A0R(r2, r14, r0, r6, r12)     // Catch:{ all -> 0x2a28 }
            A06(r15, r12, r4, r5)     // Catch:{ all -> 0x2a28 }
            r2 = r41
            r2.add(r11)     // Catch:{ all -> 0x2a28 }
        L_0x2672:
            boolean r2 = X.C26271Rm.A02(r7, r9)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x26a6
            boolean r2 = r10.contains(r13)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2684
            boolean r2 = r10.contains(r3)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x26a6
        L_0x2684:
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newDelete(r34)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r14 = r2.withYieldAllowed(r0)     // Catch:{ all -> 0x2a28 }
            java.lang.String r13 = "raw_contact_id = ? AND mimetype in (?,?)"
            r2 = 3
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x2a28 }
            r2 = r49
            X.C17880vN.A1V(r12, r6, r2)     // Catch:{ all -> 0x2a28 }
            r12[r0] = r39     // Catch:{ all -> 0x2a28 }
            r2 = 2
            r12[r2] = r37     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r2 = r14.withSelection(r13, r12)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation r2 = r2.build()     // Catch:{ all -> 0x2a28 }
            r5.add(r2)     // Catch:{ all -> 0x2a28 }
        L_0x26a6:
            X.2lf r2 = r9.A0H     // Catch:{ all -> 0x2a28 }
            r12 = 0
            if (r2 == 0) goto L_0x26bc
            java.lang.String r3 = r2.A01     // Catch:{ all -> 0x2a28 }
        L_0x26ad:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x24f0
            r2 = r48
            boolean r2 = r2.containsKey(r11)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x24f0
            goto L_0x26f0
        L_0x26bc:
            r3 = r12
            goto L_0x26ad
        L_0x26be:
            X.2lf r2 = r9.A0H     // Catch:{ all -> 0x2a28 }
            long r2 = r2.A00     // Catch:{ all -> 0x2a28 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x2a28 }
            r2 = r21
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x25b9
            android.content.ContentProviderOperation$Builder r37 = android.content.ContentProviderOperation.newUpdate(r34)     // Catch:{ all -> 0x2a28 }
            java.lang.String r15 = "raw_contact_id=? AND mimetype=?"
            java.lang.String[] r14 = X.C17880vN.A1Z()     // Catch:{ all -> 0x2a28 }
            r2 = r49
            X.C17880vN.A1V(r14, r6, r2)     // Catch:{ all -> 0x2a28 }
            r14[r0] = r13     // Catch:{ all -> 0x2a28 }
            r2 = r37
            android.content.ContentProviderOperation$Builder r13 = r2.withSelection(r15, r14)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "data1"
            java.lang.String r2 = r9.A0K()     // Catch:{ all -> 0x2a28 }
            A06(r13, r2, r3, r5)     // Catch:{ all -> 0x2a28 }
            goto L_0x25b9
        L_0x26f0:
            if (r10 == 0) goto L_0x26fd
            java.lang.Byte r2 = java.lang.Byte.valueOf(r6)     // Catch:{ all -> 0x2a28 }
            boolean r2 = r10.contains(r2)     // Catch:{ all -> 0x2a28 }
            r15 = 1
            if (r2 != 0) goto L_0x26fe
        L_0x26fd:
            r15 = 0
        L_0x26fe:
            r2 = r48
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x2a28 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x2a28 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x2a28 }
            int r10 = r2.intValue()     // Catch:{ all -> 0x2a28 }
            r2 = r48
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x2a28 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x2a28 }
            java.lang.Object r13 = r2.second     // Catch:{ all -> 0x2a28 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r2 = r9.A0N     // Catch:{ all -> 0x2a28 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x272c
            java.lang.String r2 = r9.A0X     // Catch:{ all -> 0x2a28 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2737
            java.lang.String r12 = r9.A0X     // Catch:{ all -> 0x2a28 }
        L_0x272c:
            java.lang.Integer r2 = r9.A0N     // Catch:{ all -> 0x2a28 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x2a28 }
            boolean r14 = X.AnonymousClass000.A1T(r2, r10)
            goto L_0x2741
        L_0x2737:
            r12 = 2131898700(0x7f12314c, float:1.9432325E38)
            r2 = r54
            java.lang.String r12 = r2.getString(r12)     // Catch:{ all -> 0x2a28 }
            goto L_0x272c
        L_0x2741:
            if (r12 == 0) goto L_0x2749
            boolean r10 = r12.equals(r13)     // Catch:{ all -> 0x2a28 }
            if (r10 != 0) goto L_0x2755
        L_0x2749:
            if (r13 == 0) goto L_0x2751
            boolean r10 = r13.equals(r12)     // Catch:{ all -> 0x2a28 }
            if (r10 != 0) goto L_0x2755
        L_0x2751:
            if (r12 != 0) goto L_0x275f
            if (r13 != 0) goto L_0x275f
        L_0x2755:
            r10 = 1
        L_0x2756:
            if (r14 == 0) goto L_0x275c
            if (r2 != 0) goto L_0x24f0
            if (r10 != 0) goto L_0x24f0
        L_0x275c:
            if (r15 != 0) goto L_0x27a7
            goto L_0x2761
        L_0x275f:
            r10 = 0
            goto L_0x2756
        L_0x2761:
            r2 = r40
            boolean r2 = r2.contains(r11)     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x24f0
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newInsert(r34)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r10 = r2.withYieldAllowed(r0)     // Catch:{ all -> 0x2a28 }
            r2 = r19
            android.content.ContentProviderOperation$Builder r13 = r10.withValue(r2, r11)     // Catch:{ all -> 0x2a28 }
            java.lang.String r10 = "mimetype"
            java.lang.String r2 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r10 = r13.withValue(r10, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = "data1"
            android.content.ContentProviderOperation$Builder r10 = r10.withValue(r2, r3)     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r3 = r9.A0N     // Catch:{ all -> 0x2a28 }
            r2 = r18
            android.content.ContentProviderOperation$Builder r3 = r10.withValue(r2, r3)     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r2 = r9.A0N     // Catch:{ all -> 0x2a28 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x2799
            r3.withValue(r4, r12)     // Catch:{ all -> 0x2a28 }
        L_0x2799:
            android.content.ContentProviderOperation r2 = r3.build()     // Catch:{ all -> 0x2a28 }
            r5.add(r2)     // Catch:{ all -> 0x2a28 }
            r2 = r40
            r2.add(r11)     // Catch:{ all -> 0x2a28 }
            goto L_0x24f0
        L_0x27a7:
            android.content.ContentProviderOperation$Builder r10 = android.content.ContentProviderOperation.newUpdate(r34)     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r3 = r9.A0N     // Catch:{ all -> 0x2a28 }
            r2 = r18
            android.content.ContentProviderOperation$Builder r13 = r10.withValue(r2, r3)     // Catch:{ all -> 0x2a28 }
            java.lang.String r11 = "raw_contact_id=? AND mimetype=?"
            java.lang.String[] r10 = X.C17880vN.A1Z()     // Catch:{ all -> 0x2a28 }
            r2 = r49
            X.C17880vN.A1V(r10, r6, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = "vnd.android.cursor.item/phone_v2"
            r10[r0] = r2     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r3 = r13.withSelection(r11, r10)     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r2 = r9.A0N     // Catch:{ all -> 0x2a28 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x27d2
            r3.withValue(r4, r12)     // Catch:{ all -> 0x2a28 }
        L_0x27d2:
            android.content.ContentProviderOperation r2 = r3.build()     // Catch:{ all -> 0x2a28 }
            r5.add(r2)     // Catch:{ all -> 0x2a28 }
            goto L_0x24f0
        L_0x27db:
            boolean r2 = r5.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r2 != 0) goto L_0x27e8
            java.lang.String r3 = "error adding/updating contact data MIMETYPE labels"
            r2 = r33
            X.C26271Rm.A04(r2, r3, r5)     // Catch:{ all -> 0x2a28 }
        L_0x27e8:
            X.0z4 r10 = r7.A03     // Catch:{ all -> 0x2a28 }
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r10)     // Catch:{ all -> 0x2a28 }
            java.lang.String r9 = "current_data_action_string_version"
            int r2 = r2.getInt(r9, r6)     // Catch:{ all -> 0x2a28 }
            r5 = 4
            if (r2 == r5) goto L_0x2801
            r3 = r16
            r2 = r54
            X.C26271Rm.A01(r3, r2, r7)     // Catch:{ all -> 0x2a28 }
            X.C17900vP.A0M(r10, r9, r5)     // Catch:{ all -> 0x2a28 }
        L_0x2801:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x2a28 }
            java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x2a28 }
            X.11B r42 = r51.A0O()     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r41 = r20.iterator()     // Catch:{ all -> 0x2a28 }
        L_0x2811:
            boolean r2 = r41.hasNext()     // Catch:{ all -> 0x2a28 }
            java.lang.String r5 = "error while writing to android contacts provider"
            if (r2 == 0) goto L_0x2990
            X.1E7 r3 = X.C17880vN.A0O(r41)     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.Jid r12 = X.AnonymousClass1E7.A01(r3)     // Catch:{ all -> 0x2a28 }
            X.C17960vV.A07(r12)     // Catch:{ all -> 0x2a28 }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ all -> 0x2a28 }
            int r9 = r13.size()     // Catch:{ all -> 0x2a28 }
            r2 = 100
            if (r9 < r2) goto L_0x2833
            r2 = r42
            X.C26271Rm.A04(r2, r5, r13)     // Catch:{ all -> 0x2a28 }
        L_0x2833:
            java.lang.String r2 = r12.user     // Catch:{ all -> 0x2a28 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x283f
            r14.add(r3)     // Catch:{ all -> 0x2a28 }
            goto L_0x2811
        L_0x283f:
            X.2lf r2 = r3.A0H     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2943
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x2a28 }
            r40 = r2
        L_0x2847:
            java.lang.String r21 = r3.A0K()     // Catch:{ all -> 0x2a28 }
            long r32 = r3.A0J()     // Catch:{ all -> 0x2a28 }
            java.lang.Integer r2 = r3.A0N     // Catch:{ all -> 0x2a28 }
            r39 = r2
            java.lang.String r2 = r3.A0X     // Catch:{ all -> 0x2a28 }
            r38 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r5 = r2.buildUpon()     // Catch:{ all -> 0x2a28 }
            r3 = r25
            r2 = r24
            android.net.Uri r37 = X.C17890vO.A0C(r5, r3, r2)     // Catch:{ all -> 0x2a28 }
            int r11 = r13.size()     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = r12.user     // Catch:{ all -> 0x2a28 }
            X.1yi r2 = X.C42771yi.A00()     // Catch:{ all -> 0x2a28 }
            java.lang.String r10 = X.AnonymousClass17K.A01(r2, r3)     // Catch:{ all -> 0x2a28 }
            r3 = 2131898572(0x7f1230cc, float:1.9432066E38)
            r2 = r54
            java.lang.String r9 = r2.getString(r3)     // Catch:{ all -> 0x2a28 }
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r5 = android.content.ContentProviderOperation.newInsert(r2)     // Catch:{ all -> 0x2a28 }
            r2 = r16
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x2a28 }
            r2 = r27
            android.content.ContentProviderOperation$Builder r5 = r5.withValue(r2, r3)     // Catch:{ all -> 0x2a28 }
            r2 = r16
            java.lang.String r3 = r2.type     // Catch:{ all -> 0x2a28 }
            r2 = r26
            android.content.ContentProviderOperation$Builder r5 = r5.withValue(r2, r3)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = r12.getRawString()     // Catch:{ all -> 0x2a28 }
            r2 = r17
            android.content.ContentProviderOperation$Builder r5 = r5.withValue(r2, r3)     // Catch:{ all -> 0x2a28 }
            java.lang.String r3 = "sync2"
            java.lang.Long r2 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r2 = r5.withValue(r3, r2)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r2 = r2.withYieldAllowed(r0)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation r2 = r2.build()     // Catch:{ all -> 0x2a28 }
            r13.add(r2)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r37)     // Catch:{ all -> 0x2a28 }
            r2 = r19
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r2, r11)     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = "vnd.android.cursor.item/name"
            java.lang.String r5 = "mimetype"
            android.content.ContentProviderOperation$Builder r2 = r3.withValue(r5, r2)     // Catch:{ all -> 0x2a28 }
            java.lang.String r34 = "data1"
            r15 = r34
            r3 = r21
            A06(r2, r3, r15, r13)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r37)     // Catch:{ all -> 0x2a28 }
            r2 = r19
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r2, r11)     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            android.content.ContentProviderOperation$Builder r2 = r3.withValue(r5, r2)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r33 = A01(r2, r12, r9)     // Catch:{ all -> 0x2a28 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x2a28 }
            r32 = r2
            r21 = 0
            r2[r6] = r10     // Catch:{ all -> 0x2a28 }
            r2 = 2131886401(0x7f120141, float:1.940738E38)
            r15 = r54
            r3 = r2
            r2 = r32
            java.lang.String r3 = r15.getString(r3, r2)     // Catch:{ all -> 0x2a28 }
            r2 = r33
            A06(r2, r3, r4, r13)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r37)     // Catch:{ all -> 0x2a28 }
            r2 = r19
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r2, r11)     // Catch:{ all -> 0x2a28 }
            java.lang.String r2 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            android.content.ContentProviderOperation$Builder r2 = r3.withValue(r5, r2)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r15 = A01(r2, r12, r9)     // Catch:{ all -> 0x2a28 }
            r3 = 2131886403(0x7f120143, float:1.9407384E38)
            r2 = r54
            java.lang.String r3 = X.C17890vO.A0R(r2, r10, r0, r6, r3)     // Catch:{ all -> 0x2a28 }
            A06(r15, r3, r4, r13)     // Catch:{ all -> 0x2a28 }
            java.lang.String r15 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r37)     // Catch:{ all -> 0x2a28 }
            r2 = r19
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r2, r11)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r2 = r3.withValue(r5, r15)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r9 = A01(r2, r12, r9)     // Catch:{ all -> 0x2a28 }
            r3 = 2131886402(0x7f120142, float:1.9407382E38)
            r2 = r54
            java.lang.String r2 = X.C17890vO.A0R(r2, r10, r0, r6, r3)     // Catch:{ all -> 0x2a28 }
            A06(r9, r2, r4, r13)     // Catch:{ all -> 0x2a28 }
            goto L_0x2947
        L_0x2943:
            r40 = 0
            goto L_0x2847
        L_0x2947:
            if (r40 == 0) goto L_0x2811
            java.lang.String r9 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r37)     // Catch:{ all -> 0x2a28 }
            r2 = r19
            android.content.ContentProviderOperation$Builder r2 = r3.withValueBackReference(r2, r11)     // Catch:{ all -> 0x2a28 }
            android.content.ContentProviderOperation$Builder r5 = r2.withValue(r5, r9)     // Catch:{ all -> 0x2a28 }
            r3 = r34
            r2 = r40
            android.content.ContentProviderOperation$Builder r3 = r5.withValue(r3, r2)     // Catch:{ all -> 0x2a28 }
            if (r39 == 0) goto L_0x2968
            int r21 = r39.intValue()     // Catch:{ all -> 0x2a28 }
        L_0x2968:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x2a28 }
            r2 = r18
            r3.withValue(r2, r5)     // Catch:{ all -> 0x2a28 }
            if (r21 != 0) goto L_0x2987
            boolean r2 = android.text.TextUtils.isEmpty(r38)     // Catch:{ all -> 0x2a28 }
            if (r2 == 0) goto L_0x2982
            r5 = 2131898700(0x7f12314c, float:1.9432325E38)
            r2 = r54
            java.lang.String r38 = r2.getString(r5)     // Catch:{ all -> 0x2a28 }
        L_0x2982:
            r2 = r38
            r3.withValue(r4, r2)     // Catch:{ all -> 0x2a28 }
        L_0x2987:
            android.content.ContentProviderOperation r2 = r3.build()     // Catch:{ all -> 0x2a28 }
            r13.add(r2)     // Catch:{ all -> 0x2a28 }
            goto L_0x2811
        L_0x2990:
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r0 != 0) goto L_0x299b
            r0 = r42
            X.C26271Rm.A04(r0, r5, r13)     // Catch:{ all -> 0x2a28 }
        L_0x299b:
            r2 = r52
            r0 = r29
            android.content.SharedPreferences r0 = r2.A05(r0)     // Catch:{ all -> 0x2a28 }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ all -> 0x2a28 }
            r2 = 3
            r0 = r31
            android.content.SharedPreferences$Editor r0 = r3.putInt(r0, r2)     // Catch:{ all -> 0x2a28 }
            r0.commit()     // Catch:{ all -> 0x2a28 }
            r20.size()     // Catch:{ all -> 0x2a28 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x2a28 }
            boolean r0 = r23.isEmpty()     // Catch:{ all -> 0x2a28 }
            if (r0 != 0) goto L_0x2a08
            r23.size()     // Catch:{ all -> 0x2a28 }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x2a28 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x2a28 }
            r0 = r16
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x2a28 }
            r3 = r27
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r3, r0)     // Catch:{ all -> 0x2a28 }
            r2 = r16
            java.lang.String r2 = r2.type     // Catch:{ all -> 0x2a28 }
            r3 = r26
            android.net.Uri$Builder r3 = r0.appendQueryParameter(r3, r2)     // Catch:{ all -> 0x2a28 }
            r2 = r25
            r0 = r24
            android.net.Uri r3 = X.C17890vO.A0C(r3, r2, r0)     // Catch:{ all -> 0x2a28 }
            java.util.Iterator r5 = r23.iterator()     // Catch:{ all -> 0x2a28 }
        L_0x29e6:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x2a28 }
            if (r0 == 0) goto L_0x2a08
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x2a28 }
            r23.size()     // Catch:{ Exception -> 0x2a01 }
            X.11B r4 = r51.A0O()     // Catch:{ Exception -> 0x2a01 }
            java.lang.String r2 = "_id = ?"
            java.lang.String[] r0 = X.C17880vN.A1a(r0, r6)     // Catch:{ Exception -> 0x2a01 }
            r4.A01(r3, r2, r0)     // Catch:{ Exception -> 0x2a01 }
            goto L_0x29e6
        L_0x2a01:
            r2 = move-exception
            java.lang.String r0 = "androidcontactssync/error deleting raw contacts with deleted=1"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x2a28 }
            goto L_0x29e6
        L_0x2a08:
            monitor-exit(r7)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            boolean r0 = r14.isEmpty()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            if (r0 != 0) goto L_0x2ad0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            java.lang.String r0 = "androidcontactssync/invalid contacts found during android contacts sync; removing "
            X.C17890vO.A15(r0, r2, r14)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            java.lang.String r0 = " contacts"
            X.C17890vO.A1B(r2, r0)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            java.lang.Boolean r2 = X.AnonymousClass000.A0h()     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            r0 = r53
            X.AnonymousClass1M9.A00(r0, r2, r14)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            goto L_0x2ad0
        L_0x2a28:
            r2 = move-exception
            monitor-exit(r7)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
            goto L_0x2a40
        L_0x2a2b:
            r2 = move-exception
            if (r4 == 0) goto L_0x2a36
            r4.close()     // Catch:{ all -> 0x2a32 }
            goto L_0x2a36
        L_0x2a32:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x2a37 }
        L_0x2a36:
            throw r2     // Catch:{ all -> 0x2a37 }
        L_0x2a37:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x2a3c }
            goto L_0x2a40
        L_0x2a3c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
        L_0x2a40:
            throw r2     // Catch:{ SecurityException -> 0x2a5f, NullPointerException -> 0x2ab2, RuntimeException -> 0x2a41 }
        L_0x2a41:
            r5 = move-exception
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x2a58
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L_0x2a5c
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof android.os.DeadSystemException
            if (r0 == 0) goto L_0x2a5c
        L_0x2a58:
            X.2rf r1 = X.C62602rf.A02
            goto L_0x00ec
        L_0x2a5c:
            java.lang.String r3 = "SyncTask/sync/RuntimeException"
            goto L_0x2ab5
        L_0x2a5f:
            r5 = move-exception
            java.lang.String r3 = "SyncTask/sync/securityException"
            goto L_0x2ab5
        L_0x2a63:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncRequestExecutor/failure "
            X.C17900vP.A0Y(r1, r0, r2)
            r0 = r67
            int r0 = r0.A00
            int r2 = r0 + 1
            r0 = r67
            r0.A00 = r2
            r3 = 1390(0x56e, float:1.948E-42)
            r2 = r39
            r0 = r63
            int r2 = X.C18020vd.A00(r2, r0, r3)
            r0 = r67
            int r0 = r0.A00
            if (r0 > r2) goto L_0x2aac
            int r2 = r1.A00
            r0 = 6
            if (r2 == r0) goto L_0x2aac
            r0 = r69
            r0.A08(r1)
        L_0x2a90:
            java.lang.Long r0 = r8.A0B
            if (r0 != 0) goto L_0x2aa9
            int r2 = r1.A00
            r0 = 3
            if (r2 == 0) goto L_0x2aa3
            r0 = 4
            if (r2 == r0) goto L_0x2aa3
            r0 = 5
            if (r2 == r0) goto L_0x2aa3
            r0 = 6
            if (r2 == r0) goto L_0x2aa3
            r0 = -1
        L_0x2aa3:
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r8.A0B = r0
        L_0x2aa9:
            r0 = 0
            goto L_0x2b35
        L_0x2aac:
            r0 = r69
            r0.A09(r1)
            goto L_0x2a90
        L_0x2ab2:
            r5 = move-exception
            java.lang.String r3 = "SyncTask/sync/npe"
        L_0x2ab5:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ContactSyncRequestExecutor/"
            X.C17900vP.A0h(r2, r3, r0, r5)
            r0 = r68
            X.190 r4 = r0.A02
            java.lang.String r3 = X.C17900vP.A0A(r2, r3)
            java.lang.String r2 = r5.getMessage()
            r0 = 1
            r4.A0G(r3, r2, r0)
        L_0x2ace:
            if (r30 == 0) goto L_0x2b26
        L_0x2ad0:
            r0 = r30
            java.util.List r3 = r0.A00
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x2ae4
            r0 = r30
            java.util.Map r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x2b26
        L_0x2ae4:
            r0 = r68
            X.1M9 r0 = r0.A09
            X.1M2 r4 = r0.A04
            r0 = r30
            java.util.Map r2 = r0.A01
            r2.size()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x2b77
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x2b77
        L_0x2afd:
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            java.lang.String r4 = "contact_version"
            int r3 = X.C17890vO.A00(r0, r4)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contact-sync-prefs/getversion="
            X.C17900vP.A0j(r0, r2, r3)
            int r3 = r3 + 1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contact-sync-prefs/setversion="
            X.C17900vP.A0j(r0, r2, r3)
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r65)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1C(r0, r4, r3)
        L_0x2b26:
            java.lang.Long r0 = r8.A0H
            if (r0 == 0) goto L_0x2b71
            long r4 = r0.longValue()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x2b71
            r0 = 1
        L_0x2b35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A04 = r0
            r0 = r62
            X.AnonymousClass1UR.A00(r0, r8)
            X.18K r0 = r0.A02
            r0.CC7(r8)
        L_0x2b45:
            java.lang.Object r0 = r61.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r4 = r0.A02()
            long r6 = r35 - r4
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncAdapter/excessive internal storage used before: "
            r6.append(r0)
            r2 = r35
            r6.append(r2)
            java.lang.String r0 = " now"
            java.lang.String r0 = X.C17890vO.A0a(r0, r6, r4)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00ec
        L_0x2b71:
            r0 = r62
            r0.A02(r8)
            goto L_0x2b45
        L_0x2b77:
            X.1Lt r0 = r4.A00     // Catch:{ RuntimeException -> 0x2bfd }
            X.1au r5 = r0.A06()     // Catch:{ RuntimeException -> 0x2bfd }
            X.1xA r10 = r5.BD0()     // Catch:{ all -> 0x2bf3 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x2be9 }
            java.lang.String r7 = "system_contacts_version_table"
            if (r0 != 0) goto L_0x2bb7
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x2be9 }
            java.util.Iterator r9 = X.AnonymousClass000.A15(r2)     // Catch:{ all -> 0x2be9 }
        L_0x2b92:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x2be9 }
            if (r0 == 0) goto L_0x2bb7
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r9)     // Catch:{ all -> 0x2be9 }
            java.lang.String r2 = "id"
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x2be9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x2be9 }
            r6.put(r2, r0)     // Catch:{ all -> 0x2be9 }
            java.lang.String r2 = "version"
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x2be9 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x2be9 }
            r6.put(r2, r0)     // Catch:{ all -> 0x2be9 }
            X.C24861Ly.A05(r6, r5, r7)     // Catch:{ all -> 0x2be9 }
            goto L_0x2b92
        L_0x2bb7:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x2be9 }
            if (r0 != 0) goto L_0x2bde
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x2be9 }
        L_0x2bc1:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x2be9 }
            if (r0 == 0) goto L_0x2bde
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x2be9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x2be9 }
            java.lang.String r4 = "id = ?"
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x2be9 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x2be9 }
            r0 = 0
            r3[r0] = r2     // Catch:{ all -> 0x2be9 }
            X.C24861Ly.A02(r5, r7, r4, r3)     // Catch:{ all -> 0x2be9 }
            goto L_0x2bc1
        L_0x2bde:
            r10.A00()     // Catch:{ all -> 0x2be9 }
            r10.close()     // Catch:{ all -> 0x2bf3 }
            r5.close()     // Catch:{ RuntimeException -> 0x2bfd }
            goto L_0x2afd
        L_0x2be9:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x2bee }
            goto L_0x2bf2
        L_0x2bee:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x2bf3 }
        L_0x2bf2:
            throw r2     // Catch:{ all -> 0x2bf3 }
        L_0x2bf3:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x2bf8 }
            goto L_0x2bfc
        L_0x2bf8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ RuntimeException -> 0x2bfd }
        L_0x2bfc:
            throw r2     // Catch:{ RuntimeException -> 0x2bfd }
        L_0x2bfd:
            r2 = move-exception
            java.lang.String r0 = "ContactManagerDatabase/system-version; apply-failed"
            X.C17960vV.A09(r0, r2)
            goto L_0x2afd
        L_0x2c05:
            if (r16 == 0) goto L_0x2c10
            java.lang.String r0 = "ContactSyncRequestExecutor/No device to sync separately."
        L_0x2c09:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2rf r1 = X.C62602rf.A08
            goto L_0x00e7
        L_0x2c10:
            if (r9 == 0) goto L_0x2c15
            java.lang.String r0 = "ContactSyncRequestExecutor/No payment to sync separately."
            goto L_0x2c09
        L_0x2c15:
            if (r11 == 0) goto L_0x2c1a
            java.lang.String r0 = "ContactSyncRequestExecutor/No picture to sync separately."
            goto L_0x2c09
        L_0x2c1a:
            java.lang.String r0 = "ContactSyncRequestExecutor/No contact to sync separately."
            goto L_0x2c09
        L_0x2c1d:
            java.lang.String r0 = "ContactSyncRequestExecutor/no_phonebook_or_sidelist_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2rf r1 = X.C62602rf.A08
            r0 = r69
            r0.A09(r1)
            r0 = r62
            r0.A02(r8)
            boolean r0 = r64.A09()
            if (r0 == 0) goto L_0x00ec
            X.AnonymousClass1US.A02(r68)
            goto L_0x00ec
        L_0x2c39:
            r2 = 0
            monitor-enter(r22)     // Catch:{ all -> 0x2c5c }
            r0 = r22
            r0.A00 = r2     // Catch:{ all -> 0x2c59 }
            X.AnonymousClass1UT.A00(r22)     // Catch:{ all -> 0x2c59 }
            monitor-exit(r22)     // Catch:{ all -> 0x2c5c }
            r2 = 0
            r0 = r28
            r0.set(r2)     // Catch:{ all -> 0x2c5c }
            monitor-exit(r28)     // Catch:{ all -> 0x2c5c }
            r3 = 22
            X.7Pi r2 = new X.7Pi
            r0 = r68
            r2.<init>(r0, r1, r3)
            r0 = r66
            r0.A0J(r2)
            return
        L_0x2c59:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x2c5c }
            throw r0     // Catch:{ all -> 0x2c5c }
        L_0x2c5c:
            r1 = move-exception
            monitor-exit(r28)     // Catch:{ all -> 0x2c5c }
            throw r1
        L_0x2c5f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x2c61 }
        L_0x2c61:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x2c66:
            java.lang.String r0 = "whatsAppLocale"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x2c6e }
            r0 = 0
            throw r0     // Catch:{ all -> 0x2c6e }
        L_0x2c6e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x2c70 }
        L_0x2c70:
            r0 = move-exception
            X.CDX.A00(r1, r2)     // Catch:{ all -> 0x2c75 }
            throw r0     // Catch:{ all -> 0x2c75 }
        L_0x2c75:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x2c77 }
        L_0x2c77:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x2c7c:
            r2 = move-exception
            goto L_0x2c9d
        L_0x2c7e:
            throw r4     // Catch:{ all -> 0x2c7f }
        L_0x2c7f:
            r1 = move-exception
            monitor-exit(r12)
            throw r1
        L_0x2c82:
            r2 = move-exception
            goto L_0x2c9d
        L_0x2c84:
            r2 = move-exception
            if (r14 == 0) goto L_0x2c8f
            r14.close()     // Catch:{ all -> 0x2c8b }
            goto L_0x2c8f
        L_0x2c8b:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x2c90 }
        L_0x2c8f:
            throw r2     // Catch:{ all -> 0x2c90 }
        L_0x2c90:
            r2 = move-exception
            r44.close()     // Catch:{ all -> 0x2c95 }
            goto L_0x2c99
        L_0x2c95:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x2c9a }
        L_0x2c99:
            throw r2     // Catch:{ all -> 0x2c9a }
        L_0x2c9a:
            r2 = move-exception
            goto L_0x2c9d
        L_0x2c9c:
            r2 = move-exception
        L_0x2c9d:
            java.util.Map r1 = r0.A0f
            r1.clear()
            java.util.Map r1 = r0.A0d
            r1.clear()
            java.util.Map r1 = r0.A0c
            r1.clear()
            java.util.Map r1 = r0.A0e
            r1.clear()
            java.util.Map r1 = r0.A0b
            r1.clear()
            r1 = r37
            r0.A00 = r1
            r0.A01 = r1
            r0 = r59
            java.util.Map r0 = r0.A01
            if (r0 == 0) goto L_0x2cc5
            r0.clear()
        L_0x2cc5:
            throw r2
        L_0x2cc6:
            r1 = move-exception
            if (r10 == 0) goto L_0x2cd1
            r10.close()     // Catch:{ all -> 0x2ccd }
            goto L_0x2cd1
        L_0x2ccd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x2cd2 }
        L_0x2cd1:
            throw r1     // Catch:{ all -> 0x2cd2 }
        L_0x2cd2:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x2cd7 }
            throw r1
        L_0x2cd7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x2cdc:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x2cdf }
            throw r0     // Catch:{ all -> 0x2cdf }
        L_0x2cdf:
            r1 = move-exception
            monitor-exit(r28)     // Catch:{ all -> 0x2cdf }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70883Cw.run():void");
    }
}
