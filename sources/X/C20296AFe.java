package X;

import android.view.ViewTreeObserver;

/* renamed from: X.AFe  reason: case insensitive filesystem */
public class C20296AFe implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public C20296AFe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c7, code lost:
        X.AnonymousClass3MY.A1D(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ca, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0148;
                case 1: goto L_0x0045;
                case 2: goto L_0x0059;
                case 3: goto L_0x0083;
                case 4: goto L_0x01b9;
                case 5: goto L_0x01cb;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00d3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r4 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r4
            android.widget.ScrollView r0 = r4.A0C
            android.view.View r0 = r0.getRootView()
            int r3 = r0.getHeight()
            android.widget.ScrollView r0 = r4.A0C
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168476(0x7f070cdc, float:1.7951255E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r3 <= r0) goto L_0x0044
            android.widget.ScrollView r2 = r4.A0C
            android.widget.Button r0 = r4.A0B
            int r1 = r0.getTop()
            r0 = 0
            r2.smoothScrollTo(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/layout heightDiff:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "scroll view"
            X.C17890vO.A1A(r1, r0)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r0 = r9.A01
            X.8xf r0 = (X.C174988xf) r0
            X.1qy r2 = r0.A00
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            int r1 = X.C174988xf.A00(r0)
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0044
            r2.A1g(r1)
            return
        L_0x0059:
            java.lang.Object r2 = r9.A01
            com.whatsapp.home.ui.StarredMessagesPlaceholderActivity r2 = (com.whatsapp.home.ui.StarredMessagesPlaceholderActivity) r2
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            android.view.ViewGroup r0 = r2.A04
            if (r0 == 0) goto L_0x0068
            r0.getWindowVisibleDisplayFrame(r1)
        L_0x0068:
            int r1 = r1.height()
            int r0 = r2.A01
            int r1 = r1 + r0
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r0 = r2.A03
            if (r0 == 0) goto L_0x0079
            r0.height = r1
        L_0x0079:
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0080
            r0.requestLayout()
        L_0x0080:
            r2.A00 = r1
            return
        L_0x0083:
            java.lang.Object r3 = r9.A01
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r3 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r3
            com.whatsapp.WaImageView r1 = r3.A01
            if (r1 == 0) goto L_0x0044
            com.whatsapp.WaTextView r0 = r3.A02
            if (r0 == 0) goto L_0x0044
            X.AnonymousClass3MY.A1D(r1, r9)
            com.whatsapp.WaTextView r0 = r3.A03
            X.AnonymousClass3MY.A1D(r0, r9)
            com.whatsapp.WaImageView r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131169567(0x7f07111f, float:1.7953468E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x0044
            com.whatsapp.WaImageView r1 = r3.A01
            goto L_0x00cd
        L_0x00ad:
            java.lang.Object r3 = r9.A01
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0044
            X.AnonymousClass3MY.A1D(r0, r9)
            android.view.View r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168459(0x7f070ccb, float:1.795122E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x0044
            android.view.View r1 = r3.A01
        L_0x00cd:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x00d3:
            java.lang.Object r3 = r9.A01
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            androidx.core.widget.NestedScrollView r0 = r3.A03
            X.AnonymousClass3MY.A1D(r0, r9)
            androidx.core.widget.NestedScrollView r0 = r3.A03
            int r2 = r0.getMeasuredHeight()
            androidx.core.widget.NestedScrollView r0 = r3.A03
            r4 = 0
            android.view.View r0 = r0.getChildAt(r4)
            int r0 = r0.getHeight()
            int r2 = r2 - r0
            r1 = 1
            if (r2 >= 0) goto L_0x00f2
            r4 = 1
        L_0x00f2:
            int r0 = X.C72453Mb.A08(r3)
            if (r0 != r1) goto L_0x0120
            r0 = 2131430537(0x7f0b0c89, float:1.8482778E38)
            android.view.View r2 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            if (r2 == 0) goto L_0x0044
            if (r4 == 0) goto L_0x0111
            r0 = 1090519040(0x41000000, float:8.0)
            r2.setCardElevation(r0)
            r0 = 2131100370(0x7f0602d2, float:1.781312E38)
        L_0x010d:
            X.AnonymousClass3MX.A1A(r3, r2, r0)
            return
        L_0x0111:
            r0 = 0
            r2.setCardElevation(r0)
            r1 = 2130970830(0x7f0408ce, float:1.7550381E38)
            r0 = 2131102245(0x7f060a25, float:1.7816922E38)
            int r0 = X.AnonymousClass1YL.A00(r3, r1, r0)
            goto L_0x010d
        L_0x0120:
            int r1 = X.C72453Mb.A08(r3)
            r0 = 2
            if (r1 != r0) goto L_0x0044
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0044
            if (r4 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 48
            r1.gravity = r0
            r2.setLayoutParams(r1)
            return
        L_0x0148:
            java.lang.Object r6 = r9.A01
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r6 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r6
            r0 = 2131434842(0x7f0b1d5a, float:1.849151E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MX.A0F(r6, r0)
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            int r1 = r0.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatSpinner r0 = r6.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01b7
            androidx.appcompat.widget.AppCompatSpinner r0 = r6.A02
            int r0 = r0.getMeasuredHeight()
        L_0x016a:
            int r1 = r1 - r0
            android.widget.RadioGroup r0 = r6.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01b0
            r0 = 0
        L_0x0174:
            int r1 = r1 + r0
            android.graphics.Point r0 = X.C72483Me.A0D(r6)
            int r0 = r0.y
            float r0 = (float) r0
            double r3 = (double) r0
            float r0 = (float) r1
            double r1 = (double) r0
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.C108975cc.A19(r0)
            androidx.appcompat.widget.AppCompatSpinner r1 = r6.A02
            r0 = 8
            if (r2 == 0) goto L_0x0192
            r0 = 0
        L_0x0192:
            r1.setVisibility(r0)
            android.widget.RadioGroup r1 = r6.A01
            r0 = 0
            if (r2 == 0) goto L_0x019c
            r0 = 8
        L_0x019c:
            r1.setVisibility(r0)
            r0 = 2131431096(0x7f0b0eb8, float:1.8483912E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r2 == 0) goto L_0x01aa
            r5 = 8
        L_0x01aa:
            r0.setVisibility(r5)
            android.widget.RadioGroup r0 = r6.A01
            goto L_0x01c7
        L_0x01b0:
            android.widget.RadioGroup r0 = r6.A01
            int r0 = r0.getMeasuredHeight()
            goto L_0x0174
        L_0x01b7:
            r0 = 0
            goto L_0x016a
        L_0x01b9:
            java.lang.Object r2 = r9.A01
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            com.whatsapp.wds.components.search.WDSSearchBar r1 = r2.A20
            if (r1 == 0) goto L_0x01c5
            r0 = 1
            com.whatsapp.wds.components.search.WDSSearchBar.A01(r1, r0, r0)
        L_0x01c5:
            android.widget.ListView r0 = r2.A0D
        L_0x01c7:
            X.AnonymousClass3MY.A1D(r0, r9)
            return
        L_0x01cb:
            java.lang.Object r1 = r9.A01
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r1.A0l
            X.AnonymousClass3MY.A1D(r0, r9)
            X.9p9 r1 = r1.A0r
            r0 = 1
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20296AFe.onGlobalLayout():void");
    }
}
