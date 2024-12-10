package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.8q9  reason: invalid class name */
public final class AnonymousClass8q9 extends C20126A8l {
    public final String A00;
    public final String[] A01 = C17880vN.A1a("setting_locale", 0);

    public AnonymousClass8q9(C19999A2n a2n, String str, String str2, long j) {
        super(C62382rJ.A03, a2n, str, "critical_block", 3, j, false);
        this.A00 = str2;
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8Y8.DEFAULT_INSTANCE.A0N();
        String str = this.A00;
        AnonymousClass8Y8 r1 = (AnonymousClass8Y8) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.locale_ = str;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8Y8 r12 = (AnonymousClass8Y8) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.localeSetting_ = r12;
        A0O.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "LocaleSyncMutation{\n        rowId=", A10);
        A10.append(",\n        locale=");
        A10.append(this.A00);
        C20126A8l.A02(this, ",\n        timestamp=", A10);
        C20126A8l.A04(this, ",\n        operation=", A10);
        C20126A8l.A01(this, ",\n        collectionName=", A10);
        C20126A8l.A06(this, ",\n        keyId=", A10);
        return AnonymousClass8BW.A0k("\n        }", A10);
    }
}
