package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass4SC;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C85274Mt;
import X.C87864Xj;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$fetchWallpaperThumbnailBundle$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$fetchWallpaperThumbnailBundle$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$fetchWallpaperThumbnailBundle$1(Context context, ChatThemeViewModel chatThemeViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = chatThemeViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ChatThemeViewModel$fetchWallpaperThumbnailBundle$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Uri fromFile;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C85274Mt A02 = this.this$0.A0S.A02();
            ArrayList A13 = AnonymousClass000.A13();
            if (A02 != null) {
                for (File fromFile2 : A02.A01) {
                    A13.add(Uri.fromFile(fromFile2));
                }
            }
            ChatThemeViewModel chatThemeViewModel = this.this$0;
            chatThemeViewModel.A01 = A13;
            String str2 = null;
            AnonymousClass4SC A03 = ChatThemeViewModel.A03(this.$context, chatThemeViewModel, false);
            if ((this.this$0.A0Q == null || !A03.A04) && C18070vi.A18(A03.A03, "USER_PROVIDED") && (str = A03.A02) != null) {
                C87864Xj r5 = this.this$0.A0S;
                String path = Uri.parse(str).getPath();
                C17960vV.A07(path);
                String name = new File(path).getName();
                File A04 = r5.A02.A04(false);
                if (A04.exists()) {
                    File A0e = C17880vN.A0e(A04, "thumbnails");
                    if (A0e.exists()) {
                        File A0e2 = C17880vN.A0e(A0e, "light");
                        if (A0e2.exists()) {
                            File A0e3 = C17880vN.A0e(A0e2, name);
                            if (A0e3.exists() && (fromFile = Uri.fromFile(A0e3)) != null) {
                                str2 = fromFile.getPath();
                            }
                        }
                    }
                }
            }
            if (A02 != null) {
                this.this$0.A0I.A0E(AnonymousClass1D6.A01(A02, str2));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$fetchWallpaperThumbnailBundle$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
