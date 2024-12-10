package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1E8;
import X.AnonymousClass1OS;
import X.AnonymousClass6E9;
import X.AnonymousClass6EI;
import X.AnonymousClass6SN;
import X.AnonymousClass73M;
import X.AnonymousClass7KX;
import X.C108945cZ;
import X.C108975cc;
import X.C108995ce;
import X.C122486Qo;
import X.C133306oX;
import X.C135456sE;
import X.C136236tU;
import X.C140106zx;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C24671Lf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2;
import java.io.File;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1", f = "AvatarCoinFlipProfilePhotoViewModel.kt", i = {0}, l = {363}, m = "invokeSuspend", n = {"instanceKey"}, s = {"I$0"})
public final class AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $backgroundIndex;
    public final /* synthetic */ int $poseIndex;
    public final /* synthetic */ C135456sE $selectedBackground;
    public final /* synthetic */ C136236tU $selectedPose;
    public int I$0;
    public int label;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel, C135456sE r3, C136236tU r4, C30391dr r5, int i, int i2) {
        super(2, r5);
        this.this$0 = avatarCoinFlipProfilePhotoViewModel;
        this.$backgroundIndex = i;
        this.$poseIndex = i2;
        this.$selectedPose = r4;
        this.$selectedBackground = r3;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = this.this$0;
        int i = this.$backgroundIndex;
        int i2 = this.$poseIndex;
        return new AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1(avatarCoinFlipProfilePhotoViewModel, this.$selectedBackground, this.$selectedPose, r9, i, i2);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass1BI r1;
        C31751g4 r12 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            i = C108945cZ.A0q(this.this$0.A08).A01();
            C108945cZ.A0q(this.this$0.A08).A03(i, "save_profile_photo");
            C108945cZ.A0q(this.this$0.A08).A04(AnonymousClass6E9.A00, i, this.$backgroundIndex);
            C108945cZ.A0q(this.this$0.A08).A04(AnonymousClass6EI.A00, i, this.$poseIndex);
            C108945cZ.A0q(this.this$0.A08).A03(i, "generated_bitmap");
            try {
                MyAvatarCoinFlipRepository myAvatarCoinFlipRepository = (MyAvatarCoinFlipRepository) this.this$0.A0D.get();
                C136236tU r4 = this.$selectedPose;
                String str = r4.A05;
                String str2 = this.$selectedBackground.A02;
                String str3 = r4.A02.A07;
                C17960vV.A07(str3);
                C18070vi.A0X(str3);
                String str4 = this.$selectedPose.A01.A07;
                C17960vV.A07(str4);
                C18070vi.A0X(str4);
                this.I$0 = i;
                this.label = 1;
                if (C30451dy.A00(this, myAvatarCoinFlipRepository.A06, new MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2(myAvatarCoinFlipRepository, str, str2, str3, str4, (C30391dr) null)) == r12) {
                    return r12;
                }
            } catch (AnonymousClass6SN e) {
                C108945cZ.A0p(this.this$0.A07).A02(6, "unable_to_save_selected_pose", e.getMessage());
                AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = this.this$0;
                AnonymousClass1DT r13 = avatarCoinFlipProfilePhotoViewModel.A00;
                C140106zx A03 = AvatarCoinFlipProfilePhotoViewModel.A03(avatarCoinFlipProfilePhotoViewModel);
                List list = A03.A06;
                List list2 = A03.A05;
                C135456sE r5 = A03.A02;
                C136236tU r6 = A03.A03;
                r13.A0E(new C140106zx(A03.A01, A03.A00, r5, r6, A03.A04, list, list2, false, A03.A08, true));
            }
        } else if (i2 == 1) {
            i = this.I$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C17880vN.A1F(C108995ce.A0F(((MyAvatarCoinFlipRepository) this.this$0.A0D.get()).A03).edit(), "pref_key_coin_flip_opt_in", true);
        AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel2 = this.this$0;
        Bitmap A00 = ((C133306oX) avatarCoinFlipProfilePhotoViewModel2.A09.get()).A00(this.$selectedPose.A00, this.$selectedBackground.A00);
        AnonymousClass00H r62 = avatarCoinFlipProfilePhotoViewModel2.A0D;
        MyAvatarCoinFlipRepository myAvatarCoinFlipRepository2 = (MyAvatarCoinFlipRepository) r62.get();
        Context context = ((AnonymousClass73M) myAvatarCoinFlipRepository2.A00.get()).A00.A00;
        File filesDir = context.getFilesDir();
        C18070vi.A0X(filesDir);
        AnonymousClass73M.A03("my_avatar_pic.jpg", filesDir);
        File filesDir2 = context.getFilesDir();
        C18070vi.A0X(filesDir2);
        AnonymousClass73M.A03("my_avatar_pose_payload.json", filesDir2);
        C108975cc.A0E(myAvatarCoinFlipRepository2.A04).A0E("my_avatar_pic");
        ((MyAvatarCoinFlipRepository) r62.get()).A05(A00);
        AnonymousClass7KX.A00(C17880vN.A0V(this.this$0.A0B), 16);
        AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel3 = this.this$0;
        AnonymousClass11S r0 = avatarCoinFlipProfilePhotoViewModel3.A02;
        r0.A0I();
        AnonymousClass1E8 r14 = r0.A0D;
        if (!(r14 == null || r14.A0g || (r1 = r14.A0J) == null)) {
            ((C24671Lf) avatarCoinFlipProfilePhotoViewModel3.A0B.get()).A00(r1);
        }
        C108945cZ.A0q(this.this$0.A08).A03(i, "save_selected_pose");
        AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel4 = this.this$0;
        AnonymousClass1DT r15 = avatarCoinFlipProfilePhotoViewModel4.A00;
        C140106zx A032 = AvatarCoinFlipProfilePhotoViewModel.A03(avatarCoinFlipProfilePhotoViewModel4);
        List list3 = A032.A06;
        List list4 = A032.A05;
        C135456sE r63 = A032.A02;
        C136236tU r7 = A032.A03;
        r15.A0E(new C140106zx(A032.A01, A032.A00, r63, r7, A032.A04, list3, list4, false, A032.A08, A032.A07));
        avatarCoinFlipProfilePhotoViewModel4.A04.A0E(C122486Qo.CLOSE_SCREEN);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
