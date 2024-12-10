package X;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2t8  reason: invalid class name and case insensitive filesystem */
public abstract class C63472t8 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(org.xmlpull.v1.XmlPullParser r14, java.lang.String[] r15) {
        /*
            java.lang.String r0 = "name"
            r5 = 0
            java.lang.String r13 = r14.getAttributeValue(r5, r0)
            java.lang.String r2 = r14.getName()
            java.lang.String r0 = "null"
            boolean r0 = r2.equals(r0)
            r9 = 2
            r4 = 4
            r8 = 3
            r7 = 1
            r12 = 0
            if (r0 != 0) goto L_0x0491
            java.lang.String r3 = "string"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r2 = ""
        L_0x0023:
            int r0 = r14.next()
            if (r0 == r7) goto L_0x0058
            if (r0 != r8) goto L_0x003c
            boolean r0 = X.C17890vO.A1V(r3, r14)
            if (r0 != 0) goto L_0x045b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected end tag in <string>: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x003c:
            if (r0 != r4) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            java.lang.String r0 = r14.getText()
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0023
        L_0x004b:
            if (r0 != r9) goto L_0x0023
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected start tag in <string>: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x0058:
            java.lang.String r0 = "Unexpected end of document in <string>"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x005f:
            java.lang.String r3 = ">"
            java.lang.String r0 = "int"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            java.lang.String r6 = "value"
            r1 = 0
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r14.getAttributeValue(r5, r6)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            goto L_0x00bd
        L_0x007a:
            java.lang.String r0 = "long"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r14.getAttributeValue(r5, r6)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            goto L_0x00bd
        L_0x008b:
            java.lang.String r0 = "float"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r14.getAttributeValue(r5, r6)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            java.lang.Float r5 = java.lang.Float.valueOf(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            goto L_0x00bd
        L_0x009c:
            java.lang.String r0 = "double"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = r14.getAttributeValue(r5, r6)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            java.lang.Double r5 = java.lang.Double.valueOf(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            goto L_0x00bd
        L_0x00ad:
            java.lang.String r0 = "boolean"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r14.getAttributeValue(r5, r6)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch:{ NullPointerException -> 0x047f, NumberFormatException -> 0x046d }
        L_0x00bd:
            if (r5 != 0) goto L_0x0491
            java.lang.String r3 = "byte-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0150
            java.lang.String r1 = "num"
            r0 = 0
            java.lang.String r0 = r14.getAttributeValue(r0, r1)     // Catch:{ NullPointerException -> 0x0149, NumberFormatException -> 0x0142 }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0149, NumberFormatException -> 0x0142 }
            byte[] r6 = new byte[r9]
            int r0 = r14.getEventType()
        L_0x00d8:
            if (r0 != r4) goto L_0x0118
            if (r9 <= 0) goto L_0x0123
            java.lang.String r5 = r14.getText()
            if (r5 == 0) goto L_0x012e
            int r1 = r5.length()
            int r0 = r9 * 2
            if (r1 != r0) goto L_0x012e
            r2 = 0
        L_0x00eb:
            if (r2 >= r9) goto L_0x0123
            int r0 = r2 * 2
            char r1 = r5.charAt(r0)
            int r0 = r0 + 1
            char r11 = r5.charAt(r0)
            r10 = 97
            if (r1 <= r10) goto L_0x0115
            int r0 = r1 + -97
            int r1 = r0 + 10
        L_0x0101:
            int r0 = r11 + -48
            if (r11 <= r10) goto L_0x0109
            int r0 = r11 + -97
            int r0 = r0 + 10
        L_0x0109:
            r1 = r1 & 15
            int r1 = r1 << r4
            r0 = r0 & 15
            r1 = r1 | r0
            byte r0 = (byte) r1
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x00eb
        L_0x0115:
            int r1 = r1 + -48
            goto L_0x0101
        L_0x0118:
            if (r0 != r8) goto L_0x0123
            boolean r0 = X.C17890vO.A1V(r3, r14)
            if (r0 == 0) goto L_0x013d
            r15[r12] = r13
            return r6
        L_0x0123:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x00d8
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid value found in byte-array: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x013d:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r3, r14)
            throw r0
        L_0x0142:
            java.lang.String r0 = "Not a number in num attribute in byte-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0149:
            java.lang.String r0 = "Need num attribute in byte-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0150:
            java.lang.String r3 = "int-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = "num"
            r4 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x01c5, NumberFormatException -> 0x01be }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x01c5, NumberFormatException -> 0x01be }
            r14.next()
            int[] r5 = new int[r0]
            int r0 = r14.getEventType()
            r2 = 0
        L_0x016d:
            java.lang.String r1 = "item"
            if (r0 != r9) goto L_0x0182
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r14.getAttributeValue(r4, r6)     // Catch:{ NullPointerException -> 0x01a7, NumberFormatException -> 0x01a0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x01a7, NumberFormatException -> 0x01a0 }
            r5[r2] = r0     // Catch:{ NullPointerException -> 0x01a7, NumberFormatException -> 0x01a0 }
            goto L_0x0195
        L_0x0182:
            if (r0 != r8) goto L_0x0195
            boolean r0 = X.C17890vO.A1V(r3, r14)
            if (r0 == 0) goto L_0x018d
            r15[r12] = r13
            return r5
        L_0x018d:
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x01b9
            int r2 = r2 + 1
        L_0x0195:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x016d
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x01a0:
            java.lang.String r0 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x01a7:
            java.lang.String r0 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x01ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected item tag at: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x01b9:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r3, r14)
            throw r0
        L_0x01be:
            java.lang.String r0 = "Not a number in num attribute in int-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x01c5:
            java.lang.String r0 = "Need num attribute in int-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x01cc:
            java.lang.String r3 = "long-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = "num"
            r2 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x0241, NumberFormatException -> 0x023a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0241, NumberFormatException -> 0x023a }
            r14.next()
            long[] r4 = new long[r0]
            int r0 = r14.getEventType()
            r5 = 0
        L_0x01e9:
            java.lang.String r1 = "item"
            if (r0 != r9) goto L_0x01fe
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x022a
            java.lang.String r0 = r14.getAttributeValue(r2, r6)     // Catch:{ NullPointerException -> 0x0223, NumberFormatException -> 0x021c }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NullPointerException -> 0x0223, NumberFormatException -> 0x021c }
            r4[r5] = r0     // Catch:{ NullPointerException -> 0x0223, NumberFormatException -> 0x021c }
            goto L_0x0211
        L_0x01fe:
            if (r0 != r8) goto L_0x0211
            boolean r0 = X.C17890vO.A1V(r3, r14)
            if (r0 == 0) goto L_0x0209
            r15[r12] = r13
            return r4
        L_0x0209:
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x0235
            int r5 = r5 + 1
        L_0x0211:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x01e9
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x021c:
            java.lang.String r0 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0223:
            java.lang.String r0 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x022a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected item tag at: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x0235:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r3, r14)
            throw r0
        L_0x023a:
            java.lang.String r0 = "Not a number in num attribute in long-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0241:
            java.lang.String r0 = "Need num attribute in long-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0248:
            java.lang.String r3 = "double-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x02c4
            java.lang.String r0 = "num"
            r4 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x02bd, NumberFormatException -> 0x02b6 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x02bd, NumberFormatException -> 0x02b6 }
            r14.next()
            double[] r2 = new double[r0]
            int r0 = r14.getEventType()
            r5 = 0
        L_0x0265:
            java.lang.String r1 = "item"
            if (r0 != r9) goto L_0x027a
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x02a6
            java.lang.String r0 = r14.getAttributeValue(r4, r6)     // Catch:{ NullPointerException -> 0x029f, NumberFormatException -> 0x0298 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NullPointerException -> 0x029f, NumberFormatException -> 0x0298 }
            r2[r5] = r0     // Catch:{ NullPointerException -> 0x029f, NumberFormatException -> 0x0298 }
            goto L_0x028d
        L_0x027a:
            if (r0 != r8) goto L_0x028d
            boolean r0 = X.C17890vO.A1V(r3, r14)
            if (r0 == 0) goto L_0x0285
            r15[r12] = r13
            return r2
        L_0x0285:
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x02b1
            int r5 = r5 + 1
        L_0x028d:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x0265
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x0298:
            java.lang.String r0 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x029f:
            java.lang.String r0 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x02a6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected item tag at: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x02b1:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r3, r14)
            throw r0
        L_0x02b6:
            java.lang.String r0 = "Not a number in num attribute in double-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x02bd:
            java.lang.String r0 = "Need num attribute in double-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x02c4:
            java.lang.String r4 = "string-array"
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x033d
            java.lang.String r0 = "num"
            r5 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x0336, NumberFormatException -> 0x032f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0336, NumberFormatException -> 0x032f }
            r14.next()
            java.lang.String[] r3 = new java.lang.String[r0]
            int r0 = r14.getEventType()
            r2 = 0
        L_0x02e2:
            java.lang.String r1 = "item"
            if (r0 != r9) goto L_0x02f3
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x031f
            java.lang.String r0 = r14.getAttributeValue(r5, r6)     // Catch:{ NullPointerException -> 0x0318, NumberFormatException -> 0x0311 }
            r3[r2] = r0     // Catch:{ NullPointerException -> 0x0318, NumberFormatException -> 0x0311 }
            goto L_0x0306
        L_0x02f3:
            if (r0 != r8) goto L_0x0306
            boolean r0 = X.C17890vO.A1V(r4, r14)
            if (r0 == 0) goto L_0x02fe
            r15[r12] = r13
            return r3
        L_0x02fe:
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x032a
            int r2 = r2 + 1
        L_0x0306:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x02e2
            org.xmlpull.v1.XmlPullParserException r0 = A01(r4)
            throw r0
        L_0x0311:
            java.lang.String r0 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0318:
            java.lang.String r0 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x031f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected item tag at: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x032a:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r4, r14)
            throw r0
        L_0x032f:
            java.lang.String r0 = "Not a number in num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0336:
            java.lang.String r0 = "Need num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x033d:
            java.lang.String r5 = "boolean-array"
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "num"
            r4 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x03b2, NumberFormatException -> 0x03ab }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x03b2, NumberFormatException -> 0x03ab }
            r14.next()
            boolean[] r3 = new boolean[r0]
            int r0 = r14.getEventType()
            r2 = 0
        L_0x035a:
            java.lang.String r1 = "item"
            if (r0 != r9) goto L_0x036f
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x039b
            java.lang.String r0 = r14.getAttributeValue(r4, r6)     // Catch:{ NullPointerException -> 0x0394, NumberFormatException -> 0x038d }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ NullPointerException -> 0x0394, NumberFormatException -> 0x038d }
            r3[r2] = r0     // Catch:{ NullPointerException -> 0x0394, NumberFormatException -> 0x038d }
            goto L_0x0382
        L_0x036f:
            if (r0 != r8) goto L_0x0382
            boolean r0 = X.C17890vO.A1V(r5, r14)
            if (r0 == 0) goto L_0x037a
            r15[r12] = r13
            return r3
        L_0x037a:
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 == 0) goto L_0x03a6
            int r2 = r2 + 1
        L_0x0382:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x035a
            org.xmlpull.v1.XmlPullParserException r0 = A01(r5)
            throw r0
        L_0x038d:
            java.lang.String r0 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0394:
            java.lang.String r0 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x039b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected item tag at: "
            org.xmlpull.v1.XmlPullParserException r0 = A02(r0, r1, r14)
            throw r0
        L_0x03a6:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r5, r14)
            throw r0
        L_0x03ab:
            java.lang.String r0 = "Not a number in num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x03b2:
            java.lang.String r0 = "Need num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x03b9:
            java.lang.String r3 = "map"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x03f2
            r14.next()
            java.util.HashMap r2 = X.C17880vN.A11()
            int r0 = r14.getEventType()
        L_0x03cc:
            if (r0 != r9) goto L_0x03e2
            java.lang.Object r1 = A00(r14, r15)
            r0 = r15[r12]
            r2.put(r0, r1)
        L_0x03d7:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x03cc
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x03e2:
            if (r0 != r8) goto L_0x03d7
            boolean r0 = X.C17890vO.A1V(r3, r14)
            if (r0 == 0) goto L_0x03ed
            r15[r12] = r13
            return r2
        L_0x03ed:
            org.xmlpull.v1.XmlPullParserException r0 = A03(r3, r14)
            throw r0
        L_0x03f2:
            java.lang.String r1 = "list"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0426
            r14.next()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            int r0 = r14.getEventType()
        L_0x0405:
            if (r0 != r9) goto L_0x0419
            java.lang.Object r0 = A00(r14, r15)
            r2.add(r0)
        L_0x040e:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x0405
            org.xmlpull.v1.XmlPullParserException r0 = A01(r1)
            throw r0
        L_0x0419:
            if (r0 != r8) goto L_0x040e
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 != 0) goto L_0x045b
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x0426:
            java.lang.String r1 = "set"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x045e
            r14.next()
            java.util.HashSet r2 = X.C17880vN.A12()
            int r0 = r14.getEventType()
        L_0x043a:
            if (r0 != r9) goto L_0x044e
            java.lang.Object r0 = A00(r14, r15)
            r2.add(r0)
        L_0x0443:
            int r0 = r14.next()
            if (r0 != r7) goto L_0x043a
            org.xmlpull.v1.XmlPullParserException r0 = A01(r1)
            throw r0
        L_0x044e:
            if (r0 != r8) goto L_0x0443
            boolean r0 = X.C17890vO.A1V(r1, r14)
            if (r0 != 0) goto L_0x045b
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x045b:
            r15[r12] = r13
            return r2
        L_0x045e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown tag: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x046d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Not a number in value attribute in <"
            X.C17890vO.A10(r0, r2, r3, r1)
            java.lang.String r0 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x047f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Need value attribute in <"
            X.C17890vO.A10(r0, r2, r3, r1)
            java.lang.String r0 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        L_0x0491:
            int r0 = r14.next()
            if (r0 == r7) goto L_0x04db
            java.lang.String r3 = ">: "
            if (r0 != r8) goto L_0x04a4
            boolean r0 = X.C17890vO.A1V(r2, r14)
            if (r0 == 0) goto L_0x04b9
            r15[r12] = r13
            return r5
        L_0x04a4:
            if (r0 == r4) goto L_0x04ca
            if (r0 != r9) goto L_0x0491
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected start tag in <"
            r1.append(r0)
            r1.append(r2)
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r1, r14)
            throw r0
        L_0x04b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected end tag in <"
            r1.append(r0)
            r1.append(r2)
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r1, r14)
            throw r0
        L_0x04ca:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected text in <"
            r1.append(r0)
            r1.append(r2)
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r1, r14)
            throw r0
        L_0x04db:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected end of document in <"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ">"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63472t8.A00(org.xmlpull.v1.XmlPullParser, java.lang.String[]):java.lang.Object");
    }

    public static XmlPullParserException A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Document ended before ");
        sb.append(str);
        sb.append(" end tag");
        return new XmlPullParserException(sb.toString());
    }

    public static XmlPullParserException A03(String str, XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str);
        sb.append(" end tag at: ");
        sb.append(xmlPullParser.getName());
        return new XmlPullParserException(sb.toString());
    }

    public static XmlPullParserException A02(String str, StringBuilder sb, XmlPullParser xmlPullParser) {
        sb.append(str);
        sb.append(xmlPullParser.getName());
        return new XmlPullParserException(sb.toString());
    }
}
