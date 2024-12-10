package com.whatsapp.settings.chat.theme.fragment;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3N0;
import X.AnonymousClass3N4;
import X.C18070vi;
import X.C19740yt;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C83064Df;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1", f = "ChatThemeSelectionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isDoodle;
    public final /* synthetic */ View $view;
    public final /* synthetic */ Bitmap $wallpaper;
    public final /* synthetic */ Context $wrappedContext;
    public int label;
    public final /* synthetic */ ChatThemeSelectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1(Context context, Bitmap bitmap, View view, ChatThemeSelectionFragment chatThemeSelectionFragment, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = chatThemeSelectionFragment;
        this.$view = view;
        this.$wrappedContext = context;
        this.$wallpaper = bitmap;
        this.$isDoodle = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        ChatThemeSelectionFragment chatThemeSelectionFragment = this.this$0;
        return new ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1(this.$wrappedContext, this.$wallpaper, this.$view, chatThemeSelectionFragment, r9, this.$isDoodle);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ChatThemeSelectionFragment chatThemeSelectionFragment = this.this$0;
            View view = this.$view;
            Context context = this.$wrappedContext;
            WDSListItem wDSListItem = (WDSListItem) view.findViewById(2131432094);
            WDSIcon wDSIcon = wDSListItem.A09;
            if (wDSIcon == null) {
                C83064Df r2 = C83064Df.A05;
                wDSIcon = new WDSIcon(chatThemeSelectionFragment.A14(), (AttributeSet) null);
                wDSIcon.setSize(r2);
                wDSListItem.A09 = wDSIcon;
            }
            wDSIcon.setIcon((Drawable) new AnonymousClass3N0(C19740yt.A00(context, AnonymousClass1YL.A01(context, 2130971969, 2131103133, false)), C19740yt.A00(chatThemeSelectionFragment.A14(), 2131103182), context.getResources().getDimension(2131165869)));
            Bitmap bitmap = this.$wallpaper;
            if (bitmap == null) {
                return null;
            }
            ChatThemeSelectionFragment chatThemeSelectionFragment2 = this.this$0;
            View view2 = this.$view;
            Context context2 = this.$wrappedContext;
            boolean z = this.$isDoodle;
            WDSListItem wDSListItem2 = (WDSListItem) view2.findViewById(2131432097);
            WDSIcon wDSIcon2 = wDSListItem2.A09;
            if (wDSIcon2 == null) {
                C83064Df r5 = C83064Df.A06;
                wDSIcon2 = new WDSIcon(chatThemeSelectionFragment2.A14(), (AttributeSet) null);
                wDSIcon2.setSize(r5);
                wDSListItem2.A09 = wDSIcon2;
            }
            int A00 = C19740yt.A00(context2, AnonymousClass1YL.A01(context2, 2130971972, 2131103141, false));
            int A002 = C19740yt.A00(context2, AnonymousClass1YL.A01(context2, 2130971973, 2131103143, false));
            int A003 = C19740yt.A00(chatThemeSelectionFragment2.A14(), 2131103182);
            float dimension = context2.getResources().getDimension(2131165869);
            float dimension2 = context2.getResources().getDimension(2131169406);
            float dimension3 = context2.getResources().getDimension(2131165893);
            float dimension4 = context2.getResources().getDimension(2131165890);
            Resources resources = context2.getResources();
            C18070vi.A0b(resources);
            int A01 = AnonymousClass3MW.A01(resources, 2131165889);
            int A012 = AnonymousClass3MW.A01(resources, 2131165888);
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, A01, A012);
            int A013 = AnonymousClass3MW.A01(resources, 2131165893);
            int A014 = AnonymousClass3MW.A01(resources, 2131165890);
            Bitmap createBitmap = Bitmap.createBitmap(extractThumbnail, (A01 - A013) / 2, (A012 - A014) / 2, A013, A014);
            C18070vi.A0X(createBitmap);
            wDSIcon2.setIcon((Drawable) new AnonymousClass3N4(createBitmap, dimension, dimension2, dimension3, dimension4, A00, A002, A003, z));
            return bitmap;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
