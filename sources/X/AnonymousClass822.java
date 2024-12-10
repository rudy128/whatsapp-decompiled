package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.822  reason: invalid class name */
public final class AnonymousClass822 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass822(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$instanceKey = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        Log.e("AvatarProfilePhotoViewModel/init fetching poses", th);
        C108945cZ.A0p(this.this$0.A07).A02(6, "unable_to_fetch_poses", th.getMessage());
        C140026zp A0D = C108975cc.A0D(this.this$0.A00);
        boolean z = A0D.A06;
        List list = A0D.A03;
        List list2 = A0D.A02;
        C115475u4 r2 = A0D.A00;
        C115445u1 r3 = A0D.A01;
        C18070vi.A0e(list, 1, list2);
        this.this$0.A00.A0F(new C140026zp(r2, r3, list, list2, z, false, true));
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        C108945cZ.A0q(avatarProfilePhotoViewModel.A08).A02(this.$instanceKey, AnonymousClass00R.A01);
        return C27621Wu.A00;
    }
}
