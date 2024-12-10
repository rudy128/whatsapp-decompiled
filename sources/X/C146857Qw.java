package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7Qw  reason: invalid class name and case insensitive filesystem */
public class C146857Qw implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C146857Qw(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017f, code lost:
        com.whatsapp.util.Log.e("HierarchyLogger/logHierarchy", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0184, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r6 = r20
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0158;
                case 2: goto L_0x0185;
                case 3: goto L_0x0196;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r6.A01
            X.1x7 r0 = (X.C41821x7) r0
            java.lang.Object r5 = r6.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r6.A03
            X.210 r4 = (X.AnonymousClass210) r4
            X.00H r0 = r0.A0F
            java.lang.Object r3 = r0.get()
            X.73A r3 = (X.AnonymousClass73A) r3
            java.lang.String r1 = "XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreationForTextStatus start text status burning"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.1dS r0 = (X.C30141dS) r0
            X.0ve r2 = r0.A01
            r1 = 4437(0x1155, float:6.218E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0044
            X.00H r0 = r3.A07
            java.lang.Object r0 = r0.get()
            X.6pi r0 = (X.C133916pi) r0
            r0.A00(r5, r4)
            r3.A04(r4)
            return
        L_0x0044:
            r3.A03(r4)
            java.util.List r0 = X.C18070vi.A0M(r4)
            X.AnonymousClass73A.A02(r5, r3, r0)
            return
        L_0x004f:
            java.lang.Object r1 = r6.A01
            X.1En r1 = (X.C23091En) r1
            java.lang.Object r13 = r6.A02
            com.facebook.msys.mci.DataTask r13 = (com.facebook.msys.mci.DataTask) r13
            java.lang.Object r5 = r6.A03
            com.facebook.msys.mci.NetworkSession r5 = (com.facebook.msys.mci.NetworkSession) r5
            int r2 = r13.mTaskType
            if (r2 == 0) goto L_0x0124
            r0 = 1
            if (r2 == r0) goto L_0x00ec
            r0 = 2
            if (r2 == r0) goto L_0x0124
            r0 = 3
            if (r2 == r0) goto L_0x00a7
            r0 = 4
            if (r2 != r0) goto L_0x008f
            X.1El r4 = r1.A00
            java.util.Map r3 = r4.A05     // Catch:{ IOException -> 0x007f }
            java.lang.String r2 = r13.mTaskIdentifier     // Catch:{ IOException -> 0x007f }
            X.6fS r1 = new X.6fS     // Catch:{ IOException -> 0x007f }
            r1.<init>(r13, r4)     // Catch:{ IOException -> 0x007f }
            X.71N r0 = new X.71N     // Catch:{ IOException -> 0x007f }
            r0.<init>(r13, r5, r1, r4)     // Catch:{ IOException -> 0x007f }
            r3.put(r2, r0)     // Catch:{ IOException -> 0x007f }
            return
        L_0x007f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "wa-msys/NetworkSession: "
            r1.append(r0)
            java.lang.String r0 = "Failed to create StreamingUploadDataTask"
            X.C108985cd.A1M(r0, r1, r2)
            return
        L_0x008f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DataTask type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not yet supported"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            X.1El r7 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r13.mUrlRequest
            java.io.ByteArrayOutputStream r9 = X.C108945cZ.A15()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x00e5 }
            java.lang.String r2 = r13.mContentUrl     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "file://"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceFirst(r1, r0)     // Catch:{ all -> 0x00db }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x00db }
            java.io.FileInputStream r8 = X.C108945cZ.A18(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r10 = r13.mTaskIdentifier     // Catch:{ all -> 0x00db }
            r11 = 1
            r12 = 0
            com.facebook.msys.mci.UrlResponse r15 = X.C23081El.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00db }
            byte[] r17 = r9.toByteArray()     // Catch:{ all -> 0x00db }
            java.lang.String r16 = "wa-msys/NetworkSession: "
            r18 = 0
            r14 = r5
            r19 = r18
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00db }
            r9.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x00e5 }
            return
        L_0x00db:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x00e5 }
        L_0x00e4:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x00e5 }
        L_0x00e5:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUploadDataTask"
            A00(r13, r5, r6, r0, r1)
            return
        L_0x00ec:
            X.1El r7 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r13.mUrlRequest
            java.lang.String r1 = "NetworkSessionDownload"
            java.io.File r0 = r7.A04     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x011d }
            r8 = 0
            java.io.File r18 = java.io.File.createTempFile(r1, r8, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x011d }
            java.io.FileOutputStream r9 = X.C108945cZ.A19(r18)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x011d }
            java.lang.String r10 = r13.mTaskIdentifier     // Catch:{ all -> 0x0113 }
            r12 = 1
            r11 = 0
            com.facebook.msys.mci.UrlResponse r15 = X.C23081El.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0113 }
            java.lang.String r16 = "wa-msys/NetworkSession: "
            r19 = r8
            r14 = r5
            r17 = r8
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0113 }
            r9.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x011d }
            return
        L_0x0113:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x011d }
        L_0x011c:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x011d }
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDownloadDataTask"
            A00(r13, r5, r6, r0, r1)
            return
        L_0x0124:
            X.1El r7 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r13.mUrlRequest
            java.io.ByteArrayOutputStream r9 = X.C108945cZ.A15()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0151 }
            java.lang.String r10 = r13.mTaskIdentifier     // Catch:{ all -> 0x0147 }
            r12 = 0
            r8 = 0
            r11 = 1
            com.facebook.msys.mci.UrlResponse r15 = X.C23081El.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0147 }
            byte[] r17 = r9.toByteArray()     // Catch:{ all -> 0x0147 }
            java.lang.String r16 = "wa-msys/NetworkSession: "
            r19 = r8
            r14 = r5
            r18 = r8
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0147 }
            r9.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0151 }
            return
        L_0x0147:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x014c }
            goto L_0x0150
        L_0x014c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0151 }
        L_0x0150:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0151 }
        L_0x0151:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDataDataTask"
            A00(r13, r5, r6, r0, r1)
            return
        L_0x0158:
            java.lang.Object r4 = r6.A01
            X.6hq r4 = (X.C129466hq) r4
            java.lang.Object r3 = r6.A02
            X.6Pp r3 = (X.AnonymousClass6Pp) r3
            java.lang.Object r2 = r6.A03
            X.0vk r2 = (X.C18090vk) r2
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r4.A03     // Catch:{ Exception -> 0x017e }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.6y6 r1 = (X.C139036y6) r1     // Catch:{ Exception -> 0x017e }
            X.7SK r0 = new X.7SK     // Catch:{ Exception -> 0x017e }
            r0.<init>(r4, r3, r2)     // Catch:{ Exception -> 0x017e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x017e }
            r0.invoke()     // Catch:{ all -> 0x017b }
            monitor-exit(r1)     // Catch:{ Exception -> 0x017e }
            return
        L_0x017b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x017e }
            throw r0     // Catch:{ Exception -> 0x017e }
        L_0x017e:
            r1 = move-exception
            java.lang.String r0 = "HierarchyLogger/logHierarchy"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0185:
            java.lang.Object r3 = r6.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            java.lang.Object r2 = r6.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r6.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 0
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity.A0Q(r3, r2, r1, r0)
            return
        L_0x0196:
            java.lang.Object r0 = r6.A01
            X.1x7 r0 = (X.C41821x7) r0
            java.lang.Object r2 = r6.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r6.A03
            X.210 r1 = (X.AnonymousClass210) r1
            X.00H r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            X.6pi r0 = (X.C133916pi) r0
            r0.A00(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146857Qw.run():void");
    }

    public static void A00(DataTask dataTask, NetworkSession networkSession, UrlRequest urlRequest, String str, Throwable th) {
        Log.e(str, th);
        NetworkUtils.markDataTaskCompleted(dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest), "wa-msys/NetworkSession: ", (byte[]) null, (File) null, new IOException(th));
    }
}
