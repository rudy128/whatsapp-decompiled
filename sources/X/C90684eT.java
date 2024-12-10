package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4eT  reason: invalid class name and case insensitive filesystem */
public class C90684eT implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;

    public C90684eT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r1 != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollChanged() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x007d;
                case 2: goto L_0x002f;
                case 3: goto L_0x0064;
                case 4: goto L_0x009a;
                case 5: goto L_0x00a2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A01
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r2 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r2
            android.widget.ScrollView r1 = r2.A05
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A03
            if (r0 == 0) goto L_0x002d
            int r0 = r2.A00
        L_0x0016:
            float r0 = (float) r0
        L_0x0017:
            r1.setElevation(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r2 = r5.A01
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.ScrollView r1 = r2.A04
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x002d
            int r0 = r2.A00
            goto L_0x0016
        L_0x002d:
            r0 = 0
            goto L_0x0017
        L_0x002f:
            java.lang.Object r4 = r5.A01
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r4
            androidx.core.widget.NestedScrollView r0 = r4.A05
            if (r0 == 0) goto L_0x0051
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != r1) goto L_0x0051
            android.content.Context r3 = r4.A14()
            r0 = 2131100375(0x7f0602d7, float:1.781313E38)
        L_0x0045:
            int r1 = X.C19740yt.A00(r3, r0)
            android.widget.LinearLayout r0 = r4.A04
            if (r0 == 0) goto L_0x001a
            r0.setBackgroundColor(r1)
            return
        L_0x0051:
            android.content.Context r3 = r4.A14()
            android.content.Context r2 = r4.A14()
            r1 = 2130970830(0x7f0408ce, float:1.7550381E38)
            r0 = 2131102245(0x7f060a25, float:1.7816922E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            goto L_0x0045
        L_0x0064:
            java.lang.Object r0 = r5.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r0 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r0
            X.1bI r2 = r0.A07
            if (r2 == 0) goto L_0x001a
            androidx.core.widget.NestedScrollView r0 = r0.A00
            if (r0 == 0) goto L_0x0078
            int r1 = r0.getScrollY()
            r0 = 8
            if (r1 == 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r2.A04(r0)
            return
        L_0x007d:
            java.lang.Object r2 = r5.A01
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r2 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r2
            android.widget.ScrollView r1 = r2.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            android.view.View r1 = r2.A01
            int r0 = X.C72453Mb.A06(r0)
            r1.setVisibility(r0)
            return
        L_0x009a:
            java.lang.Object r0 = r5.A01
            com.whatsapp.registration.ChangeNumberOverview r0 = (com.whatsapp.registration.ChangeNumberOverview) r0
            com.whatsapp.registration.ChangeNumberOverview.A03(r0)
            return
        L_0x00a2:
            java.lang.Object r0 = r5.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r0 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r0
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90684eT.onScrollChanged():void");
    }
}
