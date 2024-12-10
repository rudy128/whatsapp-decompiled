package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.5qZ  reason: invalid class name and case insensitive filesystem */
public class C114355qZ extends BottomSheetBehavior {
    public final int[] A00 = C108945cZ.A1W();
    public final /* synthetic */ MessageReplyActivity A01;

    public C114355qZ(MessageReplyActivity messageReplyActivity) {
        this.A01 = messageReplyActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r4 < ((float) X.AnonymousClass3MW.A02(r2.A0k, r1))) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MotionEvent r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10) {
        /*
            r7 = this;
            boolean r6 = super.A0K(r8, r9, r10)
            if (r6 == 0) goto L_0x0049
            com.whatsapp.status.playback.MessageReplyActivity r2 = r7.A01
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1v
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0k
            int r0 = r0.getScrollY()
            r1 = 0
            if (r0 <= 0) goto L_0x004a
            float r5 = r8.getRawX()
            float r4 = r8.getRawY()
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0k
            int[] r3 = r7.A00
            r0.getLocationOnScreen(r3)
            r1 = r3[r1]
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0k
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            r0 = 1
            r1 = r3[r0]
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0k
            int r0 = X.AnonymousClass3MW.A02(r0, r1)
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
        L_0x0048:
            r6 = 0
        L_0x0049:
            return r6
        L_0x004a:
            X.74M r0 = r2.A14
            if (r0 == 0) goto L_0x0049
            X.72K r0 = r0.A0J
            if (r0 == 0) goto L_0x0049
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114355qZ.A0K(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        super.A0O(view, coordinatorLayout, i);
        AnonymousClass1HF.A0a(view, -view.getTop());
        return true;
    }
}
