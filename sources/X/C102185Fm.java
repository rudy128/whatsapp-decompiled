package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;

/* renamed from: X.5Fm  reason: invalid class name and case insensitive filesystem */
public final class C102185Fm extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102185Fm(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        FrameLayout frameLayout = new FrameLayout(this.this$0);
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        View A02 = C88554a7.A02(addGroupParticipantsSelector.getLayoutInflater(), (ViewGroup) null, 2131232294, 2131891497);
        AnonymousClass3Ma.A1B(A02, addGroupParticipantsSelector, 25);
        AnonymousClass3MW.A1Q(A02);
        frameLayout.addView(A02);
        return frameLayout;
    }
}
