package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.5PP  reason: invalid class name */
public final class AnonymousClass5PP extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $default;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Activity $this_intArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PP(Activity activity, String str, int i) {
        super(0);
        this.$this_intArg = activity;
        this.$key = str;
        this.$default = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Intent intent = this.$this_intArg.getIntent();
        if (intent != null) {
            i = intent.getIntExtra(this.$key, this.$default);
        } else {
            i = this.$default;
        }
        return Integer.valueOf(i);
    }
}
