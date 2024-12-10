package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass11B;
import X.AnonymousClass1EY;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4D5;
import X.C17900vP;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$saveCroppedWallpaper$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$saveCroppedWallpaper$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $dimLevel;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$saveCroppedWallpaper$1(Context context, Bitmap bitmap, ChatThemeViewModel chatThemeViewModel, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = chatThemeViewModel;
        this.$bitmap = bitmap;
        this.$context = context;
        this.$dimLevel = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        ChatThemeViewModel chatThemeViewModel = this.this$0;
        return new ChatThemeViewModel$saveCroppedWallpaper$1(this.$context, this.$bitmap, chatThemeViewModel, r8, this.$dimLevel);
    }

    public final Object invokeSuspend(Object obj) {
        OutputStream A08;
        String path;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass11B A0O = this.this$0.A0M.A0O();
            Uri A0C = this.this$0.A0T.A0C();
            C18070vi.A0X(A0C);
            if (!(A0O == null || (A08 = A0O.A08(A0C)) == null || (path = A0C.getPath()) == null)) {
                File file = new File(path);
                try {
                    this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 90, A08);
                    AnonymousClass1EY.A02(A08);
                    if (file.length() == 0 && this.this$0.A0N.A01() == 0) {
                        Log.e("GalleryWallpaperPreview/saveWallpaperForChat/no space to save compressed image");
                    } else {
                        ChatThemeViewModel chatThemeViewModel = this.this$0;
                        Context context = this.$context;
                        AnonymousClass4D5 r7 = AnonymousClass4D5.WALLPAPER;
                        int i = this.$dimLevel;
                        C18070vi.A0d(context, 1);
                        AnonymousClass3MW.A1X(chatThemeViewModel.A0Y, new ChatThemeViewModel$saveWallpaperAndMessageColor$1(context, A0C, r7, chatThemeViewModel, (C30391dr) null, i), C41561wd.A00(chatThemeViewModel));
                    }
                } catch (FileNotFoundException e) {
                    C17900vP.A0h("GalleryWallpaperPreview/saveWallpaperForChat/file not found at ", path, AnonymousClass000.A10(), e);
                    C27621Wu r0 = C27621Wu.A00;
                    AnonymousClass1EY.A02(A08);
                    return r0;
                } catch (Throwable th) {
                    AnonymousClass1EY.A02(A08);
                    throw th;
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$saveCroppedWallpaper$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
