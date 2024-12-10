package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C85594Nz;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$logThemePreviewEvent$1$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$logThemePreviewEvent$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C85594Nz $logInfo;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$logThemePreviewEvent$1$1(Context context, C85594Nz r3, ChatThemeViewModel chatThemeViewModel, C30391dr r5) {
        super(2, r5);
        this.this$0 = chatThemeViewModel;
        this.$logInfo = r3;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        ChatThemeViewModel chatThemeViewModel = this.this$0;
        return new ChatThemeViewModel$logThemePreviewEvent$1$1(this.$context, this.$logInfo, chatThemeViewModel, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r4.A02 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        if (r1.equals(r0) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        if (r2 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        r2 = (java.lang.String) X.C29431cG.A0d(X.AnonymousClass1YF.A0R(r2, new char[]{'/'}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if (r2 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        r1 = (java.lang.String) X.C29431cG.A0b(X.AnonymousClass1YF.A0S(r2, new java.lang.String[]{"."}, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (r1 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        if (X.AnonymousClass1YF.A0Y(r1, "wallpaper", true) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        if (r1.equals(r0) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r9 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x00ee
            X.C30691eM.A01(r11)
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r10.this$0
            X.00H r0 = r0.A0X
            java.lang.Object r7 = r0.get()
            X.4RE r7 = (X.AnonymousClass4RE) r7
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r10.this$0
            X.1BI r4 = r0.A0Q
            X.4Nz r6 = r10.$logInfo
            boolean r8 = r0.A04
            android.content.Context r3 = r10.$context
            X.C72473Md.A1I(r6, r3)
            X.0ve r2 = r7.A01
            r1 = 8320(0x2080, float:1.1659E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0095
            X.4aW r0 = r7.A04
            X.4SC r3 = r0.A0E(r3, r4)
            X.4Nz r5 = r7.A00(r4, r3)
            X.3zp r4 = new X.3zp
            r4.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r4.A00 = r0
            java.lang.String r0 = r6.A03
            java.lang.String r1 = r5.A03
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 != 0) goto L_0x004b
            r4.A03 = r1
        L_0x004b:
            if (r8 == 0) goto L_0x0057
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "custom"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0061
        L_0x0057:
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r5.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0082
        L_0x0061:
            java.lang.String r0 = r5.A01
            r4.A05 = r0
            int r0 = r5.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A01 = r0
            java.lang.String r2 = r3.A02
            X.AnonymousClass4GP.A00(r3, r2)
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            r9 = 4
            switch(r0) {
                case -2032180703: goto L_0x0098;
                case -1770733785: goto L_0x00a2;
                case -899329064: goto L_0x00a5;
                case 175331287: goto L_0x00a8;
                case 1804184360: goto L_0x00e4;
                default: goto L_0x007c;
            }
        L_0x007c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A02 = r0
        L_0x0082:
            java.lang.String r1 = r5.A00
            java.lang.String r0 = r6.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = r5.A00
            r4.A04 = r0
        L_0x0090:
            X.18K r0 = r7.A02
            r0.CC7(r4)
        L_0x0095:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0098:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
            r9 = 5
            goto L_0x007c
        L_0x00a2:
            java.lang.String r0 = "DOWNLOADED"
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            goto L_0x00e6
        L_0x00a8:
            java.lang.String r0 = "USER_PROVIDED"
        L_0x00aa:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
            r8 = 1
            if (r2 == 0) goto L_0x00d8
            char[] r1 = new char[r8]
            r0 = 47
            r3 = 0
            r1[r3] = r0
            java.util.List r0 = X.AnonymousClass1YF.A0R(r2, r1)
            java.lang.Object r2 = X.C29431cG.A0d(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d8
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.String r0 = "."
            r1[r3] = r0
            java.util.List r0 = X.AnonymousClass1YF.A0S(r2, r1, r3)
            java.lang.Object r1 = X.C29431cG.A0b(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00da
        L_0x00d8:
            java.lang.String r1 = ""
        L_0x00da:
            java.lang.String r0 = "wallpaper"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r8)
            if (r0 == 0) goto L_0x007c
            r9 = 1
            goto L_0x007c
        L_0x00e4:
            java.lang.String r0 = "COLOR_ONLY"
        L_0x00e6:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
            r9 = 3
            goto L_0x007c
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$logThemePreviewEvent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$logThemePreviewEvent$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
