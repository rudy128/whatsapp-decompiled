package X;

import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.whatsapp.community.communitymedia.CommunityMediaActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4fB  reason: invalid class name and case insensitive filesystem */
public abstract class C91124fB implements AnonymousClass02H, C108025b0 {
    public final AnonymousClass1FY A00;
    public final C34111jw A01 = new C34111jw();
    public final C18000vb A02;
    public final C18030ve A03;
    public final C18100vl A04;
    public final Map A05 = C17880vN.A11();

    public C91124fB(AnonymousClass1FY r8, AnonymousClass5ZZ r9, C107265Za r10, C87564Wb r11, C18000vb r12, AnonymousClass1KW r13, C18030ve r14, Integer num) {
        C18070vi.A0s(r8, r14, r13, r12);
        C18070vi.A0l(r10, r11);
        this.A00 = r8;
        this.A03 = r14;
        this.A02 = r12;
        AnonymousClass5ZZ r1 = r9;
        this.A04 = AnonymousClass1DF.A01(new C104685Pc(r1, this, r10, r11, r13, num));
    }

    public Collection BYq() {
        AnonymousClass4S9 r0;
        C79573vg r1 = (C79573vg) this;
        switch (r1.A00) {
            case 0:
                return C29431cG.A0t(((Map) AnonymousClass3Ma.A0R((CommunityMediaActivity) r1.A01).A0u.getValue()).values());
            case 3:
                r0 = ((AnonymousClass3uW) r1.A01).A00.A05();
                break;
            case 4:
                AnonymousClass4aY r12 = (AnonymousClass4aY) r1.A01;
                if (r12.A2Q.getSelectedMessages() != null) {
                    r0 = r12.A2Q.getSelectedMessages();
                    break;
                } else {
                    return null;
                }
            case 5:
                r0 = ((MediaGalleryActivity) r1.A01).A0G;
                break;
            case 6:
                return ((MyStatusesActivity) r1.A01).A12.values();
            case 7:
                r0 = ((StorageUsageGalleryActivity) r1.A01).A0D;
                break;
            default:
                AnonymousClass3uU r13 = (AnonymousClass3uU) r1.A01;
                if (r13.A00.A05() != null) {
                    r0 = r13.A00.A05();
                    break;
                } else {
                    return null;
                }
        }
        if (r0 == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r4) {
        C18070vi.A0d(menuItem, 1);
        return ((C88094Yh) this.A04.getValue()).A03(menuItem.getItemId());
    }

    public boolean BqR(Menu menu, AnonymousClass02B r9) {
        C18070vi.A0d(menu, 1);
        C137526vb.A00(menu);
        for (C87044Ub r4 : ((C88094Yh) this.A04.getValue()).A01()) {
            int i = r4.A03;
            MenuItem add = menu.add(0, i, 0, r4.A01);
            add.setIcon(r4.A00);
            this.A05.put(Integer.valueOf(i), add);
        }
        return true;
    }

    public void BrJ(AnonymousClass02B r7) {
        C79573vg r2 = (C79573vg) this;
        switch (r2.A00) {
            case 0:
                C73373Vg A0R = AnonymousClass3Ma.A0R((CommunityMediaActivity) r2.A01);
                AnonymousClass1G4 r22 = A0R.A0q;
                do {
                } while (!r22.BFK(r22.getValue(), C17880vN.A13()));
                A0R.A0V();
                return;
            case 1:
                Log.i("MediaAlbumActivity/onDestroyActionMode");
                break;
            case 2:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(((C79333vF) r2.A01).A4d());
                C17890vO.A1A(A10, "/selectionended");
                break;
            case 3:
                C18070vi.A0d(r7, 0);
                break;
            case 4:
                break;
            case 5:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r2.A01;
                AnonymousClass4S9 r1 = mediaGalleryActivity.A0G;
                if (r1 != null) {
                    r1.A01();
                    mediaGalleryActivity.A0G = null;
                }
                mediaGalleryActivity.A05 = null;
                for (Fragment fragment : mediaGalleryActivity.A3W()) {
                    if (fragment instanceof C108055b3) {
                        ((C108055b3) fragment).C4y();
                    }
                }
                return;
            case 6:
                MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A01;
                Set set = myStatusesActivity.A13;
                set.clear();
                Map map = myStatusesActivity.A12;
                set.addAll(map.keySet());
                Handler handler = myStatusesActivity.A0x;
                Runnable runnable = myStatusesActivity.A0y;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 200);
                map.clear();
                myStatusesActivity.A00 = null;
                MyStatusesActivity.A0z(myStatusesActivity);
                return;
            default:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r2.A01;
                AnonymousClass4S9 r12 = storageUsageGalleryActivity.A0D;
                if (r12 != null) {
                    r12.A01();
                    storageUsageGalleryActivity.A0D = null;
                }
                storageUsageGalleryActivity.A05 = null;
                StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = storageUsageGalleryActivity.A0M;
                if (storageUsageMediaGalleryFragment != null && storageUsageMediaGalleryFragment.A1b()) {
                    storageUsageMediaGalleryFragment.A2B();
                    return;
                }
                return;
        }
        Log.i("conversation/selectionended");
        r2.BLL();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C1U(android.view.Menu r14, X.AnonymousClass02B r15) {
        /*
            r13 = this;
            r8 = 0
            boolean r7 = X.C18070vi.A17(r15, r14)
            java.util.Collection r5 = r13.BYq()
            if (r5 == 0) goto L_0x01e0
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x01e0
            X.0vl r1 = r13.A04
            java.lang.Object r1 = r1.getValue()
            X.4Yh r1 = (X.C88094Yh) r1
            java.util.List r1 = r1.A02()
            java.util.Iterator r4 = r1.iterator()
        L_0x0021:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r3 = r4.next()
            X.4Ub r3 = (X.C87044Ub) r3
            java.util.Map r2 = r13.A05
            int r1 = r3.A03
            java.lang.Object r2 = X.AnonymousClass000.A0w(r2, r1)
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            if (r2 == 0) goto L_0x0021
            boolean r1 = r3.A02
            r2.setVisible(r1)
            java.lang.String r1 = r3.A01
            r2.setTitle(r1)
            goto L_0x0021
        L_0x0044:
            X.0vb r1 = r13.A02
            java.util.Locale r3 = r1.A0N()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            int r1 = r5.size()
            X.C17880vN.A1T(r2, r1, r8)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r7)
            java.lang.String r1 = "%d"
            java.lang.String r1 = java.lang.String.format(r3, r1, r2)
            X.C18070vi.A0X(r1)
            r15.A0B(r1)
            r6 = r13
            X.3vg r6 = (X.C79573vg) r6
            int r5 = r6.A00
            r0 = 7
            if (r0 == r5) goto L_0x0184
            r1 = 0
        L_0x006c:
            r15.A0A(r1)
            int r5 = 4 - r5
            if (r5 != 0) goto L_0x016c
            java.lang.Object r5 = r6.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.5cQ r1 = r5.A2Q
            X.4S9 r1 = r1.getSelectedMessages()
            if (r1 == 0) goto L_0x0176
            X.5cQ r1 = r5.A2Q
            X.4S9 r1 = r1.getSelectedMessages()
            java.util.HashMap r1 = r1.A03
            int r1 = r1.size()
            r3 = 1
            if (r1 != r3) goto L_0x0176
            X.5cQ r1 = r5.A2Q
            X.4S9 r1 = r1.getSelectedMessages()
            java.util.Collection r1 = r1.A00()
            java.util.Iterator r1 = r1.iterator()
            X.206 r1 = X.C17880vN.A0Y(r1)
            int r2 = r1.A0u
            if (r2 == 0) goto L_0x00ac
            boolean r1 = X.AnonymousClass4aY.A25(r5)
            if (r1 == 0) goto L_0x0176
            if (r2 != r3) goto L_0x0176
        L_0x00ac:
            boolean r1 = X.AnonymousClass4aY.A22(r5)
            if (r1 != 0) goto L_0x0176
            X.1UD r1 = X.C72473Md.A0R(r5)
            X.0ve r3 = r1.A00
            X.0vf r2 = X.C18040vf.A01
            r1 = 12049(0x2f11, float:1.6884E-41)
            boolean r1 = X.C18020vd.A05(r2, r3, r1)
            if (r1 == 0) goto L_0x0176
            com.google.android.material.chip.Chip r1 = r5.A0j
            if (r1 != 0) goto L_0x00e4
            X.5cQ r2 = r5.A2Q
            r1 = 2131435371(0x7f0b1f6b, float:1.8492582E38)
            X.1bI r1 = X.C72453Mb.A0t(r2, r1)
            android.view.View r2 = X.AnonymousClass3MY.A0I(r1, r8)
            com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) r2
            r5.A0j = r2
            r1 = 38
            X.C89914dE.A00(r2, r5, r1)
            com.google.android.material.chip.Chip r2 = r5.A0j
            r1 = 2131886744(0x7f120298, float:1.9408075E38)
            r2.setText(r1)
        L_0x00e4:
            com.google.android.material.chip.Chip r1 = r5.A0j
            r1.setVisibility(r8)
            android.view.View r2 = r5.A0D
            r1 = 8
        L_0x00ed:
            r2.setVisibility(r1)
        L_0x00f0:
            r5.A2e()
            X.5cQ r1 = r5.A2Q
            X.4S9 r1 = r1.getSelectedMessages()
            if (r1 == 0) goto L_0x016c
            X.1FY r4 = X.AnonymousClass3MW.A0P(r5)
            r1 = 1
            X.C18070vi.A0d(r4, r1)
            int r1 = r14.size()
            if (r1 == 0) goto L_0x016c
            java.util.Iterator r3 = X.C99434so.A00(r14, r8)
        L_0x010d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0174
            java.lang.Object r2 = r3.next()
            r1 = r2
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r1 = r1.isVisible()
            if (r1 == 0) goto L_0x010d
        L_0x0120:
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            if (r2 == 0) goto L_0x016c
            int r1 = r2.getItemId()
            android.view.View r2 = r4.findViewById(r1)
            if (r2 == 0) goto L_0x016c
            android.view.ViewParent r1 = r2.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L_0x016c
            android.view.View r2 = X.C72463Mc.A0L(r2)
            r1 = 2131432607(0x7f0b149f, float:1.8486976E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x016c
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            r2.getGlobalVisibleRect(r1)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x016c
            X.4Wj r4 = r5.A2C
            X.1BI r3 = r5.A3R
            X.5cQ r1 = r5.A2Q
            X.4S9 r2 = r1.getSelectedMessages()
            r1 = 2
            X.3zQ r2 = X.C87644Wj.A00(r2, r3, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.A04 = r1
            X.18K r1 = r4.A00
            r1.CC7(r2)
        L_0x016c:
            X.1jw r2 = r13.A01
            X.1FY r1 = r13.A00
            r2.A00(r1, r14)
            return r7
        L_0x0174:
            r2 = 0
            goto L_0x0120
        L_0x0176:
            com.google.android.material.chip.Chip r2 = r5.A0j
            if (r2 == 0) goto L_0x00f0
            r1 = 8
            r2.setVisibility(r1)
            android.view.View r2 = r5.A0D
            r1 = 0
            goto L_0x00ed
        L_0x0184:
            java.lang.Object r11 = r6.A01
            com.whatsapp.storage.StorageUsageGalleryActivity r11 = (com.whatsapp.storage.StorageUsageGalleryActivity) r11
            X.4S9 r2 = r11.A0D
            r1 = 0
            if (r2 == 0) goto L_0x006c
            java.util.HashMap r2 = r2.A03
            java.util.Collection r2 = r2.values()
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.Iterator r10 = r2.iterator()
        L_0x019b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x01b7
            X.206 r3 = X.C17880vN.A0Y(r10)
            boolean r2 = r3 instanceof X.AnonymousClass21V
            if (r2 == 0) goto L_0x019b
            X.21V r3 = (X.AnonymousClass21V) r3
            java.lang.String r4 = r3.A05
            long r2 = r3.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.put(r4, r2)
            goto L_0x019b
        L_0x01b7:
            java.util.Collection r2 = r9.values()
            java.util.Iterator r12 = r2.iterator()
            r2 = 0
        L_0x01c1:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x01cd
            long r9 = X.C17890vO.A07(r12)
            long r2 = r2 + r9
            goto L_0x01c1
        L_0x01cd:
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x006c
            X.0vb r4 = r11.A00
            r1 = 1
            android.util.Pair r1 = X.C88584aA.A00(r4, r2, r1, r8)
            java.lang.Object r1 = r1.first
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x006c
        L_0x01e0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91124fB.C1U(android.view.Menu, X.02B):boolean");
    }
}
