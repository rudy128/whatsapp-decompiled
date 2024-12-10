package com.whatsapp.favorites.picker;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass4SL;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import com.whatsapp.TextEmojiLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.picker.FavoritesPickerActivity$updateGroupSubtitleWithMembers$1", f = "FavoritesPickerActivity.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritesPickerActivity$updateGroupSubtitleWithMembers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ AnonymousClass4SL $viewHolder;
    public int label;
    public final /* synthetic */ FavoritesPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesPickerActivity$updateGroupSubtitleWithMembers$1(AnonymousClass4SL r2, AnonymousClass1E7 r3, FavoritesPickerActivity favoritesPickerActivity, C30391dr r5) {
        super(2, r5);
        this.this$0 = favoritesPickerActivity;
        this.$contact = r3;
        this.$viewHolder = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        FavoritesPickerActivity favoritesPickerActivity = this.this$0;
        return new FavoritesPickerActivity$updateGroupSubtitleWithMembers$1(this.$viewHolder, this.$contact, favoritesPickerActivity, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FavoritesPickerViewModel favoritesPickerViewModel = (FavoritesPickerViewModel) this.this$0.A02.getValue();
            AnonymousClass1E7 r3 = this.$contact;
            this.label = 1;
            obj = C30451dy.A00(this, favoritesPickerViewModel.A0G, new FavoritesPickerViewModel$getGroupSubTitle$2(r3, favoritesPickerViewModel, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String str = (String) obj;
        if (!(!C18070vi.A18(this.$contact, this.$viewHolder.A00) || str == null || str.length() == 0)) {
            this.$viewHolder.A03.setVisibility(0);
            TextEmojiLabel textEmojiLabel = this.$viewHolder.A03;
            C18070vi.A0W(textEmojiLabel);
            C72453Mb.A1L(textEmojiLabel, str);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritesPickerActivity$updateGroupSubtitleWithMembers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
