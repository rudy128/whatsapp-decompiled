package com.whatsapp.instrumentation.api;

import X.AnonymousClass18O;
import X.AnonymousClass1CM;
import X.AnonymousClass1HY;
import X.AnonymousClass1TM;
import X.C19680yj;
import X.C37011op;
import X.C53492cc;
import X.C60012nF;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;

public class InstrumentationProvider extends C19680yj {
    public AnonymousClass1TM A00;
    public C53492cc A01;
    public AnonymousClass1HY A02;
    public C37011op A03;
    public AnonymousClass1CM A04;

    public String getType(Uri uri) {
        return null;
    }

    private C60012nF A01(Uri uri) {
        A09();
        if (this.A00.A00.A09(AnonymousClass18O.A0G)) {
            C60012nF A002 = this.A03.A00();
            A002.A00();
            if (this.A04.A04()) {
                synchronized (this.A00) {
                }
                if (Binder.getCallingUid() != Process.myUid()) {
                    AnonymousClass1HY r3 = this.A02;
                    String string = AnonymousClass1HY.A00(r3).getString(AnonymousClass1HY.A01(A002.A01, "auth/token"), (String) null);
                    String queryParameter = uri.getQueryParameter("authorization_token");
                    if (!TextUtils.isEmpty(string) && string.equals(queryParameter)) {
                        return A002;
                    }
                    throw new SecurityException("Access denied: auth token is missing");
                }
                throw new SecurityException("Access checks is executed outside of binder context.");
            }
            throw new SecurityException("WhatsApp is not active.");
        }
        throw new SecurityException("Feature is disabled.");
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, Bundle bundle) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        A01(uri);
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        if (((java.util.regex.Pattern) X.C62012qe.A03.get()).matcher(r1).matches() != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a3, code lost:
        if ((!r10.A06.A0J((com.whatsapp.jid.GroupJid) r1)) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b7, code lost:
        if (android.text.TextUtils.isEmpty(r10.A03.A0H(r12, false).A01) == false) goto L_0x01b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r36, java.lang.String[] r37, java.lang.String r38, java.lang.String[] r39, java.lang.String r40) {
        /*
            r35 = this;
            r0 = r35
            r3 = r36
            X.2nF r30 = r0.A01(r3)
            X.2cc r2 = r0.A01
            android.content.UriMatcher r0 = r2.A00
            int r1 = r0.match(r3)
            r0 = 1
            if (r1 != r0) goto L_0x027c
            X.00H r0 = r2.A01
            java.lang.Object r10 = r0.get()
            X.2sa r10 = (X.C63142sa) r10
            java.lang.String r9 = "restoring_calling_identity"
            java.util.concurrent.atomic.AtomicInteger r0 = X.C63142sa.A0J
            int r8 = r0.incrementAndGet()
            X.19T r7 = r10.A0H
            r6 = 494352396(0x1d77380c, float:3.2719153E-21)
            r5 = 0
            r7.Bj1(r6, r8, r5)
            long r16 = android.os.Binder.clearCallingIdentity()
            java.lang.String r0 = "identity_cleared"
            r7.markerPoint((int) r6, (int) r8, (java.lang.String) r0)
            X.1TM r15 = r10.A09     // Catch:{ all -> 0x0259 }
            X.0ve r4 = r15.A01     // Catch:{ all -> 0x0259 }
            r0 = 11345(0x2c51, float:1.5898E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ all -> 0x0259 }
            boolean r2 = X.C18020vd.A05(r3, r4, r0)     // Catch:{ all -> 0x0259 }
            r0 = 12646(0x3166, float:1.7721E-41)
            boolean r1 = X.C18020vd.A05(r3, r4, r0)     // Catch:{ all -> 0x0259 }
            if (r2 != 0) goto L_0x0054
            if (r1 != 0) goto L_0x0054
            java.util.Set r33 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0259 }
            java.util.List r32 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0259 }
            goto L_0x006a
        L_0x0054:
            X.1Nb r2 = r10.A0I     // Catch:{ all -> 0x0259 }
            r0 = 1
            java.util.Map r0 = X.AnonymousClass1Nb.A05(r2, r0)     // Catch:{ all -> 0x0259 }
            java.util.Set r33 = r0.keySet()     // Catch:{ all -> 0x0259 }
            X.1xG r0 = r10.A07     // Catch:{ all -> 0x0259 }
            java.util.List r32 = r0.A02()     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "favorites_and_pinned_collected"
            r7.markerPoint((int) r6, (int) r8, (java.lang.String) r0)     // Catch:{ all -> 0x0259 }
        L_0x006a:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0259 }
            r14.<init>()     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            X.1M9 r0 = r10.A02     // Catch:{ all -> 0x0259 }
            X.1M2 r0 = r0.A04     // Catch:{ all -> 0x0259 }
            java.util.ArrayList r19 = r0.A0L()     // Catch:{ all -> 0x0259 }
            goto L_0x0095
        L_0x007b:
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x0259 }
            r19.<init>()     // Catch:{ all -> 0x0259 }
            X.1M9 r0 = r10.A02     // Catch:{ all -> 0x0259 }
            X.1M2 r0 = r0.A04     // Catch:{ all -> 0x0259 }
            r20 = 3
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            r21 = r5
            r18 = r0
            X.AnonymousClass1M2.A0C(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0259 }
        L_0x0095:
            java.lang.String r0 = "db_read_end"
            r7.markerPoint((int) r6, (int) r8, (java.lang.String) r0)     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "optimised_db_read"
            r7.markerAnnotate((int) r6, (int) r8, (java.lang.String) r0, (boolean) r1)     // Catch:{ all -> 0x0259 }
            java.util.Iterator r18 = r19.iterator()     // Catch:{ all -> 0x0259 }
        L_0x00a3:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x01be
            java.lang.Object r12 = r18.next()     // Catch:{ all -> 0x0259 }
            X.1E7 r12 = (X.AnonymousClass1E7) r12     // Catch:{ all -> 0x0259 }
            if (r12 == 0) goto L_0x00a3
            java.lang.Class<X.1BI> r11 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r2 = r12.A06(r11)     // Catch:{ all -> 0x0259 }
            X.1BI r2 = (X.AnonymousClass1BI) r2     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x010e
            X.2qe r1 = r10.A0G     // Catch:{ all -> 0x0259 }
            X.1TM r0 = r1.A01     // Catch:{ all -> 0x0259 }
            X.18O r13 = r0.A00     // Catch:{ all -> 0x0259 }
            X.18Q r0 = X.AnonymousClass18O.A0o     // Catch:{ all -> 0x0259 }
            int r13 = r13.A04(r0)     // Catch:{ all -> 0x0259 }
            r0 = 20
            if (r13 == r0) goto L_0x015d
            boolean r0 = X.C22971Dz.A0e(r2)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x0145
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR     // Catch:{ all -> 0x0259 }
            X.1EC r0 = X.C42941yz.A00(r2)     // Catch:{ all -> 0x0259 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0259 }
            X.1MZ r1 = r1.A00     // Catch:{ all -> 0x0259 }
            X.1MW r1 = r1.A08     // Catch:{ all -> 0x0259 }
            X.2tp r0 = r1.A0C(r0)     // Catch:{ all -> 0x0259 }
            X.10f r0 = r0.A0C()     // Catch:{ all -> 0x0259 }
            X.1IZ r13 = r0.iterator()     // Catch:{ all -> 0x0259 }
        L_0x00ea:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0259 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x0259 }
            java.lang.String r1 = X.AnonymousClass17K.A03(r0)     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x010e
            X.00H r0 = X.C62012qe.A03     // Catch:{ all -> 0x0259 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0259 }
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0     // Catch:{ all -> 0x0259 }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ all -> 0x0259 }
            boolean r0 = r0.matches()     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x00ea
        L_0x010e:
            X.0ve r1 = r10.A08     // Catch:{ all -> 0x0259 }
            r0 = 5470(0x155e, float:7.665E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x00a3
            X.0zA r0 = r10.A00     // Catch:{ all -> 0x0259 }
            java.lang.Object r0 = r0.A04()     // Catch:{ all -> 0x0259 }
            X.1PW r0 = (X.AnonymousClass1PW) r0     // Catch:{ all -> 0x0259 }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r12.A06(r1)     // Catch:{ all -> 0x0259 }
            X.1BI r1 = (X.AnonymousClass1BI) r1     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r0.A08()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x00a3
            boolean r0 = X.C42701yb.A01(r1)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x00a3
            X.1CJ r0 = r10.A05     // Catch:{ all -> 0x0259 }
            java.util.Set r0 = r0.A0I()     // Catch:{ all -> 0x0259 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x01b9
        L_0x0145:
            java.lang.String r1 = X.AnonymousClass17K.A03(r2)     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x010e
            X.00H r0 = X.C62012qe.A03     // Catch:{ all -> 0x0259 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0259 }
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0     // Catch:{ all -> 0x0259 }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ all -> 0x0259 }
            boolean r0 = r0.matches()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x010e
        L_0x015d:
            com.whatsapp.jid.Jid r0 = r12.A06(r11)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x010e
            boolean r0 = X.C22971Dz.A0V(r2)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x010e
            boolean r0 = X.C42701yb.A01(r2)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x010e
            boolean r0 = r12.A10     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x010e
            X.1BI r0 = r12.A0J     // Catch:{ all -> 0x0259 }
            boolean r0 = X.C22971Dz.A0N(r0)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x010e
            X.11S r1 = r10.A01     // Catch:{ all -> 0x0259 }
            X.1BI r0 = r12.A0J     // Catch:{ all -> 0x0259 }
            boolean r0 = r1.A0O(r0)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x010e
            X.1BI r0 = r12.A0J     // Catch:{ all -> 0x0259 }
            boolean r0 = X.C22971Dz.A0K(r0)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x010e
            boolean r0 = r12.A0F()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x01a5
            X.1BI r1 = r12.A0J     // Catch:{ all -> 0x0259 }
            boolean r0 = r1 instanceof X.AnonymousClass1EC     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x01a5
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1     // Catch:{ all -> 0x0259 }
            X.1MZ r0 = r10.A06     // Catch:{ all -> 0x0259 }
            boolean r0 = r0.A0J(r1)     // Catch:{ all -> 0x0259 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x010e
        L_0x01a5:
            boolean r0 = X.C83804Gs.A00(r12)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x010e
            X.1Me r0 = r10.A03     // Catch:{ all -> 0x0259 }
            X.1yg r0 = r0.A0H(r12, r5)     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0259 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x010e
        L_0x01b9:
            r14.add(r12)     // Catch:{ all -> 0x0259 }
            goto L_0x00a3
        L_0x01be:
            java.lang.String r2 = "contact_count"
            int r1 = r14.size()     // Catch:{ all -> 0x0259 }
            r0 = 10
            if (r1 >= r0) goto L_0x01de
            java.lang.String r0 = "<10"
        L_0x01ca:
            r7.markerAnnotate((int) r6, (int) r8, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0259 }
            java.lang.String r11 = "is_linked_with_sg"
            X.1HY r13 = r10.A0F     // Catch:{ all -> 0x0259 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "com.facebook.stella"
            r3[r5] = r0     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "com.facebook.stella_debug"
            r12 = 1
            r3[r12] = r0     // Catch:{ all -> 0x0259 }
            goto L_0x01ef
        L_0x01de:
            r0 = 100
            if (r1 >= r0) goto L_0x01e5
            java.lang.String r0 = "<100"
            goto L_0x01ca
        L_0x01e5:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r0) goto L_0x01ec
            java.lang.String r0 = "<1000"
            goto L_0x01ca
        L_0x01ec:
            java.lang.String r0 = ">=1000"
            goto L_0x01ca
        L_0x01ef:
            r5 = 2
            r2 = 0
        L_0x01f1:
            r1 = r3[r2]     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "auth/token"
            java.lang.String r1 = X.AnonymousClass1HY.A01(r1, r0)     // Catch:{ all -> 0x0259 }
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r13)     // Catch:{ all -> 0x0259 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x0208
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x01f1
            r12 = 0
        L_0x0208:
            r7.markerAnnotate((int) r6, (int) r8, (java.lang.String) r11, (boolean) r12)     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "filtered_list_prepared"
            r7.markerPoint((int) r6, (int) r8, (java.lang.String) r0)     // Catch:{ all -> 0x0259 }
            r0 = 5340(0x14dc, float:7.483E-42)
            r4.A0N(r0)     // Catch:{ all -> 0x0259 }
            X.0zA r0 = r10.A00     // Catch:{ all -> 0x0259 }
            java.lang.Object r11 = r0.A04()     // Catch:{ all -> 0x0259 }
            X.1PW r11 = (X.AnonymousClass1PW) r11     // Catch:{ all -> 0x0259 }
            X.1Me r12 = r10.A03     // Catch:{ all -> 0x0259 }
            X.1Lr r6 = r10.A04     // Catch:{ all -> 0x0259 }
            X.9yB r4 = r10.A0A     // Catch:{ all -> 0x0259 }
            X.9lE r3 = r10.A0B     // Catch:{ all -> 0x0259 }
            X.9xm r2 = r10.A0C     // Catch:{ all -> 0x0259 }
            X.2qe r1 = r10.A0G     // Catch:{ all -> 0x0259 }
            X.A0q r0 = r10.A0D     // Catch:{ all -> 0x0259 }
            X.1TN r10 = r10.A0E     // Catch:{ all -> 0x0259 }
            X.8CD r18 = new X.8CD     // Catch:{ all -> 0x0259 }
            r34 = r37
            r19 = r11
            r20 = r12
            r21 = r6
            r22 = r15
            r23 = r4
            r24 = r3
            r25 = r2
            r26 = r0
            r27 = r10
            r28 = r1
            r29 = r7
            r31 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0259 }
            r0 = 494352396(0x1d77380c, float:3.2719153E-21)
            r7.markerPoint((int) r0, (int) r8, (java.lang.String) r9)
            android.os.Binder.restoreCallingIdentity(r16)
            r7.markerEnd(r0, r8, r5)
            return r18
        L_0x0259:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x026c
            java.lang.String r2 = "error"
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x026d }
            r0 = 494352396(0x1d77380c, float:3.2719153E-21)
            r7.markerAnnotate((int) r0, (int) r8, (java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x026d }
        L_0x026c:
            throw r3     // Catch:{ all -> 0x026d }
        L_0x026d:
            r2 = move-exception
            r1 = 494352396(0x1d77380c, float:3.2719153E-21)
            r7.markerPoint((int) r1, (int) r8, (java.lang.String) r9)
            android.os.Binder.restoreCallingIdentity(r16)
            r0 = 3
            r7.markerEnd(r1, r8, r0)
            throw r2
        L_0x027c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Access denied to "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.api.InstrumentationProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A01(uri);
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
