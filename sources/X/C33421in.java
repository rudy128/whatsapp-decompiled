package X;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.privacy.usernotice.UserNoticeContentWorker;
import com.whatsapp.privacy.usernotice.UserNoticeIconWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1in  reason: invalid class name and case insensitive filesystem */
public final class C33421in {
    public C59762mq A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass19K A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public C33421in(AnonymousClass11S r2, AnonymousClass118 r3, C18000vb r4, C18030ve r5, AnonymousClass10I r6, AnonymousClass19K r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r8, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(java.io.InputStream r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            r4 = 1
            X.C18070vi.A0d(r7, r4)
            r3 = 0
            X.118 r0 = r5.A02     // Catch:{ IOException -> 0x003f }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x003f }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x003f }
            java.io.File r2 = A00(r0, r8)     // Catch:{ IOException -> 0x003f }
            if (r2 != 0) goto L_0x0013
            return r3
        L_0x0013:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003f }
            r1.<init>()     // Catch:{ IOException -> 0x003f }
            java.lang.String r0 = "UserNoticeContentWorker/storeUserNoticeContent/storing user notice for "
            r1.append(r0)     // Catch:{ IOException -> 0x003f }
            r1.append(r8)     // Catch:{ IOException -> 0x003f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x003f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x003f }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x003f }
            r0.<init>(r2, r7)     // Catch:{ IOException -> 0x003f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x003f }
            X.C64062u9.A00(r6, r2)     // Catch:{ all -> 0x0038 }
            r2.close()     // Catch:{ IOException -> 0x003f }
            return r4
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x003f }
            throw r0     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/storeUserNoticeContent/failed to store"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33421in.A07(java.io.InputStream, java.lang.String, int):boolean");
    }

    private final void A01(C59762mq r4, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/populateIconFiles/notice id: ");
        sb.append(i);
        Log.i(sb.toString());
        A02(r4.A02, "banner_icon_light.png", "banner_icon_dark.png", i);
        A02(r4.A04, "modal_icon_light.png", "modal_icon_dark.png", i);
        A02(r4.A03, "blocking_modal_icon_light.png", "blocking_modal_icon_dark.png", i);
    }

    private final void A02(C57882jn r3, String str, String str2, int i) {
        if (r3 != null) {
            if (A03(this, new String[]{str, str2}, i)) {
                Context context = this.A02.A00;
                C18070vi.A0X(context);
                File A002 = A00(context, i);
                r3.A01 = new File(A002, str);
                r3.A00 = new File(A002, str2);
            }
        }
    }

    public static final boolean A03(C33421in r5, String[] strArr, int i) {
        File[] listFiles;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
        Context context = r5.A02.A00;
        C18070vi.A0X(context);
        File A002 = A00(context, i);
        if (!(A002 == null || (listFiles = A002.listFiles()) == null)) {
            for (File name : listFiles) {
                hashSet.remove(name.getName());
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/userNoticeFilesExist/notice id ");
        sb.append(i);
        sb.append(" files exists: ");
        sb.append(isEmpty);
        Log.i(sb.toString());
        return isEmpty;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0173, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59762mq A04(X.C63592tN r19) {
        /*
            r18 = this;
            r1 = r19
            int r4 = r1.A01
            r3 = r18
            X.0ve r5 = r3.A04
            boolean r0 = X.C63802ti.A01(r5, r4)
            r9 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/green alert disabled, notice id: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
        L_0x0020:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0023:
            return r9
        L_0x0024:
            boolean r0 = X.C63802ti.A02(r5, r1)
            if (r0 == 0) goto L_0x0098
            X.118 r7 = r3.A02
            X.00H r0 = r3.A09
            java.lang.Object r0 = r0.get()
            X.C18070vi.A0X(r0)
            r6 = 0
            r4 = 1
            r1 = 356(0x164, float:4.99E-43)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r5, r1)
            if (r2 != 0) goto L_0x0063
            java.lang.String r0 = "GreenAlertUtils/buildBanner/no duration received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r9
        L_0x0047:
            X.2Lu r12 = X.C63802ti.A00(r5, r4)
            X.2Lu r13 = X.C63802ti.A00(r5, r6)
            if (r7 == 0) goto L_0x012b
            if (r12 == 0) goto L_0x012b
            if (r13 == 0) goto L_0x012b
            java.lang.String r15 = "default"
            X.2mq r10 = new X.2mq
            r17 = r4
            r11 = r7
            r14 = r9
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0063:
            android.content.Context r1 = r7.A00
            r0 = 2131899071(0x7f1232bf, float:1.9433078E38)
            java.lang.String r11 = r1.getString(r0)
            X.C18070vi.A0X(r11)
            r0 = 1609459200000(0x176bb3e7000, double:7.95178499103E-312)
            X.1vL r7 = new X.1vL
            r7.<init>(r0)
            long r2 = (long) r2
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 * r0
            X.1vM r1 = new X.1vM
            r1.<init>(r9, r2)
            java.lang.String r0 = "onDemand"
            X.1vP r8 = new X.1vP
            r8.<init>(r1, r7, r9, r0)
            java.lang.String r12 = ""
            java.lang.String r15 = "whatsapp:user-notice?action=open-modal"
            X.2Ls r7 = new X.2Ls
            r14 = r12
            r10 = r9
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0047
        L_0x0098:
            int r6 = r1.A03
            int r0 = r1.A00
            r2 = 0
            if (r0 == 0) goto L_0x00af
            r2 = 1
            if (r0 == r2) goto L_0x00af
            r2 = 2
            if (r0 == r2) goto L_0x00af
            r2 = 3
            if (r0 == r2) goto L_0x00af
            r2 = 4
            if (r0 == r2) goto L_0x00af
            r2 = 5
            if (r0 == r2) goto L_0x00af
            r2 = -1
        L_0x00af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/notice id: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r5 = " version: "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = " stage: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 5
            if (r2 != r0) goto L_0x00da
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/end stage, skip local content"
            goto L_0x0020
        L_0x00da:
            X.2mq r1 = r3.A00
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x010c
            int r0 = r1.A00
            if (r0 != r4) goto L_0x010c
            int r0 = r1.A01
            if (r0 != r6) goto L_0x010c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/has content for notice id: "
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2mq r0 = r3.A00
            if (r0 == 0) goto L_0x012d
            r3.A01(r0, r4)
            X.2mq r10 = r3.A00
            return r10
        L_0x010c:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r2 = "content.json"
            r1[r0] = r2
            boolean r0 = A03(r3, r1, r4)
            if (r0 == 0) goto L_0x0023
            X.118 r0 = r3.A02
            android.content.Context r0 = r0.A00
            X.C18070vi.A0X(r0)
            java.io.File r1 = A00(r0, r4)
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            goto L_0x0133
        L_0x012b:
            r10 = 0
            return r10
        L_0x012d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0133:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0174 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0174 }
            X.00H r0 = r3.A07     // Catch:{ all -> 0x016d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x016d }
            X.1v8 r0 = (X.C40701v8) r0     // Catch:{ all -> 0x016d }
            X.2mq r0 = r0.A03(r2, r4)     // Catch:{ all -> 0x016d }
            r3.A00 = r0     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0151
            r3.A01(r0, r4)     // Catch:{ all -> 0x016d }
            X.2mq r10 = r3.A00     // Catch:{ all -> 0x016d }
            r2.close()     // Catch:{ IOException -> 0x0174 }
            return r10
        L_0x0151:
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/error parsing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            r3.A05(r4)     // Catch:{ all -> 0x016d }
            X.00H r0 = r3.A08     // Catch:{ all -> 0x016d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x016d }
            X.CsQ r1 = (X.C26106CsQ) r1     // Catch:{ all -> 0x016d }
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x016d }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x016d }
            r2.close()     // Catch:{ IOException -> 0x0174 }
            return r9
        L_0x016d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0174 }
            throw r0     // Catch:{ IOException -> 0x0174 }
        L_0x0174:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33421in.A04(X.2tN):X.2mq");
    }

    public final void A05(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/deleteUserNoticeData/notice id: ");
        sb.append(i);
        Log.i(sb.toString());
        Context context = this.A02.A00;
        C18070vi.A0X(context);
        File A002 = A00(context, i);
        if (A002 != null) {
            this.A05.CGF(new C21448AkF(A002, 37));
        }
        this.A00 = null;
    }

    public final void A06(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/fetchAndStoreUserNoticeContent/notice id ");
        sb.append(i);
        Log.i(sb.toString());
        C192939pH r8 = new C192939pH();
        C17880vN.A1P("notice_id", r8.A00, i);
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        Me me = r0.A00;
        if (me != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v1").appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(i));
            C18000vb r3 = this.A03;
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("lg", r3.A05()).appendQueryParameter("lc", r3.A04()).appendQueryParameter("cc", AnonymousClass1K3.A00(me.cc)).appendQueryParameter("platform", "android");
            if (this.A02.A00.getResources().getDisplayMetrics().densityDpi <= 240) {
                str = "hdpi";
            } else {
                str = "xxhdpi";
            }
            Uri build = appendQueryParameter2.appendQueryParameter("img-size", str).build();
            if (build != null) {
                r8.A00.put("url", build.toString());
                A6Y A002 = r8.A00();
                A1B a1b = new A1B();
                a1b.A00 = AnonymousClass00R.A01;
                C20078A6e A012 = a1b.A01();
                C196269uj r1 = new C196269uj(UserNoticeContentWorker.class);
                r1.A07("tag.whatsapp.usernotice.content.fetch");
                r1.A03(A012);
                Integer num = AnonymousClass00R.A00;
                TimeUnit timeUnit = TimeUnit.HOURS;
                r1.A06(num, timeUnit, 1);
                r1.A04(A002);
                C196269uj r12 = new C196269uj(UserNoticeIconWorker.class);
                r12.A07("tag.whatsapp.usernotice.icon.fetch");
                r12.A03(A012);
                r12.A06(num, timeUnit, 1);
                r12.A04(r8.A00());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tag.whatsapp.usernotice.content.fetch.");
                sb2.append(i);
                String obj = sb2.toString();
                ((A7W) this.A06.get()).A03((C162248Jv) r1.A00(), num, obj).A03((C162248Jv) r12.A00()).A02();
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("UserNoticeContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notice id ");
        sb3.append(i);
        Log.e(sb3.toString());
    }

    public static final File A00(Context context, int i) {
        File filesDir = context.getFilesDir();
        C18070vi.A0X(filesDir);
        File A002 = AnonymousClass2UT.A00(filesDir, "user_notice");
        if (A002 == null) {
            return null;
        }
        return AnonymousClass2UT.A00(A002, String.valueOf(i));
    }
}
