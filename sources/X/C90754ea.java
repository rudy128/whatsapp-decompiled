package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.HashSet;

/* renamed from: X.4ea  reason: invalid class name and case insensitive filesystem */
public class C90754ea implements AbsListView.OnScrollListener {
    public float A00;
    public int A01 = -1;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ View A06;
    public final /* synthetic */ MediaAlbumActivity A07;

    public C90754ea(View view, MediaAlbumActivity mediaAlbumActivity, int i, int i2, int i3) {
        this.A07 = mediaAlbumActivity;
        this.A06 = view;
        this.A04 = i;
        this.A05 = i2;
        this.A03 = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = r11.A07
            android.widget.ListView r0 = r6.A02
            int r5 = r0.getFirstVisiblePosition()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L_0x011a
            android.view.View r1 = r11.A06
            int r0 = r1.getTop()
            int r2 = r1.getHeight()
            if (r2 <= 0) goto L_0x011a
            int r0 = -r0
            float r1 = (float) r0
            float r1 = r1 * r4
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x001d:
            X.3Ot r0 = r6.A0A
            X.4R7 r10 = r0.A01
            X.3uP r3 = r10.A04
            if (r3 == 0) goto L_0x0088
            int r2 = r10.A01
            int r0 = r10.A02
            if (r2 >= r0) goto L_0x0088
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0112
            int r2 = r3.getTop()
            int r0 = r10.A03
            if (r2 == r0) goto L_0x0112
            X.3uP r0 = r10.A04
            int r2 = r0.getTop()
            int r0 = r10.A03
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            int r2 = r10.A01
            int r0 = r0 * 2
            int r2 = r2 + r0
            r10.A01 = r2
            X.3uP r0 = r10.A04
            r0.A01 = r2
            r0.requestLayout()
            int r0 = r10.A00
            if (r0 == 0) goto L_0x0112
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r9 = r10.A05
            X.C72463Mc.A0u(r9, r0)
            int r8 = r0.y
            int r7 = r10.A01
            int r3 = r10.A00
            X.3Ot r0 = r9.A0A
            int r2 = r0.getCount()
            r0 = 1
            int r2 = r2 - r0
            if (r3 == r2) goto L_0x0071
            r0 = 0
        L_0x0071:
            int r7 = r10.A00(r8, r7, r0)
            android.widget.ListView r3 = r9.getListView()
            X.C17960vV.A05(r3)
            int r2 = r10.A00
            int r0 = r3.getHeaderViewsCount()
            int r2 = r2 + r0
            r3.setSelectionFromTop(r2, r7)
        L_0x0086:
            r10.A03 = r7
        L_0x0088:
            android.widget.ListView r0 = r6.getListView()
            android.view.View r3 = X.AnonymousClass3MY.A0F(r0)
            X.3Ot r0 = r6.A0A
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x00ac
            if (r3 == 0) goto L_0x00ac
            int r0 = r11.A01
            if (r0 >= 0) goto L_0x00a6
            r11.A01 = r5
            int r0 = r3.getTop()
            r11.A02 = r0
        L_0x00a6:
            int r0 = r11.A01
            if (r0 == r5) goto L_0x00ec
            r11.A00 = r4
        L_0x00ac:
            float r0 = r11.A00
            float r0 = java.lang.Math.min(r1, r0)
            float r4 = r4 - r0
            X.4kt r0 = r6.A00
            X.02B r0 = r0.A00
            android.view.Window r2 = r6.getWindow()
            if (r0 == 0) goto L_0x00e3
            r1 = 2130968626(0x7f040032, float:1.754591E38)
            r0 = 2131099689(0x7f060029, float:1.7811738E38)
            int r0 = X.AnonymousClass3Ma.A00(r6, r1, r0)
        L_0x00c7:
            r2.setStatusBarColor(r0)
            X.3Mz r3 = r6.A0B
            int r1 = r11.A04
            int r0 = r11.A03
            int r2 = X.AnonymousClass1Z2.A03(r4, r1, r0)
            android.graphics.Paint r1 = r3.A00
            int r0 = r1.getColor()
            if (r0 == r2) goto L_0x00e2
            r1.setColor(r2)
            r3.invalidateSelf()
        L_0x00e2:
            return
        L_0x00e3:
            int r1 = r11.A04
            int r0 = r11.A05
            int r0 = X.AnonymousClass1Z2.A03(r4, r1, r0)
            goto L_0x00c7
        L_0x00ec:
            float r5 = r11.A00
            int r2 = r11.A02
            int r0 = r3.getTop()
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            float r3 = (float) r0
            float r3 = r3 * r4
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            float r0 = X.AnonymousClass3MW.A00(r2, r0)
            float r3 = r3 / r0
            float r0 = java.lang.Math.min(r4, r3)
            float r0 = java.lang.Math.max(r5, r0)
            r11.A00 = r0
            goto L_0x00ac
        L_0x0112:
            X.3uP r0 = r10.A04
            int r7 = r0.getTop()
            goto L_0x0086
        L_0x011a:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90754ea.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        MediaAlbumActivity mediaAlbumActivity = this.A07;
        ReactionsTrayViewModel reactionsTrayViewModel = mediaAlbumActivity.A00.A0p;
        if (reactionsTrayViewModel != null) {
            reactionsTrayViewModel.A0T(0);
        }
        if (i == 0 && C22971Dz.A0V(mediaAlbumActivity.A0J) && AnonymousClass1c4.A00((AnonymousClass1c4) mediaAlbumActivity.A0S.get(), 2)) {
            AnonymousClass4RG r4 = (AnonymousClass4RG) mediaAlbumActivity.A0T.get();
            HashSet A12 = C17880vN.A12();
            int childCount = mediaAlbumActivity.getListView().getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = mediaAlbumActivity.getListView().getChildAt(i2);
                if (childAt instanceof AnonymousClass3uL) {
                    AnonymousClass21V fMessage = ((AnonymousClass3uL) childAt).getFMessage();
                    if (AnonymousClass4H3.A00(fMessage)) {
                        A12.add(fMessage);
                    }
                }
            }
            C127386eG r3 = new C127386eG(A12, C17880vN.A12());
            C200710s r2 = (C200710s) r4.A04.getValue();
            r2.A03();
            r2.execute(new C146807Qr(r4, r3, 39));
        }
    }
}
