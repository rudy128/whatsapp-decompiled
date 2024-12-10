package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.82i  reason: invalid class name and case insensitive filesystem */
public final class C1588682i extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ int $selectedPosePosition;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1588682i(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i, int i2) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$selectedPosePosition = i;
        this.$instanceKey = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        int i = this.$selectedPosePosition;
        ArrayList<C115445u1> A0D = C29351c6.A0D(list);
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            C135446sD r0 = (C135446sD) next;
            A0D.add(new C115445u1(r0.A00, r0.A02, r0.A01, C19740yt.A00(((C137816w4) avatarProfilePhotoViewModel.A09.get()).A00.A00.getApplicationContext(), 2131101133), AnonymousClass000.A1T(i2, i)));
            i2 = i3;
        }
        for (C115445u1 r5 : A0D) {
            if (r5.A04) {
                this.this$0.A00.A0F(new C140026zp(C108975cc.A0D(this.this$0.A00).A00, r5, A0D, C108975cc.A0D(this.this$0.A00).A02, false, false, false));
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel2 = this.this$0;
                int i4 = this.$instanceKey;
                int size = A0D.size();
                AnonymousClass00H r2 = avatarProfilePhotoViewModel2.A08;
                C108945cZ.A0q(r2).A04(AnonymousClass6EF.A00, i4, size);
                AnonymousClass70I.A00(C108945cZ.A0q(r2), r2, "poses_sent_to_ui", i4).A02(i4, AnonymousClass00R.A00);
                return C27621Wu.A00;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
