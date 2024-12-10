package com.whatsapp.newsletter.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1OZ;
import X.AnonymousClass1PT;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3KP;
import X.C000100c;
import X.C166418cr;
import X.C17890vO;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C22488B9u;
import X.C22971Dz;
import X.C29681ch;
import X.C31851gE;
import X.C32331h1;
import X.C32981i4;
import X.C57282ip;
import X.C57562jH;
import X.C62162qt;
import android.content.Context;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class SendNewsletterMessageJob extends Job implements C22488B9u {
    public static final ConcurrentHashMap A0D = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient AnonymousClass11P A00;
    public transient C32981i4 A01;
    public transient C18030ve A02;
    public transient C29681ch A03;
    public transient C57282ip A04;
    public transient C166418cr A05;
    public transient AnonymousClass1W6 A06;
    public transient long A07;
    public transient C32331h1 A08;
    public transient AnonymousClass1OZ A09;
    public transient AnonymousClass1PT A0A;
    public transient C57562jH A0B;
    public transient boolean A0C;
    public final long expireTimeMs;
    public final int fMessageType;
    public String fmsgKeyId;
    public final boolean isEditMessage;
    public final String newsletterRawJid;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2SD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.2SD, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendNewsletterMessageJob(X.C29681ch r7, X.C166418cr r8, java.lang.String r9, int r10, long r11, boolean r13) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = r7.getRawString()
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = X.AnonymousClass3EC.A00(r1)
            r6.<init>(r0)
            r6.A03 = r7
            r6.fmsgKeyId = r9
            r6.expireTimeMs = r11
            r6.fMessageType = r10
            r6.isEditMessage = r13
            r6.A05 = r8
            java.lang.String r5 = r7.getRawString()
            r6.newsletterRawJid = r5
            java.util.concurrent.ConcurrentHashMap r4 = A0D
            monitor-enter(r4)
            X.1ch r0 = r6.A03     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = r6.fmsgKeyId     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0053 }
            X.2SD r0 = new X.2SD     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            r0.A00 = r1     // Catch:{ all -> 0x0053 }
            r0.A01 = r2     // Catch:{ all -> 0x0053 }
            boolean r0 = r4.containsKey(r0)     // Catch:{ all -> 0x0053 }
            r6.A0C = r0     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r6.fmsgKeyId     // Catch:{ all -> 0x0053 }
            X.2SD r0 = new X.2SD     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            r0.A00 = r5     // Catch:{ all -> 0x0053 }
            r0.A01 = r1     // Catch:{ all -> 0x0053 }
            r4.put(r0, r3)     // Catch:{ all -> 0x0053 }
            monitor-exit(r4)
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.jobqueue.job.SendNewsletterMessageJob.<init>(X.1ch, X.8cr, java.lang.String, int, long, boolean):void");
    }

    public boolean A0C(Exception exc) {
        C18070vi.A0d(exc, 0);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sendNewsletterMessageJob/exception while sending message");
        C17890vO.A13(A01(), A10, exc);
        if (!(exc.getCause() instanceof C31851gE)) {
            return true;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("sendNewsletterMessageJob/Cannot send message due to large payload ");
        C17890vO.A1B(A102, A01());
        A02((AnonymousClass206) null);
        return false;
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H.CP7();
        this.A02 = A0H.BAL();
        this.A09 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A06 = (AnonymousClass1W6) r1.A3w.get();
        this.A04 = (C57282ip) r1.A6a.get();
        this.A01 = (C32981i4) r1.A3G.get();
        this.A0A = (AnonymousClass1PT) r1.A6U.get();
        this.A08 = (C32331h1) r1.A6d.get();
        this.A0B = (C57562jH) r1.A7P.get();
    }

    private final String A01() {
        String A072 = C22971Dz.A07(this.newsletterRawJid);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; id=");
        A10.append(this.fmsgKeyId);
        A10.append("; jid=");
        A10.append(A072);
        C17900vP.A0q(A10, this);
        return A10.toString();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2SD, java.lang.Object] */
    private final void A02(AnonymousClass206 r6) {
        C32331h1 r4 = this.A08;
        if (r4 == null) {
            C18070vi.A11("messageStatusStoreBridge");
            throw null;
        }
        r4.A01((AnonymousClass3KP) null, AnonymousClass205.A01(this.A03, this.fmsgKeyId, true), 21);
        if (r6 != null) {
            C57562jH r0 = this.A0B;
            if (r0 == null) {
                C18070vi.A11("newsletterMessageObservers");
                throw null;
            }
            r0.A00(r6);
        }
        ConcurrentHashMap concurrentHashMap = A0D;
        String rawString = this.A03.getRawString();
        String str = this.fmsgKeyId;
        ? obj = new Object();
        obj.A00 = rawString;
        obj.A01 = str;
        concurrentHashMap.remove(obj);
    }

    public void A08() {
        if (!C22971Dz.A0V(this.A03)) {
            throw AnonymousClass000.A0n("Trying to send not E2Ee message outside of channels");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.1MD[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.1MD[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: X.1ca} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r0v105, types: [X.2SD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b0, code lost:
        if (((X.AnonymousClass210) r5).A07 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x027e, code lost:
        if (r12 != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r19.length == 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0441, code lost:
        if (r14 != null) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b2, code lost:
        if (r5 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00eb, code lost:
        if ((r5 instanceof X.AnonymousClass22E) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ff, code lost:
        if (r1 != false) goto L_0x0101;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r20 = this;
            r7 = r20
            X.11P r0 = r7.A00
            r6 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)
            throw r6
        L_0x000e:
            long r8 = android.os.SystemClock.uptimeMillis()
            long r3 = r7.A07
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            r7.A07 = r8
        L_0x001c:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendNewsletterMessageJob/e2e messasge job is duplicate skipping "
        L_0x0027:
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1B(r1, r0)
            return
        L_0x0032:
            X.8cr r0 = r7.A05
            if (r0 == 0) goto L_0x006b
            byte[] r19 = r0.A0M()
            r0 = r19
            int r1 = r0.length
            r0 = 0
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 1
        L_0x0041:
            r8 = 1
            if (r0 == 0) goto L_0x006e
            int r1 = r7.fMessageType
            r0 = 15
            if (r1 == r0) goto L_0x006e
            r0 = 64
            if (r1 == r0) goto L_0x006e
            r0 = 56
            if (r1 == r0) goto L_0x006e
            r0 = 67
            if (r1 == r0) goto L_0x006e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendNewsletterMessageJob/e2e messasge is empty - skipping "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1B(r1, r0)
            r7.A02(r6)
            return
        L_0x006b:
            r19 = r6
            goto L_0x0040
        L_0x006e:
            X.1ch r1 = r7.A03
            java.lang.String r0 = r7.fmsgKeyId
            X.205 r1 = X.AnonymousClass205.A01(r1, r0, r8)
            X.2ip r0 = r7.A04
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "messageReaderUtil"
        L_0x007c:
            X.C18070vi.A11(r0)
            throw r6
        L_0x0080:
            X.206 r5 = r0.A00(r1, r8)
            int r1 = r7.fMessageType
            r0 = 56
            if (r1 == r0) goto L_0x00b2
            r0 = 67
            if (r1 == r0) goto L_0x00b2
            if (r5 != 0) goto L_0x00ce
            r0 = 15
            if (r1 == r0) goto L_0x009c
            r0 = 64
            if (r1 == r0) goto L_0x009c
            boolean r0 = r7.isEditMessage
            if (r0 == 0) goto L_0x00b4
        L_0x009c:
            X.1W6 r3 = r7.A06
            if (r3 != 0) goto L_0x00a3
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x007c
        L_0x00a3:
            X.1ch r2 = r7.A03
            r1 = 0
            java.lang.String r0 = r7.fmsgKeyId
            X.205 r1 = X.AnonymousClass205.A01(r2, r0, r1)
            X.1W2 r0 = r3.A01
            X.206 r5 = r0.A05(r1)
        L_0x00b2:
            if (r5 != 0) goto L_0x00ce
        L_0x00b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendNewsletterMessageJob/message was deleted from message store "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1A(r1, r0)
            r5 = 0
            r7.A02(r6)
            r0 = 3
        L_0x00ca:
            r7.A0D(r5, r0, r8)
            return
        L_0x00ce:
            int r1 = r5.A0D()
            r0 = 4
            if (r1 != r0) goto L_0x00de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendNewsletterMessageJob/message received by server, skipping; "
            goto L_0x0027
        L_0x00de:
            boolean r0 = r5 instanceof X.AnonymousClass212
            r18 = r0
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r5 instanceof X.AnonymousClass227
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r5 instanceof X.AnonymousClass22E
            r2 = 1
            if (r0 == 0) goto L_0x00ee
        L_0x00ed:
            r2 = 0
        L_0x00ee:
            int r15 = r5.A0u
            r0 = 15
            if (r15 == r0) goto L_0x0118
            r0 = 64
            if (r15 == r0) goto L_0x0118
            r0 = 56
            if (r15 != r0) goto L_0x0111
            boolean r1 = r5 instanceof X.AnonymousClass227
        L_0x00fe:
            r0 = 1
            if (r1 == 0) goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            if (r2 != 0) goto L_0x013b
            if (r0 != 0) goto L_0x013b
            X.11P r0 = r7.A00
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)
            throw r6
        L_0x0111:
            r0 = 67
            if (r15 != r0) goto L_0x0101
            boolean r1 = r5 instanceof X.AnonymousClass22E
            goto L_0x00fe
        L_0x0118:
            boolean r1 = r5 instanceof X.AnonymousClass23N
            goto L_0x00fe
        L_0x011b:
            long r3 = X.AnonymousClass11P.A01(r0)
            long r1 = r7.expireTimeMs
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 < 0) goto L_0x0153
            java.lang.String r0 = "sendNewsletterMessageJob/message send job expired "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1A(r1, r0)
            r7.A02(r5)
            r0 = 5
            goto L_0x00ca
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendNewsletterMessageJob/unexpected message "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1A(r1, r0)
            r7.A02(r5)
            r0 = 11
            goto L_0x00ca
        L_0x0153:
            java.lang.String r0 = "sendNewsletterMessageJob/running message send job "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1A(r1, r0)
            X.2lD r2 = new X.2lD
            r2.<init>()
            X.1ch r0 = r7.A03
            r2.A02 = r0
            java.lang.String r4 = "message"
            r2.A06 = r4
            java.lang.String r0 = r7.fmsgKeyId
            r2.A08 = r0
            int r1 = r7.fMessageType
            r0 = 15
            if (r1 == r0) goto L_0x017b
            r0 = 64
            if (r1 != r0) goto L_0x017f
        L_0x017b:
            java.lang.String r0 = "8"
            r2.A07 = r0
        L_0x017f:
            boolean r14 = r5 instanceof X.AnonymousClass227
            if (r14 == 0) goto L_0x0194
            r0 = r5
            X.227 r0 = (X.AnonymousClass227) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0190
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0194
        L_0x0190:
            java.lang.String r0 = "7"
            r2.A07 = r0
        L_0x0194:
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = r5.A11(r0)
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = "3"
            r2.A07 = r0
        L_0x01a1:
            X.2nR r17 = r2.A00()
            r3 = 0
            boolean r1 = r5 instanceof X.AnonymousClass210
            if (r1 == 0) goto L_0x01b2
            r0 = r5
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r0 = r0.A07
            r2 = 1
            if (r0 != 0) goto L_0x01b3
        L_0x01b2:
            r2 = 0
        L_0x01b3:
            boolean r13 = r5 instanceof X.AnonymousClass21V
            boolean r0 = r5 instanceof X.AnonymousClass22H
            if (r0 != 0) goto L_0x0449
            boolean r0 = r5 instanceof X.AnonymousClass22E
            if (r0 != 0) goto L_0x0449
            if (r2 != 0) goto L_0x0445
            if (r13 != 0) goto L_0x0445
            java.lang.String r12 = "text"
        L_0x01c4:
            boolean r0 = r5 instanceof X.AnonymousClass23N
            java.lang.String r11 = "id"
            java.lang.String r8 = "type"
            java.lang.String r10 = "to"
            java.lang.String r16 = "plaintext"
            r9 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0225
            X.1ca r9 = new X.1ca
            r0 = r16
            r9.<init>(r0, r6)
            X.1ca r14 = A00(r5)
            r0 = 4
            X.1MD[] r13 = new X.AnonymousClass1MD[r0]
            X.1ch r0 = r7.A03
            java.lang.String r0 = r0.getRawString()
            X.C17880vN.A1Q(r10, r0, r13, r3)
            X.C17880vN.A1Q(r8, r12, r13, r2)
            X.205 r0 = r5.A0v
            java.lang.String r1 = r0.A01
            X.C18070vi.A0X(r1)
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r11, (java.lang.String) r1)
            r10 = 2
            r13[r10] = r0
            java.lang.String r8 = "edit"
            r0 = 8
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r8, (int) r0)
            r0 = 3
            r13[r0] = r1
            if (r14 == 0) goto L_0x0220
            X.1ca[] r0 = new X.C29621ca[r10]
            r0[r3] = r14
            r0[r2] = r9
        L_0x0211:
            X.1ca r9 = new X.1ca
            r9.<init>((java.lang.String) r4, (X.AnonymousClass1MD[]) r13, (X.C29621ca[]) r0)
        L_0x0216:
            X.1OZ r2 = r7.A09
            if (r2 != 0) goto L_0x044d
            java.lang.String r0 = "messageClient"
            X.C18070vi.A11(r0)
            throw r6
        L_0x0220:
            X.1ca[] r0 = new X.C29621ca[r2]
            r0[r3] = r9
            goto L_0x0211
        L_0x0225:
            if (r14 == 0) goto L_0x02a1
            r15 = r5
            X.227 r15 = (X.AnonymousClass227) r15
            X.1ch r14 = r7.A03
            java.lang.String r12 = r15.A01
            X.1W6 r13 = r7.A06
            if (r13 == 0) goto L_0x049f
            long r0 = r15.A02
            X.1W2 r13 = r13.A01
            X.206 r0 = r13.A03(r0)
            if (r0 == 0) goto L_0x048b
            r1 = 4
            X.1MD[] r13 = new X.AnonymousClass1MD[r1]
            X.205 r1 = r15.A0v
            java.lang.String r1 = r1.A01
            X.C18070vi.A0X(r1)
            X.C17880vN.A1Q(r11, r1, r13, r3)
            java.lang.String r1 = r14.getRawString()
            X.C17880vN.A1Q(r10, r1, r13, r2)
            java.lang.String r11 = "server_id"
            long r0 = r0.A0y
            X.1MD r10 = new X.1MD
            r10.<init>((java.lang.String) r11, (long) r0)
            r0 = 2
            r13[r0] = r10
            java.lang.String r10 = "reaction"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r8, (java.lang.String) r10)
            r0 = 3
            r13[r0] = r1
            java.util.ArrayList r11 = X.AnonymousClass1ZU.A06(r13)
            if (r12 == 0) goto L_0x0273
            int r0 = r12.length()
            if (r0 != 0) goto L_0x0280
        L_0x0273:
            java.lang.String r8 = "edit"
            r1 = 7
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r8, (int) r1)
            r11.add(r0)
            if (r12 == 0) goto L_0x028d
        L_0x0280:
            int r0 = r12.length()
            if (r0 == 0) goto L_0x028d
            X.1MD[] r9 = new X.AnonymousClass1MD[r2]
            java.lang.String r0 = "code"
            X.C17880vN.A1Q(r0, r12, r9, r3)
        L_0x028d:
            X.1MD[] r0 = new X.AnonymousClass1MD[r3]
            java.lang.Object[] r1 = r11.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            X.1ca r0 = new X.1ca
            r0.<init>(r10, r9)
            X.1ca r9 = new X.1ca
            r9.<init>((X.C29621ca) r0, (java.lang.String) r4, (X.AnonymousClass1MD[]) r1)
            goto L_0x0216
        L_0x02a1:
            boolean r0 = r5 instanceof X.AnonymousClass22E
            if (r0 == 0) goto L_0x0330
            r13 = r5
            X.22E r13 = (X.AnonymousClass22E) r13
            X.1ch r9 = r7.A03
            X.1W6 r12 = r7.A06
            if (r12 == 0) goto L_0x049f
            long r0 = r13.A02
            X.1W2 r12 = r12.A01
            X.206 r1 = r12.A03(r0)
            if (r1 == 0) goto L_0x0495
            r0 = 4
            X.1MD[] r12 = new X.AnonymousClass1MD[r0]
            X.205 r0 = r13.A0v
            java.lang.String r0 = r0.A01
            X.C18070vi.A0X(r0)
            X.C17880vN.A1Q(r11, r0, r12, r3)
            java.lang.String r0 = r9.getRawString()
            X.C17880vN.A1Q(r10, r0, r12, r2)
            java.lang.String r9 = "server_id"
            long r0 = r1.A0y
            X.1MD r10 = new X.1MD
            r10.<init>((java.lang.String) r9, (long) r0)
            r9 = 2
            r12[r9] = r10
            java.lang.String r0 = "poll"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r8, (java.lang.String) r0)
            r0 = 3
            r12[r0] = r1
            X.1ca r14 = A00(r13)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.List r0 = r13.A01
            if (r0 == 0) goto L_0x0310
            java.util.Iterator r10 = r0.iterator()
        L_0x02f3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0310
            java.lang.String r0 = X.C17880vN.A0v(r10)
            byte[] r8 = android.util.Base64.decode(r0, r9)
            X.C18070vi.A0X(r8)
            java.lang.String r1 = "vote"
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (byte[]) r8, (X.AnonymousClass1MD[]) r6)
            r11.add(r0)
            goto L_0x02f3
        L_0x0310:
            X.1ca[] r8 = X.C17890vO.A1Y(r11, r3)
            java.lang.String r0 = "votes"
            X.1ca r1 = new X.1ca
            r1.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r6, (X.C29621ca[]) r8)
            if (r14 == 0) goto L_0x032b
            X.1ca[] r0 = new X.C29621ca[r9]
            r0[r3] = r14
            r0[r2] = r1
        L_0x0324:
            X.1ca r9 = new X.1ca
            r9.<init>((java.lang.String) r4, (X.AnonymousClass1MD[]) r12, (X.C29621ca[]) r0)
            goto L_0x0216
        L_0x032b:
            X.1ca[] r0 = new X.C29621ca[r2]
            r0[r3] = r1
            goto L_0x0324
        L_0x0330:
            if (r18 != 0) goto L_0x04a5
            X.8cr r14 = r7.A05
            if (r14 != 0) goto L_0x0347
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to send newsletter message of type: "
            X.C17900vP.A0i(r0, r1, r15)
            X.8cr r0 = r7.A05
            if (r0 != 0) goto L_0x0216
            r7.A02(r5)
            return
        L_0x0347:
            if (r13 != 0) goto L_0x0352
            if (r1 == 0) goto L_0x0397
            r0 = r5
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0397
        L_0x0352:
            X.1i4 r0 = r7.A01
            if (r0 != 0) goto L_0x035c
            java.lang.String r0 = "deepLinkHelperBridge"
        L_0x0358:
            X.C18070vi.A11(r0)
            throw r6
        L_0x035c:
            java.lang.String r14 = X.A8F.A07(r0, r14)
            java.lang.String r0 = "sticker"
            boolean r0 = X.C18070vi.A18(r14, r0)
            if (r0 == 0) goto L_0x0441
            boolean r0 = r5 instanceof X.C441322g
            if (r0 == 0) goto L_0x0441
            X.0ve r15 = r7.A02
            if (r15 != 0) goto L_0x0374
            java.lang.String r0 = "abProps"
            goto L_0x0358
        L_0x0374:
            X.0vf r1 = X.C18040vf.A02
            r0 = 9895(0x26a7, float:1.3866E-41)
            boolean r0 = X.C18020vd.A05(r1, r15, r0)
            if (r0 == 0) goto L_0x0441
            r0 = r5
            X.22g r0 = (X.C441322g) r0
            X.73B r1 = r0.A05
            if (r1 == 0) goto L_0x0441
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x043d
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x0441
            java.lang.String r14 = "user_created_sticker"
        L_0x0390:
            X.1MD[] r9 = new X.AnonymousClass1MD[r2]
            java.lang.String r0 = "mediatype"
            X.C17880vN.A1Q(r0, r14, r9, r3)
        L_0x0397:
            r0 = 3
            X.1MD[] r14 = new X.AnonymousClass1MD[r0]
            X.1ch r0 = r7.A03
            java.lang.String r0 = r0.getRawString()
            X.C17880vN.A1Q(r10, r0, r14, r3)
            X.C17880vN.A1Q(r8, r12, r14, r2)
            X.205 r0 = r5.A0v
            java.lang.String r1 = r0.A01
            X.C18070vi.A0X(r1)
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r11, (java.lang.String) r1)
            r10 = 2
            r14[r10] = r0
            java.util.ArrayList r11 = X.AnonymousClass1ZU.A06(r14)
            r8 = 0
            if (r13 == 0) goto L_0x043b
            r0 = r5
            X.21V r0 = (X.AnonymousClass21V) r0
            if (r0 == 0) goto L_0x043b
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x043b
            java.lang.String r12 = r0.A0M
        L_0x03c7:
            X.36w r0 = X.C60502o8.A00(r5)
            if (r0 == 0) goto L_0x03cf
            java.lang.String r8 = r0.A07
        L_0x03cf:
            java.lang.String r1 = ""
            if (r12 == 0) goto L_0x03dd
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x03dd
            java.lang.String r1 = X.C17900vP.A0A(r1, r12)
        L_0x03dd:
            if (r8 == 0) goto L_0x03f9
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x03f9
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x03f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            r0 = 38
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)
        L_0x03f5:
            java.lang.String r1 = X.C17900vP.A0A(r1, r8)
        L_0x03f9:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0404
            java.lang.String r0 = "media_id"
            X.C17890vO.A11(r0, r1, r11)
        L_0x0404:
            int r8 = r5.A01
            if (r8 == 0) goto L_0x0412
            java.lang.String r1 = "edit"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (int) r8)
            r11.add(r0)
        L_0x0412:
            X.1ca r12 = A00(r5)
            X.1ca r8 = new X.1ca
            r1 = r19
            r0 = r16
            r8.<init>((java.lang.String) r0, (byte[]) r1, (X.AnonymousClass1MD[]) r9)
            X.1MD[] r0 = new X.AnonymousClass1MD[r3]
            java.lang.Object[] r1 = r11.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            if (r12 == 0) goto L_0x0436
            X.1ca[] r0 = new X.C29621ca[r10]
            r0[r3] = r12
            r0[r2] = r8
        L_0x042f:
            X.1ca r9 = new X.1ca
            r9.<init>((java.lang.String) r4, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r0)
            goto L_0x0216
        L_0x0436:
            X.1ca[] r0 = new X.C29621ca[r2]
            r0[r3] = r8
            goto L_0x042f
        L_0x043b:
            r12 = r6
            goto L_0x03c7
        L_0x043d:
            java.lang.String r14 = "1p_sticker"
            goto L_0x0390
        L_0x0441:
            if (r14 == 0) goto L_0x0397
            goto L_0x0390
        L_0x0445:
            java.lang.String r12 = "media"
            goto L_0x01c4
        L_0x0449:
            java.lang.String r12 = "poll"
            goto L_0x01c4
        L_0x044d:
            if (r9 == 0) goto L_0x0486
            r1 = 8
            r0 = r17
            X.1Ug r0 = r2.A08(r9, r0, r1)
            r0.get()
            java.util.concurrent.ConcurrentHashMap r4 = A0D
            X.1ch r0 = r7.A03
            java.lang.String r2 = r0.getRawString()
            java.lang.String r1 = r7.fmsgKeyId
            X.2SD r0 = new X.2SD
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r4.remove(r0)
            r0 = 1
            r7.A0D(r5, r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sendNewsletterMessageJob/message send job finished "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            X.C17890vO.A1A(r1, r0)
            return
        L_0x0486:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x048b:
            r7.A02(r15)
            java.lang.String r0 = "cant send react to message that doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0495:
            r7.A02(r13)
            java.lang.String r0 = "cant send poll vote to message that doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x049f:
            java.lang.String r0 = "fMessageDatabase"
            X.C18070vi.A11(r0)
            throw r6
        L_0x04a5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected Message add on is being sent in channel; type="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.jobqueue.job.SendNewsletterMessageJob.A0A():void");
    }

    public final void A0D(AnonymousClass206 r4, int i, boolean z) {
        if (r4 != null) {
            AnonymousClass1PT r2 = this.A0A;
            if (r2 == null) {
                C18070vi.A11("messageLoggingBridge");
                throw null;
            }
            C62162qt r1 = new C62162qt(r4);
            r1.A04 = i;
            r1.A03 = 1;
            r1.A02 = 1;
            r1.A00 = 1;
            r1.A0B = z;
            r2.A08(r1.A01());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C29621ca A00(X.AnonymousClass206 r4) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            boolean r0 = r4 instanceof X.AnonymousClass22H
            java.lang.String r1 = "polltype"
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "creation"
        L_0x000c:
            X.C17890vO.A11(r1, r0, r3)
        L_0x000f:
            X.36a r0 = X.C50382Uf.A00(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A07
            if (r0 != r1) goto L_0x0022
            java.lang.String r1 = "is_wamo_sub"
            java.lang.String r0 = "true"
            X.C17890vO.A11(r1, r0, r3)
        L_0x0022:
            boolean r0 = X.C17880vN.A1X(r3)
            r2 = 0
            if (r0 == 0) goto L_0x0039
            r0 = 0
            X.1MD[] r0 = new X.AnonymousClass1MD[r0]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            java.lang.String r0 = "meta"
            X.1ca r2 = new X.1ca
            r2.<init>(r0, r1)
        L_0x0039:
            return r2
        L_0x003a:
            boolean r0 = r4 instanceof X.AnonymousClass22E
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "vote"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.jobqueue.job.SendNewsletterMessageJob.A00(X.206):X.1ca");
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.2SD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.2SD, java.lang.Object] */
    private final void readObject(ObjectInputStream objectInputStream) {
        C166418cr r2;
        objectInputStream.defaultReadObject();
        C29681ch A012 = C29681ch.A03.A01(this.newsletterRawJid);
        if (A012 != null) {
            this.A03 = A012;
            try {
                Object readObject = objectInputStream.readObject();
                C18070vi.A0z(readObject, "null cannot be cast to non-null type kotlin.ByteArray");
                r2 = C166418cr.A01((byte[]) readObject);
                if (r2 == null) {
                    int i = this.fMessageType;
                    if (!(i == 15 || i == 64)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("sendNewsletterMessageJob/message must not be null ");
                        throw C17900vP.A06(A01(), A10);
                    }
                }
            } catch (OptionalDataException unused) {
                A01();
                r2 = null;
            }
            this.A05 = r2;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("sendNewsletterMessageJob/readObject done: ");
            C17890vO.A1A(A102, A01());
            ConcurrentHashMap concurrentHashMap = A0D;
            synchronized (concurrentHashMap) {
                C29681ch r0 = this.A03;
                String str = this.fmsgKeyId;
                String rawString = r0.getRawString();
                ? obj = new Object();
                obj.A00 = rawString;
                obj.A01 = str;
                this.A0C = concurrentHashMap.containsKey(obj);
                String str2 = this.newsletterRawJid;
                String str3 = this.fmsgKeyId;
                ? obj2 = new Object();
                obj2.A00 = str2;
                obj2.A01 = str3;
                concurrentHashMap.put(obj2, AnonymousClass000.A0i());
            }
            return;
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("sendNewsletterMessageJob/jid must not be null ");
        throw C17900vP.A06(A01(), A103);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C166418cr r0 = this.A05;
        if (r0 != null) {
            objectOutputStream.writeObject(r0.A0M());
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sendNewsletterMessageJob/e2e send job canceled");
        C17890vO.A1B(A10, A01());
        A02((AnonymousClass206) null);
    }
}
