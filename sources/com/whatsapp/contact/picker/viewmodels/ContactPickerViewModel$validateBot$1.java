package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$validateBot$1", f = "ContactPickerViewModel.kt", i = {1, 2, 3}, l = {60, 68, 69, 69, 70}, m = "invokeSuspend", n = {"normalizedBotJid", "normalizedBotJid", "normalizedBotJid"}, s = {"L$0", "L$0", "L$0"})
public final class ContactPickerViewModel$validateBot$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $botJid;
    public final /* synthetic */ Uri $deeplink;
    public final /* synthetic */ boolean $isDefaultBot;
    public Object L$0;
    public int label;
    public final /* synthetic */ ContactPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPickerViewModel$validateBot$1(Uri uri, ContactPickerViewModel contactPickerViewModel, UserJid userJid, C30391dr r5, boolean z) {
        super(2, r5);
        this.this$0 = contactPickerViewModel;
        this.$botJid = userJid;
        this.$deeplink = uri;
        this.$isDefaultBot = z;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ContactPickerViewModel$validateBot$1(this.$deeplink, this.this$0, this.$botJid, r8, this.$isDefaultBot);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (X.AnonymousClass000.A1Y(r11) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r6 = 5
            r2 = 4
            r8 = 3
            r9 = 2
            r7 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r7) goto L_0x002d
            if (r0 == r9) goto L_0x005f
            if (r0 == r8) goto L_0x0079
            if (r0 == r2) goto L_0x0093
            if (r0 != r6) goto L_0x00bb
            X.C30691eM.A01(r11)
        L_0x0018:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x001b:
            X.C30691eM.A01(r11)
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r0 = r10.this$0
            X.1G3 r1 = r0.A04
            X.7EO r0 = X.AnonymousClass7EO.A00
            r10.label = r7
            java.lang.Object r0 = r1.BJt(r0, r10)
            if (r0 != r5) goto L_0x0030
            return r5
        L_0x002d:
            X.C30691eM.A01(r11)
        L_0x0030:
            com.whatsapp.jid.UserJid r0 = r10.$botJid
            boolean r0 = X.C22971Dz.A0M(r0)
            if (r0 == 0) goto L_0x005c
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r0 = r10.this$0
            X.0ve r3 = r0.A01
            r1 = 12795(0x31fb, float:1.793E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x005c
            com.whatsapp.jid.UserJid r0 = r10.$botJid
            com.whatsapp.jid.UserJid r4 = X.C22971Dz.A03(r0)
        L_0x004c:
            X.C18070vi.A0b(r4)
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r0 = r10.this$0
            r10.L$0 = r4
            r10.label = r9
            java.lang.Object r11 = com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel.A00(r0, r4, r10)
            if (r11 != r5) goto L_0x0066
            return r5
        L_0x005c:
            com.whatsapp.jid.UserJid r4 = r10.$botJid
            goto L_0x004c
        L_0x005f:
            java.lang.Object r4 = r10.L$0
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.C30691eM.A01(r11)
        L_0x0066:
            boolean r0 = X.AnonymousClass000.A1Y(r11)
            if (r0 != 0) goto L_0x00a0
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r0 = r10.this$0
            r10.L$0 = r4
            r10.label = r8
            java.lang.Object r11 = com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel.A03(r0, r4, r10)
            if (r11 != r5) goto L_0x0080
            return r5
        L_0x0079:
            java.lang.Object r4 = r10.L$0
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.C30691eM.A01(r11)
        L_0x0080:
            boolean r0 = X.AnonymousClass000.A1Y(r11)
            if (r0 == 0) goto L_0x00b9
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r0 = r10.this$0
            r10.L$0 = r4
            r10.label = r2
            java.lang.Object r11 = com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel.A00(r0, r4, r10)
            if (r11 != r5) goto L_0x009a
            return r5
        L_0x0093:
            java.lang.Object r4 = r10.L$0
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.C30691eM.A01(r11)
        L_0x009a:
            boolean r0 = X.AnonymousClass000.A1Y(r11)
            if (r0 == 0) goto L_0x00b9
        L_0x00a0:
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r0 = r10.this$0
            X.1G3 r3 = r0.A04
            android.net.Uri r2 = r10.$deeplink
            boolean r0 = r10.$isDefaultBot
            X.7EN r1 = new X.7EN
            r1.<init>(r2, r4, r7, r0)
            r0 = 0
            r10.L$0 = r0
            r10.label = r6
            java.lang.Object r0 = r3.BJt(r1, r10)
            if (r0 != r5) goto L_0x0018
            return r5
        L_0x00b9:
            r7 = 0
            goto L_0x00a0
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$validateBot$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactPickerViewModel$validateBot$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
