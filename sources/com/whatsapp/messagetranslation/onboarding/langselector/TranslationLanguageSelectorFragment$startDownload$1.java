package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2SS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C73053Ou;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$startDownload$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationLanguageSelectorFragment$startDownload$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C73053Ou $adapter;
    public final /* synthetic */ String $chatSettingLang;
    public final /* synthetic */ String $lastSelectedSourceLangTag;
    public final /* synthetic */ int $position;
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$startDownload$1(View view, C73053Ou r3, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2, C30391dr r7, int i) {
        super(2, r7);
        this.this$0 = translationLanguageSelectorFragment;
        this.$view = view;
        this.$adapter = r3;
        this.$position = i;
        this.$chatSettingLang = str;
        this.$lastSelectedSourceLangTag = str2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
        return new TranslationLanguageSelectorFragment$startDownload$1(this.$view, this.$adapter, translationLanguageSelectorFragment, this.$chatSettingLang, this.$lastSelectedSourceLangTag, r10, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
            C18600wl r2 = translationLanguageSelectorFragment.A0D;
            if (r2 != null) {
                TranslationLanguageSelectorFragment$startDownload$1$isWifi$1 translationLanguageSelectorFragment$startDownload$1$isWifi$1 = new TranslationLanguageSelectorFragment$startDownload$1$isWifi$1(translationLanguageSelectorFragment, (C30391dr) null);
                this.label = 1;
                obj = C30451dy.A00(this, r2, translationLanguageSelectorFragment$startDownload$1$isWifi$1);
                if (obj == r4) {
                    return r4;
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
        if (!AnonymousClass000.A1Y(obj)) {
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment2 = this.this$0;
            View view = this.$view;
            C73053Ou r3 = this.$adapter;
            int i2 = this.$position;
            String str = this.$chatSettingLang;
            String str2 = this.$lastSelectedSourceLangTag;
            AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$showWaitForWifiErrorDialog$1(view, r3, translationLanguageSelectorFragment2, str, str2, (C30391dr) null, i2), AnonymousClass2SS.A00(translationLanguageSelectorFragment2));
        } else {
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment3 = this.this$0;
            TranslationLanguageSelectorFragment.A01(this.$view, this.$adapter, translationLanguageSelectorFragment3, this.$chatSettingLang, this.$lastSelectedSourceLangTag, this.$position, true);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationLanguageSelectorFragment$startDownload$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
