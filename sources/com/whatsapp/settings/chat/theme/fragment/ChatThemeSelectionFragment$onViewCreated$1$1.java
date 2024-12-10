package com.whatsapp.settings.chat.theme.fragment;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.view.View;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$onViewCreated$1$1", f = "ChatThemeSelectionFragment.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeSelectionFragment$onViewCreated$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $chatThemes;
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ ChatThemeSelectionFragment this$0;

    @DebugMetadata(c = "com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$onViewCreated$1$1$1", f = "ChatThemeSelectionFragment.kt", i = {}, l = {108, 109}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$onViewCreated$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(view, chatThemeSelectionFragment, list, r6);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r7.label
                r5 = 2
                r6 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r6) goto L_0x0059
                if (r0 != r5) goto L_0x0073
                X.C30691eM.A01(r8)
            L_0x000f:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0012:
                X.C30691eM.A01(r8)
                com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r0 = r5
                android.graphics.Bitmap r3 = r0.A00
                if (r3 != 0) goto L_0x0045
                android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r0)
                r2 = 2131233686(0x7f080b96, float:1.8083517E38)
                android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
                r1.<init>()
                r1.inSampleSize = r5
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
                r1.inPreferredConfig = r0
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r3, r2, r1)
                android.graphics.Bitmap r1 = r0.extractAlpha()
                X.C18070vi.A0X(r1)
                r0.recycle()
                com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r0 = r5
                android.content.Context r0 = r0.A14()
                android.graphics.Bitmap r3 = com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment.A00(r0, r1)
            L_0x0045:
                com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r2 = r5
                r2.A00 = r3
                java.util.List r1 = r3
                X.C18070vi.A0b(r1)
                android.view.View r0 = r2
                r7.label = r6
                java.lang.Object r8 = com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment.A01(r3, r0, r2, r1, r7)
                if (r8 != r4) goto L_0x005c
                return r4
            L_0x0059:
                X.C30691eM.A01(r8)
            L_0x005c:
                java.util.List r8 = (java.util.List) r8
                com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r3 = r5
                X.0wl r2 = r3.A05
                if (r2 == 0) goto L_0x0078
                r1 = 0
                com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$onViewCreated$1$1$1$1 r0 = new com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$onViewCreated$1$1$1$1
                r0.<init>(r8, r1)
                r7.label = r5
                java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0073:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0078:
                X.AnonymousClass3MW.A1L()
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$onViewCreated$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeSelectionFragment$onViewCreated$1$1(View view, ChatThemeSelectionFragment chatThemeSelectionFragment, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = chatThemeSelectionFragment;
        this.$chatThemes = list;
        this.$view = view;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatThemeSelectionFragment$onViewCreated$1$1(this.$view, this.this$0, this.$chatThemes, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ChatThemeSelectionFragment chatThemeSelectionFragment = this.this$0;
            C18600wl r4 = chatThemeSelectionFragment.A04;
            if (r4 != null) {
                final List list = this.$chatThemes;
                final View view = this.$view;
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r4, r0) == r7) {
                    return r7;
                }
            } else {
                AnonymousClass3MW.A1K();
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeSelectionFragment$onViewCreated$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
