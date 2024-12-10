package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: X.69L  reason: invalid class name */
public final class AnonymousClass69L extends AnonymousClass69a {
    public float A00;
    public String A01;
    public String A02;
    public SimpleDateFormat A03;
    public SimpleDateFormat A04;
    public SimpleDateFormat A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Paint A0B = C108945cZ.A0K(1);
    public final Paint A0C = C108945cZ.A0K(1);
    public final Paint A0D = C108945cZ.A0K(1);
    public final Paint A0E = C108945cZ.A0K(1);
    public final Rect A0F;
    public final TextPaint A0G = new TextPaint(1);
    public final TextPaint A0H = new TextPaint(1);
    public final TextPaint A0I = new TextPaint(1);
    public final TextPaint A0J = new TextPaint(1);
    public final C18000vb A0K;
    public final C133536ov A0L;
    public final C133696pL A0M;
    public final String A0N;
    public final boolean A0O;
    public final C129106hG[] A0P;
    public final C129106hG[] A0Q;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass69L(android.content.Context r13, X.C18000vb r14, boolean r15) {
        /*
            r12 = this;
            r7 = 1
            int r1 = X.C72453Mb.A0G(r13, r14, r7)
            r12.<init>()
            r12.A0A = r13
            r12.A0K = r14
            r12.A0O = r15
            android.graphics.Paint r0 = X.C108945cZ.A0K(r7)
            r12.A0C = r0
            android.graphics.Paint r0 = X.C108945cZ.A0K(r7)
            r12.A0B = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r7)
            r12.A0H = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r7)
            r12.A0G = r0
            android.graphics.Paint r0 = X.C108945cZ.A0K(r7)
            r12.A0E = r0
            android.graphics.Paint r0 = X.C108945cZ.A0K(r7)
            r12.A0D = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r7)
            r12.A0J = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r7)
            r12.A0I = r0
            X.6hG[] r0 = new X.C129106hG[r1]
            r12.A0P = r0
            X.6hG[] r0 = new X.C129106hG[r1]
            r12.A0Q = r0
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r12.A0F = r0
            r12.A06 = r7
            X.69f r0 = new X.69f
            r0.<init>(r12, r7)
            r12.A0L = r0
            X.0vb r8 = r12.A0K
            java.util.Locale r6 = r8.A0N()
            X.C18070vi.A0X(r6)
            r0 = 225(0xe1, float:3.15E-43)
            java.lang.String r1 = r8.A08(r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r6)
            r12.A05 = r0
            r0 = 224(0xe0, float:3.14E-43)
            java.lang.String r5 = r8.A08(r0)
            X.C18070vi.A0X(r5)
            int r10 = r5.length()
            r11 = 0
            r2 = 0
        L_0x007e:
            if (r11 >= r10) goto L_0x01b6
            char r1 = r5.charAt(r11)
            r0 = 39
            if (r1 != r0) goto L_0x008a
            r2 = r2 ^ 1
        L_0x008a:
            if (r2 != 0) goto L_0x01b2
            r0 = 97
            if (r1 != r0) goto L_0x01b2
        L_0x0090:
            r0 = -1
            java.lang.String r4 = ""
            r3 = 1
            r2 = 0
            if (r11 != r0) goto L_0x0168
            java.lang.String r0 = "12-hour formats must contain AM/PM marker."
        L_0x0099:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x009c:
            r9 = 1
        L_0x009d:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r5, r6)
            r12.A04 = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r4, r6)
            r12.A03 = r0
            boolean r0 = X.AnonymousClass3MY.A1b(r8)
            if (r0 == 0) goto L_0x013e
            r12.A09 = r9
        L_0x00b3:
            android.graphics.Paint r1 = r12.A0E
            r0 = -1
            X.AnonymousClass3MZ.A1D(r0, r1)
            r0 = 242(0xf2, float:3.39E-43)
            r1.setAlpha(r0)
            android.graphics.Paint r1 = r12.A0D
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r3)
            X.AnonymousClass3MW.A1P(r1)
            r0 = 153(0x99, float:2.14E-43)
            r1.setAlpha(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r1.setStrokeWidth(r0)
            android.text.TextPaint r1 = r12.A0J
            r1.setColor(r3)
            r2 = 179(0xb3, float:2.51E-43)
            r1.setAlpha(r2)
            r0 = 1115160576(0x42780000, float:62.0)
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = X.C43421zm.A03()
            r1.setTypeface(r0)
            android.text.TextPaint r1 = r12.A0I
            r1.setColor(r3)
            r1.setAlpha(r2)
            r0 = 1109393408(0x42200000, float:40.0)
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r0)
            r12.A08 = r7
            android.graphics.Paint r1 = r12.A0C
            X.AnonymousClass3MZ.A1D(r3, r1)
            r0 = 90
            r1.setAlpha(r0)
            android.graphics.Paint r1 = r12.A0B
            r2 = -1
            r1.setColor(r2)
            X.AnonymousClass3MW.A1P(r1)
            r0 = 1084227584(0x40a00000, float:5.0)
            r1.setStrokeWidth(r0)
            android.text.TextPaint r1 = r12.A0H
            r1.setColor(r2)
            r0 = 1115160576(0x42780000, float:62.0)
            r1.setTextSize(r0)
            android.text.TextPaint r1 = r12.A0G
            r1.setColor(r2)
            r0 = 1109393408(0x42200000, float:40.0)
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = X.C43421zm.A03()
            r1.setTypeface(r0)
            A01(r12)
            X.6pL r0 = new X.6pL
            r0.<init>(r13, r14)
            r12.A0M = r0
            java.lang.String r0 = "digital-clock"
            r12.A0N = r0
            return
        L_0x013e:
            java.text.SimpleDateFormat r0 = r12.A03
            if (r0 != 0) goto L_0x0149
            java.lang.String r0 = "periodFormat"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0149:
            java.text.DateFormatSymbols r0 = r0.getDateFormatSymbols()
            java.lang.String[] r0 = r0.getAmPmStrings()
            r2 = r0[r2]
            X.1X5 r1 = X.AnonymousClass1X4.A02
            int r0 = r2.length()
            boolean r0 = r1.BgG(r2, r0)
            if (r0 == 0) goto L_0x0166
            if (r9 == 0) goto L_0x0162
            r3 = 0
        L_0x0162:
            r12.A09 = r3
            goto L_0x00b3
        L_0x0166:
            r3 = r9
            goto L_0x0162
        L_0x0168:
            r9 = r11
        L_0x0169:
            if (r9 <= 0) goto L_0x017b
            int r1 = r5.codePointBefore(r9)
            boolean r0 = java.lang.Character.isSpaceChar(r1)
            if (r0 == 0) goto L_0x017b
            int r0 = java.lang.Character.charCount(r1)
            int r9 = r9 - r0
            goto L_0x0169
        L_0x017b:
            int r1 = r11 + 1
        L_0x017d:
            if (r1 >= r10) goto L_0x0193
            int r11 = r5.codePointAt(r1)
            r0 = 97
            if (r11 == r0) goto L_0x018d
            boolean r0 = java.lang.Character.isSpaceChar(r11)
            if (r0 == 0) goto L_0x0193
        L_0x018d:
            int r0 = java.lang.Character.charCount(r11)
            int r1 = r1 + r0
            goto L_0x017d
        L_0x0193:
            if (r9 != 0) goto L_0x01a1
            java.lang.String r0 = X.C108955ca.A0z(r5, r1)
            java.lang.String r4 = X.C108955ca.A0q(r2, r1, r5)
            r5 = r0
            r9 = 0
            goto L_0x009d
        L_0x01a1:
            if (r1 != r10) goto L_0x01ae
            java.lang.String r0 = X.C108955ca.A0q(r2, r9, r5)
            java.lang.String r4 = X.C108955ca.A0z(r5, r9)
            r5 = r0
            goto L_0x009c
        L_0x01ae:
            java.lang.String r0 = "AM/PM markers in 12-hour formats should be at one end."
            goto L_0x0099
        L_0x01b2:
            int r11 = r11 + 1
            goto L_0x007e
        L_0x01b6:
            r11 = -1
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69L.<init>(android.content.Context, X.0vb, boolean):void");
    }

    public void A0Q(JSONObject jSONObject) {
        String str;
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("theme", this.A06);
        String str2 = this.A02;
        if (str2 == null) {
            str = "formattedTime";
        } else {
            jSONObject.put("time", str2);
            String str3 = this.A01;
            if (str3 == null) {
                str = "formattedPeriod";
            } else {
                jSONObject.put("period", str3);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(AnonymousClass69L r10) {
        float f;
        String str;
        if (r10.A08) {
            TextPaint textPaint = r10.A0J;
            String str2 = r10.A02;
            if (str2 == null) {
                str = "formattedTime";
            } else {
                float measureText = textPaint.measureText(str2);
                if (!r10.A07) {
                    TextPaint textPaint2 = r10.A0I;
                    String str3 = r10.A01;
                    if (str3 == null) {
                        str = "formattedPeriod";
                    } else {
                        f = textPaint2.measureText(str3);
                    }
                } else {
                    f = 0.0f;
                }
                float f2 = measureText + f + 100.0f;
                r10.A00 = f2;
                C129106hG[] r1 = r10.A0P;
                r1[0] = new C129106hG(0.0f, 0.0f, f2, 116.0f, 58.0f, 58.0f, r10.A0C);
                r1[1] = new C129106hG(2.0f, 2.0f, r10.A00 - 2.0f, 114.0f, 58.0f, 58.0f, r10.A0B);
                C129106hG[] r12 = r10.A0Q;
                r12[0] = new C129106hG(0.0f, 0.0f, r10.A00, 116.0f, 29.0f, 29.0f, r10.A0E);
                r12[1] = new C129106hG(12.0f, 12.0f, r10.A00 - 12.0f, 104.0f, 17.0f, 17.0f, r10.A0D);
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A01(AnonymousClass69L r2) {
        String str;
        String str2;
        Date date = new Date();
        boolean z = C18000vb.A00(r2.A0K).A00;
        r2.A07 = z;
        if (z) {
            SimpleDateFormat simpleDateFormat = r2.A05;
            if (simpleDateFormat == null) {
                str2 = "timeFormat24";
            } else {
                String format = simpleDateFormat.format(date);
                C18070vi.A0X(format);
                r2.A02 = format;
                str = "";
                r2.A01 = str;
                A00(r2);
                return;
            }
        } else {
            SimpleDateFormat simpleDateFormat2 = r2.A04;
            if (simpleDateFormat2 == null) {
                str2 = "timeFormat12";
            } else {
                String format2 = simpleDateFormat2.format(date);
                C18070vi.A0X(format2);
                r2.A02 = format2;
                SimpleDateFormat simpleDateFormat3 = r2.A03;
                if (simpleDateFormat3 == null) {
                    str2 = "periodFormat";
                } else {
                    str = simpleDateFormat3.format(date);
                    C18070vi.A0X(str);
                    r2.A01 = str;
                    A00(r2);
                    return;
                }
            }
        }
        C18070vi.A11(str2);
        throw null;
    }
}
