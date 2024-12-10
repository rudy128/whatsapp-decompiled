package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.communitymedia.itemviews.MediaMetadataView;
import com.whatsapp.search.views.itemviews.SearchMessageVideoThumbView;
import java.util.List;

/* renamed from: X.7Dd  reason: invalid class name and case insensitive filesystem */
public final class C143377Dd implements AnonymousClass8A6 {
    public /* bridge */ /* synthetic */ void BD7(Context context, View view, Object obj) {
        SearchMessageVideoThumbView searchMessageVideoThumbView = (SearchMessageVideoThumbView) view;
        C135666sZ r5 = (C135666sZ) obj;
        C18070vi.A0j(searchMessageVideoThumbView, r5);
        searchMessageVideoThumbView.setRadius(AnonymousClass3MW.A01(searchMessageVideoThumbView.getResources(), 2131167692));
        searchMessageVideoThumbView.A06 = false;
        searchMessageVideoThumbView.A02 = false;
        searchMessageVideoThumbView.A01 = false;
        searchMessageVideoThumbView.setMessage((AnonymousClass21Y) r5.A03);
    }

    public /* bridge */ /* synthetic */ void BDC(View view, AnonymousClass4ZN r3, Object obj, List list) {
        MediaMetadataView mediaMetadataView = (MediaMetadataView) view;
        C135666sZ r4 = (C135666sZ) obj;
        C18070vi.A0j(mediaMetadataView, r4);
        mediaMetadataView.A02((AnonymousClass21V) r4.A03, r3, list);
    }

    public int BSf() {
        return 2131627351;
    }

    public int BZr() {
        return 2131625966;
    }
}
