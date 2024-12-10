package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1OS;
import X.AnonymousClass3MZ;
import X.AnonymousClass4SL;
import X.C18070vi;
import X.C24921Me;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePicker$updateGroupSubtitleWithMembers$1", f = "FavoritePicker.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePicker$updateGroupSubtitleWithMembers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ AnonymousClass4SL $viewHolder;
    public int label;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePicker$updateGroupSubtitleWithMembers$1(FavoritePicker favoritePicker, AnonymousClass4SL r3, AnonymousClass1E7 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = favoritePicker;
        this.$contact = r4;
        this.$viewHolder = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FavoritePicker$updateGroupSubtitleWithMembers$1(this.this$0, this.$viewHolder, this.$contact, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FavoritePickerViewModel A0Y = AnonymousClass3MZ.A0Y(this.this$0);
            AnonymousClass1E7 r1 = this.$contact;
            C24921Me r3 = this.this$0.A08;
            C18070vi.A0X(r3);
            this.label = 1;
            AnonymousClass1E9 r2 = (AnonymousClass1E9) r1.A06(AnonymousClass1E9.class);
            obj = null;
            if (r2 != null) {
                String str = (String) r3.A07.get(r2);
                if (str == null) {
                    obj = C30451dy.A00(this, A0Y.A0G, new FavoritePickerViewModel$getGroupSubTitle$2$1(r3, r2, (C30391dr) null));
                    if (obj == r5) {
                        return r5;
                    }
                } else {
                    obj = str;
                }
                if (obj == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String str2 = (String) obj;
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextEmojiLabel textEmojiLabel = this.$viewHolder.A03;
        if (!isEmpty) {
            textEmojiLabel.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = this.$viewHolder.A03;
            C18070vi.A0W(textEmojiLabel2);
            C72453Mb.A1L(textEmojiLabel2, str2);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePicker$updateGroupSubtitleWithMembers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
