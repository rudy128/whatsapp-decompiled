package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass5WL;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity$setProfilePic$1", f = "CoinFlipPreviewActivity.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipPreviewActivity$setProfilePic$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $startWithAvatar;
    public int label;
    public final /* synthetic */ CoinFlipPreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipPreviewActivity$setProfilePic$1(CoinFlipPreviewActivity coinFlipPreviewActivity, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = coinFlipPreviewActivity;
        this.$startWithAvatar = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoinFlipPreviewActivity$setProfilePic$1(this.this$0, r5, this.$startWithAvatar);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G1 r2 = ((CoinFlipPreviewViewModel) this.this$0.A0C.getValue()).A0A;
            AnonymousClass5WL A00 = AnonymousClass4FR.A00(C23401Fx.STARTED, this.this$0.getLifecycle(), r2);
            final CoinFlipPreviewActivity coinFlipPreviewActivity = this.this$0;
            final boolean z = this.$startWithAvatar;
            AnonymousClass1 r0 = new AnonymousClass1G2() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
                /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
                /* renamed from: A00 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object BJt(X.C83384Ex r8, X.C30391dr r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof X.C100514ud
                        if (r0 == 0) goto L_0x007f
                        r6 = r9
                        X.4ud r6 = (X.C100514ud) r6
                        int r2 = r6.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L_0x007f
                        int r2 = r2 - r1
                        r6.label = r2
                    L_0x0012:
                        java.lang.Object r1 = r6.result
                        X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
                        int r0 = r6.label
                        r4 = 1
                        if (r0 == 0) goto L_0x002e
                        if (r0 != r4) goto L_0x0085
                        java.lang.Object r0 = r6.L$0
                        com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity$setProfilePic$1$1 r0 = (com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity$setProfilePic$1.AnonymousClass1) r0
                        X.C30691eM.A01(r1)
                    L_0x0024:
                        com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r0 = com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.this
                        com.whatsapp.WaTextView r0 = r0.A02
                        X.C72453Mb.A1C(r0)
                    L_0x002b:
                        X.1Wu r0 = X.C27621Wu.A00
                        return r0
                    L_0x002e:
                        X.C30691eM.A01(r1)
                        boolean r0 = r8 instanceof X.C823145h
                        r3 = 8
                        if (r0 == 0) goto L_0x0041
                        com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r0 = com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.this
                        com.whatsapp.WaTextView r0 = r0.A02
                    L_0x003b:
                        if (r0 == 0) goto L_0x002b
                        r0.setVisibility(r3)
                        goto L_0x002b
                    L_0x0041:
                        boolean r0 = r8 instanceof X.C823045g
                        if (r0 == 0) goto L_0x005a
                        com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r3 = com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.this
                        boolean r2 = r1
                        X.45g r8 = (X.C823045g) r8
                        android.graphics.Bitmap r1 = r8.A01
                        android.graphics.Bitmap r0 = r8.A00
                        r6.L$0 = r7
                        r6.label = r4
                        java.lang.Object r0 = com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.A03(r1, r0, r3, r6, r2)
                        if (r0 != r5) goto L_0x007d
                        return r5
                    L_0x005a:
                        boolean r0 = r8 instanceof X.C822945f
                        if (r0 == 0) goto L_0x006e
                        com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r2 = com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.this
                        com.whatsapp.WaImageView r1 = r2.A01
                        if (r1 == 0) goto L_0x006b
                        X.45f r8 = (X.C822945f) r8
                        android.graphics.Bitmap r0 = r8.A00
                    L_0x0068:
                        r1.setImageBitmap(r0)
                    L_0x006b:
                        com.whatsapp.WaTextView r0 = r2.A02
                        goto L_0x003b
                    L_0x006e:
                        boolean r0 = r8 instanceof X.C822845e
                        if (r0 == 0) goto L_0x002b
                        com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r2 = com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.this
                        com.whatsapp.WaImageView r1 = r2.A01
                        if (r1 == 0) goto L_0x006b
                        X.45e r8 = (X.C822845e) r8
                        android.graphics.Bitmap r0 = r8.A00
                        goto L_0x0068
                    L_0x007d:
                        r0 = r7
                        goto L_0x0024
                    L_0x007f:
                        X.4ud r6 = new X.4ud
                        r6.<init>(r7, r9)
                        goto L_0x0012
                    L_0x0085:
                        java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity$setProfilePic$1.AnonymousClass1.BJt(X.4Ex, X.1dr):java.lang.Object");
                }
            };
            this.label = 1;
            if (A00.BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipPreviewActivity$setProfilePic$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
