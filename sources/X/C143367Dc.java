package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.communitymedia.itemviews.MediaMetadataView;
import com.whatsapp.search.views.itemviews.SearchMessageImageThumbView;
import java.util.List;

/* renamed from: X.7Dc  reason: invalid class name and case insensitive filesystem */
public final class C143367Dc implements AnonymousClass8A6 {
    public /* bridge */ /* synthetic */ void BD7(Context context, View view, Object obj) {
        SearchMessageImageThumbView searchMessageImageThumbView = (SearchMessageImageThumbView) view;
        C135666sZ r5 = (C135666sZ) obj;
        C18070vi.A0j(searchMessageImageThumbView, r5);
        searchMessageImageThumbView.setRadius(AnonymousClass3MW.A01(searchMessageImageThumbView.getResources(), 2131167692));
        searchMessageImageThumbView.A02 = false;
        searchMessageImageThumbView.A01 = false;
        searchMessageImageThumbView.setMessage((C438421d) r5.A03);
    }

    public /* bridge */ /* synthetic */ void BDC(View view, AnonymousClass4ZN r3, Object obj, List list) {
        MediaMetadataView mediaMetadataView = (MediaMetadataView) view;
        C135666sZ r4 = (C135666sZ) obj;
        C18070vi.A0j(mediaMetadataView, r4);
        mediaMetadataView.A02((AnonymousClass21V) r4.A03, r3, list);
    }

    public int BSf() {
        return 2131625574;
    }

    public int BZr() {
        return 2131625966;
    }
}
