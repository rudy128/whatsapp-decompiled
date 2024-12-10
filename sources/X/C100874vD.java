package X;

import android.content.Context;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel", f = "ChatThemeViewModel.kt", i = {0, 0, 0, 0, 0}, l = {403, 430}, m = "saveWallpaperAndTheme", n = {"this", "bundle", "context", "shouldOverrideCustomisations", "dimLevel"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
/* renamed from: X.4vD  reason: invalid class name and case insensitive filesystem */
public final class C100874vD extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100874vD(ChatThemeViewModel chatThemeViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = chatThemeViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChatThemeViewModel.A04((Context) null, (AnonymousClass4VO) null, (AnonymousClass4D5) null, this.this$0, this, 0);
    }
}
