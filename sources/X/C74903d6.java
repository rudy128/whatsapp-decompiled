package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.3d6  reason: invalid class name and case insensitive filesystem */
public final class C74903d6 extends C74703cE {
    public final /* synthetic */ C108875cR A00;
    public final /* synthetic */ String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74903d6(android.content.Context r8, X.AnonymousClass1KB r9, X.C36361nl r10, X.C108875cR r11, X.AnonymousClass11C r12, java.lang.String r13) {
        /*
            r7 = this;
            r0 = r7
            r6 = r13
            r7.A01 = r13
            r7.A00 = r11
            r5 = 0
            r1 = r8
            r3 = r9
            r2 = r10
            r4 = r12
            r0.<init>((android.content.Context) r1, (X.AnonymousClass1L8) r2, (X.AnonymousClass1KB) r3, (X.AnonymousClass11C) r4, (X.AnonymousClass206) r5, (java.lang.String) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74903d6.<init>(android.content.Context, X.1KB, X.1nl, X.5cR, X.11C, java.lang.String):void");
    }

    public void onClick(View view) {
        C108875cR r4 = this.A00;
        if (r4 != null) {
            String A07 = AnonymousClass1YE.A07(this.A01, "commands", "", false);
            EditText textEntryField = r4.getTextEntryField();
            if (textEntryField != null) {
                textEntryField.getText().append(A07);
            }
        }
    }
}
