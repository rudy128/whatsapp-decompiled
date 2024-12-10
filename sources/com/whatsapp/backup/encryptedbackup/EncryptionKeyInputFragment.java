package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass1LU;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C104925Qa;
import X.C104935Qb;
import X.C177649Aa;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C21453AkK;
import X.C34001jj;
import X.C38541rS;
import X.C72453Mb;
import X.C72483Me;
import X.C80633xb;
import X.C90944et;
import X.C95694me;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import java.util.NoSuchElementException;

public final class EncryptionKeyInputFragment extends Hilt_EncryptionKeyInputFragment {
    public Button A00;
    public RelativeLayout A01;
    public AnonymousClass1L9 A02;
    public AnonymousClass190 A03;
    public AnonymousClass1KB A04;
    public AnonymousClass1LC A05;
    public EncBackupViewModel A06;
    public EncryptionKeyFragment A07;
    public AnonymousClass11C A08;
    public C18030ve A09;
    public AnonymousClass1LU A0A;
    public AnonymousClass00H A0B;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625224, viewGroup, false);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment, com.whatsapp.backup.encryptedbackup.Hilt_EncryptionKeyFragment] */
    public void A21(Bundle bundle, View view) {
        int i;
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        EncBackupViewModel A0R = C72483Me.A0R(this);
        this.A06 = A0R;
        if (A0R == null) {
            str = "viewModel";
        } else {
            int A0T = A0R.A0T();
            TextView A0E = AnonymousClass3Ma.A0E(view2, 2131430423);
            TextEmojiLabel A0c = C72453Mb.A0c(view2, 2131430422);
            if (A0T != 2) {
                if (A0T == 4 || A0T == 6) {
                    C95694me r15 = new C95694me(this, 0);
                    C18030ve r0 = this.A09;
                    if (r0 != null) {
                        AnonymousClass1KB r13 = this.A04;
                        if (r13 != null) {
                            AnonymousClass190 r12 = this.A03;
                            if (r12 != null) {
                                AnonymousClass11C r14 = this.A08;
                                if (r14 != null) {
                                    C80633xb r10 = new C80633xb(A1D(), r12, r13, r14, r15, r0, 2131889763, 2131889762);
                                    AnonymousClass00H r02 = this.A0B;
                                    if (r02 != null) {
                                        r02.get();
                                        Context applicationContext = A1D().getApplicationContext();
                                        C18070vi.A0X(applicationContext);
                                        SpannableStringBuilder A012 = C38541rS.A01(applicationContext, new C21453AkK(this, r10, 12), AnonymousClass3Ma.A13(A0c));
                                        AnonymousClass3Ma.A1L(A0c.getAbProps(), A0c);
                                        A0c.setText(A012);
                                    } else {
                                        str = "linkifierUtils";
                                    }
                                } else {
                                    str = "systemServices";
                                }
                            } else {
                                str = "crashLogs";
                            }
                        } else {
                            str = "globalUI";
                        }
                    } else {
                        str = "abProps";
                    }
                }
                i = 2131755117;
                if (A0T != 4) {
                    i = 2131755116;
                }
            } else {
                AnonymousClass3Ma.A1C(A0c, this, 12);
                i = 2131755113;
            }
            Resources A092 = AnonymousClass3MZ.A09(this);
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, 64, 0);
            String quantityString = A092.getQuantityString(i, 64, A1a);
            C18070vi.A0X(quantityString);
            A0E.setText(quantityString);
            this.A07 = new Hilt_EncryptionKeyFragment();
            C34001jj A0Y = C72453Mb.A0Y(this);
            EncryptionKeyFragment encryptionKeyFragment = this.A07;
            if (encryptionKeyFragment == null) {
                str = "encryptionKeyFragment";
            } else {
                A0Y.A09(encryptionKeyFragment, 2131430457);
                A0Y.A01();
                this.A00 = (Button) AnonymousClass1HF.A06(view2, 2131430458);
                this.A01 = (RelativeLayout) AnonymousClass1HF.A06(view2, 2131430446);
                A00(this, false);
                EncBackupViewModel encBackupViewModel = this.A06;
                if (encBackupViewModel != null) {
                    AnonymousClass3MY.A1K(A1G(), encBackupViewModel.A01, new C104925Qa(this), 5);
                    EncBackupViewModel encBackupViewModel2 = this.A06;
                    if (encBackupViewModel2 != null) {
                        AnonymousClass3MY.A1K(A1G(), encBackupViewModel2.A04, new C104935Qb(this), 5);
                        return;
                    }
                }
                C18070vi.A11("viewModel");
                throw null;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(EncryptionKeyInputFragment encryptionKeyInputFragment, boolean z) {
        Context A1n;
        C177649Aa r0;
        Button button = encryptionKeyInputFragment.A00;
        if (button != null) {
            button.setEnabled(z);
        }
        Button button2 = encryptionKeyInputFragment.A00;
        if (button2 != null) {
            if (z) {
                r0 = new C177649Aa(encryptionKeyInputFragment, 11);
            } else {
                r0 = null;
            }
            button2.setOnClickListener(r0);
        }
        RelativeLayout relativeLayout = encryptionKeyInputFragment.A01;
        if (relativeLayout != null) {
            int i = 2131231380;
            if (z) {
                i = 2131231379;
            }
            relativeLayout.setBackgroundResource(i);
        }
        EncryptionKeyFragment encryptionKeyFragment = encryptionKeyInputFragment.A07;
        if (encryptionKeyFragment == null) {
            C18070vi.A11("encryptionKeyFragment");
            throw null;
        } else if (encryptionKeyFragment.A04 != null && (A1n = encryptionKeyFragment.A1n()) != null) {
            int i2 = 2130971203;
            int i3 = 2131102539;
            if (z) {
                i2 = 2130970828;
                i3 = 2131102239;
            }
            int A002 = AnonymousClass1YL.A00(A1n, i2, i3);
            CodeInputField[] codeInputFieldArr = encryptionKeyFragment.A04;
            if (codeInputFieldArr != null) {
                for (CodeInputField codeInputField : codeInputFieldArr) {
                    if (codeInputField != null) {
                        AnonymousClass3MX.A1C(A1n, codeInputField, A002);
                    }
                }
                CodeInputField[] codeInputFieldArr2 = encryptionKeyFragment.A04;
                if (codeInputFieldArr2 != null) {
                    int length = codeInputFieldArr2.length;
                    if (length != 0) {
                        CodeInputField codeInputField2 = codeInputFieldArr2[length - 1];
                        if (codeInputField2 != null) {
                            codeInputField2.setOnEditorActionListener(new C90944et(encryptionKeyFragment, 0));
                            return;
                        }
                        return;
                    }
                    throw new NoSuchElementException("Array is empty.");
                }
            }
            C18070vi.A11("keyGroups");
            throw null;
        }
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
        this.A00 = null;
    }
}
