package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* renamed from: X.3ro  reason: invalid class name and case insensitive filesystem */
public abstract class C77923ro extends C74823cw {
    public static final Editable.Factory A06 = new AnonymousClass3NX();
    public AnonymousClass11S A00;
    public AnonymousClass5Z5 A01;
    public C19830z4 A02;
    public AnonymousClass1L4 A03;
    public AnonymousClass1DC A04;
    public Runnable A05;

    public void setInputEnterDone(boolean z) {
        int i = 0;
        if (z) {
            i = 6;
        }
        setInputEnterAction(i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass5Z5 r0 = this.A01;
        if (r0 != null) {
            r0.BwT(keyEvent, i);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 23 && i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.AnonymousClass3MX.A1T(X.C17890vO.A0B(r1.A01), "input_enter_send") == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupEnterIsSend(java.lang.Runnable r3) {
        /*
            r2 = this;
            r2.A05 = r3
            X.1DC r1 = r2.A04
            X.1DD r1 = (X.AnonymousClass1DD) r1
            X.11S r0 = r1.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x001d
            X.0z4 r0 = r1.A01
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "input_enter_send"
            boolean r1 = X.AnonymousClass3MX.A1T(r1, r0)
            r0 = 4
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.setInputEnterAction(r0)
            r1 = 1
            X.4dd r0 = new X.4dd
            r0.<init>(r2, r1)
            r2.setOnKeyListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77923ro.setupEnterIsSend(java.lang.Runnable):void");
    }

    public C77923ro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEditableFactory(A06);
        setCustomSelectionActionModeCallback(new C89624cl(this, 3));
    }

    public void setOnKeyPreImeListener(AnonymousClass5Z5 r1) {
        this.A01 = r1;
    }
}
