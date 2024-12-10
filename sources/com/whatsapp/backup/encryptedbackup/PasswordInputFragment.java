package com.whatsapp.backup.encryptedbackup;

import X.A60;
import X.AF3;
import X.AGA;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1DT;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a5;
import X.AnonymousClass4a6;
import X.AnonymousClass8BS;
import X.B3S;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C20339AGv;
import X.C21457AkO;
import X.C22851Dl;
import X.C38541rS;
import X.C72463Mc;
import X.C73203Rj;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.Normalizer;

public abstract class PasswordInputFragment extends Hilt_PasswordInputFragment {
    public int A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public CodeInputField A05;
    public TextEmojiLabel A06;
    public EncBackupViewModel A07;
    public AnonymousClass11C A08;
    public C18000vb A09;
    public C18030ve A0A;
    public WDSButton A0B;
    public AnonymousClass00H A0C;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625228, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) AnonymousClass3Ma.A0I(this).A00(EncBackupViewModel.class);
        C18070vi.A0d(encBackupViewModel, 0);
        this.A07 = encBackupViewModel;
        this.A00 = A26().A0T();
        this.A03 = AnonymousClass3MW.A0J(view, 2131430433);
        this.A02 = AnonymousClass3MW.A0J(view, 2131430431);
        this.A06 = AnonymousClass3MX.A0V(view, 2131430430);
        this.A05 = (CodeInputField) AnonymousClass1HF.A06(view, 2131430428);
        this.A01 = AnonymousClass3MW.A0J(view, 2131430432);
        this.A0B = AnonymousClass3MW.A0q(view, 2131430429);
        this.A04 = AnonymousClass3MW.A0J(view, 2131430434);
        TextEmojiLabel textEmojiLabel = this.A06;
        if (textEmojiLabel != null) {
            textEmojiLabel.setVisibility(8);
        }
        TextView textView = this.A04;
        if (textView != null) {
            textView.setVisibility(8);
        }
        CodeInputField codeInputField = this.A05;
        if (codeInputField != null) {
            codeInputField.addTextChangedListener(new AF3(this, 0));
        }
        A2C(false);
        C20339AGv.A00(A1G(), A26().A04, new B3S(this), 0);
    }

    public final void A29(Runnable runnable) {
        String str;
        CharSequence charSequence;
        TextEmojiLabel textEmojiLabel = this.A06;
        if (textEmojiLabel != null) {
            textEmojiLabel.setVisibility(0);
        }
        AnonymousClass00H r0 = this.A0C;
        if (r0 != null) {
            r0.get();
            Context A022 = AnonymousClass8BS.A02(A1D());
            TextEmojiLabel textEmojiLabel2 = this.A06;
            if (textEmojiLabel2 != null) {
                charSequence = textEmojiLabel2.getText();
            } else {
                charSequence = null;
            }
            SpannableStringBuilder A012 = C38541rS.A01(A022, runnable, String.valueOf(charSequence));
            TextEmojiLabel textEmojiLabel3 = this.A06;
            if (textEmojiLabel3 != null) {
                C18030ve r02 = this.A0A;
                if (r02 != null) {
                    AnonymousClass3Ma.A1L(r02, textEmojiLabel3);
                } else {
                    str = "abProps";
                }
            }
            TextEmojiLabel textEmojiLabel4 = this.A06;
            if (textEmojiLabel4 != null) {
                textEmojiLabel4.setText(A012);
                return;
            }
            return;
        }
        str = "linkifierUtils";
        C18070vi.A11(str);
        throw null;
    }

    public final EncBackupViewModel A26() {
        EncBackupViewModel encBackupViewModel = this.A07;
        if (encBackupViewModel != null) {
            return encBackupViewModel;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public void A27() {
        Editable editable;
        EncBackupViewModel A26;
        int i;
        Editable text;
        String str;
        Editable text2;
        EncBackupViewModel A262;
        AnonymousClass10I r2;
        int i2;
        Editable text3;
        if (this instanceof VerifyPasswordFragment) {
            CodeInputField codeInputField = this.A05;
            if (codeInputField != null && (text3 = codeInputField.getText()) != null) {
                EncBackupViewModel A263 = A26();
                String normalize = Normalizer.normalize(text3.toString().trim(), Normalizer.Form.NFKC);
                C18070vi.A0X(normalize);
                A263.A05.A0F(normalize);
                A262 = A26();
                AnonymousClass3MX.A1J(A262.A04, 2);
                r2 = A262.A0K;
                i2 = 11;
            } else {
                return;
            }
        } else if (this instanceof RestorePasswordInputFragment) {
            CodeInputField codeInputField2 = this.A05;
            if (codeInputField2 != null && (text2 = codeInputField2.getText()) != null) {
                EncBackupViewModel A264 = A26();
                String normalize2 = Normalizer.normalize(text2.toString().trim(), Normalizer.Form.NFKC);
                C18070vi.A0X(normalize2);
                A264.A05.A0F(normalize2);
                A262 = A26();
                boolean A0G = A262.A0J.A0G();
                AnonymousClass1DT r1 = A262.A04;
                if (!A0G) {
                    AnonymousClass3MX.A1J(r1, 4);
                    return;
                }
                AnonymousClass3MX.A1J(r1, 2);
                r2 = A262.A0K;
                i2 = 12;
            } else {
                return;
            }
        } else {
            if (this instanceof CreatePasswordFragment) {
                CodeInputField codeInputField3 = this.A05;
                if (codeInputField3 != null && (text = codeInputField3.getText()) != null) {
                    String normalize3 = Normalizer.normalize(text.toString().trim(), Normalizer.Form.NFKC);
                    C18070vi.A0X(normalize3);
                    int A002 = A60.A00(normalize3);
                    if (A002 == 1) {
                        Resources A092 = AnonymousClass3MZ.A09(this);
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, 6, 0);
                        str = A092.getQuantityString(2131755111, 6, objArr);
                    } else if (A002 == 2) {
                        Resources A093 = AnonymousClass3MZ.A09(this);
                        Object[] objArr2 = new Object[1];
                        C17880vN.A1T(objArr2, 1, 0);
                        str = A093.getQuantityString(2131755110, 1, objArr2);
                    } else if (A002 == 3) {
                        str = A1H(2131889846);
                    } else if (A002 == 4) {
                        A26().A05.A0F(normalize3);
                        A26 = A26();
                        i = 400;
                    } else {
                        return;
                    }
                    A2A(str, true);
                    return;
                }
                return;
            }
            ConfirmPasswordFragment confirmPasswordFragment = (ConfirmPasswordFragment) this;
            CodeInputField codeInputField4 = confirmPasswordFragment.A05;
            if (codeInputField4 != null) {
                editable = codeInputField4.getText();
            } else {
                editable = null;
            }
            if (editable == null || !C18070vi.A18(Normalizer.normalize(editable.toString().trim(), Normalizer.Form.NFKC), confirmPasswordFragment.A00)) {
                confirmPasswordFragment.A2A(confirmPasswordFragment.A1H(2131889777), true);
                return;
            }
            int i3 = confirmPasswordFragment.A00;
            A26 = confirmPasswordFragment.A26();
            if (i3 == 1) {
                i = 500;
            } else {
                A26.A0V();
                return;
            }
            A26.A0a(i);
            return;
        }
        r2.CGF(new C21457AkO(A262, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (r1 <= 1) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        if (r1 > 1) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r1 == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A28() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment
            if (r0 == 0) goto L_0x0023
            com.whatsapp.CodeInputField r0 = r8.A05
            if (r0 == 0) goto L_0x0019
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.toString()
            int r1 = X.A60.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r8.A2C(r0)
            android.widget.TextView r0 = r8.A01
            X.C72453Mb.A1D(r0)
            return
        L_0x0023:
            boolean r0 = r8 instanceof com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment
            if (r0 == 0) goto L_0x0046
            com.whatsapp.CodeInputField r0 = r8.A05
            if (r0 == 0) goto L_0x003c
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.toString()
            int r1 = X.A60.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r8.A2C(r0)
            android.widget.TextView r0 = r8.A01
            X.C72453Mb.A1D(r0)
            return
        L_0x0046:
            boolean r1 = r8 instanceof com.whatsapp.backup.encryptedbackup.CreatePasswordFragment
            com.whatsapp.CodeInputField r0 = r8.A05
            if (r1 == 0) goto L_0x009e
            if (r0 == 0) goto L_0x0060
            android.text.Editable r0 = r0.getText()
            r2 = 1
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r0.toString()
            int r1 = X.A60.A00(r0)
            r0 = 1
            if (r1 > r2) goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            r8.A2C(r0)
            r7 = 2131755109(0x7f100065, float:1.9141088E38)
            android.content.Context r6 = r8.A1n()
            if (r6 == 0) goto L_0x009d
            r5 = 0
            android.widget.TextView r4 = r8.A01
            if (r4 == 0) goto L_0x0089
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r8)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            r1 = 6
            X.C17880vN.A1T(r2, r1, r5)
            r0 = 1
            X.AnonymousClass3MX.A1R(r2, r0)
            java.lang.String r0 = r3.getQuantityString(r7, r1, r2)
            r4.setText(r0)
        L_0x0089:
            android.widget.TextView r2 = r8.A01
            if (r2 == 0) goto L_0x0096
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.C72463Mc.A0y(r6, r2, r1, r0)
        L_0x0096:
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x009d
            r0.setVisibility(r5)
        L_0x009d:
            return
        L_0x009e:
            if (r0 == 0) goto L_0x00da
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = r0.toString()
            int r1 = X.A60.A00(r0)
            r0 = 1
            if (r1 <= r0) goto L_0x00da
        L_0x00b1:
            r8.A2C(r0)
            r1 = 2131889775(0x7f120e6f, float:1.9414223E38)
            android.content.Context r4 = r8.A1n()
            if (r4 == 0) goto L_0x009d
            r3 = 0
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x00c5
            r0.setText(r1)
        L_0x00c5:
            android.widget.TextView r2 = r8.A01
            if (r2 == 0) goto L_0x00d2
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.C72463Mc.A0y(r4, r2, r1, r0)
        L_0x00d2:
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x009d
            r0.setVisibility(r3)
            return
        L_0x00da:
            r0 = 0
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A28():void");
    }

    public final void A2B(boolean z) {
        IBinder iBinder;
        CodeInputField codeInputField = this.A05;
        if (codeInputField != null) {
            codeInputField.setEnabled(z);
        }
        AnonymousClass11C r0 = this.A08;
        if (r0 != null) {
            InputMethodManager A0N = r0.A0N();
            if (A0N != null) {
                CodeInputField codeInputField2 = this.A05;
                if (z) {
                    if (codeInputField2 != null) {
                        codeInputField2.requestFocus();
                    }
                    A0N.showSoftInput(this.A05, 1);
                    return;
                }
                if (codeInputField2 != null) {
                    iBinder = codeInputField2.getWindowToken();
                } else {
                    iBinder = null;
                }
                A0N.hideSoftInputFromWindow(iBinder, 0);
                return;
            }
            return;
        }
        C18070vi.A11("systemServices");
        throw null;
    }

    public final void A2C(boolean z) {
        AGA aga;
        CodeInputField codeInputField;
        WDSButton wDSButton = this.A0B;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
        }
        WDSButton wDSButton2 = this.A0B;
        if (z) {
            if (wDSButton2 != null) {
                AnonymousClass3MZ.A1J(wDSButton2, this, 38);
            }
            codeInputField = this.A05;
            if (codeInputField != null) {
                aga = new AGA(this, 0);
            } else {
                return;
            }
        } else {
            aga = null;
            if (wDSButton2 != null) {
                wDSButton2.setOnClickListener((View.OnClickListener) null);
            }
            codeInputField = this.A05;
            if (codeInputField == null) {
                return;
            }
        }
        codeInputField.setOnEditorActionListener(aga);
    }

    public static final void A02(C22851Dl r2, PasswordInputFragment passwordInputFragment, String str, boolean z) {
        C73203Rj A042 = AnonymousClass4a6.A04(passwordInputFragment);
        A042.A0S(str);
        A042.A0g(passwordInputFragment, r2, 2131899286);
        AnonymousClass3MY.A0L(A042).show();
        passwordInputFragment.A2B(z);
        passwordInputFragment.A2C(false);
        AnonymousClass11C r0 = passwordInputFragment.A08;
        if (r0 != null) {
            AnonymousClass4a5.A03(r0);
            C17900vP.A0f("encb/PasswordInputFragment/error modal shown with message: ", str, AnonymousClass000.A10());
            return;
        }
        C18070vi.A11("systemServices");
        throw null;
    }

    public void A1s() {
        super.A1s();
        this.A03 = null;
        this.A02 = null;
        this.A06 = null;
        this.A05 = null;
        this.A01 = null;
        this.A0B = null;
        this.A04 = null;
    }

    public final void A2A(String str, boolean z) {
        Context A1n = A1n();
        if (A1n != null) {
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = this.A01;
            if (textView2 != null) {
                C72463Mc.A0y(A1n, textView2, 2130970927, 2131102371);
            }
            TextView textView3 = this.A01;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            A2B(z);
            A2C(false);
            AnonymousClass11C r0 = this.A08;
            if (r0 != null) {
                AnonymousClass4a5.A03(r0);
                C17900vP.A0f("encb/PasswordInputFragment/error message shown: ", str, AnonymousClass000.A10());
                return;
            }
            C18070vi.A11("systemServices");
            throw null;
        }
    }
}
