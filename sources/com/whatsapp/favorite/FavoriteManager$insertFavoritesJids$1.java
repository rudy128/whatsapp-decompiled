package com.whatsapp.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass1YF;
import X.C17880vN;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C38501rO;
import X.C62482rT;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$insertFavoritesJids$1", f = "FavoriteManager.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteManager$insertFavoritesJids$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $chatJids;
    public final /* synthetic */ int $favoritesUpdateEntryPoint;
    public final /* synthetic */ String $limitToastMessage;
    public final /* synthetic */ String $successToastMessage;
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$insertFavoritesJids$1(FavoriteManager favoriteManager, String str, String str2, Collection collection, C30391dr r6, int i) {
        super(2, r6);
        this.$chatJids = collection;
        this.this$0 = favoriteManager;
        this.$limitToastMessage = str;
        this.$favoritesUpdateEntryPoint = i;
        this.$successToastMessage = str2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        Collection collection = this.$chatJids;
        return new FavoriteManager$insertFavoritesJids$1(this.this$0, this.$limitToastMessage, this.$successToastMessage, collection, r9, this.$favoritesUpdateEntryPoint);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1KB r1;
        String str;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Collection collection = this.$chatJids;
            FavoriteManager favoriteManager = this.this$0;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : collection) {
                if (!((AbstractCollection) favoriteManager.A07.getValue()).contains(next)) {
                    A13.add(next);
                }
            }
            if (A13.size() + ((AbstractCollection) this.this$0.A07.getValue()).size() > 100) {
                String str2 = this.$limitToastMessage;
                if (str2 != null && !AnonymousClass1YF.A0T(str2)) {
                    r1 = this.this$0.A00;
                    str = this.$limitToastMessage;
                    r1.A0H(str, 0);
                }
            } else {
                if (!((C38501rO) this.this$0.A05.get()).A07()) {
                    AnonymousClass1M9 r7 = this.this$0.A02;
                    ArrayList A132 = AnonymousClass000.A13();
                    Iterator it = A13.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        if (next2 instanceof UserJid) {
                            A132.add(next2);
                        }
                    }
                    Iterator it2 = A132.iterator();
                    while (it2.hasNext()) {
                        if (!r7.A0z(C17880vN.A0Q(it2))) {
                            this.this$0.A00.A09(2131890367, 0);
                            break;
                        }
                    }
                }
                ArrayList A0D = C29351c6.A0D(A13);
                Iterator it3 = A13.iterator();
                while (it3.hasNext()) {
                    A0D.add(new C62482rT(C17880vN.A0Q(it3)));
                }
                FavoriteManager favoriteManager2 = this.this$0;
                Integer num = new Integer(this.$favoritesUpdateEntryPoint);
                this.label = 1;
                if (favoriteManager2.A03(num, A0D, this) == r5) {
                    return r5;
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String str3 = this.$successToastMessage;
        if (str3 != null && !AnonymousClass1YF.A0T(str3)) {
            r1 = this.this$0.A00;
            str = this.$successToastMessage;
            r1.A0H(str, 0);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteManager$insertFavoritesJids$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
