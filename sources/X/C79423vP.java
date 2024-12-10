package X;

import android.os.Bundle;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.3vP  reason: invalid class name and case insensitive filesystem */
public final class C79423vP extends C95124lj {
    public final MediaAlbumActivity A00;
    public final C79683vr A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79423vP(X.C56472hW r2, com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r3, X.C79683vr r4) {
        /*
            r1 = this;
            r0 = 1
            X.AnonymousClass3Ma.A1O(r2, r0, r4)
            X.5ZZ[] r0 = new X.AnonymousClass5ZZ[r0]
            X.C95124lj.A00(r2, r3, r0)
            r1.<init>(r0)
            r1.A00 = r3
            r1.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79423vP.<init>(X.2hW, com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity, X.3vr):void");
    }

    public boolean BKp(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        if (i == 1) {
            AnonymousClass206 A0s = AnonymousClass3MX.A0s(collection);
            MediaAlbumActivity mediaAlbumActivity = this.A00;
            C18070vi.A0d(A0s, 0);
            if (((C695937u) ((C80123wa) this.A01.A09.get()).A00.get()).A01(A0s)) {
                AnonymousClass1BI r2 = mediaAlbumActivity.A0I;
                if (r2 == null) {
                    Log.i("Unable to launch bottom sheet due to null chatJid");
                    return true;
                }
                Bundle A0D = C17880vN.A0D();
                AnonymousClass4aU.A0A(A0D, A0s.A0v);
                AnonymousClass3MY.A15(A0D, r2, "jid");
                CommentsBottomSheet commentsBottomSheet = new CommentsBottomSheet();
                commentsBottomSheet.A1R(A0D);
                mediaAlbumActivity.CMl(commentsBottomSheet);
                return true;
            }
            AnonymousClass1BI A002 = AnonymousClass205.A00(A0s);
            if (C18020vd.A05(C18040vf.A02, mediaAlbumActivity.A0E, 6650)) {
                C98714rb.A00(mediaAlbumActivity.A05, mediaAlbumActivity, A002, A0s, 14);
                return true;
            }
            MediaAlbumActivity.A11(mediaAlbumActivity, mediaAlbumActivity.A00.A09.A0H(A002), A002, A0s);
            return true;
        } else if (i == 12) {
            return ((C79713vu) this.A01.A08.get()).A02(this.A00, AnonymousClass3MX.A0s(collection));
        } else if (i == 15) {
            C79793w2 r3 = (C79793w2) this.A01.A0A.get();
            AnonymousClass206 A0s2 = AnonymousClass3MX.A0s(collection);
            MediaAlbumActivity mediaAlbumActivity2 = this.A00;
            C18070vi.A0d(A0s2, 0);
            AnonymousClass5H6 r6 = new AnonymousClass5H6(mediaAlbumActivity2);
            AnonymousClass1BI r4 = A0s2.A0v.A00;
            if (r4 == null) {
                return false;
            }
            r3.A01.A04().A09(new C146017Nm(mediaAlbumActivity2, r3, r4, A0s2, r6, "album_media_menu_report", 1));
            return true;
        } else if (i == 31) {
            return ((C79843w7) this.A01.A0B.get()).A02(this.A00, AnonymousClass3MX.A0s(collection));
        } else if (i != 39) {
            return super.BKp(i, collection);
        } else {
            this.A01.A03.get();
            Object A0X = C29431cG.A0X(collection);
            MediaAlbumActivity mediaAlbumActivity3 = this.A00;
            C18070vi.A0d(A0X, 0);
            mediaAlbumActivity3.A05.A0J(new C98704ra(mediaAlbumActivity3, A0X, 0));
            return true;
        }
    }
}
