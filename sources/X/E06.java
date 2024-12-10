package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.exoplayer2.util.Util;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class E06 extends DefaultHandler {
    public static final Pattern A06 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A07 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A08 = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public static final Pattern A09 = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public long A00;
    public CMJ A01;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;

    public E06(String str, int i, boolean z, boolean z2) {
        this.A01 = null;
        this.A00 = 0;
        this.A03 = str == null ? "null" : str;
        this.A05 = z;
        if (z2) {
            CMJ cmj = CMJ.A01;
            if (cmj == null) {
                synchronized (CMJ.class) {
                    cmj = CMJ.A01;
                    if (cmj == null) {
                        cmj = new CMJ(i);
                        CMJ.A01 = cmj;
                    }
                }
            }
            this.A01 = cmj;
        }
        try {
            this.A04 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw BE6.A0o("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = A09.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int A0D = BE8.A0D(matcher, 1);
        String group = matcher.group(2);
        float f2 = (float) A0D;
        if (!TextUtils.isEmpty(group)) {
            return f2 / ((float) Integer.parseInt(group));
        }
        return f2;
    }

    public static int A01(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i;
    }

    public static int A03(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    public static long A04(String str, XmlPullParser xmlPullParser, long j) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Util.A07.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d6 = 0.0d;
        if (group != null) {
            d = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d2 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d2 = 0.0d;
        }
        double d7 = d + d2;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d3 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d3 = 0.0d;
        }
        double d8 = d7 + d3;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d4 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d4 = 0.0d;
        }
        double d9 = d8 + d4;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d5 = Double.parseDouble(group5) * 60.0d;
        } else {
            d5 = 0.0d;
        }
        double d10 = d9 + d5;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d6 = Double.parseDouble(group6);
        }
        long j2 = (long) ((d10 + d6) * 1000.0d);
        if (isEmpty) {
            return -j2;
        }
        return j2;
    }

    public static long A05(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        r7[r4] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        r5[r4] = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.CR9 A08(X.CR9 r11, java.lang.String r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r0 = 0
            java.lang.String r6 = r13.getAttributeValue(r0, r12)
            if (r6 == 0) goto L_0x00e2
            r0 = 5
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 4
            int[] r7 = new int[r0]
            java.lang.String[] r5 = new java.lang.String[r0]
            r9 = 0
            java.lang.String r13 = ""
            r8[r9] = r13
            r3 = 0
            r4 = 0
        L_0x0016:
            int r12 = r6.length()
            if (r3 >= r12) goto L_0x00dc
            java.lang.String r11 = "$"
            int r10 = r6.indexOf(r11, r3)
            r2 = -1
            if (r10 != r2) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = r8[r4]
            r1.append(r0)
            java.lang.String r0 = r6.substring(r3)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r8[r4] = r0
            r3 = r12
            goto L_0x0016
        L_0x003a:
            if (r10 == r3) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = r8[r4]
            r1.append(r0)
            java.lang.String r0 = r6.substring(r3, r10)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r8[r4] = r0
            r3 = r10
            goto L_0x0016
        L_0x0051:
            java.lang.String r0 = "$$"
            boolean r0 = r6.startsWith(r0, r3)
            if (r0 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = r8[r4]
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r11, r1)
            r8[r4] = r0
            int r3 = r3 + 2
            goto L_0x0016
        L_0x0068:
            int r0 = r3 + 1
            int r3 = r6.indexOf(r11, r0)
            java.lang.String r10 = r6.substring(r0, r3)
            java.lang.String r0 = "RepresentationID"
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0084
            r7[r4] = r0
        L_0x007d:
            int r4 = r4 + 1
            r8[r4] = r13
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0084:
            java.lang.String r0 = "%0"
            int r11 = r10.indexOf(r0)
            if (r11 == r2) goto L_0x00d9
            java.lang.String r2 = r10.substring(r11)
            java.lang.String r1 = "d"
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009c
            java.lang.String r2 = X.C17900vP.A0A(r2, r1)
        L_0x009c:
            java.lang.String r10 = r10.substring(r9, r11)
        L_0x00a0:
            int r0 = r10.hashCode()
            r1 = 2
            switch(r0) {
                case -1950496919: goto L_0x00b6;
                case 2606829: goto L_0x00c1;
                case 38199441: goto L_0x00cb;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid template: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r6, r1)
            throw r0
        L_0x00b6:
            java.lang.String r0 = "Number"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r7[r4] = r1
            goto L_0x00d6
        L_0x00c1:
            java.lang.String r0 = "Time"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 4
            goto L_0x00d4
        L_0x00cb:
            java.lang.String r0 = "Bandwidth"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 3
        L_0x00d4:
            r7[r4] = r0
        L_0x00d6:
            r5[r4] = r2
            goto L_0x007d
        L_0x00d9:
            java.lang.String r2 = "%01d"
            goto L_0x00a0
        L_0x00dc:
            X.CR9 r0 = new X.CR9
            r0.<init>(r7, r8, r5, r4)
            return r0
        L_0x00e2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.A08(X.CR9, java.lang.String, org.xmlpull.v1.XmlPullParser):X.CR9");
    }

    public static void A0C(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            Matcher matcher = Util.A06.matcher(attributeValue);
            if (matcher.matches()) {
                if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                    Integer.parseInt(matcher.group(12));
                    Integer.parseInt(matcher.group(13));
                    matcher.group(11);
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                gregorianCalendar.clear();
                gregorianCalendar.set(BE8.A0D(matcher, 1), BE8.A0D(matcher, 2) - 1, BE8.A0D(matcher, 3), BE8.A0D(matcher, 4), BE8.A0D(matcher, 5), BE8.A0D(matcher, 6));
                if (!TextUtils.isEmpty(matcher.group(8))) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("0.");
                    gregorianCalendar.set(14, new BigDecimal(AnonymousClass000.A0y(matcher.group(8), A10)).movePointRight(3).intValue());
                }
                gregorianCalendar.getTimeInMillis();
                return;
            }
            throw new C24215BxS(AnonymousClass001.A1H("Invalid date/time format: ", attributeValue, AnonymousClass000.A10()), (Throwable) null, true);
        }
    }

    public static int[] A0F(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public C25200Car A0G(String str, String str2, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
            j2 = -1;
        } else {
            j = 0;
            j2 = -1;
        }
        return new C25200Car(j, attributeValue, j2);
    }

    public static int A02(XmlPullParser xmlPullParser) {
        String A002;
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str = attributeValue;
        }
        int i = -1;
        if (!"urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(str)) {
            if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(str) && (A002 = C24603CBh.A00(xmlPullParser.getAttributeValue((String) null, "value"))) != null) {
                switch (A002.hashCode()) {
                    case 1596796:
                        if (A002.equals("4000")) {
                            i = 1;
                            break;
                        }
                        break;
                    case 2937391:
                        if (A002.equals("a000")) {
                            i = 2;
                            break;
                        }
                        break;
                    case 3094035:
                        if (A002.equals("f801")) {
                            i = 6;
                            break;
                        }
                        break;
                    case 3133436:
                        if (A002.equals("fa01")) {
                            i = 8;
                            break;
                        }
                        break;
                }
            }
        } else {
            i = A01("value", xmlPullParser, -1);
        }
        do {
            xmlPullParser.next();
        } while (!C25305Cd9.A00("AudioChannelConfiguration", xmlPullParser));
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011f, code lost:
        r8 = null;
        r6 = null;
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A06(org.xmlpull.v1.XmlPullParser r11) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r4 = 0
            java.lang.String r0 = r11.getAttributeValue(r4, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = X.C24603CBh.A00(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1980789791: goto L_0x00ff;
                case 489446379: goto L_0x010a;
                case 755418770: goto L_0x0115;
                case 1812765994: goto L_0x0124;
                default: goto L_0x0015;
            }
        L_0x0015:
            r8 = r4
            r6 = r4
        L_0x0017:
            r9 = r4
            r5 = r4
        L_0x0019:
            r11.next()
            java.lang.String r0 = "clearkey:Laurl"
            boolean r0 = X.C25305Cd9.A01(r0, r11)
            r1 = 4
            if (r0 == 0) goto L_0x0043
            int r0 = r11.next()
            if (r0 != r1) goto L_0x0043
            java.lang.String r5 = r11.getText()
        L_0x002f:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = X.C25305Cd9.A00(r0, r11)
            if (r0 == 0) goto L_0x0019
            if (r9 == 0) goto L_0x003e
            X.D3w r4 = new X.D3w
            r4.<init>(r5, r9, r6)
        L_0x003e:
            android.util.Pair r0 = android.util.Pair.create(r8, r4)
            return r0
        L_0x0043:
            java.lang.String r0 = "ms:laurl"
            boolean r0 = X.C25305Cd9.A01(r0, r11)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r4, r0)
            goto L_0x002f
        L_0x0052:
            if (r6 != 0) goto L_0x00de
            java.lang.String r10 = "pssh"
            int r2 = r11.getEventType()
            r0 = 2
            if (r2 != r0) goto L_0x0095
            java.lang.String r7 = r11.getName()
            r0 = 58
            int r2 = r7.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x006e
            java.lang.String r7 = X.BE6.A0p(r2, r7)
        L_0x006e:
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x0095
            int r0 = r11.next()
            if (r0 != r1) goto L_0x0095
            java.lang.String r0 = r11.getText()
            byte[] r6 = android.util.Base64.decode(r0, r3)
            X.CPA r0 = X.C85.A00(r6)
            if (r0 != 0) goto L_0x0092
            r9 = 0
            java.lang.String r1 = "MpdParser"
            java.lang.String r0 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r0)
            r6 = r4
            goto L_0x002f
        L_0x0092:
            java.util.UUID r9 = r0.A01
            goto L_0x002f
        L_0x0095:
            java.util.UUID r7 = X.C24736CHy.A02
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "mspr:pro"
            boolean r0 = X.C25305Cd9.A01(r0, r11)
            if (r0 == 0) goto L_0x00de
            int r0 = r11.next()
            if (r0 != r1) goto L_0x00de
            java.lang.String r0 = r11.getText()
            byte[] r2 = android.util.Base64.decode(r0, r3)
            if (r2 == 0) goto L_0x00dc
            int r0 = r2.length
        L_0x00b6:
            int r0 = r0 + 32
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r1.putInt(r0)
            r0 = 1886614376(0x70737368, float:3.013775E29)
            r1.putInt(r0)
            r1.putInt(r3)
            X.BEA.A1T(r1, r7)
            if (r2 == 0) goto L_0x00d6
            int r0 = r2.length
            if (r0 == 0) goto L_0x00d6
            r1.putInt(r0)
            r1.put(r2)
        L_0x00d6:
            byte[] r6 = r1.array()
            goto L_0x002f
        L_0x00dc:
            r0 = 0
            goto L_0x00b6
        L_0x00de:
            int r1 = r11.getEventType()
            r0 = 2
            if (r1 != r0) goto L_0x002f
            r2 = 1
        L_0x00e6:
            r11.next()
            int r1 = r11.getEventType()
            r0 = 2
            if (r1 != r0) goto L_0x00f5
            int r2 = r2 + 1
        L_0x00f2:
            if (r2 == 0) goto L_0x002f
            goto L_0x00e6
        L_0x00f5:
            int r1 = r11.getEventType()
            r0 = 3
            if (r1 != r0) goto L_0x00e6
            int r2 = r2 + -1
            goto L_0x00f2
        L_0x00ff:
            java.lang.String r0 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r9 = X.C24736CHy.A00
            goto L_0x011f
        L_0x010a:
            java.lang.String r0 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r9 = X.C24736CHy.A02
            goto L_0x011f
        L_0x0115:
            java.lang.String r0 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r9 = X.C24736CHy.A04
        L_0x011f:
            r8 = r4
            r6 = r4
            r5 = r4
            goto L_0x0019
        L_0x0124:
            java.lang.String r0 = "urn:mpeg:dash:mp4protection:2011"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "value"
            java.lang.String r8 = r11.getAttributeValue(r4, r0)
            java.lang.String r7 = "default_KID"
            int r6 = r11.getAttributeCount()
            r5 = 0
        L_0x0139:
            if (r5 >= r6) goto L_0x017e
            java.lang.String r2 = r11.getAttributeName(r5)
            r0 = 58
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x014c
            java.lang.String r2 = X.BE6.A0p(r1, r2)
        L_0x014c:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x017b
            java.lang.String r1 = r11.getAttributeValue(r5)
        L_0x0156:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "\\s+"
            java.lang.String[] r2 = r1.split(r0)
            int r7 = r2.length
            java.util.UUID[] r6 = new java.util.UUID[r7]
            r1 = 0
        L_0x016e:
            if (r1 >= r7) goto L_0x0180
            r0 = r2[r1]
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x016e
        L_0x017b:
            int r5 = r5 + 1
            goto L_0x0139
        L_0x017e:
            r1 = 0
            goto L_0x0156
        L_0x0180:
            java.util.UUID r9 = X.C24736CHy.A01
            r5 = 0
            r2 = 32
            int r0 = r7 * 16
            int r0 = r0 + 4
            int r2 = r2 + r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r1.putInt(r2)
            r0 = 1886614376(0x70737368, float:3.013775E29)
            r1.putInt(r0)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1.putInt(r0)
            X.BEA.A1T(r1, r9)
            r1.putInt(r7)
        L_0x01a2:
            if (r5 >= r7) goto L_0x01ac
            r0 = r6[r5]
            X.BEA.A1T(r1, r0)
            int r5 = r5 + 1
            goto L_0x01a2
        L_0x01ac:
            byte[] r6 = r1.array()
            r5 = r4
            goto L_0x0019
        L_0x01b3:
            r6 = r4
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.A06(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static CYY A07(String str, XmlPullParser xmlPullParser) {
        String str2 = "";
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str2 = attributeValue;
        }
        String str4 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue2 != null) {
            str4 = attributeValue2;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (attributeValue3 != null) {
            str3 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!C25305Cd9.A00(str, xmlPullParser));
        return new CYY(str2, str4, str3);
    }

    public static String A09(E06 e06, StringBuilder sb, List list) {
        String str = "";
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoId: ");
        A10.append(e06.A03);
        C108985cd.A1L("\n", A10, sb);
        sb.append("++++++++++++++++++++++++++++++++++++++++\n");
        sb.append("Is MCM: ");
        sb.append(A0E(list));
        sb.append("\n");
        HashMap A11 = C17880vN.A11();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            int i = 0;
            for (CR8 cr8 : ((CW8) it.next()).A01) {
                if (cr8 != null && cr8.A00 == 2) {
                    AnonymousClass000.A1E("Adaptation set ", "\n", sb, i);
                    i++;
                    int i2 = 0;
                    for (CPE cpe : cr8.A02) {
                        sb.append("  [");
                        sb.append(i2);
                        sb.append("]");
                        D48 d48 = cpe.A00;
                        String str2 = d48.A0S;
                        sb.append(str2);
                        sb.append(",");
                        BE8.A1C(sb, d48.A0I);
                        sb.append(d48.A09);
                        sb.append(",aoai: ");
                        D3W d3w = d48.A0K;
                        sb.append(d3w.A07);
                        sb.append(",");
                        sb.append(d3w.A05);
                        sb.append(",");
                        sb.append(d48.A04);
                        sb.append("bps\n");
                        i2++;
                        Number num = new Integer(0);
                        if (A11.containsKey(str2) && (num = C108945cZ.A1D(str2, A11)) == null) {
                            num = new Integer(0);
                        }
                        C17890vO.A0z(str2, A11, num.intValue() + 1);
                    }
                }
            }
        }
        sb.append("----------------------------------------\n");
        if (A11.isEmpty()) {
            return str;
        }
        Iterator A0i = C17890vO.A0i(A11);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            str = AnonymousClass000.A0y("+", AnonymousClass000.A11(AnonymousClass000.A0y(String.format(Locale.US, "%d%s", new Object[]{A16.getValue(), A16.getKey()}), AnonymousClass000.A11(str))));
        }
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 1);
        }
        return str;
    }

    public static String A0B(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            if (sb.charAt(i) == '/') {
                i++;
            }
            int i5 = i;
            int i6 = i;
            while (i5 <= i2) {
                if (i5 == i2) {
                    i3 = i5;
                } else if (sb.charAt(i5) == '/') {
                    i3 = i5 + 1;
                } else {
                    i5++;
                }
                if (i5 == i6 + 1 && sb.charAt(i6) == '.') {
                    sb.delete(i6, i3);
                    i4 = i3 - i6;
                } else if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i6 + 1) == '.') {
                    i6 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i7 = i;
                    if (i6 > i) {
                        i7 = i6;
                    }
                    sb.delete(i7, i3);
                    i4 = i3 - i7;
                } else {
                    i6 = i5 + 1;
                    i5 = i6;
                }
                i2 -= i4;
                i5 = i6;
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.C5P, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r1 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if (r8 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r8 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        r8.add(A0G("media", "mediaRange", r4));
        r0 = r0;
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.BP3 A0H(X.BP3 r21, org.xmlpull.v1.XmlPullParser r22) {
        /*
            r20 = this;
            r2 = 1
            r5 = r21
            if (r21 == 0) goto L_0x00af
            long r6 = r5.A01
        L_0x0008:
            java.lang.String r0 = "timescale"
            r4 = r22
            long r10 = A05(r0, r4, r6)
            if (r21 == 0) goto L_0x00ab
            long r0 = r5.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r12 = A05(r6, r4, r0)
            if (r21 == 0) goto L_0x00a4
            long r0 = r5.A01
        L_0x001e:
            java.lang.String r6 = "duration"
            long r16 = A05(r6, r4, r0)
            if (r21 == 0) goto L_0x0028
            long r2 = r5.A03
        L_0x0028:
            java.lang.String r0 = "startNumber"
            long r14 = A05(r0, r4, r2)
            r8 = 0
            r6 = r8
            r0 = r8
        L_0x0031:
            r4.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = X.C25305Cd9.A01(r1, r4)
            r3 = r20
            if (r1 == 0) goto L_0x007d
            java.lang.String r2 = "sourceURL"
            java.lang.String r1 = "range"
            X.Car r6 = r3.A0G(r2, r1, r4)
        L_0x0046:
            java.lang.String r1 = "SegmentList"
            boolean r1 = X.C25305Cd9.A00(r1, r4)
            if (r1 == 0) goto L_0x0031
            if (r21 == 0) goto L_0x006f
            if (r6 != 0) goto L_0x0054
            X.Car r6 = r5.A02
        L_0x0054:
            if (r0 == 0) goto L_0x005a
            java.util.List r1 = r0.A02
            if (r1 != 0) goto L_0x006b
        L_0x005a:
            java.util.List r4 = r5.A04
            int r3 = r5.A00
            long r1 = r5.A02
            X.C5P r0 = new X.C5P
            r0.<init>()
            r0.A02 = r4
            r0.A00 = r3
            r0.A01 = r1
        L_0x006b:
            if (r8 != 0) goto L_0x006f
            java.util.List r8 = r5.A00
        L_0x006f:
            java.util.List r7 = r0.A02
            int r9 = r0.A00
            long r0 = r0.A01
            X.BP3 r5 = new X.BP3
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r12, r14, r16, r18)
            return r5
        L_0x007d:
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = X.C25305Cd9.A01(r1, r4)
            if (r1 == 0) goto L_0x008a
            X.C5P r0 = r3.A0J(r4)
            goto L_0x0046
        L_0x008a:
            java.lang.String r1 = "SegmentURL"
            boolean r1 = X.C25305Cd9.A01(r1, r4)
            if (r1 == 0) goto L_0x0046
            if (r8 != 0) goto L_0x0098
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
        L_0x0098:
            java.lang.String r2 = "media"
            java.lang.String r1 = "mediaRange"
            X.Car r1 = r3.A0G(r2, r1, r4)
            r8.add(r1)
            goto L_0x0046
        L_0x00a4:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00ab:
            r0 = 0
            goto L_0x0014
        L_0x00af:
            r6 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.A0H(X.BP3, org.xmlpull.v1.XmlPullParser):X.BP3");
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [X.C5P, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r5 != -1) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.BP4 A0I(X.BP4 r22, org.xmlpull.v1.XmlPullParser r23, boolean r24) {
        /*
            r21 = this;
            r4 = 1
            r1 = r22
            if (r22 == 0) goto L_0x00cc
            long r6 = r1.A01
        L_0x0008:
            java.lang.String r2 = "timescale"
            r0 = r23
            long r12 = A05(r2, r0, r6)
            if (r22 == 0) goto L_0x00c8
            long r2 = r1.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r14 = A05(r6, r0, r2)
            if (r22 == 0) goto L_0x00c1
            long r2 = r1.A01
        L_0x001e:
            java.lang.String r6 = "duration"
            long r18 = A05(r6, r0, r2)
            if (r22 == 0) goto L_0x0028
            long r4 = r1.A03
        L_0x0028:
            java.lang.String r2 = "startNumber"
            long r16 = A05(r2, r0, r4)
            r8 = 0
            if (r22 == 0) goto L_0x00be
            X.CR9 r3 = r1.A02
        L_0x0033:
            java.lang.String r2 = "media"
            X.CR9 r11 = A08(r3, r2, r0)
            if (r22 == 0) goto L_0x00bc
            X.CR9 r3 = r1.A01
        L_0x003d:
            java.lang.String r2 = "initialization"
            X.CR9 r10 = A08(r3, r2, r0)
            r9 = r8
            r7 = r8
        L_0x0045:
            r0.next()
            java.lang.String r2 = "Initialization"
            boolean r2 = X.C25305Cd9.A01(r2, r0)
            r6 = r21
            if (r2 == 0) goto L_0x0087
            java.lang.String r3 = "sourceURL"
            java.lang.String r2 = "range"
            X.Car r8 = r6.A0G(r3, r2, r0)
        L_0x005a:
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = X.C25305Cd9.A00(r2, r0)
            if (r2 == 0) goto L_0x0045
            if (r22 == 0) goto L_0x007f
            if (r8 != 0) goto L_0x0068
            X.Car r8 = r1.A02
        L_0x0068:
            if (r9 == 0) goto L_0x006e
            java.util.List r0 = r9.A02
            if (r0 != 0) goto L_0x007f
        L_0x006e:
            java.util.List r3 = r1.A04
            int r2 = r1.A00
            long r0 = r1.A02
            X.C5P r9 = new X.C5P
            r9.<init>()
            r9.A02 = r3
            r9.A00 = r2
            r9.A01 = r0
        L_0x007f:
            X.BP4 r6 = new X.BP4
            r20 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r18, r20)
            return r6
        L_0x0087:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = X.C25305Cd9.A01(r2, r0)
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = "FBPredictedMedia"
            r7 = 0
            X.CR9 r3 = A08(r7, r2, r0)
            java.lang.String r4 = "FBPredictedMediaEndNumber"
            r2 = -1
            int r5 = A01(r4, r0, r2)
            java.lang.String r4 = "FBPredictedMediaStartNumber"
            A01(r4, r0, r2)
            java.lang.String r4 = "FBAverageDuration"
            A01(r4, r0, r2)
            if (r3 == 0) goto L_0x00ac
            r4 = 0
            if (r5 == r2) goto L_0x00ad
        L_0x00ac:
            r4 = 1
        L_0x00ad:
            X.C26056CrS.A03(r4)
            if (r3 == 0) goto L_0x00b7
            X.CJ2 r7 = new X.CJ2
            r7.<init>(r3)
        L_0x00b7:
            X.C5P r9 = r6.A0J(r0)
            goto L_0x005a
        L_0x00bc:
            r3 = r8
            goto L_0x003d
        L_0x00be:
            r3 = r8
            goto L_0x0033
        L_0x00c1:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00c8:
            r2 = 0
            goto L_0x0014
        L_0x00cc:
            r6 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.A0I(X.BP4, org.xmlpull.v1.XmlPullParser, boolean):X.BP4");
    }

    public BP6 A0K(BP6 bp6, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        BP6 bp62 = bp6;
        if (bp6 != null) {
            j = bp62.A01;
        } else {
            j = 1;
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long A052 = A05("timescale", xmlPullParser2, j);
        long j4 = 0;
        if (bp6 != null) {
            j2 = bp62.A00;
        } else {
            j2 = 0;
        }
        long A053 = A05("presentationTimeOffset", xmlPullParser2, j2);
        if (bp6 != null) {
            j3 = bp62.A01;
            j4 = bp62.A00;
        } else {
            j3 = 0;
        }
        C25200Car car = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j3) + 1;
        }
        if (bp6 != null) {
            car = bp62.A02;
        }
        do {
            xmlPullParser2.next();
            if (C25305Cd9.A01("Initialization", xmlPullParser2)) {
                car = A0G("sourceURL", "range", xmlPullParser2);
            }
        } while (!C25305Cd9.A00("SegmentBase", xmlPullParser2));
        return new BP6(car, A052, A053, j3, j4);
    }

    public static String A0A(String str, XmlPullParser xmlPullParser) {
        xmlPullParser.next();
        String text = xmlPullParser.getText();
        StringBuilder A10 = AnonymousClass000.A10();
        if (str == null) {
            str = "";
        }
        if (text == null) {
            text = "";
        }
        int[] A0F = A0F(text);
        if (A0F[0] != -1) {
            A10.append(text);
            A0B(A10, A0F[1], A0F[2]);
            return A10.toString();
        }
        int[] A0F2 = A0F(str);
        if (A0F[3] == 0) {
            A10.append(str, 0, A0F2[3]);
            return AnonymousClass000.A0y(text, A10);
        } else if (A0F[2] == 0) {
            A10.append(str, 0, A0F2[2]);
            return AnonymousClass000.A0y(text, A10);
        } else {
            int i = A0F[1];
            if (i != 0) {
                int i2 = A0F2[0] + 1;
                A10.append(str, 0, i2);
                A10.append(text);
                return A0B(A10, A0F[1] + i2, i2 + A0F[2]);
            } else if (text.charAt(i) == '/') {
                A10.append(str, 0, A0F2[1]);
                A10.append(text);
                int i3 = A0F2[1];
                return A0B(A10, i3, A0F[2] + i3);
            } else {
                int i4 = A0F2[0] + 2;
                int i5 = A0F2[1];
                if (i4 >= i5 || i5 != A0F2[2]) {
                    int lastIndexOf = str.lastIndexOf(47, A0F2[2] - 1);
                    if (lastIndexOf != -1) {
                        i5 = lastIndexOf + 1;
                    }
                    A10.append(str, 0, i5);
                    A10.append(text);
                    return A0B(A10, A0F2[1], i5 + A0F[2]);
                }
                A10.append(str, 0, i5);
                A10.append('/');
                A10.append(text);
                int i6 = A0F2[1];
                return A0B(A10, i6, A0F[2] + i6 + 1);
            }
        }
    }

    public static boolean A0D(String str) {
        if (C26233CvQ.A05(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean A0E(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CW8 cw8 = (CW8) it.next();
            if (cw8 != null) {
                int i = 0;
                for (CR8 cr8 : cw8.A01) {
                    if (cr8 != null && cr8.A00 == 2 && (i = i + 1) > 1) {
                        return true;
                    }
                }
                continue;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CW8 cw82 = (CW8) it2.next();
            if (cw82 != null) {
                for (CR8 cr82 : cw82.A01) {
                    if (cr82 != null && cr82.A00 == 2) {
                        String str2 = "";
                        for (CPE cpe : cr82.A02) {
                            if (!(cpe == null || (str = cpe.A00.A0S) == null || TextUtils.isEmpty(str))) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = str;
                                } else if (!str2.equals(str)) {
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.C5P, java.lang.Object] */
    public C5P A0J(XmlPullParser xmlPullParser) {
        ArrayList A13 = AnonymousClass000.A13();
        long j = 0;
        long j2 = 0;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C25305Cd9.A01("S", xmlPullParser)) {
                long A052 = A05("t", xmlPullParser, j);
                long A053 = A05("d", xmlPullParser, -9223372036854775807L);
                int A012 = A01("r", xmlPullParser, 0) + 1;
                int A013 = A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, xmlPullParser, 0);
                j2 = Math.max(j2, A053);
                A13.add(new CX5(A012, i, A013, A052, A053, false));
                j = A052 + (((long) A012) * A053);
                i += A012;
            }
        } while (!C25305Cd9.A00("SegmentTimeline", xmlPullParser));
        A13.isEmpty();
        ? obj = new Object();
        obj.A02 = A13;
        obj.A00 = i;
        obj.A01 = j2;
        return obj;
    }

    public E06() {
        this((String) null, 0, false, false);
    }
}
