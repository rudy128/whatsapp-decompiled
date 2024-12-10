package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.newsletter.jobqueue.job.SendNewsletterMessageJob;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2rF  reason: invalid class name and case insensitive filesystem */
public final class C62342rF {
    public final AnonymousClass11P A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C25001Mm A08;
    public final AnonymousClass1O2 A09;
    public final AnonymousClass1PT A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C62342rF r18, X.AnonymousClass206 r19) {
        /*
            r11 = r19
            X.205 r2 = r11.A0v
            boolean r0 = r2.A02
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x00d6
            X.1BI r9 = r2.A00
            boolean r0 = r9 instanceof X.C29681ch
            if (r0 == 0) goto L_0x00d1
            r8 = r18
            X.1CJ r2 = r8.A01
            X.00H r0 = r8.A05
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            r0 = r9
            X.1ch r0 = (X.C29681ch) r0
            boolean r0 = X.AnonymousClass4aS.A08(r2, r0, r1)
            r7 = 0
            if (r0 == 0) goto L_0x00d0
            X.00H r0 = r8.A0C
            java.lang.Object r3 = r0.get()
            X.2jH r3 = (X.C57562jH) r3
            X.00H r0 = r3.A02
            X.11A r2 = X.C17880vN.A0d(r0)
            r1 = 48
            X.AkP r0 = new X.AkP
            r0.<init>(r3, r11, r1)
            r2.A00(r0)
            X.00H r6 = r8.A07
            java.lang.Object r1 = r6.get()
            X.1hF r1 = (X.C32471hF) r1
            r4 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            if (r9 == 0) goto L_0x0096
            X.1Cd r0 = r1.A03
            X.1at r10 = r0.get()
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0084 }
            X.1LW r0 = r1.A00     // Catch:{ all -> 0x0084 }
            X.AnonymousClass1LW.A03(r0, r9, r3, r7)     // Catch:{ all -> 0x0084 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0084 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "SELECT server_message_id FROM newsletter_message  WHERE chat_row_id = ?  ORDER BY server_message_id DESC LIMIT 1 "
            java.lang.String r0 = "GET_LAST_SERVER_ID"
            android.database.Cursor r9 = X.C18070vi.A04(r2, r1, r0, r3)     // Catch:{ all -> 0x0084 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0072
            r2 = -1
            goto L_0x0079
        L_0x0072:
            java.lang.String r0 = "server_message_id"
            long r2 = X.C17890vO.A06(r9, r0)     // Catch:{ all -> 0x007d }
        L_0x0079:
            r9.close()     // Catch:{ all -> 0x0084 }
            goto L_0x008b
        L_0x007d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            X.CDX.A00(r10, r1)
            throw r0
        L_0x008b:
            r10.close()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0096
            r0 = 1
            long r2 = r2 + r0
            r4 = r2
        L_0x0096:
            r11.A0y = r4
            X.00H r0 = r8.A06
            java.lang.Object r10 = X.C18070vi.A0E(r0)
            X.2nT r10 = (X.C60152nT) r10
            X.11P r0 = r8.A00
            long r16 = X.AnonymousClass11P.A01(r0)
            r12 = 0
            r14 = r12
            r15 = r12
            r18 = r7
            r13 = r12
            r19 = r7
            r10.A03(r11, r12, r13, r14, r15, r16, r18, r19)
            java.lang.Object r0 = r6.get()
            X.1hF r0 = (X.C32471hF) r0
            boolean r0 = r0.A06(r11)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "NewsletterMessageManager/failed to insert a message"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x00c3:
            X.00H r0 = r8.A0B
            java.lang.Object r0 = r0.get()
            X.1W1 r0 = (X.AnonymousClass1W1) r0
            r0.CQy(r11)
            r0 = 1
            return r0
        L_0x00d0:
            return r7
        L_0x00d1:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r1)
            throw r0
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62342rF.A00(X.2rF, X.206):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2SD, java.lang.Object] */
    public final void A01(AnonymousClass206 r18) {
        AnonymousClass206 r3 = r18;
        AnonymousClass205 r0 = r3.A0v;
        C29681ch r10 = (C29681ch) r0.A00;
        if (r10 != null) {
            String str = r0.A01;
            ConcurrentHashMap concurrentHashMap = SendNewsletterMessageJob.A0D;
            String rawString = r10.getRawString();
            ? obj = new Object();
            obj.A00 = rawString;
            obj.A01 = str;
            if (!concurrentHashMap.containsKey(obj)) {
                this.A09.A03((DeviceJid) null, r3);
                long A012 = AnonymousClass11P.A01(this.A00) + 86400000;
                try {
                    C62032qg r5 = (C62032qg) this.A0D.get();
                    C166418cr r11 = null;
                    if (!(r3 instanceof AnonymousClass23N) && !(r3 instanceof AnonymousClass212)) {
                        AnonymousClass8X8 A002 = C166418cr.A00();
                        boolean A11 = r3.A11(131072);
                        C691536c A003 = C60492o7.A00(r3);
                        int i = r3.A01;
                        if (A11) {
                            C60492o7.A01(r3, (C691536c) null);
                            r3.A0c(131072);
                            r3.A01 = 0;
                        }
                        C18070vi.A0b(A002);
                        ((AnonymousClass12N) r5.A00.get()).A01(C181349Qd.A00(A002).A00(), r3);
                        if (A11) {
                            C60492o7.A01(r3, A003);
                            r3.A0b(131072);
                            r3.A01 = i;
                        }
                        r11 = (C166418cr) A002.A0C();
                    }
                    C25001Mm r4 = this.A08;
                    C18070vi.A0X(str);
                    r4.A01(new SendNewsletterMessageJob(r10, r11, str, r3.A0u, A012, r3.A11(131072)));
                } catch (AnonymousClass1T8 e) {
                    Log.e("NewsletterMessageManager/sendMessage/failed", e);
                    AnonymousClass1PT r2 = this.A0A;
                    C62162qt r1 = new C62162qt(r3);
                    r1.A04 = 13;
                    r1.A03 = 1;
                    r1.A02 = 1;
                    r1.A00 = 1;
                    r1.A0B = true;
                    r2.A08(r1.A01());
                }
            }
        }
    }

    public final void A02(AnonymousClass206 r4) {
        this.A02.CGF(new C21458AkP(this, r4, 25));
    }

    public C62342rF(C25001Mm r2, AnonymousClass11P r3, AnonymousClass1CJ r4, AnonymousClass1O2 r5, AnonymousClass1PT r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r3, r7, r4, r2, r8);
        C18070vi.A0x(r5, r9, r10, r6, r11);
        C18070vi.A0r(r12, r13, r14);
        C18070vi.A0d(r15, 14);
        this.A00 = r3;
        this.A02 = r7;
        this.A01 = r4;
        this.A08 = r2;
        this.A04 = r8;
        this.A09 = r5;
        this.A05 = r9;
        this.A03 = r10;
        this.A0A = r6;
        this.A07 = r11;
        this.A0B = r12;
        this.A0C = r13;
        this.A06 = r14;
        this.A0D = r15;
    }
}
