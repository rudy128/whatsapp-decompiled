package X;

import android.app.Activity;

/* renamed from: X.5N3  reason: invalid class name */
public final class AnonymousClass5N3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "parent_group_jid_to_link";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N3(Activity activity) {
        super(0);
        this.$this_jidArg = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r3 = this;
            android.app.Activity r0 = r3.$this_jidArg
            android.content.Intent r2 = r0.getIntent()
            r1 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = r3.$key
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 == 0) goto L_0x002b
            android.app.Activity r0 = r3.$this_jidArg
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = r3.$key
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x002c
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3MX.A0n(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            return r1
        L_0x002c:
            X.4tI r0 = X.C99684tI.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5N3.invoke():java.lang.Object");
    }
}
