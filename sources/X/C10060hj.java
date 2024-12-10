package X;

import android.content.res.Configuration;

/* renamed from: X.0hj  reason: invalid class name and case insensitive filesystem */
public final class C10060hj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C17330uU $configuration$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10060hj(C17330uU r2) {
        super(1);
        this.$configuration$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$configuration$delegate.setValue(new Configuration((Configuration) obj));
        return C27621Wu.A00;
    }
}
