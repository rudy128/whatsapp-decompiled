package X;

/* renamed from: X.0m6  reason: invalid class name and case insensitive filesystem */
public final class C12650m6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $containerPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $labelPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $leadingPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $placeholderPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $prefixPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $suffixPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $supportingPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $textFieldPlaceable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ int $totalHeight;
    public final /* synthetic */ AnonymousClass0XJ $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ AnonymousClass0X9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12650m6(AnonymousClass0X9 r2, C17530uo r3, AnonymousClass0XJ r4, AnonymousClass0XJ r5, AnonymousClass0XJ r6, AnonymousClass0XJ r7, AnonymousClass0XJ r8, AnonymousClass0XJ r9, AnonymousClass0XJ r10, AnonymousClass0XJ r11, AnonymousClass0XJ r12, int i, int i2) {
        super(1);
        this.$totalHeight = i;
        this.$width = i2;
        this.$leadingPlaceable = r4;
        this.$trailingPlaceable = r5;
        this.$prefixPlaceable = r6;
        this.$suffixPlaceable = r7;
        this.$textFieldPlaceable = r8;
        this.$labelPlaceable = r9;
        this.$placeholderPlaceable = r10;
        this.$containerPlaceable = r11;
        this.$supportingPlaceable = r12;
        this.this$0 = r2;
        this.$this_measure = r3;
    }

    public final void A02(AnonymousClass0QZ r32) {
        AnonymousClass0QZ r15 = r32;
        C18070vi.A0d(r15, 0);
        int i = this.$totalHeight;
        int i2 = this.$width;
        AnonymousClass0XJ r10 = this.$leadingPlaceable;
        AnonymousClass0XJ r9 = this.$trailingPlaceable;
        AnonymousClass0XJ r8 = this.$prefixPlaceable;
        AnonymousClass0XJ r7 = this.$suffixPlaceable;
        AnonymousClass0XJ r6 = this.$textFieldPlaceable;
        AnonymousClass0XJ r5 = this.$labelPlaceable;
        AnonymousClass0XJ r4 = this.$placeholderPlaceable;
        AnonymousClass0XJ r3 = this.$containerPlaceable;
        AnonymousClass0XJ r2 = this.$supportingPlaceable;
        AnonymousClass0X9 r13 = this.this$0;
        float f = r13.A00;
        boolean z = r13.A02;
        C17530uo r14 = this.$this_measure;
        float BQU = r14.BQU();
        AnonymousClass0XJ r24 = r2;
        AnonymousClass0XJ r23 = r3;
        AnonymousClass0XJ r22 = r4;
        AnonymousClass0XJ r21 = r5;
        AnonymousClass0XJ r20 = r6;
        AnonymousClass0XJ r19 = r7;
        AnonymousClass0XJ r18 = r8;
        AnonymousClass0XJ r17 = r9;
        AnonymousClass0XJ r16 = r10;
        A00(r13.A01, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r14.getLayoutDirection(), f, BQU, i, i2, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A02((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }

    public static final void A00(AnonymousClass0tB r10, AnonymousClass0QZ r11, AnonymousClass0XJ r12, AnonymousClass0XJ r13, AnonymousClass0XJ r14, AnonymousClass0XJ r15, AnonymousClass0XJ r16, AnonymousClass0XJ r17, AnonymousClass0XJ r18, AnonymousClass0XJ r19, AnonymousClass0XJ r20, C24246By4 by4, float f, float f2, int i, int i2, boolean z) {
        int i3;
        float f3;
        AnonymousClass0QZ.A04(r19, 0.0f, C79.A00());
        AnonymousClass0XJ r3 = r20;
        int A0J = i - AnonymousClass000.A0J(r3);
        int A01 = C22339B3q.A01(r10.BE0() * f2);
        int A012 = C22339B3q.A01(AnonymousClass0Q7.A01(r10, by4) * f2);
        float f4 = 12.0f * f2;
        if (r12 != null) {
            r11.A0B(r12, 0, AnonymousClass0XJ.A0S(r12, A0J));
        }
        if (r13 != null) {
            r11.A0B(r13, i2 - r13.A01, AnonymousClass0XJ.A0S(r13, A0J));
        }
        AnonymousClass0XJ r6 = r17;
        if (r17 != null) {
            if (z) {
                i3 = AnonymousClass0XJ.A0S(r6, A0J);
            } else {
                i3 = A01;
            }
            int A00 = C7E.A00(f, i3, -(r6.A00 / 2));
            if (r12 == null) {
                f3 = 0.0f;
            } else {
                f3 = (((float) r12.A01) - f4) * (1.0f - f);
            }
            r11.A0B(r6, C22339B3q.A01(f3) + A012, A00);
        }
        if (r14 != null) {
            int A0K = AnonymousClass000.A0K(r12);
            int i4 = A01;
            if (z) {
                i4 = AnonymousClass0XJ.A0S(r14, A0J);
            }
            r11.A0B(r14, A0K, Math.max(i4, AnonymousClass000.A0J(r6) / 2));
        }
        if (r15 != null) {
            int A0K2 = (i2 - AnonymousClass000.A0K(r13)) - r15.A01;
            int i5 = A01;
            if (z) {
                i5 = AnonymousClass0XJ.A0S(r15, A0J);
            }
            r11.A0B(r15, A0K2, Math.max(i5, AnonymousClass000.A0J(r6) / 2));
        }
        int A0K3 = AnonymousClass000.A0K(r12) + AnonymousClass000.A0K(r14);
        int i6 = A01;
        AnonymousClass0XJ r7 = r16;
        if (z) {
            i6 = AnonymousClass0XJ.A0S(r7, A0J);
        }
        r11.A0B(r7, A0K3, Math.max(i6, AnonymousClass000.A0J(r6) / 2));
        AnonymousClass0XJ r1 = r18;
        if (r18 != null) {
            if (z) {
                A01 = AnonymousClass0XJ.A0S(r1, A0J);
            }
            r11.A0B(r1, A0K3, Math.max(A01, AnonymousClass000.A0J(r6) / 2));
        }
        if (r20 != null) {
            r11.A0B(r3, 0, A0J);
        }
    }
}
