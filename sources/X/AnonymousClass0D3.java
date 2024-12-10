package X;

import android.content.Intent;

/* renamed from: X.0D3  reason: invalid class name */
public abstract class AnonymousClass0D3 {
    public static final Intent A00(String[] strArr) {
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C18070vi.A0X(putExtra);
        return putExtra;
    }
}
