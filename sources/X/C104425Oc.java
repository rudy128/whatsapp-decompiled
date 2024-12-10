package X;

import android.app.Activity;

/* renamed from: X.5Oc  reason: invalid class name and case insensitive filesystem */
public final class C104425Oc extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "appeal-request";
    public final /* synthetic */ Activity $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104425Oc(Activity activity) {
        super(0);
        this.$this_parcelableArg = activity;
    }

    public final Object invoke() {
        return C87314Vc.A00(this.$this_parcelableArg.getIntent(), C89364cL.class, this.$key);
    }
}
