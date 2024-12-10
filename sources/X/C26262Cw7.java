package X;

import java.util.Map;
import org.xml.sax.Attributes;

/* renamed from: X.Cw7  reason: case insensitive filesystem */
public class C26262Cw7 {
    public C25130CZd A00 = new C25130CZd();
    public C22749BNm A01 = null;
    public Map A02 = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.C5y] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C22761BNy A01(X.E7L r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = r5
            X.BNy r3 = (X.C22761BNy) r3
            java.lang.String r0 = r3.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r5.BOi()
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            X.C5y r1 = (X.C24482C5y) r1
            boolean r0 = r1 instanceof X.C22761BNy
            if (r0 == 0) goto L_0x0013
            r3 = r1
            X.BNy r3 = (X.C22761BNy) r3
            java.lang.String r0 = r3.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.E7L
            if (r0 == 0) goto L_0x0013
            X.E7L r1 = (X.E7L) r1
            X.BNy r3 = r4.A01(r1, r6)
            if (r3 == 0) goto L_0x0013
        L_0x003a:
            return r3
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26262Cw7.A01(X.E7L, java.lang.String):X.BNy");
    }

    public C22761BNy A0A(String str) {
        String substring;
        String str2;
        String replace;
        if (str != null) {
            String str3 = "\"";
            if (!str.startsWith(str3) || !str.endsWith(str3)) {
                str3 = "'";
                if (str.startsWith(str3) && str.endsWith(str3)) {
                    substring = str.substring(1, str.length() - 1);
                    str2 = "\\'";
                }
                replace = str.replace("\\\n", "").replace("\\A", "\n");
                if (replace.length() > 1 && replace.startsWith("#")) {
                    return A09(replace.substring(1));
                }
            } else {
                substring = str.substring(1, str.length() - 1);
                str2 = "\\\"";
            }
            str = substring.replace(str2, str3);
            replace = str.replace("\\\n", "").replace("\\A", "\n");
            return A09(replace.substring(1));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: X.BNc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v313, resolved type: X.BNM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v139, resolved type: X.BNp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v477, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r26v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.E7L, X.C5y] */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.BNa, X.BNy, X.EAF, X.BNd] */
    /* JADX WARNING: type inference failed for: r2v19, types: [X.E7L, X.C5y] */
    /* JADX WARNING: type inference failed for: r2v22, types: [X.BNY, X.BNy, X.C5y] */
    /* JADX WARNING: type inference failed for: r3v10, types: [X.E3s, X.BNq, X.BNY, X.BNy, X.EAF] */
    /* JADX WARNING: type inference failed for: r2v26, types: [X.E7L, X.C5y] */
    /* JADX WARNING: type inference failed for: r2v27, types: [X.BNo, X.BNp, X.BNY, X.BNy, X.EAF] */
    /* JADX WARNING: type inference failed for: r3v12, types: [X.BNv, X.BNy, X.EAF, X.E7L, X.C5y, X.BNd] */
    /* JADX WARNING: type inference failed for: r2v36, types: [X.E3s, X.BNy, X.EAF, X.BNU, X.BNd] */
    /* JADX WARNING: type inference failed for: r2v37, types: [X.BNg, X.BNy, X.E7L, X.C5y] */
    /* JADX WARNING: type inference failed for: r2v39, types: [X.BNL, X.BNy, X.BNh] */
    /* JADX WARNING: type inference failed for: r2v40, types: [X.BNK, X.BNy, X.BNh] */
    /* JADX WARNING: type inference failed for: r3v24, types: [X.BNn, X.BNp, X.BNY, X.BNy, X.EAF] */
    /* JADX WARNING: type inference failed for: r2v44, types: [X.BNY, X.BNy] */
    /* JADX WARNING: type inference failed for: r2v45, types: [X.E3s, X.BNy, X.EAF] */
    /* JADX WARNING: type inference failed for: r3v25, types: [X.BNy, X.EAF, X.C5y, X.BNu, X.BNd] */
    /* JADX WARNING: type inference failed for: r3v26, types: [X.BNy, X.EAF, X.E7L, X.BNx, X.C5y, X.BNd, X.BNt] */
    /* JADX WARNING: type inference failed for: r2v60, types: [X.E3s, X.BNy, X.EAF, X.BNd, X.BNt] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.E3s, X.BNy, X.EAF, X.BNc] */
    /* JADX WARNING: type inference failed for: r2v70, types: [X.E3s, X.BNP, X.BNy, X.EAF, X.BNc] */
    /* JADX WARNING: type inference failed for: r3v32, types: [X.BNO, X.E3s, X.BNy, X.EAF, X.BNc, X.C5y] */
    /* JADX WARNING: type inference failed for: r2v74, types: [X.E3s, X.BNN, X.BNy, X.EAF, X.BNc] */
    /* JADX WARNING: type inference failed for: r8v6, types: [X.E3s, X.BNQ, X.BNy, X.EAF, X.BNc] */
    /* JADX WARNING: type inference failed for: r8v7, types: [X.E3s, X.BNy, X.EAF, X.BNc] */
    /* JADX WARNING: type inference failed for: r0v307, types: [X.E3s, X.BNy, X.EAF] */
    /* JADX WARNING: type inference failed for: r3v61, types: [X.E3s, X.BNy, X.EAF, X.BNS, X.BNd] */
    /* JADX WARNING: type inference failed for: r2v114, types: [X.E3s, X.BNy, X.BNd] */
    /* JADX WARNING: type inference failed for: r3v62, types: [X.BNp, X.BNm, X.BNY, X.BNy, X.EAF, X.E7L, X.C5y] */
    /* JADX WARNING: type inference failed for: r0v400, types: [X.CnG, X.BO4] */
    /* JADX WARNING: type inference failed for: r4v63, types: [java.lang.Object, X.Cvz] */
    /* JADX WARNING: type inference failed for: r0v435, types: [X.CnG, X.BO4] */
    /* JADX WARNING: type inference failed for: r3v74 */
    /* JADX WARNING: type inference failed for: r2v138 */
    /* JADX WARNING: type inference failed for: r3v75 */
    /* JADX WARNING: type inference failed for: r2v141 */
    /* JADX WARNING: type inference failed for: r2v142 */
    /* JADX WARNING: type inference failed for: r2v143 */
    /* JADX WARNING: type inference failed for: r2v144 */
    /* JADX WARNING: type inference failed for: r3v76 */
    /* JADX WARNING: type inference failed for: r2v146 */
    /* JADX WARNING: type inference failed for: r2v147 */
    /* JADX WARNING: type inference failed for: r2v148 */
    /* JADX WARNING: type inference failed for: r3v77 */
    /* JADX WARNING: type inference failed for: r2v151 */
    /* JADX WARNING: type inference failed for: r2v152 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01eb, code lost:
        r11.A06 = true;
        r11.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0525, code lost:
        r5 = r5 + r13;
        r4 = r4 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0527, code lost:
        r7.BHy(r3, r14, r5, r4, r2, r34);
        r13 = r2;
        r12 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0584, code lost:
        r4 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0586, code lost:
        r13 = r3;
        r12 = r2;
        r7.CD6(r5, r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x058b, code lost:
        r8.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0596, code lost:
        if (X.AnonymousClass000.A1T(r8.A01, r8.A00) != false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0598, code lost:
        r2 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x059c, code lost:
        if (r2 == r8.A00) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x059e, code lost:
        r2 = r8.A03.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05a6, code lost:
        if (r2 < 'a') goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05ab, code lost:
        if (r2 < 'A') goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05af, code lost:
        if (r2 > 'Z') goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x05b4, code lost:
        if (r2 <= 'z') goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05ba, code lost:
        r6 = r8.A09().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07b2, code lost:
        r11.A01.BB4(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07d3, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x07d8, code lost:
        if (r6 >= r1.getLength()) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07da, code lost:
        r2 = (X.C0I) X.C0I.A00.get(r1.getLocalName(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x07e6, code lost:
        if (r2 != null) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07e8, code lost:
        r2 = X.C0I.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07ec, code lost:
        if (r2 != X.C0I.A0o) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07ee, code lost:
        r5 = new X.C25854CnG(r1.getValue(r6));
        r3 = X.AnonymousClass000.A13();
        r5.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0806, code lost:
        if (X.AnonymousClass000.A1T(r5.A01, r5.A00) != false) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0808, code lost:
        r4 = r5.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0812, code lost:
        if (java.lang.Float.isNaN(r4) != false) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0814, code lost:
        r5.A0E();
        r0 = r5.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x081f, code lost:
        if (java.lang.Float.isNaN(r0) != false) goto L_0x0853;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0821, code lost:
        r5.A0E();
        X.BE7.A1Q(r3, r4);
        X.BE7.A1Q(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x082b, code lost:
        r8.A00 = new float[r3.size()];
        r5 = r3.iterator();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x083c, code lost:
        if (r5.hasNext() == false) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x083e, code lost:
        r8.A00[r4] = ((java.lang.Float) r5.next()).floatValue();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0850, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0853, code lost:
        r1 = X.E05.A00(X.AnonymousClass000.A0y("> points attribute. There should be an even number of coordinates.", X.AnonymousClass8BW.A0o("Invalid <", r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0863, code lost:
        r1 = X.E05.A00(X.AnonymousClass000.A0y("> points attribute. Non-coordinate content found in list.", X.AnonymousClass8BW.A0o("Invalid <", r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0873, code lost:
        r11.A01.BB4(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0945, code lost:
        A05(r0, r2, r11, r1);
        X.C26296Cx9.A0G(r2, r1);
        X.C26296Cx9.A0I(r2, r1);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0cd5, code lost:
        r11.A01.BB4(r2);
        r11.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0d8c, code lost:
        X.C26296Cx9.A0I(r2, r1);
        X.C26296Cx9.A0M(r2, r1);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0da4, code lost:
        r11.A01.BB4(r2);
        r11.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0db8, code lost:
        r11.A08 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0e85, code lost:
        r11.A01.BB4(r3);
        r11.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0181, code lost:
        r0.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x0873, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x0a89, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C26262Cw7 A02(android.content.res.AssetManager r34, java.lang.String r35) {
        /*
            X.Cx9 r11 = new X.Cx9
            r11.<init>()
            r1 = r34
            r0 = r35
            java.io.InputStream r23 = r1.open(r0)
            r26 = r23
            java.lang.String r25 = "Exception thrown closing input stream"
            java.lang.String r24 = "SVGParser"
            boolean r0 = r23.markSupported()     // Catch:{ all -> 0x0f54 }
            if (r0 != 0) goto L_0x0022
            java.io.BufferedInputStream r26 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0f54 }
            r1 = r23
            r0 = r26
            r0.<init>(r1)     // Catch:{ all -> 0x0f54 }
        L_0x0022:
            r1 = 3
            r0 = r26
            r0.mark(r1)     // Catch:{ IOException -> 0x0049 }
            int r1 = r26.read()     // Catch:{ IOException -> 0x0049 }
            int r0 = r26.read()     // Catch:{ IOException -> 0x0049 }
            int r0 = r0 << 8
            int r1 = r1 + r0
            r26.reset()     // Catch:{ IOException -> 0x0049 }
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x0049
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0049 }
            r0 = r26
            r1.<init>(r0)     // Catch:{ IOException -> 0x0049 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0049 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0049 }
            r26 = r0
        L_0x0049:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r26
            r0.mark(r1)     // Catch:{ all -> 0x0f47 }
            org.xmlpull.v1.XmlPullParser r27 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.DZT r1 = new X.DZT     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r27
            r1.<init>(r11, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r10 = 0
            r0.setFeature(r2, r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r9 = 1
            r0.setFeature(r2, r9)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
            r2 = r0
            r0 = r26
            r2.setInput(r0, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r3 = r27.getEventType()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0072:
            if (r3 == r9) goto L_0x0f24
            if (r3 == 0) goto L_0x0ece
            r0 = 8
            if (r3 == r0) goto L_0x0e8d
            r0 = 10
            if (r3 == r0) goto L_0x0ef3
            r4 = 58
            r2 = 2
            if (r3 == r2) goto L_0x0190
            r0 = 3
            if (r3 == r0) goto L_0x00d0
            r0 = 4
            if (r3 == r0) goto L_0x008e
            r0 = 5
            if (r3 != r0) goto L_0x0ef3
            goto L_0x0ed6
        L_0x008e:
            int[] r2 = new int[r2]     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r27
            char[] r4 = r0.getTextCharacters(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = r2[r10]     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2 = r2[r9]     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0ef3
            boolean r0 = r11.A07     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x00b1
            java.lang.StringBuilder r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x00ac
            java.lang.StringBuilder r0 = X.BE6.A0t(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x00ac:
            r0.append(r4, r3, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x00b1:
            boolean r0 = r11.A08     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x00c0
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x00ac
            java.lang.StringBuilder r0 = X.BE6.A0t(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x00ac
        L_0x00c0:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r0 instanceof X.BNX     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0ef3
            java.lang.String r0 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.<init>(r4, r3, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0O(r11, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x00d0:
            java.lang.String r3 = r27.getName()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r27.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x00e9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r27.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.append(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r3 = X.C17890vO.A0Z(r3, r2, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x00e9:
            java.lang.String r4 = r27.getNamespace()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = r27.getName()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0100
            int r0 = r11.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r0 - r9
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0100
            r11.A06 = r10     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0100:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0112
            goto L_0x0ef3
        L_0x0112:
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 > 0) goto L_0x0119
            r2 = r3
        L_0x0119:
            X.C7u r0 = X.C7u.$redex_init_class     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.Map r0 = X.C0G.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C0G r0 = (X.C0G) r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0127
            X.C0G r0 = X.C0G.A03     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0127:
            int r2 = r0.ordinal()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == r10) goto L_0x0186
            r0 = 7
            if (r2 == r0) goto L_0x0186
            r0 = 4
            if (r2 == r0) goto L_0x0186
            r0 = 29
            if (r2 == r0) goto L_0x0186
            r0 = 24
            if (r2 == r0) goto L_0x0186
            r0 = 28
            if (r2 == r0) goto L_0x0186
            switch(r2) {
                case 3: goto L_0x0186;
                case 4: goto L_0x0142;
                case 5: goto L_0x0144;
                case 6: goto L_0x0142;
                case 7: goto L_0x0142;
                case 8: goto L_0x0186;
                case 9: goto L_0x0142;
                case 10: goto L_0x0186;
                case 11: goto L_0x0186;
                case 12: goto L_0x0186;
                case 13: goto L_0x0142;
                case 14: goto L_0x0186;
                case 15: goto L_0x0142;
                case 16: goto L_0x0142;
                case 17: goto L_0x0186;
                case 18: goto L_0x0142;
                case 19: goto L_0x0186;
                case 20: goto L_0x0186;
                case 21: goto L_0x014b;
                case 22: goto L_0x0186;
                case 23: goto L_0x0186;
                case 24: goto L_0x0142;
                case 25: goto L_0x0186;
                case 26: goto L_0x0144;
                case 27: goto L_0x0142;
                case 28: goto L_0x0142;
                case 29: goto L_0x0142;
                case 30: goto L_0x0186;
                default: goto L_0x0142;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0142:
            goto L_0x0ef3
        L_0x0144:
            r11.A07 = r10     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.StringBuilder r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0ef3
            goto L_0x0181
        L_0x014b:
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0ef3
            r11.A08 = r10     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r5 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.Bz0 r2 = X.C24303Bz0.screen     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.Cvz r4 = new X.Cvz     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4.A02 = r10     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4.A00 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.Cw7 r3 = r11.A02     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = "(?s)/\\*.*?\\*/"
            java.lang.String r0 = ""
            java.lang.String r2 = r5.replaceAll(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BO4 r0 = new X.BO4     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.A0D()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.CZd r2 = X.C26255Cvz.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.CZd r0 = r3.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.A01(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0181:
            r0.setLength(r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0186:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C5y r0 = (X.C24482C5y) r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E7L r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0190:
            java.lang.String r3 = r27.getName()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r27.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x01a9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r27.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.append(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r3 = X.C17890vO.A0Z(r3, r2, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x01a9:
            java.lang.String r4 = r27.getNamespace()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = r27.getName()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x01bd
            int r0 = r11.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x01bd:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x01cf
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x01cf
            goto L_0x0ef3
        L_0x01cf:
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 > 0) goto L_0x01d6
            r2 = r3
        L_0x01d6:
            java.util.Map r0 = X.C0G.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C0G r2 = (X.C0G) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 != 0) goto L_0x01e2
            X.C0G r2 = X.C0G.A03     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x01e2:
            X.C7u r0 = X.C7u.$redex_init_class     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r2.ordinal()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            switch(r0) {
                case 0: goto L_0x0249;
                case 1: goto L_0x02d3;
                case 2: goto L_0x06a6;
                case 3: goto L_0x0b47;
                case 4: goto L_0x02e4;
                case 5: goto L_0x0db2;
                case 6: goto L_0x06fb;
                case 7: goto L_0x02d3;
                case 8: goto L_0x0ce4;
                case 9: goto L_0x076f;
                case 10: goto L_0x0a12;
                case 11: goto L_0x096a;
                case 12: goto L_0x0ddc;
                case 13: goto L_0x038b;
                case 14: goto L_0x0bfa;
                case 15: goto L_0x07bf;
                case 16: goto L_0x05d6;
                case 17: goto L_0x0a58;
                case 18: goto L_0x05f2;
                case 19: goto L_0x0d98;
                case 20: goto L_0x0ac0;
                case 21: goto L_0x01f1;
                case 22: goto L_0x093c;
                case 23: goto L_0x0956;
                case 24: goto L_0x0880;
                case 25: goto L_0x0b98;
                case 26: goto L_0x0db2;
                case 27: goto L_0x08db;
                case 28: goto L_0x089d;
                case 29: goto L_0x02fb;
                case 30: goto L_0x0d7a;
                default: goto L_0x01eb;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x01eb:
            r11.A06 = r9     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A00 = r9     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x01f1:
            r5 = 0
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0dbc
            java.lang.String r3 = "all"
            r6 = 1
        L_0x01f9:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r5 >= r0) goto L_0x021b
            java.lang.String r4 = A04(r1, r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r2 = A00(r1, r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 77
            if (r2 == r0) goto L_0x020c
            goto L_0x0213
        L_0x020c:
            java.lang.String r0 = "text/css"
            boolean r6 = r4.equals(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0218
        L_0x0213:
            r0 = 38
            if (r2 != r0) goto L_0x0218
            r3 = r4
        L_0x0218:
            int r5 = r5 + 1
            goto L_0x01f9
        L_0x021b:
            if (r6 == 0) goto L_0x01eb
            X.Bz0 r4 = X.C24303Bz0.screen     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = "(?s)/\\*.*?\\*/"
            java.lang.String r0 = ""
            java.lang.String r2 = r3.replaceAll(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BO4 r0 = new X.BO4     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.A0D()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.ArrayList r0 = X.C26255Cvz.A02(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0237:
            boolean r0 = r3.hasNext()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r2 = r3.next()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.Bz0 r0 = X.C24303Bz0.all     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == r0) goto L_0x0db8
            if (r2 != r4) goto L_0x0237
            goto L_0x0db8
        L_0x0249:
            X.BNm r3 = new X.BNm     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.Cw7 r0 = r11.A02     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0J(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0K(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0M(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x0263:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x02c3
            java.lang.String r5 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r2 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 82
            if (r2 == r0) goto L_0x02ba
            r0 = 83
            if (r2 == r0) goto L_0x02b3
            r0 = 81
            if (r2 == r0) goto L_0x029a
            r0 = 25
            if (r2 != r0) goto L_0x02c0
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = "Invalid <svg> element. height cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x029a:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = "Invalid <svg> element. width cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x02b3:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x02c0
        L_0x02ba:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x02c0:
            int r4 = r4 + 1
            goto L_0x0263
        L_0x02c3:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x02cf
            X.Cw7 r0 = r11.A02     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x02cb:
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x02cf:
            r0.BB4(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x02cb
        L_0x02d3:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x02de
            X.BNZ r2 = new X.BNZ     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0945
        L_0x02de:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x02e4:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x02f5
            X.BNT r2 = new X.BNT     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0da4
        L_0x02f5:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x02fb:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0385
            X.BNS r3 = new X.BNS     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x030e:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x0e85
            java.lang.String r2 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 82
            if (r5 == r0) goto L_0x037c
            r0 = 83
            if (r5 == r0) goto L_0x0375
            r0 = 81
            if (r5 == r0) goto L_0x035c
            r0 = 25
            if (r5 == r0) goto L_0x0343
            r0 = 26
            if (r5 != r0) goto L_0x0382
            java.lang.String r0 = ""
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0340
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0382
        L_0x0340:
            r3.A04 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0382
        L_0x0343:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0382
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x035c:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0382
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0375:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0382
        L_0x037c:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0382:
            int r4 = r4 + 1
            goto L_0x030e
        L_0x0385:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x038b:
            X.E7L r2 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == 0) goto L_0x05d0
            X.BNM r22 = new X.BNM     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r22.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r22
            A05(r2, r0, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r15 = 0
        L_0x03a0:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r15 >= r0) goto L_0x05c7
            java.lang.String r3 = A04(r1, r15)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r2 = A00(r1, r15)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 13
            if (r2 == r0) goto L_0x03cd
            r0 = 43
            if (r2 != r0) goto L_0x05c3
            int r0 = r3.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0f16
            float r2 = X.C26296Cx9.A01(r3, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x05c3
            java.lang.String r0 = "Invalid <path> element. pathLength cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x03cd:
            X.CnG r8 = new X.CnG     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.D8X r7 = new X.D8X     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r2 = r8.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0408
            java.lang.Integer r0 = r8.A09()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r6 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 77
            r2 = 109(0x6d, float:1.53E-43)
            if (r6 == r0) goto L_0x03f2
            if (r6 == r2) goto L_0x03f2
            goto L_0x0408
        L_0x03f2:
            r13 = 0
            r5 = 0
            r12 = 0
            r4 = 0
            r21 = 0
            r20 = 0
        L_0x03fa:
            r8.A0D()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 108(0x6c, float:1.51E-43)
            r14 = 1073741824(0x40000000, float:2.0)
            java.lang.String r19 = " path segment"
            java.lang.String r18 = "Bad path coords for "
            switch(r6) {
                case 65: goto L_0x0437;
                case 67: goto L_0x040e;
                case 72: goto L_0x048f;
                case 76: goto L_0x04a4;
                case 77: goto L_0x04bd;
                case 81: goto L_0x04e3;
                case 83: goto L_0x0503;
                case 84: goto L_0x053a;
                case 86: goto L_0x0556;
                case 90: goto L_0x057c;
                case 97: goto L_0x0437;
                case 99: goto L_0x040e;
                case 104: goto L_0x048f;
                case 108: goto L_0x04a4;
                case 109: goto L_0x04bd;
                case 113: goto L_0x04e3;
                case 115: goto L_0x0503;
                case 116: goto L_0x053a;
                case 118: goto L_0x0556;
                case 122: goto L_0x057c;
                default: goto L_0x0408;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0408:
            r0 = r22
            r0.A00 = r7     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x05c3
        L_0x040e:
            float r3 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r14 = r8.A05(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r5 = r8.A05(r14)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r8.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r34 = r8.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r34)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            r0 = 99
            if (r6 != r0) goto L_0x0527
            float r2 = r2 + r13
            float r34 = r34 + r12
            float r3 = r3 + r13
            float r14 = r14 + r12
            goto L_0x0525
        L_0x0437:
            float r2 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r0 = r8.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r31 = r8.A05(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Float r3 = java.lang.Float.valueOf(r31)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Boolean r17 = r8.A08(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = r17
            java.lang.Boolean r16 = r8.A08(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r16 != 0) goto L_0x0456
            r5 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x045d
        L_0x0456:
            r8.A0E()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r5 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x045d:
            float r4 = r8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r3 = java.lang.Float.isNaN(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 != 0) goto L_0x056a
            r14 = 0
            int r3 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x056a
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x056a
            r3 = 97
            if (r6 != r3) goto L_0x0476
            float r5 = r5 + r13
            float r4 = r4 + r12
        L_0x0476:
            boolean r34 = r17.booleanValue()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r35 = r16.booleanValue()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r28 = r7
            r29 = r2
            r30 = r0
            r32 = r5
            r33 = r4
            r28.BCZ(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r13 = r5
            r12 = r4
            goto L_0x058b
        L_0x048f:
            float r5 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            r0 = 104(0x68, float:1.46E-43)
            if (r6 != r0) goto L_0x049e
            float r5 = r5 + r13
        L_0x049e:
            r13 = r5
            r7.BhX(r5, r12)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x058b
        L_0x04a4:
            float r5 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            if (r6 != r3) goto L_0x04b6
            float r5 = r5 + r13
            float r2 = r2 + r12
        L_0x04b6:
            r13 = r5
            r12 = r2
            r7.BhX(r5, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0584
        L_0x04bd:
            float r5 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            if (r6 != r2) goto L_0x04d3
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x04d3
            float r5 = r5 + r13
            float r4 = r4 + r12
        L_0x04d3:
            r13 = r5
            r12 = r4
            r7.Bk6(r5, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r6 == r2) goto L_0x04dc
            r3 = 76
        L_0x04dc:
            r21 = r5
            r20 = r4
            r6 = r3
            goto L_0x058b
        L_0x04e3:
            float r5 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r3 = r8.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r8.A05(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            r0 = 113(0x71, float:1.58E-43)
            if (r6 != r0) goto L_0x0586
            float r3 = r3 + r13
            float r2 = r2 + r12
            float r5 = r5 + r13
            float r4 = r4 + r12
            goto L_0x0586
        L_0x0503:
            float r3 = r13 * r14
            float r3 = r3 - r5
            float r14 = r14 * r12
            float r14 = r14 - r4
            float r5 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r8.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r8.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r34 = r8.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r34)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            r0 = 115(0x73, float:1.61E-43)
            if (r6 != r0) goto L_0x0527
            float r2 = r2 + r13
            float r34 = r34 + r12
        L_0x0525:
            float r5 = r5 + r13
            float r4 = r4 + r12
        L_0x0527:
            r28 = r7
            r29 = r3
            r30 = r14
            r31 = r5
            r32 = r4
            r33 = r2
            r28.BHy(r29, r30, r31, r32, r33, r34)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r13 = r2
            r12 = r34
            goto L_0x058b
        L_0x053a:
            float r0 = r13 * r14
            float r5 = r0 - r5
            float r14 = r14 * r12
            float r4 = r14 - r4
            float r3 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r8.A05(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            r0 = 116(0x74, float:1.63E-43)
            if (r6 != r0) goto L_0x0586
            float r3 = r3 + r13
            float r2 = r2 + r12
            goto L_0x0586
        L_0x0556:
            float r2 = r8.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x056a
            r0 = 118(0x76, float:1.65E-43)
            if (r6 != r0) goto L_0x0565
            float r2 = r2 + r12
        L_0x0565:
            r12 = r2
            r7.BhX(r13, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0584
        L_0x056a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r18)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            char r2 = (char) r6     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r19
            java.lang.String r2 = X.C17890vO.A0Z(r0, r3, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r24
            android.util.Log.e(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0408
        L_0x057c:
            r7.close()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r13 = r21
            r5 = r13
            r12 = r20
        L_0x0584:
            r4 = r12
            goto L_0x058b
        L_0x0586:
            r13 = r3
            r12 = r2
            r7.CD6(r5, r4, r3, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x058b:
            r8.A0E()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r2 = r8.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0408
            int r2 = r8.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == r0) goto L_0x05b6
            java.lang.String r0 = r8.A03     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            char r2 = r0.charAt(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 97
            if (r2 < r0) goto L_0x05a9
            goto L_0x05b2
        L_0x05a9:
            r0 = 65
            if (r2 < r0) goto L_0x05b6
            r0 = 90
            if (r2 > r0) goto L_0x05b6
            goto L_0x05ba
        L_0x05b2:
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 <= r0) goto L_0x05ba
        L_0x05b6:
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x03fa
        L_0x05ba:
            java.lang.Integer r0 = r8.A09()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r6 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x05b6
        L_0x05c3:
            int r15 = r15 + 1
            goto L_0x03a0
        L_0x05c7:
            X.E7L r2 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r22
            r2.BB4(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x05d0:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x05d6:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x05ec
            X.BNW r8 = new X.BNW     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r8, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r8, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r8, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r7 = "polyline"
            goto L_0x07d3
        L_0x05ec:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x05f2:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x06a0
            X.BNQ r8 = new X.BNQ     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r8, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r8, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r8, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
        L_0x0605:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 >= r0) goto L_0x0873
            java.lang.String r4 = A04(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r2 = A00(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 82
            if (r2 == r0) goto L_0x0696
            r0 = 83
            if (r2 == r0) goto L_0x068f
            r0 = 81
            if (r2 == r0) goto L_0x0676
            r0 = 25
            if (r2 == r0) goto L_0x065d
            r0 = 56
            if (r2 == r0) goto L_0x0644
            r0 = 57
            if (r2 != r0) goto L_0x069c
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x069c
            java.lang.String r0 = "Invalid <rect> element. ry cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0644:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x069c
            java.lang.String r0 = "Invalid <rect> element. rx cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x065d:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x069c
            java.lang.String r0 = "Invalid <rect> element. height cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0676:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x069c
            java.lang.String r0 = "Invalid <rect> element. width cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x068f:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x069c
        L_0x0696:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x069c:
            int r3 = r3 + 1
            goto L_0x0605
        L_0x06a0:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x06a6:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x06f5
            X.BNN r2 = new X.BNN     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
        L_0x06b9:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 >= r0) goto L_0x07b2
            java.lang.String r4 = A04(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = A00(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            switch(r0) {
                case 6: goto L_0x06cb;
                case 7: goto L_0x06d2;
                case 49: goto L_0x06d9;
                default: goto L_0x06ca;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x06ca:
            goto L_0x06f2
        L_0x06cb:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x06f2
        L_0x06d2:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x06f2
        L_0x06d9:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x06f2
            java.lang.String r0 = "Invalid <circle> element. r cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x06f2:
            int r3 = r3 + 1
            goto L_0x06b9
        L_0x06f5:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x06fb:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0769
            X.BNO r3 = new X.BNO     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x070e:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x0762
            java.lang.String r2 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            switch(r0) {
                case 6: goto L_0x0752;
                case 7: goto L_0x0759;
                case 56: goto L_0x0720;
                case 57: goto L_0x0739;
                default: goto L_0x071f;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x071f:
            goto L_0x075f
        L_0x0720:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x075f
            java.lang.String r0 = "Invalid <ellipse> element. rx cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0739:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x075f
            java.lang.String r0 = "Invalid <ellipse> element. ry cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0752:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x075f
        L_0x0759:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x075f:
            int r4 = r4 + 1
            goto L_0x070e
        L_0x0762:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0769:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x076f:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x07b9
            X.BNP r2 = new X.BNP     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
        L_0x0782:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 >= r0) goto L_0x07b2
            java.lang.String r4 = A04(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = A00(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            switch(r0) {
                case 84: goto L_0x0794;
                case 85: goto L_0x079b;
                case 86: goto L_0x07a2;
                case 87: goto L_0x07a9;
                default: goto L_0x0793;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0793:
            goto L_0x07af
        L_0x0794:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x07af
        L_0x079b:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x07af
        L_0x07a2:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x07af
        L_0x07a9:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x07af:
            int r3 = r3 + 1
            goto L_0x0782
        L_0x07b2:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x07b9:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x07bf:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x087a
            X.BNV r8 = new X.BNV     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r8, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r8, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r8, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r7 = "polygon"
        L_0x07d3:
            r6 = 0
        L_0x07d4:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r6 >= r0) goto L_0x0873
            java.lang.String r2 = r1.getLocalName(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.Map r0 = X.C0I.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C0I r2 = (X.C0I) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 != 0) goto L_0x07ea
            X.C0I r2 = X.C0I.A03     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x07ea:
            X.C0I r0 = X.C0I.A0o     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 != r0) goto L_0x0850
            java.lang.String r0 = r1.getValue((int) r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.CnG r5 = new X.CnG     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r5.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r5.A0D()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x07fe:
            int r2 = r5.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r5.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x082b
            float r4 = r5.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = java.lang.Float.isNaN(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = "Invalid <"
            if (r0 != 0) goto L_0x0863
            r5.A0E()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r0 = r5.A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r12 = java.lang.Float.isNaN(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r12 != 0) goto L_0x0853
            r5.A0E()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BE7.A1Q(r3, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BE7.A1Q(r3, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x07fe
        L_0x082b:
            int r0 = r3.size()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float[] r0 = new float[r0]     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x0838:
            boolean r0 = r5.hasNext()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0850
            java.lang.Object r0 = r5.next()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r3 = r0.floatValue()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float[] r2 = r8.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = r4 + 1
            r2[r4] = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = r0
            goto L_0x0838
        L_0x0850:
            int r6 = r6 + 1
            goto L_0x07d4
        L_0x0853:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r7)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = "> points attribute. There should be an even number of coordinates."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0863:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r7)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = "> points attribute. Non-coordinate content found in list."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0873:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r8)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x087a:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0880:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0897
            X.BNw r2 = new X.BNw     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0N(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0da4
        L_0x0897:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x089d:
            X.E7L r2 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == 0) goto L_0x08d5
            boolean r0 = r2 instanceof X.BNX     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x08cd
            X.BNx r3 = new X.BNx     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r2, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0N(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E7L r2 = r3.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r2 instanceof X.C22759BNw     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x08c6
            X.BNw r2 = (X.C22759BNw) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x08c2:
            r3.A00 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x08c6:
            X.E3t r2 = (X.C28489E3t) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BNw r2 = r2.BaI()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x08c2
        L_0x08cd:
            java.lang.String r0 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x08d5:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x08db:
            X.E7L r2 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == 0) goto L_0x0936
            boolean r0 = r2 instanceof X.BNX     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x092e
            X.BNu r3 = new X.BNu     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r2, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x08ef:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x0916
            java.lang.String r2 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 26
            if (r5 != r0) goto L_0x0913
            java.lang.String r0 = ""
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0911
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0913
        L_0x0911:
            r3.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0913:
            int r4 = r4 + 1
            goto L_0x08ef
        L_0x0916:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E7L r2 = r3.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r2 instanceof X.C22759BNw     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0927
            X.BNw r2 = (X.C22759BNw) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0923:
            r3.A00 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0927:
            X.E3t r2 = (X.C28489E3t) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BNw r2 = r2.BaI()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0923
        L_0x092e:
            java.lang.String r0 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0936:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x093c:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0950
            X.BNR r2 = new X.BNR     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0945:
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0da4
        L_0x0950:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0956:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0964
            X.BNr r2 = new X.BNr     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0d8c
        L_0x0964:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x096a:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0a0c
            X.BNn r3 = new X.BNn     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0M(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2 = 0
        L_0x097d:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 >= r0) goto L_0x0e85
            java.lang.String r4 = A04(r1, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = A00(r1, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            switch(r0) {
                case 32: goto L_0x09b6;
                case 33: goto L_0x09cf;
                case 34: goto L_0x099d;
                case 41: goto L_0x09e5;
                case 50: goto L_0x098f;
                case 51: goto L_0x0996;
                default: goto L_0x098e;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x098e:
            goto L_0x0a00
        L_0x098f:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a00
        L_0x0996:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a00
        L_0x099d:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0a00
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x09b6:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0a00
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x09cf:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x09da
            r3.A05 = r10     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a00
        L_0x09da:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0a04
            r3.A05 = r9     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a00
        L_0x09e5:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x09f0
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x09fa
        L_0x09f0:
            int r0 = r4.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0f1d
            float r0 = X.C26296Cx9.A01(r4, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x09fa:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0a00:
            int r2 = r2 + 1
            goto L_0x097d
        L_0x0a04:
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0a0c:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0a12:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0a52
            X.BNK r2 = new X.BNK     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0F(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
        L_0x0a22:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 >= r0) goto L_0x0cd5
            java.lang.String r4 = A04(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r0 = A00(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            switch(r0) {
                case 84: goto L_0x0a34;
                case 85: goto L_0x0a3b;
                case 86: goto L_0x0a42;
                case 87: goto L_0x0a49;
                default: goto L_0x0a33;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0a33:
            goto L_0x0a4f
        L_0x0a34:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a4f
        L_0x0a3b:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a4f
        L_0x0a42:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a4f
        L_0x0a49:
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0a4f:
            int r3 = r3 + 1
            goto L_0x0a22
        L_0x0a52:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0a58:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0aba
            X.BNL r2 = new X.BNL     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0F(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
        L_0x0a68:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 >= r0) goto L_0x0cd5
            java.lang.String r5 = A04(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r4 = A00(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 11
            if (r4 == r0) goto L_0x0a7b
            goto L_0x0a82
        L_0x0a7b:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a89
        L_0x0a82:
            r0 = 12
            if (r4 == r0) goto L_0x0ab3
            switch(r4) {
                case 6: goto L_0x0a8c;
                case 7: goto L_0x0a93;
                case 49: goto L_0x0a9a;
                default: goto L_0x0a89;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0a89:
            int r3 = r3 + 1
            goto L_0x0a68
        L_0x0a8c:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a89
        L_0x0a93:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a89
        L_0x0a9a:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r4 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0a89
            java.lang.String r0 = "Invalid <radialGradient> element. r cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0ab3:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0a89
        L_0x0aba:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0ac0:
            X.E7L r3 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 == 0) goto L_0x0b41
            boolean r0 = r3 instanceof X.C22744BNh     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0b39
            X.BNg r2 = new X.BNg     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r3, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x0ad1:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x0b30
            java.lang.String r3 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 39
            if (r5 != r0) goto L_0x0b13
            int r6 = r3.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r6 == 0) goto L_0x0b28
            r7 = 1
            int r0 = r6 - r9
            char r5 = r3.charAt(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 37
            if (r5 != r0) goto L_0x0af7
            int r6 = r6 + -1
            goto L_0x0af8
        L_0x0af7:
            r7 = 0
        L_0x0af8:
            float r6 = X.C26296Cx9.A01(r3, r6)     // Catch:{ NumberFormatException -> 0x0b16 }
            r5 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x0b01
            float r6 = r6 / r5
        L_0x0b01:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b08
            r5 = 0
            goto L_0x0b0d
        L_0x0b08:
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0b0d
            r5 = r6
        L_0x0b0d:
            java.lang.Float r0 = java.lang.Float.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0b16 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0b13:
            int r4 = r4 + 1
            goto L_0x0ad1
        L_0x0b16:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = "Invalid offset value in <stop>: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E05 r1 = new X.E05     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r1.<init>(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0b28:
            java.lang.String r0 = "Invalid offset value in <stop> (empty string)"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0b30:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0b39:
            java.lang.String r0 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0b41:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0b47:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0b92
            X.BNU r2 = new X.BNU     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 0
        L_0x0b5a:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 >= r0) goto L_0x0cd5
            java.lang.String r4 = A04(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 3
            if (r5 != r0) goto L_0x0b87
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0b7a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0b77:
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0b87
        L_0x0b7a:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0b8a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0b77
        L_0x0b87:
            int r3 = r3 + 1
            goto L_0x0b5a
        L_0x0b8a:
            java.lang.String r0 = "Invalid value for attribute clipPathUnits"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0b92:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0b98:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0bf4
            X.BNv r3 = new X.BNv     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2 = 0
        L_0x0ba8:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 >= r0) goto L_0x0bda
            java.lang.String r4 = A04(r1, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 26
            if (r5 == r0) goto L_0x0bc5
            r0 = 61
            if (r5 != r0) goto L_0x0bd7
            X.DS0 r0 = X.C26296Cx9.A08(r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0bd7
        L_0x0bc5:
            java.lang.String r0 = ""
            boolean r0 = A06(r1, r0, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0bd5
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A06(r1, r0, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0bd7
        L_0x0bd5:
            r3.A02 = r4     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0bd7:
            int r2 = r2 + 1
            goto L_0x0ba8
        L_0x0bda:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.E7L r2 = r3.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r2 instanceof X.C22759BNw     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0bed
            X.BNw r2 = (X.C22759BNw) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0be9:
            r3.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0bed:
            X.E3t r2 = (X.C28489E3t) r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.BNw r2 = r2.BaI()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0be9
        L_0x0bf4:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0bfa:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0cde
            X.BNo r2 = new X.BNo     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0M(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0c11:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x0cd5
            java.lang.String r5 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r7 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 82
            if (r7 == r0) goto L_0x0cbb
            r0 = 83
            if (r7 == r0) goto L_0x0cb4
            r0 = 81
            if (r7 == r0) goto L_0x0c9b
            r0 = 25
            if (r7 == r0) goto L_0x0c82
            r0 = 26
            if (r7 == r0) goto L_0x0c6f
            java.lang.String r6 = "userSpaceOnUse"
            java.lang.String r0 = "objectBoundingBox"
            switch(r7) {
                case 44: goto L_0x0c52;
                case 45: goto L_0x0c68;
                case 46: goto L_0x0c3c;
                default: goto L_0x0c3a;
            }     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0c3a:
            goto L_0x0cc1
        L_0x0c3c:
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0c45
            r2.A06 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0c45:
            boolean r0 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0cc5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A06 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0c52:
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0c5b
            r2.A05 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0c5b:
            boolean r0 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0ccd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0c68:
            android.graphics.Matrix r0 = X.C26296Cx9.A05(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0c6f:
            java.lang.String r0 = ""
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0c7f
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0cc1
        L_0x0c7f:
            r2.A07 = r5     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0c82:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r5 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0cc1
            java.lang.String r0 = "Invalid <pattern> element. height cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0c9b:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r5 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0cc1
            java.lang.String r0 = "Invalid <pattern> element. width cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0cb4:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0cc1
        L_0x0cbb:
            X.DS0 r0 = X.C26296Cx9.A08(r5)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0cc1:
            int r4 = r4 + 1
            goto L_0x0c11
        L_0x0cc5:
            java.lang.String r0 = "Invalid value for attribute patternUnits"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0ccd:
            java.lang.String r0 = "Invalid value for attribute patternContentUnits"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0cd5:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0cde:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0ce4:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0d75
            X.BNq r3 = new X.BNq     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0G(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4 = 0
        L_0x0cf7:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r4 >= r0) goto L_0x0e85
            java.lang.String r2 = A04(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 82
            if (r5 == r0) goto L_0x0d6c
            r0 = 83
            if (r5 == r0) goto L_0x0d65
            r0 = 81
            if (r5 == r0) goto L_0x0d4d
            r0 = 25
            if (r5 == r0) goto L_0x0d34
            r0 = 26
            if (r5 == r0) goto L_0x0d21
            r0 = 48
            if (r5 != r0) goto L_0x0d72
            X.C26296Cx9.A0L(r3, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0d72
        L_0x0d21:
            java.lang.String r0 = ""
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0d31
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A06(r1, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0d72
        L_0x0d31:
            r3.A05 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0d72
        L_0x0d34:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0d72
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0d4d:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0d72
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0d65:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0d72
        L_0x0d6c:
            X.DS0 r0 = X.C26296Cx9.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0d72:
            int r4 = r4 + 1
            goto L_0x0cf7
        L_0x0d75:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0d7a:
            X.E7L r3 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r3 == 0) goto L_0x0d93
            X.BNs r2 = new X.BNs     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.Cw7 r0 = r11.A02     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.A00 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0J(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0d8c:
            X.C26296Cx9.A0I(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0M(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0da4
        L_0x0d93:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0d98:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0dad
            X.BNf r2 = new X.BNf     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0da4:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0dad:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0db2:
            r11.A07 = r9     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A03 = r2     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0db8:
            r11.A08 = r9     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0dbc:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0dc1:
            X.DS0 r0 = X.C26296Cx9.A08(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0dd9
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0dd8:
            throw r1     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0dd9:
            int r8 = r8 + 1
            goto L_0x0df0
        L_0x0ddc:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0e7f
            X.BNa r3 = new X.BNa     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            A05(r0, r3, r11, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.C26296Cx9.A0I(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0df0:
            int r0 = r1.getLength()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r8 >= r0) goto L_0x0e85
            java.lang.String r6 = A04(r1, r8)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            int r5 = A00(r1, r8)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 82
            if (r5 == r0) goto L_0x0e67
            r0 = 83
            if (r5 == r0) goto L_0x0e5f
            r0 = 81
            if (r5 == r0) goto L_0x0e46
            r0 = 25
            if (r5 == r0) goto L_0x0dc1
            r0 = 37
            java.lang.String r4 = "userSpaceOnUse"
            java.lang.String r2 = "objectBoundingBox"
            if (r5 == r0) goto L_0x0e30
            r0 = 36
            if (r5 != r0) goto L_0x0dd9
            boolean r0 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0e23
            r3.A04 = r7     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd9
        L_0x0e23:
            boolean r0 = r4.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0e6f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd9
        L_0x0e30:
            boolean r0 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0e39
            r3.A05 = r7     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd9
        L_0x0e39:
            boolean r0 = r4.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0e77
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd9
        L_0x0e46:
            X.DS0 r0 = X.C26296Cx9.A08(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0dd9
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0e5f:
            X.DS0 r0 = X.C26296Cx9.A08(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd9
        L_0x0e67:
            X.DS0 r0 = X.C26296Cx9.A08(r6)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd9
        L_0x0e6f:
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0e77:
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            X.E05 r1 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0e7f:
            X.E05 r1 = A03()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0dd8
        L_0x0e85:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.BB4(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0e8d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = "PROC INSTR: "
            r2.append(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r27.getText()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = r24
            android.util.Log.d(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r27.getText()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            X.CnG r5 = new X.CnG     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r5.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0 = 32
            r5.A0C(r0, r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r5.A0D()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r3 = 61
        L_0x0eba:
            java.lang.String r2 = r5.A0C(r3, r10)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r2 == 0) goto L_0x0ef3
            r5.A0F(r3)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.String r0 = r5.A0B()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r4.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r5.A0D()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0eba
        L_0x0ece:
            X.Cw7 r0 = new X.Cw7     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0ed6:
            java.lang.String r2 = r27.getText()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0ef3
            boolean r0 = r11.A07     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0ef9
            java.lang.StringBuilder r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0ef0
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.StringBuilder r0 = X.BE6.A0t(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0ef0:
            r0.append(r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0ef3:
            int r3 = r27.nextToken()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0072
        L_0x0ef9:
            boolean r0 = r11.A08     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0f0c
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 != 0) goto L_0x0ef0
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            java.lang.StringBuilder r0 = X.BE6.A0t(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            r11.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef0
        L_0x0f0c:
            X.E7L r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            boolean r0 = r0 instanceof X.BNX     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            if (r0 == 0) goto L_0x0ef3
            X.C26296Cx9.A0O(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            goto L_0x0ef3
        L_0x0f16:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.E05 r0 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0f1d:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.E05 r0 = X.E05.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0f3e, IOException -> 0x0f35 }
        L_0x0f24:
            r26.close()     // Catch:{ IOException -> 0x0f28 }
            goto L_0x0f2f
        L_0x0f28:
            r1 = r25
            r0 = r24
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0f54 }
        L_0x0f2f:
            X.Cw7 r0 = r11.A02     // Catch:{ all -> 0x0f54 }
            r23.close()     // Catch:{ IOException -> 0x0f34 }
        L_0x0f34:
            return r0
        L_0x0f35:
            r1 = move-exception
            java.lang.String r0 = "Stream error"
            X.E05 r2 = new X.E05     // Catch:{ all -> 0x0f47 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0f47 }
            goto L_0x0f46
        L_0x0f3e:
            r1 = move-exception
            java.lang.String r0 = "XML parser problem"
            X.E05 r2 = new X.E05     // Catch:{ all -> 0x0f47 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0f47 }
        L_0x0f46:
            throw r2     // Catch:{ all -> 0x0f47 }
        L_0x0f47:
            r2 = move-exception
            r26.close()     // Catch:{ IOException -> 0x0f4c }
            goto L_0x0f53
        L_0x0f4c:
            r1 = r25
            r0 = r24
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0f54 }
        L_0x0f53:
            throw r2     // Catch:{ all -> 0x0f54 }
        L_0x0f54:
            r0 = move-exception
            r23.close()     // Catch:{ IOException -> 0x0f58 }
        L_0x0f58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26262Cw7.A02(android.content.res.AssetManager, java.lang.String):X.Cw7");
    }

    public static E05 A03() {
        return new E05("Invalid document. Root element must be <svg>");
    }

    public static void A05(E7L e7l, C22761BNy bNy, C26296Cx9 cx9, Attributes attributes) {
        bNy.A01 = cx9.A02;
        bNy.A00 = e7l;
        C26296Cx9.A0J(bNy, attributes);
        C26296Cx9.A0K(bNy, attributes);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r7 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A07(X.CSD r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0025
            X.Cjy r5 = r7.A02
            if (r5 == 0) goto L_0x0025
        L_0x0006:
            X.Cjy r3 = r7.A03
            if (r3 == 0) goto L_0x002c
            float r1 = r3.A01
            float r0 = r3.A03
            float r1 = r1 + r0
            float r2 = r3.A02
            float r0 = r3.A00
            float r2 = r2 + r0
        L_0x0014:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            android.graphics.Picture r0 = r6.A08(r7, r3, r0)
            return r0
        L_0x0025:
            X.BNm r0 = r6.A01
            X.Cjy r5 = r0.A00
            if (r7 == 0) goto L_0x002c
            goto L_0x0006
        L_0x002c:
            X.BNm r4 = r6.A01
            X.DS0 r3 = r4.A01
            if (r3 == 0) goto L_0x0056
            java.lang.Integer r0 = r3.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A18
            if (r0 == r1) goto L_0x0049
            X.DS0 r2 = r4.A00
            if (r2 == 0) goto L_0x0049
            java.lang.Integer r0 = r2.A01
            if (r0 == r1) goto L_0x0049
            float r1 = r3.A00()
            float r2 = r2.A00()
            goto L_0x0014
        L_0x0049:
            if (r5 == 0) goto L_0x0056
            float r1 = r3.A00()
            float r2 = r5.A00
            float r2 = r2 * r1
            float r0 = r5.A03
            float r2 = r2 / r0
            goto L_0x0014
        L_0x0056:
            X.DS0 r0 = r4.A00
            if (r0 == 0) goto L_0x0067
            if (r5 == 0) goto L_0x0067
            float r2 = r0.A00()
            float r1 = r5.A03
            float r1 = r1 * r2
            float r0 = r5.A00
            float r1 = r1 / r0
            goto L_0x0014
        L_0x0067:
            r0 = 512(0x200, float:7.175E-43)
            android.graphics.Picture r0 = r6.A08(r7, r0, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26262Cw7.A07(X.CSD):android.graphics.Picture");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.CxN] */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.CSD, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A08(X.CSD r11, int r12, int r13) {
        /*
            r10 = this;
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r5 = r3.beginRecording(r12, r13)
            if (r11 == 0) goto L_0x013d
            X.Cjy r0 = r11.A03
            if (r0 != 0) goto L_0x003e
            X.CSD r1 = new X.CSD
            r1.<init>()
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
            r1.A02 = r0
            r1.A04 = r0
            r1.A03 = r0
            X.CZd r0 = r11.A00
            r1.A00 = r0
            X.CYV r0 = r11.A01
            r1.A01 = r0
            X.Cjy r0 = r11.A02
            r1.A02 = r0
            java.lang.String r0 = r11.A04
            r1.A04 = r0
            X.Cjy r0 = r11.A03
            r1.A03 = r0
            r11 = r1
        L_0x0034:
            float r4 = (float) r12
            float r2 = (float) r13
            r1 = 0
            X.Cjy r0 = new X.Cjy
            r0.<init>(r1, r1, r4, r2)
            r11.A03 = r0
        L_0x003e:
            X.CxN r7 = new X.CxN
            r7.<init>()
            r7.A00 = r5
            r7.A01 = r10
            X.BNm r6 = r10.A01
            r8 = 0
            if (r6 != 0) goto L_0x0059
            java.lang.String r2 = "Nothing to render. Document is empty."
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = "SVGAndroidRenderer"
            X.BE7.A1M(r2, r0, r1)
        L_0x0055:
            r3.endRecording()
            return r3
        L_0x0059:
            java.lang.String r9 = r11.A04
            if (r9 == 0) goto L_0x0081
            X.BNy r4 = r10.A09(r9)
            r1 = 1
            java.lang.String r2 = "SVGAndroidRenderer"
            if (r4 == 0) goto L_0x007a
            boolean r0 = r4 instanceof X.C22755BNs
            if (r0 == 0) goto L_0x007a
            X.BNp r4 = (X.C22752BNp) r4
            X.Cjy r5 = r4.A00
            if (r5 != 0) goto L_0x008e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" is missing a viewBox attribute."
        L_0x0076:
            X.BE7.A1M(r0, r2, r1)
            goto L_0x0055
        L_0x007a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" not found."
            goto L_0x0076
        L_0x0081:
            X.Cjy r5 = r11.A02
            if (r5 != 0) goto L_0x0087
            X.Cjy r5 = r6.A00
        L_0x0087:
            X.CYV r4 = r11.A01
            if (r4 != 0) goto L_0x0090
            X.CYV r4 = r6.A00
            goto L_0x0090
        L_0x008e:
            X.CYV r4 = r4.A00
        L_0x0090:
            X.CZd r0 = r11.A00
            if (r0 == 0) goto L_0x00a5
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00a5
            X.CZd r1 = r11.A00
            X.CZd r0 = r10.A00
            r0.A01(r1)
        L_0x00a5:
            X.Ciu r0 = new X.Ciu
            r0.<init>(r7)
            r7.A02 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A05 = r0
            X.Ciu r1 = r7.A02
            X.DS2 r0 = X.DS2.A00()
            X.C26304CxN.A0V(r0, r1, r7)
            X.Ciu r2 = r7.A02
            r0 = 0
            r2.A03 = r0
            r2.A07 = r8
            java.util.Stack r1 = r7.A05
            X.Ciu r0 = new X.Ciu
            r0.<init>(r2, r7)
            r1.push(r0)
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A03 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A04 = r0
            java.lang.Boolean r0 = r6.A02
            if (r0 == 0) goto L_0x00e7
            X.Ciu r1 = r7.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x00e7:
            X.C26304CxN.A0j(r7)
            X.Cjy r0 = r11.A03
            X.Cjy r2 = new X.Cjy
            r2.<init>(r0)
            X.DS0 r1 = r6.A01
            if (r1 == 0) goto L_0x00fd
            float r0 = r2.A03
            float r0 = r1.A04(r7, r0)
            r2.A03 = r0
        L_0x00fd:
            X.DS0 r1 = r6.A00
            if (r1 == 0) goto L_0x0109
            float r0 = r2.A00
            float r0 = r1.A04(r7, r0)
            r2.A00 = r0
        L_0x0109:
            X.C26304CxN.A0L(r4, r2, r5, r6, r7)
            X.C26304CxN.A0i(r7)
            X.CZd r0 = r11.A00
            if (r0 == 0) goto L_0x0055
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0055
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0055
            X.CZd r0 = r10.A00
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0055
            java.util.Iterator r1 = r0.iterator()
        L_0x0129:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r1.next()
            X.C63 r0 = (X.C63) r0
            java.lang.Integer r0 = r0.A02
            if (r0 != r2) goto L_0x0129
            r1.remove()
            goto L_0x0129
        L_0x013d:
            X.CSD r11 = new X.CSD
            r11.<init>()
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26262Cw7.A08(X.CSD, int, int):android.graphics.Picture");
    }

    public C22761BNy A09(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C22749BNm bNm = this.A01;
        if (str.equals(bNm.A03)) {
            return bNm;
        }
        Map map = this.A02;
        if (map.containsKey(str)) {
            return (C22761BNy) map.get(str);
        }
        C22761BNy A012 = A01(this.A01, str);
        map.put(str, A012);
        return A012;
    }

    public static int A00(DZT dzt, int i) {
        C0I c0i = (C0I) C0I.A00.get(dzt.getLocalName(i));
        if (c0i == null) {
            c0i = C0I.A03;
        }
        return c0i.ordinal();
    }

    public static String A04(DZT dzt, int i) {
        return dzt.getValue(i).trim();
    }

    public static boolean A06(DZT dzt, String str, int i) {
        return str.equals(dzt.getURI(i));
    }
}
