package X;

/* renamed from: X.6yH  reason: invalid class name and case insensitive filesystem */
public class C139136yH {
    public int A00 = 0;
    public String A01;
    public StringBuilder A02;
    public final AnonymousClass1LA A03;
    public final C18000vb A04;

    public C139136yH(AnonymousClass1LA r2, C18000vb r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public static void A00(String str, StringBuilder sb, C139136yH r2) {
        sb.append(str);
        sb.append(r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c2, code lost:
        if (r10.trim().equals("") != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0271, code lost:
        if (r9.trim().equals("") != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0312, code lost:
        if (r8.trim().equals("") != false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r1 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0187, code lost:
        if (r0 != -1) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.AnonymousClass73C r13) {
        /*
            r12 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r12.A02 = r2
            X.6oE r3 = r13.A0A
            java.lang.String r1 = r3.A01
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = ""
            r3.A01 = r1
        L_0x0010:
            java.lang.String r8 = "\n"
            r12.A01 = r8
            java.lang.String r0 = "BEGIN:VCARD"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "VERSION:3.0"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "N:"
            r2.append(r0)
            java.lang.String r0 = r3.A00
            java.lang.String r6 = ";"
            if (r0 == 0) goto L_0x0032
            r2.append(r0)
        L_0x0032:
            r2.append(r6)
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x003c
            r2.append(r0)
        L_0x003c:
            r2.append(r6)
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0046
            r2.append(r0)
        L_0x0046:
            r2.append(r6)
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0050
            r2.append(r0)
        L_0x0050:
            r2.append(r6)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x005a
            r2.append(r0)
        L_0x005a:
            r2.append(r8)
            java.lang.String r0 = "FN:"
            X.C17890vO.A10(r0, r1, r8, r2)
            java.util.Map r0 = r13.A08
            r5 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.String r2 = "NICKNAME"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "NICKNAME:"
            r1.append(r0)
            X.6tl r0 = X.C108995ce.A0i(r2, r13)
            java.lang.String r0 = r0.A02
            A00(r0, r1, r12)
        L_0x007f:
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x008d
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME:"
            r1.append(r0)
            A00(r2, r1, r12)
        L_0x008d:
            java.lang.String r2 = r3.A05
            if (r2 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-PHONETIC-LAST-NAME:"
            r1.append(r0)
            A00(r2, r1, r12)
        L_0x009b:
            java.util.List r0 = r13.A05
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d1
            java.util.List r0 = r13.A05
            java.lang.Object r0 = r0.get(r5)
            X.6fb r0 = (X.C128196fb) r0
            java.lang.String r4 = r0.A00
            java.util.List r0 = r13.A05
            java.lang.Object r0 = r0.get(r5)
            X.6fb r0 = (X.C128196fb) r0
            java.lang.String r2 = r0.A01
            if (r4 == 0) goto L_0x00c5
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "ORG:"
            r1.append(r0)
            A00(r4, r1, r12)
        L_0x00c5:
            if (r2 == 0) goto L_0x00d1
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "TITLE:"
            r1.append(r0)
            A00(r2, r1, r12)
        L_0x00d1:
            java.util.List r2 = r13.A04
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x011b
            java.lang.String r0 = X.C17880vN.A0w(r2, r5)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ed
        L_0x00ec:
            r0 = 1
        L_0x00ed:
            if (r0 != 0) goto L_0x011b
            java.lang.StringBuilder r7 = r12.A02
            java.lang.String r0 = "NOTE:"
            r7.append(r0)
            java.lang.String r10 = X.C17880vN.A0w(r2, r5)
            java.lang.String r9 = "\r\n"
            boolean r0 = r10.endsWith(r9)
            r4 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L_0x0196
            int r0 = r10.length()
            int r0 = r0 - r1
        L_0x010a:
            java.lang.String r0 = r10.substring(r5, r0)
            java.lang.String r1 = r0.replaceAll(r9, r8)
            java.lang.String r0 = "\n "
            java.lang.String r2 = r1.replaceAll(r8, r0)
        L_0x0118:
            A00(r2, r7, r12)
        L_0x011b:
            java.util.List r0 = r13.A06
            if (r0 == 0) goto L_0x024e
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.Iterator r11 = r0.iterator()
        L_0x0127:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r7 = r11.next()
            X.6ib r7 = (X.C129926ib) r7
            java.lang.String r0 = r7.A02
            boolean r1 = r4.containsKey(r0)
            java.lang.String r0 = r7.A02
            if (r1 == 0) goto L_0x0192
            java.lang.Object r2 = r4.get(r0)
            X.6ib r2 = (X.C129926ib) r2
            int r0 = r2.A00
            r8 = 1
            r1 = -1
            if (r0 != r1) goto L_0x0183
            int r0 = r7.A00
            if (r0 != r1) goto L_0x0189
            r2.A00 = r8
        L_0x014f:
            java.lang.String r10 = r2.A03
            java.lang.String r9 = "null"
            if (r10 == 0) goto L_0x015b
            boolean r0 = r10.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0167
        L_0x015b:
            java.lang.String r1 = r7.A03
            if (r1 == 0) goto L_0x017c
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x017c
            r2.A03 = r1
        L_0x0167:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x016f
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0171
        L_0x016f:
            r2.A04 = r8
        L_0x0171:
            com.whatsapp.jid.UserJid r0 = r2.A01
            if (r0 != 0) goto L_0x0127
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x0127
            r2.A01 = r0
            goto L_0x0127
        L_0x017c:
            if (r10 != 0) goto L_0x0167
            java.lang.String r0 = "HOME"
            r2.A03 = r0
            goto L_0x0167
        L_0x0183:
            if (r0 != 0) goto L_0x014f
            int r0 = r7.A00
            if (r0 == r1) goto L_0x014f
        L_0x0189:
            r2.A00 = r0
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = r7.A03
            r2.A03 = r0
            goto L_0x014f
        L_0x0192:
            r4.put(r0, r7)
            goto L_0x0127
        L_0x0196:
            boolean r0 = r10.endsWith(r8)
            if (r0 == 0) goto L_0x0118
            int r0 = r10.length()
            int r0 = r0 - r4
            goto L_0x010a
        L_0x01a3:
            java.util.Iterator r11 = X.C17890vO.A0j(r4)
        L_0x01a7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x024e
            java.lang.Object r7 = r11.next()
            X.6ib r7 = (X.C129926ib) r7
            java.lang.String r10 = r7.A02
            if (r10 == 0) goto L_0x01c4
            java.lang.String r1 = r10.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x01c5
        L_0x01c4:
            r0 = 1
        L_0x01c5:
            if (r0 != 0) goto L_0x01a7
            int r0 = r7.A00
            r4 = 58
            if (r0 != 0) goto L_0x0211
            int r0 = r12.A00
            int r9 = r0 + 1
            r12.A00 = r9
            java.lang.StringBuilder r8 = r12.A02
            java.lang.String r2 = "item"
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".TEL"
            r8.append(r0)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x01f2
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x01f2
            java.lang.String r0 = ";waid="
            r8.append(r0)
            r8.append(r1)
        L_0x01f2:
            r8.append(r4)
            r8.append(r10)
            java.lang.String r1 = r12.A01
            r8.append(r1)
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".X-ABLabel:"
            r8.append(r0)
            java.lang.String r0 = r7.A03
            r8.append(r0)
            r8.append(r1)
            goto L_0x01a7
        L_0x0211:
            X.0vb r1 = r12.A04
            int r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r0)
            java.lang.String r8 = r1.A0A(r0)
            r2 = 59
            int r1 = r8.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x022a
            r0 = 44
            java.lang.String r8 = r8.replace(r2, r0)
        L_0x022a:
            java.lang.StringBuilder r2 = r12.A02
            java.lang.String r0 = "TEL;type="
            r2.append(r0)
            r2.append(r8)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x0244
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x0244
            java.lang.String r0 = ";waid="
            r2.append(r0)
            r2.append(r1)
        L_0x0244:
            r2.append(r4)
            java.lang.String r0 = r7.A02
            A00(r0, r2, r12)
            goto L_0x01a7
        L_0x024e:
            java.util.List r0 = r13.A07
            if (r0 == 0) goto L_0x02e9
            java.util.Iterator r10 = r0.iterator()
        L_0x0256:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02e9
            java.lang.Object r4 = r10.next()
            X.6fc r4 = (X.C128206fc) r4
            java.lang.String r9 = r4.A01
            if (r9 == 0) goto L_0x0273
            java.lang.String r1 = r9.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0274
        L_0x0273:
            r0 = 1
        L_0x0274:
            if (r0 != 0) goto L_0x0256
            int r7 = r4.A00
            r2 = 2
            r0 = 4
            r1 = 1
            if (r7 == r0) goto L_0x02c1
            r0 = 5
            if (r7 == r0) goto L_0x02c4
            if (r7 == r1) goto L_0x02be
            if (r7 == r2) goto L_0x02bb
            r0 = 3
            if (r7 == r0) goto L_0x02b8
            r0 = 6
            if (r7 == r0) goto L_0x02b5
            java.lang.String r8 = "OTHER"
        L_0x028c:
            int r0 = r12.A00
            int r7 = r0 + 1
            r12.A00 = r7
            java.lang.StringBuilder r4 = r12.A02
            java.lang.String r2 = "item"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".URL:"
            r4.append(r0)
            r4.append(r9)
            java.lang.String r1 = r12.A01
            r4.append(r1)
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            X.C17890vO.A10(r0, r8, r1, r4)
            goto L_0x0256
        L_0x02b5:
            java.lang.String r8 = "FTP"
            goto L_0x028c
        L_0x02b8:
            java.lang.String r8 = "PROFILE"
            goto L_0x028c
        L_0x02bb:
            java.lang.String r8 = "BLOG"
            goto L_0x028c
        L_0x02be:
            java.lang.String r8 = "HOMEPAGE"
            goto L_0x028c
        L_0x02c1:
            java.lang.String r2 = "HOME"
            goto L_0x02c6
        L_0x02c4:
            java.lang.String r2 = "WORK"
        L_0x02c6:
            int r1 = r2.indexOf(r6)
            r0 = -1
            if (r1 == r0) goto L_0x02d3
            java.lang.String r0 = ","
            java.lang.String r2 = r2.replace(r6, r0)
        L_0x02d3:
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "URL;type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r4.A01
            A00(r0, r1, r12)
            goto L_0x0256
        L_0x02e9:
            java.util.List r0 = r13.A03
            if (r0 == 0) goto L_0x0425
            java.util.Iterator r11 = r0.iterator()
        L_0x02f1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0425
            java.lang.Object r10 = r11.next()
            X.6jA r10 = (X.C130276jA) r10
            java.lang.Class r1 = r10.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x034c
            java.lang.String r8 = r10.A02
            if (r8 == 0) goto L_0x0314
            java.lang.String r1 = r8.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0315
        L_0x0314:
            r0 = 1
        L_0x0315:
            if (r0 != 0) goto L_0x02f1
            int r0 = r10.A00
            if (r0 != 0) goto L_0x03f9
            int r0 = r12.A00
            int r7 = r0 + 1
            r12.A00 = r7
            java.lang.StringBuilder r4 = r12.A02
            java.lang.String r2 = "item"
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".EMAIL;type=INTERNET:"
            r4.append(r0)
            r4.append(r8)
            java.lang.String r1 = r12.A01
            r4.append(r1)
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            r4.append(r0)
            java.lang.String r0 = r10.A03
            r4.append(r0)
            r4.append(r1)
            goto L_0x02f1
        L_0x034c:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x02f1
            int r0 = r12.A00
            int r7 = r0 + 1
            r12.A00 = r7
            X.6z2 r1 = r10.A04
            if (r1 == 0) goto L_0x041e
            int r0 = r10.A00
            java.lang.String r2 = "vcardcomposer/appendwapostalstr failed isoFromNativeName"
            java.lang.String r9 = ".X-ABADR:"
            java.lang.String r8 = "item"
            if (r0 != 0) goto L_0x03b1
            java.lang.StringBuilder r4 = r12.A02
            r4.append(r8)
            r4.append(r7)
            java.lang.String r0 = ".ADR:;;"
            r4.append(r0)
            java.lang.String r0 = r1.A01()
            A00(r0, r4, r12)
            X.AnonymousClass000.A1E(r8, r9, r4, r7)
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x0393
            X.1LA r0 = r12.A03     // Catch:{ IOException -> 0x038f }
            java.lang.String r1 = r0.A05(r1)     // Catch:{ IOException -> 0x038f }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x038f }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x038f }
            r4.append(r0)     // Catch:{ IOException -> 0x038f }
            goto L_0x0393
        L_0x038f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x0393:
            java.lang.StringBuilder r2 = r12.A02
            java.lang.String r1 = r12.A01
            r2.append(r1)
            r2.append(r8)
            int r0 = r12.A00
            r2.append(r0)
            java.lang.String r0 = ".X-ABLabel:"
            r2.append(r0)
            java.lang.String r0 = r10.A03
            r2.append(r0)
            r2.append(r1)
            goto L_0x02f1
        L_0x03b1:
            X.0vb r1 = r12.A04
            int r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(r0)
            java.lang.String r1 = r1.A0A(r0)
            java.lang.StringBuilder r4 = r12.A02
            r4.append(r8)
            int r7 = r12.A00
            r4.append(r7)
            java.lang.String r0 = ".ADR;type="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ":;;"
            r4.append(r0)
            X.6z2 r1 = r10.A04
            java.lang.String r0 = r1.A01()
            A00(r0, r4, r12)
            X.AnonymousClass000.A1E(r8, r9, r4, r7)
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x03f6
            X.1LA r0 = r12.A03     // Catch:{ IOException -> 0x03f2 }
            java.lang.String r1 = r0.A05(r1)     // Catch:{ IOException -> 0x03f2 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x03f2 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x03f2 }
            r4.append(r0)     // Catch:{ IOException -> 0x03f2 }
            goto L_0x03f6
        L_0x03f2:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x03f6:
            java.lang.StringBuilder r1 = r12.A02
            goto L_0x0417
        L_0x03f9:
            X.0vb r1 = r12.A04
            int r0 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(r0)
            java.lang.String r2 = r1.A0A(r0)
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "EMAIL;TYPE="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r10.A02
            r1.append(r0)
        L_0x0417:
            java.lang.String r0 = r12.A01
            r1.append(r0)
            goto L_0x02f1
        L_0x041e:
            java.lang.String r0 = "appendWAPostalStr addr_data is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02f1
        L_0x0425:
            java.util.Map r0 = r13.A08
            if (r0 == 0) goto L_0x0441
            java.lang.String r2 = "BDAY"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0441
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "BDAY;value=date:"
            r1.append(r0)
            X.6tl r0 = X.C108995ce.A0i(r2, r13)
            java.lang.String r0 = r0.A02
            A00(r0, r1, r12)
        L_0x0441:
            java.util.Map r0 = r13.A08
            if (r0 == 0) goto L_0x0496
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x044d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0496
            java.lang.String r1 = X.C17880vN.A0v(r8)
            java.util.HashMap r0 = X.AnonymousClass73C.A0E
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x044d
            X.6tl r7 = X.C108995ce.A0i(r1, r13)
            java.lang.StringBuilder r0 = r12.A02
            r0.append(r1)
            r0.append(r6)
            java.util.Set r4 = r7.A04
            java.lang.String r2 = ":"
            int r0 = r4.size()
            java.lang.StringBuilder r1 = r12.A02
            if (r0 <= 0) goto L_0x0490
            java.lang.String r0 = "type="
            r1.append(r0)
            java.lang.Object[] r0 = r4.toArray()
            r0 = r0[r5]
            r1.append(r0)
        L_0x0485:
            r1.append(r2)
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = r7.A02
            A00(r0, r1, r12)
            goto L_0x044d
        L_0x0490:
            java.lang.String r0 = "type=HOME"
            r1.append(r0)
            goto L_0x0485
        L_0x0496:
            byte[] r2 = r13.A0B
            if (r2 == 0) goto L_0x04a8
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "PHOTO;BASE64:"
            r1.append(r0)
            java.lang.String r0 = X.C108955ca.A14(r2)
            A00(r0, r1, r12)
        L_0x04a8:
            java.lang.String r0 = r3.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04ff
            java.lang.String r0 = r13.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04cd
            java.lang.StringBuilder r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION:"
            r1.append(r0)
            java.lang.String r0 = r13.A02
            X.C108985cd.A1L(r0, r1, r2)
            java.lang.String r0 = r12.A01
            r2.append(r0)
        L_0x04cd:
            java.lang.String r0 = r13.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04ea
            java.lang.StringBuilder r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "X-WA-BIZ-AUTOMATED-TYPE:"
            r1.append(r0)
            java.lang.String r0 = r13.A00
            X.C108985cd.A1L(r0, r1, r2)
            java.lang.String r0 = r12.A01
            r2.append(r0)
        L_0x04ea:
            java.lang.StringBuilder r2 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "X-WA-BIZ-NAME:"
            r1.append(r0)
            java.lang.String r0 = r3.A08
            X.C108985cd.A1L(r0, r1, r2)
            java.lang.String r0 = r12.A01
            r2.append(r0)
        L_0x04ff:
            X.6fa r4 = r13.A09
            X.1E2 r2 = r4.A00
            java.lang.String r3 = ":"
            if (r2 == 0) goto L_0x0516
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-WA-LID"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r2.user
            A00(r0, r1, r12)
        L_0x0516:
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0526
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "X-WA-LID-DISPLAY-NAME"
            X.C17890vO.A10(r0, r3, r2, r1)
            java.lang.String r0 = r12.A01
            r1.append(r0)
        L_0x0526:
            java.lang.StringBuilder r1 = r12.A02
            java.lang.String r0 = "END:VCARD"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139136yH.A01(X.73C):java.lang.String");
    }
}
