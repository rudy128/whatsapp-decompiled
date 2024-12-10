package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.4fX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91344fX implements AnonymousClass1HE {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r9) {
        MediaAlbumActivity mediaAlbumActivity = this.A03;
        View view2 = this.A00;
        View view3 = this.A01;
        View view4 = this.A02;
        int A002 = AnonymousClass3MX.A00(mediaAlbumActivity.getResources(), 2131165285, r9.A08(7).A03);
        int i = r9.A08(7).A00;
        view2.setPadding(0, 0, 0, A002);
        view3.setPadding(0, 0, 0, i);
        view4.setPadding(0, 0, 0, A002);
        return r9;
    }

    public /* synthetic */ C91344fX(View view, View view2, View view3, MediaAlbumActivity mediaAlbumActivity) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }
}
