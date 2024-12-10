package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.5OD  reason: invalid class name */
public final class AnonymousClass5OD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "arg_contact_jid";
    public final /* synthetic */ Fragment $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5OD(Fragment fragment) {
        super(0);
        this.$this_jidArg = fragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.$this_jidArg
            android.os.Bundle r2 = r0.A06
            r1 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r0 = r3.$key
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x0027
            androidx.fragment.app.Fragment r0 = r3.$this_jidArg
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r3.$key
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0028
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3MX.A0n(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            return r1
        L_0x0028:
            X.4tI r0 = X.C99684tI.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5OD.invoke():java.lang.Object");
    }
}
