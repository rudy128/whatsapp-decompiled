package X;

import android.graphics.Point;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.List;

/* renamed from: X.3Ot  reason: invalid class name and case insensitive filesystem */
public class C73043Ot extends BaseAdapter {
    public List A00;
    public final AnonymousClass4R7 A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 125;
    }

    public C73043Ot(MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A01 = new AnonymousClass4R7(mediaAlbumActivity);
    }

    public void A00(List list) {
        int headerViewsCount;
        int A002;
        this.A00 = list;
        notifyDataSetChanged();
        MediaAlbumActivity mediaAlbumActivity = this.A02;
        if (mediaAlbumActivity.A00 != null) {
            mediaAlbumActivity.getListView().setSelectionFromTop(mediaAlbumActivity.A00.getInt("top_index"), mediaAlbumActivity.A00.getInt("top_offset"));
            mediaAlbumActivity.A00 = null;
            return;
        }
        int intExtra = mediaAlbumActivity.getIntent().getIntExtra("start_index", 0);
        if (intExtra < getCount()) {
            AnonymousClass4R7 r6 = this.A01;
            Point point = new Point();
            MediaAlbumActivity mediaAlbumActivity2 = r6.A05;
            C72463Mc.A0u(mediaAlbumActivity2, point);
            int i = point.y;
            int i2 = point.x;
            ListView listView = mediaAlbumActivity2.getListView();
            C17960vV.A05(listView);
            if (i >= i2) {
                View view = getView(intExtra, (View) null, listView);
                boolean z = false;
                view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), 0);
                r6.A01 = (i * 4) / 5;
                int measuredHeight = view.getMeasuredHeight();
                r6.A02 = measuredHeight;
                int i3 = r6.A01;
                if (i3 < measuredHeight) {
                    r6.A00 = intExtra;
                } else {
                    r6.A00 = -1;
                }
                if (intExtra != 0) {
                    int min = Math.min(measuredHeight, i3);
                    if (intExtra == getCount() - 1) {
                        z = true;
                    }
                    r6.A03 = r6.A00(i, min, z);
                    headerViewsCount = intExtra + listView.getHeaderViewsCount();
                    A002 = r6.A03;
                } else {
                    r6.A03 = 0;
                    return;
                }
            } else {
                headerViewsCount = intExtra + listView.getHeaderViewsCount();
                A002 = AnonymousClass3MX.A00(mediaAlbumActivity2.getResources(), 2131165285, MediaAlbumActivity.A0y(mediaAlbumActivity2));
            }
            listView.setSelectionFromTop(headerViewsCount, A002);
        }
    }

    public int getCount() {
        return C72463Mc.A0C(this.A00);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public int getItemViewType(int i) {
        AnonymousClass206 A0k;
        C88524a2 r1 = this.A02.A00.A0I;
        List list = this.A00;
        if (list == null) {
            A0k = null;
        } else {
            A0k = AnonymousClass3MW.A0k(list, i);
        }
        C17960vV.A07(A0k);
        return r1.A03(A0k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r5.A00.A00 != null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.util.List r0 = r6.A00
            if (r0 != 0) goto L_0x0076
            r4 = 0
        L_0x0005:
            X.C17960vV.A07(r4)
            r3 = 0
            if (r8 != 0) goto L_0x004f
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            X.4kt r0 = r5.A00
            X.4a2 r0 = r0.A0I
            X.3uP r8 = r0.A05(r5, r4)
            r0 = 2131432381(0x7f0b13bd, float:1.8486518E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0021
            r0.setPadding(r3, r3, r3, r3)
        L_0x0021:
            java.util.HashSet r2 = r5.A0b
            X.205 r1 = r4.A0v
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0039
            r2.remove(r1)
            boolean r0 = r5.A0H
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0039
            boolean r0 = r4.A0q
            r8.A25(r3, r0)
        L_0x0039:
            X.4R7 r2 = r6.A01
            r1 = r8
            int r0 = r2.A00
            if (r0 != r7) goto L_0x0047
            int r0 = r2.A01
            r8.A01 = r0
        L_0x0044:
            r2.A04 = r1
        L_0x0046:
            return r8
        L_0x0047:
            r8.A01 = r3
            X.3uP r0 = r2.A04
            if (r0 != r8) goto L_0x0046
            r1 = 0
            goto L_0x0044
        L_0x004f:
            X.3uP r8 = (X.AnonymousClass3uP) r8
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            java.util.HashSet r0 = r5.A0b
            X.205 r2 = r4.A0v
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x006c
            java.util.HashSet r0 = r5.A0a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x006c
            X.4kt r0 = r5.A00
            X.02B r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x006d
        L_0x006c:
            r0 = 1
        L_0x006d:
            r8.A2V(r4, r0)
            java.util.HashSet r0 = r5.A0a
            r0.remove(r2)
            goto L_0x0021
        L_0x0076:
            X.206 r4 = X.AnonymousClass3MW.A0k(r0, r7)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73043Ot.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
