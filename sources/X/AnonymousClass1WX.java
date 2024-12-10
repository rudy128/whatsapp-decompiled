package X;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1WX  reason: invalid class name */
public class AnonymousClass1WX {
    public final C002100z A00 = new C002100z(250);
    public final C19880zA A01;
    public final AnonymousClass1RP A02;
    public final C26111Qw A03;
    public final AnonymousClass1WW A04;
    public final AnonymousClass00H A05;
    public final Set A06 = new HashSet();
    public final C19880zA A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1LY A09;
    public final AnonymousClass1Cd A0A;

    public AnonymousClass1WX(C19880zA r3, C19880zA r4, AnonymousClass11P r5, AnonymousClass1LY r6, AnonymousClass1RP r7, AnonymousClass1Cd r8, C26111Qw r9, AnonymousClass1WW r10, AnonymousClass00H r11) {
        this.A08 = r5;
        this.A05 = r11;
        this.A04 = r10;
        this.A09 = r6;
        this.A0A = r8;
        this.A01 = r3;
        this.A03 = r9;
        this.A02 = r7;
        this.A07 = r4;
    }

    public C56862i9 A00(AnonymousClass206 r9) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass205 r5 = r9.A0v;
        C002100z r3 = this.A00;
        C56862i9 r0 = (C56862i9) r3.A04(r5);
        if (r0 != null) {
            return r0;
        }
        C56862i9 A002 = this.A04.A00(r9.A0x);
        r3.A08(r5, A002);
        this.A09.A01("ReceiptManager/getMessageReceipts", SystemClock.uptimeMillis() - uptimeMillis);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass206 r15) {
        /*
            r14 = this;
            long r12 = android.os.SystemClock.uptimeMillis()
            X.1Cd r0 = r14.A0A
            X.1au r2 = r0.A05()
            X.1xA r11 = r2.BD0()     // Catch:{ all -> 0x00ce }
            X.1WW r8 = r14.A04     // Catch:{ all -> 0x00c4 }
            long r3 = r15.A0x     // Catch:{ all -> 0x00c4 }
            X.1Cd r0 = r8.A02     // Catch:{ all -> 0x00c4 }
            X.1au r7 = r0.A05()     // Catch:{ all -> 0x00c4 }
            X.1xA r10 = r7.BD0()     // Catch:{ all -> 0x00ba }
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00b0 }
            r0 = 0
            r9[r0] = r1     // Catch:{ all -> 0x00b0 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b0 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r5 = "receipt_user"
            java.lang.String r1 = "message_row_id=?"
            java.lang.String r0 = "deleteMessageReceipts/DELETE_RECEIPT_USER"
            r6.A04(r5, r1, r0, r9)     // Catch:{ all -> 0x00b0 }
            r10.A00()     // Catch:{ all -> 0x00b0 }
            r1 = 15
            X.7Ph r0 = new X.7Ph     // Catch:{ all -> 0x00b0 }
            r0.<init>(r8, r3, r1)     // Catch:{ all -> 0x00b0 }
            r7.BJ7(r0)     // Catch:{ all -> 0x00b0 }
            r10.close()     // Catch:{ all -> 0x00ba }
            r7.close()     // Catch:{ all -> 0x00c4 }
            X.1Qw r0 = r14.A03     // Catch:{ all -> 0x00c4 }
            long r3 = r15.A0x     // Catch:{ all -> 0x00c4 }
            X.1Qu r9 = r0.A01     // Catch:{ all -> 0x00c4 }
            X.1Cd r0 = r9.A04     // Catch:{ all -> 0x00c4 }
            X.1au r7 = r0.A05()     // Catch:{ all -> 0x00c4 }
            X.1xA r8 = r7.BD0()     // Catch:{ all -> 0x00a9 }
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00a2 }
            r0 = 0
            r10[r0] = r1     // Catch:{ all -> 0x00a2 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a2 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = "receipt_device"
            java.lang.String r1 = "message_row_id = ?"
            java.lang.String r0 = "MessageReceiptDeviceStore/deleteMessageReceipts/DELETE_RECEIPT_DEVICE"
            r6.A04(r5, r1, r0, r10)     // Catch:{ all -> 0x00a2 }
            r8.A00()     // Catch:{ all -> 0x00a2 }
            r1 = 14
            X.7Ph r0 = new X.7Ph     // Catch:{ all -> 0x00a2 }
            r0.<init>(r9, r3, r1)     // Catch:{ all -> 0x00a2 }
            r7.BJ7(r0)     // Catch:{ all -> 0x00a2 }
            r8.close()     // Catch:{ all -> 0x00a9 }
            r7.close()     // Catch:{ all -> 0x00c4 }
            r11.A00()     // Catch:{ all -> 0x00c4 }
            r1 = 48
            X.3Bx r0 = new X.3Bx     // Catch:{ all -> 0x00c4 }
            r0.<init>(r14, r15, r1)     // Catch:{ all -> 0x00c4 }
            r2.BJ7(r0)     // Catch:{ all -> 0x00c4 }
            r11.close()     // Catch:{ all -> 0x00ce }
            r2.close()
            X.1LY r3 = r14.A09
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r12
            java.lang.String r0 = "ReceiptManager/deleteMessageReceiptsOnRevoke"
            r3.A01(r0, r1)
            return
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00b0:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c3:
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00c9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ce }
        L_0x00cd:
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00d3 }
            throw r1
        L_0x00d3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WX.A01(X.206):void");
    }
}
