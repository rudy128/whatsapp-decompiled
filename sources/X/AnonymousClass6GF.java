package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.6GF  reason: invalid class name */
public final class AnonymousClass6GF extends C110375fP {
    public final ThumbnailButton A00;

    public AnonymousClass6GF(Context context) {
        super(context);
        View inflate = View.inflate(context, 2131627018, this);
        ThumbnailButton thumbnailButton = (ThumbnailButton) inflate.findViewById(2131435698);
        this.A00 = thumbnailButton;
        thumbnailButton.A01 = inflate.getResources().getDimension(2131168822);
    }

    public ThumbnailButton getMediaView() {
        return this.A00;
    }
}
