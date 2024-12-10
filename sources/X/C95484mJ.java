package X;

import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$1;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4mJ  reason: invalid class name and case insensitive filesystem */
public class C95484mJ implements AnonymousClass1WR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C95484mJ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r6) {
        if (this.A00 != 0) {
            C18070vi.A0d(r6, 0);
            if (C18070vi.A18(((AnonymousClass206) this.A01).A0v.A00, r6)) {
                AnonymousClass3VA r4 = (AnonymousClass3VA) this.A02;
                AnonymousClass3MW.A1X(r4.A0H, new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(r4, (C30391dr) null), C41561wd.A00(r4));
            }
        }
    }

    public void Bya(Collection collection, Map map) {
        if (this.A00 != 0) {
            C18070vi.A0d(collection, 0);
            if (collection.contains(this.A01)) {
                AnonymousClass3VA r4 = (AnonymousClass3VA) this.A02;
                AnonymousClass3MW.A1X(r4.A0H, new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$1(r4, (C30391dr) null), C41561wd.A00(r4));
                return;
            }
            return;
        }
        AnonymousClass4S9 r42 = (AnonymousClass4S9) this.A01;
        if (!r42.A00) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (r42.A03.remove(C17880vN.A0Y(it).A0v) != null) {
                    z = true;
                }
            }
            if (z) {
                C95144ll r0 = (C95144ll) ((C106755Xb) this.A02);
                int i = r0.A00;
                Object obj = r0.A01;
                switch (i) {
                    case 0:
                        AnonymousClass1DT r1 = ((MessageSelectionViewModel) obj).A00;
                        C18070vi.A0d(r1, 0);
                        r1.A0F(r1.A06());
                        return;
                    case 1:
                        MediaGalleryActivity.A0Q((MediaGalleryActivity) obj);
                        return;
                    default:
                        StorageUsageGalleryActivity.A0V((StorageUsageGalleryActivity) obj);
                        return;
                }
            }
        }
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }
}
