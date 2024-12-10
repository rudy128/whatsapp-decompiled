package X;

/* renamed from: X.0m7  reason: invalid class name and case insensitive filesystem */
public final class C12660m7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $containerPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $labelPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $leadingPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $placeholderPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $prefixPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $suffixPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $supportingPlaceable;
    public final /* synthetic */ AnonymousClass0XJ $textFieldPlaceable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ int $topPaddingValue;
    public final /* synthetic */ int $totalHeight;
    public final /* synthetic */ AnonymousClass0XJ $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ AnonymousClass0X8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12660m7(AnonymousClass0X8 r2, C17530uo r3, AnonymousClass0XJ r4, AnonymousClass0XJ r5, AnonymousClass0XJ r6, AnonymousClass0XJ r7, AnonymousClass0XJ r8, AnonymousClass0XJ r9, AnonymousClass0XJ r10, AnonymousClass0XJ r11, AnonymousClass0XJ r12, int i, int i2, int i3) {
        super(1);
        this.$labelPlaceable = r4;
        this.$width = i;
        this.$totalHeight = i2;
        this.$textFieldPlaceable = r5;
        this.$placeholderPlaceable = r6;
        this.$leadingPlaceable = r7;
        this.$trailingPlaceable = r8;
        this.$prefixPlaceable = r9;
        this.$suffixPlaceable = r10;
        this.$containerPlaceable = r11;
        this.$supportingPlaceable = r12;
        this.this$0 = r2;
        this.$topPaddingValue = i3;
        this.$this_measure = r3;
    }

    public final void A02(AnonymousClass0QZ r30) {
        AnonymousClass0QZ r28 = r30;
        C18070vi.A0d(r28, 0);
        AnonymousClass0XJ r13 = this.$labelPlaceable;
        int i = this.$width;
        int i2 = this.$totalHeight;
        AnonymousClass0XJ r8 = this.$textFieldPlaceable;
        AnonymousClass0XJ r7 = this.$placeholderPlaceable;
        AnonymousClass0XJ r6 = this.$leadingPlaceable;
        AnonymousClass0XJ r5 = this.$trailingPlaceable;
        AnonymousClass0XJ r4 = this.$prefixPlaceable;
        AnonymousClass0XJ r3 = this.$suffixPlaceable;
        AnonymousClass0XJ r2 = this.$containerPlaceable;
        AnonymousClass0XJ r1 = this.$supportingPlaceable;
        if (r13 != null) {
            AnonymousClass0X8 r0 = this.this$0;
            boolean z = r0.A02;
            int i3 = this.$topPaddingValue;
            int i4 = i3 + r13.A00;
            int i5 = i3;
            boolean z2 = z;
            AnonymousClass0XJ r20 = r1;
            AnonymousClass0XJ r19 = r2;
            AnonymousClass0XJ r18 = r3;
            AnonymousClass0XJ r17 = r4;
            AnonymousClass0XJ r16 = r5;
            AnonymousClass0XJ r15 = r6;
            AnonymousClass0XJ r14 = r7;
            AnonymousClass0XJ r12 = r8;
            AnonymousClass0QZ r11 = r28;
            A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r0.A00, this.$this_measure.BQU(), i, i2, i5, i4, z2);
            return;
        }
        AnonymousClass0X8 r122 = this.this$0;
        boolean z3 = r122.A02;
        A00(r122.A01, r28, r8, r7, r6, r5, r4, r3, r2, r1, this.$this_measure.BQU(), i, i2, z3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A02((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }

    public static final void A00(AnonymousClass0tB r3, AnonymousClass0QZ r4, AnonymousClass0XJ r5, AnonymousClass0XJ r6, AnonymousClass0XJ r7, AnonymousClass0XJ r8, AnonymousClass0XJ r9, AnonymousClass0XJ r10, AnonymousClass0XJ r11, AnonymousClass0XJ r12, float f, int i, int i2, boolean z) {
        AnonymousClass0QZ.A04(r11, 0.0f, C79.A00());
        int A0J = i2 - AnonymousClass000.A0J(r12);
        int A01 = C22339B3q.A01(r3.BE0() * f);
        if (r7 != null) {
            r4.A0B(r7, 0, AnonymousClass0XJ.A0S(r7, A0J));
        }
        if (r8 != null) {
            r4.A0B(r8, i - r8.A01, AnonymousClass0XJ.A0S(r8, A0J));
        }
        if (r9 != null) {
            int A0K = AnonymousClass000.A0K(r7);
            int i3 = A01;
            if (z) {
                i3 = AnonymousClass0XJ.A0S(r9, A0J);
            }
            r4.A0B(r9, A0K, i3);
        }
        if (r10 != null) {
            int A0K2 = (i - AnonymousClass000.A0K(r8)) - r10.A01;
            int i4 = A01;
            if (z) {
                i4 = AnonymousClass0XJ.A0S(r10, A0J);
            }
            r4.A0B(r10, A0K2, i4);
        }
        int A0K3 = AnonymousClass000.A0K(r7) + AnonymousClass000.A0K(r9);
        int i5 = A01;
        if (z) {
            i5 = AnonymousClass0XJ.A0S(r5, A0J);
        }
        r4.A0B(r5, A0K3, i5);
        if (r6 != null) {
            if (z) {
                A01 = AnonymousClass0XJ.A0S(r6, A0J);
            }
            r4.A0B(r6, A0K3, A01);
        }
        if (r12 != null) {
            r4.A0B(r12, 0, A0J);
        }
    }

    public static final void A01(AnonymousClass0QZ r5, AnonymousClass0XJ r6, AnonymousClass0XJ r7, AnonymousClass0XJ r8, AnonymousClass0XJ r9, AnonymousClass0XJ r10, AnonymousClass0XJ r11, AnonymousClass0XJ r12, AnonymousClass0XJ r13, AnonymousClass0XJ r14, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        int A01;
        AnonymousClass0QZ.A04(r13, 0.0f, C79.A00());
        int A0J = i2 - AnonymousClass000.A0J(r14);
        if (r9 != null) {
            r5.A0B(r9, 0, AnonymousClass0XJ.A0S(r9, A0J));
        }
        if (r10 != null) {
            r5.A0B(r10, i - r10.A01, AnonymousClass0XJ.A0S(r10, A0J));
        }
        if (z) {
            A01 = AnonymousClass0XJ.A0S(r7, A0J);
        } else {
            A01 = C22339B3q.A01(16.0f * f2);
        }
        r5.A0B(r7, AnonymousClass000.A0K(r9), A01 - C22339B3q.A01(((float) (A01 - i3)) * f));
        int i5 = i4;
        if (r11 != null) {
            r5.A0B(r11, AnonymousClass000.A0K(r9), i5);
        }
        if (r12 != null) {
            r5.A0B(r12, (i - AnonymousClass000.A0K(r10)) - r12.A01, i5);
        }
        int A0K = AnonymousClass000.A0K(r9) + AnonymousClass000.A0K(r11);
        r5.A0B(r6, A0K, i5);
        if (r8 != null) {
            r5.A0B(r8, A0K, i5);
        }
        if (r14 != null) {
            r5.A0B(r14, 0, A0J);
        }
    }
}
