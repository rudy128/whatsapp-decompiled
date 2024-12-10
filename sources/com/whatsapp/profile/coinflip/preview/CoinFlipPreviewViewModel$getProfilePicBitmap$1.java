package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmap$1", f = "CoinFlipPreviewViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipPreviewViewModel$getProfilePicBitmap$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $imageSize;
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ boolean $showMyPreview;
    public int label;
    public final /* synthetic */ CoinFlipPreviewViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmap$1$1", f = "CoinFlipPreviewViewModel.kt", i = {0, 1, 1}, l = {69, 74}, m = "invokeSuspend", n = {"contact", "contact", "profileBitmap"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmap$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            CoinFlipPreviewViewModel coinFlipPreviewViewModel = coinFlipPreviewViewModel;
            return new AnonymousClass1(context, userJid, coinFlipPreviewViewModel, r9, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
            if (r15 != null) goto L_0x003c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r14.label
                r2 = 2
                r6 = 1
                if (r0 == 0) goto L_0x0046
                if (r0 == r6) goto L_0x006e
                if (r0 != r2) goto L_0x00ac
                java.lang.Object r5 = r14.L$1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                java.lang.Object r10 = r14.L$0
                X.1E7 r10 = (X.AnonymousClass1E7) r10
                X.C30691eM.A01(r15)
            L_0x0017:
                android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
                if (r5 == 0) goto L_0x003a
                if (r15 == 0) goto L_0x0030
                boolean r0 = r10.A0g
                if (r0 == 0) goto L_0x003c
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel r0 = r6
                X.1G4 r1 = r0.A09
                X.45g r0 = new X.45g
                r0.<init>(r5, r15)
            L_0x002a:
                r1.setValue(r0)
            L_0x002d:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0030:
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel r0 = r6
                X.1G4 r1 = r0.A09
                X.45f r0 = new X.45f
                r0.<init>(r5)
                goto L_0x002a
            L_0x003a:
                if (r15 == 0) goto L_0x002d
            L_0x003c:
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel r0 = r6
                X.1G4 r1 = r0.A09
                X.45e r0 = new X.45e
                r0.<init>(r15)
                goto L_0x002a
            L_0x0046:
                X.C30691eM.A01(r15)
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel r0 = r6
                X.1M9 r1 = r0.A00
                com.whatsapp.jid.UserJid r0 = r5
                X.1E7 r10 = r1.A0E(r0)
                if (r10 == 0) goto L_0x002d
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel r11 = r6
                android.content.Context r9 = r4
                int r13 = r8
                r14.L$0 = r10
                r14.label = r6
                X.0wl r0 = r11.A08
                r12 = 0
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2 r8 = new com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2
                r8.<init>(r9, r10, r11, r12, r13)
                java.lang.Object r15 = X.C30451dy.A00(r14, r0, r8)
                if (r15 != r7) goto L_0x0075
                return r7
            L_0x006e:
                java.lang.Object r10 = r14.L$0
                X.1E7 r10 = (X.AnonymousClass1E7) r10
                X.C30691eM.A01(r15)
            L_0x0075:
                r5 = r15
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                boolean r1 = r9
                com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel r0 = r6
                if (r1 == 0) goto L_0x0093
                com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository r0 = r0.A03
                X.00H r0 = r0.A04
                java.lang.Object r0 = r0.get()
                X.1Lp r0 = (X.C24771Lp) r0
                X.1ga r1 = r0.A00()
                java.lang.String r0 = "avatar_pose_preview"
                java.lang.Object r15 = r1.A0A(r0)
                goto L_0x0017
            L_0x0093:
                com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r4 = r0.A02
                com.whatsapp.jid.UserJid r3 = r5
                r14.L$0 = r10
                r14.L$1 = r5
                r14.label = r2
                X.0wl r2 = r4.A05
                r1 = 0
                com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$getContactAvatarPic$2 r0 = new com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$getContactAvatarPic$2
                r0.<init>(r3, r4, r1, r6)
                java.lang.Object r15 = X.C30451dy.A00(r14, r2, r0)
                if (r15 != r7) goto L_0x0017
                return r7
            L_0x00ac:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmap$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipPreviewViewModel$getProfilePicBitmap$1(Context context, UserJid userJid, CoinFlipPreviewViewModel coinFlipPreviewViewModel, C30391dr r5, int i, boolean z) {
        super(2, r5);
        this.this$0 = coinFlipPreviewViewModel;
        this.$jid = userJid;
        this.$context = context;
        this.$imageSize = i;
        this.$showMyPreview = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        CoinFlipPreviewViewModel coinFlipPreviewViewModel = this.this$0;
        return new CoinFlipPreviewViewModel$getProfilePicBitmap$1(this.$context, this.$jid, coinFlipPreviewViewModel, r9, this.$imageSize, this.$showMyPreview);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final CoinFlipPreviewViewModel coinFlipPreviewViewModel = this.this$0;
            C18600wl r0 = coinFlipPreviewViewModel.A08;
            final UserJid userJid = this.$jid;
            final Context context = this.$context;
            final int i2 = this.$imageSize;
            final boolean z = this.$showMyPreview;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipPreviewViewModel$getProfilePicBitmap$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
