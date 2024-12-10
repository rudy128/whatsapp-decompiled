package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0qL  reason: invalid class name and case insensitive filesystem */
public final class C15260qL extends AnonymousClass11G implements AnonymousClass20J {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C26251Cvq $bodyLarge;
    public final /* synthetic */ C26251Cvq $bodySmall;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ AnonymousClass1OS $container;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ AnonymousClass1OS $innerTextField;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leadingIcon;
    public final /* synthetic */ AnonymousClass1OS $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supportingText;
    public final /* synthetic */ AnonymousClass1OS $trailingIcon;
    public final /* synthetic */ String $transformedText;
    public final /* synthetic */ AnonymousClass0CJ $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15260qL(C16110rj r2, AnonymousClass0tB r3, AnonymousClass0NY r4, AnonymousClass0CJ r5, C26251Cvq cvq, C26251Cvq cvq2, String str, AnonymousClass1OS r9, AnonymousClass1OS r10, AnonymousClass1OS r11, AnonymousClass1OS r12, AnonymousClass1OS r13, AnonymousClass1OS r14, AnonymousClass1OS r15, AnonymousClass1OS r16, AnonymousClass1OS r17, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(7);
        this.$label = r9;
        this.$placeholder = r10;
        this.$transformedText = str;
        this.$colors = r4;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = r2;
        this.$$dirty1 = i;
        this.$prefix = r11;
        this.$suffix = r12;
        this.$leadingIcon = r13;
        this.$trailingIcon = r14;
        this.$supportingText = r15;
        this.$type = r5;
        this.$innerTextField = r16;
        this.$singleLine = z3;
        this.$contentPadding = r3;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z4;
        this.$bodyLarge = cvq;
        this.$bodySmall = cvq2;
        this.$container = r17;
    }

    public static final String A00(C17130tn r1) {
        r1.BFh(AnonymousClass0PK.A00);
        String string = ((Context) r1.BFh(AnonymousClass0PK.A01)).getResources().getString(2131898871);
        C18070vi.A0X(string);
        return string;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        C17130tn r1 = (C17130tn) obj6;
        A01(r1, AnonymousClass000.A04(obj), AnonymousClass000.A04(obj4), AnonymousClass000.A04(obj5), AnonymousClass000.A0M(obj7), ((C05100Qk) obj2).A00, ((C05100Qk) obj3).A00);
        return C27621Wu.A00;
    }

