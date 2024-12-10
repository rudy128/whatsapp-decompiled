package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import com.whatsapp.calling.dialer.DialerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.4cl  reason: invalid class name and case insensitive filesystem */
public class C89624cl implements ActionMode.Callback {
    public final int A00;
    public final Object A01;

    public C89624cl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[LOOP:1: B:28:0x005f->B:31:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActionItemClicked(android.view.ActionMode r12, android.view.MenuItem r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0138;
                case 2: goto L_0x00aa;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r13 == 0) goto L_0x0138
            java.lang.Object r4 = r11.A01
            android.widget.EditText r4 = (android.widget.EditText) r4
            int r2 = r4.getSelectionStart()
            int r1 = r4.getSelectionEnd()
            if (r2 <= r1) goto L_0x0018
            r0 = r1
            r1 = r2
            r2 = r0
        L_0x0018:
            int r3 = r13.getItemId()
            r0 = 2131428275(0x7f0b03b3, float:1.847819E38)
            if (r3 != r0) goto L_0x0091
            java.lang.String r5 = "*"
        L_0x0023:
            android.text.Editable r4 = r4.getText()
            if (r4 != 0) goto L_0x002b
        L_0x0029:
            r6 = 1
        L_0x002a:
            return r6
        L_0x002b:
            if (r1 <= r2) goto L_0x003b
            int r3 = r1 + -1
            char r0 = r4.charAt(r3)
            boolean r0 = java.lang.Character.isSpaceChar(r0)
            if (r0 == 0) goto L_0x003b
            r1 = r3
            goto L_0x002b
        L_0x003b:
            int r0 = r4.length()
            java.lang.String r3 = " "
            if (r1 >= r0) goto L_0x005c
            char r6 = r4.charAt(r1)
            boolean r0 = java.lang.Character.isSpaceChar(r6)
            if (r0 != 0) goto L_0x005c
            r0 = 42
            if (r6 == r0) goto L_0x005c
            r0 = 95
            if (r6 == r0) goto L_0x005c
            r0 = 126(0x7e, float:1.77E-43)
            if (r6 == r0) goto L_0x005c
            r4.insert(r1, r3)
        L_0x005c:
            r4.insert(r1, r5)
        L_0x005f:
            if (r2 >= r1) goto L_0x006e
            char r0 = r4.charAt(r2)
            boolean r0 = java.lang.Character.isSpaceChar(r0)
            if (r0 == 0) goto L_0x006e
            int r2 = r2 + 1
            goto L_0x005f
        L_0x006e:
            if (r2 <= 0) goto L_0x008d
            int r0 = r2 + -1
            char r1 = r4.charAt(r0)
            boolean r0 = java.lang.Character.isSpaceChar(r1)
            if (r0 != 0) goto L_0x008d
            r0 = 42
            if (r1 == r0) goto L_0x008d
            r0 = 95
            if (r1 == r0) goto L_0x008d
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x008d
            r4.insert(r2, r3)
            int r2 = r2 + 1
        L_0x008d:
            r4.insert(r2, r5)
            goto L_0x0029
        L_0x0091:
            r0 = 2131431829(0x7f0b1195, float:1.8485398E38)
            if (r3 != r0) goto L_0x0099
            java.lang.String r5 = "_"
            goto L_0x0023
        L_0x0099:
            r0 = 2131435842(0x7f0b2142, float:1.8493538E38)
            if (r3 != r0) goto L_0x00a1
            java.lang.String r5 = "~"
            goto L_0x0023
        L_0x00a1:
            r0 = 2131432776(0x7f0b1548, float:1.848732E38)
            if (r3 != r0) goto L_0x0138
            java.lang.String r5 = "```"
            goto L_0x0023
        L_0x00aa:
            r0 = 1
            int r0 = X.AnonymousClass3MY.A01(r13, r0)
            r6 = 1
            switch(r0) {
                case 16908321: goto L_0x00b5;
                case 16908322: goto L_0x00dd;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x0138
        L_0x00b5:
            java.lang.Object r5 = r11.A01
            com.whatsapp.calling.dialer.DialerActivity r5 = (com.whatsapp.calling.dialer.DialerActivity) r5
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            X.11C r0 = r5.A08
            android.content.ClipboardManager r2 = r0.A09()
            if (r2 == 0) goto L_0x0121
            com.whatsapp.calling.dialer.DialerViewModel r0 = X.AnonymousClass3MZ.A0X(r5)
            X.1G1 r0 = r0.A0J
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0121
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r1, r1)
            r2.setPrimaryClip(r0)
            goto L_0x0121
        L_0x00dd:
            java.lang.Object r5 = r11.A01
            com.whatsapp.calling.dialer.DialerActivity r5 = (com.whatsapp.calling.dialer.DialerActivity) r5
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            X.11C r0 = r5.A08
            android.content.ClipboardManager r0 = r0.A09()
            if (r0 == 0) goto L_0x0121
            android.content.ClipData r1 = r0.getPrimaryClip()
            if (r1 == 0) goto L_0x0121
            int r0 = r1.getItemCount()
            if (r0 == 0) goto L_0x0121
            r0 = 0
            android.content.ClipData$Item r0 = r1.getItemAt(r0)
            if (r0 == 0) goto L_0x0121
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x0121
            java.lang.String r4 = r0.toString()
            if (r4 == 0) goto L_0x0121
            boolean r0 = X.AnonymousClass1YF.A0T(r4)
            if (r0 != 0) goto L_0x0121
            com.whatsapp.calling.dialer.DialerViewModel r3 = X.AnonymousClass3MZ.A0X(r5)
            X.1OX r2 = X.C41561wd.A00(r3)
            r1 = 0
            com.whatsapp.calling.dialer.DialerViewModel$handleContextMenuPaste$1 r0 = new com.whatsapp.calling.dialer.DialerViewModel$handleContextMenuPaste$1
            r0.<init>(r3, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
        L_0x0121:
            android.view.ActionMode r0 = r5.A02
            if (r0 == 0) goto L_0x002a
            r0.finish()
            return r6
        L_0x0129:
            r0 = 1
            int r1 = X.AnonymousClass3MY.A01(r13, r0)
            r0 = 16908322(0x1020022, float:2.3877324E-38)
            if (r1 == r0) goto L_0x013a
            r0 = 16908337(0x1020031, float:2.3877366E-38)
            if (r1 == r0) goto L_0x013a
        L_0x0138:
            r6 = 0
            return r6
        L_0x013a:
            java.lang.Object r5 = r11.A01
            com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment r5 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment) r5
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r2 = r5.A01
            java.lang.String r10 = "viewModel"
            if (r2 == 0) goto L_0x01c3
            X.11C r7 = r2.A0H
            android.content.ClipboardManager r0 = r7.A09()
            if (r0 == 0) goto L_0x01aa
            android.content.ClipData r1 = r0.getPrimaryClip()
            if (r1 == 0) goto L_0x01aa
            X.1DT r6 = r2.A01
            java.lang.Object r9 = r6.A06()
            java.lang.String r9 = (java.lang.String) r9
            r0 = 0
            android.content.ClipData$Item r0 = r1.getItemAt(r0)
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "\\s"
            java.lang.String r4 = ""
            java.lang.String r1 = r0.replaceAll(r8, r4)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toLowerCase(r0)
            r1 = 1089(0x441, float:1.526E-42)
            r0 = 99
            java.lang.String r3 = r2.replace(r1, r0)
            X.C18070vi.A0X(r3)
            if (r9 == 0) goto L_0x01bf
            int r0 = r9.length()
            if (r0 == 0) goto L_0x01bf
            int r0 = r3.length()
            r2 = 64
            if (r0 == r2) goto L_0x01bf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r8)
            java.lang.String r0 = r0.A00(r9, r4)
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r1)
            int r0 = r3.length()
            if (r0 <= r2) goto L_0x01bf
            X.AnonymousClass4a5.A03(r7)
        L_0x01aa:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A01
            if (r0 == 0) goto L_0x01c3
            X.1DT r0 = r0.A01
            java.lang.Object r0 = r0.A06()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = ""
        L_0x01ba:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment.A00(r5, r0)
            goto L_0x0029
        L_0x01bf:
            r6.A0F(r3)
            goto L_0x01aa
        L_0x01c3:
            X.C18070vi.A11(r10)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89624cl.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.A00) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                C18070vi.A0d(menu, 1);
                menu.clear();
                ArrayList arrayList = DialerActivity.A0I;
                if (AnonymousClass000.A1R(((CharSequence) AnonymousClass3MZ.A0X((DialerActivity) this.A01).A0J.getValue()).length())) {
                    menu.add(0, 16908321, 0, 17039361);
                }
                menu.add(0, 16908322, 0, 17039371);
                return true;
            default:
                if (actionMode == null) {
                    return false;
                }
                MenuInflater menuInflater = actionMode.getMenuInflater();
                if (menuInflater != null) {
                    menuInflater.inflate(2131820596, menu);
                    return true;
                }
                Log.w("conversation-text-entry/action-mode-with-null-menu-inflater");
                return true;
        }
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        if (2 - this.A00 == 0) {
            ArrayList arrayList = DialerActivity.A0I;
            ((DialerActivity) this.A01).A02 = null;
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.A00 != 0) {
            return false;
        }
        C18070vi.A0d(menu, 1);
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        menu.removeItem(16908355);
        return false;
    }
}
