package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.5Na  reason: invalid class name and case insensitive filesystem */
public final class C104145Na extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "transfer_ownership_admin_short_name";
    public final /* synthetic */ Activity $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104145Na(Activity activity) {
        super(0);
        this.$this_stringArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_stringArg.getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(this.$key)) != null) {
            return stringExtra;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("No value for ");
        throw AnonymousClass000.A0s(AnonymousClass000.A0y(this.$key, A10));
    }
}
