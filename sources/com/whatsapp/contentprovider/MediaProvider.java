package com.whatsapp.contentprovider;

import X.AnonymousClass0DT;
import X.AnonymousClass11P;
import X.AnonymousClass190;
import X.AnonymousClass1M9;
import X.AnonymousClass1NL;
import X.AnonymousClass1ST;
import X.AnonymousClass1W6;
import X.AnonymousClass204;
import X.AnonymousClass206;
import X.AnonymousClass21K;
import X.AnonymousClass21L;
import X.AnonymousClass21V;
import X.AnonymousClass25O;
import X.C17960vV;
import X.C18070vi;
import X.C19680yj;
import X.C20285AEt;
import X.C218617r;
import X.C24921Me;
import X.C25161Nd;
import X.C28781at;
import X.C28801av;
import X.C32211gp;
import X.C50562Ux;
import X.C62572rc;
import X.C693336u;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class MediaProvider extends C19680yj {
    public static UriMatcher A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String[] A0E = {"_display_name", "_size"};
    public Context A00;
    public C218617r A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C25161Nd A04;
    public AnonymousClass11P A05;
    public AnonymousClass1ST A06;
    public C32211gp A07;
    public AnonymousClass1W6 A08;
    public AnonymousClass1NL A09;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp");
        sb.append(".provider.media");
        A0B = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("vnd.android.cursor.dir/vnd.");
        sb2.append("com.whatsapp");
        sb2.append(".provider.media.buckets");
        A0C = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("vnd.android.cursor.dir/vnd.");
        sb3.append("com.whatsapp");
        sb3.append(".provider.media.items");
        A0D = sb3.toString();
    }

    public static int A01(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid mode: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static synchronized UriMatcher A02() {
        UriMatcher uriMatcher;
        synchronized (MediaProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                String str = A0B;
                uriMatcher2.addURI(str, "buckets", 1);
                A0A.addURI(str, "items", 2);
                A0A.addURI(str, "item/*", 3);
                A0A.addURI(str, "gdpr_report", 4);
                A0A.addURI(str, "channels_gdpr_report", 13);
                A0A.addURI(str, "personal_dyi_report", 6);
                A0A.addURI(str, "business_dyi_report", 11);
                A0A.addURI(str, "business_activity_report", 7);
                A0A.addURI(str, "export_chat/*/*", 5);
                A0A.addURI(str, "export_chat_folder/*/*", 16);
                A0A.addURI(str, "flows_responses/*", 17);
                A0A.addURI(str, "thumbnail/*", 8);
                A0A.addURI(str, "export/*", 9);
                A0A.addURI(str, "devdebuginfo/*", 12);
                A0A.addURI(str, "support", 10);
                A0A.addURI(str, "content_gdpr_report", 18);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    public static Uri A04(AnonymousClass190 r4, C32211gp r5, AnonymousClass21V r6) {
        C62572rc r0 = r6.A02;
        C17960vV.A07(r0);
        File file = r0.A0G;
        C17960vV.A07(file);
        String obj = UUID.randomUUID().toString();
        r5.A01(obj, file.getAbsolutePath(), C50562Ux.A00(r4, r6), file.getName());
        return new Uri.Builder().scheme("content").authority(A0B).appendPath("item").appendEncodedPath(obj).build();
    }

    public static Uri A05(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(A0B).appendPath(str).appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2).build();
    }

    public static String A06(Uri uri) {
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter != null) {
            return queryParameter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown URI ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d7, code lost:
        r4 = new android.database.MatrixCursor(r3, 1);
        r4.addRow(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04eb, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ef, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04f1, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04f4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0190, code lost:
        r3 = new java.lang.StringBuilder();
        r1 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0202, code lost:
        r3.append(r1.getString(r0));
        r3.append(".zip");
        r0 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02cf, code lost:
        r2 = new java.lang.String[r4];
        java.lang.System.arraycopy(r6, 0, r2, 0, r4);
        r0 = new java.lang.Object[r4];
        java.lang.System.arraycopy(r5, 0, r0, 0, r4);
        r4 = new android.database.MatrixCursor(r2, r15);
        r4.addRow(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e2, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0322, code lost:
        return A03(r2, r4, r0, r9);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:124:0x03c8, B:135:0x0423] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            r17 = this;
            r9 = r19
            r8 = r17
            r8.A09()
            android.content.UriMatcher r0 = A02()
            r2 = r18
            int r0 = r0.match(r2)
            switch(r0) {
                case 1: goto L_0x04f5;
                case 2: goto L_0x03e1;
                case 3: goto L_0x0323;
                case 4: goto L_0x02fa;
                case 5: goto L_0x0214;
                case 6: goto L_0x01ec;
                case 7: goto L_0x01d7;
                case 8: goto L_0x0014;
                case 9: goto L_0x0014;
                case 10: goto L_0x01c6;
                case 11: goto L_0x01af;
                case 12: goto L_0x0198;
                case 13: goto L_0x0183;
                case 14: goto L_0x0014;
                case 15: goto L_0x0014;
                case 16: goto L_0x00b1;
                case 17: goto L_0x003a;
                case 18: goto L_0x002b;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r4 = r1.A0Y(r0)
            r0 = 2131898447(0x7f12304f, float:1.9431812E38)
            goto L_0x0190
        L_0x003a:
            java.lang.String r7 = r2.getLastPathSegment()
            if (r7 == 0) goto L_0x009a
            if (r19 != 0) goto L_0x0044
            java.lang.String[] r9 = A0E
        L_0x0044:
            int r6 = r9.length
            java.lang.String[] r5 = new java.lang.String[r6]
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r3 = 0
            r2 = 0
        L_0x004b:
            if (r3 >= r6) goto L_0x008d
            r10 = r9[r3]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x0072
            r5[r2] = r1
            int r10 = r2 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = ".csv"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x006c:
            r4[r2] = r0
            r2 = r10
        L_0x006f:
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0072:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x006f
            r5[r2] = r1
            int r10 = r2 + 1
            X.17r r0 = r8.A01
            java.io.File r0 = r0.A0V(r7)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x006c
        L_0x008d:
            java.lang.String[] r3 = new java.lang.String[r2]
            r0 = 0
            java.lang.System.arraycopy(r5, r0, r3, r0, r2)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.System.arraycopy(r4, r0, r1, r0, r2)
            goto L_0x03d7
        L_0x009a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00b1:
            java.util.List r3 = r2.getPathSegments()
            int r0 = r3.size()
            r1 = 2
            if (r0 < r1) goto L_0x016c
            int r0 = r3.size()
            int r0 = r0 - r1
            java.lang.Object r1 = r3.get(r0)
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r3.get(r0)
            android.util.Pair r10 = android.util.Pair.create(r1, r0)
            if (r10 == 0) goto L_0x016c
            if (r19 != 0) goto L_0x00d9
            java.lang.String[] r9 = A0E
        L_0x00d9:
            int r7 = r9.length
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r3 = 0
            r4 = 0
        L_0x00e0:
            r15 = 1
            if (r3 >= r7) goto L_0x02cf
            r2 = r9[r3]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x014a
            r6[r4] = r1
            java.lang.Object r1 = r10.first
            java.lang.String r1 = (java.lang.String) r1
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r0 = r0.A02(r1)
            java.lang.String r12 = ".zip"
            if (r0 == 0) goto L_0x012f
            int r16 = r4 + 1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            android.content.Context r14 = r8.A00
            r11 = 2131889642(0x7f120dea, float:1.9413953E38)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            X.1Me r1 = r8.A03
            X.1M9 r15 = r8.A02
            X.1E7 r0 = r15.A0H(r0)
            java.lang.String r1 = r1.A0I(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = r14.getString(r11, r2)
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
            r5[r4] = r0
            r4 = r16
        L_0x012c:
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x012f:
            int r11 = r4 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r8.A00
            r0 = 2131889643(0x7f120deb, float:1.9413955E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            goto L_0x0168
        L_0x014a:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x012c
            r6[r4] = r1
            int r11 = r4 + 1
            X.17r r1 = r8.A01
            java.lang.Object r0 = r10.second
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r0 = r1.A0T(r0)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0168:
            r5[r4] = r0
            r4 = r11
            goto L_0x012c
        L_0x016c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0183:
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r4 = r1.A0Y(r0)
            r0 = 2131892639(0x7f12199f, float:1.9420032E38)
        L_0x0190:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r1 = r8.A00
            goto L_0x0202
        L_0x0198:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Developer debug info asked in non debug build: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01af:
            java.lang.String r3 = "business"
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r4 = r1.A0e(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r1 = r8.A00
            r0 = 2131889580(0x7f120dac, float:1.9413828E38)
            goto L_0x0202
        L_0x01c6:
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r1 = r1.A0Z(r0)
            java.lang.String r0 = "logs.zip"
            android.database.MatrixCursor r4 = r8.A03(r2, r1, r0, r9)
            return r4
        L_0x01d7:
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r4 = r1.A0W(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r1 = r8.A00
            r0 = 2131893435(0x7f121cbb, float:1.9421646E38)
            goto L_0x0202
        L_0x01ec:
            java.lang.String r3 = "personal"
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r4 = r1.A0e(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r1 = r8.A00
            r0 = 2131889589(0x7f120db5, float:1.9413846E38)
        L_0x0202:
            java.lang.String r0 = r1.getString(r0)
            r3.append(r0)
            java.lang.String r0 = ".zip"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x031e
        L_0x0214:
            java.util.List r3 = r2.getPathSegments()
            int r0 = r3.size()
            r1 = 2
            if (r0 < r1) goto L_0x02e3
            int r0 = r3.size()
            int r0 = r0 - r1
            java.lang.Object r1 = r3.get(r0)
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r3.get(r0)
            android.util.Pair r7 = android.util.Pair.create(r1, r0)
            if (r7 == 0) goto L_0x02e3
            if (r19 != 0) goto L_0x023c
            java.lang.String[] r9 = A0E
        L_0x023c:
            int r10 = r9.length
            java.lang.String[] r6 = new java.lang.String[r10]
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r3 = 0
            r4 = 0
        L_0x0243:
            r15 = 1
            if (r3 >= r10) goto L_0x02cf
            r2 = r9[r3]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x02ad
            r6[r4] = r1
            java.lang.Object r1 = r7.first
            java.lang.String r1 = (java.lang.String) r1
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r0 = r0.A02(r1)
            java.lang.String r12 = ".txt"
            if (r0 == 0) goto L_0x0292
            int r16 = r4 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            android.content.Context r13 = r8.A00
            r2 = 2131889642(0x7f120dea, float:1.9413953E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            X.1Me r1 = r8.A03
            X.1M9 r15 = r8.A02
            X.1E7 r0 = r15.A0H(r0)
            java.lang.String r1 = r1.A0I(r0)
            r0 = 0
            r14[r0] = r1
            java.lang.String r0 = r13.getString(r2, r14)
            r11.append(r0)
            r11.append(r12)
            java.lang.String r0 = r11.toString()
            r5[r4] = r0
            r4 = r16
        L_0x028f:
            int r3 = r3 + 1
            goto L_0x0243
        L_0x0292:
            int r11 = r4 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r8.A00
            r0 = 2131889643(0x7f120deb, float:1.9413955E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            goto L_0x02cb
        L_0x02ad:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x028f
            r6[r4] = r1
            int r11 = r4 + 1
            X.17r r1 = r8.A01
            java.lang.Object r0 = r7.second
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r0 = r1.A0U(r0)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x02cb:
            r5[r4] = r0
            r4 = r11
            goto L_0x028f
        L_0x02cf:
            java.lang.String[] r2 = new java.lang.String[r4]
            r1 = 0
            java.lang.System.arraycopy(r6, r1, r2, r1, r4)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.System.arraycopy(r5, r1, r0, r1, r4)
            android.database.MatrixCursor r4 = new android.database.MatrixCursor
            r4.<init>(r2, r15)
            r4.addRow(r0)
            return r4
        L_0x02e3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02fa:
            X.17r r1 = r8.A01
            java.lang.String r0 = A06(r2)
            java.io.File r4 = r1.A0Y(r0)
            r3 = 2131890647(0x7f1211d7, float:1.9415992E38)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r0 = r8.A00
            java.lang.String r0 = r0.getString(r3)
            r1.append(r0)
            java.lang.String r0 = ".zip"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x031e:
            android.database.MatrixCursor r4 = r8.A03(r2, r4, r0, r9)
            return r4
        L_0x0323:
            if (r19 != 0) goto L_0x0327
            java.lang.String[] r9 = A0E
        L_0x0327:
            X.1gp r1 = r8.A07
            java.lang.String r0 = r2.getLastPathSegment()
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x03b8
            java.io.File r10 = new java.io.File
            r10.<init>(r0)
        L_0x0338:
            int r7 = r9.length
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r3 = 0
            r4 = 0
        L_0x033f:
            if (r3 >= r7) goto L_0x03cc
            r11 = r9[r3]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x0394
            r6[r4] = r1
            int r15 = r4 + 1
            X.1gp r0 = r8.A07
            java.lang.String r1 = r2.getLastPathSegment()
            X.1RM r0 = r0.A00
            X.1at r14 = r0.get()
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03c7 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x03c7 }
            java.lang.String r12 = "SELECT display_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x03c7 }
            r0 = 0
            r11[r0] = r1     // Catch:{ all -> 0x03c7 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03c7 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03c7 }
            r0 = 1
            r11[r0] = r1     // Catch:{ all -> 0x03c7 }
            java.lang.String r0 = "SharedMediaIdsStore/getDisplayNameByUUID"
            android.database.Cursor r11 = r13.A0A(r12, r0, r11)     // Catch:{ all -> 0x03c7 }
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x03bb }
            if (r0 != 0) goto L_0x0383
            r11.close()     // Catch:{ all -> 0x03c7 }
            goto L_0x03ae
        L_0x0383:
            java.lang.String r0 = "display_name"
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03bb }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x03bb }
            r11.close()     // Catch:{ all -> 0x03c7 }
            r14.close()
            goto L_0x03b2
        L_0x0394:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x03b5
            r6[r4] = r1
            int r15 = r4 + 1
            if (r10 != 0) goto L_0x03a9
            r0 = 0
        L_0x03a4:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x03b2
        L_0x03a9:
            long r0 = r10.length()
            goto L_0x03a4
        L_0x03ae:
            r14.close()
            r0 = 0
        L_0x03b2:
            r5[r4] = r0
            r4 = r15
        L_0x03b5:
            int r3 = r3 + 1
            goto L_0x033f
        L_0x03b8:
            r10 = 0
            goto L_0x0338
        L_0x03bb:
            r1 = move-exception
            if (r11 == 0) goto L_0x03c6
            r11.close()     // Catch:{ all -> 0x03c2 }
            goto L_0x03c6
        L_0x03c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03c7 }
        L_0x03c6:
            throw r1     // Catch:{ all -> 0x03c7 }
        L_0x03c7:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x04f0 }
            throw r1
        L_0x03cc:
            java.lang.String[] r3 = new java.lang.String[r4]
            r0 = 0
            java.lang.System.arraycopy(r6, r0, r3, r0, r4)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.System.arraycopy(r5, r0, r1, r0, r4)
        L_0x03d7:
            r0 = 1
            android.database.MatrixCursor r4 = new android.database.MatrixCursor
            r4.<init>(r3, r0)
            r4.addRow(r1)
            return r4
        L_0x03e1:
            java.lang.String r0 = "bucketId"
            java.lang.String r1 = r2.getQueryParameter(r0)
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r3 = r0.A02(r1)
            X.C17960vV.A07(r3)
            java.lang.String r0 = "include"
            java.lang.String r7 = r2.getQueryParameter(r0)
            r5 = 13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r12 = 0
            r9 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r7 == 0) goto L_0x0411
            int r0 = r7.hashCode()
            switch(r0) {
                case -1185250696: goto L_0x04ab;
                case 102340: goto L_0x04bc;
                case 112202875: goto L_0x04d3;
                default: goto L_0x0411;
            }
        L_0x0411:
            X.1W6 r5 = r8.A08
            X.1ST r7 = r8.A06
            java.lang.Integer[] r11 = new java.lang.Integer[r9]
            r11[r12] = r2
            r11[r1] = r4
            r11[r6] = r10
            X.1Cd r0 = r7.A08
            X.1at r10 = r0.get()
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04eb }
            r4.<init>(r9)     // Catch:{ all -> 0x04eb }
            r8 = 0
        L_0x0429:
            r0 = r11[r8]     // Catch:{ all -> 0x04eb }
            int r6 = r0.intValue()     // Catch:{ all -> 0x04eb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04eb }
            r2.<init>()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "'"
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            r2.append(r6)     // Catch:{ all -> 0x04eb }
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x04eb }
            r4.add(r0)     // Catch:{ all -> 0x04eb }
            int r8 = r8 + 1
            if (r8 < r9) goto L_0x0429
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04eb }
            r2.<init>()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "SELECT "
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = X.C209514c.A00     // Catch:{ all -> 0x04eb }
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = " FROM "
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "available_message_view"
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = " WHERE "
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "message_type IN ("
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04eb }
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = " AND "
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "chat_row_id  = ?"
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = " ORDER BY _id DESC"
            r2.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x04eb }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04eb }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x04eb }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x04eb }
            X.1LW r0 = r7.A02     // Catch:{ all -> 0x04eb }
            long r0 = r0.A09(r3)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04eb }
            r2[r12] = r0     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_BY_TYPES"
            android.database.Cursor r1 = r4.A0A(r6, r0, r2)     // Catch:{ all -> 0x04eb }
            r10.close()
            goto L_0x04e4
        L_0x04ab:
            java.lang.String r0 = "images"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0411
            X.1W6 r5 = r8.A08
            X.1ST r0 = r8.A06
            android.database.Cursor r1 = r0.A02(r3, r1)
            goto L_0x04e4
        L_0x04bc:
            java.lang.String r0 = "gif"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0411
            X.1W6 r2 = r8.A08
            X.1ST r0 = r8.A06
            android.database.Cursor r1 = r0.A02(r3, r5)
            r0 = 0
            X.5dH r4 = new X.5dH
            r4.<init>(r1, r0, r3, r2)
            return r4
        L_0x04d3:
            java.lang.String r0 = "video"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0411
            X.1W6 r5 = r8.A08
            X.1ST r0 = r8.A06
            android.database.Cursor r1 = r0.A02(r3, r9)
        L_0x04e4:
            r0 = 0
            X.5dH r4 = new X.5dH
            r4.<init>(r1, r0, r3, r5)
            return r4
        L_0x04eb:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x04f0 }
            throw r1
        L_0x04f0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x04f5:
            X.1M9 r3 = r8.A02
            X.1Me r2 = r8.A03
            X.1Nd r1 = r8.A04
            X.5dG r0 = new X.5dG
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    private MatrixCursor A03(Uri uri, File file, String str, String[] strArr) {
        int i;
        try {
            A07(uri, file);
            if (strArr == null) {
                strArr = A0E;
            }
            String[] strArr2 = new String[r7];
            Object[] objArr = new Object[r7];
            int i2 = 0;
            for (String str2 : strArr) {
                if ("_display_name".equals(str2)) {
                    strArr2[i2] = "_display_name";
                    i = i2 + 1;
                    objArr[i2] = str;
                } else if ("_size".equals(str2)) {
                    strArr2[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(file.length());
                }
                i2 = i;
            }
            String[] strArr3 = new String[i2];
            System.arraycopy(strArr2, 0, strArr3, 0, i2);
            Object[] objArr2 = new Object[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
            matrixCursor.addRow(objArr2);
            return matrixCursor;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private void A07(Uri uri, File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("File not found for uri: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        } else if (file.lastModified() < AnonymousClass11P.A01(this.A05) - 3600000) {
            file.delete();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File expired for uri: ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A09();
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        Cursor A0A2;
        String str;
        A09();
        switch (A02().match(uri)) {
            case 1:
                return A0C;
            case 2:
                return A0D;
            case 3:
                C32211gp r0 = this.A07;
                String lastPathSegment = uri.getLastPathSegment();
                C28781at A052 = r0.A00.get();
                try {
                    A0A2 = ((C28801av) A052).A02.A0A("SELECT mime_type FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", "SharedMediaIdsStore/getMimeTypeByUUID", new String[]{lastPathSegment, String.valueOf(System.currentTimeMillis())});
                    if (!A0A2.moveToNext()) {
                        A0A2.close();
                        A052.close();
                        str = null;
                    } else {
                        str = A0A2.getString(A0A2.getColumnIndexOrThrow("mime_type"));
                        A0A2.close();
                        A052.close();
                    }
                    if (str == null) {
                        return "application/octet-stream";
                    }
                    return str;
                } catch (Throwable th) {
                    try {
                        A052.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
            case 16:
            case 18:
                return "application/zip";
            case 5:
            case 12:
                return "text/plain";
            case 8:
                return "image/jpeg";
            case 17:
                return "text/csv";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown URI ");
                sb.append(uri);
                throw new IllegalArgumentException(sb.toString());
        }
        throw th;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A09();
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        File file;
        File file2;
        String str2;
        byte[] A012;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        int i;
        A09();
        switch (A02().match(uri)) {
            case 3:
                A09();
                int A013 = A01(str);
                String A002 = this.A07.A00(uri.getLastPathSegment());
                if (A002 != null) {
                    file = new File(A002);
                } else {
                    file = null;
                }
                if (file != null) {
                    try {
                        this.A09.A06(file);
                        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, A013);
                        try {
                            this.A09.A05(open);
                            return open;
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("mediaprovider/ parcel file descriptor is not external for uri: ");
                            sb.append(uri);
                            Log.e(sb.toString(), e);
                            throw new FileNotFoundException();
                        }
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("mediaprovider/ file is not external for uri: ");
                        sb2.append(uri);
                        Log.e(sb2.toString(), e2);
                        throw new FileNotFoundException();
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("mediaprovider/openMessageFile no file found for uri: ");
                    sb3.append(uri);
                    Log.e(sb3.toString());
                    throw new FileNotFoundException();
                }
            case 4:
            case 13:
            case 18:
                String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter != null) {
                    file2 = this.A01.A0Y(queryParameter);
                    break;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("File not found for uri: ");
                    sb4.append(uri);
                    throw new FileNotFoundException(sb4.toString());
                }
            case 5:
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    file2 = this.A01.A0U(lastPathSegment);
                    break;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("File not found for uri: ");
                    sb5.append(uri);
                    throw new FileNotFoundException(sb5.toString());
                }
            case 6:
                str2 = "personal";
                break;
            case 7:
                String queryParameter2 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter2 != null) {
                    file2 = this.A01.A0W(queryParameter2);
                    break;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("File not found for uri: ");
                    sb6.append(uri);
                    throw new FileNotFoundException(sb6.toString());
                }
            case 8:
                A09();
                if (str.equals("r")) {
                    String lastPathSegment2 = uri.getLastPathSegment();
                    if (lastPathSegment2 != null) {
                        String A003 = this.A07.A00(lastPathSegment2);
                        if (!TextUtils.isEmpty(A003)) {
                            try {
                                AnonymousClass206 A032 = this.A08.A01.A03(Long.parseLong(A003));
                                if (A032 == null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Failed to get message for uri - ");
                                    sb7.append(uri);
                                    Log.e(sb7.toString());
                                    throw new FileNotFoundException();
                                } else if (A032 instanceof AnonymousClass21L) {
                                    C693336u A0O = A032.A0O();
                                    if (A0O != null) {
                                        if (A032.A13() != null) {
                                            A012 = A032.A13();
                                        } else {
                                            if (C18070vi.A09(A032, C693336u.class).A03) {
                                                A012 = A0O.A01();
                                            }
                                            Log.e("Message thumbnail has empty bytes");
                                            throw new FileNotFoundException();
                                        }
                                        if (A012 != null) {
                                            try {
                                                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                                                try {
                                                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                                                    Bitmap bitmap = AnonymousClass204.A0C(new AnonymousClass25O(8000, 8000), A012).A02;
                                                    if (bitmap != null) {
                                                        if (A032 instanceof AnonymousClass21K) {
                                                            C17960vV.A07(A032);
                                                            C20285AEt BPK = ((AnonymousClass21K) A032).BPK();
                                                            if (BPK != null && ((i = BPK.A00) == 2 || i == 6)) {
                                                                FilterUtils.A02(5, bitmap);
                                                            }
                                                        }
                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, autoCloseOutputStream);
                                                        bitmap.recycle();
                                                        autoCloseOutputStream.flush();
                                                        autoCloseOutputStream.close();
                                                        return createPipe[0];
                                                    }
                                                    Log.e("Can't decode thumbnail bytes");
                                                    throw new FileNotFoundException();
                                                } catch (Exception unused) {
                                                    ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                                                    if (parcelFileDescriptor != null) {
                                                        try {
                                                            parcelFileDescriptor.close();
                                                        } catch (IOException unused2) {
                                                        }
                                                    }
                                                    throw new FileNotFoundException();
                                                } catch (Throwable th) {
                                                    AnonymousClass0DT.A00(th, th);
                                                    break;
                                                }
                                            } catch (IOException e3) {
                                                Log.e("Failed to create parcel file descriptor pipe", e3);
                                                throw new FileNotFoundException();
                                            }
                                        }
                                        Log.e("Message thumbnail has empty bytes");
                                        throw new FileNotFoundException();
                                    }
                                    Log.e("Message has null thumbnail");
                                    throw new FileNotFoundException();
                                } else {
                                    Log.e("Message is not allowed type for getting thumbnail");
                                    throw new FileNotFoundException();
                                }
                            } catch (NumberFormatException unused3) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("Invalid message id format - ");
                                sb8.append(A003);
                                Log.e(sb8.toString());
                                throw new FileNotFoundException();
                            }
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("Invalid record for uuid ");
                            sb9.append(lastPathSegment2);
                            Log.e(sb9.toString());
                            throw new FileNotFoundException();
                        }
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("Failed to get uuid for uri - ");
                        sb10.append(uri);
                        Log.e(sb10.toString());
                        throw new FileNotFoundException();
                    }
                } else {
                    Log.e("Invalid access mode for openMessageThumbnail - only read allowed");
                    throw new FileNotFoundException();
                }
            case 9:
                throw new FileNotFoundException();
            case 10:
                String queryParameter3 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter3 != null) {
                    file2 = this.A01.A0Z(queryParameter3);
                    break;
                } else {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("File not found for uri: ");
                    sb11.append(uri);
                    throw new FileNotFoundException(sb11.toString());
                }
            case 11:
                str2 = "business";
                break;
            case 12:
                throw new FileNotFoundException();
            case 16:
                String lastPathSegment3 = uri.getLastPathSegment();
                if (lastPathSegment3 != null) {
                    file2 = this.A01.A0T(lastPathSegment3);
                    break;
                } else {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append("File not found for uri: ");
                    sb12.append(uri);
                    throw new FileNotFoundException(sb12.toString());
                }
            case 17:
                String lastPathSegment4 = uri.getLastPathSegment();
                if (lastPathSegment4 != null) {
                    file2 = this.A01.A0V(lastPathSegment4);
                    break;
                } else {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("File not found for uri: ");
                    sb13.append(uri);
                    throw new FileNotFoundException(sb13.toString());
                }
            default:
                throw new FileNotFoundException();
        }
        String queryParameter4 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter4 != null) {
            file2 = this.A01.A0e(queryParameter4, str2);
            A07(uri, file2);
            return ParcelFileDescriptor.open(file2, A01(str));
        }
        StringBuilder sb14 = new StringBuilder();
        sb14.append("File not found for uri: ");
        sb14.append(uri);
        throw new FileNotFoundException(sb14.toString());
        throw th;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A09();
        throw new UnsupportedOperationException();
    }
}
