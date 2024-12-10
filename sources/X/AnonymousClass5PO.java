package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.5PO  reason: invalid class name */
public final class AnonymousClass5PO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ boolean $default = false;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Activity $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PO(Activity activity, String str) {
        super(0);
        this.$this_booleanArg = activity;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Intent intent = this.$this_booleanArg.getIntent();
        if (intent != null) {
            z = intent.getBooleanExtra(this.$key, this.$default);
        } else {
            z = this.$default;
        }
        return Boolean.valueOf(z);
    }
}
