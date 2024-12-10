package X;

import android.graphics.Bitmap;
import android.util.Pair;
import android.util.TypedValue;
import android.widget.ImageView;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6oi  reason: invalid class name and case insensitive filesystem */
public class C133416oi {
    public final /* synthetic */ MessageReplyActivity A00;

    public C133416oi(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public void A00(File file) {
        Bitmap bitmap;
        MessageReplyActivity messageReplyActivity = this.A00;
        HashMap hashMap = MessageReplyActivity.A1v;
        if (C108975cc.A1I(messageReplyActivity.A17)) {
            if (file == null) {
                bitmap = null;
            } else {
                int applyDimension = (int) TypedValue.applyDimension(1, 28.0f, AnonymousClass000.A0Y(messageReplyActivity.A08).getDisplayMetrics());
                bitmap = AnonymousClass204.A0A(new AnonymousClass25O(applyDimension, applyDimension), file).A02;
            }
            MessageReplyActivity.A0s(bitmap, messageReplyActivity);
        }
    }

    public void A01(List list) {
        MessageReplyActivity messageReplyActivity = this.A00;
        HashMap hashMap = MessageReplyActivity.A1v;
        if (C108975cc.A1I(messageReplyActivity.A17)) {
            List list2 = list;
            if (list2.size() != 6) {
                Log.e("MessageReplyActivity/setStatusReactionsAvatarList/invalid avatar reaction list size");
                return;
            }
            for (Pair pair : C137746vx.A00) {
                C123196Tm r2 = (C123196Tm) list2.get(C108965cb.A00(pair));
                ImageView A0G = AnonymousClass3MW.A0G(messageReplyActivity.A08, ((Number) pair.first).intValue());
                AnonymousClass3MW.A1Q(A0G);
                if (r2 instanceof AnonymousClass6GQ) {
                    Log.e("MessageReplyActivity/setAvatar/AvatarReactionData returned Error");
                } else if (!(r2 instanceof AnonymousClass6GS)) {
                    if (r2 instanceof AnonymousClass6GR) {
                        C1418377d r9 = ((AnonymousClass6GR) r2).A00;
                        C26631Sw r1 = messageReplyActivity.A0r;
                        int i = r9.A03;
                        int i2 = r9.A02;
                        AnonymousClass7MK r10 = new AnonymousClass7MK(A0G, 2);
                        C18070vi.A0d(A0G, 2);
                        r1.A06(new C59842my(A0G, r9, r10, i, i2, 1, 0, true, false, false));
                        C108955ca.A1B(messageReplyActivity.A08.getContext(), A0G, r9);
                        A0G.setOnClickListener(new AnonymousClass788(new AnonymousClass78A(messageReplyActivity, A0G, r9, 45), messageReplyActivity.A05));
                    }
                }
                A0G.setImageResource(2131233045);
            }
        }
    }
}
