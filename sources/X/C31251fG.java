package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1fG  reason: invalid class name and case insensitive filesystem */
public final class C31251fG implements C26181Rd {
    public final C31241fF A00;
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final C18100vl A02;
    public final AnonymousClass1JD A03 = new AnonymousClass1JD();
    public final AnonymousClass1JD A04 = new AnonymousClass1JD();
    public final AnonymousClass190 A05;
    public final AtomicBoolean A06 = new AtomicBoolean(false);

    public C31251fG(AnonymousClass190 r4, C31241fF r5, AnonymousClass10I r6) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        this.A05 = r4;
        this.A00 = r5;
        this.A02 = new C18110vm(new C31261fH(r6));
    }

    public final void A06(C59412mG r4) {
        C18070vi.A0d(r4, 0);
        ((C200710s) this.A02.getValue()).execute(new C70643By(this, r4, 49));
    }

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public final void A04() {
        if (!this.A06.getAndSet(true)) {
            C18100vl r3 = this.A02;
            ((C200710s) r3.getValue()).execute(new C70593Bs(this, 28));
            Log.i("PreacksQueue/startLoadingAsync starting a periodic writer");
            ((C200710s) r3.getValue()).A05(new C70593Bs(this, 27), 10000);
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A05() {
        /*
            r16 = this;
            r3 = r16
            monitor-enter(r3)
            X.1JD r4 = r3.A03     // Catch:{ all -> 0x0104 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0102
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0104 }
            r5.<init>(r4)     // Catch:{ all -> 0x0104 }
            monitor-exit(r3)
            X.1fF r2 = r3.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r1.<init>()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r0 = "PreacksStore/insertMany size="
            r1.append(r0)     // Catch:{ Exception -> 0x00a5 }
            int r0 = r5.size()     // Catch:{ Exception -> 0x00a5 }
            r1.append(r0)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00a5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00a5 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a5 }
            r10.<init>()     // Catch:{ Exception -> 0x00a5 }
            r0 = 64
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00a5 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x00a5 }
            X.C31241fF.A00(r2)     // Catch:{ Exception -> 0x00a5 }
            X.00H r0 = r2.A03     // Catch:{ Exception -> 0x00a5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00a5 }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ Exception -> 0x00a5 }
            X.1au r8 = r0.A06()     // Catch:{ Exception -> 0x00a5 }
            X.1xA r9 = r8.BD0()     // Catch:{ all -> 0x009e }
            java.util.Iterator r15 = r5.iterator()     // Catch:{ all -> 0x0097 }
        L_0x004e:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x0097 }
            X.2mG r1 = (X.C59412mG) r1     // Catch:{ all -> 0x0097 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0097 }
            r14.<init>()     // Catch:{ all -> 0x0097 }
            X.1ca r11 = r1.A01     // Catch:{ all -> 0x0097 }
            byte[] r6 = X.C60632oM.A01(r11, r12)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "ptn"
            r14.put(r0, r6)     // Catch:{ all -> 0x0097 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0097 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "preacks"
            java.lang.String r6 = "PreacksStore/INSERT_MANY"
            r0 = 3
            long r13 = r13.A09(r7, r6, r14, r0)     // Catch:{ all -> 0x0097 }
            r6 = 0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            long r0 = r1.A00     // Catch:{ all -> 0x0097 }
            java.lang.Long r7 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0097 }
            X.2mG r6 = new X.2mG     // Catch:{ all -> 0x0097 }
            r6.<init>(r11, r7, r0)     // Catch:{ all -> 0x0097 }
            r10.add(r6)     // Catch:{ all -> 0x0097 }
            goto L_0x004e
        L_0x008d:
            r9.A00()     // Catch:{ all -> 0x0097 }
            r9.close()     // Catch:{ all -> 0x009e }
            r8.close()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00e1
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ Exception -> 0x00a5 }
            throw r0     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PreacksStore/insertManyCatchingErrors failed to persist "
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = " pre-acks"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A09(r0, r6)
            X.190 r2 = r2.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "count="
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "failed_to_persist_pre_acks"
            r2.A0E(r0, r1, r6)
            X.0wS r10 = X.C18460wS.A00
        L_0x00e1:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0103
            monitor-enter(r3)
            X.1JD r0 = r3.A04     // Catch:{ all -> 0x0104 }
            r0.addAll(r10)     // Catch:{ all -> 0x0104 }
            int r1 = r4.size()     // Catch:{ all -> 0x0104 }
            int r0 = r5.size()     // Catch:{ all -> 0x0104 }
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0104 }
            r0 = 0
        L_0x00fa:
            if (r0 >= r1) goto L_0x0102
            r4.removeFirst()     // Catch:{ all -> 0x0104 }
            int r0 = r0 + 1
            goto L_0x00fa
        L_0x0102:
            monitor-exit(r3)
        L_0x0103:
            return
        L_0x0104:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31251fG.A05():void");
    }

    public void BvT() {
        ((C200710s) this.A02.getValue()).execute(new C70593Bs(this, 26));
    }

    private final void A00() {
        A04();
        if (!this.A01.await(60, TimeUnit.SECONDS)) {
            this.A05.A0G("failed_to_load_pre_acks", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, false);
        }
    }

    public final int A01() {
        int size;
        A00();
        synchronized (this) {
            size = this.A04.size() + this.A03.size();
        }
        return size;
    }

    public final C59412mG A02() {
        C59412mG r0;
        A00();
        synchronized (this) {
            r0 = (C59412mG) this.A03.A0V();
            if (r0 == null) {
                r0 = (C59412mG) this.A04.A0V();
            }
        }
        return r0;
    }

    public final List A03() {
        List list;
        A00();
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.A04);
            arrayList.addAll(this.A03);
            int size = arrayList.size();
            list = arrayList;
            if (size > 2000) {
                List subList = arrayList.subList(arrayList.size() - 2000, arrayList.size());
                C18070vi.A0X(subList);
                list = subList;
            }
        }
        return list;
    }

    public final boolean A07() {
        boolean z;
        A00();
        synchronized (this) {
            z = true;
            if (!(!this.A04.isEmpty()) && !(!this.A03.isEmpty())) {
                z = false;
            }
        }
        return z;
    }
}
