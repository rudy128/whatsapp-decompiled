package X;

import android.app.Activity;

/* renamed from: X.AwL  reason: case insensitive filesystem */
public final class C22019AwL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "extra_checkout_info_content";
    public final /* synthetic */ Activity $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22019AwL(Activity activity) {
        super(0);
        this.$this_parcelableArg = activity;
    }

    public final Object invoke() {
        return C87314Vc.A00(this.$this_parcelableArg.getIntent(), C20279AEn.class, this.$key);
    }
}
