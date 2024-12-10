package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.Reference;
import java.util.List;

public final class D5P implements InputConnection {
    public int A00;
    public int A01;
    public C26224CvE A02;
    public boolean A03;
    public boolean A04 = true;
    public final E09 A05;
    public final List A06 = AnonymousClass000.A13();

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.A03 = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.A01 = i2;
        }
        return C74.A00(this.A02);
    }

    public Handler getHandler() {
        return null;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    private final void A00(E3W e3w) {
        this.A00++;
        try {
            this.A06.add(e3w);
        } finally {
            A01();
        }
    }

    private final boolean A01() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            List list = this.A06;
            if (AnonymousClass000.A1a(list)) {
                ((D61) this.A05).A00.A05.invoke(C17880vN.A10(list));
                list.clear();
            }
        }
        if (this.A00 <= 0) {
            return false;
        }
        return true;
    }

    public boolean beginBatchEdit() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        this.A00++;
        return true;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.A06.clear();
        this.A00 = 0;
        this.A04 = false;
        List list = ((D61) this.A05).A00.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C18070vi.A18(((Reference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(new D60(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C26605D5v(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C26606D5w(i, i2));
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.E3W] */
    public boolean finishComposingText() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new Object());
        return true;
    }

    public int getCursorCapsMode(int i) {
        C26224CvE cvE = this.A02;
        return TextUtils.getCapsMode(cvE.A01.A00, C26260Cw5.A02(cvE.A00), i);
    }

    public CharSequence getSelectedText(int i) {
        C26224CvE cvE = this.A02;
        if (C26260Cw5.A04(cvE.A00)) {
            return null;
        }
        return C25860CnO.A00(cvE).toString();
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return C25860CnO.A01(this.A02, i).toString();
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return C25860CnO.A02(this.A02, i).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        sendKeyEvent(new android.view.KeyEvent(0, r2));
        sendKeyEvent(new android.view.KeyEvent(1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performContextMenuAction(int r5) {
        /*
            r4 = this;
            boolean r3 = r4.A04
            if (r3 == 0) goto L_0x0008
            r3 = 0
            switch(r5) {
                case 16908319: goto L_0x0009;
                case 16908320: goto L_0x001c;
                case 16908321: goto L_0x001f;
                case 16908322: goto L_0x0022;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r3
        L_0x0009:
            X.CvE r0 = r4.A02
            X.DRu r0 = r0.A01
            java.lang.String r0 = r0.A00
            int r1 = r0.length()
            X.D5z r0 = new X.D5z
            r0.<init>(r3, r1)
            r4.A00(r0)
            return r3
        L_0x001c:
            r2 = 277(0x115, float:3.88E-43)
            goto L_0x0024
        L_0x001f:
            r2 = 278(0x116, float:3.9E-43)
            goto L_0x0024
        L_0x0022:
            r2 = 279(0x117, float:3.91E-43)
        L_0x0024:
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r3, r2)
            r4.sendKeyEvent(r0)
            r1 = 1
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r1, r2)
            r4.sendKeyEvent(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5P.performContextMenuAction(int):boolean");
    }

    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", AnonymousClass001.A1I("IME sends unsupported Editor Action: ", AnonymousClass000.A10(), i));
                    break;
            }
        }
        i2 = 1;
        ((D61) this.A05).A00.A06.invoke(new ImeAction(i2));
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = this.A04;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean A1O = AnonymousClass000.A1O(i & 1);
        boolean A1O2 = AnonymousClass000.A1O(i & 2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z = AnonymousClass000.A1O(i & 16);
            z2 = AnonymousClass000.A1O(i & 8);
            z3 = AnonymousClass000.A1O(i & 4);
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (!z && !z2 && !z3 && !z5) {
                z5 = false;
                z = true;
                z2 = true;
                z3 = true;
                if (i2 >= 34) {
                    z5 = true;
                }
            }
        } else {
            z = true;
            z2 = true;
            z3 = false;
        }
        C25964CpW cpW = ((D61) this.A05).A00.A0A;
        synchronized (cpW.A0C) {
            cpW.A09 = z;
            cpW.A07 = z2;
            cpW.A08 = z3;
            cpW.A0A = z5;
            if (A1O) {
                cpW.A06 = true;
                if (cpW.A04 != null) {
                    C25964CpW.A00(cpW);
                }
            }
            cpW.A0B = A1O2;
        }
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((D61) this.A05).A00.A0D.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(new C26607D5x(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(new C26608D5y(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C26609D5z(i, i2));
        return true;
    }

    public D5P(E09 e09, C26224CvE cvE) {
        this.A05 = e09;
        this.A02 = cvE;
    }

    public boolean endBatchEdit() {
        return A01();
    }
}
