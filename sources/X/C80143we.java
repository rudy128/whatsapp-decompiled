package X;

import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.3we  reason: invalid class name and case insensitive filesystem */
public class C80143we extends C91114fA {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80143we(AnonymousClass1FY r1, AnonymousClass5ZZ r2, C107265Za r3, C87564Wb r4, C18000vb r5, Object obj, int i) {
        super(r1, r2, r3, r4, r5);
        this.A00 = i;
        this.A01 = obj;
    }

    public void BLL() {
        MessageSelectionViewModel messageSelectionViewModel;
        if (this.A00 != 0) {
            messageSelectionViewModel = ((AnonymousClass4aY) this.A01).A2J;
        } else {
            messageSelectionViewModel = ((MediaAlbumActivity) this.A01).A09;
        }
        messageSelectionViewModel.A0T();
    }
}
