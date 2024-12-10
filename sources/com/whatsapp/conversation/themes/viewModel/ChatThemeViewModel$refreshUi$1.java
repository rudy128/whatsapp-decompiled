package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4SC;
import X.AnonymousClass4VO;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import X.C80183wj;
import X.C80193wk;
import X.C80203wl;
import X.C80213wm;
import X.C80223wn;
import X.C80233wo;
import X.C80243wp;
import X.C80253wq;
import X.C80263wr;
import X.C88434Zr;
import X.C98974s1;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$refreshUi$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$refreshUi$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$refreshUi$1(Context context, ChatThemeViewModel chatThemeViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = chatThemeViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ChatThemeViewModel$refreshUi$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        List A0k;
        boolean z;
        AnonymousClass4SC r4;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ChatThemeViewModel chatThemeViewModel = this.this$0;
            C88434Zr BQ3 = chatThemeViewModel.A0L.BQ3(chatThemeViewModel.A0Q);
            ChatThemeViewModel chatThemeViewModel2 = this.this$0;
            chatThemeViewModel2.A03 = chatThemeViewModel2.A0L.BaK();
            AnonymousClass4SC A03 = ChatThemeViewModel.A03(this.$context, this.this$0, true);
            ChatThemeViewModel chatThemeViewModel3 = this.this$0;
            List list = chatThemeViewModel3.A03;
            if (list != null) {
                if (!list.contains(BQ3) || !C18070vi.A18(A03.A03, "DEFAULT")) {
                    List A0M = C18070vi.A0M(BQ3);
                    List list2 = this.this$0.A03;
                    if (list2 != null) {
                        A0k = C29431cG.A0k(list2, A0M);
                    }
                } else {
                    List list3 = this.this$0.A03;
                    if (list3 != null) {
                        A0k = C98974s1.A00(list3, BQ3, 12);
                    }
                }
                chatThemeViewModel3.A02 = A0k;
                ChatThemeViewModel chatThemeViewModel4 = this.this$0;
                Context context = this.$context;
                AnonymousClass4SC A032 = ChatThemeViewModel.A03(context, chatThemeViewModel4, false);
                List<C88434Zr> list4 = chatThemeViewModel4.A02;
                if (list4 == null) {
                    C18070vi.A11("initialThemeListOrder");
                    throw null;
                }
                ArrayList A0E = C29351c6.A0E(list4);
                boolean z2 = false;
                for (C88434Zr r13 : list4) {
                    if (z2 || !C18070vi.A18(r13.A00, BQ3.A00)) {
                        z = false;
                        r4 = chatThemeViewModel4.A0R;
                    } else {
                        z = true;
                        z2 = true;
                        r4 = A032;
                    }
                    A0E.add(new AnonymousClass4VO(r13, r4, (String) null, z));
                }
                if (chatThemeViewModel4.A0S.A02() != null) {
                    AnonymousClass4VO[] r132 = new AnonymousClass4VO[11];
                    r132[0] = ChatThemeViewModel.A00(context, C80223wn.A00, "02");
                    r132[1] = ChatThemeViewModel.A00(context, C80263wr.A00, "04");
                    r132[2] = ChatThemeViewModel.A00(context, C80253wq.A00, "09");
                    r132[3] = ChatThemeViewModel.A00(context, C80213wm.A00, "18");
                    r132[4] = ChatThemeViewModel.A00(context, C80243wp.A00, "14");
                    r132[5] = ChatThemeViewModel.A00(context, C80193wk.A00, "16");
                    r132[6] = ChatThemeViewModel.A00(context, C80183wj.A00, "21");
                    C80233wo r9 = C80233wo.A00;
                    r132[7] = ChatThemeViewModel.A00(context, r9, "25");
                    r132[8] = ChatThemeViewModel.A00(context, r9, "27");
                    C80203wl r92 = C80203wl.A00;
                    r132[9] = ChatThemeViewModel.A00(context, r92, "29");
                    List A0O = C18070vi.A0O(ChatThemeViewModel.A00(context, r92, "30"), r132, 10);
                    AnonymousClass1DT r93 = chatThemeViewModel4.A0F;
                    Iterator it = A0E.iterator();
                    Iterator it2 = A0O.iterator();
                    ArrayList A0z = C17880vN.A0z(Math.min(C29351c6.A0C(A0E, 10), C29351c6.A0C(A0O, 10)));
                    while (it.hasNext() && it2.hasNext()) {
                        A0z.add(C18070vi.A0N(it.next(), it2.next(), new AnonymousClass4VO[2], 0, 1));
                    }
                    r93.A0E(C29351c6.A0F(A0z));
                } else {
                    chatThemeViewModel4.A0F.A0E(A0E);
                }
                this.this$0.A0V(BQ3);
                this.this$0.A0H.A0E(A03);
                if (this.this$0.A0I.A06() != null) {
                    ChatThemeViewModel chatThemeViewModel5 = this.this$0;
                    Context context2 = this.$context;
                    C18070vi.A0d(context2, 0);
                    AnonymousClass3MW.A1X(chatThemeViewModel5.A0Y, new ChatThemeViewModel$fetchWallpaperThumbnailBundle$1(context2, chatThemeViewModel5, (C30391dr) null), C41561wd.A00(chatThemeViewModel5));
                }
                return C27621Wu.A00;
            }
            C18070vi.A11("themeList");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$refreshUi$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
