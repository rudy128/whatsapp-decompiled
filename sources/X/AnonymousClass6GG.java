package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.6GG  reason: invalid class name */
public final class AnonymousClass6GG extends C110375fP {
    public final ThumbnailButton A00;
    public final C1403571b A01;
    public final C24641Lc A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6GG(Context context, C1403571b r5, C24641Lc r6) {
        super(context);
        C18070vi.A0k(r5, r6);
        this.A01 = r5;
        this.A02 = r6;
        View inflate = View.inflate(context, 2131627007, this);
        ThumbnailButton thumbnailButton = (ThumbnailButton) inflate.findViewById(2131435643);
        this.A00 = thumbnailButton;
        thumbnailButton.A01 = inflate.getResources().getDimension(2131168804);
    }

    public ThumbnailButton getMediaView() {
        return this.A00;
    }
}
