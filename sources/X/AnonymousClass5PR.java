package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.5PR  reason: invalid class name */
public final class AnonymousClass5PR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $default = null;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Activity $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PR(Activity activity, String str) {
        super(0);
        this.$this_stringArg = activity;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_stringArg.getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(this.$key)) == null) {
            return this.$default;
        }
        return stringExtra;
    }
}
