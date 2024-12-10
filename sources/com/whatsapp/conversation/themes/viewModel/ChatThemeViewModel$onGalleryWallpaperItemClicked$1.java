package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onGalleryWallpaperItemClicked$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$onGalleryWallpaperItemClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$onGalleryWallpaperItemClicked$1(Context context, ChatThemeViewModel chatThemeViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = chatThemeViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ChatThemeViewModel$onGalleryWallpaperItemClicked$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ChatThemeViewModel chatThemeViewModel = this.this$0;
            C41731wy r3 = chatThemeViewModel.A0U;
            Context context = this.$context;
            Uri fromFile = Uri.fromFile(chatThemeViewModel.A0J.A0a("tmpi"));
            boolean A05 = C18020vd.A05(C18040vf.A02, this.this$0.A0O, 7951);
            Intent A0A = C17880vN.A0A();
            String packageName = context.getPackageName();
            if (A05) {
                str = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity";
            } else {
                str = "com.whatsapp.gallerypicker.GalleryPicker";
            }
            A0A.setClassName(packageName, str);
            A0A.putExtra("include_media", 1);
            A0A.putExtra("max_items", 1);
            A0A.putExtra("skip_max_items_new_limit", false);
            A0A.putExtra("is_in_multi_select_mode_only", false);
            A0A.putExtra("preview", false);
            A0A.putExtra("output", fromFile);
            A0A.putExtra("media_sharing_user_journey_origin", 30);
            A0A.putExtra("photo_update_surface_type", (Serializable) null);
            r3.A0E(AnonymousClass1D6.A01(A0A, AnonymousClass3MW.A0v(17)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$onGalleryWallpaperItemClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
