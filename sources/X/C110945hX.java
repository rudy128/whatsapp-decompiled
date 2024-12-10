package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.5hX  reason: invalid class name and case insensitive filesystem */
public class C110945hX extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;

    public C110945hX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A1S(View view, int i) {
        if (2 - this.A00 == 0) {
            C18070vi.A0d(view, 0);
            if (i == 256) {
                C121996Mj r1 = (C121996Mj) this.A01;
                if (!C108995ce.A1U(r1.A0F)) {
                    r1.A05();
                }
                r1.A0A(3000);
                return;
            }
        }
        super.A1S(view, i);
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.A00) {
            case 3:
                if (accessibilityEvent.getEventType() == 2048) {
                    return;
                }
                break;
            case 4:
                if (accessibilityEvent.getEventType() == 32768) {
                    C110665gi r1 = (C110665gi) this.A01;
                    if (r1.getContext() != null && view.getTag() != null) {
                        AnonymousClass1Y5.A00(r1.getContext(), r1.A08, C108975cc.A0b(r1.getContext(), C64052u8.A07(r1.A09, C17880vN.A05(view.getTag())), AnonymousClass3MW.A1a(), 2131886903));
                        return;
                    }
                    return;
                }
                return;
        }
        super.A1T(view, accessibilityEvent);
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        if (this.A00 == 0 && i == 1048576) {
            C110745gz r1 = (C110745gz) this.A01;
            if (r1.A03) {
                r1.cancel();
                return true;
            }
        }
        return super.A1Y(view, i, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008b, code lost:
        r5.A0L(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        r5.A0Q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        r2 = new X.C26137Ct0(16, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.view.View r4, X.C26228CvK r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x0098;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x008f;
                case 5: goto L_0x0079;
                case 6: goto L_0x0064;
                case 7: goto L_0x0054;
                case 8: goto L_0x003e;
                case 9: goto L_0x001c;
                case 10: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A1Z(r4, r5)
            return
        L_0x0009:
            super.A1Z(r4, r5)
            X.Ct0 r0 = X.C26137Ct0.A08
            java.lang.Object r0 = r3.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.1FL r1 = r0.A0a
            r0 = 2131898085(0x7f122ee5, float:1.9431078E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x004c
        L_0x001c:
            boolean r0 = X.C18070vi.A15(r4, r5)
            super.A1Z(r4, r5)
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r5.A0f(r0)
            r5.A0m(r0)
            X.Ct0 r0 = X.C26137Ct0.A08
            r5.A0M(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131896381(0x7f12283d, float:1.9427622E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0094
        L_0x003e:
            super.A1Z(r4, r5)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131899381(0x7f1233f5, float:1.9433706E38)
            java.lang.CharSequence r1 = r1.getText(r0)
        L_0x004c:
            r0 = 16
            X.Ct0 r2 = new X.Ct0
            r2.<init>((int) r0, (java.lang.CharSequence) r1)
            goto L_0x008b
        L_0x0054:
            X.C18070vi.A0h(r4, r5)
            super.A1Z(r4, r5)
            java.lang.Object r0 = r3.A01
            com.whatsapp.gallery.GalleryTabHostFragment r0 = (com.whatsapp.gallery.GalleryTabHostFragment) r0
            com.whatsapp.wds.components.fab.WDSFab r0 = r0.A0M
            r5.A0F(r0)
            return
        L_0x0064:
            super.A1Z(r4, r5)
            r1 = 0
            r5.A0f(r1)
            X.Ct0 r0 = X.C26137Ct0.A08
            r5.A0M(r0)
            r5.A0m(r1)
            X.Ct0 r0 = X.C26137Ct0.A0L
            r5.A0M(r0)
            return
        L_0x0079:
            super.A1Z(r4, r5)
            r0 = 0
            r5.A0m(r0)
            X.Ct0 r0 = X.C26137Ct0.A0L
            r5.A0M(r0)
            r0 = 1
            r5.A0f(r0)
            X.Ct0 r2 = X.C26137Ct0.A08
        L_0x008b:
            r5.A0L(r2)
            return
        L_0x008f:
            super.A1Z(r4, r5)
            java.lang.String r0 = ""
        L_0x0094:
            r5.A0Q(r0)
            return
        L_0x0098:
            super.A1Z(r4, r5)
            java.lang.Object r0 = r3.A01
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            int r2 = X.C108945cZ.A07(r0)
            r1 = 1
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r2, r0)
            X.CgU r0 = new X.CgU
            r0.<init>(r1)
            r5.A0Z(r0)
            return
        L_0x00b2:
            super.A1Z(r4, r5)
            java.lang.Object r0 = r3.A01
            X.5gz r0 = (X.C110745gz) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00c9
            r0 = 1048576(0x100000, float:1.469368E-39)
            r5.A0A(r0)
            r1 = 1
        L_0x00c3:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A02
            r0.setDismissable(r1)
            return
        L_0x00c9:
            r1 = 0
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110945hX.A1Z(android.view.View, X.CvK):void");
    }
}
