package X;

import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.5MO  reason: invalid class name */
public final class AnonymousClass5MO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MO(FavoritePicker favoritePicker, AnonymousClass1E7 r3) {
        super(0);
        this.this$0 = favoritePicker;
        this.$contact = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        FavoritePickerViewModel A0Y = AnonymousClass3MZ.A0Y(this.this$0);
        AnonymousClass1E7 r1 = this.$contact;
        C18070vi.A0d(r1, 0);
        GroupJid groupJid = (GroupJid) r1.A06(GroupJid.class);
        if (groupJid != null) {
            z = !A0Y.A0B.A0J(groupJid);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
