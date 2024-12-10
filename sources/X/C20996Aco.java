package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.iq.GetNewsletterMessagesJob;
import com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob;
import com.whatsapp.newsletter.iq.GetNewsletterMyAddOnMessagesJob;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Aco  reason: case insensitive filesystem */
public class C20996Aco implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Object A00(C20996Aco aco, Object obj) {
        C18070vi.A0d(obj, 1);
        return aco.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r11.fetchingForGaps != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C183329Xv r20, X.C29621ca r21, X.AnonymousClass9F7 r22) {
        /*
            r12 = 1
            r4 = r22
            X.C18070vi.A0d(r4, r12)
            r0 = 2
            r6 = r20
            java.util.ArrayList r3 = X.C108955ca.A16(r6, r0)
            r5 = r21
            X.9F8 r7 = new X.9F8     // Catch:{ 1UI -> 0x00f4 }
            r7.<init>(r5, r4, r12)     // Catch:{ 1UI -> 0x00f4 }
            com.whatsapp.newsletter.iq.GetNewsletterMessagesJob r11 = r6.A00     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Long r0 = r11.afterServerId     // Catch:{ 1UI -> 0x00f4 }
            if (r0 != 0) goto L_0x0020
            boolean r0 = r11.fetchingForGaps     // Catch:{ 1UI -> 0x00f4 }
            r17 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0020:
            r17 = 0
        L_0x0022:
            X.AW1 r10 = r11.A05     // Catch:{ 1UI -> 0x00f4 }
            if (r10 != 0) goto L_0x002d
            java.lang.String r0 = "newsletterBatchedMessagesManager"
            X.C18070vi.A11(r0)     // Catch:{ 1UI -> 0x00f4 }
            r0 = 0
            throw r0     // Catch:{ 1UI -> 0x00f4 }
        L_0x002d:
            X.1ch r9 = r11.newsletterJid     // Catch:{ 1UI -> 0x00f4 }
            long r1 = r11.count     // Catch:{ 1UI -> 0x00f4 }
            boolean r0 = r11.fetchingForGaps     // Catch:{ 1UI -> 0x00f4 }
            r16 = r0
            java.lang.Object r13 = r7.A01     // Catch:{ 1UI -> 0x00f4 }
            X.9DL r13 = (X.AnonymousClass9DL) r13     // Catch:{ 1UI -> 0x00f4 }
            r0 = 0
            X.C18070vi.A0f(r9, r0, r13)     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Object r0 = r13.A01     // Catch:{ 1UI -> 0x00f4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 1UI -> 0x00f4 }
            int r14 = r0.size()     // Catch:{ 1UI -> 0x00f4 }
            long r7 = (long) r14     // Catch:{ 1UI -> 0x00f4 }
            int r15 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r15 >= 0) goto L_0x0070
            if (r17 == 0) goto L_0x0070
            X.00H r1 = r10.A0B     // Catch:{ 1UI -> 0x00f4 }
            X.1i5 r15 = X.AnonymousClass8BR.A0M(r1)     // Catch:{ 1UI -> 0x00f4 }
            X.1CJ r1 = r15.A02     // Catch:{ 1UI -> 0x00f4 }
            X.1ci r8 = X.AnonymousClass1CJ.A00(r1, r9)     // Catch:{ 1UI -> 0x00f4 }
            boolean r1 = r8 instanceof X.C46162Dk     // Catch:{ 1UI -> 0x00f4 }
            if (r1 == 0) goto L_0x0070
            X.2Dk r8 = (X.C46162Dk) r8     // Catch:{ 1UI -> 0x00f4 }
            if (r8 == 0) goto L_0x0070
            r8.A0C = r12     // Catch:{ 1UI -> 0x00f4 }
            android.content.ContentValues r7 = X.C17880vN.A08()     // Catch:{ 1UI -> 0x00f4 }
            java.lang.String r2 = "oldest_message_retrieved"
            boolean r1 = r8.A0C     // Catch:{ 1UI -> 0x00f4 }
            X.C50072Ta.A00(r7, r2, r1)     // Catch:{ 1UI -> 0x00f4 }
            X.C32991i5.A01(r7, r8, r15)     // Catch:{ 1UI -> 0x00f4 }
        L_0x0070:
            if (r14 == 0) goto L_0x00ea
            X.00H r1 = r10.A02     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Object r1 = r1.get()     // Catch:{ 1UI -> 0x00f4 }
            X.1CJ r1 = (X.AnonymousClass1CJ) r1     // Catch:{ 1UI -> 0x00f4 }
            X.1ci r1 = X.AnonymousClass1CJ.A00(r1, r9)     // Catch:{ 1UI -> 0x00f4 }
            boolean r2 = r1 instanceof X.C46162Dk     // Catch:{ 1UI -> 0x00f4 }
            if (r2 == 0) goto L_0x00ea
            X.2Dk r1 = (X.C46162Dk) r1     // Catch:{ 1UI -> 0x00f4 }
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r2 = r13.A03     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ 1UI -> 0x00f4 }
            if (r2 == 0) goto L_0x00b4
            long r20 = r2.longValue()     // Catch:{ 1UI -> 0x00f4 }
        L_0x0090:
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 1UI -> 0x00f4 }
        L_0x0094:
            boolean r0 = r7.hasNext()     // Catch:{ 1UI -> 0x00f4 }
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r2 = r7.next()     // Catch:{ 1UI -> 0x00f4 }
            X.9DM r2 = (X.AnonymousClass9DM) r2     // Catch:{ 1UI -> 0x00f4 }
            X.00H r0 = r10.A08     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Object r0 = X.C18070vi.A0E(r0)     // Catch:{ 1UI -> 0x00f4 }
            X.2rC r0 = (X.C62312rC) r0     // Catch:{ 1UI -> 0x00f4 }
            r22 = 0
            r17 = r0
            r18 = r9
            r19 = r2
            r17.A02(r18, r19, r20, r22)     // Catch:{ 1UI -> 0x00f4 }
            goto L_0x0094
        L_0x00b4:
            r20 = -1
            goto L_0x0090
        L_0x00b7:
            if (r16 != 0) goto L_0x00ba
            goto L_0x00ce
        L_0x00ba:
            X.00H r0 = r10.A07     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Object r1 = r0.get()     // Catch:{ 1UI -> 0x00f4 }
            X.2jH r1 = (X.C57562jH) r1     // Catch:{ 1UI -> 0x00f4 }
            X.00H r0 = r1.A02     // Catch:{ 1UI -> 0x00f4 }
            X.11A r2 = X.C17880vN.A0d(r0)     // Catch:{ 1UI -> 0x00f4 }
            X.3Bz r0 = new X.3Bz     // Catch:{ 1UI -> 0x00f4 }
            r0.<init>(r1, r9, r12)     // Catch:{ 1UI -> 0x00f4 }
            goto L_0x00e4
        L_0x00ce:
            X.00H r0 = r10.A07     // Catch:{ 1UI -> 0x00f4 }
            java.lang.Object r8 = r0.get()     // Catch:{ 1UI -> 0x00f4 }
            X.2jH r8 = (X.C57562jH) r8     // Catch:{ 1UI -> 0x00f4 }
            boolean r7 = r1.A0C     // Catch:{ 1UI -> 0x00f4 }
            X.00H r0 = r8.A02     // Catch:{ 1UI -> 0x00f4 }
            X.11A r2 = X.C17880vN.A0d(r0)     // Catch:{ 1UI -> 0x00f4 }
            r1 = 4
            X.7Qx r0 = new X.7Qx     // Catch:{ 1UI -> 0x00f4 }
            r0.<init>(r8, r9, r1, r7)     // Catch:{ 1UI -> 0x00f4 }
        L_0x00e4:
            r2.A00(r0)     // Catch:{ 1UI -> 0x00f4 }
            X.AW1.A00(r9, r10)     // Catch:{ 1UI -> 0x00f4 }
        L_0x00ea:
            X.B8R r1 = r11.callback     // Catch:{ 1UI -> 0x00f4 }
            if (r1 == 0) goto L_0x0150
            java.lang.String r0 = r11.token     // Catch:{ 1UI -> 0x00f4 }
            r1.CFT(r0)     // Catch:{ 1UI -> 0x00f4 }
            return
        L_0x00f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetNewsletterMessagesResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 6
            X.9FQ r0 = new X.9FQ     // Catch:{ 1UI -> 0x0135 }
            r0.<init>((X.C29621ca) r5, (X.AnonymousClass9F7) r4, (int) r1)     // Catch:{ 1UI -> 0x0135 }
            java.lang.Object r9 = r0.A01     // Catch:{ 1UI -> 0x0135 }
            X.B9m r9 = (X.C22480B9m) r9     // Catch:{ 1UI -> 0x0135 }
            com.whatsapp.newsletter.iq.GetNewsletterMessagesJob r8 = r6.A00     // Catch:{ 1UI -> 0x0135 }
            X.1ch r7 = r8.newsletterJid     // Catch:{ 1UI -> 0x0135 }
            X.1i5 r2 = r8.A02     // Catch:{ 1UI -> 0x0135 }
            if (r2 != 0) goto L_0x0117
            java.lang.String r0 = "newsletterStore"
        L_0x0112:
            X.C18070vi.A11(r0)     // Catch:{ 1UI -> 0x0135 }
            r0 = 0
            throw r0     // Catch:{ 1UI -> 0x0135 }
        L_0x0117:
            X.1md r0 = r8.A04     // Catch:{ 1UI -> 0x0135 }
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "newsletterManager"
            goto L_0x0112
        L_0x011e:
            X.9oP r1 = new X.9oP     // Catch:{ 1UI -> 0x0135 }
            r1.<init>(r2, r7, r0)     // Catch:{ 1UI -> 0x0135 }
            X.9Xu r0 = new X.9Xu     // Catch:{ 1UI -> 0x0135 }
            r0.<init>(r1)     // Catch:{ 1UI -> 0x0135 }
            r9.BAU(r0)     // Catch:{ 1UI -> 0x0135 }
            X.B8R r1 = r8.callback     // Catch:{ 1UI -> 0x0135 }
            if (r1 == 0) goto L_0x0150
            java.lang.String r0 = r8.token     // Catch:{ 1UI -> 0x0135 }
            r1.CFT(r0)     // Catch:{ 1UI -> 0x0135 }
            return
        L_0x0135:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetNewsletterMessagesResponseClientError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9F8 r0 = new X.9F8     // Catch:{ 1UI -> 0x0151 }
            r0.<init>(r5, r4, r1)     // Catch:{ 1UI -> 0x0151 }
            com.whatsapp.newsletter.iq.GetNewsletterMessagesJob r0 = r6.A00     // Catch:{ 1UI -> 0x0151 }
            X.B8R r1 = r0.callback     // Catch:{ 1UI -> 0x0151 }
            if (r1 == 0) goto L_0x0150
            java.lang.String r0 = r0.token     // Catch:{ 1UI -> 0x0151 }
            r1.CFT(r0)     // Catch:{ 1UI -> 0x0151 }
        L_0x0150:
            return
        L_0x0151:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetNewsletterMessagesResponseServerError: "
            X.1UI r0 = X.AnonymousClass8BY.A0N(r0, r1, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20996Aco.A01(X.9Xv, X.1ca, X.9F7):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af A[Catch:{ 1UI -> 0x00e8, 1UI -> 0x0129 }, LOOP:0: B:43:0x00a9->B:45:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2 A[Catch:{ 1UI -> 0x00e8, 1UI -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[Catch:{ 1UI -> 0x0145 }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C183339Xw r20, X.C29621ca r21, X.AnonymousClass9F7 r22) {
        /*
            r0 = 1
            r7 = r22
            X.C18070vi.A0d(r7, r0)
            r0 = 2
            r9 = r20
            java.util.ArrayList r6 = X.C108955ca.A16(r9, r0)
            r2 = 4
            r8 = r21
            X.9FP r1 = new X.9FP     // Catch:{ 1UI -> 0x00e8 }
            r1.<init>((X.C29621ca) r8, (X.AnonymousClass9F7) r7, (int) r2)     // Catch:{ 1UI -> 0x00e8 }
            com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob r5 = r9.A00     // Catch:{ 1UI -> 0x00e8 }
            boolean r0 = r5.isCancelled     // Catch:{ 1UI -> 0x00e8 }
            if (r0 != 0) goto L_0x0144
            X.AW1 r4 = r5.A04     // Catch:{ 1UI -> 0x00e8 }
            if (r4 != 0) goto L_0x0026
            java.lang.String r0 = "newsletterBatchedMessagesManager"
            X.C18070vi.A11(r0)     // Catch:{ 1UI -> 0x00e8 }
            r0 = 0
            throw r0     // Catch:{ 1UI -> 0x00e8 }
        L_0x0026:
            X.1ch r3 = r5.newsletterJid     // Catch:{ 1UI -> 0x00e8 }
            long r15 = r5.count     // Catch:{ 1UI -> 0x00e8 }
            java.lang.Long r0 = r5.beforeServerId     // Catch:{ 1UI -> 0x00e8 }
            r22 = r0
            java.lang.Long r0 = r5.afterServerId     // Catch:{ 1UI -> 0x00e8 }
            r17 = r0
            java.lang.Object r11 = r1.A02     // Catch:{ 1UI -> 0x00e8 }
            X.9DL r11 = (X.AnonymousClass9DL) r11     // Catch:{ 1UI -> 0x00e8 }
            X.C108975cc.A12(r3, r11, r2)     // Catch:{ 1UI -> 0x00e8 }
            java.lang.Object r0 = r11.A03     // Catch:{ 1UI -> 0x00e8 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 1UI -> 0x00e8 }
            if (r0 == 0) goto L_0x00de
            long r0 = r0.longValue()     // Catch:{ 1UI -> 0x00e8 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            X.00H r2 = r4.A09     // Catch:{ 1UI -> 0x00e8 }
            java.lang.Object r14 = r2.get()     // Catch:{ 1UI -> 0x00e8 }
            X.1hF r14 = (X.C32471hF) r14     // Catch:{ 1UI -> 0x00e8 }
            X.1Cd r2 = r14.A03     // Catch:{ SQLNonTransientException -> 0x009d, IllegalArgumentException -> 0x0099 }
            X.1au r10 = r2.A05()     // Catch:{ SQLNonTransientException -> 0x009d, IllegalArgumentException -> 0x0099 }
            X.1xA r12 = r10.BD0()     // Catch:{ all -> 0x0092 }
            r2 = r10
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x008b }
            X.1Ev r2 = r2.A02     // Catch:{ all -> 0x008b }
            r21 = r2
            android.content.ContentValues r2 = X.C17880vN.A08()     // Catch:{ all -> 0x008b }
            java.lang.String r13 = "extra_table_last_update_ts"
            X.C17880vN.A19(r2, r13, r0)     // Catch:{ all -> 0x008b }
            r18 = r17
            r19 = r15
            r15 = r3
            r16 = r14
            r17 = r22
            java.lang.String[] r18 = X.C32471hF.A01(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x008b }
            java.lang.String r17 = "UPDATE_NEWSLETTER_MESSAGE_TABLE_MESSAGE_UPDATES_REQUEST"
            java.lang.String r15 = "newsletter_message"
            java.lang.String r16 = "chat_row_id = ? AND server_message_id < ? AND server_message_id > ?"
            r14 = r2
            r13 = r21
            r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x008b }
            r12.A00()     // Catch:{ all -> 0x008b }
            r12.close()     // Catch:{ all -> 0x0092 }
            r10.close()     // Catch:{ SQLNonTransientException -> 0x009d, IllegalArgumentException -> 0x0099 }
            goto L_0x00a3
        L_0x008b:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x008d }
        L_0x008d:
            r2 = move-exception
            X.CDX.A00(r12, r13)     // Catch:{ all -> 0x0092 }
            throw r2     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r2 = move-exception
            X.CDX.A00(r10, r12)     // Catch:{ SQLNonTransientException -> 0x009d, IllegalArgumentException -> 0x0099 }
            throw r2     // Catch:{ SQLNonTransientException -> 0x009d, IllegalArgumentException -> 0x0099 }
        L_0x0099:
            r10 = move-exception
            java.lang.String r2 = "NewsletterMessageStore/failed to update the message due to message constraints"
            goto L_0x00a0
        L_0x009d:
            r10 = move-exception
            java.lang.String r2 = "NewsletterMessageStore/failed to update the message"
        L_0x00a0:
            com.whatsapp.util.Log.e(r2, r10)     // Catch:{ 1UI -> 0x00e8 }
        L_0x00a3:
            java.lang.Object r2 = r11.A01     // Catch:{ 1UI -> 0x00e8 }
            java.util.Iterator r11 = X.AnonymousClass8BR.A13(r2)     // Catch:{ 1UI -> 0x00e8 }
        L_0x00a9:
            boolean r2 = r11.hasNext()     // Catch:{ 1UI -> 0x00e8 }
            if (r2 == 0) goto L_0x00c6
            java.lang.Object r10 = r11.next()     // Catch:{ 1UI -> 0x00e8 }
            X.9DM r10 = (X.AnonymousClass9DM) r10     // Catch:{ 1UI -> 0x00e8 }
            X.00H r2 = r4.A08     // Catch:{ 1UI -> 0x00e8 }
            java.lang.Object r12 = X.C18070vi.A0E(r2)     // Catch:{ 1UI -> 0x00e8 }
            X.2rC r12 = (X.C62312rC) r12     // Catch:{ 1UI -> 0x00e8 }
            r17 = 0
            r13 = r3
            r14 = r10
            r15 = r0
            r12.A02(r13, r14, r15, r17)     // Catch:{ 1UI -> 0x00e8 }
            goto L_0x00a9
        L_0x00c6:
            X.00H r0 = r4.A07     // Catch:{ 1UI -> 0x00e8 }
            java.lang.Object r4 = r0.get()     // Catch:{ 1UI -> 0x00e8 }
            X.2jH r4 = (X.C57562jH) r4     // Catch:{ 1UI -> 0x00e8 }
            X.00H r0 = r4.A02     // Catch:{ 1UI -> 0x00e8 }
            X.11A r2 = X.C17880vN.A0d(r0)     // Catch:{ 1UI -> 0x00e8 }
            r1 = 47
            X.AkP r0 = new X.AkP     // Catch:{ 1UI -> 0x00e8 }
            r0.<init>(r4, r3, r1)     // Catch:{ 1UI -> 0x00e8 }
            r2.A00(r0)     // Catch:{ 1UI -> 0x00e8 }
        L_0x00de:
            X.1Di r1 = r5.callback     // Catch:{ 1UI -> 0x00e8 }
            if (r1 == 0) goto L_0x0144
            java.lang.String r0 = r5.token     // Catch:{ 1UI -> 0x00e8 }
            r1.invoke(r0)     // Catch:{ 1UI -> 0x00e8 }
            return
        L_0x00e8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r6)
            r1 = 4
            X.9FQ r0 = new X.9FQ     // Catch:{ 1UI -> 0x0129 }
            r0.<init>((X.C29621ca) r8, (X.AnonymousClass9F7) r7, (int) r1)     // Catch:{ 1UI -> 0x0129 }
            java.lang.Object r5 = r0.A01     // Catch:{ 1UI -> 0x0129 }
            X.B9l r5 = (X.C22479B9l) r5     // Catch:{ 1UI -> 0x0129 }
            com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob r4 = r9.A00     // Catch:{ 1UI -> 0x0129 }
            X.1ch r3 = r4.newsletterJid     // Catch:{ 1UI -> 0x0129 }
            X.1i5 r2 = r4.A01     // Catch:{ 1UI -> 0x0129 }
            if (r2 != 0) goto L_0x010b
            java.lang.String r0 = "newsletterStore"
        L_0x0106:
            X.C18070vi.A11(r0)     // Catch:{ 1UI -> 0x0129 }
            r0 = 0
            throw r0     // Catch:{ 1UI -> 0x0129 }
        L_0x010b:
            X.1md r0 = r4.A03     // Catch:{ 1UI -> 0x0129 }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "newsletterManager"
            goto L_0x0106
        L_0x0112:
            X.9oP r1 = new X.9oP     // Catch:{ 1UI -> 0x0129 }
            r1.<init>(r2, r3, r0)     // Catch:{ 1UI -> 0x0129 }
            X.9Xt r0 = new X.9Xt     // Catch:{ 1UI -> 0x0129 }
            r0.<init>(r1)     // Catch:{ 1UI -> 0x0129 }
            r5.BAT(r0)     // Catch:{ 1UI -> 0x0129 }
            X.1Di r1 = r4.callback     // Catch:{ 1UI -> 0x0129 }
            if (r1 == 0) goto L_0x0144
            java.lang.String r0 = r4.token     // Catch:{ 1UI -> 0x0129 }
            r1.invoke(r0)     // Catch:{ 1UI -> 0x0129 }
            return
        L_0x0129:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseClientError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r6)
            r1 = 5
            X.9FQ r0 = new X.9FQ     // Catch:{ 1UI -> 0x0145 }
            r0.<init>((X.C29621ca) r8, (X.AnonymousClass9F7) r7, (int) r1)     // Catch:{ 1UI -> 0x0145 }
            com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob r0 = r9.A00     // Catch:{ 1UI -> 0x0145 }
            X.1Di r1 = r0.callback     // Catch:{ 1UI -> 0x0145 }
            if (r1 == 0) goto L_0x0144
            java.lang.String r0 = r0.token     // Catch:{ 1UI -> 0x0145 }
            r1.invoke(r0)     // Catch:{ 1UI -> 0x0145 }
        L_0x0144:
            return
        L_0x0145:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseServerError: "
            X.1UI r0 = X.AnonymousClass8BY.A0N(r0, r1, r2, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20996Aco.A02(X.9Xw, X.1ca, X.9F7):void");
    }

    public static final void A03(C183349Xx r15, C29621ca r16, AnonymousClass9F7 r17) {
        String str;
        AnonymousClass9F7 r2 = r17;
        C18070vi.A0d(r2, 1);
        C183349Xx r5 = r15;
        ArrayList A16 = C108955ca.A16(r15, 2);
        C29621ca r4 = r16;
        try {
            AnonymousClass9FP r8 = new AnonymousClass9FP(r4, r2, 5);
            GetNewsletterMyAddOnMessagesJob getNewsletterMyAddOnMessagesJob = r15.A00;
            C19830z4 r0 = getNewsletterMyAddOnMessagesJob.A00;
            if (r0 == null) {
                C18070vi.A11("waSharedPreferences");
            } else {
                C17880vN.A1F(C19830z4.A00(r0), "newsletter_my_reactions_fetched", true);
                Iterator A13 = AnonymousClass8BR.A13(r8.A02);
                loop0:
                while (A13.hasNext()) {
                    AnonymousClass9DP r02 = (AnonymousClass9DP) A13.next();
                    C29681ch r12 = (C29681ch) r02.A00;
                    Iterator A132 = AnonymousClass8BR.A13(r02.A01);
                    while (true) {
                        if (A132.hasNext()) {
                            AnonymousClass9DF r7 = (AnonymousClass9DF) ((AnonymousClass9DM) A132.next()).A00;
                            long j = r7.A00;
                            AnonymousClass9DC r03 = (AnonymousClass9DC) r7.A02;
                            if (r03 != null) {
                                String str2 = r03.A03;
                                long j2 = r03.A00;
                                C35321m3 r11 = getNewsletterMyAddOnMessagesJob.A04;
                                if (r11 == null) {
                                    break loop0;
                                }
                                r11.A01(r12, str2, j, j2);
                            }
                            AnonymousClass9DF r72 = (AnonymousClass9DF) r7.A01;
                            if (r72 != null) {
                                HashSet A12 = C17880vN.A12();
                                Iterator A133 = AnonymousClass8BR.A13(r72.A03);
                                while (A133.hasNext()) {
                                    String A14 = C108955ca.A14((byte[]) ((AnonymousClass9DM) A133.next()).A00);
                                    C18070vi.A0X(A14);
                                    A12.add(A14);
                                }
                                long j3 = r72.A00;
                                C35321m3 r112 = getNewsletterMyAddOnMessagesJob.A04;
                                if (r112 == null) {
                                    break loop0;
                                }
                                r112.A02(r12, A12, j, j3);
                            }
                        }
                    }
                    C18070vi.A11("newsletterIncomingMessageManager");
                }
                return;
            }
            throw null;
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BY.A1I("MyAddOnsResponseSuccess: ", AnonymousClass000.A10(), e, A16);
            AnonymousClass9FQ r1 = new AnonymousClass9FQ(r4, r2, 7);
            GetNewsletterMyAddOnMessagesJob getNewsletterMyAddOnMessagesJob2 = r5.A00;
            C29681ch r73 = getNewsletterMyAddOnMessagesJob2.newsletterJid;
            if (r73 != null) {
                C22481B9n b9n = (C22481B9n) r1.A01;
                C32991i5 r52 = getNewsletterMyAddOnMessagesJob2.A01;
                if (r52 == null) {
                    str = "newsletterStore";
                } else {
                    C35681md r04 = getNewsletterMyAddOnMessagesJob2.A03;
                    if (r04 == null) {
                        str = "newsletterManager";
                    } else {
                        b9n.BAV(new C183359Xy(new C192449oP(r52, r73, r04)));
                        return;
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        } catch (AnonymousClass1UI e2) {
            AnonymousClass8BY.A1I("MyAddOnsResponseClientError: ", AnonymousClass000.A10(), e2, A16);
            try {
                new AnonymousClass9FQ(r4, r2, 8);
            } catch (AnonymousClass1UI e3) {
                throw AnonymousClass8BY.A0N("MyAddOnsResponseServerError: ", AnonymousClass000.A10(), e3, A16);
            }
        }
    }

    public static final void A05(C183419Ye r24, C29621ca r25, AnonymousClass9F6 r26) {
        AnonymousClass1UI r3;
        C195279t5 r11;
        AnonymousClass9F6 r1 = r26;
        C18070vi.A0d(r1, 1);
        C183419Ye r10 = r24;
        ArrayList A16 = C108955ca.A16(r10, 2);
        C29621ca r2 = r25;
        try {
            C29621ca A002 = AnonymousClass9F6.A00(r2, r1);
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = {"account", "action"};
            Class<String> cls = String.class;
            String[] strArr2 = new String[2];
            strArr2[0] = "account";
            Long A0Z = AnonymousClass8BW.A0Z("action", strArr2, 1);
            Long A0j = AnonymousClass8BU.A0j();
            Object A05 = A0s.A05(A002, cls, A0Z, A0j, (Object) null, strArr2, false);
            if (A05 != null) {
                C62672rm r19 = A0s;
                C29621ca r20 = r2;
                Long l = A0Z;
                Long l2 = A0j;
                if (r19.A05(r20, cls, l, l2, A05, strArr, true) != null) {
                    if (r19.A05(r20, UserJid.class, l, l2, (Object) null, new String[]{"account", PublicKeyCredentialControllerUtility.JSON_KEY_USER, "jid"}, false) != null) {
                        A8Z a8z = A8Z.A00;
                        if (C21290Ahb.A00(A002, a8z, 25).BCF(r2, A0s) != null) {
                            String[] A1b = C17880vN.A1b("account", PublicKeyCredentialControllerUtility.JSON_KEY_USER, 3, 1);
                            A1b[2] = "custom_payment_method";
                            A0s.A02(r2, new C21283AhU(a8z, 1), A1b);
                            String[] A1b2 = C17880vN.A1b("account", PublicKeyCredentialControllerUtility.JSON_KEY_USER, 2, 1);
                            new AnonymousClass9SA
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008f: CONSTRUCTOR  (r3v11 ? I:X.9SA) =  call: X.9SA.<init>():void type: CONSTRUCTOR in method: X.Aco.A05(X.9Ye, X.1ca, X.9F6):void, dex: classes5.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v11 ?
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	... 56 more
                                */
                            /*
                                r7 = 0
                                r6 = 1
                                r1 = r26
                                X.C18070vi.A0d(r1, r6)
                                r5 = 2
                                r10 = r24
                                java.util.ArrayList r0 = X.C108955ca.A16(r10, r5)
                                r2 = r25
                                X.1ca r14 = X.AnonymousClass9F6.A00(r2, r1)     // Catch:{ 1UI -> 0x0115 }
                                X.2rm r13 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r4 = "account"
                                r3[r7] = r4     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r9 = "action"
                                r3[r6] = r9     // Catch:{ 1UI -> 0x0115 }
                                java.lang.Class<java.lang.String> r15 = java.lang.String.class
                                java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x0115 }
                                r8[r7] = r4     // Catch:{ 1UI -> 0x0115 }
                                java.lang.Long r16 = X.AnonymousClass8BW.A0Z(r9, r8, r6)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.Long r17 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0115 }
                                r18 = 0
                                r19 = r8
                                r20 = r7
                                java.lang.Object r24 = r13.A05(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x0115 }
                                if (r24 == 0) goto L_0x010b
                                r19 = r13
                                r20 = r2
                                r21 = r15
                                r22 = r16
                                r23 = r17
                                r25 = r3
                                r26 = r6
                                java.lang.Object r3 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x0115 }
                                if (r3 == 0) goto L_0x0106
                                r9 = 3
                                java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ 1UI -> 0x0115 }
                                r8[r7] = r4     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "user"
                                r8[r6] = r3     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r11 = "jid"
                                r8[r5] = r11     // Catch:{ 1UI -> 0x0115 }
                                java.lang.Class<com.whatsapp.jid.UserJid> r21 = com.whatsapp.jid.UserJid.class
                                r24 = r18
                                r25 = r8
                                r26 = r7
                                java.lang.Object r8 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x0115 }
                                if (r8 == 0) goto L_0x0110
                                X.A8Z r12 = X.A8Z.A00     // Catch:{ 1UI -> 0x0115 }
                                r8 = 25
                                X.Ahb r8 = X.C21290Ahb.A00(r14, r12, r8)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.Object r8 = r8.BCF(r2, r13)     // Catch:{ 1UI -> 0x0115 }
                                if (r8 == 0) goto L_0x0101
                                java.lang.String[] r11 = X.C17880vN.A1b(r4, r3, r9, r6)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r8 = "custom_payment_method"
                                r11[r5] = r8     // Catch:{ 1UI -> 0x0115 }
                                X.AhU r9 = new X.AhU     // Catch:{ 1UI -> 0x0115 }
                                r9.<init>(r12, r6)     // Catch:{ 1UI -> 0x0115 }
                                r13.A02(r2, r9, r11)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String[] r4 = X.C17880vN.A1b(r4, r3, r5, r6)     // Catch:{ 1UI -> 0x0115 }
                                X.9SA r3 = new X.9SA     // Catch:{ 1UI -> 0x0115 }
                                r3.<init>()     // Catch:{ 1UI -> 0x0115 }
                                java.util.ArrayList r3 = X.C29601cY.A00(r2, r4)     // Catch:{ 1UI -> 0x0115 }
                                X.1ca r3 = X.AnonymousClass8BR.A0m(r3, r7)     // Catch:{ 1UI -> 0x0115 }
                                com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel r5 = r10.A00     // Catch:{ 1UI -> 0x0115 }
                                X.1ca r4 = r3.A0K(r8)     // Catch:{ 1UI -> 0x0115 }
                                if (r4 != 0) goto L_0x00a9
                                java.lang.String r3 = "GetPixInfoRequest handler error customPaymentMethodNode is null"
                                com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1UI -> 0x0115 }
                                r11 = 0
                                goto L_0x00f4
                            L_0x00a9:
                                java.lang.String r3 = "ttl"
                                java.lang.String r13 = r4.A0P(r3)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "country"
                                java.lang.String r12 = r4.A0P(r3)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "credential-id"
                                java.lang.String r14 = r4.A0P(r3)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "type"
                                java.lang.String r15 = r4.A0P(r3)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "metadata_info"
                                X.1ca r4 = r4.A0K(r3)     // Catch:{ 1UI -> 0x0115 }
                                java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ 1UI -> 0x0115 }
                                if (r4 == 0) goto L_0x00ed
                                java.lang.String r3 = "metadata"
                                java.util.Iterator r8 = X.C29621ca.A03(r4, r3)     // Catch:{ 1UI -> 0x0115 }
                            L_0x00d3:
                                boolean r3 = r8.hasNext()     // Catch:{ 1UI -> 0x0115 }
                                if (r3 == 0) goto L_0x00ed
                                X.1ca r6 = X.C17880vN.A0a(r8)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "key"
                                java.lang.String r4 = r6.A0P(r3)     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "value"
                                java.lang.String r3 = r6.A0P(r3)     // Catch:{ 1UI -> 0x0115 }
                                X.AnonymousClass8BT.A1R(r4, r3, r7)     // Catch:{ 1UI -> 0x0115 }
                                goto L_0x00d3
                            L_0x00ed:
                                X.9t5 r11 = new X.9t5     // Catch:{ 1UI -> 0x0115 }
                                r16 = r7
                                r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ 1UI -> 0x0115 }
                            L_0x00f4:
                                X.1DT r4 = r5.A00     // Catch:{ 1UI -> 0x0115 }
                                java.lang.String r3 = "COMPLETED"
                                r4.A0E(r3)     // Catch:{ 1UI -> 0x0115 }
                                X.1DT r3 = r5.A01     // Catch:{ 1UI -> 0x0115 }
                                r3.A0E(r11)     // Catch:{ 1UI -> 0x0115 }
                                return
                            L_0x0101:
                                X.1UI r3 = X.AnonymousClass1O9.A00(r13)     // Catch:{ 1UI -> 0x0115 }
                                goto L_0x0114
                            L_0x0106:
                                X.1UI r3 = X.AnonymousClass1O9.A00(r13)     // Catch:{ 1UI -> 0x0115 }
                                goto L_0x0114
                            L_0x010b:
                                X.1UI r3 = X.AnonymousClass1O9.A00(r13)     // Catch:{ 1UI -> 0x0115 }
                                goto L_0x0114
                            L_0x0110:
                                X.1UI r3 = X.AnonymousClass1O9.A00(r13)     // Catch:{ 1UI -> 0x0115 }
                            L_0x0114:
                                throw r3     // Catch:{ 1UI -> 0x0115 }
                            L_0x0115:
                                r5 = move-exception
                                java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
                                java.lang.String r3 = "GetPixInfoResponseSuccess: "
                                X.AnonymousClass8BY.A1I(r3, r4, r5, r0)
                                X.C108945cZ.A1N(r2)     // Catch:{ 1UI -> 0x0146 }
                                java.lang.Object r5 = r1.A00     // Catch:{ 1UI -> 0x0146 }
                                X.2rm r4 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0146 }
                                X.A8Z r3 = X.A8Z.A00     // Catch:{ 1UI -> 0x0146 }
                                r1 = 24
                                java.lang.Object r1 = X.C21290Ahb.A02(r2, r4, r5, r3, r1)     // Catch:{ 1UI -> 0x0146 }
                                if (r1 == 0) goto L_0x0141
                                java.lang.String r1 = "GetPixInfoRequest handler error"
                                com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1UI -> 0x0146 }
                                com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel r1 = r10.A00     // Catch:{ 1UI -> 0x0146 }
                                X.1DT r2 = r1.A00     // Catch:{ 1UI -> 0x0146 }
                                java.lang.String r1 = "ERROR"
                                r2.A0E(r1)     // Catch:{ 1UI -> 0x0146 }
                                return
                            L_0x0141:
                                X.1UI r1 = X.AnonymousClass1O9.A00(r4)     // Catch:{ 1UI -> 0x0146 }
                                throw r1     // Catch:{ 1UI -> 0x0146 }
                            L_0x0146:
                                r3 = move-exception
                                java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
                                java.lang.String r1 = "GetPixInfoResponseError: "
                                X.1UI r0 = X.AnonymousClass8BY.A0N(r1, r2, r3, r0)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C20996Aco.A05(X.9Ye, X.1ca, X.9F6):void");
                        }

                        public static final void A06(C29621ca r5, AnonymousClass9F6 r6, B6B b6b) {
                            Object obj;
                            ArrayList A16 = C108955ca.A16(r6, 1);
                            try {
                                AnonymousClass9FJ r4 = new AnonymousClass9FJ(r5, r6);
                                C21291Ahc ahc = (C21291Ahc) b6b;
                                if (ahc.A00 != 0) {
                                    obj = ahc.A02;
                                } else {
                                    AnonymousClass3MX.A1K(((BrazilHostedPaymentPageViewModel) ahc.A02).A00, 3);
                                    obj = ahc.A01;
                                }
                                ((AnonymousClass1OS) obj).invoke(r4.A00, r4.A01);
                            } catch (AnonymousClass1UI e) {
                                AnonymousClass8BY.A1I("BRGetCheckoutSessionResponseSuccess: ", AnonymousClass000.A10(), e, A16);
                                try {
                                    new AnonymousClass9FQ(r5, r6, 0);
                                    C21291Ahc ahc2 = (C21291Ahc) b6b;
                                    if (ahc2.A00 != 0) {
                                        ((C18090vk) ahc2.A01).invoke();
                                    } else {
                                        AnonymousClass3MX.A1K(((BrazilHostedPaymentPageViewModel) ahc2.A02).A00, 2);
                                    }
                                } catch (AnonymousClass1UI e2) {
                                    throw AnonymousClass8BY.A0N("BRGetCheckoutSessionResponseError: ", AnonymousClass000.A10(), e2, A16);
                                }
                            }
                        }

                        public static final void A07(C29621ca r4, BCI bci, AnonymousClass9F1 r6) {
                            ArrayList A16 = C108955ca.A16(r6, 1);
                            try {
                                bci.Bc6(new AnonymousClass9F9(r4, r6));
                            } catch (AnonymousClass1UI e) {
                                AnonymousClass8BY.A1I("CreateCustomPaymentMethodResponseSuccess: ", AnonymousClass000.A10(), e, A16);
                                try {
                                    bci.Bc4(new AnonymousClass9FQ(r4, r6));
                                } catch (AnonymousClass1UI e2) {
                                    throw AnonymousClass8BY.A0N("CreateCustomPaymentMethodResponseIQErrorWithCodeAndReason: ", AnonymousClass000.A10(), e2, A16);
                                }
                            }
                        }

                        public C20996Aco(Object obj, Object obj2, int i) {
                            this.A00 = i;
                            this.A01 = obj2;
                            this.A02 = obj;
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
                            r1.append(r0);
                            r1.append(r5);
                            r0 = X.C17890vO.A0b(r1);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
                            X.C17900vP.A0f(r0, r5, r1);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ea, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
                            com.whatsapp.util.Log.e(r0);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
                            return;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void BrD(java.lang.String r5) {
                            /*
                                r4 = this;
                                int r0 = r4.A00
                                switch(r0) {
                                    case 0: goto L_0x0136;
                                    case 1: goto L_0x0005;
                                    case 2: goto L_0x0130;
                                    case 3: goto L_0x0005;
                                    case 4: goto L_0x0122;
                                    case 5: goto L_0x0114;
                                    case 6: goto L_0x0106;
                                    case 7: goto L_0x00f8;
                                    case 8: goto L_0x00eb;
                                    case 9: goto L_0x0015;
                                    case 10: goto L_0x00e1;
                                    case 11: goto L_0x00da;
                                    case 12: goto L_0x00d3;
                                    case 13: goto L_0x00b5;
                                    case 14: goto L_0x008c;
                                    case 15: goto L_0x006f;
                                    case 16: goto L_0x006b;
                                    case 17: goto L_0x0067;
                                    case 18: goto L_0x0006;
                                    case 19: goto L_0x004b;
                                    case 20: goto L_0x0032;
                                    default: goto L_0x0005;
                                }
                            L_0x0005:
                                return
                            L_0x0006:
                                java.lang.String r0 = "PushXmppMethod/SetClientConfig delivery fail"
                                com.whatsapp.util.Log.i((java.lang.String) r0)
                                java.lang.Object r0 = r4.A01
                                X.BBg r0 = (X.C22523BBg) r0
                                if (r0 == 0) goto L_0x0005
                                r0.Bti()
                                return
                            L_0x0015:
                                r0 = 0
                                X.C18070vi.A0d(r5, r0)
                                java.lang.Object r2 = r4.A02
                                X.9Xv r2 = (X.C183329Xv) r2
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "GetNewsletterMessagesJob/onDeliveryFailure iqId = "
                                X.C17900vP.A0f(r0, r5, r1)
                                com.whatsapp.newsletter.iq.GetNewsletterMessagesJob r0 = r2.A00
                                X.B8R r1 = r0.callback
                                if (r1 == 0) goto L_0x0005
                                java.lang.String r0 = r0.token
                                r1.CFT(r0)
                                return
                            L_0x0032:
                                r0 = 0
                                X.C18070vi.A0d(r5, r0)
                                java.lang.Object r0 = r4.A01
                                X.1O5 r0 = (X.AnonymousClass1O5) r0
                                r0.BrD(r5)
                                java.lang.Object r2 = r4.A02
                                X.Bly r2 = (X.C23570Bly) r2
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "Failed to deliver request: iq="
                                X.AnonymousClass8BY.A0m(r2, r0, r5, r1)
                                return
                            L_0x004b:
                                java.lang.Object r0 = r4.A02
                                X.B5w r0 = (X.C22393B5w) r0
                                X.Add r0 = (X.C21047Add) r0
                                X.8GZ r3 = r0.A00
                                X.1E7 r0 = r3.A02
                                if (r0 == 0) goto L_0x005e
                                X.1DT r1 = r3.A0F
                                boolean r0 = r0.A0r
                                X.AnonymousClass3MY.A1M(r1, r0)
                            L_0x005e:
                                r2 = 0
                                X.126 r1 = r3.A0T
                                r0 = 3012(0xbc4, float:4.221E-42)
                                r1.A0O(r0, r2)
                                return
                            L_0x0067:
                                java.lang.String r0 = "validateInternationalQrCode/onDeliveryFailure"
                                goto L_0x0132
                            L_0x006b:
                                java.lang.String r0 = "activateInternationalPayments/onActivateInternational/onDeliveryFailure"
                                goto L_0x0132
                            L_0x006f:
                                r0 = 0
                                X.C18070vi.A0d(r5, r0)
                                java.lang.Object r0 = r4.A02
                                X.9bO r0 = (X.C184709bO) r0
                                X.9Ye r2 = r0.A01
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "GetPixInfoRequest handler error iqId: "
                                X.C17900vP.A0e(r0, r5, r1)
                                com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel r0 = r2.A00
                                X.1DT r1 = r0.A00
                                java.lang.String r0 = "ERROR"
                                r1.A0E(r0)
                                return
                            L_0x008c:
                                r0 = 0
                                X.C18070vi.A0d(r5, r0)
                                java.lang.Object r0 = r4.A02
                                X.9mS r0 = (X.C191349mS) r0
                                X.B6B r1 = r0.A03
                                X.Ahc r1 = (X.C21291Ahc) r1
                                int r0 = r1.A00
                                if (r0 == 0) goto L_0x00aa
                                java.lang.Object r0 = r1.A01
                                X.0vk r0 = (X.C18090vk) r0
                                r0.invoke()
                            L_0x00a3:
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "BRGetCheckoutSessionRequest iq onDeliveryFailure: {"
                                goto L_0x00c8
                            L_0x00aa:
                                java.lang.Object r0 = r1.A02
                                com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel r0 = (com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel) r0
                                X.1DT r1 = r0.A00
                                r0 = 2
                                X.AnonymousClass3MX.A1K(r1, r0)
                                goto L_0x00a3
                            L_0x00b5:
                                r0 = 0
                                X.C18070vi.A0d(r5, r0)
                                java.lang.Object r0 = r4.A02
                                X.9lM r0 = (X.C190689lM) r0
                                X.BCI r0 = r0.A00
                                r0.BcC(r5)
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "CreateCustomPaymentMethodAction iq onDeliveryFailure: {"
                            L_0x00c8:
                                r1.append(r0)
                                r1.append(r5)
                                java.lang.String r0 = X.C17890vO.A0b(r1)
                                goto L_0x0132
                            L_0x00d3:
                                java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
                                java.lang.String r0 = "SubscribeNewsletterRequest/onDeliveryFailure iqId = "
                                goto L_0x00e7
                            L_0x00da:
                                java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
                                java.lang.String r0 = "GetNewsletterMyAddOnsMessagesJob/onDeliveryFailure iqId = "
                                goto L_0x00e7
                            L_0x00e1:
                                java.lang.StringBuilder r1 = X.C18070vi.A0K(r5)
                                java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/onDeliveryFailure iqId = "
                            L_0x00e7:
                                X.C17900vP.A0f(r0, r5, r1)
                                return
                            L_0x00eb:
                                java.lang.Object r1 = r4.A02
                                X.BBz r1 = (X.C22542BBz) r1
                                X.9L7 r0 = new X.9L7
                                r0.<init>(r5)
                                r1.BrC(r0)
                                return
                            L_0x00f8:
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/onDeliveryFailure/delivery failure"
                                com.whatsapp.util.Log.e((java.lang.String) r0)
                                java.lang.Object r1 = r4.A02
                                X.BAl r1 = (X.C22504BAl) r1
                                r0 = 0
                                r1.Btq(r0, r0)
                                return
                            L_0x0106:
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestToSetEmail/onDeliveryFailure/delivery failure"
                                com.whatsapp.util.Log.e((java.lang.String) r0)
                                java.lang.Object r1 = r4.A02
                                X.BCt r1 = (X.C22560BCt) r1
                                r0 = 0
                                r1.Btp(r0)
                                return
                            L_0x0114:
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestForEmailOtp/onDeliveryFailure/delivery failure"
                                com.whatsapp.util.Log.e((java.lang.String) r0)
                                java.lang.Object r1 = r4.A02
                                X.BAk r1 = (X.C22503BAk) r1
                                r0 = 0
                                r1.Btq(r0, r0)
                                return
                            L_0x0122:
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestForEmail/onDeliveryFailure/delivery failure"
                                com.whatsapp.util.Log.e((java.lang.String) r0)
                                java.lang.Object r1 = r4.A01
                                X.BAj r1 = (X.C22502BAj) r1
                                r0 = 0
                                r1.Btp(r0)
                                return
                            L_0x0130:
                                java.lang.String r0 = "Delivery failure on fetching non admin GJRs"
                            L_0x0132:
                                com.whatsapp.util.Log.e((java.lang.String) r0)
                                return
                            L_0x0136:
                                r0 = 0
                                X.C18070vi.A0d(r5, r0)
                                java.lang.String r0 = "GetGroupProfilePicturesProtocolHelper/delivery-error"
                                com.whatsapp.util.Log.e((java.lang.String) r0)
                                java.lang.Object r1 = r4.A01
                                X.1dr r1 = (X.C30391dr) r1
                                X.9L6 r0 = new X.9L6
                                r0.<init>(r5)
                                X.1IU r0 = X.C30691eM.A00(r0)
                                X.AnonymousClass8BT.A1P(r0, r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C20996Aco.BrD(java.lang.String):void");
                        }

                        public void Bt9(C29621ca r13, String str) {
                            AnonymousClass1UI r0;
                            AnonymousClass1UI r02;
                            String str2;
                            AnonymousClass1UI r03;
                            Long l;
                            AnonymousClass1UI r04;
                            Long l2;
                            StringBuilder sb;
                            String str3;
                            AnonymousClass126 r1;
                            int i;
                            switch (this.A00) {
                                case 0:
                                    boolean A17 = C18070vi.A17(str, r13);
                                    try {
                                        AnonymousClass9F6 r05 = (AnonymousClass9F6) this.A02;
                                        AnonymousClass8BT.A1I(r13, r05, 2);
                                        C62672rm A0s = AnonymousClass8BR.A0s();
                                        A97 a97 = A97.A00;
                                        if (((AnonymousClass9DG) C21290Ahb.A00((C29621ca) r05.A00, a97, 42).BCF(r13, A0s)) != null) {
                                            C22470B9c[] b9cArr = new C22470B9c[6];
                                            C21283AhU.A00(b9cArr, 27, 0, a97);
                                            C21283AhU.A00(b9cArr, 28, A17 ? 1 : 0, a97);
                                            C21283AhU.A00(b9cArr, 29, 2, a97);
                                            b9cArr[3] = new C21283AhU(a97, 30);
                                            b9cArr[4] = new C21283AhU(a97, 31);
                                            Object A06 = A0s.A06(r13, "IQErrorItemNotFound|IQErrorForbidden|IQErrorNotAllowed|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorFallbackClient", C18070vi.A0O(new C21283AhU(a97, 32), b9cArr, 5), AnonymousClass8BS.A1b(A17, 0));
                                            if (A06 != null) {
                                                StringBuilder A10 = AnonymousClass000.A10();
                                                A10.append("GetGroupProfilePicturesProtocolHelper/Fetching group photos failed: ");
                                                long BOr = ((C22476B9i) A06).BOr();
                                                A10.append(BOr);
                                                C17890vO.A0w(A10);
                                                AnonymousClass8BT.A1P(C30691eM.A00(new AnonymousClass9LJ(str, (int) BOr)), (C31761g5) this.A01);
                                                return;
                                            }
                                            r0 = AnonymousClass1O9.A00(A0s);
                                        } else {
                                            r0 = AnonymousClass1O9.A00(A0s);
                                        }
                                        throw r0;
                                    } catch (Exception e) {
                                        C17900vP.A0X(e, "GetGroupProfilePicturesProtocolHelper/", AnonymousClass000.A10());
                                        AnonymousClass8BT.A1P(C108945cZ.A1J(e), (C30391dr) this.A01);
                                        return;
                                    }
                                case 1:
                                    C18070vi.A0d(r13, 1);
                                    try {
                                        AnonymousClass9F6 r06 = (AnonymousClass9F6) this.A02;
                                        AnonymousClass8BT.A1I(r13, r06, 2);
                                        Object obj = r06.A00;
                                        C62672rm A0s2 = AnonymousClass8BR.A0s();
                                        A97 a972 = A97.A00;
                                        C21290Ahb ahb = new C21290Ahb(obj, a972, 44);
                                        C18070vi.A0d(ahb, 1);
                                        if (ahb.BCF(r13, A0s2) != null) {
                                            C22470B9c[] b9cArr2 = new C22470B9c[4];
                                            C21283AhU.A00(b9cArr2, 34, 0, a972);
                                            C21283AhU.A00(b9cArr2, 35, 1, a972);
                                            C21283AhU.A00(b9cArr2, 36, 2, a972);
                                            Object A062 = A0s2.A06(r13, "IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorRateOverlimit", C18070vi.A0O(new C21283AhU(a972, 37), b9cArr2, 3), AnonymousClass8BS.A1b(1, 0));
                                            if (A062 != null) {
                                                StringBuilder A102 = AnonymousClass000.A10();
                                                A102.append("Fetching parent participants failed: ");
                                                C17890vO.A16(A102, ((C22477B9j) A062).BOr());
                                                return;
                                            }
                                            r02 = AnonymousClass1O9.A00(A0s2);
                                        } else {
                                            r02 = AnonymousClass1O9.A00(A0s2);
                                        }
                                        throw r02;
                                    } catch (AnonymousClass1UI e2) {
                                        Log.e((Throwable) e2);
                                        return;
                                    }
                                case 2:
                                    str2 = "Error fetching non admin GJRs";
                                    break;
                                case 3:
                                    int A002 = C60482o6.A00(r13);
                                    Iterator A13 = AnonymousClass8BR.A13(this.A02);
                                    while (A13.hasNext()) {
                                        AnonymousClass123.A00((AnonymousClass123) this.A01, (DeviceJid) A13.next(), A002);
                                    }
                                    return;
                                case 4:
                                    int A012 = AnonymousClass8BW.A01(r13);
                                    C17900vP.A0i("EmailVerificationXmppMethods/sendRequestForEmail/onError/", AnonymousClass000.A10(), A012);
                                    ((C22502BAj) this.A01).Btp(Integer.valueOf(A012));
                                    return;
                                case 5:
                                    C18070vi.A0d(r13, 1);
                                    int A003 = C60482o6.A00(r13);
                                    C17900vP.A0i("EmailVerificationXmppMethods/sendRequestForEmailOtp/onError/", AnonymousClass000.A10(), A003);
                                    try {
                                        AnonymousClass9F6 r07 = (AnonymousClass9F6) this.A01;
                                        AnonymousClass8BT.A1I(r13, r07, 2);
                                        Object obj2 = r07.A00;
                                        C62672rm A0s3 = AnonymousClass8BR.A0s();
                                        C20071A5w a5w = C20071A5w.A00;
                                        C21290Ahb ahb2 = new C21290Ahb(obj2, a5w, 3);
                                        C18070vi.A0d(ahb2, 1);
                                        if (ahb2.BCF(r13, A0s3) != null) {
                                            C22470B9c[] b9cArr3 = new C22470B9c[4];
                                            C21282AhT.A00(b9cArr3, 6, 0, a5w);
                                            C21282AhT.A00(b9cArr3, 7, 1, a5w);
                                            C21282AhT.A00(b9cArr3, 8, 2, a5w);
                                            Object A063 = A0s3.A06(r13, "IQErrorEmailTooMany|IQErrorEmailTooRecent|IQErrorInternalServerError|IQErrorForbidden", C18070vi.A0O(new C21282AhT(a5w, 9), b9cArr3, 3), AnonymousClass8BS.A1b(1, 0));
                                            if (A063 != null) {
                                                B68 b68 = (B68) A063;
                                                if (b68 instanceof AnonymousClass9DS) {
                                                    AnonymousClass9DS r12 = (AnonymousClass9DS) b68;
                                                    if (r12.A00 == 0) {
                                                        C18070vi.A0z(b68, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailTooManyMixin");
                                                        l = (Long) r12.A02;
                                                    } else {
                                                        C18070vi.A0z(b68, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailTooRecentMixin");
                                                        l = (Long) r12.A02;
                                                    }
                                                } else {
                                                    l = null;
                                                }
                                                ((C22503BAk) this.A02).Btq(Integer.valueOf(A003), l);
                                                return;
                                            }
                                            r03 = AnonymousClass1O9.A00(A0s3);
                                        } else {
                                            r03 = AnonymousClass1O9.A00(A0s3);
                                        }
                                        throw r03;
                                    } catch (AnonymousClass1UI e3) {
                                        C17900vP.A0X(e3, "EmailVerificationXmppMethods/sendRequestForEmailOtp/CorruptStreamException: ", AnonymousClass000.A10());
                                        ((C22503BAk) this.A02).Btq((Integer) null, (Long) null);
                                        throw AnonymousClass1UI.A01(AnonymousClass001.A1E(e3, "EmailVerificationXmppMethods: ", AnonymousClass000.A10()));
                                    }
                                case 6:
                                    int A013 = AnonymousClass8BW.A01(r13);
                                    C17900vP.A0i("EmailVerificationXmppMethods/sendRequestToSetEmail/onError/", AnonymousClass000.A10(), A013);
                                    ((C22560BCt) this.A02).Btp(Integer.valueOf(A013));
                                    return;
                                case 7:
                                    C18070vi.A0d(r13, 1);
                                    int A004 = C60482o6.A00(r13);
                                    C17900vP.A0i("EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/onError/", AnonymousClass000.A10(), A004);
                                    try {
                                        AnonymousClass9F6 r08 = (AnonymousClass9F6) this.A01;
                                        AnonymousClass8BT.A1I(r13, r08, 2);
                                        Object obj3 = r08.A00;
                                        C62672rm A0s4 = AnonymousClass8BR.A0s();
                                        C20071A5w a5w2 = C20071A5w.A00;
                                        C21290Ahb ahb3 = new C21290Ahb(obj3, a5w2, 7);
                                        C18070vi.A0d(ahb3, 1);
                                        if (ahb3.BCF(r13, A0s4) != null) {
                                            C22470B9c[] b9cArr4 = new C22470B9c[4];
                                            C21282AhT.A00(b9cArr4, 11, 0, a5w2);
                                            C21282AhT.A00(b9cArr4, 12, 1, a5w2);
                                            C21282AhT.A00(b9cArr4, 13, 2, a5w2);
                                            Object A064 = A0s4.A06(r13, "IQErrorEmailOTPStale|IQErrorEmailGuessTooRecent|IQErrorInternalServerError|IQErrorForbidden", C18070vi.A0O(new C21282AhT(a5w2, 14), b9cArr4, 3), AnonymousClass8BS.A1b(1, 0));
                                            if (A064 != null) {
                                                B69 b69 = (B69) A064;
                                                if (b69 instanceof AnonymousClass9DT) {
                                                    AnonymousClass9DT r14 = (AnonymousClass9DT) b69;
                                                    if (r14.A00 == 1) {
                                                        C18070vi.A0z(b69, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailOTPStaleMixin");
                                                        l2 = (Long) r14.A02;
                                                    } else {
                                                        C18070vi.A0z(b69, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailGuessTooRecentMixin");
                                                        l2 = (Long) r14.A02;
                                                    }
                                                } else {
                                                    l2 = null;
                                                }
                                                ((C22504BAl) this.A02).Btq(Integer.valueOf(A004), l2);
                                                return;
                                            }
                                            r04 = AnonymousClass1O9.A00(A0s4);
                                        } else {
                                            r04 = AnonymousClass1O9.A00(A0s4);
                                        }
                                        throw r04;
                                    } catch (AnonymousClass1UI e4) {
                                        C17900vP.A0X(e4, "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/CorruptStreamException: ", AnonymousClass000.A10());
                                        ((C22504BAl) this.A02).Btq((Integer) null, (Long) null);
                                        throw AnonymousClass1UI.A01(AnonymousClass001.A1E(e4, "EmailVerificationXmppMethods: ", AnonymousClass000.A10()));
                                    }
                                case 8:
                                    ((AS1) this.A01).A01.A0G("BaseFetchCertificateProtocolHelper failed with a server error", (String) null, false);
                                    ((C22542BBz) this.A02).Bsw(new C122936Sm(r13, str));
                                    return;
                                case 9:
                                    A01((C183329Xv) this.A02, r13, (AnonymousClass9F7) A00(this, r13));
                                    return;
                                case 10:
                                    A02((C183339Xw) this.A02, r13, (AnonymousClass9F7) A00(this, r13));
                                    return;
                                case 11:
                                    A03((C183349Xx) this.A02, r13, (AnonymousClass9F7) A00(this, r13));
                                    return;
                                case 12:
                                    A04((C186069db) this.A02, r13, (AnonymousClass9F7) A00(this, r13));
                                    return;
                                case 13:
                                    A07(r13, ((C190689lM) this.A02).A00, (AnonymousClass9F1) A00(this, r13));
                                    sb = AnonymousClass000.A10();
                                    str3 = "CreateCustomPaymentMethodAction iq onError: {";
                                    break;
                                case 14:
                                    A06(r13, (AnonymousClass9F6) A00(this, r13), ((C191349mS) this.A02).A03);
                                    sb = AnonymousClass000.A10();
                                    str3 = "BRGetCheckoutSessionRequest iq onError: {";
                                    break;
                                case 15:
                                    A05(((C184709bO) this.A02).A01, r13, (AnonymousClass9F6) A00(this, r13));
                                    return;
                                case 16:
                                    C184929bk r4 = (C184929bk) A00(this, r13);
                                    AnonymousClass9F7 r15 = (AnonymousClass9F7) this.A02;
                                    AnonymousClass8BT.A1I(r13, r15, 2);
                                    Object obj4 = r15.A00;
                                    C62672rm A0s5 = AnonymousClass8BR.A0s();
                                    C178359Cu r2 = (C178359Cu) C21289Aha.A01(r13, A0s5, obj4, C20072A5y.A00, 31);
                                    if (r2 != null) {
                                        A1l a1l = null;
                                        long j = r2.A00;
                                        String str4 = r2.A04;
                                        IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = r4.A01;
                                        AZ6 az6 = indiaUpiInternationalActivationViewModel.A03;
                                        C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
                                        A03.A07("payments_error_code", String.valueOf(j));
                                        A03.A07("payments_error_text", str4);
                                        C20087A6p.A02(A03, az6, AnonymousClass8BS.A0V(), "international_payment_prompt", (String) null, 4);
                                        AnonymousClass1DT r6 = indiaUpiInternationalActivationViewModel.A00;
                                        A1l a1l2 = (A1l) r6.A06();
                                        if (a1l2 != null) {
                                            Application application = indiaUpiInternationalActivationViewModel.A00;
                                            C18070vi.A0z(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                                            a1l = new A1l(new C194549ru(j, application.getString(2131894220), application.getString(2131897646)), a1l2.A01, false);
                                        }
                                        r6.A0E(a1l);
                                        return;
                                    }
                                    throw AnonymousClass1O9.A00(A0s5);
                                case 17:
                                    C186169dl r42 = (C186169dl) A00(this, r13);
                                    AnonymousClass9F7 r16 = (AnonymousClass9F7) this.A02;
                                    AnonymousClass8BT.A1I(r13, r16, 2);
                                    Object obj5 = r16.A00;
                                    C62672rm A0s6 = AnonymousClass8BR.A0s();
                                    C178359Cu r17 = (C178359Cu) C21289Aha.A01(r13, A0s6, obj5, C20072A5y.A00, 35);
                                    if (r17 != null) {
                                        C19968A1d a1d = null;
                                        IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = r42.A01;
                                        AnonymousClass1DT r62 = indiaUpiInternationalValidateQrViewModel.A00;
                                        C19968A1d a1d2 = (C19968A1d) r62.A06();
                                        if (a1d2 != null) {
                                            long j2 = r17.A00;
                                            Application application2 = indiaUpiInternationalValidateQrViewModel.A00;
                                            C18070vi.A0z(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                                            a1d = new C19968A1d(new C194559rv(j2, application2.getString(2131894220), application2.getString(2131897646)), a1d2.A01);
                                        }
                                        r62.A0E(a1d);
                                        return;
                                    }
                                    throw AnonymousClass1O9.A00(A0s6);
                                case 18:
                                    int A014 = AnonymousClass8BW.A01(r13);
                                    C17900vP.A0i("PushXmppMethod/clientConfigSetError/", AnonymousClass000.A10(), A014);
                                    if (A014 == 409) {
                                        C191159m7 r18 = (C191159m7) this.A02;
                                        Context context = r18.A00.A00;
                                        C25081Mu r43 = r18.A01;
                                        Log.i("GCM: force replacing gcm token");
                                        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
                                        r43.A01(context, new Intent("com.whatsapp.action.FORCE_REPLACE", (Uri) null, context, cls), cls, 4);
                                    }
                                    C22523BBg bBg = (C22523BBg) this.A01;
                                    if (bBg != null) {
                                        bBg.Bti();
                                        return;
                                    }
                                    return;
                                case 19:
                                    C18070vi.A0d(r13, 1);
                                    C22393B5w b5w = (C22393B5w) this.A02;
                                    C29621ca A0K = r13.A0K("error");
                                    int i2 = -2;
                                    if (A0K != null) {
                                        i2 = A0K.A0A("code", -2);
                                    }
                                    AnonymousClass8GZ r3 = ((C21047Add) b5w).A00;
                                    AnonymousClass1E7 r09 = r3.A02;
                                    if (r09 != null) {
                                        AnonymousClass3MY.A1M(r3.A0F, r09.A0r);
                                    }
                                    if (!(i2 == -2 || i2 == -1 || i2 == 400)) {
                                        if (i2 == 401) {
                                            r1 = r3.A0T;
                                            i = 3010;
                                        } else if (i2 == 403) {
                                            r1 = r3.A0T;
                                            i = 3011;
                                        } else if (!(i2 == 404 || i2 == 500)) {
                                            return;
                                        }
                                        r1.A0O(i, (Object) null);
                                        return;
                                    }
                                    r1 = r3.A0T;
                                    i = 3012;
                                    r1.A0O(i, (Object) null);
                                    return;
                                default:
                                    C18070vi.A0h(str, r13);
                                    ((AnonymousClass1O5) this.A01).C7Z(r13, str);
                                    AnonymousClass8BU.A1G(this.A02);
                                    return;
                            }
                            sb.append(str3);
                            sb.append(r13);
                            str2 = AnonymousClass000.A0y(".toString()}", sb);
                            Log.e(str2);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:306:0x099c, code lost:
                            if (java.math.BigDecimal.ZERO.compareTo(new java.math.BigDecimal(r7)) == 0) goto L_0x099e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e4, code lost:
                            if (r9.A00 != r6) goto L_0x01e6;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void C7Z(X.C29621ca r37, java.lang.String r38) {
                            /*
                                r36 = this;
                                r3 = r36
                                int r1 = r3.A00
                                r0 = r37
                                switch(r1) {
                                    case 0: goto L_0x013a;
                                    case 1: goto L_0x027c;
                                    case 2: goto L_0x02f7;
                                    case 3: goto L_0x001b;
                                    case 4: goto L_0x0354;
                                    case 5: goto L_0x0410;
                                    case 6: goto L_0x0489;
                                    case 7: goto L_0x0548;
                                    case 8: goto L_0x00bd;
                                    case 9: goto L_0x05f0;
                                    case 10: goto L_0x05fe;
                                    case 11: goto L_0x060c;
                                    case 12: goto L_0x061a;
                                    case 13: goto L_0x0628;
                                    case 14: goto L_0x0638;
                                    case 15: goto L_0x0648;
                                    case 16: goto L_0x0658;
                                    case 17: goto L_0x07f5;
                                    case 18: goto L_0x00ae;
                                    case 19: goto L_0x0a2a;
                                    default: goto L_0x0009;
                                }
                            L_0x0009:
                                r2 = r38
                                X.C18070vi.A0h(r2, r0)
                                java.lang.Object r1 = r3.A01
                                X.1O5 r1 = (X.AnonymousClass1O5) r1
                                r1.C7Z(r0, r2)
                                java.lang.Object r0 = r3.A02
                                X.AnonymousClass8BU.A1G(r0)
                            L_0x001a:
                                return
                            L_0x001b:
                                java.lang.String r1 = "list"
                                X.1ca r1 = r0.A0L(r1)
                                java.lang.String r0 = "user"
                                java.util.List r1 = r1.A0R(r0)
                                r0 = 44
                                X.C21486Akr.A01(r0, r1)
                                java.util.Iterator r6 = r1.iterator()
                            L_0x0030:
                                boolean r0 = r6.hasNext()
                                if (r0 == 0) goto L_0x001a
                                X.1ca r5 = X.C17880vN.A0a(r6)
                                java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
                                java.lang.String r0 = "jid"
                                com.whatsapp.jid.Jid r4 = r5.A0G(r1, r0)
                                com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
                                java.lang.String r0 = "error"
                                X.1ca r2 = r5.A0K(r0)
                                if (r2 == 0) goto L_0x005a
                                java.lang.Object r1 = r3.A01
                                X.123 r1 = (X.AnonymousClass123) r1
                                java.lang.String r0 = "code"
                                int r0 = r2.A09(r0)
                                X.AnonymousClass123.A00(r1, r4, r0)
                                goto L_0x0030
                            L_0x005a:
                                java.lang.String r0 = "identity"
                                X.1ca r10 = r5.A0L(r0)
                                java.lang.String r0 = "type"
                                X.1ca r2 = r5.A0L(r0)
                                java.lang.String r0 = "device-identity"
                                X.1ca r8 = r5.A0K(r0)
                                byte[] r0 = r2.A01
                                if (r0 == 0) goto L_0x0a34
                                int r1 = r0.length
                                r0 = 1
                                if (r1 != r0) goto L_0x0a34
                                java.lang.Object r1 = r3.A01
                                X.123 r1 = (X.AnonymousClass123) r1
                                X.00H r0 = r1.A05
                                java.lang.Object r0 = r0.get()
                                X.1P3 r0 = (X.AnonymousClass1P3) r0
                                boolean r0 = r0.A0Y()
                                if (r0 == 0) goto L_0x0097
                                X.10I r1 = r1.A00
                                r13 = 18
                                X.AkZ r0 = new X.AkZ
                                r7 = r0
                                r9 = r3
                                r11 = r4
                                r12 = r2
                                r7.<init>(r8, r9, r10, r11, r12, r13)
                                r1.CGF(r0)
                                goto L_0x0030
                            L_0x0097:
                                X.00H r0 = r1.A06
                                java.lang.Object r1 = r0.get()
                                X.1Ot r1 = (X.C25581Ot) r1
                                r13 = 19
                                X.AkZ r0 = new X.AkZ
                                r7 = r0
                                r9 = r3
                                r11 = r4
                                r12 = r2
                                r7.<init>(r8, r9, r10, r11, r12, r13)
                                r1.A02(r0)
                                goto L_0x0030
                            L_0x00ae:
                                java.lang.String r0 = "PushXmppMethod/read/client_config_set"
                                com.whatsapp.util.Log.i((java.lang.String) r0)
                                java.lang.Object r0 = r3.A01
                                X.BBg r0 = (X.C22523BBg) r0
                                if (r0 == 0) goto L_0x001a
                                r0.onSuccess()
                                return
                            L_0x00bd:
                                java.lang.Object r4 = r3.A01     // Catch:{ 1UI -> 0x0131 }
                                X.AS1 r4 = (X.AS1) r4     // Catch:{ 1UI -> 0x0131 }
                                java.lang.Object r5 = r3.A02     // Catch:{ 1UI -> 0x0131 }
                                X.BBz r5 = (X.C22542BBz) r5     // Catch:{ 1UI -> 0x0131 }
                                java.lang.String r1 = "reply"
                                X.1ca r2 = r0.A0L(r1)     // Catch:{ 1UI -> 0x0131 }
                                r4.A00(r2)     // Catch:{ 1UI -> 0x0131 }
                                java.lang.String r0 = "algorithm"
                                r9 = 0
                                r2.A0Q(r0, r9)     // Catch:{ 1UI -> 0x0131 }
                                java.lang.String r0 = "encryption_pem"
                                X.1ca r1 = r2.A0L(r0)     // Catch:{ 1UI -> 0x0131 }
                                java.lang.String r0 = "signature_pem"
                                X.1ca r0 = r2.A0L(r0)     // Catch:{ 1UI -> 0x0131 }
                                java.lang.String r7 = r1.A0M()     // Catch:{ 1UI -> 0x0131 }
                                if (r7 == 0) goto L_0x0123
                                java.lang.String r8 = r0.A0M()     // Catch:{ 1UI -> 0x0131 }
                                if (r8 == 0) goto L_0x011c
                                java.lang.String r0 = "password_pem"
                                X.1ca r1 = r2.A0K(r0)     // Catch:{ 1UI -> 0x0131 }
                                if (r1 == 0) goto L_0x0116
                                java.lang.String r9 = r1.A0M()     // Catch:{ 1UI -> 0x0131 }
                                boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 1UI -> 0x0131 }
                                if (r0 != 0) goto L_0x012a
                                java.lang.String r0 = "key_id"
                                java.lang.String r10 = r1.A0P(r0)     // Catch:{ 1UI -> 0x0131 }
                                java.lang.String r0 = "ttl"
                                java.lang.String r0 = r1.A0P(r0)     // Catch:{ 1UI -> 0x0131 }
                                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x010f }
                                goto L_0x0118
                            L_0x010f:
                                r0 = move-exception
                                X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x0131 }
                                r1.<init>((java.lang.Throwable) r0)     // Catch:{ 1UI -> 0x0131 }
                                goto L_0x0130
                            L_0x0116:
                                r6 = 0
                                r10 = r9
                            L_0x0118:
                                r5.C7n(r6, r7, r8, r9, r10)     // Catch:{ 1UI -> 0x0131 }
                                return
                            L_0x011c:
                                java.lang.String r0 = "missing sig"
                                X.1UI r1 = X.AnonymousClass1UI.A01(r0)     // Catch:{ 1UI -> 0x0131 }
                                goto L_0x0130
                            L_0x0123:
                                java.lang.String r0 = "missing cert"
                                X.1UI r1 = X.AnonymousClass1UI.A01(r0)     // Catch:{ 1UI -> 0x0131 }
                                goto L_0x0130
                            L_0x012a:
                                java.lang.String r0 = "empty key"
                                X.1UI r1 = X.AnonymousClass1UI.A01(r0)     // Catch:{ 1UI -> 0x0131 }
                            L_0x0130:
                                throw r1     // Catch:{ 1UI -> 0x0131 }
                            L_0x0131:
                                r1 = move-exception
                                java.lang.Object r0 = r3.A02
                                X.BBz r0 = (X.C22542BBz) r0
                                r0.Bsw(r1)
                                throw r1
                            L_0x013a:
                                r1 = 1
                                X.C18070vi.A0d(r0, r1)
                                long r1 = android.os.SystemClock.elapsedRealtime()
                                java.util.ArrayList r5 = X.AnonymousClass000.A13()
                                java.lang.Object r6 = r3.A02     // Catch:{ Exception -> 0x026f }
                                X.9F6 r6 = (X.AnonymousClass9F6) r6     // Catch:{ Exception -> 0x026f }
                                r4 = 2
                                X.AnonymousClass8BT.A1I(r0, r6, r4)     // Catch:{ Exception -> 0x026f }
                                java.lang.Object r7 = r6.A00     // Catch:{ Exception -> 0x026f }
                                X.1ca r7 = (X.C29621ca) r7     // Catch:{ Exception -> 0x026f }
                                X.2rm r9 = X.AnonymousClass8BR.A0s()     // Catch:{ Exception -> 0x026f }
                                X.A97 r8 = X.A97.A00     // Catch:{ Exception -> 0x026f }
                                r6 = 43
                                X.Ahb r4 = new X.Ahb     // Catch:{ Exception -> 0x026f }
                                r4.<init>(r7, r8, r6)     // Catch:{ Exception -> 0x026f }
                                boolean r6 = X.C72453Mb.A1Z(r4)     // Catch:{ Exception -> 0x026f }
                                java.lang.Object r4 = r4.BCF(r0, r9)     // Catch:{ Exception -> 0x026f }
                                X.9DG r4 = (X.AnonymousClass9DG) r4     // Catch:{ Exception -> 0x026f }
                                if (r4 == 0) goto L_0x0263
                                r4 = 33
                                X.AhU r7 = new X.AhU     // Catch:{ Exception -> 0x026f }
                                r7.<init>(r8, r4)     // Catch:{ Exception -> 0x026f }
                                r4 = 1
                                X.C18070vi.A0d(r7, r4)     // Catch:{ Exception -> 0x026f }
                                java.lang.Object r0 = r7.BCF(r0, r9)     // Catch:{ Exception -> 0x026f }
                                X.9DO r0 = (X.AnonymousClass9DO) r0     // Catch:{ Exception -> 0x026f }
                                if (r0 == 0) goto L_0x025e
                                java.lang.Object r0 = r0.A01     // Catch:{ Exception -> 0x026f }
                                java.util.Iterator r10 = X.AnonymousClass8BR.A13(r0)     // Catch:{ Exception -> 0x026f }
                            L_0x0184:
                                boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x026f }
                                if (r0 == 0) goto L_0x0251
                                java.lang.Object r8 = r10.next()     // Catch:{ Exception -> 0x026f }
                                X.9DP r8 = (X.AnonymousClass9DP) r8     // Catch:{ Exception -> 0x026f }
                                X.C18070vi.A0d(r8, r6)     // Catch:{ Exception -> 0x026f }
                                java.lang.Object r7 = r8.A00     // Catch:{ Exception -> 0x026f }
                                X.9Co r7 = (X.C178299Co) r7     // Catch:{ Exception -> 0x026f }
                                r4 = 1
                                if (r7 == 0) goto L_0x024a
                                int r0 = r7.A00     // Catch:{ Exception -> 0x026f }
                                if (r0 != r4) goto L_0x0235
                                java.lang.Object r12 = r7.A02     // Catch:{ Exception -> 0x026f }
                                X.1EC r12 = (X.AnonymousClass1EC) r12     // Catch:{ Exception -> 0x026f }
                                java.lang.Object r7 = r8.A02     // Catch:{ Exception -> 0x026f }
                                X.B6O r7 = (X.B6O) r7     // Catch:{ Exception -> 0x026f }
                                boolean r0 = r7 instanceof X.AnonymousClass9E7     // Catch:{ Exception -> 0x026f }
                                r4 = 0
                                if (r0 == 0) goto L_0x01d7
                                X.9E7 r7 = (X.AnonymousClass9E7) r7     // Catch:{ Exception -> 0x026f }
                                X.9CY r0 = r7.A00     // Catch:{ Exception -> 0x026f }
                                java.lang.String r9 = r0.A01     // Catch:{ Exception -> 0x026f }
                                X.9CY r0 = r7.A01     // Catch:{ Exception -> 0x026f }
                                java.lang.String r8 = r0.A01     // Catch:{ Exception -> 0x026f }
                                X.B6P r7 = r7.A02     // Catch:{ Exception -> 0x026f }
                                boolean r0 = r7 instanceof X.AnonymousClass9ED     // Catch:{ Exception -> 0x026f }
                                if (r0 == 0) goto L_0x01c1
                                X.9ED r7 = (X.AnonymousClass9ED) r7     // Catch:{ Exception -> 0x026f }
                                byte[] r7 = r7.A00     // Catch:{ Exception -> 0x026f }
                                r15 = r4
                                goto L_0x01d4
                            L_0x01c1:
                                boolean r0 = r7 instanceof X.AnonymousClass9EE     // Catch:{ Exception -> 0x026f }
                                if (r0 == 0) goto L_0x01d2
                                X.9EE r7 = (X.AnonymousClass9EE) r7     // Catch:{ MalformedURLException -> 0x0268 }
                                java.lang.String r0 = r7.A01     // Catch:{ MalformedURLException -> 0x0268 }
                                java.net.URL r15 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0268 }
                                r15.<init>(r0)     // Catch:{ MalformedURLException -> 0x0268 }
                                java.lang.String r13 = r7.A00     // Catch:{ Exception -> 0x026f }
                                r7 = r4
                                goto L_0x01d5
                            L_0x01d2:
                                r7 = r4
                                r15 = r4
                            L_0x01d4:
                                r13 = r4
                            L_0x01d5:
                                r4 = r9
                                goto L_0x0200
                            L_0x01d7:
                                boolean r0 = r7 instanceof X.AnonymousClass9E6     // Catch:{ Exception -> 0x026f }
                                if (r0 == 0) goto L_0x0184
                                X.9E6 r7 = (X.AnonymousClass9E6) r7     // Catch:{ Exception -> 0x026f }
                                X.9Cm r9 = r7.A00     // Catch:{ Exception -> 0x026f }
                                if (r9 == 0) goto L_0x01e6
                                int r7 = r9.A00     // Catch:{ Exception -> 0x026f }
                                r0 = 1
                                if (r7 == r6) goto L_0x01e7
                            L_0x01e6:
                                r0 = 0
                            L_0x01e7:
                                java.lang.String r8 = "GetGroupProfilePicturesProtocolHelper/Fetching group photos partially failed: "
                                if (r0 != 0) goto L_0x021b
                                r0 = 1
                                if (r9 == 0) goto L_0x0184
                                int r7 = r9.A00     // Catch:{ Exception -> 0x026f }
                                if (r7 == r0) goto L_0x021b
                                r0 = 2
                                if (r7 == r0) goto L_0x0184
                                r0 = 3
                                if (r7 != r0) goto L_0x0184
                                java.lang.String r8 = "preview"
                                r7 = r4
                                r15 = r4
                                r13 = r4
                                r17 = -1
                                goto L_0x0204
                            L_0x0200:
                                int r17 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0226 }
                            L_0x0204:
                                java.lang.String r0 = "preview"
                                boolean r0 = r0.equals(r8)     // Catch:{ NumberFormatException -> 0x0226 }
                                int r18 = X.C72453Mb.A03(r0)
                                r14 = 0
                                X.2gM r11 = new X.2gM     // Catch:{ NumberFormatException -> 0x0226 }
                                r16 = r7
                                r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ NumberFormatException -> 0x0226 }
                                r5.add(r11)     // Catch:{ NumberFormatException -> 0x0226 }
                                goto L_0x0184
                            L_0x021b:
                                java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r8)     // Catch:{ Exception -> 0x026f }
                                java.lang.String r0 = r9.A02     // Catch:{ Exception -> 0x026f }
                                X.C17890vO.A19(r4, r0)     // Catch:{ Exception -> 0x026f }
                                goto L_0x0184
                            L_0x0226:
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x026f }
                                java.lang.String r0 = "Malformed photo id="
                                java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ Exception -> 0x026f }
                                X.1UI r1 = X.AnonymousClass1UI.A01(r0)     // Catch:{ Exception -> 0x026f }
                                goto L_0x026e
                            L_0x0235:
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x026f }
                                java.lang.String r0 = "An operation is not implemented: "
                                r1.append(r0)     // Catch:{ Exception -> 0x026f }
                                java.lang.String r0 = "support parent_group_jid key for community photo if needed"
                                java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x026f }
                                X.6Rw r1 = new X.6Rw     // Catch:{ Exception -> 0x026f }
                                r1.<init>(r0)     // Catch:{ Exception -> 0x026f }
                                goto L_0x026e
                            L_0x024a:
                                java.lang.String r0 = "handleGroupPicture/unexpected linked group"
                                X.1UI r1 = X.AnonymousClass1UI.A01(r0)     // Catch:{ Exception -> 0x026f }
                                goto L_0x026e
                            L_0x0251:
                                java.lang.Object r4 = r3.A01     // Catch:{ Exception -> 0x026f }
                                X.1g5 r4 = (X.C31761g5) r4     // Catch:{ Exception -> 0x026f }
                                X.9qb r0 = new X.9qb     // Catch:{ Exception -> 0x026f }
                                r0.<init>(r5, r1)     // Catch:{ Exception -> 0x026f }
                                X.AnonymousClass8BT.A1P(r0, r4)     // Catch:{ Exception -> 0x026f }
                                return
                            L_0x025e:
                                X.1UI r1 = X.AnonymousClass1O9.A00(r9)     // Catch:{ Exception -> 0x026f }
                                goto L_0x026e
                            L_0x0263:
                                X.1UI r1 = X.AnonymousClass1O9.A00(r9)     // Catch:{ Exception -> 0x026f }
                                goto L_0x026e
                            L_0x0268:
                                java.lang.String r0 = "handleGroupPicture/Malformed picture url"
                                X.1UI r1 = X.AnonymousClass1UI.A01(r0)     // Catch:{ Exception -> 0x026f }
                            L_0x026e:
                                throw r1     // Catch:{ Exception -> 0x026f }
                            L_0x026f:
                                r0 = move-exception
                                java.lang.Object r1 = r3.A01
                                X.1dr r1 = (X.C30391dr) r1
                                X.1IU r0 = X.C108945cZ.A1J(r0)
                                X.AnonymousClass8BT.A1P(r0, r1)
                                return
                            L_0x027c:
                                r8 = 1
                                X.C18070vi.A0d(r0, r8)
                                java.lang.Object r1 = r3.A02
                                X.9F6 r1 = (X.AnonymousClass9F6) r1
                                r7 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r7)
                                java.lang.Object r4 = r1.A00
                                X.2rm r5 = X.AnonymousClass8BR.A0s()
                                X.A97 r6 = X.A97.A00
                                r2 = 45
                                X.Ahb r1 = new X.Ahb
                                r1.<init>(r4, r6, r2)
                                r2 = 0
                                X.C18070vi.A0d(r1, r8)
                                java.lang.Object r1 = r1.BCF(r0, r5)
                                if (r1 == 0) goto L_0x02f2
                                java.lang.String[] r4 = new java.lang.String[r7]
                                java.lang.String r1 = "linked_groups_participants"
                                r4[r2] = r1
                                java.lang.String r1 = "participant"
                                r4[r8] = r1
                                r2 = 38
                                X.AhU r1 = new X.AhU
                                r1.<init>(r6, r2)
                                r9 = 1
                                r11 = 19999(0x4e1f, double:9.881E-320)
                                r7 = r1
                                r8 = r4
                                r6 = r0
                                java.util.ArrayList r0 = r5.A08(r6, r7, r8, r9, r11)
                                if (r0 == 0) goto L_0x02ed
                                java.util.ArrayList r4 = X.AnonymousClass000.A13()
                                java.util.Iterator r1 = r0.iterator()
                            L_0x02c7:
                                boolean r0 = r1.hasNext()
                                if (r0 == 0) goto L_0x02dd
                                java.lang.Object r0 = r1.next()
                                X.9DO r0 = (X.AnonymousClass9DO) r0
                                java.lang.Object r0 = r0.A01
                                X.9E1 r0 = (X.AnonymousClass9E1) r0
                                com.whatsapp.jid.UserJid r0 = r0.A00
                                r4.add(r0)
                                goto L_0x02c7
                            L_0x02dd:
                                java.lang.Object r0 = r3.A01
                                X.9am r0 = (X.C184329am) r0
                                com.whatsapp.community.CommunityMembersDirectory r3 = r0.A00
                                X.10I r2 = r3.A08
                                X.1EC r1 = r0.A01
                                r0 = 43
                                X.C21434Ak1.A00(r2, r3, r1, r4, r0)
                                return
                            L_0x02ed:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r5)
                                throw r0
                            L_0x02f2:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r5)
                                throw r0
                            L_0x02f7:
                                r1 = 1
                                X.C18070vi.A0d(r0, r1)
                                java.lang.String r1 = "membership_approval_requests"
                                X.1ca r1 = r0.A0L(r1)
                                java.lang.String r0 = "membership_approval_request"
                                java.util.List r0 = r1.A0R(r0)
                                X.C18070vi.A0X(r0)
                                java.lang.Object r8 = r3.A01
                                X.1EC r8 = (X.AnonymousClass1EC) r8
                                java.util.ArrayList r4 = X.C29351c6.A0D(r0)
                                java.util.Iterator r6 = r0.iterator()
                            L_0x0316:
                                boolean r0 = r6.hasNext()
                                if (r0 == 0) goto L_0x0343
                                X.1ca r5 = X.C17880vN.A0a(r6)
                                java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
                                java.lang.String r0 = "requestor"
                                com.whatsapp.jid.Jid r9 = r5.A0G(r1, r0)
                                com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
                                java.lang.String r0 = "jid"
                                com.whatsapp.jid.Jid r10 = r5.A0G(r1, r0)
                                com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
                                java.lang.String r2 = "request_time"
                                r0 = 0
                                long r11 = r5.A0D(r2, r0)
                                X.9sD r7 = new X.9sD
                                r7.<init>(r8, r9, r10, r11)
                                r4.add(r7)
                                goto L_0x0316
                            L_0x0343:
                                java.lang.Object r3 = r3.A02
                                X.2jq r3 = (X.C57912jq) r3
                                X.10I r2 = r3.A00
                                r1 = 22
                                X.3C4 r0 = new X.3C4
                                r0.<init>(r3, r8, r4, r1)
                                r2.CGF(r0)
                                return
                            L_0x0354:
                                java.lang.String r8 = "true"
                                r11 = 1
                                X.C18070vi.A0d(r0, r11)
                                java.lang.String r1 = "EmailVerificationXmppMethods/sendRequestForEmail/success"
                                com.whatsapp.util.Log.i((java.lang.String) r1)
                                r6 = 0
                                java.lang.Object r1 = r3.A02     // Catch:{ 1UI -> 0x03f0 }
                                X.9F6 r1 = (X.AnonymousClass9F6) r1     // Catch:{ 1UI -> 0x03f0 }
                                r12 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r12)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.Object r7 = r1.A00     // Catch:{ 1UI -> 0x03f0 }
                                X.2rm r5 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String r1 = "false"
                                r10 = 0
                                java.util.List r4 = X.C18070vi.A0N(r1, r8, r2, r10, r11)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String[] r2 = X.AnonymousClass8BR.A1b()     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String r13 = "email"
                                r2[r10] = r13     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String r1 = "verified"
                                X.AnonymousClass8BR.A1K(r2, r11, r12, r1)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String r9 = r5.A07(r0, r4, r2)     // Catch:{ 1UI -> 0x03f0 }
                                if (r9 == 0) goto L_0x03e6
                                X.A5w r4 = X.C20071A5w.A00     // Catch:{ 1UI -> 0x03f0 }
                                X.Ahb r1 = X.C21290Ahb.A00(r7, r4, r10)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.Object r1 = r1.BCF(r0, r5)     // Catch:{ 1UI -> 0x03f0 }
                                if (r1 == 0) goto L_0x03eb
                                java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ 1UI -> 0x03f0 }
                                r2[r10] = r13     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String r1 = "email_address"
                                r2[r11] = r1     // Catch:{ 1UI -> 0x03f0 }
                                X.AhT r1 = new X.AhT     // Catch:{ 1UI -> 0x03f0 }
                                r1.<init>(r4, r10)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.Object r7 = r5.A02(r0, r1, r2)     // Catch:{ 1UI -> 0x03f0 }
                                X.9CY r7 = (X.AnonymousClass9CY) r7     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ 1UI -> 0x03f0 }
                                r2[r10] = r13     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String r1 = "confirmed"
                                r2[r11] = r1     // Catch:{ 1UI -> 0x03f0 }
                                X.AhT r1 = new X.AhT     // Catch:{ 1UI -> 0x03f0 }
                                r1.<init>(r4, r11)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.Object r5 = r5.A02(r0, r1, r2)     // Catch:{ 1UI -> 0x03f0 }
                                X.9CY r5 = (X.AnonymousClass9CY) r5     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.String[] r2 = new java.lang.String[r11]     // Catch:{ 1UI -> 0x03f0 }
                                r2[r10] = r13     // Catch:{ 1UI -> 0x03f0 }
                                X.9S0 r1 = new X.9S0     // Catch:{ 1UI -> 0x03f0 }
                                r1.<init>()     // Catch:{ 1UI -> 0x03f0 }
                                X.AnonymousClass8BS.A1A(r0, r2)     // Catch:{ 1UI -> 0x03f0 }
                                java.lang.Object r4 = r3.A01     // Catch:{ 1UI -> 0x03f0 }
                                X.BAj r4 = (X.C22502BAj) r4
                                if (r7 == 0) goto L_0x03cf
                                goto L_0x03d1
                            L_0x03cf:
                                r2 = r6
                                goto L_0x03d3
                            L_0x03d1:
                                java.lang.String r2 = r7.A01     // Catch:{ 1UI -> 0x03f0 }
                            L_0x03d3:
                                boolean r1 = r9.equals(r8)     // Catch:{ 1UI -> 0x03f0 }
                                if (r5 == 0) goto L_0x03e3
                                java.lang.String r0 = r5.A01     // Catch:{ 1UI -> 0x03f0 }
                            L_0x03db:
                                boolean r0 = X.C18070vi.A18(r0, r8)     // Catch:{ 1UI -> 0x03f0 }
                                r4.C7T(r2, r1, r0)     // Catch:{ 1UI -> 0x03f0 }
                                goto L_0x03e5
                            L_0x03e3:
                                r0 = r6
                                goto L_0x03db
                            L_0x03e5:
                                return
                            L_0x03e6:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x03f0 }
                                goto L_0x03ef
                            L_0x03eb:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x03f0 }
                            L_0x03ef:
                                throw r0     // Catch:{ 1UI -> 0x03f0 }
                            L_0x03f0:
                                r2 = move-exception
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestForEmail/CorruptStreamException: "
                                X.C17900vP.A0X(r2, r0, r1)
                                java.lang.Object r0 = r3.A01
                                X.BAj r0 = (X.C22502BAj) r0
                                r0.Btp(r6)
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods: "
                                java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
                                X.1UI r0 = X.AnonymousClass1UI.A01(r0)
                                throw r0
                            L_0x0410:
                                r8 = 1
                                X.C18070vi.A0d(r0, r8)
                                java.lang.String r1 = "EmailVerificationXmppMethods/sendRequestForEmailOtp/success"
                                com.whatsapp.util.Log.i((java.lang.String) r1)
                                java.lang.Object r1 = r3.A01     // Catch:{ 1UI -> 0x0468 }
                                X.9F6 r1 = (X.AnonymousClass9F6) r1     // Catch:{ 1UI -> 0x0468 }
                                r7 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r7)     // Catch:{ 1UI -> 0x0468 }
                                java.lang.Object r6 = r1.A00     // Catch:{ 1UI -> 0x0468 }
                                X.2rm r5 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0468 }
                                java.lang.String[] r4 = X.AnonymousClass8BR.A1b()     // Catch:{ 1UI -> 0x0468 }
                                java.lang.String r2 = "verify_email"
                                r1 = 0
                                r4[r1] = r2     // Catch:{ 1UI -> 0x0468 }
                                java.lang.String r1 = "wait_time"
                                X.AnonymousClass8BR.A1K(r4, r8, r7, r1)     // Catch:{ 1UI -> 0x0468 }
                                java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ 1UI -> 0x0468 }
                                java.lang.Long r10 = X.C17890vO.A0L()     // Catch:{ 1UI -> 0x0468 }
                                java.lang.Long r11 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0468 }
                                r12 = 0
                                r13 = r4
                                r7 = r5
                                r8 = r0
                                java.lang.Object r1 = r7.A04(r8, r9, r10, r11, r12, r13)     // Catch:{ 1UI -> 0x0468 }
                                if (r1 == 0) goto L_0x045e
                                X.A5w r2 = X.C20071A5w.A00     // Catch:{ 1UI -> 0x0468 }
                                r1 = 4
                                X.Ahb r1 = X.C21290Ahb.A00(r6, r2, r1)     // Catch:{ 1UI -> 0x0468 }
                                java.lang.Object r0 = r1.BCF(r0, r5)     // Catch:{ 1UI -> 0x0468 }
                                if (r0 == 0) goto L_0x0463
                                java.lang.Object r0 = r3.A02     // Catch:{ 1UI -> 0x0468 }
                                X.BAk r0 = (X.C22503BAk) r0     // Catch:{ 1UI -> 0x0468 }
                                r0.C7j()     // Catch:{ 1UI -> 0x0468 }
                                return
                            L_0x045e:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0468 }
                                goto L_0x0467
                            L_0x0463:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x0468 }
                            L_0x0467:
                                throw r0     // Catch:{ 1UI -> 0x0468 }
                            L_0x0468:
                                r2 = move-exception
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestForEmailOtp/CorruptStreamException: "
                                X.C17900vP.A0X(r2, r0, r1)
                                java.lang.Object r1 = r3.A02
                                X.BAk r1 = (X.C22503BAk) r1
                                r0 = 0
                                r1.Btq(r0, r0)
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods: "
                                java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
                                X.1UI r0 = X.AnonymousClass1UI.A01(r0)
                                throw r0
                            L_0x0489:
                                r10 = 1
                                X.C18070vi.A0d(r0, r10)
                                java.lang.String r1 = "EmailVerificationXmppMethods/sendRequestToSetEmail/success"
                                com.whatsapp.util.Log.i((java.lang.String) r1)
                                r5 = 0
                                java.lang.Object r1 = r3.A01     // Catch:{ 1UI -> 0x0528 }
                                X.9F6 r1 = (X.AnonymousClass9F6) r1     // Catch:{ 1UI -> 0x0528 }
                                r11 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r11)     // Catch:{ 1UI -> 0x0528 }
                                java.lang.Object r13 = r1.A00     // Catch:{ 1UI -> 0x0528 }
                                X.2rm r9 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String[] r2 = new java.lang.String[r11]     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String r1 = "false"
                                r12 = 0
                                r2[r12] = r1     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String r8 = "true"
                                java.util.List r6 = X.C18070vi.A0O(r8, r2, r10)     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String[] r4 = X.AnonymousClass8BR.A1b()     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String r2 = "email"
                                r4[r12] = r2     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String r1 = "do_verify"
                                X.AnonymousClass8BR.A1K(r4, r10, r11, r1)     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String r7 = r9.A07(r0, r6, r4)     // Catch:{ 1UI -> 0x0528 }
                                if (r7 == 0) goto L_0x051e
                                X.A5w r6 = X.C20071A5w.A00     // Catch:{ 1UI -> 0x0528 }
                                r1 = 5
                                X.Ahb r1 = X.C21290Ahb.A00(r13, r6, r1)     // Catch:{ 1UI -> 0x0528 }
                                java.lang.Object r1 = r1.BCF(r0, r9)     // Catch:{ 1UI -> 0x0528 }
                                if (r1 == 0) goto L_0x0523
                                java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ 1UI -> 0x0528 }
                                r4[r12] = r2     // Catch:{ 1UI -> 0x0528 }
                                java.lang.String r1 = "auto_verify"
                                r4[r10] = r1     // Catch:{ 1UI -> 0x0528 }
                                r2 = 10
                                X.AhT r1 = new X.AhT     // Catch:{ 1UI -> 0x0528 }
                                r1.<init>(r6, r2)     // Catch:{ 1UI -> 0x0528 }
                                java.lang.Object r6 = r9.A02(r0, r1, r4)     // Catch:{ 1UI -> 0x0528 }
                                X.9DH r6 = (X.AnonymousClass9DH) r6     // Catch:{ 1UI -> 0x0528 }
                                if (r6 == 0) goto L_0x04f2
                                java.lang.String r1 = r6.A02     // Catch:{ 1UI -> 0x0528 }
                            L_0x04e7:
                                java.lang.String r0 = "fail"
                                boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ 1UI -> 0x0528 }
                                if (r0 == 0) goto L_0x0503
                                java.lang.Object r1 = r3.A02     // Catch:{ 1UI -> 0x0528 }
                                goto L_0x04f4
                            L_0x04f2:
                                r1 = r5
                                goto L_0x04e7
                            L_0x04f4:
                                X.BCt r1 = (X.C22560BCt) r1
                                if (r6 == 0) goto L_0x051b
                                java.lang.Object r0 = r6.A01     // Catch:{ 1UI -> 0x0528 }
                                X.9CY r0 = (X.AnonymousClass9CY) r0     // Catch:{ 1UI -> 0x0528 }
                                if (r0 == 0) goto L_0x051b
                                java.lang.String r0 = r0.A01     // Catch:{ 1UI -> 0x0528 }
                            L_0x0500:
                                r1.C8p(r0)     // Catch:{ 1UI -> 0x0528 }
                            L_0x0503:
                                java.lang.Object r4 = r3.A02     // Catch:{ 1UI -> 0x0528 }
                                X.BCt r4 = (X.C22560BCt) r4     // Catch:{ 1UI -> 0x0528 }
                                boolean r2 = r7.equals(r8)     // Catch:{ 1UI -> 0x0528 }
                                if (r6 == 0) goto L_0x0519
                                java.lang.String r1 = r6.A02     // Catch:{ 1UI -> 0x0528 }
                            L_0x050f:
                                java.lang.String r0 = "success"
                                boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ 1UI -> 0x0528 }
                                r4.C7W(r2, r0)     // Catch:{ 1UI -> 0x0528 }
                                goto L_0x051d
                            L_0x0519:
                                r1 = r5
                                goto L_0x050f
                            L_0x051b:
                                r0 = r5
                                goto L_0x0500
                            L_0x051d:
                                return
                            L_0x051e:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r9)     // Catch:{ 1UI -> 0x0528 }
                                goto L_0x0527
                            L_0x0523:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r9)     // Catch:{ 1UI -> 0x0528 }
                            L_0x0527:
                                throw r0     // Catch:{ 1UI -> 0x0528 }
                            L_0x0528:
                                r2 = move-exception
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestToSetEmail/CorruptStreamException: "
                                X.C17900vP.A0X(r2, r0, r1)
                                java.lang.Object r0 = r3.A02
                                X.BCt r0 = (X.C22560BCt) r0
                                r0.Btp(r5)
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods: "
                                java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
                                X.1UI r0 = X.AnonymousClass1UI.A01(r0)
                                throw r0
                            L_0x0548:
                                r12 = 1
                                X.C18070vi.A0d(r0, r12)
                                java.lang.String r1 = "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/success"
                                com.whatsapp.util.Log.i((java.lang.String) r1)
                                java.lang.Object r1 = r3.A01     // Catch:{ 1UI -> 0x05cf }
                                X.9F6 r1 = (X.AnonymousClass9F6) r1     // Catch:{ 1UI -> 0x05cf }
                                r11 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r11)     // Catch:{ 1UI -> 0x05cf }
                                java.lang.Object r9 = r1.A00     // Catch:{ 1UI -> 0x05cf }
                                X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String[] r2 = new java.lang.String[r11]     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r1 = "false"
                                r13 = 0
                                r2[r13] = r1     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r7 = "true"
                                java.util.List r6 = X.C18070vi.A0O(r7, r2, r12)     // Catch:{ 1UI -> 0x05cf }
                                r10 = 3
                                java.lang.String[] r2 = new java.lang.String[r10]     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r5 = "verify_email"
                                r2[r13] = r5     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r1 = "code_match"
                                r2[r12] = r1     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r4 = "#elementValue"
                                r2[r11] = r4     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r6 = r8.A07(r0, r6, r2)     // Catch:{ 1UI -> 0x05cf }
                                if (r6 == 0) goto L_0x05c5
                                java.lang.String[] r2 = new java.lang.String[r10]     // Catch:{ 1UI -> 0x05cf }
                                r2[r13] = r5     // Catch:{ 1UI -> 0x05cf }
                                java.lang.String r1 = "wait_time"
                                r2[r12] = r1     // Catch:{ 1UI -> 0x05cf }
                                r2[r11] = r4     // Catch:{ 1UI -> 0x05cf }
                                java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ 1UI -> 0x05cf }
                                java.lang.Long r13 = X.C17890vO.A0L()     // Catch:{ 1UI -> 0x05cf }
                                java.lang.Long r14 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x05cf }
                                r15 = 0
                                r16 = r2
                                r10 = r8
                                r11 = r0
                                java.lang.Object r1 = r10.A04(r11, r12, r13, r14, r15, r16)     // Catch:{ 1UI -> 0x05cf }
                                java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ 1UI -> 0x05cf }
                                if (r1 == 0) goto L_0x05c0
                                long r4 = r1.longValue()     // Catch:{ 1UI -> 0x05cf }
                                X.A5w r2 = X.C20071A5w.A00     // Catch:{ 1UI -> 0x05cf }
                                r1 = 8
                                X.Ahb r1 = X.C21290Ahb.A00(r9, r2, r1)     // Catch:{ 1UI -> 0x05cf }
                                java.lang.Object r0 = r1.BCF(r0, r8)     // Catch:{ 1UI -> 0x05cf }
                                if (r0 == 0) goto L_0x05ca
                                java.lang.Object r1 = r3.A02     // Catch:{ 1UI -> 0x05cf }
                                X.BAl r1 = (X.C22504BAl) r1     // Catch:{ 1UI -> 0x05cf }
                                boolean r0 = r6.equals(r7)     // Catch:{ 1UI -> 0x05cf }
                                r1.C7f(r4, r0)     // Catch:{ 1UI -> 0x05cf }
                                return
                            L_0x05c0:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x05cf }
                                goto L_0x05ce
                            L_0x05c5:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x05cf }
                                goto L_0x05ce
                            L_0x05ca:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x05cf }
                            L_0x05ce:
                                throw r0     // Catch:{ 1UI -> 0x05cf }
                            L_0x05cf:
                                r2 = move-exception
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/CorruptStreamException: "
                                X.C17900vP.A0X(r2, r0, r1)
                                java.lang.Object r1 = r3.A02
                                X.BAl r1 = (X.C22504BAl) r1
                                r0 = 0
                                r1.Btq(r0, r0)
                                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                java.lang.String r0 = "EmailVerificationXmppMethods: "
                                java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
                                X.1UI r0 = X.AnonymousClass1UI.A01(r0)
                                throw r0
                            L_0x05f0:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F7 r2 = (X.AnonymousClass9F7) r2
                                java.lang.Object r1 = r3.A02
                                X.9Xv r1 = (X.C183329Xv) r1
                                A01(r1, r0, r2)
                                return
                            L_0x05fe:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F7 r2 = (X.AnonymousClass9F7) r2
                                java.lang.Object r1 = r3.A02
                                X.9Xw r1 = (X.C183339Xw) r1
                                A02(r1, r0, r2)
                                return
                            L_0x060c:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F7 r2 = (X.AnonymousClass9F7) r2
                                java.lang.Object r1 = r3.A02
                                X.9Xx r1 = (X.C183349Xx) r1
                                A03(r1, r0, r2)
                                return
                            L_0x061a:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F7 r2 = (X.AnonymousClass9F7) r2
                                java.lang.Object r1 = r3.A02
                                X.9db r1 = (X.C186069db) r1
                                A04(r1, r0, r2)
                                return
                            L_0x0628:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F1 r2 = (X.AnonymousClass9F1) r2
                                java.lang.Object r1 = r3.A02
                                X.9lM r1 = (X.C190689lM) r1
                                X.BCI r1 = r1.A00
                                A07(r0, r1, r2)
                                return
                            L_0x0638:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F6 r2 = (X.AnonymousClass9F6) r2
                                java.lang.Object r1 = r3.A02
                                X.9mS r1 = (X.C191349mS) r1
                                X.B6B r1 = r1.A03
                                A06(r0, r2, r1)
                                return
                            L_0x0648:
                                java.lang.Object r2 = A00(r3, r0)
                                X.9F6 r2 = (X.AnonymousClass9F6) r2
                                java.lang.Object r1 = r3.A02
                                X.9bO r1 = (X.C184709bO) r1
                                X.9Ye r1 = r1.A01
                                A05(r1, r0, r2)
                                return
                            L_0x0658:
                                r2 = 1
                                X.C18070vi.A0d(r0, r2)
                                java.lang.Object r1 = r3.A02
                                X.9F7 r1 = (X.AnonymousClass9F7) r1
                                r4 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r4)
                                java.lang.Object r13 = r1.A00
                                X.1ca r13 = (X.C29621ca) r13
                                X.2rm r12 = X.AnonymousClass8BR.A0s()
                                java.lang.String[] r6 = new java.lang.String[r4]
                                java.lang.String r9 = "activated"
                                r1 = 0
                                r6[r1] = r9
                                java.lang.String r5 = "deactivated"
                                java.util.List r7 = X.C18070vi.A0O(r5, r6, r2)
                                java.lang.String[] r6 = new java.lang.String[r4]
                                java.lang.String r11 = "account"
                                r6[r1] = r11
                                java.lang.String r5 = "international-payments-status"
                                r6[r2] = r5
                                java.lang.String r8 = r12.A07(r0, r7, r6)
                                if (r8 == 0) goto L_0x07f0
                                java.lang.String[] r6 = new java.lang.String[r4]
                                r6[r1] = r11
                                java.lang.String r7 = "action"
                                r6[r2] = r7
                                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                                java.lang.String[] r5 = new java.lang.String[r4]
                                r5[r1] = r11
                                java.lang.Long r15 = X.AnonymousClass8BW.A0Z(r7, r5, r2)
                                java.lang.Long r16 = X.AnonymousClass8BU.A0j()
                                r17 = 0
                                r18 = r5
                                r19 = r1
                                java.lang.Object r23 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
                                if (r23 == 0) goto L_0x07eb
                                r18 = r12
                                r19 = r0
                                r20 = r14
                                r21 = r15
                                r22 = r16
                                r24 = r6
                                r25 = r2
                                java.lang.Object r5 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
                                if (r5 == 0) goto L_0x07e6
                                java.lang.String[] r6 = new java.lang.String[r4]
                                r6[r1] = r11
                                java.lang.String r5 = "start-ts"
                                r6[r2] = r5
                                java.lang.Class r20 = java.lang.Long.TYPE
                                java.lang.Long r21 = X.C17890vO.A0L()
                                r23 = r17
                                r24 = r6
                                r25 = r1
                                java.lang.Object r5 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
                                java.lang.Number r5 = (java.lang.Number) r5
                                if (r5 == 0) goto L_0x07e1
                                long r14 = r5.longValue()
                                java.lang.String[] r5 = new java.lang.String[r4]
                                r5[r1] = r11
                                java.lang.String r6 = "end-ts"
                                r5[r2] = r6
                                r24 = r5
                                java.lang.Object r5 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
                                java.lang.Number r5 = (java.lang.Number) r5
                                if (r5 == 0) goto L_0x07dc
                                long r6 = r5.longValue()
                                java.lang.String[] r4 = new java.lang.String[r4]
                                r4[r1] = r11
                                java.lang.String r5 = "version"
                                r4[r2] = r5
                                java.lang.Long r21 = X.C108975cc.A0X()
                                r24 = r4
                                java.lang.Object r4 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
                                if (r4 == 0) goto L_0x07d7
                                X.A5y r5 = X.C20072A5y.A00
                                r4 = 32
                                X.Aha r4 = X.C21289Aha.A00(r13, r5, r4)
                                java.lang.Object r4 = r4.BCF(r0, r12)
                                if (r4 == 0) goto L_0x07d2
                                java.lang.String[] r10 = new java.lang.String[r2]
                                r10[r1] = r11
                                X.9SL r4 = new X.9SL
                                r4.<init>()
                                r4 = 1
                                X.AnonymousClass8BS.A1A(r0, r10)
                                java.lang.Object r10 = r3.A01
                                X.9bk r10 = (X.C184929bk) r10
                                com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r3 = r10.A01
                                X.00H r0 = r3.A05
                                java.lang.Object r11 = r0.get()
                                X.A0u r11 = (X.A0u) r11
                                X.9rr r12 = r10.A00
                                java.lang.String r0 = r12.A02
                                X.9sg r13 = new X.9sg
                                r16 = r0
                                r17 = r6
                                r19 = r8
                                r13.<init>(r14, r16, r17, r19)
                                X.0vl r14 = r11.A01
                                java.util.Map r10 = X.AnonymousClass3MW.A12(r14)
                                java.lang.String r0 = r13.A03
                                r10.put(r0, r13)
                                java.util.Map r0 = X.AnonymousClass3MW.A12(r14)
                                X.A0u.A00(r11, r0)
                                boolean r8 = r8.equals(r9)
                                android.app.Application r11 = r3.A00
                                java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
                                X.C18070vi.A0z(r11, r0)
                                if (r8 == 0) goto L_0x07ca
                                r9 = 2131894199(0x7f121fb7, float:1.9423196E38)
                                java.lang.Object[] r8 = new java.lang.Object[r2]
                                X.0vb r0 = r3.A01
                                java.lang.String r0 = X.C20092A6u.A00(r0, r6)
                                java.lang.String r10 = X.C17880vN.A0q(r11, r0, r8, r1, r9)
                            L_0x0770:
                                X.C18070vi.A0b(r10)
                                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
                                long r8 = r0.toSeconds(r4)
                                long r16 = r6 + r8
                                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                                X.77e r8 = r12.A00
                                java.lang.Object r13 = r8.A00
                                X.C17960vV.A07(r13)
                                r12 = r13
                                java.lang.Number r12 = (java.lang.Number) r12
                                long r8 = r12.longValue()
                                long r14 = r0.toSeconds(r8)
                                int r8 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                                if (r8 < 0) goto L_0x07ba
                                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
                                long r4 = r8.toSeconds(r4)
                                long r8 = r6 - r4
                                X.C17960vV.A07(r13)
                                long r4 = r12.longValue()
                                long r4 = r0.toSeconds(r4)
                                int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                                if (r0 > 0) goto L_0x07ba
                                java.lang.String r2 = ""
                            L_0x07ac:
                                X.1wy r3 = r3.A04
                                X.AEd r0 = new X.AEd
                                r0.<init>(r10, r2, r1)
                                X.93o r1 = new X.93o
                                r1.<init>(r0)
                                goto L_0x09c8
                            L_0x07ba:
                                r4 = 2131891431(0x7f1214e7, float:1.9417582E38)
                                java.lang.Object[] r2 = new java.lang.Object[r2]
                                X.0vb r0 = r3.A01
                                java.lang.String r0 = X.C20092A6u.A00(r0, r6)
                                java.lang.String r2 = X.AnonymousClass3Ma.A10(r11, r0, r2, r1, r4)
                                goto L_0x07ac
                            L_0x07ca:
                                r0 = 2131894203(0x7f121fbb, float:1.9423204E38)
                                java.lang.String r10 = r11.getString(r0)
                                goto L_0x0770
                            L_0x07d2:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07d7:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07dc:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07e1:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07e6:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07eb:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07f0:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                throw r0
                            L_0x07f5:
                                r4 = 1
                                X.C18070vi.A0d(r0, r4)
                                java.lang.Object r1 = r3.A02
                                X.9F7 r1 = (X.AnonymousClass9F7) r1
                                r2 = 2
                                X.AnonymousClass8BT.A1I(r0, r1, r2)
                                java.lang.Object r15 = r1.A00
                                X.1ca r15 = (X.C29621ca) r15
                                X.2rm r18 = X.AnonymousClass8BR.A0s()
                                java.lang.String[] r7 = new java.lang.String[r2]
                                r27 = 0
                                java.lang.String r1 = "account"
                                r7[r27] = r1
                                java.lang.String r6 = "action"
                                r7[r4] = r6
                                java.lang.Class<java.lang.String> r22 = java.lang.String.class
                                java.lang.String[] r5 = new java.lang.String[r2]
                                r5[r27] = r1
                                java.lang.Long r23 = X.AnonymousClass8BW.A0Z(r6, r5, r4)
                                java.lang.Long r24 = X.AnonymousClass8BU.A0j()
                                r19 = 0
                                r20 = r18
                                r21 = r15
                                r25 = r19
                                r26 = r5
                                java.lang.Object r33 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                if (r33 == 0) goto L_0x0a25
                                r10 = 0
                                r28 = r18
                                r29 = r0
                                r30 = r22
                                r31 = r23
                                r32 = r24
                                r34 = r7
                                r35 = r4
                                java.lang.Object r5 = r28.A05(r29, r30, r31, r32, r33, r34, r35)
                                if (r5 == 0) goto L_0x0a20
                                java.lang.String[] r6 = new java.lang.String[r2]
                                r6[r27] = r1
                                java.lang.String r5 = "version"
                                r6[r4] = r5
                                java.lang.Class r30 = java.lang.Long.TYPE
                                java.lang.Long r31 = X.C108975cc.A0X()
                                r33 = r19
                                r34 = r6
                                r35 = r10
                                java.lang.Object r5 = r28.A05(r29, r30, r31, r32, r33, r34, r35)
                                if (r5 == 0) goto L_0x0a1b
                                java.lang.String[] r26 = X.AnonymousClass8BR.A1b()
                                r26[r27] = r1
                                java.lang.String r5 = "international-qr"
                                r26[r4] = r5
                                java.lang.String r6 = "pay-detail"
                                r26[r2] = r6
                                r8 = 3
                                r21 = r0
                                r23 = r31
                                java.lang.Object r14 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                java.lang.String r14 = (java.lang.String) r14
                                if (r14 == 0) goto L_0x0a16
                                r7 = 4
                                java.lang.String[] r34 = X.C17880vN.A1b(r1, r5, r7, r4)
                                java.lang.String r17 = "qr-detail"
                                r34[r2] = r17
                                java.lang.String r6 = "expiry-time-stamp"
                                r34[r8] = r6
                                r6 = 4
                                r28.A05(r29, r30, r31, r32, r33, r34, r35)
                                java.lang.String[] r26 = X.C17880vN.A1b(r1, r5, r7, r4)
                                r26[r2] = r17
                                java.lang.String r7 = "payload"
                                r26[r8] = r7
                                java.lang.Long r24 = X.AnonymousClass8BV.A0l()
                                java.lang.Object r7 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                if (r7 == 0) goto L_0x0a11
                                java.lang.String[] r26 = X.C17880vN.A1b(r1, r5, r6, r4)
                                java.lang.String r16 = "merchant-detail"
                                r26[r2] = r16
                                java.lang.String r7 = "vpa"
                                r26[r8] = r7
                                java.lang.Long r24 = X.AnonymousClass8BV.A0j()
                                java.lang.Object r9 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                java.lang.String r9 = (java.lang.String) r9
                                if (r9 == 0) goto L_0x0a0c
                                java.lang.String[] r26 = X.C17880vN.A1b(r1, r5, r6, r4)
                                r26[r2] = r16
                                java.lang.String r8 = "name"
                                r7 = 3
                                r26[r7] = r8
                                java.lang.Long r24 = X.AnonymousClass8BV.A0f()
                                java.lang.Object r8 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                java.lang.String r8 = (java.lang.String) r8
                                if (r8 == 0) goto L_0x0a07
                                java.lang.String[] r26 = X.C17880vN.A1b(r1, r5, r6, r4)
                                r26[r2] = r16
                                java.lang.String r11 = "invoice-number"
                                r26[r7] = r11
                                r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                java.lang.String[] r26 = X.C17880vN.A1b(r1, r5, r6, r4)
                                r26[r2] = r16
                                java.lang.String r6 = "mcc"
                                r26[r7] = r6
                                java.lang.Object r11 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
                                java.lang.String r11 = (java.lang.String) r11
                                X.A5y r12 = X.C20072A5y.A00
                                r6 = 8
                                X.AhW r13 = new X.AhW
                                r13.<init>(r12, r6)
                                java.lang.String[] r7 = X.C17880vN.A1b(r1, r5, r7, r4)
                                java.lang.String r6 = "fx-detail"
                                r7[r2] = r6
                                r6 = r18
                                java.lang.Object r6 = r6.A03(r0, r13, r7)
                                X.9Cv r6 = (X.C178369Cv) r6
                                if (r6 == 0) goto L_0x0a02
                                r7 = 36
                                X.Aha r12 = X.C21289Aha.A00(r15, r12, r7)
                                r7 = r18
                                java.lang.Object r7 = r12.BCF(r0, r7)
                                if (r7 == 0) goto L_0x09fd
                                java.lang.String[] r12 = new java.lang.String[r4]
                                r12[r27] = r1
                                X.9SN r7 = new X.9SN
                                r7.<init>()
                                X.AnonymousClass8BS.A1A(r0, r12)
                                r13 = 3
                                java.lang.String[] r12 = X.C17880vN.A1b(r1, r5, r13, r4)
                                r12[r2] = r16
                                X.9SO r7 = new X.9SO
                                r7.<init>()
                                X.AnonymousClass8BS.A1A(r0, r12)
                                java.lang.String[] r5 = X.C17880vN.A1b(r1, r5, r13, r4)
                                r5[r2] = r17
                                X.9SP r1 = new X.9SP
                                r1.<init>()
                                X.AnonymousClass8BS.A1A(r0, r5)
                                java.lang.Object r1 = r3.A01
                                X.9dl r1 = (X.C186169dl) r1
                                r12 = 0
                                com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel r2 = r1.A01
                                java.lang.String r5 = r6.A02
                                X.0ve r3 = r2.A01
                                r0 = 3102(0xc1e, float:4.347E-42)
                                java.lang.String r3 = X.C108955ca.A0v(r3, r0)
                                int r0 = r3.length()
                                if (r0 == 0) goto L_0x09cc
                                java.util.List r0 = X.C108985cd.A0s(r3, r4)
                                java.lang.String[] r7 = X.C108955ca.A1b(r0)
                                int r3 = r7.length
                            L_0x0960:
                                if (r10 >= r3) goto L_0x09cc
                                r0 = r7[r10]
                                boolean r0 = X.C18070vi.A18(r5, r0)
                                if (r0 == 0) goto L_0x098e
                                java.lang.String r7 = r6.A01
                                int r0 = r7.length()
                                if (r0 != 0) goto L_0x098b
                                java.lang.String r16 = "01"
                            L_0x0974:
                                X.77e r0 = r1.A00
                                java.lang.Object r3 = r0.A00
                                java.lang.String r3 = (java.lang.String) r3
                                java.lang.String r0 = "UTF-8"
                                java.lang.String r0 = java.net.URLDecoder.decode(r3, r0)
                                android.net.Uri r3 = android.net.Uri.parse(r0)
                                java.lang.String r0 = "mc"
                                java.lang.String r15 = X.C20118A8b.A02(r3, r0)
                                goto L_0x0991
                            L_0x098b:
                                java.lang.String r16 = "15"
                                goto L_0x0974
                            L_0x098e:
                                int r10 = r10 + 1
                                goto L_0x0960
                            L_0x0991:
                                java.math.BigDecimal r3 = java.math.BigDecimal.ZERO     // Catch:{ NumberFormatException -> 0x099e }
                                java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x099e }
                                r0.<init>(r7)     // Catch:{ NumberFormatException -> 0x099e }
                                int r0 = r3.compareTo(r0)     // Catch:{ NumberFormatException -> 0x099e }
                                if (r0 != 0) goto L_0x099f
                            L_0x099e:
                                r7 = r12
                            L_0x099f:
                                X.1wy r3 = r2.A03
                                if (r15 != 0) goto L_0x09a4
                                r15 = r11
                            L_0x09a4:
                                java.lang.String r10 = r1.A02
                                java.lang.String r2 = r6.A03
                                java.lang.String r1 = r6.A04
                                java.lang.String r17 = "11"
                                X.AEP r0 = new X.AEP
                                r20 = r10
                                r21 = r9
                                r22 = r5
                                r23 = r2
                                r24 = r1
                                r25 = r14
                                r26 = r4
                                r13 = r0
                                r14 = r8
                                r18 = r7
                                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                                X.93p r1 = new X.93p
                                r1.<init>(r0)
                            L_0x09c8:
                                r3.A0E(r1)
                                return
                            L_0x09cc:
                                X.1DT r6 = r2.A00
                                java.lang.Object r5 = r6.A06()
                                X.A1d r5 = (X.C19968A1d) r5
                                if (r5 == 0) goto L_0x09f9
                                android.app.Application r1 = r2.A00
                                java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
                                X.C18070vi.A0z(r1, r0)
                                r0 = 2131897618(0x7f122d12, float:1.943013E38)
                                java.lang.String r4 = r1.getString(r0)
                                r0 = 2131897617(0x7f122d11, float:1.9430129E38)
                                java.lang.String r0 = r1.getString(r0)
                                r2 = 0
                                X.9rv r1 = new X.9rv
                                r1.<init>(r2, r4, r0)
                                boolean r0 = r5.A01
                                X.A1d r12 = new X.A1d
                                r12.<init>(r1, r0)
                            L_0x09f9:
                                r6.A0E(r12)
                                return
                            L_0x09fd:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a02:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a07:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a0c:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a11:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a16:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a1b:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a20:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a25:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r18)
                                throw r0
                            L_0x0a2a:
                                java.lang.Object r1 = A00(r3, r0)
                                X.1Di r1 = (X.C22821Di) r1
                                r1.invoke(r0)
                                return
                            L_0x0a34:
                                java.lang.String r0 = "type node should contain exactly 1 byte"
                                X.1UI r0 = X.AnonymousClass1UI.A01(r0)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C20996Aco.C7Z(X.1ca, java.lang.String):void");
                        }

                        public static final void A04(C186069db r9, C29621ca r10, AnonymousClass9F7 r11) {
                            C18070vi.A0j(r11, r9);
                            ArrayList A13 = AnonymousClass000.A13();
                            try {
                                AnonymousClass9FB r0 = new AnonymousClass9FB(r10, r11);
                                C191679mz r7 = r9.A01;
                                C29681ch r8 = r9.A00;
                                long j = r0.A00 * 1000;
                                Runnable runnable = r7.A07;
                                if (runnable != null) {
                                    r7.A02.CEz(runnable);
                                }
                                r7.A07 = null;
                                C21458AkP akP = new C21458AkP(r7, r8, 17);
                                r7.A07 = akP;
                                r7.A02.CGv(akP, j - 3000);
                            } catch (AnonymousClass1UI e) {
                                AnonymousClass8BY.A1I("SubscribeToLiveUpdatesResponseSuccess: ", AnonymousClass000.A10(), e, A13);
                                try {
                                    ((C22482B9o) new AnonymousClass9FQ(r10, r11, 9).A01).BAW(r9.A02);
                                } catch (AnonymousClass1UI e2) {
                                    AnonymousClass8BY.A1I("SubscribeToLiveUpdatesResponseClientError: ", AnonymousClass000.A10(), e2, A13);
                                    try {
                                        new AnonymousClass9FQ(r10, r11, 10);
                                    } catch (AnonymousClass1UI e3) {
                                        throw AnonymousClass8BY.A0N("SubscribeToLiveUpdatesResponseServerError: ", AnonymousClass000.A10(), e3, A13);
                                    }
                                }
                            }
                        }

                        public /* synthetic */ C22384B5n CM9(String str) {
                            return C20958AcC.A00;
                        }

                        public C20996Aco(C29681ch r2, C191679mz r3, C183369Xz r4, AnonymousClass9F7 r5) {
                            this.A00 = 12;
                            this.A01 = r5;
                            this.A02 = new C186069db(r2, r3, r4);
                        }

                        public C20996Aco(GetNewsletterMessagesJob getNewsletterMessagesJob, AnonymousClass9F7 r3) {
                            this.A00 = 9;
                            this.A01 = r3;
                            this.A02 = new C183329Xv(getNewsletterMessagesJob);
                        }

                        public C20996Aco(GetNewsletterMyAddOnMessagesJob getNewsletterMyAddOnMessagesJob, AnonymousClass9F7 r3) {
                            this.A00 = 11;
                            this.A01 = r3;
                            this.A02 = new C183349Xx(getNewsletterMyAddOnMessagesJob);
                        }

                        public C20996Aco(GetNewsletterMessagesUpdatesJob getNewsletterMessagesUpdatesJob, AnonymousClass9F7 r3) {
                            this.A00 = 10;
                            this.A01 = r3;
                            this.A02 = new C183339Xw(getNewsletterMessagesUpdatesJob);
                        }
                    }
