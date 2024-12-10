package X;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: X.72O  reason: invalid class name */
public class AnonymousClass72O {
    public static final HashSet A0I;
    public static final HashSet A0J;
    public static final HashSet A0K;
    public static final Pattern A0L = Pattern.compile("type=(.*?)[:;]");
    public static final Pattern A0M = Pattern.compile("waid=(.*?)[:;]");
    public static final HashSet A0N;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public String A0B = null;
    public String A0C;
    public String A0D;
    public HashSet A0E = C17880vN.A12();
    public C133926pj A0F = null;
    public C1604388m A0G;
    public boolean A0H = false;

    static {
        String[] strArr = new String[50];
        strArr[0] = "DOM";
        strArr[1] = "INTL";
        strArr[2] = "POSTAL";
        strArr[3] = "PARCEL";
        strArr[4] = "HOME";
        strArr[5] = "WORK";
        strArr[6] = "PREF";
        strArr[7] = "VOICE";
        strArr[8] = "FAX";
        strArr[9] = "MSG";
        strArr[10] = "CELL";
        strArr[11] = "PAGER";
        strArr[12] = "BBS";
        strArr[13] = "MODEM";
        strArr[14] = "CAR";
        strArr[15] = "ISDN";
        strArr[16] = "VIDEO";
        strArr[17] = "AOL";
        strArr[18] = "APPLELINK";
        strArr[19] = "ATTMAIL";
        strArr[20] = "CIS";
        strArr[21] = "EWORLD";
        strArr[22] = "INTERNET";
        strArr[23] = "IBMMAIL";
        strArr[24] = "MCIMAIL";
        strArr[25] = "POWERSHARE";
        strArr[26] = "PRODIGY";
        strArr[27] = "TLX";
        strArr[28] = "X400";
        strArr[29] = "GIF";
        strArr[30] = "CGM";
        strArr[31] = "WMF";
        strArr[32] = "BMP";
        strArr[33] = "MET";
        strArr[34] = "PMB";
        strArr[35] = "DIB";
        strArr[36] = "PICT";
        strArr[37] = "TIFF";
        strArr[38] = "PDF";
        strArr[39] = "PS";
        strArr[40] = "JPEG";
        strArr[41] = "QTIME";
        strArr[42] = "MPEG";
        strArr[43] = "MPEG2";
        strArr[44] = "AVI";
        strArr[45] = "WAVE";
        strArr[46] = "AIFF";
        strArr[47] = "PCM";
        strArr[48] = "X509";
        A0N = C17900vP.A0I("PGP", strArr, 49);
        String[] strArr2 = new String[4];
        strArr2[0] = "INLINE";
        strArr2[1] = "URL";
        strArr2[2] = "CONTENT-ID";
        A0K = C17900vP.A0I("CID", strArr2, 3);
        String[] strArr3 = new String[20];
        strArr3[0] = "BEGIN";
        strArr3[1] = "LOGO";
        strArr3[2] = "PHOTO";
        strArr3[3] = "LABEL";
        strArr3[4] = "FN";
        strArr3[5] = "TITLE";
        strArr3[6] = "SOUND";
        strArr3[7] = "VERSION";
        strArr3[8] = "TEL";
        strArr3[9] = "EMAIL";
        strArr3[10] = "TZ";
        strArr3[11] = "GEO";
        strArr3[12] = "NOTE";
        strArr3[13] = "URL";
        strArr3[14] = "BDAY";
        strArr3[15] = "ROLE";
        strArr3[16] = "REV";
        strArr3[17] = "UID";
        strArr3[18] = "KEY";
        A0J = C17900vP.A0I("MAILER", strArr3, 19);
        String[] strArr4 = new String[5];
        strArr4[0] = "7BIT";
        strArr4[1] = "8BIT";
        strArr4[2] = "QUOTED-PRINTABLE";
        strArr4[3] = "BASE64";
        A0I = C17900vP.A0I("B", strArr4, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r7, java.lang.String r8, X.AnonymousClass72O r9) {
        /*
            java.lang.String r0 = "."
            int r0 = r7.indexOf(r0)
            r5 = 1
            int r4 = r0 + 1
            r6 = 0
            if (r4 <= 0) goto L_0x0014
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x0015
            java.lang.String r3 = r9.A0C
            if (r3 != 0) goto L_0x0029
        L_0x0014:
            return r6
        L_0x0015:
            java.lang.String r3 = r9.A02()
            r9.A0C = r3
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = r3.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0014
            r9.A0H = r5
        L_0x0029:
            int r0 = r3.length()
            if (r0 <= r4) goto L_0x0014
            r2 = 0
            java.lang.String r1 = r7.substring(r2, r4)
            java.lang.String r0 = r3.substring(r2, r4)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            if (r8 == 0) goto L_0x0061
            int r0 = r4 + -1
            char r1 = r3.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x004b
            r5 = 0
        L_0x004b:
            X.C17960vV.A0D(r5)
            java.lang.String r0 = ":"
            int r0 = r3.lastIndexOf(r0)
            if (r0 < r4) goto L_0x0014
            java.lang.String r0 = r3.substring(r4, r0)
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0061
            return r6
        L_0x0061:
            r9.A0H = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72O.A00(java.lang.String, java.lang.String, X.72O):java.lang.String");
    }

    public String A01() {
        if (!(this instanceof AnonymousClass84X)) {
            return this.A0G.readLine();
        }
        AnonymousClass84X r2 = (AnonymousClass84X) this;
        String str = r2.A00;
        if (str == null) {
            return r2.A0G.readLine();
        }
        r2.A00 = null;
        return str;
    }

    public String A02() {
        StringBuilder sb;
        if (this instanceof AnonymousClass84X) {
            AnonymousClass84X r5 = (AnonymousClass84X) this;
            if (r5.A0H) {
                r5.A0H = false;
                return r5.A0C;
            }
            loop0:
            while (true) {
                sb = null;
                while (true) {
                    String readLine = r5.A0G.readLine();
                    if (readLine != null) {
                        int length = readLine.length();
                        if (length == 0 || length > 16384) {
                            if (sb != null) {
                                break loop0;
                            }
                            String str = r5.A00;
                            if (str != null) {
                                r5.A00 = null;
                                return str;
                            }
                        } else if (readLine.charAt(0) != ' ' && readLine.charAt(0) != 9) {
                            String str2 = r5.A00;
                            r5.A00 = readLine;
                            if (str2 != null) {
                                return str2;
                            }
                            if (sb != null) {
                                break loop0;
                            }
                        } else if (sb != null) {
                            sb.append(readLine.substring(1));
                            if (sb.length() > 16384) {
                                break;
                            }
                        } else {
                            String str3 = r5.A00;
                            if (str3 != null) {
                                sb = AnonymousClass000.A11(str3);
                                r5.A00 = null;
                                sb.append(readLine.substring(1));
                                if (sb.length() > 16384) {
                                    break;
                                }
                            } else {
                                throw new C33281iZ("Space exists at the beginning of the line");
                            }
                        }
                    } else if (sb == null) {
                        String str4 = r5.A00;
                        if (str4 != null) {
                            r5.A00 = null;
                            return str4;
                        }
                        throw new C33281iZ("Reached end of buffer.");
                    }
                }
            }
            return sb.toString();
        } else if (this.A0H) {
            this.A0H = false;
            return this.A0C;
        } else {
            String A012 = A01();
            if (A012 == null) {
                throw new C33281iZ("Reached end of buffer.");
            } else if (A012.length() >= 16384 || A012.trim().length() <= 0) {
                return A02();
            } else {
                return A012;
            }
        }
    }

    public void A04(String str) {
        String str2;
        C133926pj r0;
        boolean contains;
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String trim = split[0].trim();
            str2 = split[1].trim();
            if (!trim.equalsIgnoreCase(CredentialProviderBaseController.TYPE_TAG)) {
                if (trim.equals("VALUE")) {
                    if (A0K.contains(C108955ca.A0y(str2)) || str2.startsWith("X-")) {
                        r0 = this.A0F;
                        if (r0 != null) {
                            r0.A01 = "VALUE";
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Unknown value \"");
                        A10.append(str2);
                        throw new C33281iZ(AnonymousClass000.A0y("\"", A10));
                    }
                } else if (trim.equals("ENCODING")) {
                    if (this instanceof AnonymousClass84X) {
                        contains = AnonymousClass84X.A01.contains(C108955ca.A0y(str2));
                    } else {
                        contains = A0I.contains(C108955ca.A0y(str2));
                    }
                    if (contains || str2.startsWith("X-")) {
                        C133926pj r02 = this.A0F;
                        if (r02 != null) {
                            r02.A01 = "ENCODING";
                            r02.A00(str2);
                        }
                        this.A0B = str2;
                        return;
                    }
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Unknown encoding \"");
                    A102.append(str2);
                    throw new C33281iZ(AnonymousClass000.A0y("\"", A102));
                } else if (trim.equals("CHARSET")) {
                    r0 = this.A0F;
                    if (r0 != null) {
                        r0.A01 = "CHARSET";
                    } else {
                        return;
                    }
                } else if (trim.equals("LANGUAGE")) {
                    String[] split2 = str2.split("-");
                    int length = split2.length;
                    if (length <= 2) {
                        int i = 0;
                        String str3 = split2[0];
                        int length2 = str3.length();
                        int i2 = 0;
                        while (i2 < length2) {
                            char charAt = str3.charAt(i2);
                            if (charAt >= 'a') {
                                if (charAt <= 'z') {
                                    i2++;
                                }
                            } else if (charAt >= 'A' && charAt <= 'Z') {
                                i2++;
                            }
                            throw new C33281iZ(C17900vP.A0H("Invalid Language: \"", str2, "\"").toString());
                        }
                        if (length > 1) {
                            String str4 = split2[1];
                            int length3 = str4.length();
                            while (i < length3) {
                                char charAt2 = str4.charAt(i);
                                if (charAt2 >= 'a') {
                                    if (charAt2 <= 'z') {
                                        i++;
                                    }
                                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                    i++;
                                }
                                throw new C33281iZ(C17900vP.A0H("Invalid Language: \"", str2, "\"").toString());
                            }
                        }
                        r0 = this.A0F;
                        if (r0 != null) {
                            r0.A01 = "LANGUAGE";
                        } else {
                            return;
                        }
                    } else {
                        throw new C33281iZ(C17900vP.A0H("Invalid Language: \"", str2, "\"").toString());
                    }
                } else if (trim.startsWith("X-")) {
                    r0 = this.A0F;
                    if (r0 != null) {
                        r0.A01 = trim;
                    } else {
                        return;
                    }
                } else if (trim.equalsIgnoreCase("WAID")) {
                    C133926pj r1 = this.A0F;
                    if (r1 != null) {
                        r1.A01 = "waId";
                        r1.A00(str2);
                        return;
                    }
                    return;
                } else {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("Unknown type \"");
                    A103.append(trim);
                    throw new C33281iZ(AnonymousClass000.A0y("\"", A103));
                }
                r0.A00(str2);
                return;
            }
        } else {
            str2 = split[0];
        }
        A05(str2);
    }

    public void A05(String str) {
        C133926pj r2;
        String replaceAll;
        if (this instanceof AnonymousClass84X) {
            String[] split = str.split(",");
            this.A0F.A01 = CredentialProviderBaseController.TYPE_TAG;
            for (String str2 : split) {
                if (str2.length() < 2 || !str2.startsWith("\"") || !str2.endsWith("\"")) {
                    r2 = this.A0F;
                    replaceAll = str2.replaceAll("[_$!<|>!$_]", "");
                } else {
                    r2 = this.A0F;
                    replaceAll = str2.substring(1, str2.length() - 1);
                }
                r2.A00(replaceAll);
            }
            return;
        }
        if (!A0N.contains(str) && !str.startsWith("X-")) {
            HashSet hashSet = this.A0E;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                C17900vP.A0g("Type unsupported by vCard 2.1: ", str, AnonymousClass000.A10());
            }
        }
        C133926pj r1 = this.A0F;
        if (r1 != null) {
            r1.A01 = CredentialProviderBaseController.TYPE_TAG;
            r1.A00(str);
        }
    }

    public String A03(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(str.substring(0, (str.length() - 1) + 1));
        while (true) {
            A10.append("\r\n");
            String A012 = A01();
            if (A012 == null) {
                throw new C33281iZ("File ended during parsing quoted-printable String");
            } else if (!A012.trim().endsWith("=")) {
                return AnonymousClass000.A0y(A012, A10);
            } else {
                A10.append(A012.substring(0, (A012.length() - 1) + 1));
            }
        }
    }
}
