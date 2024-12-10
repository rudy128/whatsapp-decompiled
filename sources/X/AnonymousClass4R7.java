package X;

import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.4R7  reason: invalid class name */
public class AnonymousClass4R7 {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass3uP A04;
    public final /* synthetic */ MediaAlbumActivity A05;

    public AnonymousClass4R7(MediaAlbumActivity mediaAlbumActivity) {
        this.A05 = mediaAlbumActivity;
    }

    public int A00(int i, int i2, boolean z) {
        MediaAlbumActivity mediaAlbumActivity = this.A05;
        int max = Math.max(-mediaAlbumActivity.getResources().getDimensionPixelSize(2131165325), (AnonymousClass3MX.A00(mediaAlbumActivity.getResources(), 2131165285, MediaAlbumActivity.A0y(mediaAlbumActivity) + i) - i2) / 2);
        if (z) {
            return Math.max(max, i - i2);
        }
        return max;
    }
}
