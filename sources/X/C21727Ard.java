package X;

import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

/* renamed from: X.Ard  reason: case insensitive filesystem */
public class C21727Ard extends AnonymousClass1JJ implements C18090vk {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21727Ard(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0013;
                case 2: goto L_0x0013;
                case 3: goto L_0x0013;
                case 4: goto L_0x0013;
                case 5: goto L_0x0013;
                case 6: goto L_0x0013;
                case 7: goto L_0x0013;
                case 8: goto L_0x0013;
                case 9: goto L_0x0013;
                case 10: goto L_0x0013;
                case 11: goto L_0x0013;
                case 12: goto L_0x0013;
                case 13: goto L_0x0013;
                case 14: goto L_0x0013;
                case 15: goto L_0x0013;
                case 16: goto L_0x0013;
                case 17: goto L_0x0013;
                case 18: goto L_0x0013;
                case 19: goto L_0x0013;
                case 20: goto L_0x0013;
                case 21: goto L_0x0013;
                case 22: goto L_0x0013;
                case 23: goto L_0x0013;
                case 24: goto L_0x0013;
                case 25: goto L_0x0013;
                case 26: goto L_0x0013;
                case 27: goto L_0x0013;
                case 28: goto L_0x0013;
                case 29: goto L_0x0013;
                case 30: goto L_0x0013;
                case 31: goto L_0x0013;
                case 32: goto L_0x0013;
                case 33: goto L_0x0013;
                case 34: goto L_0x0013;
                case 35: goto L_0x0016;
                case 36: goto L_0x0016;
                case 37: goto L_0x001e;
                case 38: goto L_0x0006;
                case 39: goto L_0x001e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.profile.viewmodel.UsernameSetViewModel> r3 = com.whatsapp.profile.viewmodel.UsernameSetViewModel.class
            java.lang.String r5 = "onSaveCtaClicked()V"
            r1 = 0
            java.lang.String r4 = "onSaveCtaClicked"
        L_0x000d:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.00H> r3 = X.AnonymousClass00H.class
            goto L_0x0020
        L_0x0016:
            java.lang.Class<com.whatsapp.preference.WaMuteSettingPreference> r3 = com.whatsapp.preference.WaMuteSettingPreference.class
            java.lang.String r5 = "logMuteClick()V"
            r1 = 0
            java.lang.String r4 = "logMuteClick"
            goto L_0x000d
        L_0x001e:
            java.lang.Class<X.0vp> r3 = X.C18140vp.class
        L_0x0020:
            java.lang.String r5 = "get()Ljava/lang/Object;"
            r1 = 0
            java.lang.String r4 = "get"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21727Ard.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 35:
            case 36:
                break;
            case 37:
            case 39:
                return ((C18140vp) this.receiver).get();
            case 38:
                UsernameSetViewModel usernameSetViewModel = (UsernameSetViewModel) this.receiver;
                String str = usernameSetViewModel.A00;
                AnonymousClass3MW.A17(usernameSetViewModel.A0A).setValue(AnonymousClass9I3.LOADING);
                ((C108425bg) usernameSetViewModel.A07.get()).CLI(usernameSetViewModel, str);
                break;
            default:
                return ((AnonymousClass00H) this.receiver).get();
        }
        return C27621Wu.A00;
    }
}
