package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.stickers.store.StickerStoreActivity;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.7Am  reason: invalid class name and case insensitive filesystem */
public class C142707Am implements C23521Gp {
    public final int A00;
    public final Object A01;

    public C142707Am(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r4 = (com.whatsapp.notification.PopupNotification) r6.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bzw(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 != 0) goto L_0x000d
            r5 = 1
            if (r7 != r5) goto L_0x000e
            java.lang.Object r0 = r6.A01
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            r0.A1N = r5
        L_0x000d:
            return
        L_0x000e:
            if (r7 != 0) goto L_0x000d
            java.lang.Object r4 = r6.A01
            com.whatsapp.notification.PopupNotification r4 = (com.whatsapp.notification.PopupNotification) r4
            java.lang.Integer r0 = r4.A1K
            if (r0 == 0) goto L_0x000d
            java.util.List r1 = r4.A1L
            int r0 = r0.intValue()
            r1.remove(r0)
            java.lang.Integer r0 = r4.A1K
            int r1 = r0.intValue()
            java.util.List r0 = r4.A1L
            int r0 = r0.size()
            if (r1 < r0) goto L_0x003c
            java.lang.Integer r0 = r4.A1K
            int r0 = r0.intValue()
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A1K = r0
        L_0x003c:
            X.291 r0 = r4.A0J
            r0.A04()
            com.whatsapp.notification.PopupNotificationViewPager r3 = r4.A0s
            X.291 r2 = r4.A0J
            java.lang.Integer r0 = r4.A1K
            int r1 = r0.intValue()
            r3.setAdapter(r2)
            r0 = 0
            r3.A0J(r1, r0)
            com.whatsapp.notification.PopupNotificationViewPager r0 = r4.A0s
            int r0 = r0.getCurrentItem()
            com.whatsapp.notification.PopupNotification.A0s(r4, r0)
            java.util.List r0 = r4.A1L
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0066
            com.whatsapp.notification.PopupNotification.A0W(r4)
        L_0x0066:
            r0 = 0
            r4.A1K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142707Am.Bzw(int):void");
    }

    public void Bzx(int i, float f, int i2) {
        if (this.A00 == 0) {
            PopupNotification popupNotification = (PopupNotification) this.A01;
            if (popupNotification.A1N) {
                C62332rE.A00(popupNotification.A0v, true);
                AnonymousClass206 r0 = popupNotification.A0x;
                if (r0 != null) {
                    popupNotification.A1b.add(r0.A0v);
                }
                AnonymousClass1E7 r02 = popupNotification.A0i;
                if (r02 != null) {
                    popupNotification.A1a.add(AnonymousClass3MW.A0g(r02));
                }
            }
        }
    }

    public void Bzy(int i) {
        int i2;
        switch (this.A00) {
            case 0:
                PopupNotification popupNotification = (PopupNotification) this.A01;
                if (popupNotification.A1K == null) {
                    PopupNotification.A0s(popupNotification, popupNotification.A0s.getCurrentItem());
                    return;
                }
                return;
            case 1:
                C136866uX r1 = (C136866uX) this.A01;
                r1.A00 = i;
                if (!AnonymousClass3MY.A1b(r1.A08)) {
                    C114605rK r0 = r1.A03;
                    if (r0 != null) {
                        i2 = r0.A01.length;
                    } else {
                        i2 = 0;
                    }
                    i = (i2 - i) - 1;
                }
                r1.A04(i);
                C1607789w r02 = r1.A04;
                if (r02 != null) {
                    r02.Bzy(i);
                    return;
                }
                return;
            default:
                int i3 = 0;
                while (true) {
                    StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) this.A01;
                    if (i3 < stickerStoreActivity.A04.A00.size()) {
                        StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) stickerStoreActivity.A04.A0I(i3);
                        boolean A1T = AnonymousClass000.A1T(i, i3);
                        RecyclerView recyclerView = stickerStoreTabFragment.A04;
                        if (recyclerView != null) {
                            recyclerView.setNestedScrollingEnabled(A1T);
                        }
                        if (A1T) {
                            String str = stickerStoreActivity.A08;
                            if (str != null) {
                                String A0U = C17890vO.A0U(stickerStoreTabFragment);
                                if (!A0U.equals(str)) {
                                    boolean equals = StickerStoreMyTabFragment.class.getName().equals(A0U);
                                    A59 A0e = C108945cZ.A0e(stickerStoreActivity.A07);
                                    int i4 = 7;
                                    int i5 = 2;
                                    if (equals) {
                                        i4 = 1;
                                        i5 = 24;
                                    }
                                    A0e.A03(Integer.valueOf(i5), 7, i4);
                                }
                            }
                            stickerStoreActivity.A08 = C17890vO.A0U(stickerStoreTabFragment);
                        }
                        i3++;
                    } else {
                        stickerStoreActivity.A00.requestLayout();
                        return;
                    }
                }
        }
    }
}
