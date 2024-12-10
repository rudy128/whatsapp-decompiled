package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.voipcalling.CallInfo;
import java.util.AbstractList;
import java.util.List;
import java.util.Stack;

/* renamed from: X.7RT  reason: invalid class name */
public class AnonymousClass7RT implements Runnable {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass7RT(C1193467t r2, C122606Ra r3, List list) {
        this.A01 = 40;
        this.A02 = list;
        this.A03 = r2;
        this.A00 = true;
        this.A04 = r3;
    }

    public void A00(Bitmap bitmap, C134786r9 r5) {
        ((MediaViewFragment) this.A03).A0F.A0J(new AnonymousClass7R0(this, bitmap, r5, 29));
    }

    public void A01(PhotoView photoView, AnonymousClass21V r5) {
        C134786r9 r2 = new C134786r9(photoView, r5);
        AbstractList abstractList = (AbstractList) this.A02;
        synchronized (abstractList) {
            abstractList.add(0, r2);
            abstractList.notifyAll();
        }
    }

    /* JADX WARNING: type inference failed for: r4v36, types: [X.2SB, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06a9, code lost:
        r3.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x072f, code lost:
        if (r7 == false) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07a4, code lost:
        if (X.C62822s3.A02(r0) == false) goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0c30, code lost:
        if (r9 == null) goto L_0x0c32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0d5b, code lost:
        r0.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0d5e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f3, code lost:
        r0.CC7(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f6, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0c80 A[Catch:{ InterruptedException -> 0x0d10 }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0c8d A[Catch:{ InterruptedException -> 0x0d10 }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0cc5 A[Catch:{ InterruptedException -> 0x0d10 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0cdf A[Catch:{ InterruptedException -> 0x0d10 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0583;
                case 1: goto L_0x0b9b;
                case 2: goto L_0x03ae;
                case 3: goto L_0x02c5;
                case 4: goto L_0x0b66;
                case 5: goto L_0x0b48;
                case 6: goto L_0x0b17;
                case 7: goto L_0x0af6;
                case 8: goto L_0x0ad4;
                case 9: goto L_0x0ac2;
                case 10: goto L_0x01f7;
                case 11: goto L_0x0a3c;
                case 12: goto L_0x0a1b;
                case 13: goto L_0x09ff;
                case 14: goto L_0x01d0;
                case 15: goto L_0x01ae;
                case 16: goto L_0x018b;
                case 17: goto L_0x0995;
                case 18: goto L_0x0138;
                case 19: goto L_0x0d40;
                case 20: goto L_0x0101;
                case 21: goto L_0x091e;
                case 22: goto L_0x08be;
                case 23: goto L_0x0897;
                case 24: goto L_0x0850;
                case 25: goto L_0x0007;
                case 26: goto L_0x0007;
                case 27: goto L_0x07fd;
                case 28: goto L_0x07eb;
                case 29: goto L_0x07b0;
                case 30: goto L_0x0775;
                case 31: goto L_0x0071;
                case 32: goto L_0x0bb8;
                case 33: goto L_0x0763;
                case 34: goto L_0x0746;
                case 35: goto L_0x06c8;
                case 36: goto L_0x06ad;
                case 37: goto L_0x0678;
                case 38: goto L_0x0623;
                case 39: goto L_0x05f4;
                case 40: goto L_0x05be;
                case 41: goto L_0x0053;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r0.A02
            X.1RS r5 = (X.AnonymousClass1RS) r5
            java.lang.Object r4 = r0.A03
            X.1E9 r4 = (X.AnonymousClass1E9) r4
            java.lang.Object r1 = r0.A04
            X.2tp r1 = (X.C63872tp) r1
            boolean r3 = r0.A00
            X.1MW r0 = r5.A06
            r0.A0J(r1)
            X.11S r0 = r5.A00
            r0.A0I()
            X.1E3 r0 = r0.A02
            X.C17960vV.A07(r0)
            java.lang.String r1 = r4.getRawString()
            X.2nE r0 = X.C63962tz.A02(r0)
            X.2nC r2 = new X.2nC
            r2.<init>(r0, r1)
            X.1P3 r0 = r5.A03
            r1 = 0
            X.1Oy r0 = r0.A08
            boolean r0 = r0.A05(r2, r1)
            if (r0 == 0) goto L_0x0045
            X.1PT r1 = r5.A0A
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A0D(r4, r0)
        L_0x0045:
            if (r3 == 0) goto L_0x0052
            X.00H r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            X.2lC r0 = (X.C58752lC) r0
            r0.A00()
        L_0x0052:
            return
        L_0x0053:
            java.lang.Object r3 = r0.A02
            X.21V r3 = (X.AnonymousClass21V) r3
            java.lang.Object r2 = r0.A03
            X.6j4 r2 = (X.C130216j4) r2
            boolean r6 = r0.A00
            java.lang.Object r4 = r0.A04
            X.2rc r0 = r3.A02
            if (r0 == 0) goto L_0x0052
            boolean r7 = r0.A01()
            X.1KB r0 = r2.A02
            r5 = 5
            X.7Q6 r1 = new X.7Q6
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0d5b
        L_0x0071:
            java.lang.Object r3 = r0.A02
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r5 = r0.A03
            X.2rc r5 = (X.C62572rc) r5
            java.lang.Object r2 = r0.A04
            X.21V r2 = (X.AnonymousClass21V) r2
            boolean r1 = r0.A00
            java.io.File r0 = r5.A0G
            if (r0 == 0) goto L_0x00fe
            long r14 = X.C26521Sl.A02(r0)
        L_0x0087:
            X.00H r0 = r3.A1R
            java.lang.Object r9 = r0.get()
            X.6eD r9 = (X.C127356eD) r9
            X.205 r0 = r2.A0v
            boolean r0 = r0.A02
            r13 = 1
            if (r0 == 0) goto L_0x0097
            r13 = 3
        L_0x0097:
            if (r1 == 0) goto L_0x00fc
            int r3 = r3.A05
        L_0x009b:
            int r0 = r2.A0D
            long r0 = (long) r0
            java.io.File r2 = r5.A0G
            int r4 = r5.A08
            long r6 = (long) r4
            int r4 = r5.A06
            long r4 = (long) r4
            r12 = 1
            if (r2 == 0) goto L_0x0052
            X.64H r8 = new X.64H
            r8.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0A = r0
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r2.lastModified()
            long r10 = r10 - r0
            long r0 = X.C17880vN.A04(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A09 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r8.A06 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r8.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.A03 = r0
            long r2 = r2.length()
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r8.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8.A0D = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r8.A07 = r0
            X.18K r0 = r9.A00
            r0.CC7(r8)
            return
        L_0x00fc:
            r3 = 4
            goto L_0x009b
        L_0x00fe:
            r14 = 0
            goto L_0x0087
        L_0x0101:
            java.lang.Object r6 = r0.A02
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r3 = r0.A03
            X.4Zj r3 = (X.C88354Zj) r3
            boolean r5 = r0.A00
            java.lang.Object r4 = r0.A04
            long r0 = r6.A0x
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.1WC r1 = r3.A07
            X.0vl r0 = r1.A01
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0052
            r1.A01(r2)
            X.1KB r3 = r3.A00
            r0 = 46
            X.4rl r2 = new X.4rl
            r2.<init>(r4, r6, r0)
            if (r5 == 0) goto L_0x0135
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x0131:
            r3.A0K(r2, r0)
            return
        L_0x0135:
            r0 = 0
            goto L_0x0131
        L_0x0138:
            java.lang.Object r6 = r0.A02
            X.70E r6 = (X.AnonymousClass70E) r6
            boolean r5 = r0.A00
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r1 = r0.A04
            X.2qD r1 = (X.C61762qD) r1
            if (r5 == 0) goto L_0x017f
            boolean r3 = r4 instanceof X.C440321w
            X.00H r0 = r6.A0D
            java.lang.Object r2 = r0.get()
            X.1iV r2 = (X.C33241iV) r2
            int r1 = r1.A06
            r0 = 13
            if (r3 == 0) goto L_0x015a
            r0 = 14
        L_0x015a:
            X.C33241iV.A00(r2, r4, r0, r1)
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            if (r0 == 0) goto L_0x0052
            if (r5 == 0) goto L_0x017d
            boolean r0 = r4 instanceof X.C440321w
            r2 = 13
            if (r0 == 0) goto L_0x016d
            r2 = 14
        L_0x016d:
            X.00H r0 = r6.A06
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            r1.A02(r0, r4, r2)
            return
        L_0x017d:
            r2 = 0
            goto L_0x016d
        L_0x017f:
            X.00H r0 = r6.A0D
            java.lang.Object r2 = r0.get()
            X.1iV r2 = (X.C33241iV) r2
            int r1 = r1.A06
            r0 = 3
            goto L_0x015a
        L_0x018b:
            java.lang.Object r5 = r0.A02
            X.73j r5 = (X.C1408673j) r5
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            boolean r3 = r0.A00
            java.lang.Object r2 = r0.A04
            X.9zz r2 = (X.C199429zz) r2
            r1 = 1
            java.lang.String r0 = "onInviteConfirmed"
            X.64O r6 = X.C1408673j.A01(r5, r0)
            if (r6 == 0) goto L_0x0052
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A00 = r0
            X.C1408673j.A03(r2, r5, r6, r4, r3)
            X.18K r0 = r5.A01
            goto L_0x01f3
        L_0x01ae:
            java.lang.Object r4 = r0.A02
            X.73j r4 = (X.C1408673j) r4
            java.lang.Object r3 = r0.A03
            X.1BI r3 = (X.AnonymousClass1BI) r3
            boolean r2 = r0.A00
            java.lang.Object r1 = r0.A04
            X.9zz r1 = (X.C199429zz) r1
            java.lang.String r0 = "onContactDeselected"
            X.64O r6 = X.C1408673j.A01(r4, r0)
            if (r6 == 0) goto L_0x0052
            java.lang.Integer r0 = X.C17880vN.A0i()
            r6.A00 = r0
            X.C1408673j.A03(r1, r4, r6, r3, r2)
            X.18K r0 = r4.A01
            goto L_0x01f3
        L_0x01d0:
            java.lang.Object r4 = r0.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r3 = r0.A03
            X.73j r3 = (X.C1408673j) r3
            boolean r2 = r0.A00
            java.lang.Object r1 = r0.A04
            X.9zz r1 = (X.C199429zz) r1
            if (r4 == 0) goto L_0x0052
            java.lang.String r0 = "onContactPicked"
            X.64O r6 = X.C1408673j.A01(r3, r0)
            if (r6 == 0) goto L_0x0052
            java.lang.Integer r0 = X.C17880vN.A0k()
            r6.A00 = r0
            X.C1408673j.A03(r1, r3, r6, r4, r2)
            X.18K r0 = r3.A01
        L_0x01f3:
            r0.CC7(r6)
            return
        L_0x01f7:
            java.lang.Object r9 = r0.A02
            X.A99 r9 = (X.A99) r9
            java.lang.Object r12 = r0.A03
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r10 = r0.A04
            com.whatsapp.voipcalling.CallInfo r10 = (com.whatsapp.voipcalling.CallInfo) r10
            boolean r5 = r0.A00
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r12.iterator()
        L_0x0211:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022b
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2hy r1 = r9.A2G
            boolean r0 = r10.isLidCall()
            com.whatsapp.jid.UserJid r0 = r1.A00(r2, r0)
            r6.add(r0)
            goto L_0x0211
        L_0x022b:
            X.1VI r2 = r9.A2P
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r6)
            java.lang.String r0 = "voip/invite"
            java.util.ArrayList r0 = r2.A01(r0, r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x023c:
            boolean r0 = r7.hasNext()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0260
            java.lang.Object r3 = r7.next()
            com.whatsapp.voipcalling.CallParticipantJid r3 = (com.whatsapp.voipcalling.CallParticipantJid) r3
            com.whatsapp.jid.UserJid r2 = r3.userJid
            boolean r1 = r10.isLidCall()
            boolean r0 = X.C22971Dz.A0T(r2)
            if (r1 == r0) goto L_0x0257
            r4 = 0
        L_0x0257:
            java.lang.String r0 = "voip/invite: LID mismatch between ongoing call & jid used to invite"
            X.C17960vV.A0F(r4, r0)
            r8.put(r2, r3)
            goto L_0x023c
        L_0x0260:
            java.util.Collection r1 = r8.values()
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = (com.whatsapp.voipcalling.CallParticipantJid[]) r0
            int r0 = com.whatsapp.voipcalling.Voip.invite(r0, r5)
            if (r0 == 0) goto L_0x0294
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r6.iterator()
        L_0x027a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0d1e
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r9.A2T
            X.1E7 r1 = r0.A0H(r1)
            X.1Me r0 = r9.A2V
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r1)
            r5.add(r0)
            goto L_0x027a
        L_0x0294:
            java.util.Iterator r2 = r6.iterator()
        L_0x0298:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.00H r0 = r9.A3Q
            java.lang.Object r0 = r0.get()
            X.2nK r0 = (X.C60062nK) r0
            r0.A02(r1)
            goto L_0x0298
        L_0x02b0:
            com.whatsapp.jid.UserJid r11 = r10.getInitialPeerJid()
            if (r5 != 0) goto L_0x0052
            if (r11 == 0) goto L_0x0052
            X.10I r0 = r9.A31
            r13 = 46
            X.Aix r8 = new X.Aix
            r8.<init>(r9, r10, r11, r12, r13)
            r0.CGN(r8)
            return
        L_0x02c5:
            java.lang.Object r4 = r0.A02
            X.CZ4 r4 = (X.CZ4) r4
            java.lang.Object r3 = r0.A03
            X.CiY r3 = (X.C25593CiY) r3
            java.lang.Object r1 = r0.A04
            X.CTv r1 = (X.C25019CTv) r1
            boolean r2 = r0.A00
            if (r4 == 0) goto L_0x02da
            android.util.LruCache r0 = r4.A00
            r0.evictAll()
        L_0x02da:
            if (r3 == 0) goto L_0x02e8
            monitor-enter(r3)
            android.util.LruCache r0 = r3.A00     // Catch:{ all -> 0x0d33 }
            r0.evictAll()     // Catch:{ all -> 0x0d33 }
            android.util.LruCache r0 = r3.A01     // Catch:{ all -> 0x0d33 }
            r0.evictAll()     // Catch:{ all -> 0x0d33 }
            monitor-exit(r3)
        L_0x02e8:
            if (r1 == 0) goto L_0x02f0
            java.util.concurrent.atomic.AtomicReference r1 = r1.A06
            r0 = 0
            r1.set(r0)
        L_0x02f0:
            X.Csh r5 = X.C26119Csh.A04
            if (r2 == 0) goto L_0x0354
            X.CpD r0 = r5.A01
            X.Csh r6 = r0.A02
            java.util.Map r5 = r6.A03
            monitor-enter(r5)
            java.util.Map r0 = r6.A03     // Catch:{ all -> 0x0d36 }
            java.util.Iterator r3 = X.C17890vO.A0l(r0)     // Catch:{ all -> 0x0d36 }
            r4 = 0
        L_0x0302:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0d36 }
            if (r0 == 0) goto L_0x032d
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0d36 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0d36 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0d36 }
        L_0x0312:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0d36 }
            if (r0 == 0) goto L_0x0329
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0d36 }
            X.EAe r0 = (X.C28610EAe) r0     // Catch:{ all -> 0x0d36 }
            if (r4 != 0) goto L_0x0325
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ all -> 0x0d36 }
            r4.<init>()     // Catch:{ all -> 0x0d36 }
        L_0x0325:
            r4.add(r0)     // Catch:{ all -> 0x0d36 }
            goto L_0x0312
        L_0x0329:
            r2.clear()     // Catch:{ all -> 0x0d36 }
            goto L_0x0302
        L_0x032d:
            java.util.Map r0 = r6.A03     // Catch:{ all -> 0x0d36 }
            r0.clear()     // Catch:{ all -> 0x0d36 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0d36 }
            monitor-exit(r5)     // Catch:{ all -> 0x0d36 }
            if (r4 == 0) goto L_0x0052
            java.util.Iterator r2 = r4.iterator()
        L_0x033c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0d39
            java.lang.Object r1 = r2.next()
            X.EAe r1 = (X.C28610EAe) r1
            r1.stop()     // Catch:{ all -> 0x034f }
            r1.release()     // Catch:{ Exception -> 0x033c }
            goto L_0x033c
        L_0x034f:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x033c }
            throw r0     // Catch:{ Exception -> 0x033c }
        L_0x0354:
            monitor-enter(r5)
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0d3d }
            java.util.Iterator r3 = X.C17890vO.A0l(r0)     // Catch:{ all -> 0x0d3d }
            r4 = 0
        L_0x035c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0d3d }
            if (r0 == 0) goto L_0x0387
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0d3d }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0d3d }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0d3d }
        L_0x036c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0d3d }
            if (r0 == 0) goto L_0x0383
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0d3d }
            X.EAe r0 = (X.C28610EAe) r0     // Catch:{ all -> 0x0d3d }
            if (r4 != 0) goto L_0x037f
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ all -> 0x0d3d }
            r4.<init>()     // Catch:{ all -> 0x0d3d }
        L_0x037f:
            r4.add(r0)     // Catch:{ all -> 0x0d3d }
            goto L_0x036c
        L_0x0383:
            r2.clear()     // Catch:{ all -> 0x0d3d }
            goto L_0x035c
        L_0x0387:
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0d3d }
            r0.clear()     // Catch:{ all -> 0x0d3d }
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x0d3d }
            monitor-exit(r5)     // Catch:{ all -> 0x0d3d }
            if (r4 == 0) goto L_0x0052
            java.util.Iterator r2 = r4.iterator()
        L_0x0396:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0d39
            java.lang.Object r1 = r2.next()
            X.EAe r1 = (X.C28610EAe) r1
            r1.stop()     // Catch:{ all -> 0x03a9 }
            r1.release()     // Catch:{ Exception -> 0x0396 }
            goto L_0x0396
        L_0x03a9:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x0396 }
            throw r0     // Catch:{ Exception -> 0x0396 }
        L_0x03ae:
            java.lang.Object r6 = r0.A02
            com.facebook.smartcapture.components.ContourView r6 = (com.facebook.smartcapture.components.ContourView) r6
            java.lang.Object r5 = r0.A03
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r4 = r0.A04
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            boolean r7 = r0.A00
            r3 = 0
            X.C18070vi.A0j(r5, r4)
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r5 != r0) goto L_0x0552
            com.facebook.smartcapture.components.DottedAlignmentView r9 = r6.A0C
            float r1 = r6.A03
            int r0 = r4.left
            float r0 = (float) r0
            float r0 = r0 + r1
            r9.setX(r0)
            int r0 = r4.top
            float r0 = (float) r0
            float r0 = r0 + r1
            r9.setY(r0)
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            int r2 = r4.width()
            int r0 = (int) r1
            int r1 = r0 * 2
            int r2 = r2 - r1
            r8.width = r2
            int r0 = r4.height()
            int r0 = r0 - r1
            r8.height = r0
            r9.requestLayout()
            r9.setVisibility(r3)
            android.view.ViewPropertyAnimator r0 = X.C108985cd.A0G(r9)
            r0.start()
            r1 = 33
            X.DTh r0 = new X.DTh
            r0.<init>((java.lang.Object) r9, (int) r1)
            r9.post(r0)
        L_0x0402:
            com.facebook.smartcapture.components.DarkenedFrameView r9 = r6.A0B
            android.graphics.RectF r11 = r9.A04
            int r0 = r4.left
            float r10 = (float) r0
            float r8 = r9.A01
            float r10 = r10 + r8
            int r0 = r4.top
            float r2 = (float) r0
            float r2 = r2 + r8
            int r0 = r4.right
            float r1 = (float) r0
            float r1 = r1 - r8
            int r0 = r4.bottom
            float r0 = (float) r0
            float r0 = r0 - r8
            r11.set(r10, r2, r1, r0)
            if (r7 == 0) goto L_0x053c
            r0 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
            r2.<init>()
            r2.setDuration(r0)
            r0 = 4
            android.animation.PropertyValuesHolder[] r10 = new android.animation.PropertyValuesHolder[r0]
            r13 = 2
            float[] r1 = new float[r13]
            android.graphics.RectF r12 = r9.A03
            float r0 = r12.left
            r1[r3] = r0
            float r0 = r11.left
            r8 = 1
            r1[r8] = r0
            java.lang.String r0 = "left"
            X.C108945cZ.A1R(r0, r1, r10, r3)
            float[] r1 = new float[r13]
            float r0 = r12.top
            r1[r3] = r0
            float r0 = r11.top
            r1[r8] = r0
            java.lang.String r0 = "top"
            X.C108945cZ.A1R(r0, r1, r10, r8)
            float[] r1 = new float[r13]
            float r0 = r12.right
            r1[r3] = r0
            float r0 = r11.right
            r1[r8] = r0
            java.lang.String r0 = "right"
            X.C108945cZ.A1R(r0, r1, r10, r13)
            float[] r1 = new float[r13]
            float r0 = r12.bottom
            r1[r3] = r0
            float r0 = r11.bottom
            r1[r8] = r0
            java.lang.String r0 = "bottom"
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            r0 = 3
            r10[r0] = r1
            r2.setValues(r10)
            X.C1411074h.A00(r2, r9, r8)
            r2.start()
        L_0x0477:
            int r0 = r5.intValue()
            switch(r0) {
                case 8: goto L_0x0538;
                case 9: goto L_0x0538;
                case 10: goto L_0x0538;
                case 11: goto L_0x0538;
                case 12: goto L_0x0538;
                default: goto L_0x047e;
            }
        L_0x047e:
            r1 = 0
        L_0x047f:
            int r0 = r6.A01
            if (r0 == r1) goto L_0x04a8
            r6.A01 = r1
            android.animation.ValueAnimator r5 = new android.animation.ValueAnimator
            r5.<init>()
            int[] r2 = X.C108945cZ.A1W()
            int r0 = r6.A00
            r2[r3] = r0
            r1 = 1
            int r0 = r6.A01
            r2[r1] = r0
            r5.setIntValues(r2)
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r5.setEvaluator(r0)
            X.C1411074h.A00(r5, r6, r3)
            r5.start()
        L_0x04a8:
            int r12 = r4.left
            int r2 = r4.right
            android.widget.ImageView r11 = r6.A08
            int r0 = r11.getWidth()
            int r2 = r2 - r0
            int r1 = r4.top
            int r10 = r4.bottom
            int r0 = r11.getHeight()
            int r10 = r10 - r0
            android.widget.ImageView r9 = r6.A06
            int r0 = r9.getHeight()
            int r0 = r0 + r10
            float r5 = (float) r0
            float r0 = X.C108945cZ.A04(r6)
            float r0 = r0 - r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r5 = r5 + r0
            android.widget.TextView r8 = r6.A0A
            float r0 = X.C108945cZ.A04(r8)
            float r0 = r0 / r4
            float r5 = r5 - r0
            float r0 = r6.A04
            int r0 = (int) r0
            int r12 = r12 - r0
            int r1 = r1 - r0
            int r2 = r2 + r0
            int r10 = r10 + r0
            if (r7 == 0) goto L_0x0509
            X.AnonymousClass6VY.A00(r11, r12, r1)
            android.widget.ImageView r0 = r6.A09
            X.AnonymousClass6VY.A00(r0, r2, r1)
            X.AnonymousClass6VY.A00(r9, r12, r10)
            android.widget.ImageView r0 = r6.A07
            X.AnonymousClass6VY.A00(r0, r2, r10)
            android.view.ViewPropertyAnimator r0 = r8.animate()
            android.view.ViewPropertyAnimator r2 = r0.y(r5)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
        L_0x04fb:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0052
            android.view.ViewPropertyAnimator r0 = X.C108985cd.A0G(r6)
            r0.start()
            r6.A02 = r3
            return
        L_0x0509:
            float r4 = (float) r12
            r11.setX(r4)
            float r1 = (float) r1
            r11.setY(r1)
            android.widget.ImageView r0 = r6.A09
            float r2 = (float) r2
            r0.setX(r2)
            r0.setY(r1)
            r9.setX(r4)
            float r1 = (float) r10
            r9.setY(r1)
            android.widget.ImageView r0 = r6.A07
            r0.setX(r2)
            r0.setY(r1)
            float r0 = r8.getY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x04fb
            r8.setY(r5)
            r8.requestLayout()
            goto L_0x04fb
        L_0x0538:
            int r1 = r6.A05
            goto L_0x047f
        L_0x053c:
            android.graphics.RectF r8 = r9.A03
            r8.set(r11)
            android.graphics.Path r2 = r9.A02
            r2.reset()
            float r1 = r9.A00
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r8, r1, r1, r0)
            r9.invalidate()
            goto L_0x0477
        L_0x0552:
            r8 = 0
            com.facebook.smartcapture.components.DottedAlignmentView r2 = r6.A0C
            if (r7 == 0) goto L_0x056f
            android.view.ViewPropertyAnimator r0 = r2.animate()
            android.view.ViewPropertyAnimator r2 = r0.alpha(r8)
            r1 = 31
            X.DTh r0 = new X.DTh
            r0.<init>((java.lang.Object) r6, (int) r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            X.C18070vi.A0b(r0)
            goto L_0x0402
        L_0x056f:
            r1 = 32
            X.DTh r0 = new X.DTh
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.post(r0)
            r2.setAlpha(r8)
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x0402
        L_0x0583:
            boolean r5 = r0.A00
            java.lang.Object r1 = r0.A02
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r4 = r0.A03
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.Object r3 = r0.A04
            if (r5 != 0) goto L_0x059d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x059d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L_0x059d:
            java.util.Iterator r2 = r1.iterator()
        L_0x05a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r2.next()
            X.C6E r1 = (X.C6E) r1
            if (r5 == 0) goto L_0x05b3
            r1.A01(r3)
            goto L_0x05a1
        L_0x05b3:
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x05ba
            X.C28111Yx.A02(r4)
        L_0x05ba:
            r1.A00(r4)
            goto L_0x05a1
        L_0x05be:
            java.lang.Object r9 = r0.A02
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r0.A03
            X.67t r8 = (X.C1193467t) r8
            java.lang.Object r7 = r0.A04
            X.6Ra r7 = (X.C122606Ra) r7
            r6 = 1
            r3 = 0
            java.util.Iterator r5 = r9.iterator()
        L_0x05d1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05e5
            X.77d r2 = X.C108945cZ.A0x(r5)
            boolean r1 = r2.A0N
            boolean r0 = r8.A09
            if (r1 != r0) goto L_0x05d1
            r8.A0L(r2, r3, r6)
            goto L_0x05d1
        L_0x05e5:
            int r2 = r9.size()
            X.1KB r1 = r8.A01
            X.7RR r0 = new X.7RR
            r0.<init>(r8, r7, r2, r6)
            r1.CGP(r0)
            return
        L_0x05f4:
            java.lang.Object r1 = r0.A02
            X.1mq r1 = (X.C35811mq) r1
            java.lang.Object r2 = r0.A03
            X.23J r2 = (X.AnonymousClass23J) r2
            java.lang.Object r5 = r0.A04
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            boolean r8 = r0.A00
            X.1TO r3 = r1.A08
            java.lang.String r1 = r2.A0J
            java.lang.String r0 = r2.A0I
            if (r1 == 0) goto L_0x0621
            if (r0 == 0) goto L_0x0621
            X.2SB r4 = new X.2SB
            r4.<init>()
            r4.A01 = r1
            r4.A00 = r0
        L_0x0615:
            int r0 = r2.A02
            int r7 = r0 + 1
            X.205 r0 = r2.A0v
            java.lang.String r6 = r0.A01
            r3.A08(r4, r5, r6, r7, r8)
            return
        L_0x0621:
            r4 = 0
            goto L_0x0615
        L_0x0623:
            boolean r1 = r0.A00
            java.lang.Object r6 = r0.A02
            X.6xE r6 = (X.C138526xE) r6
            java.lang.Object r5 = r0.A03
            X.1Di r5 = (X.C22821Di) r5
            java.lang.Object r7 = r0.A04
            X.1Di r7 = (X.C22821Di) r7
            if (r1 != 0) goto L_0x0651
            X.00H r0 = r6.A04
            android.content.SharedPreferences r1 = X.C108995ce.A0F(r0)
            java.lang.String r0 = "pref_avatar_preview_cache_url"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            if (r0 == 0) goto L_0x0651
            android.graphics.Bitmap r1 = X.C138526xE.A00(r6, r0)
            if (r1 == 0) goto L_0x0651
            X.1KB r3 = r6.A00
            r0 = 34
            X.Ak0 r2 = new X.Ak0
            r2.<init>(r5, r1, r0)
            goto L_0x06a9
        L_0x0651:
            X.0vp r0 = r6.A05
            java.lang.Object r2 = r0.get()
            X.6ee r2 = (X.C127616ee) r2
            X.87k r1 = r2.A01
            r4 = 2
            X.7L2 r0 = new X.7L2
            r0.<init>(r2, r4)
            X.7I9 r3 = r1.BGe(r0)
            X.82x r2 = new X.82x
            r2.<init>(r6, r7, r5)
            X.82V r1 = new X.82V
            r1.<init>(r6, r7)
            X.7Hz r0 = new X.7Hz
            r0.<init>(r2, r1, r4)
            r3.CBv(r0)
            return
        L_0x0678:
            java.lang.Object r7 = r0.A02
            X.7G4 r7 = (X.AnonymousClass7G4) r7
            java.lang.Object r6 = r0.A03
            X.AEX r6 = (X.AEX) r6
            java.lang.Object r5 = r0.A04
            X.7Ki r5 = (X.C145197Ki) r5
            X.72F r4 = r7.A01
            X.1QQ r1 = r4.A04
            java.lang.String r0 = r6.A0F
            X.AEX r3 = r1.A03(r0)
            if (r3 == 0) goto L_0x06a0
            X.1KB r2 = r4.A01
            r1 = 38
            X.3Bz r0 = new X.3Bz
            r0.<init>(r7, r3, r1)
            r2.A0J(r0)
            X.AnonymousClass72F.A00(r3, r5, r4)
            return
        L_0x06a0:
            X.1KB r3 = r4.A01
            r0 = 39
            X.3Bz r2 = new X.3Bz
            r2.<init>(r7, r6, r0)
        L_0x06a9:
            r3.A0J(r2)
            return
        L_0x06ad:
            java.lang.Object r2 = r0.A02
            X.9mQ r2 = (X.C191329mQ) r2
            java.lang.Object r3 = r0.A03
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r1 = r0.A04
            X.AW0 r1 = (X.AW0) r1
            X.A6R r0 = r2.A03
            r2 = 0
            X.A6R.A01(r3, r1, r0, r2)
            X.1KB r1 = r0.A00
            r0 = 2131893974(0x7f121ed6, float:1.942274E38)
            r1.A08(r0, r2)
            return
        L_0x06c8:
            java.lang.Object r6 = r0.A02
            X.1gx r6 = (X.C32291gx) r6
            java.lang.Object r5 = r0.A03
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r3 = r0.A04
            X.1BI r3 = (X.AnonymousClass1BI) r3
            boolean r7 = r0.A00
            if (r5 != 0) goto L_0x06f8
            X.1gt r0 = r6.A07
            java.util.HashMap r1 = r0.A00
            monitor-enter(r1)
            java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x06f5 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x06f5 }
            if (r0 == 0) goto L_0x06f0
            java.lang.Object r0 = X.C29431cG.A0e(r0)     // Catch:{ all -> 0x06f5 }
            X.2m0 r0 = (X.C59252m0) r0     // Catch:{ all -> 0x06f5 }
            if (r0 == 0) goto L_0x06f0
            X.206 r5 = r0.A02     // Catch:{ all -> 0x06f5 }
            goto L_0x06f1
        L_0x06f0:
            r5 = 0
        L_0x06f1:
            monitor-exit(r1)
            if (r5 != 0) goto L_0x06f8
            return
        L_0x06f5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x06f8:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Map r1 = r6.A0J
            java.lang.Object r0 = r1.get(r3)
            r4 = 1
            if (r0 != 0) goto L_0x0736
            java.util.ArrayList r2 = r6.A06(r3, r4)
        L_0x0709:
            r1.put(r3, r2)
            X.0z4 r3 = r6.A0A
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "last_notification_hash"
            X.C17880vN.A1E(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "notification_hash"
            X.C17880vN.A1E(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "locked_chat_notification_hash"
            X.C17880vN.A1E(r1, r0, r2)
            java.lang.Integer r0 = r5.A0R
            if (r0 == 0) goto L_0x0731
            r0 = 1
            if (r7 != 0) goto L_0x0732
        L_0x0731:
            r0 = 0
        L_0x0732:
            r6.A0C(r5, r0, r4)
            return
        L_0x0736:
            X.2nW r0 = r6.A05(r5)
            r2.add(r0)
            X.3D2 r0 = new X.3D2
            r0.<init>(r4)
            java.util.Collections.sort(r2, r0)
            goto L_0x0709
        L_0x0746:
            java.lang.Object r4 = r0.A02
            X.2rF r4 = (X.C62342rF) r4
            java.lang.Object r3 = r0.A03
            X.23N r3 = (X.AnonymousClass23N) r3
            java.lang.Object r2 = r0.A04
            X.206 r2 = (X.AnonymousClass206) r2
            boolean r1 = r0.A00
            X.00H r0 = r4.A06
            java.lang.Object r0 = r0.get()
            X.2nT r0 = (X.C60152nT) r0
            r0.A05(r2, r3, r1)
            r4.A01(r3)
            return
        L_0x0763:
            java.lang.Object r3 = r0.A02
            X.6wq r3 = (X.C138296wq) r3
            boolean r2 = r0.A00
            java.lang.Object r1 = r0.A03
            X.1NV r1 = (X.AnonymousClass1NV) r1
            java.lang.Object r0 = r0.A04
            X.89C r0 = (X.AnonymousClass89C) r0
            X.C138296wq.A00(r0, r3, r1, r2)
            return
        L_0x0775:
            java.lang.Object r5 = r0.A02
            X.3TB r5 = (X.AnonymousClass3TB) r5
            boolean r4 = r0.A00
            java.lang.Object r3 = r0.A03
            X.1EC r3 = (X.AnonymousClass1EC) r3
            java.lang.Object r1 = r0.A04
            r0 = 3
            X.C18070vi.A0d(r1, r0)
            X.1kb r1 = r5.A00
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1MZ r0 = r1.A06
            boolean r2 = r0.A0K(r3)
            X.1EC r1 = r1.A04(r3)
            if (r1 == 0) goto L_0x07a6
            X.1M9 r0 = r5.A01
            X.1E7 r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x07a6
            boolean r0 = X.C62822s3.A02(r0)
            r1 = 1
            if (r0 != 0) goto L_0x07a7
        L_0x07a6:
            r1 = 0
        L_0x07a7:
            X.4UJ r0 = new X.4UJ
            r0.<init>(r4, r2, r1)
            r5.A0E(r0)
            return
        L_0x07b0:
            java.lang.Object r6 = r0.A02
            com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment r6 = (com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment) r6
            java.lang.Object r5 = r0.A03
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r4 = r0.A00
            java.lang.Object r3 = r0.A04
            X.206 r3 = (X.AnonymousClass206) r3
            X.0ve r2 = r6.A01
            if (r2 == 0) goto L_0x07e6
            java.lang.String r0 = "extension_menu_report"
            X.6q6 r1 = new X.6q6
            r1.<init>(r2, r5, r0, r4)
            r1.A01 = r5
            if (r3 == 0) goto L_0x07e4
            X.205 r0 = r3.A0v
        L_0x07cf:
            r1.A02 = r0
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r1.A00()
            X.1FL r1 = r6.A1B()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.C18070vi.A0z(r1, r0)
            X.1FR r1 = (X.AnonymousClass1FR) r1
            r1.CMl(r2)
            return
        L_0x07e4:
            r0 = 0
            goto L_0x07cf
        L_0x07e6:
            X.AnonymousClass3MW.A1A()
            r0 = 0
            throw r0
        L_0x07eb:
            java.lang.Object r3 = r0.A02
            X.1Kn r3 = (X.C24491Kn) r3
            java.lang.Object r2 = r0.A03
            X.2rg r2 = (X.C62612rg) r2
            boolean r1 = r0.A00
            java.lang.Object r0 = r0.A04
            X.1Kj r0 = (X.C24451Kj) r0
            X.C24491Kn.A04(r2, r3, r0, r1)
            return
        L_0x07fd:
            java.lang.Object r1 = r0.A02
            X.30x r1 = (X.C678030x) r1
            java.lang.Object r8 = r0.A03
            X.2m6 r8 = (X.C59312m6) r8
            boolean r7 = r0.A00
            java.lang.Object r6 = r0.A04
            X.1RK r5 = r1.A01
            java.lang.Object r4 = r5.A0M
            monitor-enter(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x084d }
            java.lang.String r0 = "companion-device-manager/critical sync failed. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x084d }
            X.4Zh r0 = r8.A02     // Catch:{ all -> 0x084d }
            com.whatsapp.jid.DeviceJid r0 = r0.A08     // Catch:{ all -> 0x084d }
            X.C17900vP.A0b(r0, r1)     // Catch:{ all -> 0x084d }
            X.1Pw r0 = r5.A0A     // Catch:{ all -> 0x084d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x084d }
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r0)     // Catch:{ all -> 0x084d }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x084d }
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            X.C17880vN.A1D(r1, r0, r2)     // Catch:{ all -> 0x084d }
            r1 = 7
            X.35W r0 = new X.35W     // Catch:{ all -> 0x084d }
            r0.<init>((int) r1, (java.lang.Object) r8, (boolean) r7)     // Catch:{ all -> 0x084d }
            r5.notifyAllObservers(r0)     // Catch:{ all -> 0x084d }
            if (r7 == 0) goto L_0x083f
            java.lang.String r0 = "critical_sync_timeout"
            goto L_0x0841
        L_0x083f:
            java.lang.String r0 = "syncd_failure"
        L_0x0841:
            X.AnonymousClass1RK.A03(r5, r0)     // Catch:{ all -> 0x084d }
            X.1RE r0 = r5.A0G     // Catch:{ all -> 0x084d }
            X.1RD r0 = r0.A04     // Catch:{ all -> 0x084d }
            r0.unregisterObserver(r6)     // Catch:{ all -> 0x084d }
            monitor-exit(r4)     // Catch:{ all -> 0x084d }
            return
        L_0x084d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x084d }
            throw r0
        L_0x0850:
            java.lang.Object r8 = r0.A02
            X.1MW r8 = (X.AnonymousClass1MW) r8
            java.lang.Object r7 = r0.A03
            X.1E9 r7 = (X.AnonymousClass1E9) r7
            java.lang.Object r6 = r0.A04
            X.2sr r6 = (X.C63312sr) r6
            boolean r5 = r0.A00
            X.1Cd r0 = r8.A06
            X.1au r4 = r0.A05()
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x088d }
            X.1DL r1 = r8.A05     // Catch:{ all -> 0x0883 }
            com.whatsapp.jid.UserJid r0 = r6.A04     // Catch:{ all -> 0x0883 }
            long r1 = r1.A09(r0)     // Catch:{ all -> 0x0883 }
            r0 = 1
            X.AnonymousClass1MW.A08(r8, r7, r1, r0)     // Catch:{ all -> 0x0883 }
            if (r5 == 0) goto L_0x0879
            r8.A0I(r6, r7)     // Catch:{ all -> 0x0883 }
        L_0x0879:
            r3.A00()     // Catch:{ all -> 0x0883 }
            r3.close()     // Catch:{ all -> 0x088d }
            r4.close()
            return
        L_0x0883:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0888 }
            goto L_0x088c
        L_0x0888:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x088d }
        L_0x088c:
            throw r1     // Catch:{ all -> 0x088d }
        L_0x088d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0892 }
            throw r1
        L_0x0892:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0897:
            java.lang.Object r5 = r0.A02
            X.122 r5 = (X.AnonymousClass122) r5
            boolean r4 = r0.A00
            java.lang.Object r3 = r0.A03
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r0.A04
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1Lg r1 = r5.A0S
            if (r4 == 0) goto L_0x08ba
            r0 = 0
            r1.A05(r3, r0)
        L_0x08ad:
            X.00H r0 = r5.A19
            java.lang.Object r1 = r0.get()
            X.1Q1 r1 = (X.AnonymousClass1Q1) r1
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x08ba:
            r1.A00(r2)
            goto L_0x08ad
        L_0x08be:
            java.lang.Object r5 = r0.A02
            X.1Co r5 = (X.C22621Co) r5
            boolean r1 = r0.A00
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r3 = r0.A04
            X.1ci r3 = (X.C29691ci) r3
            if (r1 == 0) goto L_0x0919
            X.00H r0 = r5.A01
            java.lang.Object r0 = r0.get()
            X.1as r0 = (X.C28771as) r0
            X.1To r1 = r0.A02
            r0 = 0
            java.util.Set r2 = r1.A09(r4, r0)
        L_0x08dd:
            X.00H r1 = r5.A01
            java.lang.Object r0 = r1.get()
            X.1as r0 = (X.C28771as) r0
            X.1LW r0 = r0.A07
            r0.A0I(r3)
            java.lang.Object r0 = r1.get()
            X.1as r0 = (X.C28771as) r0
            X.1To r0 = r0.A02
            r0.A0R(r2)
            java.lang.Object r0 = r1.get()
            X.1as r0 = (X.C28771as) r0
            X.00H r0 = r0.A0N
            java.lang.Object r3 = r0.get()
            X.1Q1 r3 = (X.AnonymousClass1Q1) r3
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.00H r0 = r3.A00
            java.lang.Object r2 = r0.get()
            X.11A r2 = (X.AnonymousClass11A) r2
            r1 = 5
            X.3Bx r0 = new X.3Bx
            r0.<init>(r3, r4, r1)
            r2.A00(r0)
            return
        L_0x0919:
            java.util.Set r2 = java.util.Collections.emptySet()
            goto L_0x08dd
        L_0x091e:
            java.lang.Object r3 = r0.A02
            X.4aY r3 = (X.AnonymousClass4aY) r3
            boolean r1 = r0.A00
            java.lang.Object r5 = r0.A03
            X.4Zz r5 = (X.C88504Zz) r5
            java.lang.Object r4 = r0.A04
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r1 == 0) goto L_0x095c
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            X.1BI r4 = r3.A3R
            X.1E7 r0 = r3.A35
            boolean r0 = r0.A0C()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            X.4Xd r0 = r3.A2p
            java.lang.Integer r8 = X.C87464Vr.A00(r0)
            r9 = 0
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r2 = X.AnonymousClass4GY.A00(r4, r5, r6, r7, r8, r9)
            r1 = 10
            X.7S3 r0 = new X.7S3
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0D = r0
            X.5cQ r0 = r3.A2Q
            X.1GP r0 = r0.getSupportFragmentManager()
            X.C20098A7b.A01(r2, r0)
            return
        L_0x095c:
            boolean r0 = r3.A6z
            if (r0 == 0) goto L_0x097a
            com.whatsapp.mentions.MentionableEntry r1 = r3.A3Z
            r0 = 0
            r1.setFocusableInTouchMode(r0)
            r0 = 11
            X.4mP r4 = new X.4mP
            r4.<init>(r3, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            X.4Xd r0 = r3.A2p
            java.lang.Integer r1 = X.C87464Vr.A00(r0)
            r0 = 1
            X.AnonymousClass4aY.A1U(r3, r4, r2, r1, r0)
            return
        L_0x097a:
            X.10I r2 = r5.A05
            r1 = 31
            X.3Bw r0 = new X.3Bw
            r0.<init>(r5, r4, r1)
            r2.CGF(r0)
            X.4aI r2 = X.C88444Zs.A01(r3)
            r1 = 0
            r0 = 1
            X.C88654aI.A03(r2, r4, r1, r0, r0)
            X.4Xd r0 = r3.A2p
            X.AnonymousClass4aY.A1S(r3, r0)
            return
        L_0x0995:
            java.lang.Object r2 = r0.A02
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r1 = r0.A03
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r10 = r0.A04
            boolean r5 = r0.A00
            r2.A09()
            android.content.SharedPreferences r4 = X.C32951i1.A00(r2)
            java.lang.String r0 = r1.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_integrity"
            java.lang.String r8 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "0,null,null,0,null"
            java.lang.String r0 = r4.getString(r8, r0)
            java.lang.String r9 = ","
            java.lang.String[] r1 = r0.split(r9)
            r0 = 0
            long r11 = X.C63782tg.A01(r1, r0)
            r0 = 3
            long r2 = X.C63782tg.A01(r1, r0)
            r0 = 1
            X.C63782tg.A03(r1, r0)
            r0 = 2
            X.C63782tg.A02(r1, r0)
            r7 = 4
            java.lang.Boolean r6 = X.C63782tg.A02(r1, r7)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r0 = 5
            java.io.Serializable[] r1 = new java.io.Serializable[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            X.AnonymousClass001.A1Q(r0, r10, r1)
            r0 = 2
            r1[r0] = r5
            X.C17890vO.A1O(r1, r2)
            r1[r7] = r6
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r9, r0)
            X.C17880vN.A1E(r4, r8, r0)
            return
        L_0x09ff:
            boolean r4 = r0.A00
            java.lang.Object r3 = r0.A02
            X.1Tv r3 = (X.C26881Tv) r3
            java.lang.Object r2 = r0.A03
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r1 = r0.A04
            X.1BI r1 = (X.AnonymousClass1BI) r1
            if (r4 != 0) goto L_0x0a12
            r3.A00(r2)
        L_0x0a12:
            X.1Lf r0 = r3.A02
            r0.A01(r1)
            r0.A00(r1)
            return
        L_0x0a1b:
            java.lang.Object r5 = r0.A02
            X.1FP r5 = (X.AnonymousClass1FP) r5
            java.lang.Object r4 = r0.A03
            X.3XL r4 = (X.AnonymousClass3XL) r4
            java.lang.Object r3 = r0.A04
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0a2f
            r4.A0U(r3)
            return
        L_0x0a2f:
            X.10I r2 = r5.A05
            r1 = 42
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r5, r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x0a3c:
            java.lang.Object r7 = r0.A02
            X.A99 r7 = (X.A99) r7
            java.lang.Object r4 = r0.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r6 = r0.A04
            com.whatsapp.voipcalling.CallInfo r6 = (com.whatsapp.voipcalling.CallInfo) r6
            X.2hy r1 = r7.A2G
            boolean r0 = r6.isLidCall()
            com.whatsapp.jid.UserJid r3 = r1.A00(r4, r0)
            X.1VI r2 = r7.A2P
            java.lang.String r1 = "voip/inviteToGroupCall"
            X.1MR r0 = r2.A00
            java.util.HashSet r0 = r0.A0A(r3)
            com.whatsapp.voipcalling.CallParticipantJid r0 = X.AnonymousClass1VI.A00(r2, r3, r1, r0)
            int r3 = com.whatsapp.voipcalling.Voip.inviteToGroupCall(r0)
            if (r3 == 0) goto L_0x0ab6
            r0 = 670021(0xa3945, float:9.389E-40)
            if (r3 == r0) goto L_0x0ab6
            r0 = 670038(0xa3956, float:9.38923E-40)
            if (r3 == r0) goto L_0x0ab6
            X.1Me r9 = r7.A2V
            X.1M9 r10 = r7.A2T
            X.1E7 r0 = r10.A0H(r4)
            java.lang.String r2 = X.AnonymousClass3MY.A0q(r9, r0)
            android.content.Context r8 = r7.A1r
            r1 = 2131897251(0x7f122ba3, float:1.9429386E38)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r4 = 0
            java.lang.String r1 = X.C17880vN.A0q(r8, r2, r0, r4, r1)
            r0 = 670033(0xa3951, float:9.38916E-40)
            if (r3 != r0) goto L_0x0aaf
            X.1HQ r0 = r7.A29
            com.whatsapp.voipcalling.CallInfo r3 = r0.BO3()
            if (r3 == 0) goto L_0x0aaf
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x0aaf
            r2 = 2131898265(0x7f122f99, float:1.9431443E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.whatsapp.jid.UserJid r0 = X.C108955ca.A0T(r3)
            X.1E7 r0 = r10.A0H(r0)
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r9, r0)
            java.lang.String r1 = X.C17880vN.A0q(r8, r0, r1, r4, r2)
        L_0x0aaf:
            r7.A12(r1)
        L_0x0ab2:
            r6.getInitialPeerJid()
            return
        L_0x0ab6:
            X.00H r0 = r7.A3Q
            java.lang.Object r0 = r0.get()
            X.2nK r0 = (X.C60062nK) r0
            r0.A02(r4)
            goto L_0x0ab2
        L_0x0ac2:
            java.lang.Object r3 = r0.A02
            X.8CR r3 = (X.AnonymousClass8CR) r3
            java.lang.Object r2 = r0.A03
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            java.lang.Object r1 = r0.A04
            android.net.Network r1 = (android.net.Network) r1
            boolean r0 = r0.A00
            r3.A00(r1, r2, r0)
            return
        L_0x0ad4:
            java.lang.Object r7 = r0.A02
            X.1pj r7 = (X.C37551pj) r7
            java.lang.Object r6 = r0.A03
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.A04
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            r4 = 1
            r3 = 2131887179(0x7f12044b, float:1.9408958E38)
            X.1KB r2 = r7.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.1Me r0 = r7.A05
            java.lang.String r0 = r0.A0I(r5)
            java.lang.String r0 = X.C108975cc.A0b(r6, r0, r1, r3)
            r2.A0H(r0, r4)
            return
        L_0x0af6:
            java.lang.Object r2 = r0.A02
            X.1ml r2 = (X.C35761ml) r2
            java.lang.Object r1 = r0.A03
            X.63p r1 = (X.C1184763p) r1
            java.lang.Object r3 = r0.A04
            X.1BI r3 = (X.AnonymousClass1BI) r3
            boolean r9 = X.C72453Mb.A1Z(r1)
            X.C35761ml.A00(r2, r1)
            X.A5M r2 = r2.A02
            r7 = 10
            r8 = 20
            r4 = 0
            r6 = r4
            r5 = r4
            r10 = r9
            r2.A03(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0b17:
            java.lang.Object r6 = r0.A02
            X.9co r6 = (X.C185579co) r6
            java.lang.Object r5 = r0.A03
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r4 = r0.A00
            java.lang.Object r3 = r0.A04
            X.8tf r3 = (X.C172588tf) r3
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            com.whatsapp.jid.UserJid r2 = r0.A00(r5)
            X.1Ty r1 = r6.A00
            boolean r0 = r1.A0K(r2)
            if (r0 == 0) goto L_0x0b3f
            if (r4 != 0) goto L_0x0b3f
            r3.A05()
            return
        L_0x0b3f:
            X.AMl r0 = new X.AMl
            r0.<init>(r6, r3, r5, r2)
            r1.A0D(r0, r5)
            return
        L_0x0b48:
            java.lang.Object r5 = r0.A02
            X.1Ty r5 = (X.C26911Ty) r5
            java.lang.Object r4 = r0.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r3 = r0.A00
            java.lang.Object r2 = r0.A04
            X.BAF r2 = (X.BAF) r2
            X.AEW r1 = r5.A08(r4)
            X.0vl r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            X.A2z r0 = (X.C20009A2z) r0
            r0.A05(r2, r1, r4, r3)
            return
        L_0x0b66:
            java.lang.Object r5 = r0.A02
            X.1Hj r5 = (X.C23721Hj) r5
            java.lang.Object r4 = r0.A03
            boolean r3 = r0.A00
            java.lang.Object r2 = r0.A04
            X.1Be r2 = (X.AnonymousClass1Be) r2
            X.1eO r1 = new X.1eO
            r1.<init>()
            java.lang.String r0 = X.C108955ca.A0x(r4)
            r1.A02 = r0
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.1Wc r0 = (X.C27441Wc) r0
            java.lang.Long r0 = r0.A00()
            r1.A01 = r0
            int r0 = X.C72453Mb.A04(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r5.A06
            r0.CC8(r1, r2)
            return
        L_0x0b9b:
            boolean r4 = r0.A00
            java.lang.Object r3 = r0.A02
            X.C6E r3 = (X.C6E) r3
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A04
            java.lang.Exception r1 = (java.lang.Exception) r1
            if (r4 == 0) goto L_0x0bad
            r3.A01(r2)
            return
        L_0x0bad:
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x0bb4
            X.C28111Yx.A02(r1)
        L_0x0bb4:
            r3.A00(r1)
            return
        L_0x0bb8:
            java.lang.Object r4 = r0.A03     // Catch:{ InterruptedException -> 0x0d10 }
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4     // Catch:{ InterruptedException -> 0x0d10 }
            X.17x r1 = r4.A0U     // Catch:{ InterruptedException -> 0x0d10 }
            boolean r8 = r1.A0D()     // Catch:{ InterruptedException -> 0x0d10 }
        L_0x0bc2:
            boolean r1 = r0.A00     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 != 0) goto L_0x0d16
            java.lang.Object r2 = r0.A02     // Catch:{ InterruptedException -> 0x0d10 }
            java.util.Stack r2 = (java.util.Stack) r2     // Catch:{ InterruptedException -> 0x0d10 }
            int r1 = r2.size()     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 != 0) goto L_0x0bd5
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0d10 }
            r2.wait()     // Catch:{ all -> 0x0d0a }
            monitor-exit(r2)     // Catch:{ all -> 0x0d0a }
        L_0x0bd5:
            boolean r1 = r0.A00     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 != 0) goto L_0x0d16
            int r1 = r2.size()     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 == 0) goto L_0x0bc2
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0d10 }
            java.lang.Object r3 = r2.pop()     // Catch:{ all -> 0x0d0d }
            X.6r9 r3 = (X.C134786r9) r3     // Catch:{ all -> 0x0d0d }
            monitor-exit(r2)     // Catch:{ all -> 0x0d0d }
            X.21V r2 = r3.A01     // Catch:{ InterruptedException -> 0x0d10 }
            X.2rc r5 = X.AnonymousClass206.A00(r2)     // Catch:{ InterruptedException -> 0x0d10 }
            java.io.File r6 = r5.A0G     // Catch:{ InterruptedException -> 0x0d10 }
            r10 = 0
            if (r6 == 0) goto L_0x0d05
            if (r8 == 0) goto L_0x0d05
            boolean r1 = r2 instanceof X.C438421d     // Catch:{ InterruptedException -> 0x0d10 }
            r15 = 1
            if (r1 != 0) goto L_0x0c42
            boolean r1 = r2 instanceof X.AnonymousClass22W     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 != 0) goto L_0x0c42
            int r1 = r2.A0u     // Catch:{ InterruptedException -> 0x0d10 }
            boolean r1 = X.AnonymousClass72Z.A00(r1)     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 == 0) goto L_0x0d00
            boolean r1 = r2.A0w()     // Catch:{ OutOfMemoryError -> 0x0c3f }
            if (r1 == 0) goto L_0x0c32
            X.1c4 r1 = r4.A0s     // Catch:{ OutOfMemoryError -> 0x0c3f }
            boolean r1 = r1.A0B()     // Catch:{ OutOfMemoryError -> 0x0c3f }
            if (r1 == 0) goto L_0x0c32
            X.1Lp r1 = r4.A0J     // Catch:{ OutOfMemoryError -> 0x0c3f }
            X.1ga r5 = r1.A05()     // Catch:{ OutOfMemoryError -> 0x0c3f }
            android.net.Uri r1 = android.net.Uri.fromFile(r6)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            java.lang.StringBuilder r2 = X.C18070vi.A0K(r1)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            r2.append(r1)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            java.lang.String r1 = "-video_autoplay_view"
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            java.lang.Object r9 = r5.A0A(r1)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch:{ OutOfMemoryError -> 0x0c3f }
            if (r9 != 0) goto L_0x0cf3
        L_0x0c32:
            android.graphics.Bitmap r9 = X.C1408873l.A01(r6)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            if (r9 != 0) goto L_0x0cf3
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/fillView/bitmap/null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x0c3f }
            goto L_0x0d00
        L_0x0c3f:
            r2 = move-exception
            goto L_0x0cf8
        L_0x0c42:
            boolean r1 = com.whatsapp.mediaview.MediaViewFragment.A0i(r4, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 == 0) goto L_0x0c9e
            X.00H r1 = r4.A1O     // Catch:{ InterruptedException -> 0x0d10 }
            X.6ub r6 = X.C108945cZ.A0j(r1)     // Catch:{ InterruptedException -> 0x0d10 }
            X.0vc r2 = r6.A05     // Catch:{ InterruptedException -> 0x0d10 }
            X.11C r1 = r6.A00     // Catch:{ InterruptedException -> 0x0d10 }
            int r7 = X.C24191Jf.A02(r1, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            X.0ve r6 = r6.A02     // Catch:{ InterruptedException -> 0x0d10 }
            r2 = 3303(0xce7, float:4.628E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ InterruptedException -> 0x0d10 }
            int r1 = X.C18020vd.A00(r1, r6, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            if (r7 < r1) goto L_0x0c9e
            int r1 = r5.A08     // Catch:{ InterruptedException -> 0x0d10 }
            r2 = 6000(0x1770, float:8.408E-42)
            int r7 = java.lang.Math.min(r1, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            int r1 = r5.A06     // Catch:{ InterruptedException -> 0x0d10 }
            int r6 = java.lang.Math.min(r1, r2)     // Catch:{ InterruptedException -> 0x0d10 }
        L_0x0c70:
            X.0ve r2 = r4.A0e     // Catch:{ InterruptedException -> 0x0d10 }
            X.1FL r1 = r4.A1D()     // Catch:{ InterruptedException -> 0x0d10 }
            android.view.WindowManager r1 = r1.getWindowManager()     // Catch:{ InterruptedException -> 0x0d10 }
            java.lang.Long r11 = X.C84034Hp.A00(r1, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            if (r11 != 0) goto L_0x0c89
            int r7 = r7 * r6
            long r1 = (long) r7     // Catch:{ InterruptedException -> 0x0d10 }
            r6 = 4
            long r1 = r1 * r6
            java.lang.Long r11 = java.lang.Long.valueOf(r1)     // Catch:{ InterruptedException -> 0x0d10 }
        L_0x0c89:
            java.io.File r1 = r5.A0G     // Catch:{ InterruptedException -> 0x0d10 }
            if (r1 == 0) goto L_0x0cc5
            r14 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            X.25O r9 = new X.25O     // Catch:{ InterruptedException -> 0x0d10 }
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ InterruptedException -> 0x0d10 }
            X.25P r1 = X.AnonymousClass204.A0A(r9, r1)     // Catch:{ InterruptedException -> 0x0d10 }
            android.graphics.Bitmap r9 = r1.A02     // Catch:{ InterruptedException -> 0x0d10 }
            goto L_0x0cc6
        L_0x0c9e:
            com.whatsapp.mediaview.PhotoView r1 = r3.A00     // Catch:{ InterruptedException -> 0x0d10 }
            int r7 = r1.getWidth()     // Catch:{ InterruptedException -> 0x0d10 }
            int r6 = r1.getHeight()     // Catch:{ InterruptedException -> 0x0d10 }
            if (r7 == 0) goto L_0x0cac
            if (r6 != 0) goto L_0x0c70
        L_0x0cac:
            android.content.Context r1 = r4.A14()     // Catch:{ InterruptedException -> 0x0d10 }
            android.view.WindowManager r1 = X.AnonymousClass11C.A01(r1)     // Catch:{ InterruptedException -> 0x0d10 }
            android.view.Display r2 = r1.getDefaultDisplay()     // Catch:{ InterruptedException -> 0x0d10 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ InterruptedException -> 0x0d10 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0d10 }
            r2.getSize(r1)     // Catch:{ InterruptedException -> 0x0d10 }
            int r7 = r1.x     // Catch:{ InterruptedException -> 0x0d10 }
            int r6 = r1.y     // Catch:{ InterruptedException -> 0x0d10 }
            goto L_0x0c70
        L_0x0cc5:
            r9 = r10
        L_0x0cc6:
            java.io.File r1 = r5.A0G     // Catch:{ IOException -> 0x0cd6 }
            java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0cd6 }
            X.CxM r1 = new X.CxM     // Catch:{ IOException -> 0x0cd6 }
            r1.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x0cd6 }
            int r1 = r1.A0Z(r15)     // Catch:{ IOException -> 0x0cd6 }
            goto L_0x0cdd
        L_0x0cd6:
            r2 = move-exception
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/getExif"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            r1 = 1
        L_0x0cdd:
            if (r9 == 0) goto L_0x0d00
            if (r1 == r15) goto L_0x0cf3
            int r12 = r9.getWidth()     // Catch:{ InterruptedException -> 0x0d10 }
            int r13 = r9.getHeight()     // Catch:{ InterruptedException -> 0x0d10 }
            android.graphics.Matrix r14 = X.C26511Sk.A08(r1)     // Catch:{ InterruptedException -> 0x0d10 }
            r10 = 0
            r11 = r10
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x0d10 }
        L_0x0cf3:
            r0.A00(r9, r3)     // Catch:{ InterruptedException -> 0x0d10 }
            goto L_0x0bc2
        L_0x0cf8:
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/oom"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ InterruptedException -> 0x0d10 }
            java.lang.System.gc()     // Catch:{ InterruptedException -> 0x0d10 }
        L_0x0d00:
            r0.A00(r10, r3)     // Catch:{ InterruptedException -> 0x0d10 }
            goto L_0x0bc2
        L_0x0d05:
            r0.A00(r10, r3)     // Catch:{ InterruptedException -> 0x0d10 }
            goto L_0x0bc2
        L_0x0d0a:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0d0a }
            goto L_0x0d0f
        L_0x0d0d:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0d0d }
        L_0x0d0f:
            throw r1     // Catch:{ InterruptedException -> 0x0d10 }
        L_0x0d10:
            r2 = move-exception
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/e = "
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0d16:
            java.lang.Object r0 = r0.A02
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.clear()
            return
        L_0x0d1e:
            X.1Me r0 = r9.A2V
            X.0vb r0 = r0.A02
            java.lang.String r2 = X.C60592oI.A00(r0, r5, r4)
            android.content.Context r1 = r9.A1r
            r0 = 2131897251(0x7f122ba3, float:1.9429386E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r2, r4, r3, r0)
            r9.A12(r0)
            return
        L_0x0d33:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0d36:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0d36 }
            throw r0
        L_0x0d39:
            r4.clear()
            return
        L_0x0d3d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0d3d }
            throw r0
        L_0x0d40:
            java.lang.Object r2 = r0.A02
            X.73a r2 = (X.C1407773a) r2
            java.lang.Object r3 = r0.A03
            X.22g r3 = (X.C441322g) r3
            boolean r7 = r0.A00
            java.lang.Object r5 = r0.A04
            X.70H r0 = r2.A0D
            X.77d r4 = r0.A01(r3)
            X.1KB r0 = r2.A06
            r6 = 10
            X.Ak4 r1 = new X.Ak4
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x0d5b:
            r0.A0J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RT.run():void");
    }

    public AnonymousClass7RT(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A00 = z;
    }

    public AnonymousClass7RT(A99 a99, UserJid userJid, CallInfo callInfo) {
        this.A01 = 11;
        this.A02 = a99;
        this.A03 = userJid;
        this.A04 = callInfo;
        this.A00 = true;
    }

    public AnonymousClass7RT(MediaViewFragment mediaViewFragment) {
        this.A01 = 32;
        this.A03 = mediaViewFragment;
        this.A02 = new Stack();
        this.A04 = new C201010v(this, "PhotoLoader");
    }

    public AnonymousClass7RT(AEX aex, AnonymousClass7G4 r3, C145197Ki r4) {
        this.A01 = 37;
        this.A02 = r3;
        this.A03 = aex;
        this.A00 = true;
        this.A04 = r4;
    }

    public AnonymousClass7RT(Activity activity, C37551pj r3, AnonymousClass1E7 r4) {
        this.A01 = 8;
        this.A00 = true;
        this.A02 = r3;
        this.A03 = activity;
        this.A04 = r4;
    }

    public AnonymousClass7RT(TextView textView, AW0 aw0, C191329mQ r4) {
        this.A01 = 36;
        this.A02 = r4;
        this.A03 = textView;
        this.A04 = aw0;
        this.A00 = true;
    }
}
