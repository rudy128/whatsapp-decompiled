package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.5qP  reason: invalid class name and case insensitive filesystem */
public class C114255qP extends C6X {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C114255qP(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void A02(View view, float f) {
        if (1 - this.A00 == 0) {
            C18070vi.A0d(view, 0);
            ContactPickerFragment contactPickerFragment = ((ContactPicker) this.A02).A05;
            if (contactPickerFragment != null) {
                int y = (int) view.getY();
                ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(contactPickerFragment.A0A);
                A0B.setMargins(0, 0, 0, y);
                contactPickerFragment.A0A.setLayoutParams(A0B);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r1 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        ((com.google.android.material.bottomsheet.BottomSheetBehavior) r1).A0W(3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0039;
                case 2: goto L_0x0021;
                case 3: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            if (r5 != r0) goto L_0x0020
            java.lang.Object r0 = r3.A02
            X.6P4 r0 = (X.AnonymousClass6P4) r0
            X.0vk r0 = r0.A00
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
        L_0x0016:
            if (r0 != 0) goto L_0x0020
        L_0x0018:
            java.lang.Object r1 = r3.A01
        L_0x001a:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            r0 = 3
            r1.A0W(r0)
        L_0x0020:
            return
        L_0x0021:
            r0 = 1
            if (r5 != r0) goto L_0x0020
            java.lang.Object r1 = r3.A02
            goto L_0x001a
        L_0x0027:
            r0 = 1
            if (r5 != r0) goto L_0x0020
            java.lang.Object r0 = r3.A02
            com.whatsapp.bot.home.AiHomePreviewBottomSheet r0 = (com.whatsapp.bot.home.AiHomePreviewBottomSheet) r0
            androidx.core.widget.NestedScrollView r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getScrollY()
            if (r0 != 0) goto L_0x0018
            return
        L_0x0039:
            r0 = 1
            if (r5 != r0) goto L_0x0043
            java.lang.Object r0 = r3.A02
            com.whatsapp.contact.picker.ContactPickerBottomSheetActivity r0 = (com.whatsapp.contact.picker.ContactPickerBottomSheetActivity) r0
            boolean r0 = r0.A01
            goto L_0x0016
        L_0x0043:
            r0 = 5
            if (r5 != r0) goto L_0x0020
            java.lang.Object r0 = r3.A02
            com.whatsapp.contact.picker.ContactPickerBottomSheetActivity r0 = (com.whatsapp.contact.picker.ContactPickerBottomSheetActivity) r0
            r0.finish()
            return
        L_0x004e:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r0 = 3
            if (r5 == r0) goto L_0x0059
            r0 = 6
            if (r5 == r0) goto L_0x0059
            return
        L_0x0059:
            java.lang.Object r2 = r3.A02
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            java.lang.Object r0 = r3.A01
            float r1 = X.AnonymousClass000.A04(r0)
            float r0 = X.C108945cZ.A04(r4)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.A0V(r0)
            java.util.ArrayList r0 = r2.A0s
            r0.remove(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114255qP.A03(android.view.View, int):void");
    }
}
