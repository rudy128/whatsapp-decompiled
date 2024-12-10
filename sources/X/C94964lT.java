package X;

import android.content.Context;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import java.util.Collection;

/* renamed from: X.4lT  reason: invalid class name and case insensitive filesystem */
public class C94964lT implements C108015az {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public C94964lT(C88094Yh r2) {
        this.A02 = r2;
        this.A01 = r2.A00;
    }

    public Collection BYq() {
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
                return ((C88094Yh) obj).A01.BYq();
            case 1:
                SelectedImageAlbumViewModel selectedImageAlbumViewModel = ((SelectedImageAndVideoAlbumActivity) obj).A00;
                if (selectedImageAlbumViewModel != null) {
                    return (Collection) selectedImageAlbumViewModel.A00.A06();
                }
                C18070vi.A11("selectedImageAlbumViewModel");
                throw null;
            default:
                AnonymousClass3U8 r1 = ((SingleSelectedMessageActivity) obj).A04;
                if (r1 == null) {
                    C18070vi.A11("singleSelectedMessageViewModel");
                    throw null;
                }
                Object A06 = r1.A00.A06();
                if (A06 != null) {
                    return C18070vi.A0M(A06);
                }
                return null;
        }
    }

    public Context getContext() {
        return (Context) this.A01;
    }

    public C94964lT(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        this.A02 = singleSelectedMessageActivity;
        this.A01 = singleSelectedMessageActivity;
    }

    public C94964lT(SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity) {
        this.A02 = selectedImageAndVideoAlbumActivity;
        this.A01 = selectedImageAndVideoAlbumActivity;
    }
}
