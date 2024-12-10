package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C131126kY;
import X.C160888Ai;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel$prepareData$1", f = "VideoComposerViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class VideoComposerViewModel$prepareData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C160888Ai $mediaComposerContainer;
    public final /* synthetic */ C131126kY $mediaJidsState;
    public final /* synthetic */ Bundle $savedInstanceState;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ File $videoFile;
    public int label;
    public final /* synthetic */ VideoComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel$prepareData$1$1", f = "VideoComposerViewModel.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel$prepareData$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r11) {
            VideoComposerViewModel videoComposerViewModel = videoComposerViewModel;
            Uri uri = uri;
            return new AnonymousClass1(context, uri, bundle, r7, videoComposerViewModel, r9, file, r11);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                VideoComposerViewModel videoComposerViewModel = videoComposerViewModel;
                Uri uri = uri;
                Context context = context;
                File file = file;
                Bundle bundle = bundle;
                C160888Ai r6 = r7;
                C131126kY r8 = r9;
                this.label = 1;
                if (VideoComposerViewModel.A00(context, uri, bundle, r6, videoComposerViewModel, r8, file, this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoComposerViewModel$prepareData$1(Context context, Uri uri, Bundle bundle, C160888Ai r5, VideoComposerViewModel videoComposerViewModel, C131126kY r7, File file, C30391dr r9) {
        super(2, r9);
        this.this$0 = videoComposerViewModel;
        this.$uri = uri;
        this.$context = context;
        this.$videoFile = file;
        this.$savedInstanceState = bundle;
        this.$mediaComposerContainer = r5;
        this.$mediaJidsState = r7;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        VideoComposerViewModel videoComposerViewModel = this.this$0;
        Uri uri = this.$uri;
        return new VideoComposerViewModel$prepareData$1(this.$context, uri, this.$savedInstanceState, this.$mediaComposerContainer, videoComposerViewModel, this.$mediaJidsState, this.$videoFile, r11);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final VideoComposerViewModel videoComposerViewModel = this.this$0;
            C18600wl r0 = videoComposerViewModel.A02;
            final Uri uri = this.$uri;
            final Context context = this.$context;
            final File file = this.$videoFile;
            final Bundle bundle = this.$savedInstanceState;
            final C160888Ai r7 = this.$mediaComposerContainer;
            final C131126kY r9 = this.$mediaJidsState;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VideoComposerViewModel$prepareData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
