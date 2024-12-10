package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.communitymedia.itemviews.MediaMetadataView;
import java.util.List;

/* renamed from: X.7Db  reason: invalid class name and case insensitive filesystem */
public final class C143357Db implements AnonymousClass8A6 {
    public /* bridge */ /* synthetic */ void BD7(Context context, View view, Object obj) {
        ImageView imageView = (ImageView) view;
        C135666sZ r4 = (C135666sZ) obj;
        C18070vi.A0j(imageView, r4);
        imageView.setImageDrawable(C137486vX.A00(context, (C438921i) r4.A03));
    }

    public /* bridge */ /* synthetic */ void BDC(View view, AnonymousClass4ZN r3, Object obj, List list) {
        MediaMetadataView mediaMetadataView = (MediaMetadataView) view;
        C135666sZ r4 = (C135666sZ) obj;
        C18070vi.A0j(mediaMetadataView, r4);
        mediaMetadataView.A02((AnonymousClass21V) r4.A03, r3, list);
    }

    public int BSf() {
        return 2131626961;
    }

    public int BZr() {
        return 2131625966;
    }
}
