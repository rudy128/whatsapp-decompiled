package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Rn;
import X.AnonymousClass48E;
import X.AnonymousClass4M1;
import X.C108625c1;
import X.C74783cd;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;

public class FinalBackspaceAwareEntry extends C74783cd {
    public static final char A04 = "​".charAt(0);
    public List A00;
    public boolean A01;
    public boolean A02;
    public final TextView.BufferType A03;

    public static Editable A08(Editable editable) {
        Editable editable2 = editable;
        if (!A0B(editable)) {
            return editable2;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(editable);
        newEditable.replace(0, A0B(newEditable) ? 1 : 0, "", 0, 0);
        return newEditable;
    }

    public static void A0A(Editable editable, FinalBackspaceAwareEntry finalBackspaceAwareEntry) {
        Editable editable2;
        finalBackspaceAwareEntry.A01 = true;
        if (editable != null) {
            editable2 = Editable.Factory.getInstance().newEditable(editable);
            editable2.replace(0, 0, "​", 0, 1);
        } else {
            editable2 = null;
        }
        finalBackspaceAwareEntry.setText(editable2, finalBackspaceAwareEntry.A03);
        finalBackspaceAwareEntry.A01 = false;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C108625c1 r1;
        List<AnonymousClass4M1> list = this.A00;
        if (list != null) {
            for (AnonymousClass4M1 r2 : list) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (r1 = r2.A00.A0F) != null) {
                    r1.C2N(false);
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0G();
        this.A01 = false;
        this.A03 = TextView.BufferType.EDITABLE;
        A09();
    }

    private int A06(int i) {
        int A032;
        if (TextUtils.isEmpty(getText())) {
            A032 = 0;
        } else {
            A032 = AnonymousClass3Ma.A03(this);
        }
        return Math.max(0, Math.min(i, A032));
    }

    private void A09() {
        if (!A0B(getText())) {
            A0A(getText(), this);
        }
        addTextChangedListener(new AnonymousClass48E(this, 16));
    }

    public static boolean A0B(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(0) != A04) {
            return false;
        }
        return true;
    }

    private void setTextWithBsPrefix(String str) {
        setText(AnonymousClass001.A1H("​", str, AnonymousClass000.A10()));
    }

    public /* synthetic */ void A0L(String str) {
        Editable A08 = A08(getText());
        if (str != null && A08 != null && !str.equals(A08.toString())) {
            setTextWithBsPrefix(str);
            setSelection(str.length());
        }
    }

    public int getSelectionEnd() {
        Editable text = getText();
        if (TextUtils.isEmpty(A08(text))) {
            return A0B(text) ? 1 : 0;
        }
        return super.getSelectionEnd();
    }

    public int getSelectionStart() {
        return Math.max(super.getSelectionStart(), A0B(getText()) ? 1 : 0);
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int A0B = A0B(getText());
        if (min < A0B) {
            setSelection(A06(Math.max(min, A0B)), A06(max));
        }
    }

    public void setSelection(int i) {
        super.setSelection(A06(i + (A0B(getText()) ? 1 : 0)));
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass3Rn.A05(this);
        this.A01 = false;
        this.A03 = TextView.BufferType.EDITABLE;
        A09();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0G();
    }

    public FinalBackspaceAwareEntry(Context context) {
        super(context);
        AnonymousClass3Rn.A05(this);
        this.A01 = false;
        this.A03 = TextView.BufferType.EDITABLE;
        A09();
    }
}
