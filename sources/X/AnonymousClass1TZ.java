package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1TZ  reason: invalid class name */
public class AnonymousClass1TZ implements AnonymousClass1TX, AnonymousClass1TY {
    public C57462j7 A00 = null;
    public final AnonymousClass1TQ A01;
    public final AnonymousClass1TW A02;
    public final C26371Rw A03;
    public final C25851Pw A04;
    public final AnonymousClass1S3 A05;
    public final AnonymousClass1S0 A06;
    public final AnonymousClass1RE A07;
    public final AnonymousClass1TO A08;
    public final AnonymousClass00H A09;
    public final Set A0A;
    public final AnonymousClass11S A0B;
    public final AnonymousClass11Q A0C;
    public final C26331Rs A0D;
    public final Object A0E = new Object();
    public final Set A0F;

    public synchronized void A02(C57462j7 r2) {
        this.A00 = r2;
    }

    public void A03(List list) {
        C57462j7 r5;
        AnonymousClass2BT r4;
        synchronized (this) {
            r5 = this.A00;
        }
        if (r5 != null) {
            synchronized (r5) {
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    C187659gA r42 = (C187659gA) it.next();
                    if (r42 != null && "critical_unblock_low".equals(r42.A02)) {
                        for (Object obj : r42.A04) {
                            if (obj instanceof C170568qE) {
                                j++;
                            }
                        }
                    }
                }
                r5.A00 = j;
                Iterator it2 = list.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    C187659gA r0 = (C187659gA) it2.next();
                    if (!(r0 == null || (r4 = r0.A01) == null)) {
                        j2 += (long) r4.A0J((EAO) null);
                        if ((r4.bitField0_ & 2) != 0) {
                            C165718be r02 = r4.externalMutations_;
                            if (r02 == null) {
                                r02 = C165718be.DEFAULT_INSTANCE;
                            }
                            j2 += r02.fileSizeBytes_;
                        }
                    }
                }
                r5.A01 = j2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/syncdRequestPrepared: ");
            sb.append(r5);
            Log.i(sb.toString());
            int i = C25851Pw.A00(this.A04).getInt("syncd_bootstrap_state", 0);
            C26371Rw r3 = this.A03;
            AnonymousClass2SB r2 = r5.A02;
            int i2 = 2;
            if (i == 1) {
                i2 = 1;
            }
            r3.A0E(r2, i2, true);
        }
    }

    public /* synthetic */ void BlU() {
    }

    public void Bth(boolean z) {
        C57462j7 r3;
        synchronized (this) {
            r3 = this.A00;
        }
        if (r3 != null) {
            int i = C25851Pw.A00(this.A04).getInt("syncd_bootstrap_state", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/criticalBootstrapFailed currentState: ");
            sb.append(i);
            Log.i(sb.toString());
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                Log.e("SyncdBootstrapManager/criticalBootstrapFailed should never reach here");
                            }
                            A02((C57462j7) null);
                        }
                    }
                }
                this.A03.A0D(r3.A02, i2, 0, 0, false);
                A02((C57462j7) null);
            }
            this.A03.A0E(r3.A02, i2, false);
            A02((C57462j7) null);
        }
    }

    public /* synthetic */ void Bvg() {
    }

    public void onSuccess() {
    }

    public void A00() {
        int i;
        int i2;
        synchronized (this.A0E) {
            AnonymousClass11S r3 = this.A0B;
            boolean A0N = r3.A0N();
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/bootstrapNewFeatures isCompanion=");
            sb.append(A0N);
            Log.i(sb.toString());
            if (!A0N) {
                i = C25851Pw.A00(this.A04).getInt("syncd_bootstrap_state", 0);
                i2 = 4;
            } else {
                i = AnonymousClass11Q.A01(this.A0C).getInt("companion_syncd_critical_bootstrap_state", 0);
                i2 = 3;
            }
            if (i == i2) {
                C25851Pw r6 = this.A04;
                if (r6.A02().isEmpty()) {
                    r6.A07(this.A0A);
                }
                Set A022 = r6.A02();
                AnonymousClass00H r7 = this.A09;
                Set<String> A023 = ((C58862lN) r7.get()).A02();
                A023.removeAll(A022);
                if (r3.A0N()) {
                    A023.retainAll(this.A0F);
                }
                if (!A023.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (String A002 : A023) {
                        C60192nY A003 = ((C58862lN) r7.get()).A00(A002);
                        if (A003 != null) {
                            arrayList.addAll(A003.A0F(true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SyncdBootstrapManager/bootstrapNewFeatures adding mutations for ");
                            sb2.append(A003.getClass().getCanonicalName());
                            Log.i(sb2.toString());
                        } else {
                            Log.e("SyncdBootstrapManager/bootstrapNewFeatures handler not found");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.A05.A07(arrayList);
                    }
                    r6.A07(A023);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r12 = this;
            X.1Pw r2 = r12.A04
            android.content.SharedPreferences r3 = X.C25851Pw.A00(r2)
            java.lang.String r1 = "syncd_bootstrap_state"
            r0 = 0
            int r5 = r3.getInt(r1, r0)
            r3 = r12
            monitor-enter(r3)
            X.2j7 r1 = r12.A00     // Catch:{ all -> 0x0129 }
            monitor-exit(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "SyncdBootstrapManager/onSyncdSuccess "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "; bootstrapState: "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 2
            r6 = 1
            if (r5 == r6) goto L_0x004d
            if (r5 == r4) goto L_0x0071
            r0 = 3
            if (r5 != r0) goto L_0x004c
            java.util.Set r0 = X.C20126A8l.A08
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            java.util.Set r0 = X.C20126A8l.A09
            r3.removeAll(r0)
            X.1Rs r0 = r12.A0D
            boolean r0 = r0.A0M(r3)
            if (r0 != 0) goto L_0x0105
        L_0x004c:
            return
        L_0x004d:
            X.1Rs r3 = r12.A0D
            java.util.Set r0 = X.C20126A8l.A09
            boolean r0 = r3.A0M(r0)
            if (r0 == 0) goto L_0x004c
            r2.A04(r4)
            X.1RE r0 = r12.A07
            r0.A02(r6)
            if (r1 == 0) goto L_0x0071
            X.1Rw r4 = r12.A03
            X.2SB r5 = r1.A02
            monitor-enter(r1)
            long r7 = r1.A00     // Catch:{ all -> 0x0111 }
            monitor-exit(r1)
            monitor-enter(r1)
            long r9 = r1.A01     // Catch:{ all -> 0x0111 }
            monitor-exit(r1)
            r11 = r6
            r4.A0D(r5, r6, r7, r9, r11)
        L_0x0071:
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r0 = X.C20126A8l.A08
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r0)
            java.util.Set r0 = X.C20126A8l.A09
            r8.removeAll(r0)
            X.00H r5 = r12.A09
            java.lang.Object r0 = r5.get()
            X.2lN r0 = (X.C58862lN) r0
            java.util.Set r0 = r0.A02()
            java.util.Iterator r10 = r0.iterator()
        L_0x009c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r4 = r10.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r5.get()
            X.2lN r0 = (X.C58862lN) r0
            X.2nY r9 = r0.A00(r4)
            if (r9 != 0) goto L_0x00ba
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x009c
        L_0x00ba:
            java.lang.String r0 = r9.A0D()
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 0
            java.util.List r0 = r9.A0F(r0)
            r6.addAll(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap adding mutations for "
            r3.append(r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.add(r4)
            goto L_0x009c
        L_0x00ec:
            X.1S3 r0 = r12.A05
            r0.A07(r6)
            r2.A07(r7)
            r0 = 3
            r2.A04(r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = java.util.Collections.emptyList()
            r12.A03(r0)
        L_0x0105:
            r0 = 4
            r2.A04(r0)
            if (r1 == 0) goto L_0x0124
            X.1Rw r2 = r12.A03
            X.2SB r3 = r1.A02
            monitor-enter(r1)
            goto L_0x0114
        L_0x0111:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0114:
            long r5 = r1.A00     // Catch:{ all -> 0x011b }
            monitor-exit(r1)
            monitor-enter(r1)
            long r7 = r1.A01     // Catch:{ all -> 0x011b }
            goto L_0x011e
        L_0x011b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x011e:
            monitor-exit(r1)
            r4 = 2
            r9 = 1
            r2.A0D(r3, r4, r5, r7, r9)
        L_0x0124:
            r0 = 0
            r12.A02(r0)
            return
        L_0x0129:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TZ.A01():void");
    }

    public void C8H(Exception exc) {
        Log.i("SyncdBootstrapManager/onSyncdFailed");
        this.A07.A02(false);
    }

    public AnonymousClass1TZ(AnonymousClass11S r2, AnonymousClass1TQ r3, AnonymousClass1TW r4, C26371Rw r5, C25851Pw r6, AnonymousClass1S3 r7, AnonymousClass1S0 r8, AnonymousClass11Q r9, AnonymousClass1RE r10, C26331Rs r11, AnonymousClass1TO r12, AnonymousClass00H r13, Set set, Set set2) {
        this.A0B = r2;
        this.A06 = r8;
        this.A05 = r7;
        this.A09 = r13;
        this.A03 = r5;
        this.A01 = r3;
        this.A0D = r11;
        this.A08 = r12;
        this.A04 = r6;
        this.A07 = r10;
        this.A0C = r9;
        this.A0A = set;
        this.A0F = set2;
        this.A02 = r4;
    }

    public void C8I() {
        A01();
    }
}
