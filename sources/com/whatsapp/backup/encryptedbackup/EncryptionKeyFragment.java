package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.C18000vb;
import X.C18070vi;
import X.C72483Me;
import X.C89544cd;
import X.C89624cl;
import X.C90144db;
import X.C90164dd;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.CodeInputField;

public final class EncryptionKeyFragment extends Hilt_EncryptionKeyFragment {
    public int A00;
    public EncBackupViewModel A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public CodeInputField[] A04;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment r6, java.lang.String r7) {
        /*
            r5 = 0
        L_0x0001:
            int r1 = r5 * 4
            int r0 = r1 + 4
            int r4 = r7.length()
            int r3 = java.lang.Math.min(r0, r4)
            java.lang.String r2 = r7.substring(r1, r3)
            X.C18070vi.A0X(r2)
            com.whatsapp.CodeInputField[] r0 = r6.A04
            java.lang.String r1 = "keyGroups"
            if (r0 == 0) goto L_0x004e
            r0 = r0[r5]
            if (r0 == 0) goto L_0x002a
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r0 = ""
        L_0x002c:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0044
            com.whatsapp.CodeInputField[] r0 = r6.A04
            if (r0 == 0) goto L_0x004e
            r1 = r0[r5]
            if (r1 == 0) goto L_0x0044
            r1.setText(r2)
            int r0 = r2.length()
            r1.setSelection(r0)
        L_0x0044:
            if (r3 == r4) goto L_0x004d
            int r5 = r5 + 1
            r0 = 16
            if (r5 >= r0) goto L_0x004d
            goto L_0x0001
        L_0x004d:
            return
        L_0x004e:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment.A00(com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment, java.lang.String):void");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625221, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        String str;
        CodeInputField codeInputField;
        C18070vi.A0d(view, 0);
        this.A01 = C72483Me.A0R(this);
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(view, 2131430459);
        CodeInputField[] codeInputFieldArr = new CodeInputField[16];
        for (int i2 = 0; i2 < 16; i2++) {
            codeInputFieldArr[i2] = null;
        }
        this.A04 = codeInputFieldArr;
        for (int i3 = 0; i3 < 4; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            C18070vi.A0z(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            ViewGroup viewGroup2 = (ViewGroup) childAt;
            int i4 = 0;
            do {
                int i5 = (i3 * 4) + i4;
                Object[] objArr = this.A04;
                String str2 = "keyGroups";
                if (objArr != null) {
                    View childAt2 = viewGroup2.getChildAt(i4);
                    C18070vi.A0z(childAt2, "null cannot be cast to non-null type com.whatsapp.CodeInputField");
                    objArr[i5] = childAt2;
                    CodeInputField[] codeInputFieldArr2 = this.A04;
                    if (codeInputFieldArr2 != null) {
                        CodeInputField codeInputField2 = codeInputFieldArr2[i5];
                        if (codeInputField2 != null) {
                            codeInputField2.setLetterSpacing(0.15f);
                            EncBackupViewModel encBackupViewModel = this.A01;
                            if (encBackupViewModel == null) {
                                str2 = "viewModel";
                            } else if (encBackupViewModel.A0T() != 1) {
                                codeInputField2.setEnabled(true);
                                codeInputField2.setClickable(true);
                                codeInputField2.setLongClickable(true);
                                codeInputField2.setOnFocusChangeListener(new C90144db(this, i5));
                                codeInputField2.addTextChangedListener(new C89544cd(this, codeInputField2, 0));
                                codeInputField2.setOnKeyListener(new C90164dd(this, 0));
                                if (AnonymousClass112.A01()) {
                                    codeInputField2.setCustomInsertionActionModeCallback(new C89624cl(this, 0));
                                }
                            }
                        }
                        i4++;
                    }
                }
                C18070vi.A11(str2);
                throw null;
            } while (i4 < 4);
        }
        EncBackupViewModel encBackupViewModel2 = this.A01;
        if (encBackupViewModel2 != null) {
            String str3 = (String) encBackupViewModel2.A01.A06();
            if (str3 != null) {
                A00(this, str3);
                i = str3.length() / 4;
            } else {
                i = 0;
            }
            EncBackupViewModel encBackupViewModel3 = this.A01;
            if (encBackupViewModel3 != null) {
                if (encBackupViewModel3.A0T() != 1) {
                    AnonymousClass11C r0 = this.A02;
                    if (r0 != null) {
                        InputMethodManager A0N = r0.A0N();
                        CodeInputField[] codeInputFieldArr3 = this.A04;
                        str = "keyGroups";
                        if (codeInputFieldArr3 != null) {
                            if (i < codeInputFieldArr3.length && (codeInputField = codeInputFieldArr3[i]) != null) {
                                codeInputField.requestFocus();
                                if (A0N != null) {
                                    A0N.showSoftInput(codeInputField, 1);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        str = "systemServices";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                return;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }
}
