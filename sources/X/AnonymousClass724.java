package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.724  reason: invalid class name */
public final class AnonymousClass724 {
    public final AnonymousClass1KB A00;
    public final C72043Kk A01;
    public final A1M A02;
    public final AnonymousClass1VW A03;
    public final AnonymousClass1M9 A04;
    public final C24921Me A05;
    public final C27201Vd A06;
    public final AnonymousClass11C A07;
    public final AnonymousClass118 A08;
    public final C18000vb A09;
    public final AnonymousClass1KW A0A;
    public final C18030ve A0B;
    public final AnonymousClass72F A0C;
    public final AnonymousClass1R2 A0D;
    public final C26631Sw A0E;
    public final C32021gV A0F;
    public final AnonymousClass10I A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass1MZ A0I;
    public final AnonymousClass00H A0J;

    public void A02(View view, AnonymousClass206 r21, C135486sH r22) {
        Integer num;
        int i;
        int i2;
        int A002;
        int i3;
        Integer num2;
        AnonymousClass1M9 r1;
        AnonymousClass1BI r0;
        int i4;
        Context context;
        int i5;
        View view2 = view;
        Context context2 = view2.getContext();
        C136606u5 A003 = AnonymousClass6WB.A00(view2);
        C72043Kk r2 = this.A01;
        TextEmojiLabel textEmojiLabel = A003.A0A;
        C42141xh BGE = r2.BGE(textEmojiLabel.getContext(), textEmojiLabel);
        C135486sH r12 = r22;
        AnonymousClass1BI r3 = r12.A00;
        AnonymousClass206 r13 = r21;
        AnonymousClass205 r23 = r13.A0v;
        AnonymousClass1BI r14 = r23.A00;
        if (C22971Dz.A0V(r14) || C22971Dz.A0V(r3)) {
            num = AnonymousClass00R.A0j;
        } else if (C22971Dz.A0a(r14)) {
            num = AnonymousClass00R.A0Y;
        } else {
            if (C22971Dz.A0e(r14)) {
                if (!C18070vi.A18(r14, r3)) {
                    num = AnonymousClass00R.A0N;
                } else if (!r23.A02) {
                    num = AnonymousClass00R.A0C;
                }
            } else if (!r23.A02) {
                num = AnonymousClass00R.A01;
            }
            num = AnonymousClass00R.A00;
        }
        if (num == AnonymousClass00R.A00 || num == AnonymousClass00R.A0C || num == AnonymousClass00R.A01 || num == AnonymousClass00R.A0j) {
            int intValue = num.intValue();
            if (intValue == 0) {
                C18070vi.A0b(context2);
                i = A00(context2);
                BGE.A02();
            } else if (intValue != 2) {
                if (intValue == 1) {
                    r1 = this.A04;
                    r0 = r13.A0I();
                    if (r0 == null) {
                        r0 = r3;
                        if (r3 == null) {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    }
                } else if (intValue != 5) {
                    r1 = this.A04;
                    r0 = r13.A0I();
                    if (r0 == null) {
                        r0 = r3;
                        if (r3 == null) {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    }
                } else {
                    AnonymousClass1M9 r02 = this.A04;
                    if (r3 != null) {
                        AnonymousClass1E7 A0H2 = r02.A0H(r3);
                        C18070vi.A0b(context2);
                        i = A00(context2);
                        BGE.A06(A0H2);
                        A003.A05.setVisibility(8);
                        A003.A08.setVisibility(8);
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                }
                AnonymousClass1E7 A0H3 = r1.A0H(r0);
                C18070vi.A0b(context2);
                i = C19740yt.A00(context2, AnonymousClass1YL.A01(context2, 2130970893, 2131102331, false));
                BGE.A08(A0H3, -1);
            } else {
                AnonymousClass1BI A0H4 = r13.A0H();
                if (A0H4 != null) {
                    UserJid userJid = (UserJid) A0H4;
                    AnonymousClass1E7 A0H5 = this.A04.A0H(userJid);
                    AnonymousClass1MZ r03 = this.A0I;
                    C18070vi.A0z(r14, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                    C63312sr A052 = r03.A05((AnonymousClass1E9) r14, userJid);
                    if (A052 != null) {
                        C18070vi.A0b(context2);
                        A002 = C84024Ho.A00(context2, A052);
                    } else {
                        A002 = C19740yt.A00(context2, 2131102080);
                    }
                    if (r12.A02) {
                        i3 = this.A05.A08(A0H5, r3);
                    } else {
                        i3 = 1;
                    }
                    C42751yg A0D2 = this.A05.A0D(A0H5, i3);
                    C42141xh r132 = BGE;
                    C42751yg r142 = A0D2;
                    AnonymousClass1E7 r15 = A0H5;
                    r132.A04(r142, r15, (List) null, i3, A0H5.A0P());
                    if (7 == i3 && AnonymousClass00R.A0Y == (num2 = A0D2.A00)) {
                        TextEmojiLabel textEmojiLabel2 = A003.A08;
                        ((AnonymousClass4XA) this.A0J.get()).A01(textEmojiLabel2, A0H5, num2, i3);
                        ((AnonymousClass3Q3) C18070vi.A05(view2, 2131434308)).A00 = true;
                        C29261bv.A08(textEmojiLabel2, 2132083182);
                        textEmojiLabel2.setPadding(context2.getResources().getDimensionPixelSize(2131169440), 0, 0, 0);
                        i2 = AnonymousClass3Ma.A00(context2, 2130970022, 2131101162);
                    }
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            i2 = i;
        } else {
            if (r23.A02) {
                C18070vi.A0b(context2);
                i = A00(context2);
                BGE.A02();
            } else {
                if (num.intValue() == 3) {
                    AnonymousClass1MZ r8 = this.A0I;
                    C18070vi.A0z(r14, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                    AnonymousClass1E9 r32 = (AnonymousClass1E9) r14;
                    AnonymousClass1BI A0H6 = r13.A0H();
                    if (A0H6 != null) {
                        C63312sr A053 = r8.A05(r32, (UserJid) A0H6);
                        if (A053 != null) {
                            C18070vi.A0b(context2);
                            i = C84024Ho.A00(context2, A053);
                        } else {
                            i4 = 2131102080;
                            i = C19740yt.A00(context2, i4);
                        }
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                } else {
                    C18070vi.A0b(context2);
                    i4 = AnonymousClass1YL.A01(context2, 2130970893, 2131102331, false);
                    i = C19740yt.A00(context2, i4);
                }
                AnonymousClass1M9 r82 = this.A04;
                AnonymousClass1BI A0H7 = r13.A0H();
                if (A0H7 != null) {
                    BGE.A08(r82.A0H(A0H7), -1);
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            i2 = i;
            A003.A05.setVisibility(0);
            TextEmojiLabel textEmojiLabel3 = A003.A08;
            textEmojiLabel3.setVisibility(0);
            AnonymousClass1M9 r11 = this.A04;
            if (r14 != null) {
                AnonymousClass1E7 A0H8 = r11.A0H(r14);
                String A0I2 = this.A05.A0I(A0H8);
                int intValue2 = num.intValue();
                if (intValue2 != 3) {
                    if (intValue2 == 4) {
                        context = this.A08.A00;
                        i5 = 2131896303;
                    }
                } else if (A01(this, A0H8)) {
                    textEmojiLabel3.A0S(A0I2, (List) null, 0, false);
                } else {
                    context = this.A08.A00;
                    i5 = 2131890864;
                }
                textEmojiLabel3.A0S(context.getString(i5), (List) null, 0, false);
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        }
        C18070vi.A0b(context2);
        int A054 = AnonymousClass1Z2.A05(AnonymousClass3Ma.A00(context2, 2130971964, 2131103119), i);
        BGE.A01.setTextColor(A054);
        A003.A05.setTextColor(A054);
        A003.A08.setTextColor(AnonymousClass1Z2.A05(AnonymousClass3Ma.A00(context2, 2130971964, 2131103119), i2));
        A003.A00.setBackgroundColor(i);
    }

    public void A03(View view, AnonymousClass206 r14, boolean z) {
        C693336u A0O;
        C20279AEn aEn;
        List list;
        AET aet;
        String str;
        AnonymousClass206 r5 = r14;
        C18070vi.A0d(r14, 0);
        ImageView imageView = AnonymousClass6WB.A00(view).A02;
        C32021gV r3 = this.A0F;
        AnonymousClass7NB r6 = new AnonymousClass7NB(imageView, r3);
        if (!C18020vd.A05(C18040vf.A02, this.A0B, 7581) || !(r14 instanceof AnonymousClass21R) || !((A0O = r14.A0O()) == null || A0O.A01() == null)) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (z) {
                r3.A0F(imageView, r5, r6, AnonymousClass206.A03(r14, "quoted-", A10), 100, false, true, true);
            } else {
                C32021gV.A07(imageView, r14, r6, r3, AnonymousClass206.A03(r14, "quoted-", A10));
            }
        } else {
            C136606u5 A002 = AnonymousClass6WB.A00(view);
            C20285AEt aEt = ((AnonymousClass21L) r5).A00;
            if (aEt != null && (aEn = aEt.A02) != null && (list = aEn.A0D.A09) != null && !list.isEmpty() && (aet = (AET) C29431cG.A0b(list)) != null && (str = aet.A00) != null) {
                this.A0G.CGD(new AnonymousClass6LU(A002.A02, str), new String[0]);
            }
        }
    }

    public AnonymousClass724(AnonymousClass1KB r23, C72043Kk r24, A1M a1m, AnonymousClass1VW r26, AnonymousClass1M9 r27, C24921Me r28, C27201Vd r29, AnonymousClass11C r30, AnonymousClass118 r31, C18000vb r32, AnonymousClass1MZ r33, AnonymousClass1KW r34, C18030ve r35, AnonymousClass72F r36, AnonymousClass1R2 r37, C26631Sw r38, C32021gV r39, AnonymousClass10I r40, AnonymousClass00H r41, AnonymousClass00H r42) {
        AnonymousClass10I r4 = r40;
        AnonymousClass118 r12 = r31;
        AnonymousClass1KW r9 = r34;
        C18030ve r15 = r35;
        AnonymousClass1KB r21 = r23;
        C18070vi.A0w(r15, r21, r12, r4, r9);
        AnonymousClass1R2 r7 = r37;
        A1M a1m2 = a1m;
        AnonymousClass1VW r18 = r26;
        AnonymousClass1M9 r17 = r27;
        C27201Vd r14 = r29;
        C18070vi.A0x(a1m2, r14, r7, r18, r17);
        C32021gV r5 = r39;
        AnonymousClass00H r3 = r41;
        C18000vb r11 = r32;
        C24921Me r16 = r28;
        AnonymousClass11C r13 = r30;
        C18070vi.A0y(r3, r13, r16, r11, r5);
        C26631Sw r6 = r38;
        AnonymousClass00H r2 = r42;
        AnonymousClass1MZ r10 = r33;
        AnonymousClass72F r8 = r36;
        C18070vi.A0t(r6, r10, r2, r8);
        C72043Kk r20 = r24;
        C18070vi.A0d(r20, 20);
        this.A0B = r15;
        this.A00 = r21;
        this.A08 = r12;
        this.A0G = r4;
        this.A0A = r9;
        this.A02 = a1m2;
        this.A06 = r14;
        this.A0D = r7;
        this.A03 = r18;
        this.A04 = r17;
        this.A0H = r3;
        this.A07 = r13;
        this.A05 = r16;
        this.A09 = r11;
        this.A0F = r5;
        this.A0E = r6;
        this.A0I = r10;
        this.A0J = r2;
        this.A0C = r8;
        this.A01 = r20;
    }

    public static final boolean A01(AnonymousClass724 r1, AnonymousClass1E7 r2) {
        String A0I2 = r1.A05.A0I(r2);
        if (A0I2 == null || A0I2.length() == 0 || A0I2.equals(r1.A08.A00.getString(2131891156))) {
            return false;
        }
        return true;
    }

    public static final int A00(Context context) {
        return C19740yt.A00(context, AnonymousClass1YL.A01(context, 2130970828, 2131102239, false));
    }
}
