package X;

import android.view.View;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.avatar.home.AvatarHomeViewModel;

/* renamed from: X.78J  reason: invalid class name */
public class AnonymousClass78J implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass78J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AvatarHomeViewModel A00(AnonymousClass78J r0) {
        return (AvatarHomeViewModel) ((AvatarHomeActivity) r0.A01).A0Q.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c6, code lost:
        X.AnonymousClass3MX.A1Q(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02dc, code lost:
        r1 = r1.A07;
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x034c, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04ab, code lost:
        r1.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f2, code lost:
        r1.A0a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04f6, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04fb, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04ff, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        com.whatsapp.util.Log.i(r0);
        r0 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        com.whatsapp.backup.google.RestoreFromBackupActivity.A0v(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0188, code lost:
        r3.A4b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a4, code lost:
        r4.CGF(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            r2 = r20
            switch(r0) {
                case 0: goto L_0x0530;
                case 1: goto L_0x0528;
                case 2: goto L_0x0520;
                case 3: goto L_0x0518;
                case 4: goto L_0x0510;
                case 5: goto L_0x0508;
                case 6: goto L_0x0500;
                case 7: goto L_0x04c4;
                case 8: goto L_0x04af;
                case 9: goto L_0x003e;
                case 10: goto L_0x0493;
                case 11: goto L_0x047a;
                case 12: goto L_0x0444;
                case 13: goto L_0x0436;
                case 14: goto L_0x041c;
                case 15: goto L_0x0402;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03c5;
                case 18: goto L_0x032f;
                case 19: goto L_0x02f0;
                case 20: goto L_0x02e4;
                case 21: goto L_0x02d4;
                case 22: goto L_0x04d2;
                case 23: goto L_0x02ca;
                case 24: goto L_0x02b0;
                case 25: goto L_0x02a8;
                case 26: goto L_0x04e8;
                case 27: goto L_0x0293;
                case 28: goto L_0x027c;
                case 29: goto L_0x0269;
                case 30: goto L_0x0261;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x0255;
                case 34: goto L_0x0249;
                case 35: goto L_0x01f9;
                case 36: goto L_0x01e4;
                case 37: goto L_0x01c8;
                case 38: goto L_0x01c0;
                case 39: goto L_0x01b4;
                case 40: goto L_0x01ae;
                case 41: goto L_0x00e5;
                case 42: goto L_0x0159;
                case 43: goto L_0x00d6;
                case 44: goto L_0x00c6;
                case 45: goto L_0x00a8;
                case 46: goto L_0x009c;
                case 47: goto L_0x0094;
                case 48: goto L_0x008d;
                case 49: goto L_0x0068;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment r2 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment) r2
            android.widget.Button r0 = r2.A01
            X.C72453Mb.A1D(r0)
            android.widget.Button r1 = r2.A00
            if (r1 == 0) goto L_0x0021
            r0 = 2131889824(0x7f120ea0, float:1.9414322E38)
            r1.setText(r0)
            r0 = 33
            X.AnonymousClass3MZ.A1J(r1, r2, r0)
        L_0x0021:
            android.widget.FrameLayout r0 = r2.A02
            X.C72453Mb.A1C(r0)
            android.widget.TextView r1 = r2.A03
            if (r1 == 0) goto L_0x0030
            r0 = 2131889827(0x7f120ea3, float:1.9414329E38)
            r1.setText(r0)
        L_0x0030:
            android.widget.RelativeLayout r1 = r2.A00
            if (r1 == 0) goto L_0x003d
            r0 = 2131231379(0x7f080293, float:1.8078837E38)
            r1.setBackgroundResource(r0)
            r1.setOnCreateContextMenuListener(r2)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r3 = r1.A01
            com.whatsapp.avatar.home.AvatarHomeActivity r3 = (com.whatsapp.avatar.home.AvatarHomeActivity) r3
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r2 = r3.A0G
            if (r2 == 0) goto L_0x003d
            int r1 = r2.A0J
            r0 = 5
            if (r1 != r0) goto L_0x0538
            r0 = 4
            r2.A0W(r0)
            android.view.Window r1 = r3.getWindow()
            r0 = 0
            X.C28281Zt.A0A(r1, r0)
            int r0 = X.AnonymousClass4Z9.A01(r3, r0)
            X.C28281Zt.A05(r3, r0)
            X.01n r0 = r3.getSupportActionBar()
            if (r0 == 0) goto L_0x003d
            r0.A0I()
            return
        L_0x0068:
            java.lang.Object r2 = r1.A01
            com.whatsapp.backup.google.RestoreTransferSelectorActivity r2 = (com.whatsapp.backup.google.RestoreTransferSelectorActivity) r2
            X.3TP r0 = r2.A00
            if (r0 == 0) goto L_0x04f6
            int r0 = r0.A00
            r1 = 1
            if (r0 == 0) goto L_0x0084
            if (r0 != r1) goto L_0x0080
            java.lang.String r0 = "restore>RestoreTransferSelectorActivity/User selected the transfer option"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            r2.setResult(r0)
        L_0x0080:
            r2.finish()
            return
        L_0x0084:
            java.lang.String r0 = "restore>RestoreTransferSelectorActivity/User selected the restore option"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.setResult(r1)
            goto L_0x0080
        L_0x008d:
            java.lang.Object r1 = r1.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/user clicked skip restore, showing confirm skip dialog"
            goto L_0x00a2
        L_0x0094:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r0 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r0
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0t(r0)
            return
        L_0x009c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/show-skip-gdrive-restore-dialog/user clicked skip restore, showing confirm skip dialog"
        L_0x00a2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 11
            goto L_0x00e1
        L_0x00a8:
            java.lang.Object r2 = r1.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            X.1vD r1 = r2.A07
            X.00H r0 = r2.A0f
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r0 = r1.A03()
            X.C18070vi.A0X(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r2.startActivity(r0)
            return
        L_0x00c6:
            java.lang.Object r2 = r1.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            X.9ug r1 = r2.A0C
            r0 = 10
            r1.A05(r0)
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A14(r2, r0)
            return
        L_0x00d6:
            java.lang.Object r1 = r1.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup/user clicked skip restore, showing confirm skip dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 10
        L_0x00e1:
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0v(r1, r0)
            return
        L_0x00e5:
            java.lang.Object r3 = r1.A01
            X.8gR r3 = (X.C167498gR) r3
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r3.A09
            if (r2 == r0) goto L_0x0188
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r3.A0C
            if (r2 != r0) goto L_0x010c
            java.lang.String r0 = "settings-gdrive/toggle-network-pref"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r3.A0E
            r0.toggle()
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r3.A0E
            boolean r1 = r0.isChecked()
            X.10I r4 = r3.A05
            r0 = 22
            X.7RP r2 = new X.7RP
            r2.<init>(r3, r1, r0)
            goto L_0x02a4
        L_0x010c:
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r3.A0B
            if (r2 != r0) goto L_0x0152
            X.00H r0 = r3.A0H
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            boolean r0 = X.C20134A8u.A06(r0)
            if (r0 == 0) goto L_0x0125
            r0 = 2131895886(0x7f12264e, float:1.9426618E38)
            r3.BhQ(r0)
            return
        L_0x0125:
            X.00H r0 = r3.A0H
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            boolean r0 = X.C20134A8u.A07(r0)
            if (r0 == 0) goto L_0x014c
            r0 = 2131895887(0x7f12264f, float:1.942662E38)
            r3.BhQ(r0)
        L_0x0139:
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r2 = r3.A05
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r3.A0D
            boolean r1 = r0.isChecked()
            X.1DT r0 = r2.A01
            X.AnonymousClass3MY.A1L(r0, r1)
            X.1NP r0 = r2.A02
            r0.A0O(r1)
            return
        L_0x014c:
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r3.A0D
            r0.toggle()
            goto L_0x0139
        L_0x0152:
            java.lang.String r0 = "Can't handle the click event for the pref view"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0159:
            java.lang.Object r3 = r1.A01
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r3 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r3
            X.0z4 r0 = r3.A0A
            java.lang.String r2 = r0.A0f()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive-new-user-setup/done-clicked account is "
            r1.append(r0)
            java.lang.String r0 = X.C41361wE.A08(r2)
            r1.append(r0)
            java.lang.String r0 = " and backup frequency is "
            r1.append(r0)
            int r0 = r3.A00
            X.C17900vP.A0o(r1, r0)
            int r0 = r3.A00
            if (r0 == 0) goto L_0x018c
            if (r2 != 0) goto L_0x018c
            java.lang.String r0 = "gdrive-new-user-setup/done-clicked/show-account-selector"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0188:
            r3.A4b()
            return
        L_0x018c:
            java.lang.String r0 = "gdrive-new-user-setup/done-clicked/setup-finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A0H
            java.lang.Object r1 = r0.get()
            X.1NP r1 = (X.AnonymousClass1NP) r1
            int r0 = r3.A00
            r1.A0G(r0)
            X.10I r2 = r3.A05
            r1 = 31
            X.AkO r0 = new X.AkO
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            X.C72453Mb.A14(r3)
            return
        L_0x01ae:
            java.lang.Object r0 = r1.A01
            X.C108965cb.A1N(r0)
            return
        L_0x01b4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A26()
            r0 = 203(0xcb, float:2.84E-43)
            goto L_0x04f2
        L_0x01c0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            r0.A27()
            return
        L_0x01c8:
            java.lang.Object r4 = r1.A01
            com.whatsapp.backup.encryptedbackup.MoreOptionsBottomSheet r4 = (com.whatsapp.backup.encryptedbackup.MoreOptionsBottomSheet) r4
            X.0vl r0 = r4.A00
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            X.10I r2 = r3.A0K
            r1 = 13
            X.AkO r0 = new X.AkO
            r0.<init>((com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r3, (int) r1)
            r2.CGF(r0)
            r4.A28()
            return
        L_0x01e4:
            java.lang.Object r2 = r1.A01
            com.whatsapp.backup.encryptedbackup.MoreOptionsBottomSheet r2 = (com.whatsapp.backup.encryptedbackup.MoreOptionsBottomSheet) r2
            X.0vl r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r1
            r0 = 300(0x12c, float:4.2E-43)
            r1.A0a(r0)
            r2.A28()
            return
        L_0x01f9:
            java.lang.Object r6 = r1.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            X.1FL r2 = r6.A1D()
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131625044(0x7f0e0454, float:1.8877285E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r0, r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.C18070vi.A0z(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131889771(0x7f120e6b, float:1.9414215E38)
            r1.setText(r0)
            X.3Rj r4 = X.AnonymousClass4a6.A00(r2)
            r4.A0R(r1)
            r0 = 2131889770(0x7f120e6a, float:1.9414213E38)
            r4.A0D(r0)
            r3 = 2131889772(0x7f120e6c, float:1.9414217E38)
            X.1FL r2 = r6.A1D()
            r1 = 3
            X.7AN r0 = new X.7AN
            r0.<init>(r6, r1)
            r4.A0g(r2, r0, r3)
            r1 = 2131889769(0x7f120e69, float:1.941421E38)
            X.1FL r0 = r6.A1D()
            r4.A0e(r0, r5, r1)
            X.05w r0 = X.AnonymousClass3MY.A0L(r4)
            r0.show()
            return
        L_0x0249:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment r0 = (com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A00
            if (r1 == 0) goto L_0x04f6
            r0 = 202(0xca, float:2.83E-43)
            goto L_0x04f2
        L_0x0255:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment r0 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A01
            if (r1 == 0) goto L_0x04f6
            r0 = 401(0x191, float:5.62E-43)
            goto L_0x04f2
        L_0x0261:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity r0 = (com.whatsapp.backup.encryptedbackup.EncBackupMainActivity) r0
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A03(r0)
            return
        L_0x0269:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.whatsapp.backup.encryptedbackup.MoreOptionsBottomSheet r2 = new com.whatsapp.backup.encryptedbackup.MoreOptionsBottomSheet
            r2.<init>()
            X.1GP r1 = r0.A1F()
            java.lang.String r0 = "EncBackupMoreOptionsBottomSheet"
            r2.A2C(r1, r0)
            return
        L_0x027c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.EnableInfoFragment r0 = (com.whatsapp.backup.encryptedbackup.EnableInfoFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r2 = r0.A00
            if (r2 == 0) goto L_0x04f6
            X.1FL r1 = r0.A1D()
            X.1pm r4 = X.AnonymousClass3MZ.A0H(r0)
            r0 = 0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel$setEncryptWithExistingPasskey$1 r3 = new com.whatsapp.backup.encryptedbackup.EncBackupViewModel$setEncryptWithExistingPasskey$1
            r3.<init>(r1, r2, r0)
            goto L_0x02c6
        L_0x0293:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.EnableEducationFragment r0 = (com.whatsapp.backup.encryptedbackup.EnableEducationFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A00
            if (r1 == 0) goto L_0x04f6
            X.10I r4 = r1.A0K
            r0 = 13
            X.AkO r2 = new X.AkO
            r2.<init>((com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r1, (int) r0)
        L_0x02a4:
            r4.CGF(r2)
            return
        L_0x02a8:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x02b0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.CreatePasskeyBottomSheet r0 = (com.whatsapp.backup.encryptedbackup.CreatePasskeyBottomSheet) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r2 = r0.A00
            if (r2 == 0) goto L_0x04f6
            X.1FL r1 = r0.A1D()
            X.1pm r4 = X.AnonymousClass3MZ.A0H(r0)
            r0 = 0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel$setEncryptWithNewPasskey$1 r3 = new com.whatsapp.backup.encryptedbackup.EncBackupViewModel$setEncryptWithNewPasskey$1
            r3.<init>(r1, r2, r0)
        L_0x02c6:
            X.AnonymousClass3MX.A1Q(r3, r4)
            return
        L_0x02ca:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment r0 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A01
            if (r1 == 0) goto L_0x04f6
            r0 = 0
            goto L_0x02dc
        L_0x02d4:
            java.lang.Object r1 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
        L_0x02dc:
            X.1DT r1 = r1.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x04ab
        L_0x02e4:
            java.lang.Object r1 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A0U()
            return
        L_0x02f0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity r0 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity) r0
            X.0vl r0 = r0.A0D
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r3 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel) r3
            X.0vl r0 = r3.A0E
            java.lang.Object r0 = X.C108975cc.A0a(r0)
            X.6zx r0 = (X.C140106zx) r0
            if (r0 != 0) goto L_0x0309
            java.lang.String r0 = "AvatarCoinFlipProfilePhotoViewModel/onAvatarPoseClicked(null view state)"
            goto L_0x034c
        L_0x0309:
            android.graphics.Bitmap r2 = r0.A01
            if (r2 != 0) goto L_0x0310
            java.lang.String r0 = "AvatarCoinFlipProfilePhotoViewModel/onAvatarPoseClicked(null value)"
            goto L_0x034c
        L_0x0310:
            X.00H r0 = r3.A0D
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository r0 = (com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository) r0
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.1Lp r0 = (X.C24771Lp) r0
            X.1ga r1 = r0.A00()
            java.lang.String r0 = "avatar_pose_preview"
            r1.A0F(r0, r2)
            X.1wy r1 = r3.A04
            X.6Qo r0 = X.C122486Qo.COIN_FLIP_PREVIEW
            goto L_0x04ab
        L_0x032f:
            java.lang.Object r0 = r1.A01
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity r0 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity) r0
            X.0vl r0 = r0.A0D
            java.lang.Object r13 = r0.getValue()
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r13 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel) r13
            java.lang.String r0 = "AvatarCoinFlipProfilePhotoViewModel/onSavePhotoClicked()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vl r0 = r13.A0E
            java.lang.Object r2 = X.C108975cc.A0a(r0)
            X.6zx r2 = (X.C140106zx) r2
            if (r2 != 0) goto L_0x0350
            java.lang.String r0 = "AvatarCoinFlipProfilePhotoViewModel/onSavePhotoClicked(null view state)"
        L_0x034c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0350:
            X.6tU r15 = r2.A03
            X.6sE r14 = r2.A02
            if (r15 == 0) goto L_0x0375
            if (r14 == 0) goto L_0x0375
            java.util.List r0 = r2.A06
            java.util.Iterator r1 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0362:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0378
            java.lang.Object r0 = r1.next()
            X.5u5 r0 = (X.C115485u5) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x037a
            int r18 = r18 + 1
            goto L_0x0362
        L_0x0375:
            java.lang.String r0 = "AvatarCoinFlipProfilePhotoViewModel/onSavePhotoClicked(null value)"
            goto L_0x034c
        L_0x0378:
            r18 = -1
        L_0x037a:
            java.util.List r0 = r2.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0380:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = r1.next()
            X.5u5 r0 = (X.C115485u5) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0395
            int r17 = r17 + 1
            goto L_0x0380
        L_0x0393:
            r17 = -1
        L_0x0395:
            X.1DT r1 = r13.A00
            X.6zx r0 = com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel.A03(r13)
            r16 = 0
            r10 = 1
            java.util.List r8 = r0.A06
            java.util.List r9 = r0.A05
            X.6sE r5 = r0.A02
            X.6tU r6 = r0.A03
            android.graphics.Bitmap r3 = r0.A01
            X.6rK r7 = r0.A04
            boolean r11 = r0.A08
            boolean r12 = r0.A07
            android.graphics.Bitmap r4 = r0.A00
            X.6zx r2 = new X.6zx
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A0F(r2)
            X.1OX r0 = X.C41561wd.A00(r13)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1 r12 = new com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$onSavePhotoClicked$1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.AnonymousClass3MX.A1Q(r12, r0)
            return
        L_0x03c5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity) r0
            X.0vl r0 = r0.A0F
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r3 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r3
            X.00H r0 = r3.A07
            X.6ue r2 = X.C108975cc.A0L(r0)
            r1 = 0
            r0 = 5
            r2.A03(r1, r0)
            X.1wy r1 = r3.A04
            X.6Qe r0 = X.C122416Qe.AVATAR_EDITOR
            goto L_0x04ab
        L_0x03e2:
            java.lang.Object r2 = r1.A01
            X.3gA r2 = (X.AnonymousClass3gA) r2
            X.1LU r0 = r2.A06
            if (r0 == 0) goto L_0x03fe
            X.129 r1 = r2.A07
            if (r1 == 0) goto L_0x03fa
            java.lang.String r0 = "515115256843064"
            android.content.Intent r1 = X.C72473Md.A0C(r1, r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x03fa:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x04fb
        L_0x03fe:
            java.lang.String r0 = "waIntents"
            goto L_0x04fb
        L_0x0402:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r1)
            java.lang.String r0 = "onDeleteAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A03
            X.6ue r2 = X.C108975cc.A0L(r0)
            r1 = 0
            r0 = 6
            r2.A03(r1, r0)
            X.1wy r1 = r3.A01
            X.5tv r0 = X.C115385tv.A00
            goto L_0x04ab
        L_0x041c:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r1)
            java.lang.String r0 = "AvatarHomeViewModel/onCreateProfilePhotoClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A03
            X.6ue r2 = X.C108975cc.A0L(r0)
            r1 = 0
            r0 = 18
            r2.A03(r1, r0)
            X.1wy r1 = r3.A01
            X.5tt r0 = X.C115365tt.A00
            goto L_0x04ab
        L_0x0436:
            com.whatsapp.avatar.home.AvatarHomeViewModel r1 = A00(r1)
            java.lang.String r0 = "AvatarHomeViewModel/onBrowserStickersClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wy r1 = r1.A01
            X.5tu r0 = X.C115375tu.A00
            goto L_0x04ab
        L_0x0444:
            com.whatsapp.avatar.home.AvatarHomeViewModel r4 = A00(r1)
            java.lang.String r0 = "AvatarHomeViewModel/onAvatarPreviewTryAgainClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DT r3 = r4.A00
            X.5tr r2 = X.C115345tr.A00
            r1 = 0
            X.5ty r0 = new X.5ty
            r0.<init>(r2, r1, r1, r1)
            r3.A0F(r0)
            X.00H r0 = r4.A04
            java.lang.Object r5 = r0.get()
            X.6xE r5 = (X.C138526xE) r5
            X.7xX r6 = new X.7xX
            r6.<init>(r4)
            X.7xY r7 = new X.7xY
            r7.<init>(r4)
            r9 = 1
            X.10I r0 = r5.A01
            r8 = 38
            X.7RT r4 = new X.7RT
            r4.<init>(r5, r6, r7, r8, r9)
            r0.CGN(r4)
            return
        L_0x047a:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r1)
            java.lang.String r0 = "AvatarHomeViewModel/onFabEditAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A03
            X.6ue r2 = X.C108975cc.A0L(r0)
            r1 = 0
            r0 = 5
            r2.A03(r1, r0)
            X.1wy r1 = r3.A01
            X.5ts r0 = X.C115355ts.A00
            goto L_0x04ab
        L_0x0493:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r1)
            java.lang.String r0 = "AvatarHomeViewModel/onNewUserCreateAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A03
            X.6ue r2 = X.C108975cc.A0L(r0)
            r1 = 0
            r0 = 2
            r2.A03(r1, r0)
            X.1wy r1 = r3.A01
            X.5ts r0 = X.C115355ts.A00
        L_0x04ab:
            r1.A0F(r0)
            return
        L_0x04af:
            java.lang.Object r3 = r1.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfileInfoActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x04c4:
            java.lang.Object r2 = r1.A01
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = (com.whatsapp.avatar.home.AvatarHomeActivity) r2
            X.1nl r1 = r2.A09
            if (r1 == 0) goto L_0x04f9
            java.lang.String r0 = "https://faq.whatsapp.com/general/account-and-profile/how-to-use-avatars-on-whatsapp/"
            X.C72453Mb.A18(r2, r1, r0)
            return
        L_0x04d2:
            java.lang.Object r2 = r1.A01
            com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment r2 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment) r2
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A01
            if (r0 == 0) goto L_0x04f6
            X.9Hs r1 = X.C179379Hs.ENCRYPTION_KEY
            X.1DT r0 = r0.A02
            r0.A0F(r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A01
            if (r1 == 0) goto L_0x04f6
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x04f2
        L_0x04e8:
            java.lang.Object r0 = r1.A01
            com.whatsapp.backup.encryptedbackup.EnableEducationFragment r0 = (com.whatsapp.backup.encryptedbackup.EnableEducationFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A00
            if (r1 == 0) goto L_0x04f6
            r0 = 300(0x12c, float:4.2E-43)
        L_0x04f2:
            r1.A0a(r0)
            return
        L_0x04f6:
            java.lang.String r0 = "viewModel"
            goto L_0x04fb
        L_0x04f9:
            java.lang.String r0 = "linkLauncher"
        L_0x04fb:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0500:
            java.lang.Object r0 = r1.A01
            X.3i0 r0 = (X.C75663i0) r0
            r0.onBackPressed()
            return
        L_0x0508:
            java.lang.Object r0 = r1.A01
            com.whatsapp.authentication.FingerprintBottomSheet r0 = (com.whatsapp.authentication.FingerprintBottomSheet) r0
            r0.A29()
            return
        L_0x0510:
            java.lang.Object r0 = r1.A01
            com.whatsapp.authentication.FingerprintBottomSheet r0 = (com.whatsapp.authentication.FingerprintBottomSheet) r0
            com.whatsapp.authentication.FingerprintBottomSheet.A03(r0)
            return
        L_0x0518:
            java.lang.Object r0 = r1.A01
            com.whatsapp.authentication.AppAuthenticationActivity r0 = (com.whatsapp.authentication.AppAuthenticationActivity) r0
            com.whatsapp.authentication.AppAuthenticationActivity.A0V(r0)
            return
        L_0x0520:
            java.lang.Object r0 = r1.A01
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0q(r0)
            return
        L_0x0528:
            java.lang.Object r0 = r1.A01
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0r(r0)
            return
        L_0x0530:
            java.lang.Object r0 = r1.A01
            X.73R r0 = (X.AnonymousClass73R) r0
            X.AnonymousClass73R.A02(r2, r0)
            return
        L_0x0538:
            r2.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0Q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78J.onClick(android.view.View):void");
    }
}
