package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1kd  reason: invalid class name and case insensitive filesystem */
public class C34531kd {
    public final AnonymousClass1T1 A00;
    public final C218617r A01;
    public final AnonymousClass1KB A02;
    public final C33251iW A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final AnonymousClass1KW A06;
    public final C18030ve A07;
    public final C25931Qe A08;
    public final C26421Sb A09;
    public final C34501ka A0A;
    public final C25291Nq A0B;
    public final C32861hs A0C;
    public final WamediaManager A0D;
    public final C18010vc A0E;
    public final C26631Sw A0F;
    public final AnonymousClass10I A0G;
    public final C34481kY A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass1PM A0K;
    public final AnonymousClass11C A0L;
    public final AnonymousClass121 A0M;
    public final C24681Lg A0N;
    public final AnonymousClass18K A0O;
    public final C26521Sl A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;

    public void A07(AnonymousClass21V r4) {
        C62572rc r1 = r4.A02;
        if (!r4.A1F() || !(r1 == null || r1.A0G == null)) {
            A08(r4, true, true);
        } else {
            ((C203911y) this.A0R.get()).A01(r4);
        }
        this.A0N.A02(r4, -1);
    }

    public boolean A0A(C72433Ly r17, C1409573s r18, AnonymousClass206 r19, C692236j r20, File file, String str, List list, int i, int i2, boolean z) {
        byte[] bArr;
        Log.i("SendMedia/sendMediaFile - send video");
        C62572rc r5 = new C62572rc();
        File file2 = file;
        r5.A0G = file2;
        if (file == null) {
            return false;
        }
        C1409573s r4 = r18;
        if (r18 == null) {
            bArr = C1408873l.A04(file2);
        } else {
            Bitmap A012 = C1408873l.A01(file2);
            if (A012 == null || (!A012.isMutable() && (A012 = A012.copy(Bitmap.Config.ARGB_8888, true)) == null)) {
                bArr = null;
            } else {
                r4.A08(A012, 0, false, false);
                bArr = C1408873l.A03(A012, 100);
            }
            String str2 = r4.A03;
            if (str2 == null) {
                String A0K2 = C26511Sk.A0K();
                r5.A0K = A0K2;
                if (!r4.A0C(C26511Sk.A0H(this.A01, A0K2))) {
                    return false;
                }
            } else {
                r5.A0K = str2;
            }
        }
        this.A02.CGP(new AnonymousClass3CZ(r5, r17, this, r19, r20, str, list, bArr, i, i2, z));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(X.AnonymousClass206 r26, X.C26551So r27, X.C692236j r28, java.io.File r29, java.lang.String r30, java.util.List r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            r25 = this;
            r13 = 0
            r8 = r29
            if (r29 == 0) goto L_0x0071
            r3 = r25
            X.0ve r9 = r3.A07
            X.118 r0 = r3.A04
            android.content.Context r7 = r0.A00
            X.0vb r6 = r3.A05
            X.1KB r2 = r3.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaFileUtils/checkMediaFileSize src:"
            r1.append(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3660(0xe4c, float:5.129E-42)
            X.0vf r1 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r1, r9, r0)
            X.1So r0 = X.C26551So.A0B
            r5 = r27
            if (r5 != r0) goto L_0x0073
            r0 = 542(0x21e, float:7.6E-43)
        L_0x0039:
            int r4 = X.C18020vd.A00(r1, r9, r0)
        L_0x003d:
            long r11 = r8.length()
            long r0 = (long) r4
            r9 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r9
            int r9 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0097
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MediaFileUtils/checkMediaFileSize/too large:"
            r3.append(r0)
            long r0 = r8.length()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r10 = 11
            X.3Cs r0 = new X.3Cs
            r11 = r33
            r5 = r0
            r8 = r2
            r9 = r4
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (int) r9, (int) r10, (boolean) r11)
            r2.A0J(r0)
        L_0x0071:
            r0 = 0
            return r0
        L_0x0073:
            X.1So r0 = X.C26551So.A0q
            if (r5 != r0) goto L_0x007a
            r0 = 3185(0xc71, float:4.463E-42)
            goto L_0x0039
        L_0x007a:
            X.1So r0 = X.C26551So.A0d
            if (r5 != r0) goto L_0x0081
            r0 = 4155(0x103b, float:5.822E-42)
            goto L_0x0039
        L_0x0081:
            X.1So r0 = X.C26551So.A05
            if (r5 == r0) goto L_0x0094
            X.1So r0 = X.C26551So.A0S
            if (r5 == r0) goto L_0x0094
            X.1So r0 = X.C26551So.A04
            if (r5 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0U
            if (r5 != r0) goto L_0x003d
        L_0x0091:
            r0 = 3656(0xe48, float:5.123E-42)
            goto L_0x0039
        L_0x0094:
            r0 = 3657(0xe49, float:5.125E-42)
            goto L_0x0039
        L_0x0097:
            java.lang.String r0 = "SendMedia/sendMediaFile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r34 != 0) goto L_0x00e9
            r1 = r8
        L_0x009f:
            X.2rc r14 = new X.2rc
            r14.<init>()
            r14.A0G = r1
            boolean r0 = X.C63972u0.A09(r5)
            if (r0 == 0) goto L_0x00e7
            byte[] r6 = X.C1408873l.A04(r1)
            if (r6 != 0) goto L_0x00b7
            java.lang.String r0 = "SendMedia/sendMediaFile no video thumbnail generated"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00b7:
            X.1Sb r12 = r3.A09
            int r0 = r5.A00
            r22 = 0
            r20 = r13
            r15 = r26
            r16 = r28
            r17 = r30
            r18 = r31
            r24 = r35
            r19 = r13
            r23 = r22
            r21 = r0
            X.2tS r1 = r12.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r32
            r1.A00 = r0
            r9 = 21
            X.Aix r0 = new X.Aix
            r4 = r0
            r5 = r3
            r7 = r1
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A0J(r0)
            r0 = 1
            return r0
        L_0x00e7:
            r6 = 0
            goto L_0x00b7
        L_0x00e9:
            X.17r r4 = r3.A01
            X.0vc r1 = r3.A0E
            r0 = 0
            java.io.File r1 = X.C26511Sk.A0E(r4, r1, r5, r8, r0)
            java.lang.String r0 = "SendMedia/sendMediaFile - sending hidden file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A0i(r8, r1)
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34531kd.A0B(X.206, X.1So, X.36j, java.io.File, java.lang.String, java.util.List, int, boolean, boolean, boolean):boolean");
    }

    public static byte[] A03(Uri uri, C34531kd r3) {
        Bitmap A0h = r3.A0P.A0h(uri, 100, 100);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A0h.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        A0h.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public C52642bF A04(Uri uri, AnonymousClass85B r30, AnonymousClass206 r31, C692236j r32, Integer num, Long l, String str, String str2, List list, List list2, List list3, Map map, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C62572rc r7 = new C62572rc();
        String str3 = str2;
        if (!TextUtils.isEmpty(str3)) {
            r7.A0H = str3;
        }
        C26421Sb r5 = this.A09;
        int i4 = 1;
        if (z3) {
            i4 = 42;
        }
        List list4 = list2;
        List list5 = list;
        String str4 = str;
        C692236j r9 = r32;
        AnonymousClass206 r8 = r31;
        Uri uri2 = uri;
        C63642tS A042 = r5.A04(uri2, r7, r8, r9, str4, list5, list4, list3, i4, i, i2, z);
        A042.A00 = i3;
        Map map2 = map;
        boolean z6 = z5;
        boolean z7 = z4;
        Long l2 = l;
        boolean z8 = z2;
        AnonymousClass85B r82 = r30;
        Integer num2 = num;
        if (C18020vd.A05(C18040vf.A02, this.A07, 10537)) {
            C52642bF r92 = new C52642bF();
            C21132Af0 af0 = new C21132Af0();
            this.A0G.CGF(new C27081DTg(af0, this, uri2, 47));
            af0.A09(new C70213Ae(this, r82, r92, A042, num2, l2, map2, z8, z7, z6));
            return r92;
        }
        return C33251iW.A04(this.A03, r82, (AnonymousClass21V) null, A042, num2, l2, map2, A03(uri2, this), z8, z7, z6);
    }

    public void A06(Uri uri, AnonymousClass1FR r25, AnonymousClass206 r26, File file, String str, List list, List list2, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("SendMedia/sendDocumentAsync/jids: ");
        List list3 = list;
        sb.append(Arrays.deepToString(list3.toArray()));
        Log.i(sb.toString());
        AnonymousClass10I r1 = this.A0G;
        C18030ve r11 = this.A07;
        AnonymousClass1KB r6 = this.A02;
        AnonymousClass118 r9 = this.A04;
        C218617r r5 = this.A01;
        AnonymousClass18K r12 = this.A0O;
        C26521Sl r0 = this.A0P;
        Uri uri2 = uri;
        AnonymousClass1FR r4 = r25;
        r1.CGD(new C49202Po(uri2, r4, r5, r6, this.A03, this.A0L, r9, this.A05, r11, r12, this.A09, r26, (C62272r8) this.A0Q.get(), r0, file, str, list3, list2, i, z), new Void[0]);
    }

    public void A08(AnonymousClass21V r4, boolean z, boolean z2) {
        C62572rc r1;
        if (r4 != null && (r1 = r4.A02) != null) {
            if (z && !r1.A0Q) {
                r1.A0Q = true;
                this.A0M.CQx(r4, -1);
            }
            A09(new C63642tS(Collections.singletonList(r4), 1), z, z2);
        }
    }

    public void A09(C63642tS r11, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        C63642tS r6 = r11;
        Iterator it = C29431cG.A0t(r11.A03).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass206 r2 = (AnonymousClass206) it.next();
            C32861hs r1 = this.A0C;
            if ((r2 instanceof AnonymousClass21V) && r1.A04(C32861hs.A00(r1, (AnonymousClass21V) r2)) != null) {
                arrayList.add(r2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("SendMedia/retryMediaUpload/already-uploading ");
            AnonymousClass205 r12 = ((AnonymousClass206) it2.next()).A0v;
            sb.append(r12);
            Log.i(sb.toString());
            r11.A03(r12);
        }
        if (r11.A06()) {
            Log.i("SendMedia/retryMediaUpload/nothing-to-upload");
            return;
        }
        this.A0G.CGF(new C70753Cj(this, r6, 1, z2, z));
    }

    public C34531kd(AnonymousClass1T1 r2, C218617r r3, AnonymousClass1KB r4, C33251iW r5, AnonymousClass1PM r6, AnonymousClass11C r7, AnonymousClass118 r8, C18000vb r9, AnonymousClass121 r10, C24681Lg r11, AnonymousClass1KW r12, C18030ve r13, AnonymousClass18K r14, C25931Qe r15, C26421Sb r16, C34501ka r17, C25291Nq r18, C32861hs r19, WamediaManager wamediaManager, C18010vc r21, C26631Sw r22, C26521Sl r23, AnonymousClass10I r24, C34481kY r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30) {
        this.A00 = r2;
        this.A0B = r18;
        Boolean bool = C17960vV.A01;
        this.A07 = r13;
        this.A02 = r4;
        this.A04 = r8;
        this.A0G = r24;
        this.A01 = r3;
        this.A0O = r14;
        this.A06 = r12;
        this.A03 = r5;
        this.A0H = r25;
        this.A09 = r16;
        this.A0I = r26;
        this.A0Q = r27;
        this.A0P = r23;
        this.A0L = r7;
        this.A0D = wamediaManager;
        this.A05 = r9;
        this.A0M = r10;
        this.A0N = r11;
        this.A0A = r17;
        this.A0R = r28;
        this.A0K = r6;
        this.A0F = r22;
        this.A08 = r15;
        this.A0C = r19;
        this.A0E = r21;
        this.A0J = r29;
        this.A0S = r30;
    }

    public static void A01(Context context, AnonymousClass1FR r6, C72433Ly r7, C34531kd r8, C692236j r9, String str, ArrayList arrayList, ArrayList arrayList2, List list, int i, boolean z) {
        AnonymousClass77K r0;
        if (!arrayList.isEmpty()) {
            r8.A02(r6, r7, arrayList2, list);
            C139416yo r1 = new C139416yo(context);
            r1.A0I = arrayList;
            r1.A0G = str;
            r1.A0H = C22971Dz.A0B(list);
            r1.A01 = 5;
            r1.A0P = true;
            if (list.size() > 1) {
                r1.A0U = true;
            }
            if (!(C22971Dz.A01(list) == null || r9 == null || (r0 = r9.A03) == null)) {
                r1.A09 = r0;
            }
            r1.A02 = i;
            r1.A0M = z;
            context.startActivity(r1.A01());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7.C9f((Uri) it.next());
            }
        } else if (!arrayList2.isEmpty()) {
            AnonymousClass1PM r4 = r8.A0K;
            int size = arrayList2.size();
            C18070vi.A0d(r4, 0);
            C18070vi.A0d(list, 2);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!AnonymousClass747.A04(r4, (AnonymousClass1BI) it2.next(), size)) {
                    r8.A02(r6, r7, arrayList2, list);
                    return;
                }
            }
            Uri uri = (Uri) arrayList2.get(0);
            r8.A0S.get();
            Intent putExtra = new Intent().setClassName(context.getPackageName(), "com.whatsapp.documentpicker.DocumentPreviewActivity").putExtra("jids", C22971Dz.A0B(list)).putExtra("uri", uri).putExtra("send", true ^ r7.BE8()).putExtra("handle_redirects", z);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(putExtra, 36);
            }
            r7.C9f(uri);
        } else if (list.size() > 1) {
            r8.A0S.get();
            context.startActivity(AnonymousClass1LU.A02(context));
        }
    }

    private void A02(AnonymousClass1FR r15, C72433Ly r16, ArrayList arrayList, List list) {
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            A06(uri, r15, (AnonymousClass206) null, (File) null, (String) null, list, (List) null, size, false);
            this.A02.CGP(new C70713Cf(r16, uri, 48));
        }
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.3LO] */
    /* JADX WARNING: type inference failed for: r22v5, types: [X.7N8] */
    /* JADX WARNING: type inference failed for: r22v6, types: [X.3AP] */
    /* JADX WARNING: type inference failed for: r22v7, types: [X.7N8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r20, android.net.Uri r21, X.AnonymousClass1FR r22, X.C72433Ly r23, X.C34531kd r24, X.C692236j r25, java.lang.String r26, java.util.ArrayList r27, java.util.ArrayList r28, java.util.List r29, int r30, int r31, int r32, boolean r33, boolean r34) {
        /*
            r5 = r27
            r2 = 0
            r8 = 0
            r0 = 1
            r7 = r21
            r3 = r23
            r6 = r24
            r10 = r25
            r13 = r26
            r15 = r29
            r1 = r30
            r19 = r31
            r21 = r32
            if (r1 == r0) goto L_0x00a6
            r0 = 2
            r23 = r20
            r4 = r22
            if (r1 == r0) goto L_0x0069
            r0 = 3
            if (r1 == r0) goto L_0x004f
            r0 = 4
            if (r1 == r0) goto L_0x0099
            r0 = 9
            if (r1 == r0) goto L_0x0085
            r0 = 13
            if (r1 != r0) goto L_0x004e
            if (r34 == 0) goto L_0x0129
            X.1Sl r1 = r6.A0P
            r32 = 1
            X.7N8 r0 = new X.7N8
            r22 = r0
            r24 = r7
            r25 = r4
            r26 = r3
            r27 = r6
            r28 = r10
            r29 = r13
            r30 = r15
            r31 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x004b:
            r1.A0l(r7, r4, r0)
        L_0x004e:
            return
        L_0x004f:
            if (r34 == 0) goto L_0x0129
            X.1Sl r1 = r6.A0P
            X.3AP r0 = new X.3AP
            r22 = r0
            r24 = r7
            r25 = r4
            r26 = r3
            r27 = r6
            r28 = r10
            r29 = r13
            r30 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x004b
        L_0x0069:
            X.1Sl r1 = r6.A0P
            X.7N8 r0 = new X.7N8
            r22 = r0
            r24 = r7
            r25 = r4
            r26 = r3
            r27 = r6
            r28 = r10
            r29 = r13
            r30 = r15
            r31 = r21
            r32 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x004b
        L_0x0085:
            X.1BI r0 = X.C22971Dz.A01(r15)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "SendMedia/sendDocument/error: Trying to share a document to status"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r1 = r6.A02
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
            r1.A08(r0, r2)
            return
        L_0x0099:
            X.10I r2 = r6.A0G
            r1 = 46
            X.DTg r0 = new X.DTg
            r0.<init>(r15, r6, r7, r1)
            r2.CGF(r0)
            return
        L_0x00a6:
            if (r34 == 0) goto L_0x0129
            java.lang.String r4 = "SendMedia/sendImages/share-failed/ "
            if (r7 == 0) goto L_0x011b
            java.lang.String r0 = "mentions"
            java.lang.String r1 = r7.getQueryParameter(r0)     // Catch:{ IOException -> 0x00ea, 1iX -> 0x00e0, OutOfMemoryError -> 0x010f, SecurityException -> 0x00d6 }
            X.00H r0 = r6.A0I     // Catch:{ IOException -> 0x00ea, 1iX -> 0x00e0, OutOfMemoryError -> 0x010f, SecurityException -> 0x00d6 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x00ea, 1iX -> 0x00e0, OutOfMemoryError -> 0x010f, SecurityException -> 0x00d6 }
            X.2kg r0 = (X.C58432kg) r0     // Catch:{ IOException -> 0x00ea, 1iX -> 0x00e0, OutOfMemoryError -> 0x010f, SecurityException -> 0x00d6 }
            java.util.List r16 = r0.A00(r1)     // Catch:{ IOException -> 0x00ea, 1iX -> 0x00e0, OutOfMemoryError -> 0x010f, SecurityException -> 0x00d6 }
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r8
            r18 = r8
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r9 = r8
            r20 = r2
            r6.A04(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x00ea, 1iX -> 0x00e0, OutOfMemoryError -> 0x010f, SecurityException -> 0x00d6 }
            goto L_0x011b
        L_0x00d6:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            X.1KB r1 = r6.A02
            r0 = 2131892909(0x7f121aad, float:1.942058E38)
            goto L_0x0118
        L_0x00e0:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            X.1KB r1 = r6.A02
            r0 = 2131889970(0x7f120f32, float:1.9414619E38)
            goto L_0x0118
        L_0x00ea:
            r1 = move-exception
            com.whatsapp.util.Log.e(r4, r1)
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0106
            X.1KB r1 = r6.A02
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            goto L_0x0118
        L_0x0106:
            X.1KB r1 = r6.A02
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
            r1.A08(r0, r2)
            goto L_0x011b
        L_0x010f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            X.1KB r1 = r6.A02
            r0 = 2131889999(0x7f120f4f, float:1.9414677E38)
        L_0x0118:
            r1.A06(r0, r2)
        L_0x011b:
            X.1KB r2 = r6.A02
            r1 = 2
            X.3C0 r0 = new X.3C0
            r0.<init>(r3, r7, r1)
            r2.CGP(r0)
            return
        L_0x0127:
            r5 = r28
        L_0x0129:
            r5.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34531kd.A00(android.content.Context, android.net.Uri, X.1FR, X.3Ly, X.1kd, X.36j, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, int, int, int, boolean, boolean):void");
    }

    public void A05(Context context, AnonymousClass1FR r40, C72433Ly r41, C692236j r42, String str, List list, List list2, int i, int i2, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append("SendMedia/size=");
        List<Uri> list3 = list2;
        sb.append(list3.size());
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list3.size();
        C18030ve r2 = this.A07;
        C18040vf r1 = C18040vf.A02;
        Context context2 = context;
        AnonymousClass1FR r6 = r40;
        C72433Ly r7 = r41;
        C692236j r9 = r42;
        String str2 = str;
        List list4 = list;
        int i3 = i;
        int i4 = i2;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if (C18020vd.A05(r1, r2, 10538)) {
            this.A0G.CGF(new C146677Qe(context2, r6, r7, this, r9, str2, arrayList, arrayList2, list3, list4, i3, size, i4, z4, z5, z6));
        } else if (C18020vd.A05(r1, r2, 8017)) {
            AtomicInteger atomicInteger = new AtomicInteger();
            for (Uri r5 : list3) {
                this.A0G.CGS(new C146687Qf(context2, r5, r6, r7, this, r9, str2, arrayList, arrayList2, list4, atomicInteger, i3, size, i4, z4, z5, z6), "SendMedia/sendMedia");
            }
        } else {
            for (Uri uri : list3) {
                A00(context2, uri, r6, r7, this, r9, str2, arrayList, arrayList2, list4, this.A0A.A00(uri), i3, size, z4, z5);
            }
            A01(context2, r6, r7, this, r9, str2, arrayList, arrayList2, list4, i4, z6);
        }
    }
}
