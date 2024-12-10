package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9Bh  reason: invalid class name and case insensitive filesystem */
public class C177969Bh extends A34 {
    public final AnonymousClass195 A00;
    public final C218617r A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1L7 A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass118 A05;
    public final AnonymousClass196 A06;
    public final WeakReference A07;
    public final AtomicLong A08 = new AtomicLong();
    public final AnonymousClass11P A09;
    public final AnonymousClass1LU A0A;
    public final AnonymousClass10I A0B;

    public static String A00(Context context, Uri uri, String str) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                String string = cursor.getString(0);
                AnonymousClass9OA.A00(cursor);
                return string;
            }
        } catch (Exception e) {
            Log.w("DocumentFile", AnonymousClass001.A1E(e, "Failed query: ", AnonymousClass000.A10()));
        } catch (Throwable th) {
            AnonymousClass9OA.A00((AutoCloseable) null);
            throw th;
        }
        AnonymousClass9OA.A00(cursor);
        return null;
    }

    private boolean A02(C192359oF r16, AnonymousClass11B r17, File file, List list, AtomicLong atomicLong) {
        String str;
        FileOutputStream A19;
        boolean z = true;
        C192359oF r6 = r16;
        if (r16 == null || r6.A00()) {
            str = "externaldirmigration/manual/doc file either null or virtual";
        } else {
            Context context = r6.A00;
            Uri uri = r6.A01;
            String A002 = A00(context, uri, "_display_name");
            if (A002 == null) {
                str = "externaldirmigration/manual/file name is null";
            } else {
                File A0e = C17880vN.A0e(file, A002);
                AnonymousClass11B r11 = r17;
                List list2 = list;
                AtomicLong atomicLong2 = atomicLong;
                if (!"vnd.android.document/directory".equals(A00(context, uri, "mime_type"))) {
                    if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(A00(context, uri, "mime_type"))) {
                        C17900vP.A0g("externaldirmigration/manual/cannot read file ", A002, AnonymousClass000.A10());
                        atomicLong2.incrementAndGet();
                        return false;
                    } else if (A0e.exists()) {
                        str = AnonymousClass001.A1E(A0e, "externaldirmigration/manual/target file already exists ", AnonymousClass000.A10());
                    } else {
                        try {
                            InputStream A072 = r11.A07(uri);
                            try {
                                A19 = C108945cZ.A19(A0e);
                                C64062u9.A00(A072, A19);
                                list2.add(A0e);
                                if (!A01(r6, r11)) {
                                    C17900vP.A0Z(A0e, "externaldirmigration/manual/failed to delete source file for ", AnonymousClass000.A10());
                                }
                                A19.close();
                                if (A072 != null) {
                                    A072.close();
                                    return true;
                                }
                                return z;
                            } catch (Throwable th) {
                                if (A072 != null) {
                                    A072.close();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            com.whatsapp.util.Log.e("externaldirmigration/manual//failed to copy file", e);
                            atomicLong2.incrementAndGet();
                            return false;
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                        }
                    }
                } else if (A0e.exists() || A0e.mkdirs()) {
                    for (C192359oF A022 : r6.A01()) {
                        if (!A02(A022, r11, A0e, list2, atomicLong2)) {
                            z = false;
                        }
                    }
                    if (z && !A01(r6, r11)) {
                        str = AnonymousClass001.A1E(A0e, "externaldirmigration/manual/failed to delete source file for ", AnonymousClass000.A10());
                    }
                    return z;
                } else {
                    C17900vP.A0X(A0e, "externaldirmigration/manual/failed to create target directory ", AnonymousClass000.A10());
                    return false;
                }
            }
        }
        com.whatsapp.util.Log.w(str);
        return z;
        throw th;
    }

    private boolean A01(C192359oF r14, AnonymousClass11B r15) {
        Uri uri = r14.A01;
        boolean z = true;
        Cursor A032 = r15.A03(uri, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
        if (A032 != null) {
            try {
                if (A032.moveToFirst()) {
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("flags");
                    if (!A032.isNull(columnIndexOrThrow)) {
                        if ((A032.getLong(columnIndexOrThrow) & 4) == 0) {
                            z = false;
                        }
                        A032.close();
                        if (z) {
                            try {
                                return DocumentsContract.deleteDocument(r15.A00, uri);
                            } catch (FileNotFoundException e) {
                                com.whatsapp.util.Log.e("externaldirmigration/manual/", e);
                                return false;
                            }
                        }
                    }
                }
                A032.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        com.whatsapp.util.Log.w("externaldirmigration/manual/file deletion is not supported");
        return true;
    }

    public void A0F() {
        this.A08.set(System.currentTimeMillis());
        this.A02.A07(0, 2131891853);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r17) {
        /*
            r16 = this;
            r3 = r17
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r15 = new java.util.concurrent.atomic.AtomicLong
            r15.<init>(r0)
            if (r3 == 0) goto L_0x0107
            int r2 = r3.length
            r5 = 1
            if (r2 != r5) goto L_0x0107
            r2 = 0
            r6 = r3[r2]
            if (r6 == 0) goto L_0x0107
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            r10 = r16
            X.118 r2 = r10.A05
            android.content.Context r4 = r2.A00
            r3 = 0
            java.lang.String r2 = android.provider.DocumentsContract.getTreeDocumentId(r6)
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r6, r2)
            X.9oF r9 = new X.9oF
            r9.<init>(r4, r2, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "externaldirmigration/manual/going to migrate "
            X.C17900vP.A0Y(r9, r2, r3)
            boolean r2 = r9.A00()
            if (r2 != 0) goto L_0x00c8
            android.content.Context r6 = r9.A00
            android.net.Uri r4 = r9.A01
            java.lang.String r2 = "_display_name"
            java.lang.String r2 = A00(r6, r4, r2)
            if (r2 == 0) goto L_0x00c8
            java.lang.String r3 = "vnd.android.document/directory"
            java.lang.String r2 = "mime_type"
            java.lang.String r2 = A00(r6, r4, r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c8
            X.11C r4 = r10.A04
            X.11B r12 = r4.A0O()
            if (r12 != 0) goto L_0x007f
            java.lang.String r2 = "externaldirmigration/manual/no content resolver"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0064:
            r15.incrementAndGet()
        L_0x0067:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x00e4
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r5)
            X.17r r4 = r10.A01
            r3 = 28
            X.3Bq r2 = new X.3Bq
            r2.<init>(r6, r3)
            r4.A0k(r2, r14)
            goto L_0x00da
        L_0x007f:
            X.1L7 r2 = r10.A03
            java.io.File r13 = r2.A06()
            X.C17960vV.A07(r13)
            X.9oF[] r8 = r9.A01()
            int r7 = r8.length
            r6 = 1
            r3 = 0
        L_0x008f:
            if (r3 >= r7) goto L_0x009d
            r11 = r8[r3]
            boolean r2 = r10.A02(r11, r12, r13, r14, r15)
            if (r2 != 0) goto L_0x009a
            r6 = 0
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x009d:
            if (r6 == 0) goto L_0x00a3
            boolean r6 = r10.A01(r9, r12)
        L_0x00a3:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "externaldirmigration/manual/succeeded: "
            X.C17900vP.A0n(r2, r3, r6)
            if (r6 == 0) goto L_0x0067
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = "WhatsApp"
            java.io.File r3 = X.C17880vN.A0e(r3, r2)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.C20105A7j.A02(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            X.C20105A7j.A02(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            X.C20105A7j.A02(r2, r4, r3)
            goto L_0x0067
        L_0x00c8:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "externaldirmigration/manual/not a suitable tree to migrate ("
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = ")"
            X.C17890vO.A1B(r3, r2)
            goto L_0x0064
        L_0x00da:
            r6.await()     // Catch:{ InterruptedException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r3 = move-exception
            java.lang.String r2 = "WhatsAppscan interrupted"
            com.whatsapp.util.Log.w(r2, r3)
        L_0x00e4:
            long r5 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r2 = r10.A08
            long r2 = r2.get()
            long r5 = r5 - r2
            r3 = 300(0x12c, double:1.48E-321)
            long r3 = r3 - r5
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f9
            android.os.SystemClock.sleep(r3)
        L_0x00f9:
            long r2 = X.AnonymousClass8BR.A06(r14)
            long r0 = r15.get()
            X.9cA r4 = new X.9cA
            r4.<init>(r2, r0)
            return r4
        L_0x0107:
            long r2 = r15.get()
            X.9cA r4 = new X.9cA
            r4.<init>(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177969Bh.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C73203Rj A002;
        int i;
        int i2;
        DialogInterface.OnClickListener a9r;
        C185179cA r10 = (C185179cA) obj;
        this.A02.A04();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("externaldirmigration/manual/migration results: moved ");
        A10.append(r10.A01);
        A10.append(" failed ");
        long j = r10.A00;
        C17890vO.A16(A10, j);
        AnonymousClass1L7 r2 = this.A03;
        boolean z = !r2.A0C();
        if (!z) {
            r2.A0B("scoped");
        }
        Activity activity = (Activity) this.A07.get();
        if (activity != null && !AnonymousClass4Yv.A02(activity) && this.A00.A00) {
            if (z) {
                A002 = AnonymousClass4a6.A00(activity);
                A002.A0E(2131891849);
                A002.A0S(AnonymousClass8BV.A0q(activity, new Object[1], 2131899103, 0, 2131891854));
                A002.A0T(false);
                i = 2131899286;
                i2 = 24;
            } else {
                int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                A002 = AnonymousClass4a6.A00(activity);
                if (i3 == 0) {
                    A002.A0E(2131891850);
                    A002.A0D(2131891855);
                    A002.A0T(false);
                    i = 2131899286;
                    a9r = new A9R(13);
                    A002.A0Z(a9r, i);
                    AnonymousClass3MY.A1G(A002);
                }
                A002.A0E(2131891852);
                A002.A0D(2131891851);
                A002.A0T(false);
                A002.A0X(new A9R(14), 2131898766);
                i = 2131891856;
                i2 = 25;
            }
            a9r = new C20153A9p(activity, this, i2);
            A002.A0Z(a9r, i);
            AnonymousClass3MY.A1G(A002);
        } else if (z) {
            this.A06.A04("ManualExternalDirMigration");
        }
    }

    public /* synthetic */ void A0K(Activity activity) {
        AnonymousClass10I r12 = this.A0B;
        AnonymousClass118 r9 = this.A05;
        AnonymousClass11P r8 = this.A09;
        AnonymousClass1KB r5 = this.A02;
        AnonymousClass1LU r11 = this.A0A;
        Activity activity2 = activity;
        r12.CGD(new C177969Bh(activity2, this.A00, this.A01, r5, this.A03, this.A04, r8, r9, this.A06, r11, r12), new Uri[0]);
    }

    public C177969Bh(Activity activity, AnonymousClass195 r3, C218617r r4, AnonymousClass1KB r5, AnonymousClass1L7 r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, AnonymousClass196 r10, AnonymousClass1LU r11, AnonymousClass10I r12) {
        this.A07 = AnonymousClass3MW.A0z(activity);
        this.A05 = r9;
        this.A09 = r8;
        this.A02 = r5;
        this.A0A = r11;
        this.A0B = r12;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = r10;
        this.A00 = r3;
    }

    public /* synthetic */ void A0J(Activity activity) {
        activity.startActivity(AnonymousClass1LU.A0A(activity));
        this.A06.A04("ManualExternalDirMigration");
    }
}
