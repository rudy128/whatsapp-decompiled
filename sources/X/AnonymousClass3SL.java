package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3SL  reason: invalid class name */
public class AnonymousClass3SL extends C123426Uk {
    public final /* synthetic */ MediaAlbumActivity A00;

    public AnonymousClass3SL(MediaAlbumActivity mediaAlbumActivity) {
        this.A00 = mediaAlbumActivity;
    }

    public void A00() {
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        if (AnonymousClass3MX.A0j(mediaAlbumActivity.A0V).A0A()) {
            Map map = mediaAlbumActivity.A00.A0M.A0G;
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                ((C108675c7) A16.getKey()).CJ5(AnonymousClass000.A0M(A16.getValue()));
            }
            map.clear();
        }
    }

    public void A02(List list, Map map) {
        View A06;
        View A062;
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        List list2 = mediaAlbumActivity.A0A.A00;
        if (list2 != null) {
            Iterator it = list2.iterator();
            int i = 0;
            boolean z = false;
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                i++;
                if (i <= 3) {
                    View findViewWithTag = mediaAlbumActivity.getListView().findViewWithTag(A0Y.A0v);
                    if (findViewWithTag == null || z || (findViewWithTag.getTop() < 0 && (findViewWithTag.getTop() >= 0 || findViewWithTag.getBottom() < mediaAlbumActivity.getListView().getHeight()))) {
                        map.remove(AnonymousClass4W0.A01(A0Y));
                        map.remove(AnonymousClass4W0.A00(A0Y));
                    } else {
                        String A01 = AnonymousClass4W0.A01(A0Y);
                        if (!map.containsKey(A01) && (A062 = AnonymousClass745.A06(mediaAlbumActivity.getListView(), A01)) != null) {
                            list.add(A01);
                            map.put(A01, A062);
                        }
                        String A002 = AnonymousClass4W0.A00(A0Y);
                        if (!map.containsKey(A002) && (A06 = AnonymousClass745.A06(mediaAlbumActivity.getListView(), A002)) != null) {
                            list.add(A002);
                            map.put(A002, A06);
                        }
                        z = true;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
