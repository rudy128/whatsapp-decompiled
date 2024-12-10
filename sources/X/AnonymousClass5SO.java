package X;

import com.whatsapp.favorites.picker.FavoritesPickerViewModel;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.5SO  reason: invalid class name */
public final class AnonymousClass5SO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FavoritesPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SO(FavoritesPickerViewModel favoritesPickerViewModel) {
        super(1);
        this.this$0 = favoritesPickerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        AnonymousClass1E7 r4 = (AnonymousClass1E7) obj;
        C18070vi.A0d(r4, 0);
        FavoritesPickerViewModel favoritesPickerViewModel = this.this$0;
        GroupJid groupJid = (GroupJid) r4.A06(GroupJid.class);
        if (groupJid != null) {
            z = !((AnonymousClass1MZ) favoritesPickerViewModel.A0B.get()).A0J(groupJid);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
