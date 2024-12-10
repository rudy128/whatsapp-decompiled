package com.whatsapp.account.remove;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass17K;
import X.AnonymousClass1E8;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1PY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass739;
import X.C000200d;
import X.C1411874q;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C20151A9n;
import X.C29481cM;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C90994ey;
import X.C99204sR;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class RemoveAccountActivity extends AnonymousClass1FY {
    public C29481cM A00;
    public AnonymousClass1PY A01;
    public AnonymousClass1LU A02;
    public WDSButton A03;
    public WDSButton A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public WaTextView A09;
    public WaTextView A0A;
    public LinkedDevicesViewModel A0B;
    public boolean A0C;

    public RemoveAccountActivity() {
        this(0);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r3;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        if (i != 0) {
            if (i == 1) {
                AnonymousClass1E8 A0P = AnonymousClass3MY.A0P(this);
                if (A0P != null) {
                    AnonymousClass17K.A02(A0P);
                    r3 = AnonymousClass4a6.A00(this);
                    r3.A0E(2131895099);
                    AnonymousClass1E8 A0P2 = AnonymousClass3MY.A0P(this);
                    if (A0P2 != null) {
                        r3.A0S(AnonymousClass17K.A02(A0P2));
                        r3.A0X(new AnonymousClass4aq(this, 9), 2131898766);
                        i2 = 2131896933;
                        onClickListener = new C20151A9n(this, 15);
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else if (i != 2) {
                Dialog onCreateDialog = super.onCreateDialog(i);
                C18070vi.A0X(onCreateDialog);
                return onCreateDialog;
            } else {
                AnonymousClass00H r0 = this.A06;
                if (r0 != null) {
                    ((AnonymousClass739) r0.get()).A04((Boolean) null, 14, 11);
                    r3 = AnonymousClass4a6.A00(this);
                    r3.A0E(2131898673);
                    r3.A0D(2131895096);
                    r3.A0T(true);
                    i2 = 2131898671;
                    onClickListener = new C1411874q(6);
                } else {
                    C18070vi.A11("accountSwitchingLogger");
                    throw null;
                }
            }
            r3.A0Z(onClickListener, i2);
            return AnonymousClass3MY.A0L(r3);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(2131895109));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r9 = this;
            X.0z4 r0 = r9.A0A
            java.lang.String r6 = r0.A0f()
            X.0z4 r0 = r9.A0A
            long r3 = r0.A0U(r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
            r0 = 2131892444(0x7f1218dc, float:1.9419636E38)
        L_0x0015:
            java.lang.String r5 = r9.getString(r0)
        L_0x0019:
            X.C18070vi.A0b(r5)
            if (r6 == 0) goto L_0x006b
            X.0z4 r0 = r9.A0A
            long r3 = r0.A0V(r6)
        L_0x0024:
            com.whatsapp.WaTextView r2 = r9.A0A
            if (r2 != 0) goto L_0x002f
            java.lang.String r0 = "googleBackupTimeView"
            X.C18070vi.A11(r0)
        L_0x002d:
            r0 = 0
            throw r0
        L_0x002f:
            r1 = 2131891594(0x7f12158a, float:1.9417912E38)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r7 = 0
            r0[r7] = r5
            X.AnonymousClass3MY.A0y(r9, r2, r0, r1)
            r5 = 0
            java.lang.String r2 = "googleBackupSizeView"
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            com.whatsapp.WaTextView r1 = r9.A09
            if (r0 <= 0) goto L_0x005f
            if (r1 == 0) goto L_0x0067
            r1.setVisibility(r7)
            com.whatsapp.WaTextView r5 = r9.A09
            if (r5 == 0) goto L_0x0067
            r2 = 2131890791(0x7f121267, float:1.9416284E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.0vb r0 = r9.A00
            java.lang.String r0 = X.C88584aA.A03(r0, r3)
            r1[r7] = r0
            X.AnonymousClass3MY.A0y(r9, r5, r1, r2)
            return
        L_0x005f:
            if (r1 == 0) goto L_0x0067
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0067:
            X.C18070vi.A11(r2)
            goto L_0x002d
        L_0x006b:
            r3 = -1
            goto L_0x0024
        L_0x006e:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            goto L_0x0015
        L_0x0078:
            X.0vb r5 = r9.A00
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Integer r0 = X.C17880vN.A0h()
            int r0 = X.A87.A00(r0, r1, r3)
            if (r0 != 0) goto L_0x008d
            java.lang.String r5 = X.A8I.A00(r5, r3)
            goto L_0x0019
        L_0x008d:
            java.lang.String r5 = X.C64052u8.A08(r5, r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.remove.RemoveAccountActivity.A03():void");
    }

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A05 = C000200d.A00(A0L.A08);
            this.A00 = A0L.A1F();
            this.A06 = C000200d.A00(A0L.A0B);
            this.A07 = AnonymousClass3MZ.A14(A0L);
            this.A01 = AnonymousClass3Ma.A0l(A0L);
            this.A08 = C000200d.A00(A0L.AfP);
            this.A02 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131626713);
        setTitle(2131895999);
        C72473Md.A18(this);
        this.A0B = (LinkedDevicesViewModel) AnonymousClass3MW.A0N(this).A00(LinkedDevicesViewModel.class);
        this.A03 = AnonymousClass3MW.A0q(this.A00, 2131434477);
        this.A04 = AnonymousClass3MW.A0q(this.A00, 2131434483);
        this.A0A = AnonymousClass3MW.A0T(this.A00, 2131431084);
        this.A09 = AnonymousClass3MW.A0T(this.A00, 2131431082);
        TextView A0E = AnonymousClass3Ma.A0E(this.A00, 2131434496);
        TextView A0E2 = AnonymousClass3Ma.A0E(this.A00, 2131434494);
        TextView A0E3 = AnonymousClass3Ma.A0E(this.A00, 2131434495);
        View A052 = C18070vi.A05(this.A00, 2131434497);
        TextView A0E4 = AnonymousClass3Ma.A0E(this.A00, 2131434481);
        C72483Me.A0d(this, A0E3, C18070vi.A0F(this, 2131895104));
        C72483Me.A0d(this, A0E, C18070vi.A0F(this, 2131895106));
        C72483Me.A0d(this, A0E2, C18070vi.A0F(this, 2131895107));
        LinkedDevicesViewModel linkedDevicesViewModel = this.A0B;
        if (linkedDevicesViewModel != null) {
            linkedDevicesViewModel.A0U();
            LinkedDevicesViewModel linkedDevicesViewModel2 = this.A0B;
            if (linkedDevicesViewModel2 != null) {
                AnonymousClass3MY.A1K(this, linkedDevicesViewModel2.A07, new C99204sR(this, A052, 0), 0);
                C18000vb r1 = this.A00;
                AnonymousClass1E8 A0P = AnonymousClass3MY.A0P(this);
                if (A0P != null) {
                    A0E4.setText(r1.A0G(AnonymousClass17K.A02(A0P)));
                    WDSButton wDSButton = this.A03;
                    if (wDSButton == null) {
                        str = "backupChatsButton";
                    } else {
                        AnonymousClass3MZ.A1N(wDSButton, this, 41);
                        WDSButton wDSButton2 = this.A04;
                        if (wDSButton2 == null) {
                            str = "removeAccountButton";
                        } else {
                            AnonymousClass3MZ.A1N(wDSButton2, this, 42);
                            A03();
                            return;
                        }
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                throw C17880vN.A0g();
            }
        }
        C18070vi.A11("linkedDevicesViewModel");
        throw null;
    }

    public void onResume() {
        super.onResume();
        A03();
    }

    public RemoveAccountActivity(int i) {
        this.A0C = false;
        C90994ey.A00(this, 5);
    }
}
