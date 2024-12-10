package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* renamed from: X.12F  reason: invalid class name */
public final class AnonymousClass12F implements C201511a {
    public final AnonymousClass118 A00;
    public final C32191gn A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass11C A04;
    public final C18000vb A05;
    public final C18030ve A06;
    public final C32091gc A07;
    public final AnonymousClass1R2 A08;
    public final C18010vc A09;
    public final AnonymousClass1PU A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public AnonymousClass12F(C32191gn r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass11C r5, AnonymousClass118 r6, C18000vb r7, C18030ve r8, C32091gc r9, AnonymousClass1R2 r10, C18010vc r11, AnonymousClass1PU r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r3, 5);
        C18070vi.A0d(r12, 6);
        C18070vi.A0d(r5, 7);
        C18070vi.A0d(r7, 8);
        C18070vi.A0d(r4, 9);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r11, 11);
        C18070vi.A0d(r2, 12);
        C18070vi.A0d(r14, 13);
        this.A06 = r8;
        this.A07 = r9;
        this.A00 = r6;
        this.A08 = r10;
        this.A02 = r3;
        this.A0A = r12;
        this.A04 = r5;
        this.A05 = r7;
        this.A03 = r4;
        this.A0B = r13;
        this.A09 = r11;
        this.A01 = r2;
        this.A0C = r14;
    }

    public CharSequence A03(Context context, Paint paint, AnonymousClass206 r12) {
        String string;
        AnonymousClass21V r1 = (AnonymousClass21V) r12;
        boolean z = false;
        if (r1.A09 == 1) {
            z = true;
        }
        int i = r1.A0D;
        AnonymousClass118 r0 = this.A00;
        if (i == 0) {
            Context context2 = r0.A00;
            int i2 = 2131889017;
            if (z) {
                i2 = 2131889040;
            }
            string = context2.getString(i2);
        } else {
            Context context3 = r0.A00;
            int i3 = 2131889018;
            if (z) {
                i3 = 2131889042;
            }
            string = context3.getString(i3, new Object[]{C64052u8.A0D(this.A05, (String) null, (long) i)});
        }
        C18070vi.A0b(string);
        int i4 = 2131231962;
        if (r12.A09 == 1) {
            i4 = 2131232097;
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, i4), string);
        C18070vi.A0X(A032);
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A04(android.content.Context r8, android.graphics.Paint r9, X.AnonymousClass206 r10) {
        /*
            r7 = this;
            r4 = 0
            r5 = 1
            X.22M r10 = (X.AnonymousClass22M) r10
            X.00H r0 = r7.A0B
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0074
            X.1yO r3 = (X.C42571yO) r3
            boolean r0 = r3.A0H(r10)
            if (r0 == 0) goto L_0x006b
            X.25F r6 = r10.A00
            X.229 r0 = r6.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x0068
            X.4cT r0 = r0.A04
            if (r0 == 0) goto L_0x0068
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.1M9 r0 = r7.A02
            X.1E7 r2 = r0.A0D(r1)
            if (r2 == 0) goto L_0x0068
            X.229 r0 = r6.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x0060
            X.4cT r0 = r0.A04
            boolean r0 = r0.A03
            if (r0 != r5) goto L_0x0060
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0041:
            if (r2 == 0) goto L_0x0068
            int r1 = r3.A0C(r10)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
            java.lang.String r1 = r8.getString(r1, r0)
            if (r1 == 0) goto L_0x0068
        L_0x0051:
            X.C18070vi.A0b(r1)
            android.graphics.drawable.Drawable r0 = r3.A0E(r8, r10, r4)
            java.lang.CharSequence r0 = X.C72813Np.A03(r9, r0, r1)
            X.C18070vi.A0X(r0)
            return r0
        L_0x0060:
            X.1Me r1 = r7.A03
            r0 = -1
            java.lang.String r2 = r1.A0T(r2, r0)
            goto L_0x0041
        L_0x0068:
            java.lang.String r1 = ""
            goto L_0x0051
        L_0x006b:
            int r0 = r3.A0C(r10)
            java.lang.String r1 = r8.getString(r0)
            goto L_0x0051
        L_0x0074:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12F.A04(android.content.Context, android.graphics.Paint, X.206):java.lang.CharSequence");
    }

    public CharSequence A07(Context context, Paint paint, AnonymousClass206 r11) {
        String str;
        String str2;
        int i;
        C438921i r2 = (C438921i) r11;
        String str3 = r2.A01;
        String str4 = r11.A0g;
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        } else if (str3 == null) {
            str3 = "";
        }
        if (r2.A09 == 7) {
            C18000vb r7 = this.A05;
            if (A3I.A02(r2)) {
                int A002 = C62872s8.A00(r2);
                if (A002 == 1) {
                    str2 = r2.A19();
                    if (str2 == null) {
                        str2 = context.getString(2131888741);
                    }
                } else {
                    str2 = r7.A0K(new Object[]{Integer.valueOf(A002)}, 2131755251, (long) A002);
                }
                i = 2131232184;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (str.length() <= 0) {
            str = C20097A7a.A01(r11);
            String str5 = "";
            if (str == null) {
                str = str5;
            }
            String A19 = r2.A19();
            if (A19 != null) {
                str5 = A19;
            }
            if (str.length() <= 0) {
                if (str5.length() == 0) {
                    str = this.A00.A00.getString(2131889022);
                } else {
                    str = str5;
                }
            }
            if (r2.A00 != 0) {
                String A092 = C62272r8.A04.A09(this.A05, r2);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" (");
                sb.append(A092);
                sb.append(')');
                str = sb.toString();
            }
        }
        i = 2131231686;
        if (str2 != null) {
            CharSequence A032 = C72813Np.A03(paint, A00(context, i), str2);
            C18070vi.A0X(A032);
            return A01(context, paint, r11, A032);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public CharSequence A0A(Context context, Paint paint, AnonymousClass206 r8) {
        AnonymousClass21V r2 = (AnonymousClass21V) r8;
        String A012 = C20097A7a.A01(r8);
        if (A012 == null) {
            A012 = "";
        }
        String A18 = r2.A18();
        String str = r8.A0g;
        if (str != null && str.length() != 0) {
            A18 = str;
        } else if (A18 == null) {
            A18 = "";
        }
        if (A012.length() <= 0) {
            if (A18.length() == 0 || C20097A7a.A05(r8)) {
                A012 = this.A00.A00.getString(2131889027);
                C18070vi.A0b(A012);
            } else {
                A012 = A18;
            }
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131231992), A012);
        C18070vi.A0X(A032);
        return A01(context, paint, r2, A032);
    }

    public CharSequence A0B(Context context, Paint paint, AnonymousClass206 r6) {
        C20083A6j A012 = ((C42341y1) this.A0C.get()).A01((AnonymousClass21K) r6);
        if (A012 != null) {
            CharSequence A0C2 = C26302CxJ.A0C(this.A04, this.A09, A012.A08(context, paint));
            if (A0C2 == null) {
                A0C2 = "";
            }
            return A01(context, paint, r6, A0C2);
        }
        String string = this.A00.A00.getString(2131889037);
        C18070vi.A0X(string);
        return string;
    }

    public CharSequence A0C(Context context, Paint paint, AnonymousClass206 r15) {
        SpannableStringBuilder spannableStringBuilder;
        C438721g r3 = (C438721g) r15;
        C20268AEb aEb = r3.A00;
        Paint paint2 = paint;
        if (aEb != null) {
            C18030ve r1 = this.A06;
            if (aEb.A01(r1, r15.A0v.A02)) {
                String A1C = r3.A1C(r1);
                int A002 = AnonymousClass1YL.A00(context, 2130971114, 2131102444);
                boolean z = C18000vb.A00(this.A05).A06;
                C18070vi.A0d(A1C, 1);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169432);
                if (!z) {
                    spannableStringBuilder = C72813Np.A00(paint, AnonymousClass4aX.A02(context, 2131231850, A002), A1C, dimensionPixelSize);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A1C);
                    sb.append("  ");
                    String obj = sb.toString();
                    Drawable A022 = AnonymousClass4aX.A02(context, 2131231850, A002);
                    int length = obj.length();
                    spannableStringBuilder = new SpannableStringBuilder(obj);
                    C72813Np.A04(paint2, A022, spannableStringBuilder, dimensionPixelSize, length - 1, length);
                }
                C18070vi.A0b(spannableStringBuilder);
                return spannableStringBuilder;
            }
        }
        C20268AEb aEb2 = r3.A00;
        if (aEb2 != null && AnonymousClass9Je.EXTENSIONS_1 == aEb2.A00) {
            return C78343se.A00(context, paint, r3.A1C(this.A06), AnonymousClass1YL.A00(context, 2130971114, 2131102444), C18000vb.A00(this.A05).A06);
        }
        String A0P = r15.A0P();
        if (A0P != null) {
            return A01(context, paint, r15, A0P);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public CharSequence A0G(Context context, Paint paint, AnonymousClass206 r11) {
        String obj;
        AnonymousClass21V r112 = (AnonymousClass21V) r11;
        Context context2 = this.A00.A00;
        Object[] objArr = new Object[1];
        if (r112.A0D <= 0) {
            obj = "";
        } else {
            String A0D = C64052u8.A0D(this.A05, (String) null, (long) r112.A0D);
            C18070vi.A0X(A0D);
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(A0D);
            sb.append(')');
            obj = sb.toString();
        }
        objArr[0] = obj;
        String string = context2.getString(2131889033, objArr);
        C18070vi.A0X(string);
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232405), string);
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A0J(Context context, Paint paint, AnonymousClass206 r5) {
        C439421n r1 = (C439421n) r5;
        int A002 = AnonymousClass2T8.A00(r1);
        CharSequence BXn = r1.BXn();
        C18070vi.A0X(BXn);
        if (A002 != 0) {
            Drawable A003 = C24261Jm.A00(context, A002);
            if (A003 != null) {
                BXn = C72813Np.A03(paint, A003, BXn);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C18070vi.A0b(BXn);
        return A01(context, paint, r5, BXn);
    }

    public CharSequence A0K(Context context, Paint paint, AnonymousClass206 r9) {
        CharSequence A012;
        Context context2;
        int i;
        String A0P = r9.A0P();
        String str = r9.A0g;
        if (str != null && str.length() != 0) {
            A0P = str;
        } else if (A0P == null) {
            A0P = "";
        }
        if (AnonymousClass25B.A00(r9) != null || "UNSET".equals(AnonymousClass25B.A01(r9))) {
            if (A0P.length() == 0) {
                AW0 A002 = AnonymousClass25B.A00(r9);
                if (A002 == null || !A002.A0K()) {
                    context2 = this.A00.A00;
                    i = 2131893596;
                } else {
                    context2 = this.A00.A00;
                    i = 2131893707;
                }
                A012 = context2.getString(i);
                C18070vi.A0b(A012);
            } else {
                A012 = A01(context, paint, r9, A0P);
            }
            AW0 A003 = AnonymousClass25B.A00(r9);
            if (A003 == null || C18070vi.A18(A003.A01(), AnonymousClass1KL.A0C)) {
                return A012;
            }
            CharSequence A042 = AnonymousClass1R2.A04(context, A003);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A042);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(2131102145)), 0, A042.length(), 0);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(A012);
            return spannableStringBuilder;
        } else if (!C20097A7a.A05(r9)) {
            return A01(context, paint, r9, A0P);
        } else {
            String A013 = C20097A7a.A01(r9);
            if (A013 == null) {
                A013 = "";
            }
            if (A0P.length() != 0) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb2.append('*');
                sb2.append(A0P);
                sb2.append('*');
                sb.append(sb2.toString());
                sb.append(10);
                sb.append(A013);
                A013 = sb.toString();
            }
            return A01(context, paint, r9, A013);
        }
    }

    public CharSequence A0L(Context context, Paint paint, AnonymousClass206 r9) {
        AnonymousClass21V r2 = (AnonymousClass21V) r9;
        String A18 = r2.A18();
        String str = r9.A0g;
        if (str != null && str.length() != 0) {
            A18 = str;
        } else if (A18 == null) {
            A18 = "";
        }
        String A012 = C20097A7a.A01(r9);
        if (A012 == null) {
            A012 = "";
        }
        if (A012.length() > 0) {
            A18 = A012;
        } else if (A18.length() == 0 || C20097A7a.A05(r9)) {
            A18 = this.A00.A00.getString(2131889038);
            C18070vi.A0b(A18);
        }
        if (r2.A0D != 0) {
            String A0D = C64052u8.A0D(this.A05, (String) null, (long) r2.A0D);
            C18070vi.A0X(A0D);
            StringBuilder sb = new StringBuilder();
            sb.append(A18);
            sb.append(" (");
            sb.append(A0D);
            sb.append(')');
            A18 = sb.toString();
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232405), A18);
        C18070vi.A0X(A032);
        return A01(context, paint, r2, A032);
    }

    public String A0M(Context context, AnonymousClass206 r8) {
        AnonymousClass1R2 r4 = this.A08;
        AnonymousClass205 r0 = r8.A0v;
        boolean z = r0.A02;
        AnonymousClass1BI r2 = r0.A00;
        if (r2 != null) {
            String A0O = r4.A02.A0O(r4.A01.A0H(r2));
            if (r4.A09.A03()) {
                r4.A0A.A06();
            }
            int i = 2131893648;
            if (z) {
                i = 2131893649;
            }
            String string = context.getString(i, new Object[]{A0O});
            C18070vi.A0W(string);
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final CharSequence A01(Context context, Paint paint, AnonymousClass206 r15, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (paint instanceof TextPaint) {
            int A002 = C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130970892, 2131102330));
            int A003 = C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130970132, 2131101250));
            CharSequence A022 = this.A07.A02(context, r15, charSequence2);
            C18070vi.A0X(A022);
            TextPaint textPaint = (TextPaint) paint;
            CharSequence charSequence3 = (CharSequence) C26302CxJ.A06(textPaint, this.A04, this.A09, new C25807CmK(A002, A003, 0, false, false, false, false, false), A022).A00;
            if (charSequence3 != null) {
                return charSequence3;
            }
            return A022;
        }
        C32091gc r2 = this.A07;
        CharSequence A0C2 = C26302CxJ.A0C(this.A04, this.A09, charSequence2);
        if (A0C2 != null) {
            CharSequence A023 = r2.A02(context, r15, A0C2);
            C18070vi.A0X(A023);
            return A023;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public CharSequence A02(Context context, Paint paint, AnonymousClass206 r11) {
        AnonymousClass247 r112 = (AnonymousClass247) r11;
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131231992), C49852Se.A00(context, this.A05, r112.A02, r112.A03));
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A05(Context context, Paint paint, AnonymousClass206 r10) {
        String str;
        C18000vb r6 = this.A05;
        C442022n r102 = (C442022n) r10;
        C18070vi.A0d(r102, 1);
        int size = r102.A17().size();
        if (size > 0) {
            Object[] objArr = {Integer.valueOf(size)};
            str = r6.A0K(objArr, 2131755251, (long) size);
            C18070vi.A0X(str);
        } else {
            str = "";
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232184), str);
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A06(Context context, Paint paint, AnonymousClass206 r7) {
        String string = this.A00.A00.getString(2131889020);
        C18070vi.A0X(string);
        String str = ((C442222p) r7).A00;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            String A0E = AnonymousClass1EG.A0E(str, 128);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(": ");
            sb.append(A0E);
            string = sb.toString();
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232184), string);
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A08(Context context, Paint paint, AnonymousClass206 r7) {
        AnonymousClass21V r72 = (AnonymousClass21V) r7;
        String A18 = r72.A18();
        if (A18 == null) {
            A18 = "";
        }
        if (A18.length() == 0) {
            String string = this.A00.A00.getString(2131889023);
            C18070vi.A0X(string);
            CharSequence A0C2 = C26302CxJ.A0C(this.A04, this.A09, string);
            if (A0C2 != null) {
                CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232659), A0C2);
                C18070vi.A0X(A032);
                return A032;
            }
            throw new IllegalStateException("Required value was null.");
        }
        CharSequence A033 = C72813Np.A03(paint, A00(context, 2131232659), A18);
        C18070vi.A0X(A033);
        return A01(context, paint, r72, A033);
    }

    public CharSequence A09(Context context, Paint paint, AnonymousClass206 r7) {
        AnonymousClass23S r72 = (AnonymousClass23S) r7;
        String str = r72.A04;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            Context context2 = this.A00.A00;
            int i = 2131889024;
            if (r72.A00 == 1) {
                i = 2131889030;
            }
            str = context2.getString(i);
        }
        C18070vi.A0b(str);
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232662), str);
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A0D(Context context, Paint paint, AnonymousClass206 r6) {
        String str;
        AnonymousClass219 r0;
        if (!(r6 instanceof AnonymousClass219) || (r0 = (AnonymousClass219) r6) == null || (str = r0.A03) == null) {
            str = "";
        }
        if (str.length() == 0) {
            String string = this.A00.A00.getString(2131889028);
            C18070vi.A0X(string);
            CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232235), string);
            C18070vi.A0X(A032);
            return A032;
        }
        CharSequence A033 = C72813Np.A03(paint, A00(context, 2131232235), str);
        C18070vi.A0X(A033);
        return A01(context, paint, r6, A033);
    }

    public CharSequence A0E(Context context, Paint paint, AnonymousClass206 r5) {
        String A022 = C63752td.A02(this.A05, (AnonymousClass22U) r5);
        C18070vi.A0X(A022);
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232305), A022);
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A0F(Context context, Paint paint, AnonymousClass206 r5) {
        String str;
        AnonymousClass22G r52;
        if (!(r5 instanceof AnonymousClass22G) || (r52 = (AnonymousClass22G) r5) == null || (str = r52.BXE()) == null) {
            str = "";
        }
        C87544Vz.A01(this.A06);
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232664), str);
        C18070vi.A0X(A032);
        return A032;
    }

    public CharSequence A0I(Context context, Paint paint, AnonymousClass206 r5) {
        String str;
        C441522i r52;
        if (!(r5 instanceof C441522i) || (r52 = (C441522i) r5) == null || (str = r52.A03) == null) {
            str = this.A00.A00.getString(2131889035);
            C18070vi.A0X(str);
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232330), str);
        C18070vi.A0X(A032);
        return A032;
    }

    public static final Drawable A00(Context context, int i) {
        Drawable A022 = AnonymousClass4aX.A02(context, i, AnonymousClass1YL.A01(context, 2130971964, 2131103120, false));
        C18070vi.A0X(A022);
        return A022;
    }

    public CharSequence A0H(Context context, Paint paint, AnonymousClass206 r6) {
        AnonymousClass21B r0;
        String str;
        String A012 = C20097A7a.A01(r6);
        String str2 = "";
        if (A012 == null) {
            A012 = str2;
        }
        if (!(!(r6 instanceof AnonymousClass21B) || (r0 = (AnonymousClass21B) r6) == null || (str = r0.A01) == null)) {
            str2 = str;
        }
        if (A012.length() <= 0) {
            if (str2.length() == 0) {
                A012 = this.A00.A00.getString(2131889029);
            } else {
                A012 = str2;
            }
        }
        CharSequence A032 = C72813Np.A03(paint, A00(context, 2131232062), A012);
        C18070vi.A0X(A032);
        return A01(context, paint, r6, A032);
    }
}
