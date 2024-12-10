package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.group.GroupChatInfoActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.492  reason: invalid class name */
public class AnonymousClass492 extends A34 {
    public final C27191Vc A00;
    public final AnonymousClass1E7 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Context context = (Context) this.A02.get();
        if (context != null) {
            return this.A00.A04(context, this.A01, "GroupChatInfoActivity.doInBackground", 0.0f, 640, false);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A02.get();
        if (groupChatInfoActivity != null) {
            if (bitmap != null) {
                groupChatInfoActivity.A4h(bitmap);
            } else {
                groupChatInfoActivity.A4j(Integer.valueOf(groupChatInfoActivity.A0b.A03(groupChatInfoActivity.A4l(), false)));
            }
            if (AnonymousClass73O.A02(groupChatInfoActivity.A4l())) {
                groupChatInfoActivity.A06.setVisibility(0);
            }
        }
    }

    public AnonymousClass492(C27191Vc r2, AnonymousClass1E7 r3, GroupChatInfoActivity groupChatInfoActivity) {
        this.A00 = r2;
        this.A02 = AnonymousClass3MW.A0z(groupChatInfoActivity);
        this.A01 = r3;
    }
}