    public final void A01(C17130tn r42, float f, float f2, float f3, int i, long j, long j2) {
        int i2;
        AnonymousClass04D r17;
        AnonymousClass04D r24;
        AnonymousClass04D r20;
        AnonymousClass04D r21;
        AnonymousClass04D r18;
        AnonymousClass04D r19;
        AnonymousClass04D r23;
        int i3 = i;
        C17130tn r13 = r42;
        float f4 = f;
        if ((i & 14) == 0) {
            i2 = AnonymousClass000.A09(r13.BEc(f4) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        long j3 = j;
        if ((i & 112) == 0) {
            i2 |= AnonymousClass000.A0A(r13.BEe(j3) ? 1 : 0);
        }
        long j4 = j2;
        if ((i3 & 896) == 0) {
            i2 |= AnonymousClass001.A0P(r13, j4);
        }
        float f5 = f2;
        if ((i3 & 7168) == 0) {
            boolean BEc = r13.BEc(f5);
            int i4 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (BEc) {
                i4 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            i2 |= i4;
        }
        float f6 = f3;
        if ((i & 57344) == 0) {
            i2 |= AnonymousClass000.A08(r13.BEc(f6) ? 1 : 0);
        }
        if ((374491 & i2) != 74898 || !r13.BZO()) {
            AnonymousClass1OS r10 = this.$label;
            if (r10 != null) {
                r17 = AnonymousClass0LC.A00(r13, new C14520p9(r10, f4, i2, j4, j3, this.$shouldOverrideTextStyleColor), -382297919);
            } else {
                r17 = null;
            }
            AnonymousClass1OS r11 = this.$placeholder;
            if (r11 == null || this.$transformedText.length() != 0 || f2 <= 0.0f) {
                r24 = null;
            } else {
                AnonymousClass0NY r102 = this.$colors;
                boolean z = this.$enabled;
                boolean z2 = this.$isError;
                C16110rj r4 = this.$interactionSource;
                C16110rj r192 = r4;
                r24 = AnonymousClass0LC.A00(r13, new C14930po(r192, r102, r11, f5, this.$$dirty1, this.$$dirty, z, z2), -524658155);
            }
            long A0V = AnonymousClass000.A0V(this.$colors.A04(this.$interactionSource, r13, this.$enabled, this.$isError));
            AnonymousClass1OS r43 = this.$prefix;
            if (r43 == null || f3 <= 0.0f) {
                r20 = null;
            } else {
                r20 = AnonymousClass0LC.A00(r13, new C13490nU(this.$bodyLarge, r43, f6, this.$$dirty, A0V), 1824482619);
            }
            long A0V2 = AnonymousClass000.A0V(this.$colors.A05(this.$interactionSource, r13, this.$enabled, this.$isError));
            AnonymousClass1OS r44 = this.$suffix;
            if (r44 == null || f3 <= 0.0f) {
                r21 = null;
            } else {
                r21 = AnonymousClass0LC.A00(r13, new C13500nV(this.$bodyLarge, r44, f6, this.$$dirty, A0V2), 907456412);
            }
            String A00 = A00(r13);
            AnonymousClass0WC r45 = C17090tj.A00;
            boolean z3 = this.$isError;
            boolean A1Y = AnonymousClass001.A1Y(r13, Boolean.valueOf(z3), A00);
            Object CER = r13.CER();
            if (A1Y || CER == AnonymousClass0MH.A00) {
                CER = new C10990jJ(z3, A00);
                AnonymousClass0VR.A0V(r13, CER);
            }
            AnonymousClass0VR r2 = (AnonymousClass0VR) r13;
            boolean z4 = false;
            AnonymousClass0VR.A0R(r2, false);
            C17090tj A01 = AnonymousClass0PD.A02(r45, (C22821Di) CER, false);
            long A0V3 = AnonymousClass000.A0V(this.$colors.A02(this.$interactionSource, r13, this.$enabled, this.$isError));
            AnonymousClass1OS r6 = this.$leadingIcon;
            if (r6 != null) {
                r18 = AnonymousClass0LC.A00(r13, new C13170mw(r6, A0V3), 90769583);
            } else {
                r18 = null;
            }
            long A0V4 = AnonymousClass000.A0V(this.$colors.A08(this.$interactionSource, r13, this.$enabled, this.$isError));
            AnonymousClass1OS r62 = this.$trailingIcon;
            if (r62 != null) {
                r19 = AnonymousClass0LC.A00(r13, new C13180mx(r62, A0V4), 2077796155);
            } else {
                r19 = null;
            }
            long A0V5 = AnonymousClass000.A0V(this.$colors.A06(this.$interactionSource, r13, this.$enabled, this.$isError));
            AnonymousClass1OS r63 = this.$supportingText;
            if (r63 != null) {
                r23 = AnonymousClass0LC.A00(r13, new C13280n9(this.$bodySmall, r63, A0V5), -1531019900);
            } else {
                r23 = null;
            }
            int ordinal = this.$type.ordinal();
            if (ordinal == 0) {
                r13.COB(404043011);
                AnonymousClass04D A002 = AnonymousClass0LC.A00(r13, new C13160mv(this.$container, this.$$dirty1), -2124779163);
                AnonymousClass1OS r64 = this.$innerTextField;
                boolean z5 = this.$singleLine;
                AnonymousClass0tB r3 = this.$contentPadding;
                int i5 = this.$$dirty1;
                AnonymousClass0EG.A00(r3, r13, A01, r64, r17, r18, r19, r20, r21, A002, r23, r24, f4, ((this.$$dirty >> 3) & 112) | ((i5 << 21) & 234881024) | ((i2 << 27) & 1879048192), ((i5 >> 9) & 896) | 6, z5);
            } else if (ordinal != 1) {
                r13.COB(404045731);
            } else {
                Object A1C = AnonymousClass001.A1C(r13, 404044017);
                Object obj = AnonymousClass0MH.A00;
                if (A1C == obj) {
                    A1C = AnonymousClass0Q9.A02(new AnonymousClass0QG(AnonymousClass0QG.A02));
                    r2.A0c(A1C);
                }
                z4 = false;
                AnonymousClass0VR.A0R(r2, false);
                C17330uU r32 = (C17330uU) A1C;
                AnonymousClass04D A003 = AnonymousClass0LC.A00(r13, new C14510p8(this.$contentPadding, r32, this.$container, this.$$dirty1), 1902535592);
                AnonymousClass1OS r7 = this.$innerTextField;
                boolean z6 = this.$singleLine;
                boolean A1Y2 = AnonymousClass001.A1Y(r13, Float.valueOf(f4), r32);
                Object CER2 = r13.CER();
                if (A1Y2 || CER2 == obj) {
                    CER2 = new C10320i9(r32, f4);
                    r2.A0c(CER2);
                }
                AnonymousClass0VR.A0R(r2, false);
                AnonymousClass0tB r12 = this.$contentPadding;
                int i6 = this.$$dirty1;
                AnonymousClass1OS r16 = r7;
                AnonymousClass0L7.A01(r12, r13, A01, (C22821Di) CER2, r16, r17, r18, r19, r20, r21, A003, r23, r24, f4, ((this.$$dirty >> 3) & 112) | ((i6 << 21) & 234881024) | ((i2 << 27) & 1879048192), ((i6 >> 6) & 7168) | 48, z6);
            }
            AnonymousClass0VR.A0R(r2, z4);
            return;
        }
        r13.CNR();
    }
}
