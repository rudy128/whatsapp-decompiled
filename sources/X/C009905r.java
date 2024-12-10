package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.05r  reason: invalid class name and case insensitive filesystem */
public final class C009905r extends C005302h {
    public static Intent A00(AnonymousClass0RL r2) {
        C18070vi.A0d(r2, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r2);
        C18070vi.A0X(putExtra);
        return putExtra;
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        return A00((AnonymousClass0RL) obj);
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        return new C005702m(i, intent);
    }
}
