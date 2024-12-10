package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.5PQ  reason: invalid class name */
public final class AnonymousClass5PQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ long $default = 0;
    public final /* synthetic */ String $key = "extra_quoted_message_row_id";
    public final /* synthetic */ Activity $this_longArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PQ(Activity activity) {
        super(0);
        this.$this_longArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        Intent intent = this.$this_longArg.getIntent();
        if (intent != null) {
            j = intent.getLongExtra(this.$key, this.$default);
        } else {
            j = this.$default;
        }
        return Long.valueOf(j);
    }
}
