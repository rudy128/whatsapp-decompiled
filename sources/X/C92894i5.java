package X;

import android.net.Uri;
import com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet;

/* renamed from: X.4i5  reason: invalid class name and case insensitive filesystem */
public final class C92894i5 implements C107895an {
    public final /* synthetic */ LinkLongPressBottomSheet A00;

    public C92894i5(LinkLongPressBottomSheet linkLongPressBottomSheet) {
        this.A00 = linkLongPressBottomSheet;
    }

    public void BzY() {
        LinkLongPressBottomSheet linkLongPressBottomSheet = this.A00;
        Uri uri = (Uri) linkLongPressBottomSheet.A0D.getValue();
        C18070vi.A0X(uri);
        LinkLongPressBottomSheet.A00(uri, linkLongPressBottomSheet);
        linkLongPressBottomSheet.A28();
    }

    public void onDismiss() {
        this.A00.A28();
    }
}
