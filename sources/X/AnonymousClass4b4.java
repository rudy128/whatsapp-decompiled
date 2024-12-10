package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.community.CommunitySpamReportDialogFragment;

/* renamed from: X.4b4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ CommunitySpamReportDialogFragment A02;
    public final /* synthetic */ AnonymousClass1E7 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r10, int r11) {
        /*
            r9 = this;
            com.whatsapp.community.CommunitySpamReportDialogFragment r3 = r9.A02
            X.1FU r2 = r9.A01
            X.1E7 r4 = r9.A03
            java.lang.String r6 = r9.A04
            android.widget.CheckBox r0 = r9.A00
            boolean r1 = r9.A05
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0015
            r8 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r8 = 0
        L_0x0016:
            X.6uY r0 = r3.A02
            boolean r0 = r0.A03(r2)
            if (r0 == 0) goto L_0x003e
            X.1KB r2 = r3.A00
            r1 = 2131895254(0x7f1223d6, float:1.9425336E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.A07(r1, r0)
            X.1It r1 = X.AnonymousClass3Ma.A0I(r3)
            java.lang.Class<X.8GM> r0 = X.AnonymousClass8GM.class
            X.1J2 r5 = r1.A00(r0)
            X.10I r0 = r3.A03
            r7 = 0
            X.4rS r2 = new X.4rS
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.CGF(r2)
        L_0x003e:
            X.00H r0 = r3.A04
            java.lang.Object r2 = r0.get()
            X.2pt r2 = (X.C61562pt) r2
            X.1BI r1 = r4.A0J
            X.C17960vV.A07(r1)
            r0 = 1
            if (r8 == 0) goto L_0x0056
            X.C18070vi.A0d(r1, r0)
            r0 = 4
        L_0x0052:
            X.C61562pt.A00(r2, r1, r6, r0)
            return
        L_0x0056:
            X.C18070vi.A0d(r1, r0)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4b4.onClick(android.content.DialogInterface, int):void");
    }

    public /* synthetic */ AnonymousClass4b4(CheckBox checkBox, AnonymousClass1FU r2, CommunitySpamReportDialogFragment communitySpamReportDialogFragment, AnonymousClass1E7 r4, String str, boolean z) {
        this.A02 = communitySpamReportDialogFragment;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A00 = checkBox;
        this.A05 = z;
    }
}
