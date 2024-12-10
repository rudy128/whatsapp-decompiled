package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.49I  reason: invalid class name */
public class AnonymousClass49I extends A34 {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C26811To A01;
    public final C28521aN A02;
    public final AnonymousClass1BI A03;
    public final WeakReference A04;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r9) {
        /*
            r8 = this;
            X.1To r5 = r8.A01
            X.1BI r6 = r8.A03
            X.00H r0 = r5.A0a
            java.lang.Object r1 = r0.get()
            X.2lN r1 = (X.C58862lN) r1
            java.lang.String r0 = "star"
            X.2nY r7 = r1.A00(r0)
            X.8mk r7 = (X.C169698mk) r7
            if (r7 == 0) goto L_0x005b
            X.11S r0 = r5.A07
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            if (r0 == 0) goto L_0x005b
            X.1Cd r0 = r7.A02
            X.1at r4 = r0.get()
            X.387 r3 = r7.A01     // Catch:{ all -> 0x0054 }
            r2 = 0
            X.0vb r0 = r3.A00     // Catch:{ all -> 0x0054 }
            X.1jz r1 = new X.1jz     // Catch:{ all -> 0x0054 }
            r1.<init>(r0)     // Catch:{ all -> 0x0054 }
            r1.A03 = r6     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x0054 }
            r1.A08 = r0     // Catch:{ all -> 0x0054 }
            android.database.Cursor r2 = r3.BUo(r2, r1)     // Catch:{ all -> 0x0054 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x004d }
            r0 = 0
            java.util.ArrayList r0 = X.C169698mk.A00(r2, r7, r0)     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ all -> 0x0054 }
            r4.close()
            java.util.Set r2 = r5.A0D(r0)
            goto L_0x005f
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x005b:
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x005f:
            X.1aN r1 = r8.A02
            r0 = 0
            boolean r4 = r1.A04(r6, r0)
            if (r4 == 0) goto L_0x0077
            r5.A0R(r2)
        L_0x006b:
            long r2 = r8.A00
            r0 = 300(0x12c, double:1.48E-321)
            X.AnonymousClass1FU.A0X(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x0077:
            r5.A0Q(r2)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49I.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Boolean bool = (Boolean) obj;
        C79333vF r3 = (C79333vF) this.A04.get();
        if (r3 != null && !r3.Bed()) {
            r3.CEx();
            if (bool.booleanValue()) {
                C26144Ct7.A00(r3).A02((Bundle) null, r3);
                r3.A4f();
                return;
            }
            r3.A05.A08(2131897359, 0);
        }
    }

    public AnonymousClass49I(C26811To r3, StarredMessagesActivity starredMessagesActivity, C28521aN r5, AnonymousClass1BI r6) {
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = AnonymousClass3MW.A0z(starredMessagesActivity);
        this.A03 = r6;
    }
}
