package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.1xh  reason: invalid class name and case insensitive filesystem */
public class C42141xh {
    public final Context A00;
    public final TextEmojiLabel A01;
    public final C24921Me A02;
    public final C18030ve A03;
    public final C18000vb A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass00H A06 = new C18150vq((Object) null, new AnonymousClass3DS(0));

    public void A05(AnonymousClass1E7 r2) {
        A08(r2, -1);
    }

    public void A06(AnonymousClass1E7 r8) {
        A04(this.A02.A0D(r8, -1), r8, (List) null, -1, false);
    }

    public void A07(AnonymousClass1E7 r11, int i) {
        String str;
        AnonymousClass1E7 r6 = r11;
        String A032 = C24921Me.A03(this.A02, r11, 2131898919);
        C42741yf r1 = r11.A0G;
        int i2 = i;
        if (!A032.isEmpty() && r11.A0H == null && !r11.A0C() && (r1 == null || (str = r1.A08) == null || str.isEmpty())) {
            if (C18020vd.A05(C18040vf.A02, this.A03, 8000)) {
                A04(new C42751yg(A032, AnonymousClass00R.A0Y), r6, (List) null, i2, A0D(r11, i));
                return;
            }
        }
        A08(r11, i);
    }

    public void A08(AnonymousClass1E7 r8, int i) {
        A04(this.A02.A0D(r8, i), r8, (List) null, i, A0D(r8, i));
    }

    public void A0A(AnonymousClass1E7 r8, List list) {
        AnonymousClass1E7 r3 = r8;
        C42751yg A0D = this.A02.A0D(r8, -1);
        boolean z = false;
        if (A0C(r8)) {
            z = true;
        }
        A04(A0D, r3, list, -1, z);
    }

    public static SpannableStringBuilder A00(C42141xh r5, CharSequence charSequence, CharSequence charSequence2) {
        AnonymousClass1X3 r1;
        AnonymousClass1X5 r0;
        C18000vb r4 = r5.A04;
        AnonymousClass1X3 r12 = C18000vb.A00(r4).A01;
        SpannableStringBuilder A022 = r12.A02(r12.A00, charSequence2);
        C42811ym r2 = null;
        try {
            r2 = ((C42771yi) r5.A06.get()).A0H(charSequence.toString(), (String) null);
        } catch (C24931Mf unused) {
        }
        if (r2 == null || !((C42771yi) r5.A06.get()).A0N(r2)) {
            r1 = C18000vb.A00(r4).A01;
            r0 = r1.A00;
        } else {
            r1 = C18000vb.A00(r4).A01;
            r0 = AnonymousClass1X4.A04;
        }
        SpannableStringBuilder A023 = r1.A02(r0, charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(A023).append(" ").append(A022);
        return spannableStringBuilder;
    }

    public void A02() {
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(2131898595);
        textEmojiLabel.A0N();
    }

    public void A03(int i) {
        TextEmojiLabel textEmojiLabel;
        int A012;
        if (i != 0) {
            if (i != 1) {
                textEmojiLabel = this.A01;
                if (i != 2) {
                    A012 = C196929vs.A00(this.A03);
                } else {
                    C18030ve r2 = this.A03;
                    C18070vi.A0d(r2, 0);
                    A012 = 2131232391;
                    if (C18020vd.A05(C18040vf.A02, r2, 5276)) {
                        A012 = 2131232390;
                    }
                }
            } else {
                textEmojiLabel = this.A01;
                A012 = C196929vs.A01(this.A03);
            }
            textEmojiLabel.A0O(A012, 2131169136);
            return;
        }
        this.A01.A0N();
    }

    public void A04(C42751yg r5, AnonymousClass1E7 r6, List list, int i, boolean z) {
        TextEmojiLabel textEmojiLabel = this.A01;
        int i2 = 0;
        textEmojiLabel.A0S(r5.A01, list, 256, false);
        if (AnonymousClass00R.A0Y == r5.A00 && i == 7) {
            textEmojiLabel.setContentDescription(C24921Me.A03(this.A02, r6, 2131898920));
        }
        if (z) {
            i2 = 1;
            if (i == 1 || i == -1 || i == 10) {
                i2 = 3;
            }
        }
        A03(i2);
    }

    public void A09(AnonymousClass1E7 r13, C43351zf r14, List list, float f) {
        Context context = this.A00;
        String A0L = this.A02.A0L(r13);
        if (A0L == null) {
            A0L = "";
        }
        String string = context.getString(2131892103);
        TextEmojiLabel textEmojiLabel = this.A01;
        float f2 = f;
        int i = 0;
        if (f == 1.0f) {
            i = 256;
        }
        CharSequence A0M = textEmojiLabel.A0M(r14, A0L, list, f2, i, false, false);
        SpannableStringBuilder A002 = A00(this, A0M, string);
        C61222pK.A00(A002, A002);
        textEmojiLabel.A00 = new C65832xB(A002, this, A0M, string);
        textEmojiLabel.setText(A002);
        A03(r13.A0P() ? 1 : 0);
    }

    public void A0B(List list, CharSequence charSequence) {
        if (this instanceof C42151xi) {
            ((C42151xi) this).A0F((C43351zf) null, charSequence, list);
        } else {
            this.A01.A0S(charSequence, list, 0, false);
        }
    }

    public boolean A0C(AnonymousClass1E7 r3) {
        AnonymousClass1CJ r1;
        C46162Dk r0;
        if (!C22971Dz.A0V(r3.A0J) || (r1 = this.A05) == null || (r0 = (C46162Dk) r1.A0A(r3.A0J)) == null) {
            return r3.A0P();
        }
        return AnonymousClass000.A1Z(r0.A05, AnonymousClass9IW.VERIFIED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A03, 10342) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(X.AnonymousClass1E7 r4, int r5) {
        /*
            r3 = this;
            r0 = 11
            if (r5 == r0) goto L_0x0008
            r0 = 10
            if (r5 != r0) goto L_0x0019
        L_0x0008:
            X.0ve r2 = r3.A03
            r1 = 10342(0x2866, float:1.4492E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            boolean r0 = r4.A0O()
            return r0
        L_0x0019:
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x002c
            X.1Me r0 = r3.A02
            boolean r0 = r0.A0i(r4)
            if (r0 != 0) goto L_0x0014
            X.2lf r0 = r4.A0H
            if (r0 != 0) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.A0O()
            if (r0 == 0) goto L_0x003a
            r0 = 1
            return r0
        L_0x003a:
            boolean r0 = r3.A0C(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42141xh.A0D(X.1E7, int):boolean");
    }

    public C42141xh(Context context, TextEmojiLabel textEmojiLabel, C24921Me r6, C18000vb r7, AnonymousClass1CJ r8, C18030ve r9) {
        C17960vV.A07(context);
        this.A00 = context;
        C17960vV.A05(textEmojiLabel);
        this.A01 = textEmojiLabel;
        C17960vV.A07(r6);
        this.A02 = r6;
        C17960vV.A07(r7);
        this.A04 = r7;
        this.A05 = r8;
        C17960vV.A07(r9);
        this.A03 = r9;
    }

    public static C42141xh A01(View view, C72043Kk r3, int i) {
        return r3.BGE(view.getContext(), (TextEmojiLabel) AnonymousClass1HF.A06(view, i));
    }
}
