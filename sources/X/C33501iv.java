package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.1iv  reason: invalid class name and case insensitive filesystem */
public final class C33501iv {
    public final AnonymousClass195 A00;
    public final C18030ve A01;
    public final C33461ir A02;
    public final C33481it A03;
    public final C33491iu A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06 = new C217617h(32877);
    public final AnonymousClass00H A07;
    public final Object A08 = new Object();
    public final Object A09 = new Object();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap(2);
    public final ConcurrentSkipListSet A0B = new ConcurrentSkipListSet();
    public final C18000vb A0C;
    public final AnonymousClass00H A0D;
    public volatile int A0E;
    public volatile int A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;

    public C33501iv(AnonymousClass195 r4, C18000vb r5, C18030ve r6, C33461ir r7, C33481it r8, C33491iu r9, AnonymousClass10I r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r10, 2);
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r4, 6);
        C18070vi.A0d(r11, 7);
        C18070vi.A0d(r12, 8);
        C18070vi.A0d(r5, 9);
        this.A01 = r6;
        this.A05 = r10;
        this.A02 = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A00 = r4;
        this.A0D = r11;
        this.A07 = r12;
        this.A0C = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r4.A00 == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.util.List r7, boolean r8) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r7.iterator()
        L_0x000d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.1ir r0 = r6.A02
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r3)
            X.1tG r2 = (X.C39551tG) r2
            if (r2 == 0) goto L_0x000d
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x000d
            int r1 = r2.A01
            if (r1 < r0) goto L_0x003b
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x003b
            goto L_0x000d
        L_0x003b:
            r5.add(r3)
            goto L_0x000d
        L_0x003f:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0062
            X.195 r4 = r6.A00
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0063
            r2 = 10000(0x2710, double:4.9407E-320)
        L_0x004f:
            if (r8 == 0) goto L_0x005c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x005c
            boolean r0 = r4.A00
            r1 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            X.1it r0 = r6.A03
            r0.A01(r5, r2, r1)
        L_0x0062:
            return
        L_0x0063:
            r2 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33501iv.A04(java.util.List, boolean):void");
    }

    public final void A05(C63592tN[] r26) {
        C63592tN[] r4 = r26;
        C18070vi.A0d(r4, 0);
        C33461ir r9 = this.A02;
        int length = r4.length;
        for (int i = 0; i < length; i++) {
            C63592tN r6 = r26[i];
            if (r6.A02 == 2) {
                C39551tG r8 = (C39551tG) r9.A04.get(Integer.valueOf(r6.A01));
                if (r8 == null) {
                    r9.A03(r6.A01, 0, 2, r6.A03, 1);
                } else {
                    int i2 = r6.A03;
                    if (i2 > r8.A03 && r8.A00 == 1) {
                        r9.A04(Integer.valueOf(i2), (String) null, (String) null, "", r6.A01, 0, -1, false);
                    } else if (r8.A00 == 0) {
                        int i3 = r6.A01;
                        int i4 = r8.A01;
                        r9.A04(Integer.valueOf(r8.A03), r8.A07, r8.A06, r8.A08, i3, i4, 1, false);
                    }
                }
            }
        }
    }

    public static final void A00(C33501iv r1) {
        if (!r1.A0I) {
            r1.A0I = true;
            r1.A02.A00 = r1;
        }
    }

    public final void A02() {
        C33461ir r2 = this.A02;
        C18100vl r1 = r2.A05;
        ((SharedPreferences) r1.getValue()).edit().clear().commit();
        r2.A04.clear();
        ((SharedPreferences) r1.getValue()).getAll().size();
        C64062u9.A0R(new File(((C56962iJ) this.A07.get()).A00.A00.getFilesDir(), "privacy_disclosure"));
    }

    public final void A03(int i, int i2, boolean z, boolean z2) {
        boolean z3 = z;
        int i3 = i;
        if (C18020vd.A00(C18040vf.A02, this.A01, 11103) == i) {
            z3 = false;
        }
        A00(this);
        C33461ir r5 = this.A02;
        C33461ir.A01(r5);
        ConcurrentHashMap concurrentHashMap = r5.A04;
        Integer valueOf = Integer.valueOf(i);
        C39551tG r4 = (C39551tG) concurrentHashMap.get(valueOf);
        if (r4 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("PrivacyDisclosureDataManager/savedisclosureresult disclosure does not exist id = ");
            sb.append(i);
            Log.e(sb.toString());
            return;
        }
        int i4 = i2;
        if (C39751ta.A00.A00(r4.A01, i4)) {
            r5.A04((Integer) null, (String) null, (String) null, "", i3, i4, -1, false);
            ConcurrentHashMap concurrentHashMap2 = this.A0A;
            if (concurrentHashMap2.get(valueOf) != null) {
                concurrentHashMap2.get(valueOf);
            } else {
                this.A04.A00(i, r4.A01, z3);
            }
            if (z2) {
                ((C25768Clf) this.A0D.get()).A03(C138126wZ.A06, i, r4.A01, r4.A03);
            }
        }
    }

    public final boolean A07(int i) {
        int i2;
        try {
            i2 = this.A02.A02(i);
            if (i2 >= 105) {
                if (i2 >= 400) {
                    return false;
                }
                return true;
            }
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("PrivacyDisclosureDataManager/hasShownOnDemand: local disclosure record not found for id: ");
            sb.append(i);
            sb.append(" ,fetching latest stage from server");
            Log.i(sb.toString());
            if (A09(i)) {
                try {
                    i2 = this.A02.A02(i);
                    if (i2 >= 105) {
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PrivacyDisclosureDataManager exception ");
                    sb2.append(e.getMessage());
                    Log.e(sb2.toString());
                }
            }
        }
        return false;
    }

    public final boolean A08(int i) {
        C33461ir r3 = this.A02;
        C33461ir.A01(r3);
        if (i == ((int) AnonymousClass6RZ.IMAGINE_ME_NUX.noticeId)) {
            i = (int) AnonymousClass6RZ.IMAGINE_ME_TOS.noticeId;
        }
        C39551tG r0 = (C39551tG) r3.A04.get(Integer.valueOf(i));
        if (r0 == null) {
            throw new IllegalArgumentException("Disclosure is not eligible for current user");
        } else if (r0.A01 == 5) {
            return true;
        } else {
            return false;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean A09(int r8) {
        /*
            r7 = this;
            X.1ir r0 = r7.A02
            java.util.concurrent.ConcurrentHashMap r6 = r0.A04
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object r1 = r6.get(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r2 = 1
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.Object r4 = r7.A09
            monitor-enter(r4)
            boolean r0 = r7.A0H     // Catch:{ all -> 0x006d }
            r3 = 0
            if (r0 != 0) goto L_0x006b
            r7.A0H = r2     // Catch:{ all -> 0x006d }
            r7.A0F = r8     // Catch:{ all -> 0x006d }
            monitor-exit(r4)
            A00(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0044
            X.195 r0 = r7.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0044
        L_0x0030:
            java.util.concurrent.ConcurrentHashMap r1 = r7.A0A
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x003e
            r1.get(r5)
        L_0x003b:
            monitor-enter(r4)
            r2 = 0
            goto L_0x0046
        L_0x003e:
            X.1iu r0 = r7.A04
            r0.A01(r2, r8)
            goto L_0x003b
        L_0x0044:
            r2 = 0
            goto L_0x0030
        L_0x0046:
            boolean r1 = r7.A0H     // Catch:{ all -> 0x006d }
            r0 = 12
            if (r1 == 0) goto L_0x0056
            if (r2 >= r0) goto L_0x0062
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0053 }
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0056:
            if (r2 >= r0) goto L_0x0062
            monitor-exit(r4)
            java.lang.Object r1 = r6.get(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0061
            r0 = 1
        L_0x0061:
            return r0
        L_0x0062:
            r7.A0H = r3     // Catch:{ all -> 0x006d }
            r7.A0F = r3     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "PrivacyDisclosureDataManager/isEligibleForDisclosure timed out"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r4)
            return r3
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33501iv.A09(int):boolean");
    }

    public final boolean A0A(int i) {
        try {
            if (this.A02.A02(i) != 160) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PrivacyDisclosureDataManager exception ");
            sb.append(e.getMessage());
            Log.e(sb.toString());
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.String A01(int r12) {
        /*
            r11 = this;
            A00(r11)
            X.1ir r9 = r11.A02
            X.0vb r0 = r11.A0C
            java.lang.String r2 = r0.A05()
            X.C33461ir.A01(r9)
            java.util.concurrent.ConcurrentHashMap r8 = r9.A04
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r1 = r8.get(r7)
            X.1tG r1 = (X.C39551tG) r1
            if (r1 != 0) goto L_0x0043
            r6 = 0
        L_0x001d:
            if (r6 == 0) goto L_0x0025
            int r0 = r6.length()
            if (r0 != 0) goto L_0x00ab
        L_0x0025:
            if (r6 != 0) goto L_0x005a
            boolean r0 = r11.A09(r12)
            if (r0 != 0) goto L_0x005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PrivacyDisclosureDataManager/getDisclosureById not eligible "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0043:
            java.lang.String r0 = r1.A08
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = ""
            r1.A08 = r0
            r1.A06 = r0
            r0 = 0
            r1.A01 = r0
            r9.A05(r1, r12)
        L_0x0057:
            java.lang.String r6 = r1.A06
            goto L_0x001d
        L_0x005a:
            java.lang.Object r5 = r11.A08
            monitor-enter(r5)
            boolean r0 = r11.A0G     // Catch:{ all -> 0x00a8 }
            r4 = 0
            if (r0 != 0) goto L_0x0095
            r10 = 1
            r11.A0G = r10     // Catch:{ all -> 0x00a8 }
            r11.A0E = r12     // Catch:{ all -> 0x00a8 }
            monitor-exit(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r7)
            X.1it r2 = r11.A03
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.A01(r3, r0, r10)
            monitor-enter(r5)
            r3 = 0
            r2 = 0
        L_0x007a:
            boolean r1 = r11.A0G     // Catch:{ all -> 0x00a8 }
            r0 = 20
            if (r1 == 0) goto L_0x008a
            if (r2 >= r0) goto L_0x008a
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.wait(r0)     // Catch:{ InterruptedException -> 0x0087 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x007a
        L_0x008a:
            if (r2 < r0) goto L_0x0097
            r11.A0G = r3     // Catch:{ all -> 0x00a8 }
            r11.A0E = r3     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "PrivacyDisclosureDataManager/downloadDisclosureById timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a8 }
        L_0x0095:
            monitor-exit(r5)
            goto L_0x00a5
        L_0x0097:
            monitor-exit(r5)
            X.C33461ir.A01(r9)
            java.lang.Object r0 = r8.get(r7)
            X.1tG r0 = (X.C39551tG) r0
            if (r0 == 0) goto L_0x00a5
            java.lang.String r4 = r0.A06
        L_0x00a5:
            if (r4 == 0) goto L_0x00ab
            return r4
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00ab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33501iv.A01(int):java.lang.String");
    }

    public final boolean A06() {
        try {
            if (this.A02.A02(20240306) != 162) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PrivacyDisclosureDataManager exception ");
            sb.append(e.getMessage());
            Log.e(sb.toString());
        }
    }
}
