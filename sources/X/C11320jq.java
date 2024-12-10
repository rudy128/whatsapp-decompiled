package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.0jq  reason: invalid class name and case insensitive filesystem */
public final class C11320jq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1OX $$this$LaunchedEffect;
    public final /* synthetic */ C27061DRh $durationScale;
    public final /* synthetic */ C17330uU $toolingOverride;
    public final /* synthetic */ AnonymousClass0IQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11320jq(AnonymousClass0IQ r2, C17330uU r3, C27061DRh dRh, AnonymousClass1OX r5) {
        super(1);
        this.$toolingOverride = r3;
        this.this$0 = r2;
        this.$durationScale = dRh;
        this.$$this$LaunchedEffect = r5;
    }

    public final void A00(long j) {
        long j2;
        boolean z;
        C16300s2 r0 = (C16300s2) this.$toolingOverride.getValue();
        if (r0 != null) {
            j2 = ((Number) r0.getValue()).longValue();
        } else {
            j2 = j;
        }
        int i = 0;
        if (this.this$0.A00 == Long.MIN_VALUE || this.$durationScale.element != SuspendAnimationKt.A00(this.$$this$LaunchedEffect.getCoroutineContext())) {
            AnonymousClass0IQ r02 = this.this$0;
            r02.A00 = j;
            C06970a9 r03 = r02.A03;
            int i2 = r03.A00;
            if (i2 > 0) {
                Object[] objArr = r03.A01;
                int i3 = 0;
                do {
                    ((C05770Vq) objArr[i3]).A06 = true;
                    i3++;
                } while (i3 < i2);
            }
            this.$durationScale.element = SuspendAnimationKt.A00(this.$$this$LaunchedEffect.getCoroutineContext());
        }
        float f = this.$durationScale.element;
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        AnonymousClass0IQ r6 = this.this$0;
        if (i4 == 0) {
            C06970a9 r04 = r6.A03;
            int i5 = r04.A00;
            if (i5 > 0) {
                Object[] objArr2 = r04.A01;
                do {
                    C05770Vq r2 = (C05770Vq) objArr2[i];
                    r2.A08.setValue(r2.A02.A03);
                    r2.A06 = true;
                    i++;
                } while (i < i5);
                return;
            }
            return;
        }
        long j3 = (long) (((float) (j2 - r6.A00)) / f);
        C06970a9 r05 = r6.A03;
        int i6 = r05.A00;
        if (i6 > 0) {
            Object[] objArr3 = r05.A01;
            int i7 = 0;
            z = true;
            do {
                C05770Vq r11 = (C05770Vq) objArr3[i7];
                if (!r11.A05) {
                    AnonymousClass000.A1C(r11.A09.A02, false);
                    if (r11.A06) {
                        r11.A06 = false;
                        r11.A00 = j3;
                    }
                    long j4 = j3 - r11.A00;
                    r11.A08.setValue(r11.A02.BbD(j4));
                    r11.A05 = AnonymousClass000.A1Q((j4 > r11.A02.A00 ? 1 : (j4 == r11.A02.A00 ? 0 : -1)));
                }
                if (!r11.A05) {
                    z = false;
                }
                i7++;
            } while (i7 < i6);
        } else {
            z = true;
        }
        AnonymousClass000.A1C(r6.A01, !z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((Number) obj).longValue());
        return C27621Wu.A00;
    }
}
