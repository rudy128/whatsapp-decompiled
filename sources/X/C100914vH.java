package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment", f = "ChatThemeSelectionFragment.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {260}, m = "createSelectionItemsAndSetMessageColorListItemIcon", n = {"this", "scaledDoodle", "view", "checkMark", "destination$iv$iv", "themeBundle", "conversationTheme", "wrappedContext", "wallpaper", "isDoodle"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$9", "Z$0"})
/* renamed from: X.4vH  reason: invalid class name and case insensitive filesystem */
public final class C100914vH extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChatThemeSelectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100914vH(ChatThemeSelectionFragment chatThemeSelectionFragment, C30391dr r2) {
        super(r2);
        this.this$0 = chatThemeSelectionFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChatThemeSelectionFragment.A01((Bitmap) null, (View) null, this.this$0, (List) null, this);
    }
}
