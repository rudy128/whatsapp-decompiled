package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6yp  reason: invalid class name and case insensitive filesystem */
public final class C139426yp {
    public final C1409573s A01(Context context, AnonymousClass1T1 r10, C18000vb r11, AnonymousClass1KW r12, C18030ve r13, C25291Nq r14, C26631Sw r15, File file) {
        Context context2 = context;
        C18000vb r2 = r11;
        AnonymousClass1KW r3 = r12;
        C18030ve r4 = r13;
        C26631Sw r6 = r15;
        C18070vi.A0w(context, r12, r11, r15, r13);
        AnonymousClass1T1 r1 = r10;
        C25291Nq r5 = r14;
        C18070vi.A0l(r14, r10);
        try {
            return A00(context2, r1, r2, r3, r4, r5, r6, file);
        } catch (IOException e) {
            Log.e("Doodle/safeLoad could not load doodle from file", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C1409573s A00(android.content.Context r4, X.AnonymousClass1T1 r5, X.C18000vb r6, X.AnonymousClass1KW r7, X.C18030ve r8, X.C25291Nq r9, X.C26631Sw r10, java.io.File r11) {
        /*
            X.C18070vi.A0w(r4, r7, r6, r10, r8)
            X.C18070vi.A0l(r9, r5)
            java.io.FileReader r0 = new java.io.FileReader
            r0.<init>(r11)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x002c }
        L_0x0014:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001e
            r1.append(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0014
        L_0x001e:
            X.6yp r3 = X.C1409573s.A06     // Catch:{ all -> 0x002c }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x002c }
            X.73s r0 = r3.A02(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x002c }
            r2.close()
            return r0
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139426yp.A00(android.content.Context, X.1T1, X.0vb, X.1KW, X.0ve, X.1Nq, X.1Sw, java.io.File):X.73s");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.69Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.69b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.69N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.69R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.69L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.69X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.69W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.69Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.69Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.69K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.69U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.69d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: X.69V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: X.69S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.69T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: X.69c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: X.69Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.69M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: X.Bu8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: X.69e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.69Z} */
    /* JADX WARNING: type inference failed for: r8v3, types: [X.70B] */
    /* JADX WARNING: type inference failed for: r23v2, types: [X.BuA] */
    /* JADX WARNING: type inference failed for: r28v3, types: [X.69l] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03e9, code lost:
        r2.A0R(r8);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0349, code lost:
        r10 = r2.A06;
        r9 = r10.width();
        r8 = r10.height();
        r1 = r10.left;
        r0 = r10.top;
        r10.set(r1, r0, r9 + r1, r8 + r0);
        r10.sort();
        r2 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1409573s A02(android.content.Context r41, X.AnonymousClass1T1 r42, X.C18000vb r43, X.AnonymousClass1KW r44, X.C18030ve r45, X.C25291Nq r46, X.C26631Sw r47, java.lang.String r48) {
        /*
            r40 = this;
            java.lang.String r22 = "blurred-bitmap-provider"
            r3 = r41
            r6 = r43
            r12 = r44
            r38 = r45
            r36 = r47
            r1 = r36
            r0 = r38
            X.C18070vi.A0w(r3, r12, r6, r1, r0)
            r39 = r42
            r37 = r46
            r1 = r37
            r0 = r39
            X.C18070vi.A0l(r1, r0)
            r33 = 0
            if (r48 == 0) goto L_0x047b
            int r0 = r48.length()
            if (r0 == 0) goto L_0x047b
            org.json.JSONObject r4 = X.C17880vN.A16(r48)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.RectF r21 = X.AnonymousClass3MW.A08()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = r21
            float r1 = X.C109005cf.A00(r0, r4)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.RectF r5 = X.AnonymousClass3MW.A08()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "crop-l"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r1
            r5.left = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "crop-t"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r1
            r5.top = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "crop-r"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r1
            r5.right = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "crop-b"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r1
            r5.bottom = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "rotate"
            int r20 = r4.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "shapes"
            org.json.JSONArray r19 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.util.ArrayList r18 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r17 = r19.length()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r7 = 0
        L_0x0077:
            r0 = r17
            if (r7 >= r0) goto L_0x0403
            r0 = r19
            org.json.JSONObject r8 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.C18070vi.A0b(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r13 = 0
            X.C18070vi.A0d(r8, r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "type"
            java.lang.String r1 = r8.getString(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r1 == 0) goto L_0x03f8
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            switch(r0) {
                case -2069773495: goto L_0x03dc;
                case -1890252483: goto L_0x03cc;
                case -1853985446: goto L_0x03be;
                case -1676415975: goto L_0x0395;
                case -1493474063: goto L_0x036f;
                case -1489367378: goto L_0x0361;
                case -1082513804: goto L_0x0317;
                case -856303806: goto L_0x0304;
                case -841189240: goto L_0x02f5;
                case -841116134: goto L_0x02e6;
                case 110873: goto L_0x01cd;
                case 3423314: goto L_0x01be;
                case 3496420: goto L_0x01af;
                case 3556653: goto L_0x0119;
                case 93090825: goto L_0x010a;
                case 96632902: goto L_0x00fb;
                case 1036141665: goto L_0x00ec;
                case 1102578873: goto L_0x00dd;
                case 1901043637: goto L_0x0099;
                default: goto L_0x0097;
            }     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x0097:
            goto L_0x03f8
        L_0x0099:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            r0 = 2131886761(0x7f1202a9, float:1.940811E38)
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.69Y r2 = new X.69Y     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r3, r6, r0, r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A0R(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "latitude"
            double r0 = r8.getDouble(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "longitude"
            double r0 = r8.getDouble(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "Location"
            java.lang.String r0 = X.C18070vi.A0J(r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A05 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "displayLocation"
            java.lang.String r0 = X.C18070vi.A0J(r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A04 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A06 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.AnonymousClass69Y.A00(r2)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x0349
        L_0x00dd:
            java.lang.String r0 = "newsletter"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69e r2 = new X.69e     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x00ec:
            java.lang.String r0 = "template-background"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.Bu8 r2 = new X.Bu8     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r3, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x00fb:
            java.lang.String r0 = "emoji"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69M r2 = new X.69M     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r3, r12, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x010a:
            java.lang.String r0 = "arrow"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69Q r2 = new X.69Q     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x0119:
            java.lang.String r9 = "text"
            boolean r0 = r1.equals(r9)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69c r2 = new X.69c     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = r38
            r2.<init>(r3, r6, r12, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A0R(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "orig-w"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r10 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r10
            r2.A03 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "orig-h"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r10
            r2.A02 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "orig-l"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r10
            r2.A04 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "orig-r"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r10
            r2.A05 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "scale-factor"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r0 / r10
            r2.A06 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r1 = 0
            r2.A01 = r1     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r24 = X.C18070vi.A0J(r9, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "text-size"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r9 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r9 = r9 / r10
            java.lang.String r0 = "style"
            int r26 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "alignment"
            int r27 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "background_style"
            int r28 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r23 = r2
            r25 = r9
            r23.A0a(r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r9 = 15
            java.lang.String r0 = "editing_tool_flag"
            int r0 = r8.optInt(r0, r9)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A08 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r10 = r2.A0C     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.text.TextPaint r9 = r2.A0E     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r8 = r2.A07     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r2.A06     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r8 = r8 * r0
            r9.setTextSize(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r2.A03     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r0 = (int) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r0 = r0 + 1
            android.text.StaticLayout r0 = X.AnonymousClass69c.A01(r3, r12, r2, r10, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A0B = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A01 = r1     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.AnonymousClass69c.A02(r3, r2)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x01af:
            java.lang.String r0 = "rect"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69T r2 = new X.69T     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x01be:
            java.lang.String r0 = "oval"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69S r2 = new X.69S     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x01cd:
            java.lang.String r0 = "pen"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            float r15 = X.C72463Mc.A00(r3)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = 1
            X.69V r2 = new X.69V     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r15)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A0R(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A06 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r9 = "brush_blur"
            boolean r16 = r8.optBoolean(r9, r13)     // Catch:{ JSONException -> 0x03fc }
            java.lang.String r0 = "points"
            org.json.JSONArray r14 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x03fc }
            if (r16 != 0) goto L_0x01ff
            java.lang.String r0 = "times"
            org.json.JSONArray r11 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x03fc }
        L_0x01f8:
            java.lang.String r0 = "width"
            int r1 = r8.getInt(r0)     // Catch:{ JSONException -> 0x03fc }
            goto L_0x0201
        L_0x01ff:
            r11 = 0
            goto L_0x01f8
        L_0x0201:
            float r10 = (float) r1     // Catch:{ JSONException -> 0x03fc }
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r1
            r1 = 0
            if (r16 == 0) goto L_0x020f
            if (r14 == 0) goto L_0x03fc
        L_0x020a:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x03fc
            goto L_0x0214
        L_0x020f:
            if (r14 == 0) goto L_0x03fc
            if (r11 == 0) goto L_0x03fc
            goto L_0x020a
        L_0x0214:
            boolean r1 = r8.optBoolean(r9, r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r1 == 0) goto L_0x025c
            android.graphics.Bitmap r14 = r2.A01     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.PointF r11 = r2.A02     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r10 = r2.A00     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.Paint r1 = r2.A05     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r9 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r9
            java.util.ArrayList r9 = X.AnonymousClass70B.A00(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.Object r13 = r9.get(r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.PointF r13 = (android.graphics.PointF) r13     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.69l r8 = new X.69l     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r28 = r8
            r29 = r14
            r30 = r1
            r31 = r13
            r32 = r11
            r34 = r0
            r35 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r11 = 1
        L_0x0248:
            int r0 = r9.size()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r11 >= r0) goto L_0x02e2
            java.lang.Object r10 = r9.get(r11)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.PointF r10 = (android.graphics.PointF) r10     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = 0
            r8.A06(r10, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r11 = r11 + 1
            goto L_0x0248
        L_0x025c:
            android.graphics.Bitmap r1 = r2.A01     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r24 = r1
            android.graphics.PointF r1 = r2.A02     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r27 = r1
            int r1 = r2.A00     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r30 = r1
            android.graphics.Paint r1 = r2.A05     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r16 = r1
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r11 = (float) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r0
            java.util.ArrayList r9 = X.AnonymousClass70B.A00(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "times"
            org.json.JSONArray r14 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r8 = 0
        L_0x0283:
            int r0 = r14.length()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r8 >= r0) goto L_0x0293
            long r0 = r14.getLong(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.C17880vN.A1R(r10, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r8 = r8 + 1
            goto L_0x0283
        L_0x0293:
            java.lang.Object r0 = r9.get(r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.PointF r0 = (android.graphics.PointF) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.Object r1 = r10.get(r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            long r31 = X.C17880vN.A05(r1)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.BuA r8 = new X.BuA     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r23 = r8
            r25 = r16
            r26 = r0
            r28 = r11
            r29 = r15
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r14 = 1
            r13 = 1
        L_0x02b2:
            int r0 = r9.size()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r13 >= r0) goto L_0x02cc
            java.lang.Object r11 = r9.get(r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.PointF r11 = (android.graphics.PointF) r11     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.Object r0 = r10.get(r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            long r0 = X.C17880vN.A05(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r8.A06(r11, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r13 = r13 + 1
            goto L_0x02b2
        L_0x02cc:
            int r0 = r9.size()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r0 = r0 - r14
            java.lang.Object r9 = r9.get(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.PointF r9 = (android.graphics.PointF) r9     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            long r0 = X.C17880vN.A05(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r8.A05(r9, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x02e2:
            r2.A04 = r8     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x02e6:
            java.lang.String r0 = "speech-bubble-rect"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69d r2 = new X.69d     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x02f5:
            java.lang.String r0 = "speech-bubble-oval"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69U r2 = new X.69U     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x0304:
            java.lang.String r0 = "main-image-file"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69K r2 = new X.69K     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r1 = r38
            r0 = r37
            r2.<init>(r1, r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x0317:
            java.lang.String r0 = "add-yours"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            r0 = 2131886527(0x7f1201bf, float:1.9407635E38)
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.69Z r2 = new X.69Z     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r3, r6, r0, r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A0R(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "displayPromptText"
            java.lang.String r0 = X.C18070vi.A0J(r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "promptText"
            java.lang.String r0 = X.C18070vi.A0J(r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A03 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A04 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.AnonymousClass69Z.A01(r2)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x0349:
            android.graphics.RectF r10 = r2.A06     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r9 = r10.width()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r8 = r10.height()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r1 = r10.left     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r0 = r10.top     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            float r9 = r9 + r1
            float r8 = r8 + r0
            r10.set(r1, r0, r9, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r10.sort()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x0361:
            java.lang.String r0 = "image-file"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69W r2 = new X.69W     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x036f:
            java.lang.String r0 = "analog-clock"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69X r2 = new X.69X     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r3, r6, r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "hour"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "minute"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A08 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x0395:
            java.lang.String r0 = "digital-clock"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69L r2 = new X.69L     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>(r3, r6, r13)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A06 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "time"
            java.lang.String r0 = X.C18070vi.A0J(r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "period"
            java.lang.String r0 = X.C18070vi.A0J(r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.AnonymousClass69L.A00(r2)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x03be:
            java.lang.String r0 = "circular-mask"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69R r2 = new X.69R     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03e9
        L_0x03cc:
            java.lang.String r0 = "sticker"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69N r2 = new X.69N     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = r36
            r2.<init>(r3, r0, r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x03ec
        L_0x03dc:
            java.lang.String r0 = "thinking-bubble"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x03f8
            X.69b r2 = new X.69b     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2.<init>()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x03e9:
            r2.A0R(r8)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x03ec:
            X.73u r2 = (X.C1409773u) r2     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r2 == 0) goto L_0x03f8
            r2.A0G()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = r18
            r0.add(r2)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x03f8:
            int r7 = r7 + 1
            goto L_0x0077
        L_0x03fc:
            java.lang.String r0 = "Json is not valid for PenBrushModel"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            throw r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x0403:
            r3 = r39
            r2 = r21
            r1 = r18
            r0 = r20
            X.73s r5 = r3.A00(r2, r5, r1, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0 = r22
            boolean r0 = r4.has(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x0470
            r0 = r22
            org.json.JSONObject r3 = r4.getJSONObject(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r3 == 0) goto L_0x0470
            java.lang.String r0 = "small-bitmap"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            int r0 = r1.length     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "origin-width"
            int r1 = r3.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.lang.String r0 = "origin-height"
            int r0 = r3.getInt(r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.6x7 r4 = new X.6x7     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r4.<init>(r2, r1, r0)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.util.List r0 = r5.A04     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x044a:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x045c
            java.lang.Object r1 = r2.next()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            boolean r0 = r1 instanceof X.AnonymousClass69V     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x044a
            r3.add(r1)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x044a
        L_0x045c:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
        L_0x0460:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            if (r0 == 0) goto L_0x0470
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            X.69V r0 = (X.AnonymousClass69V) r0     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            r0.A0a(r4)     // Catch:{ JSONException -> 0x0471, IllegalArgumentException -> 0x0475 }
            goto L_0x0460
        L_0x0470:
            return r5
        L_0x0471:
            r1 = move-exception
            java.lang.String r0 = "Doodle/load unable to load from JSON"
            goto L_0x0478
        L_0x0475:
            r1 = move-exception
            java.lang.String r0 = "Doodle/Drawable or picture unable to load from JSON"
        L_0x0478:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x047b:
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139426yp.A02(android.content.Context, X.1T1, X.0vb, X.1KW, X.0ve, X.1Nq, X.1Sw, java.lang.String):X.73s");
    }
}
