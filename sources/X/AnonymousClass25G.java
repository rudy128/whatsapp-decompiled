package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.25G  reason: invalid class name */
public abstract class AnonymousClass25G {
    public static final AnonymousClass1E7 A00(AnonymousClass1M9 r1, AnonymousClass206 r2) {
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 1);
        AnonymousClass1BI r0 = r2.A0v.A00;
        if (r0 != null) {
            return r1.A0D(r0);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final AnonymousClass1BI A01(AnonymousClass11S r3, AnonymousClass1E7 r4, AnonymousClass206 r5) {
        C18070vi.A0d(r3, 0);
        if (r5 == null || (r5.A0D() == 6 && !(r5 instanceof AnonymousClass2MQ))) {
            return null;
        }
        if (!r4.A0F() && !C22971Dz.A0N(r4.A0J)) {
            return null;
        }
        if (!r5.A0v.A02 || (r5 instanceof AnonymousClass2MQ)) {
            AnonymousClass1BI A0H = r5.A0H();
            if (A0H != null) {
                return A0H;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("conversations_row/missing_rmt_src:");
            sb.append(AnonymousClass25A.A0D(r5));
            Log.e(sb.toString());
            return null;
        }
        r3.A0I();
        return r3.A0E;
    }

    public static final CharSequence A02(Context context, AnonymousClass11S r9, C24921Me r10, C18000vb r11, AnonymousClass1E7 r12, C18030ve r13, CharSequence charSequence, boolean z) {
        String str;
        C18070vi.A0d(context, 0);
        CharSequence charSequence2 = charSequence;
        C18070vi.A0d(charSequence, 1);
        C18070vi.A0d(r13, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r10, 6);
        C18070vi.A0d(r11, 7);
        CharSequence A03 = A03(context, r9, r10, r11, r12, r13, z);
        if (A03.length() == 0) {
            return charSequence2;
        }
        boolean A0D = C27641Ww.A0D(charSequence2);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = A03;
        if (A0D) {
            str = "‎";
        } else {
            str = "‏";
        }
        charSequenceArr[1] = str;
        charSequenceArr[2] = charSequence2;
        charSequenceArr[3] = str;
        TextUtils.concat(charSequenceArr);
        return A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A03(android.content.Context r6, X.AnonymousClass11S r7, X.C24921Me r8, X.C18000vb r9, X.AnonymousClass1E7 r10, X.C18030ve r11, boolean r12) {
        /*
            r4 = 0
            X.C18070vi.A0d(r6, r4)
            r1 = 3
            X.C18070vi.A0d(r11, r1)
            r0 = 4
            X.C18070vi.A0d(r7, r0)
            r0 = 5
            X.C18070vi.A0d(r8, r0)
            r0 = 6
            X.C18070vi.A0d(r9, r0)
            java.lang.String r5 = ""
            if (r12 != 0) goto L_0x0074
            if (r10 == 0) goto L_0x0072
            X.1BI r0 = r10.A0J
            if (r0 == 0) goto L_0x0072
            boolean r0 = r7.A0O(r0)
            if (r0 != 0) goto L_0x0072
            r0 = -1
            java.lang.String r3 = r8.A0T(r10, r0)
            r2 = 7459(0x1d23, float:1.0452E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r11, r2)
            if (r0 == 0) goto L_0x0039
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r3 = X.AnonymousClass1EG.A0F(r3, r0)
        L_0x0039:
            if (r3 == 0) goto L_0x006d
        L_0x003b:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x006d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r0 = ": "
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            X.1Wz r0 = X.C18000vb.A00(r9)
            boolean r0 = r0.A06
            r0 = r0 ^ 1
            r3 = 2
            r2 = 1
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "‎"
        L_0x0063:
            r1[r4] = r0
            r1[r2] = r5
            r1[r3] = r0
            java.lang.CharSequence r5 = android.text.TextUtils.concat(r1)
        L_0x006d:
            return r5
        L_0x006e:
            java.lang.String r0 = "‏"
            goto L_0x0063
        L_0x0072:
            r3 = r5
            goto L_0x003b
        L_0x0074:
            r0 = 2131891155(0x7f1213d3, float:1.9417022E38)
            java.lang.String r3 = r6.getString(r0)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25G.A03(android.content.Context, X.11S, X.1Me, X.0vb, X.1E7, X.0ve, boolean):java.lang.CharSequence");
    }

    public static final CharSequence A04(CharSequence charSequence, CharSequence charSequence2) {
        String str;
        C18070vi.A0d(charSequence, 0);
        C18070vi.A0d(charSequence2, 1);
        if (charSequence2.length() == 0) {
            return charSequence;
        }
        boolean A0D = C27641Ww.A0D(charSequence2);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = charSequence;
        if (A0D) {
            str = "‎";
        } else {
            str = "‏";
        }
        charSequenceArr[1] = str;
        charSequenceArr[2] = charSequence2;
        charSequenceArr[3] = str;
        CharSequence concat = TextUtils.concat(charSequenceArr);
        C18070vi.A0b(concat);
        return concat;
    }
}
