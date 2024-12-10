package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.755  reason: invalid class name */
public final /* synthetic */ class AnonymousClass755 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ AnonymousClass1FU A03;
    public final /* synthetic */ BlockConfirmationDialogFragment A04;
    public final /* synthetic */ AnonymousClass1E7 A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        CheckBox checkBox = this.A02;
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A04;
        AnonymousClass1E7 r15 = this.A05;
        AnonymousClass1FU r10 = this.A03;
        int i2 = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A07;
        int i3 = this.A01;
        boolean A1K = C108975cc.A1K(r10);
        if (checkBox == null || checkBox.isChecked() != A1K) {
            AnonymousClass00H r0 = blockConfirmationDialogFragment.A09;
            if (r0 != null) {
                C18100vl r7 = blockConfirmationDialogFragment.A0B;
                String A0y = AnonymousClass3MW.A0y(r7);
                UserJid userJid = (UserJid) blockConfirmationDialogFragment.A0C.getValue();
                boolean A17 = C18070vi.A17(A0y, userJid);
                C61552ps.A00((C61552ps) r0.get(), userJid, A0y, A17 ? 1 : 0);
                C138636xR r2 = blockConfirmationDialogFragment.A02;
                if (r2 != null) {
                    String A0y2 = AnonymousClass3MW.A0y(r7);
                    C18070vi.A0d(A0y2, 4);
                    if (z) {
                        String str2 = A0y2;
                        AnonymousClass1FU r11 = r10;
                        AnonymousClass3MW.A1T(new C826649g(r10, r11, r2.A01, new C143117Cb(r10, r2, r15, str2, i3, 0), r2.A03, r15, (Integer) null, (Integer) null, (String) null, (String) null, str2, false, false, A17, A17), r2.A07, 0);
                        return;
                    }
                    AnonymousClass1FU r72 = r10;
                    C37551pj.A04(r72, new C143117Cb(r10, r2, r15, A0y2, i3, A17 ? 1 : 0), AnonymousClass3MW.A0V(r2.A08), r15, (Integer) null, (Integer) null, (String) null, (String) null, A0y2, A17, z2);
                    return;
                }
                str = "viewInteractionHelper";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            AnonymousClass00H r02 = blockConfirmationDialogFragment.A09;
            if (r02 != null) {
                C18100vl r4 = blockConfirmationDialogFragment.A0B;
                String A0y3 = AnonymousClass3MW.A0y(r4);
                UserJid userJid2 = (UserJid) blockConfirmationDialogFragment.A0C.getValue();
                boolean A15 = C18070vi.A15(A0y3, userJid2);
                C61552ps.A00((C61552ps) r02.get(), userJid2, A0y3, 3);
                C138636xR r5 = blockConfirmationDialogFragment.A02;
                if (r5 != null) {
                    String A0y4 = AnonymousClass3MW.A0y(r4);
                    AnonymousClass86U r22 = blockConfirmationDialogFragment.A01;
                    C18070vi.A0d(A0y4, 2);
                    if (r5.A03.A03(r10)) {
                        r5.A00.A0D((AnonymousClass1FR) null);
                        if (r22 != null) {
                            r22.CFM();
                        }
                        r5.A07.CGF(new C98824rm(r5, r15, r10, A0y4, i2, A15 ? 1 : 0));
                        return;
                    }
                    return;
                }
                str = "viewInteractionHelper";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "blockFunnelLogger";
        C18070vi.A11(str);
        throw null;
    }

    public /* synthetic */ AnonymousClass755(CheckBox checkBox, AnonymousClass1FU r2, BlockConfirmationDialogFragment blockConfirmationDialogFragment, AnonymousClass1E7 r4, int i, int i2, boolean z, boolean z2) {
        this.A02 = checkBox;
        this.A04 = blockConfirmationDialogFragment;
        this.A05 = r4;
        this.A03 = r2;
        this.A00 = i;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i2;
    }
}
