package X;

import android.widget.EditText;

/* renamed from: X.6wG  reason: invalid class name and case insensitive filesystem */
public class C137936wG {
    public final EditText A00;
    public final C1418977j A01;

    public C137936wG(EditText editText) {
        this.A00 = editText;
        C1418977j r0 = new C1418977j(editText);
        this.A01 = r0;
        editText.addTextChangedListener(r0);
        if (C109655dn.A02 == null) {
            synchronized (C109655dn.A01) {
                if (C109655dn.A02 == null) {
                    C109655dn.A02 = new C109655dn();
                }
            }
        }
        editText.setEditableFactory(C109655dn.A02);
    }

    public C137936wG() {
    }
}
