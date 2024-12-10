package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1", f = "AvatarCoinFlipProfilePhotoViewModel.kt", i = {1, 1, 1, 1, 1}, l = {188, 208}, m = "invokeSuspend", n = {"poses", "avatarPoses", "avatarBackgrounds", "selectedPose", "selectedBackground"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
public final class AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ int $selectedPosePosition;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel, C30391dr r3, int i, int i2, boolean z) {
        super(2, r3);
        this.this$0 = avatarCoinFlipProfilePhotoViewModel;
        this.$invalidate = z;
        this.$instanceKey = i;
        this.$selectedPosePosition = i2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1(this.this$0, r8, this.$instanceKey, this.$selectedPosePosition, this.$invalidate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        r9 = r15.A00;
        r12 = r0.$selectedPosePosition;
        r7 = X.C29351c6.A0D(r9);
        r14 = r9.iterator();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r14.hasNext() == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        r1 = r14.next();
        r8 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (r13 < 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r1 = (X.C135456sE) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7.add(new X.C115485u5(new X.C115495u6(r1.A00, (java.lang.String) null, r1.A01), X.AnonymousClass000.A1T(r13, r12)));
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        X.AnonymousClass1ZU.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        r8 = (X.C136236tU) X.C29431cG.A0f(r11, r0.$selectedPosePosition);
        r9 = (X.C135456sE) X.C29431cG.A0f(r9, r0.$selectedPosePosition);
        r14 = com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel.A00(r0.this$0, r9, r8);
        r5 = r0.this$0;
        r0.L$0 = r15;
        r0.L$1 = r6;
        r0.L$2 = r7;
        r0.L$3 = r8;
        r0.L$4 = r9;
        r0.L$5 = r14;
        r0.label = 2;
        r1 = r5.A02;
        r1.A0I();
        r4 = r1.A0D;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if (r4 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        if (r4.A0g == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r3 = X.C30451dy.A00(r0, r5.A0F, new com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1(r4, r5, (X.C30391dr) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fd, code lost:
        if (r3 != r10) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ff, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        r1 = r15;
        r15 = r3;
        r6 = r6;
        r7 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r15 = r25
            X.1g4 r10 = X.C31751g4.COROUTINE_SUSPENDED
            r0 = r24
            int r1 = r0.label
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r5) goto L_0x0049
            if (r1 != r4) goto L_0x002a
            java.lang.Object r14 = r0.L$5
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            java.lang.Object r9 = r0.L$4
            X.6sE r9 = (X.C135456sE) r9
            java.lang.Object r8 = r0.L$3
            X.6tU r8 = (X.C136236tU) r8
            java.lang.Object r7 = r0.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r1 = r0.L$0
            X.6rK r1 = (X.C134896rK) r1
            goto L_0x0103
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002f:
            X.C30691eM.A01(r15)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0     // Catch:{ 6SK -> 0x013a }
            X.00H r1 = r1.A0A     // Catch:{ 6SK -> 0x013a }
            java.lang.Object r3 = r1.get()     // Catch:{ 6SK -> 0x013a }
            com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository r3 = (com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository) r3     // Catch:{ 6SK -> 0x013a }
            boolean r2 = r0.$invalidate     // Catch:{ 6SK -> 0x013a }
            int r1 = r0.$instanceKey     // Catch:{ 6SK -> 0x013a }
            r0.label = r5     // Catch:{ 6SK -> 0x013a }
            java.lang.Object r15 = r3.A03(r0, r1, r2)     // Catch:{ 6SK -> 0x013a }
            if (r15 != r10) goto L_0x004c
            return r10
        L_0x0049:
            X.C30691eM.A01(r15)     // Catch:{ 6SK -> 0x013a }
        L_0x004c:
            X.6rK r15 = (X.C134896rK) r15     // Catch:{ 6SK -> 0x013a }
            java.util.List r11 = r15.A01     // Catch:{ 6SK -> 0x013a }
            int r8 = r0.$selectedPosePosition     // Catch:{ 6SK -> 0x013a }
            java.util.ArrayList r6 = X.C29351c6.A0D(r11)     // Catch:{ 6SK -> 0x013a }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ 6SK -> 0x013a }
            r9 = 0
        L_0x005b:
            boolean r1 = r12.hasNext()     // Catch:{ 6SK -> 0x013a }
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r12.next()     // Catch:{ 6SK -> 0x013a }
            int r7 = r9 + 1
            if (r9 < 0) goto L_0x00b9
            X.6tU r1 = (X.C136236tU) r1     // Catch:{ 6SK -> 0x013a }
            android.graphics.Bitmap r5 = r1.A00     // Catch:{ 6SK -> 0x013a }
            java.lang.String r2 = r1.A04     // Catch:{ 6SK -> 0x013a }
            java.lang.String r1 = r1.A03     // Catch:{ 6SK -> 0x013a }
            X.5u6 r3 = new X.5u6     // Catch:{ 6SK -> 0x013a }
            r3.<init>(r5, r2, r1)     // Catch:{ 6SK -> 0x013a }
            boolean r2 = X.AnonymousClass000.A1T(r9, r8)
            X.5u5 r1 = new X.5u5     // Catch:{ 6SK -> 0x013a }
            r1.<init>(r3, r2)     // Catch:{ 6SK -> 0x013a }
            r6.add(r1)     // Catch:{ 6SK -> 0x013a }
            r9 = r7
            goto L_0x005b
        L_0x0084:
            java.util.List r9 = r15.A00     // Catch:{ 6SK -> 0x013a }
            int r12 = r0.$selectedPosePosition     // Catch:{ 6SK -> 0x013a }
            java.util.ArrayList r7 = X.C29351c6.A0D(r9)     // Catch:{ 6SK -> 0x013a }
            java.util.Iterator r14 = r9.iterator()     // Catch:{ 6SK -> 0x013a }
            r13 = 0
        L_0x0091:
            boolean r1 = r14.hasNext()     // Catch:{ 6SK -> 0x013a }
            if (r1 == 0) goto L_0x00be
            java.lang.Object r1 = r14.next()     // Catch:{ 6SK -> 0x013a }
            int r8 = r13 + 1
            if (r13 < 0) goto L_0x00b9
            X.6sE r1 = (X.C135456sE) r1     // Catch:{ 6SK -> 0x013a }
            android.graphics.Bitmap r5 = r1.A00     // Catch:{ 6SK -> 0x013a }
            java.lang.String r2 = r1.A01     // Catch:{ 6SK -> 0x013a }
            r1 = 0
            X.5u6 r3 = new X.5u6     // Catch:{ 6SK -> 0x013a }
            r3.<init>(r5, r1, r2)     // Catch:{ 6SK -> 0x013a }
            boolean r2 = X.AnonymousClass000.A1T(r13, r12)
            X.5u5 r1 = new X.5u5     // Catch:{ 6SK -> 0x013a }
            r1.<init>(r3, r2)     // Catch:{ 6SK -> 0x013a }
            r7.add(r1)     // Catch:{ 6SK -> 0x013a }
            r13 = r8
            goto L_0x0091
        L_0x00b9:
            X.AnonymousClass1ZU.A0B()     // Catch:{ 6SK -> 0x013a }
            r1 = 0
            throw r1     // Catch:{ 6SK -> 0x013a }
        L_0x00be:
            int r1 = r0.$selectedPosePosition     // Catch:{ 6SK -> 0x013a }
            java.lang.Object r8 = X.C29431cG.A0f(r11, r1)     // Catch:{ 6SK -> 0x013a }
            X.6tU r8 = (X.C136236tU) r8     // Catch:{ 6SK -> 0x013a }
            int r1 = r0.$selectedPosePosition     // Catch:{ 6SK -> 0x013a }
            java.lang.Object r9 = X.C29431cG.A0f(r9, r1)     // Catch:{ 6SK -> 0x013a }
            X.6sE r9 = (X.C135456sE) r9     // Catch:{ 6SK -> 0x013a }
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0     // Catch:{ 6SK -> 0x013a }
            android.graphics.Bitmap r14 = com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel.A00(r1, r9, r8)     // Catch:{ 6SK -> 0x013a }
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r5 = r0.this$0     // Catch:{ 6SK -> 0x013a }
            r0.L$0 = r15     // Catch:{ 6SK -> 0x013a }
            r0.L$1 = r6     // Catch:{ 6SK -> 0x013a }
            r0.L$2 = r7     // Catch:{ 6SK -> 0x013a }
            r0.L$3 = r8     // Catch:{ 6SK -> 0x013a }
            r0.L$4 = r9     // Catch:{ 6SK -> 0x013a }
            r0.L$5 = r14     // Catch:{ 6SK -> 0x013a }
            r0.label = r4     // Catch:{ 6SK -> 0x013a }
            X.11S r1 = r5.A02     // Catch:{ 6SK -> 0x013a }
            r1.A0I()     // Catch:{ 6SK -> 0x013a }
            X.1E8 r4 = r1.A0D     // Catch:{ 6SK -> 0x013a }
            r3 = 0
            if (r4 == 0) goto L_0x0100
            boolean r1 = r4.A0g     // Catch:{ 6SK -> 0x013a }
            if (r1 == 0) goto L_0x0100
            X.0wl r2 = r5.A0F     // Catch:{ 6SK -> 0x013a }
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1 r1 = new com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1     // Catch:{ 6SK -> 0x013a }
            r1.<init>(r4, r5, r3)     // Catch:{ 6SK -> 0x013a }
            java.lang.Object r3 = X.C30451dy.A00(r0, r2, r1)     // Catch:{ 6SK -> 0x013a }
            if (r3 != r10) goto L_0x0100
            return r10
        L_0x0100:
            r1 = r15
            r15 = r3
            goto L_0x0106
        L_0x0103:
            X.C30691eM.A01(r15)     // Catch:{ 6SK -> 0x013a }
        L_0x0106:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15     // Catch:{ 6SK -> 0x013a }
            r21 = 0
            r23 = r21
            X.6zx r13 = new X.6zx     // Catch:{ 6SK -> 0x013a }
            r18 = r1
            r19 = r6
            r20 = r7
            r22 = r21
            r16 = r9
            r17 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 6SK -> 0x013a }
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0     // Catch:{ 6SK -> 0x013a }
            X.1DT r1 = r1.A00     // Catch:{ 6SK -> 0x013a }
            r1.A0F(r13)     // Catch:{ 6SK -> 0x013a }
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0     // Catch:{ 6SK -> 0x013a }
            int r4 = r0.$instanceKey     // Catch:{ 6SK -> 0x013a }
            X.00H r3 = r1.A08     // Catch:{ 6SK -> 0x013a }
            X.70I r2 = X.C108945cZ.A0q(r3)     // Catch:{ 6SK -> 0x013a }
            java.lang.String r1 = "poses_sent_to_ui"
            X.70I r2 = X.AnonymousClass70I.A00(r2, r3, r1, r4)     // Catch:{ 6SK -> 0x013a }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ 6SK -> 0x013a }
            r2.A02(r4, r1)     // Catch:{ 6SK -> 0x013a }
            goto L_0x0185
        L_0x013a:
            r2 = move-exception
            java.lang.String r1 = "AvatarCoinFlipProfilePhotoViewModel/init fetching poses"
            com.whatsapp.util.Log.e(r1, r2)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0
            X.00H r1 = r1.A07
            X.6ue r4 = X.C108945cZ.A0p(r1)
            java.lang.String r3 = "unable_to_fetch_poses"
            java.lang.String r2 = r2.getMessage()
            r1 = 6
            r4.A02(r1, r3, r2)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0
            X.6zx r1 = com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel.A03(r1)
            r12 = 1
            r11 = 0
            boolean r10 = r1.A09
            java.util.List r8 = r1.A06
            java.util.List r9 = r1.A05
            X.6sE r5 = r1.A02
            X.6tU r6 = r1.A03
            android.graphics.Bitmap r3 = r1.A01
            X.6rK r7 = r1.A04
            android.graphics.Bitmap r4 = r1.A00
            X.6zx r2 = new X.6zx
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0
            X.1DT r1 = r1.A00
            r1.A0F(r2)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = r0.this$0
            int r2 = r0.$instanceKey
            X.00H r0 = r1.A08
            X.70I r1 = X.C108945cZ.A0q(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A02(r2, r0)
        L_0x0185:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
